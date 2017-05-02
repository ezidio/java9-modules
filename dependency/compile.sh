rm -rf bin

mkdir -p bin/br.com.quartovago.api
mkdir -p bin/br.com.quartovago.main

java9c -p bin -d bin/br.com.quartovago.api $(find br.com.quartovago.api -name "*.java")
java9c -p bin -d bin/br.com.quartovago.main $(find br.com.quartovago.main -name "*.java")

java9 --module-path bin/ -m br.com.quartovago.main/br.com.quartovago.main.Main


