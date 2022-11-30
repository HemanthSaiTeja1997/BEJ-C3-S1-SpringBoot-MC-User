FROM openjdk
WORKDIR usr/lib
ADD ./target/wave34-0.0.1-SNAPSHOT.jar /usr/lib/wave34-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","wave34-0.0.1-SNAPSHOT.jar"]