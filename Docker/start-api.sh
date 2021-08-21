#!/bin/bash
orbd -ORBInitialPort 900 -ORBInitialHost 0.0.0.0 &
catalina.sh run
