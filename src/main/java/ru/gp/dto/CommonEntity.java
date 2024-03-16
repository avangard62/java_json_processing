package ru.gp.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.Data;

@Data
public class CommonEntity {
    private Integer id;

    // @JsonProperty("name")
    @JsonAlias({"PersonName"})
    @JsonSetter("userName")
    private String name;
}
