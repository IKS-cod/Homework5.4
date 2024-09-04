package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Билет 3");
//Напишите код, с помощью которого можно разделить строку на части.
//
//Код должен работать для строк любого размера и любого содержания. Размер частей вы устанавливаете самостоятельно.
        String string ="Я, делаю домашнюю работу";
        String stringNew = string.trim();
        String[]words=stringNew.split(" ");
        System.out.println(Arrays.toString(words));




    }
}