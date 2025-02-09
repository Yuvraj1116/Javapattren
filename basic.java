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

// code is prime or not or also range in isPrime 

// import java.util.*;
// public class basic{

//   public static void primeRange( int n){

//     for(int i=2; i<=n; i++){
//       if(isPrime(i)){
//         System.out.println(i+"");
//       };
//     }
//     System.out.println();
//   }

//   public static boolean isPrime(int n){
//       boolean isPrime = true;
//     for(int i=2; i<=n-1;i++){
//         if(n%i==0){
//           isPrime = false;
//         }  
//     }
//       return isPrime;
//     } 

    
//   public static void main(String args[]){
//     Scanner sc = new Scanner(System.in);

//     System.out.print("Enter number to check isPrime or not :");
//     int n = sc.nextInt();
//     primeRange(n);
// }
// }


// Binary to Decimal Code 
//   public  class basic{
//   public static void BinaryToDecimal(int binNum){
//     int pow = 0; 
//     int decNum = 0;
//     int decimalNum = binNum;

//     while(binNum > 0){
//       int lastDigit  = binNum %10;
//         decNum = decNum+(lastDigit *(int)Math.pow(2, pow));
//         pow++;
//         binNum = binNum/10;

//     }
//     System.out.println(decNum);
//   }
//   public static void main(String args[]){
//       BinaryToDecimal(101);
//     }
// }


//DEcimal to Binary converstion

// public  class basic {
//   public static void DecimalToBinary(int n){
//        int pow = 0;
//        int binary = 0; 
//        while(n>0){
//         int rem =  n %2;
//         binary =  binary + rem* (int)Math.pow(10, pow);
//         pow ++;
//          n = n/2;
//        }
//        System.out.println(binary);
//       }

//       public static void main (String args[]){
//           DecimalToBinary(5);
//       }
// }


//HOLLOW RECTANGLE STAR PATTERN CODE 
// public class basic{

//   public static void hollow_Rectangle(int totRows, int totCols){
//   for(int i=1; i <=totRows; i++){
//       for(int j=1; j<=totCols; j++){
//         if(i ==1 || i== totRows || j == 1|| j == totCols){
//           System.out.print("*");
//         }else{
//           System.out.print(" ");
//         }
//       }
//       System.out.println();
//  }
//   }
//   public static void main (String args[]){
//     hollow_Rectangle(10, 10);
//   }

// }


//INVERTED & ROTATED HALF-PYRAMID WITH NUMBERS
 
public class basic {

  public static void Butterfly(int n){
      for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
          System.out.print(" ");
        }
        for(int j=1; j<=n; j++){ 
          System.out.print("*"+ " ");
        }
        System.out.println();
      }
  }

public static void main(String args[]){
  Butterfly(10);
} 

}
