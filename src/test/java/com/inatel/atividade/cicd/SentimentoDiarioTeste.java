package com.inatel.atividade.cicd;

import org.junit.Test;

import java.time.DayOfWeek;

import static org.junit.Assert.assertEquals;

public class SentimentoDiarioTeste {

    private final DayOfWeek SEGUNDA = DayOfWeek.MONDAY;
    private final DayOfWeek MEIO_DA_SEMANA = DayOfWeek.WEDNESDAY;
    private final DayOfWeek SEXTA = DayOfWeek.FRIDAY;
    private final DayOfWeek FIM_DE_SEMANA = DayOfWeek.SATURDAY;
    private final DayOfWeek DIA_NULO = null;
    private final String SENTIMENTO_SEGUNDA = "Coragem pra você aí, que to sem nenhuma hoje!";
    private final String SENTIMENTO_MEIO_DA_SEMANA =  "Sextou? Não, pera...";
    private final String SENTIMENTO_SEXTA = "DEPLOY??? HOJE?? Sai fora, vou tomar uma cerveja!";
    private final String SENTIMENTO_FIM_DE_SEMANA = "Zzzzzz...";

    private final SentimentoDiario sentimentoDiario = new SentimentoDiario();

    @Test
    public void testeRetornaSentimentoDeSegundaFeira(){

        String sentimentoEsperado = SENTIMENTO_SEGUNDA;
        String sentimentoReal = sentimentoDiario.getSentimentoDoDia(SEGUNDA);

        assertEquals(sentimentoEsperado, sentimentoReal);
    }

    @Test
    public void testeRetornaSentimentoDeMeioDeSemana(){

        String sentimentoEsperado = SENTIMENTO_MEIO_DA_SEMANA;
        String sentimentoReal = sentimentoDiario.getSentimentoDoDia(MEIO_DA_SEMANA);

        assertEquals(sentimentoEsperado, sentimentoReal);
    }

    @Test
    public void testeRetornaSentimentoDeSextaFeira(){

        String sentimentoEsperado = SENTIMENTO_SEXTA;
        String sentimentoReal = sentimentoDiario.getSentimentoDoDia(SEXTA);

        assertEquals(sentimentoEsperado, sentimentoReal);
    }

    @Test
    public void testeRetornaSentimentoDeFimDeSemana(){

        String sentimentoEsperado = SENTIMENTO_FIM_DE_SEMANA;
        String sentimentoReal = sentimentoDiario.getSentimentoDoDia(FIM_DE_SEMANA);

        assertEquals(sentimentoEsperado, sentimentoReal);
    }

    @Test(expected = NullPointerException.class)
    public void testeRetornaExceptionParaDiaDaSemanaNulo(){
        sentimentoDiario.getSentimentoDoDia(DIA_NULO);
    }
}
