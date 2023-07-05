CONTAINER_NAME=eureka_container
IMAGE_NAME=eureka_image
BUILD_PATH=$1
PORT=8188

sudo docker stop $CONTAINER_NAME
sudo docker rm $CONTAINER_NAME
sudo docker rmi $IMAGE_NAME

echo "path  :: `(pwd)`"

sudo docker build \
-t $IMAGE_NAME \
$BUILD_PATH

sudo docker run \
-p $PORT:8080 \
--name $CONTAINER_NAME \
--restart=always \
-d \
$IMAGE_NAME
