 package Javapattren;
 import java.util.*;

import javax.swing.plaf.metal.MetalBorders.Flush3DBorder;
import javax.swing.text.html.StyleSheet;

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

//Print SubArrays Brute Force(Slower then prefix Array)   time complexcity=O(n3)
// public class array {

//     public static void subArray(int numbers[]){
//         int sum =0; int max = Integer.MIN_VALUE;


//         for(int i=0;i<numbers.length;i++){
//             int start = i;
//             for(int j=i;j<numbers.length;j++){
//                 int end = j;
//                 sum = 0;    
//             for(int k =start; k<=end;k++){
                
//             // System.out.print(numbers[k]+" ");
//             sum+=numbers[k];
//         }
//         System.out.println(sum);
//         if(max<sum){
//             max = sum;
//         }
//     }
//     // System.out.println("Sum is"+sum);
//     System.out.println();
// }
// System.out.print("Maximum Number is"+max);
// }
 
//      public static void main(String args[]){
//         int numbers [] ={2,4,6,8,10};
//         subArray(numbers);
//      }
// }


// max SubArray Sum (using Prifix Array for better performance) time complexcity = O(n2)
// public class array {

//     public static void maxSubPrefix(int number[]){
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[number.length];
        
//         // calculate Prefix array
//         prefix[0] = number[0];
//         for(int i=1; i<prefix.length;i++){
//             prefix[i] = prefix[i-1]+ number[i];
//         }


//         for(int i=0; i<number.length;i++){
//             int start = i;
//             for(int j=0;j<number.length;j++){
//                 int end =j;

//                 currSum = start== 0 ?prefix[end] : prefix[end] - prefix[start -1];

//                 if(maxSum < currSum){
//                     maxSum =currSum;
//                 }
//             }
//         }
//         System.out.println("Max Sum = " + maxSum);
//     }
     

//     public static void main(String args[]){
//         int number[] = {2,4,-6,10}; 
//         maxSubPrefix(number);
//     }
// }

//MaxSubArraySum (using Kadane's Algoritham) Time Complexcity = O(n)

// public class array{
//     public static void maxSubKadnes(int number[]){
//             int MaxSum = Integer.MIN_VALUE; int currSum = 0;
//         for(int i = 0; i< number.length;i++){
//               currSum = currSum + number[i];

//               if(currSum < 0){
//                 currSum = 0;
//               }
//               MaxSum = Math.max(currSum, MaxSum);
//         }
//         System.out.println("Our Max Subaarry sum is = "+ MaxSum);

//     }


//     public static void main(String args[]){
//         int number[] = {-2,-3,4,-1,-2,1,5,-3};
//         maxSubKadnes(number);
//     }
// }


// Trapping Rain WAter Question 

// public class array {
//     public static void trappingRainwater(int height[]){
      
//         // CAlculate left max boundary -helper array
//       int leftMax[] = new int [height.length];
//          leftMax [0] = height[0];
//          for( int i=1; i<height.length;i++){
//             leftMax[i] = Math.max(height[i], leftMax[i-1]);
//          }

//          //calculate Right Max boundary -helper array
//          int rightMax[] = new int [height.length];
//          rightMax[height.length-1] = height[height.length-1];
//           for(int i= height.length-2; i>=0; i-- ){
//             rightMax[i] = Math.max(height[i],rightMax[i+1]);
//           }
       
//           // Loop For measuring WaterLevel
//           int trappedWater = 0; 
//           for(int i=0;i<height.length;i++){
//             // WaterLevel = min(LeftMax , rightMAx)
//             int waterLevel = Math.min(leftMax[i],rightMax[i]);
//             //trapped water = waterLevel - heigth[i]
//             trappedWater += waterLevel - height[i]; 
//           }
//           System.out.println(trappedWater); 

//     }

//      public static void main(String args[]){
//         int height[] = {4,2,0,6,3,2,5};
//         trappingRainwater(height);
//      }
// }

// Buy And Sell Stock Code

// public class array {
//     public static int BuySellStock(int price[]){
//       int buyPrice = Integer.MAX_VALUE;
//       int maxProfit = 0;

//       for(int i=0; i<price.length;i++){
//           if(buyPrice <price[i]){
//             int profit = price[i] - buyPrice;
//              maxProfit = Math.max(maxProfit, profit);

//           }else{
//             buyPrice = price[i];
//           }
//       }
//         return maxProfit;

//     }
 


//   public static void main(String args[]){
//      int price[] = {7,1,5,3,6,4};
//       int profit =  BuySellStock(price);
//       System.out.println(profit);
//   }
// }

// Product Puzzle  time complexcity   (brute froce)
// public class array{
//   public static void main(String args[]){
//     int arr [] = {1,2,3,4,5}; 
    
//     int res [] = new int[arr.length];    
//     for(int i=0;i<arr.length;i++){
//           int product = 1;
//       for(int j=0; j<arr.length;j++){
//           if(j!=i){
//         product = product *arr[j];
//           }
//       }
//       res[i] = product;
//       System.out.print (res[i] +" ");
//     }
//   } 
// }

// Product Puzzle  time complexcity (using prefix suffix array) optimized code

// public class array {
//     public  int[] productPuzzle(int [] nums){
//         int n = nums.length;
//         int [] prefix = new int [n];
//         int [] suffix = new int [n];

//         prefix[0] = nums[0];
//         for(int i =1; i<n; i++){
//             prefix[i] = prefix[i-1] * nums[i];
//         }

//         suffix[n-1] = nums[n-1];
//         for(int i=n-2;i>=0;i--){
//             suffix[i] = suffix[i+1] *nums[i];
//         }
//         int []res = new int[n];
//         for(int i=1; i<n-1;i++){
//             res[i] = prefix[i-1] * suffix [i+1];
//         }

//         res[0] = suffix[1];
//         res[n-1] = prefix[n-2];
        
//         return res;
//     } 


//     public static void main (String args[]){
        
//          array s1 =  new array();
        
//         int [] nums = {1,2,3,4,5};

//         int [] res = s1.productPuzzle(nums);

//         for(int i=0 ; i<res.length;i++){
//             System.out.println(res[i]);
//         }

//     }
// }

//Binnary Search queation DSA Question 

// public class array{
//     public static int binnaeryquestion(int arr[],int key){
//         int n = arr.length;
//         int start =0;
//         int end = n-1;

//         while(start <= end){
//             int mid = (start + end)/2;
//             if(arr[mid] == key){
//                 return mid;
//             }
//             if(arr[mid] <=key){
//                 start = mid+1;
//             }else{
//                 end= mid-1;
//             } 
//         }
//         return -1;

        
//     }

//     public static void main(String args[]){
//         int arr [] = {5,11,14,19,30,35}; 
//         int key =14;

//         System.out.println(binnaeryquestion(arr, key));
//     }
// }


//Sorted roated array DSA Question 

public class array {
    public static int pivotArry(int arr[], int key){
        int  n = arr.length;
         int left = 0;
         int right = n-1;

         while(left<right){
            int mid = (left+right)/2;
            if(arr[mid] > arr[right]){
                left = mid+1;
            }else{
                right = mid;
            }    
        }
        int shift = right;
        System.out.println("kshdi"+shift);
         left =0;
         right = n-1;

        while (left<=right) {
               int  mid = (left + right)/2;
               int realmid = (mid+shift)%n;
               
               if(arr[realmid] == key){
                return realmid;
               }else if(arr[realmid]< key){
                 left = mid+1;
               }else{
                right = mid-1;
               }
        }
         return -1;
    }

    public static void main(String args[]){
        int arr [] = {2,4,5,6,7,0,1};
        int key = 0;

        int index = pivotArry(arr, key);
        System.out.println(index);
        
    }
}



// public class array {
//     public static boolean duplicate( int nums[]){
//     for(int i=0 ; i<nums.length-1; i++){
//         for(int j=i+1; j<nums.length; j++){
//             if(nums[i] == nums[j]){
//                 return true;
//             }
//         }
//     }
//     return false;
//     }
//     public static void main(String args[]){
//         int nums[] ={1,2,3};
//         System.out.println(duplicate( nums));
        
//     }
    
// }