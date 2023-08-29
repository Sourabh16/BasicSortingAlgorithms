public class rev{
    public static void bubbleSort(int nums[]){
        for(int i=0;i<nums.length-1;i++){
            int swap = 0;
            for(int j=0;j<nums.length-i-1;j++){
                //swap
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swap++;
                }
                
            }
            if(swap==0){
                break;
            }
        }
    }
    public static void PrintNums(int nums[]){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }  
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5};
        bubbleSort(nums);
        PrintNums(nums);

    }
}