import java.util.Arrays;


public class BucketSort {

    public static double[] bucketSort(double[] data) throws InterruptedException {

        int numberOfBuckets = data.length;
        double[][] buckets = new double[numberOfBuckets][];
        int[] bucketListIndices = new int[numberOfBuckets];

        for (int i = 0; i < data.length; i++) {
            int bucketIndex = (int) ((double) numberOfBuckets * data[i]);

            if (buckets[bucketIndex] == null) {
                buckets[bucketIndex] = new double[1];
            } else {
                // increase bucket size by 1 (maybe better redo with linked list)
                double[] bucket = buckets[bucketIndex];
                buckets[bucketIndex] = Arrays.copyOf(bucket, bucket.length + 1);
            }
            buckets[bucketIndex][bucketListIndices[i]++] = data[i];
        }

        double[] sortedData = new double[data.length];
        int nextIndex = 0;
        // sort all buckets with insertion sort and merge them into result.
        for (int bucketIndex = 0; bucketIndex < numberOfBuckets; bucketIndex++) {
            if (buckets[bucketIndex] != null) {
                int bucketLength = buckets[bucketIndex].length;
                System.arraycopy(sortedData, nextIndex,insertionSort(buckets[bucketIndex]), 0, bucketLength);
                nextIndex = nextIndex + bucketLength - 1;
            }
        }

        return sortedData;
    }



    public static double[] insertionSort(double[] data) throws InterruptedException {
        // run from second element to last
        for (int i = 1; i < data.length; i++) {
            double key = data[i];
            int j = i - 1;
            // take element and run back until smaller is found
            while (j >= 0 && data[j] > key) {

                data[j + 1] = data[j];
                j--;
                Thread.sleep(10);
            }
            // insert element in position after a smaller element
            data[j + 1] = key;
        }
        return data;
    }
}
