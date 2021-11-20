# Docker image for springboot file run
# VERSION 0.0.1
# Author: ****
# 基础镜像使用java
FROM java:8
# VOLUME 指定了临时文件目录为/tmp。
# 其效果是在主机 /var/lib/docker 目录下创建了一个临时文件，并链接到容器的/tmp
# VOLUME 此处如果挂载目录，目录名称是随机的，比如将宿主机某个目录挂载到容器的日志目录;可以在启动的时候指定挂载目录
# 创建工作目录
RUN mkdir -p /home/fpf/dockercontainer/
COPY ${project.artifactId}-${project.version}.jar start.sh  /home/fpf/dockercontainer/
#同步宿主机和容器时间
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone
# 工作目录
WORKDIR /home/fpf/dockercontainer
#设置环境变量
ENV PROFILES sit
#此指令在环境执行的时候就行  sh -c ./start.sh
ENTRYPOINT ["sh","-c","./start.sh"]
###声明启动端口号
#EXPOSE 8301