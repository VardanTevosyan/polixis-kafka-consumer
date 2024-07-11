# Tools and libs

* Java version : 17
* Gradle version : Gradle 8.5
* Spring boot version : 3.3.1
* Kafka version : 3.7.0
* PostgreSQL version : 16

# Installation

#### Running application in docker environment

_Note: docker and docker-compose should be installed in running machine_

```shell
cd polixis-kafka-consumer (application root directory)
docker-compose up -d
```

#### Application URL's
* Polixis app url : http://localhost:8080
* Kafka UI url : http://localhost:8090

_Example:_

```shell
curl --location 'http://localhost:8080/messages' \
--header 'Content-Type: application/json' \
--data-raw '{
  "firstName": "Vardan",
  "lastName": "Tevosyan",
  "email": "vardan.tevosyan@gmail.com"
}'
```
#### Also you can find postman collection under `postman-collection` directory

