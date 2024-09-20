import java.util.Scanner;
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int aLen = a.length();
        int bLen = b.length();
        int maxLen = Math.max(aLen, bLen);
        for (int i = 0; i < maxLen; i++) {
            int aBit = i < aLen ? a.charAt(aLen - 1 - i) - '0' : 0;
            int bBit = i < bLen ? b.charAt(bLen - 1 - i) - '0' : 0;
            int sum = aBit + bBit + carry;
            result.append(sum % 2);
            carry = sum / 2;
        }
        if (carry > 0) {
            result.append(carry);
        }
        return result.reverse().toString(); 
    }
}
public class Leet
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter num1 :");
         String a=sc.nextLine();
         System.out.print("\nEnter num2 :");
         String b=sc.nextLine();
         Solution s=new Solution();
         System.out.print("Ans : "+s.addBinary(a, b));
    }
}
