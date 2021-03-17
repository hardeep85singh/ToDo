<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>{user} ToDo</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1" />
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.6.0/angular.min.js"></script>
<script src="/js/toDoAngular.js"></script>
<link rel="stylesheet" href="style.css">

	<h1>Welcome {{user_id}}</h1>
</head>
<body>
	<div class="container" ng-app="toDoApp">
		<h1>{{firstName}} ToDo</h1>
		<div class="inputField">
			<div ng-controller="postControllerToDo" class="col-md-3">

				<form name="toDoForm" ng-submit="submitForm()">
					<input type="text" name="todo"	class="form-control" ng-model="todo" placeholder="Add your new todo"/>
					<button type="submit" class="btn btn-primary">Add</button>
				</form>
				<p>{{postResultMessage}}</p>
			</div>
		</div>

		<div style="overflow: auto;" ng-controller="getAllToDoController" class="col-md-3">
        	<h3>ToDo List</h3>
        	<button ng-click="getAllToDo()">ToDo List</button>
        	<ol class="list-group" >
                <li style="overflow: auto;" ng-repeat="todo_list in allToDo.data">

           		<input type="checkbox" name="toDoCheckBox" value="done"> {{todo_list.toDo}}

           		</li>
            </ol>
            <p>{{getResultMessage}}</p>
        </div>
	</div>
</body>
</html>