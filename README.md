# Spring Modulith Fundamentals Example
## Introduction
This project is a demonstration project and should help to understand the way of working of the Spring Modulith functionality. It is based on Spring Modulith version 1.3.4 and written at the beginning of April 2025.\
The main motivation was the implementation of the [fundamentals](https://docs.spring.io/spring-modulith/reference/fundamentals.html) of Spring Modulith without the event messaging part.
## Actuator Links
After starting this project as Spring Boot application the following actuator links can be invoked after starting the application:
- http://127.0.0.1:8080/actuator
- http://127.0.0.1:8080/actuator/health
- http://127.0.0.1:8080/actuator/modulith
## Testing
In the testing section some of the cases are tested.
Also a case with mocked module exist based on the [documentation](https://docs.spring.io/spring-modulith/reference/testing.html).
The global test are one for the verification of the Spring Modulith architecture and one for generating the documentation:
- [ModulithArchitectureValidationTest](src/test/java/com/acme/spring_modulith/ModulithArchitectureValidationTest.java)
- [DocumentModulesTest](src/test/java/com/acme/spring_modulith/DocumentModulesTest.java)
## Generating ASCII Doc Diagrams with Kroki
Rendering the documentation is done by starting the test [DocumentModulesTest](src/test/java/com/acme/spring_modulith/DocumentModulesTest.java).\
For rendering the diagrams kroki can be used. If you don't use the local service the documentation process uses the online service rendering.
### Local custom kroki
#### Install local kroki
There is a local solution with docker. It implies that your local machine needs to have installed docker.
The docker command looks like following:\
`docker run -d --rm -p8000:8000 yuzutech/kroki:latest`
#### Configure kroki in IntelliJ
The AsciiDoc plugin needs to be installed. Search in the IntelliJ configuration for the AsciiDoc part in detail for the kroki-part.\
Add "http://localhost:8000/" address in the IntelliJ settings in the AsciiDoc part. It looks like that:\
`URL for custom kroki instance: http://localhost:8000/`
## Structure and use cases
In this project several packages are created on the highest level as part of the Spring Modulith demonstration.
- legacy
  - open module
- person
  - closed module, named interface
- organisation
  - closed module, nested module, named interface 
- government
  - closed module, explicit application module dependency
- company
  - closed module, explicit application module dependency
### Validation
The validation is done by starting the [ModulithArchitectureValidationTest](src/test/java/com/acme/spring_modulith/ModulithArchitectureValidationTest.java).\
The description below is based on this validation.
The rules are based on the jmolecule/ArchUnit rules:
- no cycle dependencies of the modules
- efferent module access via API packages only
- explicitly allowed application module dependencies only

More about verifying application module structure can be found [here](https://docs.spring.io/spring-modulith/reference/verification.html).
### Legacy
This package is not dependent to any other else.
It is declared "OPEN" in the package-info.java file which means is has not architectural access restrictions because of it.
It represents a legacy package with code and how it can be used in a Spring Modulith architecture.
### Person
It is standard closed package.
This package depends on the legacy package.
But this package has also a named interface which is in the com.acme.spring_modulith.person.service.vip-package.
The named interface is used from the other packages.
- `person :: vip -> government`
- `person -> other`
### Organisation
It is standard closed package.
This package depends on the person package.
It also has a named interface "Named Organisation" and nested module "Nested Organisation Service".
Via the nested module objects from the package person is used. And in the named interface the class from the nested is used. The named interface is used from other packages.
- `person -> Nested Organisation Service -> Named Organisation -> company`
- `organisation -> other`
### Government
It is standard closed package.
The government package has explicit application module dependency.
- `person :: vip -> government`
- `government -> other`
### Company
It is standard closed package.
The company package has explicit application module dependency.
- `organisation :: Named Organisation -> company`
