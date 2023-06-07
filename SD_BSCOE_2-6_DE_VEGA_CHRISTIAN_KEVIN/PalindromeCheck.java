public class PalindromeCheck {

    public static void main(String[] args) {
    String original = "racecar";
    String reversed = "";

    String Char[] = original.split("");
    for(int i=0; i<Char.length/2;i++){
        String temp_start = Char[i];
        String temp_End = Char[Char.length-1-i];
        Char[i] = temp_End;
        Char[Char.length-1-i] = temp_start;    
    };  


    reversed = String.join("",Char);
    System.out.println("original: " + original);
    System.out.println("reversed: " + reversed);

    if (original.equals(reversed)){
        System.out.println("The word is a palindrome");
    }
    else{
        System.out.println("The word is not a palindrome");
    }
}
    
}

