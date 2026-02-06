class Solution {
    private boolean binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
        int mid = start + (end-start)/2 ;
        if(arr[mid]==target) return true;
        if(arr[mid]<target) start = mid+1;
        else end = mid-1;
        }
        return false;
    }
    public int[] recoverOrder(int[] order, int[] friends) {
        //we simply need to order friends 
        int n = friends.length;
        int[] res = new int[n];
        int i = 0;
        for(int o:order){
            if(binarySearch(friends,o)==true) res[i++] = o;
        }
        return res;
    }
}