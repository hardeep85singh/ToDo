var app = angular.module('app', []);

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
			$scope.postResultMessage = "Successful!";
			$scope.toDos.push(response.data);
		}, function (response) {
			$scope.postResultMessage = "Not responding";
		});
		$scope.toDo = "";
	}
	$scope.showToDo = false;
    	$scope.getToDo = function() {
    		var geturl = "http://localhost:8090/userToDo";
    		var config = {
    			headers : {
    				'Content-Type' : 'application/json;charset=utf-8;'
    			}
    		}
    		$http.get(geturl, config).then(function(response) {
    			if (response.status == 200) {
    				$scope.toDoList = response.data;
    				$scope.toDos = response.data;
    				$scope.showToDo = true;
    			} else {
    				$scope.getResultMessage = "get All ToDo Data Error!";
    			}
    		}, function(response) {
    			$scope.getResultMessage = "Fail!";
    		});
    	}


    $scope.done = function() {
        		var patchurl = $location.absUrl;
        		var config = {
        			headers : {
        				'Content-Type' : 'application/json;charset=utf-8;'
        			}
        		}

        		$http.patch(patchurl, data, config).then(function (response) {
                			$scope.done = true;
                		}, function (response) {
                			$scope.patchResultMessage = "Not responding";
                		});
                		$scope.toDo = "";

        	}
});

app.controller('getAllToDoController', function($scope, $http, $location) {

	$scope.showAllToDo = false;
	$scope.getAllToDo = function() {
		var url = "http://localhost:8090/userToDo";
		var config = {
			headers : {
				'Content-Type' : 'application/json;charset=utf-8;'
			}
		}
		$http.get(url, config).then(function(response) {
			if (response.status == 200) {
				$scope.allToDo = response.data;
				$scope.showAllToDo = true;
			} else {
				$scope.getResultMessage = "get All ToDo Data Error!";
			}
		}, function(response) {
			$scope.getResultMessage = "Fail!";
		});
	}
});
