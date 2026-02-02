class ZeroEvenOdd {
    private int n;
    
    Semaphore sZero = new Semaphore(1);
    Semaphore sEven = new Semaphore(0);
    Semaphore sOdd = new Semaphore(0);

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        //prints zero n times 
        for(int i=1;i<=n;i++){
            sZero.acquire();
            printNumber.accept(0);
            if(i%2==0) sEven.release();
            else sOdd.release();
        }
    }

    public void even(IntConsumer printNumber) throws InterruptedException {
        //prints next even number 
        for(int i=2;i<=n;i+=2){
            sEven.acquire();
            printNumber.accept(i);
            sZero.release();
        }
    }

    public void odd(IntConsumer printNumber) throws InterruptedException {
        //prints next odd number
        for(int i=1;i<=n;i+=2){
            sOdd.acquire();
            printNumber.accept(i);
            sZero.release();
        }
    }
}