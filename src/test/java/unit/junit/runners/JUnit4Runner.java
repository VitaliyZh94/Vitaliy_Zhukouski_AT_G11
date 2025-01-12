package unit.junit.runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import unit.junit.engineers.*;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        GetSkillTest.class,
        NotRelevantAgeTest.class,
        NotRelevantExpTest.class,
        RelevantAgeTest.class,
        RelevantExpTest.class,
        SetNotRelevantSkillTest.class,
        SetRelevantSkillTest.class
})
public class JUnit4Runner {
}
