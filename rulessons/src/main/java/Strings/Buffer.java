package Strings;

public class Buffer {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();

        String str = "ABC";
        str+="DEF";

        String str2 = "one".concat("two").concat("Three");

        stringBuffer.append("DDD").append("EEE");
        stringBuilder.append("FFF").append("GGGG");
        System.out.println(str+" "+str2+" "+stringBuffer.toString()+" "+stringBuilder.toString());

    String x ="523.45";
    Double xd = Double.valueOf(x);

        System.out.println(xd);
    }
}
