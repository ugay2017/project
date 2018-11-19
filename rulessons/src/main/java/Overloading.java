public class Overloading {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    void test(int a) {
        System.out.println("a: "+ a);
    }

    void test(int a, int b) {
        System.out.println("a and b"+a+" " + b );
    }

    double test(double a) {
        System.out.println("double a: "+a);
        return a*a;
    }
}

class OverLoad {
    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        double result;

        overloading.test();
        overloading.test(10);
        overloading.test(10,20);
        result = overloading.test(123.45);
        System.out.println("результат вызова ob.test(123.25): "+result);

    int nums[] = {1,2,3,4,5,6};

    for(int num : nums) {
        System.out.println(num);
    }

    for(int i =0 ;i<nums.length; i++) {
        System.out.println(nums[i]);
    }
    }
}
