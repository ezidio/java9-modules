rm -rf bin

mkdir -p bin/br.com.quartovago.main

java9c -d bin/br.com.quartovago.main $(find br.com.quartovago.main -name "*.java")

java9 --module-path bin/ -m br.com.quartovago.main/br.com.quartovago.main.Main


