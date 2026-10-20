# Task 8 — Jenkinsfile Pipeline

## 1. Objective
The objective of this task is to implement a Jenkinsfile Pipeline for the Travel Insurance Claim System. This automates the continuous integration workflow using the Maven Wrapper and prepares for environment-specific deployments via a parameterized pipeline.

## 2. Jenkinsfile Location
The `Jenkinsfile` has been created at the root level of the `travel-insurance-claim-system` repository.

## 3. Pipeline Stages
The declarative pipeline consists of the following stages:
- **Checkout**: Automatically checks out the configured Git repository and branch.
- **Build**: Compiles the project using the Maven Wrapper (`call mvnw.cmd clean compile`).
- **Test**: Executes automated tests using the Maven Wrapper (`call mvnw.cmd test`). If tests fail, the pipeline fails.
- **Package**: Packages the Spring Boot application as a JAR, skipping tests since they ran in the previous stage (`call mvnw.cmd package -DskipTests`).
- **Deploy**: A separate placeholder stage that simulates deployment preparation.

## 4. Maven Wrapper Usage
The pipeline uses the existing Windows batch commands for the Maven Wrapper (`mvnw.cmd`). This ensures builds are consistent and a global Maven installation is not required on the Jenkins agent.

## 5. Parameterized Environment
A Jenkins pipeline parameter named `DEPLOY_ENV` is configured with the following choices:
- `dev`
- `staging`
- `prod`

The selected value is available throughout the pipeline and is used to identify the target deployment environment.

## 6. Current Deployment Placeholder
Currently, the **Deploy** stage serves as a placeholder. It simply prints that deployment preparation has completed for the selected `DEPLOY_ENV` to the console output. Actual deployment to an application server (e.g., Tomcat) will be configured in subsequent steps. No real deployment infrastructure has been configured yet.

## 7. Expected Pipeline Flow
1. User manually triggers the pipeline or it is triggered by a webhook.
2. User selects the `DEPLOY_ENV` parameter (dev, staging, or prod).
3. The pipeline checks out the source code.
4. The pipeline compiles the source code.
5. The pipeline runs automated tests.
6. The pipeline packages the application into an executable JAR.
7. The pipeline outputs a deployment preparation message for the chosen environment.

## 8. Verification Checklist
- [ ] `Jenkinsfile` created at the repository root.
- [ ] Pipeline is declarative (`pipeline { ... }`).
- [ ] `DEPLOY_ENV` parameter configured with `dev`, `staging`, and `prod` choices.
- [ ] Stages (Checkout, Build, Test, Package, Deploy) are clearly defined.
- [ ] Windows-compatible commands (`call mvnw.cmd ...`) are used.
- [ ] Tests and packaging are separated into distinct stages.
- [ ] Deploy stage prints the selected environment.

## 9. Evidence Checklist
- [ ] `Jenkinsfile` committed to the repository (to be done).
- [ ] Jenkins Pipeline job configured to use the `Jenkinsfile` (to be done).
- [ ] Pipeline execution logs showing successful completion of all stages (to be done).
- [ ] `DEPLOY_ENV` value visible in the Jenkins console output (to be done).

---- console--------
Skip to content

Jenkins
Travel-Insurance-Pipeline
#2
Search
Manage Jenkins
Hasnain khan
Status
Changes
Console Output
Delete build ‘#2’
Git Build Data
Pipeline Overview
Edit build information
Restart from Stage
Replay
Pipeline Steps
Workspaces
Previous Build
Console
Download

Copy
View as plain text
Skipping 21 KB.. Full Log
2026-10-09T01:37:46.502+05:30  INFO 15348 --- [travel-insurance-claim-system] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 2 ms
2026-10-09T01:37:46.561+05:30  INFO 15348 --- [travel-insurance-claim-system] [           main] c.a.travelinsurance.ClaimValidationTest  : Started ClaimValidationTest in 13.604 seconds (process running for 16.415)
WARNING: A Java agent has been loaded dynamically (C:\Windows\system32\config\systemprofile\.m2\repository\net\bytebuddy\byte-buddy-agent\1.14.19\byte-buddy-agent-1.14.19.jar)
WARNING: If a serviceability tool is in use, please run with -XX:+EnableDynamicAgentLoading to hide this warning
WARNING: If a serviceability tool is not in use, please run with -Djdk.instrument.traceUsage for more information
WARNING: Dynamic loading of agents will be disallowed by default in a future release
Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
[TEST 4 PASSED] Empty destination correctly rejected with 400.
Hibernate: 
    insert 
    into
        claim
        (claim_amount, claim_type, created_at, customer_name, description, destination, document_reference, policy_number, rejection_reason, status, travel_date, updated_at, claim_id) 
    values
        (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, default)
[TEST 1 PASSED] Valid claim submitted. Response: {"claimId":1,"policyNumber":"POL-2024-001","customerName":"Hasnain Ahmed","destination":"Dubai, UAE","travelDate":"2024-10-15","claimType":"Medical Emergency","claimAmount":15000.00,"description":"Fell ill during the trip and required hospitalisation.","documentReference":"DR-2024-001","status":"PENDING","rejectionReason":null,"createdAt":"2026-10-09T01:37:48.2521625","updatedAt":"2026-10-09T01:37:48.2521625"}
[TEST 5 PASSED] Claim amount = 0 correctly rejected with 400.
[TEST 7 PASSED] Empty description correctly rejected with 400.
[TEST 3 PASSED] Empty policy number correctly rejected with 400.
[TEST 2 PASSED] Empty customer name correctly rejected with 400.
[TEST 6 PASSED] Negative claim amount correctly rejected with 400.
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 16.74 s -- in com.academic.travelinsurance.ClaimValidationTest
[INFO] Running com.academic.travelinsurance.TravelInsuranceApplicationTests
2026-10-09T01:37:48.736+05:30  INFO 15348 --- [travel-insurance-claim-system] [           main] t.c.s.AnnotationConfigContextLoaderUtils : Could not detect default configuration classes for test class [com.academic.travelinsurance.TravelInsuranceApplicationTests]: TravelInsuranceApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
2026-10-09T01:37:48.742+05:30  INFO 15348 --- [travel-insurance-claim-system] [           main] .b.t.c.SpringBootTestContextBootstrapper : Found @SpringBootConfiguration com.academic.travelinsurance.TravelInsuranceApplication for test class com.academic.travelinsurance.TravelInsuranceApplicationTests

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.3.4)

2026-10-09T01:37:48.818+05:30  INFO 15348 --- [travel-insurance-claim-system] [           main] c.a.t.TravelInsuranceApplicationTests    : Starting TravelInsuranceApplicationTests using Java 25.0.1 with PID 15348 (started by BOOK-OTH0BRBPD9$ in C:\ProgramData\Jenkins\.jenkins\workspace\Travel-Insurance-Pipeline)
2026-10-09T01:37:48.819+05:30  INFO 15348 --- [travel-insurance-claim-system] [           main] c.a.t.TravelInsuranceApplicationTests    : No active profile set, falling back to 1 default profile: "default"
2026-10-09T01:37:49.298+05:30  INFO 15348 --- [travel-insurance-claim-system] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-10-09T01:37:49.335+05:30  INFO 15348 --- [travel-insurance-claim-system] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 36 ms. Found 1 JPA repository interface.
2026-10-09T01:37:49.561+05:30  INFO 15348 --- [travel-insurance-claim-system] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-10-09T01:37:49.569+05:30  INFO 15348 --- [travel-insurance-claim-system] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2026-10-09T01:37:49.611+05:30  INFO 15348 --- [travel-insurance-claim-system] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-10-09T01:37:49.614+05:30  INFO 15348 --- [travel-insurance-claim-system] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Starting...
2026-10-09T01:37:49.617+05:30  INFO 15348 --- [travel-insurance-claim-system] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-2 - Added connection conn10: url=jdbc:h2:mem:claimdb user=SA
2026-10-09T01:37:49.618+05:30  INFO 15348 --- [travel-insurance-claim-system] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Start completed.
2026-10-09T01:37:49.619+05:30  WARN 15348 --- [travel-insurance-claim-system] [           main] org.hibernate.orm.deprecation            : HHH90000025: H2Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)
2026-10-09T01:37:49.782+05:30  INFO 15348 --- [travel-insurance-claim-system] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
Hibernate: 
    drop table if exists claim cascade 
Hibernate: 
    create table claim (
        claim_amount numeric(38,2) not null,
        travel_date date not null,
        claim_id bigint generated by default as identity,
        created_at timestamp(6) not null,
        updated_at timestamp(6) not null,
        rejection_reason varchar(500),
        description varchar(1000) not null,
        claim_type varchar(255) not null,
        customer_name varchar(255) not null,
        destination varchar(255) not null,
        document_reference varchar(255) not null,
        policy_number varchar(255) not null,
        status enum ('APPROVED','PENDING','REJECTED') not null,
        primary key (claim_id)
    )
2026-10-09T01:37:49.791+05:30  INFO 15348 --- [travel-insurance-claim-system] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-10-09T01:37:49.956+05:30  WARN 15348 --- [travel-insurance-claim-system] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-10-09T01:37:49.972+05:30  INFO 15348 --- [travel-insurance-claim-system] [           main] o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page: class path resource [static/index.html]
2026-10-09T01:37:50.165+05:30  INFO 15348 --- [travel-insurance-claim-system] [           main] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:claimdb'
2026-10-09T01:37:50.218+05:30  INFO 15348 --- [travel-insurance-claim-system] [           main] c.a.t.TravelInsuranceApplicationTests    : Started TravelInsuranceApplicationTests in 1.464 seconds (process running for 20.071)
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 1.501 s -- in com.academic.travelinsurance.TravelInsuranceApplicationTests
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  36.408 s
[INFO] Finished at: 2026-10-09T01:37:50+05:30
[INFO] ------------------------------------------------------------------------
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Package)
[Pipeline] bat

C:\ProgramData\Jenkins\.jenkins\workspace\Travel-Insurance-Pipeline>call mvnw.cmd package -DskipTests 
WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::load has been called by org.fusesource.jansi.internal.JansiLoader in an unnamed module (file:/C:/windows/system32/config/systemprofile/.m2/wrapper/dists/apache-maven-3.9.9-bin/33b4b2b4/apache-maven-3.9.9/lib/jansi-2.4.1.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper (file:/C:/windows/system32/config/systemprofile/.m2/wrapper/dists/apache-maven-3.9.9-bin/33b4b2b4/apache-maven-3.9.9/lib/guava-33.2.1-jre.jar)
WARNING: Please consider reporting this to the maintainers of class com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
[INFO] Scanning for projects...
[INFO] 
[INFO] -------------< com.academic:travel-insurance-claim-system >-------------
[INFO] Building Travel Insurance Claim System 1.0.0
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.4.2/maven-jar-plugin-3.4.2.pom
Progress (1): 782 B
Progress (1): 1.7 kB
Progress (1): 3.5 kB
Progress (1): 6.6 kB
Progress (1): 7.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.4.2/maven-jar-plugin-3.4.2.pom (7.7 kB at 7.0 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/42/maven-plugins-42.pom
Progress (1): 773 B
Progress (1): 1.8 kB
Progress (1): 4.3 kB
Progress (1): 6.8 kB
Progress (1): 7.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/42/maven-plugins-42.pom (7.7 kB at 100 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/42/maven-parent-42.pom
Progress (1): 724 B
Progress (1): 1.6 kB
Progress (1): 4.2 kB
Progress (1): 8.5 kB
Progress (1): 12 kB 
Progress (1): 16 kB
Progress (1): 21 kB
Progress (1): 23 kB
Progress (1): 27 kB
Progress (1): 28 kB
Progress (1): 30 kB
Progress (1): 33 kB
Progress (1): 36 kB
Progress (1): 38 kB
Progress (1): 41 kB
Progress (1): 44 kB
Progress (1): 47 kB
Progress (1): 50 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/42/maven-parent-42.pom (50 kB at 410 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/32/apache-32.pom
Progress (1): 733 B
Progress (1): 1.6 kB
Progress (1): 3.4 kB
Progress (1): 5.1 kB
Progress (1): 7.1 kB
Progress (1): 12 kB 
Progress (1): 17 kB
Progress (1): 19 kB
Progress (1): 22 kB
Progress (1): 24 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/32/apache-32.pom (24 kB at 178 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.4.2/maven-jar-plugin-3.4.2.jar
Progress (1): 0.9/34 kB
Progress (1): 2.3/34 kB
Progress (1): 3.6/34 kB
Progress (1): 5.0/34 kB
Progress (1): 6.4/34 kB
Progress (1): 7.7/34 kB
Progress (1): 9.1/34 kB
Progress (1): 10/34 kB 
Progress (1): 11/34 kB
Progress (1): 13/34 kB
Progress (1): 14/34 kB
Progress (1): 15/34 kB
Progress (1): 17/34 kB
Progress (1): 18/34 kB
Progress (1): 20/34 kB
Progress (1): 21/34 kB
Progress (1): 22/34 kB
Progress (1): 24/34 kB
Progress (1): 25/34 kB
Progress (1): 26/34 kB
Progress (1): 28/34 kB
Progress (1): 29/34 kB
Progress (1): 33/34 kB
Progress (1): 34 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-jar-plugin/3.4.2/maven-jar-plugin-3.4.2.jar (34 kB at 55 kB/s)
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ travel-insurance-claim-system ---
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO] Copying 5 resources from src\main\resources to target\classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ travel-insurance-claim-system ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ travel-insurance-claim-system ---
[INFO] skip non existing resourceDirectory C:\ProgramData\Jenkins\.jenkins\workspace\Travel-Insurance-Pipeline\src\test\resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ travel-insurance-claim-system ---
[INFO] Nothing to compile - all classes are up to date.
[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ travel-insurance-claim-system ---
[INFO] Tests are skipped.
[INFO] 
[INFO] --- jar:3.4.2:jar (default-jar) @ travel-insurance-claim-system ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/3.1.0/file-management-3.1.0.pom
Progress (1): 794 B
Progress (1): 2.2 kB
Progress (1): 4.4 kB
Progress (1): 4.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/3.1.0/file-management-3.1.0.pom (4.5 kB at 42 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/36/maven-shared-components-36.pom
Progress (1): 781 B
Progress (1): 2.3 kB
Progress (1): 4.5 kB
Progress (1): 4.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/36/maven-shared-components-36.pom (4.9 kB at 39 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/36/maven-parent-36.pom
Progress (1): 725 B
Progress (1): 1.9 kB
Progress (1): 5.4 kB
Progress (1): 9.7 kB
Progress (1): 14 kB 
Progress (1): 19 kB
Progress (1): 23 kB
Progress (1): 25 kB
Progress (1): 27 kB
Progress (1): 28 kB
Progress (1): 31 kB
Progress (1): 35 kB
Progress (1): 38 kB
Progress (1): 41 kB
Progress (1): 45 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/36/maven-parent-36.pom (45 kB at 263 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/26/apache-26.pom
Progress (1): 744 B
Progress (1): 2.1 kB
Progress (1): 3.9 kB
Progress (1): 7.3 kB
Progress (1): 12 kB 
Progress (1): 16 kB
Progress (1): 19 kB
Progress (1): 19 kB
Progress (1): 21 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/26/apache-26.pom (21 kB at 212 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.1/plexus-utils-4.0.1.pom
Progress (1): 729 B
Progress (1): 2.2 kB
Progress (1): 4.3 kB
Progress (1): 7.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.1/plexus-utils-4.0.1.pom (7.8 kB at 78 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.16.1/commons-io-2.16.1.pom
Progress (1): 762 B
Progress (1): 2.0 kB
Progress (1): 4.9 kB
Progress (1): 6.7 kB
Progress (1): 8.8 kB
Progress (1): 12 kB 
Progress (1): 15 kB
Progress (1): 16 kB
Progress (1): 19 kB
Progress (1): 20 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.16.1/commons-io-2.16.1.pom (20 kB at 142 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/69/commons-parent-69.pom
Progress (1): 708 B
Progress (1): 1.9 kB
Progress (1): 3.1 kB
Progress (1): 4.7 kB
Progress (1): 6.4 kB
Progress (1): 8.4 kB
Progress (1): 10 kB 
Progress (1): 11 kB
Progress (1): 13 kB
Progress (1): 15 kB
Progress (1): 18 kB
Progress (1): 21 kB
Progress (1): 22 kB
Progress (1): 25 kB
Progress (1): 29 kB
Progress (1): 32 kB
Progress (1): 33 kB
Progress (1): 38 kB
Progress (1): 41 kB
Progress (1): 45 kB
Progress (1): 47 kB
Progress (1): 50 kB
Progress (1): 52 kB
Progress (1): 56 kB
Progress (1): 58 kB
Progress (1): 59 kB
Progress (1): 63 kB
Progress (1): 65 kB
Progress (1): 70 kB
Progress (1): 72 kB
Progress (1): 75 kB
Progress (1): 77 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/69/commons-parent-69.pom (77 kB at 494 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.6.2/maven-archiver-3.6.2.pom
Progress (1): 801 B
Progress (1): 2.3 kB
Progress (1): 4.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.6.2/maven-archiver-3.6.2.pom (4.4 kB at 33 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/41/maven-shared-components-41.pom
Progress (1): 815 B
Progress (1): 2.3 kB
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/41/maven-shared-components-41.pom (3.2 kB at 35 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.9.2/plexus-archiver-4.9.2.pom
Progress (1): 1.3 kB
Progress (1): 4.1 kB
Progress (1): 6.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.9.2/plexus-archiver-4.9.2.pom (6.0 kB at 61 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/3.4.2/plexus-io-3.4.2.pom
Progress (1): 1.2 kB
Progress (1): 3.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/3.4.2/plexus-io-3.4.2.pom (3.9 kB at 31 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/16/plexus-16.pom
Progress (1): 692 B
Progress (1): 2.7 kB
Progress (1): 6.4 kB
Progress (1): 8.9 kB
Progress (1): 11 kB 
Progress (1): 14 kB
Progress (1): 18 kB
Progress (1): 19 kB
Progress (1): 23 kB
Progress (1): 27 kB
Progress (1): 28 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/16/plexus-16.pom (28 kB at 242 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.26.1/commons-compress-1.26.1.pom
Progress (1): 758 B
Progress (1): 1.9 kB
Progress (1): 3.7 kB
Progress (1): 5.9 kB
Progress (1): 9.2 kB
Progress (1): 12 kB 
Progress (1): 15 kB
Progress (1): 16 kB
Progress (1): 20 kB
Progress (1): 22 kB
Progress (1): 22 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.26.1/commons-compress-1.26.1.pom (22 kB at 152 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/66/commons-parent-66.pom
Progress (1): 708 B
Progress (1): 1.9 kB
Progress (1): 3.1 kB
Progress (1): 4.7 kB
Progress (1): 6.5 kB
Progress (1): 8.5 kB
Progress (1): 10 kB 
Progress (1): 11 kB
Progress (1): 13 kB
Progress (1): 15 kB
Progress (1): 18 kB
Progress (1): 21 kB
Progress (1): 23 kB
Progress (1): 25 kB
Progress (1): 29 kB
Progress (1): 32 kB
Progress (1): 33 kB
Progress (1): 38 kB
Progress (1): 41 kB
Progress (1): 45 kB
Progress (1): 47 kB
Progress (1): 50 kB
Progress (1): 52 kB
Progress (1): 56 kB
Progress (1): 58 kB
Progress (1): 59 kB
Progress (1): 63 kB
Progress (1): 66 kB
Progress (1): 70 kB
Progress (1): 72 kB
Progress (1): 75 kB
Progress (1): 77 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/66/commons-parent-66.pom (77 kB at 490 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.16.1/commons-codec-1.16.1.pom
Progress (1): 749 B
Progress (1): 1.9 kB
Progress (1): 3.8 kB
Progress (1): 6.3 kB
Progress (1): 8.7 kB
Progress (1): 11 kB 
Progress (1): 13 kB
Progress (1): 16 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.16.1/commons-codec-1.16.1.pom (16 kB at 107 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.14.0/commons-lang3-3.14.0.pom
Progress (1): 747 B
Progress (1): 2.1 kB
Progress (1): 4.7 kB
Progress (1): 8.4 kB
Progress (1): 12 kB 
Progress (1): 15 kB
Progress (1): 17 kB
Progress (1): 18 kB
Progress (1): 21 kB
Progress (1): 24 kB
Progress (1): 28 kB
Progress (1): 30 kB
Progress (1): 31 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.14.0/commons-lang3-3.14.0.pom (31 kB at 236 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/64/commons-parent-64.pom
Progress (1): 706 B
Progress (1): 1.9 kB
Progress (1): 3.1 kB
Progress (1): 4.7 kB
Progress (1): 6.4 kB
Progress (1): 8.4 kB
Progress (1): 10 kB 
Progress (1): 13 kB
Progress (1): 15 kB
Progress (1): 18 kB
Progress (1): 19 kB
Progress (1): 23 kB
Progress (1): 25 kB
Progress (1): 28 kB
Progress (1): 32 kB
Progress (1): 32 kB
Progress (1): 35 kB
Progress (1): 41 kB
Progress (1): 44 kB
Progress (1): 46 kB
Progress (1): 49 kB
Progress (1): 51 kB
Progress (1): 54 kB
Progress (1): 58 kB
Progress (1): 60 kB
Progress (1): 64 kB
Progress (1): 67 kB
Progress (1): 71 kB
Progress (1): 74 kB
Progress (1): 76 kB
Progress (1): 78 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/64/commons-parent-64.pom (78 kB at 696 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/iq80/snappy/snappy/0.4/snappy-0.4.pom
Progress (1): 1.2 kB
Progress (1): 3.7 kB
Progress (1): 8.5 kB
Progress (1): 12 kB 
Progress (1): 15 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/iq80/snappy/snappy/0.4/snappy-0.4.pom (15 kB at 122 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.9/xz-1.9.pom
Progress (1): 1.1 kB
Progress (1): 2.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.9/xz-1.9.pom (2.0 kB at 21 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.5-11/zstd-jni-1.5.5-11.pom
Progress (1): 1.1 kB
Progress (1): 2.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.5-11/zstd-jni-1.5.5-11.pom (2.0 kB at 20 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.27/plexus-interpolation-1.27.pom
Progress (1): 1.3 kB
Progress (1): 3.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.27/plexus-interpolation-1.27.pom (3.0 kB at 31 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/3.1.0/file-management-3.1.0.jar
Progress (1): 3.2/36 kB
Progress (1): 20/36 kB 
Progress (1): 36/36 kB
Progress (1): 36 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/file-management/3.1.0/file-management-3.1.0.jar (36 kB at 42 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.1/plexus-utils-4.0.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.16.1/commons-io-2.16.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.6.2/maven-archiver-3.6.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.27/plexus-interpolation-1.27.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.9.2/plexus-archiver-4.9.2.jar
Progress (1): 7.7/193 kB
Progress (1): 11/193 kB 
Progress (1): 28/193 kB
Progress (1): 44/193 kB
Progress (1): 61/193 kB
Progress (1): 77/193 kB
Progress (1): 93/193 kB
Progress (1): 110/193 kB
Progress (1): 126/193 kB
Progress (1): 142/193 kB
Progress (1): 159/193 kB
Progress (1): 175/193 kB
Progress (1): 192/193 kB
Progress (1): 193 kB    
Progress (2): 193 kB | 0.9/27 kB
Progress (2): 193 kB | 2.3/27 kB
Progress (2): 193 kB | 3.6/27 kB
Progress (2): 193 kB | 5.0/27 kB
Progress (2): 193 kB | 6.4/27 kB
Progress (2): 193 kB | 7.3/27 kB
Progress (2): 193 kB | 8.6/27 kB
Progress (2): 193 kB | 10/27 kB 
Progress (2): 193 kB | 11/27 kB
Progress (2): 193 kB | 13/27 kB
Progress (2): 193 kB | 14/27 kB
Progress (2): 193 kB | 15/27 kB
Progress (2): 193 kB | 17/27 kB
Progress (2): 193 kB | 18/27 kB
Progress (2): 193 kB | 20/27 kB
Progress (2): 193 kB | 21/27 kB
Progress (2): 193 kB | 22/27 kB
Progress (2): 193 kB | 24/27 kB
Progress (2): 193 kB | 25/27 kB
Progress (2): 193 kB | 26/27 kB
Progress (2): 193 kB | 27 kB   
Progress (3): 193 kB | 27 kB | 0.9/225 kB
Progress (4): 193 kB | 27 kB | 0.9/225 kB | 0.9/509 kB
Progress (4): 193 kB | 27 kB | 0.9/225 kB | 2.3/509 kB
Progress (4): 193 kB | 27 kB | 2.3/225 kB | 2.3/509 kB
Progress (4): 193 kB | 27 kB | 2.3/225 kB | 3.2/509 kB
Progress (4): 193 kB | 27 kB | 3.6/225 kB | 3.2/509 kB
Progress (4): 193 kB | 27 kB | 5.0/225 kB | 3.2/509 kB
Progress (4): 193 kB | 27 kB | 5.0/225 kB | 4.5/509 kB
Progress (4): 193 kB | 27 kB | 6.4/225 kB | 4.5/509 kB
Progress (4): 193 kB | 27 kB | 7.7/225 kB | 4.5/509 kB
Progress (4): 193 kB | 27 kB | 7.7/225 kB | 5.9/509 kB
Progress (4): 193 kB | 27 kB | 7.7/225 kB | 7.3/509 kB
Progress (4): 193 kB | 27 kB | 9.1/225 kB | 7.3/509 kB
Progress (4): 193 kB | 27 kB | 9.1/225 kB | 8.7/509 kB
Progress (4): 193 kB | 27 kB | 10/225 kB | 8.7/509 kB 
Progress (4): 193 kB | 27 kB | 10/225 kB | 10/509 kB 
Progress (4): 193 kB | 27 kB | 11/225 kB | 10/509 kB
Progress (4): 193 kB | 27 kB | 11/225 kB | 11/509 kB
Progress (4): 193 kB | 27 kB | 13/225 kB | 11/509 kB
Progress (4): 193 kB | 27 kB | 13/225 kB | 13/509 kB
Progress (4): 193 kB | 27 kB | 14/225 kB | 13/509 kB
Progress (4): 193 kB | 27 kB | 14/225 kB | 14/509 kB
Progress (4): 193 kB | 27 kB | 15/225 kB | 14/509 kB
Progress (4): 193 kB | 27 kB | 15/225 kB | 15/509 kB
Progress (4): 193 kB | 27 kB | 15/225 kB | 17/509 kB
Progress (4): 193 kB | 27 kB | 15/225 kB | 18/509 kB
Progress (4): 193 kB | 27 kB | 15/225 kB | 20/509 kB
Progress (4): 193 kB | 27 kB | 15/225 kB | 21/509 kB
Progress (4): 193 kB | 27 kB | 15/225 kB | 22/509 kB
Progress (4): 193 kB | 27 kB | 15/225 kB | 24/509 kB
Progress (4): 193 kB | 27 kB | 17/225 kB | 24/509 kB
Progress (4): 193 kB | 27 kB | 18/225 kB | 24/509 kB
Progress (4): 193 kB | 27 kB | 18/225 kB | 25/509 kB
Progress (4): 193 kB | 27 kB | 20/225 kB | 25/509 kB
Progress (4): 193 kB | 27 kB | 20/225 kB | 26/509 kB
Progress (4): 193 kB | 27 kB | 21/225 kB | 26/509 kB
Progress (4): 193 kB | 27 kB | 22/225 kB | 26/509 kB
Progress (4): 193 kB | 27 kB | 24/225 kB | 26/509 kB
Progress (4): 193 kB | 27 kB | 24/225 kB | 28/509 kB
Progress (4): 193 kB | 27 kB | 25/225 kB | 28/509 kB
Progress (4): 193 kB | 27 kB | 26/225 kB | 28/509 kB
Progress (4): 193 kB | 27 kB | 28/225 kB | 28/509 kB
Progress (4): 193 kB | 27 kB | 28/225 kB | 29/509 kB
Progress (4): 193 kB | 27 kB | 29/225 kB | 29/509 kB
Progress (4): 193 kB | 27 kB | 29/225 kB | 30/509 kB
Progress (4): 193 kB | 27 kB | 30/225 kB | 30/509 kB
Progress (4): 193 kB | 27 kB | 32/225 kB | 30/509 kB
Progress (4): 193 kB | 27 kB | 32/225 kB | 32/509 kB
Progress (4): 193 kB | 27 kB | 33/225 kB | 32/509 kB
Progress (4): 193 kB | 27 kB | 35/225 kB | 32/509 kB
Progress (4): 193 kB | 27 kB | 35/225 kB | 33/509 kB
Progress (4): 193 kB | 27 kB | 36/225 kB | 33/509 kB
Progress (4): 193 kB | 27 kB | 37/225 kB | 33/509 kB
Progress (4): 193 kB | 27 kB | 39/225 kB | 33/509 kB
Progress (4): 193 kB | 27 kB | 39/225 kB | 35/509 kB
Progress (4): 193 kB | 27 kB | 40/225 kB | 35/509 kB
Progress (4): 193 kB | 27 kB | 41/225 kB | 35/509 kB
Progress (4): 193 kB | 27 kB | 41/225 kB | 36/509 kB
Progress (4): 193 kB | 27 kB | 43/225 kB | 36/509 kB
Progress (4): 193 kB | 27 kB | 44/225 kB | 36/509 kB
Progress (4): 193 kB | 27 kB | 44/225 kB | 37/509 kB
Progress (4): 193 kB | 27 kB | 44/225 kB | 39/509 kB
Progress (4): 193 kB | 27 kB | 44/225 kB | 40/509 kB
Progress (4): 193 kB | 27 kB | 44/225 kB | 41/509 kB
Progress (4): 193 kB | 27 kB | 44/225 kB | 43/509 kB
Progress (4): 193 kB | 27 kB | 44/225 kB | 44/509 kB
Progress (4): 193 kB | 27 kB | 44/225 kB | 46/509 kB
Progress (4): 193 kB | 27 kB | 44/225 kB | 47/509 kB
Progress (4): 193 kB | 27 kB | 44/225 kB | 48/509 kB
Progress (4): 193 kB | 27 kB | 44/225 kB | 50/509 kB
Progress (4): 193 kB | 27 kB | 44/225 kB | 51/509 kB
Progress (5): 193 kB | 27 kB | 44/225 kB | 51/509 kB | 0.9/86 kB
Progress (5): 193 kB | 27 kB | 44/225 kB | 51/509 kB | 2.3/86 kB
Progress (5): 193 kB | 27 kB | 44/225 kB | 51/509 kB | 3.6/86 kB
Progress (5): 193 kB | 27 kB | 44/225 kB | 51/509 kB | 5.0/86 kB
Progress (5): 193 kB | 27 kB | 44/225 kB | 51/509 kB | 6.4/86 kB
Progress (5): 193 kB | 27 kB | 44/225 kB | 51/509 kB | 7.7/86 kB
Progress (5): 193 kB | 27 kB | 44/225 kB | 51/509 kB | 9.1/86 kB
Progress (5): 193 kB | 27 kB | 44/225 kB | 51/509 kB | 10/86 kB 
                                                               
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.1/plexus-utils-4.0.1.jar (193 kB at 982 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/3.4.2/plexus-io-3.4.2.jar
Progress (4): 27 kB | 44/225 kB | 52/509 kB | 10/86 kB
Progress (4): 27 kB | 44/225 kB | 52/509 kB | 11/86 kB
Progress (4): 27 kB | 46/225 kB | 52/509 kB | 11/86 kB
Progress (4): 27 kB | 46/225 kB | 54/509 kB | 11/86 kB
Progress (4): 27 kB | 46/225 kB | 54/509 kB | 13/86 kB
Progress (4): 27 kB | 47/225 kB | 54/509 kB | 13/86 kB
Progress (4): 27 kB | 47/225 kB | 54/509 kB | 14/86 kB
Progress (4): 27 kB | 47/225 kB | 55/509 kB | 14/86 kB
Progress (4): 27 kB | 48/225 kB | 55/509 kB | 14/86 kB
Progress (4): 27 kB | 48/225 kB | 55/509 kB | 15/86 kB
Progress (4): 27 kB | 50/225 kB | 55/509 kB | 15/86 kB
Progress (4): 27 kB | 50/225 kB | 59/509 kB | 15/86 kB
Progress (4): 27 kB | 51/225 kB | 59/509 kB | 15/86 kB
Progress (4): 27 kB | 51/225 kB | 61/509 kB | 15/86 kB
Progress (4): 27 kB | 52/225 kB | 61/509 kB | 15/86 kB
Progress (4): 27 kB | 52/225 kB | 61/509 kB | 17/86 kB
Progress (4): 27 kB | 54/225 kB | 61/509 kB | 17/86 kB
Progress (4): 27 kB | 54/225 kB | 61/509 kB | 18/86 kB
Progress (4): 27 kB | 55/225 kB | 61/509 kB | 18/86 kB
Progress (4): 27 kB | 55/225 kB | 61/509 kB | 20/86 kB
Progress (4): 27 kB | 59/225 kB | 61/509 kB | 20/86 kB
Progress (4): 27 kB | 59/225 kB | 61/509 kB | 21/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 21/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 22/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 24/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 25/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 26/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 28/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 29/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 31/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 32/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 33/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 35/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 36/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 37/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 39/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 40/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 41/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 43/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 44/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 46/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 47/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 48/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 50/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 51/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 52/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 54/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 55/86 kB
Progress (4): 27 kB | 61/225 kB | 61/509 kB | 59/86 kB
Progress (4): 27 kB | 61/225 kB | 65/509 kB | 59/86 kB
Progress (4): 27 kB | 65/225 kB | 65/509 kB | 59/86 kB
Progress (4): 27 kB | 69/225 kB | 65/509 kB | 59/86 kB
Progress (4): 27 kB | 73/225 kB | 65/509 kB | 59/86 kB
Progress (4): 27 kB | 73/225 kB | 69/509 kB | 59/86 kB
Progress (4): 27 kB | 77/225 kB | 69/509 kB | 59/86 kB
Progress (4): 27 kB | 82/225 kB | 69/509 kB | 59/86 kB
Progress (4): 27 kB | 82/225 kB | 73/509 kB | 59/86 kB
Progress (4): 27 kB | 82/225 kB | 77/509 kB | 59/86 kB
Progress (4): 27 kB | 82/225 kB | 82/509 kB | 59/86 kB
Progress (4): 27 kB | 82/225 kB | 86/509 kB | 59/86 kB
Progress (4): 27 kB | 82/225 kB | 90/509 kB | 59/86 kB
Progress (4): 27 kB | 86/225 kB | 90/509 kB | 59/86 kB
Progress (4): 27 kB | 86/225 kB | 94/509 kB | 59/86 kB
Progress (4): 27 kB | 86/225 kB | 94/509 kB | 64/86 kB
Progress (4): 27 kB | 86/225 kB | 99/509 kB | 64/86 kB
Progress (4): 27 kB | 90/225 kB | 99/509 kB | 64/86 kB
Progress (4): 27 kB | 94/225 kB | 99/509 kB | 64/86 kB
Progress (4): 27 kB | 94/225 kB | 99/509 kB | 68/86 kB
Progress (4): 27 kB | 94/225 kB | 99/509 kB | 72/86 kB
Progress (4): 27 kB | 94/225 kB | 103/509 kB | 72/86 kB
Progress (4): 27 kB | 99/225 kB | 103/509 kB | 72/86 kB
Progress (4): 27 kB | 99/225 kB | 107/509 kB | 72/86 kB
Progress (4): 27 kB | 103/225 kB | 107/509 kB | 72/86 kB
Progress (4): 27 kB | 107/225 kB | 107/509 kB | 72/86 kB
Progress (4): 27 kB | 107/225 kB | 111/509 kB | 72/86 kB
Progress (4): 27 kB | 107/225 kB | 115/509 kB | 72/86 kB
Progress (4): 27 kB | 107/225 kB | 115/509 kB | 76/86 kB
Progress (4): 27 kB | 111/225 kB | 115/509 kB | 76/86 kB
Progress (4): 27 kB | 111/225 kB | 120/509 kB | 76/86 kB
Progress (4): 27 kB | 111/225 kB | 120/509 kB | 81/86 kB
Progress (4): 27 kB | 115/225 kB | 120/509 kB | 81/86 kB
Progress (4): 27 kB | 115/225 kB | 124/509 kB | 81/86 kB
Progress (4): 27 kB | 115/225 kB | 126/509 kB | 81/86 kB
Progress (4): 27 kB | 115/225 kB | 126/509 kB | 85/86 kB
Progress (4): 27 kB | 120/225 kB | 126/509 kB | 85/86 kB
Progress (4): 27 kB | 120/225 kB | 126/509 kB | 86 kB   
Progress (4): 27 kB | 124/225 kB | 126/509 kB | 86 kB
Progress (4): 27 kB | 124/225 kB | 130/509 kB | 86 kB
Progress (4): 27 kB | 126/225 kB | 130/509 kB | 86 kB
Progress (4): 27 kB | 130/225 kB | 130/509 kB | 86 kB
Progress (4): 27 kB | 130/225 kB | 135/509 kB | 86 kB
Progress (4): 27 kB | 130/225 kB | 139/509 kB | 86 kB
Progress (4): 27 kB | 130/225 kB | 143/509 kB | 86 kB
Progress (4): 27 kB | 135/225 kB | 143/509 kB | 86 kB
Progress (4): 27 kB | 139/225 kB | 143/509 kB | 86 kB
Progress (4): 27 kB | 139/225 kB | 147/509 kB | 86 kB
Progress (4): 27 kB | 143/225 kB | 147/509 kB | 86 kB
Progress (5): 27 kB | 143/225 kB | 147/509 kB | 86 kB | 0.9/79 kB
Progress (5): 27 kB | 143/225 kB | 147/509 kB | 86 kB | 2.3/79 kB
Progress (5): 27 kB | 143/225 kB | 147/509 kB | 86 kB | 3.6/79 kB
Progress (5): 27 kB | 143/225 kB | 147/509 kB | 86 kB | 5.0/79 kB
Progress (5): 27 kB | 143/225 kB | 147/509 kB | 86 kB | 6.4/79 kB
Progress (5): 27 kB | 143/225 kB | 147/509 kB | 86 kB | 7.7/79 kB
Progress (5): 27 kB | 143/225 kB | 147/509 kB | 86 kB | 9.1/79 kB
Progress (5): 27 kB | 143/225 kB | 147/509 kB | 86 kB | 10/79 kB 
Progress (5): 27 kB | 143/225 kB | 147/509 kB | 86 kB | 11/79 kB
Progress (5): 27 kB | 143/225 kB | 147/509 kB | 86 kB | 13/79 kB
Progress (5): 27 kB | 143/225 kB | 147/509 kB | 86 kB | 14/79 kB
Progress (5): 27 kB | 143/225 kB | 147/509 kB | 86 kB | 15/79 kB
Progress (5): 27 kB | 143/225 kB | 147/509 kB | 86 kB | 17/79 kB
Progress (5): 27 kB | 143/225 kB | 147/509 kB | 86 kB | 18/79 kB
Progress (5): 27 kB | 143/225 kB | 147/509 kB | 86 kB | 20/79 kB
Progress (5): 27 kB | 143/225 kB | 147/509 kB | 86 kB | 21/79 kB
Progress (5): 27 kB | 143/225 kB | 147/509 kB | 86 kB | 22/79 kB
Progress (5): 27 kB | 147/225 kB | 147/509 kB | 86 kB | 22/79 kB
Progress (5): 27 kB | 147/225 kB | 151/509 kB | 86 kB | 22/79 kB
Progress (5): 27 kB | 147/225 kB | 151/509 kB | 86 kB | 24/79 kB
Progress (5): 27 kB | 147/225 kB | 151/509 kB | 86 kB | 25/79 kB
Progress (5): 27 kB | 147/225 kB | 156/509 kB | 86 kB | 25/79 kB
Progress (5): 27 kB | 151/225 kB | 156/509 kB | 86 kB | 25/79 kB
Progress (5): 27 kB | 151/225 kB | 156/509 kB | 86 kB | 26/79 kB
Progress (5): 27 kB | 156/225 kB | 156/509 kB | 86 kB | 26/79 kB
Progress (5): 27 kB | 156/225 kB | 160/509 kB | 86 kB | 26/79 kB
Progress (5): 27 kB | 156/225 kB | 160/509 kB | 86 kB | 31/79 kB
Progress (5): 27 kB | 156/225 kB | 160/509 kB | 86 kB | 35/79 kB
Progress (5): 27 kB | 156/225 kB | 160/509 kB | 86 kB | 39/79 kB
Progress (5): 27 kB | 156/225 kB | 160/509 kB | 86 kB | 43/79 kB
Progress (5): 27 kB | 156/225 kB | 160/509 kB | 86 kB | 48/79 kB
Progress (5): 27 kB | 156/225 kB | 160/509 kB | 86 kB | 52/79 kB
Progress (5): 27 kB | 156/225 kB | 160/509 kB | 86 kB | 56/79 kB
Progress (5): 27 kB | 156/225 kB | 160/509 kB | 86 kB | 60/79 kB
Progress (5): 27 kB | 156/225 kB | 160/509 kB | 86 kB | 61/79 kB
                                                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.27/plexus-interpolation-1.27.jar (86 kB at 265 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.26.1/commons-compress-1.26.1.jar
Progress (4): 27 kB | 160/225 kB | 160/509 kB | 61/79 kB
Progress (4): 27 kB | 160/225 kB | 164/509 kB | 61/79 kB
Progress (4): 27 kB | 164/225 kB | 164/509 kB | 61/79 kB
Progress (4): 27 kB | 164/225 kB | 168/509 kB | 61/79 kB
Progress (4): 27 kB | 168/225 kB | 168/509 kB | 61/79 kB
Progress (4): 27 kB | 168/225 kB | 173/509 kB | 61/79 kB
Progress (4): 27 kB | 173/225 kB | 173/509 kB | 61/79 kB
Progress (4): 27 kB | 173/225 kB | 177/509 kB | 61/79 kB
Progress (4): 27 kB | 177/225 kB | 177/509 kB | 61/79 kB
Progress (4): 27 kB | 177/225 kB | 181/509 kB | 61/79 kB
Progress (4): 27 kB | 181/225 kB | 181/509 kB | 61/79 kB
Progress (4): 27 kB | 181/225 kB | 185/509 kB | 61/79 kB
Progress (4): 27 kB | 185/225 kB | 185/509 kB | 61/79 kB
Progress (4): 27 kB | 185/225 kB | 189/509 kB | 61/79 kB
Progress (4): 27 kB | 185/225 kB | 192/509 kB | 61/79 kB
Progress (4): 27 kB | 189/225 kB | 192/509 kB | 61/79 kB
Progress (4): 27 kB | 189/225 kB | 192/509 kB | 65/79 kB
Progress (4): 27 kB | 194/225 kB | 192/509 kB | 65/79 kB
Progress (4): 27 kB | 194/225 kB | 196/509 kB | 65/79 kB
Progress (4): 27 kB | 194/225 kB | 200/509 kB | 65/79 kB
Progress (4): 27 kB | 198/225 kB | 200/509 kB | 65/79 kB
Progress (4): 27 kB | 198/225 kB | 204/509 kB | 65/79 kB
Progress (4): 27 kB | 198/225 kB | 208/509 kB | 65/79 kB
Progress (4): 27 kB | 202/225 kB | 208/509 kB | 65/79 kB
Progress (4): 27 kB | 206/225 kB | 208/509 kB | 65/79 kB
Progress (4): 27 kB | 206/225 kB | 213/509 kB | 65/79 kB
Progress (4): 27 kB | 211/225 kB | 213/509 kB | 65/79 kB
Progress (4): 27 kB | 211/225 kB | 217/509 kB | 65/79 kB
Progress (4): 27 kB | 215/225 kB | 217/509 kB | 65/79 kB
Progress (4): 27 kB | 219/225 kB | 217/509 kB | 65/79 kB
Progress (4): 27 kB | 225 kB | 217/509 kB | 65/79 kB    
Progress (4): 27 kB | 225 kB | 233/509 kB | 65/79 kB
Progress (4): 27 kB | 225 kB | 233/509 kB | 69/79 kB
Progress (4): 27 kB | 225 kB | 250/509 kB | 69/79 kB
Progress (4): 27 kB | 225 kB | 250/509 kB | 73/79 kB
Progress (4): 27 kB | 225 kB | 250/509 kB | 77/79 kB
Progress (4): 27 kB | 225 kB | 266/509 kB | 77/79 kB
Progress (4): 27 kB | 225 kB | 266/509 kB | 79 kB   
Progress (4): 27 kB | 225 kB | 282/509 kB | 79 kB
Progress (4): 27 kB | 225 kB | 299/509 kB | 79 kB
Progress (5): 27 kB | 225 kB | 299/509 kB | 79 kB | 0/1.1 MB
Progress (5): 27 kB | 225 kB | 299/509 kB | 79 kB | 0/1.1 MB
Progress (5): 27 kB | 225 kB | 299/509 kB | 79 kB | 0/1.1 MB
Progress (5): 27 kB | 225 kB | 299/509 kB | 79 kB | 0/1.1 MB
Progress (5): 27 kB | 225 kB | 299/509 kB | 79 kB | 0/1.1 MB
Progress (5): 27 kB | 225 kB | 299/509 kB | 79 kB | 0/1.1 MB
Progress (5): 27 kB | 225 kB | 299/509 kB | 79 kB | 0/1.1 MB
Progress (5): 27 kB | 225 kB | 299/509 kB | 79 kB | 0/1.1 MB
Progress (5): 27 kB | 225 kB | 299/509 kB | 79 kB | 0/1.1 MB
Progress (5): 27 kB | 225 kB | 299/509 kB | 79 kB | 0/1.1 MB
Progress (5): 27 kB | 225 kB | 299/509 kB | 79 kB | 0/1.1 MB
Progress (5): 27 kB | 225 kB | 315/509 kB | 79 kB | 0/1.1 MB
Progress (5): 27 kB | 225 kB | 315/509 kB | 79 kB | 0/1.1 MB
Progress (5): 27 kB | 225 kB | 315/509 kB | 79 kB | 0.1/1.1 MB
Progress (5): 27 kB | 225 kB | 315/509 kB | 79 kB | 0.1/1.1 MB
Progress (5): 27 kB | 225 kB | 315/509 kB | 79 kB | 0.1/1.1 MB
Progress (5): 27 kB | 225 kB | 323/509 kB | 79 kB | 0.1/1.1 MB
Progress (5): 27 kB | 225 kB | 339/509 kB | 79 kB | 0.1/1.1 MB
Progress (5): 27 kB | 225 kB | 355/509 kB | 79 kB | 0.1/1.1 MB
Progress (5): 27 kB | 225 kB | 372/509 kB | 79 kB | 0.1/1.1 MB
Progress (5): 27 kB | 225 kB | 372/509 kB | 79 kB | 0.1/1.1 MB
Progress (5): 27 kB | 225 kB | 388/509 kB | 79 kB | 0.1/1.1 MB
Progress (5): 27 kB | 225 kB | 388/509 kB | 79 kB | 0.1/1.1 MB
Progress (5): 27 kB | 225 kB | 388/509 kB | 79 kB | 0.1/1.1 MB
Progress (5): 27 kB | 225 kB | 405/509 kB | 79 kB | 0.1/1.1 MB
Progress (5): 27 kB | 225 kB | 421/509 kB | 79 kB | 0.1/1.1 MB
Progress (5): 27 kB | 225 kB | 421/509 kB | 79 kB | 0.1/1.1 MB
Progress (5): 27 kB | 225 kB | 437/509 kB | 79 kB | 0.1/1.1 MB
Progress (5): 27 kB | 225 kB | 437/509 kB | 79 kB | 0.1/1.1 MB
Progress (5): 27 kB | 225 kB | 437/509 kB | 79 kB | 0.1/1.1 MB
                                                              
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-io/3.4.2/plexus-io-3.4.2.jar (79 kB at 173 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.14.0/commons-lang3-3.14.0.jar
Progress (4): 27 kB | 225 kB | 437/509 kB | 0.1/1.1 MB
Progress (4): 27 kB | 225 kB | 437/509 kB | 0.1/1.1 MB
Progress (4): 27 kB | 225 kB | 437/509 kB | 0.1/1.1 MB
Progress (4): 27 kB | 225 kB | 437/509 kB | 0.1/1.1 MB
Progress (4): 27 kB | 225 kB | 437/509 kB | 0.1/1.1 MB
Progress (4): 27 kB | 225 kB | 437/509 kB | 0.1/1.1 MB
Progress (4): 27 kB | 225 kB | 454/509 kB | 0.1/1.1 MB
Progress (4): 27 kB | 225 kB | 454/509 kB | 0.1/1.1 MB
Progress (4): 27 kB | 225 kB | 454/509 kB | 0.1/1.1 MB
Progress (4): 27 kB | 225 kB | 454/509 kB | 0.1/1.1 MB
Progress (4): 27 kB | 225 kB | 470/509 kB | 0.1/1.1 MB
                                                      
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-archiver/4.9.2/plexus-archiver-4.9.2.jar (225 kB at 474 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.16.1/commons-codec-1.16.1.jar
Progress (3): 27 kB | 470/509 kB | 0.1/1.1 MB
Progress (3): 27 kB | 486/509 kB | 0.1/1.1 MB
Progress (3): 27 kB | 486/509 kB | 0.1/1.1 MB
Progress (3): 27 kB | 486/509 kB | 0.1/1.1 MB
Progress (3): 27 kB | 486/509 kB | 0.2/1.1 MB
Progress (3): 27 kB | 486/509 kB | 0.2/1.1 MB
Progress (3): 27 kB | 486/509 kB | 0.2/1.1 MB
Progress (3): 27 kB | 503/509 kB | 0.2/1.1 MB
Progress (3): 27 kB | 509 kB | 0.2/1.1 MB    
Progress (3): 27 kB | 509 kB | 0.2/1.1 MB
Progress (3): 27 kB | 509 kB | 0.2/1.1 MB
Progress (3): 27 kB | 509 kB | 0.2/1.1 MB
Progress (3): 27 kB | 509 kB | 0.3/1.1 MB
Progress (4): 27 kB | 509 kB | 0.3/1.1 MB | 3.2/365 kB
Progress (5): 27 kB | 509 kB | 0.3/1.1 MB | 3.2/365 kB | 3.8/658 kB
Progress (5): 27 kB | 509 kB | 0.3/1.1 MB | 3.2/365 kB | 7.7/658 kB
Progress (5): 27 kB | 509 kB | 0.3/1.1 MB | 3.2/365 kB | 12/658 kB 
Progress (5): 27 kB | 509 kB | 0.3/1.1 MB | 20/365 kB | 12/658 kB 
Progress (5): 27 kB | 509 kB | 0.3/1.1 MB | 20/365 kB | 16/658 kB
Progress (5): 27 kB | 509 kB | 0.3/1.1 MB | 20/365 kB | 20/658 kB
Progress (5): 27 kB | 509 kB | 0.3/1.1 MB | 20/365 kB | 24/658 kB
Progress (5): 27 kB | 509 kB | 0.3/1.1 MB | 20/365 kB | 28/658 kB
Progress (5): 27 kB | 509 kB | 0.3/1.1 MB | 20/365 kB | 33/658 kB
Progress (5): 27 kB | 509 kB | 0.3/1.1 MB | 20/365 kB | 37/658 kB
Progress (5): 27 kB | 509 kB | 0.3/1.1 MB | 20/365 kB | 41/658 kB
Progress (5): 27 kB | 509 kB | 0.3/1.1 MB | 28/365 kB | 41/658 kB
Progress (5): 27 kB | 509 kB | 0.3/1.1 MB | 28/365 kB | 45/658 kB
Progress (5): 27 kB | 509 kB | 0.3/1.1 MB | 28/365 kB | 49/658 kB
                                                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-archiver/3.6.2/maven-archiver-3.6.2.jar (27 kB at 43 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/iq80/snappy/snappy/0.4/snappy-0.4.jar
Progress (4): 509 kB | 0.3/1.1 MB | 28/365 kB | 54/658 kB
Progress (4): 509 kB | 0.3/1.1 MB | 28/365 kB | 57/658 kB
Progress (4): 509 kB | 0.3/1.1 MB | 44/365 kB | 57/658 kB
Progress (4): 509 kB | 0.3/1.1 MB | 44/365 kB | 61/658 kB
Progress (4): 509 kB | 0.3/1.1 MB | 49/365 kB | 61/658 kB
Progress (4): 509 kB | 0.3/1.1 MB | 49/365 kB | 65/658 kB
Progress (4): 509 kB | 0.3/1.1 MB | 49/365 kB | 70/658 kB
Progress (4): 509 kB | 0.3/1.1 MB | 49/365 kB | 74/658 kB
Progress (4): 509 kB | 0.3/1.1 MB | 66/365 kB | 74/658 kB
                                                         
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.16.1/commons-io-2.16.1.jar (509 kB at 799 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.9/xz-1.9.jar
Progress (3): 0.3/1.1 MB | 82/365 kB | 74/658 kB
Progress (3): 0.3/1.1 MB | 93/365 kB | 74/658 kB
Progress (3): 0.3/1.1 MB | 110/365 kB | 74/658 kB
Progress (3): 0.3/1.1 MB | 110/365 kB | 74/658 kB
Progress (3): 0.3/1.1 MB | 110/365 kB | 74/658 kB
Progress (3): 0.3/1.1 MB | 110/365 kB | 74/658 kB
Progress (3): 0.3/1.1 MB | 110/365 kB | 74/658 kB
Progress (3): 0.3/1.1 MB | 110/365 kB | 74/658 kB
Progress (3): 0.4/1.1 MB | 110/365 kB | 74/658 kB
Progress (3): 0.4/1.1 MB | 110/365 kB | 78/658 kB
Progress (3): 0.4/1.1 MB | 110/365 kB | 78/658 kB
Progress (3): 0.4/1.1 MB | 126/365 kB | 78/658 kB
Progress (3): 0.4/1.1 MB | 126/365 kB | 78/658 kB
Progress (3): 0.4/1.1 MB | 126/365 kB | 82/658 kB
Progress (3): 0.4/1.1 MB | 126/365 kB | 86/658 kB
Progress (3): 0.4/1.1 MB | 126/365 kB | 91/658 kB
Progress (3): 0.4/1.1 MB | 142/365 kB | 91/658 kB
Progress (3): 0.4/1.1 MB | 142/365 kB | 95/658 kB
Progress (3): 0.4/1.1 MB | 142/365 kB | 99/658 kB
Progress (3): 0.4/1.1 MB | 142/365 kB | 103/658 kB
Progress (3): 0.4/1.1 MB | 159/365 kB | 103/658 kB
Progress (3): 0.4/1.1 MB | 159/365 kB | 108/658 kB
Progress (3): 0.4/1.1 MB | 175/365 kB | 108/658 kB
Progress (3): 0.4/1.1 MB | 175/365 kB | 122/658 kB
Progress (3): 0.4/1.1 MB | 175/365 kB | 122/658 kB
Progress (3): 0.4/1.1 MB | 192/365 kB | 122/658 kB
Progress (3): 0.4/1.1 MB | 192/365 kB | 139/658 kB
Progress (4): 0.4/1.1 MB | 192/365 kB | 139/658 kB | 3.2/58 kB
Progress (4): 0.4/1.1 MB | 192/365 kB | 139/658 kB | 11/58 kB 
Progress (4): 0.4/1.1 MB | 192/365 kB | 139/658 kB | 28/58 kB
Progress (4): 0.4/1.1 MB | 192/365 kB | 139/658 kB | 44/58 kB
Progress (4): 0.4/1.1 MB | 192/365 kB | 139/658 kB | 58 kB   
Progress (4): 0.4/1.1 MB | 192/365 kB | 139/658 kB | 58 kB
Progress (4): 0.4/1.1 MB | 208/365 kB | 139/658 kB | 58 kB
Progress (4): 0.4/1.1 MB | 208/365 kB | 139/658 kB | 58 kB
Progress (4): 0.4/1.1 MB | 224/365 kB | 139/658 kB | 58 kB
Progress (4): 0.4/1.1 MB | 241/365 kB | 139/658 kB | 58 kB
Progress (5): 0.4/1.1 MB | 241/365 kB | 139/658 kB | 58 kB | 7.7/116 kB
Progress (5): 0.4/1.1 MB | 241/365 kB | 139/658 kB | 58 kB | 7.7/116 kB
Progress (5): 0.4/1.1 MB | 241/365 kB | 139/658 kB | 58 kB | 7.7/116 kB
Progress (5): 0.4/1.1 MB | 241/365 kB | 139/658 kB | 58 kB | 24/116 kB 
Progress (5): 0.4/1.1 MB | 241/365 kB | 139/658 kB | 58 kB | 40/116 kB
Progress (5): 0.4/1.1 MB | 241/365 kB | 139/658 kB | 58 kB | 57/116 kB
Progress (5): 0.4/1.1 MB | 241/365 kB | 139/658 kB | 58 kB | 73/116 kB
Progress (5): 0.4/1.1 MB | 241/365 kB | 139/658 kB | 58 kB | 90/116 kB
Progress (5): 0.4/1.1 MB | 241/365 kB | 139/658 kB | 58 kB | 90/116 kB
Progress (5): 0.4/1.1 MB | 241/365 kB | 139/658 kB | 58 kB | 106/116 kB
Progress (5): 0.4/1.1 MB | 241/365 kB | 139/658 kB | 58 kB | 116 kB    
Progress (5): 0.4/1.1 MB | 241/365 kB | 155/658 kB | 58 kB | 116 kB
Progress (5): 0.4/1.1 MB | 257/365 kB | 155/658 kB | 58 kB | 116 kB
Progress (5): 0.4/1.1 MB | 257/365 kB | 172/658 kB | 58 kB | 116 kB
Progress (5): 0.4/1.1 MB | 257/365 kB | 188/658 kB | 58 kB | 116 kB
Progress (5): 0.4/1.1 MB | 257/365 kB | 204/658 kB | 58 kB | 116 kB
Progress (5): 0.4/1.1 MB | 257/365 kB | 221/658 kB | 58 kB | 116 kB
Progress (5): 0.4/1.1 MB | 257/365 kB | 237/658 kB | 58 kB | 116 kB
Progress (5): 0.4/1.1 MB | 257/365 kB | 253/658 kB | 58 kB | 116 kB
Progress (5): 0.4/1.1 MB | 257/365 kB | 270/658 kB | 58 kB | 116 kB
Progress (5): 0.4/1.1 MB | 274/365 kB | 270/658 kB | 58 kB | 116 kB
Progress (5): 0.4/1.1 MB | 274/365 kB | 286/658 kB | 58 kB | 116 kB
Progress (5): 0.5/1.1 MB | 274/365 kB | 286/658 kB | 58 kB | 116 kB
Progress (5): 0.5/1.1 MB | 290/365 kB | 286/658 kB | 58 kB | 116 kB
Progress (5): 0.5/1.1 MB | 306/365 kB | 286/658 kB | 58 kB | 116 kB
Progress (5): 0.5/1.1 MB | 323/365 kB | 286/658 kB | 58 kB | 116 kB
Progress (5): 0.5/1.1 MB | 323/365 kB | 286/658 kB | 58 kB | 116 kB
                                                                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/iq80/snappy/snappy/0.4/snappy-0.4.jar (58 kB at 69 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.5-11/zstd-jni-1.5.5-11.jar
Progress (4): 0.5/1.1 MB | 323/365 kB | 303/658 kB | 116 kB
Progress (4): 0.5/1.1 MB | 323/365 kB | 303/658 kB | 116 kB
Progress (4): 0.5/1.1 MB | 339/365 kB | 303/658 kB | 116 kB
Progress (4): 0.5/1.1 MB | 339/365 kB | 303/658 kB | 116 kB
Progress (4): 0.5/1.1 MB | 339/365 kB | 303/658 kB | 116 kB
                                                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/tukaani/xz/1.9/xz-1.9.jar (116 kB at 134 kB/s)
Progress (3): 0.5/1.1 MB | 339/365 kB | 303/658 kB
Progress (3): 0.5/1.1 MB | 355/365 kB | 303/658 kB
Progress (3): 0.5/1.1 MB | 355/365 kB | 319/658 kB
Progress (3): 0.5/1.1 MB | 355/365 kB | 335/658 kB
Progress (4): 0.5/1.1 MB | 355/365 kB | 335/658 kB | 0/6.8 MB
Progress (4): 0.5/1.1 MB | 355/365 kB | 335/658 kB | 0/6.8 MB
Progress (4): 0.5/1.1 MB | 355/365 kB | 335/658 kB | 0/6.8 MB
Progress (4): 0.6/1.1 MB | 355/365 kB | 335/658 kB | 0/6.8 MB
Progress (4): 0.6/1.1 MB | 355/365 kB | 335/658 kB | 0/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 335/658 kB | 0/6.8 MB    
Progress (4): 0.6/1.1 MB | 365 kB | 335/658 kB | 0.1/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 335/658 kB | 0.1/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 335/658 kB | 0.1/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 335/658 kB | 0.1/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 352/658 kB | 0.1/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 352/658 kB | 0.1/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 352/658 kB | 0.1/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 352/658 kB | 0.1/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 352/658 kB | 0.1/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 352/658 kB | 0.1/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 352/658 kB | 0.1/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 352/658 kB | 0.2/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 368/658 kB | 0.2/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 368/658 kB | 0.2/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 368/658 kB | 0.2/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 368/658 kB | 0.2/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 385/658 kB | 0.2/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 385/658 kB | 0.2/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 385/658 kB | 0.2/6.8 MB
Progress (4): 0.6/1.1 MB | 365 kB | 385/658 kB | 0.2/6.8 MB
Progress (4): 0.7/1.1 MB | 365 kB | 385/658 kB | 0.2/6.8 MB
Progress (4): 0.7/1.1 MB | 365 kB | 385/658 kB | 0.3/6.8 MB
Progress (4): 0.7/1.1 MB | 365 kB | 385/658 kB | 0.3/6.8 MB
Progress (4): 0.7/1.1 MB | 365 kB | 385/658 kB | 0.3/6.8 MB
Progress (4): 0.7/1.1 MB | 365 kB | 385/658 kB | 0.3/6.8 MB
Progress (4): 0.7/1.1 MB | 365 kB | 385/658 kB | 0.3/6.8 MB
Progress (4): 0.7/1.1 MB | 365 kB | 385/658 kB | 0.3/6.8 MB
Progress (4): 0.7/1.1 MB | 365 kB | 385/658 kB | 0.3/6.8 MB
Progress (4): 0.7/1.1 MB | 365 kB | 385/658 kB | 0.4/6.8 MB
Progress (4): 0.7/1.1 MB | 365 kB | 401/658 kB | 0.4/6.8 MB
Progress (4): 0.7/1.1 MB | 365 kB | 401/658 kB | 0.4/6.8 MB
Progress (4): 0.7/1.1 MB | 365 kB | 401/658 kB | 0.4/6.8 MB
Progress (4): 0.7/1.1 MB | 365 kB | 401/658 kB | 0.4/6.8 MB
                                                           
Downloaded from central: https://repo.maven.apache.org/maven2/commons-codec/commons-codec/1.16.1/commons-codec-1.16.1.jar (365 kB at 373 kB/s)
Progress (3): 0.7/1.1 MB | 401/658 kB | 0.4/6.8 MB
Progress (3): 0.7/1.1 MB | 401/658 kB | 0.4/6.8 MB
Progress (3): 0.7/1.1 MB | 417/658 kB | 0.4/6.8 MB
Progress (3): 0.7/1.1 MB | 434/658 kB | 0.4/6.8 MB
Progress (3): 0.7/1.1 MB | 434/658 kB | 0.4/6.8 MB
Progress (3): 0.7/1.1 MB | 434/658 kB | 0.4/6.8 MB
Progress (3): 0.7/1.1 MB | 450/658 kB | 0.4/6.8 MB
Progress (3): 0.7/1.1 MB | 466/658 kB | 0.4/6.8 MB
Progress (3): 0.7/1.1 MB | 483/658 kB | 0.4/6.8 MB
Progress (3): 0.7/1.1 MB | 483/658 kB | 0.4/6.8 MB
Progress (3): 0.7/1.1 MB | 483/658 kB | 0.4/6.8 MB
Progress (3): 0.7/1.1 MB | 499/658 kB | 0.4/6.8 MB
Progress (3): 0.7/1.1 MB | 499/658 kB | 0.4/6.8 MB
Progress (3): 0.7/1.1 MB | 499/658 kB | 0.5/6.8 MB
Progress (3): 0.7/1.1 MB | 499/658 kB | 0.5/6.8 MB
Progress (3): 0.7/1.1 MB | 499/658 kB | 0.5/6.8 MB
Progress (3): 0.7/1.1 MB | 499/658 kB | 0.5/6.8 MB
Progress (3): 0.7/1.1 MB | 499/658 kB | 0.5/6.8 MB
Progress (3): 0.7/1.1 MB | 499/658 kB | 0.5/6.8 MB
Progress (3): 0.7/1.1 MB | 499/658 kB | 0.5/6.8 MB
Progress (3): 0.7/1.1 MB | 499/658 kB | 0.6/6.8 MB
Progress (3): 0.7/1.1 MB | 499/658 kB | 0.6/6.8 MB
Progress (3): 0.7/1.1 MB | 499/658 kB | 0.6/6.8 MB
Progress (3): 0.8/1.1 MB | 499/658 kB | 0.6/6.8 MB
Progress (3): 0.8/1.1 MB | 499/658 kB | 0.6/6.8 MB
Progress (3): 0.8/1.1 MB | 499/658 kB | 0.6/6.8 MB
Progress (3): 0.8/1.1 MB | 516/658 kB | 0.6/6.8 MB
Progress (3): 0.8/1.1 MB | 516/658 kB | 0.6/6.8 MB
Progress (3): 0.8/1.1 MB | 532/658 kB | 0.6/6.8 MB
Progress (3): 0.8/1.1 MB | 532/658 kB | 0.6/6.8 MB
Progress (3): 0.8/1.1 MB | 548/658 kB | 0.6/6.8 MB
Progress (3): 0.8/1.1 MB | 565/658 kB | 0.6/6.8 MB
Progress (3): 0.8/1.1 MB | 565/658 kB | 0.6/6.8 MB
Progress (3): 0.8/1.1 MB | 581/658 kB | 0.6/6.8 MB
Progress (3): 0.8/1.1 MB | 581/658 kB | 0.6/6.8 MB
Progress (3): 0.8/1.1 MB | 581/658 kB | 0.6/6.8 MB
Progress (3): 0.8/1.1 MB | 598/658 kB | 0.6/6.8 MB
Progress (3): 0.8/1.1 MB | 598/658 kB | 0.6/6.8 MB
Progress (3): 0.8/1.1 MB | 598/658 kB | 0.7/6.8 MB
Progress (3): 0.9/1.1 MB | 598/658 kB | 0.7/6.8 MB
Progress (3): 0.9/1.1 MB | 598/658 kB | 0.7/6.8 MB
Progress (3): 0.9/1.1 MB | 598/658 kB | 0.7/6.8 MB
Progress (3): 0.9/1.1 MB | 598/658 kB | 0.7/6.8 MB
Progress (3): 0.9/1.1 MB | 598/658 kB | 0.7/6.8 MB
Progress (3): 0.9/1.1 MB | 598/658 kB | 0.7/6.8 MB
Progress (3): 0.9/1.1 MB | 614/658 kB | 0.7/6.8 MB
Progress (3): 0.9/1.1 MB | 614/658 kB | 0.7/6.8 MB
Progress (3): 0.9/1.1 MB | 614/658 kB | 0.8/6.8 MB
Progress (3): 0.9/1.1 MB | 614/658 kB | 0.8/6.8 MB
Progress (3): 0.9/1.1 MB | 614/658 kB | 0.8/6.8 MB
Progress (3): 0.9/1.1 MB | 614/658 kB | 0.8/6.8 MB
Progress (3): 0.9/1.1 MB | 614/658 kB | 0.8/6.8 MB
Progress (3): 0.9/1.1 MB | 614/658 kB | 0.8/6.8 MB
Progress (3): 0.9/1.1 MB | 630/658 kB | 0.8/6.8 MB
Progress (3): 0.9/1.1 MB | 630/658 kB | 0.8/6.8 MB
Progress (3): 0.9/1.1 MB | 647/658 kB | 0.8/6.8 MB
Progress (3): 0.9/1.1 MB | 647/658 kB | 0.8/6.8 MB
Progress (3): 1.0/1.1 MB | 647/658 kB | 0.8/6.8 MB
Progress (3): 1.0/1.1 MB | 658 kB | 0.8/6.8 MB    
Progress (3): 1.0/1.1 MB | 658 kB | 0.8/6.8 MB
Progress (3): 1.0/1.1 MB | 658 kB | 0.8/6.8 MB
Progress (3): 1.0/1.1 MB | 658 kB | 0.8/6.8 MB
Progress (3): 1.0/1.1 MB | 658 kB | 0.9/6.8 MB
Progress (3): 1.0/1.1 MB | 658 kB | 0.9/6.8 MB
Progress (3): 1.0/1.1 MB | 658 kB | 0.9/6.8 MB
Progress (3): 1.0/1.1 MB | 658 kB | 0.9/6.8 MB
Progress (3): 1.0/1.1 MB | 658 kB | 0.9/6.8 MB
Progress (3): 1.0/1.1 MB | 658 kB | 0.9/6.8 MB
Progress (3): 1.0/1.1 MB | 658 kB | 0.9/6.8 MB
Progress (3): 1.0/1.1 MB | 658 kB | 0.9/6.8 MB
Progress (3): 1.0/1.1 MB | 658 kB | 1.0/6.8 MB
Progress (3): 1.0/1.1 MB | 658 kB | 1.0/6.8 MB
Progress (3): 1.0/1.1 MB | 658 kB | 1.0/6.8 MB
Progress (3): 1.0/1.1 MB | 658 kB | 1.0/6.8 MB
Progress (3): 1.0/1.1 MB | 658 kB | 1.0/6.8 MB
Progress (3): 1.0/1.1 MB | 658 kB | 1.0/6.8 MB
Progress (3): 1.0/1.1 MB | 658 kB | 1.0/6.8 MB
Progress (3): 1.0/1.1 MB | 658 kB | 1.0/6.8 MB
Progress (3): 1.1/1.1 MB | 658 kB | 1.0/6.8 MB
Progress (3): 1.1/1.1 MB | 658 kB | 1.1/6.8 MB
Progress (3): 1.1/1.1 MB | 658 kB | 1.1/6.8 MB
Progress (3): 1.1/1.1 MB | 658 kB | 1.1/6.8 MB
Progress (3): 1.1/1.1 MB | 658 kB | 1.1/6.8 MB
Progress (3): 1.1 MB | 658 kB | 1.1/6.8 MB    
Progress (3): 1.1 MB | 658 kB | 1.1/6.8 MB
Progress (3): 1.1 MB | 658 kB | 1.1/6.8 MB
Progress (3): 1.1 MB | 658 kB | 1.1/6.8 MB
Progress (3): 1.1 MB | 658 kB | 1.2/6.8 MB
Progress (3): 1.1 MB | 658 kB | 1.2/6.8 MB
Progress (3): 1.1 MB | 658 kB | 1.2/6.8 MB
Progress (3): 1.1 MB | 658 kB | 1.2/6.8 MB
Progress (3): 1.1 MB | 658 kB | 1.2/6.8 MB
Progress (3): 1.1 MB | 658 kB | 1.2/6.8 MB
Progress (3): 1.1 MB | 658 kB | 1.2/6.8 MB
Progress (3): 1.1 MB | 658 kB | 1.3/6.8 MB
Progress (3): 1.1 MB | 658 kB | 1.3/6.8 MB
Progress (3): 1.1 MB | 658 kB | 1.3/6.8 MB
                                          
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.14.0/commons-lang3-3.14.0.jar (658 kB at 423 kB/s)
Progress (2): 1.1 MB | 1.3/6.8 MB
Progress (2): 1.1 MB | 1.3/6.8 MB
Progress (2): 1.1 MB | 1.3/6.8 MB
Progress (2): 1.1 MB | 1.4/6.8 MB
Progress (2): 1.1 MB | 1.4/6.8 MB
Progress (2): 1.1 MB | 1.4/6.8 MB
Progress (2): 1.1 MB | 1.4/6.8 MB
Progress (2): 1.1 MB | 1.4/6.8 MB
Progress (2): 1.1 MB | 1.4/6.8 MB
Progress (2): 1.1 MB | 1.5/6.8 MB
Progress (2): 1.1 MB | 1.5/6.8 MB
Progress (2): 1.1 MB | 1.5/6.8 MB
                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.26.1/commons-compress-1.26.1.jar (1.1 MB at 686 kB/s)
Progress (1): 1.5/6.8 MB
Progress (1): 1.5/6.8 MB
Progress (1): 1.5/6.8 MB
Progress (1): 1.6/6.8 MB
Progress (1): 1.6/6.8 MB
Progress (1): 1.6/6.8 MB
Progress (1): 1.6/6.8 MB
Progress (1): 1.6/6.8 MB
Progress (1): 1.6/6.8 MB
Progress (1): 1.7/6.8 MB
Progress (1): 1.7/6.8 MB
Progress (1): 1.7/6.8 MB
Progress (1): 1.7/6.8 MB
Progress (1): 1.7/6.8 MB
Progress (1): 1.7/6.8 MB
Progress (1): 1.8/6.8 MB
Progress (1): 1.8/6.8 MB
Progress (1): 1.8/6.8 MB
Progress (1): 1.8/6.8 MB
Progress (1): 1.8/6.8 MB
Progress (1): 1.8/6.8 MB
Progress (1): 1.9/6.8 MB
Progress (1): 1.9/6.8 MB
Progress (1): 1.9/6.8 MB
Progress (1): 1.9/6.8 MB
Progress (1): 1.9/6.8 MB
Progress (1): 1.9/6.8 MB
Progress (1): 2.0/6.8 MB
Progress (1): 2.0/6.8 MB
Progress (1): 2.0/6.8 MB
Progress (1): 2.0/6.8 MB
Progress (1): 2.0/6.8 MB
Progress (1): 2.0/6.8 MB
Progress (1): 2.1/6.8 MB
Progress (1): 2.1/6.8 MB
Progress (1): 2.1/6.8 MB
Progress (1): 2.1/6.8 MB
Progress (1): 2.1/6.8 MB
Progress (1): 2.1/6.8 MB
Progress (1): 2.2/6.8 MB
Progress (1): 2.2/6.8 MB
Progress (1): 2.2/6.8 MB
Progress (1): 2.2/6.8 MB
Progress (1): 2.2/6.8 MB
Progress (1): 2.2/6.8 MB
Progress (1): 2.2/6.8 MB
Progress (1): 2.3/6.8 MB
Progress (1): 2.3/6.8 MB
Progress (1): 2.3/6.8 MB
Progress (1): 2.3/6.8 MB
Progress (1): 2.3/6.8 MB
Progress (1): 2.3/6.8 MB
Progress (1): 2.4/6.8 MB
Progress (1): 2.4/6.8 MB
Progress (1): 2.4/6.8 MB
Progress (1): 2.4/6.8 MB
Progress (1): 2.4/6.8 MB
Progress (1): 2.4/6.8 MB
Progress (1): 2.5/6.8 MB
Progress (1): 2.5/6.8 MB
Progress (1): 2.5/6.8 MB
Progress (1): 2.5/6.8 MB
Progress (1): 2.5/6.8 MB
Progress (1): 2.5/6.8 MB
Progress (1): 2.6/6.8 MB
Progress (1): 2.6/6.8 MB
Progress (1): 2.6/6.8 MB
Progress (1): 2.6/6.8 MB
Progress (1): 2.6/6.8 MB
Progress (1): 2.6/6.8 MB
Progress (1): 2.7/6.8 MB
Progress (1): 2.7/6.8 MB
Progress (1): 2.7/6.8 MB
Progress (1): 2.7/6.8 MB
Progress (1): 2.7/6.8 MB
Progress (1): 2.7/6.8 MB
Progress (1): 2.8/6.8 MB
Progress (1): 2.8/6.8 MB
Progress (1): 2.8/6.8 MB
Progress (1): 2.8/6.8 MB
Progress (1): 2.8/6.8 MB
Progress (1): 2.8/6.8 MB
Progress (1): 2.9/6.8 MB
Progress (1): 2.9/6.8 MB
Progress (1): 2.9/6.8 MB
Progress (1): 2.9/6.8 MB
Progress (1): 2.9/6.8 MB
Progress (1): 2.9/6.8 MB
Progress (1): 3.0/6.8 MB
Progress (1): 3.0/6.8 MB
Progress (1): 3.0/6.8 MB
Progress (1): 3.0/6.8 MB
Progress (1): 3.0/6.8 MB
Progress (1): 3.0/6.8 MB
Progress (1): 3.1/6.8 MB
Progress (1): 3.1/6.8 MB
Progress (1): 3.1/6.8 MB
Progress (1): 3.1/6.8 MB
Progress (1): 3.1/6.8 MB
Progress (1): 3.1/6.8 MB
Progress (1): 3.1/6.8 MB
Progress (1): 3.2/6.8 MB
Progress (1): 3.2/6.8 MB
Progress (1): 3.2/6.8 MB
Progress (1): 3.2/6.8 MB
Progress (1): 3.2/6.8 MB
Progress (1): 3.2/6.8 MB
Progress (1): 3.3/6.8 MB
Progress (1): 3.3/6.8 MB
Progress (1): 3.3/6.8 MB
Progress (1): 3.3/6.8 MB
Progress (1): 3.3/6.8 MB
Progress (1): 3.3/6.8 MB
Progress (1): 3.4/6.8 MB
Progress (1): 3.4/6.8 MB
Progress (1): 3.4/6.8 MB
Progress (1): 3.4/6.8 MB
Progress (1): 3.4/6.8 MB
Progress (1): 3.4/6.8 MB
Progress (1): 3.5/6.8 MB
Progress (1): 3.5/6.8 MB
Progress (1): 3.5/6.8 MB
Progress (1): 3.5/6.8 MB
Progress (1): 3.5/6.8 MB
Progress (1): 3.5/6.8 MB
Progress (1): 3.6/6.8 MB
Progress (1): 3.6/6.8 MB
Progress (1): 3.6/6.8 MB
Progress (1): 3.6/6.8 MB
Progress (1): 3.6/6.8 MB
Progress (1): 3.6/6.8 MB
Progress (1): 3.7/6.8 MB
Progress (1): 3.7/6.8 MB
Progress (1): 3.7/6.8 MB
Progress (1): 3.7/6.8 MB
Progress (1): 3.7/6.8 MB
Progress (1): 3.7/6.8 MB
Progress (1): 3.8/6.8 MB
Progress (1): 3.8/6.8 MB
Progress (1): 3.8/6.8 MB
Progress (1): 3.8/6.8 MB
Progress (1): 3.8/6.8 MB
Progress (1): 3.8/6.8 MB
Progress (1): 3.9/6.8 MB
Progress (1): 3.9/6.8 MB
Progress (1): 3.9/6.8 MB
Progress (1): 3.9/6.8 MB
Progress (1): 3.9/6.8 MB
Progress (1): 3.9/6.8 MB
Progress (1): 4.0/6.8 MB
Progress (1): 4.0/6.8 MB
Progress (1): 4.0/6.8 MB
Progress (1): 4.0/6.8 MB
Progress (1): 4.0/6.8 MB
Progress (1): 4.0/6.8 MB
Progress (1): 4.1/6.8 MB
Progress (1): 4.1/6.8 MB
Progress (1): 4.1/6.8 MB
Progress (1): 4.1/6.8 MB
Progress (1): 4.1/6.8 MB
Progress (1): 4.1/6.8 MB
Progress (1): 4.1/6.8 MB
Progress (1): 4.2/6.8 MB
Progress (1): 4.2/6.8 MB
Progress (1): 4.2/6.8 MB
Progress (1): 4.2/6.8 MB
Progress (1): 4.2/6.8 MB
Progress (1): 4.2/6.8 MB
Progress (1): 4.3/6.8 MB
Progress (1): 4.3/6.8 MB
Progress (1): 4.3/6.8 MB
Progress (1): 4.3/6.8 MB
Progress (1): 4.3/6.8 MB
Progress (1): 4.3/6.8 MB
Progress (1): 4.4/6.8 MB
Progress (1): 4.4/6.8 MB
Progress (1): 4.4/6.8 MB
Progress (1): 4.4/6.8 MB
Progress (1): 4.4/6.8 MB
Progress (1): 4.4/6.8 MB
Progress (1): 4.5/6.8 MB
Progress (1): 4.5/6.8 MB
Progress (1): 4.5/6.8 MB
Progress (1): 4.5/6.8 MB
Progress (1): 4.5/6.8 MB
Progress (1): 4.5/6.8 MB
Progress (1): 4.6/6.8 MB
Progress (1): 4.6/6.8 MB
Progress (1): 4.6/6.8 MB
Progress (1): 4.6/6.8 MB
Progress (1): 4.6/6.8 MB
Progress (1): 4.6/6.8 MB
Progress (1): 4.7/6.8 MB
Progress (1): 4.7/6.8 MB
Progress (1): 4.7/6.8 MB
Progress (1): 4.7/6.8 MB
Progress (1): 4.7/6.8 MB
Progress (1): 4.7/6.8 MB
Progress (1): 4.8/6.8 MB
Progress (1): 4.8/6.8 MB
Progress (1): 4.8/6.8 MB
Progress (1): 4.8/6.8 MB
Progress (1): 4.8/6.8 MB
Progress (1): 4.8/6.8 MB
Progress (1): 4.9/6.8 MB
Progress (1): 4.9/6.8 MB
Progress (1): 4.9/6.8 MB
Progress (1): 4.9/6.8 MB
Progress (1): 4.9/6.8 MB
Progress (1): 4.9/6.8 MB
Progress (1): 5.0/6.8 MB
Progress (1): 5.0/6.8 MB
Progress (1): 5.0/6.8 MB
Progress (1): 5.0/6.8 MB
Progress (1): 5.0/6.8 MB
Progress (1): 5.0/6.8 MB
Progress (1): 5.1/6.8 MB
Progress (1): 5.1/6.8 MB
Progress (1): 5.1/6.8 MB
Progress (1): 5.1/6.8 MB
Progress (1): 5.1/6.8 MB
Progress (1): 5.1/6.8 MB
Progress (1): 5.1/6.8 MB
Progress (1): 5.2/6.8 MB
Progress (1): 5.2/6.8 MB
Progress (1): 5.2/6.8 MB
Progress (1): 5.2/6.8 MB
Progress (1): 5.2/6.8 MB
Progress (1): 5.2/6.8 MB
Progress (1): 5.3/6.8 MB
Progress (1): 5.3/6.8 MB
Progress (1): 5.3/6.8 MB
Progress (1): 5.3/6.8 MB
Progress (1): 5.3/6.8 MB
Progress (1): 5.3/6.8 MB
Progress (1): 5.4/6.8 MB
Progress (1): 5.4/6.8 MB
Progress (1): 5.4/6.8 MB
Progress (1): 5.4/6.8 MB
Progress (1): 5.4/6.8 MB
Progress (1): 5.4/6.8 MB
Progress (1): 5.5/6.8 MB
Progress (1): 5.5/6.8 MB
Progress (1): 5.5/6.8 MB
Progress (1): 5.5/6.8 MB
Progress (1): 5.5/6.8 MB
Progress (1): 5.5/6.8 MB
Progress (1): 5.6/6.8 MB
Progress (1): 5.6/6.8 MB
Progress (1): 5.6/6.8 MB
Progress (1): 5.6/6.8 MB
Progress (1): 5.6/6.8 MB
Progress (1): 5.6/6.8 MB
Progress (1): 5.7/6.8 MB
Progress (1): 5.7/6.8 MB
Progress (1): 5.7/6.8 MB
Progress (1): 5.7/6.8 MB
Progress (1): 5.7/6.8 MB
Progress (1): 5.7/6.8 MB
Progress (1): 5.8/6.8 MB
Progress (1): 5.8/6.8 MB
Progress (1): 5.8/6.8 MB
Progress (1): 5.8/6.8 MB
Progress (1): 5.8/6.8 MB
Progress (1): 5.8/6.8 MB
Progress (1): 5.9/6.8 MB
Progress (1): 5.9/6.8 MB
Progress (1): 5.9/6.8 MB
Progress (1): 5.9/6.8 MB
Progress (1): 5.9/6.8 MB
Progress (1): 5.9/6.8 MB
Progress (1): 6.0/6.8 MB
Progress (1): 6.0/6.8 MB
Progress (1): 6.0/6.8 MB
Progress (1): 6.0/6.8 MB
Progress (1): 6.0/6.8 MB
Progress (1): 6.0/6.8 MB
Progress (1): 6.0/6.8 MB
Progress (1): 6.1/6.8 MB
Progress (1): 6.1/6.8 MB
Progress (1): 6.1/6.8 MB
Progress (1): 6.1/6.8 MB
Progress (1): 6.1/6.8 MB
Progress (1): 6.1/6.8 MB
Progress (1): 6.2/6.8 MB
Progress (1): 6.2/6.8 MB
Progress (1): 6.2/6.8 MB
Progress (1): 6.2/6.8 MB
Progress (1): 6.2/6.8 MB
Progress (1): 6.2/6.8 MB
Progress (1): 6.3/6.8 MB
Progress (1): 6.3/6.8 MB
Progress (1): 6.3/6.8 MB
Progress (1): 6.3/6.8 MB
Progress (1): 6.3/6.8 MB
Progress (1): 6.3/6.8 MB
Progress (1): 6.4/6.8 MB
Progress (1): 6.4/6.8 MB
Progress (1): 6.4/6.8 MB
Progress (1): 6.4/6.8 MB
Progress (1): 6.4/6.8 MB
Progress (1): 6.4/6.8 MB
Progress (1): 6.5/6.8 MB
Progress (1): 6.5/6.8 MB
Progress (1): 6.5/6.8 MB
Progress (1): 6.5/6.8 MB
Progress (1): 6.5/6.8 MB
Progress (1): 6.5/6.8 MB
Progress (1): 6.6/6.8 MB
Progress (1): 6.6/6.8 MB
Progress (1): 6.6/6.8 MB
Progress (1): 6.6/6.8 MB
Progress (1): 6.6/6.8 MB
Progress (1): 6.6/6.8 MB
Progress (1): 6.7/6.8 MB
Progress (1): 6.7/6.8 MB
Progress (1): 6.7/6.8 MB
Progress (1): 6.7/6.8 MB
Progress (1): 6.7/6.8 MB
Progress (1): 6.7/6.8 MB
Progress (1): 6.7/6.8 MB
Progress (1): 6.8/6.8 MB
Progress (1): 6.8/6.8 MB
Progress (1): 6.8 MB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/github/luben/zstd-jni/1.5.5-11/zstd-jni-1.5.5-11.jar (6.8 MB at 2.5 MB/s)
[INFO] Building jar: C:\ProgramData\Jenkins\.jenkins\workspace\Travel-Insurance-Pipeline\target\travel-insurance-claim-system-1.0.0.jar
[INFO] 
[INFO] --- spring-boot:3.3.4:repackage (repackage) @ travel-insurance-claim-system ---
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-buildpack-platform/3.3.4/spring-boot-buildpack-platform-3.3.4.pom
Progress (1): 970 B
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-buildpack-platform/3.3.4/spring-boot-buildpack-platform-3.3.4.pom (3.2 kB at 37 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.14.2/jackson-databind-2.14.2.pom
Progress (1): 976 B
Progress (1): 2.4 kB
Progress (1): 3.9 kB
Progress (1): 6.1 kB
Progress (1): 8.4 kB
Progress (1): 10 kB 
Progress (1): 14 kB
Progress (1): 16 kB
Progress (1): 18 kB
Progress (1): 19 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.14.2/jackson-databind-2.14.2.pom (19 kB at 142 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-base/2.14.2/jackson-base-2.14.2.pom
Progress (1): 922 B
Progress (1): 2.5 kB
Progress (1): 4.4 kB
Progress (1): 6.2 kB
Progress (1): 8.6 kB
Progress (1): 10 kB 
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-base/2.14.2/jackson-base-2.14.2.pom (10 kB at 72 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-bom/2.14.2/jackson-bom-2.14.2.pom
Progress (1): 931 B
Progress (1): 2.7 kB
Progress (1): 8.1 kB
Progress (1): 17 kB 
Progress (1): 17 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-bom/2.14.2/jackson-bom-2.14.2.pom (17 kB at 153 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.14/jackson-parent-2.14.pom
Progress (1): 1.1 kB
Progress (1): 2.6 kB
Progress (1): 4.0 kB
Progress (1): 6.5 kB
Progress (1): 7.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.14/jackson-parent-2.14.pom (7.7 kB at 52 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/48/oss-parent-48.pom
Progress (1): 954 B
Progress (1): 2.6 kB
Progress (1): 4.0 kB
Progress (1): 6.0 kB
Progress (1): 9.7 kB
Progress (1): 12 kB 
Progress (1): 15 kB
Progress (1): 18 kB
Progress (1): 21 kB
Progress (1): 24 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/48/oss-parent-48.pom (24 kB at 203 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.14.2/jackson-annotations-2.14.2.pom
Progress (1): 946 B
Progress (1): 2.4 kB
Progress (1): 3.9 kB
Progress (1): 6.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.14.2/jackson-annotations-2.14.2.pom (6.2 kB at 69 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.14.2/jackson-core-2.14.2.pom
Progress (1): 992 B
Progress (1): 2.4 kB
Progress (1): 4.0 kB
Progress (1): 6.0 kB
Progress (1): 7.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.14.2/jackson-core-2.14.2.pom (7.0 kB at 75 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.14.2/jackson-module-parameter-names-2.14.2.pom
Progress (1): 973 B
Progress (1): 2.9 kB
Progress (1): 4.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.14.2/jackson-module-parameter-names-2.14.2.pom (4.4 kB at 50 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-modules-java8/2.14.2/jackson-modules-java8-2.14.2.pom
Progress (1): 1.4 kB
Progress (1): 3.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-modules-java8/2.14.2/jackson-modules-java8-2.14.2.pom (3.1 kB at 44 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna-platform/5.13.0/jna-platform-5.13.0.pom
Progress (1): 1.4 kB
Progress (1): 2.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna-platform/5.13.0/jna-platform-5.13.0.pom (2.3 kB at 31 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna/5.13.0/jna-5.13.0.pom
Progress (1): 1.4 kB
Progress (1): 2.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna/5.13.0/jna-5.13.0.pom (2.0 kB at 30 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.25.0/commons-compress-1.25.0.pom
Progress (1): 753 B
Progress (1): 1.9 kB
Progress (1): 3.5 kB
Progress (1): 6.8 kB
Progress (1): 9.5 kB
Progress (1): 11 kB 
Progress (1): 14 kB
Progress (1): 17 kB
Progress (1): 22 kB
Progress (1): 22 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.25.0/commons-compress-1.25.0.pom (22 kB at 271 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/client5/httpclient5/5.3.1/httpclient5-5.3.1.pom
Progress (1): 869 B
Progress (1): 3.2 kB
Progress (1): 5.5 kB
Progress (1): 6.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/client5/httpclient5/5.3.1/httpclient5-5.3.1.pom (6.0 kB at 86 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/client5/httpclient5-parent/5.3.1/httpclient5-parent-5.3.1.pom
Progress (1): 837 B
Progress (1): 2.2 kB
Progress (1): 4.0 kB
Progress (1): 8.5 kB
Progress (1): 12 kB 
Progress (1): 15 kB
Progress (1): 17 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/client5/httpclient5-parent/5.3.1/httpclient5-parent-5.3.1.pom (17 kB at 117 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-parent/13/httpcomponents-parent-13.pom
Progress (1): 805 B
Progress (1): 2.1 kB
Progress (1): 4.1 kB
Progress (1): 5.9 kB
Progress (1): 7.1 kB
Progress (1): 8.5 kB
Progress (1): 12 kB 
Progress (1): 16 kB
Progress (1): 18 kB
Progress (1): 22 kB
Progress (1): 24 kB
Progress (1): 27 kB
Progress (1): 30 kB
Progress (1): 30 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/httpcomponents-parent/13/httpcomponents-parent-13.pom (30 kB at 248 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/27/apache-27.pom
Progress (1): 745 B
Progress (1): 2.1 kB
Progress (1): 3.9 kB
Progress (1): 7.3 kB
Progress (1): 12 kB 
Progress (1): 16 kB
Progress (1): 19 kB
Progress (1): 20 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/27/apache-27.pom (20 kB at 107 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5/5.2.4/httpcore5-5.2.4.pom
Progress (1): 883 B
Progress (1): 2.9 kB
Progress (1): 3.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5/5.2.4/httpcore5-5.2.4.pom (3.9 kB at 26 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5-parent/5.2.4/httpcore5-parent-5.2.4.pom
Progress (1): 847 B
Progress (1): 2.2 kB
Progress (1): 3.9 kB
Progress (1): 7.3 kB
Progress (1): 10 kB 
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5-parent/5.2.4/httpcore5-parent-5.2.4.pom (14 kB at 110 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5-h2/5.2.4/httpcore5-h2-5.2.4.pom
Progress (1): 889 B
Progress (1): 3.1 kB
Progress (1): 3.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5-h2/5.2.4/httpcore5-h2-5.2.4.pom (3.6 kB at 39 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-core/6.0.23/spring-core-6.0.23.pom
Progress (1): 1.1 kB
Progress (1): 2.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-core/6.0.23/spring-core-6.0.23.pom (2.0 kB at 28 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jcl/6.0.23/spring-jcl-6.0.23.pom
Progress (1): 1.1 kB
Progress (1): 1.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jcl/6.0.23/spring-jcl-6.0.23.pom (1.8 kB at 21 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/tomlj/tomlj/1.0.0/tomlj-1.0.0.pom
Progress (1): 1.2 kB
Progress (1): 2.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/tomlj/tomlj/1.0.0/tomlj-1.0.0.pom (2.8 kB at 41 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.7.2/antlr4-runtime-4.7.2.pom
Progress (1): 915 B
Progress (1): 3.3 kB
Progress (1): 3.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.7.2/antlr4-runtime-4.7.2.pom (3.6 kB at 56 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-master/4.7.2/antlr4-master-4.7.2.pom
Progress (1): 1.0 kB
Progress (1): 2.9 kB
Progress (1): 4.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-master/4.7.2/antlr4-master-4.7.2.pom (4.4 kB at 54 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.pom
Progress (1): 1.0 kB
Progress (1): 3.7 kB
Progress (1): 4.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.pom (4.3 kB at 68 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/3.3.4/spring-boot-loader-tools-3.3.4.pom
Progress (1): 1.0 kB
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/3.3.4/spring-boot-loader-tools-3.3.4.pom (2.2 kB at 25 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.3.2/maven-common-artifact-filters-3.3.2.pom
Progress (1): 791 B
Progress (1): 2.3 kB
Progress (1): 5.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.3.2/maven-common-artifact-filters-3.3.2.pom (5.3 kB at 98 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/37/maven-shared-components-37.pom
Progress (1): 781 B
Progress (1): 2.3 kB
Progress (1): 4.5 kB
Progress (1): 4.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/37/maven-shared-components-37.pom (4.9 kB at 83 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/37/maven-parent-37.pom
Progress (1): 721 B
Progress (1): 1.9 kB
Progress (1): 5.4 kB
Progress (1): 9.5 kB
Progress (1): 14 kB 
Progress (1): 19 kB
Progress (1): 23 kB
Progress (1): 26 kB
Progress (1): 28 kB
Progress (1): 30 kB
Progress (1): 34 kB
Progress (1): 37 kB
Progress (1): 40 kB
Progress (1): 45 kB
Progress (1): 46 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/37/maven-parent-37.pom (46 kB at 461 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.12.10/micrometer-observation-1.12.10.pom
Progress (1): 1.1 kB
Progress (1): 3.4 kB
Progress (1): 3.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.12.10/micrometer-observation-1.12.10.pom (3.8 kB at 41 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.12.10/micrometer-commons-1.12.10.pom
Progress (1): 1.1 kB
Progress (1): 3.1 kB
Progress (1): 3.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.12.10/micrometer-commons-1.12.10.pom (3.4 kB at 53 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/3.5.0/maven-shade-plugin-3.5.0.pom
Progress (1): 764 B
Progress (1): 2.3 kB
Progress (1): 4.8 kB
Progress (1): 8.4 kB
Progress (1): 11 kB 
Progress (1): 12 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/3.5.0/maven-shade-plugin-3.5.0.pom (12 kB at 104 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.32/slf4j-api-1.7.32.pom
Progress (1): 1.0 kB
Progress (1): 3.3 kB
Progress (1): 3.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.32/slf4j-api-1.7.32.pom (3.8 kB at 25 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.32/slf4j-parent-1.7.32.pom
Progress (1): 1.0 kB
Progress (1): 3.2 kB
Progress (1): 6.0 kB
Progress (1): 9.1 kB
Progress (1): 12 kB 
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.32/slf4j-parent-1.7.32.pom (14 kB at 119 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.5/asm-9.5.pom
Progress (1): 1.3 kB
Progress (1): 2.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.5/asm-9.5.pom (2.4 kB at 36 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.5/asm-commons-9.5.pom
Progress (1): 1.1 kB
Progress (1): 2.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.5/asm-commons-9.5.pom (2.8 kB at 29 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.5/asm-tree-9.5.pom
Progress (1): 1.1 kB
Progress (1): 2.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.5/asm-tree-9.5.pom (2.6 kB at 27 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jdom/jdom2/2.0.6.1/jdom2-2.0.6.1.pom
Progress (1): 956 B
Progress (1): 2.2 kB
Progress (1): 3.2 kB
Progress (1): 4.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/jdom/jdom2/2.0.6.1/jdom2-2.0.6.1.pom (4.6 kB at 27 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/3.2.1/maven-dependency-tree-3.2.1.pom
Progress (1): 786 B
Progress (1): 2.2 kB
Progress (1): 4.4 kB
Progress (1): 6.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/3.2.1/maven-dependency-tree-3.2.1.pom (6.2 kB at 47 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.13.0/commons-io-2.13.0.pom
Progress (1): 771 B
Progress (1): 2.1 kB
Progress (1): 5.2 kB
Progress (1): 7.9 kB
Progress (1): 10 kB 
Progress (1): 12 kB
Progress (1): 15 kB
Progress (1): 18 kB
Progress (1): 20 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.13.0/commons-io-2.13.0.pom (20 kB at 194 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/58/commons-parent-58.pom
Progress (1): 707 B
Progress (1): 1.9 kB
Progress (1): 3.1 kB
Progress (1): 4.6 kB
Progress (1): 6.5 kB
Progress (1): 8.4 kB
Progress (1): 10 kB 
Progress (1): 12 kB
Progress (1): 15 kB
Progress (1): 18 kB
Progress (1): 20 kB
Progress (1): 23 kB
Progress (1): 26 kB
Progress (1): 29 kB
Progress (1): 33 kB
Progress (1): 33 kB
Progress (1): 36 kB
Progress (1): 41 kB
Progress (1): 44 kB
Progress (1): 47 kB
Progress (1): 49 kB
Progress (1): 51 kB
Progress (1): 55 kB
Progress (1): 58 kB
Progress (1): 61 kB
Progress (1): 64 kB
Progress (1): 67 kB
Progress (1): 73 kB
Progress (1): 76 kB
Progress (1): 80 kB
Progress (1): 83 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/58/commons-parent-58.pom (83 kB at 712 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/vafer/jdependency/2.8.0/jdependency-2.8.0.pom
Progress (1): 1.1 kB
Progress (1): 5.0 kB
Progress (1): 8.6 kB
Progress (1): 13 kB 
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/vafer/jdependency/2.8.0/jdependency-2.8.0.pom (14 kB at 174 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-collections4/4.4/commons-collections4-4.4.pom
Progress (1): 763 B
Progress (1): 2.2 kB
Progress (1): 5.1 kB
Progress (1): 8.9 kB
Progress (1): 12 kB 
Progress (1): 14 kB
Progress (1): 16 kB
Progress (1): 19 kB
Progress (1): 22 kB
Progress (1): 24 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-collections4/4.4/commons-collections4-4.4.pom (24 kB at 248 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/48/commons-parent-48.pom
Progress (1): 704 B
Progress (1): 1.9 kB
Progress (1): 3.2 kB
Progress (1): 4.7 kB
Progress (1): 8.4 kB
Progress (1): 11 kB 
Progress (1): 14 kB
Progress (1): 17 kB
Progress (1): 21 kB
Progress (1): 24 kB
Progress (1): 26 kB
Progress (1): 29 kB
Progress (1): 32 kB
Progress (1): 36 kB
Progress (1): 38 kB
Progress (1): 39 kB
Progress (1): 41 kB
Progress (1): 45 kB
Progress (1): 50 kB
Progress (1): 55 kB
Progress (1): 59 kB
Progress (1): 62 kB
Progress (1): 64 kB
Progress (1): 66 kB
Progress (1): 68 kB
Progress (1): 70 kB
Progress (1): 72 kB
Progress (1): 72 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/48/commons-parent-48.pom (72 kB at 605 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-buildpack-platform/3.3.4/spring-boot-buildpack-platform-3.3.4.jar
Progress (1): 7.7/289 kB
Progress (1): 8.2/289 kB
Progress (1): 25/289 kB 
Progress (1): 41/289 kB
Progress (1): 57/289 kB
Progress (1): 74/289 kB
Progress (1): 90/289 kB
Progress (1): 106/289 kB
Progress (1): 123/289 kB
Progress (1): 139/289 kB
Progress (1): 156/289 kB
Progress (1): 172/289 kB
Progress (1): 188/289 kB
Progress (1): 205/289 kB
Progress (1): 221/289 kB
Progress (1): 238/289 kB
Progress (1): 254/289 kB
Progress (1): 270/289 kB
Progress (1): 287/289 kB
Progress (1): 289 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-buildpack-platform/3.3.4/spring-boot-buildpack-platform-3.3.4.jar (289 kB at 2.0 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.14.2/jackson-databind-2.14.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.14.2/jackson-module-parameter-names-2.14.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.14.2/jackson-core-2.14.2.jar
Downloading from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna-platform/5.13.0/jna-platform-5.13.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.14.2/jackson-annotations-2.14.2.jar
Progress (1): 3.2/9.5 kB
Progress (1): 9.5 kB    
Progress (2): 9.5 kB | 0/1.6 MB
Progress (3): 9.5 kB | 0/1.6 MB | 7.7/77 kB
Progress (3): 9.5 kB | 0/1.6 MB | 15/77 kB 
Progress (3): 9.5 kB | 0/1.6 MB | 32/77 kB
Progress (3): 9.5 kB | 0/1.6 MB | 48/77 kB
Progress (3): 9.5 kB | 0/1.6 MB | 65/77 kB
Progress (3): 9.5 kB | 0/1.6 MB | 77 kB   
Progress (3): 9.5 kB | 0/1.6 MB | 77 kB
Progress (4): 9.5 kB | 0/1.6 MB | 77 kB | 7.7/459 kB
Progress (4): 9.5 kB | 0/1.6 MB | 77 kB | 11/459 kB 
Progress (5): 9.5 kB | 0/1.6 MB | 77 kB | 11/459 kB | 0/1.4 MB
Progress (5): 9.5 kB | 0/1.6 MB | 77 kB | 11/459 kB | 0/1.4 MB
Progress (5): 9.5 kB | 0/1.6 MB | 77 kB | 11/459 kB | 0/1.4 MB
Progress (5): 9.5 kB | 0/1.6 MB | 77 kB | 11/459 kB | 0/1.4 MB
Progress (5): 9.5 kB | 0/1.6 MB | 77 kB | 11/459 kB | 0/1.4 MB
Progress (5): 9.5 kB | 0/1.6 MB | 77 kB | 28/459 kB | 0/1.4 MB
Progress (5): 9.5 kB | 0/1.6 MB | 77 kB | 28/459 kB | 0/1.4 MB
Progress (5): 9.5 kB | 0/1.6 MB | 77 kB | 44/459 kB | 0/1.4 MB
Progress (5): 9.5 kB | 0.1/1.6 MB | 77 kB | 44/459 kB | 0/1.4 MB
Progress (5): 9.5 kB | 0.1/1.6 MB | 77 kB | 44/459 kB | 0/1.4 MB
Progress (5): 9.5 kB | 0.1/1.6 MB | 77 kB | 44/459 kB | 0/1.4 MB
Progress (5): 9.5 kB | 0.1/1.6 MB | 77 kB | 60/459 kB | 0/1.4 MB
Progress (5): 9.5 kB | 0.1/1.6 MB | 77 kB | 60/459 kB | 0.1/1.4 MB
Progress (5): 9.5 kB | 0.1/1.6 MB | 77 kB | 60/459 kB | 0.1/1.4 MB
Progress (5): 9.5 kB | 0.1/1.6 MB | 77 kB | 77/459 kB | 0.1/1.4 MB
Progress (5): 9.5 kB | 0.1/1.6 MB | 77 kB | 77/459 kB | 0.1/1.4 MB
Progress (5): 9.5 kB | 0.1/1.6 MB | 77 kB | 77/459 kB | 0.1/1.4 MB
Progress (5): 9.5 kB | 0.1/1.6 MB | 77 kB | 77/459 kB | 0.1/1.4 MB
Progress (5): 9.5 kB | 0.1/1.6 MB | 77 kB | 93/459 kB | 0.1/1.4 MB
                                                                  
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.14.2/jackson-annotations-2.14.2.jar (77 kB at 678 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna/5.13.0/jna-5.13.0.jar
Progress (4): 9.5 kB | 0.1/1.6 MB | 93/459 kB | 0.1/1.4 MB
Progress (4): 9.5 kB | 0.1/1.6 MB | 93/459 kB | 0.1/1.4 MB
Progress (4): 9.5 kB | 0.1/1.6 MB | 110/459 kB | 0.1/1.4 MB
Progress (4): 9.5 kB | 0.1/1.6 MB | 110/459 kB | 0.1/1.4 MB
Progress (4): 9.5 kB | 0.2/1.6 MB | 110/459 kB | 0.1/1.4 MB
Progress (4): 9.5 kB | 0.2/1.6 MB | 126/459 kB | 0.1/1.4 MB
Progress (4): 9.5 kB | 0.2/1.6 MB | 126/459 kB | 0.1/1.4 MB
Progress (4): 9.5 kB | 0.2/1.6 MB | 126/459 kB | 0.1/1.4 MB
Progress (4): 9.5 kB | 0.2/1.6 MB | 142/459 kB | 0.1/1.4 MB
Progress (4): 9.5 kB | 0.2/1.6 MB | 142/459 kB | 0.1/1.4 MB
Progress (4): 9.5 kB | 0.2/1.6 MB | 142/459 kB | 0.1/1.4 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 142/459 kB | 0.1/1.4 MB | 0/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 142/459 kB | 0.1/1.4 MB | 0/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 159/459 kB | 0.1/1.4 MB | 0/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 159/459 kB | 0.1/1.4 MB | 0/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 159/459 kB | 0.2/1.4 MB | 0/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 159/459 kB | 0.2/1.4 MB | 0/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 159/459 kB | 0.2/1.4 MB | 0.1/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 159/459 kB | 0.2/1.4 MB | 0.1/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 159/459 kB | 0.2/1.4 MB | 0.1/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 159/459 kB | 0.2/1.4 MB | 0.1/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 159/459 kB | 0.2/1.4 MB | 0.1/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 159/459 kB | 0.2/1.4 MB | 0.1/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 159/459 kB | 0.2/1.4 MB | 0.1/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 159/459 kB | 0.2/1.4 MB | 0.2/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 159/459 kB | 0.2/1.4 MB | 0.2/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 159/459 kB | 0.2/1.4 MB | 0.2/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 159/459 kB | 0.2/1.4 MB | 0.2/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 159/459 kB | 0.2/1.4 MB | 0.2/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 159/459 kB | 0.2/1.4 MB | 0.2/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 159/459 kB | 0.2/1.4 MB | 0.2/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 159/459 kB | 0.2/1.4 MB | 0.2/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 175/459 kB | 0.2/1.4 MB | 0.2/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 175/459 kB | 0.2/1.4 MB | 0.2/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 175/459 kB | 0.2/1.4 MB | 0.3/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 192/459 kB | 0.2/1.4 MB | 0.3/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 192/459 kB | 0.2/1.4 MB | 0.3/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 192/459 kB | 0.2/1.4 MB | 0.3/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 192/459 kB | 0.2/1.4 MB | 0.3/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 192/459 kB | 0.2/1.4 MB | 0.3/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 192/459 kB | 0.2/1.4 MB | 0.3/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 192/459 kB | 0.2/1.4 MB | 0.3/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 192/459 kB | 0.2/1.4 MB | 0.4/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 192/459 kB | 0.2/1.4 MB | 0.4/1.9 MB
Progress (5): 9.5 kB | 0.2/1.6 MB | 192/459 kB | 0.2/1.4 MB | 0.4/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 192/459 kB | 0.2/1.4 MB | 0.4/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 192/459 kB | 0.2/1.4 MB | 0.4/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 208/459 kB | 0.2/1.4 MB | 0.4/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 208/459 kB | 0.2/1.4 MB | 0.4/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 224/459 kB | 0.2/1.4 MB | 0.4/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 224/459 kB | 0.2/1.4 MB | 0.4/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 224/459 kB | 0.2/1.4 MB | 0.4/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 224/459 kB | 0.2/1.4 MB | 0.4/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 224/459 kB | 0.2/1.4 MB | 0.5/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 224/459 kB | 0.2/1.4 MB | 0.5/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 224/459 kB | 0.2/1.4 MB | 0.5/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 224/459 kB | 0.2/1.4 MB | 0.5/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 224/459 kB | 0.2/1.4 MB | 0.5/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 224/459 kB | 0.2/1.4 MB | 0.5/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 224/459 kB | 0.2/1.4 MB | 0.5/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 224/459 kB | 0.2/1.4 MB | 0.5/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 224/459 kB | 0.2/1.4 MB | 0.5/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 241/459 kB | 0.2/1.4 MB | 0.5/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 241/459 kB | 0.2/1.4 MB | 0.5/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 241/459 kB | 0.2/1.4 MB | 0.6/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 257/459 kB | 0.2/1.4 MB | 0.6/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 257/459 kB | 0.3/1.4 MB | 0.6/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 257/459 kB | 0.3/1.4 MB | 0.6/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 257/459 kB | 0.3/1.4 MB | 0.6/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 257/459 kB | 0.3/1.4 MB | 0.6/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 257/459 kB | 0.3/1.4 MB | 0.6/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 257/459 kB | 0.3/1.4 MB | 0.6/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 257/459 kB | 0.3/1.4 MB | 0.6/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 257/459 kB | 0.3/1.4 MB | 0.6/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 257/459 kB | 0.3/1.4 MB | 0.6/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 257/459 kB | 0.3/1.4 MB | 0.7/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 257/459 kB | 0.3/1.4 MB | 0.7/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 257/459 kB | 0.3/1.4 MB | 0.7/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 257/459 kB | 0.3/1.4 MB | 0.7/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 273/459 kB | 0.3/1.4 MB | 0.7/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 273/459 kB | 0.3/1.4 MB | 0.7/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 273/459 kB | 0.3/1.4 MB | 0.7/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 273/459 kB | 0.3/1.4 MB | 0.7/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 273/459 kB | 0.3/1.4 MB | 0.7/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 273/459 kB | 0.3/1.4 MB | 0.8/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 273/459 kB | 0.3/1.4 MB | 0.8/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 273/459 kB | 0.3/1.4 MB | 0.8/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 273/459 kB | 0.3/1.4 MB | 0.8/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 273/459 kB | 0.3/1.4 MB | 0.8/1.9 MB
Progress (5): 9.5 kB | 0.3/1.6 MB | 273/459 kB | 0.3/1.4 MB | 0.8/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 273/459 kB | 0.3/1.4 MB | 0.8/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 290/459 kB | 0.3/1.4 MB | 0.8/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 290/459 kB | 0.3/1.4 MB | 0.8/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 290/459 kB | 0.3/1.4 MB | 0.8/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 290/459 kB | 0.3/1.4 MB | 0.8/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 306/459 kB | 0.3/1.4 MB | 0.8/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 306/459 kB | 0.3/1.4 MB | 0.9/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 306/459 kB | 0.3/1.4 MB | 0.9/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 323/459 kB | 0.3/1.4 MB | 0.9/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 323/459 kB | 0.3/1.4 MB | 0.9/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 339/459 kB | 0.3/1.4 MB | 0.9/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 339/459 kB | 0.4/1.4 MB | 0.9/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 339/459 kB | 0.4/1.4 MB | 0.9/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 339/459 kB | 0.4/1.4 MB | 0.9/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 339/459 kB | 0.4/1.4 MB | 0.9/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 339/459 kB | 0.4/1.4 MB | 0.9/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 339/459 kB | 0.4/1.4 MB | 0.9/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 339/459 kB | 0.4/1.4 MB | 0.9/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 339/459 kB | 0.4/1.4 MB | 0.9/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 339/459 kB | 0.4/1.4 MB | 0.9/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 339/459 kB | 0.4/1.4 MB | 1.0/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 339/459 kB | 0.4/1.4 MB | 1.0/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 339/459 kB | 0.4/1.4 MB | 1.0/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 355/459 kB | 0.4/1.4 MB | 1.0/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 355/459 kB | 0.4/1.4 MB | 1.0/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 355/459 kB | 0.4/1.4 MB | 1.0/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 355/459 kB | 0.4/1.4 MB | 1.0/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 355/459 kB | 0.4/1.4 MB | 1.1/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 355/459 kB | 0.4/1.4 MB | 1.1/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 355/459 kB | 0.4/1.4 MB | 1.1/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 355/459 kB | 0.4/1.4 MB | 1.1/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 372/459 kB | 0.4/1.4 MB | 1.1/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 372/459 kB | 0.4/1.4 MB | 1.1/1.9 MB
Progress (5): 9.5 kB | 0.4/1.6 MB | 372/459 kB | 0.4/1.4 MB | 1.1/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 372/459 kB | 0.4/1.4 MB | 1.1/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 372/459 kB | 0.4/1.4 MB | 1.1/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 388/459 kB | 0.4/1.4 MB | 1.1/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 388/459 kB | 0.4/1.4 MB | 1.1/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 388/459 kB | 0.4/1.4 MB | 1.1/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 388/459 kB | 0.4/1.4 MB | 1.1/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 405/459 kB | 0.4/1.4 MB | 1.1/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 405/459 kB | 0.4/1.4 MB | 1.1/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 405/459 kB | 0.4/1.4 MB | 1.1/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 405/459 kB | 0.4/1.4 MB | 1.2/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 405/459 kB | 0.4/1.4 MB | 1.2/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 405/459 kB | 0.4/1.4 MB | 1.2/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 405/459 kB | 0.4/1.4 MB | 1.2/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 405/459 kB | 0.4/1.4 MB | 1.2/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 421/459 kB | 0.4/1.4 MB | 1.2/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 421/459 kB | 0.5/1.4 MB | 1.2/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 421/459 kB | 0.5/1.4 MB | 1.2/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 421/459 kB | 0.5/1.4 MB | 1.2/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 421/459 kB | 0.5/1.4 MB | 1.2/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 421/459 kB | 0.5/1.4 MB | 1.2/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 437/459 kB | 0.5/1.4 MB | 1.2/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 437/459 kB | 0.5/1.4 MB | 1.2/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 437/459 kB | 0.5/1.4 MB | 1.2/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 437/459 kB | 0.5/1.4 MB | 1.3/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 437/459 kB | 0.5/1.4 MB | 1.3/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 437/459 kB | 0.5/1.4 MB | 1.3/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 437/459 kB | 0.5/1.4 MB | 1.3/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 437/459 kB | 0.5/1.4 MB | 1.3/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 454/459 kB | 0.5/1.4 MB | 1.3/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 454/459 kB | 0.5/1.4 MB | 1.3/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 459 kB | 0.5/1.4 MB | 1.3/1.9 MB    
Progress (5): 9.5 kB | 0.5/1.6 MB | 459 kB | 0.5/1.4 MB | 1.3/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 459 kB | 0.5/1.4 MB | 1.3/1.9 MB
Progress (5): 9.5 kB | 0.5/1.6 MB | 459 kB | 0.5/1.4 MB | 1.3/1.9 MB
Progress (5): 9.5 kB | 0.6/1.6 MB | 459 kB | 0.5/1.4 MB | 1.3/1.9 MB
Progress (5): 9.5 kB | 0.6/1.6 MB | 459 kB | 0.5/1.4 MB | 1.3/1.9 MB
Progress (5): 9.5 kB | 0.6/1.6 MB | 459 kB | 0.5/1.4 MB | 1.4/1.9 MB
Progress (5): 9.5 kB | 0.6/1.6 MB | 459 kB | 0.5/1.4 MB | 1.4/1.9 MB
Progress (5): 9.5 kB | 0.6/1.6 MB | 459 kB | 0.5/1.4 MB | 1.4/1.9 MB
Progress (5): 9.5 kB | 0.6/1.6 MB | 459 kB | 0.5/1.4 MB | 1.4/1.9 MB
Progress (5): 9.5 kB | 0.6/1.6 MB | 459 kB | 0.5/1.4 MB | 1.4/1.9 MB
Progress (5): 9.5 kB | 0.6/1.6 MB | 459 kB | 0.5/1.4 MB | 1.4/1.9 MB
Progress (5): 9.5 kB | 0.6/1.6 MB | 459 kB | 0.5/1.4 MB | 1.4/1.9 MB
Progress (5): 9.5 kB | 0.6/1.6 MB | 459 kB | 0.6/1.4 MB | 1.4/1.9 MB
Progress (5): 9.5 kB | 0.6/1.6 MB | 459 kB | 0.6/1.4 MB | 1.4/1.9 MB
Progress (5): 9.5 kB | 0.6/1.6 MB | 459 kB | 0.6/1.4 MB | 1.4/1.9 MB
Progress (5): 9.5 kB | 0.6/1.6 MB | 459 kB | 0.6/1.4 MB | 1.4/1.9 MB
Progress (5): 9.5 kB | 0.6/1.6 MB | 459 kB | 0.6/1.4 MB | 1.4/1.9 MB
Progress (5): 9.5 kB | 0.6/1.6 MB | 459 kB | 0.6/1.4 MB | 1.4/1.9 MB
Progress (5): 9.5 kB | 0.6/1.6 MB | 459 kB | 0.6/1.4 MB | 1.5/1.9 MB
Progress (5): 9.5 kB | 0.6/1.6 MB | 459 kB | 0.6/1.4 MB | 1.5/1.9 MB
Progress (5): 9.5 kB | 0.6/1.6 MB | 459 kB | 0.6/1.4 MB | 1.5/1.9 MB
                                                                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.14.2/jackson-core-2.14.2.jar (459 kB at 887 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.25.0/commons-compress-1.25.0.jar
Progress (4): 9.5 kB | 0.6/1.6 MB | 0.6/1.4 MB | 1.5/1.9 MB
Progress (4): 9.5 kB | 0.6/1.6 MB | 0.6/1.4 MB | 1.5/1.9 MB
Progress (4): 9.5 kB | 0.6/1.6 MB | 0.6/1.4 MB | 1.5/1.9 MB
Progress (4): 9.5 kB | 0.6/1.6 MB | 0.6/1.4 MB | 1.5/1.9 MB
Progress (4): 9.5 kB | 0.7/1.6 MB | 0.6/1.4 MB | 1.5/1.9 MB
Progress (4): 9.5 kB | 0.7/1.6 MB | 0.6/1.4 MB | 1.5/1.9 MB
Progress (4): 9.5 kB | 0.7/1.6 MB | 0.6/1.4 MB | 1.5/1.9 MB
Progress (4): 9.5 kB | 0.7/1.6 MB | 0.6/1.4 MB | 1.5/1.9 MB
Progress (4): 9.5 kB | 0.7/1.6 MB | 0.6/1.4 MB | 1.5/1.9 MB
Progress (4): 9.5 kB | 0.7/1.6 MB | 0.6/1.4 MB | 1.5/1.9 MB
Progress (4): 9.5 kB | 0.7/1.6 MB | 0.6/1.4 MB | 1.5/1.9 MB
Progress (4): 9.5 kB | 0.7/1.6 MB | 0.6/1.4 MB | 1.6/1.9 MB
Progress (4): 9.5 kB | 0.7/1.6 MB | 0.7/1.4 MB | 1.6/1.9 MB
Progress (4): 9.5 kB | 0.7/1.6 MB | 0.7/1.4 MB | 1.6/1.9 MB
Progress (4): 9.5 kB | 0.7/1.6 MB | 0.7/1.4 MB | 1.6/1.9 MB
Progress (4): 9.5 kB | 0.7/1.6 MB | 0.7/1.4 MB | 1.6/1.9 MB
Progress (4): 9.5 kB | 0.7/1.6 MB | 0.7/1.4 MB | 1.6/1.9 MB
Progress (4): 9.5 kB | 0.7/1.6 MB | 0.7/1.4 MB | 1.6/1.9 MB
Progress (4): 9.5 kB | 0.7/1.6 MB | 0.7/1.4 MB | 1.6/1.9 MB
Progress (4): 9.5 kB | 0.7/1.6 MB | 0.7/1.4 MB | 1.6/1.9 MB
Progress (4): 9.5 kB | 0.7/1.6 MB | 0.7/1.4 MB | 1.6/1.9 MB
Progress (4): 9.5 kB | 0.7/1.6 MB | 0.7/1.4 MB | 1.6/1.9 MB
                                                           
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.14.2/jackson-module-parameter-names-2.14.2.jar (9.5 kB at 17 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/client5/httpclient5/5.3.1/httpclient5-5.3.1.jar
Progress (3): 0.7/1.6 MB | 0.7/1.4 MB | 1.6/1.9 MB
Progress (3): 0.7/1.6 MB | 0.7/1.4 MB | 1.6/1.9 MB
Progress (3): 0.7/1.6 MB | 0.7/1.4 MB | 1.7/1.9 MB
Progress (3): 0.7/1.6 MB | 0.7/1.4 MB | 1.7/1.9 MB
Progress (3): 0.7/1.6 MB | 0.7/1.4 MB | 1.7/1.9 MB
Progress (3): 0.7/1.6 MB | 0.7/1.4 MB | 1.7/1.9 MB
Progress (3): 0.8/1.6 MB | 0.7/1.4 MB | 1.7/1.9 MB
Progress (3): 0.8/1.6 MB | 0.7/1.4 MB | 1.7/1.9 MB
Progress (3): 0.8/1.6 MB | 0.7/1.4 MB | 1.7/1.9 MB
Progress (3): 0.8/1.6 MB | 0.7/1.4 MB | 1.7/1.9 MB
Progress (4): 0.8/1.6 MB | 0.7/1.4 MB | 1.7/1.9 MB | 0/1.1 MB
Progress (4): 0.8/1.6 MB | 0.7/1.4 MB | 1.7/1.9 MB | 0/1.1 MB
Progress (4): 0.8/1.6 MB | 0.7/1.4 MB | 1.7/1.9 MB | 0/1.1 MB
Progress (4): 0.8/1.6 MB | 0.7/1.4 MB | 1.7/1.9 MB | 0/1.1 MB
Progress (4): 0.8/1.6 MB | 0.7/1.4 MB | 1.7/1.9 MB | 0/1.1 MB
Progress (4): 0.8/1.6 MB | 0.7/1.4 MB | 1.7/1.9 MB | 0/1.1 MB
Progress (4): 0.8/1.6 MB | 0.7/1.4 MB | 1.7/1.9 MB | 0/1.1 MB
Progress (4): 0.8/1.6 MB | 0.7/1.4 MB | 1.7/1.9 MB | 0/1.1 MB
Progress (4): 0.8/1.6 MB | 0.8/1.4 MB | 1.7/1.9 MB | 0/1.1 MB
Progress (4): 0.8/1.6 MB | 0.8/1.4 MB | 1.7/1.9 MB | 0/1.1 MB
Progress (4): 0.8/1.6 MB | 0.8/1.4 MB | 1.7/1.9 MB | 0/1.1 MB
Progress (4): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0/1.1 MB
Progress (4): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0/1.1 MB
Progress (4): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB
Progress (4): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB
Progress (4): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB
Progress (4): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB
Progress (4): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB
Progress (5): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 7.7/862 kB
Progress (5): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 16/862 kB 
Progress (5): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 32/862 kB
Progress (5): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 49/862 kB
Progress (5): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 49/862 kB
Progress (5): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 49/862 kB
Progress (5): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 49/862 kB
Progress (5): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 65/862 kB
Progress (5): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 81/862 kB
Progress (5): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 98/862 kB
Progress (5): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 98/862 kB
Progress (5): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 114/862 kB
Progress (5): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 114/862 kB
Progress (5): 0.8/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 114/862 kB
Progress (5): 0.9/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 114/862 kB
Progress (5): 0.9/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 130/862 kB
Progress (5): 0.9/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 147/862 kB
Progress (5): 0.9/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 163/862 kB
Progress (5): 0.9/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 163/862 kB
Progress (5): 0.9/1.6 MB | 0.8/1.4 MB | 1.8/1.9 MB | 0.1/1.1 MB | 163/862 kB
Progress (5): 0.9/1.6 MB | 0.8/1.4 MB | 1.9/1.9 MB | 0.1/1.1 MB | 163/862 kB
Progress (5): 0.9/1.6 MB | 0.8/1.4 MB | 1.9/1.9 MB | 0.1/1.1 MB | 163/862 kB
Progress (5): 0.9/1.6 MB | 0.8/1.4 MB | 1.9/1.9 MB | 0.1/1.1 MB | 163/862 kB
Progress (5): 0.9/1.6 MB | 0.8/1.4 MB | 1.9/1.9 MB | 0.1/1.1 MB | 163/862 kB
Progress (5): 0.9/1.6 MB | 0.8/1.4 MB | 1.9/1.9 MB | 0.1/1.1 MB | 163/862 kB
Progress (5): 0.9/1.6 MB | 0.8/1.4 MB | 1.9 MB | 0.1/1.1 MB | 163/862 kB    
Progress (5): 0.9/1.6 MB | 0.8/1.4 MB | 1.9 MB | 0.1/1.1 MB | 163/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.1/1.1 MB | 163/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.1/1.1 MB | 163/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.1/1.1 MB | 179/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.1/1.1 MB | 179/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.1/1.1 MB | 179/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.1/1.1 MB | 179/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 179/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 196/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 196/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 212/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 228/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 228/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 245/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 245/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 261/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 278/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 278/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 294/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 310/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 327/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 327/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 327/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 343/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 343/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 343/862 kB
Progress (5): 0.9/1.6 MB | 0.9/1.4 MB | 1.9 MB | 0.2/1.1 MB | 343/862 kB
                                                                        
Downloaded from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna/5.13.0/jna-5.13.0.jar (1.9 MB at 2.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5/5.2.4/httpcore5-5.2.4.jar
Progress (4): 0.9/1.6 MB | 0.9/1.4 MB | 0.2/1.1 MB | 343/862 kB
Progress (4): 1.0/1.6 MB | 0.9/1.4 MB | 0.2/1.1 MB | 343/862 kB
Progress (4): 1.0/1.6 MB | 0.9/1.4 MB | 0.2/1.1 MB | 343/862 kB
Progress (4): 1.0/1.6 MB | 0.9/1.4 MB | 0.2/1.1 MB | 360/862 kB
Progress (4): 1.0/1.6 MB | 0.9/1.4 MB | 0.2/1.1 MB | 376/862 kB
Progress (4): 1.0/1.6 MB | 0.9/1.4 MB | 0.2/1.1 MB | 392/862 kB
Progress (4): 1.0/1.6 MB | 0.9/1.4 MB | 0.2/1.1 MB | 409/862 kB
Progress (4): 1.0/1.6 MB | 0.9/1.4 MB | 0.2/1.1 MB | 425/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.2/1.1 MB | 425/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.2/1.1 MB | 425/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.2/1.1 MB | 425/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.2/1.1 MB | 441/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 441/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 441/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 458/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 458/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 474/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 491/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 491/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 507/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 507/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 507/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 507/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 507/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 523/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 523/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 523/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 540/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 540/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 556/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 573/862 kB
Progress (4): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 573/862 kB
Progress (5): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 573/862 kB | 7.7/855 kB
Progress (5): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 573/862 kB | 16/855 kB 
Progress (5): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 573/862 kB | 32/855 kB
Progress (5): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 589/862 kB | 32/855 kB
Progress (5): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 589/862 kB | 49/855 kB
Progress (5): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 605/862 kB | 49/855 kB
Progress (5): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 622/862 kB | 49/855 kB
Progress (5): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 622/862 kB | 65/855 kB
Progress (5): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 622/862 kB | 65/855 kB
Progress (5): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 638/862 kB | 65/855 kB
Progress (5): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 638/862 kB | 81/855 kB
Progress (5): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 638/862 kB | 98/855 kB
Progress (5): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 654/862 kB | 98/855 kB
Progress (5): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 654/862 kB | 98/855 kB
Progress (5): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 654/862 kB | 115/855 kB
Progress (5): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 654/862 kB | 131/855 kB
Progress (5): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 671/862 kB | 131/855 kB
Progress (5): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 671/862 kB | 131/855 kB
Progress (5): 1.0/1.6 MB | 1.0/1.4 MB | 0.3/1.1 MB | 671/862 kB | 147/855 kB
Progress (5): 1.0/1.6 MB | 1.1/1.4 MB | 0.3/1.1 MB | 671/862 kB | 147/855 kB
Progress (5): 1.0/1.6 MB | 1.1/1.4 MB | 0.3/1.1 MB | 671/862 kB | 164/855 kB
Progress (5): 1.0/1.6 MB | 1.1/1.4 MB | 0.3/1.1 MB | 671/862 kB | 180/855 kB
Progress (5): 1.0/1.6 MB | 1.1/1.4 MB | 0.3/1.1 MB | 671/862 kB | 180/855 kB
Progress (5): 1.0/1.6 MB | 1.1/1.4 MB | 0.3/1.1 MB | 671/862 kB | 180/855 kB
Progress (5): 1.0/1.6 MB | 1.1/1.4 MB | 0.4/1.1 MB | 671/862 kB | 180/855 kB
Progress (5): 1.0/1.6 MB | 1.1/1.4 MB | 0.4/1.1 MB | 671/862 kB | 180/855 kB
Progress (5): 1.0/1.6 MB | 1.1/1.4 MB | 0.4/1.1 MB | 671/862 kB | 180/855 kB
Progress (5): 1.0/1.6 MB | 1.1/1.4 MB | 0.4/1.1 MB | 671/862 kB | 180/855 kB
Progress (5): 1.0/1.6 MB | 1.1/1.4 MB | 0.4/1.1 MB | 687/862 kB | 180/855 kB
Progress (5): 1.0/1.6 MB | 1.1/1.4 MB | 0.4/1.1 MB | 687/862 kB | 180/855 kB
Progress (5): 1.0/1.6 MB | 1.1/1.4 MB | 0.4/1.1 MB | 704/862 kB | 180/855 kB
Progress (5): 1.0/1.6 MB | 1.1/1.4 MB | 0.4/1.1 MB | 704/862 kB | 180/855 kB
Progress (5): 1.0/1.6 MB | 1.1/1.4 MB | 0.4/1.1 MB | 720/862 kB | 180/855 kB
Progress (5): 1.0/1.6 MB | 1.1/1.4 MB | 0.4/1.1 MB | 720/862 kB | 180/855 kB
Progress (5): 1.1/1.6 MB | 1.1/1.4 MB | 0.4/1.1 MB | 720/862 kB | 180/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 720/862 kB | 180/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 720/862 kB | 197/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 736/862 kB | 197/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 753/862 kB | 197/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 769/862 kB | 197/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 769/862 kB | 213/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 769/862 kB | 229/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 786/862 kB | 229/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 786/862 kB | 246/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 802/862 kB | 246/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 802/862 kB | 246/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 802/862 kB | 262/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 818/862 kB | 262/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 818/862 kB | 279/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 835/862 kB | 279/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 835/862 kB | 295/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 835/862 kB | 311/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 835/862 kB | 311/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 835/862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 835/862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 835/862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 851/862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 862 kB | 328/855 kB    
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.2/1.4 MB | 0.4/1.1 MB | 862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.4/1.1 MB | 862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 328/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 344/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 360/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 360/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 377/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 393/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 410/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 426/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 442/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 459/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 475/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 492/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 508/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 524/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 541/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 541/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 557/855 kB
Progress (5): 1.1/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 557/855 kB
Progress (5): 1.2/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 557/855 kB
Progress (5): 1.2/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 573/855 kB
Progress (5): 1.2/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 590/855 kB
Progress (5): 1.2/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 590/855 kB
Progress (5): 1.2/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 606/855 kB
Progress (5): 1.2/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 606/855 kB
Progress (5): 1.2/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 606/855 kB
Progress (5): 1.2/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 623/855 kB
Progress (5): 1.2/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 623/855 kB
Progress (5): 1.2/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 639/855 kB
Progress (5): 1.2/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 639/855 kB
Progress (5): 1.2/1.6 MB | 1.3/1.4 MB | 0.5/1.1 MB | 862 kB | 655/855 kB
Progress (5): 1.2/1.6 MB | 1.3/1.4 MB | 0.6/1.1 MB | 862 kB | 655/855 kB
Progress (5): 1.2/1.6 MB | 1.3/1.4 MB | 0.6/1.1 MB | 862 kB | 655/855 kB
Progress (5): 1.2/1.6 MB | 1.3/1.4 MB | 0.6/1.1 MB | 862 kB | 672/855 kB
Progress (5): 1.2/1.6 MB | 1.3/1.4 MB | 0.6/1.1 MB | 862 kB | 688/855 kB
Progress (5): 1.2/1.6 MB | 1.3/1.4 MB | 0.6/1.1 MB | 862 kB | 688/855 kB
Progress (5): 1.2/1.6 MB | 1.3/1.4 MB | 0.6/1.1 MB | 862 kB | 705/855 kB
Progress (5): 1.2/1.6 MB | 1.4 MB | 0.6/1.1 MB | 862 kB | 705/855 kB    
Progress (5): 1.2/1.6 MB | 1.4 MB | 0.6/1.1 MB | 862 kB | 721/855 kB
Progress (5): 1.2/1.6 MB | 1.4 MB | 0.6/1.1 MB | 862 kB | 721/855 kB
Progress (5): 1.2/1.6 MB | 1.4 MB | 0.6/1.1 MB | 862 kB | 737/855 kB
Progress (5): 1.2/1.6 MB | 1.4 MB | 0.6/1.1 MB | 862 kB | 737/855 kB
Progress (5): 1.2/1.6 MB | 1.4 MB | 0.6/1.1 MB | 862 kB | 754/855 kB
                                                                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/client5/httpclient5/5.3.1/httpclient5-5.3.1.jar (862 kB at 727 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5-h2/5.2.4/httpcore5-h2-5.2.4.jar
Progress (4): 1.2/1.6 MB | 1.4 MB | 0.6/1.1 MB | 754/855 kB
Progress (4): 1.2/1.6 MB | 1.4 MB | 0.6/1.1 MB | 754/855 kB
Progress (4): 1.2/1.6 MB | 1.4 MB | 0.6/1.1 MB | 770/855 kB
Progress (4): 1.2/1.6 MB | 1.4 MB | 0.6/1.1 MB | 786/855 kB
Progress (4): 1.2/1.6 MB | 1.4 MB | 0.6/1.1 MB | 803/855 kB
Progress (4): 1.2/1.6 MB | 1.4 MB | 0.6/1.1 MB | 819/855 kB
Progress (4): 1.2/1.6 MB | 1.4 MB | 0.6/1.1 MB | 819/855 kB
Progress (4): 1.2/1.6 MB | 1.4 MB | 0.6/1.1 MB | 836/855 kB
Progress (4): 1.2/1.6 MB | 1.4 MB | 0.6/1.1 MB | 836/855 kB
Progress (4): 1.2/1.6 MB | 1.4 MB | 0.6/1.1 MB | 836/855 kB
Progress (4): 1.2/1.6 MB | 1.4 MB | 0.6/1.1 MB | 852/855 kB
Progress (4): 1.2/1.6 MB | 1.4 MB | 0.6/1.1 MB | 855 kB    
Progress (4): 1.3/1.6 MB | 1.4 MB | 0.6/1.1 MB | 855 kB
Progress (4): 1.3/1.6 MB | 1.4 MB | 0.6/1.1 MB | 855 kB
Progress (4): 1.3/1.6 MB | 1.4 MB | 0.7/1.1 MB | 855 kB
Progress (4): 1.3/1.6 MB | 1.4 MB | 0.7/1.1 MB | 855 kB
Progress (4): 1.3/1.6 MB | 1.4 MB | 0.7/1.1 MB | 855 kB
Progress (4): 1.3/1.6 MB | 1.4 MB | 0.7/1.1 MB | 855 kB
Progress (5): 1.3/1.6 MB | 1.4 MB | 0.7/1.1 MB | 855 kB | 7.3/237 kB
Progress (5): 1.3/1.6 MB | 1.4 MB | 0.7/1.1 MB | 855 kB | 7.3/237 kB
Progress (5): 1.3/1.6 MB | 1.4 MB | 0.7/1.1 MB | 855 kB | 15/237 kB 
Progress (5): 1.3/1.6 MB | 1.4 MB | 0.7/1.1 MB | 855 kB | 15/237 kB
Progress (5): 1.3/1.6 MB | 1.4 MB | 0.7/1.1 MB | 855 kB | 32/237 kB
Progress (5): 1.3/1.6 MB | 1.4 MB | 0.7/1.1 MB | 855 kB | 32/237 kB
Progress (5): 1.3/1.6 MB | 1.4 MB | 0.7/1.1 MB | 855 kB | 32/237 kB
Progress (5): 1.3/1.6 MB | 1.4 MB | 0.7/1.1 MB | 855 kB | 32/237 kB
                                                                   
Downloaded from central: https://repo.maven.apache.org/maven2/net/java/dev/jna/jna-platform/5.13.0/jna-platform-5.13.0.jar (1.4 MB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/tomlj/tomlj/1.0.0/tomlj-1.0.0.jar
Progress (4): 1.4/1.6 MB | 0.7/1.1 MB | 855 kB | 32/237 kB
Progress (4): 1.4/1.6 MB | 0.7/1.1 MB | 855 kB | 48/237 kB
Progress (4): 1.4/1.6 MB | 0.7/1.1 MB | 855 kB | 48/237 kB
Progress (4): 1.4/1.6 MB | 0.7/1.1 MB | 855 kB | 65/237 kB
Progress (4): 1.4/1.6 MB | 0.7/1.1 MB | 855 kB | 65/237 kB
Progress (4): 1.4/1.6 MB | 0.7/1.1 MB | 855 kB | 65/237 kB
                                                          
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5/5.2.4/httpcore5-5.2.4.jar (855 kB at 672 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.7.2/antlr4-runtime-4.7.2.jar
Progress (3): 1.4/1.6 MB | 0.7/1.1 MB | 65/237 kB
Progress (3): 1.4/1.6 MB | 0.7/1.1 MB | 65/237 kB
Progress (3): 1.4/1.6 MB | 0.7/1.1 MB | 81/237 kB
Progress (4): 1.4/1.6 MB | 0.7/1.1 MB | 81/237 kB | 7.7/157 kB
Progress (4): 1.4/1.6 MB | 0.7/1.1 MB | 81/237 kB | 15/157 kB 
Progress (4): 1.4/1.6 MB | 0.7/1.1 MB | 81/237 kB | 32/157 kB
Progress (4): 1.4/1.6 MB | 0.7/1.1 MB | 81/237 kB | 32/157 kB
Progress (4): 1.4/1.6 MB | 0.7/1.1 MB | 81/237 kB | 48/157 kB
Progress (4): 1.4/1.6 MB | 0.8/1.1 MB | 81/237 kB | 48/157 kB
Progress (4): 1.4/1.6 MB | 0.8/1.1 MB | 97/237 kB | 48/157 kB
Progress (4): 1.4/1.6 MB | 0.8/1.1 MB | 97/237 kB | 65/157 kB
Progress (4): 1.4/1.6 MB | 0.8/1.1 MB | 97/237 kB | 65/157 kB
Progress (4): 1.4/1.6 MB | 0.8/1.1 MB | 97/237 kB | 81/157 kB
Progress (4): 1.4/1.6 MB | 0.8/1.1 MB | 97/237 kB | 81/157 kB
Progress (4): 1.4/1.6 MB | 0.8/1.1 MB | 97/237 kB | 97/157 kB
Progress (4): 1.4/1.6 MB | 0.8/1.1 MB | 97/237 kB | 97/157 kB
Progress (4): 1.4/1.6 MB | 0.8/1.1 MB | 114/237 kB | 97/157 kB
Progress (4): 1.4/1.6 MB | 0.8/1.1 MB | 114/237 kB | 114/157 kB
Progress (4): 1.4/1.6 MB | 0.8/1.1 MB | 114/237 kB | 130/157 kB
Progress (4): 1.4/1.6 MB | 0.8/1.1 MB | 114/237 kB | 147/157 kB
Progress (4): 1.4/1.6 MB | 0.8/1.1 MB | 130/237 kB | 147/157 kB
Progress (4): 1.4/1.6 MB | 0.8/1.1 MB | 130/237 kB | 147/157 kB
Progress (4): 1.4/1.6 MB | 0.8/1.1 MB | 130/237 kB | 147/157 kB
Progress (5): 1.4/1.6 MB | 0.8/1.1 MB | 130/237 kB | 147/157 kB | 3.1/338 kB
Progress (5): 1.4/1.6 MB | 0.8/1.1 MB | 130/237 kB | 147/157 kB | 20/338 kB 
Progress (5): 1.4/1.6 MB | 0.8/1.1 MB | 130/237 kB | 157 kB | 20/338 kB    
Progress (5): 1.4/1.6 MB | 0.8/1.1 MB | 130/237 kB | 157 kB | 36/338 kB
Progress (5): 1.4/1.6 MB | 0.8/1.1 MB | 130/237 kB | 157 kB | 52/338 kB
Progress (5): 1.4/1.6 MB | 0.8/1.1 MB | 130/237 kB | 157 kB | 60/338 kB
Progress (5): 1.4/1.6 MB | 0.8/1.1 MB | 130/237 kB | 157 kB | 60/338 kB
Progress (5): 1.4/1.6 MB | 0.8/1.1 MB | 147/237 kB | 157 kB | 60/338 kB
Progress (5): 1.4/1.6 MB | 0.8/1.1 MB | 147/237 kB | 157 kB | 77/338 kB
Progress (5): 1.4/1.6 MB | 0.8/1.1 MB | 147/237 kB | 157 kB | 77/338 kB
Progress (5): 1.4/1.6 MB | 0.8/1.1 MB | 147/237 kB | 157 kB | 93/338 kB
Progress (5): 1.4/1.6 MB | 0.8/1.1 MB | 147/237 kB | 157 kB | 110/338 kB
Progress (5): 1.4/1.6 MB | 0.8/1.1 MB | 147/237 kB | 157 kB | 126/338 kB
Progress (5): 1.4/1.6 MB | 0.8/1.1 MB | 147/237 kB | 157 kB | 142/338 kB
Progress (5): 1.4/1.6 MB | 0.8/1.1 MB | 147/237 kB | 157 kB | 142/338 kB
Progress (5): 1.4/1.6 MB | 0.8/1.1 MB | 163/237 kB | 157 kB | 142/338 kB
Progress (5): 1.4/1.6 MB | 0.8/1.1 MB | 163/237 kB | 157 kB | 159/338 kB
Progress (5): 1.4/1.6 MB | 0.8/1.1 MB | 163/237 kB | 157 kB | 175/338 kB
Progress (5): 1.5/1.6 MB | 0.8/1.1 MB | 163/237 kB | 157 kB | 175/338 kB
Progress (5): 1.5/1.6 MB | 0.8/1.1 MB | 163/237 kB | 157 kB | 175/338 kB
Progress (5): 1.5/1.6 MB | 0.8/1.1 MB | 163/237 kB | 157 kB | 175/338 kB
Progress (5): 1.5/1.6 MB | 0.8/1.1 MB | 179/237 kB | 157 kB | 175/338 kB
Progress (5): 1.5/1.6 MB | 0.9/1.1 MB | 179/237 kB | 157 kB | 175/338 kB
Progress (5): 1.5/1.6 MB | 0.9/1.1 MB | 179/237 kB | 157 kB | 192/338 kB
Progress (5): 1.5/1.6 MB | 0.9/1.1 MB | 196/237 kB | 157 kB | 192/338 kB
Progress (5): 1.5/1.6 MB | 0.9/1.1 MB | 196/237 kB | 157 kB | 192/338 kB
Progress (5): 1.5/1.6 MB | 0.9/1.1 MB | 196/237 kB | 157 kB | 208/338 kB
Progress (5): 1.5/1.6 MB | 0.9/1.1 MB | 196/237 kB | 157 kB | 224/338 kB
Progress (5): 1.5/1.6 MB | 0.9/1.1 MB | 196/237 kB | 157 kB | 224/338 kB
Progress (5): 1.5/1.6 MB | 0.9/1.1 MB | 196/237 kB | 157 kB | 241/338 kB
Progress (5): 1.5/1.6 MB | 0.9/1.1 MB | 196/237 kB | 157 kB | 241/338 kB
Progress (5): 1.5/1.6 MB | 0.9/1.1 MB | 196/237 kB | 157 kB | 257/338 kB
Progress (5): 1.5/1.6 MB | 0.9/1.1 MB | 212/237 kB | 157 kB | 257/338 kB
                                                                        
Downloaded from central: https://repo.maven.apache.org/maven2/org/tomlj/tomlj/1.0.0/tomlj-1.0.0.jar (157 kB at 112 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar
Progress (4): 1.5/1.6 MB | 0.9/1.1 MB | 212/237 kB | 257/338 kB
Progress (4): 1.5/1.6 MB | 0.9/1.1 MB | 212/237 kB | 273/338 kB
Progress (4): 1.5/1.6 MB | 0.9/1.1 MB | 212/237 kB | 273/338 kB
Progress (4): 1.5/1.6 MB | 0.9/1.1 MB | 228/237 kB | 273/338 kB
Progress (4): 1.5/1.6 MB | 0.9/1.1 MB | 228/237 kB | 290/338 kB
Progress (4): 1.5/1.6 MB | 0.9/1.1 MB | 228/237 kB | 306/338 kB
Progress (4): 1.5/1.6 MB | 0.9/1.1 MB | 237 kB | 306/338 kB    
Progress (4): 1.5/1.6 MB | 0.9/1.1 MB | 237 kB | 306/338 kB
Progress (4): 1.5/1.6 MB | 0.9/1.1 MB | 237 kB | 306/338 kB
Progress (4): 1.5/1.6 MB | 0.9/1.1 MB | 237 kB | 306/338 kB
Progress (4): 1.5/1.6 MB | 0.9/1.1 MB | 237 kB | 306/338 kB
Progress (4): 1.5/1.6 MB | 0.9/1.1 MB | 237 kB | 323/338 kB
Progress (4): 1.5/1.6 MB | 0.9/1.1 MB | 237 kB | 323/338 kB
Progress (4): 1.6/1.6 MB | 0.9/1.1 MB | 237 kB | 323/338 kB
Progress (4): 1.6/1.6 MB | 0.9/1.1 MB | 237 kB | 338 kB    
Progress (4): 1.6/1.6 MB | 1.0/1.1 MB | 237 kB | 338 kB
Progress (4): 1.6/1.6 MB | 1.0/1.1 MB | 237 kB | 338 kB
Progress (4): 1.6/1.6 MB | 1.0/1.1 MB | 237 kB | 338 kB
Progress (5): 1.6/1.6 MB | 1.0/1.1 MB | 237 kB | 338 kB | 7.7/20 kB
Progress (5): 1.6/1.6 MB | 1.0/1.1 MB | 237 kB | 338 kB | 15/20 kB 
Progress (5): 1.6/1.6 MB | 1.0/1.1 MB | 237 kB | 338 kB | 20 kB   
Progress (5): 1.6/1.6 MB | 1.0/1.1 MB | 237 kB | 338 kB | 20 kB
Progress (5): 1.6/1.6 MB | 1.0/1.1 MB | 237 kB | 338 kB | 20 kB
Progress (5): 1.6/1.6 MB | 1.0/1.1 MB | 237 kB | 338 kB | 20 kB
Progress (5): 1.6 MB | 1.0/1.1 MB | 237 kB | 338 kB | 20 kB    
Progress (5): 1.6 MB | 1.0/1.1 MB | 237 kB | 338 kB | 20 kB
                                                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.7.2/antlr4-runtime-4.7.2.jar (338 kB at 232 kB/s)
Progress (4): 1.6 MB | 1.0/1.1 MB | 237 kB | 20 kB
                                                  
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/3.3.4/spring-boot-loader-tools-3.3.4.jar
Progress (4): 1.6 MB | 1.0/1.1 MB | 237 kB | 20 kB
Progress (4): 1.6 MB | 1.1/1.1 MB | 237 kB | 20 kB
Progress (4): 1.6 MB | 1.1/1.1 MB | 237 kB | 20 kB
Progress (5): 1.6 MB | 1.1/1.1 MB | 237 kB | 20 kB | 7.7/464 kB
Progress (5): 1.6 MB | 1.1/1.1 MB | 237 kB | 20 kB | 8.2/464 kB
Progress (5): 1.6 MB | 1.1 MB | 237 kB | 20 kB | 8.2/464 kB    
                                                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/httpcomponents/core5/httpcore5-h2/5.2.4/httpcore5-h2-5.2.4.jar (237 kB at 159 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.3.2/maven-common-artifact-filters-3.3.2.jar
Progress (4): 1.6 MB | 1.1 MB | 20 kB | 25/464 kB
Progress (4): 1.6 MB | 1.1 MB | 20 kB | 41/464 kB
                                                 
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.14.2/jackson-databind-2.14.2.jar (1.6 MB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.12.10/micrometer-observation-1.12.10.jar
Progress (3): 1.1 MB | 20 kB | 57/464 kB
Progress (3): 1.1 MB | 20 kB | 74/464 kB
Progress (3): 1.1 MB | 20 kB | 90/464 kB
Progress (3): 1.1 MB | 20 kB | 98/464 kB
Progress (4): 1.1 MB | 20 kB | 98/464 kB | 7.7/58 kB
Progress (4): 1.1 MB | 20 kB | 98/464 kB | 16/58 kB 
Progress (4): 1.1 MB | 20 kB | 98/464 kB | 28/58 kB
Progress (5): 1.1 MB | 20 kB | 98/464 kB | 28/58 kB | 7.7/72 kB
Progress (5): 1.1 MB | 20 kB | 98/464 kB | 28/58 kB | 12/72 kB 
Progress (5): 1.1 MB | 20 kB | 115/464 kB | 28/58 kB | 12/72 kB
Progress (5): 1.1 MB | 20 kB | 115/464 kB | 28/58 kB | 29/72 kB
                                                               
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-compress/1.25.0/commons-compress-1.25.0.jar (1.1 MB at 692 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.12.10/micrometer-commons-1.12.10.jar
Progress (4): 20 kB | 115/464 kB | 44/58 kB | 29/72 kB
Progress (4): 20 kB | 115/464 kB | 44/58 kB | 45/72 kB
Progress (4): 20 kB | 115/464 kB | 44/58 kB | 61/72 kB
Progress (4): 20 kB | 131/464 kB | 44/58 kB | 61/72 kB
Progress (4): 20 kB | 131/464 kB | 58 kB | 61/72 kB   
Progress (4): 20 kB | 131/464 kB | 58 kB | 72 kB   
Progress (4): 20 kB | 147/464 kB | 58 kB | 72 kB
Progress (4): 20 kB | 164/464 kB | 58 kB | 72 kB
Progress (4): 20 kB | 180/464 kB | 58 kB | 72 kB
Progress (5): 20 kB | 180/464 kB | 58 kB | 72 kB | 3.2/47 kB
Progress (5): 20 kB | 197/464 kB | 58 kB | 72 kB | 3.2/47 kB
Progress (5): 20 kB | 197/464 kB | 58 kB | 72 kB | 20/47 kB 
Progress (5): 20 kB | 197/464 kB | 58 kB | 72 kB | 36/47 kB
Progress (5): 20 kB | 197/464 kB | 58 kB | 72 kB | 47 kB   
Progress (5): 20 kB | 213/464 kB | 58 kB | 72 kB | 47 kB
Progress (5): 20 kB | 229/464 kB | 58 kB | 72 kB | 47 kB
Progress (5): 20 kB | 246/464 kB | 58 kB | 72 kB | 47 kB
Progress (5): 20 kB | 262/464 kB | 58 kB | 72 kB | 47 kB
Progress (5): 20 kB | 279/464 kB | 58 kB | 72 kB | 47 kB
Progress (5): 20 kB | 295/464 kB | 58 kB | 72 kB | 47 kB
                                                        
Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.12.10/micrometer-observation-1.12.10.jar (72 kB at 43 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/3.5.0/maven-shade-plugin-3.5.0.jar
Progress (4): 20 kB | 311/464 kB | 58 kB | 47 kB
Progress (4): 20 kB | 328/464 kB | 58 kB | 47 kB
Progress (4): 20 kB | 344/464 kB | 58 kB | 47 kB
                                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.3.2/maven-common-artifact-filters-3.3.2.jar (58 kB at 35 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.5/asm-9.5.jar
Progress (3): 20 kB | 360/464 kB | 47 kB
Progress (4): 20 kB | 360/464 kB | 47 kB | 3.2/147 kB
Progress (4): 20 kB | 377/464 kB | 47 kB | 3.2/147 kB
Progress (4): 20 kB | 377/464 kB | 47 kB | 20/147 kB 
Progress (4): 20 kB | 377/464 kB | 47 kB | 28/147 kB
Progress (4): 20 kB | 377/464 kB | 47 kB | 44/147 kB
Progress (4): 20 kB | 393/464 kB | 47 kB | 44/147 kB
Progress (4): 20 kB | 393/464 kB | 47 kB | 61/147 kB
Progress (4): 20 kB | 410/464 kB | 47 kB | 61/147 kB
Progress (4): 20 kB | 410/464 kB | 47 kB | 77/147 kB
Progress (5): 20 kB | 410/464 kB | 47 kB | 77/147 kB | 7.7/122 kB
Progress (5): 20 kB | 410/464 kB | 47 kB | 77/147 kB | 7.7/122 kB
Progress (5): 20 kB | 410/464 kB | 47 kB | 93/147 kB | 7.7/122 kB
Progress (5): 20 kB | 410/464 kB | 47 kB | 93/147 kB | 24/122 kB 
Progress (5): 20 kB | 410/464 kB | 47 kB | 110/147 kB | 24/122 kB
Progress (5): 20 kB | 426/464 kB | 47 kB | 110/147 kB | 24/122 kB
Progress (5): 20 kB | 426/464 kB | 47 kB | 110/147 kB | 40/122 kB
Progress (5): 20 kB | 426/464 kB | 47 kB | 126/147 kB | 40/122 kB
Progress (5): 20 kB | 426/464 kB | 47 kB | 126/147 kB | 57/122 kB
Progress (5): 20 kB | 426/464 kB | 47 kB | 126/147 kB | 73/122 kB
Progress (5): 20 kB | 442/464 kB | 47 kB | 126/147 kB | 73/122 kB
Progress (5): 20 kB | 442/464 kB | 47 kB | 142/147 kB | 73/122 kB
Progress (5): 20 kB | 442/464 kB | 47 kB | 147 kB | 73/122 kB    
Progress (5): 20 kB | 442/464 kB | 47 kB | 147 kB | 90/122 kB
Progress (5): 20 kB | 459/464 kB | 47 kB | 147 kB | 90/122 kB
Progress (5): 20 kB | 459/464 kB | 47 kB | 147 kB | 106/122 kB
Progress (5): 20 kB | 464 kB | 47 kB | 147 kB | 106/122 kB    
Progress (5): 20 kB | 464 kB | 47 kB | 147 kB | 122 kB    
                                                      
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-shade-plugin/3.5.0/maven-shade-plugin-3.5.0.jar (147 kB at 80 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.5/asm-commons-9.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-loader-tools/3.3.4/spring-boot-loader-tools-3.3.4.jar (464 kB at 253 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.5/asm-tree-9.5.jar
Progress (4): 20 kB | 47 kB | 122 kB | 3.2/72 kB
Progress (4): 20 kB | 47 kB | 122 kB | 20/72 kB 
Progress (4): 20 kB | 47 kB | 122 kB | 28/72 kB
Progress (4): 20 kB | 47 kB | 122 kB | 44/72 kB
Progress (4): 20 kB | 47 kB | 122 kB | 61/72 kB
                                               
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.5/asm-9.5.jar (122 kB at 65 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jdom/jdom2/2.0.6.1/jdom2-2.0.6.1.jar
Progress (3): 20 kB | 47 kB | 72 kB
Progress (4): 20 kB | 47 kB | 72 kB | 7.7/52 kB
Progress (4): 20 kB | 47 kB | 72 kB | 15/52 kB 
Progress (5): 20 kB | 47 kB | 72 kB | 15/52 kB | 3.2/328 kB
Progress (5): 20 kB | 47 kB | 72 kB | 32/52 kB | 3.2/328 kB
Progress (5): 20 kB | 47 kB | 72 kB | 32/52 kB | 20/328 kB 
Progress (5): 20 kB | 47 kB | 72 kB | 32/52 kB | 28/328 kB
Progress (5): 20 kB | 47 kB | 72 kB | 32/52 kB | 44/328 kB
Progress (5): 20 kB | 47 kB | 72 kB | 48/52 kB | 44/328 kB
Progress (5): 20 kB | 47 kB | 72 kB | 48/52 kB | 61/328 kB
Progress (5): 20 kB | 47 kB | 72 kB | 52 kB | 61/328 kB   
                                                       
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-commons/9.5/asm-commons-9.5.jar (72 kB at 38 kB/s)
Progress (4): 20 kB | 47 kB | 52 kB | 77/328 kB
                                               
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/3.2.1/maven-dependency-tree-3.2.1.jar
Progress (4): 20 kB | 47 kB | 52 kB | 93/328 kB
Progress (4): 20 kB | 47 kB | 52 kB | 110/328 kB
Progress (4): 20 kB | 47 kB | 52 kB | 126/328 kB
Progress (4): 20 kB | 47 kB | 52 kB | 142/328 kB
Progress (4): 20 kB | 47 kB | 52 kB | 159/328 kB
Progress (4): 20 kB | 47 kB | 52 kB | 175/328 kB
Progress (4): 20 kB | 47 kB | 52 kB | 192/328 kB
Progress (4): 20 kB | 47 kB | 52 kB | 208/328 kB
Progress (4): 20 kB | 47 kB | 52 kB | 224/328 kB
Progress (4): 20 kB | 47 kB | 52 kB | 241/328 kB
Progress (4): 20 kB | 47 kB | 52 kB | 257/328 kB
Progress (4): 20 kB | 47 kB | 52 kB | 274/328 kB
Progress (4): 20 kB | 47 kB | 52 kB | 290/328 kB
Progress (5): 20 kB | 47 kB | 52 kB | 290/328 kB | 7.7/43 kB
Progress (5): 20 kB | 47 kB | 52 kB | 290/328 kB | 7.7/43 kB
Progress (5): 20 kB | 47 kB | 52 kB | 306/328 kB | 7.7/43 kB
Progress (5): 20 kB | 47 kB | 52 kB | 306/328 kB | 24/43 kB 
Progress (5): 20 kB | 47 kB | 52 kB | 323/328 kB | 24/43 kB
Progress (5): 20 kB | 47 kB | 52 kB | 323/328 kB | 40/43 kB
Progress (5): 20 kB | 47 kB | 52 kB | 328 kB | 40/43 kB    
Progress (5): 20 kB | 47 kB | 52 kB | 328 kB | 43 kB   
                                                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm-tree/9.5/asm-tree-9.5.jar (52 kB at 26 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.13.0/commons-io-2.13.0.jar
Progress (5): 20 kB | 47 kB | 328 kB | 43 kB | 7.7/484 kB
Progress (5): 20 kB | 47 kB | 328 kB | 43 kB | 11/484 kB 
Progress (5): 20 kB | 47 kB | 328 kB | 43 kB | 28/484 kB
Progress (5): 20 kB | 47 kB | 328 kB | 43 kB | 44/484 kB
Progress (5): 20 kB | 47 kB | 328 kB | 43 kB | 61/484 kB
Progress (5): 20 kB | 47 kB | 328 kB | 43 kB | 77/484 kB
                                                        
Downloaded from central: https://repo.maven.apache.org/maven2/org/jdom/jdom2/2.0.6.1/jdom2-2.0.6.1.jar (328 kB at 161 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/vafer/jdependency/2.8.0/jdependency-2.8.0.jar
Progress (4): 20 kB | 47 kB | 43 kB | 93/484 kB
Progress (4): 20 kB | 47 kB | 43 kB | 110/484 kB
Progress (4): 20 kB | 47 kB | 43 kB | 126/484 kB
Progress (4): 20 kB | 47 kB | 43 kB | 142/484 kB
Progress (5): 20 kB | 47 kB | 43 kB | 142/484 kB | 7.7/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 142/484 kB | 16/233 kB 
Progress (5): 20 kB | 47 kB | 43 kB | 159/484 kB | 16/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 159/484 kB | 28/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 159/484 kB | 44/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 175/484 kB | 44/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 175/484 kB | 61/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 175/484 kB | 77/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 192/484 kB | 77/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 192/484 kB | 93/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 192/484 kB | 110/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 192/484 kB | 126/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 192/484 kB | 126/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 208/484 kB | 126/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 208/484 kB | 142/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 208/484 kB | 159/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 208/484 kB | 175/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 224/484 kB | 175/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 224/484 kB | 192/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 224/484 kB | 208/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 241/484 kB | 208/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 241/484 kB | 224/233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 241/484 kB | 233 kB    
Progress (5): 20 kB | 47 kB | 43 kB | 257/484 kB | 233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 274/484 kB | 233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 290/484 kB | 233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 306/484 kB | 233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 323/484 kB | 233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 339/484 kB | 233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 355/484 kB | 233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 372/484 kB | 233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 388/484 kB | 233 kB
Progress (5): 20 kB | 47 kB | 43 kB | 405/484 kB | 233 kB
                                                         
Downloaded from central: https://repo.maven.apache.org/maven2/org/vafer/jdependency/2.8.0/jdependency-2.8.0.jar (233 kB at 107 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-collections4/4.4/commons-collections4-4.4.jar
Progress (4): 20 kB | 47 kB | 43 kB | 421/484 kB
Progress (4): 20 kB | 47 kB | 43 kB | 437/484 kB
Progress (4): 20 kB | 47 kB | 43 kB | 454/484 kB
Progress (4): 20 kB | 47 kB | 43 kB | 470/484 kB
Progress (5): 20 kB | 47 kB | 43 kB | 470/484 kB | 7.7/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 470/484 kB | 16/752 kB 
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 16/752 kB    
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 28/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 44/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 61/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 77/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 93/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 110/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 126/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 126/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 142/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 159/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 175/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 192/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 208/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 213/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 229/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 246/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 262/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 279/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 295/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 311/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 328/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 344/752 kB
Progress (5): 20 kB | 47 kB | 43 kB | 484 kB | 360/752 kB
                                                         
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.13.0/commons-io-2.13.0.jar (484 kB at 213 kB/s)
Progress (4): 20 kB | 47 kB | 43 kB | 377/752 kB
Progress (4): 20 kB | 47 kB | 43 kB | 393/752 kB
Progress (4): 20 kB | 47 kB | 43 kB | 410/752 kB
Progress (4): 20 kB | 47 kB | 43 kB | 426/752 kB
Progress (4): 20 kB | 47 kB | 43 kB | 442/752 kB
Progress (4): 20 kB | 47 kB | 43 kB | 459/752 kB
Progress (4): 20 kB | 47 kB | 43 kB | 475/752 kB
Progress (4): 20 kB | 47 kB | 43 kB | 492/752 kB
Progress (4): 20 kB | 47 kB | 43 kB | 508/752 kB
Progress (4): 20 kB | 47 kB | 43 kB | 524/752 kB
Progress (4): 20 kB | 47 kB | 43 kB | 541/752 kB
Progress (4): 20 kB | 47 kB | 43 kB | 557/752 kB
Progress (4): 20 kB | 47 kB | 43 kB | 573/752 kB
Progress (4): 20 kB | 47 kB | 43 kB | 590/752 kB
Progress (4): 20 kB | 47 kB | 43 kB | 606/752 kB
Progress (4): 20 kB | 47 kB | 43 kB | 623/752 kB
Progress (4): 20 kB | 47 kB | 43 kB | 639/752 kB
Progress (4): 20 kB | 47 kB | 43 kB | 655/752 kB
Progress (4): 20 kB | 47 kB | 43 kB | 672/752 kB
                                                
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/code/findbugs/jsr305/3.0.2/jsr305-3.0.2.jar (20 kB at 8.6 kB/s)
Progress (3): 47 kB | 43 kB | 688/752 kB
Progress (3): 47 kB | 43 kB | 705/752 kB
Progress (3): 47 kB | 43 kB | 721/752 kB
Progress (3): 47 kB | 43 kB | 737/752 kB
Progress (3): 47 kB | 43 kB | 752 kB    
                                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-collections4/4.4/commons-collections4-4.4.jar (752 kB at 314 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-dependency-tree/3.2.1/maven-dependency-tree-3.2.1.jar (43 kB at 15 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.12.10/micrometer-commons-1.12.10.jar (47 kB at 16 kB/s)
[INFO] Replacing main artifact C:\ProgramData\Jenkins\.jenkins\workspace\Travel-Insurance-Pipeline\target\travel-insurance-claim-system-1.0.0.jar with repackaged archive, adding nested dependencies in BOOT-INF/.
[INFO] The original artifact has been renamed to C:\ProgramData\Jenkins\.jenkins\workspace\Travel-Insurance-Pipeline\target\travel-insurance-claim-system-1.0.0.jar.original
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  29.746 s
[INFO] Finished at: 2026-10-09T01:38:23+05:30
[INFO] ------------------------------------------------------------------------
[Pipeline] }
[Pipeline] // stage
[Pipeline] stage
[Pipeline] { (Deploy)
[Pipeline] echo
Deployment preparation completed for environment: dev
[Pipeline] }
[Pipeline] // stage
[Pipeline] }
[Pipeline] // withEnv
[Pipeline] }
[Pipeline] // node
[Pipeline] End of Pipeline
Finished: SUCCESS
Jenkins 2.580.1