package main;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedList;

public class Startup {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\lihailen\\Desktop\\Upload");
        LinkedList<File> list = new LinkedList<>(Arrays.asList(file.listFiles()));
        while (!list.isEmpty()) {
            File cur = list.removeFirst();
            if (cur.isFile()) {
                System.out.println(cur);
            } else {
                for(File item : cur.listFiles()) {
                    list.add(item);
                }
            }
        }
    }

    void fun() {
        File file = new File("C:\\Users\\lihailen\\Desktop\\Upload");
        LinkedList<File> list = new LinkedList<>(Arrays.asList(file.listFiles()));
        while (!list.isEmpty()) {
            File cur = list.removeFirst();
            if (cur.isFile()) {
                System.out.println(cur);
            } else {
                for (File item : cur.listFiles()) {
                    if (item.isDirectory()) {
                        list.add(item);
                    } else {
                        System.out.println(item);
                    }
                }
            }
        }
    }
}