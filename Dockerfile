FROM openjdk:8u212-jre
MAINTAINER kaleldo 1158809285@qq.com

COPY target/kaleldo-0.0.1-SNAPSHOT.jar /kaleldo-0.0.1.jar
ENTRYPOINT ["java", "-jar", "/kaleldo-0.0.1.jar"]