# Personal Assistant
## _Your own personal assistant, always there._

This is a Personal assistant to assist you in your daily works, like keeping your notes, keeping your remainders, 
and a whole lot of other works too.

## Features
- You can save Notes.
- You can set reminders.
- You can set todo items.

This project is in its initial phase and is made to learn and help others learn how microservices are created
as a greenfield project and help leverage the opportunity.

> Microservices are independently deployable modules which focus on their own functionality, i.e coherence.
> This makes the whole system work better and splitting teams becomes easier than never before.
> However There are it's own complexities too, it is a tradeoff, you have to choose one on other.

## Tech

Personal Assistant uses the technologies given below:

- Java - The core programming language
- Spring boot - For quickly creating projects with minimal configuration
- Spring Cloud - For using the built tools of spring for microservices design patters
- Spring Cloud Eureka Server - For Service Discovery
- Spring Cloud Api Gateway - For proxy and reverse proxy
- Spring Cloud config Server - For spring cloud centralized configuration
- Spring web - For Rest endpoints

## Set up

- Run Eureka server
- Run config project
- Run Gateway project
- Run Notes service
- Run Reminder service

## Testing

To test the application, open postman and configure the urls as given below
###Notes service
####Save

``` 
http://localhost:8989/notes/save 
```
The below sample json should go in the body part with POST method
```json
{
    "notes": [
        {
            "userId": 3,
            "note": "Oracle is a RDBMS, RDBMS are good at providing ACID properties",
            "title": "ORACLE",
            "keyword": "oracle"
        },
        {
            "userId": 3,
            "note": "Oracle is a reliable database, which is also consistent",
            "title": "ORACLE",
            "keyword": "oracle"
        },
        {
            "userId": 3,
            "note": "Oracle is a Needed when you want some gurantee or assurance in your transactions",
            "title": "ORACLE",
            "keyword": "oracle"
        },
        {
            "userId": 3,
            "note": "Oracle is required for domains like, banking, or payment or any transaction related work",
            "title": "ORACLE",
            "keyword": "oracle"
        },
        {
            "userId": 3,
            "note": "Oracle is easy to understand and people are good at RDBMS because its taught from school",
            "title": "ORACLE",
            "keyword": "oracle"
        }
    ]
}
```
####Get
Below urls are for get endpoints

```shell
http://localhost:8989/notes/get/user/3
```

For any help, please mail me at yogesh.sharma.art@gmail.com.

Thanks