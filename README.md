# java_json_processing

## 1. JSON processing tricks at Java coding
### With using of Jackson library

All of described receipts with tests are located at this Maven project.

1) If you:
   * have DTO class describing some entity
   * need to have availability to deserialize (on parsing) and serialize any field of DTO as different keys

   Use such approach, for example:
   ```java
       @JsonAlias({"PersonName"})
       @JsonSetter("userName")
       private String name;
   ```
Field for parse from source JSON-string should be named there as key: `"PersonName"`.<br>
And after serializing this field would be named as `"userName"`.


2) In case if there are some fixed common fields and any varying fields collection:

You can use DTO class with common named fields and additional Map field.
Use `@JsonAnySetter` annotated declared method to define deserializing rules. Key and value as arguments.
   
To avoid collision on further serialization mark also your Map by `@JsonIgnore` annotation.
<hr>

See at project:

* src: [CommonEntity](src/main/java/ru/gp/dto/CommonEntity.java)
* test: [JsonDtoTest](src/test/java/ru/gp/JsonDtoTest.java)

## 2. Time control at TestNG tests
[TimeChecker](src/test/java/ru/gp/TimeChecker.java) and [TimeCheckTest](src/test/java/ru/gp/TimeCheckTest.java) demonstrates
how to get timestamp value of beginning of test method.