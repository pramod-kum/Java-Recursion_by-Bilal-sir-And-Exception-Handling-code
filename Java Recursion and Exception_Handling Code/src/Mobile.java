import java.util.ArrayList;

public class Mobile {
    public static void main(String[] args) {
        String str = "123";
        System.out.println(getKPC(str));
    }

    public static ArrayList<String>getKPC(String str){
        //Base
        if(str.length()==0){
            ArrayList<String>temp = new ArrayList<>();
            temp.add("");
            return temp;
        }
        char ch=str.charAt(0);
        String remStr = str.substring(1);
        ArrayList<String> recursionResult = getKPC(remStr);
        ArrayList<String>ans = new ArrayList<>();
        String choice = getChoice(ch);
        for(String val:recursionResult){
            for (int i=0;i<choice.length();i++){
                String finall = choice.charAt(i)+val;
                ans.add(finall);
            }
        }
        return ans;
    }
    public static String getChoice(char key){
        if(key=='1'){
            return "abc";
        }
        else if (key=='2') {
            return "def";
        }
        else if (key=='3') {
            return "ghi";
        }
        else if (key=='4') {
            return "jkl";
        }
        else if (key=='5') {
            return "mno";
        }
        else if (key=='6') {
            return "pqr";
        }
        else if (key=='7') {
            return "stu";
        }
        else if (key=='8') {
            return "vwx";
        }
        else if (key=='9') {
            return "yz";
        }
        else if (key=='0') {
            return "_";
        }
        return "";
    }
}
