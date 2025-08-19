import java.util.Scanner;

public class MinLengthSubArray {
    static int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int mini = Integer.MIN_VALUE, left = 0;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];

            while(sum >= target){
                mini = Math.min(mini, right-left+1);
                sum -= nums[left];
                left++;
            }
        }
        return mini;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements: ");
        int elements = sc.nextInt();

        int[] arr = new int[elements];
        System.out.println("Enter the all elements: ");
        for(int i = 0; i < elements; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target: ");
        int target = sc.nextInt();

        int ans = minSubArrayLen(target, arr);
        System.out.println(ans);
    }

}
