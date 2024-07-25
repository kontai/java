package com.tai.GenericExam;

import org.junit.Test;

import java.time.Period;
import java.util.ArrayList;

/**
 * ClassName: AnimalTest
 * Package: com.tai.GenericExam
 * Description:
 *
 * @Author Kontai
 * @Create 2024/7/22 上午9:02
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        ArrayList<persianCat> cat1=new ArrayList<>();
        ArrayList<civetCat> cat2=new ArrayList<>();
        ArrayList<teddyDog> dog1=new ArrayList<>();
        ArrayList<huskyDog> dog2=new ArrayList<>();
        cat1.add(new persianCat("nick",20));

        keepPet(cat1);
        keepPet(cat2);
        keepPet(dog1);
        keepPet(dog2);
    }
//    public static void keepPet(ArrayList<? extends Cat> animal){
//    }
//    public static void keepPet(ArrayList<? extends Dog> animal){
//    }
public static void keepPet(ArrayList<? extends Animal> animal){
}

}
