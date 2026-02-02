class H2O {

    private Semaphore semO;
    private Semaphore semH;
    private Phaser phaser; //lets group of threeads wait for each other 

    // //multiple threads arrive at phaser

    public H2O() {
        semO = new Semaphore(1);
        semH = new Semaphore(2);
        phaser = new Phaser(3);
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
		
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        semH.acquire();
        releaseHydrogen.run();
        phaser.arriveAndAwaitAdvance(); //u wait for both H and O
        semH.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        semO.acquire();
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
		releaseOxygen.run();
        phaser.arriveAndAwaitAdvance(); //wait for both H's 
        semO.release();
    }
}