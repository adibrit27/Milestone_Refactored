import org.junit.jupiter.api.Test;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class EdgeFileParserTest {

    @Test
    void testParseFile() {
        // Persiapkan objek EdgeFileParser dan sediakan contoh data atau file Edge
        EdgeFileParser edgeFileParser = new EdgeFileParser("/Users/khoiruladib/Documents/RIT/AplicationDev/Milestone/Milestone - RefactoredCode/src/main/resources/Courses.edg");

        try {
            edgeFileParser.parseFile();

            // TODO: Tambahkan asserstions sesuai dengan harapan Anda
            // Contoh:
            // assertTrue(condition, "Pesan kesalahan jika asertion gagal");

        } catch (IOException e) {
            fail("IOException thrown during parseFile(): " + e.getMessage());
        }
    }

    // Tambahkan metode pengujian lain sesuai kebutuhan

    // Contoh:
    // @Test
    // void testAnotherMethod() {
    //     ...
    // }
}
