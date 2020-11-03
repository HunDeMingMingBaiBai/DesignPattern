#!/usr/bin/env bash

SERVERJAR="health-ncov-1.0-SNAPSHOT.jar"
base_dir=$(dirname $0)

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
