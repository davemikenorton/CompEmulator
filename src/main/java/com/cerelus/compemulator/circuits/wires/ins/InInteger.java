package com.cerelus.compemulator.circuits.wires.ins;

public class InInteger extends In<Integer, Integer> {
    @Override
    public Integer translate() {
        return getIn();
    }
}
