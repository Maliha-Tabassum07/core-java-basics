package JavaThreadPractice;

public class MyThreadMain {
    public static void main(String[] args) {
        for(int i=0;i<6;i++){
            MyThread threadObj=new MyThread(i);
            Thread myThread=new Thread(threadObj);
            myThread.run();
            myThread.start();
        }
    }
}
