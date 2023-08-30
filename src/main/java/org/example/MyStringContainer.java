package org.example;

import manifold.ext.rt.api.This;

public class MyStringContainer {
    String payload;

    public int plus(MyStringContainer that) {
        return this.payload.length() + that.getPayload().length();
    }

    public MyStringContainer(String payload) {
        this.payload = payload;
    }

    public String getPayload() {
        return payload;
    }
}
