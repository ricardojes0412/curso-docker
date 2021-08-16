FROM openjdk:11
EXPOSE 7081
ADD ./target/app-invoice-0.0.1-SNAPSHOT.jar    app-invoice.jar
ENTRYPOINT ["java","-jar","/app-invoice.jar"]