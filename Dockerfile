FROM ubuntu:latest
LABEL maintainer="adeelarifbhatti@gmail.com"
WORKDIR /app
RUN apt-get update && apt-get install -y openjdk-8-jdk maven
COPY src src
COPY pom.xml pom.xml
COPY start.sh ./
EXPOSE 900
RUN mvn clean package
RUN chmod +x ./start.sh
ENTRYPOINT ["./start.sh"]