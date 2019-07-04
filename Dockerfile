FROM java:8-jre
COPY target/hello-spring-1.0-SNAPSHOT.jar /opt
EXPOSE 8081
CMD ["java", "-jar", "/opt/hello-spring-1.0-SNAPSHOT.jar"]