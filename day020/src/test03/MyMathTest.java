package test03;

import org.junit.Test;

public class MyMathTest {
    @Test
    public void testSum(){
        FunctionAdd fa = new FunctionAdd();
        fa.sum(5,6);
    }
}
