#!/bin/bash
exec java -cp target/classes:$(cat .classpath.txt) com.acme.MyApp app $@