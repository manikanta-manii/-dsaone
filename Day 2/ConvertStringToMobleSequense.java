package dsaone;

public class ConvertStringToMobleSequense {
    public static void main(String[] args) {
        System.out.println(printSequence("GFG"));
    }
    static String printSequence(String S)
    {
        String[] arr={"0","2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ch==' '){
                sb.append("0");
            }
            else{
                int index=ch&31;
                sb.append(arr[index]);
            }
        }
        return new String(sb);
    }
}
