call mvnw clean package -Dmaven.test.skip=true
cd target
java -jar *.jar
