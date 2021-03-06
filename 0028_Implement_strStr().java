// cheap solution
class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}

// iterative solution
class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j; // pointer to compare needle and haystack
            for(j = 0; j < needle.length(); j++) {
                if(needle.charAt(j) != haystack.charAt(i + j)) {
                    break;
                }
            }    
            
            if(j == needle.length()) return i;
        }
        
        return -1;
    }
}
