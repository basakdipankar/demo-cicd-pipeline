FROM dipankar435/tomcat9_ubuntu18.04

MAINTAINER dbasak2013@gmail.com 

WORKDIR /opt/tomcat/webapps

COPY target/*.war .

EXPOSE 8080

CMD ["/opt/tomcat/bin/catalina.sh", "run"]
