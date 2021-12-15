FROM openjdk:11-jdk-slim
ADD target/*.jar /usr/share/app.jar
ENTRYPOINT ["/usr/bin/java", "-jar", "/usr/share/app.jar"]