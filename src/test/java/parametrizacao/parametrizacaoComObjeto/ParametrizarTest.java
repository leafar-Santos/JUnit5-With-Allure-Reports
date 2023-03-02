package parametrizacao.parametrizacaoComObjeto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

@DisplayName("Para executar testes parametrizaveis é preciso pegar a dependência JUnit Jupiter Params")
public class ParametrizarTest {

    @ParameterizedTest
    @ValueSource(strings = {"Teste1","Teste2"})
    public void testeParametrizado(String texto){
        Assertions.assertNotNull(texto);
    }

    @ParameterizedTest
    @ValueSource(ints = {1,2,3,4,5})
    public void numeros(int valor){
        Assertions.assertNotNull(valor);
        Assertions.assertTrue(valor > 0 && valor <10);
    }

    @ParameterizedTest(name = "Números validados {index}:{0}")
    @ValueSource(ints = {3,5,7,9,11})
    public void numerosInteiros(int valores){
        Assertions.assertNotNull(valores, "Numeros impares");
    }

}
