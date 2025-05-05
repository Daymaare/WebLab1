#!/bin/bash

set -e

if [[ "$OSTYPE" == "msys" || "$OSTYPE" == "win32" || "$OSTYPE" == "cygwin" ]]; then
  SEP=";"
else
  SEP=":"
fi

MODULE_PATH="service/target/service-1.0-SNAPSHOT.jar${SEP}bubblesorter/target/bubblesorter-1.0-SNAPSHOT.jar${SEP}quicksorter/target/quicksorter-1.0-SNAPSHOT.jar${SEP}sortingrunner/target/sortingrunner-1.0-SNAPSHOT.jar"

MAIN_MODULE="se.iths.java.sortingrunner"
MAIN_CLASS="se.iths.java24.sortingrunner.main.Main"

java --module-path "$MODULE_PATH" -m "$MAIN_MODULE/$MAIN_CLASS" "$MAIN_MODULE/$MAIN_CLASS"