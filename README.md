# ToDo
ToDo list for different users created with AngularJs, Spring Boot and Postgresql. This application demonstrates the functionality of RestfulAPI.

## Table of Contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Screenshots](#screenshots)


## General info
This project adds user and shows list of users. We get the ToDo list for respective user by clicking on the user's ToDo hyperlink. The user can add todos. The list of todos are shown on the same page with button to show if it is completed or not. AngularJs is used for the front end of the application. SpringBoot is used to build the RESTfull web services and RESTfull Java application. Apache Tomcat is used to run the application on the server. Postgresql database is used to store data in tables.

The basic step wise information is mentioned below.
* Application homepage is used to add user and show list of users by clicking the SHOW USERS button. 
* The user is added to the users table in the database by posting the data to server side Rest endpoint and further in the database.
* We get the list of users by getting the data from database by calling the server side Rest endpoint.
* We will be redirected to user's Todo page by clicking the hyperlink.
* On this users todo page we can add todo by posting the data to server side Rest endpoint and store in the database for that particular user.
* The list of all todos of that particular user is iterated by getting the data from database by calling server side Rest endpoint.
* The todo is completed when we click on the checked button.

## Tehnologies
Project is created with:
* AngularJs 1.8.2
* JAVA 11
* SpringBoot 2.4.3
* Apache Tomcat 8.5.61
* Postgres 42.2.18

## Screenshots
* Homepage: ![alt-text](https://github.com/hardeep85singh/ToDo/blob/main/screenshots/AddUsers.gif)
* Redirect to User 1 ToDo page: ![alt-text](https://github.com/hardeep85singh/ToDo/blob/main/screenshots/RedirectToUserToDoPage.gif)
* User 1 ToDo page: ![alt-text](https://github.com/hardeep85singh/ToDo/blob/main/screenshots/User1ToDoPage.gif) 
* Redirect to User 2 ToDo page: ![alt-text](https://github.com/hardeep85singh/ToDo/blob/main/screenshots/RedirectToUser2ToDoPage.gif)
* User 2 ToDo page: ![alt-text](https://github.com/hardeep85singh/ToDo/blob/main/screenshots/User2ToDoPage.gif)


