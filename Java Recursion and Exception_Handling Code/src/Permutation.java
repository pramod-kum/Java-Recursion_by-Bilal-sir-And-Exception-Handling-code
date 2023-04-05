import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String str="abc";
        System.out.println(PermutationFun(str));
    }
    public static ArrayList<String> PermutationFun(String str){
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

        ArrayList<String>RecursionResult=PermutationFun(remStr);
        ArrayList<String>ans=new ArrayList<>();
        for(String val:RecursionResult){
           for(int i=0;i<=val.length();i++){
               String finalStr=val.substring(0,i)+ch+val.substring(i);
               ans.add(finalStr);
           }
        }
        return ans;
    }
}
