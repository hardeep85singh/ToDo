<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>ToDo Project</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<script	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.8.2/angular.js"></script>
<script src="//ajax.googleapis.com/ajax/libs/angularjs/1.8.2/angular-route.js"></script>
<script src="/js/angular.js"></script>
<script src="/js/angular-route.js"></script>
<script src="/js/toDoAngular.js"></script>
<link rel="stylesheet"
	href="http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" />
	<h1>ToDo Project</h1>
</head>
<body ng-app="app">
	<div class="panel">
		<h1>New User</h1>
		<div class="row">
			<div ng-controller="postController" class="col-md-3">
				<form name="userForm" ng-submit="submitForm()">
					<label>First Name</label>
					<input type="text" name="firstName"	class="form-control" ng-model="firstName" />
					<label>Last Name</label>
					<input type="text" name="lastName" class="form-control" ng-model="lastName" />
					<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
		<div ng-controller="getAllUsersController" class="col-md-3">
        	<h3>List Users</h3>
        	<button ng-click="getAllUsers()">List all users</button>
        		<div ng-show="showAllUsers">
        			<ol class="list-group">
        				<li ng-repeat="user_data in allUsers.data"><h5 class="list-group-item">
        					Id: {{user_data.userId}}<br />
        					First Name: {{user_data.firstName}}<br />
        					Last Name: {{user_data.lastName}} <br />
        					<a href="http://localhost:8090/userToDo/{{user_data.userId}}" ng-model="user_data.firstName">User ToDo Page</a>
        					<div ng-view></div>
        					</h5>
        				</li>
        			</ol>
        		</div>
        </div>
	</div>
</body>
</html>