public class Arrays {

    public static void main(String[] args) {
        
        int[] arr1 = {1,2,3};
        int[] arr2 = new int[3];
        int[] arr3 = new int[]{1,2,3};

        for (int i : arr1) {
            System.out.println(i);
            }
        
        for (int i : arr2) {
            System.out.println(i);
            }
        
        for (int i : arr3) {
        System.out.println(i);
        }

    }
    
}