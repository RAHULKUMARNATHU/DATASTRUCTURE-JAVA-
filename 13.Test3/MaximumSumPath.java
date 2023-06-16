public class MaximumSumPath{
    public static long maximumSumPath(int arr1[] , int arr2[] ){
        long maxSum = 0 ;
        int m = arr1.length ;
        int n = arr2.length;
        int i = 0;
        int j = 0;
        int arr1Sum =0;
        int arr2Sum =0;
        while(i< m && j< n){           
            if(arr2[j]<arr1[i]){
            arr2Sum += arr2[j++];
           
            }
            else if(arr1[i]<arr2[j]){
                arr1Sum +=arr1[i];
                i++;
            }     
            else{
                maxSum += Math.max(arr1Sum, arr2Sum);
                arr1Sum =0 ;
                arr2Sum = 0;
                while(i<m && j<n && arr1[i] == arr2[j]){
                    maxSum = maxSum + arr1[i++];                    
                    j++;                    
                }

            }     
        }
        while (i < arr1.length ){
            arr1Sum +=arr1[i];
            i++;
        }

        while(j<arr2.length){
            arr2Sum +=arr2[j];
            j++;
        }
        maxSum += Math.max(arr1Sum, arr2Sum);

        return maxSum;
    }
    public static void main(String[] args) {
        // int  arr1[] = {1, 5, 10, 15, 20, 25};
        // int arr2 [] =  {2, 4, 5, 9, 15 };   

         int  arr1[] = {638973, 645291 ,675620, 816372, 1506908, 1967694, 2254043, 3372745 ,4391096 ,4664775 ,4969272 ,5136139 ,5284404 ,5290990 ,5738346 ,6647179 ,8530991 ,8561173 ,8740274 ,9924137 
};
        int arr2 [] =  {932401 ,1042418 ,1535844 ,1607325 ,1925530 ,2674334 ,3222671, 3637272 ,5103702, 6304131, 6318625 ,6570572, 6918600, 7566677, 7923001, 8211633, 8278595, 8588260, 9575465 ,9782926 
};   
        
        long ans = maximumSumPath(arr1 , arr2); 
        System.out.println(ans);    
    }
}