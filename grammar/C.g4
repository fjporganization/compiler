/*
 * grammar for the semestral project for subject KIV/FJP
 */

grammar C;

/*
 * Parser rules
 */

start
  : startsymbol EOF //end of file
  ;
 
startsymbol
  : (declarations)* (functiondeclaration)+
  ;

declarations
  : variabledeclaration
  | constantdeclaration
  ;
  
statement
  : variabledeclaration
  | variabledeclaration statement
  | constantdeclaration
  | constantdeclaration statement
  | assignment
  | assignment statement
  | forloop
  | forloop statement
  | condition
  | condition statement
  | switchcondition
  | switchcondition statement
  | whileloop
  | whileloop statement
  | dowhileloop
  | dowhileloop statement
  | functioncall
  | functioncall statement
  | parallelassignment
  | parallelassignment statement
  | outputinteger
  | outputinteger statement
  | outputfrac
  | outputfrac statement
  | //empty
  ;
  
variabledeclaration
  : TYPESPECIFIER IDENTIFIER ASSIGNMENTOPERATOR expression SEMICOLON   #declarationAndInitialization
  | TYPESPECIFIER IDENTIFIER SEMICOLON                                 #declarationOnly                                               
  ;
  
constantdeclaration
  : TYPEQUALIFIER TYPESPECIFIER IDENTIFIER ASSIGNMENTOPERATOR expression SEMICOLON
  ;
  
assignment
  : standardAssignment SEMICOLON                                      #standAssignment
  | (IDENTIFIER ASSIGNMENTOPERATOR)+ expression SEMICOLON             #multipleAssignment 
  ;
  

standardAssignment
  : IDENTIFIER ASSIGNMENTOPERATOR expression
  | IDENTIFIER ASSIGNMENTOPERATOR logicalexpression ternaryoperator
  ;

parallelassignment
  : LEFTBRACE identifierlist RIGHTBRACE ASSIGNMENTOPERATOR LEFTBRACE valuelist RIGHTBRACE SEMICOLON
  ;
  
identifierlist
  : IDENTIFIER (COMMA IDENTIFIER)*
  ;
  
valuelist
  : expression (COMMA expression)*
  ;  
  
expression
  : arithmeticexpression
  | logicalexpression
  | ternaryoperator
  ;
  
ternaryoperator
  : QUESTIONMARK ternaryassertive COLON ternarynegative
  ;
  
ternaryassertive
  : expression
  ;
  
ternarynegative
  : expression
  ;
  
arithmeticexpression
  : ADDITIONSUBTRACTIONOPERATOR arithmeticexpression								  #unaryOperator
  | LEFTPARENTHESE TYPESPECIFIER RIGHTPARENTHESE arithmeticexpression                 #dataTypeConversion
  | LEFTPARENTHESE arithmeticexpression RIGHTPARENTHESE                               #parenthesesArithmeticExp
  | arithmeticexpression MULTIPLICATIONDIVISIONOPERATOR arithmeticexpression          #mulDivExp
  | arithmeticexpression ADDITIONSUBTRACTIONOPERATOR arithmeticexpression             #addSubExp
  | atom                                                                              #arithmeticAtom
  ;
  
logicalexpression
  : LEFTPARENTHESE logicalexpression RIGHTPARENTHESE                                  #parenthesesLogicExp
  | LOGICALNEGATION logicalexpression                                                 #logicNegation
  | logicalexpression RELATIONALOPERATOR logicalexpression                            #relationalLogicExp
  | logicalexpression EQUALITYOPERATOR logicalexpression                              #equalityLogicExp
  | logicalexpression LOGICALAND logicalexpression                                    #LogicalAndExp
  | logicalexpression LOGICALOR logicalexpression                                     #LogicalOrExp
  | atom                                                                              #logicalAtom
  ;
  
atom
  : inputinteger	  #integerIO	
  | inputfrac		  #fractionIO
  | IDENTIFIER        #identifierAtom
  | NUMERICALVALUE    #numericAtom
  | LOGICALVALUE      #logicAtom
  ;
  
functiondeclaration
  : FUNCTIONRETURNTYPESPECIFIER IDENTIFIER LEFTPARENTHESE functionargumentlist RIGHTPARENTHESE LEFTBRACE statement RIGHTBRACE 
  ;
  
functionargumentlist
  : TYPESPECIFIER IDENTIFIER
  | TYPESPECIFIER IDENTIFIER COMMA functionargumentlist
  | //empty
  ;
  
functioncall
  : IDENTIFIER LEFTPARENTHESE functioncallarguments RIGHTPARENTHESE SEMICOLON
  ;
  
functioncallarguments
  : //empty
  ;
  
forloop
  : FORLOOPKEYWORD LEFTPARENTHESE forinitialization SEMICOLON logicalexpression SEMICOLON forafterthought RIGHTPARENTHESE LEFTBRACE statement RIGHTBRACE
  ;

forinitialization
  : standardAssignment
  ;
    
forafterthought
  : standardAssignment
  ;
  
whileloop
  : WHILELOOPKEYWORD LEFTPARENTHESE logicalexpression RIGHTPARENTHESE whilestatement
  ;

whilestatement
  : LEFTBRACE statement RIGHTBRACE
  ;

dowhileloop
  : DOWHILEKEYWORD LEFTBRACE statement RIGHTBRACE WHILELOOPKEYWORD LEFTPARENTHESE logicalexpression RIGHTPARENTHESE SEMICOLON 
  ;

condition
  : CONDITIONKEYWORD LEFTPARENTHESE logicalexpression RIGHTPARENTHESE simplecondition
  | CONDITIONKEYWORD LEFTPARENTHESE logicalexpression RIGHTPARENTHESE ifelsecondition
  ;
  
simplecondition
  : LEFTBRACE statement RIGHTBRACE 
  ;
  
ifelsecondition
  : assertivebranch CONDITIONELSEKEYWORD negativebranch
  ;
  
assertivebranch
  : LEFTBRACE statement RIGHTBRACE
  ;
  
negativebranch
  : LEFTBRACE statement RIGHTBRACE
  ;
  
switchcondition
  : SWITCHKEYWORD LEFTPARENTHESE expression RIGHTPARENTHESE LEFTBRACE (switchcase)* (DEFAULTKEYWORD COLON switchdefaultstatement)? RIGHTBRACE
  ;
  
switchcase
  : SWITCHCASEKEYWORD expression COLON switchstatement
  ;

switchstatement
  : statement (BREAKKEYWORD SEMICOLON)?
  ;

switchdefaultstatement
  : statement
  ;
  
inputinteger
  : READINT LEFTPARENTHESE RIGHTPARENTHESE
  ;

outputinteger
  : WRITEINT LEFTPARENTHESE arithmeticexpression RIGHTPARENTHESE SEMICOLON
  ;
  
inputfrac
  : READFRAC LEFTPARENTHESE RIGHTPARENTHESE
  ;

outputfrac
  : WRITEFRAC LEFTPARENTHESE arithmeticexpression RIGHTPARENTHESE SEMICOLON
  ;
  
/*
 * Lexer rules
 */
 
WHITESPACE 
  : [ \r\t\f\n]+ -> skip
  ;

WRITEINT
  : 'writeint'
  ;
  
READINT
  : 'readint'
  ;
  
WRITEFRAC
  : 'writefrac'
  ;
  
READFRAC
  : 'readfrac'
  ;

TYPEQUALIFIER
  : 'const'
  ;

TYPESPECIFIER
  : 'int'
  | 'boolean'
  | 'ratio'
  ;
  
FUNCTIONRETURNTYPESPECIFIER
  : 'void'
  ;
  
LOGICALVALUE
  : 'true'
  | 'false'
  ;
  
FORLOOPKEYWORD
  : 'for'
  ;
  
WHILELOOPKEYWORD
  : 'while'
  ;
  
DOWHILEKEYWORD
  : 'do'
  ;
  
CONDITIONKEYWORD
  : 'if'
  ;
  
CONDITIONELSEKEYWORD
  : 'else'
  ;
  
SWITCHKEYWORD
  : 'switch'
  ;
  
SWITCHCASEKEYWORD
  : 'case'
  ;
  
BREAKKEYWORD
  : 'break'
  ;
  
DEFAULTKEYWORD
  : 'default'
  ;

SEMICOLON
  : ';'
  ;
  
COLON
  : ':'
  ;

STRINGCONCATENATION
  : '.'
  ;
  
MULTIPLICATIONDIVISIONOPERATOR
  : '*'
  | '/'
  ;
  
ADDITIONSUBTRACTIONOPERATOR
  : '+'
  | '-'
  ;
  
RELATIONALOPERATOR
  : '>='
  | '>'
  | '<='
  | '<'
  ;
  
EQUALITYOPERATOR
  : '=='
  | '!='
  ;
  
      
ASSIGNMENTOPERATOR
  : '='
  ;
  
LOGICALOR
  : '||'
  ;
  
LOGICALAND
  : '&&'
  ;

LOGICALNEGATION
  : '!'
  ;
  
QUESTIONMARK
  : '?'
  ;
  
IDENTIFIER
  : (LOWERCASE | UPPERCASE)+ (LOWERCASE | UPPERCASE | DIGIT)* 
  ;

NUMERICALVALUE
  : (DIGIT)+ 
  | (DIGIT)+ '|' (DIGIT)+ 
  ;

LEFTPARENTHESE
  : '('
  ;
  
RIGHTPARENTHESE
  : ')'
  ;
  
LEFTBRACE
  : '{'
  ;
  
RIGHTBRACE
  : '}'
  ;
  
COMMA
  : ','
  ;  
   
fragment DIGIT
  : [0-9] 
  ;
  
fragment LOWERCASE
  : [a-z]
  ;
  
fragment UPPERCASE
  : [A-Z]
  ;