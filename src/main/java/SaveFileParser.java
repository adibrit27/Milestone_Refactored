import java.io.IOException;

public class SaveFileParser extends EdgeConvertFileParser {

    public SaveFileParser(String inputFileName) {
        super(inputFileName);
    }

    @Override
    public void parseFile() throws IOException {
        String line;
        while ((line = getNextLine()) != null) {
            processSaveFileLine(line);
        }

        closeFile();
    }

    private void processSaveFileLine(String line) {
        String[] tokens = line.split("\\s+");
        for (String token : tokens) {
        }
    }

    // Metode atau variabel tambahan bisa ditambahkan sesuai kebutuhan

    public static void main(String[] args) {
        // Contoh penggunaan SaveFileParser
        String inputFileName = "path/to/your/save/file.sav";
        SaveFileParser saveFileParser = new SaveFileParser(inputFileName);

        try {
            saveFileParser.parseFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
