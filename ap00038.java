public class ap00038 {
    public static String countAndSay(int n) {
        if(n == 1) return "1";
        return recur("1", n-1);
    }

    public static String recur(String in,int n){
        if(n ==0) return in;
        StringBuilder sb = new StringBuilder();
        char re = in.charAt(0);
        int cnt=0;
        for(int i = 0; i < in.length();i++){
            if(in.charAt(i)==re){
                cnt++;
                continue;
            } 
                sb.append(Integer.toString(cnt));
                sb.append(re);
                cnt=1;
                re=in.charAt(i);
            
        }
        sb.append(Integer.toString(cnt));
        sb.append(re);

        return recur(sb.toString(),n-1);
    }

    public static void main(String[] args) {
        // System.out.println(countAndSay(4));
        
    }
}
