package ru.gp.dto;

import com.fasterxml.jackson.annotation.*;
import lombok.Data;

import java.util.LinkedHashMap;
import java.util.Map;

@Data
public class CommonEntity {
    private Integer id;

    // @JsonProperty("name")
    @JsonAlias({"PersonName"})
    @JsonSetter("userName")
    private String name;

    @JsonAnyGetter
    @JsonIgnore
    Map<String, Object> spec = new LinkedHashMap<>();

    @JsonAnySetter
    <T> void setDetail(String key, T value) {
        spec.put(key, value);
    }
}
