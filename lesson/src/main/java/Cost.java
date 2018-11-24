public class Cost {
    int a, b;

    Cost(int i, int j) {
        a=i;
        b=j;
    }

    boolean equals(Cost o) {
        if(o.a == a && o.b == b) {
            return true;
        }else {
            return false;
        }
    }

    static class PassOb {
        public static void main(String[] args) {
     Cost c1 = new Cost(100,22);
     Cost c2 = new Cost(100,22);
     Cost c3 = new Cost(10,2);

            System.out.println("c1 equals c2 "+c1.equals(c2));
            System.out.println("c1 == c2 "+ (c1 == c2));
            System.out.println("c1 == c3 "+c1.equals(c3));
            /*equals проверяет на равенство двух объектов*/

        }
    }

}
