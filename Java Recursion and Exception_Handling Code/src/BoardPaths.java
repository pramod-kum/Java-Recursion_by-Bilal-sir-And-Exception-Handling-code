import java.util.ArrayList;

public class BoardPaths {
    public static void main(String[] args) {
        int start = 2;
        int end = 5;
        System.out.println(getBoardPath(start,end));
    }
    public static ArrayList<String>getBoardPath(int start, int end){
        //Base
        if(start==end){
            ArrayList<String>temp=new ArrayList<>();
            temp.add("");
            return temp;
        }
        if (start>end){
            ArrayList<String>temp=new ArrayList<>();
            return temp;
        }

        ArrayList<String>ans = new ArrayList<>();
        for(int dice=1; dice<=6;dice++){
            ArrayList<String> recursionResult = getBoardPath(start+dice,end);
            for (String val:recursionResult){
                ans.add(dice+val);
            }
        }
        return ans;
    }
}
