package generic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericContainerTest {

    @Test
    void genericContainer(){
        GenericContainer<String> container = new GenericContainer<>();
        container.setObj("wanshuo");
        assertEquals("wanshuo", container.getObj());
    }

}