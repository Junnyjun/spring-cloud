CONTAINER_NAME=eureka_container
IMAGE_NAME=eureka_image

PORT=8188

sudo docker stop $CONTAINER_NAME
sudo docker rm $CONTAINER_NAME
sudo docker rmi $IMAGE_NAME

sudo docker build \
-t $IMAGE_NAME \
.

sudo docker run \
-p $PORT:8080 \
--name $CONTAINER_NAME \
--restart=always \
-d \
$IMAGE_NAME


#! /bin/bash

CONTAINER_NAME=gunny_container
IMAGE_NAME=gunny_image
PORT=8088
DEPLOY_PATH=/home/ubuntu/gunny
JAR_PATH_ARG=$1

sudo docker stop $CONTAINER_NAME
sudo docker rm $CONTAINER_NAME
sudo docker rmi $IMAGE_NAME

sudo docker build \
--build-arg JAR_PATH=$JAR_PATH_ARG \
-t $IMAGE_NAME \
$DEPLOY_PATH

sudo docker run \
-p $PORT:8080 \
--name $CONTAINER_NAME \
--restart=always \
-d \
$IMAGE_NAME
