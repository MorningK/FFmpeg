$CATALINA_HOME/bin/shutdown.sh
killall -9 java
cp -rf target/demo.war $CATALINA_BASE/webapps/
$CATALINA_HOME/bin/startup.sh
