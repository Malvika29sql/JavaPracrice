public class ReverseStringCharArray {
    public static void main(String[] args) {
        String str4="Malvika";
        char [] char_str5= str4.toCharArray();
        int left=0;
        int right=char_str5.length-1;
        while(left<right){
            char temp=char_str5[left];
            char_str5[left]=char_str5[right];
            char_str5[right]= temp;
            left++;
            right--;
            String reverseStr = new String(char_str5);
            System.out.println("");
            System.out.println(reverseStr);
        }
    }
}
