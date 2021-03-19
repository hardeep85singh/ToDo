var app = angular.module('app', []);

app.controller('toDoController', function($scope, $http, $location) {
  //Buttons Settings
  $scope.submit = true;
  $scope.update = false;
  $scope.cancel = false;
  $scope.done = false;
  $scope.showToDo = false;

//  Getting ToDo List
//  $http GET function
    $scope.getToDo = function(){
    var geturl = "http://localhost:8090/userToDo";
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
    };

  //Create ToDo
  $scope.createToDo = function() {
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
    		}, function (response) {
    			$scope.postResultMessage = "Not responding";
    		});
    		$scope.toDo = "";
  };

  //Update User
  $scope.updateToDo = function() {
    //$http PUT function
    $http({
      method: 'PUT',
      url: $location.absUrl,
      data: $scope.toDo
    }).then(function successCallback(response) {
      alert("ToDo has updated Successfully")
    }, function errorCallback(response) {
      alert("Error. while updating ToDo Try Again!");
    });
  };




});





  //Delete User
//  $scope.deleteUser = function(toDo) {
//    //$http DELETE function
//    $http({
//      method: 'DELETE',
//      url: 'https://jsonplaceholder.typicode.com/users/' + user.id
//    }).then(function successCallback(response) {
//      alert("ToDo has deleted Successfully");
//      var index = $scope.users.indexOf(user);
//      $scope.users.splice(index, 1);
//    }, function errorCallback(response) {
//      alert("Error. while deleting ToDo Try Again!");
//    });
//  };

  //Set $scope on Edit button click
//  $scope.editToDo = function(toDo) {
//
//    $scope.toDo = toDo;
//    $scope.submit = false;
//    $scope.update = true;
//    $scope.cancel = true;
//    $scope.userid = false;
//
//  };


