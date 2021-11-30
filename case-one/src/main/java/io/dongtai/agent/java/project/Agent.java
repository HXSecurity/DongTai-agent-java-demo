package io.dongtai.agent.java.project;

import java.lang.instrument.Instrumentation;

public class Agent {

    public static void premain(String agentArgs, Instrumentation inst) {
        System.out.println("Hello, DongTai!");
    }

}
