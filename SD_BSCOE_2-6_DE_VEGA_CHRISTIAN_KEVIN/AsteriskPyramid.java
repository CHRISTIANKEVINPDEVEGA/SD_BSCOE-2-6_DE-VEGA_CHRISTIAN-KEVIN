public class AsteriskPyramid {

    public static void main(String[]
    args ){
        for(int m=0;m<5;m++){
            System.out.println("");
            for(int z = 4; z > m ;z--){
                System.out.print(" ");
            }
            for(int n=0;n<=m;n++){
                System.out.print("*");
                System.out.print(" ");
            };
        };
    }

}
