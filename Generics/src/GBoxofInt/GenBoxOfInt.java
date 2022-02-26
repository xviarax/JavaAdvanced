package GBoxofInt;

import java.util.ArrayList;
import java.util.List;

public class GenBoxOfInt <T extends Comparable<T>> {
    private List<T> elements;
    public void add (T element) {
        this.elements.add(element);
    }
    //всеки един елемент -> тип : елемент//конструктор
        public GenBoxOfInt() {
            this.elements = new ArrayList<>();
        }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T element : elements) {
            builder.append(String.format("%s: %s",element.getClass().getName(), element)).append("\n");
        }
        return builder.toString();
    }


}
