FROM youmoni/jdk11

WORKDIR /app
COPY ./target/airportsservice-0.0.1-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "airportsservice-0.0.1-SNAPSHOT.jar"]