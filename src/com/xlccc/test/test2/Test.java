package com.xlccc.test.test2;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void play(List<? extends Animal> list){
    }

    public static void main(String[] args) {
        List dogList = new ArrayList();
        dogList.add(new Dog());
        play(dogList);

        List animalList = new ArrayList();
        animalList.add(new Animal());
        play(animalList);

        update(dogList);
        update(animalList);

    }

    public static void update(List<? super Animal> list){
        

    }
}
