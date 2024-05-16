public class ReverseString_StringBuilder {
    public static void main(String[] args) {
        String str1="Malvika";
        StringBuilder str2= new StringBuilder(str1);
        str1= str2.reverse().toString();
        System.out.println(str1);
    }
}
