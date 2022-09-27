public class StringExample {
    public static void main(String[] args) {
        System.out.println("자바 공부를 시작해보자. \n \"자바스크립트\" 말고.");

        String roongz = "룽지는 귀엽습니다.";
        String dog = roongz.replaceAll("룽지는","강아지는");
        System.out.println(dog);

        String birthday = "1994/10/23";
        String year = birthday.substring(0,4);
        String month = birthday.substring(5,7);
        String day = birthday.substring(8);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}
//한줄 주석
/*
* ㅇㅇ
* ㅇㅇ
* 주석처리
* 하는중
 */
