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
* Summary of what BF is https://gist.github.com/roachhd/dce54bec8ba55fb17d3a
* https://en.wikipedia.org/wiki/Brainfuck (Hello World test case)
* Mandelbrot set in BF by Erik Bosman
  * https://github.com/erikdubbelboer/brainfuck-jit/blob/master/mandelbrot.bf
  * Output found in mandelbrot.out.txt (TODO: run it and record how long it takes)
