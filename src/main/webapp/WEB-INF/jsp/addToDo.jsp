<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>ToDo</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.6.0/angular.min.js"></script>
<script src="/js/angular.js"></script>
 <link href="/css/bootstrap.css" rel="stylesheet" />
 <link href="/css/bootstrap-theme.css" rel="stylesheet" />

	<h1>Welcome {{todo_list.userId}}</h1>
</head>
<body>
	<div class="container" ng-app="app">
		<h1>Add ToDo</h1>
		<div class="inputField">
			<div ng-controller="toDoController" class="col-md-3">
              	<form name="toDoForm" ng-submit="createToDo()">
					<input type="text" name="toDo"	class="form-control" ng-model="toDo" placeholder="Add your new todo"/>
					<button type="submit" class="btn btn-primary" ng-click="getToDo()">Add</button>
				</form>
				<h3>ToDo List</h3>
				   	<ol class="list-group" >
                        <li ng-repeat="todo_list in toDoList">
                         		<input type="checkbox"> {{todo_list.toDo}}
                   		</li>
                    </ol>
			</div>
		</div>
	</div>
</body>
</html>