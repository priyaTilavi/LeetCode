import java.util.HashMap;
import java.util.Map;

public class EasySet1 {

    public int mySqrt(int x) {
        if(x==1) return 1;
        for(long i=1;i<=x/2;i++){
//            if(i==46340){
//                System.out.println("here");
//            }
            if((i*i<=x) && ((i+1)*(i+1)>x)) {
                return (int)i;
            }
        }
        return 0;
    }

    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int write=nums1.length-1;
        int num2Pointer = n-1;
        int num1Pointer= nums1.length - n - 1;
        while (num1Pointer>=0 && num2Pointer>=0){
            if(nums1[num1Pointer]>nums2[num2Pointer]){
                nums1[write]= nums1[num1Pointer];
                num1Pointer--;
            }else {
                nums1[write]= nums2[num2Pointer];
                num2Pointer--;
            }
            write--;
        }
        if(num2Pointer>-1){
            for(int j=write;j>=0;j--){
                nums1[j]=nums2[num2Pointer];
                num2Pointer--;
            }
        }
        return nums1;
    }
//219. Contains Duplicate II
//Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that
// nums[i] == nums[j] and abs(i - j) <= k.
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])!=null) {
                min= Math.min(min,Math.abs(map.get(nums[i])-i));
            }
            map.put(nums[i],i);
        }
        return (min<=k);

    }
//231. Power of Two
    public boolean isPowerOfTwo(int n) {
        int temp=n;
        if(n==1) return true;
        while(temp!=1){
           if(temp%2!=0) return false;
           temp=temp/2;
        }
        return true;
    }



    public int fillMissingBrackets(String s) {

        if(s.length()%2!=0) return 0;
        int total=0;
        for(int i=2;i<=s.length()-2;i+=2){
            String sub1 = s.substring(0,i);
            String sub2 = s.substring(i,s.length());
            if(isBalanced(sub1) && isBalanced(sub2)) {
                total+=1;
            }
        }
        return total;
    }
    public  boolean isBalanced(String s){
        int countSquare=0;
        int countBracket=0;
        int countQuestion=0;
        char[] charArray= s.toCharArray();
        for(int i=0;i<s.length();i++){
            char c= charArray[i];
            if(c=='(') countBracket++;
            if(c=='[') countSquare++;
            if(c=='?') countQuestion++;
            if(c==')') countBracket--;
            if(c==']') countSquare--;
        }
        System.out.println("=>"+s+" "+countQuestion+" "+ countSquare +" " + countBracket);
        System.out.println((countQuestion - (countSquare + countBracket) == 0));
        return (countQuestion - (countSquare + countBracket) == 0);
    }
}
