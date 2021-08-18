from openjdk:11
ADD target/docker-demo-0.0.1-SNAPSHOT.jar dockerdemo.jar
ENTRYPOINT ["java","-jar","dockerdemo.jar"]