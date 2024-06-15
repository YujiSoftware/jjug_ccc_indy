#!/bin/sh -eu

for i in *.java; do
    FILE=${i%.*}

    javac $FILE.java
    javap -v -p $FILE.class > $FILE.javap
    # java "-Djdk.invoke.MethodHandle.dumpClassFiles" $FILE
done
