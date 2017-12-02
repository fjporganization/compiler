java -cp ./lib/antlr-4.7-complete.jar org.antlr.v4.Tool ./grammar/C.g4 -o ./src/fjp/generated

cd ./src/fjp/generated/

echo package fjp.generated; > CBaseListener.java.new
type CBaseListener.java >> CBaseListener.java.new
move /y CBaseListener.java.new CBaseListener.java

echo package fjp.generated; > CLexer.java.new
type CLexer.java >> CLexer.java.new
move /y CLexer.java.new CLexer.java

echo package fjp.generated; > CListener.java.new
type CListener.java >> CListener.java.new
move /y CListener.java.new CListener.java

echo package fjp.generated; > CParser.java.new
type CParser.java >> CParser.java.new
move /y CParser.java.new CParser.java

cd ..
cd ..
cd ..


