FROM adoptopenjdk/openjdk8:alpine
RUN mkdir -p /usr/app
RUN chown -R 1000 /usr/app
RUN apk update && apk add --no-cache curl \
unzip \
bash \
tzdata \
wget
ENV TZ=Asia/Colombo
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
USER 1000
COPY ./target/ims-service-*.jar
WORKDIR /usr/app
