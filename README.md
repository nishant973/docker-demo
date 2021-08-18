# docker-demo
Spring-boot project with mongodb and cerating a docker image and running

Pull mongodb image from dockerhub
docker pull mongo:latest

run the container in detach mode  for your mongodb and do port mapping
docker run –d –p 27017:27017 –name mymongdb mongo:latest

build the image for yourspringboot app
docker build –t docker-demo:1.0 .

Run your springbooy app and link mongodb
docker run –p 8081:8081 –name springboot-mongo –link mymongodb:mongo –d docker-demo:1.0

to check your springboot app logs
docker logs springboot-mongo

To connect to your mongodb db inside container 
docker exec –it mymongdb bash
