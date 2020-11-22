import org.junit.Test;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        HandleTruth.wordCount();
    }
}

//lecture notes for quiz
//step 1: hashmap<string,integer> -> counts how many times each word appears
//step 2: treemap<integer,string> -> sort in descending order
    // prob: you 10x,cannot have 2 keys with same value
    //increase string and add another word to string
    //
//step 3: do assertions -> test inputs/outputs & expected