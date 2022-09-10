public class StateCensusAnalyserException extends Exception {
    Message messageValue;

    public enum Message {
        IMPROPER_FILE_NAME, IMPROPER_FILE_TYPE, IMPROPER_DELIMITER, IMPROPER_HEADER
    }

    public StateCensusAnalyserException(String message, Message messageValue) {
        super();
        this.messageValue = messageValue;
    }
}
