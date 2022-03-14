import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class MyFirstTest {
    @Test
     public void testIfArrayListEquals(){
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();
        List<String> noMoreLanguages = languages;

        assertNotSame(moreLanguages,noMoreLanguages);
        assertSame(languages,noMoreLanguages);
    }
    @Test
    public void testIfArrayEquals(){
        int[] numbers ={1,2,3};
        int[] otherNumbers = new int[3];
        otherNumbers[0]=1;
        otherNumbers[1]=2;
        otherNumbers[2]=3;

        assertArrayEquals(numbers,otherNumbers);
    }
    @Test
    public void trueOrFalse(){
        String language = "PHP" ;

        assertTrue("If language contains \"H\"",  language.contains("H"));
        assertFalse("If language contains \"J\"",language.contains("J"));
    }


}
