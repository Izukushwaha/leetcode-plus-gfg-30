class Solution {
    static boolean searchInSorted(int arr[], int k) {
        // Your code here
        int mid=arr.length/2;
        int l=0;
        int r=arr.length-1;
        while(l<=r){
            mid=(l+r)/2;
            if(arr[mid]==k){
                return true;
            }else if(arr[mid]>k){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return false;
        
        
        for(int i=0;i<arr.length; i++){
            if(arr[i]==k){
                return true;
           }
         }
         return false;
    }
}