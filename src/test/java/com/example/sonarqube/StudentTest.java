package com.example.sonarqube;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StudentTest {
    @Test
    public void shouldReturnFirstName() {
        var s = new Student();
        s.setFirstName("Jack");
        assertEquals(s.getFirstName(), "Jack");
    }

    @Test
    public void shouldReturnLastName() {
        var s = new Student();
        s.setLastName("Li");
        assertEquals(s.getLastName(), "Li");
    }
}
