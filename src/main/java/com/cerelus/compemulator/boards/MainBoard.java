package com.cerelus.compemulator.boards;

import com.cerelus.compemulator.circuits.wires.ins.InInteger;
import com.cerelus.compemulator.circuits.invertors.InvertorInteger;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MainBoard {

    private final InvertorInteger invertorInteger;

    private Integer in = 0b1100;
    private Integer grade = 4;

    @Scheduled(fixedRate = 1000)
    public void start() {
        InInteger inInteger = new InInteger();
        inInteger.setIn(in);
        invertorInteger.setGrade(grade);
        System.out.println("In: " + in + " Out: " + invertorInteger.make(inInteger).translate());
    }
}
