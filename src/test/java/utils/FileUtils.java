package utils;

import java.io.File;
import java.time.Instant;

public class FileUtils {
    public static boolean fileDowLoad(String expectedName, String fileExe, int timeOut){
        File[] listOfFiles;
        String fileName;
        boolean isFileDownLoaded = false;

        long startTime = Instant.now().toEpochMilli();
        long waitTime = startTime + timeOut;
        while (Instant.now().toEpochMilli() < waitTime){
            listOfFiles = new File(Constant.FILE_DOWNLOAD).listFiles();
            for (File eachFile: listOfFiles) {
                fileName = eachFile.getName().toLowerCase();
                if(fileName.contains(expectedName.toLowerCase()) && fileName.contains(fileExe.toLowerCase())
                && !fileName.contains("crdownload") && eachFile.lastModified() > startTime){
                    isFileDownLoaded = true;
                    break;
                }
            }
            if(isFileDownLoaded){
                break;
            }
        }
        return isFileDownLoaded;
    }
}
