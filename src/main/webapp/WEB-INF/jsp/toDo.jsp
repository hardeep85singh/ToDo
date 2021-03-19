<!DOCTYPE html>
<html>

  <head>
    <link rel="stylesheet" href="style.css" />
    <script	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.6.0/angular.min.js"></script>
    <script src="/js/todo.js"></script>
  </head>

  <body class="container" ng-app="app" ng-controller="toDoController" ng-cloak>
    <h1>{{User}} ToDo</h1>
    <!--Form-->
    <form ng-submit="createToDo()">
      <h4>Create ToDo</h4>

      <div class="form-group">
        <div class="col-md-4">

            <input type="text" name="toDo"	class="form-control" ng-model="toDo" placeholder="Add your new todo"/>
        </div>
      </div>
      <div class="col-md-offset-2 col-md-10">
      <input type="submit" value="submit" class="btn btn-success btn-sm" ng-show="submit" />
      <input type="button" value="update" ng-click="updateToDo()" class="btn btn-success btn-sm" ng-show="update" />

      </div>
    </form>
    <!--End Form-->

    <!--ToDo List-->
    <br />
    <h4>ToDo List</h4>
    <table class="table table-striped">
      <thead>
        <tr>
          <td>Check</td>
          <td>Description</td>
          <td>Action Commands</td>
        </tr>
      </thead>
      <tbody>
        <tr ng-repeat="toDo in toDoList">
          <td>
            <input type="checkbox">
          </td>
          <td>
            {{toDoList.toDo}}
          </td>
          <td>
            <button class="btn btn-success btn-sm" ng-click="editToDo(toDo)">Edit</button>
            <button class="btn btn-danger btn-sm" ng-click="deleteToDo(toDo)">Delete</button>
          </td>
        </tr>
      </tbody>

    </table>

  </body>

</html>
