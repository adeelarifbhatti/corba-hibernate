#!/bin/bash
sleep 6
java -jar target/CorbaHibernate-client.0.0.1-SNAPSHOT-jar-with-dependencies.jar -ORBInitialHost server -ORBInitialPort 900 < <(printf "set 1 Norway Oslo\r")
java -jar target/CorbaHibernate-client.0.0.1-SNAPSHOT-jar-with-dependencies.jar -ORBInitialHost server -ORBInitialPort 900 < <(printf "get Norway\r")
