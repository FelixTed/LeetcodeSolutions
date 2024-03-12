class Solution {
    public int minimumMoves(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);

        int count = 0;

        //NOTE: this does not convert the string correctly, but 
        // works great for our purpose of getting the minimum number of moves possible
        //With minimum runtime
        for(int i = 0; i< s.length();i++){
            if (s.charAt(i) == 'X'){
                stringBuilder.replace(i,i+3,"OOO");
                i+=2;
                count++;
            }
        }

         return count;
        
    }
}