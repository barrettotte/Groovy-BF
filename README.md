# Groovy-BF

Yet another BF interpreter written in Groovy


## Examples
```groovy
    Interpreter interpreter = new Interpreter()
    def bf = '++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.'
    println interpreter.interpret(bf) // 'Hello, World!\n'
```


## To Do
In addition to the basic interpreter, I really want to make a BF code generator.


## References
* https://en.wikipedia.org/wiki/Brainfuck (Hello World test case)

