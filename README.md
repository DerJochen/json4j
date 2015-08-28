# json4j
API project for JSON entity deserialization and serialization and two adapters for external projects.

_Motivation_
In a current project I need an abstraction layer for JSON entity operations. Since JSR 367 (Java API for JSON Binding (JSON-B)) is still far away, I created this project.

_But why?_
The project where this is needed itself is a library. So it should be easily reusable and bring no extra baggage.

Say you have a project and use library A for JSON entity operations. Now you add a new dependency to a library for a REST service you want to use - and this library depends on JSON entity library B. You end up with two dependencies who do exactly the same thing. How needs that?

If the REST library would just depende on an API project you could use an existing adapter implementation for library A or quickly write one yourself. Problem solved.
