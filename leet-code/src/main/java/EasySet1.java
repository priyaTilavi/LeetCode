public class EasySet1 {

    public int mySqrt(int x) {
        if(x==1) return 1;
        for(long i=1;i<=x/2;i++){
            if(i==46340){
                System.out.println("here");
            }
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
}
