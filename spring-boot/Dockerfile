FROM openjdk:8-jdk-alpine

VOLUME /tmp

ENV JAVA_OPTS="-Xmx128m"

COPY target/secrets.jar /secrets.jar
COPY src/main/docker/docker-entrypoint.sh /docker-entrypoint.sh
COPY src/main/docker/create_properties.sh /create_properties.sh

RUN touch /secrets.jar && mkdir -p /config

WORKDIR /

EXPOSE 8080

ENTRYPOINT [ "/docker-entrypoint.sh" ]

CMD [ "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /secrets.jar" ]
