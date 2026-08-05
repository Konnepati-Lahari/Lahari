class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int size=1;size<=arr.length;size++){
            if(size%2!=0){
                for(int i=0;i<=arr.length-size;i++){
                    for(int j=i;j<size+i;j++){
                        sum+=arr[j];
                    }
                }
            }
        }
        return sum;
    }
}