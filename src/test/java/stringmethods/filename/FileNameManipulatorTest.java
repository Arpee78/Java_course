package stringmethods.filename;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileNameManipulatorTest {

    FileNameManipulator fileNameManipulator;

    @BeforeEach
    void setUp() {
        fileNameManipulator = new FileNameManipulator();
    }

    @Test
    void findLastCharacter() {
        char c = fileNameManipulator.findLastCharacter("apple");
        assertEquals('e',c);
    }

    @Test
    void findFileExtension() {
        String ext = fileNameManipulator.findFileExtension("thisisafile.exe");
        assertEquals("exe", ext);
    }

    @Test
    void identifyFilesByExtension() {
        assertTrue(fileNameManipulator.identifyFilesByExtension("exe","thisisafile.exe"));
        assertFalse(fileNameManipulator.identifyFilesByExtension("com","thisisafile.exe"));
        assertFalse(fileNameManipulator.identifyFilesByExtension("com","thisisafile"));
    }

    @Test
    void compareFilesByName() {
        assertTrue(fileNameManipulator.compareFilesByName("thisisafile.exe","thisisafile.exe"));
        assertFalse(fileNameManipulator.compareFilesByName("thisisntafile.exe","thisisafile.exe"));
    }

    @Test
    void changeExtensionToLowerCase() {
        String fileName = fileNameManipulator.changeExtensionToLowerCase("thisisafile.eXe");
        assertEquals("thisisafile.exe",fileName);
    }

    @Test
    void replaceStringPart() {
        String fileName = fileNameManipulator.replaceStringPart("thisisafile.exe","is","are");
        assertEquals("thareareafile.exe",fileName);


    }
}