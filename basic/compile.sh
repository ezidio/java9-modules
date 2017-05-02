rm -rf bin

mkdir -p bin/br.com.hello.main

java9c -d bin/br.com.hello.main $(find br.com.hello.main -name "*.java")

java9 --module-path bin/ -m br.com.hello.main/br.com.hello.main.Main


