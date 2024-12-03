// Subsets of String
public class Backtracking2 {

    public static void findSubSet (String str , String ans , int i){
        //Base Case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else{
                System.out.println(ans);
            }
            return;
        }
        //Recursion
        //Choice Yes
        findSubSet(str, ans+str.charAt(i), i+1);
        //Choice No
        findSubSet(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubSet(str,"",0);
    }
}