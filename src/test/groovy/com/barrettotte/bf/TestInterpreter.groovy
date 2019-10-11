package com.barrettotte.bf

import static org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TestInterpreter{

    private final Interpreter interpreter = new Interpreter()

    @Test
    void test_HelloWorld(){
        final String out = interpreter.interpret(getClass().getResource('/HelloWorld.bf').text)
        assertEquals('Hello World!\n', out)
        
        final String bf = '++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.'
        assertEquals('Hello World!\n', interpreter.interpret(bf))
    }

}
