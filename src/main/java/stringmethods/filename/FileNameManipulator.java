package stringmethods.filename;

public class FileNameManipulator {

    public char findLastCharacter(String str) {
        String strippedStr = str.strip();
        return strippedStr.charAt(strippedStr.length() - 1);
    }

    public String findFileExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        return ext.equals(findFileExtension(fileName));
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        return searchedFileName.equalsIgnoreCase(actualFileName);
    }

    public String changeExtensionToLowerCase(String fileName) {
        return fileName.substring(0, fileName.lastIndexOf(".")) + "." + findFileExtension(fileName).toLowerCase();
    }

    public String replaceStringPart(String fileName, String present, String target) {
        return fileName.replaceAll(present, target);
    }

}
