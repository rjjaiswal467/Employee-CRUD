FROM openjdk:8
ADD target/employee-crud-0.0.1-SNAPSHOT.jar /employee-crud-0.0.1-SNAPSHOT.jar
EXPOSE 8082
CMD ["java", "jar", "/employee-crud-0.0.1-SNAPSHOT.jar"]