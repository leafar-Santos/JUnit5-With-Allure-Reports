package suites;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;


@RunWith(JUnitPlatform.class)
@SelectPackages("tags")
@IncludeTags("Class-Tag")
//@IncludeTags() //Executa apensa os testes com a tag no include
//@ExcludeTags() //Não executa os tests com a  tag no exclude
public class SuitePorTagClasses {

}
