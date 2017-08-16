FROM java:8u111-jre-alpine
MAINTAINER Javi Moreno <javi.moreno@capside.com>

COPY target/*.jar /app.jar

EXPOSE 8080

ENTRYPOINT  ["java", "-jar", "/app.jar"]

CMD [""]