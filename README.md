# Demo blog project using Kotlin and Spring Boot

Demo Kotlin application regarding the tutorial https://spring.io/guides/tutorials/spring-boot-kotlin/

## Pros and cons

### Pros

* language is short and concise -> maintenance easier?
* language has many nice features (see https://dev.to/martinhaeusler/kotlin---the-good-the-bad-and-the-ugly-3jfo):
    * NULL is a separate type
    * Extension functions
    * Flow Typing & Type Inference
    * Final made easy
    * Streams, streamlined
    * Iterable and Streams interoperability
    * ...
* 100% interoperable with Java
* translates to JVM byte code, as well as JavaScript

### Cons

* seems to be used primarily for Android development -> using Kotlin for Java / Spring web apps is an end in itself?
* language peculiarities
    * All classes in Kotlin by default are final
    * In Kotlin, there is no static keyword
    * the primary constructor must always list (and assign) all fields
    * data classes cannot extend any base class, and are final themselves (nope, you can't use open here either)
    * abundance of Keywords
