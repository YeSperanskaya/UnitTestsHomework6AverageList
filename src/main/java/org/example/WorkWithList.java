package org.example;

import java.util.List;

/*
a. Рассчитывает среднее значение каждого списка.
b. Сравнивает эти средние значения и выводит соответствующее сообщение:
- ""Первый список имеет большее среднее значение"", если среднее значение первого списка больше.
- ""Второй список имеет большее среднее значение"", если среднее значение второго списка больше.
- ""Средние значения равны"", если средние значения списков равны.
 */

public class WorkWithList {
    private List<Integer> list1;
    private List<Integer> list2;



    public WorkWithList(List<Integer> list1, List<Integer> list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public double getAverageValueList1() {
        return getAverageValue(this.list1);
    }
    public double getAverageValueList2() {
        return getAverageValue(this.list2);
    }

    private double getAverageValue(List <Integer> list)  {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = list.get(i) + sum;
        }
        return (double) (sum / list.size());
    }


    public String getMaxAverageValueFromTwoLists() {
        if (getAverageValueList1() > getAverageValueList2()) return "Первый список имеет большее среднее значение";
        if (getAverageValueList1() < getAverageValueList2()) return "Второй список имеет большее среднее значение";
        return "Средние значения равны";
    }

}
