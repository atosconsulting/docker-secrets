#!/bin/sh

/create_properties.sh

echo "Properties created, running $@ with JAVA_OPTS=$JAVA_OPTS"

sh -c "$@"
