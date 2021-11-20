#!/bin/bash
#脚本就直接启动jar包，此处可以使用nohup进行启动，在容器化的话，会不在控制台打印日志，没其他差别
java -jar ${project.artifactId}-${project.version}.jar --spring.profiles.active=${PROFILES}
