#!/bin/bash
orbd -ORBInitialPort 900 -ORBInitialHost 0.0.0.0 &
sleep 5
echo "ORBD started on localhost and 900"
java -jar target/CorbaHibernate-0.0.1-SNAPSHOT-jar-with-dependencies.jar  -ORBInitialPort 900 -ORBInitialHost localhost
