package practice;
//import experiments.incrementopr;

public class pracyic{
    public static void insert(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int prev=i-1;
            while (prev>=0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;             
            }
            arr[prev+1]=curr;
        }
    }

    public static int Max_min(int arr[]){
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest=arr[i];
                
            }
            if(smallest>arr[i]){
                smallest=arr[i];
            }
        }System.out.println("largest no:" + largest);
        return smallest;
    }
    public static boolean Palindrom(String str){
        int n=str.length();
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==str.charAt(n-1-i)){
                return true;
            }
        }
        return false;
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }   
    }

    public static float ShortestPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir = path.charAt(i);
            if(dir =='N'){
                y++;
            }
            else if(dir=='S'){
                y--;
            }
            else if(dir =='E'){
                x++;
            }
            else{
                x--;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }

    public static String compressed(String str){
        String newstr = "";
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr +=str.charAt(i);
            if(count>1){
                newstr +=count.toString();
            }
        }return newstr;
    }
    
    //recursion Start------>
    //Print Number In Decreasing Order
    public static void PrintDecrease(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n +" ");
        PrintDecrease(n-1);
    }


    //Print Number In Increasing Order
    public static void Printincrease(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        Printincrease(n-1);
        System.out.print(n +" ");
    }

    //Factorial Of n Number----->
    public static int Fact(int n){
        if(n==0){
            return 1;
        }
        //int fnm1=Fact(n-1);
        int fn = n* Fact(n-1);
        return fn;
    }

    //Sum Of n Number----->
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int sum1 = n + sum(n-1);
        return sum1;
    }

    //Fabnocii of n Number------>
    public static int Fab(int n){
        if(n==0 ||n==1){
            return n;
        }
        int f1 = Fab(n-1);
        int f2 = Fab(n-2);
        int fs = f1+f2;
        return fs;
    }

    //Check The Given Array Is Shorted-------->
    public static boolean IsSorted(int arr[] ,int i){
        if(i<arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return IsSorted(arr, i+1);
    }

   //WAP TO Find First Occurence-------->
    public static int FirstOccurence(int arr1[] , int i , int key){
        if(i==arr1.length){
            return -1;
        }
        if(arr1[i]==key){
            return i ;
        }return FirstOccurence(arr1, i+1, key);
    }

   //WAP To Find Last Occurence------->
    public static int LastOccurence(int arr2[] , int i, int key){
        if(i==arr2.length){
            return -1;
        }
        int found = LastOccurence(arr2, i+1, key);
        if(found ==-1 && arr2[i]==key){
            return i;
        }
        return found;
    }

    //Print Power Of Number------>
    public static int Power(int x, int n){
        if(n==0){
            return 1;
        }
        return x * Power(x, n-1);
    }

    //Tilling Problem------>
    public static int Tile(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fnm1 = Tile(n-1);
        int fnm2 = Tile(n-2);
        return fnm1 + fnm2;
    }

    public static int avrage(int a,int b, int c, int avg){
        int x = a+b+c;
        return x/avg;
    }

    public static boolean isEven(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isPalindrome(int a){
        int number = a;
        int reverse = 0;
        while(number !=0){
            int reminder =  number%10;
            reverse = reverse * 10 + reminder;
            number  = number /10;
        }
        if(reverse == a){
            return true;
        }
        return false;
    }

    public static void integersum(int number){ 
        int sum = 0;
        while(number !=0){
            
            int reminder = number % 10;
            sum +=reminder;
            number = number /10;
        }
        System.out.println(sum);
       
    }

    public static boolean repeat(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }return false;
    }

    public static int maxProfit(int arr[]){
        int  buy= arr[0];
        int  profit = 0;
        for (int i=1;i<arr.length;i++){
            if(buy<arr[i]){
                int count = arr[i]-buy;
                profit = Math.max(count,profit);
            }
            else{
                buy=arr[i];
            }
        }return profit;
    }

    


    public static void main (String args[]){
        //integersum(1010);
        // int arr[] = { 7, 1, 5, 3, 6, 4};
        // System.out.println(maxProfit(arr));
        int arr[]={1,2,3,6};
        System.out.println(repeat(arr));

        //System.out.println(isEven(2));
        
        //System.out.println(isPalindrome(123));
        //int arr[] = {7,2,4,3};
        //int target=9;
        //insert(arr);
        //printArr(arr);

        //System.out.println("smallest no:" +Max_min(arr));

        //String str = "racecar";
        //System.out.println(Palindrom(str));

        //String path ="WNEENESENNN";
        //System.out.println(ShortestPath(path));

        //String str = "aaabbcccccdddd";
        //System.out.println(compressed(str));

       //PrintDecrease(10);
       //Printincrease(10);

       //System.out.print(Fact(10));

       //System.out.println(sum(5));

      //    System.out.println(Fab(26));

      //    int arr[] = {3,3,6,8,9};
      //    System.out.println(IsSorted(arr, 0));

      //    int arr1[]={4,6,9,10,14,26};
      //    int key= 14;
      //    System.out.println(FirstOccurence(arr1, 0, key));

      //    int arr2[] = {1,3,4,6,7,8,3,9};
      //    int key1 = 3;
      //     System.out.println(LastOccurence(arr2, 0, key1));
       //System.out.println(Power(2, 10));

       //System.out.println(Tile(4));
        //    int a=10 , b=5, c=15;
        //    int avg = 3;
     //    System.out.println(avrage(a, b, c, avg));
    }
}