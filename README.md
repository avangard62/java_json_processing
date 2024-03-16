# java_json_processing

## JSON processing tricks at Java coding
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
Field for parse from source JSON-string should be named there as key: "PersonName".<br>
And after serializing this field would be named as "userName".

See:

* src: [CommonEntity](src/main/java/ru/gp/dto/CommonEntity.java)
* test: [JsonDtoTest](src/test/java/ru/gp/JsonDtoTest.java)