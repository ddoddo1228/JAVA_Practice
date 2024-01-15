import java.util.Scanner;

class Phone {
    private String name, tel;

    public Phone(String name, String tel) {
        this.name = name;
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }
}

public class Java_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("인원수:");
        int n = sc.nextInt();
        Phone[] Array = new Phone[n];

        for (int i = 0; i < n; i++) {
            System.out.print("이름과 전화번호:");
            Array[i] = new Phone(sc.next(), sc.next());
        }

        System.out.println("저장되었습니다...");

        while (true) {
            System.out.print("\n검색할 이름 (exit로 종료): ");
            String yourname = sc.next();

            if (yourname.equals("exit")) {
                System.out.print("프로그램을 종료합니다...");
                break;
            }

            boolean found = false;

            for (int i = 0; i < n; i++) {
                if (yourname.equals(Array[i].getName())) {
                    System.out.println(Array[i].getName() + "의 번호는 = " + Array[i].getTel() + " 입니다.");
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println(yourname + "의 번호를 찾을 수 없습니다.");
            }
        }
        sc.close();
    }
}
