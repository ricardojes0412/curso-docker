FROM openjdk:11
EXPOSE 7090
ADD ./target/app-gateway-0.0.1-SNAPSHOT.jar    app-gateway.jar
ENTRYPOINT ["java","-jar","/app-gateway.jar"]