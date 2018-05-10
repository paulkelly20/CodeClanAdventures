import mythicalCreature.Dragon;
import mythicalCreature.MythicalCreature;
import org.junit.Before;
import org.junit.Test;

public class MythicalCreatureTest {

    MythicalCreature mythicalCreature;



    @Before
    public void before() {
        mythicalCreature = new Dragon("Spryo", 100, 10);
    }


}
