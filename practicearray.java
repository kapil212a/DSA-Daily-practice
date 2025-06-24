package practice;
public class practicearray {
    public static int trapWater(int height[]){
        int n = height.length;
        int leftmax[] = new int [n];
        leftmax[0] = height[0];
        for(int i=1;i<n;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }

        int rightmax[]= new int [n];
        rightmax[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        } 
        
        int water = 0;
        for(int i=0;i<height.length;i++){
            int trapwater = Math.min(rightmax[i],leftmax[i]);
            water +=trapwater - height[i];
        }
        return water;
        
    }


    public static void triplit(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                for(int k=0;k<arr.length;k++){
                    if(arr[i] + arr[j] + arr[k] ==0){
                       System.out.print(arr[i]);
                       System.out.print(arr[j]);
                       System.out.print(arr[k]+" ");
                    }
                }
            }
        }
    }

    //reverse Shorting algorithm---->

    public static void bubbleShort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }


    public static void selectionShort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]<arr[j])
                min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]<curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static int printNumber(int arr[][] ,int s){
        int row = arr.length;
        int col = arr[0].length;
        int count = 0;
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if (arr[i][j] == s){
                    count++;
                }
            }
        }return count;
    }

    public static int arraySum(int arr[][]){
        int col = arr[0].length;
        int sum  = 0;
        
        for(int j=0;j<col;j++){
            sum += arr[1][j];   
        }return sum; 
    }

    public static void transpose(int matrix[][]){
        int row = matrix.length;
        int col = matrix[0].length;
        int trans[][] = new int [3][3];
        for (int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                trans[j][i]= matrix[i][j];
            }
        }
        for (int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                System.out.print(trans[i][j]+ " ");
            }System.out.println();
        }
    }

    public static void main(String[] args) {

        
        // int matrix[][] =  { {1,4,9},{11,4,3},{2,2,3} };
        // transpose(matrix);
 
        // int arr[][] =  { {1,4,9},{11,4,3},{2,2,3} };
        // System.out.println(arraySum(arr));

        // int s = 7;
        // int arr [][]={{4,7,8},
        //               {8,8,7}};
        // System.out.println(printNumber(arr,s));

        //int arr[] = {3, 6, 2, 1,8, 7, 4, 5, 3, 1};
        //bubbleShort(arr);
        //selectionShort(arr);
        //insertionSort(arr);
        //for(int i=0;i<arr.length;i++){
        //    System.out.print(arr[i]+" ");
        //}

        //triplit(arr);
        // int height[]={0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        // System.out.println(trapWater(height));
    }
}
