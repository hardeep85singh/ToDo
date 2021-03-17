var app = angular.module('toDoApp', []);

app.controller('postControllerToDo', function($scope, $http, $location) {
	$scope.submitForm = function(){
		var url = "http://localhost:8090/addToDo";
		var config = {
                headers : {
                    'Content-Type': 'application/json;charset=utf-8;'
                }
        }
		var data = {
            toDo: $scope.todo,
        };

		$http.post(url, data, config).then(function (response) {
			$scope.postResultMessage = "Successful!";
		}, function (response) {
			$scope.postResultMessage = "Fail!";
		});
		$scope.todo = "";
	}
});

app.controller('getAllToDoController', function($scope, $http, $location) {

	$scope.showAllToDo = false;
	$scope.getAllToDo = function() {
		var url = "http://localhost:8090/userToDos";
		var config = {
			headers : {
				'Content-Type' : 'application/json;charset=utf-8;'
			}
		}
		$http.get(url, config).then(function(response) {
			if (response.status == 200) {
				$scope.allToDo = response;
				$scope.showAllToDo = true;
			} else {
				$scope.getResultMessage = "get All ToDo Data Error!";
			}
		}, function(response) {
			$scope.getResultMessage = "Fail!";
		});
	}
});

//app.controller('getcustomerController', function($scope, $http, $location) {
//
//	$scope.showCustomer = false;
//
//	$scope.getCustomer = function() {
//		var url = $location.absUrl() + "customer/" + $scope.customerId;
//
//		var config = {
//			headers : {
//				'Content-Type' : 'application/json;charset=utf-8;'
//			}
//		}
//
//		$http.get(url, config).then(function(response) {
//
//			if (response.data.status == "Done") {
//				$scope.customer = response.data;
//				$scope.showCustomer = true;
//
//			} else {
//				$scope.getResultMessage = "Customer Data Error!";
//			}
//
//		}, function(response) {
//			$scope.getResultMessage = "Fail!";
//		});
//
//	}
//});
//
//app.controller('getcustomersbylastnameController', function($scope, $http, $location) {
//
//	$scope.showCustomersByLastName = false;
//
//	$scope.getCustomersByLastName = function() {
//		var url = $location.absUrl() + "findbylastname";
//
//		var config = {
//			headers : {	'Content-Type' : 'application/json;charset=utf-8;' },
//
//			params: { 'lastName' : $scope.customerLastName }
//		}
//
//		$http.get(url, config).then(function(response) {
//
//			if (response.data.status == "Done") {
//				$scope.allcustomersbylastname = response.data;
//				$scope.showCustomersByLastName = true;
//
//			} else {
//				$scope.getResultMessage = "Customer Data Error!";
//			}
//
//		}, function(response) {
//			$scope.getResultMessage = "Fail!";
//		});
//
//	}
//});