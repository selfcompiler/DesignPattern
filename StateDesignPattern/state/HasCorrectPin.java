package DesignPatterns.StateDesignPattern.state;

import DesignPatterns.StateDesignPattern.ATMMachine;
import DesignPatterns.StateDesignPattern.ATMState;

/**
 * Created by rahul.sk on 28/08/16.
 */
public class HasCorrectPin implements ATMState {

    ATMMachine atmMachine;

    public HasCorrectPin(ATMMachine newATMState){
        atmMachine=newATMState;
    }
    @Override
    public void insertCard() {

    }

    @Override
    public void ejectCard() {

    }

    @Override
    public void insertPin(int pinEntered) {

    }

    @Override
    public void requestCash(int cashToWithdraw) {

    }
}
