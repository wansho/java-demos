package thinkinjava.chapter15generic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenericMethodsTest {

    @Test
    void func() {
        GenericMethods gm = new GenericMethods();
        gm.func("ss");
        gm.func(1);
        gm.func(new Integer(19));
        gm.func(gm);
    }
}