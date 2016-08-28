package DesignPatterns.StateDesignPattern;

/**
 * Created by rahul.sk on 28/08/16.
 */
public interface ATMState {
    void insertCard();
    void ejectCard();
    void insertPin(int pinEntered);
    void requestCash(int cashToWithdraw);
}
