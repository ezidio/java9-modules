#!/bin/bash
rm -rf target

mkdir -p target/modules

mkdir -p target/bin/br.com.quartovago.api
javac -p target/bin -d target/bin/br.com.quartovago.api $(find src/br.com.quartovago.api -name "*.java")
jar --create --file=target/modules/api.jar --module-version=1.0 -C target/bin/br.com.quartovago.api .

mkdir -p target/bin/br.com.quartovago.booking
javac -p target/bin -d target/bin/br.com.quartovago.booking $(find src/br.com.quartovago.booking -name "*.java")
jar --create --file=target/modules/booking.jar --module-version=1.0 -C target/bin/br.com.quartovago.booking .

mkdir -p target/bin/br.com.quartovago.tripadvisor
javac -p target/bin -d target/bin/br.com.quartovago.tripadvisor $(find src/br.com.quartovago.tripadvisor -name "*.java")
jar --create --file=target/modules/tripadvisor.jar --module-version=1.0 -C target/bin/br.com.quartovago.tripadvisor .

mkdir -p target/bin/br.com.quartovago.main
javac -p target/bin -d target/bin/br.com.quartovago.main $(find src/br.com.quartovago.main -name "*.java")
jar --create --file=target/modules/main.jar --module-version=1.0 --main-class br.com.quartovago.main.Main -C target/bin/br.com.quartovago.main .

echo "Success"