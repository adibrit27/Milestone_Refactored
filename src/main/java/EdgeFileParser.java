import java.io.IOException;

public class EdgeFileParser extends EdgeConvertFileParser {

    public EdgeFileParser(String inputFileName) {
        super(inputFileName);
    }

    @Override
    public void parseFile() throws IOException {
        String line;
        while ((line = getNextLine()) != null) {
            processEdgeFileLine(line);
        }
        closeFile();
    }

    private void processEdgeFileLine(String line) {
        String[] tokens = line.split("\\s+");
        for (String token : tokens) {
        }
    }

    public static void main(String[] args) {
        String inputFileName = "/Users/khoiruladib/Documents/RIT/AplicationDev/Milestone/Milestone - RefactoredCode/src/main/resources/Courses.edg";
        EdgeFileParser edgeFileParser = new EdgeFileParser(inputFileName);

        try {
            edgeFileParser.parseFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
