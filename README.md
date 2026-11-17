# ffxivcharacterinfo
Java 25 / Spring Boot 4 Rest API using XIVAPI to fetch character data

## Setup
You need: 

[JDK 25+](https://adoptium.net/)

[Gradle 9.9.1+](https://gradle.org/releases/) 
(Alternatively you can use the gradle wrapper with `./gradlew` instead of the `gradle` command)

to build and run this project.

## Building
`gradle clean build`

## Running
`gradle bootRun`

## Docker
To run the application in a docker container, after building run the following commands:

`gradle bootBuildImage`

or, using the Dockerfile:

`docker build -t ffxivcharacterinfo:0.0.1-SNAPSHOT .`


`docker run -it -p 8080:8080 ffxivcharacterinfo:0.0.1-SNAPSHOT`
or
`docker-compose up`

## Documentation
(default: http://localhost:8080)  
server:port/swagger-ui.html (OpenAPI spec at server:port/v3/api-docs)

## Example
`curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/v1/character/7309689`

## TODO

Modify data to return interesting stats according to query params;

Add more character information displayed to the user;

Store and display character level growth by day;
