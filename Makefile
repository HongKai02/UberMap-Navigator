run:

runTests: Route.class CS400Graph.class Intersection.class UberMapGraph.class RouteLoader.class DataWranglerTests.class BackendDeveloperTests.class UberPickupBackend.class
	javac -cp .:junit5.jar:json-simple-1.1.jar AlgorithmEngineerTests.java -Xlint
	java -jar junit5.jar --class-path .:json-simple-1.1.jar --scan-classpath

runAlgorithmEngineerTests: Route.class CS400Graph.class Intersection.class UberMapGraph.class
	javac -cp .:junit5.jar:json-simple-1.1.jar AlgorithmEngineerTests.java -Xlint
	java -jar junit5.jar --class-path .:json-simple-1.1.jar --scan-classpath

CS400Graph.class:
	javac CS400Graph.java

Intersection.class:
	javac Intersection.java

UberMapGraph.class:
	javac UberMapGraph.java

runDataWranglerTests: Route.class RouteLoader.class DataWranglerTests.class
	java -jar junit5.jar --class-path .:json-simple-1.1.jar --scan-classpath

DataWranglerTests.class: DataWranglerTests.java
	javac -cp .:junit5.jar:json-simple-1.1.jar DataWranglerTests.java -Xlint

RouteLoader.class: RouteLoader.java
	javac -cp .:junit5.jar:json-simple-1.1.jar RouteLoader.java -Xlint

Route.class: Route.java
	javac Route.java

runBackendDeveloperTests: BackendDeveloperTests.class UberPickupBackend.class
	java -jar junit5.jar --class-path .:json-simple-1.1.jar --scan-classpath

BackendDeveloperTests.class: BackendDeveloperTests.java UberPickupBackend.class
	javac -cp .:junit5.jar:json-simple-1.1.jar BackendDeveloperTests.java -Xlint

UberPickupBackend.class: UberPickupBackend.java Intersection.class UberMapGraphBD_Placeholder.class RouteLoader_BDPlaceholder.class
	javac UberPickupBackend.java

UberMapGraphBD_Placeholder.class: UberMapGraphBD_Placeholder.java CS400Graph.class
	javac UberMapGraphBD_Placeholder.java

RouteLoader_BDPlaceholder.class: RouteLoader_BDPlaceholder.java Route_BDPlaceholder.class
	javac RouteLoader_BDPlaceholder.java

Route_BDPlaceholder.class: Route_BDPlaceholder.java
	javac Route_BDPlaceholder.java

clean:
	rm *.class
