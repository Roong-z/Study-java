import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class price {
    public static void main(String[] args) {
        System.out.println("메뉴번호를 골라주세요.");
        System.out.println("1. 치킨");
        System.out.println("2. 회");
        System.out.println("3. 고양이사료");

        Scanner scanner = new Scanner(System.in);
        int menuNumber;

        try {
            menuNumber = scanner.nextInt();
        }
        catch (Exception e){
            menuNumber = -1;
        }

        switch (menuNumber){
            case 1:
                System.out.println("29000원");
                break;
            case 2:
                System.out.println("35000원");
                break;
            case 3:
                System.out.println("99000원");
                break;
            default:
                System.out.println("번호를 입력하거나 그런 음식은 존재하지 않는다.");
        }

    }
}
