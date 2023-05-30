#!/bin/sh
CLSPATH=".:lib/*"
java -classpath $CLSPATH com.dilan.ims.service.IMServiceApplication "$@"
