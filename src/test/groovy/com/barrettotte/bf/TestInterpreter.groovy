package com.barrettotte.bf

import static org.junit.jupiter.api.Assertions.assertEquals
import static org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

class TestInterpreter{

    private final Interpreter interpreter = new Interpreter()

    // TODO: Record how long each interpretation takes

    @Test
    void test_HelloWorld(){
        final String out = interpreter.interpret(getClass().getResource('/HelloWorld.bf').text)
        assertEquals('Hello World!\n', out)
        
        final String bf = '++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.'
        assertEquals('Hello World!\n', interpreter.interpret(bf))
    }

    @Test
    void test_Mandelbrot(){
        final String out = interpreter.interpret(getClass().getResource('/Mandelbrot.bf').text)
        assertNotNull(out)
    }

    def writeToFile(final String content){
        final File file = new File('/Mandelbrot.out.txt')
        file << content
    }

}
