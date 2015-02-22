// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.*;
import java.util.*;


public class Driver {
   public static void main(String[] args) throws Exception {
      //      IdMap map = new IdMap("LizaLexer.tokens");
      // create a CharStream that reads from standard input
      ANTLRInputStream input = new ANTLRInputStream(System.in);

      // create a lexer that feeds off of input CharStream
      LizaLexer lexer = new LizaLexer(input);

      Token token = lexer.nextToken();
      while(token.getType()!=-1) {
         System.out.println("#" + token.getLine()+ 
                            " " + token.getType() +
                            " |" +token.getText() + "|");
         token = lexer.nextToken();
      }
   }   
}

class IdMap {
   String [] array = new String [300];
   
   IdMap(String fileName) throws IOException {
      Scanner sc = new Scanner(new File(fileName)).useDelimiter("[=\\s$]+");
      int index;
      String val;
      while(sc.hasNext()) {
         System.out.println("inside idmap while");
	 val = sc.next();
         System.out.println(val);
	 index = sc.nextInt();
         System.out.println(index);
	 array[index] = val;
      }
      sc.close();
   }

   String name(int index) {
      if (index < 0) {
	 return("Bad index in IdMap.name: " + index);
      }
      else {
	 return array[index];
      }
      //return "Cannot happen";
   }
}

   // create a buffer of tokens pulled from the lexer
   //   CommonTokenStream tokenstream = new CommonTokenStream(lexer);

   //   List<Token> tokens = tokenstream.getTokens();
   //   for (  Token token : tokens) {
   //      System.out.println(token.toString());
   //   }
   //}
   //   Token token = lexer.nextToken();
   //   while(! tokens.EOF) {
   //      System.out.println(token.getText());
   //      token = lexer.nextToken();
   //      }
   //   }
   // create a parser that feeds off the tokens
   //   bufferArrayInitParser parser = new ArrayInitParser(tokens);
   //   ParseTree tree = parser.init();

   // begin parsing at init rule
   //   System.out.println(tree.toStringTree(parser));
   // print LISP-style tree


