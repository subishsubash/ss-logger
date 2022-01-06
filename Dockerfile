FROM adoptopenjdk/openjdk16:alpine-jre
ADD target/ss-logger-1.1.jar ss-logger.jar
ENTRYPOINT ["java","-jar","ss-logger.jar"]
