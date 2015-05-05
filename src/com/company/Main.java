package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] a) throws IOException {

        while (true) {

            Scanner scanner = new Scanner(System.in);

            String[] args = new String[3];
            System.out.println("input command ---\n" + FileEditor.homeDir + ">");
            for (int i = 0; i < 3; i++) {
                args[i] = scanner.nextLine();
            }

            String command = args[0];

            switch (command) {
                case "mkFile":
                    FileEditor.mkFile(args[1] + ".txt");
                    break;
                case "mkDir":
                    FileEditor.mkDir(args[1]);
                    break;
                case "mv":
                    if ((new File(args[2])).isDirectory())
                        FileEditor.moveToDir(args[1], args[2]);
                    else
                        FileEditor.renameFile(args[1], args[2]);
                    break;
                case "dir":
                    FileEditor.ls();
                    break;
                case "del":
                    FileEditor.removeFile(args[1]);
                    break;
            }
        }


    }

}
