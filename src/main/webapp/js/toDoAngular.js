var app = angular.module('app', []);

//app.config(['routeProvider', function($routeProvider){
//    $routeProvider.when('/userToDo', {
//    templateUrl: 'addToDo.jsp',
//    controller: 'AddEventController'
//    })
//}]);


app.controller('postController', function($scope, $http, $location) {
	$scope.submitForm = function(){
		var url = "http://localhost:8090/addUser";
		var config = {
                headers : {
                    'Content-Type': 'application/json;charset=utf-8;'
                }
        }
		var data = {
            firstName: $scope.firstName,
            lastName: $scope.lastName
        };
        $http.post(url, data, config).then(function (response) {
			$scope.postResultMessage = "Successful!";
		}, function (response) {
			$scope.postResultMessage = "Fail!";
		});
		$scope.firstName = "";
		$scope.lastName = "";
	}
});

app.controller('getAllUsersController', function($scope, $http, $location) {

	$scope.showAllUsers = false;
	$scope.getAllUsers = function() {
		var url = "http://localhost:8090/listUsers";
		var config = {
			headers : {
				'Content-Type' : 'application/json;charset=utf-8;'
			}
		}
		$http.get(url, config).then(function(response) {
			if (response.status == 200) {
				$scope.allUsers = response;
				$scope.showAllUsers = true;
			} else {
				$scope.getResultMessage = "get All User Data Error!";
			}
		}, function(response) {
			$scope.getResultMessage = "Fail!";
		});
	}

});

app.controller('toDoController', function($scope, $http, $location) {
	$scope.showToDo = false;
	$scope.createToDo = function(){
	    var url =  $location.absUrl();
		var config = {
                headers : {
                    'Content-Type': 'application/json;charset=utf-8;'
                }
        }
		var data = {
            toDo: $scope.toDo,
        };
		$http.post(url, data, config).then(function (response) {
			if (response.status == 200) {
                $scope.toDoList = response.data;
                $scope.showToDo = true;
            } else {
            	$scope.getResultMessage = "get All ToDo Data Error!";
            }
			$scope.postResultMessage = "Successful!";
		}, function (response) {
			$scope.postResultMessage = "Not responding";
		});
		$scope.toDo = "";
	}

    $scope.getToDo = function() {
            var geturl =  $location.absUrl();
            alert("get todo");
//            var geturl = "http://localhost:8090/userToDo";
    		var config = {
    			headers : {
    				'Content-Type' : 'application/json;charset=utf-8;'
    			}
    		}
    		$http.get(geturl, config).then(function(response) {
    			if (response.status == 200) {
    				$scope.toDoList = response.data;
    				$scope.showToDo = true;
    			} else {
    				$scope.getResultMessage = "get All ToDo Data Error!";
    			}
    		}, function(response) {
    			$scope.getResultMessage = "Fail!";
    		});
    }


    $scope.done = function() {
        		var puturl = $location.absUrl;
        		alert("Check put method");
        		var config = {
        			headers : {
        				'Content-Type' : 'application/json;charset=utf-8;'
        			}
        		}
        		var data = {
                            toDo: $scope.done,
                        };
        		$http.put(puturl, data, config).then(function (response) {
        		            if ($scope.isDone == false){
        		                $scope.done = true}
        		            else{
        		                $scope.done = false;
        		            }
                		}, function (response) {
                			$scope.patchResultMessage = "Not responding";
                		});
        	}
});
