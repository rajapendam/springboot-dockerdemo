FROM adoptopenjdk/openjdk13

EXPOSE 8080

ADD target/springboot-dockerdemo.jar springboot-dockerdemo.jar

ENTRYPOINT ["java","-jar","springboot-dockerdemo.jar"]