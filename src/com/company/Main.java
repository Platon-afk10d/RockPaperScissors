package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main<number1> {

    private static Random scan;

    public static void main(String[] args) {

        play();


    }

    public static void play() {
        // String p1 = null;
        String p2 = null;
        System.out.println("hello");
        System.out.println("игрок#1 Ввести");
        Scanner in = new Scanner(System.in);

        String p1 = in.nextLine();
        System.out.println("игрок#1 выбрал " + p1);

        if (p1.equals("Камень")) {
            System.out.println("ну выбпрал камень");
                    if (p2.equals("Камень")) {
                System.out.println("ничья");
            }
            if (p2.equals("Ножницы")) {
                System.out.println("p1 победил");
            }
            if (p2.equals("Бумага")) {
                System.out.println("p1 Проиграл");
            }

                }


        if (p1.equals("Ножницы")) {
                System.out.println("p1 выбрал Ножницы");
                if (p2.equals("Камень")) {
                    System.out.println("выиграл");
                    if (p2.equals("Ножницы")) {
                        System.out.println("p1 ничья");
                        if (p2.equals("Бумага")) {
                            System.out.println("p1 Выиграл");
                        } else {
                            System.out.println("p1 не выбрал ножницы");
                        }
                    }
                        if (p1.equals("Бумага")) {
                            System.out.println("p1 выбрал Бумагу");
                            if (p2.equals("Камень")) {
                                System.out.println("выиграл");
                                if (p2.equals("Ножницы")) {
                                    System.out.println("p1 проиграл");
                                    if (p2.equals("Бумага")) {
                                        System.out.println("p1 Ничья");
                                    } else {
                                        System.out.println("p1 не выбрал Бумагу");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }





//       //String rock = "R";
//       // String paper = "P";
//       //String scissors = "s";
//
//
//        //int KW = 0;
//       // int KL = 0;
//        //int KT = 0;
//       // int KW1 = 0;
//       // int KL1 = 0;
//       // int KT1 = 0;
//       // if (p1 == rock) {
//            //if (p2 == paper) {
//                KL++;
//            }
//            if (p2 == scissors) {
//                KW++;
//                if (p2 == rock) {
//                    KT++;
//                }
//            }
//            if (p1 == paper) {
//                if (p2 == paper) {
//                    KT++;
//                }
//                if (p2 == rock) {
//                    KW++;
//                }
//                if (p2 == scissors) {
//                    KL++;
//                }
//                if (p1 == rock) {
//                    if (p2 == paper) {
//                        KL++;
//                    }
//                    if (p2 == rock) {
//                        KT++;
//                    }
//                    if (p2 == scissors) {
//                        KW++;
//                    }
//                }
//            }
//        }
//
//
//    }
//
//
//}
//
//
