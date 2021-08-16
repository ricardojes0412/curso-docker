FROM openjdk:11
EXPOSE 7082
ADD ./target/app-transaction-0.0.1-SNAPSHOT.jar    app-transaction.jar
ENTRYPOINT ["java","-jar","/app-transaction.jar"]