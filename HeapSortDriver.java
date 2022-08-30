public class HeapSortDriver {
    public static void main(String[] args) {
        Integer[] arr = {1,10,8,3,6};

        HeapSort<Integer> sort = new HeapSort<Integer>();

        sort.heapSort2(arr);

        System.out.println("\n\nSORTED ARRAY");
        for (Integer integer : arr) {
            System.out.println(integer);
        }
    }
}
