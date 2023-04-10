FROM openjdk:17
ADD target/SB-OneToMany-0.0.1-SNAPSHOT.jar sb-mapping.jar
EXPOSE 9095
ENTRYPOINT ["java", "-jar","sb-mapping.jar"]




