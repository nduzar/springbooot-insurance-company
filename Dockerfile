FROM openjdk:11
EXPOSE 8080
ADD target/exam.jar exam.jar
ENTRYPOINT ["java", "-jar", "exam.jar"]


#docker container run --name exam -p 8080:8080 -d exam.jar
