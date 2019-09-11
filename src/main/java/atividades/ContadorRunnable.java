package atividades;

public class ContadorRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("#" + i + " from thread " + Thread.currentThread().getId());
        }
    }

}
