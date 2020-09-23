package com.Testing.Omar;

import org.junit.Test;

import static org.junit.Assert.AssertEquals;

public class PersonTest{

    @Test
    public void shouldReturnHelloWorld(){

        Person omar = new Person();
        assertEquals("Hello World", omar.helloWorld() );
    }
}
