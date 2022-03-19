package StackIteratorrr;

import java.util.List;

public class Stackche {
    private List<String> data;
    private int index; //текущ индекс
    public Stackche(List<String> data) {
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

    public boolean hasNext() {
        //false -> текущия индекс е последния
        //true -> ако текущия не ми е последен
        return this.index < this.data.size() - 1;
    }


    public void push() {

        System.out.println(this.data.get(this.index));

    }
    public void pop() {

            System.out.println(this.data.get(this.index));

    }




}
