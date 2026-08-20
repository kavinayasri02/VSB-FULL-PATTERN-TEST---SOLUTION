import java.util.Scanner;
public class SortColorsSelection {
    public static void sortColors(int[]nums){
        int n = nums.length;
        //selection sort oda logic
        for(int i = 0; i<n-1;i++){
            int minIdx = i;
            //min element find pana unsorted array la irundhu
            for(int j = i + 1;j<n;j++){
                if(nums[j] < nums[minIdx]){
                    minIdx = j;
                }
            }
                //swap the min element found with indx i
                int temp = nums[minIdx];
                nums[minIdx] = nums[i];
                nums[i] = temp;
            }
        }
        public static void main(String[]args){
            Scanner kavi = new Scanner(System.in);
            // array size vanga
            int n = kavi.nextInt();
            int[]nums = new int[n];
            //elements read pana
            for(int i =0;i<n;i++){
                nums[i]= kavi.nextInt();
            }
            //call selection sort method
            sortColors(nums);
            //print the sorted array
            for(int num : nums){
                System.out.print(num + " ");
            }
            System.out.println();
            kavi.close();
        }
    }
