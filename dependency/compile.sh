#!/bin/bash

rm -rf target

mkdir target
mkdir target/modules

## Compilando API

mkdir -p target/bin/br.com.quartovago.api
javac -p target/bin \
      -d target/bin/br.com.quartovago.api \
      $(find src/br.com.quartovago.api -name "*.java")
jar --create \
    --file=target/modules/api.jar \
    --module-version=1.0 \
    -C target/bin/br.com.quartovago.api .

## Compilando Classe principal

mkdir -p target/bin/br.com.quartovago.main
javac -p target/bin \
      -d target/bin/br.com.quartovago.main \
      $(find src/br.com.quartovago.main -name "*.java")
jar --create \
    --file=target/modules/main.jar \
    --module-version=1.0 \
    --main-class br.com.quartovago.main.Main \
    -C target/bin/br.com.quartovago.main .
