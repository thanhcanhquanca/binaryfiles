package controller;

import model.BigFish;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BigFishManager<T> implements IGenericFishManager<T>{
    List<T> arrList = new ArrayList<>();


    @Override
    public List<T> getFish() {
        return arrList;
    }

    @Override
    public void addFish(T item) {
        arrList.add(item);
    }

    @Override
    public void removeFish(String id, T fish) {
        for (int i = 0; i < arrList.size(); i++) {
            if (arrList.get(i) instanceof BigFish && ((BigFish) arrList.get(i)).getId().equals(id)) {
                arrList.remove(i);
            }


        }
    }

    @Override
    public void updateFish(String id, T fish) {
        boolean found = false;
        for (int i = 0; i < arrList.size() ; i++) {
            if (arrList.get(i) instanceof BigFish && ((BigFish) arrList.get(i)).getId().equals(id)) {
                arrList.set(i, fish);
                found = true;
            }
        }
        if (!found){
            System.out.println("khong tim thay");
        }

    }

    @Override
    public void sort() {
            arrList.sort(new Comparator<T>() {
                @Override
                public int compare(T o1, T o2) {

                }
            });
    }

    @Override
    public double sumFish() {
        return 0;
    }

    @Override
    public double getAverageFish() {
        return 0;
    }

    @Override
    public double getFishCarp() {
        return 0;
    }

    @Override
    public double getFishPerch() {
        return 0;
    }

    @Override
    public void showFish() {

    }
}
