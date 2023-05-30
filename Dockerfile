FROM adoptopenjdk/openjdk8:alpine

USER 10014

RUN useradd -u 10014 -m -s /bin/bash myuser
RUN usermod -a -G www-data 10014

RUN mkdir -p /opt/app
COPY target/ims-service-*.jar	 /opt/app
WORKDIR /opt/app
CMD ["java", "-jar", "ims-service-*.jar	"]

EXPOSE 8090

RUN ["chmod", "+x", "start.sh"]