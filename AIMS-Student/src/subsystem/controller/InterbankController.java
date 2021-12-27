package subsystem.controller;

import subsystem.InterbankSubsystem1;
import subsystem.InterbankSubsystem2;

public class InterbankController {
	private InterbankSubsystem1 interbankSubsystem1 = new InterbankSubsystem1();
	private InterbankSubsystem2 interbankSubsystem2 = new InterbankSubsystem2();

    public InterbankSubsystem1 interbankSubsystem1(){
        return interbankSubsystem1;
    }
    
    public InterbankSubsystem2 interbankSubsystem2(){
        return interbankSubsystem2;
    }
}
