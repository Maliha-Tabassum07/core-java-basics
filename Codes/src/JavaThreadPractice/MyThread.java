package JavaThreadPractice;

public class MyThread implements Runnable{
    int threadNum;
    public  MyThread(int i){
        this.threadNum=i;
    }

    @Override
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println("Thread Number: "+threadNum+ "Thread Value: "+i);
        }
    }
}
