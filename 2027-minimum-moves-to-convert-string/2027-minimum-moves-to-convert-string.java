class Solution {
    public int minimumMoves(String s) {
         int count = 0;
        
        for(int i = 0; i< s.length();i++){
            if (s.charAt(i) == 'X'){
                i+=2;
                count++;
            }
        }

         return count;
        
    }
}