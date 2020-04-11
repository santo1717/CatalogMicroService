FROM openjdk:latest
ADD CatalogMicroService-0.0.1-SNAPSHOT.jar CatalogMicroService.jar
ENTRYPOINT ["java","-jar","CatalogMicroService.jar"]
EXPOSE 8090