package com.pl.paweladamczuk;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int linenumber = 0;
        String str, str2, str3;


        try {
            File stats = new File("log_phase8");
            Scanner sc = new Scanner(stats);
            PrintWriter writer1 = new PrintWriter("1.txt", "UTF-8");
            PrintWriter writer2 = new PrintWriter("2.txt", "UTF-8");
            ArrayList<Entry> data = new ArrayList<>();

            while(linenumber < 1128329) //1128329
            {

                if (linenumber == 28329)
                    System.out.println();
                for (int i = 0; i < 6; i++) { //data, blah blah
                    str3 = sc.next();
                }

                str3 = sc.next();
                str3 = str3.substring(1);


                //sc.nextByte(); // (

                int eTypesCount = Integer.parseInt(str3);

                if(eTypesCount > 1)
                {
                    System.out.println();
                }

                sc.next(); // etypes

                //sc.skip("\\{");
                //sc.nextByte(); // {



                ArrayList<Integer> eTypes = new ArrayList<>();

                str3 = sc.next();
                str3 = str3.replaceAll("[^\\d]", "");

                int temp = Integer.parseInt(str3);
                eTypes.add(temp);

                for (int i = 0; i < eTypesCount - 2; i++) {
                    eTypes.add(sc.nextInt());
                }

                if(eTypesCount > 1) {
                    String str4 = sc.next();
                    str4 = str4.replaceAll("[^\\d]", "");

                    temp = Integer.parseInt(str4);
                    eTypes.add(temp);
                }

//                if(eTypesCount != 1)
//                    sc.next(); // )}

                //sc.skip("\\}");
                //sc.skip("\\)");

                //sc.nextByte(); // }
                //sc.nextByte(); // )

                str = sc.next();

                str = str.replaceAll("[^\\d]", "");

                int ip = Integer.parseInt(str);

                str3 = sc.next(); // ISSUE
                str3 = sc.next(); // authtime
                str3 = sc.next();
                str3 = str3.replaceAll("[^\\d]", "");

                int timestamp = Integer.parseInt(str3);

                for (int i = 0; i < 4; i++) {
                    str3 = sc.next();
                }

                str2 = sc.next();

                str2 = str2.replaceAll("[^\\d]", "");

                int usr = Integer.parseInt(str);

                Entry entry = new Entry(linenumber, timestamp, ip, usr, eTypes);

                writer1.println(entry);
                writer2.println(entry.eTypesString());


                //data.add(entry);

                ++linenumber;

                if(linenumber % 1000 == 0)
                    System.gc();
            }
            System.out.println(data.size());
            writer1.close();
            writer2.close();
        }
        catch (Exception e)
        {
            for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
                System.out.println(ste);
            }
            System.out.println("error: " + e.getMessage() + linenumber);
            System.out.println(e);
        }
    }
}
