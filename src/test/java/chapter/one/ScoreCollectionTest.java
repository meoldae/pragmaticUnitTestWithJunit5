package chapter.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ScoreCollectionTest {

    @Test
    public void answerArithmeticMeanOfTwoNumbers(){
        // Ready
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        // Execute
        int actualResult = collection.arithmeticMean();

        // Compare
        assertEquals(actualResult, 6);
    }
}