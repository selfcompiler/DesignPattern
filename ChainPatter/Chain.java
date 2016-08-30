package DesignPatterns.ChainPattern;

import javafx.util.converter.NumberStringConverter;

/**
 * Created by rahul.sk on 30/08/16.
 */
public interface Chain {
    public void setNextChain(Chain nextChain);
    public void calculate(Numbers request);
}
