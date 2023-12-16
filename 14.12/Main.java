package test.domain.domain;

public class Main {
    public static void main(String[] args) {
        class Test {
            private int a;
            private int b;

            public Test(int a, int b) {
                this.a = a;
                this.b = b;
            }

            public int sum() {
                return a + b;
            }
        }
        Test test = new Test(5, 6);
        System.out.println(test.sum());
    }
}
