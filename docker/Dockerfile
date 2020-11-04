#添加Java启动的必要镜像
FROM java:8
# 添加Java启动的必要镜像
# VOLUME /tmp
#复制jar文件和配置文件所在的目录到容器里
ADD simulator_dispatcher-0.0.1-SNAPSHOT.jar app.jar
RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo "Asia/Shanghai" > /etc/timezone
# ADD conf /conf
EXPOSE  8888
#配置容器启动后执行的命令,并指定使用项目外部的配置文件
ENTRYPOINT  ["java","-Xms256m","-Xmx256m","-Djava.security.egd=file:/dev/./urandom","-jar", "/app.jar","--spring.config.location=/conf/application.properties"]
