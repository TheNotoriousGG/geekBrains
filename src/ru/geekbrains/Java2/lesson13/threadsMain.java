package ru.geekbrains.Java2.lesson13;

public class threadsMain {

    public static void main(String[] args) throws InterruptedException {

        long a = noMultithreading();
        long b = Multithreading();

        System.out.println("Время в одном потоке: "+a);
        System.out.println("Время в двух потоках: "+b);

    }

    public static long Multithreading() throws InterruptedException {

        final int size = 10000000;
        final int h = size / 2;
        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];

        for (int i = 0; i < size; i++) {
            arr[i] = 1f;
        }

        long dt1 = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Runnable r1 = () -> {
            for (int i = 0; i < a1.length; i++) {
                a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < a2.length; i++) {
                a2[i] = (float)(a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();

        t2.join();


        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);

        long dt2 = System.currentTimeMillis();


        return dt2 - dt1;
    }

    public static long noMultithreading() {
        final int size = 10000000;
        float[] arr = new float[size];

        for (int i = 0; i < size; i++) {
            arr[i] = 1f;
        }

        long dt1 = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        long dt2 = System.currentTimeMillis();

        return dt2 - dt1;
    }
}
