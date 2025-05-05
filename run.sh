#!/bin/bash

set -e

MODULE_PATH="service/target/service-1.0-SNAPSHOT.jar:bubblesorter/target/bubblesorter-1.0-SNAPSHOT.jar:quicksorter/target/quicksorter-1.0-SNAPSHOT.jar:sortingrunner/target/sortingrunner-1.0-SNAPSHOT.jar"

MAIN_MODULE="se.iths.java.sortingrunner"
MAIN_CLASS="se.iths.java24.sortingrunner.main.Main"

java --module-path "$MODULE_PATH" -m "$MAIN_MODULE/$MAIN_CLASS"