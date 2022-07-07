# what's micronaut ? (released as open-source in May 2018)
Micronaut is a JVM based modern full-stack [[Microservice definition]]  framework designed for building modular, easily testable JVM applications with support for Java, Kotlin, and Groovy.
This new framework has been developed by Grails team with an intention to solve problems which have been identified over the years while building the real world Microservices applications using Spring, Spring Boot and Grails.

####  Micronaut by default provides all the required tools to build the fully featured Microservices applications, which includes:
##### it aims to provide all the tools necessary to build JVM applications including:
-   [[dependency injection]]  and Inversion of Control (IoC)

-   Aspect Oriented Programming (AOP)

-   Sensible Defaults and Auto-Configuration

##### also you can build Message-Driven Applications, Command Line Applications, HTTP Servers and more whilst for Microservices in particular:

-    Distributed Configuration and Configuration Sharing

-   Service Discovery

-   HTTP Routing

-   HTTP Client with client-side load-balancing


#### In Parallel, Micronaut also aims to avoid the downsides of Spring framework, Spring Boot and Grails frameworks by providing:

- Fast startup time
- Reduced memory footprint
- annotation metadata (meta annotation)
- AOP proxies
- beans introspection
- all other framework infrastructure
- reflection, runtime proxy and dynamic classloader free
- small stack trace which help finding the error faster and more understandable
- Easy unit testing

## some concept : 
### Kotlin Extension Functions
The Kotlin documentation explains that extension functions are "an ability to extend a class with new functionality without having to inherit from the class or use design patterns such as Decorator."
They’re useful for writing new functions for classes in a third-party library or quickly creating new methods for common use cases of a class you otherwise can’t edit directly.

### project Demo (Dad Joke app)
#### technologies : 
- Micronaut framework
- Kotlin
- JUnit 5 


#### to run the application 
```
./mvnw mn:run
```
#### example of curl 
##### to test hello world controller 

```curl
curl localhost:8080/hello
```
##### to test dad joke controller

``` curl
curl localhost:8080/dadJokes/joke
```
OR 

``` curl
curl localhost:8080/dadJokes/dogJokes
```




## Micronaut 3.5.2 Documentation

- [User Guide](https://docs.micronaut.io/3.5.2/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.5.2/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.5.2/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

## Feature http-client documentation

- [Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)


