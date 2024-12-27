package asbtract.controller;

import asbtract.model.BigFish;
import asbtract.model.CarpFish;
import asbtract.model.PerchFish;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BigFishManager<T> implements IGenericFishManager<T> {
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
                if (o1 instanceof BigFish && o2 instanceof BigFish) {
                    return Double.compare(((BigFish) o1).getPrice(), ((BigFish) o2).getPrice());

                }
                return 0;
                }
            });
    }

    @Override
    public double sumFish() {
        double sum = 0;
        int count = 0;
        for (T item : arrList) {
            if (item instanceof BigFish) {
                sum += ((BigFish) item).getPrice();
                count++;
            }
        }
        return sum;
    }

    @Override
    public double getAverageFish() {
        double sum = 0;
        int count = 0;
        for (T item : arrList) {
            if (item instanceof BigFish) {
                sum += ((BigFish) item).getPrice();
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }

    @Override
    public double getFishCarp() {
        double sum = 0;
        int count = 0;
        for (T item : arrList) {
            if (item instanceof CarpFish) {
                sum += ((BigFish) item).getPrice();
                count++;
            }
        }
        return sum;
    }

    @Override
    public double getFishPerch() {
        double sum = 0;
        int count = 0;
        for (T item : arrList) {
            if (item instanceof PerchFish) {
                sum += ((BigFish) item).getPrice();
                count++;

            }
        }
        return sum;
    }

    @Override
    public void showFish() {
        for (T item : arrList) {
            System.out.println(item);
        }

    }
}
