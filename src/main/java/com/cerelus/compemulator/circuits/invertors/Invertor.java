package com.cerelus.compemulator.circuits.invertors;

import com.cerelus.compemulator.circuits.wires.ins.In;
import com.cerelus.compemulator.circuits.wires.outs.Out;

public interface Invertor<T extends In, L extends Out> {
    L make(T in);
}
