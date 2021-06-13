FROM openjdk:8-jdk-alpine


COPY target/*.jar /home/spring-boot.jar

CMD java -jar /home/spring-boot.jar

