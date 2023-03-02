package parametrizacao.parametrizacaoComEnumENull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizarEnumTest {

        @ParameterizedTest
        @EnumSource(ListaNomesTest.class)
        public void nomesTeste(ListaNomesTest nomes){
            System.out.println(nomes);
            Assertions.assertNotNull(nomes);
        }


        //Enviando dados vazios ou nulos

    @ParameterizedTest
    @NullSource
    @ValueSource(strings = {""})
    public void nomesNulos(String valores){
        System.out.println(valores);

    }
}
