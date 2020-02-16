# ase-assignment2

To run all tests, use `mvn verify` in the `endpoint` folder. To run the application, use `mvn thorntail:run`.

To regenerate pact file, use `mvn verify` in the `endpoint-client` folder.

To package as uber jar, use `mvn clean install package` in `endpoint` folder (+ `verify` to run pact tests while packaging), then `java -jar target/endpoint-thorntail.jar`).
