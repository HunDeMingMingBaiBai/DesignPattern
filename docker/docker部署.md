# docker部署
1. 将项目打jar包  
2. 将 src/main/docker/Dockerfile 文件与 simulator_dispatcher-0.0.1-SNAPSHOT.jar 放在同一目录下  
3. 运行 `docker build -t simulator:v1 .` 生成docker镜像  
4. 将 src/main/resources/application.properties 与 src/main/resources/simulatorList.txt 放在同一目录下。
运行 `docker run -d -p 8888:8888 -v /Users/4paradigm/dockerPackage/conf:/conf --name simulator simulator:v1` 启动容器，挂在的目录下还会生成被占用的仿真器和springboot应用的日志文件


