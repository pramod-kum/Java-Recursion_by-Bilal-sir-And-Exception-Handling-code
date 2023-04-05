import java.util.ArrayList;

public class Path {
    public static void main(String[] args) {
        int cr=0,cc=0;
        int er = 2, ec = 2;
        System.out.println(getmazePaths(cr,cc,er,ec));
    }
    public static ArrayList<String>getmazePaths(int cr,int cc,int er,int ec){
        //Base
        if(cr == er && cc == er){
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }
        //-Ve base case
        if (cr > er || cc > ec){
            ArrayList<String> temp = new ArrayList<>();
            return temp;
        }
        //Horizontal
        ArrayList<String> ans = new ArrayList<>();
        ArrayList<String>recursionResultHorizontal = getmazePaths(cr,cc+1,er,ec);
        for (String val:recursionResultHorizontal){
            ans.add("H"+val);
        }
        //Vertical
        ArrayList<String>recursionResultVertical= getmazePaths(cr+1,cc,er,ec);
        for (String val:recursionResultVertical){
            ans.add("V"+val);
        }
        return ans;
    }
}
