import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class EdgeConvertFileParser {
    protected String inputFileName;
    protected BufferedReader br;

    public EdgeConvertFileParser(String inputFileName) {
        this.inputFileName = inputFileName;
        try {
            this.br = new BufferedReader(new FileReader(inputFileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract void parseFile() throws IOException;

    protected String getNextLine() throws IOException {
        return br.readLine();
    }

    protected void closeFile() throws IOException {
        br.close();
    }
}
