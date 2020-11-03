#!/usr/bin/env bash

JAVA="java"
#JAVA="./soft/java/bin/java"
JAVA_OPTS="-server -Xms512m -Xmx512m"
SERVERJAR="health-ncov-1.0-SNAPSHOT.jar"
SPRING_OPTS="--spring.config.location=./application.yaml"
base_dir=$(dirname $0)
PIDFILE=server.pid


PID=$(ps -ef | grep "$SERVERJAR" | grep -v grep | awk '{ print $2}')

if [ -z "$PID" ]; then
    echo "Application has already stopped."
else
    echo "kill $PID"
    kill $PID && echo "Send stopping signal to server successful."


    #wait server stop

    LOOPS=0
    while(true)
    do
        PID=$(ps -ef | grep "$SERVERJAR" | grep -v grep | awk '{print $2}')
        if [ -z "$PID" ]; then
            echo "Stop server successful! Cost $LOOPS seconds."
            break;
        fi
        #judge time out

        if [ "$LOOPS" -gt 180 ]; then
            echo "$Stop server cost time over 180 seconds. Now force stop it."
            kill -9 $PID && echo "Force stop successful."
            break;
        else
            echo "Cost $LOOPS seconds."
        fi

        let LOOPS=LOOPS+1
        sleep 1
    done
fi

echo `pwd`
echo $SERVERJAR
echo $JAVA
echo $JAVA_OPTS

nohup $JAVA $JAVA_OPTS -jar ./$SERVERJAR $SPRING_OPTS > ./nohup.out 2>&1 < /dev/null &

if [ $? -eq 0 ]; then
    echo -n $! > "$PIDFILE"
    if [ $? -eq 0 ]; then
        sleep 1
        echo "STARTED"
    else
        echo "FAILED TO WRITE PID"
        exit 1
    fi
else
    echo "SERVER DID NOT START"
    exit 1
fi

