package CommandPattern.qstack;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class QStack<T> {

    private List<T> dataCollection;

    public QStack(){

        dataCollection=new LinkedList<>();
    }

    public void push(T item){
        dataCollection.add(0,item);
    }

    public Optional<T> pop(){
        if(dataCollection.size()>0){

            return Optional.of(dataCollection.remove(dataCollection.size()-1));
        }
        return Optional.empty();
    }

    public void clear(){
        dataCollection.clear();
    }
}
