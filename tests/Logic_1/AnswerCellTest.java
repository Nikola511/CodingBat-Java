package Logic_1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnswerCellTest {
    @Test
    void answerCellTest() {
        System.out.print("Testing answerCell... ");

        assertTrue(AnswerCell.answerCell(false, false, false));
        assertFalse(AnswerCell.answerCell(false, false, true));
        assertFalse(AnswerCell.answerCell(true, false, false));
        assertTrue(AnswerCell.answerCell(true, true, false));
        assertTrue(AnswerCell.answerCell(false, true, false));
        assertFalse(AnswerCell.answerCell(true, true, true));

        System.out.println("OK");
    }
}