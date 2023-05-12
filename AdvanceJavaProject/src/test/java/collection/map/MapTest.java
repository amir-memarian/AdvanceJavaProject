package collection.map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    @Test
    void Should_Have_Unique_Keys_and_can_have_duplicated_Values() {
        Map<String,String> geometrics = new HashMap<>();
        geometrics.put("Mosalas","red"); // duplicated value is allowed
        geometrics.put("Mostatil","Yellow");
        geometrics.put("SheshZelee","Sabz");
        geometrics.put("Moraba","red"); // duplicated value is allowed
        geometrics.put("Moraba","red"); // duplicated key is not allowed

        Set<Map.Entry<String, String>> entries = geometrics.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key is: "+key+" value is: "+value);
        }
    }

    @Test
    void Should_preserve_insertion_order() {
        Map<String,String> geometrics = new LinkedHashMap<>();
        geometrics.put("Mosalas","red");
        geometrics.put("Mostatil","Yellow");
        geometrics.put("SheshZelee","Sabz");
        geometrics.put("Moraba","red");

        Set<Map.Entry<String, String>> entries = geometrics.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key is: "+key+" value is: "+value);
        }
    }
}
