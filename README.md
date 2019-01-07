# Intro
This is a simple Spring Boot application written for the article here: https://blog.arnoldgalovics.com/deploying-a-simple-spring-boot-with-mysql-app-to-aws-using-elastic-beanstalk/

Its a basic Spring Boot application acting as a bookstore with 2 exposed HTTP endpoints. 
The application also uses a MySQL database as a backing data storage.

### Available endpoints
- `GET /books` which returns all the books stored in the system.
- `POST /books` which can create new books in the system.
  - The following JSON structure shall be used as a request body `{ "name": "test-book" }`

### Running MySQL locally for testing purposes
```bash
docker run --name aws-eb-mysql -e MYSQL_ROOT_PASSWORD=root -p 3306:3306 -d mysql/8.0.11
```
