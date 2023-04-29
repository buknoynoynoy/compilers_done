// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) throws Exception {

        //driver

        // create a CharStream that reads from standard input
        CharStream input = CharStreams.fromStream(System.in);

        LittleLexer lexer = new LittleLexer(input);
        //Token currTok = null;
        //String tokenType = null;

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        LittleParser parser = new LittleParser(tokens);
        
        parser.removeErrorListeners();
        ParseTree tree = parser.program();

        //TreeViewer viewer = new TreeViewer(Arrays.asList(parser.getRuleNames()), tree);
        //viewer.open();

        ParseTreeWalker walker = new ParseTreeWalker();

        SimpleTableBuilder stb = new SimpleTableBuilder();

        walker.walk(stb, tree);

        stb.prettyPrint();

/**
        while (!lexer._hitEOF) {
            currTok = lexer.nextToken();
            switch (currTok.getType()) {
                case 1:
                    tokenType = "KEYWORD";
                    break;
                case 2:
                    tokenType = "INTLITERAL";
                    break;
                case 3:
                    tokenType = "FLOATLITERAL";
                    break;
                case 4:
                    tokenType = "STRINGLITERAL";
                    break;
                case 5:
                    tokenType = "IDENTIFIER";
                    break;
                case 7:
                    tokenType = "OPERATOR";
                    break;
            }
            if (!currTok.getText().equals("<EOF>")) {
                System.out.printf("Token Type: %s\nValue: %s\n", tokenType, currTok.getText());
            }

        } //end while
*/

    } 
    
    class AST 
    {
        String definition;
        String variable;
        ArrayList<AST> children = new ArrayList<>();

        public AST(String definition, String rightChild, String variable){
            this.definition = definition;
            this.variable = variable;
        }

        public void addChild(AST child){
            this.children.add(child);
        }

        public static void displayTree(AST root) {
            AST current = root;
            System.out.println("Use: " + current.definition + "|Element: " + current.variable);
            for (int i = 0; i < current.children.size(); i++) {
                //this.print();
                current = current.children.get(i);
                displayTree(current);
            }
        }

    }

    //end main
} //end class
