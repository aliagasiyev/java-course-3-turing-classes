package az.edu.module02.dsa.leetcode;

public class Solution1 {
    public static boolean isPalindrome(int x) {
        int original =x;
        int reversed = 0;
        while(x>0){
            reversed = reversed*10 + x%10;

            x/=10;
        }

        return  original==reversed;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(321));
        System.out.println(isPalindrome(-321));

    }
}
