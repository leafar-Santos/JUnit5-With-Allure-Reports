package suites;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import tags.TagsMetodosTest;

@RunWith(JUnitPlatform.class)
@SelectClasses(TagsMetodosTest.class)
@IncludeTags("Dev")
//@IncludeTags() //Executa apensa os testes com a tag no include
//@ExcludeTags() //Não executa os tests com a  tag no exclude
public class SuitePorTagMetodos {

}
