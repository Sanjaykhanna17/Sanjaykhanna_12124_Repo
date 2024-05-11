FROM openjdk:17

WORKDIR /app

COPY  target/BankManagementSystem-0.0.1-SNAPSHOT.war /app/BankManagementSystem-0.0.1-SNAPSHOT.war

EXPOSE 1330

CMD ["java", "-jar", "/app/BankManagementSystem-0.0.1-SNAPSHOT.war"]
