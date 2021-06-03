package tudor.cristinaandreea.g1088.teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Categories.class)
@IncludeCategory({TestRightCategory.class})
@SuiteClasses({ TestProdusCerinta1.class, TestProdusCerinta2.class, TestProdusCerinta3.class })
public class SuitaCerinta4ToateTesteleDinRightCategory {

}
