package tw.myweng.javaproject.leetcode;

public class StringToNum {

	public static void main(String[] args) {
		String str = "-@3.14";
        int sign = 1;
        int result =0;
        
        if (str.length()==0) {
        System.out.println("return 0.");
        }
        
        for (int i=0; i<str.length(); i++) {
            //skip sapce
        	System.out.println(str.charAt(i)+" isDigit: "+Character.isDigit(str.charAt(i)));
            if (str.charAt(i)==' ') continue;
            //check sign
            if (str.charAt(i)=='+') {
                sign = 1 ;
                continue;
            }
            if (str.charAt(i)=='-') {
                sign = -1 ;
                continue;
            }
            if (str.charAt(i)>='0' && str.charAt(i)<='9') {
            	int num = Integer.parseInt(str.substring(i,i+1));
//            	System.out.println("str.charAt(i):"+ (num+1));
//                System.out.printf("string[%d] = %d\n",i,str.charAt(i));
            	if (result>(Integer.MAX_VALUE-num)/10) System.out.println(Integer.MAX_VALUE+"overflow");
            	if (result<(Integer.MIN_VALUE+num)/10) System.out.println(Integer.MIN_VALUE+"overfolow");
                result = result*10 + num;
                System.out.println("result:"+ result);
            }
            
        }
        

	}

}
