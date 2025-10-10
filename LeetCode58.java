class Solution {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0) return 0;
        int n=s.length();
        String str="";
        boolean started = false;
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
               if (ch == ' ' && !started) {
                continue;
            }
            if (ch == ' ') {
                break;
            }
            else{
                str+=ch;
                started = true;
            }
        }
        return str.length();
    }
}
