package com.cerelus.compemulator.circuits.invertors;

import com.cerelus.compemulator.circuits.wires.ins.InLogic;
import com.cerelus.compemulator.circuits.wires.outs.OutLogic;
import org.springframework.stereotype.Component;

@Component
public class InvertorLogic implements Invertor<InLogic, OutLogic> {

    @Override
    public OutLogic make(InLogic in) {
        OutLogic outLogic = new OutLogic();
        outLogic.setIn(!in.translate());
        return outLogic;
    }
}
