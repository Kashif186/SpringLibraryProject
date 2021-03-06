# Spring Library Project

The overall objective of the project is the following:
To create a Spring Boot API, with utilisation of supporting tools, methodologies, and technologies, that encapsulates all fundamental and practical modules.

This Spring Boot API uses:
* An application back-end developed using Java
* A managed MySQL database hosted locally
* Postman to make API calls which can be checked in Workbench


I expected the challenge to go well as the MVP was covered in our training so I had a good idea of what needed to be done before starting.

Setting up the classes such as domain, repo, services and controller went really well. I had no issues here. However, I ran into a lot of issues with testing and received a lot of bugs. I had to research these and see what I was doing wrong but managed to solve them all in the end.

Testing will be a lot easier in the future as I have become familiar with the bugs that I encountered. I could add more tables to my project and expand the usage of the application as a whole. I still need to conduct testing for the stretch goals but did not have enough time for this. Also, I could learn about implementing a front end and linking it to my project.

## Create:
On Postman:
![Postman Create](/images/postman-create.png)
On Workbench:

![Workbench Create](/images/workbench-create.png)

## Get All:
On Postman:
![Postman GetAll](/images/postman-getall.png)
On Workbench:

![Workbench GetAll](/images/workbench-getall.png)

## Get:
On Postman:
![Postman Get](/images/postman-get.png)

## Update:
On Postman:
![Postman Update](/images/postman-update.png)

On Workbench:

![Workbench Update](/images/workbench-update.png)

## Delete:
On Postman:
![Postman Delete](/images/postman-delete.png)
On Workbench:

![Workbench Delete](/images/workbench-delete.png)

## Testing:

### Unit Tests
Controller Unit Test:

![Controller Unit](/images/controller-unit-test.png)

Domain Book Unit Test:

![Domain Unit](/images/domain-unit-test.png)

Service Unit Test:

![Service Unit](/images/service-unit-test.png)

### Integration Test:

![Integration](/images/integration-test.png)



Jira Borad: https://kashif-butt.atlassian.net/jira/software/projects/SPRIN/boards/1

GitHub: https://github.com/Kashif186/SpringLibraryProject


## Stretch Goals:

### ER Diagram - Linked using foreign key

![ER Diagram](/Documentation/ER-Diagram.png)


### Custom Exceptions:

Book Not Found:

![Book Not Found](/images/BookNotFound.png)

Person Not Found

![Person Not Found](/images/PersonNotFound.png)

### Custom Queries:

Add Multiple Books:

![Add Multiple Books](/images/AddMultipleBooks.png)

![workbench - Add Multiple Books](/images/workbench-AddMultipleBooks.png)

Search by Book Title:

![Book Title Search](/images/bookTitle.png)

Loan Book:

![Loan Book](/images/LoanBook.png)

![workbench - Loan Book](/images/workbench-LoanBook.png)

Return Book:

![Return Book](/images/ReturnBook.png)

![workbench - Return Book](/images/workbench-ReturnBook.png)

Find Books Taken Out By One Person:

![Person Books](/images/PersonBooks.png)

Add People:

![Add People](/images/AddPeople.png)

![workbench - Add People](/images/workbench-AddPeople.png)

Find People With Fines Above A Certain Amount:

![Find Fines](/images/PeopleFines.png)
