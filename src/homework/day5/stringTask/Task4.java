package homework.day5.stringTask;

public class Task4 {

    public static void printIPs(String logs) {

        String clearedLogs = logs.replaceAll("access_log\\.\\d{4}\\.\\d{2}\\.\\d{2}", "");
        String[] strings = clearedLogs.split("\\R");
        String[] finalStrings = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {  // remove spaces in each element
            strings[i] = strings[i].trim();
        }

        for (int i = 0; i < finalStrings.length; i++) { // fix nullPointerException in future
            finalStrings[i] = "" + 1;
        }

        for (int i = 0; i < strings.length; i++) {
            String[] split = strings[i].split("\\s"); // split string on two elements: IP and status

            int ok = 0;
            int failed = 0;
            boolean skip = false;

            for (int k = 0; k < finalStrings.length; k++) { // check duplicate IP in the final array
                if (finalStrings[k].contains(split[0])) {
                    skip = true;
                }
            }

            if (skip == true) { // next iterator in the highest cycle for
                continue;
            }

            for (int j = 0; j < strings.length; j++)  // count ok/failed
                if (strings[j].contains(split[0])) {

                    if (split[1].equals("granted")) {
                        ok++;
                    } else {
                        failed++;
                    }
                }

            finalStrings[i] = "ip " + split[0] + " ok - " + ok + ", failed - " + failed;
            System.out.println(finalStrings[i]);
        }

    }

    public static void main(String[] args) {
        
        printIPs("access_log.2020.09.07 212.168.101.5 granted\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.101.6 denied\n" +
                "access_log.2020.09.07 212.168.122.6 denied");


    }
}
