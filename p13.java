public class p13 {
    public static int romanToInt(String s) {
        int sum = 0;
        for(int i = s.length()-1; i >= 0; i--){
            char c = s.charAt(i);
            int num = decode(c);
            if(i > 0 && ((c == 'X' && s.charAt(i-1)=='I') || (c == 'V' && s.charAt(i-1)=='I'))){
                sum+=num-1;
                i--;
            }
            else if(i > 0 && ((c == 'C' && s.charAt(i-1)=='X') || (c == 'L' && s.charAt(i-1)=='X'))){

                sum+=num-10;
                i--;
            }
            else if(i > 0 && ((c == 'M' && s.charAt(i-1)=='C') || (c == 'D' && s.charAt(i-1)=='C'))){
                sum+=num-100;
                i--;
            } else{
                sum+=num;
            }
        }
        return sum;
    }

    public static int decode(char c){
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        String input = "LVIII";
        System.out.println(romanToInt(input));
    }
}
