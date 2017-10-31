FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/springboot-restapi-example-1.0.0.jar springboot-restapi-example.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /springboot-restapi-example.jar