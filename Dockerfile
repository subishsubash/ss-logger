FROM adoptopenjdk/openjdk17:alpine-jre
ADD target/ss-logger-1.1.jar ss-logger.jar
ENTRYPOINT ["java","-jar","ss-logger.jar"]
