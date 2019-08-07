# Spring Boot Web

Education series - spring boot web.


## Usage

Run `edu.boot.App` in your IDE.

### Docker

Create docker image

    sudo ./gradlew build docker
    
Find image in docker

    sudo docker images
    
Run the image and expose the port of the containerized application to the host

    sudo docker run -p 8080:8080 edu/edu-spring-boot-web
    
