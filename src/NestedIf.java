public class NestedIf {
    public static void main(String[] args) {
        int age = 25;

//        if (age >= 10){
//            if(age <20){
//                System.out.println("10대");
        /*
        * && 둘중 모두 true일때, || 하나라도 true 일떄
        * */
        if(age >= 10 || age <20){
            System.out.println("뭐여");
            }else {
                System.out.println("10대아님");
            }
        }
    }

