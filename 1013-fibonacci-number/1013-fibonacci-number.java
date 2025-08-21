class Solution {
    Map<Integer,Integer> cache = new HashMap<>();
    //decorator pattern- no changes in the arguments 
    public int fib(int n) {
        //already computed
        if(cache.containsKey(n)) return cache.get(n); 
        int result;
        if(n==0 || n==1) result=n;

        else result= fib(n-1)+fib(n-2);
        cache.put(n, result);
        return result;
    }
}