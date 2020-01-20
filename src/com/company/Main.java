package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Random scan;

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        int number = scan.nextInt();
        System.out.println("игрок1 Ввести"+ number);
String rock="R";
String paper="P";
String scissors="s";
String p1 = null;
String p2 = null;

int KW =0;
int KL = 0;
int KT = 0;

//
//        boolean rock2=true;
if (p1 == rock){
    if (p2==paper){
     KL++;
    }
    if (p2==scissors){KW++;
    if (p2==rock){KT++;
    }
}
    if (p1== paper){
        if (p2==paper){KT++;
        }
        if (p2==rock){KW ++;
        }
        if (p2==scissors){KL++;
        }
     if (p1== rock){
         if (p2==paper){KL++;
         }
         if (p2==rock){KT ++;
         }
         if (p2==scissors){KW++;
         }
     }
        }
    }


//boolean paper2=true;
       // if(paper2){
          //  KW=0+1;
        }
       // boolean skissors2 =true;
      //  if(skissors2){
         //   KW=0+1;
        }
       // System.out.println("KW");
// }
//}
