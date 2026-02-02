class FooBar {
    private int n;
    Semaphore sFoo = new Semaphore(1); //set initial semaphore values for each 
    Semaphore sBar = new Semaphore(0);
    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
        	// printFoo.run() outputs "foo". Do not change or remove this line.
            sFoo.acquire();
        	printFoo.run(); //c.s
            sBar.release(); //signal Bar
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {
        
        for (int i = 0; i < n; i++) {
            
            // printBar.run() outputs "bar". Do not change or remove this line.
        	sBar.acquire(); 
            printBar.run(); //critical section
            sFoo.release(); //increment Foo
        }
    }
}