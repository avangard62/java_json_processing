package ru.gp;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.testng.annotations.Test;
import ru.gp.dto.CommonEntity;

import java.net.URL;

public class JsonDtoTest {
    @SneakyThrows
    @Test
    void testReadAndWriteAliasPropertyInJson() {
        ObjectMapper om = new ObjectMapper();
        URL resource = getClass().getClassLoader().getResource("example.json");
        CommonEntity entity = om.readValue(resource, CommonEntity.class);
        System.out.println("toString: " + entity);
        System.out.println("Serialized: " + om.writeValueAsString(entity));
    }
}
