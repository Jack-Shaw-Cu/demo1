package com.cdrundle.cdc.test;

import org.junit.Test;

public abstract class A {
    public abstract void get(int a, int b);

    @Test
    public void put(){
        get(1,2);
    }
}
