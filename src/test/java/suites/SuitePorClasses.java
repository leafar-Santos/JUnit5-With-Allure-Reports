package suites;

import RepetirTeste.RepeticaoTest;
import descricaoMetodoeClasse.DescricaoClassTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;
import parametrizacao.parametrizacaoComEnumENull.ParametrizarEnumTest;

@RunWith(JUnitPlatform.class)
@SelectClasses({RepeticaoTest.class, DescricaoClassTest.class, ParametrizarEnumTest.class})
//@IncludePackages("prePosCondicoes") //Assim será executado apenas o pacote informado no include
//@ExcludePackages("prePosCondicoes") //Assim será excluido apenas o pacote informado no exclude
public class SuitePorClasses {

}
