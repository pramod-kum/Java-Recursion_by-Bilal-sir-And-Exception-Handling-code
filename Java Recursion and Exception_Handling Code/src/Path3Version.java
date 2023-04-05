import java.util.ArrayList;

public class Path3Version {
    public static void main(String[] args) {
        int cr = 0, cc = 0;
        int er = 2, ec = 2;
        System.out.println(getmazePaths(cr, cc, er, ec));
    }

    public static ArrayList<String> getmazePaths(int cr, int cc, int er, int ec) {
        //Base
        if (cr == er && cc == er) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }
        //-Ve base case
        if (cr > er || cc > ec) {
            ArrayList<String> temp = new ArrayList<>();
            return temp;
        }
        //Horizontal
        int steps = 1;
        ArrayList<String> ans = new ArrayList<>();
        while (steps <= ec) {
            ArrayList<String> recursionResultHorizontal = getmazePaths(cr, cc + steps, er, ec);
            for (String val : recursionResultHorizontal) {
                ans.add("H" + steps + val);
            }
            steps++;
        }
        //Vertical
        steps = 1;
        while (steps <= er) {
            ArrayList<String> recursionResultVertical = getmazePaths(cr + steps, cc, er, ec);
            for (String val : recursionResultVertical) {
                ans.add("V" + steps + val);
            }
            steps++;
            // return ans;
        }

        steps = 1;
        while (steps<=ec && steps <=er){
            ArrayList<String> recursionResultDiagonal = getmazePaths(cr + steps, cc+ steps, er, ec);
            for (String val : recursionResultDiagonal) {
                ans.add("D" + steps + val);
            }
            steps++;
        }
        return ans;
    }
}

