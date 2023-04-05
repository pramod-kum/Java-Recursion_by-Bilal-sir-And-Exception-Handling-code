public class Hello {
    public static void main(String[] args) {
        int arr[]={10,12,15,10,12,10};
        int val=10;
        int vidx=0,size=0;
        int ans[]=indexFound(arr,vidx,val,size);
        for(int val1:ans){
            System.out.print(val1+" ");
        }
    }
    public static int[] indexFound(int arr[],int vidx,int val,int size){
        //base
        if(vidx==arr.length){
            return new int[size];
        }
        if(arr[vidx]==val){
            int[]ans=indexFound(arr,vidx+1,val,size+1);
            ans[size]=vidx;
            return ans;
        }else{
            int ans[]=indexFound(arr, vidx+1, val, size);
            return ans;
        }
    }
}
