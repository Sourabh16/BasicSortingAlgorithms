//Selection Sort --- pick the smallest put at the beginning

public class selectionSortCode {
    public static void selectionSort(int nums[]){
        for(int  i=0;i<nums.length-1;i++){
            int minPos = i;
            for(int j = i+1;j<nums.length;j++){
                if(nums[minPos] > nums[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp;
        }
    }
    public static void PrintNums(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,4,5};
        selectionSort(nums);
        PrintNums(nums);
    }
}
