package com.company;

import java.io.File;
import java.io.IOException;

public class FileEditor {


    static File homeDir = new File("D:\\IdeaProjects\\FileExplorer");

    public static void mkFile(String name) throws IOException {

        File file = new File(homeDir, name);
        System.out.println("File - " + name + " - was created in - " + file.getAbsolutePath());
        file.createNewFile();

    }

    public static void renameFile(String fileToRename, String newName) {

        for (File file : homeDir.listFiles()) {
            if (file.getAbsolutePath().equals(new File(fileToRename).getAbsolutePath()))
                file.renameTo(new File(newName));
        }
    }

    public static void ls() {


        for (File item : homeDir.listFiles()) {

            if (item.isDirectory()) {
                System.out.println(item.getName() + "  \tDIRECTORY");
            } else {
                System.out.println(item.getName() + "\tFILE ");
            }
        }
    }

    public static void moveToDir(String fileName, String dir) throws IOException {

        for (File file : homeDir.listFiles()) {
            if (file.getAbsolutePath().equals(new File(fileName).getAbsolutePath())){
                File newFile = new File(homeDir+"\\"+dir, fileName);


            }

    }}

    public static void removeFile(String fileName) {


        for (File file : homeDir.listFiles()) {
            if (file.getAbsolutePath().equals(new File(fileName).getAbsolutePath())) {

                file.delete();
                System.out.println("File - " + fileName + " - was removed from - " + file.getAbsolutePath());
            }
        }
    }

    public static void mkDir(String name) {
        File file = new File(homeDir, name);
        file.mkdir();
        System.out.println("directory -" + name + "was created");
    }
}
