package DesignPatterns.ProxyPattern;

import DesignPatterns.StateDesignPattern.ATMMachine;
import DesignPatterns.StateDesignPattern.ATMState;

/**
 * Created by rahul.sk on 29/08/16.
 */
public class ATMProxy implements GetATMData {
    @Override
    public ATMState getATMData() {
        ATMMachine atmMachine=new ATMMachine();
        return atmMachine.getATMData();
    }

    @Override
    public int getCashInMachine() {
        ATMMachine realATMMachine=new ATMMachine();
        return realATMMachine.getCashInMachine();
    }
}
