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
    private final InvertorInteger invertorInteger2;

    private Integer in = 0b1100;
    private Integer grade = 4;


    @Scheduled(fixedRate = 1000)
    public void start() {
        invertorInteger.setGrade(grade);
        invertorInteger2.setGrade(grade);

        InInteger inInteger1 = new InInteger();
        InInteger inInteger2 = new InInteger();
        inInteger1.setIn(in);

        Integer invert = invertorInteger.make(inInteger1).translate();
        System.out.println("In: " + in + " Out: " + invert);
        inInteger2.setIn(invert);
        System.out.println("In: " + invert + " Out: " + invertorInteger.make(inInteger2).translate());
    }
}
