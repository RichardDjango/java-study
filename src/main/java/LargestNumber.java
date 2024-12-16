public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = {20,340,19,97,28,55};
        int largestNumber =  arr[0];

        for(int i=0;i<arr.length;i++){
            if(largestNumber < arr[i]){
                largestNumber = arr[i];
            }
        }
        System.out.println("The largest number is: " + largestNumber);

    }
}
