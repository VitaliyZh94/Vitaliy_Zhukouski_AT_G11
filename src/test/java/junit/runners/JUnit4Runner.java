package junit.runners;

import junit.engineers.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

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
