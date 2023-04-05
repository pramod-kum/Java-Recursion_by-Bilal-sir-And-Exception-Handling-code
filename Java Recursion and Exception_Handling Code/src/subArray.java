import java.util.ArrayList;

public class subArray {
    public static void main(String[] args) {
        String str="abc";
        System.out.println(subSequence(str));
    }
    public static ArrayList<String> subSequence(String str){
        //Base
        if(str.length()==0){
            ArrayList<String>temp=new ArrayList<>();
            temp.add("");
            return temp;
        }
        char ch=str.charAt(0);
        //System.out.println(ch);
        String remStr=str.substring(1);
       // System.out.println(remStr);

        ArrayList<String>RecursionResult=subSequence(remStr);
        ArrayList<String>ans=new ArrayList<>();
        for(String val:RecursionResult){
            ans.add(val);
            ans.add(ch+val);
        }
        return ans;
    }
}
