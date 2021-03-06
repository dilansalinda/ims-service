FROM java:8-jdk-alpine
RUN mkdir -p /opt/app
COPY target/ims-service-*.jar	 /opt/app
WORKDIR /opt/app
CMD ["java", "-jar", "ims-service-*.jar	"]
