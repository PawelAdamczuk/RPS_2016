package com.pl.paweladamczuk;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            File stats = new File("log_phase8");
            Scanner sc = new Scanner(stats);

            ArrayList<Entry> data = new ArrayList<>();

            while(sc.hasNextLine())
            {
                for (int i = 0; i < 6; i++) { //data, blah blah
                    sc.next();
                }

                sc.nextByte(); // (

                int eTypesCount = sc.nextInt();

                sc.next(); // etypes
                sc.nextByte(); // {

                ArrayList<Integer> eTypes = new ArrayList<>();

                for (int i = 0; i < eTypesCount; i++) {
                    eTypes.add(sc.nextInt());
                }

                sc.nextByte(); // }
                sc.nextByte(); // )

                String str = sc.next();

                str = str.replaceAll("[^\\d]", "");

                int ip = Integer.parseInt(str);

                sc.next(); // ISSUE
                sc.next(); // authtime

                int timestamp = sc.nextInt();

                for (int i = 0; i < 5; i++) {
                    sc.next();
                }

                String str2 = sc.next();

                str2 = str2.replaceAll("[^\\d]", "");

                int usr = Integer.parseInt(str);

                Entry entry = new Entry(timestamp, ip, usr, eTypes);

                data.add(entry);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
