#!/bin/bash
rm -rf target
mkdir target
mkdir target/modules

## Compilando modulo
mkdir -p target/bin/br.com.hello
javac -d target/bin/br.com.hello $(find src/br.com.hello -name "*.java")

jar --create --file=target/modules/hello.jar \
    --main-class br.com.hello.main.Main \
    -C target/bin/br.com.hello .

#    --module-version=1.0 \

echo "Success"