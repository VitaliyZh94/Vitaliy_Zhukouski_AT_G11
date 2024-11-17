package homework.day5.stringTask;

import homework.day3.basetask.Bee;
import homework.day6.GenericMethodsInGenericClassT;

public class Task4 {

    public static void printIP(String log) {

        String[] string = log.replaceAll("access_log\\.\\d{4}\\.\\d{2}\\.\\d{2}", "").split("\\s");

        String[] ids = new String[string.length];

//        for (int i = 0, j = 0; i < string.length; i++) {
//
//            if (string[i].matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}")) {
//                if(string[i] )
//                ids[j] = string[i];
//                j++;
//            }
//        }
//
//        for (String a : ids) {
//            System.out.println(a);
//        }
    }

    public static void main(String[] args) {
//        printIP("access_log.2020.09.07 212.168.101.5 granted\n" +
//                "access_log.2020.09.07 212.168.101.6 denied\n" +
//                "access_log.2020.09.07 212.168.101.6 denied\n" +
//                "access_log.2020.09.07 212.168.122.6 denied");


    }
}
