<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html ng-app="app">
<head>
<title>ToDo</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.6.0/angular.min.js"></script>
<script src="/js/toDoAngular.js"></script>
 <link href="/css/bootstrap.css" rel="stylesheet" />
 <link href="/css/bootstrap-theme.css" rel="stylesheet" />
	<h1>Welcome to your ToDo List</h1>
</head>
<body>
	<div class="panel" >
		<h1>Add ToDo</h1>
	</div>
	<div class="panel">
    	<div ng-controller="toDoController" class="col-md-3">
           	<form name="toDoForm">
    			<input type="text" name="toDo"	class="form-control" ng-model="toDo" placeholder="Add your new todo"/>
    			<button type="submit" class="btn btn-primary" ng-click="createToDo()">Add</button>
    		</form>
    		<h3>ToDo List</h3>
    		   	<div>
    		   	    <ol class="list-group" >
                        <li ng-repeat="todo_list in toDoList">
                       	<input type="checkbox" ng-model="isDone" ng-change="done()"> {{todo_list.toDo}}
                       	</li>
                    </ol>
               </div>
    	</div>
    </div>
</body>
</html>