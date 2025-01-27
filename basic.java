package Javapattren;
// import java.util.*;

// public class basic {
//     public static void main(String args[]){

        
//         Scanner sc = new Scanner(System.in);
//              int a =10;
//              int b =5;
             
//             System.out.println("add = "+(a+b)); 
//             System.out.println("difference ="+(a-b)); 
//             System.out.println("Multliply ="+(a*b)); 
//             System.out.println("divide ="+(a/b)); 
//             System.out.println("Modulo ="+(a%b)); 

//     }
// }

// Leap Year Code
// import java.util.*;

// public class basic{
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter the year");
//         int year = sc.nextInt();

//         boolean x = (year %4 == 0);
//         boolean y = (year %100 != 0);
//         boolean z = (year %100 == 0) && (year % 400 == 0);

//         if(x&&(y||z)){
//             System.out.println(year+ "is a leap year");
//         }else{
//             System.out.println(year +"is not a leap year");
//         }
        
//     }
// }


//Prime number code baar baar bhulta hai sala bokachoda 


// import java.util.*;

// public class basic{
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);
//             System.out.print("Enter the number:");
//             int n = sc.nextInt();

//             boolean isPrime = true;

//             for(int i =2; i<=Math.sqrt(n);i++){
//                 if(n%i == 0){
//                     isPrime =false;
//                 }
//             }
//             if(isPrime == true){
//                 System.out.println("n is prime");
//             }else{
//                 System.out.println("n is not prime");
//             }

    
// }
// }

import java.util.*;
public class basic{

  public static int hello(){
    System.out.println("Hello Word");
    System.out.println("Hello Word");
    System.out.println("Hello Word");
    return 0;
  }

  public static int multiply(int a , int b){
        int product = a*b;
      return product;
  }
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
      int a =3;
      int b=5;
   int product = multiply(a,b);
   System.out.println(product);
            
}
}