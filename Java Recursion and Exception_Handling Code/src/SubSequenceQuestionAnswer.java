public class SubSequenceQuestionAnswer {
    public static void main(String[] args) {
        String str="abc";
        subSequence(str,"");
    }
    public static void subSequence(String ques, String ans){

        //Base
        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }
        char ch = ques.charAt(0);
        String remainingStr = ques.substring(1);
        subSequence(remainingStr,ans+ch);
        subSequence(remainingStr,ans);
    }
}
