package ua.zp.braincad.sania3000.lab9.api;

/**
 * Interface to work with customer support
 */
public interface Counseling {

    /**
     * Ask a question to support service.
     * @param question  question text.
     * @return answer message from support.
     */
    String askQuestion(String question);
}
