import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Main {

    public static int fibonacci(int n) throws InterruptedException {
        Thread.sleep(10);
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) throws IOException, InterruptedException {

        MergeSort mergeSort = new MergeSort();
        BucketSort bucketSort = new BucketSort();

        BufferedWriter mergeSortOut = new BufferedWriter(new FileWriter("mergeSortTime.txt"));
        BufferedWriter bucketSortOut = new BufferedWriter(new FileWriter("bucketSortTime.txt"));
        BufferedWriter fibonacciOut = new BufferedWriter(new FileWriter("fibonacciSortTime.txt"));

        int array5[] = new int[5];
        int array10[] = new int[10];
        int array30[] = new int[30];
        int array50[] = new int[50];
        int array100[] = new int[100];
        int array200[] = new int[200];
        int array500[] = new int[500];
        int array700[] = new int[700];
        int array850[] = new int[850];
        int array1000[] = new int[1000];
//generating fibonacci numbers recursively
        for (int i=0; i<15; i++){
            long startTime = System.currentTimeMillis();
            fibonacci(i);
            long endTime = System.currentTimeMillis();
            long operationTime = endTime - startTime;
            fibonacciOut.write(operationTime+"\n");
            fibonacciOut.newLine ();


        }

        for (int i=0; i<array5.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array5[i] = randomNumber;
        }

        for (int i=0; i<array10.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array10[i] = randomNumber;

        }

        for (int i=0; i<array30.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array30[i] = randomNumber;

        }

        for (int i=0; i<array50.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array50[i] = randomNumber;

        }

        for (int i=0; i<array100.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array100[i] = randomNumber;

        }

        for (int i=0; i<array200.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array200[i] = randomNumber;

        }


        for (int i=0; i<array500.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array500[i] = randomNumber;

        }

        for (int i=0; i<array700.length; i++){

            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array700[i] = randomNumber;
        }

        for (int i=0; i<array850.length; i++){

            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array850[i] = randomNumber;
        }

        for (int i=0; i<array1000.length; i++){
            Random random = new Random();
            int randomNumber = random.nextInt(1000000 - 5000) + 5000;
            array1000[i] = randomNumber;

        }

        long startTime = System.currentTimeMillis();
        mergeSort.mergeSort(array5);
        long endTime = System.currentTimeMillis();
        long operationTime = endTime - startTime;
        mergeSortOut.write(operationTime+"\n");
        mergeSortOut.newLine ();

        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(array10);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        mergeSortOut.write(operationTime+"\n");
        mergeSortOut.newLine ();

        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(array30);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        mergeSortOut.write(operationTime+"\n");
        mergeSortOut.newLine ();

        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(array50);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        mergeSortOut.write(operationTime+"\n");
        mergeSortOut.newLine ();

        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(array100);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        mergeSortOut.write(operationTime+"\n");
        mergeSortOut.newLine ();

        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(array200);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        mergeSortOut.write(operationTime+"\n");
        mergeSortOut.newLine ();

        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(array500);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        mergeSortOut.write(operationTime+"\n");
        mergeSortOut.newLine ();

        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(array700);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        mergeSortOut.write(operationTime+"\n");
        mergeSortOut.newLine ();

        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(array850);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        mergeSortOut.write(operationTime+"\n");
        mergeSortOut.newLine ();

        startTime = System.currentTimeMillis();
        mergeSort.mergeSort(array1000);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        mergeSortOut.write(operationTime+"\n");
        mergeSortOut.newLine ();

        double doubleArray5[] = new double[5];
        double doubleArray10[] = new double[10];
        double doubleArray30[] = new double[30];
        double doubleArray50[] = new double[50];
        double doubleArray100[] = new double[100];
        double doubleArray200[] = new double[200];
        double doubleArray500[] = new double[500];
        double doubleArray700[] = new double[700];
        double doubleArray850[] = new double[850];
        double doubleArray1000[] = new double[1000];


        for (int i=0; i<array5.length; i++){
            Random random = new Random();
            double randomNumber = random.nextDouble();
            doubleArray5[i] = randomNumber;
        }

        for (int i=0; i<array10.length; i++){
            Random random = new Random();
            double randomNumber = random.nextDouble();
            doubleArray10[i] = randomNumber;

        }

        for (int i=0; i<array30.length; i++){
            Random random = new Random();
            double randomNumber = random.nextDouble();
            doubleArray30[i] = randomNumber;

        }

        for (int i=0; i<array50.length; i++){
            Random random = new Random();
            double randomNumber = random.nextDouble();
            doubleArray50[i] = randomNumber;

        }

        for (int i=0; i<array100.length; i++){
            Random random = new Random();
            double randomNumber = random.nextDouble();
            doubleArray100[i] = randomNumber;

        }

        for (int i=0; i<array200.length; i++){
            Random random = new Random();
            double randomNumber = random.nextDouble();
            doubleArray200[i] = randomNumber;

        }


        for (int i=0; i<array500.length; i++){
            Random random = new Random();
            double randomNumber = random.nextDouble();
            doubleArray500[i] = randomNumber;

        }

        for (int i=0; i<array700.length; i++){

            Random random = new Random();
            double randomNumber = random.nextDouble();
            doubleArray700[i] = randomNumber;
        }

        for (int i=0; i<array850.length; i++){

            Random random = new Random();
            double randomNumber = random.nextDouble();
            doubleArray850[i] = randomNumber;
        }

        for (int i=0; i<array1000.length; i++){
            Random random = new Random();
            double randomNumber = random.nextDouble();
            doubleArray1000[i] = randomNumber;

        }

        startTime = System.currentTimeMillis();
        bucketSort.bucketSort(doubleArray5);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bucketSortOut.write(operationTime+"\n");
        bucketSortOut.newLine ();



        startTime = System.currentTimeMillis();
        bucketSort.bucketSort(doubleArray10);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bucketSortOut.write(operationTime+"\n");
        bucketSortOut.newLine ();

        startTime = System.currentTimeMillis();
        bucketSort.bucketSort(doubleArray30);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bucketSortOut.write(operationTime+"\n");
        bucketSortOut.newLine ();


        startTime = System.currentTimeMillis();
        bucketSort.bucketSort(doubleArray50);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bucketSortOut.write(operationTime+"\n");
        bucketSortOut.newLine ();


        startTime = System.currentTimeMillis();
        bucketSort.bucketSort(doubleArray100);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bucketSortOut.write(operationTime+"\n");
        bucketSortOut.newLine ();


        startTime = System.currentTimeMillis();
        bucketSort.bucketSort(doubleArray200);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bucketSortOut.write(operationTime+"\n");
        bucketSortOut.newLine ();

        startTime = System.currentTimeMillis();
        bucketSort.bucketSort(doubleArray500);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bucketSortOut.write(operationTime+"\n");
        bucketSortOut.newLine ();


        startTime = System.currentTimeMillis();
        bucketSort.bucketSort(doubleArray700);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bucketSortOut.write(operationTime+"\n");
        bucketSortOut.newLine ();


        startTime = System.currentTimeMillis();
        bucketSort.bucketSort(doubleArray850);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bucketSortOut.write(operationTime+"\n");
        bucketSortOut.newLine ();


        startTime = System.currentTimeMillis();
        bucketSort.bucketSort(doubleArray1000);
        endTime = System.currentTimeMillis();
        operationTime = endTime - startTime;
        bucketSortOut.write(operationTime+"\n");
        bucketSortOut.newLine ();

        fibonacciOut.close();
        mergeSortOut.close();
        bucketSortOut.close();



    }
}
