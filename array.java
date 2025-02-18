 package Javapattren;
 import java.util.*;

//  Array

// public class array {
//     public static void main(String args[]){
//         int marks [] = new int [50];

//         Scanner sc = new Scanner(System.in);

//         marks[0] = sc.nextInt(); 
//         marks[1] = sc.nextInt(); 
//         marks[2] = sc.nextInt();
//         System.out.println("Math :"+ marks[0]);
//         System.out.println("Computer :"+marks[1]);
//         System.out.println("Physics :"+marks[2]); 
        
//     }
// }

// Linear Search 


// public class array {

//     public static void linearSearch(String Menu[],String userWant){
        
//         for(int i=0;i<Menu.length;i++){
//             if(Menu[i] == userWant){
//                 System.out.println(i);
//                 return;        
//             } 
//         }
//         System.out.println("Not Avilabe");
//     }
  
//      public static void main(String args[]){
//       String Menu [] ={"dosa","Masala dosa", "Chaomin","chat","fulki"};     
//       String userWant = "Samosa";

//       linearSearch(Menu, userWant);
    
     
// }
// }


// Largest in Array

// public class array{

//     public static int largestnum(int num[]){
//         int max = 0;
//         for(int i=0; i<num.length;i++){
//             if(max<num[i]){
//                  max= num[i]; 
//             }
//         }
//         return max;
//     }
//     public static void main(String args[]){
//         int num[] = {1,5,6,8,3,2,14};
//         System.out.println("Largest value is "+ largestnum(num));
//     }
// }

//Binary Search 

// public class array{
//     public static int binarySearch(int numbers[],int key){
//         int start = 0, end= numbers.length-1;
//         while(start<=end){
//             int mid = (start+end)/2;
//             System.out.println(mid);
            
//             if(numbers[mid]==key){ //found
//                 return mid;
//             }
//             if(numbers[mid]<=key){   // right side in array
//                 start = mid+1;
//             }else{ // left
//                 end = mid-1;
//             }
//         }
//         return -1;
//     }


//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10,12,14,16};
//         int key = 10;

//         System.out.println("Index for key is :"+binarySearch(numbers, key));
//     }
// }

// Reverse an Array

// public class array{
//     public static void reverseArray(int numbers[]){
//         int first = 0; int last = numbers.length-1;
        
//         while(first < last){
        
        
//             int temp = numbers[last];
//             numbers[last] =  numbers[first];
//             numbers[first] =temp;
            

//             first++;
//             last--;


//         }
//     }

// public static void main(String args[]){
//     int numbers[] = {2,4,6,8};

//     reverseArray(numbers);

//     for(int i=0;i<numbers.length;i++){
//         System.out.print(numbers[i]+" ");
//     }
//     System.out.println();

// }

// } 

// Pair Array 
// public class array {
//     public static void pairArray(int numbers[]){
//         int tp =0;
//         for(int i=0; i<numbers.length;i++){
//                 int curr = numbers[i];
//             for(int j=i+1;j<numbers.length;j++){
//                 System.out.print("("+curr+","+numbers[j]+")");
//                 tp ++;
//             }
//             System.out.println();
//         }
//         System.out.println("Total Pairs = " + tp);
//     }


//  public static void main(String args[]){
//     int numbers[] = {2,4,6,8,10};

//     pairArray(numbers);

//  }

// }

//Print SubArrays

public class array {

    public static void subArray(int numbers[]){
        int sum =0; int max = Integer.MIN_VALUE;


        for(int i=0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                sum = 0;    
            for(int k =start; k<=end;k++){
                
            // System.out.print(numbers[k]+" ");
            sum+=numbers[k];
        }
        System.out.println(sum);
        if(max<sum){
            max = sum;
        }
    }
    // System.out.println("Sum is"+sum);
    System.out.println();
}
System.out.print("Maximum Number is"+max);
}
 
     public static void main(String args[]){
        int numbers [] ={2,4,6,8,10};
        subArray(numbers);
     }
}

