package prePosCondicoes;

import org.junit.jupiter.api.*;

public class PrePosCondicoesTest {

    @BeforeAll
    public static void metodoRodaAntesDeTodosOsTestes(){
        System.out.println("Metodo @BeforAll");
    }

    @BeforeEach
    public void metodoRodaAntesDeCadaTeste(){
        System.out.println("Metodo @Each");
    }


    @AfterAll
    public static void metodoRodaDepoisDeTodosOsTestes(){
        System.out.println("Metodo @AfterAll");
    }

    @AfterEach
    public void metodoRodadepoisDeCadaTeste(){
        System.out.println("Metodo @AfterEach");
    }

   @Test
   public void primeiroMetodoTest(){
       System.out.println("MÉTODO DE TESTE");
   }

    @Test
    public void segundoMetodoTestJUnit5(){
        System.out.println("MÉTODO DE TESTE");
    }

    @Test
    public void terceiroMetodoTestJUnit5(){
        System.out.println("MÉTODO DE TESTE");
    }

    @Test
    public void quartoMetodoTest(){
        System.out.println("MÉTODO DE TESTE");
    }

}
