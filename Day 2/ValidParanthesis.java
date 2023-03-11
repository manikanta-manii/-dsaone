package dsaone;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s="(";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isOpening(ch)){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else if(!isMatch(st.peek(),ch)){
                    return false;
                }
                else{
                    st.pop();
                }

            }

        }
        return st.isEmpty();
    }
    static boolean isOpening(char a){
        return a=='(' || a == '{' || a== '[';
    }
    static boolean isMatch(char a, char b){
        return a=='(' && b==')'||
                a=='{' && b=='}'||
                a=='[' && b==']';
    }
}