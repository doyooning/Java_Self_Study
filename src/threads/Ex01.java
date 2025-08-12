package threads;

public class Ex01 extends Thread {
    private String name;

    public Ex01(String nm) {
        name = nm;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "가 동작하고 있습니다.");
        }
    }
}

class Sample {
    public static void main(String[] args) {
        Ex01 ex01 = new Ex01("1호차");
        ex01.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main() 메서드 실행 중입니다.");
        }
    }
}
