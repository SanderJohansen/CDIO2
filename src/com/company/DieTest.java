package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class DieTest {

    Die DieTest = new Die();


    @org.junit.Test
    public void getFacevalue() {
        int i = DieTest.GetFacevalue();

        junit.framework.Assert.assertTrue(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i ==6);
    }
}