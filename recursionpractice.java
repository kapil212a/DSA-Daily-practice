package practice;

public class recursionpractice {
    public static void occurance(int arr[], int key , int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.println(i+" ");
        }
        occurance(arr,key,i+1);
    }
    static String digits[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void convert(int num){
        if(num==0){
            return;
        }
        int last = num % 10;
        convert(num/10);
        System.out.print(digits[last]+" ");
    }

    public static void main(String[] args) {
        int num = 1947;
        convert(num);

        // int arr[] =  {3, 2, 4, 5, 6, 2, 7, 2, 2};
        //  int key = 2;
        // occurance(arr, key, 0);
    }
}
