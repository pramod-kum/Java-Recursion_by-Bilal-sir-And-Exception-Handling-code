public class PermutationQA {
    public static void main(String[] args) {
        permutationsByQA("abc","");
    }
    public static void permutationsByQA(String ques,String ans){
        //Base
        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }


        for(int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            String remainingStr = ques.substring(0,i)+ques.substring(i+1);
            permutationsByQA(remainingStr,ans+ch);
        }
    }
}
