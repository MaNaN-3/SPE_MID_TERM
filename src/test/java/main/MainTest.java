package main;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    @Test
    public void power() {
        int expectedAnswer = 32;
        int base = 2;
        int power = 5;
        int answer = Main.power(2, 5);
        Assert.assertEquals(answer, expectedAnswer);
    }

    @Test
    public void nCr() {
        int expectedAnswer = 10;
        int n = 5;
        int r = 2;
        int answer = Main.nCr(n, r);
        Assert.assertEquals(answer, expectedAnswer);
    }

    @Test
    public void gcd() {
        int expectedAnswer = 5;
        int a = 10;
        int b = 15;
        int answer = Main.gcd(a, b);
        Assert.assertEquals(answer, expectedAnswer);
    }
}