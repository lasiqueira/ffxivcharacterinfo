# ffxivcharacterinfo
Java 14 Rest API using XIVAPI to fetch character data

## Setup
You need: 

[JDK14+](https://jdk.java.net/)

[Gradle 6.6.1+](https://gradle.org/releases/) 
(Alternatively you can use the gradle wrapper with ./gradlew instead of the gradle command)

to build and run this project.

## Building
`gradle clean build`

## Running
`gradle bootRun`

## Documentation
(default: http://localhost:8080)  
server:port/swagger-ui.html

## Example
`curl -i -H "Accept: application/json" -H "Content-Type: application/json" -X GET http://localhost:8080/v1/character/7309689`

