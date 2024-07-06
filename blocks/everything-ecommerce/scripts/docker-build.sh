#!/usr/bin/env bash
echo "Building jar file";
mvn -U clean package "$@" || exit 1

echo "Building docker image";
docker build . -t kapeta/everything-ecommerce || exit 1

echo "Done. Image ready: kapeta/everything-ecommerce";
