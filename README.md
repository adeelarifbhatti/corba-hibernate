# Corba with hibernate (mysql) "Key Value"

It uses openjdk-8-jdk & maven, later versions have discontinued the Corba support. The docker image is created by installing openjdk-8-jdk & maven in ubuntu-latest, 
running idlj -fall CountryCapital.idl to get CountryCapital, a import (DataSetModel) need to be made in the Model package.

### The "Key Value"
How server is run in the Docker container

###### java Server/Server -ORBInitialPort 900 -ORBInitialHost server
###### java -jar target/CorbaHibernate-0.0.1-SNAPSHOT-jar-with-dependencies.jar  -ORBInitialPort 900 -ORBInitialHost localhost 
How client is run in the Docker
###### java Client/Client -ORBInitialPort 900 -ORBInitialHost server
###### java -jar target/CorbaHibernate-client.0.0.1-SNAPSHOT-jar-with-dependencies.jar -ORBInitialHost server -ORBInitialPort 900
How data in entered at client side
###### set 1 Norway Oslo
How data in retrieved on client side
###### get Norway
In the client image following commands are run to get the jar file created with the dependencies
###### mvn -f pom-client.xml clean package
In the server image 900 is exposed and following commands are run to get the jar file created with the dependencies.
###### mvn clean package
To run the app, just clone it and execute following command. Three containers will run as a result i.e. client, server and database
#### docker-compose up
