import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StateCode {
    public static void main(String[] args) throws StateCensusAnalyserException, IOException {


        String filePathRead = "C:\\Users\\sunny\\IdeaProjects\\IndianStateCensusProblem\\src\\main\\resources\\StateCodeDAta.csv";
        String fileName = "StateCodeDAta.csv";
        String delimiter = ",";
        List<String> stringName = new ArrayList<>();
        stringName.add("SrNo");
        stringName.add("State");
        stringName.add("Name");
        stringName.add("TIN");
        stringName.add("StateCode");
        ReadOperations readObj = new ReadOperations();
        int count = readObj.readDataCount(filePathRead, fileName);
        System.out.println(count);
        readObj.readDelimiter(filePathRead, delimiter);
        readObj.readHeader(filePathRead, stringName);
    }
}