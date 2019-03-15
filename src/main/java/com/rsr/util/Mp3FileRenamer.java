package com.rsr.util;

import java.io.File;

public class Mp3FileRenamer {
    public static void main(String[] args) {
        Mp3FileRenamer fr = new Mp3FileRenamer();
        String folderPath = "D:\\Downloads\\songs\\Megha sandesham";
        File rootFolder = new File(folderPath);
        fr.appendFolderNameToFile(rootFolder);
    }

    /**
     * Appends folder name to the files under it in format '<foldername> - <existingFileName>'
     * All subfolders will be processed as well
     *
     */
    private void appendFolderNameToFile(File rootFolder) {
        if (rootFolder.isDirectory()) {
            File[] allChilds = rootFolder.listFiles();
            for (File f : allChilds){
                if (f.isDirectory())
                {
                    this.appendFolderNameToFile(f);
                }
                else
                {
                    String parentFolderName = f.getParentFile().getName().toLowerCase();
                    String oldFileName = f.getName();
                    if (oldFileName.toLowerCase().startsWith(parentFolderName + " - ")){
                        String newFileName = f.getParent() + "\\" + oldFileName.toLowerCase();
                        f.renameTo(new File(newFileName));
                        System.out.println("file name changed for " + oldFileName);
                    } else {
                        String newFileName = f.getParent() + "\\" + parentFolderName + " - " + oldFileName;
                        //String newFileName = fullPath.substring(0, fullPath.lastIndexOf("\\"));
                        f.renameTo(new File(newFileName));
                        System.out.println("file name changed for " + oldFileName);
                    }
                }
            }
        } else {
            System.out.println("Invalid folder path");
        }
    }


}