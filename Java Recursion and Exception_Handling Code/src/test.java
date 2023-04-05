public class test {
    public static void main(String[] args) {
        int x=0;
        int y=1;
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<n;j++){
                int z=x+y;
                int x=y;
                y=z;
                System.out.print(z);
            }
            System.out.println();
        }
    }
}
