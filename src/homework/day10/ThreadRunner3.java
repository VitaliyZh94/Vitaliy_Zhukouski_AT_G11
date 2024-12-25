//package homework.day10;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ThreadRunner3 {
//
//    public static void main(String[] args) {
//
//        List<Mouse> mouseList = getMouseList();
//
//        Object lock = new Object();
//
//        List<Thread> threads = new ArrayList<>();
//
//        for (int i = 0; i < 5; i++) {
//            threads.add(new Thread(() -> {
//                mouseList.getFirst().peep();
//                mouseList.removeFirst();
//            }));
//        }
//
//        for (Thread thread : threads) {
//            thread.start();
//        }
//
//        while (!mouseList.isEmpty()) {
//            for (int i = 0; i < threads.size(); i++) {
//                synchronized (lock) {
//                    threads.get(i).run();
//                    try {
//                        threads.get(i).join();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//            }
//        }
//
//    }
//
//    private static List<Mouse> getMouseList() {
//        List<Mouse> mouseList = new ArrayList<>();
//
//        for (int i = 0; i < 280; i++) {
//            mouseList.add(new Mouse(i));
//        }
//        return mouseList;
//    }
//}
