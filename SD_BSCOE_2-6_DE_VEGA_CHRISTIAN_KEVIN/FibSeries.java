public class FibSeries {
    public static void main(String[]args){
    int n = 10;
    int t1 = 0, t2 = 1;

    System.out.println("First " + n + " terms:");
    
    int fib_array[] = new int[n+1];
    fib_array[0] = t1;
    fib_array[1] = t2;

    for(int i=2; i<=n;i++){
        int sum = t1 + t2;
        t1 = t2;
        t2 = sum;
        fib_array[i] = t2;
    }

    for(int arr_num: fib_array){
        System.out.print(arr_num + " ");
    }
}}


