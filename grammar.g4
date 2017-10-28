/*
  Grammar for the semestral project for KIV/FJP
  All terminal symbol names begin with capital letter, nonterminal symbols are quoted
  
*/

StartSymbol
  : VariableDeclaration 
  | ConstantDeclaration 
  | FunctionDeclaration
  | VariableDeclaration StartSymbol
  | ConstantDeclaration StartSymbol
  | FunctionDeclaration StartSymbol
  ;
  
Statement
  : VariableDeclaration
  | ConstantDeclaration 
  | VariableAssignment 
  | ForCycle
  | WhileCycle
  | DoWhileCycle
  | IfCondition
  | FunctionCall
  | SwitchCondition
  | VariableDeclaration Statement
  | ConstantDeclaration Statement
  | VariableAssignment Statement
  | ForCycle Statement
  | WhileCycle Statement
  | DoWhileCycle Statement
  | IfCondition Statement
  | FunctionCall Statement
  | SwitchCondition Statement
  ;
  
Identifier
  : IdentifierNonDigit (IdentifierAnyCharacter)*
  ;

IdentifierNonDigit
  : NonDigit
  ;
  
IdentifierAnyCharacter
  : Digit
  | NonDigit
  ;
  
TypeSpecifier
  : 'int'
  | 'double'
  | 'boolean'
  | 'string'
  ;

TypeQualifier
  : 'const'
  ;

UnaryOperator
  : '+'
  | '-'
  | //empty
  ;
  
ArithmeticOperator
  : '+'
  | '-'
  | '*'
  | '/'
  ;
  
ComparisonOperator
  : '>'
  | '<'
  | '>='
  | '<='
  | '=='
  | '!='
  ;
  
AssignmentOperator
  : '='
  ;
  
LogicalOperator
  : '||'
  | '&&'
  ;
  
StringConcatenationOperator
  : '+'
  ;

NumericalValue
  : IntegerValue
  | RealValue
  ;
  
IntegerValue
  : UnaryOperator (Digit)*
  ;

RealValue
  : UnaryOperator (Digit)*
  | UnaryOperator (Digit)* '.' (Digit)*
  ;
  
LogicalValue
  : 'true'
  | 'false'
  ;
  
StringValue
  : '"' String '"'
  ;
  
String
  : Digit StringValue
  | NonDigit StringValue
  | //empty
  ;
  
Value
  : NumericalValue
  | ArithmeticExpression
  | LogicalExpression
  | LogicalValue
  | StringValue
  | StringConcatenation
  | Identifier
  ; 

AssignmentExpression
  : AssignmentOperator Value
  | AssignmentOperator Identifier AssignmentExpression  //multiple assignment
  | LogicalExpression '?' Value ':' Value //ternary operator
  ;
  
ParallelAssignment
  : '{' IdentifierList '}' = '{' ValueList '}' ';' 
  ;
  
IdentifierList
  : Identifier ',' IdentifierList
  ;
  
ValueList
  : Value ',' ValueList
  
VariableDeclaration
  : TypeSpecifier Identifier ';' 
  | TypeSpecifier Identifier AssignmentExpression ';' 
  ;

ConstantDeclaration
  :  TypeQualifier TypeSpecifier Identifier AssignmentExpression ';' 
  ;
  
VariableAssignment
  : Identifier AssignmentExpression ';' 
  ; 
   
ArithmeticExpression
  : Identifier ArithmeticOperator Identifier
  | Identifier ArithmeticOperator NumericalValue
  | NumericalValue ArithmeticOperator Identifier
  | NumericalValue ArithmeticOperator NumericalValue
  | Identifier ArithmeticOperator ArithmeticExpression
  | NumericalValue ArithmeticOperator ArithmeticExpression
  | '(' ArithmeticExpression ')'
  | Identifier
  ;
 
LogicalExpression
  : Identifier ComparisonOperator Identifier
  | Identifier ComparisonOperator NumericalValue
  | Identifier ComparisonOperator ArithmeticExpression
  | NumericalValue ComparisonOperator Identifier
  | NumericalValue ComparisonOperator NumericalValue
  | NumericalValue ComparisonOperator ArithmeticExpression
  | Identifier LogicalOperator LogicalExpression
  | Identifier
  | '(' LogicalExpression ')'
  | '!' LogicalExpression
  ;
  
ForCycle
  : 'for' '(' ForDeclaration ';' ForCondition ';' ForExpression ')' '{' Statement '}'
  ;
  
ForDeclaration
  : VariableAssignment
  | //empty
  ;
  
CycleCondition
  : LogicalExpression
  | LogicalExpression ',' ForCondition
  | //empty
  ;

ForExpression
  : AssignmentExpression
  | AssignmentExpression ',' ForExpression
  | //empty
  ;
  
WhileCycle
  : 'while' '(' CycleCondition ')' '{' Statement '}'
  ;
  
DoWhileCycle
  : 'do' '{' Statement '}' 'while' '(' CycleCondition ')' ';'
  ;

IfCondition
  : 'if' (LogicalExpression) '{' Statement '}'
  | 'if' (LogicalExpression) '{' Statement '}' 'else' '{' Statement '}'
  
FunctionDeclaration /* Only functions with no return value allowed */
  : 'void' Identifier '(' FunctionArgumentList ')' ';'
  | 'void' Identifier '(' FunctionArgumentList ')' '{' Statement '}'
  ;
  
FunctionArgumentList
  : VariableDeclaration
  | VariableDeclaration ',' FunctionArgumentList 
  | //empty
  ;
  
FunctionCall
  : Identifier '(' FunctionCallArguments ')' ';'
  ;
  
FunctionCallArguments
  : Identifier
  | NumericalValue
  | Identifier ',' FunctionCallArguments
  | NumericalValue ',' FunctionCallArguments
  | ArithmeticExpression
  | LogicalExpression
  | \\empty
  ;
  
StringConcatenation
  : Identifier StringConcatenationOperator Identifier ';'
  | StringValue StringConcatenationOperator Identifier ';'
  | Identifier StringConcatenationOperator StringValue ';'
  | StringValue StringConcatenationOperator StringValue ';'
  | Identifier StringConcatenationOperator StringConcatenation ';'
  | StringValue StringConcatenationOperator StringConcatenation ';'
  ;
  
SwitchCondition
  : 'switch' '(' Value ')' (SwitchCase)* 
  | 'switch' '(' Value ')' (SwitchCase)* 'default' ':' Statement ('break')?
  ;
  
SwitchCase
  : 'case' Value ':' Statement ('break')?
  ;
  
Digit
  : [0-9]
  ;
  
NonDigit
  : [a-zA-Z]
  ;
