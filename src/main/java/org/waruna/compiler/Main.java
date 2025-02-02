package org.waruna.compiler;

import java.util.List;

import org.waruna.compiler.model.Token;
import org.waruna.compiler.parse.Lexer;

public class Main {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java -jar simple-arithmatic-compiler <expression>");
            return;
        }
        Lexer lexer = new Lexer();
        List<Token> tokens = lexer.tokenize(args[0]);
    }
}
