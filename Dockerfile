FROM openjdk:17
EXPOSE 8080
ADD target/microservice-crud-operation.jar microservice-crud-operation.jar
ENTRYPOINT [ "java", "-jar", "microservice-crud-operation.jar" ]