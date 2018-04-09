package com.service.qwrqwrqwr.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestQwrqwrqwr {

        QwrqwrqwrDelegate qwrqwrqwrDelegate = new QwrqwrqwrDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = qwrqwrqwrDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}