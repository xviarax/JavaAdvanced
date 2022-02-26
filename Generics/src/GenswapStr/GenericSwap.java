package GenswapStr;

import java.util.ArrayList;
import java.util.List;

public class GenericSwap <T extends Comparable<T>>{
    //характеристика: списък с елементи
    private List<T> elements;

    //конструктор
    public GenericSwap() {
        this.elements = new ArrayList<>();
    }

    //add
    public void add (T element) {
        this.elements.add(element);
    }

    //всеки един елемент -> тип : елемент
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (T element : elements) {
            builder.append(String.format("%s: %s",element.getClass().getName(), element)).append("\n");
        }
        return builder.toString();
    }

    //swap -> firstIndex, secondIndex
    public void swap (int firstIndex, int secondIndex) {
        //1. взема елементите на дадените индекси
        T firstIndexElement = this.elements.get(firstIndex);
        T secondIndexElement = this.elements.get(secondIndex);

        //първия индекс -> втория елемент
        //втория индекс -> първия елемент
        this.elements.set(firstIndex, secondIndexElement);
        this.elements.set(secondIndex, firstIndexElement);
    }



}
