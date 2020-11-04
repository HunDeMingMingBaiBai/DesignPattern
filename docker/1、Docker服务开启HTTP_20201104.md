### 1、Docker服务开启HTTP
##### 1.1 需要修改/lib/systemd/system/docker.service文件，大致14行的内容为  

	ExecStart=/usr/bin/dockerd -H fd:// --containerd=/run/containerd/containerd.sock  
	--> 修改为   
	ExecStart=/usr/bin/dockerd -H unix://var/run/docker.sock -H tcp://0.0.0.0:2375
	
##### 1.2 通知docker服务作出的修改，并重启docker   
	
	 systemctl deamon-reload   
	 systemctl restart docker    
	 
### 2、更新simlator
##### 2.1 删除docker simlator镜像
	
	docker stop simulator
	docker rm simulator
	docker image rm simulator:v1
	
##### 2.2 更新/home/gaohao/simulator/simulator_dispatcher-0.0.1-SNAPSHOT.jar下的jar包和/home/gaohao/simulator/conf/application.properties配置文件， 更新之后进入/home/gaohao/simulator/

###### 重新生产镜像
	docker build -t simulator:v1 .
	
###### 运行容器
	docker run -d -p 8888:8888 -v /home/gaohao/simulator/conf:/conf --name simulator simulator:v1

	

	