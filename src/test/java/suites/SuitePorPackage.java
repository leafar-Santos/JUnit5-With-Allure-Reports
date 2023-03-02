package suites;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.SuiteDisplayName;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SuiteDisplayName("Suite de Testes com pacotes")
@SelectPackages({"RepetirTeste","prePosCondicoes"})
//@IncludePackages("prePosCondicoes") //Assim será executado apenas o pacote informado no include
//@ExcludePackages("prePosCondicoes") //Assim será excluido apenas o pacote informado no exclude
public class SuitePorPackage {
}
