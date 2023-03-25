import javax.management.monitor.StringMonitor;
;import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String... args) {


        String word = "  I like java !!!";
        System.out.println(word.charAt(word.length() - 1));
        System.out.println(word.startsWith("I like"));
        System.out.println(word.contains("java"));
        System.out.println(word.replace("a", "o"));
        System.out.println(word.substring(9, 13).toUpperCase());
        System.out.println(word.substring(9, 13).toLowerCase());
        System.out.println(word.length());
        System.out.println(word.trim());
    }
}
//  ответ;       !
//                false
//        true
//        I like jovo !!!
//                JAVA
//        java
//        17
//        I like java !!!

//------------------------------------------------------------------------------------------


        //--------------------------------------------------------------------------
//        method(new int[]{18, 19, 22}, "Aidai", "Dilnaz", "Dasha");
//
//    }  // кайбай турган метод тузунуз 2 массив 1 осу инт 2чиси стринг
//      // методдун ичине сан и имя беребиз
//
//    static void method(int[] age, String... names) {
//        for (int i = 0; i < age.length; i++) {
//            System.out.println(names[i] + " " + age[i] + " лет ");

////---------------------------------------------------------------------------------

//    String a = "Malina";
////  System.out.println(a.endsWith("na")); Возвращает boolean значение. Проверяет наличие вами данной строки в конце
////        System.out.println(a.startsWith("Mal")); Тоже возвращает boolean значение. Проверяет наличие данной вами строки в начале
//        System.out.println(a.indexOf('a')); // Возвращает индекс вам данного символа
//                }
//        static void varargs(String...varargs){
//        for(String vararg:varargs){
//        System.out.print(vararg+" ");
//        }
//
//        System.out.println();
//        for(int i=2;i<varargs.length;i++){
//        System.out.print(varargs[i]+" ");
//        }
////---------------------------------------------------------------------------------------
//        Scanner scanner = new Scanner(System.in);
//        metthod("aksana");
//    }
//    static void metthod(String word) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("coз бериниз");
//        String s = scanner.nextLine();
//        System.out.println(word.toUpperCase());
//        System.out.print("Cиз берген соз туура" + "/");
//        System.out.println(word.contains("aksana"));
//        if (word.contains("aksana")) {
//            System.out.println(word.substring(5));
//        } else {
//            System.out.println("Jok");
//        }
//    }
//}

//-------------------------------------------------------------------------------------------------------
//      method();
//
//    }
//    static void method (){
//        String[] n = {"Диана","Адилет","Айка"};
//
//
//        for (String s : n) {
//            System.out.println("прям молодец "+s);
//        }
//    }
//        //-----------------------------------------------------------------------------------------
//    static int varargs(int... a) {
//        int a1 = 0;
//        for (int i = 0; i < a.length; i++) {
//            a1 += a[i];
//
//
//        }
//        return a1;
//    }

