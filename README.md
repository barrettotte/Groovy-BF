# Groovy-BF-Interpreter

Yet another BF interpreter written in Groovy


## Examples
```groovy
    Interpreter interpreter = new Interpreter()
    def bf = '++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.'
    println interpreter.interpret(bf) // 'Hello, World!\n'
```



## References
* https://en.wikipedia.org/wiki/Brainfuck (Hello World test case)

