class H2O {

    private Semaphore semO;
    private Semaphore semH;
    private Phaser phaser; //lets group of threeads wait for each other 

    // //multiple threads arrive at phaser

    public H2O() {
        semH = new Semaphore(2);
        semO = new Semaphore(1);
    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {

        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        try {
            semH.acquire(1);
            releaseHydrogen.run();
            semO.release(1);
        } catch (InterruptedException e) {
        }
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {

        try {
            semO.acquire(2);
            // releaseOxygen.run() outputs "O". Do not change or remove this line.
            releaseOxygen.run();
            semH.release(2);
        } catch (InterruptedException e) {
        }
    }
}