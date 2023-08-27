public class ReverseWordInAString {

    static String reverseWords(String s) {

        s = s.trim();
         int left = 0, right = s.length() - 1;
         String ans = "";
         String temp = "";
    
         while(left <= right) {
             char ch = s.charAt(left);
             if(ch != ' ')
             temp += ch;
             else if(ch == ' ') {
                 if(!ans.equals(""))
                 ans = temp.trim() + " " + ans.trim();
                 else 
                 ans = temp.trim();
                 temp = "";
             }
             left ++;
         }
    
         if(!temp.equals("")) {
             if(!ans.equals(""))
              ans = temp.trim() + " " + ans.trim();
             else 
              ans = temp.trim();
         }
         return ans;
            
        }


    public static void main(String[] args)
    {
        String s = "Sky is Blue";
     
        System.out.print(reverseWords(s) );
    }
    
    
}
