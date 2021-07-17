package com.cerelus.compemulator.circuits.invertors;

import com.cerelus.compemulator.circuits.wires.ins.InInteger;
import com.cerelus.compemulator.circuits.wires.outs.OutInteger;
import lombok.Setter;
import org.springframework.stereotype.Component;

import static com.cerelus.compemulator.utils.Util.*;


@Component
@Setter
public class InvertorInteger implements Invertor<InInteger, OutInteger> {

    private Integer grade;

    @Override
    public OutInteger make(InInteger in) {
        OutInteger outInteger = new OutInteger();
        outInteger.setIn(in.translate());

        outInteger.setIn(setBinaryDigitsFromRank(invertRank(getBinaryRank(in.translate(), grade), grade), grade));

        return outInteger;
    }
}
