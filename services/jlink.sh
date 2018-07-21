#!/bin/bash

rm -rf target/dist
jlink -p ${JAVA_HOME}/jmods/:target/modules \
      --add-modules br.com.quartovago.main \
      --launcher start-app=br.com.quartovago.main \
      --output target/dist





