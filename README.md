# json4j
API project for JSON entity deserialization and serialization and two adapters for external projects.

## Motivation
In a current project I need an abstraction layer for JSON entity operations. Since JSR 367 (Java API for JSON Binding (JSON-B)) is still far away, I created this project.

## But why?
The project where this is needed itself is a library. So it should be easily reusable and bring no extra baggage.

Say you have a project and use library A for JSON entity operations. Now you add a new dependency to a library for a REST service you want to use - and this library depends on JSON entity library B. You end up with two dependencies who do exactly the same thing. How needs that?

If the REST library would just depend on an API project you could use an existing adapter implementation for library A or quickly write one yourself. Problem solved.

## Usage
Since this project is currently intended for my *java-lib-for-wunderlist* project, I keep the usage chapter very short. It basicly works like *log4j* or *slf4j*. You depend on the facade project (see **Maven**) and only use the `JSONBindingService` for JSON-entity-conversion.

The field initialization looks like this:

```java
private JSONBindingService jsonBindingService = JSONBindingServiceFactory.create();
```

During compile time this code is perfectly fine. When running the program a concrete implementation of the `JSONBindingService` interface is needed. For that you additionally depend on an adapter implementation (e.g. *json4j-gson*). In you library project you do not want to have a *compile* dependency to an adapter implementation, but with a *test* dependency you actually can run and test your code.

If you have multiple adapter projects in your classpath you can select a specific one by setting the Java system propert `jochor.servicefactory.de.jochor.lib.json4j.StaticJSONBindingBinder` to the full qualified name of the service class.

```java
System.setProperty("jochor.servicefactory.de.jochor.lib.json4j.StaticJSONBindingBinder", "de.jochor.lib.json4j.gson.JSONBindingServiceGson");
```

Normally this is only necessary if you need different implementation during testing and runtime.

## Maven

### Dependency Tag

#### Facade project

```xml
<dependency>
	<groupId>de.jochor.lib.json</groupId>
	<artifactId>json4j</artifactId>
	<version>0.3.1</version>
</dependency>
```

#### Adapter implementation for GSON v2.3.1

```xml
<dependency>
	<groupId>de.jochor.lib.json</groupId>
	<artifactId>json4j-gson</artifactId>
	<version>0.3.1</version>
</dependency>
```

#### Adapter implementation for Jackson v2.6.1

```xml
<dependency>
	<groupId>de.jochor.lib.json</groupId>
	<artifactId>json4j-gson</artifactId>
	<version>0.3.1</version>
</dependency>
```

### Repository Tag

#### Releases

```xml
<repository>
	<id>jochor-public-releases</id>
	<url>http://maven.jochor.de/content/repositories/public-releases/</url>
</repository>
```

#### Snapshots

```xml
<repository>
	<id>jochor-public-releases</id>
	<url>http://maven.jochor.de/content/repositories/public-snapshots/</url>
</repository>
```
