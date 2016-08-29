package DesignPatterns.ProxyPattern;

import DesignPatterns.StateDesignPattern.ATMState;

/**
 * Created by rahul.sk on 28/08/16.
 */
public interface GetATMData {
    public ATMState getATMData();
    public  int getCashInMachine();

}
