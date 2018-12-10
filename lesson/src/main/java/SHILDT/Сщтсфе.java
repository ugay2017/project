package SHILDT;

public class Сщтсфе {

    public static void main(String[] args) {
        String s1 = "a    ";
        System.out.println(s1.trim()+"b");
        System.out.println(s1+"b");


        String sb = "AABAA";
        String s = "ABCDEF".replace("C", "**");

        String sb2 = sb.replace(sb, "##");
        System.out.println(s + " " + sb2); //AB**DEF and ##

        String fs = "123456789";
        char[] charSequence = fs.toCharArray();
        charSequence[3] = '$';
        String nStr = String.valueOf(charSequence);
        System.out.println(nStr); //123$56789

        StringBuilder str = new StringBuilder("AMIT"); //0-A, 1-M, 2-I, 3-T
        str.setCharAt(3, 'L');
        System.out.println(str);

        String fs1 ="123456789";
        String sub = fs1.subSequence(3,6).toString();
        String sub2=fs1.substring(3,6);
        System.out.println(sub2);
        System.out.println(sub);

    }
}
