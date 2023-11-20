build:
	javac -d module_api/out module_api/src/com/foo/*.java
	javac -d module_impl/out -cp ./module_api/src module_impl/src/com/bar/*.java
	javac -d module_app/out -cp ./module_api/src module_app/src/*.java
	jar cf module_api.jar -C module_api/out .
	jar cf module_impl.jar -C module_impl/out . -C module_impl/res .
	jar cf module_app.jar -C module_app/out .

run:
	java -cp module_api.jar:module_impl.jar:module_app.jar App

clean:
	rm -rf module_api/out module_app/out module_impl/out
	rm -f *.jar

