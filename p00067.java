public class p00067 {
    public static String addBinary(String a, String b) {
        if(a.equals("0")) return b;
        if(b.equals("0")) return a;
        String shorter = a.length()<=b.length()? a:b;
        String longer = b.equals(shorter)? a:b;
        if(a.length()!=b.length()){
            StringBuilder zeros = new StringBuilder();
            for(int i = 0; i < longer.length()-shorter.length();i++){
                zeros.append('0');
            }
            shorter = zeros.toString()+shorter;
        }
        
        StringBuilder sb = new StringBuilder();
        boolean carry = false;
        for(int i = longer.length()-1;i>=0;i--){
            if(longer.charAt(i)==shorter.charAt(i)){
                if(longer.charAt(i)=='1' && carry==true){
                    sb.append('1');
                } else if(longer.charAt(i) =='0'&& carry == true){
                    sb.append('1');
                    carry=false;
                } else if(longer.charAt(i) =='1'&& carry == false){
                    sb.append('0');
                    carry=true;
                } else{
                    sb.append('0');
                }
                
            } else if (longer.charAt(i) != shorter.charAt(i)){
                if(carry == true){
                    sb.append('0');
                } else{
                    sb.append('1');
                }
            }
        }
        if(carry == true) sb.append('1');
        return sb.reverse().toString();
        }
        
    

    public static void main(String[] args) {
        //2021
        // String a = "1010";
        // String b = "1011";

        //            100001010
        String a = "11111111";
        String b = "1011";
        //2222
        // String a = "1111";
        // String b = "1111";

        System.out.println(addBinary(a, b));
    }

}
