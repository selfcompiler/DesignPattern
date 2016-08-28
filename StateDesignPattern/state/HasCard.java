package DesignPatterns.StateDesignPattern.state;

import DesignPatterns.StateDesignPattern.ATMMachine;
import DesignPatterns.StateDesignPattern.ATMState;

/**
 * Created by rahul.sk on 28/08/16.
 */
public class HasCard implements ATMState {

    ATMMachine atmMachine;

    public HasCard(ATMMachine newATMState){
        atmMachine=newATMState;
    }

    @Override
    public void insertCard() {

        System.out.println("You can only insert one card at a time");


    }

    @Override
    public void ejectCard() {
        System.out.println("Your card is ejected");
        atmMachine.setATMState(atmMachine.getNoCardState());

    }

    @Override
    public void insertPin(int pinEntered) {
        if(pinEntered == 1234) {
            System.out.println("You entered the correct PIN");
            atmMachine.correctPinEntered = true;
            atmMachine.setATMState(atmMachine.getHasPin());
        }
        else{
            System.out.println("You entered the wrong PIN");
            atmMachine.correctPinEntered = false;
            System.out.println("Your card is ejected");
            atmMachine.setATMState(atmMachine.getNoCardState());
        }

    }

    @Override
    public void requestCash(int cashToWithdraw) {

        System.out.println("You have not entered your PIN");

    }
}
