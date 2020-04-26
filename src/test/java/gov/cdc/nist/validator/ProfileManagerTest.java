package gov.cdc.nist.validator;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @Created - 4/26/20
 * @Author Marcelo Caldas mcq1@cdc.gov
 */
public class ProfileManagerTest {

    @Test
    public void validate() {
        ProfileManager nistValidator = new ProfileManager("/TEST_PROF");

        try {
            var nist = nistValidator.validate(getTestFile());

            System.out.println("nist = " + nist);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getTestFile() throws IOException {
        String fileName = "hl7TestMessage.txt";
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        File file = new File(classLoader.getResource(fileName).getFile());
        return new String(Files.readAllBytes(file.toPath()));
    }
}