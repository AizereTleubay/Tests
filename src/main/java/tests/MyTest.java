package tests;

import org.junit.Test;

public class MyTest {
    Action a = new Action();

    @Test
    public void myTest() {
        a.logIn();
        a.productsBinding();
        a.logOut();
    }
}
