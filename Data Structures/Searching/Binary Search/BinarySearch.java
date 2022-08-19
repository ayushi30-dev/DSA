class BinarySearch {

    public static void main(String[] args){
        int arr[]= new int[]{-1,0,3,5,9,12};
        int target = 2;
        int index=BinarySearch.search(arr,target);
        System.out.println("Element "+target+" found at index "+index);
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int last = nums.length-1;

        while(start<=last){
            //find the middle element
            int mid = start+(last-start)/2;
            if(target<nums[mid]){//if target < middle element,then target                                      exists in left side of the array
                last=mid-1;
            }
            else if(target>nums[mid]){//if target > middle element,then target                                      exists in right side of the array
                start=mid+1;
            }
            else{
                return mid; //element found,return index
            }
        }
        return -1; //if start>end,then execution of while loop exits and element not found in the array.
    }
}