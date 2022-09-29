import java.util.Scanner;

//Scanner 문자열 입력 받고 출력 next() => 띄어쓰기 단위로 , nextline() => 전체 문자열
/*public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String input2 = scanner.next();
        String input3 = scanner.next();
        String input4 = scanner.next();
        System.out.println(input);
        System.out.println(input2);
        System.out.println(input3);
        System.out.println(input4);
    }
}*/

public class Input {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String intInput = scanner.nextLine();
        try {
            int intValue = Integer.parseInt(intInput);
            System.out.println(intValue + 1);
        } catch (Exception e) {
            System.out.println("숫자를 입력해야 합니다.");
        }
    }
}
