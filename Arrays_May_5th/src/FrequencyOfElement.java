//import java.util.Scanner;
//
//

class FrequencyOfElement {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
        //Array fr will store frequencies of element
        int [] fr = new int [arr.length];
        int visited = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    //To avoid counting same element again
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }

        //Displays the frequency of each element present in array
        System.out.println("---------------------------------------");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + fr[i]);
        }
        System.out.println("----------------------------------------");
    }
}


//class FrequencyOfElement {
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 2, 3, 1, 144, 2};
//
//        findFrequency(arr);
//    }
//
//    public static void findFrequency(int[] arr) {
//        // Create an empty integer array to store frequencies. Size matches the array length.
//        int[] frequency = new int[arr.length];
//
//        // Initialize all elements in the frequency array to 0 (no occurrences initially)
//        for (int i = 0; i < arr.length; i++) {
//            frequency[i] = 0;
//        }
//
//        // Count frequency of each element
//        for (int i = 0; i < arr.length; i++) {
//            int element = arr[i];
//            frequency[element]++; // Increment the frequency count at the element's index
//        }
//
//        // Print element and its frequency
//        for (int i = 0; i < arr.length; i++) {
//            if (frequency[i] > 0) {
//                System.out.println("Element " + arr[i] + " appears " + frequency[i] + " times.");
//            }
//        }
//    }
//}
//
//
//
////class FreaquencyOfElement
////{
////   public static void main(String[] args){
////       Scanner sc=new Scanner(System.in);
////       int n=sc.nextInt();
////       int[] array=new int[n];
////       for(int i=0;i<array.length;i++){
////           array[i]=sc.nextInt();
////       }
////       findOccurence(array);
////
////   }
////   public static void findOccurence(int[] arr){
////       int[] fr =new int[arr.length];
////       for(int i=0;i<arr.length;i++){
////           fr[i]=0;
////       }
////       for(int i=0;i<arr.length;i++){
////           fr[i]+=1;
////       }
////   }
////}