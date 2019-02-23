FROM maven:3.6.0-jdk-8-slim

EXPOSE 8080
VOLUME /root/.m2

WORKDIR /usr/meubem/core

COPY . /usr/meubem/core/

CMD ["mvn", "spring-boot:run"]