package generic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericFunctionTest {

    @Test
    void findAllChilds() {
        GenericFunction genericFunction = new GenericFunction();
        System.out.println(genericFunction.findAllChilds("test"));
    }
}