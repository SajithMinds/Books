FROM openjdk:17
EXPOSE 8087
ADD target/Library-1.jar book.jar
ENTRYPOINT ["java","-jar",/book.jar]