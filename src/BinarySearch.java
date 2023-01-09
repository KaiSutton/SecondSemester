public class BinarySearch {

    public static int iterativeBinarySearch(int [] arr, int target){
        //set up for the split with pointers
        int leftPointer = 0;
        int rightpointer = arr.length-1;

        //as long as we have data left to search
        while (leftPointer <= rightpointer){
            //find the middle index
            int mid = (leftPointer + rightpointer)/2;
            //if the middle index contains the target
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid]> target){
                //left half
                rightpointer = mid -1;
            }

            if (arr[mid]< target){
                // right half
                leftPointer = mid+1;
            }
        }

        return -1;

    }


    public static int recursiveBinarySearch(int [] arr, int target, int left, int right){

        int mid = (left + right)/2;

        if (left> right){
            return -1;
        }else {
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid]> target){
                //left half
                return recursiveBinarySearch(arr, target, left, mid-1);
            }

            if (arr[mid] < target){
                return recursiveBinarySearch(arr, target, mid+1, right);
            }
        }

        return -1;
    }

    public static int gradeBinarySearch(int [] arr, int target){
        //set up for the split with pointers
        int leftPointer = 0;
        int rightpointer = arr.length-1;

        //as long as we have data left to search
        while (leftPointer <= rightpointer){
            //find the middle index
            int mid = (leftPointer + rightpointer)/2;
            //if the middle index contains the target
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid]> target){
                //left half
                rightpointer = mid -1;
            }

            if (arr[mid]< target){
                // right half
                leftPointer = mid+1;
            }
        }

        return -1;

    }


}
