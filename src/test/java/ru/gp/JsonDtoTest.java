package ru.gp;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.gp.dto.CommonEntity;

import java.net.URL;
import java.util.Map;

public class JsonDtoTest {
    @SneakyThrows
    @Test
    void testReadAndWriteAliasPropertyInJson() {
        ObjectMapper om = new ObjectMapper();
        URL resource = getClass().getClassLoader().getResource("example.json");
        CommonEntity entity = om.readValue(resource, CommonEntity.class);
        System.out.println("toString: " + entity);
        String jsonOut = om.writeValueAsString(entity);
        System.out.println("Serialized: " + jsonOut);
        Assert.assertEquals(jsonOut, "{\"id\":18,\"userName\":\"AnoNimus777\",\"specKey3\":456.7,\"extraKey\":\"undefined_val\"}");
        Assert.assertEquals(entity.getSpec().get("extraKey"), "undefined_val");
    }

    @SneakyThrows
    @Test
    void testParseVaryingKeysInJson() {
        ObjectMapper om = new ObjectMapper();
        URL resource = getClass().getClassLoader().getResource("example-2.json");
        CommonEntity entity = om.readValue(resource, CommonEntity.class);
        System.out.println("toString: " + entity);
        String jsonOut = om.writeValueAsString(entity);
        System.out.println("Serialized: " + jsonOut);
        Assert.assertTrue(entity.getSpec().get("SuperPuperKey17") instanceof Map);
    }
}
