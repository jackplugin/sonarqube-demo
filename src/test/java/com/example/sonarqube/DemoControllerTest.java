package com.example.sonarqube;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoControllerTest {
    @Test
    public void getFirstName_Should_Return_Jack() {
        DemoController dc = new DemoController();
        assertEquals(dc.getFirstName(), "Jack");
    }

    @Test
    public void getLastName_Should_return_Li() {
        DemoController dc = new DemoController();
        assertEquals(dc.getLastName(),"Li");
    }

    @Test
    public void call_doSomething_should_return_correct_result() {
        DemoController dc = new DemoController();
        assertEquals(dc.doSomething(),"do some thing");
    }

    @Test
    public void call_getStudentName_should_return_correct_result() {
        DemoController dc = new DemoController();
        assertEquals(dc.getStudentName(),"Jack");
    }

    @Test
    public void call_executeSomeLogic_should_return_correct_result() {
        DemoController dc = new DemoController();
        assertEquals(dc.executeSomeLogic(),"do some logic");
    }
}
