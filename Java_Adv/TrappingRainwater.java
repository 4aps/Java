import java.util.Scanner;
import java.lang.Math;

public class TrappingRainwater {

    static int trap(int[] height){
        int n = height.length;
        int trapped = 0;
        int left = 0, right = n-1;
        int leftMax = 0, rightMax = 0;

        while (left < right){
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);

            if(leftMax < rightMax){
                trapped += leftMax - height[left++];
            }
            else{
                trapped += rightMax - height[right--];
            }
        }

        return trapped;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of towers: ");
        int towers = sc.nextInt();


        int[] arr = new int[towers];
        System.out.println("Enter the height of towers: ");
        for(int i = 0; i < towers; i++){
            arr[i] = sc.nextInt();
        }


        int ans = trap(arr);
        System.out.println(ans);
    }
}
