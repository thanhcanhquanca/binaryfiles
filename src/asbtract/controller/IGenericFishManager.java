package asbtract.controller;

import java.util.List;

public interface IGenericFishManager<T>{
    List<T> getFish();
    void addFish(T item);
    void removeFish(String id ,T fish);
    void updateFish(String id ,T fish);
    void sort();
    double sumFish();
    double getAverageFish();
    double getFishCarp();
    double getFishPerch();
    void showFish();
}
