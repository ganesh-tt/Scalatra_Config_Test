#!/bin/bash


# build Docker tdss-be
docker build -t dev-config-be .


docker run -p 8080:8080 dev-config-be