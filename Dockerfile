FROM debian:latest
# Specify the user
ARG USER_NAME=10014
ARG USER_ID=10014

# Create a group and user
RUN addgroup --gid $USER_ID $USER_NAME && \
    adduser --uid $USER_ID --ingroup $USER_NAME --disabled-password --gecos '' $USER_NAME

# Switch to the user
USER $USER_NAME

USER USER_ID



RUN useradd -u 10014 -m -s /bin/bash myuser
RUN usermod -a -G www-data 10014

RUN mkdir -p /opt/app
COPY target/ims-service-*.jar	 /opt/app
WORKDIR /opt/app
CMD ["java", "-jar", "ims-service-*.jar	"]

EXPOSE 8090

RUN ["chmod", "+x", "start.sh"]