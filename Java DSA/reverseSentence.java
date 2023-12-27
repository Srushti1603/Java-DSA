public class reverseSentence {
    public static void main(String[] args) {
        String str = "I am an web developer";
        String ans ="";
        StringBuilder sb = new StringBuilder("");

        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch!=' ')
            {
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans = ans +sb;
                ans = ans + " ";
                sb = new StringBuilder(""); 
            }
        }
        sb.reverse();
        ans=ans+sb;
        System.out.println(ans);
    }
}
