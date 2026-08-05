class Solution {
    public int largestAltitude(int[] gain) {
        int value=0;
        int mac=0;
        for(int g:gain){
            value+=g;
            mac=Math.max(mac,value);
        }
        return mac;
    }
}