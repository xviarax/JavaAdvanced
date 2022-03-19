package Exercises.ListyIter;

import java.util.List;

public class ListyIterator {

    private List<String> data; //данни за обхождане
    private int index; //текущ индекс

    public ListyIterator(List<String> data) {
        this.data = data;
        if (data.isEmpty()) {
            this.index = -16; //невалиден индекс
        } else {
            this.index = 0;
        }
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    //•	Move - should move an internal index position to the next index in the list,
    // the method should return true if it successfully moved and false if there is no next index.
    public boolean move() {
        if (hasNext()) {
            this.index++;
            return true;
        }
        return false;
    }

    //•	HasNext - should return true if there is a next index
    // and false if the index is already at the last element of the list.
    public boolean hasNext() {
        //false -> текущия индекс е последния
        //true -> ако текущия не ми е последен
        return this.index < this.data.size() - 1;
    }

    //•	Print - should print the element at the current internal index, calling Print on a collection without elements
    //should throw an appropriate exception with the message "Invalid Operation!".
    public void print() throws Exception {
        if (this.data.isEmpty()) {
            throw new Exception("Invalid Operation!");
        } else {
            System.out.println(this.data.get(this.index));
        }
    }


}