### Gradle + Groovy

# Gradle

### Introduction

- Build Automation Tool
- Managers dependencies and all stuff that mvn does but it's better than mvn
- Uses Groovy.
- Is fast and comes with many idempotent features.

.gitignore : .gradle

### Project Structure and Initialize a new Project

![project-structure](./static/gradle-project-structure.png)

- `gradle init` to create a new project with a gradle wizard

> Remember: Always use gradle wrapper to run your tasks

- `./gradlew help` : manning

- `./gradlew dependencies` : To see all the dependencies

### Gradle and Java

Java Project Requirements

- .java -> .class files
- manage resources that live alongside code
- package everything into a jar file
- easily run tests
- define dependenices

All the above requirements can be satisfied by just adding a Java Plugin as shown below:

```groovy
plugins {
    // core gradle plugin
    id 'java'
}
jar {
    manifest {
        // creates a manifest file and tells what is the main class
        attributes('Main-Class' : 'com.tomgregory.languageapp.SayHello')
    }
}
```

- adds a task:compileJava `./gradlew compileJava`
- managing resources using task:processResources `./gradlew processResources`
- package into JAR file task:jar `./gradlew jar` found in directory _build > libs_
- task:test `./gradlew test`
- define dependencies in `build.gradle`

  ```groovy
  // Specifying the respository from where to download the dependenices
  repositories {
    mavenCentral()
  }

  dependencies {
    implementation  'org.apache.commons:commons-lang3:3.11'
    testImplementation 'org.junit.jupiter:junit-jupiter-api:5.6.0'
  }
  ```

# **Groovy**

- Built on top of Java to make the development process faster and easier with less boilerplate code
- Purely Object Oriented

```mermaid
Graph LR
A[Groovy Code] -> B[Byte Code]
C[Java Code] -> B
A -.->
```
