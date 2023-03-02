package parametrizacao.parametrizacaoComCSV;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


@DisplayName("Para executar testes parametrizaveis é preciso pegar a dependência JUnit Jupiter Params")
public class ParametrizarCsvTest {
    @ParameterizedTest()
    @CsvFileSource(files = "src/test/resources/nomes.csv")
    public void nomesTeste(String nomes){
        System.out.println(nomes);
        Assertions.assertEquals(nomes, nomes);
    }

}
