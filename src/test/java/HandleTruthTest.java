import com.sun.source.tree.Tree;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class HandleTruthTest {
    @Test
    public void makeshiftTest() {
        HandleTruth.wordCount("son we live in a world that has walls and those walls have to be guarded by men with guns whos gonna do it you you lieutenant weinberg i have a greater responsibility than you can possibly fathom you weep for santiago and you curse the marines you have that luxury you have the luxury of not knowing what i know that santiagos death while tragic probably saved lives and my existence while grotesque and incomprehensible to you saves lives you dont want the truth because deep down in places you dont talk about at parties you want me on that wall you need me on that wall we use words like honor code loyalty we use these words as the backbone of a life spent defending something you use them as a punchline i have neither the time nor the inclination to explain myself to a man who rises and sleeps under the blanket of the very freedom that i provide and then questions the manner in which i provide it i would rather you just said thank you and went on your way otherwise i suggest you pick up a weapon and stand a post either way i dont give a damn what you think you are entitled to");
    }

    @Test
    public void realTest() {
        String input[] = {
                "hi",
                "hello there",
                "i love christmas",
                "I LOVE CHRISTMAS",//caps
                "",//empty
                " ",//space
                "eggnog eggnog eggnog",
                "EGGNOG eggnog EgGnOg"//mixed caps and lower
        };
//referred to hw4&3 for syntax & lecture for process
        List<TreeMap<Integer, Set<String>>> testers = getExpected();

        for (int i = 0; i < testers.size(); i++) { //can't do length..recheck
            TreeMap<Integer, Set<String>> actual = HandleTruth.wordCount(input[i]);
            assertEquals(testers.get(i), actual);
            //TreeMap<Integer, Set<String>> expected = testers.get(i); redused to one line
            //assertEquals(expected, actual);
        }


    }

    public List<TreeMap<Integer,Set<String>>> getExpected(){
        List<TreeMap<Integer, Set<String>>> testers = new ArrayList<>();

        //test 1
        TreeMap<Integer, Set<String>> expected = new TreeMap<>();
        Set<String> testValue = new HashSet<>();
        testValue.add("hi");
        expected.put(3,testValue);
        testers.add(expected);

        //test 2
        TreeMap<Integer, Set<String>> expected2 = new TreeMap<>();
        Set<String> testValue2 = new HashSet<>();
        testValue.add("hello");
        testValue.add("there");
        expected.put(2,testValue2);
        testers.add(expected2);

        //test 3
        TreeMap<Integer, Set<String>> expected3 = new TreeMap<>();
        Set<String> testValue3 = new HashSet<>();
        testValue.add("i");
        testValue.add("love");
        testValue.add("christmas");
        expected.put(3,testValue3);
        testers.add(expected3);

        //test 4
        TreeMap<Integer, Set<String>> expected4 = new TreeMap<>();
        Set<String> testValue4 = new HashSet<>();
        testValue.add("I");
        testValue.add("LOVE");
        testValue.add("CHRISTMAS");
        expected.put(1,testValue4);
        testers.add(expected4);

        //test 5
        TreeMap<Integer, Set<String>> expected5 = new TreeMap<>();
        Set<String> testValue5 = new HashSet<>();
        testValue.add("");
        expected.put(0,testValue5);
        testers.add(expected5);

        //test 6
        TreeMap<Integer, Set<String>> expected6 = new TreeMap<>();
        Set<String> testValue6 = new HashSet<>();
        testValue.add(" ");
        expected.put(0,testValue6);
        testers.add(expected6);

        //test 7
        TreeMap<Integer, Set<String>> expected7 = new TreeMap<>();
        Set<String> testValue7 = new HashSet<>();
        testValue.add("eggnog");
        testValue.add("eggnog");
        testValue.add("eggnog");
        expected.put(3,testValue7);
        testers.add(expected7);

        //test 8
        TreeMap<Integer, Set<String>> expected8 = new TreeMap<>();
        Set<String> testValue8 = new HashSet<>();
        testValue.add("EGGNOG");
        testValue.add("eggnog");
        testValue.add("EgGnOg");
        expected.put(3,testValue8);
        testers.add(expected8);

        return testers;
    }


}