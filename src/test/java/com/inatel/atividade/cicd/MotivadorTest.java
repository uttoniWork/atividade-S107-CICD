package com.inatel.atividade.cicd;

import org.junit.Before;
import org.junit.Test;

public class MotivadorTest {

    private Motivador motivador;

    @Before
    public void initiate(){
        motivador = new Motivador();
    }

    @Test
    public void sendMessageTest(){
        motivador.sendMessage();
    }
}
