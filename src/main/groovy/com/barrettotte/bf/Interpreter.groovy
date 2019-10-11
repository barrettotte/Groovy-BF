package com.barrettotte.bf

class Interpreter {

    private final int MEMORY_SIZE = 30000
    private final int[] memory = new int[MEMORY_SIZE]
    private String program = ''
    private String outBuffer = ''
    private int insPtr = 0
    private int memPtr = 0
    private int loopDepth = 0


    String interpret(final String src){
        reset()
        program = sanitizeSource(src)
        while(insPtr < program.length()){
            switch(program[insPtr]){
                case '[':   jumpFwd();                  break;
                case ']':   jumpBack();                 break;
                case '>':   moveRight();    insPtr++;   break;
                case '<':   moveLeft();     insPtr++;   break;
                case '+':   increment();    insPtr++;   break;
                case '-':   decrement();    insPtr++;   break;
                case '.':   write();        insPtr++;   break;
                case ',':   read();         insPtr++;   break;
                default:    /*Do nothing*/  insPtr++;   break;
            }
        }
        return outBuffer
    }

    private String sanitizeSource(final String src){
        return src.findAll{(it in ['[',']','>','<','+','-','.',','])}.join("")
    }

    private void jumpFwd(){
        loopDepth++
        def current = loopDepth
        if(memory[memPtr] == 0){
            while(loopDepth != current - 1){
                insPtr++
                if(program[insPtr] == '['){
                    loopDepth++
                } else if(program[insPtr] == ']'){
                    loopDepth--
                }
            }
        } else{
            insPtr++
        }
    }
    
    private void jumpBack(){
        loopDepth--
        def current = loopDepth
        if(memory[memPtr] != 0){
            while(loopDepth != current - 1){
                insPtr--
                if(program[insPtr] == ']'){
                    loopDepth++
                } else if(program[insPtr] == '['){
                    loopDepth--
                }
            }
        } else{
            insPtr++
        }
    }

    private void moveRight(){
        memPtr += (memPtr < MEMORY_SIZE - 1) ? 1 : 0
    }

    private void moveLeft(){
        memPtr -= (memPtr > 0) ? 1 : 0
    }

    private void increment(){
        memory[memPtr]++ 
    }

    private void decrement(){
        memory[memPtr]--
    }

    private void read(){
        memory[memPtr] = System.in.read() 
    }

    private void write(){
        def out = memory[memPtr] as char
        print out
        outBuffer += out
    }

    private void reset(){
        Arrays.fill(memory, 0)
        program = ''
        outBuffer = ''
        insPtr = 0
        memPtr = 0
        loopDepth = 0
    }

}
