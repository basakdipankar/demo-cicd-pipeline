FROM ubuntu:18.04

MAINTAINER dbasak2013@gmail.com

RUN mkdir /opt/tomcat/

WORKDIR /opt/tomcat

RUN apt update && apt install curl -y && apt install openjdk-8-jdk -y

RUN curl -O https://downloads.apache.org/tomcat/tomcat-9/v9.0.36/bin/apache-tomcat-9.0.36.tar.gz

RUN tar xvfz apache*.tar.gz

RUN mv apache-tomcat*/* /opt/tomcat/.

RUN java -version

EXPOSE 8080

CMD ["/opt/tomcat/bin/catalina.sh", "run"]
