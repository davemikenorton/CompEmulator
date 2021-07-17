package com.cerelus.compemulator.circuits.wires;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Wire<T, L> {

    private L in;

    public T translate() {
        return (T) this.in;
    }
}
