# Task 7 — Jenkins Installation and CI Job

## 1. Objective
Jenkins is used as the CI server to automatically retrieve the GitHub project and execute the Maven build/tests.

## 2. Jenkins Setup
- Jenkins installed on Windows
- Jenkins LTS installation
- Jenkins URL: [http://localhost:8082/](http://localhost:8082/)
- Java 25 environment
- Jenkins admin setup
- Relevant plugins installed through suggested plugins

## 3. Jenkins Job
- **Job name:** Travel-Insurance-CI
- **Job type:** Freestyle project
- **Git repository:** [https://github.com/Hexecutionerr/travel-insurance-claim-system.git](https://github.com/Hexecutionerr/travel-insurance-claim-system.git)
- **Branch:** `*/main`

## 4. Build Step
The actual Windows batch command used for the build step:
```cmd
call mvnw.cmd clean test
```
Maven Wrapper is used, so a separate global Maven installation is not required.

## 5. CI Build Result
The actual Jenkins build result:
- Tests run: 8
- Failures: 0
- Errors: 0
- Skipped: 0
- Result: BUILD SUCCESS
- Jenkins build status: SUCCESS

## 6. Verification
- [ ] Jenkins accessible
- [ ] GitHub repository configured
- [ ] main branch configured
- [ ] Maven build executed
- [ ] automated tests executed
- [ ] build passed successfully

## 7. Evidence
- [ ] Jenkins dashboard
- [ ] Jenkins job configuration
- [ ] Git repository/branch configuration
- [ ] Successful Console Output



Perfect ✅ TASK 7 — DONE 🔒

Tumhara CI foundation properly working hai:

GitHub main
     ↓
  Jenkins
     ↓
 Maven Wrapper
     ↓
  8 Tests
     ↓
  0 Failures
     ↓
BUILD SUCCESS ✅
Progress
Task	Status
1	✅ Done
2	✅ Done
3	✅ Done
4	✅ Done
5	✅ Done
6	✅ Done
7	✅ Done
8	🔜 Next




-----------------------------------------------------------------------------------------------
                                         Jenkins console output
-----------------------------------------------------------------------------------------------

Started by user Hasnain khan

Running as SYSTEM
Building in workspace C:\ProgramData\Jenkins\.jenkins\workspace\Travel-Insurance-CI
The recommended git tool is: NONE
No credentials specified
Cloning the remote Git repository
Cloning repository https://github.com/Hexecutionerr/travel-insurance-claim-system.git
 > git.exe init C:\ProgramData\Jenkins\.jenkins\workspace\Travel-Insurance-CI # timeout=10
Fetching upstream changes from https://github.com/Hexecutionerr/travel-insurance-claim-system.git
 > git.exe --version # timeout=10
 > git --version # 'git version 2.51.1.windows.1'
 > git.exe fetch --tags --force --progress -- https://github.com/Hexecutionerr/travel-insurance-claim-system.git +refs/heads/*:refs/remotes/origin/* # timeout=10
 > git.exe config remote.origin.url https://github.com/Hexecutionerr/travel-insurance-claim-system.git # timeout=10
 > git.exe config --add remote.origin.fetch +refs/heads/*:refs/remotes/origin/* # timeout=10
Avoid second fetch
 > git.exe rev-parse "refs/remotes/origin/main^{commit}" # timeout=10
Checking out Revision bae7ec49e4a1e24c10642d3427aaa26b9ccb91e0 (refs/remotes/origin/main)
 > git.exe config core.sparsecheckout # timeout=10
 > git.exe checkout -f bae7ec49e4a1e24c10642d3427aaa26b9ccb91e0 # timeout=10
Commit message: "Finalize Task 6 documentation"
First time build. Skipping changelog.
[Travel-Insurance-CI] $ cmd /c call C:\windows\TEMP\jenkins15135540304854321042.bat

C:\ProgramData\Jenkins\.jenkins\workspace\Travel-Insurance-CI>call mvnw.cmd clean test 
WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::load has been called by org.fusesource.jansi.internal.JansiLoader in an unnamed module (file:/C:/windows/system32/config/systemprofile/.m2/wrapper/dists/apache-maven-3.9.9-bin/33b4b2b4/apache-maven-3.9.9/lib/jansi-2.4.1.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

WARNING: A terminally deprecated method in sun.misc.Unsafe has been called
WARNING: sun.misc.Unsafe::objectFieldOffset has been called by com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper (file:/C:/windows/system32/config/systemprofile/.m2/wrapper/dists/apache-maven-3.9.9-bin/33b4b2b4/apache-maven-3.9.9/lib/guava-33.2.1-jre.jar)
WARNING: Please consider reporting this to the maintainers of class com.google.common.util.concurrent.AbstractFuture$UnsafeAtomicHelper
WARNING: sun.misc.Unsafe::objectFieldOffset will be removed in a future release
[INFO] Scanning for projects...
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-parent/3.3.4/spring-boot-starter-parent-3.3.4.pom
Progress (1): 1.1 kB
Progress (1): 2.6 kB
Progress (1): 6.5 kB
Progress (1): 11 kB 
Progress (1): 13 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-parent/3.3.4/spring-boot-starter-parent-3.3.4.pom (13 kB at 51 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-dependencies/3.3.4/spring-boot-dependencies-3.3.4.pom
Progress (1): 1.0 kB
Progress (1): 2.3 kB
Progress (1): 4.4 kB
Progress (1): 6.5 kB
Progress (1): 8.2 kB
Progress (1): 10 kB 
Progress (1): 14 kB
Progress (1): 20 kB
Progress (1): 29 kB
Progress (1): 37 kB
Progress (1): 41 kB
Progress (1): 50 kB
Progress (1): 60 kB
Progress (1): 68 kB
Progress (1): 79 kB
Progress (1): 85 kB
Progress (1): 90 kB
Progress (1): 98 kB
Progress (1): 100 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-dependencies/3.3.4/spring-boot-dependencies-3.3.4.pom (100 kB at 1.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/activemq/activemq-bom/6.1.3/activemq-bom-6.1.3.pom
Progress (1): 799 B
Progress (1): 1.9 kB
Progress (1): 7.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/activemq/activemq-bom/6.1.3/activemq-bom-6.1.3.pom (7.9 kB at 100 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/activemq/artemis-bom/2.33.0/artemis-bom-2.33.0.pom
Progress (1): 799 B
Progress (1): 3.3 kB
Progress (1): 9.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/activemq/artemis-bom/2.33.0/artemis-bom-2.33.0.pom (9.6 kB at 138 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/activemq/artemis-project/2.33.0/artemis-project-2.33.0.pom
Progress (1): 713 B
Progress (1): 2.0 kB
Progress (1): 4.2 kB
Progress (1): 6.0 kB
Progress (1): 7.5 kB
Progress (1): 9.6 kB
Progress (1): 12 kB 
Progress (1): 12 kB
Progress (1): 14 kB
Progress (1): 16 kB
Progress (1): 17 kB
Progress (1): 24 kB
Progress (1): 27 kB
Progress (1): 29 kB
Progress (1): 32 kB
Progress (1): 38 kB
Progress (1): 42 kB
Progress (1): 46 kB
Progress (1): 49 kB
Progress (1): 51 kB
Progress (1): 55 kB
Progress (1): 60 kB
Progress (1): 63 kB
Progress (1): 64 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/activemq/artemis-project/2.33.0/artemis-project-2.33.0.pom (64 kB at 885 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/31/apache-31.pom
Progress (1): 739 B
Progress (1): 1.6 kB
Progress (1): 3.4 kB
Progress (1): 5.3 kB
Progress (1): 7.4 kB
Progress (1): 13 kB 
Progress (1): 18 kB
Progress (1): 20 kB
Progress (1): 22 kB
Progress (1): 24 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/31/apache-31.pom (24 kB at 386 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-bom/3.25.3/assertj-bom-3.25.3.pom
Progress (1): 1.0 kB
Progress (1): 3.0 kB
Progress (1): 3.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-bom/3.25.3/assertj-bom-3.25.3.pom (3.7 kB at 59 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/zipkin/reporter2/zipkin-reporter-bom/3.4.2/zipkin-reporter-bom-3.4.2.pom
Progress (1): 755 B
Progress (1): 1.7 kB
Progress (1): 5.2 kB
Progress (1): 6.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/io/zipkin/reporter2/zipkin-reporter-bom/3.4.2/zipkin-reporter-bom-3.4.2.pom (6.4 kB at 19 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/zipkin/brave/brave-bom/6.0.3/brave-bom-6.0.3.pom
Progress (1): 1.1 kB
Progress (1): 2.4 kB
Progress (1): 11 kB 
Progress (1): 11 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/io/zipkin/brave/brave-bom/6.0.3/brave-bom-6.0.3.pom (11 kB at 139 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/cassandra/java-driver-bom/4.18.1/java-driver-bom-4.18.1.pom
Progress (1): 817 B
Progress (1): 2.0 kB
Progress (1): 5.1 kB
Progress (1): 5.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/cassandra/java-driver-bom/4.18.1/java-driver-bom-4.18.1.pom (5.5 kB at 78 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-bom/4.0.5/jaxb-bom-4.0.5.pom
Progress (1): 849 B
Progress (1): 6.0 kB
Progress (1): 12 kB 
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-bom/4.0.5/jaxb-bom-4.0.5.pom (12 kB at 153 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/ee4j/project/1.0.9/project-1.0.9.pom
Progress (1): 876 B
Progress (1): 2.5 kB
Progress (1): 5.0 kB
Progress (1): 8.5 kB
Progress (1): 12 kB 
Progress (1): 16 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/ee4j/project/1.0.9/project-1.0.9.pom (16 kB at 197 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/groovy/groovy-bom/4.0.23/groovy-bom-4.0.23.pom
Progress (1): 863 B
Progress (1): 3.6 kB
Progress (1): 7.0 kB
Progress (1): 11 kB 
Progress (1): 14 kB
Progress (1): 18 kB
Progress (1): 22 kB
Progress (1): 23 kB
Progress (1): 27 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/groovy/groovy-bom/4.0.23/groovy-bom-4.0.23.pom (27 kB at 329 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-bom/15.0.8.Final/infinispan-bom-15.0.8.Final.pom
Progress (1): 1.1 kB
Progress (1): 6.8 kB
Progress (1): 18 kB 
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-bom/15.0.8.Final/infinispan-bom-15.0.8.Final.pom (18 kB at 242 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-build-configuration-parent/15.0.8.Final/infinispan-build-configuration-parent-15.0.8.Final.pom
Progress (1): 1.0 kB
Progress (1): 3.2 kB
Progress (1): 5.5 kB
Progress (1): 7.5 kB
Progress (1): 9.7 kB
Progress (1): 12 kB 
Progress (1): 14 kB
Progress (1): 15 kB
Progress (1): 19 kB
Progress (1): 19 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/infinispan/infinispan-build-configuration-parent/15.0.8.Final/infinispan-build-configuration-parent-15.0.8.Final.pom (19 kB at 254 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/jboss-parent/43/jboss-parent-43.pom
Progress (1): 701 B
Progress (1): 2.0 kB
Progress (1): 4.5 kB
Progress (1): 7.0 kB
Progress (1): 9.2 kB
Progress (1): 12 kB 
Progress (1): 19 kB
Progress (1): 22 kB
Progress (1): 29 kB
Progress (1): 32 kB
Progress (1): 35 kB
Progress (1): 38 kB
Progress (1): 47 kB
Progress (1): 66 kB
Progress (1): 75 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/jboss-parent/43/jboss-parent-43.pom (75 kB at 932 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-bom/2.17.2/jackson-bom-2.17.2.pom
Progress (1): 924 B
Progress (1): 2.7 kB
Progress (1): 8.1 kB
Progress (1): 17 kB 
Progress (1): 19 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-bom/2.17.2/jackson-bom-2.17.2.pom (19 kB at 237 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.17/jackson-parent-2.17.pom
Progress (1): 1.1 kB
Progress (1): 2.5 kB
Progress (1): 4.0 kB
Progress (1): 6.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.17/jackson-parent-2.17.pom (6.5 kB at 93 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/58/oss-parent-58.pom
Progress (1): 950 B
Progress (1): 2.6 kB
Progress (1): 4.0 kB
Progress (1): 6.0 kB
Progress (1): 9.7 kB
Progress (1): 12 kB 
Progress (1): 15 kB
Progress (1): 15 kB
Progress (1): 19 kB
Progress (1): 23 kB
Progress (1): 24 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/58/oss-parent-58.pom (24 kB at 343 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jersey/jersey-bom/3.1.8/jersey-bom-3.1.8.pom
Progress (1): 841 B
Progress (1): 8.7 kB
Progress (1): 20 kB 
Progress (1): 21 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jersey/jersey-bom/3.1.8/jersey-bom-3.1.8.pom (21 kB at 236 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/ee10/jetty-ee10-bom/12.0.13/jetty-ee10-bom-12.0.13.pom
Progress (1): 1.1 kB
Progress (1): 4.6 kB
Progress (1): 9.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/ee10/jetty-ee10-bom/12.0.13/jetty-ee10-bom-12.0.13.pom (9.6 kB at 122 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-bom/12.0.13/jetty-bom-12.0.13.pom
Progress (1): 1.1 kB
Progress (1): 4.6 kB
Progress (1): 14 kB 
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-bom/12.0.13/jetty-bom-12.0.13.pom (14 kB at 183 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.3/junit-bom-5.10.3.pom
Progress (1): 908 B
Progress (1): 4.1 kB
Progress (1): 5.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.3/junit-bom-5.10.3.pom (5.6 kB at 87 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlin/kotlin-bom/1.9.25/kotlin-bom-1.9.25.pom
Progress (1): 908 B
Progress (1): 5.3 kB
Progress (1): 9.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlin/kotlin-bom/1.9.25/kotlin-bom-1.9.25.pom (9.1 kB at 132 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlinx/kotlinx-coroutines-bom/1.8.1/kotlinx-coroutines-bom-1.8.1.pom
Progress (1): 1.2 kB
Progress (1): 4.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlinx/kotlinx-coroutines-bom/1.8.1/kotlinx-coroutines-bom-1.8.1.pom (4.3 kB at 64 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlinx/kotlinx-serialization-bom/1.6.3/kotlinx-serialization-bom-1.6.3.pom
Progress (1): 1.2 kB
Progress (1): 3.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/jetbrains/kotlinx/kotlinx-serialization-bom/1.6.3/kotlinx-serialization-bom-1.6.3.pom (3.7 kB at 56 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-bom/2.23.1/log4j-bom-2.23.1.pom
Progress (1): 792 B
Progress (1): 2.2 kB
Progress (1): 5.7 kB
Progress (1): 12 kB 
Progress (1): 12 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-bom/2.23.1/log4j-bom-2.23.1.pom (12 kB at 141 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/logging-parent/10.6.0/logging-parent-10.6.0.pom
Progress (1): 739 B
Progress (1): 2.2 kB
Progress (1): 4.7 kB
Progress (1): 6.5 kB
Progress (1): 8.4 kB
Progress (1): 11 kB 
Progress (1): 15 kB
Progress (1): 18 kB
Progress (1): 20 kB
Progress (1): 24 kB
Progress (1): 30 kB
Progress (1): 32 kB
Progress (1): 33 kB
Progress (1): 35 kB
Progress (1): 39 kB
Progress (1): 39 kB
Progress (1): 42 kB
Progress (1): 44 kB
Progress (1): 47 kB
Progress (1): 51 kB
Progress (1): 54 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/logging-parent/10.6.0/logging-parent-10.6.0.pom (54 kB at 347 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-bom/1.13.4/micrometer-bom-1.13.4.pom
Progress (1): 1.0 kB
Progress (1): 7.6 kB
Progress (1): 8.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-bom/1.13.4/micrometer-bom-1.13.4.pom (8.4 kB at 108 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-tracing-bom/1.3.4/micrometer-tracing-bom-1.3.4.pom
Progress (1): 1.0 kB
Progress (1): 3.9 kB
Progress (1): 4.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-tracing-bom/1.3.4/micrometer-tracing-bom-1.3.4.pom (4.5 kB at 64 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-bom/5.11.0/mockito-bom-5.11.0.pom
Progress (1): 1.5 kB
Progress (1): 3.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-bom/5.11.0/mockito-bom-5.11.0.pom (3.0 kB at 26 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-bom/4.1.113.Final/netty-bom-4.1.113.Final.pom
Progress (1): 786 B
Progress (1): 2.4 kB
Progress (1): 12 kB 
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-bom/4.1.113.Final/netty-bom-4.1.113.Final.pom (14 kB at 162 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/7/oss-parent-7.pom
Progress (1): 848 B
Progress (1): 2.5 kB
Progress (1): 4.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/7/oss-parent-7.pom (4.8 kB at 72 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/squareup/okhttp3/okhttp-bom/4.12.0/okhttp-bom-4.12.0.pom
Progress (1): 931 B
Progress (1): 3.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/squareup/okhttp3/okhttp-bom/4.12.0/okhttp-bom-4.12.0.pom (3.1 kB at 48 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/opentelemetry/opentelemetry-bom/1.37.0/opentelemetry-bom-1.37.0.pom
Progress (1): 956 B
Progress (1): 5.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/io/opentelemetry/opentelemetry-bom/1.37.0/opentelemetry-bom-1.37.0.pom (5.7 kB at 85 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/prometheus/prometheus-metrics-bom/1.2.1/prometheus-metrics-bom-1.2.1.pom
Progress (1): 1.3 kB
Progress (1): 6.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/io/prometheus/prometheus-metrics-bom/1.2.1/prometheus-metrics-bom-1.2.1.pom (6.1 kB at 93 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/prometheus/client_java/1.2.1/client_java-1.2.1.pom
Progress (1): 1.0 kB
Progress (1): 3.4 kB
Progress (1): 7.5 kB
Progress (1): 10 kB 
Progress (1): 13 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/io/prometheus/client_java/1.2.1/client_java-1.2.1.pom (13 kB at 162 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/prometheus/simpleclient_bom/0.16.0/simpleclient_bom-0.16.0.pom
Progress (1): 1.9 kB
Progress (1): 6.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/io/prometheus/simpleclient_bom/0.16.0/simpleclient_bom-0.16.0.pom (6.0 kB at 80 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/prometheus/parent/0.16.0/parent-0.16.0.pom
Progress (1): 1.1 kB
Progress (1): 3.4 kB
Progress (1): 7.9 kB
Progress (1): 13 kB 
                   
Downloaded from central: https://repo.maven.apache.org/maven2/io/prometheus/parent/0.16.0/parent-0.16.0.pom (13 kB at 130 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/pulsar/pulsar-bom/3.2.4/pulsar-bom-3.2.4.pom
Progress (1): 794 B
Progress (1): 2.4 kB
Progress (1): 4.5 kB
Progress (1): 14 kB 
Progress (1): 26 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/pulsar/pulsar-bom/3.2.4/pulsar-bom-3.2.4.pom (26 kB at 224 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/29/apache-29.pom
Progress (1): 759 B
Progress (1): 2.1 kB
Progress (1): 4.0 kB
Progress (1): 7.4 kB
Progress (1): 7.7 kB
Progress (1): 12 kB 
Progress (1): 16 kB
Progress (1): 19 kB
Progress (1): 21 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/29/apache-29.pom (21 kB at 216 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/querydsl/querydsl-bom/5.1.0/querydsl-bom-5.1.0.pom
Progress (1): 1.2 kB
Progress (1): 6.7 kB
Progress (1): 7.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/querydsl/querydsl-bom/5.1.0/querydsl-bom-5.1.0.pom (7.2 kB at 79 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-bom/2023.0.10/reactor-bom-2023.0.10.pom
Progress (1): 908 B
Progress (1): 4.3 kB
Progress (1): 4.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/io/projectreactor/reactor-bom/2023.0.10/reactor-bom-2023.0.10.pom (4.8 kB at 62 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/rest-assured/rest-assured-bom/5.4.0/rest-assured-bom-5.4.0.pom
Progress (1): 1.2 kB
Progress (1): 4.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/io/rest-assured/rest-assured-bom/5.4.0/rest-assured-bom-5.4.0.pom (4.5 kB at 53 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/rsocket/rsocket-bom/1.1.3/rsocket-bom-1.1.3.pom
Progress (1): 1.2 kB
Progress (1): 2.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/io/rsocket/rsocket-bom/1.1.3/rsocket-bom-1.1.3.pom (2.6 kB at 33 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/seleniumhq/selenium/selenium-bom/4.19.1/selenium-bom-4.19.1.pom
Progress (1): 1.1 kB
Progress (1): 6.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/seleniumhq/selenium/selenium-bom/4.19.1/selenium-bom-4.19.1.pom (6.0 kB at 80 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/amqp/spring-amqp-bom/3.1.7/spring-amqp-bom-3.1.7.pom
Progress (1): 963 B
Progress (1): 3.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/amqp/spring-amqp-bom/3.1.7/spring-amqp-bom-3.1.7.pom (3.9 kB at 43 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/batch/spring-batch-bom/5.1.2/spring-batch-bom-5.1.2.pom
Progress (1): 1.2 kB
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/batch/spring-batch-bom/5.1.2/spring-batch-bom-5.1.2.pom (3.2 kB at 42 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-bom/2024.0.4/spring-data-bom-2024.0.4.pom
Progress (1): 964 B
Progress (1): 2.5 kB
Progress (1): 5.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-bom/2024.0.4/spring-data-bom-2024.0.4.pom (5.5 kB at 85 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/6.1.13/spring-framework-bom-6.1.13.pom
Progress (1): 975 B
Progress (1): 5.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/6.1.13/spring-framework-bom-6.1.13.pom (5.8 kB at 63 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/integration/spring-integration-bom/6.3.4/spring-integration-bom-6.3.4.pom
Progress (1): 990 B
Progress (1): 5.2 kB
Progress (1): 10 kB 
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/integration/spring-integration-bom/6.3.4/spring-integration-bom-6.3.4.pom (10 kB at 145 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/pulsar/spring-pulsar-bom/1.1.4/spring-pulsar-bom-1.1.4.pom
Progress (1): 959 B
Progress (1): 2.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/pulsar/spring-pulsar-bom/1.1.4/spring-pulsar-bom-1.1.4.pom (2.9 kB at 44 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/restdocs/spring-restdocs-bom/3.0.1/spring-restdocs-bom-3.0.1.pom
Progress (1): 1.1 kB
Progress (1): 2.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/restdocs/spring-restdocs-bom/3.0.1/spring-restdocs-bom-3.0.1.pom (2.6 kB at 37 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/security/spring-security-bom/6.3.3/spring-security-bom-6.3.3.pom
Progress (1): 973 B
Progress (1): 5.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/security/spring-security-bom/6.3.3/spring-security-bom-6.3.3.pom (5.3 kB at 72 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/session/spring-session-bom/3.3.2/spring-session-bom-3.3.2.pom
Progress (1): 1.0 kB
Progress (1): 2.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/session/spring-session-bom/3.3.2/spring-session-bom-3.3.2.pom (2.9 kB at 42 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/ws/spring-ws-bom/4.0.11/spring-ws-bom-4.0.11.pom
Progress (1): 1.0 kB
Progress (1): 2.7 kB
Progress (1): 3.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/ws/spring-ws-bom/4.0.11/spring-ws-bom-4.0.11.pom (3.5 kB at 41 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/testcontainers/testcontainers-bom/1.19.8/testcontainers-bom-1.19.8.pom
Progress (1): 1.2 kB
Progress (1): 10 kB 
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/testcontainers/testcontainers-bom/1.19.8/testcontainers-bom-1.19.8.pom (10 kB at 147 kB/s)
[INFO] 
[INFO] -------------< com.academic:travel-insurance-claim-system >-------------
[INFO] Building Travel Insurance Claim System 1.0.0
[INFO]   from pom.xml
[INFO] --------------------------------[ jar ]---------------------------------
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/3.3.4/spring-boot-maven-plugin-3.3.4.pom
Progress (1): 1.3 kB
Progress (1): 4.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/3.3.4/spring-boot-maven-plugin-3.3.4.pom (4.0 kB at 49 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/3.3.4/spring-boot-maven-plugin-3.3.4.jar
Progress (1): 7.7/137 kB
Progress (1): 7.7/137 kB
Progress (1): 24/137 kB 
Progress (1): 40/137 kB
Progress (1): 57/137 kB
Progress (1): 73/137 kB
Progress (1): 90/137 kB
Progress (1): 106/137 kB
Progress (1): 122/137 kB
Progress (1): 137 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-maven-plugin/3.3.4/spring-boot-maven-plugin-3.3.4.jar (137 kB at 1.6 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.3.2/maven-clean-plugin-3.3.2.pom
Progress (1): 798 B
Progress (1): 2.3 kB
Progress (1): 4.9 kB
Progress (1): 5.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.3.2/maven-clean-plugin-3.3.2.pom (5.3 kB at 81 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/40/maven-plugins-40.pom
Progress (1): 773 B
Progress (1): 2.4 kB
Progress (1): 4.9 kB
Progress (1): 7.5 kB
Progress (1): 8.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/40/maven-plugins-40.pom (8.1 kB at 111 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/40/maven-parent-40.pom
Progress (1): 727 B
Progress (1): 1.9 kB
Progress (1): 5.5 kB
Progress (1): 9.9 kB
Progress (1): 14 kB 
Progress (1): 19 kB
Progress (1): 23 kB
Progress (1): 26 kB
Progress (1): 28 kB
Progress (1): 31 kB
Progress (1): 35 kB
Progress (1): 38 kB
Progress (1): 40 kB
Progress (1): 43 kB
Progress (1): 48 kB
Progress (1): 49 kB
Progress (1): 49 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/40/maven-parent-40.pom (49 kB at 569 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/30/apache-30.pom
Progress (1): 743 B
Progress (1): 2.1 kB
Progress (1): 4.0 kB
Progress (1): 6.3 kB
Progress (1): 11 kB 
Progress (1): 16 kB
Progress (1): 20 kB
Progress (1): 22 kB
Progress (1): 23 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/30/apache-30.pom (23 kB at 255 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.3.2/maven-clean-plugin-3.3.2.jar
Progress (1): 7.7/36 kB
Progress (1): 16/36 kB 
Progress (1): 32/36 kB
Progress (1): 36 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-clean-plugin/3.3.2/maven-clean-plugin-3.3.2.jar (36 kB at 82 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.3.1/maven-resources-plugin-3.3.1.pom
Progress (1): 811 B
Progress (1): 2.3 kB
Progress (1): 4.6 kB
Progress (1): 7.3 kB
Progress (1): 8.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.3.1/maven-resources-plugin-3.3.1.pom (8.2 kB at 79 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/39/maven-plugins-39.pom
Progress (1): 773 B
Progress (1): 2.3 kB
Progress (1): 4.9 kB
Progress (1): 7.4 kB
Progress (1): 8.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/39/maven-plugins-39.pom (8.1 kB at 65 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/39/maven-parent-39.pom
Progress (1): 724 B
Progress (1): 1.9 kB
Progress (1): 5.5 kB
Progress (1): 9.8 kB
Progress (1): 14 kB 
Progress (1): 19 kB
Progress (1): 23 kB
Progress (1): 26 kB
Progress (1): 28 kB
Progress (1): 31 kB
Progress (1): 34 kB
Progress (1): 37 kB
Progress (1): 40 kB
Progress (1): 43 kB
Progress (1): 48 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/39/maven-parent-39.pom (48 kB at 615 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.3.1/maven-resources-plugin-3.3.1.jar
Progress (1): 7.7/31 kB
Progress (1): 7.7/31 kB
Progress (1): 24/31 kB 
Progress (1): 31 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-resources-plugin/3.3.1/maven-resources-plugin-3.3.1.jar (31 kB at 83 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.13.0/maven-compiler-plugin-3.13.0.pom
Progress (1): 805 B
Progress (1): 2.3 kB
Progress (1): 3.2 kB
Progress (1): 7.0 kB
Progress (1): 9.7 kB
Progress (1): 10 kB 
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.13.0/maven-compiler-plugin-3.13.0.pom (10 kB at 136 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/41/maven-plugins-41.pom
Progress (1): 773 B
Progress (1): 2.4 kB
Progress (1): 4.9 kB
Progress (1): 7.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-plugins/41/maven-plugins-41.pom (7.4 kB at 119 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/41/maven-parent-41.pom
Progress (1): 724 B
Progress (1): 1.9 kB
Progress (1): 5.5 kB
Progress (1): 9.9 kB
Progress (1): 14 kB 
Progress (1): 19 kB
Progress (1): 23 kB
Progress (1): 27 kB
Progress (1): 28 kB
Progress (1): 31 kB
Progress (1): 34 kB
Progress (1): 37 kB
Progress (1): 40 kB
Progress (1): 43 kB
Progress (1): 48 kB
Progress (1): 48 kB
Progress (1): 50 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/41/maven-parent-41.pom (50 kB at 733 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.13.0/maven-compiler-plugin-3.13.0.jar
Progress (1): 7.7/83 kB
Progress (1): 16/83 kB 
Progress (1): 32/83 kB
Progress (1): 49/83 kB
Progress (1): 61/83 kB
Progress (1): 77/83 kB
Progress (1): 83 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-compiler-plugin/3.13.0/maven-compiler-plugin-3.13.0.jar (83 kB at 1.4 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/3.2.5/maven-surefire-plugin-3.2.5.pom
Progress (1): 834 B
Progress (1): 2.7 kB
Progress (1): 5.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/3.2.5/maven-surefire-plugin-3.2.5.pom (5.3 kB at 79 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire/3.2.5/surefire-3.2.5.pom
Progress (1): 787 B
Progress (1): 2.4 kB
Progress (1): 4.1 kB
Progress (1): 7.9 kB
Progress (1): 12 kB 
Progress (1): 14 kB
Progress (1): 17 kB
Progress (1): 20 kB
Progress (1): 22 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire/3.2.5/surefire-3.2.5.pom (22 kB at 258 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.9.3/junit-bom-5.9.3.pom
Progress (1): 907 B
Progress (1): 4.1 kB
Progress (1): 5.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.9.3/junit-bom-5.9.3.pom (5.6 kB at 94 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/3.2.5/maven-surefire-plugin-3.2.5.jar
Progress (1): 7.3/45 kB
Progress (1): 15/45 kB 
Progress (1): 32/45 kB
Progress (1): 45 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/plugins/maven-surefire-plugin/3.2.5/maven-surefire-plugin-3.2.5.jar (45 kB at 150 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-web/3.3.4/spring-boot-starter-web-3.3.4.pom
Progress (1): 927 B
Progress (1): 2.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-web/3.3.4/spring-boot-starter-web-3.3.4.pom (2.9 kB at 32 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter/3.3.4/spring-boot-starter-3.3.4.pom
Progress (1): 947 B
Progress (1): 3.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter/3.3.4/spring-boot-starter-3.3.4.pom (3.0 kB at 48 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/3.3.4/spring-boot-3.3.4.pom
Progress (1): 1.0 kB
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/3.3.4/spring-boot-3.3.4.pom (2.2 kB at 37 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-core/6.1.13/spring-core-6.1.13.pom
Progress (1): 1.1 kB
Progress (1): 2.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-core/6.1.13/spring-core-6.1.13.pom (2.0 kB at 32 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jcl/6.1.13/spring-jcl-6.1.13.pom
Progress (1): 1.1 kB
Progress (1): 1.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jcl/6.1.13/spring-jcl-6.1.13.pom (1.8 kB at 30 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context/6.1.13/spring-context-6.1.13.pom
Progress (1): 1.1 kB
Progress (1): 2.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context/6.1.13/spring-context-6.1.13.pom (2.8 kB at 53 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aop/6.1.13/spring-aop-6.1.13.pom
Progress (1): 1.1 kB
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aop/6.1.13/spring-aop-6.1.13.pom (2.2 kB at 42 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-beans/6.1.13/spring-beans-6.1.13.pom
Progress (1): 1.1 kB
Progress (1): 2.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-beans/6.1.13/spring-beans-6.1.13.pom (2.0 kB at 30 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-expression/6.1.13/spring-expression-6.1.13.pom
Progress (1): 1.1 kB
Progress (1): 2.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-expression/6.1.13/spring-expression-6.1.13.pom (2.1 kB at 33 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.13.4/micrometer-observation-1.13.4.pom
Progress (1): 1.1 kB
Progress (1): 3.4 kB
Progress (1): 3.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.13.4/micrometer-observation-1.13.4.pom (3.8 kB at 57 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.13.4/micrometer-commons-1.13.4.pom
Progress (1): 1.1 kB
Progress (1): 3.0 kB
Progress (1): 3.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.13.4/micrometer-commons-1.13.4.pom (3.4 kB at 57 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoconfigure/3.3.4/spring-boot-autoconfigure-3.3.4.pom
Progress (1): 1.0 kB
Progress (1): 2.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoconfigure/3.3.4/spring-boot-autoconfigure-3.3.4.pom (2.1 kB at 33 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-logging/3.3.4/spring-boot-starter-logging-3.3.4.pom
Progress (1): 984 B
Progress (1): 2.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-logging/3.3.4/spring-boot-starter-logging-3.3.4.pom (2.5 kB at 36 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-classic/1.5.8/logback-classic-1.5.8.pom
Progress (1): 1.7 kB
Progress (1): 4.8 kB
Progress (1): 8.2 kB
Progress (1): 11 kB 
Progress (1): 13 kB
Progress (1): 13 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-classic/1.5.8/logback-classic-1.5.8.pom (13 kB at 161 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-parent/1.5.8/logback-parent-1.5.8.pom
Progress (1): 1.1 kB
Progress (1): 2.7 kB
Progress (1): 5.0 kB
Progress (1): 10 kB 
Progress (1): 14 kB
Progress (1): 17 kB
Progress (1): 18 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-parent/1.5.8/logback-parent-1.5.8.pom (18 kB at 241 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-core/1.5.8/logback-core-1.5.8.pom
Progress (1): 1.8 kB
Progress (1): 5.1 kB
Progress (1): 7.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-core/1.5.8/logback-core-1.5.8.pom (7.9 kB at 113 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/2.0.16/slf4j-api-2.0.16.pom
Progress (1): 1.1 kB
Progress (1): 2.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/2.0.16/slf4j-api-2.0.16.pom (2.8 kB at 52 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/2.0.16/slf4j-parent-2.0.16.pom
Progress (1): 977 B
Progress (1): 3.3 kB
Progress (1): 6.0 kB
Progress (1): 8.0 kB
Progress (1): 11 kB 
Progress (1): 13 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/2.0.16/slf4j-parent-2.0.16.pom (13 kB at 234 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-bom/2.0.16/slf4j-bom-2.0.16.pom
Progress (1): 1.0 kB
Progress (1): 4.6 kB
Progress (1): 7.3 kB
Progress (1): 7.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-bom/2.0.16/slf4j-bom-2.0.16.pom (7.3 kB at 126 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-to-slf4j/2.23.1/log4j-to-slf4j-2.23.1.pom
Progress (1): 834 B
Progress (1): 2.7 kB
Progress (1): 4.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-to-slf4j/2.23.1/log4j-to-slf4j-2.23.1.pom (4.4 kB at 62 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j/2.23.1/log4j-2.23.1.pom
Progress (1): 721 B
Progress (1): 2.1 kB
Progress (1): 4.0 kB
Progress (1): 5.9 kB
Progress (1): 10 kB 
Progress (1): 16 kB
Progress (1): 24 kB
Progress (1): 31 kB
Progress (1): 35 kB
Progress (1): 37 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j/2.23.1/log4j-2.23.1.pom (37 kB at 549 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/groovy/groovy-bom/3.0.21/groovy-bom-3.0.21.pom
Progress (1): 959 B
Progress (1): 4.4 kB
Progress (1): 8.1 kB
Progress (1): 12 kB 
Progress (1): 15 kB
Progress (1): 19 kB
Progress (1): 23 kB
Progress (1): 26 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/groovy/groovy-bom/3.0.21/groovy-bom-3.0.21.pom (26 kB at 343 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-bom/2.16.1/jackson-bom-2.16.1.pom
Progress (1): 931 B
Progress (1): 2.7 kB
Progress (1): 8.1 kB
Progress (1): 17 kB 
Progress (1): 18 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-bom/2.16.1/jackson-bom-2.16.1.pom (18 kB at 280 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.16/jackson-parent-2.16.pom
Progress (1): 1.1 kB
Progress (1): 2.5 kB
Progress (1): 4.0 kB
Progress (1): 6.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-parent/2.16/jackson-parent-2.16.pom (6.5 kB at 111 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/56/oss-parent-56.pom
Progress (1): 1.0 kB
Progress (1): 2.7 kB
Progress (1): 3.2 kB
Progress (1): 4.6 kB
Progress (1): 8.4 kB
Progress (1): 10 kB 
Progress (1): 13 kB
Progress (1): 16 kB
Progress (1): 19 kB
Progress (1): 24 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/oss-parent/56/oss-parent-56.pom (24 kB at 284 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/jakarta/platform/jakarta.jakartaee-bom/9.1.0/jakarta.jakartaee-bom-9.1.0.pom
Progress (1): 848 B
Progress (1): 4.7 kB
Progress (1): 9.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/platform/jakarta.jakartaee-bom/9.1.0/jakarta.jakartaee-bom-9.1.0.pom (9.6 kB at 138 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/jakarta/platform/jakartaee-api-parent/9.1.0/jakartaee-api-parent-9.1.0.pom
Progress (1): 823 B
Progress (1): 3.1 kB
Progress (1): 5.9 kB
Progress (1): 11 kB 
Progress (1): 14 kB
Progress (1): 15 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/platform/jakartaee-api-parent/9.1.0/jakartaee-api-parent-9.1.0.pom (15 kB at 190 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/ee4j/project/1.0.7/project-1.0.7.pom
Progress (1): 837 B
Progress (1): 2.5 kB
Progress (1): 5.0 kB
Progress (1): 8.0 kB
Progress (1): 13 kB 
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/ee4j/project/1.0.7/project-1.0.7.pom (14 kB at 180 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-bom/9.4.54.v20240208/jetty-bom-9.4.54.v20240208.pom
Progress (1): 1.1 kB
Progress (1): 4.8 kB
Progress (1): 12 kB 
Progress (1): 18 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/jetty/jetty-bom/9.4.54.v20240208/jetty-bom-9.4.54.v20240208.pom (18 kB at 289 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.2/junit-bom-5.10.2.pom
Progress (1): 908 B
Progress (1): 4.1 kB
Progress (1): 5.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.2/junit-bom-5.10.2.pom (5.6 kB at 83 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/fabric8/kubernetes-client-bom/5.12.4/kubernetes-client-bom-5.12.4.pom
Progress (1): 1.2 kB
Progress (1): 13 kB 
Progress (1): 26 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/io/fabric8/kubernetes-client-bom/5.12.4/kubernetes-client-bom-5.12.4.pom (26 kB at 377 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-bom/4.11.0/mockito-bom-4.11.0.pom
Progress (1): 1.4 kB
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-bom/4.11.0/mockito-bom-4.11.0.pom (3.2 kB at 46 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/netty/netty-bom/4.1.107.Final/netty-bom-4.1.107.Final.pom
Progress (1): 786 B
Progress (1): 2.4 kB
Progress (1): 12 kB 
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/io/netty/netty-bom/4.1.107.Final/netty-bom-4.1.107.Final.pom (14 kB at 218 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/5.3.32/spring-framework-bom-5.3.32.pom
Progress (1): 974 B
Progress (1): 5.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-framework-bom/5.3.32/spring-framework-bom-5.3.32.pom (5.7 kB at 101 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-api/2.23.1/log4j-api-2.23.1.pom
Progress (1): 828 B
Progress (1): 2.4 kB
Progress (1): 3.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-api/2.23.1/log4j-api-2.23.1.pom (3.8 kB at 48 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/2.0.16/jul-to-slf4j-2.0.16.pom
Progress (1): 1.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/2.0.16/jul-to-slf4j-2.0.16.pom (1.1 kB at 17 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/jakarta/annotation/jakarta.annotation-api/2.1.1/jakarta.annotation-api-2.1.1.pom

Progress (1): 828 B
Progress (1): 2.8 kB
Progress (1): 5.9 kB
Progress (1): 9.9 kB
Progress (1): 13 kB 
Progress (1): 16 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/annotation/jakarta.annotation-api/2.1.1/jakarta.annotation-api-2.1.1.pom (16 kB at 195 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/yaml/snakeyaml/2.2/snakeyaml-2.2.pom
Progress (1): 1.1 kB
Progress (1): 2.9 kB
Progress (1): 6.8 kB
Progress (1): 11 kB 
Progress (1): 15 kB
Progress (1): 20 kB
Progress (1): 21 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/yaml/snakeyaml/2.2/snakeyaml-2.2.pom (21 kB at 317 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-json/3.3.4/spring-boot-starter-json-3.3.4.pom
Progress (1): 975 B
Progress (1): 3.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-json/3.3.4/spring-boot-starter-json-3.3.4.pom (3.1 kB at 45 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-web/6.1.13/spring-web-6.1.13.pom
Progress (1): 1.1 kB
Progress (1): 2.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-web/6.1.13/spring-web-6.1.13.pom (2.4 kB at 37 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.17.2/jackson-databind-2.17.2.pom
Progress (1): 973 B
Progress (1): 2.4 kB
Progress (1): 4.0 kB
Progress (1): 6.2 kB
Progress (1): 8.0 kB
Progress (1): 10 kB 
Progress (1): 12 kB
Progress (1): 18 kB
Progress (1): 19 kB
Progress (1): 21 kB
Progress (1): 21 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.17.2/jackson-databind-2.17.2.pom (21 kB at 247 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-base/2.17.2/jackson-base-2.17.2.pom
Progress (1): 923 B
Progress (1): 2.4 kB
Progress (1): 4.3 kB
Progress (1): 6.3 kB
Progress (1): 8.5 kB
Progress (1): 11 kB 
Progress (1): 12 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/jackson-base/2.17.2/jackson-base-2.17.2.pom (12 kB at 151 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.17.2/jackson-annotations-2.17.2.pom
Progress (1): 946 B
Progress (1): 2.4 kB
Progress (1): 3.9 kB
Progress (1): 6.3 kB
Progress (1): 7.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.17.2/jackson-annotations-2.17.2.pom (7.1 kB at 107 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.17.2/jackson-core-2.17.2.pom
Progress (1): 981 B
Progress (1): 2.9 kB
Progress (1): 6.8 kB
Progress (1): 9.4 kB
Progress (1): 9.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.17.2/jackson-core-2.17.2.pom (9.6 kB at 134 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.17.2/jackson-datatype-jdk8-2.17.2.pom
Progress (1): 1.0 kB
Progress (1): 2.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.17.2/jackson-datatype-jdk8-2.17.2.pom (2.6 kB at 29 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-modules-java8/2.17.2/jackson-modules-java8-2.17.2.pom
Progress (1): 1.4 kB
Progress (1): 3.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-modules-java8/2.17.2/jackson-modules-java8-2.17.2.pom (3.1 kB at 61 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.17.2/jackson-datatype-jsr310-2.17.2.pom
Progress (1): 983 B
Progress (1): 2.4 kB
Progress (1): 4.6 kB
Progress (1): 4.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.17.2/jackson-datatype-jsr310-2.17.2.pom (4.9 kB at 78 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.17.2/jackson-module-parameter-names-2.17.2.pom
Progress (1): 973 B
Progress (1): 2.8 kB
Progress (1): 4.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.17.2/jackson-module-parameter-names-2.17.2.pom (4.2 kB at 62 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-tomcat/3.3.4/spring-boot-starter-tomcat-3.3.4.pom
Progress (1): 974 B
Progress (1): 3.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-tomcat/3.3.4/spring-boot-starter-tomcat-3.3.4.pom (3.1 kB at 54 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-core/10.1.30/tomcat-embed-core-10.1.30.pom
Progress (1): 843 B
Progress (1): 1.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-core/10.1.30/tomcat-embed-core-10.1.30.pom (1.7 kB at 28 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-el/10.1.30/tomcat-embed-el-10.1.30.pom

Progress (1): 843 B
Progress (1): 1.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-el/10.1.30/tomcat-embed-el-10.1.30.pom (1.5 kB at 27 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-websocket/10.1.30/tomcat-embed-websocket-10.1.30.pom
Progress (1): 842 B
Progress (1): 1.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-websocket/10.1.30/tomcat-embed-websocket-10.1.30.pom (1.7 kB at 29 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-webmvc/6.1.13/spring-webmvc-6.1.13.pom
Progress (1): 1.0 kB
Progress (1): 3.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-webmvc/6.1.13/spring-webmvc-6.1.13.pom (3.0 kB at 48 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-data-jpa/3.3.4/spring-boot-starter-data-jpa-3.3.4.pom
Progress (1): 979 B
Progress (1): 2.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-data-jpa/3.3.4/spring-boot-starter-data-jpa-3.3.4.pom (2.9 kB at 47 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-aop/3.3.4/spring-boot-starter-aop-3.3.4.pom
Progress (1): 963 B
Progress (1): 2.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-aop/3.3.4/spring-boot-starter-aop-3.3.4.pom (2.5 kB at 39 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/aspectj/aspectjweaver/1.9.22.1/aspectjweaver-1.9.22.1.pom
Progress (1): 984 B
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/aspectj/aspectjweaver/1.9.22.1/aspectjweaver-1.9.22.1.pom (2.2 kB at 41 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jdbc/3.3.4/spring-boot-starter-jdbc-3.3.4.pom
Progress (1): 965 B
Progress (1): 2.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jdbc/3.3.4/spring-boot-starter-jdbc-3.3.4.pom (2.5 kB at 43 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/zaxxer/HikariCP/5.1.0/HikariCP-5.1.0.pom
Progress (1): 1.1 kB
Progress (1): 2.7 kB
Progress (1): 6.2 kB
Progress (1): 11 kB 
Progress (1): 13 kB
Progress (1): 17 kB
Progress (1): 20 kB
Progress (1): 23 kB
Progress (1): 26 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/zaxxer/HikariCP/5.1.0/HikariCP-5.1.0.pom (26 kB at 428 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jdbc/6.1.13/spring-jdbc-6.1.13.pom
Progress (1): 1.0 kB
Progress (1): 2.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jdbc/6.1.13/spring-jdbc-6.1.13.pom (2.4 kB at 37 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-tx/6.1.13/spring-tx-6.1.13.pom
Progress (1): 1.1 kB
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-tx/6.1.13/spring-tx-6.1.13.pom (2.2 kB at 39 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/hibernate/orm/hibernate-core/6.5.3.Final/hibernate-core-6.5.3.Final.pom
Progress (1): 1.1 kB
Progress (1): 5.5 kB
Progress (1): 5.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/hibernate/orm/hibernate-core/6.5.3.Final/hibernate-core-6.5.3.Final.pom (5.8 kB at 96 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/jakarta/persistence/jakarta.persistence-api/3.1.0/jakarta.persistence-api-3.1.0.pom
Progress (1): 862 B
Progress (1): 3.0 kB
Progress (1): 6.5 kB
Progress (1): 10.0 kB
Progress (1): 13 kB  
Progress (1): 16 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/persistence/jakarta.persistence-api/3.1.0/jakarta.persistence-api-3.1.0.pom (16 kB at 219 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/jakarta/transaction/jakarta.transaction-api/2.0.1/jakarta.transaction-api-2.0.1.pom
Progress (1): 827 B
Progress (1): 2.6 kB
Progress (1): 4.6 kB
Progress (1): 7.7 kB
Progress (1): 11 kB 
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/transaction/jakarta.transaction-api/2.0.1/jakarta.transaction-api-2.0.1.pom (14 kB at 204 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/ee4j/project/1.0.6/project-1.0.6.pom
Progress (1): 839 B
Progress (1): 2.5 kB
Progress (1): 5.0 kB
Progress (1): 7.7 kB
Progress (1): 13 kB 
Progress (1): 13 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/ee4j/project/1.0.6/project-1.0.6.pom (13 kB at 148 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging/3.5.3.Final/jboss-logging-3.5.3.Final.pom
Progress (1): 755 B
Progress (1): 2.4 kB
Progress (1): 5.5 kB
Progress (1): 9.3 kB
Progress (1): 17 kB 

Progress (1): 19 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging/3.5.3.Final/jboss-logging-3.5.3.Final.pom (19 kB at 251 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/logging/logging-parent/1.0.1.Final/logging-parent-1.0.1.Final.pom
Progress (1): 1.2 kB
Progress (1): 3.8 kB
Progress (1): 6.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/logging/logging-parent/1.0.1.Final/logging-parent-1.0.1.Final.pom (6.0 kB at 86 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/jboss-parent/39/jboss-parent-39.pom
Progress (1): 701 B
Progress (1): 2.1 kB
Progress (1): 4.5 kB
Progress (1): 6.8 kB
Progress (1): 8.9 kB
Progress (1): 13 kB 
Progress (1): 22 kB
Progress (1): 28 kB
Progress (1): 31 kB
Progress (1): 34 kB
Progress (1): 37 kB
Progress (1): 41 kB
Progress (1): 55 kB
Progress (1): 68 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/jboss-parent/39/jboss-parent-39.pom (68 kB at 848 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/hibernate/common/hibernate-commons-annotations/6.0.6.Final/hibernate-commons-annotations-6.0.6.Final.pom
Progress (1): 1.0 kB
Progress (1): 2.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/hibernate/common/hibernate-commons-annotations/6.0.6.Final/hibernate-commons-annotations-6.0.6.Final.pom (2.1 kB at 35 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/smallrye/jandex/3.1.2/jandex-3.1.2.pom
Progress (1): 1.7 kB
Progress (1): 4.3 kB
Progress (1): 7.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/io/smallrye/jandex/3.1.2/jandex-3.1.2.pom (7.0 kB at 84 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/smallrye/jandex-parent/3.1.2/jandex-parent-3.1.2.pom
Progress (1): 1.3 kB
Progress (1): 4.9 kB
Progress (1): 7.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/io/smallrye/jandex-parent/3.1.2/jandex-parent-3.1.2.pom (7.2 kB at 107 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/smallrye/smallrye-build-parent/39/smallrye-build-parent-39.pom
Progress (1): 1.1 kB
Progress (1): 3.1 kB
Progress (1): 5.7 kB
Progress (1): 9.7 kB
Progress (1): 12 kB 
Progress (1): 16 kB
Progress (1): 21 kB
Progress (1): 28 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/io/smallrye/smallrye-build-parent/39/smallrye-build-parent-39.pom (28 kB at 345 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/classmate/1.7.0/classmate-1.7.0.pom
Progress (1): 1.2 kB
Progress (1): 2.9 kB
Progress (1): 4.9 kB
Progress (1): 7.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/classmate/1.7.0/classmate-1.7.0.pom (7.0 kB at 117 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.14.19/byte-buddy-1.14.19.pom
Progress (1): 973 B
Progress (1): 3.7 kB
Progress (1): 7.0 kB
Progress (1): 14 kB 
Progress (1): 16 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.14.19/byte-buddy-1.14.19.pom (16 kB at 187 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-parent/1.14.19/byte-buddy-parent-1.14.19.pom
Progress (1): 935 B
Progress (1): 2.2 kB
Progress (1): 3.2 kB
Progress (1): 5.1 kB
Progress (1): 7.3 kB
Progress (1): 9.3 kB
Progress (1): 12 kB 
Progress (1): 15 kB
Progress (1): 20 kB
Progress (1): 24 kB
Progress (1): 29 kB
Progress (1): 45 kB
Progress (1): 50 kB
Progress (1): 55 kB
Progress (1): 60 kB
Progress (1): 62 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-parent/1.14.19/byte-buddy-parent-1.14.19.pom (62 kB at 972 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api/4.0.2/jakarta.xml.bind-api-4.0.2.pom
Progress (1): 845 B
Progress (1): 3.2 kB
Progress (1): 6.0 kB
Progress (1): 9.8 kB
Progress (1): 13 kB 
Progress (1): 13 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api/4.0.2/jakarta.xml.bind-api-4.0.2.pom (13 kB at 182 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api-parent/4.0.2/jakarta.xml.bind-api-parent-4.0.2.pom
Progress (1): 897 B
Progress (1): 2.8 kB
Progress (1): 6.5 kB
Progress (1): 9.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api-parent/4.0.2/jakarta.xml.bind-api-parent-4.0.2.pom (9.1 kB at 143 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/jakarta/activation/jakarta.activation-api/2.1.3/jakarta.activation-api-2.1.3.pom
Progress (1): 857 B
Progress (1): 2.6 kB
Progress (1): 5.3 kB
Progress (1): 9.4 kB
Progress (1): 12 kB 
Progress (1): 17 kB
Progress (1): 19 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/activation/jakarta.activation-api/2.1.3/jakarta.activation-api-2.1.3.pom (19 kB at 325 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-runtime/4.0.5/jaxb-runtime-4.0.5.pom
Progress (1): 806 B
Progress (1): 3.1 kB
Progress (1): 6.9 kB
Progress (1): 10 kB 
Progress (1): 11 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-runtime/4.0.5/jaxb-runtime-4.0.5.pom (11 kB at 162 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/sun/xml/bind/mvn/jaxb-runtime-parent/4.0.5/jaxb-runtime-parent-4.0.5.pom

Progress (1): 932 B
Progress (1): 1.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/sun/xml/bind/mvn/jaxb-runtime-parent/4.0.5/jaxb-runtime-parent-4.0.5.pom (1.2 kB at 20 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/sun/xml/bind/mvn/jaxb-parent/4.0.5/jaxb-parent-4.0.5.pom
Progress (1): 778 B
Progress (1): 2.7 kB
Progress (1): 4.4 kB
Progress (1): 6.6 kB
Progress (1): 12 kB 
Progress (1): 17 kB
Progress (1): 21 kB
Progress (1): 28 kB
Progress (1): 33 kB
Progress (1): 35 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/sun/xml/bind/mvn/jaxb-parent/4.0.5/jaxb-parent-4.0.5.pom (35 kB at 556 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/sun/xml/bind/jaxb-bom-ext/4.0.5/jaxb-bom-ext-4.0.5.pom
Progress (1): 863 B
Progress (1): 3.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/sun/xml/bind/jaxb-bom-ext/4.0.5/jaxb-bom-ext-4.0.5.pom (3.5 kB at 50 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-core/4.0.5/jaxb-core-4.0.5.pom
Progress (1): 898 B
Progress (1): 3.1 kB
Progress (1): 3.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-core/4.0.5/jaxb-core-4.0.5.pom (3.7 kB at 67 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/angus/angus-activation/2.0.2/angus-activation-2.0.2.pom
Progress (1): 930 B
Progress (1): 3.4 kB
Progress (1): 4.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/angus/angus-activation/2.0.2/angus-activation-2.0.2.pom (4.0 kB at 57 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/angus/angus-activation-project/2.0.2/angus-activation-project-2.0.2.pom
Progress (1): 873 B
Progress (1): 2.6 kB
Progress (1): 5.6 kB
Progress (1): 10 kB 
Progress (1): 14 kB
Progress (1): 18 kB
Progress (1): 20 kB
Progress (1): 21 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/angus/angus-activation-project/2.0.2/angus-activation-project-2.0.2.pom (21 kB at 298 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/txw2/4.0.5/txw2-4.0.5.pom
Progress (1): 931 B
Progress (1): 1.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/txw2/4.0.5/txw2-4.0.5.pom (1.8 kB at 26 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/sun/xml/bind/mvn/jaxb-txw-parent/4.0.5/jaxb-txw-parent-4.0.5.pom
Progress (1): 930 B
Progress (1): 1.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/sun/xml/bind/mvn/jaxb-txw-parent/4.0.5/jaxb-txw-parent-4.0.5.pom (1.2 kB at 16 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/sun/istack/istack-commons-runtime/4.1.2/istack-commons-runtime-4.1.2.pom
Progress (1): 933 B
Progress (1): 1.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/sun/istack/istack-commons-runtime/4.1.2/istack-commons-runtime-4.1.2.pom (1.6 kB at 24 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/sun/istack/istack-commons/4.1.2/istack-commons-4.1.2.pom
Progress (1): 794 B
Progress (1): 2.6 kB
Progress (1): 4.8 kB
Progress (1): 12 kB 
Progress (1): 17 kB
Progress (1): 21 kB
Progress (1): 26 kB
Progress (1): 26 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/sun/istack/istack-commons/4.1.2/istack-commons-4.1.2.pom (26 kB at 313 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/jakarta/inject/jakarta.inject-api/2.0.1/jakarta.inject-api-2.0.1.pom
Progress (1): 1.2 kB
Progress (1): 3.4 kB
Progress (1): 5.4 kB
Progress (1): 5.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/inject/jakarta.inject-api/2.0.1/jakarta.inject-api-2.0.1.pom (5.9 kB at 80 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.13.0/antlr4-runtime-4.13.0.pom
Progress (1): 901 B
Progress (1): 3.0 kB
Progress (1): 3.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.13.0/antlr4-runtime-4.13.0.pom (3.6 kB at 48 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-master/4.13.0/antlr4-master-4.13.0.pom
Progress (1): 969 B
Progress (1): 2.9 kB
Progress (1): 3.2 kB
Progress (1): 4.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-master/4.13.0/antlr4-master-4.13.0.pom (4.8 kB at 88 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/9/oss-parent-9.pom
Progress (1): 838 B
Progress (1): 2.7 kB
Progress (1): 6.5 kB
Progress (1): 6.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/oss/oss-parent/9/oss-parent-9.pom (6.6 kB at 134 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-jpa/3.3.4/spring-data-jpa-3.3.4.pom

Progress (1): 1.6 kB
Progress (1): 5.2 kB
Progress (1): 8.4 kB
Progress (1): 11 kB 
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-jpa/3.3.4/spring-data-jpa-3.3.4.pom (11 kB at 178 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-jpa-parent/3.3.4/spring-data-jpa-parent-3.3.4.pom
Progress (1): 1.2 kB
Progress (1): 3.7 kB
Progress (1): 6.5 kB
Progress (1): 8.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-jpa-parent/3.3.4/spring-data-jpa-parent-3.3.4.pom (8.2 kB at 123 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/data/build/spring-data-parent/3.3.4/spring-data-parent-3.3.4.pom
Progress (1): 809 B
Progress (1): 2.4 kB
Progress (1): 3.4 kB
Progress (1): 4.7 kB
Progress (1): 6.2 kB
Progress (1): 8.3 kB
Progress (1): 12 kB 
Progress (1): 16 kB
Progress (1): 18 kB
Progress (1): 21 kB
Progress (1): 28 kB
Progress (1): 32 kB
Progress (1): 36 kB
Progress (1): 40 kB
Progress (1): 41 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/data/build/spring-data-parent/3.3.4/spring-data-parent-3.3.4.pom (41 kB at 591 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/data/build/spring-data-build/3.3.4/spring-data-build-3.3.4.pom
Progress (1): 954 B
Progress (1): 2.5 kB
Progress (1): 4.6 kB
Progress (1): 7.1 kB
Progress (1): 7.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/data/build/spring-data-build/3.3.4/spring-data-build-3.3.4.pom (7.2 kB at 120 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-commons/3.3.4/spring-data-commons-3.3.4.pom
Progress (1): 1.2 kB
Progress (1): 5.3 kB
Progress (1): 9.2 kB
Progress (1): 9.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-commons/3.3.4/spring-data-commons-3.3.4.pom (9.9 kB at 171 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-orm/6.1.13/spring-orm-6.1.13.pom
Progress (1): 1.1 kB
Progress (1): 2.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-orm/6.1.13/spring-orm-6.1.13.pom (2.6 kB at 48 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aspects/6.1.13/spring-aspects-6.1.13.pom
Progress (1): 1.1 kB
Progress (1): 2.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aspects/6.1.13/spring-aspects-6.1.13.pom (2.0 kB at 37 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-validation/3.3.4/spring-boot-starter-validation-3.3.4.pom
Progress (1): 993 B
Progress (1): 2.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-validation/3.3.4/spring-boot-starter-validation-3.3.4.pom (2.5 kB at 40 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/hibernate/validator/hibernate-validator/8.0.1.Final/hibernate-validator-8.0.1.Final.pom
Progress (1): 973 B
Progress (1): 3.1 kB
Progress (1): 6.2 kB
Progress (1): 9.0 kB
Progress (1): 13 kB 
Progress (1): 15 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/hibernate/validator/hibernate-validator/8.0.1.Final/hibernate-validator-8.0.1.Final.pom (15 kB at 202 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/hibernate/validator/hibernate-validator-parent/8.0.1.Final/hibernate-validator-parent-8.0.1.Final.pom
Progress (1): 885 B
Progress (1): 3.5 kB
Progress (1): 5.4 kB
Progress (1): 7.5 kB
Progress (1): 9.6 kB
Progress (1): 12 kB 
Progress (1): 14 kB
Progress (1): 16 kB
Progress (1): 18 kB
Progress (1): 24 kB
Progress (1): 31 kB
Progress (1): 35 kB
Progress (1): 38 kB
Progress (1): 41 kB
Progress (1): 47 kB
Progress (1): 48 kB
Progress (1): 52 kB
Progress (1): 56 kB
Progress (1): 60 kB
Progress (1): 67 kB
Progress (1): 70 kB
Progress (1): 73 kB
Progress (1): 78 kB
Progress (1): 81 kB
Progress (1): 81 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/hibernate/validator/hibernate-validator-parent/8.0.1.Final/hibernate-validator-parent-8.0.1.Final.pom (81 kB at 961 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/arquillian/arquillian-bom/1.7.0.Alpha10/arquillian-bom-1.7.0.Alpha10.pom
Progress (1): 1.0 kB
Progress (1): 6.7 kB
Progress (1): 10 kB 
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/arquillian/arquillian-bom/1.7.0.Alpha10/arquillian-bom-1.7.0.Alpha10.pom (10 kB at 160 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/shrinkwrap/shrinkwrap-bom/1.2.6/shrinkwrap-bom-1.2.6.pom
Progress (1): 1.0 kB
Progress (1): 3.2 kB
Progress (1): 4.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/shrinkwrap/shrinkwrap-bom/1.2.6/shrinkwrap-bom-1.2.6.pom (4.0 kB at 66 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/shrinkwrap/resolver/shrinkwrap-resolver-bom/3.1.4/shrinkwrap-resolver-bom-3.1.4.pom
Progress (1): 975 B
Progress (1): 5.5 kB
Progress (1): 7.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/shrinkwrap/resolver/shrinkwrap-resolver-bom/3.1.4/shrinkwrap-resolver-bom-3.1.4.pom (7.0 kB at 116 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.6.3/maven-3.6.3.pom
Progress (1): 710 B
Progress (1): 1.9 kB
Progress (1): 3.5 kB
Progress (1): 5.5 kB
Progress (1): 11 kB 
Progress (1): 16 kB
Progress (1): 20 kB
Progress (1): 23 kB
Progress (1): 26 kB

Progress (1): 26 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.6.3/maven-3.6.3.pom (26 kB at 141 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/33/maven-parent-33.pom
Progress (1): 717 B
Progress (1): 1.9 kB
Progress (1): 5.4 kB
Progress (1): 9.9 kB
Progress (1): 14 kB 
Progress (1): 19 kB
Progress (1): 23 kB
Progress (1): 26 kB
Progress (1): 27 kB
Progress (1): 30 kB
Progress (1): 34 kB
Progress (1): 36 kB
Progress (1): 39 kB
Progress (1): 44 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/33/maven-parent-33.pom (44 kB at 659 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/21/apache-21.pom
Progress (1): 753 B
Progress (1): 2.1 kB
Progress (1): 3.9 kB
Progress (1): 8.3 kB
Progress (1): 13 kB 
Progress (1): 16 kB
Progress (1): 17 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/21/apache-21.pom (17 kB at 231 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/shrinkwrap/descriptors/shrinkwrap-descriptors-bom/2.0.0/shrinkwrap-descriptors-bom-2.0.0.pom
Progress (1): 1.1 kB
Progress (1): 5.2 kB
Progress (1): 5.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/shrinkwrap/descriptors/shrinkwrap-descriptors-bom/2.0.0/shrinkwrap-descriptors-bom-2.0.0.pom (5.2 kB at 95 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/jakarta/validation/jakarta.validation-api/3.0.2/jakarta.validation-api-3.0.2.pom
Progress (1): 1.0 kB
Progress (1): 3.7 kB
Progress (1): 6.2 kB
Progress (1): 9.4 kB
Progress (1): 11 kB 
                   
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/validation/jakarta.validation-api/3.0.2/jakarta.validation-api-3.0.2.pom (11 kB at 169 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/h2database/h2/2.2.224/h2-2.2.224.pom
Progress (1): 1.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/h2database/h2/2.2.224/h2-2.2.224.pom (1.1 kB at 16 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-test/3.3.4/spring-boot-starter-test-3.3.4.pom
Progress (1): 930 B
Progress (1): 3.7 kB
Progress (1): 5.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-test/3.3.4/spring-boot-starter-test-3.3.4.pom (5.1 kB at 87 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test/3.3.4/spring-boot-test-3.3.4.pom
Progress (1): 1.0 kB
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test/3.3.4/spring-boot-test-3.3.4.pom (2.2 kB at 36 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-test/6.1.13/spring-test-6.1.13.pom
Progress (1): 1.1 kB
Progress (1): 2.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-test/6.1.13/spring-test-6.1.13.pom (2.1 kB at 40 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test-autoconfigure/3.3.4/spring-boot-test-autoconfigure-3.3.4.pom
Progress (1): 1.0 kB
Progress (1): 2.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test-autoconfigure/3.3.4/spring-boot-test-autoconfigure-3.3.4.pom (2.5 kB at 43 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/jayway/jsonpath/json-path/2.9.0/json-path-2.9.0.pom
Progress (1): 960 B
Progress (1): 1.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/jayway/jsonpath/json-path/2.9.0/json-path-2.9.0.pom (1.9 kB at 33 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/net/minidev/json-smart/2.5.1/json-smart-2.5.1.pom
Progress (1): 780 B
Progress (1): 1.9 kB
Progress (1): 3.6 kB
Progress (1): 5.5 kB
Progress (1): 8.2 kB
Progress (1): 9.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/net/minidev/json-smart/2.5.1/json-smart-2.5.1.pom (9.3 kB at 117 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/net/minidev/accessors-smart/2.5.1/accessors-smart-2.5.1.pom
Progress (1): 780 B
Progress (1): 2.4 kB
Progress (1): 4.3 kB
Progress (1): 7.1 kB
Progress (1): 11 kB 
Progress (1): 11 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/net/minidev/accessors-smart/2.5.1/accessors-smart-2.5.1.pom (11 kB at 165 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.6/asm-9.6.pom
Progress (1): 1.3 kB
Progress (1): 2.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.6/asm-9.6.pom (2.4 kB at 39 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/ow2/1.5.1/ow2-1.5.1.pom
Progress (1): 709 B
Progress (1): 2.1 kB
Progress (1): 3.6 kB
Progress (1): 5.7 kB
Progress (1): 8.1 kB

Progress (1): 11 kB 
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/ow2/1.5.1/ow2-1.5.1.pom (11 kB at 157 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-core/3.25.3/assertj-core-3.25.3.pom
Progress (1): 1.1 kB
Progress (1): 3.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-core/3.25.3/assertj-core-3.25.3.pom (3.8 kB at 60 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/awaitility/awaitility/4.2.2/awaitility-4.2.2.pom
Progress (1): 821 B
Progress (1): 3.0 kB
Progress (1): 3.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/awaitility/awaitility/4.2.2/awaitility-4.2.2.pom (3.5 kB at 63 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/awaitility/awaitility-parent/4.2.2/awaitility-parent-4.2.2.pom
Progress (1): 826 B
Progress (1): 2.5 kB
Progress (1): 5.3 kB
Progress (1): 9.3 kB
Progress (1): 11 kB 
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/awaitility/awaitility-parent/4.2.2/awaitility-parent-4.2.2.pom (11 kB at 162 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest/2.2/hamcrest-2.2.pom
Progress (1): 1.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest/2.2/hamcrest-2.2.pom (1.1 kB at 19 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter/5.10.3/junit-jupiter-5.10.3.pom
Progress (1): 944 B
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter/5.10.3/junit-jupiter-5.10.3.pom (3.2 kB at 55 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.10.3/junit-jupiter-api-5.10.3.pom
Progress (1): 954 B
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.10.3/junit-jupiter-api-5.10.3.pom (3.2 kB at 52 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.pom
Progress (1): 996 B
Progress (1): 2.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.pom (2.0 kB at 29 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.10.3/junit-platform-commons-1.10.3.pom
Progress (1): 966 B
Progress (1): 2.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.10.3/junit-platform-commons-1.10.3.pom (2.8 kB at 44 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.pom
Progress (1): 1.0 kB
Progress (1): 1.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.pom (1.5 kB at 26 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-params/5.10.3/junit-jupiter-params-5.10.3.pom
Progress (1): 964 B
Progress (1): 3.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-params/5.10.3/junit-jupiter-params-5.10.3.pom (3.0 kB at 29 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/5.10.3/junit-jupiter-engine-5.10.3.pom
Progress (1): 962 B
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/5.10.3/junit-jupiter-engine-5.10.3.pom (3.2 kB at 55 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.10.3/junit-platform-engine-1.10.3.pom
Progress (1): 957 B
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.10.3/junit-platform-engine-1.10.3.pom (3.2 kB at 44 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/5.11.0/mockito-core-5.11.0.pom
Progress (1): 1.6 kB
Progress (1): 2.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/5.11.0/mockito-core-5.11.0.pom (2.5 kB at 21 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.14.19/byte-buddy-agent-1.14.19.pom

Progress (1): 1.2 kB
Progress (1): 3.6 kB
Progress (1): 6.2 kB
Progress (1): 10 kB 
                   
Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.14.19/byte-buddy-agent-1.14.19.pom (10 kB at 174 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/objenesis/objenesis/3.3/objenesis-3.3.pom
Progress (1): 795 B
Progress (1): 2.5 kB
Progress (1): 3.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/objenesis/objenesis/3.3/objenesis-3.3.pom (3.0 kB at 52 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/objenesis/objenesis-parent/3.3/objenesis-parent-3.3.pom
Progress (1): 741 B
Progress (1): 2.3 kB
Progress (1): 4.5 kB
Progress (1): 6.6 kB
Progress (1): 10 kB 
Progress (1): 13 kB
Progress (1): 18 kB
Progress (1): 19 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/objenesis/objenesis-parent/3.3/objenesis-parent-3.3.pom (19 kB at 314 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-junit-jupiter/5.11.0/mockito-junit-jupiter-5.11.0.pom
Progress (1): 1.6 kB
Progress (1): 2.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-junit-jupiter/5.11.0/mockito-junit-jupiter-5.11.0.pom (2.3 kB at 27 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/skyscreamer/jsonassert/1.5.3/jsonassert-1.5.3.pom
Progress (1): 1.0 kB
Progress (1): 3.5 kB
Progress (1): 7.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/skyscreamer/jsonassert/1.5.3/jsonassert-1.5.3.pom (7.0 kB at 90 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/vaadin/external/google/android-json/0.0.20131108.vaadin1/android-json-0.0.20131108.vaadin1.pom
Progress (1): 1.1 kB
Progress (1): 2.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/vaadin/external/google/android-json/0.0.20131108.vaadin1/android-json-0.0.20131108.vaadin1.pom (2.8 kB at 41 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/xmlunit/xmlunit-core/2.9.1/xmlunit-core-2.9.1.pom
Progress (1): 849 B
Progress (1): 2.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/xmlunit/xmlunit-core/2.9.1/xmlunit-core-2.9.1.pom (2.4 kB at 43 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/xmlunit/xmlunit-parent/2.9.1/xmlunit-parent-2.9.1.pom
Progress (1): 781 B
Progress (1): 2.2 kB
Progress (1): 4.6 kB
Progress (1): 7.7 kB
Progress (1): 11 kB 
Progress (1): 13 kB
Progress (1): 17 kB
Progress (1): 21 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/xmlunit/xmlunit-parent/2.9.1/xmlunit-parent-2.9.1.pom (21 kB at 214 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-web/3.3.4/spring-boot-starter-web-3.3.4.jar
Progress (1): 4.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-web/3.3.4/spring-boot-starter-web-3.3.4.jar (4.8 kB at 62 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-classic/1.5.8/logback-classic-1.5.8.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter/3.3.4/spring-boot-starter-3.3.4.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/3.3.4/spring-boot-3.3.4.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoconfigure/3.3.4/spring-boot-autoconfigure-3.3.4.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-logging/3.3.4/spring-boot-starter-logging-3.3.4.jar
Progress (1): 7.7/305 kB
Progress (1): 16/305 kB 
Progress (1): 28/305 kB
Progress (1): 44/305 kB
Progress (1): 61/305 kB
Progress (1): 77/305 kB
Progress (1): 93/305 kB
Progress (1): 110/305 kB
Progress (1): 126/305 kB
Progress (1): 142/305 kB
Progress (1): 159/305 kB
Progress (1): 175/305 kB
Progress (1): 192/305 kB
Progress (1): 208/305 kB
Progress (1): 224/305 kB
Progress (1): 233/305 kB
Progress (1): 250/305 kB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0/2.0 MB
Progress (2): 250/305 kB | 0.1/2.0 MB
Progress (2): 250/305 kB | 0.1/2.0 MB
Progress (2): 250/305 kB | 0.1/2.0 MB
Progress (2): 250/305 kB | 0.1/2.0 MB
Progress (2): 250/305 kB | 0.1/2.0 MB
Progress (2): 250/305 kB | 0.1/2.0 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 250/305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 266/305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 266/305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 282/305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 282/305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 299/305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB    
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (3): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB
Progress (4): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB | 0.9/4.8 kB
Progress (4): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB | 2.3/4.8 kB
Progress (4): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB | 2.3/4.8 kB
Progress (4): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB | 3.6/4.8 kB
Progress (4): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB | 4.8 kB    
Progress (4): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB | 4.8 kB
Progress (4): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB | 4.8 kB
Progress (4): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB | 4.8 kB
Progress (4): 305 kB | 0.1/2.0 MB | 0.1/1.6 MB | 4.8 kB
Progress (4): 305 kB | 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB
Progress (4): 305 kB | 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB
Progress (4): 305 kB | 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB
Progress (4): 305 kB | 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB
Progress (4): 305 kB | 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB
Progress (4): 305 kB | 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB
Progress (4): 305 kB | 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB
Progress (4): 305 kB | 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB
                                                       
Downloaded from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-classic/1.5.8/logback-classic-1.5.8.jar (305 kB at 2.8 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-core/1.5.8/logback-core-1.5.8.jar
Progress (4): 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB | 0.9/4.8 kB
Progress (4): 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB | 2.3/4.8 kB
Progress (4): 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB | 3.6/4.8 kB
Progress (4): 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB | 4.8 kB    
Progress (4): 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.2/2.0 MB | 0.1/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.2/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.2/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.2/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.2/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.2/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.2/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.3/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.3/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.3/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.3/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.3/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.3/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.3/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.3/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.3/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.3/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.3/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.3/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.3/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.3/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.3/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.3/2.0 MB | 0.2/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.3/2.0 MB | 0.3/1.6 MB | 4.8 kB | 4.8 kB
Progress (4): 0.3/2.0 MB | 0.3/1.6 MB | 4.8 kB | 4.8 kB
                                                       
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-logging/3.3.4/spring-boot-starter-logging-3.3.4.jar (4.8 kB at 33 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-to-slf4j/2.23.1/log4j-to-slf4j-2.23.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter/3.3.4/spring-boot-starter-3.3.4.jar (4.8 kB at 33 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-api/2.23.1/log4j-api-2.23.1.jar
Progress (2): 0.3/2.0 MB | 0.3/1.6 MB
Progress (2): 0.3/2.0 MB | 0.3/1.6 MB
Progress (2): 0.3/2.0 MB | 0.3/1.6 MB
Progress (2): 0.3/2.0 MB | 0.3/1.6 MB
Progress (2): 0.3/2.0 MB | 0.3/1.6 MB
Progress (2): 0.3/2.0 MB | 0.3/1.6 MB
Progress (2): 0.4/2.0 MB | 0.3/1.6 MB
Progress (2): 0.4/2.0 MB | 0.3/1.6 MB
Progress (2): 0.4/2.0 MB | 0.3/1.6 MB
Progress (2): 0.4/2.0 MB | 0.3/1.6 MB
Progress (2): 0.4/2.0 MB | 0.3/1.6 MB
Progress (2): 0.4/2.0 MB | 0.3/1.6 MB
Progress (2): 0.4/2.0 MB | 0.4/1.6 MB
Progress (2): 0.4/2.0 MB | 0.4/1.6 MB
Progress (2): 0.4/2.0 MB | 0.4/1.6 MB
Progress (2): 0.4/2.0 MB | 0.4/1.6 MB
Progress (2): 0.4/2.0 MB | 0.4/1.6 MB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 0.9/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 2.3/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 3.2/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 4.5/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 5.9/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 7.3/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 8.7/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 10/619 kB 
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 11/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 13/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 14/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 15/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 17/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 18/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 20/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 21/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 22/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 24/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 25/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 26/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 28/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 29/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 30/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 32/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 33/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 35/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 36/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 37/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 39/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 40/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 41/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 43/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 44/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 46/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 47/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 48/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 50/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 54/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 58/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 62/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 62/619 kB
Progress (3): 0.4/2.0 MB | 0.4/1.6 MB | 62/619 kB
Progress (3): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB
Progress (3): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB
Progress (3): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 0.9/23 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 2.3/23 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 3.6/23 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 5.0/23 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 6.4/23 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 7.7/23 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 9.1/23 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 10/23 kB 
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 12/23 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 13/23 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 15/23 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 16/23 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 17/23 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 19/23 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 20/23 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 21/23 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 21/23 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 23/23 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 23 kB   
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 23 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 23 kB
Progress (4): 0.5/2.0 MB | 0.4/1.6 MB | 62/619 kB | 23 kB
Progress (4): 0.5/2.0 MB | 0.5/1.6 MB | 62/619 kB | 23 kB
Progress (4): 0.5/2.0 MB | 0.5/1.6 MB | 62/619 kB | 23 kB
Progress (4): 0.5/2.0 MB | 0.5/1.6 MB | 62/619 kB | 23 kB
Progress (4): 0.5/2.0 MB | 0.5/1.6 MB | 62/619 kB | 23 kB
Progress (4): 0.5/2.0 MB | 0.5/1.6 MB | 62/619 kB | 23 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 62/619 kB | 23 kB | 6.6/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 62/619 kB | 23 kB | 7.7/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 62/619 kB | 23 kB | 24/343 kB 
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 62/619 kB | 23 kB | 40/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 62/619 kB | 23 kB | 57/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 62/619 kB | 23 kB | 73/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 67/619 kB | 23 kB | 73/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 71/619 kB | 23 kB | 73/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 75/619 kB | 23 kB | 73/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 75/619 kB | 23 kB | 90/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 75/619 kB | 23 kB | 106/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 75/619 kB | 23 kB | 106/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 75/619 kB | 23 kB | 122/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 75/619 kB | 23 kB | 139/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 79/619 kB | 23 kB | 139/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 83/619 kB | 23 kB | 139/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 83/619 kB | 23 kB | 155/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 83/619 kB | 23 kB | 172/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 83/619 kB | 23 kB | 188/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 88/619 kB | 23 kB | 188/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 92/619 kB | 23 kB | 188/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 96/619 kB | 23 kB | 188/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 100/619 kB | 23 kB | 188/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 105/619 kB | 23 kB | 188/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 105/619 kB | 23 kB | 204/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 105/619 kB | 23 kB | 217/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 105/619 kB | 23 kB | 233/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 105/619 kB | 23 kB | 250/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 105/619 kB | 23 kB | 266/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 105/619 kB | 23 kB | 266/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 109/619 kB | 23 kB | 266/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 113/619 kB | 23 kB | 266/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 117/619 kB | 23 kB | 266/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 122/619 kB | 23 kB | 266/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 126/619 kB | 23 kB | 266/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 126/619 kB | 23 kB | 266/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 130/619 kB | 23 kB | 266/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 135/619 kB | 23 kB | 266/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 139/619 kB | 23 kB | 266/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 143/619 kB | 23 kB | 266/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 147/619 kB | 23 kB | 266/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 151/619 kB | 23 kB | 266/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 156/619 kB | 23 kB | 266/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 160/619 kB | 23 kB | 266/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 164/619 kB | 23 kB | 266/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 168/619 kB | 23 kB | 266/343 kB
Progress (5): 0.5/2.0 MB | 0.5/1.6 MB | 173/619 kB | 23 kB | 266/343 kB
Progress (5): 0.6/2.0 MB | 0.5/1.6 MB | 173/619 kB | 23 kB | 266/343 kB
Progress (5): 0.6/2.0 MB | 0.5/1.6 MB | 173/619 kB | 23 kB | 266/343 kB
Progress (5): 0.6/2.0 MB | 0.5/1.6 MB | 173/619 kB | 23 kB | 282/343 kB
Progress (5): 0.6/2.0 MB | 0.5/1.6 MB | 173/619 kB | 23 kB | 282/343 kB

Progress (5): 0.6/2.0 MB | 0.5/1.6 MB | 173/619 kB | 23 kB | 282/343 kB
Progress (5): 0.6/2.0 MB | 0.5/1.6 MB | 173/619 kB | 23 kB | 282/343 kB
Progress (5): 0.6/2.0 MB | 0.5/1.6 MB | 173/619 kB | 23 kB | 299/343 kB
Progress (5): 0.6/2.0 MB | 0.5/1.6 MB | 173/619 kB | 23 kB | 299/343 kB
Progress (5): 0.6/2.0 MB | 0.5/1.6 MB | 173/619 kB | 23 kB | 315/343 kB
Progress (5): 0.6/2.0 MB | 0.6/1.6 MB | 173/619 kB | 23 kB | 315/343 kB
Progress (5): 0.6/2.0 MB | 0.6/1.6 MB | 173/619 kB | 23 kB | 315/343 kB
Progress (5): 0.6/2.0 MB | 0.6/1.6 MB | 173/619 kB | 23 kB | 315/343 kB
Progress (5): 0.6/2.0 MB | 0.6/1.6 MB | 177/619 kB | 23 kB | 315/343 kB
Progress (5): 0.6/2.0 MB | 0.6/1.6 MB | 181/619 kB | 23 kB | 315/343 kB
Progress (5): 0.6/2.0 MB | 0.6/1.6 MB | 181/619 kB | 23 kB | 331/343 kB
Progress (5): 0.6/2.0 MB | 0.6/1.6 MB | 181/619 kB | 23 kB | 343 kB    
Progress (5): 0.6/2.0 MB | 0.6/1.6 MB | 181/619 kB | 23 kB | 343 kB
Progress (5): 0.7/2.0 MB | 0.6/1.6 MB | 181/619 kB | 23 kB | 343 kB
Progress (5): 0.7/2.0 MB | 0.6/1.6 MB | 181/619 kB | 23 kB | 343 kB
Progress (5): 0.7/2.0 MB | 0.6/1.6 MB | 181/619 kB | 23 kB | 343 kB
Progress (5): 0.7/2.0 MB | 0.6/1.6 MB | 181/619 kB | 23 kB | 343 kB
Progress (5): 0.7/2.0 MB | 0.6/1.6 MB | 181/619 kB | 23 kB | 343 kB
Progress (5): 0.7/2.0 MB | 0.6/1.6 MB | 185/619 kB | 23 kB | 343 kB
Progress (5): 0.7/2.0 MB | 0.6/1.6 MB | 189/619 kB | 23 kB | 343 kB
Progress (5): 0.7/2.0 MB | 0.6/1.6 MB | 192/619 kB | 23 kB | 343 kB
Progress (5): 0.7/2.0 MB | 0.6/1.6 MB | 196/619 kB | 23 kB | 343 kB
Progress (5): 0.7/2.0 MB | 0.6/1.6 MB | 200/619 kB | 23 kB | 343 kB
Progress (5): 0.7/2.0 MB | 0.6/1.6 MB | 204/619 kB | 23 kB | 343 kB
Progress (5): 0.7/2.0 MB | 0.6/1.6 MB | 208/619 kB | 23 kB | 343 kB
Progress (5): 0.7/2.0 MB | 0.6/1.6 MB | 213/619 kB | 23 kB | 343 kB
Progress (5): 0.7/2.0 MB | 0.6/1.6 MB | 225/619 kB | 23 kB | 343 kB
Progress (5): 0.7/2.0 MB | 0.6/1.6 MB | 229/619 kB | 23 kB | 343 kB
Progress (5): 0.7/2.0 MB | 0.6/1.6 MB | 245/619 kB | 23 kB | 343 kB
                                                                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-api/2.23.1/log4j-api-2.23.1.jar (343 kB at 976 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/2.0.16/jul-to-slf4j-2.0.16.jar
Progress (4): 0.7/2.0 MB | 0.6/1.6 MB | 245/619 kB | 23 kB
Progress (4): 0.7/2.0 MB | 0.6/1.6 MB | 245/619 kB | 23 kB
Progress (4): 0.7/2.0 MB | 0.6/1.6 MB | 262/619 kB | 23 kB
Progress (4): 0.7/2.0 MB | 0.6/1.6 MB | 278/619 kB | 23 kB
Progress (4): 0.7/2.0 MB | 0.6/1.6 MB | 278/619 kB | 23 kB
Progress (4): 0.7/2.0 MB | 0.6/1.6 MB | 278/619 kB | 23 kB
Progress (4): 0.7/2.0 MB | 0.7/1.6 MB | 278/619 kB | 23 kB
Progress (4): 0.7/2.0 MB | 0.7/1.6 MB | 278/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.7/1.6 MB | 278/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.7/1.6 MB | 278/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.7/1.6 MB | 278/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.7/1.6 MB | 295/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.7/1.6 MB | 295/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.7/1.6 MB | 295/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.7/1.6 MB | 295/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.7/1.6 MB | 295/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.7/1.6 MB | 295/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.7/1.6 MB | 311/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.7/1.6 MB | 327/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.8/1.6 MB | 327/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.8/1.6 MB | 344/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.8/1.6 MB | 356/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.8/1.6 MB | 356/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.8/1.6 MB | 372/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.8/1.6 MB | 372/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.8/1.6 MB | 372/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.8/1.6 MB | 372/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.8/1.6 MB | 389/619 kB | 23 kB
Progress (4): 0.8/2.0 MB | 0.8/1.6 MB | 389/619 kB | 23 kB
Progress (4): 0.9/2.0 MB | 0.8/1.6 MB | 389/619 kB | 23 kB
Progress (5): 0.9/2.0 MB | 0.8/1.6 MB | 389/619 kB | 23 kB | 6.4 kB
Progress (5): 0.9/2.0 MB | 0.8/1.6 MB | 389/619 kB | 23 kB | 6.4 kB
Progress (5): 0.9/2.0 MB | 0.8/1.6 MB | 389/619 kB | 23 kB | 6.4 kB
Progress (5): 0.9/2.0 MB | 0.8/1.6 MB | 389/619 kB | 23 kB | 6.4 kB
Progress (5): 0.9/2.0 MB | 0.8/1.6 MB | 389/619 kB | 23 kB | 6.4 kB
Progress (5): 0.9/2.0 MB | 0.8/1.6 MB | 405/619 kB | 23 kB | 6.4 kB
Progress (5): 0.9/2.0 MB | 0.8/1.6 MB | 405/619 kB | 23 kB | 6.4 kB
Progress (5): 0.9/2.0 MB | 0.8/1.6 MB | 405/619 kB | 23 kB | 6.4 kB
Progress (5): 0.9/2.0 MB | 0.8/1.6 MB | 405/619 kB | 23 kB | 6.4 kB
Progress (5): 0.9/2.0 MB | 0.9/1.6 MB | 405/619 kB | 23 kB | 6.4 kB
Progress (5): 0.9/2.0 MB | 0.9/1.6 MB | 405/619 kB | 23 kB | 6.4 kB
Progress (5): 0.9/2.0 MB | 0.9/1.6 MB | 422/619 kB | 23 kB | 6.4 kB
Progress (5): 0.9/2.0 MB | 0.9/1.6 MB | 438/619 kB | 23 kB | 6.4 kB
Progress (5): 0.9/2.0 MB | 0.9/1.6 MB | 454/619 kB | 23 kB | 6.4 kB
                                                                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/jul-to-slf4j/2.0.16/jul-to-slf4j-2.0.16.jar (6.4 kB at 14 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/jakarta/annotation/jakarta.annotation-api/2.1.1/jakarta.annotation-api-2.1.1.jar
Progress (4): 0.9/2.0 MB | 0.9/1.6 MB | 454/619 kB | 23 kB
Progress (4): 0.9/2.0 MB | 0.9/1.6 MB | 471/619 kB | 23 kB
Progress (4): 0.9/2.0 MB | 0.9/1.6 MB | 487/619 kB | 23 kB
Progress (4): 0.9/2.0 MB | 0.9/1.6 MB | 503/619 kB | 23 kB
Progress (4): 0.9/2.0 MB | 0.9/1.6 MB | 520/619 kB | 23 kB
Progress (4): 0.9/2.0 MB | 0.9/1.6 MB | 520/619 kB | 23 kB
Progress (4): 0.9/2.0 MB | 0.9/1.6 MB | 536/619 kB | 23 kB
Progress (4): 0.9/2.0 MB | 0.9/1.6 MB | 536/619 kB | 23 kB
Progress (4): 0.9/2.0 MB | 0.9/1.6 MB | 536/619 kB | 23 kB
Progress (4): 1.0/2.0 MB | 0.9/1.6 MB | 536/619 kB | 23 kB
Progress (4): 1.0/2.0 MB | 0.9/1.6 MB | 536/619 kB | 23 kB
Progress (4): 1.0/2.0 MB | 0.9/1.6 MB | 536/619 kB | 23 kB
Progress (4): 1.0/2.0 MB | 0.9/1.6 MB | 536/619 kB | 23 kB
Progress (4): 1.0/2.0 MB | 0.9/1.6 MB | 536/619 kB | 23 kB
                                                          
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/logging/log4j/log4j-to-slf4j/2.23.1/log4j-to-slf4j-2.23.1.jar (23 kB at 47 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/yaml/snakeyaml/2.2/snakeyaml-2.2.jar
Progress (3): 1.0/2.0 MB | 0.9/1.6 MB | 536/619 kB
Progress (3): 1.0/2.0 MB | 1.0/1.6 MB | 536/619 kB
Progress (3): 1.0/2.0 MB | 1.0/1.6 MB | 536/619 kB
Progress (3): 1.0/2.0 MB | 1.0/1.6 MB | 536/619 kB
Progress (3): 1.1/2.0 MB | 1.0/1.6 MB | 536/619 kB
Progress (3): 1.1/2.0 MB | 1.0/1.6 MB | 553/619 kB
Progress (3): 1.1/2.0 MB | 1.0/1.6 MB | 553/619 kB
Progress (3): 1.1/2.0 MB | 1.0/1.6 MB | 553/619 kB
Progress (3): 1.1/2.0 MB | 1.0/1.6 MB | 553/619 kB
Progress (3): 1.1/2.0 MB | 1.0/1.6 MB | 569/619 kB
Progress (3): 1.1/2.0 MB | 1.0/1.6 MB | 577/619 kB
Progress (3): 1.1/2.0 MB | 1.0/1.6 MB | 577/619 kB
Progress (3): 1.1/2.0 MB | 1.0/1.6 MB | 577/619 kB
Progress (3): 1.1/2.0 MB | 1.0/1.6 MB | 577/619 kB
Progress (3): 1.1/2.0 MB | 1.0/1.6 MB | 577/619 kB
Progress (3): 1.1/2.0 MB | 1.0/1.6 MB | 577/619 kB
Progress (3): 1.1/2.0 MB | 1.0/1.6 MB | 594/619 kB
Progress (4): 1.1/2.0 MB | 1.0/1.6 MB | 594/619 kB | 7.7/26 kB
Progress (4): 1.1/2.0 MB | 1.0/1.6 MB | 594/619 kB | 11/26 kB 
Progress (4): 1.1/2.0 MB | 1.0/1.6 MB | 594/619 kB | 26 kB   
Progress (4): 1.1/2.0 MB | 1.1/1.6 MB | 594/619 kB | 26 kB
Progress (4): 1.1/2.0 MB | 1.1/1.6 MB | 594/619 kB | 26 kB
Progress (4): 1.1/2.0 MB | 1.1/1.6 MB | 610/619 kB | 26 kB
Progress (4): 1.1/2.0 MB | 1.1/1.6 MB | 610/619 kB | 26 kB
Progress (4): 1.1/2.0 MB | 1.1/1.6 MB | 610/619 kB | 26 kB
Progress (4): 1.1/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB    
Progress (4): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB
Progress (4): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB
Progress (4): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB
Progress (4): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB
Progress (4): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 0.9/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 2.3/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 3.6/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 5.0/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 6.4/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 7.7/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 9.1/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 10/334 kB 
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 12/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 13/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 15/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 16/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 17/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 19/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 20/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 21/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 23/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 24/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 25/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 30/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 34/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 38/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 42/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 47/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 51/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 55/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 57/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 61/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 61/334 kB
Progress (5): 1.2/2.0 MB | 1.1/1.6 MB | 619 kB | 26 kB | 61/334 kB
                                                                  
Downloaded from central: https://repo.maven.apache.org/maven2/ch/qos/logback/logback-core/1.5.8/logback-core-1.5.8.jar (619 kB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-json/3.3.4/spring-boot-starter-json-3.3.4.jar
Progress (4): 1.2/2.0 MB | 1.1/1.6 MB | 26 kB | 61/334 kB
Progress (4): 1.2/2.0 MB | 1.2/1.6 MB | 26 kB | 61/334 kB
Progress (4): 1.2/2.0 MB | 1.2/1.6 MB | 26 kB | 61/334 kB
Progress (4): 1.2/2.0 MB | 1.2/1.6 MB | 26 kB | 61/334 kB
Progress (4): 1.2/2.0 MB | 1.2/1.6 MB | 26 kB | 61/334 kB
Progress (4): 1.2/2.0 MB | 1.2/1.6 MB | 26 kB | 61/334 kB
Progress (4): 1.2/2.0 MB | 1.2/1.6 MB | 26 kB | 61/334 kB
Progress (4): 1.2/2.0 MB | 1.2/1.6 MB | 26 kB | 61/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 61/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 61/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 61/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 61/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 61/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 65/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 65/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 70/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 74/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 78/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 82/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 86/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 91/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 93/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 98/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 102/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 106/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 106/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 110/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 115/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 119/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 122/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 127/334 kB
Progress (4): 1.3/2.0 MB | 1.2/1.6 MB | 26 kB | 127/334 kB
Progress (4): 1.3/2.0 MB | 1.3/1.6 MB | 26 kB | 127/334 kB
Progress (4): 1.3/2.0 MB | 1.3/1.6 MB | 26 kB | 127/334 kB
Progress (4): 1.3/2.0 MB | 1.3/1.6 MB | 26 kB | 127/334 kB
Progress (4): 1.3/2.0 MB | 1.3/1.6 MB | 26 kB | 127/334 kB
Progress (4): 1.4/2.0 MB | 1.3/1.6 MB | 26 kB | 127/334 kB
Progress (4): 1.4/2.0 MB | 1.3/1.6 MB | 26 kB | 127/334 kB
Progress (4): 1.4/2.0 MB | 1.3/1.6 MB | 26 kB | 127/334 kB
Progress (4): 1.4/2.0 MB | 1.3/1.6 MB | 26 kB | 127/334 kB
Progress (4): 1.4/2.0 MB | 1.3/1.6 MB | 26 kB | 127/334 kB
Progress (4): 1.4/2.0 MB | 1.3/1.6 MB | 26 kB | 127/334 kB
Progress (4): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 127/334 kB
Progress (4): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 127/334 kB
Progress (4): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 127/334 kB
Progress (4): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 131/334 kB
Progress (4): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 135/334 kB
Progress (4): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 135/334 kB
Progress (4): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 139/334 kB
Progress (4): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 144/334 kB
Progress (4): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 148/334 kB
Progress (4): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 152/334 kB
Progress (4): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 156/334 kB
Progress (4): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 160/334 kB
Progress (4): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 165/334 kB
Progress (4): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 169/334 kB
Progress (4): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 173/334 kB
Progress (4): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 177/334 kB
Progress (4): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 182/334 kB
Progress (4): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 186/334 kB
Progress (4): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 188/334 kB
Progress (5): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 188/334 kB | 3.2/4.7 kB
Progress (5): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 204/334 kB | 3.2/4.7 kB
Progress (5): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 204/334 kB | 4.7 kB    
Progress (5): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 221/334 kB | 4.7 kB
Progress (5): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 221/334 kB | 4.7 kB
Progress (5): 1.4/2.0 MB | 1.4/1.6 MB | 26 kB | 221/334 kB | 4.7 kB
Progress (5): 1.5/2.0 MB | 1.4/1.6 MB | 26 kB | 221/334 kB | 4.7 kB
Progress (5): 1.5/2.0 MB | 1.4/1.6 MB | 26 kB | 221/334 kB | 4.7 kB
Progress (5): 1.5/2.0 MB | 1.4/1.6 MB | 26 kB | 221/334 kB | 4.7 kB
Progress (5): 1.5/2.0 MB | 1.4/1.6 MB | 26 kB | 221/334 kB | 4.7 kB
Progress (5): 1.5/2.0 MB | 1.4/1.6 MB | 26 kB | 221/334 kB | 4.7 kB
Progress (5): 1.5/2.0 MB | 1.4/1.6 MB | 26 kB | 221/334 kB | 4.7 kB
Progress (5): 1.5/2.0 MB | 1.4/1.6 MB | 26 kB | 221/334 kB | 4.7 kB
                                                                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-json/3.3.4/spring-boot-starter-json-3.3.4.jar (4.7 kB at 6.8 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.17.2/jackson-databind-2.17.2.jar
Progress (4): 1.5/2.0 MB | 1.4/1.6 MB | 26 kB | 221/334 kB
Progress (4): 1.5/2.0 MB | 1.5/1.6 MB | 26 kB | 221/334 kB
Progress (4): 1.5/2.0 MB | 1.5/1.6 MB | 26 kB | 221/334 kB
Progress (4): 1.5/2.0 MB | 1.5/1.6 MB | 26 kB | 221/334 kB
Progress (4): 1.5/2.0 MB | 1.5/1.6 MB | 26 kB | 221/334 kB
Progress (4): 1.6/2.0 MB | 1.5/1.6 MB | 26 kB | 221/334 kB
Progress (4): 1.6/2.0 MB | 1.5/1.6 MB | 26 kB | 237/334 kB
Progress (4): 1.6/2.0 MB | 1.5/1.6 MB | 26 kB | 253/334 kB
Progress (4): 1.6/2.0 MB | 1.5/1.6 MB | 26 kB | 270/334 kB
Progress (4): 1.6/2.0 MB | 1.5/1.6 MB | 26 kB | 270/334 kB
Progress (4): 1.6/2.0 MB | 1.5/1.6 MB | 26 kB | 286/334 kB
Progress (4): 1.6/2.0 MB | 1.5/1.6 MB | 26 kB | 303/334 kB
Progress (4): 1.6/2.0 MB | 1.5/1.6 MB | 26 kB | 319/334 kB
Progress (4): 1.6/2.0 MB | 1.5/1.6 MB | 26 kB | 319/334 kB
Progress (4): 1.6/2.0 MB | 1.5/1.6 MB | 26 kB | 334 kB    
Progress (4): 1.6/2.0 MB | 1.5/1.6 MB | 26 kB | 334 kB
Progress (4): 1.6/2.0 MB | 1.5/1.6 MB | 26 kB | 334 kB
Progress (4): 1.6/2.0 MB | 1.5/1.6 MB | 26 kB | 334 kB
Progress (4): 1.6/2.0 MB | 1.5/1.6 MB | 26 kB | 334 kB
Progress (4): 1.6/2.0 MB | 1.5/1.6 MB | 26 kB | 334 kB
Progress (4): 1.6/2.0 MB | 1.6/1.6 MB | 26 kB | 334 kB
Progress (4): 1.6/2.0 MB | 1.6/1.6 MB | 26 kB | 334 kB
Progress (4): 1.6/2.0 MB | 1.6/1.6 MB | 26 kB | 334 kB
Progress (4): 1.7/2.0 MB | 1.6/1.6 MB | 26 kB | 334 kB
Progress (4): 1.7/2.0 MB | 1.6/1.6 MB | 26 kB | 334 kB
                                                      
Downloaded from central: https://repo.maven.apache.org/maven2/org/yaml/snakeyaml/2.2/snakeyaml-2.2.jar (334 kB at 444 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.17.2/jackson-annotations-2.17.2.jar
Progress (3): 1.7/2.0 MB | 1.6/1.6 MB | 26 kB
Progress (3): 1.7/2.0 MB | 1.6/1.6 MB | 26 kB
Progress (4): 1.7/2.0 MB | 1.6/1.6 MB | 26 kB | 0/1.6 MB
Progress (4): 1.7/2.0 MB | 1.6/1.6 MB | 26 kB | 0/1.6 MB
Progress (4): 1.7/2.0 MB | 1.6/1.6 MB | 26 kB | 0/1.6 MB
Progress (4): 1.7/2.0 MB | 1.6/1.6 MB | 26 kB | 0/1.6 MB
Progress (4): 1.7/2.0 MB | 1.6 MB | 26 kB | 0/1.6 MB    
Progress (4): 1.7/2.0 MB | 1.6 MB | 26 kB | 0/1.6 MB
Progress (4): 1.7/2.0 MB | 1.6 MB | 26 kB | 0/1.6 MB
Progress (4): 1.7/2.0 MB | 1.6 MB | 26 kB | 0/1.6 MB
Progress (4): 1.7/2.0 MB | 1.6 MB | 26 kB | 0.1/1.6 MB
Progress (4): 1.7/2.0 MB | 1.6 MB | 26 kB | 0.1/1.6 MB
Progress (4): 1.7/2.0 MB | 1.6 MB | 26 kB | 0.1/1.6 MB
Progress (4): 1.7/2.0 MB | 1.6 MB | 26 kB | 0.1/1.6 MB
Progress (4): 1.7/2.0 MB | 1.6 MB | 26 kB | 0.1/1.6 MB
                                                      
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot/3.3.4/spring-boot-3.3.4.jar (1.6 MB at 2.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.17.2/jackson-core-2.17.2.jar
Progress (3): 1.7/2.0 MB | 26 kB | 0.1/1.6 MB
Progress (3): 1.7/2.0 MB | 26 kB | 0.1/1.6 MB
Progress (3): 1.7/2.0 MB | 26 kB | 0.1/1.6 MB
Progress (3): 1.8/2.0 MB | 26 kB | 0.1/1.6 MB
Progress (3): 1.8/2.0 MB | 26 kB | 0.1/1.6 MB
Progress (3): 1.8/2.0 MB | 26 kB | 0.2/1.6 MB
Progress (4): 1.8/2.0 MB | 26 kB | 0.2/1.6 MB | 7.7/78 kB
Progress (4): 1.8/2.0 MB | 26 kB | 0.2/1.6 MB | 16/78 kB 
Progress (4): 1.8/2.0 MB | 26 kB | 0.2/1.6 MB | 24/78 kB
Progress (4): 1.8/2.0 MB | 26 kB | 0.2/1.6 MB | 40/78 kB
Progress (4): 1.8/2.0 MB | 26 kB | 0.2/1.6 MB | 40/78 kB
Progress (4): 1.8/2.0 MB | 26 kB | 0.2/1.6 MB | 57/78 kB
Progress (4): 1.8/2.0 MB | 26 kB | 0.2/1.6 MB | 57/78 kB
Progress (4): 1.8/2.0 MB | 26 kB | 0.2/1.6 MB | 73/78 kB
Progress (4): 1.8/2.0 MB | 26 kB | 0.2/1.6 MB | 78 kB   
Progress (4): 1.8/2.0 MB | 26 kB | 0.2/1.6 MB | 78 kB
Progress (4): 1.8/2.0 MB | 26 kB | 0.2/1.6 MB | 78 kB
Progress (4): 1.8/2.0 MB | 26 kB | 0.2/1.6 MB | 78 kB
Progress (4): 1.8/2.0 MB | 26 kB | 0.2/1.6 MB | 78 kB
Progress (4): 1.8/2.0 MB | 26 kB | 0.2/1.6 MB | 78 kB
Progress (4): 1.8/2.0 MB | 26 kB | 0.2/1.6 MB | 78 kB
Progress (4): 1.9/2.0 MB | 26 kB | 0.2/1.6 MB | 78 kB
Progress (4): 1.9/2.0 MB | 26 kB | 0.2/1.6 MB | 78 kB
Progress (4): 1.9/2.0 MB | 26 kB | 0.2/1.6 MB | 78 kB
                                                     
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-annotations/2.17.2/jackson-annotations-2.17.2.jar (78 kB at 93 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.17.2/jackson-datatype-jdk8-2.17.2.jar
Progress (3): 1.9/2.0 MB | 26 kB | 0.3/1.6 MB
Progress (3): 1.9/2.0 MB | 26 kB | 0.3/1.6 MB
Progress (4): 1.9/2.0 MB | 26 kB | 0.3/1.6 MB | 7.7/582 kB
Progress (4): 1.9/2.0 MB | 26 kB | 0.3/1.6 MB | 16/582 kB 
Progress (4): 1.9/2.0 MB | 26 kB | 0.3/1.6 MB | 24/582 kB
Progress (4): 1.9/2.0 MB | 26 kB | 0.3/1.6 MB | 24/582 kB
Progress (4): 1.9/2.0 MB | 26 kB | 0.3/1.6 MB | 24/582 kB
Progress (4): 1.9/2.0 MB | 26 kB | 0.3/1.6 MB | 40/582 kB
                                                         
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/annotation/jakarta.annotation-api/2.1.1/jakarta.annotation-api-2.1.1.jar (26 kB at 31 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.17.2/jackson-datatype-jsr310-2.17.2.jar
Progress (3): 1.9/2.0 MB | 0.3/1.6 MB | 40/582 kB
Progress (3): 1.9/2.0 MB | 0.3/1.6 MB | 40/582 kB
Progress (3): 1.9/2.0 MB | 0.3/1.6 MB | 57/582 kB
Progress (3): 1.9/2.0 MB | 0.3/1.6 MB | 57/582 kB
Progress (3): 1.9/2.0 MB | 0.3/1.6 MB | 57/582 kB
Progress (3): 1.9/2.0 MB | 0.3/1.6 MB | 73/582 kB
Progress (3): 2.0/2.0 MB | 0.3/1.6 MB | 73/582 kB
Progress (3): 2.0/2.0 MB | 0.3/1.6 MB | 73/582 kB
Progress (3): 2.0 MB | 0.3/1.6 MB | 73/582 kB    
Progress (3): 2.0 MB | 0.3/1.6 MB | 90/582 kB
Progress (3): 2.0 MB | 0.3/1.6 MB | 90/582 kB
Progress (3): 2.0 MB | 0.3/1.6 MB | 106/582 kB
Progress (3): 2.0 MB | 0.4/1.6 MB | 106/582 kB
Progress (3): 2.0 MB | 0.4/1.6 MB | 122/582 kB
Progress (4): 2.0 MB | 0.4/1.6 MB | 122/582 kB | 7.7/36 kB
Progress (4): 2.0 MB | 0.4/1.6 MB | 122/582 kB | 16/36 kB 
Progress (4): 2.0 MB | 0.4/1.6 MB | 122/582 kB | 24/36 kB
Progress (4): 2.0 MB | 0.4/1.6 MB | 122/582 kB | 36 kB   
Progress (4): 2.0 MB | 0.4/1.6 MB | 122/582 kB | 36 kB
Progress (4): 2.0 MB | 0.4/1.6 MB | 122/582 kB | 36 kB
Progress (4): 2.0 MB | 0.4/1.6 MB | 139/582 kB | 36 kB
                                                      
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-autoconfigure/3.3.4/spring-boot-autoconfigure-3.3.4.jar (2.0 MB at 2.2 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.17.2/jackson-module-parameter-names-2.17.2.jar
Progress (3): 0.4/1.6 MB | 155/582 kB | 36 kB
Progress (3): 0.4/1.6 MB | 155/582 kB | 36 kB
Progress (3): 0.4/1.6 MB | 172/582 kB | 36 kB
Progress (3): 0.4/1.6 MB | 172/582 kB | 36 kB
Progress (3): 0.4/1.6 MB | 188/582 kB | 36 kB
Progress (3): 0.4/1.6 MB | 188/582 kB | 36 kB
Progress (3): 0.4/1.6 MB | 204/582 kB | 36 kB
Progress (3): 0.4/1.6 MB | 221/582 kB | 36 kB
Progress (3): 0.4/1.6 MB | 237/582 kB | 36 kB
Progress (3): 0.5/1.6 MB | 237/582 kB | 36 kB
Progress (3): 0.5/1.6 MB | 237/582 kB | 36 kB
Progress (4): 0.5/1.6 MB | 237/582 kB | 36 kB | 7.7/132 kB
Progress (4): 0.5/1.6 MB | 237/582 kB | 36 kB | 16/132 kB 
Progress (4): 0.5/1.6 MB | 237/582 kB | 36 kB | 24/132 kB
Progress (4): 0.5/1.6 MB | 237/582 kB | 36 kB | 40/132 kB
Progress (4): 0.5/1.6 MB | 237/582 kB | 36 kB | 57/132 kB
Progress (4): 0.5/1.6 MB | 253/582 kB | 36 kB | 57/132 kB
Progress (4): 0.5/1.6 MB | 253/582 kB | 36 kB | 73/132 kB
Progress (4): 0.5/1.6 MB | 253/582 kB | 36 kB | 90/132 kB
Progress (4): 0.5/1.6 MB | 253/582 kB | 36 kB | 106/132 kB
Progress (4): 0.5/1.6 MB | 253/582 kB | 36 kB | 122/132 kB
Progress (4): 0.5/1.6 MB | 253/582 kB | 36 kB | 122/132 kB
Progress (4): 0.5/1.6 MB | 253/582 kB | 36 kB | 132 kB    
Progress (4): 0.5/1.6 MB | 253/582 kB | 36 kB | 132 kB
Progress (4): 0.5/1.6 MB | 270/582 kB | 36 kB | 132 kB
Progress (4): 0.5/1.6 MB | 270/582 kB | 36 kB | 132 kB
Progress (4): 0.5/1.6 MB | 286/582 kB | 36 kB | 132 kB
Progress (4): 0.5/1.6 MB | 303/582 kB | 36 kB | 132 kB
Progress (5): 0.5/1.6 MB | 303/582 kB | 36 kB | 132 kB | 7.7/10 kB
Progress (5): 0.5/1.6 MB | 303/582 kB | 36 kB | 132 kB | 10 kB    
Progress (5): 0.5/1.6 MB | 303/582 kB | 36 kB | 132 kB | 10 kB
Progress (5): 0.5/1.6 MB | 319/582 kB | 36 kB | 132 kB | 10 kB
Progress (5): 0.5/1.6 MB | 319/582 kB | 36 kB | 132 kB | 10 kB
Progress (5): 0.5/1.6 MB | 335/582 kB | 36 kB | 132 kB | 10 kB
Progress (5): 0.6/1.6 MB | 335/582 kB | 36 kB | 132 kB | 10 kB
                                                              
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.17.2/jackson-datatype-jsr310-2.17.2.jar (132 kB at 135 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-tomcat/3.3.4/spring-boot-starter-tomcat-3.3.4.jar
Progress (4): 0.6/1.6 MB | 352/582 kB | 36 kB | 10 kB
Progress (4): 0.6/1.6 MB | 352/582 kB | 36 kB | 10 kB
Progress (4): 0.6/1.6 MB | 368/582 kB | 36 kB | 10 kB
Progress (4): 0.6/1.6 MB | 368/582 kB | 36 kB | 10 kB
Progress (4): 0.6/1.6 MB | 368/582 kB | 36 kB | 10 kB
Progress (4): 0.6/1.6 MB | 385/582 kB | 36 kB | 10 kB
Progress (4): 0.6/1.6 MB | 401/582 kB | 36 kB | 10 kB
Progress (4): 0.6/1.6 MB | 401/582 kB | 36 kB | 10 kB
Progress (4): 0.6/1.6 MB | 417/582 kB | 36 kB | 10 kB
Progress (4): 0.6/1.6 MB | 417/582 kB | 36 kB | 10 kB
Progress (4): 0.6/1.6 MB | 434/582 kB | 36 kB | 10 kB
Progress (4): 0.7/1.6 MB | 434/582 kB | 36 kB | 10 kB
Progress (4): 0.7/1.6 MB | 450/582 kB | 36 kB | 10 kB
Progress (4): 0.7/1.6 MB | 450/582 kB | 36 kB | 10 kB
Progress (4): 0.7/1.6 MB | 466/582 kB | 36 kB | 10 kB
Progress (4): 0.7/1.6 MB | 466/582 kB | 36 kB | 10 kB
Progress (4): 0.7/1.6 MB | 483/582 kB | 36 kB | 10 kB
Progress (4): 0.7/1.6 MB | 499/582 kB | 36 kB | 10 kB
Progress (4): 0.7/1.6 MB | 499/582 kB | 36 kB | 10 kB
Progress (5): 0.7/1.6 MB | 499/582 kB | 36 kB | 10 kB | 4.8 kB
Progress (5): 0.7/1.6 MB | 516/582 kB | 36 kB | 10 kB | 4.8 kB
Progress (5): 0.7/1.6 MB | 516/582 kB | 36 kB | 10 kB | 4.8 kB
Progress (5): 0.7/1.6 MB | 532/582 kB | 36 kB | 10 kB | 4.8 kB
Progress (5): 0.7/1.6 MB | 532/582 kB | 36 kB | 10 kB | 4.8 kB
Progress (5): 0.8/1.6 MB | 532/582 kB | 36 kB | 10 kB | 4.8 kB
Progress (5): 0.8/1.6 MB | 548/582 kB | 36 kB | 10 kB | 4.8 kB
Progress (5): 0.8/1.6 MB | 548/582 kB | 36 kB | 10 kB | 4.8 kB
Progress (5): 0.8/1.6 MB | 565/582 kB | 36 kB | 10 kB | 4.8 kB
Progress (5): 0.8/1.6 MB | 581/582 kB | 36 kB | 10 kB | 4.8 kB
Progress (5): 0.8/1.6 MB | 582 kB | 36 kB | 10 kB | 4.8 kB    
Progress (5): 0.8/1.6 MB | 582 kB | 36 kB | 10 kB | 4.8 kB
Progress (5): 0.8/1.6 MB | 582 kB | 36 kB | 10 kB | 4.8 kB
Progress (5): 0.8/1.6 MB | 582 kB | 36 kB | 10 kB | 4.8 kB
Progress (5): 0.8/1.6 MB | 582 kB | 36 kB | 10 kB | 4.8 kB
Progress (5): 0.9/1.6 MB | 582 kB | 36 kB | 10 kB | 4.8 kB
                                                          
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-tomcat/3.3.4/spring-boot-starter-tomcat-3.3.4.jar (4.8 kB at 4.5 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-core/10.1.30/tomcat-embed-core-10.1.30.jar
Progress (4): 0.9/1.6 MB | 582 kB | 36 kB | 10 kB
                                                 
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-core/2.17.2/jackson-core-2.17.2.jar (582 kB at 541 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-websocket/10.1.30/tomcat-embed-websocket-10.1.30.jar
Progress (3): 0.9/1.6 MB | 36 kB | 10 kB
Progress (3): 0.9/1.6 MB | 36 kB | 10 kB
Progress (3): 0.9/1.6 MB | 36 kB | 10 kB
Progress (3): 0.9/1.6 MB | 36 kB | 10 kB
Progress (3): 1.0/1.6 MB | 36 kB | 10 kB
Progress (3): 1.0/1.6 MB | 36 kB | 10 kB
Progress (4): 1.0/1.6 MB | 36 kB | 10 kB | 7.7/282 kB
Progress (4): 1.0/1.6 MB | 36 kB | 10 kB | 7.7/282 kB
Progress (4): 1.0/1.6 MB | 36 kB | 10 kB | 24/282 kB 
Progress (4): 1.0/1.6 MB | 36 kB | 10 kB | 40/282 kB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 40/282 kB | 0/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 40/282 kB | 0/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 40/282 kB | 0/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 40/282 kB | 0/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 57/282 kB | 0/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 57/282 kB | 0/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 73/282 kB | 0/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 90/282 kB | 0/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 106/282 kB | 0/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 122/282 kB | 0/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 131/282 kB | 0/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 131/282 kB | 0.1/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 147/282 kB | 0.1/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 147/282 kB | 0.1/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 164/282 kB | 0.1/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 180/282 kB | 0.1/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 197/282 kB | 0.1/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 213/282 kB | 0.1/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 213/282 kB | 0.1/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 213/282 kB | 0.1/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 213/282 kB | 0.1/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 213/282 kB | 0.1/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 229/282 kB | 0.1/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 246/282 kB | 0.1/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 262/282 kB | 0.1/3.6 MB
Progress (5): 1.0/1.6 MB | 36 kB | 10 kB | 262/282 kB | 0.1/3.6 MB
Progress (5): 1.1/1.6 MB | 36 kB | 10 kB | 262/282 kB | 0.1/3.6 MB
Progress (5): 1.1/1.6 MB | 36 kB | 10 kB | 279/282 kB | 0.1/3.6 MB
Progress (5): 1.1/1.6 MB | 36 kB | 10 kB | 279/282 kB | 0.1/3.6 MB
Progress (5): 1.1/1.6 MB | 36 kB | 10 kB | 282 kB | 0.1/3.6 MB    
Progress (5): 1.1/1.6 MB | 36 kB | 10 kB | 282 kB | 0.1/3.6 MB
Progress (5): 1.1/1.6 MB | 36 kB | 10 kB | 282 kB | 0.1/3.6 MB
Progress (5): 1.1/1.6 MB | 36 kB | 10 kB | 282 kB | 0.1/3.6 MB
Progress (5): 1.1/1.6 MB | 36 kB | 10 kB | 282 kB | 0.1/3.6 MB
Progress (5): 1.1/1.6 MB | 36 kB | 10 kB | 282 kB | 0.1/3.6 MB
Progress (5): 1.1/1.6 MB | 36 kB | 10 kB | 282 kB | 0.2/3.6 MB
Progress (5): 1.1/1.6 MB | 36 kB | 10 kB | 282 kB | 0.2/3.6 MB
Progress (5): 1.1/1.6 MB | 36 kB | 10 kB | 282 kB | 0.2/3.6 MB
Progress (5): 1.1/1.6 MB | 36 kB | 10 kB | 282 kB | 0.2/3.6 MB
Progress (5): 1.1/1.6 MB | 36 kB | 10 kB | 282 kB | 0.2/3.6 MB
                                                              
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-websocket/10.1.30/tomcat-embed-websocket-10.1.30.jar (282 kB at 240 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-web/6.1.13/spring-web-6.1.13.jar
Progress (4): 1.1/1.6 MB | 36 kB | 10 kB | 0.2/3.6 MB
Progress (4): 1.2/1.6 MB | 36 kB | 10 kB | 0.2/3.6 MB
Progress (4): 1.2/1.6 MB | 36 kB | 10 kB | 0.2/3.6 MB
Progress (4): 1.2/1.6 MB | 36 kB | 10 kB | 0.2/3.6 MB
Progress (4): 1.2/1.6 MB | 36 kB | 10 kB | 0.2/3.6 MB
Progress (4): 1.2/1.6 MB | 36 kB | 10 kB | 0.2/3.6 MB
Progress (4): 1.2/1.6 MB | 36 kB | 10 kB | 0.2/3.6 MB
Progress (4): 1.2/1.6 MB | 36 kB | 10 kB | 0.2/3.6 MB
Progress (4): 1.2/1.6 MB | 36 kB | 10 kB | 0.2/3.6 MB
Progress (4): 1.2/1.6 MB | 36 kB | 10 kB | 0.2/3.6 MB
Progress (4): 1.2/1.6 MB | 36 kB | 10 kB | 0.2/3.6 MB
Progress (4): 1.2/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB
Progress (4): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB
Progress (4): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB
Progress (4): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB
Progress (4): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB
Progress (4): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB
Progress (5): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB | 0/1.9 MB
Progress (5): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB | 0/1.9 MB
Progress (5): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB | 0/1.9 MB
Progress (5): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB | 0/1.9 MB
Progress (5): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB | 0.1/1.9 MB
Progress (5): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB | 0.1/1.9 MB
Progress (5): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB | 0.1/1.9 MB
Progress (5): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB | 0.1/1.9 MB
Progress (5): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB | 0.1/1.9 MB
Progress (5): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB | 0.1/1.9 MB
Progress (5): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB | 0.1/1.9 MB
Progress (5): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB | 0.1/1.9 MB
Progress (5): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB | 0.1/1.9 MB
Progress (5): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB | 0.2/1.9 MB
Progress (5): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB | 0.2/1.9 MB
Progress (5): 1.3/1.6 MB | 36 kB | 10 kB | 0.3/3.6 MB | 0.2/1.9 MB
                                                                  
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/module/jackson-module-parameter-names/2.17.2/jackson-module-parameter-names-2.17.2.jar (10 kB at 8.3 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-beans/6.1.13/spring-beans-6.1.13.jar
Progress (4): 1.3/1.6 MB | 36 kB | 0.3/3.6 MB | 0.2/1.9 MB
Progress (4): 1.3/1.6 MB | 36 kB | 0.3/3.6 MB | 0.2/1.9 MB
Progress (4): 1.3/1.6 MB | 36 kB | 0.3/3.6 MB | 0.2/1.9 MB
Progress (4): 1.3/1.6 MB | 36 kB | 0.3/3.6 MB | 0.2/1.9 MB
Progress (4): 1.3/1.6 MB | 36 kB | 0.3/3.6 MB | 0.2/1.9 MB
Progress (4): 1.3/1.6 MB | 36 kB | 0.3/3.6 MB | 0.2/1.9 MB
Progress (4): 1.3/1.6 MB | 36 kB | 0.3/3.6 MB | 0.2/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.3/3.6 MB | 0.2/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.2/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.3/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.3/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.3/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.3/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.3/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.3/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.3/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.3/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.3/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.3/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.3/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.3/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.3/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.3/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.3/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.4/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.4/1.9 MB

Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.4/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.4/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.4/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.4/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.4/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.4/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.5/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.4/3.6 MB | 0.5/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.5/3.6 MB | 0.5/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.5/3.6 MB | 0.5/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.5/3.6 MB | 0.5/1.9 MB
Progress (4): 1.4/1.6 MB | 36 kB | 0.5/3.6 MB | 0.5/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.5/3.6 MB | 0.5/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.5/3.6 MB | 0.5/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.5/3.6 MB | 0.5/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.5/3.6 MB | 0.5/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.5/3.6 MB | 0.5/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.5/3.6 MB | 0.5/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.5/3.6 MB | 0.5/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.5/3.6 MB | 0.5/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.5/3.6 MB | 0.6/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.5/3.6 MB | 0.6/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.5/3.6 MB | 0.6/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.5/3.6 MB | 0.6/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.5/3.6 MB | 0.6/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.5/3.6 MB | 0.6/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.5/3.6 MB | 0.6/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB
Progress (4): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB | 7.7/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB | 7.7/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB | 24/862 kB 
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB | 40/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB | 57/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB | 73/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB | 90/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB | 106/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB | 122/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB | 139/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB | 155/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB | 172/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB | 188/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB | 204/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB | 221/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.6/1.9 MB | 233/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.7/1.9 MB | 233/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.7/1.9 MB | 250/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.7/1.9 MB | 266/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.7/1.9 MB | 266/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.7/1.9 MB | 266/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.7/1.9 MB | 266/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.7/1.9 MB | 266/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.7/1.9 MB | 266/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.7/1.9 MB | 266/862 kB
Progress (5): 1.5/1.6 MB | 36 kB | 0.6/3.6 MB | 0.7/1.9 MB | 266/862 kB
Progress (5): 1.6/1.6 MB | 36 kB | 0.6/3.6 MB | 0.7/1.9 MB | 266/862 kB
Progress (5): 1.6/1.6 MB | 36 kB | 0.6/3.6 MB | 0.7/1.9 MB | 266/862 kB
Progress (5): 1.6/1.6 MB | 36 kB | 0.6/3.6 MB | 0.8/1.9 MB | 266/862 kB
Progress (5): 1.6/1.6 MB | 36 kB | 0.6/3.6 MB | 0.8/1.9 MB | 266/862 kB
Progress (5): 1.6/1.6 MB | 36 kB | 0.6/3.6 MB | 0.8/1.9 MB | 266/862 kB
Progress (5): 1.6/1.6 MB | 36 kB | 0.6/3.6 MB | 0.8/1.9 MB | 266/862 kB
Progress (5): 1.6/1.6 MB | 36 kB | 0.6/3.6 MB | 0.8/1.9 MB | 266/862 kB
Progress (5): 1.6/1.6 MB | 36 kB | 0.6/3.6 MB | 0.8/1.9 MB | 266/862 kB
Progress (5): 1.6/1.6 MB | 36 kB | 0.6/3.6 MB | 0.8/1.9 MB | 266/862 kB
Progress (5): 1.6/1.6 MB | 36 kB | 0.6/3.6 MB | 0.8/1.9 MB | 266/862 kB
Progress (5): 1.6/1.6 MB | 36 kB | 0.6/3.6 MB | 0.8/1.9 MB | 266/862 kB
Progress (5): 1.6/1.6 MB | 36 kB | 0.6/3.6 MB | 0.8/1.9 MB | 266/862 kB
Progress (5): 1.6/1.6 MB | 36 kB | 0.6/3.6 MB | 0.8/1.9 MB | 266/862 kB
Progress (5): 1.6/1.6 MB | 36 kB | 0.6/3.6 MB | 0.8/1.9 MB | 266/862 kB
Progress (5): 1.6/1.6 MB | 36 kB | 0.7/3.6 MB | 0.8/1.9 MB | 266/862 kB
Progress (5): 1.6/1.6 MB | 36 kB | 0.7/3.6 MB | 0.8/1.9 MB | 266/862 kB
Progress (5): 1.6/1.6 MB | 36 kB | 0.7/3.6 MB | 0.9/1.9 MB | 266/862 kB
Progress (5): 1.6 MB | 36 kB | 0.7/3.6 MB | 0.9/1.9 MB | 266/862 kB    
Progress (5): 1.6 MB | 36 kB | 0.7/3.6 MB | 0.9/1.9 MB | 266/862 kB
Progress (5): 1.6 MB | 36 kB | 0.7/3.6 MB | 0.9/1.9 MB | 266/862 kB
Progress (5): 1.6 MB | 36 kB | 0.7/3.6 MB | 0.9/1.9 MB | 266/862 kB
                                                                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.17.2/jackson-datatype-jdk8-2.17.2.jar (36 kB at 24 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.13.4/micrometer-observation-1.13.4.jar
Progress (4): 1.6 MB | 0.7/3.6 MB | 0.9/1.9 MB | 282/862 kB
Progress (4): 1.6 MB | 0.7/3.6 MB | 0.9/1.9 MB | 282/862 kB
Progress (4): 1.6 MB | 0.7/3.6 MB | 0.9/1.9 MB | 299/862 kB
Progress (4): 1.6 MB | 0.7/3.6 MB | 0.9/1.9 MB | 315/862 kB
Progress (4): 1.6 MB | 0.7/3.6 MB | 0.9/1.9 MB | 331/862 kB
Progress (4): 1.6 MB | 0.7/3.6 MB | 0.9/1.9 MB | 348/862 kB
Progress (4): 1.6 MB | 0.7/3.6 MB | 0.9/1.9 MB | 364/862 kB
                                                           
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/jackson/core/jackson-databind/2.17.2/jackson-databind-2.17.2.jar (1.6 MB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.13.4/micrometer-commons-1.13.4.jar
Progress (3): 0.7/3.6 MB | 0.9/1.9 MB | 381/862 kB
Progress (3): 0.7/3.6 MB | 0.9/1.9 MB | 397/862 kB
Progress (3): 0.7/3.6 MB | 0.9/1.9 MB | 413/862 kB
Progress (3): 0.7/3.6 MB | 0.9/1.9 MB | 430/862 kB
Progress (3): 0.7/3.6 MB | 0.9/1.9 MB | 446/862 kB
Progress (3): 0.7/3.6 MB | 0.9/1.9 MB | 463/862 kB
Progress (3): 0.7/3.6 MB | 0.9/1.9 MB | 479/862 kB
Progress (3): 0.7/3.6 MB | 0.9/1.9 MB | 495/862 kB
Progress (3): 0.7/3.6 MB | 0.9/1.9 MB | 512/862 kB
Progress (3): 0.7/3.6 MB | 0.9/1.9 MB | 512/862 kB
Progress (3): 0.7/3.6 MB | 0.9/1.9 MB | 528/862 kB
Progress (3): 0.7/3.6 MB | 0.9/1.9 MB | 544/862 kB
Progress (3): 0.7/3.6 MB | 0.9/1.9 MB | 561/862 kB
Progress (3): 0.7/3.6 MB | 0.9/1.9 MB | 561/862 kB
Progress (3): 0.7/3.6 MB | 0.9/1.9 MB | 561/862 kB
Progress (3): 0.7/3.6 MB | 0.9/1.9 MB | 561/862 kB
Progress (3): 0.7/3.6 MB | 0.9/1.9 MB | 561/862 kB
Progress (3): 0.7/3.6 MB | 1.0/1.9 MB | 561/862 kB
Progress (3): 0.7/3.6 MB | 1.0/1.9 MB | 561/862 kB
Progress (3): 0.7/3.6 MB | 1.0/1.9 MB | 561/862 kB
Progress (3): 0.7/3.6 MB | 1.0/1.9 MB | 561/862 kB
Progress (3): 0.7/3.6 MB | 1.0/1.9 MB | 561/862 kB
Progress (3): 0.7/3.6 MB | 1.0/1.9 MB | 561/862 kB
Progress (3): 0.7/3.6 MB | 1.0/1.9 MB | 561/862 kB
Progress (3): 0.7/3.6 MB | 1.0/1.9 MB | 561/862 kB
Progress (3): 0.8/3.6 MB | 1.0/1.9 MB | 561/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 561/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 561/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 561/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 561/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 561/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 561/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 561/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 561/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 577/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 594/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 594/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 610/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 626/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 643/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 659/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 676/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 692/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 692/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 708/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 725/862 kB
Progress (3): 0.8/3.6 MB | 1.1/1.9 MB | 741/862 kB
Progress (4): 0.8/3.6 MB | 1.1/1.9 MB | 741/862 kB | 7.7/72 kB
Progress (4): 0.8/3.6 MB | 1.1/1.9 MB | 741/862 kB | 16/72 kB 
Progress (4): 0.8/3.6 MB | 1.1/1.9 MB | 741/862 kB | 24/72 kB
Progress (4): 0.8/3.6 MB | 1.1/1.9 MB | 757/862 kB | 24/72 kB
Progress (4): 0.8/3.6 MB | 1.1/1.9 MB | 774/862 kB | 24/72 kB
Progress (4): 0.8/3.6 MB | 1.1/1.9 MB | 790/862 kB | 24/72 kB
Progress (4): 0.8/3.6 MB | 1.1/1.9 MB | 807/862 kB | 24/72 kB
Progress (4): 0.8/3.6 MB | 1.1/1.9 MB | 807/862 kB | 40/72 kB
Progress (4): 0.8/3.6 MB | 1.1/1.9 MB | 807/862 kB | 40/72 kB
Progress (4): 0.8/3.6 MB | 1.2/1.9 MB | 807/862 kB | 40/72 kB
Progress (4): 0.8/3.6 MB | 1.2/1.9 MB | 807/862 kB | 57/72 kB
Progress (4): 0.8/3.6 MB | 1.2/1.9 MB | 823/862 kB | 57/72 kB
Progress (4): 0.8/3.6 MB | 1.2/1.9 MB | 839/862 kB | 57/72 kB
Progress (4): 0.8/3.6 MB | 1.2/1.9 MB | 839/862 kB | 72 kB   
Progress (4): 0.8/3.6 MB | 1.2/1.9 MB | 839/862 kB | 72 kB
Progress (4): 0.8/3.6 MB | 1.2/1.9 MB | 839/862 kB | 72 kB
Progress (4): 0.8/3.6 MB | 1.2/1.9 MB | 839/862 kB | 72 kB
Progress (5): 0.8/3.6 MB | 1.2/1.9 MB | 839/862 kB | 72 kB | 7.7/48 kB
Progress (5): 0.8/3.6 MB | 1.2/1.9 MB | 839/862 kB | 72 kB | 7.7/48 kB
Progress (5): 0.8/3.6 MB | 1.2/1.9 MB | 839/862 kB | 72 kB | 24/48 kB 
Progress (5): 0.8/3.6 MB | 1.2/1.9 MB | 839/862 kB | 72 kB | 40/48 kB
Progress (5): 0.8/3.6 MB | 1.2/1.9 MB | 839/862 kB | 72 kB | 48 kB   
Progress (5): 0.8/3.6 MB | 1.2/1.9 MB | 839/862 kB | 72 kB | 48 kB
Progress (5): 0.8/3.6 MB | 1.2/1.9 MB | 839/862 kB | 72 kB | 48 kB
Progress (5): 0.9/3.6 MB | 1.2/1.9 MB | 839/862 kB | 72 kB | 48 kB
Progress (5): 0.9/3.6 MB | 1.2/1.9 MB | 839/862 kB | 72 kB | 48 kB
Progress (5): 0.9/3.6 MB | 1.3/1.9 MB | 839/862 kB | 72 kB | 48 kB
Progress (5): 0.9/3.6 MB | 1.3/1.9 MB | 839/862 kB | 72 kB | 48 kB
Progress (5): 0.9/3.6 MB | 1.3/1.9 MB | 839/862 kB | 72 kB | 48 kB
                                                                  
Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-observation/1.13.4/micrometer-observation-1.13.4.jar (72 kB at 43 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-webmvc/6.1.13/spring-webmvc-6.1.13.jar
Progress (4): 0.9/3.6 MB | 1.3/1.9 MB | 839/862 kB | 48 kB
Progress (4): 0.9/3.6 MB | 1.3/1.9 MB | 839/862 kB | 48 kB
Progress (4): 0.9/3.6 MB | 1.3/1.9 MB | 839/862 kB | 48 kB
Progress (4): 0.9/3.6 MB | 1.3/1.9 MB | 839/862 kB | 48 kB
Progress (4): 0.9/3.6 MB | 1.3/1.9 MB | 839/862 kB | 48 kB
Progress (4): 0.9/3.6 MB | 1.3/1.9 MB | 839/862 kB | 48 kB
Progress (4): 0.9/3.6 MB | 1.3/1.9 MB | 856/862 kB | 48 kB
Progress (4): 0.9/3.6 MB | 1.3/1.9 MB | 856/862 kB | 48 kB
Progress (4): 0.9/3.6 MB | 1.3/1.9 MB | 862 kB | 48 kB    
Progress (4): 0.9/3.6 MB | 1.4/1.9 MB | 862 kB | 48 kB
Progress (4): 0.9/3.6 MB | 1.4/1.9 MB | 862 kB | 48 kB
Progress (4): 0.9/3.6 MB | 1.4/1.9 MB | 862 kB | 48 kB
Progress (4): 1.0/3.6 MB | 1.4/1.9 MB | 862 kB | 48 kB
Progress (4): 1.0/3.6 MB | 1.4/1.9 MB | 862 kB | 48 kB
Progress (4): 1.0/3.6 MB | 1.4/1.9 MB | 862 kB | 48 kB
Progress (4): 1.0/3.6 MB | 1.4/1.9 MB | 862 kB | 48 kB
Progress (4): 1.0/3.6 MB | 1.4/1.9 MB | 862 kB | 48 kB
Progress (4): 1.0/3.6 MB | 1.5/1.9 MB | 862 kB | 48 kB
Progress (4): 1.0/3.6 MB | 1.5/1.9 MB | 862 kB | 48 kB
Progress (4): 1.0/3.6 MB | 1.5/1.9 MB | 862 kB | 48 kB
Progress (4): 1.0/3.6 MB | 1.5/1.9 MB | 862 kB | 48 kB
                                                      
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-beans/6.1.13/spring-beans-6.1.13.jar (862 kB at 496 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aop/6.1.13/spring-aop-6.1.13.jar
Progress (3): 1.0/3.6 MB | 1.5/1.9 MB | 48 kB
Progress (3): 1.0/3.6 MB | 1.5/1.9 MB | 48 kB
Progress (3): 1.0/3.6 MB | 1.5/1.9 MB | 48 kB
Progress (3): 1.0/3.6 MB | 1.5/1.9 MB | 48 kB
Progress (3): 1.0/3.6 MB | 1.5/1.9 MB | 48 kB
Progress (3): 1.0/3.6 MB | 1.5/1.9 MB | 48 kB
Progress (3): 1.0/3.6 MB | 1.5/1.9 MB | 48 kB
Progress (3): 1.0/3.6 MB | 1.6/1.9 MB | 48 kB
Progress (3): 1.0/3.6 MB | 1.6/1.9 MB | 48 kB
Progress (4): 1.0/3.6 MB | 1.6/1.9 MB | 48 kB | 0/1.0 MB
Progress (4): 1.0/3.6 MB | 1.6/1.9 MB | 48 kB | 0/1.0 MB
Progress (4): 1.0/3.6 MB | 1.6/1.9 MB | 48 kB | 0/1.0 MB
Progress (4): 1.0/3.6 MB | 1.6/1.9 MB | 48 kB | 0/1.0 MB
Progress (4): 1.0/3.6 MB | 1.6/1.9 MB | 48 kB | 0/1.0 MB
Progress (4): 1.1/3.6 MB | 1.6/1.9 MB | 48 kB | 0/1.0 MB
Progress (4): 1.1/3.6 MB | 1.6/1.9 MB | 48 kB | 0/1.0 MB
Progress (4): 1.1/3.6 MB | 1.6/1.9 MB | 48 kB | 0.1/1.0 MB
Progress (4): 1.1/3.6 MB | 1.6/1.9 MB | 48 kB | 0.1/1.0 MB
Progress (4): 1.1/3.6 MB | 1.6/1.9 MB | 48 kB | 0.1/1.0 MB
Progress (4): 1.1/3.6 MB | 1.6/1.9 MB | 48 kB | 0.1/1.0 MB
Progress (4): 1.1/3.6 MB | 1.6/1.9 MB | 48 kB | 0.1/1.0 MB
Progress (4): 1.1/3.6 MB | 1.6/1.9 MB | 48 kB | 0.1/1.0 MB
Progress (4): 1.1/3.6 MB | 1.6/1.9 MB | 48 kB | 0.1/1.0 MB
Progress (4): 1.1/3.6 MB | 1.6/1.9 MB | 48 kB | 0.1/1.0 MB
Progress (4): 1.1/3.6 MB | 1.6/1.9 MB | 48 kB | 0.1/1.0 MB
Progress (4): 1.1/3.6 MB | 1.6/1.9 MB | 48 kB | 0.1/1.0 MB
Progress (4): 1.1/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB
Progress (4): 1.1/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB
Progress (4): 1.1/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB
Progress (4): 1.1/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB
Progress (4): 1.1/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB
Progress (4): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB
Progress (4): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB
Progress (4): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB
Progress (4): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 3.2/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 11/417 kB 
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 28/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 44/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 61/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 61/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 77/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 93/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 110/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 126/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 142/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 142/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 159/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 175/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 192/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 192/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 208/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 224/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 228/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 245/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 257/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 257/417 kB
Progress (5): 1.2/3.6 MB | 1.7/1.9 MB | 48 kB | 0.1/1.0 MB | 274/417 kB
Progress (5): 1.2/3.6 MB | 1.8/1.9 MB | 48 kB | 0.1/1.0 MB | 274/417 kB
Progress (5): 1.2/3.6 MB | 1.8/1.9 MB | 48 kB | 0.1/1.0 MB | 274/417 kB
Progress (5): 1.2/3.6 MB | 1.8/1.9 MB | 48 kB | 0.2/1.0 MB | 274/417 kB
Progress (5): 1.2/3.6 MB | 1.8/1.9 MB | 48 kB | 0.2/1.0 MB | 274/417 kB
Progress (5): 1.2/3.6 MB | 1.8/1.9 MB | 48 kB | 0.2/1.0 MB | 274/417 kB
Progress (5): 1.2/3.6 MB | 1.8/1.9 MB | 48 kB | 0.2/1.0 MB | 274/417 kB
Progress (5): 1.2/3.6 MB | 1.8/1.9 MB | 48 kB | 0.2/1.0 MB | 274/417 kB
Progress (5): 1.2/3.6 MB | 1.8/1.9 MB | 48 kB | 0.2/1.0 MB | 274/417 kB
Progress (5): 1.2/3.6 MB | 1.8/1.9 MB | 48 kB | 0.2/1.0 MB | 274/417 kB
Progress (5): 1.2/3.6 MB | 1.8/1.9 MB | 48 kB | 0.2/1.0 MB | 274/417 kB
Progress (5): 1.2/3.6 MB | 1.8/1.9 MB | 48 kB | 0.2/1.0 MB | 274/417 kB
Progress (5): 1.2/3.6 MB | 1.9/1.9 MB | 48 kB | 0.2/1.0 MB | 274/417 kB
Progress (5): 1.2/3.6 MB | 1.9/1.9 MB | 48 kB | 0.2/1.0 MB | 274/417 kB
Progress (5): 1.2/3.6 MB | 1.9/1.9 MB | 48 kB | 0.2/1.0 MB | 274/417 kB
Progress (5): 1.2/3.6 MB | 1.9/1.9 MB | 48 kB | 0.2/1.0 MB | 274/417 kB
Progress (5): 1.2/3.6 MB | 1.9/1.9 MB | 48 kB | 0.2/1.0 MB | 290/417 kB
Progress (5): 1.3/3.6 MB | 1.9/1.9 MB | 48 kB | 0.2/1.0 MB | 290/417 kB
Progress (5): 1.3/3.6 MB | 1.9/1.9 MB | 48 kB | 0.2/1.0 MB | 306/417 kB
Progress (5): 1.3/3.6 MB | 1.9/1.9 MB | 48 kB | 0.2/1.0 MB | 323/417 kB
Progress (5): 1.3/3.6 MB | 1.9/1.9 MB | 48 kB | 0.2/1.0 MB | 323/417 kB
Progress (5): 1.3/3.6 MB | 1.9/1.9 MB | 48 kB | 0.2/1.0 MB | 323/417 kB
Progress (5): 1.3/3.6 MB | 1.9/1.9 MB | 48 kB | 0.2/1.0 MB | 323/417 kB
Progress (5): 1.3/3.6 MB | 1.9/1.9 MB | 48 kB | 0.2/1.0 MB | 339/417 kB
Progress (5): 1.3/3.6 MB | 1.9/1.9 MB | 48 kB | 0.2/1.0 MB | 339/417 kB
Progress (5): 1.3/3.6 MB | 1.9/1.9 MB | 48 kB | 0.2/1.0 MB | 344/417 kB
Progress (5): 1.3/3.6 MB | 1.9/1.9 MB | 48 kB | 0.2/1.0 MB | 344/417 kB
Progress (5): 1.3/3.6 MB | 1.9 MB | 48 kB | 0.2/1.0 MB | 344/417 kB    
Progress (5): 1.3/3.6 MB | 1.9 MB | 48 kB | 0.2/1.0 MB | 360/417 kB
Progress (5): 1.3/3.6 MB | 1.9 MB | 48 kB | 0.2/1.0 MB | 377/417 kB
Progress (5): 1.3/3.6 MB | 1.9 MB | 48 kB | 0.2/1.0 MB | 393/417 kB
Progress (5): 1.3/3.6 MB | 1.9 MB | 48 kB | 0.2/1.0 MB | 410/417 kB
Progress (5): 1.3/3.6 MB | 1.9 MB | 48 kB | 0.2/1.0 MB | 417 kB    
Progress (5): 1.3/3.6 MB | 1.9 MB | 48 kB | 0.2/1.0 MB | 417 kB
Progress (5): 1.3/3.6 MB | 1.9 MB | 48 kB | 0.2/1.0 MB | 417 kB
Progress (5): 1.3/3.6 MB | 1.9 MB | 48 kB | 0.2/1.0 MB | 417 kB
Progress (5): 1.3/3.6 MB | 1.9 MB | 48 kB | 0.3/1.0 MB | 417 kB
Progress (5): 1.3/3.6 MB | 1.9 MB | 48 kB | 0.3/1.0 MB | 417 kB
Progress (5): 1.3/3.6 MB | 1.9 MB | 48 kB | 0.3/1.0 MB | 417 kB
                                                               
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-web/6.1.13/spring-web-6.1.13.jar (1.9 MB at 972 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context/6.1.13/spring-context-6.1.13.jar
Progress (4): 1.3/3.6 MB | 48 kB | 0.3/1.0 MB | 417 kB
Progress (4): 1.3/3.6 MB | 48 kB | 0.3/1.0 MB | 417 kB
Progress (4): 1.3/3.6 MB | 48 kB | 0.3/1.0 MB | 417 kB
Progress (4): 1.4/3.6 MB | 48 kB | 0.3/1.0 MB | 417 kB
                                                      
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aop/6.1.13/spring-aop-6.1.13.jar (417 kB at 212 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-expression/6.1.13/spring-expression-6.1.13.jar
Progress (3): 1.4/3.6 MB | 48 kB | 0.3/1.0 MB
Progress (3): 1.4/3.6 MB | 48 kB | 0.3/1.0 MB
Progress (3): 1.4/3.6 MB | 48 kB | 0.3/1.0 MB
Progress (3): 1.4/3.6 MB | 48 kB | 0.3/1.0 MB
Progress (3): 1.4/3.6 MB | 48 kB | 0.4/1.0 MB
Progress (3): 1.4/3.6 MB | 48 kB | 0.4/1.0 MB
Progress (3): 1.4/3.6 MB | 48 kB | 0.4/1.0 MB
Progress (3): 1.4/3.6 MB | 48 kB | 0.4/1.0 MB
Progress (3): 1.4/3.6 MB | 48 kB | 0.4/1.0 MB
Progress (3): 1.4/3.6 MB | 48 kB | 0.4/1.0 MB
Progress (3): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB
Progress (3): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0.1/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0.1/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0.1/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0.1/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0.1/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0.1/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0.2/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0.2/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0.2/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0.2/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0.2/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0.2/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0.2/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0.3/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.4/1.0 MB | 0.3/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.3/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.3/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.3/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.3/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.3/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.3/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.3/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.4/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.4/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.4/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.4/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.4/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.4/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.4/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.5/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.5/1.3 MB
Progress (4): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.5/1.3 MB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.5/1.3 MB | 7.7/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.5/1.3 MB | 12/304 kB 
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.5/1.3 MB | 12/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.5/1.3 MB | 12/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.5/1.3 MB | 12/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.5/1.3 MB | 12/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.5/1.3 MB | 12/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.5/1.3 MB | 29/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.5/1.3 MB | 29/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.5/1.3 MB | 45/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.5/1.3 MB | 61/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.5/1.3 MB | 66/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.5/1.3 MB | 82/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.5/1.3 MB | 98/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.5/1.3 MB | 98/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.6/1.3 MB | 98/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.6/1.3 MB | 98/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.6/1.3 MB | 98/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.6/1.3 MB | 115/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.6/1.3 MB | 131/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.6/1.3 MB | 147/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.6/1.3 MB | 147/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.6/1.3 MB | 164/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.6/1.3 MB | 164/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.6/1.3 MB | 164/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.6/1.3 MB | 180/304 kB
Progress (5): 1.5/3.6 MB | 48 kB | 0.5/1.0 MB | 0.6/1.3 MB | 197/304 kB
Progress (5): 1.6/3.6 MB | 48 kB | 0.5/1.0 MB | 0.6/1.3 MB | 197/304 kB
Progress (5): 1.6/3.6 MB | 48 kB | 0.5/1.0 MB | 0.6/1.3 MB | 213/304 kB
Progress (5): 1.6/3.6 MB | 48 kB | 0.5/1.0 MB | 0.6/1.3 MB | 213/304 kB
Progress (5): 1.6/3.6 MB | 48 kB | 0.5/1.0 MB | 0.6/1.3 MB | 213/304 kB
Progress (5): 1.6/3.6 MB | 48 kB | 0.5/1.0 MB | 0.6/1.3 MB | 213/304 kB
Progress (5): 1.6/3.6 MB | 48 kB | 0.6/1.0 MB | 0.6/1.3 MB | 213/304 kB
Progress (5): 1.6/3.6 MB | 48 kB | 0.6/1.0 MB | 0.6/1.3 MB | 213/304 kB
Progress (5): 1.6/3.6 MB | 48 kB | 0.6/1.0 MB | 0.6/1.3 MB | 229/304 kB
Progress (5): 1.6/3.6 MB | 48 kB | 0.6/1.0 MB | 0.6/1.3 MB | 229/304 kB
Progress (5): 1.6/3.6 MB | 48 kB | 0.6/1.0 MB | 0.6/1.3 MB | 229/304 kB
Progress (5): 1.6/3.6 MB | 48 kB | 0.6/1.0 MB | 0.6/1.3 MB | 229/304 kB
Progress (5): 1.6/3.6 MB | 48 kB | 0.6/1.0 MB | 0.6/1.3 MB | 229/304 kB
Progress (5): 1.6/3.6 MB | 48 kB | 0.6/1.0 MB | 0.6/1.3 MB | 229/304 kB
Progress (5): 1.6/3.6 MB | 48 kB | 0.6/1.0 MB | 0.6/1.3 MB | 229/304 kB
Progress (5): 1.6/3.6 MB | 48 kB | 0.6/1.0 MB | 0.7/1.3 MB | 229/304 kB
Progress (5): 1.6/3.6 MB | 48 kB | 0.6/1.0 MB | 0.7/1.3 MB | 229/304 kB
Progress (5): 1.6/3.6 MB | 48 kB | 0.6/1.0 MB | 0.7/1.3 MB | 229/304 kB
Progress (5): 1.6/3.6 MB | 48 kB | 0.6/1.0 MB | 0.7/1.3 MB | 229/304 kB
Progress (5): 1.6/3.6 MB | 48 kB | 0.6/1.0 MB | 0.7/1.3 MB | 229/304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.6/1.0 MB | 0.7/1.3 MB | 229/304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.6/1.0 MB | 0.7/1.3 MB | 229/304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.6/1.0 MB | 0.7/1.3 MB | 246/304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.6/1.0 MB | 0.7/1.3 MB | 246/304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.6/1.0 MB | 0.7/1.3 MB | 246/304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.6/1.0 MB | 0.7/1.3 MB | 246/304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.6/1.0 MB | 0.7/1.3 MB | 246/304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.6/1.0 MB | 0.7/1.3 MB | 262/304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.6/1.0 MB | 0.7/1.3 MB | 279/304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.6/1.0 MB | 0.7/1.3 MB | 295/304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.6/1.0 MB | 0.7/1.3 MB | 304 kB    
Progress (5): 1.7/3.6 MB | 48 kB | 0.6/1.0 MB | 0.7/1.3 MB | 304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.6/1.0 MB | 0.7/1.3 MB | 304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.6/1.0 MB | 0.7/1.3 MB | 304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.6/1.0 MB | 0.8/1.3 MB | 304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.6/1.0 MB | 0.8/1.3 MB | 304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.7/1.0 MB | 0.8/1.3 MB | 304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.7/1.0 MB | 0.8/1.3 MB | 304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.7/1.0 MB | 0.8/1.3 MB | 304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.7/1.0 MB | 0.8/1.3 MB | 304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.7/1.0 MB | 0.8/1.3 MB | 304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.7/1.0 MB | 0.8/1.3 MB | 304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.7/1.0 MB | 0.8/1.3 MB | 304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.7/1.0 MB | 0.8/1.3 MB | 304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.7/1.0 MB | 0.8/1.3 MB | 304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.7/1.0 MB | 0.8/1.3 MB | 304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.7/1.0 MB | 0.9/1.3 MB | 304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.7/1.0 MB | 0.9/1.3 MB | 304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.7/1.0 MB | 0.9/1.3 MB | 304 kB
Progress (5): 1.7/3.6 MB | 48 kB | 0.7/1.0 MB | 0.9/1.3 MB | 304 kB
Progress (5): 1.8/3.6 MB | 48 kB | 0.7/1.0 MB | 0.9/1.3 MB | 304 kB
Progress (5): 1.8/3.6 MB | 48 kB | 0.7/1.0 MB | 0.9/1.3 MB | 304 kB
Progress (5): 1.8/3.6 MB | 48 kB | 0.7/1.0 MB | 0.9/1.3 MB | 304 kB
Progress (5): 1.8/3.6 MB | 48 kB | 0.7/1.0 MB | 0.9/1.3 MB | 304 kB
                                                                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-expression/6.1.13/spring-expression-6.1.13.jar (304 kB at 134 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-data-jpa/3.3.4/spring-boot-starter-data-jpa-3.3.4.jar
Progress (4): 1.8/3.6 MB | 48 kB | 0.7/1.0 MB | 0.9/1.3 MB
Progress (4): 1.8/3.6 MB | 48 kB | 0.7/1.0 MB | 0.9/1.3 MB
Progress (4): 1.8/3.6 MB | 48 kB | 0.8/1.0 MB | 0.9/1.3 MB
Progress (4): 1.8/3.6 MB | 48 kB | 0.8/1.0 MB | 0.9/1.3 MB
Progress (4): 1.8/3.6 MB | 48 kB | 0.8/1.0 MB | 0.9/1.3 MB
Progress (4): 1.8/3.6 MB | 48 kB | 0.8/1.0 MB | 0.9/1.3 MB
Progress (4): 1.8/3.6 MB | 48 kB | 0.8/1.0 MB | 0.9/1.3 MB
Progress (4): 1.8/3.6 MB | 48 kB | 0.8/1.0 MB | 0.9/1.3 MB
Progress (4): 1.8/3.6 MB | 48 kB | 0.8/1.0 MB | 0.9/1.3 MB
Progress (4): 1.8/3.6 MB | 48 kB | 0.8/1.0 MB | 1.0/1.3 MB
Progress (4): 1.8/3.6 MB | 48 kB | 0.8/1.0 MB | 1.0/1.3 MB
Progress (4): 1.8/3.6 MB | 48 kB | 0.8/1.0 MB | 1.0/1.3 MB
Progress (4): 1.8/3.6 MB | 48 kB | 0.8/1.0 MB | 1.0/1.3 MB
Progress (4): 1.8/3.6 MB | 48 kB | 0.8/1.0 MB | 1.0/1.3 MB
Progress (4): 1.8/3.6 MB | 48 kB | 0.8/1.0 MB | 1.0/1.3 MB
Progress (4): 1.8/3.6 MB | 48 kB | 0.8/1.0 MB | 1.0/1.3 MB
Progress (4): 1.8/3.6 MB | 48 kB | 0.8/1.0 MB | 1.0/1.3 MB
Progress (4): 1.9/3.6 MB | 48 kB | 0.8/1.0 MB | 1.0/1.3 MB
Progress (4): 1.9/3.6 MB | 48 kB | 0.8/1.0 MB | 1.0/1.3 MB
Progress (4): 1.9/3.6 MB | 48 kB | 0.8/1.0 MB | 1.0/1.3 MB
Progress (4): 1.9/3.6 MB | 48 kB | 0.8/1.0 MB | 1.0/1.3 MB
Progress (4): 1.9/3.6 MB | 48 kB | 0.8/1.0 MB | 1.0/1.3 MB
Progress (4): 1.9/3.6 MB | 48 kB | 0.8/1.0 MB | 1.0/1.3 MB

Progress (4): 1.9/3.6 MB | 48 kB | 0.8/1.0 MB | 1.1/1.3 MB
Progress (4): 1.9/3.6 MB | 48 kB | 0.8/1.0 MB | 1.1/1.3 MB
Progress (4): 1.9/3.6 MB | 48 kB | 0.9/1.0 MB | 1.1/1.3 MB
Progress (4): 1.9/3.6 MB | 48 kB | 0.9/1.0 MB | 1.1/1.3 MB
Progress (4): 1.9/3.6 MB | 48 kB | 0.9/1.0 MB | 1.1/1.3 MB
Progress (4): 1.9/3.6 MB | 48 kB | 0.9/1.0 MB | 1.1/1.3 MB
Progress (4): 1.9/3.6 MB | 48 kB | 0.9/1.0 MB | 1.1/1.3 MB
Progress (4): 1.9/3.6 MB | 48 kB | 0.9/1.0 MB | 1.1/1.3 MB
Progress (4): 1.9/3.6 MB | 48 kB | 0.9/1.0 MB | 1.1/1.3 MB
Progress (4): 1.9/3.6 MB | 48 kB | 0.9/1.0 MB | 1.1/1.3 MB
Progress (4): 1.9/3.6 MB | 48 kB | 0.9/1.0 MB | 1.1/1.3 MB
Progress (4): 1.9/3.6 MB | 48 kB | 0.9/1.0 MB | 1.1/1.3 MB
Progress (4): 1.9/3.6 MB | 48 kB | 0.9/1.0 MB | 1.1/1.3 MB
Progress (4): 2.0/3.6 MB | 48 kB | 0.9/1.0 MB | 1.1/1.3 MB
Progress (4): 2.0/3.6 MB | 48 kB | 0.9/1.0 MB | 1.1/1.3 MB
Progress (4): 2.0/3.6 MB | 48 kB | 0.9/1.0 MB | 1.2/1.3 MB
Progress (4): 2.0/3.6 MB | 48 kB | 0.9/1.0 MB | 1.2/1.3 MB
Progress (4): 2.0/3.6 MB | 48 kB | 0.9/1.0 MB | 1.2/1.3 MB
Progress (5): 2.0/3.6 MB | 48 kB | 0.9/1.0 MB | 1.2/1.3 MB | 4.8 kB
Progress (5): 2.0/3.6 MB | 48 kB | 0.9/1.0 MB | 1.2/1.3 MB | 4.8 kB
Progress (5): 2.0/3.6 MB | 48 kB | 0.9/1.0 MB | 1.2/1.3 MB | 4.8 kB
Progress (5): 2.0/3.6 MB | 48 kB | 0.9/1.0 MB | 1.2/1.3 MB | 4.8 kB
Progress (5): 2.0/3.6 MB | 48 kB | 1.0/1.0 MB | 1.2/1.3 MB | 4.8 kB
Progress (5): 2.0/3.6 MB | 48 kB | 1.0/1.0 MB | 1.2/1.3 MB | 4.8 kB
Progress (5): 2.0/3.6 MB | 48 kB | 1.0/1.0 MB | 1.2/1.3 MB | 4.8 kB
Progress (5): 2.0/3.6 MB | 48 kB | 1.0/1.0 MB | 1.2/1.3 MB | 4.8 kB
Progress (5): 2.0/3.6 MB | 48 kB | 1.0/1.0 MB | 1.2/1.3 MB | 4.8 kB
Progress (5): 2.0/3.6 MB | 48 kB | 1.0/1.0 MB | 1.2/1.3 MB | 4.8 kB
Progress (5): 2.0/3.6 MB | 48 kB | 1.0/1.0 MB | 1.2/1.3 MB | 4.8 kB
Progress (5): 2.0/3.6 MB | 48 kB | 1.0/1.0 MB | 1.2/1.3 MB | 4.8 kB
Progress (5): 2.1/3.6 MB | 48 kB | 1.0/1.0 MB | 1.2/1.3 MB | 4.8 kB
Progress (5): 2.1/3.6 MB | 48 kB | 1.0/1.0 MB | 1.2/1.3 MB | 4.8 kB
Progress (5): 2.1/3.6 MB | 48 kB | 1.0/1.0 MB | 1.2/1.3 MB | 4.8 kB
Progress (5): 2.1/3.6 MB | 48 kB | 1.0/1.0 MB | 1.3/1.3 MB | 4.8 kB
Progress (5): 2.1/3.6 MB | 48 kB | 1.0/1.0 MB | 1.3/1.3 MB | 4.8 kB
Progress (5): 2.1/3.6 MB | 48 kB | 1.0/1.0 MB | 1.3/1.3 MB | 4.8 kB
Progress (5): 2.1/3.6 MB | 48 kB | 1.0/1.0 MB | 1.3/1.3 MB | 4.8 kB
Progress (5): 2.1/3.6 MB | 48 kB | 1.0/1.0 MB | 1.3/1.3 MB | 4.8 kB
Progress (5): 2.1/3.6 MB | 48 kB | 1.0/1.0 MB | 1.3/1.3 MB | 4.8 kB
Progress (5): 2.1/3.6 MB | 48 kB | 1.0/1.0 MB | 1.3/1.3 MB | 4.8 kB
Progress (5): 2.1/3.6 MB | 48 kB | 1.0/1.0 MB | 1.3 MB | 4.8 kB    
Progress (5): 2.1/3.6 MB | 48 kB | 1.0 MB | 1.3 MB | 4.8 kB    
Progress (5): 2.1/3.6 MB | 48 kB | 1.0 MB | 1.3 MB | 4.8 kB
                                                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-data-jpa/3.3.4/spring-boot-starter-data-jpa-3.3.4.jar (4.8 kB at 2.0 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-aop/3.3.4/spring-boot-starter-aop-3.3.4.jar
Progress (4): 2.1/3.6 MB | 48 kB | 1.0 MB | 1.3 MB
Progress (4): 2.1/3.6 MB | 48 kB | 1.0 MB | 1.3 MB
Progress (4): 2.2/3.6 MB | 48 kB | 1.0 MB | 1.3 MB
Progress (4): 2.2/3.6 MB | 48 kB | 1.0 MB | 1.3 MB
Progress (4): 2.2/3.6 MB | 48 kB | 1.0 MB | 1.3 MB
Progress (4): 2.2/3.6 MB | 48 kB | 1.0 MB | 1.3 MB
Progress (4): 2.2/3.6 MB | 48 kB | 1.0 MB | 1.3 MB
Progress (4): 2.2/3.6 MB | 48 kB | 1.0 MB | 1.3 MB
Progress (4): 2.2/3.6 MB | 48 kB | 1.0 MB | 1.3 MB
Progress (4): 2.3/3.6 MB | 48 kB | 1.0 MB | 1.3 MB
Progress (4): 2.3/3.6 MB | 48 kB | 1.0 MB | 1.3 MB
                                                  
Downloaded from central: https://repo.maven.apache.org/maven2/io/micrometer/micrometer-commons/1.13.4/micrometer-commons-1.13.4.jar (48 kB at 19 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/aspectj/aspectjweaver/1.9.22.1/aspectjweaver-1.9.22.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-webmvc/6.1.13/spring-webmvc-6.1.13.jar (1.0 MB at 427 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jdbc/3.3.4/spring-boot-starter-jdbc-3.3.4.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-context/6.1.13/spring-context-6.1.13.jar (1.3 MB at 532 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/zaxxer/HikariCP/5.1.0/HikariCP-5.1.0.jar
Progress (1): 2.3/3.6 MB
Progress (2): 2.3/3.6 MB | 4.8 kB
Progress (2): 2.3/3.6 MB | 4.8 kB
Progress (2): 2.3/3.6 MB | 4.8 kB
Progress (2): 2.3/3.6 MB | 4.8 kB
Progress (2): 2.4/3.6 MB | 4.8 kB
                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-aop/3.3.4/spring-boot-starter-aop-3.3.4.jar (4.8 kB at 1.9 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jdbc/6.1.13/spring-jdbc-6.1.13.jar
Progress (1): 2.4/3.6 MB
Progress (2): 2.4/3.6 MB | 0/2.2 MB
Progress (2): 2.4/3.6 MB | 0/2.2 MB
Progress (2): 2.4/3.6 MB | 0/2.2 MB
Progress (2): 2.4/3.6 MB | 0/2.2 MB
Progress (2): 2.4/3.6 MB | 0/2.2 MB
Progress (3): 2.4/3.6 MB | 0/2.2 MB | 3.2/162 kB
Progress (3): 2.4/3.6 MB | 0/2.2 MB | 3.2/162 kB
Progress (3): 2.4/3.6 MB | 0.1/2.2 MB | 3.2/162 kB
Progress (3): 2.4/3.6 MB | 0.1/2.2 MB | 20/162 kB 
Progress (4): 2.4/3.6 MB | 0.1/2.2 MB | 20/162 kB | 3.1/4.8 kB
Progress (4): 2.4/3.6 MB | 0.1/2.2 MB | 20/162 kB | 4.8 kB    
Progress (4): 2.4/3.6 MB | 0.1/2.2 MB | 28/162 kB | 4.8 kB
Progress (5): 2.4/3.6 MB | 0.1/2.2 MB | 28/162 kB | 4.8 kB | 7.7/467 kB
Progress (5): 2.4/3.6 MB | 0.1/2.2 MB | 28/162 kB | 4.8 kB | 7.7/467 kB
Progress (5): 2.4/3.6 MB | 0.1/2.2 MB | 28/162 kB | 4.8 kB | 7.7/467 kB
Progress (5): 2.4/3.6 MB | 0.1/2.2 MB | 28/162 kB | 4.8 kB | 7.7/467 kB
Progress (5): 2.4/3.6 MB | 0.1/2.2 MB | 44/162 kB | 4.8 kB | 7.7/467 kB
Progress (5): 2.4/3.6 MB | 0.1/2.2 MB | 44/162 kB | 4.8 kB | 7.7/467 kB
Progress (5): 2.4/3.6 MB | 0.1/2.2 MB | 61/162 kB | 4.8 kB | 7.7/467 kB
Progress (5): 2.4/3.6 MB | 0.1/2.2 MB | 61/162 kB | 4.8 kB | 7.7/467 kB
Progress (5): 2.4/3.6 MB | 0.1/2.2 MB | 61/162 kB | 4.8 kB | 24/467 kB 
Progress (5): 2.4/3.6 MB | 0.1/2.2 MB | 61/162 kB | 4.8 kB | 24/467 kB
Progress (5): 2.5/3.6 MB | 0.1/2.2 MB | 61/162 kB | 4.8 kB | 24/467 kB
Progress (5): 2.5/3.6 MB | 0.1/2.2 MB | 77/162 kB | 4.8 kB | 24/467 kB
Progress (5): 2.5/3.6 MB | 0.1/2.2 MB | 77/162 kB | 4.8 kB | 24/467 kB
Progress (5): 2.5/3.6 MB | 0.1/2.2 MB | 77/162 kB | 4.8 kB | 24/467 kB
Progress (5): 2.5/3.6 MB | 0.1/2.2 MB | 77/162 kB | 4.8 kB | 40/467 kB
Progress (5): 2.5/3.6 MB | 0.1/2.2 MB | 93/162 kB | 4.8 kB | 40/467 kB
Progress (5): 2.5/3.6 MB | 0.1/2.2 MB | 93/162 kB | 4.8 kB | 40/467 kB
Progress (5): 2.5/3.6 MB | 0.1/2.2 MB | 93/162 kB | 4.8 kB | 40/467 kB
                                                                      
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-jdbc/3.3.4/spring-boot-starter-jdbc-3.3.4.jar (4.8 kB at 1.9 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/hibernate/orm/hibernate-core/6.5.3.Final/hibernate-core-6.5.3.Final.jar
Progress (4): 2.5/3.6 MB | 0.1/2.2 MB | 110/162 kB | 40/467 kB
Progress (4): 2.5/3.6 MB | 0.2/2.2 MB | 110/162 kB | 40/467 kB
Progress (4): 2.5/3.6 MB | 0.2/2.2 MB | 110/162 kB | 57/467 kB
Progress (4): 2.5/3.6 MB | 0.2/2.2 MB | 110/162 kB | 57/467 kB
Progress (4): 2.5/3.6 MB | 0.2/2.2 MB | 126/162 kB | 57/467 kB
Progress (4): 2.5/3.6 MB | 0.2/2.2 MB | 126/162 kB | 57/467 kB
Progress (4): 2.5/3.6 MB | 0.2/2.2 MB | 126/162 kB | 73/467 kB
Progress (4): 2.5/3.6 MB | 0.2/2.2 MB | 142/162 kB | 73/467 kB
Progress (4): 2.5/3.6 MB | 0.2/2.2 MB | 142/162 kB | 73/467 kB
Progress (4): 2.5/3.6 MB | 0.2/2.2 MB | 142/162 kB | 73/467 kB
Progress (4): 2.5/3.6 MB | 0.2/2.2 MB | 159/162 kB | 73/467 kB
Progress (4): 2.5/3.6 MB | 0.2/2.2 MB | 162 kB | 73/467 kB    
Progress (4): 2.5/3.6 MB | 0.2/2.2 MB | 162 kB | 90/467 kB
Progress (4): 2.5/3.6 MB | 0.2/2.2 MB | 162 kB | 90/467 kB
Progress (4): 2.5/3.6 MB | 0.2/2.2 MB | 162 kB | 90/467 kB
Progress (4): 2.5/3.6 MB | 0.2/2.2 MB | 162 kB | 90/467 kB
Progress (4): 2.5/3.6 MB | 0.2/2.2 MB | 162 kB | 106/467 kB
Progress (4): 2.6/3.6 MB | 0.2/2.2 MB | 162 kB | 106/467 kB
Progress (4): 2.6/3.6 MB | 0.2/2.2 MB | 162 kB | 106/467 kB
Progress (4): 2.6/3.6 MB | 0.2/2.2 MB | 162 kB | 122/467 kB
Progress (4): 2.6/3.6 MB | 0.2/2.2 MB | 162 kB | 122/467 kB
Progress (4): 2.6/3.6 MB | 0.2/2.2 MB | 162 kB | 139/467 kB
Progress (5): 2.6/3.6 MB | 0.2/2.2 MB | 162 kB | 139/467 kB | 0/12 MB
                                                                     
Downloaded from central: https://repo.maven.apache.org/maven2/com/zaxxer/HikariCP/5.1.0/HikariCP-5.1.0.jar (162 kB at 63 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/jakarta/persistence/jakarta.persistence-api/3.1.0/jakarta.persistence-api-3.1.0.jar
Progress (4): 2.6/3.6 MB | 0.2/2.2 MB | 139/467 kB | 0/12 MB
Progress (4): 2.6/3.6 MB | 0.2/2.2 MB | 139/467 kB | 0/12 MB
Progress (4): 2.6/3.6 MB | 0.2/2.2 MB | 139/467 kB | 0/12 MB
Progress (4): 2.6/3.6 MB | 0.2/2.2 MB | 139/467 kB | 0/12 MB
Progress (4): 2.6/3.6 MB | 0.2/2.2 MB | 139/467 kB | 0/12 MB
Progress (4): 2.6/3.6 MB | 0.2/2.2 MB | 155/467 kB | 0/12 MB
Progress (4): 2.6/3.6 MB | 0.2/2.2 MB | 155/467 kB | 0.1/12 MB
Progress (4): 2.6/3.6 MB | 0.2/2.2 MB | 155/467 kB | 0.1/12 MB
Progress (4): 2.6/3.6 MB | 0.3/2.2 MB | 155/467 kB | 0.1/12 MB
Progress (4): 2.6/3.6 MB | 0.3/2.2 MB | 155/467 kB | 0.1/12 MB
Progress (4): 2.6/3.6 MB | 0.3/2.2 MB | 155/467 kB | 0.1/12 MB
Progress (4): 2.6/3.6 MB | 0.3/2.2 MB | 172/467 kB | 0.1/12 MB
Progress (4): 2.6/3.6 MB | 0.3/2.2 MB | 172/467 kB | 0.1/12 MB
Progress (4): 2.6/3.6 MB | 0.3/2.2 MB | 172/467 kB | 0.1/12 MB
Progress (4): 2.6/3.6 MB | 0.3/2.2 MB | 172/467 kB | 0.1/12 MB
Progress (4): 2.6/3.6 MB | 0.3/2.2 MB | 172/467 kB | 0.1/12 MB
Progress (4): 2.6/3.6 MB | 0.3/2.2 MB | 172/467 kB | 0.1/12 MB
Progress (4): 2.6/3.6 MB | 0.3/2.2 MB | 172/467 kB | 0.1/12 MB
Progress (4): 2.6/3.6 MB | 0.3/2.2 MB | 172/467 kB | 0.1/12 MB
Progress (4): 2.6/3.6 MB | 0.3/2.2 MB | 172/467 kB | 0.2/12 MB
Progress (4): 2.6/3.6 MB | 0.3/2.2 MB | 172/467 kB | 0.2/12 MB
Progress (4): 2.7/3.6 MB | 0.3/2.2 MB | 172/467 kB | 0.2/12 MB
Progress (4): 2.7/3.6 MB | 0.3/2.2 MB | 188/467 kB | 0.2/12 MB
Progress (4): 2.7/3.6 MB | 0.3/2.2 MB | 188/467 kB | 0.2/12 MB
Progress (4): 2.7/3.6 MB | 0.3/2.2 MB | 188/467 kB | 0.2/12 MB
Progress (4): 2.7/3.6 MB | 0.3/2.2 MB | 188/467 kB | 0.2/12 MB
Progress (4): 2.7/3.6 MB | 0.3/2.2 MB | 188/467 kB | 0.2/12 MB
Progress (4): 2.7/3.6 MB | 0.3/2.2 MB | 204/467 kB | 0.2/12 MB
Progress (4): 2.7/3.6 MB | 0.3/2.2 MB | 204/467 kB | 0.2/12 MB
Progress (4): 2.7/3.6 MB | 0.3/2.2 MB | 204/467 kB | 0.2/12 MB
Progress (4): 2.7/3.6 MB | 0.3/2.2 MB | 204/467 kB | 0.3/12 MB
Progress (4): 2.7/3.6 MB | 0.3/2.2 MB | 204/467 kB | 0.3/12 MB
Progress (4): 2.7/3.6 MB | 0.3/2.2 MB | 204/467 kB | 0.3/12 MB
Progress (4): 2.7/3.6 MB | 0.3/2.2 MB | 204/467 kB | 0.3/12 MB
Progress (4): 2.7/3.6 MB | 0.3/2.2 MB | 204/467 kB | 0.3/12 MB
Progress (4): 2.7/3.6 MB | 0.3/2.2 MB | 221/467 kB | 0.3/12 MB
Progress (4): 2.7/3.6 MB | 0.3/2.2 MB | 221/467 kB | 0.3/12 MB
Progress (4): 2.7/3.6 MB | 0.3/2.2 MB | 221/467 kB | 0.3/12 MB
Progress (5): 2.7/3.6 MB | 0.3/2.2 MB | 221/467 kB | 0.3/12 MB | 7.7/165 kB
Progress (5): 2.7/3.6 MB | 0.3/2.2 MB | 221/467 kB | 0.3/12 MB | 16/165 kB 
Progress (5): 2.7/3.6 MB | 0.3/2.2 MB | 221/467 kB | 0.3/12 MB | 16/165 kB
Progress (5): 2.7/3.6 MB | 0.3/2.2 MB | 221/467 kB | 0.3/12 MB | 16/165 kB
Progress (5): 2.7/3.6 MB | 0.3/2.2 MB | 221/467 kB | 0.3/12 MB | 32/165 kB
Progress (5): 2.7/3.6 MB | 0.3/2.2 MB | 237/467 kB | 0.3/12 MB | 32/165 kB
Progress (5): 2.8/3.6 MB | 0.3/2.2 MB | 237/467 kB | 0.3/12 MB | 32/165 kB
Progress (5): 2.8/3.6 MB | 0.3/2.2 MB | 237/467 kB | 0.3/12 MB | 32/165 kB
Progress (5): 2.8/3.6 MB | 0.3/2.2 MB | 237/467 kB | 0.3/12 MB | 49/165 kB
Progress (5): 2.8/3.6 MB | 0.3/2.2 MB | 237/467 kB | 0.3/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.3/2.2 MB | 237/467 kB | 0.3/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.3/2.2 MB | 237/467 kB | 0.3/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.3/2.2 MB | 237/467 kB | 0.3/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.3/2.2 MB | 237/467 kB | 0.4/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.3/2.2 MB | 237/467 kB | 0.4/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.3/2.2 MB | 237/467 kB | 0.4/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.3/2.2 MB | 253/467 kB | 0.4/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.3/2.2 MB | 253/467 kB | 0.4/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.3/2.2 MB | 253/467 kB | 0.4/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.3/2.2 MB | 253/467 kB | 0.4/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.3/2.2 MB | 253/467 kB | 0.4/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.3/2.2 MB | 253/467 kB | 0.4/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.3/2.2 MB | 270/467 kB | 0.4/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.3/2.2 MB | 270/467 kB | 0.5/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.4/2.2 MB | 270/467 kB | 0.5/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.4/2.2 MB | 270/467 kB | 0.5/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.4/2.2 MB | 286/467 kB | 0.5/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.4/2.2 MB | 286/467 kB | 0.5/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.4/2.2 MB | 286/467 kB | 0.5/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.4/2.2 MB | 286/467 kB | 0.5/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.4/2.2 MB | 286/467 kB | 0.5/12 MB | 57/165 kB
Progress (5): 2.8/3.6 MB | 0.4/2.2 MB | 286/467 kB | 0.5/12 MB | 57/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 286/467 kB | 0.5/12 MB | 57/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 286/467 kB | 0.5/12 MB | 73/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 286/467 kB | 0.5/12 MB | 73/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 286/467 kB | 0.5/12 MB | 73/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 286/467 kB | 0.5/12 MB | 90/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 303/467 kB | 0.5/12 MB | 90/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 303/467 kB | 0.5/12 MB | 90/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 303/467 kB | 0.5/12 MB | 106/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 303/467 kB | 0.5/12 MB | 106/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 303/467 kB | 0.5/12 MB | 106/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 303/467 kB | 0.6/12 MB | 106/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 303/467 kB | 0.6/12 MB | 106/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 303/467 kB | 0.6/12 MB | 106/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 303/467 kB | 0.6/12 MB | 106/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 303/467 kB | 0.6/12 MB | 106/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 303/467 kB | 0.6/12 MB | 106/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 319/467 kB | 0.6/12 MB | 106/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 319/467 kB | 0.6/12 MB | 106/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 319/467 kB | 0.6/12 MB | 106/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 319/467 kB | 0.6/12 MB | 106/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 319/467 kB | 0.7/12 MB | 106/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 335/467 kB | 0.7/12 MB | 106/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 335/467 kB | 0.7/12 MB | 106/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 335/467 kB | 0.7/12 MB | 106/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 335/467 kB | 0.7/12 MB | 106/165 kB
Progress (5): 2.9/3.6 MB | 0.4/2.2 MB | 335/467 kB | 0.7/12 MB | 106/165 kB
Progress (5): 3.0/3.6 MB | 0.4/2.2 MB | 335/467 kB | 0.7/12 MB | 106/165 kB
Progress (5): 3.0/3.6 MB | 0.4/2.2 MB | 352/467 kB | 0.7/12 MB | 106/165 kB
Progress (5): 3.0/3.6 MB | 0.4/2.2 MB | 352/467 kB | 0.7/12 MB | 106/165 kB
Progress (5): 3.0/3.6 MB | 0.4/2.2 MB | 352/467 kB | 0.7/12 MB | 106/165 kB
Progress (5): 3.0/3.6 MB | 0.4/2.2 MB | 352/467 kB | 0.7/12 MB | 106/165 kB
Progress (5): 3.0/3.6 MB | 0.4/2.2 MB | 352/467 kB | 0.7/12 MB | 106/165 kB
Progress (5): 3.0/3.6 MB | 0.4/2.2 MB | 352/467 kB | 0.7/12 MB | 122/165 kB
Progress (5): 3.0/3.6 MB | 0.4/2.2 MB | 352/467 kB | 0.7/12 MB | 122/165 kB
Progress (5): 3.0/3.6 MB | 0.4/2.2 MB | 352/467 kB | 0.7/12 MB | 122/165 kB
Progress (5): 3.0/3.6 MB | 0.4/2.2 MB | 368/467 kB | 0.7/12 MB | 122/165 kB
Progress (5): 3.0/3.6 MB | 0.4/2.2 MB | 368/467 kB | 0.7/12 MB | 139/165 kB
Progress (5): 3.0/3.6 MB | 0.4/2.2 MB | 368/467 kB | 0.7/12 MB | 139/165 kB
Progress (5): 3.0/3.6 MB | 0.4/2.2 MB | 368/467 kB | 0.7/12 MB | 139/165 kB
Progress (5): 3.0/3.6 MB | 0.4/2.2 MB | 368/467 kB | 0.7/12 MB | 155/165 kB
Progress (5): 3.0/3.6 MB | 0.4/2.2 MB | 368/467 kB | 0.7/12 MB | 155/165 kB
Progress (5): 3.0/3.6 MB | 0.4/2.2 MB | 368/467 kB | 0.7/12 MB | 165 kB    
Progress (5): 3.0/3.6 MB | 0.4/2.2 MB | 368/467 kB | 0.7/12 MB | 165 kB
Progress (5): 3.0/3.6 MB | 0.5/2.2 MB | 368/467 kB | 0.7/12 MB | 165 kB
Progress (5): 3.0/3.6 MB | 0.5/2.2 MB | 368/467 kB | 0.8/12 MB | 165 kB
Progress (5): 3.0/3.6 MB | 0.5/2.2 MB | 368/467 kB | 0.8/12 MB | 165 kB
Progress (5): 3.0/3.6 MB | 0.5/2.2 MB | 368/467 kB | 0.8/12 MB | 165 kB
Progress (5): 3.0/3.6 MB | 0.5/2.2 MB | 385/467 kB | 0.8/12 MB | 165 kB
Progress (5): 3.0/3.6 MB | 0.5/2.2 MB | 385/467 kB | 0.8/12 MB | 165 kB
Progress (5): 3.0/3.6 MB | 0.5/2.2 MB | 385/467 kB | 0.8/12 MB | 165 kB
Progress (5): 3.0/3.6 MB | 0.5/2.2 MB | 385/467 kB | 0.8/12 MB | 165 kB
Progress (5): 3.0/3.6 MB | 0.5/2.2 MB | 385/467 kB | 0.8/12 MB | 165 kB
Progress (5): 3.0/3.6 MB | 0.5/2.2 MB | 385/467 kB | 0.8/12 MB | 165 kB
Progress (5): 3.1/3.6 MB | 0.5/2.2 MB | 385/467 kB | 0.8/12 MB | 165 kB
Progress (5): 3.1/3.6 MB | 0.5/2.2 MB | 385/467 kB | 0.9/12 MB | 165 kB
                                                                       
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/persistence/jakarta.persistence-api/3.1.0/jakarta.persistence-api-3.1.0.jar (165 kB at 57 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/jakarta/transaction/jakarta.transaction-api/2.0.1/jakarta.transaction-api-2.0.1.jar
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 385/467 kB | 0.9/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 401/467 kB | 0.9/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 401/467 kB | 0.9/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 401/467 kB | 0.9/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 401/467 kB | 0.9/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 417/467 kB | 0.9/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 417/467 kB | 0.9/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 417/467 kB | 0.9/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 417/467 kB | 0.9/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 417/467 kB | 0.9/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 417/467 kB | 0.9/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 434/467 kB | 0.9/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 434/467 kB | 0.9/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 434/467 kB | 0.9/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 434/467 kB | 0.9/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 434/467 kB | 1.0/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 434/467 kB | 1.0/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 434/467 kB | 1.0/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 434/467 kB | 1.0/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 434/467 kB | 1.0/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 434/467 kB | 1.0/12 MB
Progress (4): 3.1/3.6 MB | 0.5/2.2 MB | 434/467 kB | 1.0/12 MB
Progress (4): 3.2/3.6 MB | 0.5/2.2 MB | 434/467 kB | 1.0/12 MB
Progress (4): 3.2/3.6 MB | 0.5/2.2 MB | 434/467 kB | 1.0/12 MB
Progress (4): 3.2/3.6 MB | 0.5/2.2 MB | 450/467 kB | 1.0/12 MB
Progress (4): 3.2/3.6 MB | 0.5/2.2 MB | 450/467 kB | 1.0/12 MB
Progress (4): 3.2/3.6 MB | 0.5/2.2 MB | 450/467 kB | 1.1/12 MB
Progress (4): 3.2/3.6 MB | 0.5/2.2 MB | 450/467 kB | 1.1/12 MB
Progress (4): 3.2/3.6 MB | 0.5/2.2 MB | 466/467 kB | 1.1/12 MB
Progress (4): 3.2/3.6 MB | 0.5/2.2 MB | 467 kB | 1.1/12 MB    
Progress (4): 3.2/3.6 MB | 0.5/2.2 MB | 467 kB | 1.1/12 MB
Progress (4): 3.2/3.6 MB | 0.5/2.2 MB | 467 kB | 1.1/12 MB
Progress (4): 3.2/3.6 MB | 0.6/2.2 MB | 467 kB | 1.1/12 MB
Progress (4): 3.2/3.6 MB | 0.6/2.2 MB | 467 kB | 1.1/12 MB
Progress (4): 3.2/3.6 MB | 0.6/2.2 MB | 467 kB | 1.1/12 MB
                                                          
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jdbc/6.1.13/spring-jdbc-6.1.13.jar (467 kB at 157 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging/3.5.3.Final/jboss-logging-3.5.3.Final.jar
Progress (3): 3.2/3.6 MB | 0.6/2.2 MB | 1.1/12 MB
Progress (4): 3.2/3.6 MB | 0.6/2.2 MB | 1.1/12 MB | 7.7/29 kB
Progress (4): 3.2/3.6 MB | 0.6/2.2 MB | 1.1/12 MB | 11/29 kB 
Progress (4): 3.2/3.6 MB | 0.6/2.2 MB | 1.1/12 MB | 28/29 kB
Progress (4): 3.2/3.6 MB | 0.6/2.2 MB | 1.1/12 MB | 29 kB   
Progress (4): 3.2/3.6 MB | 0.6/2.2 MB | 1.1/12 MB | 29 kB
Progress (4): 3.2/3.6 MB | 0.6/2.2 MB | 1.1/12 MB | 29 kB
Progress (4): 3.2/3.6 MB | 0.6/2.2 MB | 1.1/12 MB | 29 kB
Progress (4): 3.3/3.6 MB | 0.6/2.2 MB | 1.1/12 MB | 29 kB
Progress (4): 3.3/3.6 MB | 0.6/2.2 MB | 1.1/12 MB | 29 kB
Progress (4): 3.3/3.6 MB | 0.6/2.2 MB | 1.1/12 MB | 29 kB
Progress (4): 3.3/3.6 MB | 0.6/2.2 MB | 1.1/12 MB | 29 kB
Progress (4): 3.3/3.6 MB | 0.6/2.2 MB | 1.1/12 MB | 29 kB
Progress (4): 3.3/3.6 MB | 0.6/2.2 MB | 1.1/12 MB | 29 kB
Progress (4): 3.3/3.6 MB | 0.6/2.2 MB | 1.2/12 MB | 29 kB
Progress (4): 3.3/3.6 MB | 0.6/2.2 MB | 1.2/12 MB | 29 kB
Progress (4): 3.3/3.6 MB | 0.6/2.2 MB | 1.2/12 MB | 29 kB
Progress (4): 3.3/3.6 MB | 0.6/2.2 MB | 1.2/12 MB | 29 kB
Progress (4): 3.3/3.6 MB | 0.6/2.2 MB | 1.2/12 MB | 29 kB
Progress (4): 3.3/3.6 MB | 0.6/2.2 MB | 1.2/12 MB | 29 kB
Progress (4): 3.3/3.6 MB | 0.6/2.2 MB | 1.2/12 MB | 29 kB
Progress (4): 3.3/3.6 MB | 0.6/2.2 MB | 1.2/12 MB | 29 kB
Progress (4): 3.4/3.6 MB | 0.6/2.2 MB | 1.2/12 MB | 29 kB
Progress (4): 3.4/3.6 MB | 0.6/2.2 MB | 1.2/12 MB | 29 kB
Progress (4): 3.4/3.6 MB | 0.6/2.2 MB | 1.2/12 MB | 29 kB
Progress (4): 3.4/3.6 MB | 0.6/2.2 MB | 1.2/12 MB | 29 kB
Progress (4): 3.4/3.6 MB | 0.6/2.2 MB | 1.2/12 MB | 29 kB
Progress (4): 3.4/3.6 MB | 0.6/2.2 MB | 1.2/12 MB | 29 kB
Progress (4): 3.4/3.6 MB | 0.6/2.2 MB | 1.2/12 MB | 29 kB
Progress (5): 3.4/3.6 MB | 0.6/2.2 MB | 1.2/12 MB | 29 kB | 7.7/59 kB
Progress (5): 3.4/3.6 MB | 0.6/2.2 MB | 1.2/12 MB | 29 kB | 16/59 kB 
Progress (5): 3.4/3.6 MB | 0.6/2.2 MB | 1.3/12 MB | 29 kB | 16/59 kB
Progress (5): 3.4/3.6 MB | 0.6/2.2 MB | 1.3/12 MB | 29 kB | 32/59 kB
Progress (5): 3.4/3.6 MB | 0.6/2.2 MB | 1.3/12 MB | 29 kB | 32/59 kB
Progress (5): 3.4/3.6 MB | 0.6/2.2 MB | 1.3/12 MB | 29 kB | 49/59 kB
Progress (5): 3.4/3.6 MB | 0.7/2.2 MB | 1.3/12 MB | 29 kB | 49/59 kB
Progress (5): 3.4/3.6 MB | 0.7/2.2 MB | 1.3/12 MB | 29 kB | 49/59 kB
Progress (5): 3.4/3.6 MB | 0.7/2.2 MB | 1.3/12 MB | 29 kB | 49/59 kB
Progress (5): 3.4/3.6 MB | 0.7/2.2 MB | 1.3/12 MB | 29 kB | 49/59 kB
Progress (5): 3.4/3.6 MB | 0.7/2.2 MB | 1.3/12 MB | 29 kB | 49/59 kB
Progress (5): 3.4/3.6 MB | 0.7/2.2 MB | 1.3/12 MB | 29 kB | 49/59 kB
Progress (5): 3.4/3.6 MB | 0.7/2.2 MB | 1.3/12 MB | 29 kB | 49/59 kB
Progress (5): 3.4/3.6 MB | 0.7/2.2 MB | 1.3/12 MB | 29 kB | 59 kB   
Progress (5): 3.4/3.6 MB | 0.7/2.2 MB | 1.3/12 MB | 29 kB | 59 kB
Progress (5): 3.4/3.6 MB | 0.7/2.2 MB | 1.3/12 MB | 29 kB | 59 kB
Progress (5): 3.4/3.6 MB | 0.7/2.2 MB | 1.3/12 MB | 29 kB | 59 kB
Progress (5): 3.4/3.6 MB | 0.7/2.2 MB | 1.3/12 MB | 29 kB | 59 kB
Progress (5): 3.4/3.6 MB | 0.7/2.2 MB | 1.3/12 MB | 29 kB | 59 kB
Progress (5): 3.4/3.6 MB | 0.7/2.2 MB | 1.3/12 MB | 29 kB | 59 kB
Progress (5): 3.4/3.6 MB | 0.7/2.2 MB | 1.4/12 MB | 29 kB | 59 kB
Progress (5): 3.5/3.6 MB | 0.7/2.2 MB | 1.4/12 MB | 29 kB | 59 kB
                                                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/logging/jboss-logging/3.5.3.Final/jboss-logging-3.5.3.Final.jar (59 kB at 19 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/hibernate/common/hibernate-commons-annotations/6.0.6.Final/hibernate-commons-annotations-6.0.6.Final.jar
Progress (4): 3.5/3.6 MB | 0.7/2.2 MB | 1.4/12 MB | 29 kB
Progress (4): 3.5/3.6 MB | 0.7/2.2 MB | 1.4/12 MB | 29 kB
Progress (4): 3.5/3.6 MB | 0.7/2.2 MB | 1.4/12 MB | 29 kB
Progress (4): 3.5/3.6 MB | 0.7/2.2 MB | 1.4/12 MB | 29 kB
Progress (4): 3.5/3.6 MB | 0.7/2.2 MB | 1.4/12 MB | 29 kB
Progress (4): 3.5/3.6 MB | 0.7/2.2 MB | 1.4/12 MB | 29 kB
Progress (4): 3.5/3.6 MB | 0.7/2.2 MB | 1.4/12 MB | 29 kB
Progress (4): 3.5/3.6 MB | 0.8/2.2 MB | 1.4/12 MB | 29 kB
Progress (4): 3.5/3.6 MB | 0.8/2.2 MB | 1.4/12 MB | 29 kB
Progress (4): 3.5/3.6 MB | 0.8/2.2 MB | 1.4/12 MB | 29 kB
Progress (4): 3.5/3.6 MB | 0.8/2.2 MB | 1.4/12 MB | 29 kB
Progress (4): 3.5/3.6 MB | 0.8/2.2 MB | 1.4/12 MB | 29 kB
Progress (4): 3.5/3.6 MB | 0.8/2.2 MB | 1.4/12 MB | 29 kB
Progress (4): 3.5/3.6 MB | 0.8/2.2 MB | 1.5/12 MB | 29 kB
Progress (4): 3.5/3.6 MB | 0.8/2.2 MB | 1.5/12 MB | 29 kB
Progress (4): 3.6 MB | 0.8/2.2 MB | 1.5/12 MB | 29 kB    
Progress (4): 3.6 MB | 0.8/2.2 MB | 1.5/12 MB | 29 kB
Progress (4): 3.6 MB | 0.8/2.2 MB | 1.5/12 MB | 29 kB
Progress (4): 3.6 MB | 0.8/2.2 MB | 1.5/12 MB | 29 kB
Progress (4): 3.6 MB | 0.8/2.2 MB | 1.5/12 MB | 29 kB
Progress (4): 3.6 MB | 0.8/2.2 MB | 1.5/12 MB | 29 kB
Progress (5): 3.6 MB | 0.8/2.2 MB | 1.5/12 MB | 29 kB | 7.7/68 kB
Progress (5): 3.6 MB | 0.8/2.2 MB | 1.5/12 MB | 29 kB | 16/68 kB 
Progress (5): 3.6 MB | 0.8/2.2 MB | 1.5/12 MB | 29 kB | 16/68 kB
Progress (5): 3.6 MB | 0.8/2.2 MB | 1.5/12 MB | 29 kB | 16/68 kB
Progress (5): 3.6 MB | 0.8/2.2 MB | 1.5/12 MB | 29 kB | 32/68 kB
Progress (5): 3.6 MB | 0.8/2.2 MB | 1.5/12 MB | 29 kB | 32/68 kB
Progress (5): 3.6 MB | 0.8/2.2 MB | 1.6/12 MB | 29 kB | 32/68 kB
                                                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-core/10.1.30/tomcat-embed-core-10.1.30.jar (3.6 MB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/io/smallrye/jandex/3.1.2/jandex-3.1.2.jar
Progress (4): 0.9/2.2 MB | 1.6/12 MB | 29 kB | 32/68 kB
Progress (4): 0.9/2.2 MB | 1.6/12 MB | 29 kB | 49/68 kB
Progress (4): 0.9/2.2 MB | 1.6/12 MB | 29 kB | 49/68 kB
Progress (4): 0.9/2.2 MB | 1.6/12 MB | 29 kB | 49/68 kB
Progress (4): 0.9/2.2 MB | 1.6/12 MB | 29 kB | 49/68 kB
Progress (4): 0.9/2.2 MB | 1.6/12 MB | 29 kB | 61/68 kB
Progress (4): 0.9/2.2 MB | 1.6/12 MB | 29 kB | 61/68 kB
Progress (4): 0.9/2.2 MB | 1.6/12 MB | 29 kB | 68 kB   
Progress (4): 0.9/2.2 MB | 1.6/12 MB | 29 kB | 68 kB
Progress (4): 0.9/2.2 MB | 1.6/12 MB | 29 kB | 68 kB
Progress (4): 0.9/2.2 MB | 1.6/12 MB | 29 kB | 68 kB
Progress (4): 0.9/2.2 MB | 1.6/12 MB | 29 kB | 68 kB
Progress (4): 0.9/2.2 MB | 1.6/12 MB | 29 kB | 68 kB
Progress (4): 0.9/2.2 MB | 1.6/12 MB | 29 kB | 68 kB
Progress (4): 0.9/2.2 MB | 1.6/12 MB | 29 kB | 68 kB
Progress (4): 0.9/2.2 MB | 1.7/12 MB | 29 kB | 68 kB
                                                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/hibernate/common/hibernate-commons-annotations/6.0.6.Final/hibernate-commons-annotations-6.0.6.Final.jar (68 kB at 21 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/fasterxml/classmate/1.7.0/classmate-1.7.0.jar
Progress (3): 0.9/2.2 MB | 1.7/12 MB | 29 kB
Progress (3): 0.9/2.2 MB | 1.7/12 MB | 29 kB
Progress (3): 0.9/2.2 MB | 1.7/12 MB | 29 kB
Progress (3): 0.9/2.2 MB | 1.7/12 MB | 29 kB
Progress (3): 0.9/2.2 MB | 1.7/12 MB | 29 kB
Progress (3): 0.9/2.2 MB | 1.7/12 MB | 29 kB
Progress (3): 0.9/2.2 MB | 1.7/12 MB | 29 kB
Progress (3): 0.9/2.2 MB | 1.8/12 MB | 29 kB
Progress (3): 1.0/2.2 MB | 1.8/12 MB | 29 kB
Progress (3): 1.0/2.2 MB | 1.8/12 MB | 29 kB
Progress (3): 1.0/2.2 MB | 1.8/12 MB | 29 kB
Progress (3): 1.0/2.2 MB | 1.8/12 MB | 29 kB
Progress (3): 1.0/2.2 MB | 1.8/12 MB | 29 kB
Progress (3): 1.0/2.2 MB | 1.8/12 MB | 29 kB
Progress (3): 1.0/2.2 MB | 1.8/12 MB | 29 kB
Progress (4): 1.0/2.2 MB | 1.8/12 MB | 29 kB | 7.2/69 kB
Progress (4): 1.0/2.2 MB | 1.8/12 MB | 29 kB | 15/69 kB 
Progress (4): 1.0/2.2 MB | 1.8/12 MB | 29 kB | 32/69 kB
Progress (4): 1.0/2.2 MB | 1.8/12 MB | 29 kB | 32/69 kB
Progress (4): 1.0/2.2 MB | 1.8/12 MB | 29 kB | 32/69 kB
Progress (4): 1.0/2.2 MB | 1.9/12 MB | 29 kB | 32/69 kB
Progress (4): 1.0/2.2 MB | 1.9/12 MB | 29 kB | 32/69 kB
Progress (4): 1.0/2.2 MB | 1.9/12 MB | 29 kB | 32/69 kB
Progress (4): 1.0/2.2 MB | 1.9/12 MB | 29 kB | 48/69 kB
Progress (4): 1.0/2.2 MB | 1.9/12 MB | 29 kB | 48/69 kB
Progress (4): 1.0/2.2 MB | 1.9/12 MB | 29 kB | 65/69 kB
Progress (4): 1.0/2.2 MB | 1.9/12 MB | 29 kB | 69 kB   
Progress (4): 1.0/2.2 MB | 1.9/12 MB | 29 kB | 69 kB
Progress (4): 1.0/2.2 MB | 1.9/12 MB | 29 kB | 69 kB
Progress (4): 1.0/2.2 MB | 1.9/12 MB | 29 kB | 69 kB
Progress (4): 1.1/2.2 MB | 1.9/12 MB | 29 kB | 69 kB
Progress (4): 1.1/2.2 MB | 1.9/12 MB | 29 kB | 69 kB
Progress (4): 1.1/2.2 MB | 1.9/12 MB | 29 kB | 69 kB
Progress (4): 1.1/2.2 MB | 1.9/12 MB | 29 kB | 69 kB
Progress (4): 1.1/2.2 MB | 2.0/12 MB | 29 kB | 69 kB
Progress (4): 1.1/2.2 MB | 2.0/12 MB | 29 kB | 69 kB
Progress (4): 1.1/2.2 MB | 2.0/12 MB | 29 kB | 69 kB
                                                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/fasterxml/classmate/1.7.0/classmate-1.7.0.jar (69 kB at 21 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.14.19/byte-buddy-1.14.19.jar
Progress (3): 1.1/2.2 MB | 2.0/12 MB | 29 kB
Progress (3): 1.1/2.2 MB | 2.0/12 MB | 29 kB
Progress (3): 1.1/2.2 MB | 2.0/12 MB | 29 kB
Progress (3): 1.1/2.2 MB | 2.0/12 MB | 29 kB
Progress (3): 1.1/2.2 MB | 2.0/12 MB | 29 kB
Progress (3): 1.1/2.2 MB | 2.0/12 MB | 29 kB
Progress (3): 1.1/2.2 MB | 2.0/12 MB | 29 kB
Progress (3): 1.1/2.2 MB | 2.1/12 MB | 29 kB
Progress (3): 1.2/2.2 MB | 2.1/12 MB | 29 kB
Progress (3): 1.2/2.2 MB | 2.1/12 MB | 29 kB
Progress (4): 1.2/2.2 MB | 2.1/12 MB | 29 kB | 0/4.2 MB
Progress (4): 1.2/2.2 MB | 2.1/12 MB | 29 kB | 0/4.2 MB
Progress (4): 1.2/2.2 MB | 2.1/12 MB | 29 kB | 0/4.2 MB
Progress (4): 1.2/2.2 MB | 2.1/12 MB | 29 kB | 0/4.2 MB
Progress (4): 1.2/2.2 MB | 2.1/12 MB | 29 kB | 0/4.2 MB
Progress (4): 1.2/2.2 MB | 2.1/12 MB | 29 kB | 0/4.2 MB
Progress (4): 1.2/2.2 MB | 2.1/12 MB | 29 kB | 0/4.2 MB
Progress (4): 1.2/2.2 MB | 2.1/12 MB | 29 kB | 0/4.2 MB
Progress (4): 1.2/2.2 MB | 2.2/12 MB | 29 kB | 0/4.2 MB
Progress (4): 1.2/2.2 MB | 2.2/12 MB | 29 kB | 0/4.2 MB
Progress (4): 1.2/2.2 MB | 2.2/12 MB | 29 kB | 0/4.2 MB
Progress (4): 1.2/2.2 MB | 2.2/12 MB | 29 kB | 0/4.2 MB
Progress (4): 1.2/2.2 MB | 2.2/12 MB | 29 kB | 0/4.2 MB
Progress (4): 1.2/2.2 MB | 2.2/12 MB | 29 kB | 0/4.2 MB
Progress (4): 1.2/2.2 MB | 2.2/12 MB | 29 kB | 0/4.2 MB
Progress (4): 1.2/2.2 MB | 2.2/12 MB | 29 kB | 0/4.2 MB
Progress (4): 1.2/2.2 MB | 2.2/12 MB | 29 kB | 0.1/4.2 MB
Progress (4): 1.2/2.2 MB | 2.2/12 MB | 29 kB | 0.1/4.2 MB
Progress (4): 1.2/2.2 MB | 2.2/12 MB | 29 kB | 0.1/4.2 MB
Progress (4): 1.2/2.2 MB | 2.2/12 MB | 29 kB | 0.1/4.2 MB
Progress (4): 1.2/2.2 MB | 2.2/12 MB | 29 kB | 0.1/4.2 MB
Progress (4): 1.3/2.2 MB | 2.2/12 MB | 29 kB | 0.1/4.2 MB
Progress (4): 1.3/2.2 MB | 2.3/12 MB | 29 kB | 0.1/4.2 MB
Progress (4): 1.3/2.2 MB | 2.3/12 MB | 29 kB | 0.1/4.2 MB

Progress (4): 1.3/2.2 MB | 2.3/12 MB | 29 kB | 0.1/4.2 MB
Progress (4): 1.3/2.2 MB | 2.3/12 MB | 29 kB | 0.1/4.2 MB
Progress (4): 1.3/2.2 MB | 2.3/12 MB | 29 kB | 0.1/4.2 MB
Progress (4): 1.3/2.2 MB | 2.3/12 MB | 29 kB | 0.1/4.2 MB
Progress (4): 1.3/2.2 MB | 2.3/12 MB | 29 kB | 0.1/4.2 MB
Progress (4): 1.3/2.2 MB | 2.3/12 MB | 29 kB | 0.1/4.2 MB
Progress (4): 1.3/2.2 MB | 2.3/12 MB | 29 kB | 0.1/4.2 MB
Progress (4): 1.3/2.2 MB | 2.3/12 MB | 29 kB | 0.1/4.2 MB
Progress (5): 1.3/2.2 MB | 2.3/12 MB | 29 kB | 0.1/4.2 MB | 7.7/327 kB
Progress (5): 1.3/2.2 MB | 2.3/12 MB | 29 kB | 0.1/4.2 MB | 16/327 kB 
Progress (5): 1.3/2.2 MB | 2.3/12 MB | 29 kB | 0.1/4.2 MB | 28/327 kB
                                                                     
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/transaction/jakarta.transaction-api/2.0.1/jakarta.transaction-api-2.0.1.jar (29 kB at 8.5 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-runtime/4.0.5/jaxb-runtime-4.0.5.jar
Progress (4): 1.3/2.2 MB | 2.4/12 MB | 0.1/4.2 MB | 28/327 kB
Progress (4): 1.3/2.2 MB | 2.4/12 MB | 0.1/4.2 MB | 44/327 kB
Progress (4): 1.3/2.2 MB | 2.4/12 MB | 0.1/4.2 MB | 44/327 kB
Progress (4): 1.3/2.2 MB | 2.4/12 MB | 0.1/4.2 MB | 44/327 kB
Progress (4): 1.3/2.2 MB | 2.4/12 MB | 0.1/4.2 MB | 49/327 kB
Progress (4): 1.3/2.2 MB | 2.4/12 MB | 0.1/4.2 MB | 49/327 kB
Progress (4): 1.3/2.2 MB | 2.4/12 MB | 0.1/4.2 MB | 49/327 kB
Progress (4): 1.3/2.2 MB | 2.4/12 MB | 0.1/4.2 MB | 66/327 kB
Progress (4): 1.3/2.2 MB | 2.4/12 MB | 0.1/4.2 MB | 66/327 kB
Progress (4): 1.3/2.2 MB | 2.4/12 MB | 0.1/4.2 MB | 66/327 kB
Progress (4): 1.3/2.2 MB | 2.4/12 MB | 0.1/4.2 MB | 66/327 kB
Progress (4): 1.3/2.2 MB | 2.4/12 MB | 0.1/4.2 MB | 66/327 kB
Progress (4): 1.3/2.2 MB | 2.4/12 MB | 0.1/4.2 MB | 66/327 kB
Progress (4): 1.4/2.2 MB | 2.4/12 MB | 0.1/4.2 MB | 66/327 kB
Progress (4): 1.4/2.2 MB | 2.4/12 MB | 0.1/4.2 MB | 82/327 kB
Progress (4): 1.4/2.2 MB | 2.4/12 MB | 0.1/4.2 MB | 82/327 kB
Progress (4): 1.4/2.2 MB | 2.5/12 MB | 0.1/4.2 MB | 82/327 kB
Progress (4): 1.4/2.2 MB | 2.5/12 MB | 0.1/4.2 MB | 82/327 kB
Progress (4): 1.4/2.2 MB | 2.5/12 MB | 0.1/4.2 MB | 98/327 kB
Progress (4): 1.4/2.2 MB | 2.5/12 MB | 0.2/4.2 MB | 98/327 kB
Progress (4): 1.4/2.2 MB | 2.5/12 MB | 0.2/4.2 MB | 98/327 kB
Progress (4): 1.4/2.2 MB | 2.5/12 MB | 0.2/4.2 MB | 98/327 kB
Progress (4): 1.4/2.2 MB | 2.5/12 MB | 0.2/4.2 MB | 98/327 kB
Progress (4): 1.4/2.2 MB | 2.5/12 MB | 0.2/4.2 MB | 115/327 kB
Progress (4): 1.4/2.2 MB | 2.5/12 MB | 0.2/4.2 MB | 115/327 kB
Progress (4): 1.4/2.2 MB | 2.5/12 MB | 0.2/4.2 MB | 115/327 kB
Progress (4): 1.4/2.2 MB | 2.5/12 MB | 0.2/4.2 MB | 115/327 kB
Progress (4): 1.4/2.2 MB | 2.5/12 MB | 0.2/4.2 MB | 131/327 kB
Progress (4): 1.4/2.2 MB | 2.5/12 MB | 0.2/4.2 MB | 131/327 kB
Progress (4): 1.4/2.2 MB | 2.5/12 MB | 0.2/4.2 MB | 131/327 kB
Progress (4): 1.4/2.2 MB | 2.5/12 MB | 0.2/4.2 MB | 131/327 kB
Progress (4): 1.4/2.2 MB | 2.5/12 MB | 0.2/4.2 MB | 131/327 kB
Progress (4): 1.4/2.2 MB | 2.5/12 MB | 0.2/4.2 MB | 148/327 kB
Progress (4): 1.4/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 148/327 kB
Progress (4): 1.4/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 148/327 kB
Progress (4): 1.4/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 148/327 kB
Progress (4): 1.4/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 148/327 kB
Progress (4): 1.4/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 164/327 kB
Progress (4): 1.4/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 164/327 kB
Progress (4): 1.5/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 164/327 kB
Progress (4): 1.5/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 180/327 kB
Progress (4): 1.5/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 180/327 kB
Progress (4): 1.5/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 197/327 kB
Progress (4): 1.5/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 197/327 kB
Progress (5): 1.5/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 197/327 kB | 3.2/920 kB
Progress (5): 1.5/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 197/327 kB | 11/920 kB 
Progress (5): 1.5/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 197/327 kB | 11/920 kB
Progress (5): 1.5/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 197/327 kB | 28/920 kB
Progress (5): 1.5/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 197/327 kB | 28/920 kB
Progress (5): 1.5/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 197/327 kB | 28/920 kB
Progress (5): 1.5/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 197/327 kB | 44/920 kB
Progress (5): 1.5/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 213/327 kB | 44/920 kB
Progress (5): 1.5/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 213/327 kB | 61/920 kB
Progress (5): 1.5/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 213/327 kB | 61/920 kB
Progress (5): 1.5/2.2 MB | 2.6/12 MB | 0.2/4.2 MB | 213/327 kB | 61/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.2/4.2 MB | 213/327 kB | 61/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 213/327 kB | 61/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 229/327 kB | 61/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 229/327 kB | 61/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 229/327 kB | 61/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 229/327 kB | 61/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 229/327 kB | 61/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 246/327 kB | 61/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 246/327 kB | 61/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 246/327 kB | 61/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 262/327 kB | 61/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 262/327 kB | 61/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 262/327 kB | 61/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 262/327 kB | 61/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 279/327 kB | 61/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 279/327 kB | 77/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 279/327 kB | 77/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 295/327 kB | 77/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 295/327 kB | 77/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 295/327 kB | 93/920 kB
Progress (5): 1.5/2.2 MB | 2.7/12 MB | 0.3/4.2 MB | 295/327 kB | 110/920 kB
Progress (5): 1.5/2.2 MB | 2.8/12 MB | 0.3/4.2 MB | 295/327 kB | 110/920 kB
Progress (5): 1.6/2.2 MB | 2.8/12 MB | 0.3/4.2 MB | 295/327 kB | 110/920 kB
Progress (5): 1.6/2.2 MB | 2.8/12 MB | 0.3/4.2 MB | 295/327 kB | 110/920 kB
Progress (5): 1.6/2.2 MB | 2.8/12 MB | 0.3/4.2 MB | 295/327 kB | 126/920 kB
Progress (5): 1.6/2.2 MB | 2.8/12 MB | 0.3/4.2 MB | 311/327 kB | 126/920 kB
Progress (5): 1.6/2.2 MB | 2.8/12 MB | 0.3/4.2 MB | 311/327 kB | 126/920 kB
Progress (5): 1.6/2.2 MB | 2.8/12 MB | 0.3/4.2 MB | 311/327 kB | 126/920 kB
Progress (5): 1.6/2.2 MB | 2.8/12 MB | 0.3/4.2 MB | 311/327 kB | 126/920 kB
Progress (5): 1.6/2.2 MB | 2.8/12 MB | 0.3/4.2 MB | 311/327 kB | 126/920 kB
Progress (5): 1.6/2.2 MB | 2.8/12 MB | 0.3/4.2 MB | 311/327 kB | 126/920 kB
Progress (5): 1.6/2.2 MB | 2.8/12 MB | 0.3/4.2 MB | 311/327 kB | 126/920 kB
Progress (5): 1.6/2.2 MB | 2.8/12 MB | 0.3/4.2 MB | 327 kB | 126/920 kB    
Progress (5): 1.6/2.2 MB | 2.8/12 MB | 0.3/4.2 MB | 327 kB | 126/920 kB
Progress (5): 1.6/2.2 MB | 2.8/12 MB | 0.3/4.2 MB | 327 kB | 126/920 kB
Progress (5): 1.6/2.2 MB | 2.8/12 MB | 0.4/4.2 MB | 327 kB | 126/920 kB
Progress (5): 1.6/2.2 MB | 2.8/12 MB | 0.4/4.2 MB | 327 kB | 126/920 kB
Progress (5): 1.6/2.2 MB | 2.8/12 MB | 0.4/4.2 MB | 327 kB | 126/920 kB
Progress (5): 1.6/2.2 MB | 2.8/12 MB | 0.4/4.2 MB | 327 kB | 142/920 kB
Progress (5): 1.6/2.2 MB | 2.8/12 MB | 0.4/4.2 MB | 327 kB | 142/920 kB
Progress (5): 1.6/2.2 MB | 2.9/12 MB | 0.4/4.2 MB | 327 kB | 142/920 kB
Progress (5): 1.6/2.2 MB | 2.9/12 MB | 0.4/4.2 MB | 327 kB | 142/920 kB
Progress (5): 1.6/2.2 MB | 2.9/12 MB | 0.4/4.2 MB | 327 kB | 159/920 kB
Progress (5): 1.6/2.2 MB | 2.9/12 MB | 0.4/4.2 MB | 327 kB | 159/920 kB
Progress (5): 1.6/2.2 MB | 2.9/12 MB | 0.4/4.2 MB | 327 kB | 175/920 kB
Progress (5): 1.6/2.2 MB | 2.9/12 MB | 0.4/4.2 MB | 327 kB | 192/920 kB
Progress (5): 1.6/2.2 MB | 2.9/12 MB | 0.4/4.2 MB | 327 kB | 192/920 kB
Progress (5): 1.6/2.2 MB | 2.9/12 MB | 0.4/4.2 MB | 327 kB | 192/920 kB
Progress (5): 1.6/2.2 MB | 2.9/12 MB | 0.4/4.2 MB | 327 kB | 192/920 kB
Progress (5): 1.6/2.2 MB | 2.9/12 MB | 0.4/4.2 MB | 327 kB | 192/920 kB
Progress (5): 1.6/2.2 MB | 2.9/12 MB | 0.4/4.2 MB | 327 kB | 192/920 kB
Progress (5): 1.7/2.2 MB | 2.9/12 MB | 0.4/4.2 MB | 327 kB | 192/920 kB
Progress (5): 1.7/2.2 MB | 2.9/12 MB | 0.4/4.2 MB | 327 kB | 192/920 kB
                                                                       
Downloaded from central: https://repo.maven.apache.org/maven2/io/smallrye/jandex/3.1.2/jandex-3.1.2.jar (327 kB at 90 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-core/4.0.5/jaxb-core-4.0.5.jar
Progress (4): 1.7/2.2 MB | 2.9/12 MB | 0.4/4.2 MB | 192/920 kB
Progress (4): 1.7/2.2 MB | 2.9/12 MB | 0.4/4.2 MB | 192/920 kB
Progress (4): 1.7/2.2 MB | 2.9/12 MB | 0.4/4.2 MB | 192/920 kB
Progress (4): 1.7/2.2 MB | 2.9/12 MB | 0.4/4.2 MB | 208/920 kB
Progress (4): 1.7/2.2 MB | 2.9/12 MB | 0.4/4.2 MB | 208/920 kB
Progress (4): 1.7/2.2 MB | 2.9/12 MB | 0.4/4.2 MB | 224/920 kB
Progress (4): 1.7/2.2 MB | 3.0/12 MB | 0.4/4.2 MB | 224/920 kB
Progress (4): 1.7/2.2 MB | 3.0/12 MB | 0.4/4.2 MB | 224/920 kB
Progress (4): 1.7/2.2 MB | 3.0/12 MB | 0.4/4.2 MB | 241/920 kB
Progress (4): 1.7/2.2 MB | 3.0/12 MB | 0.4/4.2 MB | 241/920 kB
Progress (4): 1.7/2.2 MB | 3.0/12 MB | 0.4/4.2 MB | 241/920 kB
Progress (4): 1.7/2.2 MB | 3.0/12 MB | 0.4/4.2 MB | 257/920 kB
Progress (4): 1.7/2.2 MB | 3.0/12 MB | 0.4/4.2 MB | 273/920 kB
Progress (4): 1.7/2.2 MB | 3.0/12 MB | 0.4/4.2 MB | 273/920 kB
Progress (4): 1.7/2.2 MB | 3.0/12 MB | 0.4/4.2 MB | 273/920 kB
Progress (4): 1.7/2.2 MB | 3.0/12 MB | 0.5/4.2 MB | 273/920 kB
Progress (4): 1.7/2.2 MB | 3.0/12 MB | 0.5/4.2 MB | 273/920 kB
Progress (4): 1.7/2.2 MB | 3.0/12 MB | 0.5/4.2 MB | 273/920 kB
Progress (4): 1.7/2.2 MB | 3.0/12 MB | 0.5/4.2 MB | 273/920 kB
Progress (4): 1.7/2.2 MB | 3.0/12 MB | 0.5/4.2 MB | 273/920 kB
Progress (5): 1.7/2.2 MB | 3.0/12 MB | 0.5/4.2 MB | 273/920 kB | 7.7/139 kB
Progress (5): 1.7/2.2 MB | 3.0/12 MB | 0.5/4.2 MB | 273/920 kB | 16/139 kB 
Progress (5): 1.7/2.2 MB | 3.0/12 MB | 0.5/4.2 MB | 273/920 kB | 16/139 kB
Progress (5): 1.8/2.2 MB | 3.0/12 MB | 0.5/4.2 MB | 273/920 kB | 16/139 kB
Progress (5): 1.8/2.2 MB | 3.0/12 MB | 0.5/4.2 MB | 273/920 kB | 28/139 kB
Progress (5): 1.8/2.2 MB | 3.0/12 MB | 0.5/4.2 MB | 290/920 kB | 28/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 290/920 kB | 28/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 290/920 kB | 28/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 306/920 kB | 28/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 306/920 kB | 28/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 306/920 kB | 44/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 306/920 kB | 44/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 323/920 kB | 44/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 323/920 kB | 44/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 323/920 kB | 44/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 323/920 kB | 44/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 323/920 kB | 44/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 339/920 kB | 44/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 339/920 kB | 44/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 339/920 kB | 61/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 339/920 kB | 61/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 339/920 kB | 61/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 339/920 kB | 61/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 339/920 kB | 61/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 339/920 kB | 61/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 355/920 kB | 61/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 355/920 kB | 77/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 355/920 kB | 77/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 355/920 kB | 77/139 kB
Progress (5): 1.8/2.2 MB | 3.1/12 MB | 0.5/4.2 MB | 355/920 kB | 77/139 kB
Progress (5): 1.8/2.2 MB | 3.2/12 MB | 0.5/4.2 MB | 355/920 kB | 77/139 kB
Progress (5): 1.8/2.2 MB | 3.2/12 MB | 0.5/4.2 MB | 355/920 kB | 93/139 kB
Progress (5): 1.8/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 355/920 kB | 93/139 kB
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 355/920 kB | 93/139 kB
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 372/920 kB | 93/139 kB
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 372/920 kB | 110/139 kB
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 372/920 kB | 110/139 kB
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 372/920 kB | 110/139 kB
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 372/920 kB | 126/139 kB
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 372/920 kB | 126/139 kB
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 372/920 kB | 126/139 kB
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 388/920 kB | 126/139 kB
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 388/920 kB | 126/139 kB
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 388/920 kB | 126/139 kB
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 388/920 kB | 126/139 kB
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 388/920 kB | 126/139 kB
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 405/920 kB | 126/139 kB
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 421/920 kB | 126/139 kB
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 421/920 kB | 139 kB    
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 421/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 421/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 421/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.2/12 MB | 0.6/4.2 MB | 437/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.3/12 MB | 0.6/4.2 MB | 437/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.3/12 MB | 0.6/4.2 MB | 437/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.3/12 MB | 0.6/4.2 MB | 437/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.3/12 MB | 0.6/4.2 MB | 454/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.3/12 MB | 0.6/4.2 MB | 454/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.3/12 MB | 0.6/4.2 MB | 470/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.3/12 MB | 0.6/4.2 MB | 470/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.3/12 MB | 0.6/4.2 MB | 470/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.3/12 MB | 0.6/4.2 MB | 486/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.3/12 MB | 0.6/4.2 MB | 486/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.3/12 MB | 0.6/4.2 MB | 486/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.3/12 MB | 0.6/4.2 MB | 486/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.3/12 MB | 0.6/4.2 MB | 486/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.3/12 MB | 0.6/4.2 MB | 503/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.3/12 MB | 0.6/4.2 MB | 519/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.3/12 MB | 0.6/4.2 MB | 519/920 kB | 139 kB
Progress (5): 1.9/2.2 MB | 3.3/12 MB | 0.6/4.2 MB | 519/920 kB | 139 kB
                                                                       
Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-core/4.0.5/jaxb-core-4.0.5.jar (139 kB at 36 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/angus/angus-activation/2.0.2/angus-activation-2.0.2.jar
Progress (4): 1.9/2.2 MB | 3.3/12 MB | 0.7/4.2 MB | 519/920 kB
Progress (4): 1.9/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 519/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 519/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 536/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 536/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 540/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 557/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 557/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 557/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 557/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 557/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 573/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 589/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 589/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 589/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 589/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 589/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 606/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 622/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 622/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 622/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 622/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 639/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 639/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 639/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 639/920 kB
Progress (4): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 655/920 kB
Progress (5): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 655/920 kB | 7.7/27 kB
Progress (5): 2.0/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 655/920 kB | 16/27 kB 
Progress (5): 2.1/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 655/920 kB | 16/27 kB
Progress (5): 2.1/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 655/920 kB | 16/27 kB
Progress (5): 2.1/2.2 MB | 3.4/12 MB | 0.7/4.2 MB | 655/920 kB | 27 kB   
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.7/4.2 MB | 655/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.7/4.2 MB | 655/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.7/4.2 MB | 671/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.7/4.2 MB | 688/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.7/4.2 MB | 688/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.7/4.2 MB | 688/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.7/4.2 MB | 704/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.8/4.2 MB | 704/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.8/4.2 MB | 704/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.8/4.2 MB | 704/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.8/4.2 MB | 704/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.8/4.2 MB | 721/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.8/4.2 MB | 721/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.8/4.2 MB | 737/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.8/4.2 MB | 737/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.8/4.2 MB | 737/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.8/4.2 MB | 753/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.8/4.2 MB | 753/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.8/4.2 MB | 753/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.8/4.2 MB | 753/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.8/4.2 MB | 770/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.8/4.2 MB | 786/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.5/12 MB | 0.8/4.2 MB | 786/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.6/12 MB | 0.8/4.2 MB | 786/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.6/12 MB | 0.8/4.2 MB | 786/920 kB | 27 kB
Progress (5): 2.1/2.2 MB | 3.6/12 MB | 0.8/4.2 MB | 802/920 kB | 27 kB
Progress (5): 2.2/2.2 MB | 3.6/12 MB | 0.8/4.2 MB | 802/920 kB | 27 kB
Progress (5): 2.2/2.2 MB | 3.6/12 MB | 0.8/4.2 MB | 802/920 kB | 27 kB
Progress (5): 2.2/2.2 MB | 3.6/12 MB | 0.8/4.2 MB | 819/920 kB | 27 kB
Progress (5): 2.2/2.2 MB | 3.6/12 MB | 0.8/4.2 MB | 819/920 kB | 27 kB
Progress (5): 2.2/2.2 MB | 3.6/12 MB | 0.8/4.2 MB | 835/920 kB | 27 kB
Progress (5): 2.2 MB | 3.6/12 MB | 0.8/4.2 MB | 835/920 kB | 27 kB    
Progress (5): 2.2 MB | 3.6/12 MB | 0.8/4.2 MB | 835/920 kB | 27 kB
Progress (5): 2.2 MB | 3.6/12 MB | 0.8/4.2 MB | 835/920 kB | 27 kB
Progress (5): 2.2 MB | 3.6/12 MB | 0.8/4.2 MB | 835/920 kB | 27 kB
Progress (5): 2.2 MB | 3.6/12 MB | 0.9/4.2 MB | 835/920 kB | 27 kB
Progress (5): 2.2 MB | 3.6/12 MB | 0.9/4.2 MB | 852/920 kB | 27 kB
Progress (5): 2.2 MB | 3.6/12 MB | 0.9/4.2 MB | 852/920 kB | 27 kB
Progress (5): 2.2 MB | 3.6/12 MB | 0.9/4.2 MB | 868/920 kB | 27 kB
Progress (5): 2.2 MB | 3.6/12 MB | 0.9/4.2 MB | 884/920 kB | 27 kB
Progress (5): 2.2 MB | 3.6/12 MB | 0.9/4.2 MB | 884/920 kB | 27 kB
Progress (5): 2.2 MB | 3.6/12 MB | 0.9/4.2 MB | 884/920 kB | 27 kB
Progress (5): 2.2 MB | 3.6/12 MB | 0.9/4.2 MB | 901/920 kB | 27 kB
Progress (5): 2.2 MB | 3.7/12 MB | 0.9/4.2 MB | 901/920 kB | 27 kB
                                                                  
Downloaded from central: https://repo.maven.apache.org/maven2/org/aspectj/aspectjweaver/1.9.22.1/aspectjweaver-1.9.22.1.jar (2.2 MB at 542 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/txw2/4.0.5/txw2-4.0.5.jar
Progress (4): 3.7/12 MB | 0.9/4.2 MB | 917/920 kB | 27 kB
Progress (4): 3.7/12 MB | 0.9/4.2 MB | 920 kB | 27 kB    
Progress (4): 3.7/12 MB | 0.9/4.2 MB | 920 kB | 27 kB
Progress (4): 3.7/12 MB | 0.9/4.2 MB | 920 kB | 27 kB
Progress (4): 3.7/12 MB | 0.9/4.2 MB | 920 kB | 27 kB
Progress (4): 3.7/12 MB | 0.9/4.2 MB | 920 kB | 27 kB
Progress (4): 3.7/12 MB | 0.9/4.2 MB | 920 kB | 27 kB
Progress (4): 3.7/12 MB | 0.9/4.2 MB | 920 kB | 27 kB
Progress (4): 3.7/12 MB | 0.9/4.2 MB | 920 kB | 27 kB
Progress (4): 3.7/12 MB | 0.9/4.2 MB | 920 kB | 27 kB
Progress (4): 3.7/12 MB | 1.0/4.2 MB | 920 kB | 27 kB
Progress (4): 3.8/12 MB | 1.0/4.2 MB | 920 kB | 27 kB
Progress (4): 3.8/12 MB | 1.0/4.2 MB | 920 kB | 27 kB
Progress (4): 3.8/12 MB | 1.0/4.2 MB | 920 kB | 27 kB
Progress (4): 3.8/12 MB | 1.0/4.2 MB | 920 kB | 27 kB
Progress (5): 3.8/12 MB | 1.0/4.2 MB | 920 kB | 27 kB | 7.7/73 kB
Progress (5): 3.8/12 MB | 1.0/4.2 MB | 920 kB | 27 kB | 16/73 kB 
Progress (5): 3.8/12 MB | 1.0/4.2 MB | 920 kB | 27 kB | 24/73 kB
                                                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/jaxb-runtime/4.0.5/jaxb-runtime-4.0.5.jar (920 kB at 227 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/sun/istack/istack-commons-runtime/4.1.2/istack-commons-runtime-4.1.2.jar
Progress (4): 3.8/12 MB | 1.0/4.2 MB | 27 kB | 24/73 kB
Progress (4): 3.8/12 MB | 1.0/4.2 MB | 27 kB | 24/73 kB
Progress (4): 3.8/12 MB | 1.0/4.2 MB | 27 kB | 40/73 kB
Progress (4): 3.8/12 MB | 1.0/4.2 MB | 27 kB | 40/73 kB
Progress (4): 3.8/12 MB | 1.0/4.2 MB | 27 kB | 40/73 kB
Progress (4): 3.8/12 MB | 1.0/4.2 MB | 27 kB | 40/73 kB
Progress (4): 3.8/12 MB | 1.0/4.2 MB | 27 kB | 57/73 kB
Progress (4): 3.9/12 MB | 1.0/4.2 MB | 27 kB | 57/73 kB
Progress (4): 3.9/12 MB | 1.0/4.2 MB | 27 kB | 57/73 kB
Progress (4): 3.9/12 MB | 1.0/4.2 MB | 27 kB | 73/73 kB
Progress (4): 3.9/12 MB | 1.0/4.2 MB | 27 kB | 73/73 kB
Progress (4): 3.9/12 MB | 1.0/4.2 MB | 27 kB | 73 kB   
Progress (4): 3.9/12 MB | 1.0/4.2 MB | 27 kB | 73 kB
Progress (4): 3.9/12 MB | 1.0/4.2 MB | 27 kB | 73 kB
Progress (4): 3.9/12 MB | 1.0/4.2 MB | 27 kB | 73 kB
Progress (4): 3.9/12 MB | 1.0/4.2 MB | 27 kB | 73 kB
Progress (4): 3.9/12 MB | 1.0/4.2 MB | 27 kB | 73 kB
Progress (4): 3.9/12 MB | 1.1/4.2 MB | 27 kB | 73 kB
                                                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/glassfish/jaxb/txw2/4.0.5/txw2-4.0.5.jar (73 kB at 18 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/jakarta/inject/jakarta.inject-api/2.0.1/jakarta.inject-api-2.0.1.jar
Progress (4): 3.9/12 MB | 1.1/4.2 MB | 27 kB | 7.7/26 kB
Progress (4): 3.9/12 MB | 1.1/4.2 MB | 27 kB | 16/26 kB 
Progress (4): 4.0/12 MB | 1.1/4.2 MB | 27 kB | 16/26 kB
Progress (4): 4.0/12 MB | 1.1/4.2 MB | 27 kB | 26 kB   
Progress (4): 4.0/12 MB | 1.1/4.2 MB | 27 kB | 26 kB
Progress (4): 4.0/12 MB | 1.1/4.2 MB | 27 kB | 26 kB
Progress (4): 4.0/12 MB | 1.1/4.2 MB | 27 kB | 26 kB
Progress (4): 4.0/12 MB | 1.1/4.2 MB | 27 kB | 26 kB
Progress (4): 4.0/12 MB | 1.1/4.2 MB | 27 kB | 26 kB
Progress (4): 4.0/12 MB | 1.1/4.2 MB | 27 kB | 26 kB
Progress (4): 4.0/12 MB | 1.1/4.2 MB | 27 kB | 26 kB
Progress (4): 4.0/12 MB | 1.1/4.2 MB | 27 kB | 26 kB
Progress (4): 4.1/12 MB | 1.1/4.2 MB | 27 kB | 26 kB
Progress (4): 4.1/12 MB | 1.1/4.2 MB | 27 kB | 26 kB
Progress (4): 4.1/12 MB | 1.1/4.2 MB | 27 kB | 26 kB
Progress (4): 4.1/12 MB | 1.1/4.2 MB | 27 kB | 26 kB
Progress (5): 4.1/12 MB | 1.1/4.2 MB | 27 kB | 26 kB | 3.2/11 kB
Progress (5): 4.1/12 MB | 1.1/4.2 MB | 27 kB | 26 kB | 11 kB    
Progress (5): 4.1/12 MB | 1.1/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.1/12 MB | 1.1/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.1/12 MB | 1.1/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.1/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.1/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.1/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.2/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.2/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.2/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.2/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.2/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.2/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.2/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.2/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.2/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.2/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.3/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.3/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.3/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.3/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.3/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.3/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.3/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.3/12 MB | 1.2/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.3/12 MB | 1.3/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.4/12 MB | 1.3/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.4/12 MB | 1.3/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.4/12 MB | 1.3/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.4/12 MB | 1.3/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.4/12 MB | 1.3/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.4/12 MB | 1.3/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.4/12 MB | 1.3/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.4/12 MB | 1.3/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.4/12 MB | 1.3/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.4/12 MB | 1.3/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.5/12 MB | 1.3/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.5/12 MB | 1.3/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.5/12 MB | 1.3/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.5/12 MB | 1.3/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.5/12 MB | 1.3/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.5/12 MB | 1.4/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.5/12 MB | 1.4/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.5/12 MB | 1.4/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.5/12 MB | 1.4/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.6/12 MB | 1.4/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.6/12 MB | 1.4/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.6/12 MB | 1.4/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.6/12 MB | 1.4/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.6/12 MB | 1.4/4.2 MB | 27 kB | 26 kB | 11 kB
Progress (5): 4.6/12 MB | 1.4/4.2 MB | 27 kB | 26 kB | 11 kB
                                                            
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/angus/angus-activation/2.0.2/angus-activation-2.0.2.jar (27 kB at 6.3 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.13.0/antlr4-runtime-4.13.0.jar
Progress (4): 4.6/12 MB | 1.4/4.2 MB | 26 kB | 11 kB
Progress (4): 4.6/12 MB | 1.4/4.2 MB | 26 kB | 11 kB
Progress (4): 4.6/12 MB | 1.4/4.2 MB | 26 kB | 11 kB
Progress (4): 4.7/12 MB | 1.4/4.2 MB | 26 kB | 11 kB
Progress (4): 4.7/12 MB | 1.4/4.2 MB | 26 kB | 11 kB
Progress (4): 4.7/12 MB | 1.4/4.2 MB | 26 kB | 11 kB
Progress (4): 4.7/12 MB | 1.4/4.2 MB | 26 kB | 11 kB
Progress (4): 4.7/12 MB | 1.5/4.2 MB | 26 kB | 11 kB
Progress (4): 4.7/12 MB | 1.5/4.2 MB | 26 kB | 11 kB
Progress (4): 4.7/12 MB | 1.5/4.2 MB | 26 kB | 11 kB
Progress (4): 4.7/12 MB | 1.5/4.2 MB | 26 kB | 11 kB
Progress (4): 4.7/12 MB | 1.5/4.2 MB | 26 kB | 11 kB
Progress (4): 4.8/12 MB | 1.5/4.2 MB | 26 kB | 11 kB
Progress (4): 4.8/12 MB | 1.5/4.2 MB | 26 kB | 11 kB
Progress (4): 4.8/12 MB | 1.5/4.2 MB | 26 kB | 11 kB
Progress (4): 4.8/12 MB | 1.5/4.2 MB | 26 kB | 11 kB
Progress (4): 4.8/12 MB | 1.5/4.2 MB | 26 kB | 11 kB
Progress (4): 4.8/12 MB | 1.5/4.2 MB | 26 kB | 11 kB
Progress (4): 4.8/12 MB | 1.5/4.2 MB | 26 kB | 11 kB
Progress (4): 4.8/12 MB | 1.5/4.2 MB | 26 kB | 11 kB
Progress (4): 4.8/12 MB | 1.5/4.2 MB | 26 kB | 11 kB
Progress (5): 4.8/12 MB | 1.5/4.2 MB | 26 kB | 11 kB | 7.7/326 kB
Progress (5): 4.8/12 MB | 1.5/4.2 MB | 26 kB | 11 kB | 16/326 kB 
Progress (5): 4.8/12 MB | 1.5/4.2 MB | 26 kB | 11 kB | 24/326 kB
Progress (5): 4.8/12 MB | 1.5/4.2 MB | 26 kB | 11 kB | 24/326 kB
Progress (5): 4.8/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 24/326 kB
Progress (5): 4.8/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 40/326 kB
Progress (5): 4.9/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 40/326 kB
Progress (5): 4.9/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 40/326 kB
Progress (5): 4.9/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 40/326 kB
Progress (5): 4.9/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 57/326 kB
Progress (5): 4.9/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 57/326 kB
Progress (5): 4.9/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 57/326 kB
Progress (5): 4.9/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 57/326 kB
Progress (5): 4.9/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 57/326 kB
Progress (5): 4.9/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 57/326 kB
Progress (5): 5.0/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 57/326 kB
Progress (5): 5.0/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 73/326 kB
Progress (5): 5.0/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 73/326 kB
Progress (5): 5.0/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 73/326 kB
Progress (5): 5.0/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 73/326 kB
Progress (5): 5.0/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 73/326 kB
Progress (5): 5.0/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 73/326 kB
Progress (5): 5.0/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 90/326 kB
Progress (5): 5.0/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 90/326 kB
Progress (5): 5.0/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 90/326 kB

Progress (5): 5.0/12 MB | 1.6/4.2 MB | 26 kB | 11 kB | 90/326 kB
Progress (5): 5.0/12 MB | 1.7/4.2 MB | 26 kB | 11 kB | 90/326 kB
Progress (5): 5.1/12 MB | 1.7/4.2 MB | 26 kB | 11 kB | 90/326 kB
                                                                
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/inject/jakarta.inject-api/2.0.1/jakarta.inject-api-2.0.1.jar (11 kB at 2.4 kB/s)
Progress (4): 5.1/12 MB | 1.7/4.2 MB | 26 kB | 106/326 kB
                                                         
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-jpa/3.3.4/spring-data-jpa-3.3.4.jar
Progress (4): 5.1/12 MB | 1.7/4.2 MB | 26 kB | 106/326 kB
Progress (4): 5.1/12 MB | 1.7/4.2 MB | 26 kB | 106/326 kB
Progress (4): 5.1/12 MB | 1.7/4.2 MB | 26 kB | 106/326 kB
Progress (4): 5.1/12 MB | 1.7/4.2 MB | 26 kB | 106/326 kB
Progress (4): 5.1/12 MB | 1.7/4.2 MB | 26 kB | 122/326 kB
Progress (4): 5.1/12 MB | 1.7/4.2 MB | 26 kB | 122/326 kB
Progress (4): 5.1/12 MB | 1.7/4.2 MB | 26 kB | 122/326 kB
Progress (4): 5.1/12 MB | 1.7/4.2 MB | 26 kB | 122/326 kB
Progress (4): 5.1/12 MB | 1.7/4.2 MB | 26 kB | 122/326 kB
Progress (4): 5.1/12 MB | 1.7/4.2 MB | 26 kB | 122/326 kB
Progress (4): 5.1/12 MB | 1.7/4.2 MB | 26 kB | 139/326 kB
Progress (4): 5.1/12 MB | 1.7/4.2 MB | 26 kB | 139/326 kB
Progress (4): 5.2/12 MB | 1.7/4.2 MB | 26 kB | 139/326 kB
Progress (4): 5.2/12 MB | 1.7/4.2 MB | 26 kB | 139/326 kB
Progress (4): 5.2/12 MB | 1.7/4.2 MB | 26 kB | 139/326 kB
Progress (4): 5.2/12 MB | 1.8/4.2 MB | 26 kB | 139/326 kB
Progress (4): 5.2/12 MB | 1.8/4.2 MB | 26 kB | 139/326 kB
Progress (4): 5.2/12 MB | 1.8/4.2 MB | 26 kB | 155/326 kB
Progress (4): 5.2/12 MB | 1.8/4.2 MB | 26 kB | 155/326 kB
Progress (4): 5.2/12 MB | 1.8/4.2 MB | 26 kB | 155/326 kB
Progress (4): 5.2/12 MB | 1.8/4.2 MB | 26 kB | 155/326 kB
Progress (4): 5.2/12 MB | 1.8/4.2 MB | 26 kB | 155/326 kB
Progress (4): 5.3/12 MB | 1.8/4.2 MB | 26 kB | 155/326 kB
Progress (4): 5.3/12 MB | 1.8/4.2 MB | 26 kB | 172/326 kB
Progress (4): 5.3/12 MB | 1.8/4.2 MB | 26 kB | 172/326 kB
Progress (4): 5.3/12 MB | 1.8/4.2 MB | 26 kB | 172/326 kB
Progress (4): 5.3/12 MB | 1.8/4.2 MB | 26 kB | 172/326 kB
Progress (4): 5.3/12 MB | 1.8/4.2 MB | 26 kB | 172/326 kB
Progress (5): 5.3/12 MB | 1.8/4.2 MB | 26 kB | 172/326 kB | 0/1.5 MB
Progress (5): 5.3/12 MB | 1.8/4.2 MB | 26 kB | 172/326 kB | 0/1.5 MB
Progress (5): 5.3/12 MB | 1.8/4.2 MB | 26 kB | 188/326 kB | 0/1.5 MB
Progress (5): 5.3/12 MB | 1.8/4.2 MB | 26 kB | 188/326 kB | 0/1.5 MB
Progress (5): 5.3/12 MB | 1.8/4.2 MB | 26 kB | 188/326 kB | 0/1.5 MB
Progress (5): 5.3/12 MB | 1.8/4.2 MB | 26 kB | 188/326 kB | 0/1.5 MB
Progress (5): 5.3/12 MB | 1.8/4.2 MB | 26 kB | 188/326 kB | 0/1.5 MB
Progress (5): 5.3/12 MB | 1.8/4.2 MB | 26 kB | 188/326 kB | 0/1.5 MB
Progress (5): 5.3/12 MB | 1.8/4.2 MB | 26 kB | 204/326 kB | 0/1.5 MB
Progress (5): 5.3/12 MB | 1.8/4.2 MB | 26 kB | 204/326 kB | 0/1.5 MB
Progress (5): 5.4/12 MB | 1.8/4.2 MB | 26 kB | 204/326 kB | 0/1.5 MB
Progress (5): 5.4/12 MB | 1.9/4.2 MB | 26 kB | 204/326 kB | 0/1.5 MB
Progress (5): 5.4/12 MB | 1.9/4.2 MB | 26 kB | 204/326 kB | 0/1.5 MB
Progress (5): 5.4/12 MB | 1.9/4.2 MB | 26 kB | 204/326 kB | 0.1/1.5 MB
Progress (5): 5.4/12 MB | 1.9/4.2 MB | 26 kB | 204/326 kB | 0.1/1.5 MB
Progress (5): 5.4/12 MB | 1.9/4.2 MB | 26 kB | 221/326 kB | 0.1/1.5 MB
                                                                      
Downloaded from central: https://repo.maven.apache.org/maven2/com/sun/istack/istack-commons-runtime/4.1.2/istack-commons-runtime-4.1.2.jar (26 kB at 5.8 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-commons/3.3.4/spring-data-commons-3.3.4.jar
Progress (4): 5.4/12 MB | 1.9/4.2 MB | 221/326 kB | 0.1/1.5 MB
Progress (4): 5.4/12 MB | 1.9/4.2 MB | 221/326 kB | 0.1/1.5 MB
Progress (4): 5.4/12 MB | 1.9/4.2 MB | 221/326 kB | 0.1/1.5 MB
Progress (4): 5.4/12 MB | 1.9/4.2 MB | 221/326 kB | 0.1/1.5 MB
Progress (4): 5.4/12 MB | 1.9/4.2 MB | 221/326 kB | 0.1/1.5 MB
Progress (4): 5.4/12 MB | 1.9/4.2 MB | 221/326 kB | 0.1/1.5 MB
Progress (4): 5.4/12 MB | 1.9/4.2 MB | 237/326 kB | 0.1/1.5 MB
Progress (4): 5.4/12 MB | 1.9/4.2 MB | 237/326 kB | 0.1/1.5 MB
Progress (4): 5.4/12 MB | 1.9/4.2 MB | 237/326 kB | 0.1/1.5 MB
Progress (4): 5.5/12 MB | 1.9/4.2 MB | 237/326 kB | 0.1/1.5 MB
Progress (4): 5.5/12 MB | 1.9/4.2 MB | 237/326 kB | 0.1/1.5 MB
Progress (4): 5.5/12 MB | 1.9/4.2 MB | 237/326 kB | 0.1/1.5 MB
Progress (4): 5.5/12 MB | 1.9/4.2 MB | 237/326 kB | 0.1/1.5 MB
Progress (4): 5.5/12 MB | 1.9/4.2 MB | 253/326 kB | 0.1/1.5 MB
Progress (4): 5.5/12 MB | 1.9/4.2 MB | 253/326 kB | 0.1/1.5 MB
Progress (4): 5.5/12 MB | 1.9/4.2 MB | 253/326 kB | 0.1/1.5 MB
Progress (4): 5.5/12 MB | 1.9/4.2 MB | 253/326 kB | 0.1/1.5 MB
Progress (4): 5.5/12 MB | 1.9/4.2 MB | 253/326 kB | 0.1/1.5 MB
Progress (4): 5.5/12 MB | 1.9/4.2 MB | 270/326 kB | 0.1/1.5 MB
Progress (4): 5.5/12 MB | 1.9/4.2 MB | 270/326 kB | 0.1/1.5 MB
Progress (4): 5.5/12 MB | 1.9/4.2 MB | 270/326 kB | 0.1/1.5 MB
Progress (4): 5.5/12 MB | 2.0/4.2 MB | 270/326 kB | 0.1/1.5 MB
Progress (4): 5.5/12 MB | 2.0/4.2 MB | 270/326 kB | 0.1/1.5 MB
Progress (4): 5.5/12 MB | 2.0/4.2 MB | 286/326 kB | 0.1/1.5 MB
Progress (4): 5.6/12 MB | 2.0/4.2 MB | 286/326 kB | 0.1/1.5 MB
Progress (4): 5.6/12 MB | 2.0/4.2 MB | 286/326 kB | 0.1/1.5 MB
Progress (4): 5.6/12 MB | 2.0/4.2 MB | 286/326 kB | 0.1/1.5 MB
Progress (4): 5.6/12 MB | 2.0/4.2 MB | 286/326 kB | 0.1/1.5 MB
Progress (4): 5.6/12 MB | 2.0/4.2 MB | 286/326 kB | 0.2/1.5 MB
Progress (4): 5.6/12 MB | 2.0/4.2 MB | 286/326 kB | 0.2/1.5 MB
Progress (4): 5.6/12 MB | 2.0/4.2 MB | 303/326 kB | 0.2/1.5 MB
Progress (4): 5.6/12 MB | 2.0/4.2 MB | 303/326 kB | 0.2/1.5 MB
Progress (5): 5.6/12 MB | 2.0/4.2 MB | 303/326 kB | 0.2/1.5 MB | 0/1.5 MB
Progress (5): 5.6/12 MB | 2.0/4.2 MB | 303/326 kB | 0.2/1.5 MB | 0/1.5 MB
Progress (5): 5.6/12 MB | 2.0/4.2 MB | 303/326 kB | 0.2/1.5 MB | 0/1.5 MB
Progress (5): 5.6/12 MB | 2.0/4.2 MB | 303/326 kB | 0.2/1.5 MB | 0/1.5 MB
Progress (5): 5.6/12 MB | 2.0/4.2 MB | 303/326 kB | 0.2/1.5 MB | 0/1.5 MB
Progress (5): 5.6/12 MB | 2.0/4.2 MB | 303/326 kB | 0.2/1.5 MB | 0/1.5 MB
Progress (5): 5.6/12 MB | 2.0/4.2 MB | 303/326 kB | 0.2/1.5 MB | 0/1.5 MB
Progress (5): 5.6/12 MB | 2.0/4.2 MB | 303/326 kB | 0.2/1.5 MB | 0/1.5 MB
Progress (5): 5.6/12 MB | 2.0/4.2 MB | 303/326 kB | 0.2/1.5 MB | 0/1.5 MB
Progress (5): 5.7/12 MB | 2.0/4.2 MB | 303/326 kB | 0.2/1.5 MB | 0/1.5 MB
Progress (5): 5.7/12 MB | 2.0/4.2 MB | 319/326 kB | 0.2/1.5 MB | 0/1.5 MB
Progress (5): 5.7/12 MB | 2.0/4.2 MB | 319/326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.7/12 MB | 2.0/4.2 MB | 319/326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.7/12 MB | 2.0/4.2 MB | 319/326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.7/12 MB | 2.0/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB    
Progress (5): 5.7/12 MB | 2.0/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.7/12 MB | 2.0/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.7/12 MB | 2.1/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.7/12 MB | 2.1/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.7/12 MB | 2.1/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.7/12 MB | 2.1/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.7/12 MB | 2.1/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.7/12 MB | 2.1/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.7/12 MB | 2.1/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.7/12 MB | 2.1/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.7/12 MB | 2.1/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.7/12 MB | 2.1/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.8/12 MB | 2.1/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.8/12 MB | 2.1/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.8/12 MB | 2.1/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.8/12 MB | 2.1/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.8/12 MB | 2.1/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.8/12 MB | 2.1/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.8/12 MB | 2.1/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (5): 5.8/12 MB | 2.1/4.2 MB | 326 kB | 0.2/1.5 MB | 0.1/1.5 MB
                                                                       
Downloaded from central: https://repo.maven.apache.org/maven2/org/antlr/antlr4-runtime/4.13.0/antlr4-runtime-4.13.0.jar (326 kB at 70 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-orm/6.1.13/spring-orm-6.1.13.jar
Progress (4): 5.8/12 MB | 2.1/4.2 MB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (4): 5.8/12 MB | 2.1/4.2 MB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (4): 5.8/12 MB | 2.1/4.2 MB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (4): 5.8/12 MB | 2.1/4.2 MB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (4): 5.8/12 MB | 2.1/4.2 MB | 0.2/1.5 MB | 0.1/1.5 MB
Progress (4): 5.8/12 MB | 2.1/4.2 MB | 0.3/1.5 MB | 0.1/1.5 MB
Progress (4): 5.9/12 MB | 2.1/4.2 MB | 0.3/1.5 MB | 0.1/1.5 MB
Progress (4): 5.9/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.1/1.5 MB
Progress (4): 5.9/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.1/1.5 MB
Progress (4): 5.9/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.1/1.5 MB
Progress (4): 5.9/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.1/1.5 MB
Progress (4): 5.9/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.1/1.5 MB
Progress (4): 5.9/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.1/1.5 MB
Progress (4): 5.9/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.1/1.5 MB
Progress (4): 5.9/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.1/1.5 MB
Progress (4): 5.9/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.1/1.5 MB
Progress (4): 5.9/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.1/1.5 MB
Progress (4): 5.9/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.1/1.5 MB
Progress (4): 5.9/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.1/1.5 MB
Progress (4): 5.9/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.1/1.5 MB
Progress (4): 6.0/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.1/1.5 MB
Progress (4): 6.0/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.2/1.5 MB
Progress (4): 6.0/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.2/1.5 MB
Progress (4): 6.0/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.2/1.5 MB
Progress (4): 6.0/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.2/1.5 MB
Progress (4): 6.0/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.2/1.5 MB
Progress (4): 6.0/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.2/1.5 MB
Progress (4): 6.0/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.2/1.5 MB
Progress (4): 6.0/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.2/1.5 MB
Progress (4): 6.0/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.2/1.5 MB
Progress (4): 6.0/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.2/1.5 MB
Progress (4): 6.0/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.2/1.5 MB
Progress (5): 6.0/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.2/1.5 MB | 7.7/238 kB
Progress (5): 6.0/12 MB | 2.2/4.2 MB | 0.3/1.5 MB | 0.2/1.5 MB | 7.7/238 kB
Progress (5): 6.0/12 MB | 2.3/4.2 MB | 0.3/1.5 MB | 0.2/1.5 MB | 7.7/238 kB
Progress (5): 6.0/12 MB | 2.3/4.2 MB | 0.3/1.5 MB | 0.2/1.5 MB | 7.7/238 kB
Progress (5): 6.0/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 7.7/238 kB
Progress (5): 6.0/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 7.7/238 kB
Progress (5): 6.0/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 24/238 kB 
Progress (5): 6.0/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 24/238 kB
Progress (5): 6.0/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 24/238 kB
Progress (5): 6.1/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 24/238 kB
Progress (5): 6.1/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 24/238 kB
Progress (5): 6.1/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 40/238 kB
Progress (5): 6.1/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 40/238 kB
Progress (5): 6.1/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 40/238 kB
Progress (5): 6.1/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 40/238 kB
Progress (5): 6.1/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 40/238 kB
Progress (5): 6.1/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 40/238 kB
Progress (5): 6.1/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 40/238 kB
Progress (5): 6.1/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 40/238 kB
Progress (5): 6.1/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 40/238 kB
Progress (5): 6.1/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 40/238 kB
Progress (5): 6.1/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 40/238 kB
Progress (5): 6.1/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 40/238 kB
Progress (5): 6.1/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 40/238 kB
Progress (5): 6.1/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 40/238 kB
Progress (5): 6.2/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 40/238 kB
Progress (5): 6.2/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 57/238 kB
Progress (5): 6.2/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 57/238 kB
Progress (5): 6.2/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 57/238 kB
Progress (5): 6.2/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 73/238 kB
Progress (5): 6.2/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 73/238 kB
Progress (5): 6.2/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.2/1.5 MB | 73/238 kB
Progress (5): 6.2/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.3/1.5 MB | 73/238 kB
Progress (5): 6.2/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.3/1.5 MB | 73/238 kB
Progress (5): 6.2/12 MB | 2.3/4.2 MB | 0.4/1.5 MB | 0.3/1.5 MB | 90/238 kB
Progress (5): 6.2/12 MB | 2.3/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 90/238 kB
Progress (5): 6.2/12 MB | 2.3/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 90/238 kB
Progress (5): 6.2/12 MB | 2.3/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 90/238 kB
Progress (5): 6.2/12 MB | 2.3/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 106/238 kB
Progress (5): 6.2/12 MB | 2.3/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 106/238 kB
Progress (5): 6.3/12 MB | 2.3/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 106/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 106/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 106/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 106/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 106/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 106/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 106/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 106/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 122/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 139/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 139/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 139/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 139/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 139/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 139/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 139/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 155/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 155/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 155/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 155/238 kB
Progress (5): 6.3/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 155/238 kB
Progress (5): 6.4/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 155/238 kB
Progress (5): 6.4/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 155/238 kB
Progress (5): 6.4/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 155/238 kB
Progress (5): 6.4/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 155/238 kB
Progress (5): 6.4/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 172/238 kB
Progress (5): 6.4/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.3/1.5 MB | 172/238 kB
Progress (5): 6.4/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.4/1.5 MB | 172/238 kB
Progress (5): 6.4/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.4/1.5 MB | 188/238 kB
Progress (5): 6.4/12 MB | 2.4/4.2 MB | 0.5/1.5 MB | 0.4/1.5 MB | 188/238 kB
Progress (5): 6.4/12 MB | 2.5/4.2 MB | 0.5/1.5 MB | 0.4/1.5 MB | 188/238 kB
Progress (5): 6.4/12 MB | 2.5/4.2 MB | 0.5/1.5 MB | 0.4/1.5 MB | 188/238 kB
Progress (5): 6.4/12 MB | 2.5/4.2 MB | 0.5/1.5 MB | 0.4/1.5 MB | 188/238 kB
Progress (5): 6.4/12 MB | 2.5/4.2 MB | 0.5/1.5 MB | 0.4/1.5 MB | 188/238 kB
Progress (5): 6.4/12 MB | 2.5/4.2 MB | 0.5/1.5 MB | 0.4/1.5 MB | 204/238 kB
Progress (5): 6.4/12 MB | 2.5/4.2 MB | 0.5/1.5 MB | 0.4/1.5 MB | 204/238 kB
Progress (5): 6.4/12 MB | 2.5/4.2 MB | 0.5/1.5 MB | 0.4/1.5 MB | 204/238 kB
Progress (5): 6.4/12 MB | 2.5/4.2 MB | 0.5/1.5 MB | 0.4/1.5 MB | 204/238 kB
Progress (5): 6.4/12 MB | 2.5/4.2 MB | 0.5/1.5 MB | 0.4/1.5 MB | 204/238 kB
Progress (5): 6.4/12 MB | 2.5/4.2 MB | 0.5/1.5 MB | 0.4/1.5 MB | 221/238 kB
Progress (5): 6.4/12 MB | 2.5/4.2 MB | 0.5/1.5 MB | 0.4/1.5 MB | 221/238 kB
Progress (5): 6.5/12 MB | 2.5/4.2 MB | 0.5/1.5 MB | 0.4/1.5 MB | 221/238 kB
Progress (5): 6.5/12 MB | 2.5/4.2 MB | 0.5/1.5 MB | 0.4/1.5 MB | 221/238 kB
Progress (5): 6.5/12 MB | 2.5/4.2 MB | 0.5/1.5 MB | 0.4/1.5 MB | 221/238 kB
Progress (5): 6.5/12 MB | 2.5/4.2 MB | 0.5/1.5 MB | 0.4/1.5 MB | 237/238 kB
Progress (5): 6.5/12 MB | 2.5/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB | 237/238 kB
Progress (5): 6.5/12 MB | 2.5/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB | 238 kB    
Progress (5): 6.5/12 MB | 2.5/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB | 238 kB
Progress (5): 6.5/12 MB | 2.5/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB | 238 kB
Progress (5): 6.5/12 MB | 2.5/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB | 238 kB
Progress (5): 6.5/12 MB | 2.5/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB | 238 kB
Progress (5): 6.5/12 MB | 2.5/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB | 238 kB
Progress (5): 6.5/12 MB | 2.5/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB | 238 kB
Progress (5): 6.5/12 MB | 2.5/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB | 238 kB
Progress (5): 6.5/12 MB | 2.5/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB | 238 kB
Progress (5): 6.5/12 MB | 2.5/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB | 238 kB
Progress (5): 6.5/12 MB | 2.5/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB | 238 kB
Progress (5): 6.5/12 MB | 2.5/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB | 238 kB
Progress (5): 6.5/12 MB | 2.5/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB | 238 kB
                                                                       
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-orm/6.1.13/spring-orm-6.1.13.jar (238 kB at 48 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-tx/6.1.13/spring-tx-6.1.13.jar
Progress (4): 6.5/12 MB | 2.5/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB
Progress (4): 6.5/12 MB | 2.5/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB
Progress (4): 6.5/12 MB | 2.6/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB
Progress (4): 6.6/12 MB | 2.6/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB
Progress (4): 6.6/12 MB | 2.6/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB
Progress (4): 6.6/12 MB | 2.6/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB
Progress (4): 6.6/12 MB | 2.6/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB
Progress (4): 6.6/12 MB | 2.6/4.2 MB | 0.6/1.5 MB | 0.4/1.5 MB
Progress (4): 6.6/12 MB | 2.6/4.2 MB | 0.6/1.5 MB | 0.5/1.5 MB
Progress (4): 6.6/12 MB | 2.6/4.2 MB | 0.6/1.5 MB | 0.5/1.5 MB
Progress (4): 6.6/12 MB | 2.6/4.2 MB | 0.6/1.5 MB | 0.5/1.5 MB
Progress (4): 6.6/12 MB | 2.6/4.2 MB | 0.6/1.5 MB | 0.5/1.5 MB
Progress (4): 6.6/12 MB | 2.6/4.2 MB | 0.6/1.5 MB | 0.5/1.5 MB
Progress (4): 6.6/12 MB | 2.6/4.2 MB | 0.6/1.5 MB | 0.5/1.5 MB
Progress (4): 6.6/12 MB | 2.6/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB
Progress (4): 6.6/12 MB | 2.6/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB
Progress (4): 6.6/12 MB | 2.6/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB
Progress (4): 6.6/12 MB | 2.6/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB
Progress (5): 6.6/12 MB | 2.6/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 4.1/282 kB
Progress (5): 6.6/12 MB | 2.6/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 4.1/282 kB
Progress (5): 6.6/12 MB | 2.6/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 4.1/282 kB
Progress (5): 6.6/12 MB | 2.6/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 4.1/282 kB
Progress (5): 6.7/12 MB | 2.6/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 4.1/282 kB
Progress (5): 6.7/12 MB | 2.6/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 16/282 kB 
Progress (5): 6.7/12 MB | 2.6/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 16/282 kB
Progress (5): 6.7/12 MB | 2.6/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 33/282 kB
Progress (5): 6.7/12 MB | 2.6/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 33/282 kB
Progress (5): 6.7/12 MB | 2.6/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 33/282 kB
Progress (5): 6.7/12 MB | 2.6/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 33/282 kB
Progress (5): 6.7/12 MB | 2.6/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 33/282 kB
Progress (5): 6.7/12 MB | 2.6/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 41/282 kB
Progress (5): 6.7/12 MB | 2.7/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 41/282 kB
Progress (5): 6.7/12 MB | 2.7/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 41/282 kB
Progress (5): 6.7/12 MB | 2.7/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 41/282 kB
Progress (5): 6.7/12 MB | 2.7/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 41/282 kB
Progress (5): 6.7/12 MB | 2.7/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 57/282 kB
Progress (5): 6.7/12 MB | 2.7/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 57/282 kB
Progress (5): 6.7/12 MB | 2.7/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 57/282 kB
Progress (5): 6.7/12 MB | 2.7/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 57/282 kB
Progress (5): 6.7/12 MB | 2.7/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 57/282 kB
Progress (5): 6.7/12 MB | 2.7/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 57/282 kB
Progress (5): 6.7/12 MB | 2.7/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 57/282 kB
Progress (5): 6.7/12 MB | 2.7/4.2 MB | 0.7/1.5 MB | 0.5/1.5 MB | 74/282 kB
Progress (5): 6.7/12 MB | 2.7/4.2 MB | 0.8/1.5 MB | 0.5/1.5 MB | 74/282 kB
Progress (5): 6.7/12 MB | 2.7/4.2 MB | 0.8/1.5 MB | 0.5/1.5 MB | 74/282 kB
Progress (5): 6.8/12 MB | 2.7/4.2 MB | 0.8/1.5 MB | 0.5/1.5 MB | 74/282 kB
Progress (5): 6.8/12 MB | 2.7/4.2 MB | 0.8/1.5 MB | 0.5/1.5 MB | 74/282 kB
Progress (5): 6.8/12 MB | 2.7/4.2 MB | 0.8/1.5 MB | 0.5/1.5 MB | 90/282 kB
Progress (5): 6.8/12 MB | 2.7/4.2 MB | 0.8/1.5 MB | 0.5/1.5 MB | 90/282 kB
Progress (5): 6.8/12 MB | 2.7/4.2 MB | 0.8/1.5 MB | 0.5/1.5 MB | 90/282 kB
Progress (5): 6.8/12 MB | 2.7/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 90/282 kB
Progress (5): 6.8/12 MB | 2.7/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 90/282 kB
Progress (5): 6.8/12 MB | 2.7/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 90/282 kB
Progress (5): 6.8/12 MB | 2.7/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 106/282 kB
Progress (5): 6.8/12 MB | 2.7/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 106/282 kB
Progress (5): 6.8/12 MB | 2.7/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 106/282 kB
Progress (5): 6.8/12 MB | 2.7/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 106/282 kB
Progress (5): 6.8/12 MB | 2.7/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 106/282 kB
Progress (5): 6.8/12 MB | 2.7/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 106/282 kB
Progress (5): 6.8/12 MB | 2.7/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 106/282 kB
Progress (5): 6.8/12 MB | 2.7/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 106/282 kB
Progress (5): 6.8/12 MB | 2.7/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 123/282 kB
Progress (5): 6.8/12 MB | 2.8/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 123/282 kB
Progress (5): 6.8/12 MB | 2.8/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 123/282 kB
Progress (5): 6.8/12 MB | 2.8/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 123/282 kB
Progress (5): 6.8/12 MB | 2.8/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 123/282 kB
Progress (5): 6.8/12 MB | 2.8/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 123/282 kB
Progress (5): 6.8/12 MB | 2.8/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 123/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 123/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 139/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 139/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 139/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.8/1.5 MB | 0.6/1.5 MB | 139/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.9/1.5 MB | 0.6/1.5 MB | 139/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.9/1.5 MB | 0.6/1.5 MB | 156/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.9/1.5 MB | 0.6/1.5 MB | 156/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.9/1.5 MB | 0.6/1.5 MB | 156/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.9/1.5 MB | 0.6/1.5 MB | 156/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.9/1.5 MB | 0.6/1.5 MB | 172/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.9/1.5 MB | 0.6/1.5 MB | 172/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.9/1.5 MB | 0.6/1.5 MB | 172/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.9/1.5 MB | 0.6/1.5 MB | 172/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.9/1.5 MB | 0.6/1.5 MB | 172/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.9/1.5 MB | 0.6/1.5 MB | 172/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.9/1.5 MB | 0.7/1.5 MB | 172/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.9/1.5 MB | 0.7/1.5 MB | 188/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.9/1.5 MB | 0.7/1.5 MB | 188/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.9/1.5 MB | 0.7/1.5 MB | 188/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.9/1.5 MB | 0.7/1.5 MB | 188/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.9/1.5 MB | 0.7/1.5 MB | 188/282 kB
Progress (5): 6.9/12 MB | 2.8/4.2 MB | 0.9/1.5 MB | 0.7/1.5 MB | 205/282 kB
Progress (5): 6.9/12 MB | 2.9/4.2 MB | 0.9/1.5 MB | 0.7/1.5 MB | 205/282 kB
Progress (5): 6.9/12 MB | 2.9/4.2 MB | 0.9/1.5 MB | 0.7/1.5 MB | 205/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 0.9/1.5 MB | 0.7/1.5 MB | 205/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 0.9/1.5 MB | 0.7/1.5 MB | 205/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 0.9/1.5 MB | 0.7/1.5 MB | 205/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 0.9/1.5 MB | 0.7/1.5 MB | 205/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 0.9/1.5 MB | 0.7/1.5 MB | 221/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 0.9/1.5 MB | 0.7/1.5 MB | 221/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 221/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 221/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 221/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 221/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 221/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 238/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 238/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 238/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 238/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 238/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 238/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 254/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 254/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 254/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 254/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 254/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 254/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 254/282 kB
Progress (5): 7.0/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 270/282 kB
Progress (5): 7.1/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 270/282 kB
Progress (5): 7.1/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.7/1.5 MB | 282 kB    
Progress (5): 7.1/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.1/12 MB | 2.9/4.2 MB | 1.0/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.1/12 MB | 3.0/4.2 MB | 1.0/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.1/12 MB | 3.0/4.2 MB | 1.0/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.1/12 MB | 3.0/4.2 MB | 1.0/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.1/12 MB | 3.0/4.2 MB | 1.0/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.1/12 MB | 3.0/4.2 MB | 1.0/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.1/12 MB | 3.0/4.2 MB | 1.0/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.1/12 MB | 3.0/4.2 MB | 1.0/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.1/12 MB | 3.0/4.2 MB | 1.0/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.1/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.1/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.1/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.1/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.1/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.1/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.1/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.2/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.2/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.2/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.2/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.2/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.2/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.2/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB | 282 kB
Progress (5): 7.2/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB | 282 kB
                                                                       
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-tx/6.1.13/spring-tx-6.1.13.jar (282 kB at 53 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/2.0.16/slf4j-api-2.0.16.jar
Progress (4): 7.2/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB
Progress (4): 7.2/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB
Progress (4): 7.2/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB
Progress (4): 7.2/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB
Progress (4): 7.2/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB
Progress (4): 7.2/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB
Progress (4): 7.2/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB
Progress (4): 7.2/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB
Progress (4): 7.2/12 MB | 3.0/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB
Progress (4): 7.2/12 MB | 3.1/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB
Progress (4): 7.3/12 MB | 3.1/4.2 MB | 1.1/1.5 MB | 0.8/1.5 MB
Progress (4): 7.3/12 MB | 3.1/4.2 MB | 1.1/1.5 MB | 0.9/1.5 MB
Progress (4): 7.3/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.3/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.3/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.3/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.3/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.3/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.3/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.3/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.3/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.3/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.3/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.3/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.3/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.3/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.3/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.3/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.4/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.4/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.4/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB

Progress (4): 7.4/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.4/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.4/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.4/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.4/12 MB | 3.1/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (4): 7.4/12 MB | 3.2/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB
Progress (5): 7.4/12 MB | 3.2/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB | 7.7/69 kB
Progress (5): 7.4/12 MB | 3.2/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB | 12/69 kB 
Progress (5): 7.4/12 MB | 3.2/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB | 12/69 kB
Progress (5): 7.4/12 MB | 3.2/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB | 29/69 kB
Progress (5): 7.4/12 MB | 3.2/4.2 MB | 1.2/1.5 MB | 0.9/1.5 MB | 29/69 kB
Progress (5): 7.4/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 0.9/1.5 MB | 29/69 kB
Progress (5): 7.4/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 0.9/1.5 MB | 29/69 kB
Progress (5): 7.4/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 0.9/1.5 MB | 29/69 kB
Progress (5): 7.4/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 29/69 kB
Progress (5): 7.4/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 45/69 kB
Progress (5): 7.4/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 45/69 kB
Progress (5): 7.4/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 45/69 kB
Progress (5): 7.5/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 45/69 kB
Progress (5): 7.5/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 45/69 kB
Progress (5): 7.5/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 61/69 kB
Progress (5): 7.5/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 61/69 kB
Progress (5): 7.5/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 61/69 kB
Progress (5): 7.5/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 61/69 kB
Progress (5): 7.5/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 69 kB   
Progress (5): 7.5/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 69 kB
Progress (5): 7.5/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 69 kB
Progress (5): 7.5/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 69 kB
Progress (5): 7.5/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 69 kB
Progress (5): 7.5/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 69 kB
Progress (5): 7.5/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 69 kB
Progress (5): 7.5/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 69 kB
Progress (5): 7.5/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 69 kB
Progress (5): 7.5/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 69 kB
Progress (5): 7.5/12 MB | 3.2/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 69 kB
Progress (5): 7.5/12 MB | 3.3/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 69 kB
Progress (5): 7.5/12 MB | 3.3/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB | 69 kB
                                                                      
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/2.0.16/slf4j-api-2.0.16.jar (69 kB at 13 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aspects/6.1.13/spring-aspects-6.1.13.jar
Progress (4): 7.5/12 MB | 3.3/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB
Progress (4): 7.5/12 MB | 3.3/4.2 MB | 1.3/1.5 MB | 1.0/1.5 MB
Progress (4): 7.5/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.0/1.5 MB
Progress (4): 7.5/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.0/1.5 MB
Progress (4): 7.5/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.0/1.5 MB
Progress (4): 7.6/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.0/1.5 MB
Progress (4): 7.6/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.0/1.5 MB
Progress (4): 7.6/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.0/1.5 MB
Progress (4): 7.6/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB
Progress (4): 7.6/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB
Progress (4): 7.6/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB
Progress (4): 7.6/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB
Progress (4): 7.6/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB
Progress (4): 7.6/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB
Progress (4): 7.6/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB
Progress (4): 7.6/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB
Progress (4): 7.6/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB
Progress (4): 7.6/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB
Progress (4): 7.6/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB
Progress (5): 7.6/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB | 7.7/50 kB
Progress (5): 7.6/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB | 7.7/50 kB
Progress (5): 7.6/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB | 7.7/50 kB
Progress (5): 7.6/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB | 7.7/50 kB
Progress (5): 7.6/12 MB | 3.3/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB | 7.7/50 kB
Progress (5): 7.6/12 MB | 3.4/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB | 7.7/50 kB
Progress (5): 7.6/12 MB | 3.4/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB | 24/50 kB 
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB | 24/50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB | 24/50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB | 24/50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB | 24/50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB | 40/50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.4/1.5 MB | 1.1/1.5 MB | 40/50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.5/1.5 MB | 1.1/1.5 MB | 40/50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.5/1.5 MB | 1.1/1.5 MB | 40/50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.5/1.5 MB | 1.1/1.5 MB | 40/50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.5/1.5 MB | 1.1/1.5 MB | 50 kB   
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.5/1.5 MB | 1.1/1.5 MB | 50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.5/1.5 MB | 1.1/1.5 MB | 50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.5/1.5 MB | 1.1/1.5 MB | 50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.5/1.5 MB | 1.1/1.5 MB | 50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.5/1.5 MB | 1.1/1.5 MB | 50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.5/1.5 MB | 1.1/1.5 MB | 50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.5/1.5 MB | 1.1/1.5 MB | 50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.5/1.5 MB | 1.1/1.5 MB | 50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.5/1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.5/1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.5/1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.5/1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.5/1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.5/1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.7/12 MB | 3.4/4.2 MB | 1.5/1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.7/12 MB | 3.5/4.2 MB | 1.5/1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.7/12 MB | 3.5/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB    
Progress (5): 7.8/12 MB | 3.5/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.8/12 MB | 3.5/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.8/12 MB | 3.5/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.8/12 MB | 3.5/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.8/12 MB | 3.5/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.8/12 MB | 3.5/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.8/12 MB | 3.5/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.8/12 MB | 3.5/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.8/12 MB | 3.5/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.8/12 MB | 3.5/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.8/12 MB | 3.5/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.8/12 MB | 3.5/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.8/12 MB | 3.5/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.8/12 MB | 3.5/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.8/12 MB | 3.5/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.9/12 MB | 3.5/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.9/12 MB | 3.5/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.9/12 MB | 3.5/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.9/12 MB | 3.6/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.9/12 MB | 3.6/4.2 MB | 1.5 MB | 1.2/1.5 MB | 50 kB
Progress (5): 7.9/12 MB | 3.6/4.2 MB | 1.5 MB | 1.3/1.5 MB | 50 kB
Progress (5): 7.9/12 MB | 3.6/4.2 MB | 1.5 MB | 1.3/1.5 MB | 50 kB
Progress (5): 7.9/12 MB | 3.6/4.2 MB | 1.5 MB | 1.3/1.5 MB | 50 kB
                                                                  
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-jpa/3.3.4/spring-data-jpa-3.3.4.jar (1.5 MB at 273 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-validation/3.3.4/spring-boot-starter-validation-3.3.4.jar
Progress (4): 7.9/12 MB | 3.6/4.2 MB | 1.3/1.5 MB | 50 kB
Progress (4): 7.9/12 MB | 3.6/4.2 MB | 1.3/1.5 MB | 50 kB
Progress (4): 7.9/12 MB | 3.6/4.2 MB | 1.3/1.5 MB | 50 kB
Progress (4): 7.9/12 MB | 3.6/4.2 MB | 1.3/1.5 MB | 50 kB
Progress (4): 8.0/12 MB | 3.6/4.2 MB | 1.3/1.5 MB | 50 kB
Progress (4): 8.0/12 MB | 3.6/4.2 MB | 1.3/1.5 MB | 50 kB
Progress (4): 8.0/12 MB | 3.6/4.2 MB | 1.3/1.5 MB | 50 kB
Progress (4): 8.0/12 MB | 3.6/4.2 MB | 1.3/1.5 MB | 50 kB
Progress (4): 8.0/12 MB | 3.6/4.2 MB | 1.3/1.5 MB | 50 kB
Progress (4): 8.0/12 MB | 3.6/4.2 MB | 1.3/1.5 MB | 50 kB
Progress (5): 8.0/12 MB | 3.6/4.2 MB | 1.3/1.5 MB | 50 kB | 4.8 kB
Progress (5): 8.0/12 MB | 3.6/4.2 MB | 1.3/1.5 MB | 50 kB | 4.8 kB
Progress (5): 8.0/12 MB | 3.6/4.2 MB | 1.3/1.5 MB | 50 kB | 4.8 kB
Progress (5): 8.0/12 MB | 3.6/4.2 MB | 1.3/1.5 MB | 50 kB | 4.8 kB
Progress (5): 8.0/12 MB | 3.6/4.2 MB | 1.3/1.5 MB | 50 kB | 4.8 kB
Progress (5): 8.0/12 MB | 3.6/4.2 MB | 1.3/1.5 MB | 50 kB | 4.8 kB
Progress (5): 8.0/12 MB | 3.6/4.2 MB | 1.3/1.5 MB | 50 kB | 4.8 kB
Progress (5): 8.0/12 MB | 3.6/4.2 MB | 1.3/1.5 MB | 50 kB | 4.8 kB
Progress (5): 8.0/12 MB | 3.7/4.2 MB | 1.3/1.5 MB | 50 kB | 4.8 kB
Progress (5): 8.1/12 MB | 3.7/4.2 MB | 1.3/1.5 MB | 50 kB | 4.8 kB
Progress (5): 8.1/12 MB | 3.7/4.2 MB | 1.3/1.5 MB | 50 kB | 4.8 kB
Progress (5): 8.1/12 MB | 3.7/4.2 MB | 1.3/1.5 MB | 50 kB | 4.8 kB
Progress (5): 8.1/12 MB | 3.7/4.2 MB | 1.3/1.5 MB | 50 kB | 4.8 kB
                                                                  
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-validation/3.3.4/spring-boot-starter-validation-3.3.4.jar (4.8 kB at 837 B/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-el/10.1.30/tomcat-embed-el-10.1.30.jar
Progress (4): 8.1/12 MB | 3.7/4.2 MB | 1.3/1.5 MB | 50 kB
Progress (4): 8.1/12 MB | 3.7/4.2 MB | 1.4/1.5 MB | 50 kB
Progress (4): 8.1/12 MB | 3.7/4.2 MB | 1.4/1.5 MB | 50 kB
Progress (4): 8.1/12 MB | 3.7/4.2 MB | 1.4/1.5 MB | 50 kB
Progress (4): 8.1/12 MB | 3.7/4.2 MB | 1.4/1.5 MB | 50 kB
Progress (4): 8.1/12 MB | 3.7/4.2 MB | 1.4/1.5 MB | 50 kB
Progress (4): 8.1/12 MB | 3.7/4.2 MB | 1.4/1.5 MB | 50 kB
Progress (4): 8.1/12 MB | 3.7/4.2 MB | 1.4/1.5 MB | 50 kB
Progress (4): 8.2/12 MB | 3.7/4.2 MB | 1.4/1.5 MB | 50 kB
Progress (4): 8.2/12 MB | 3.7/4.2 MB | 1.4/1.5 MB | 50 kB
Progress (4): 8.2/12 MB | 3.7/4.2 MB | 1.4/1.5 MB | 50 kB
Progress (4): 8.2/12 MB | 3.7/4.2 MB | 1.4/1.5 MB | 50 kB
Progress (4): 8.2/12 MB | 3.7/4.2 MB | 1.4/1.5 MB | 50 kB
Progress (4): 8.2/12 MB | 3.7/4.2 MB | 1.4/1.5 MB | 50 kB
Progress (4): 8.2/12 MB | 3.7/4.2 MB | 1.4/1.5 MB | 50 kB
Progress (5): 8.2/12 MB | 3.7/4.2 MB | 1.4/1.5 MB | 50 kB | 7.7/262 kB
Progress (5): 8.2/12 MB | 3.7/4.2 MB | 1.4/1.5 MB | 50 kB | 7.7/262 kB
Progress (5): 8.2/12 MB | 3.8/4.2 MB | 1.4/1.5 MB | 50 kB | 7.7/262 kB
Progress (5): 8.2/12 MB | 3.8/4.2 MB | 1.4/1.5 MB | 50 kB | 7.7/262 kB
Progress (5): 8.2/12 MB | 3.8/4.2 MB | 1.4/1.5 MB | 50 kB | 7.7/262 kB
Progress (5): 8.2/12 MB | 3.8/4.2 MB | 1.4/1.5 MB | 50 kB | 7.7/262 kB
Progress (5): 8.2/12 MB | 3.8/4.2 MB | 1.4/1.5 MB | 50 kB | 7.7/262 kB
Progress (5): 8.2/12 MB | 3.8/4.2 MB | 1.4/1.5 MB | 50 kB | 7.7/262 kB
Progress (5): 8.2/12 MB | 3.8/4.2 MB | 1.4/1.5 MB | 50 kB | 24/262 kB 
Progress (5): 8.2/12 MB | 3.8/4.2 MB | 1.4/1.5 MB | 50 kB | 24/262 kB
Progress (5): 8.3/12 MB | 3.8/4.2 MB | 1.4/1.5 MB | 50 kB | 24/262 kB
Progress (5): 8.3/12 MB | 3.8/4.2 MB | 1.4/1.5 MB | 50 kB | 24/262 kB
Progress (5): 8.3/12 MB | 3.8/4.2 MB | 1.5/1.5 MB | 50 kB | 24/262 kB
Progress (5): 8.3/12 MB | 3.8/4.2 MB | 1.5/1.5 MB | 50 kB | 24/262 kB
Progress (5): 8.3/12 MB | 3.8/4.2 MB | 1.5/1.5 MB | 50 kB | 40/262 kB
Progress (5): 8.3/12 MB | 3.8/4.2 MB | 1.5/1.5 MB | 50 kB | 40/262 kB
Progress (5): 8.3/12 MB | 3.8/4.2 MB | 1.5 MB | 50 kB | 40/262 kB    
Progress (5): 8.3/12 MB | 3.8/4.2 MB | 1.5 MB | 50 kB | 40/262 kB
Progress (5): 8.3/12 MB | 3.8/4.2 MB | 1.5 MB | 50 kB | 40/262 kB
Progress (5): 8.3/12 MB | 3.8/4.2 MB | 1.5 MB | 50 kB | 40/262 kB
Progress (5): 8.3/12 MB | 3.8/4.2 MB | 1.5 MB | 50 kB | 40/262 kB
Progress (5): 8.3/12 MB | 3.8/4.2 MB | 1.5 MB | 50 kB | 57/262 kB
Progress (5): 8.3/12 MB | 3.8/4.2 MB | 1.5 MB | 50 kB | 57/262 kB
Progress (5): 8.3/12 MB | 3.8/4.2 MB | 1.5 MB | 50 kB | 57/262 kB
Progress (5): 8.3/12 MB | 3.8/4.2 MB | 1.5 MB | 50 kB | 73/262 kB
Progress (5): 8.4/12 MB | 3.8/4.2 MB | 1.5 MB | 50 kB | 73/262 kB
Progress (5): 8.4/12 MB | 3.9/4.2 MB | 1.5 MB | 50 kB | 73/262 kB
Progress (5): 8.4/12 MB | 3.9/4.2 MB | 1.5 MB | 50 kB | 73/262 kB
Progress (5): 8.4/12 MB | 3.9/4.2 MB | 1.5 MB | 50 kB | 90/262 kB
Progress (5): 8.4/12 MB | 3.9/4.2 MB | 1.5 MB | 50 kB | 90/262 kB
                                                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/data/spring-data-commons/3.3.4/spring-data-commons-3.3.4.jar (1.5 MB at 254 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/hibernate/validator/hibernate-validator/8.0.1.Final/hibernate-validator-8.0.1.Final.jar
Progress (4): 8.4/12 MB | 3.9/4.2 MB | 50 kB | 90/262 kB
Progress (4): 8.4/12 MB | 3.9/4.2 MB | 50 kB | 90/262 kB
Progress (4): 8.4/12 MB | 3.9/4.2 MB | 50 kB | 90/262 kB
Progress (4): 8.4/12 MB | 3.9/4.2 MB | 50 kB | 106/262 kB
Progress (4): 8.4/12 MB | 3.9/4.2 MB | 50 kB | 106/262 kB
Progress (4): 8.4/12 MB | 3.9/4.2 MB | 50 kB | 106/262 kB
Progress (4): 8.4/12 MB | 3.9/4.2 MB | 50 kB | 106/262 kB
Progress (4): 8.4/12 MB | 3.9/4.2 MB | 50 kB | 122/262 kB
Progress (4): 8.5/12 MB | 3.9/4.2 MB | 50 kB | 122/262 kB
Progress (4): 8.5/12 MB | 3.9/4.2 MB | 50 kB | 122/262 kB
Progress (4): 8.5/12 MB | 3.9/4.2 MB | 50 kB | 122/262 kB
Progress (4): 8.5/12 MB | 3.9/4.2 MB | 50 kB | 139/262 kB
Progress (4): 8.5/12 MB | 3.9/4.2 MB | 50 kB | 139/262 kB
Progress (4): 8.5/12 MB | 3.9/4.2 MB | 50 kB | 139/262 kB
Progress (4): 8.5/12 MB | 4.0/4.2 MB | 50 kB | 139/262 kB
Progress (4): 8.5/12 MB | 4.0/4.2 MB | 50 kB | 139/262 kB
Progress (4): 8.5/12 MB | 4.0/4.2 MB | 50 kB | 139/262 kB
Progress (4): 8.5/12 MB | 4.0/4.2 MB | 50 kB | 155/262 kB
Progress (4): 8.5/12 MB | 4.0/4.2 MB | 50 kB | 155/262 kB
Progress (4): 8.5/12 MB | 4.0/4.2 MB | 50 kB | 155/262 kB
Progress (4): 8.5/12 MB | 4.0/4.2 MB | 50 kB | 155/262 kB
Progress (4): 8.6/12 MB | 4.0/4.2 MB | 50 kB | 155/262 kB
Progress (4): 8.6/12 MB | 4.0/4.2 MB | 50 kB | 172/262 kB
Progress (4): 8.6/12 MB | 4.0/4.2 MB | 50 kB | 172/262 kB
Progress (5): 8.6/12 MB | 4.0/4.2 MB | 50 kB | 172/262 kB | 0/1.3 MB
Progress (5): 8.6/12 MB | 4.0/4.2 MB | 50 kB | 172/262 kB | 0/1.3 MB
Progress (5): 8.6/12 MB | 4.0/4.2 MB | 50 kB | 172/262 kB | 0/1.3 MB
Progress (5): 8.6/12 MB | 4.0/4.2 MB | 50 kB | 188/262 kB | 0/1.3 MB
Progress (5): 8.6/12 MB | 4.0/4.2 MB | 50 kB | 188/262 kB | 0/1.3 MB
Progress (5): 8.6/12 MB | 4.0/4.2 MB | 50 kB | 188/262 kB | 0/1.3 MB
Progress (5): 8.6/12 MB | 4.0/4.2 MB | 50 kB | 188/262 kB | 0/1.3 MB
Progress (5): 8.6/12 MB | 4.0/4.2 MB | 50 kB | 188/262 kB | 0/1.3 MB
Progress (5): 8.6/12 MB | 4.0/4.2 MB | 50 kB | 188/262 kB | 0.1/1.3 MB
Progress (5): 8.6/12 MB | 4.0/4.2 MB | 50 kB | 188/262 kB | 0.1/1.3 MB
Progress (5): 8.6/12 MB | 4.0/4.2 MB | 50 kB | 188/262 kB | 0.1/1.3 MB
Progress (5): 8.6/12 MB | 4.0/4.2 MB | 50 kB | 204/262 kB | 0.1/1.3 MB
Progress (5): 8.6/12 MB | 4.0/4.2 MB | 50 kB | 204/262 kB | 0.1/1.3 MB
Progress (5): 8.6/12 MB | 4.0/4.2 MB | 50 kB | 204/262 kB | 0.1/1.3 MB
Progress (5): 8.6/12 MB | 4.0/4.2 MB | 50 kB | 204/262 kB | 0.1/1.3 MB
Progress (5): 8.7/12 MB | 4.0/4.2 MB | 50 kB | 204/262 kB | 0.1/1.3 MB
Progress (5): 8.7/12 MB | 4.0/4.2 MB | 50 kB | 221/262 kB | 0.1/1.3 MB
Progress (5): 8.7/12 MB | 4.0/4.2 MB | 50 kB | 221/262 kB | 0.1/1.3 MB
Progress (5): 8.7/12 MB | 4.0/4.2 MB | 50 kB | 221/262 kB | 0.1/1.3 MB
Progress (5): 8.7/12 MB | 4.0/4.2 MB | 50 kB | 221/262 kB | 0.1/1.3 MB
Progress (5): 8.7/12 MB | 4.1/4.2 MB | 50 kB | 221/262 kB | 0.1/1.3 MB
Progress (5): 8.7/12 MB | 4.1/4.2 MB | 50 kB | 221/262 kB | 0.1/1.3 MB
Progress (5): 8.7/12 MB | 4.1/4.2 MB | 50 kB | 237/262 kB | 0.1/1.3 MB
Progress (5): 8.7/12 MB | 4.1/4.2 MB | 50 kB | 237/262 kB | 0.1/1.3 MB
Progress (5): 8.7/12 MB | 4.1/4.2 MB | 50 kB | 237/262 kB | 0.1/1.3 MB
Progress (5): 8.7/12 MB | 4.1/4.2 MB | 50 kB | 237/262 kB | 0.1/1.3 MB
Progress (5): 8.7/12 MB | 4.1/4.2 MB | 50 kB | 253/262 kB | 0.1/1.3 MB
Progress (5): 8.7/12 MB | 4.1/4.2 MB | 50 kB | 253/262 kB | 0.1/1.3 MB
Progress (5): 8.7/12 MB | 4.1/4.2 MB | 50 kB | 262 kB | 0.1/1.3 MB    
Progress (5): 8.7/12 MB | 4.1/4.2 MB | 50 kB | 262 kB | 0.1/1.3 MB
Progress (5): 8.7/12 MB | 4.1/4.2 MB | 50 kB | 262 kB | 0.1/1.3 MB
Progress (5): 8.7/12 MB | 4.1/4.2 MB | 50 kB | 262 kB | 0.1/1.3 MB
Progress (5): 8.7/12 MB | 4.1/4.2 MB | 50 kB | 262 kB | 0.1/1.3 MB
Progress (5): 8.7/12 MB | 4.1/4.2 MB | 50 kB | 262 kB | 0.1/1.3 MB
Progress (5): 8.8/12 MB | 4.1/4.2 MB | 50 kB | 262 kB | 0.1/1.3 MB
Progress (5): 8.8/12 MB | 4.1/4.2 MB | 50 kB | 262 kB | 0.1/1.3 MB
Progress (5): 8.8/12 MB | 4.1/4.2 MB | 50 kB | 262 kB | 0.2/1.3 MB
Progress (5): 8.8/12 MB | 4.1/4.2 MB | 50 kB | 262 kB | 0.2/1.3 MB
Progress (5): 8.8/12 MB | 4.1/4.2 MB | 50 kB | 262 kB | 0.2/1.3 MB
Progress (5): 8.8/12 MB | 4.1/4.2 MB | 50 kB | 262 kB | 0.2/1.3 MB
Progress (5): 8.8/12 MB | 4.1/4.2 MB | 50 kB | 262 kB | 0.2/1.3 MB
Progress (5): 8.8/12 MB | 4.1/4.2 MB | 50 kB | 262 kB | 0.2/1.3 MB
Progress (5): 8.8/12 MB | 4.1/4.2 MB | 50 kB | 262 kB | 0.2/1.3 MB
Progress (5): 8.8/12 MB | 4.1/4.2 MB | 50 kB | 262 kB | 0.2/1.3 MB
Progress (5): 8.8/12 MB | 4.1/4.2 MB | 50 kB | 262 kB | 0.2/1.3 MB
Progress (5): 8.8/12 MB | 4.2/4.2 MB | 50 kB | 262 kB | 0.2/1.3 MB
Progress (5): 8.8/12 MB | 4.2/4.2 MB | 50 kB | 262 kB | 0.2/1.3 MB
Progress (5): 8.8/12 MB | 4.2/4.2 MB | 50 kB | 262 kB | 0.2/1.3 MB
                                                                  
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/tomcat/embed/tomcat-embed-el/10.1.30/tomcat-embed-el-10.1.30.jar (262 kB at 44 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/jakarta/validation/jakarta.validation-api/3.0.2/jakarta.validation-api-3.0.2.jar
Progress (4): 8.8/12 MB | 4.2/4.2 MB | 50 kB | 0.2/1.3 MB
Progress (4): 8.9/12 MB | 4.2/4.2 MB | 50 kB | 0.2/1.3 MB
Progress (4): 8.9/12 MB | 4.2/4.2 MB | 50 kB | 0.2/1.3 MB
Progress (4): 8.9/12 MB | 4.2/4.2 MB | 50 kB | 0.2/1.3 MB
Progress (4): 8.9/12 MB | 4.2/4.2 MB | 50 kB | 0.2/1.3 MB
Progress (4): 8.9/12 MB | 4.2/4.2 MB | 50 kB | 0.2/1.3 MB
Progress (4): 8.9/12 MB | 4.2/4.2 MB | 50 kB | 0.2/1.3 MB
Progress (4): 8.9/12 MB | 4.2/4.2 MB | 50 kB | 0.3/1.3 MB
Progress (4): 8.9/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB    
Progress (4): 8.9/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB
Progress (4): 8.9/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB
Progress (4): 8.9/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB
Progress (4): 8.9/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB
Progress (4): 8.9/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB
Progress (4): 9.0/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB
Progress (4): 9.0/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB
Progress (4): 9.0/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB
Progress (4): 9.0/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB
Progress (5): 9.0/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB | 7.7/93 kB
Progress (5): 9.0/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB | 16/93 kB 
Progress (5): 9.0/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB | 16/93 kB
Progress (5): 9.0/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB | 24/93 kB
Progress (5): 9.0/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB | 24/93 kB
Progress (5): 9.0/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB | 24/93 kB
Progress (5): 9.0/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB | 24/93 kB
Progress (5): 9.0/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB | 40/93 kB
Progress (5): 9.0/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB | 40/93 kB
Progress (5): 9.0/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB | 57/93 kB
Progress (5): 9.0/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB | 57/93 kB
Progress (5): 9.1/12 MB | 4.2 MB | 50 kB | 0.3/1.3 MB | 57/93 kB
Progress (5): 9.1/12 MB | 4.2 MB | 50 kB | 0.4/1.3 MB | 57/93 kB
Progress (5): 9.1/12 MB | 4.2 MB | 50 kB | 0.4/1.3 MB | 57/93 kB
Progress (5): 9.1/12 MB | 4.2 MB | 50 kB | 0.4/1.3 MB | 57/93 kB
Progress (5): 9.1/12 MB | 4.2 MB | 50 kB | 0.4/1.3 MB | 57/93 kB
Progress (5): 9.1/12 MB | 4.2 MB | 50 kB | 0.4/1.3 MB | 57/93 kB
Progress (5): 9.1/12 MB | 4.2 MB | 50 kB | 0.4/1.3 MB | 57/93 kB
Progress (5): 9.1/12 MB | 4.2 MB | 50 kB | 0.4/1.3 MB | 57/93 kB
Progress (5): 9.1/12 MB | 4.2 MB | 50 kB | 0.4/1.3 MB | 73/93 kB
Progress (5): 9.1/12 MB | 4.2 MB | 50 kB | 0.4/1.3 MB | 90/93 kB
Progress (5): 9.1/12 MB | 4.2 MB | 50 kB | 0.4/1.3 MB | 93 kB   
Progress (5): 9.1/12 MB | 4.2 MB | 50 kB | 0.4/1.3 MB | 93 kB
Progress (5): 9.1/12 MB | 4.2 MB | 50 kB | 0.4/1.3 MB | 93 kB
Progress (5): 9.2/12 MB | 4.2 MB | 50 kB | 0.4/1.3 MB | 93 kB
Progress (5): 9.2/12 MB | 4.2 MB | 50 kB | 0.4/1.3 MB | 93 kB
Progress (5): 9.2/12 MB | 4.2 MB | 50 kB | 0.4/1.3 MB | 93 kB
Progress (5): 9.2/12 MB | 4.2 MB | 50 kB | 0.4/1.3 MB | 93 kB
Progress (5): 9.2/12 MB | 4.2 MB | 50 kB | 0.4/1.3 MB | 93 kB
Progress (5): 9.2/12 MB | 4.2 MB | 50 kB | 0.4/1.3 MB | 93 kB
Progress (5): 9.2/12 MB | 4.2 MB | 50 kB | 0.4/1.3 MB | 93 kB
                                                             
Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy/1.14.19/byte-buddy-1.14.19.jar (4.2 MB at 694 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/h2database/h2/2.2.224/h2-2.2.224.jar
Progress (4): 9.2/12 MB | 50 kB | 0.5/1.3 MB | 93 kB
                                                    
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/validation/jakarta.validation-api/3.0.2/jakarta.validation-api-3.0.2.jar (93 kB at 15 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-test/3.3.4/spring-boot-starter-test-3.3.4.jar
Progress (3): 9.2/12 MB | 50 kB | 0.5/1.3 MB
Progress (3): 9.2/12 MB | 50 kB | 0.5/1.3 MB
Progress (3): 9.3/12 MB | 50 kB | 0.5/1.3 MB
Progress (3): 9.3/12 MB | 50 kB | 0.5/1.3 MB
Progress (3): 9.3/12 MB | 50 kB | 0.5/1.3 MB
Progress (3): 9.3/12 MB | 50 kB | 0.5/1.3 MB
Progress (3): 9.3/12 MB | 50 kB | 0.5/1.3 MB
Progress (3): 9.3/12 MB | 50 kB | 0.5/1.3 MB
Progress (3): 9.3/12 MB | 50 kB | 0.5/1.3 MB
Progress (4): 9.3/12 MB | 50 kB | 0.5/1.3 MB | 4.8 kB
Progress (4): 9.3/12 MB | 50 kB | 0.5/1.3 MB | 4.8 kB
Progress (5): 9.3/12 MB | 50 kB | 0.5/1.3 MB | 4.8 kB | 0/2.6 MB
Progress (5): 9.3/12 MB | 50 kB | 0.5/1.3 MB | 4.8 kB | 0/2.6 MB
Progress (5): 9.3/12 MB | 50 kB | 0.5/1.3 MB | 4.8 kB | 0/2.6 MB
Progress (5): 9.4/12 MB | 50 kB | 0.5/1.3 MB | 4.8 kB | 0/2.6 MB
Progress (5): 9.4/12 MB | 50 kB | 0.5/1.3 MB | 4.8 kB | 0/2.6 MB
Progress (5): 9.4/12 MB | 50 kB | 0.5/1.3 MB | 4.8 kB | 0/2.6 MB
Progress (5): 9.4/12 MB | 50 kB | 0.5/1.3 MB | 4.8 kB | 0/2.6 MB
Progress (5): 9.4/12 MB | 50 kB | 0.5/1.3 MB | 4.8 kB | 0/2.6 MB
Progress (5): 9.4/12 MB | 50 kB | 0.5/1.3 MB | 4.8 kB | 0/2.6 MB
Progress (5): 9.4/12 MB | 50 kB | 0.5/1.3 MB | 4.8 kB | 0/2.6 MB
Progress (5): 9.4/12 MB | 50 kB | 0.6/1.3 MB | 4.8 kB | 0/2.6 MB
Progress (5): 9.4/12 MB | 50 kB | 0.6/1.3 MB | 4.8 kB | 0/2.6 MB
                                                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-starter-test/3.3.4/spring-boot-starter-test-3.3.4.jar (4.8 kB at 779 B/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test/3.3.4/spring-boot-test-3.3.4.jar
Progress (4): 9.4/12 MB | 50 kB | 0.6/1.3 MB | 0/2.6 MB
Progress (4): 9.4/12 MB | 50 kB | 0.6/1.3 MB | 0/2.6 MB
Progress (4): 9.4/12 MB | 50 kB | 0.6/1.3 MB | 0/2.6 MB
Progress (4): 9.5/12 MB | 50 kB | 0.6/1.3 MB | 0/2.6 MB
Progress (4): 9.5/12 MB | 50 kB | 0.6/1.3 MB | 0.1/2.6 MB
Progress (4): 9.5/12 MB | 50 kB | 0.6/1.3 MB | 0.1/2.6 MB
Progress (4): 9.5/12 MB | 50 kB | 0.6/1.3 MB | 0.1/2.6 MB
Progress (4): 9.5/12 MB | 50 kB | 0.6/1.3 MB | 0.1/2.6 MB
Progress (4): 9.5/12 MB | 50 kB | 0.6/1.3 MB | 0.1/2.6 MB
Progress (4): 9.5/12 MB | 50 kB | 0.6/1.3 MB | 0.1/2.6 MB
                                                         
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-aspects/6.1.13/spring-aspects-6.1.13.jar (50 kB at 8.1 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test-autoconfigure/3.3.4/spring-boot-test-autoconfigure-3.3.4.jar
Progress (3): 9.5/12 MB | 0.6/1.3 MB | 0.1/2.6 MB
Progress (3): 9.5/12 MB | 0.6/1.3 MB | 0.1/2.6 MB
Progress (3): 9.5/12 MB | 0.6/1.3 MB | 0.1/2.6 MB
Progress (3): 9.5/12 MB | 0.6/1.3 MB | 0.1/2.6 MB
Progress (3): 9.5/12 MB | 0.6/1.3 MB | 0.1/2.6 MB
Progress (3): 9.6/12 MB | 0.6/1.3 MB | 0.1/2.6 MB
Progress (3): 9.6/12 MB | 0.6/1.3 MB | 0.1/2.6 MB
Progress (3): 9.6/12 MB | 0.6/1.3 MB | 0.1/2.6 MB
Progress (3): 9.6/12 MB | 0.6/1.3 MB | 0.1/2.6 MB
Progress (4): 9.6/12 MB | 0.6/1.3 MB | 0.1/2.6 MB | 7.7/249 kB
Progress (4): 9.6/12 MB | 0.6/1.3 MB | 0.1/2.6 MB | 16/249 kB 
Progress (4): 9.6/12 MB | 0.7/1.3 MB | 0.1/2.6 MB | 16/249 kB
Progress (4): 9.6/12 MB | 0.7/1.3 MB | 0.1/2.6 MB | 24/249 kB
Progress (4): 9.6/12 MB | 0.7/1.3 MB | 0.1/2.6 MB | 24/249 kB
Progress (4): 9.6/12 MB | 0.7/1.3 MB | 0.1/2.6 MB | 24/249 kB
Progress (4): 9.6/12 MB | 0.7/1.3 MB | 0.1/2.6 MB | 24/249 kB
Progress (4): 9.6/12 MB | 0.7/1.3 MB | 0.1/2.6 MB | 24/249 kB
Progress (4): 9.6/12 MB | 0.7/1.3 MB | 0.1/2.6 MB | 40/249 kB
Progress (4): 9.6/12 MB | 0.7/1.3 MB | 0.1/2.6 MB | 40/249 kB
Progress (4): 9.6/12 MB | 0.7/1.3 MB | 0.1/2.6 MB | 40/249 kB
Progress (4): 9.6/12 MB | 0.7/1.3 MB | 0.1/2.6 MB | 40/249 kB
Progress (4): 9.6/12 MB | 0.7/1.3 MB | 0.1/2.6 MB | 57/249 kB
Progress (5): 9.6/12 MB | 0.7/1.3 MB | 0.1/2.6 MB | 57/249 kB | 7.7/219 kB
Progress (5): 9.6/12 MB | 0.7/1.3 MB | 0.1/2.6 MB | 57/249 kB | 7.7/219 kB
Progress (5): 9.6/12 MB | 0.7/1.3 MB | 0.1/2.6 MB | 57/249 kB | 7.7/219 kB
Progress (5): 9.7/12 MB | 0.7/1.3 MB | 0.1/2.6 MB | 57/249 kB | 7.7/219 kB
Progress (5): 9.7/12 MB | 0.7/1.3 MB | 0.1/2.6 MB | 57/249 kB | 7.7/219 kB
Progress (5): 9.7/12 MB | 0.7/1.3 MB | 0.1/2.6 MB | 57/249 kB | 7.7/219 kB
Progress (5): 9.7/12 MB | 0.7/1.3 MB | 0.1/2.6 MB | 73/249 kB | 7.7/219 kB
Progress (5): 9.7/12 MB | 0.7/1.3 MB | 0.1/2.6 MB | 73/249 kB | 7.7/219 kB
Progress (5): 9.7/12 MB | 0.7/1.3 MB | 0.2/2.6 MB | 73/249 kB | 7.7/219 kB
Progress (5): 9.7/12 MB | 0.7/1.3 MB | 0.2/2.6 MB | 73/249 kB | 7.7/219 kB
Progress (5): 9.7/12 MB | 0.7/1.3 MB | 0.2/2.6 MB | 73/249 kB | 24/219 kB 
Progress (5): 9.7/12 MB | 0.7/1.3 MB | 0.2/2.6 MB | 73/249 kB | 24/219 kB
Progress (5): 9.7/12 MB | 0.7/1.3 MB | 0.2/2.6 MB | 90/249 kB | 24/219 kB
Progress (5): 9.7/12 MB | 0.7/1.3 MB | 0.2/2.6 MB | 90/249 kB | 24/219 kB
Progress (5): 9.7/12 MB | 0.7/1.3 MB | 0.2/2.6 MB | 90/249 kB | 24/219 kB
Progress (5): 9.7/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 90/249 kB | 24/219 kB
Progress (5): 9.7/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 90/249 kB | 40/219 kB
Progress (5): 9.7/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 90/249 kB | 40/219 kB
Progress (5): 9.7/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 90/249 kB | 40/219 kB
Progress (5): 9.7/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 90/249 kB | 40/219 kB
Progress (5): 9.7/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 106/249 kB | 40/219 kB
Progress (5): 9.7/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 106/249 kB | 40/219 kB
Progress (5): 9.7/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 106/249 kB | 40/219 kB
Progress (5): 9.7/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 106/249 kB | 40/219 kB
Progress (5): 9.7/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 122/249 kB | 40/219 kB
Progress (5): 9.8/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 122/249 kB | 40/219 kB
Progress (5): 9.8/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 122/249 kB | 40/219 kB
Progress (5): 9.8/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 122/249 kB | 40/219 kB
Progress (5): 9.8/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 122/249 kB | 40/219 kB
Progress (5): 9.8/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 122/249 kB | 57/219 kB
Progress (5): 9.8/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 139/249 kB | 57/219 kB
Progress (5): 9.8/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 139/249 kB | 57/219 kB
Progress (5): 9.8/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 139/249 kB | 57/219 kB
Progress (5): 9.8/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 139/249 kB | 57/219 kB
Progress (5): 9.8/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 139/249 kB | 73/219 kB
Progress (5): 9.8/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 139/249 kB | 73/219 kB
Progress (5): 9.8/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 155/249 kB | 73/219 kB
Progress (5): 9.8/12 MB | 0.8/1.3 MB | 0.2/2.6 MB | 155/249 kB | 73/219 kB
Progress (5): 9.8/12 MB | 0.9/1.3 MB | 0.2/2.6 MB | 155/249 kB | 73/219 kB
Progress (5): 9.8/12 MB | 0.9/1.3 MB | 0.2/2.6 MB | 155/249 kB | 73/219 kB
Progress (5): 9.8/12 MB | 0.9/1.3 MB | 0.2/2.6 MB | 155/249 kB | 73/219 kB
Progress (5): 9.8/12 MB | 0.9/1.3 MB | 0.2/2.6 MB | 172/249 kB | 73/219 kB
Progress (5): 9.8/12 MB | 0.9/1.3 MB | 0.2/2.6 MB | 172/249 kB | 73/219 kB
Progress (5): 9.8/12 MB | 0.9/1.3 MB | 0.2/2.6 MB | 172/249 kB | 73/219 kB
Progress (5): 9.9/12 MB | 0.9/1.3 MB | 0.2/2.6 MB | 172/249 kB | 73/219 kB
Progress (5): 9.9/12 MB | 0.9/1.3 MB | 0.2/2.6 MB | 172/249 kB | 73/219 kB
Progress (5): 9.9/12 MB | 0.9/1.3 MB | 0.2/2.6 MB | 172/249 kB | 90/219 kB
Progress (5): 9.9/12 MB | 0.9/1.3 MB | 0.3/2.6 MB | 172/249 kB | 90/219 kB
Progress (5): 9.9/12 MB | 0.9/1.3 MB | 0.3/2.6 MB | 188/249 kB | 90/219 kB
Progress (5): 9.9/12 MB | 0.9/1.3 MB | 0.3/2.6 MB | 188/249 kB | 90/219 kB
Progress (5): 9.9/12 MB | 0.9/1.3 MB | 0.3/2.6 MB | 188/249 kB | 90/219 kB
Progress (5): 9.9/12 MB | 0.9/1.3 MB | 0.3/2.6 MB | 188/249 kB | 90/219 kB
Progress (5): 9.9/12 MB | 0.9/1.3 MB | 0.3/2.6 MB | 188/249 kB | 90/219 kB
Progress (5): 9.9/12 MB | 0.9/1.3 MB | 0.3/2.6 MB | 188/249 kB | 106/219 kB
Progress (5): 9.9/12 MB | 0.9/1.3 MB | 0.3/2.6 MB | 204/249 kB | 106/219 kB
Progress (5): 9.9/12 MB | 0.9/1.3 MB | 0.3/2.6 MB | 204/249 kB | 106/219 kB
Progress (5): 9.9/12 MB | 0.9/1.3 MB | 0.3/2.6 MB | 204/249 kB | 106/219 kB
Progress (5): 9.9/12 MB | 0.9/1.3 MB | 0.3/2.6 MB | 204/249 kB | 106/219 kB
Progress (5): 9.9/12 MB | 0.9/1.3 MB | 0.3/2.6 MB | 204/249 kB | 106/219 kB
Progress (5): 9.9/12 MB | 0.9/1.3 MB | 0.3/2.6 MB | 221/249 kB | 106/219 kB
Progress (5): 9.9/12 MB | 0.9/1.3 MB | 0.3/2.6 MB | 221/249 kB | 106/219 kB
Progress (5): 9.9/12 MB | 0.9/1.3 MB | 0.3/2.6 MB | 221/249 kB | 106/219 kB
Progress (5): 9.9/12 MB | 0.9/1.3 MB | 0.3/2.6 MB | 221/249 kB | 122/219 kB
Progress (5): 10.0/12 MB | 0.9/1.3 MB | 0.3/2.6 MB | 221/249 kB | 122/219 kB
Progress (5): 10.0/12 MB | 0.9/1.3 MB | 0.3/2.6 MB | 237/249 kB | 122/219 kB
Progress (5): 10.0/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 237/249 kB | 122/219 kB
Progress (5): 10.0/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 237/249 kB | 122/219 kB
Progress (5): 10.0/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 237/249 kB | 122/219 kB
Progress (5): 10.0/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 237/249 kB | 122/219 kB
Progress (5): 10.0/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 249 kB | 122/219 kB    
Progress (5): 10.0/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 249 kB | 139/219 kB
Progress (5): 10.0/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 249 kB | 139/219 kB
Progress (5): 10.0/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 249 kB | 139/219 kB
Progress (5): 10/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 249 kB | 139/219 kB  

Progress (5): 10/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 249 kB | 139/219 kB
Progress (5): 10/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 249 kB | 139/219 kB
Progress (5): 10/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 249 kB | 139/219 kB
Progress (5): 10/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 249 kB | 139/219 kB
Progress (5): 10/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 249 kB | 139/219 kB
Progress (5): 10/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 249 kB | 155/219 kB
Progress (5): 10/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 249 kB | 155/219 kB
Progress (5): 10/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 249 kB | 155/219 kB
Progress (5): 10/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 249 kB | 155/219 kB
Progress (5): 10/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 249 kB | 155/219 kB
Progress (5): 10/12 MB | 1.0/1.3 MB | 0.3/2.6 MB | 249 kB | 155/219 kB
Progress (5): 10/12 MB | 1.0/1.3 MB | 0.4/2.6 MB | 249 kB | 155/219 kB
Progress (5): 10/12 MB | 1.0/1.3 MB | 0.4/2.6 MB | 249 kB | 172/219 kB
Progress (5): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 249 kB | 172/219 kB
Progress (5): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 249 kB | 172/219 kB
Progress (5): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 249 kB | 172/219 kB
Progress (5): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 249 kB | 172/219 kB
Progress (5): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 249 kB | 172/219 kB
Progress (5): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 249 kB | 172/219 kB
Progress (5): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 249 kB | 188/219 kB
Progress (5): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 249 kB | 188/219 kB
                                                                      
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test/3.3.4/spring-boot-test-3.3.4.jar (249 kB at 39 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/jayway/jsonpath/json-path/2.9.0/json-path-2.9.0.jar
Progress (4): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 188/219 kB
Progress (4): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 188/219 kB
Progress (4): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 188/219 kB
Progress (4): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 188/219 kB
Progress (4): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 204/219 kB
Progress (4): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 204/219 kB
Progress (4): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 204/219 kB
Progress (4): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 204/219 kB
Progress (4): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 204/219 kB
Progress (4): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 204/219 kB
Progress (4): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 204/219 kB
Progress (4): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 204/219 kB
Progress (4): 10/12 MB | 1.1/1.3 MB | 0.4/2.6 MB | 219 kB    
Progress (4): 10/12 MB | 1.2/1.3 MB | 0.4/2.6 MB | 219 kB
Progress (4): 10/12 MB | 1.2/1.3 MB | 0.4/2.6 MB | 219 kB
Progress (4): 10/12 MB | 1.2/1.3 MB | 0.4/2.6 MB | 219 kB
Progress (4): 10/12 MB | 1.2/1.3 MB | 0.4/2.6 MB | 219 kB
Progress (4): 10/12 MB | 1.2/1.3 MB | 0.4/2.6 MB | 219 kB
Progress (4): 10/12 MB | 1.2/1.3 MB | 0.4/2.6 MB | 219 kB
Progress (4): 10/12 MB | 1.2/1.3 MB | 0.4/2.6 MB | 219 kB
Progress (4): 10/12 MB | 1.2/1.3 MB | 0.4/2.6 MB | 219 kB
Progress (5): 10/12 MB | 1.2/1.3 MB | 0.4/2.6 MB | 219 kB | 3.2/277 kB
Progress (5): 10/12 MB | 1.2/1.3 MB | 0.4/2.6 MB | 219 kB | 3.2/277 kB
Progress (5): 10/12 MB | 1.2/1.3 MB | 0.4/2.6 MB | 219 kB | 3.2/277 kB
Progress (5): 10/12 MB | 1.2/1.3 MB | 0.4/2.6 MB | 219 kB | 11/277 kB 
Progress (5): 10/12 MB | 1.2/1.3 MB | 0.4/2.6 MB | 219 kB | 11/277 kB
                                                                     
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/boot/spring-boot-test-autoconfigure/3.3.4/spring-boot-test-autoconfigure-3.3.4.jar (219 kB at 34 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api/4.0.2/jakarta.xml.bind-api-4.0.2.jar
Progress (4): 10/12 MB | 1.2/1.3 MB | 0.4/2.6 MB | 28/277 kB
Progress (4): 10/12 MB | 1.2/1.3 MB | 0.5/2.6 MB | 28/277 kB
Progress (4): 10/12 MB | 1.2/1.3 MB | 0.5/2.6 MB | 28/277 kB
Progress (4): 10/12 MB | 1.2/1.3 MB | 0.5/2.6 MB | 28/277 kB
Progress (4): 10/12 MB | 1.2/1.3 MB | 0.5/2.6 MB | 28/277 kB
Progress (4): 10/12 MB | 1.2/1.3 MB | 0.5/2.6 MB | 28/277 kB
Progress (4): 10/12 MB | 1.2/1.3 MB | 0.5/2.6 MB | 44/277 kB
Progress (4): 10/12 MB | 1.2/1.3 MB | 0.5/2.6 MB | 44/277 kB
Progress (4): 10/12 MB | 1.2/1.3 MB | 0.5/2.6 MB | 44/277 kB
Progress (4): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 44/277 kB
Progress (4): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 44/277 kB
Progress (4): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 44/277 kB
Progress (4): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 44/277 kB
Progress (4): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 61/277 kB
Progress (4): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 61/277 kB
Progress (4): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 61/277 kB
Progress (4): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 61/277 kB
Progress (4): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 77/277 kB
Progress (4): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 77/277 kB
Progress (4): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 77/277 kB
Progress (4): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 77/277 kB
Progress (4): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 77/277 kB
Progress (4): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 93/277 kB
Progress (4): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 93/277 kB
Progress (4): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 93/277 kB
Progress (4): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 93/277 kB
Progress (4): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 93/277 kB
Progress (4): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 93/277 kB
Progress (5): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 93/277 kB | 7.7/131 kB
Progress (5): 10/12 MB | 1.3/1.3 MB | 0.5/2.6 MB | 93/277 kB | 16/131 kB 
Progress (5): 10/12 MB | 1.3 MB | 0.5/2.6 MB | 93/277 kB | 16/131 kB    
Progress (5): 10/12 MB | 1.3 MB | 0.5/2.6 MB | 110/277 kB | 16/131 kB
Progress (5): 10/12 MB | 1.3 MB | 0.5/2.6 MB | 110/277 kB | 16/131 kB
Progress (5): 10/12 MB | 1.3 MB | 0.5/2.6 MB | 110/277 kB | 16/131 kB
Progress (5): 10/12 MB | 1.3 MB | 0.6/2.6 MB | 110/277 kB | 16/131 kB
Progress (5): 10/12 MB | 1.3 MB | 0.6/2.6 MB | 110/277 kB | 32/131 kB
Progress (5): 10/12 MB | 1.3 MB | 0.6/2.6 MB | 110/277 kB | 32/131 kB
Progress (5): 10/12 MB | 1.3 MB | 0.6/2.6 MB | 126/277 kB | 32/131 kB
Progress (5): 10/12 MB | 1.3 MB | 0.6/2.6 MB | 134/277 kB | 32/131 kB
Progress (5): 10/12 MB | 1.3 MB | 0.6/2.6 MB | 134/277 kB | 32/131 kB
Progress (5): 10/12 MB | 1.3 MB | 0.6/2.6 MB | 134/277 kB | 48/131 kB
Progress (5): 10/12 MB | 1.3 MB | 0.6/2.6 MB | 134/277 kB | 48/131 kB
Progress (5): 10/12 MB | 1.3 MB | 0.6/2.6 MB | 151/277 kB | 48/131 kB
Progress (5): 11/12 MB | 1.3 MB | 0.6/2.6 MB | 151/277 kB | 48/131 kB
Progress (5): 11/12 MB | 1.3 MB | 0.6/2.6 MB | 151/277 kB | 48/131 kB
Progress (5): 11/12 MB | 1.3 MB | 0.6/2.6 MB | 151/277 kB | 65/131 kB
Progress (5): 11/12 MB | 1.3 MB | 0.6/2.6 MB | 151/277 kB | 65/131 kB
Progress (5): 11/12 MB | 1.3 MB | 0.6/2.6 MB | 167/277 kB | 65/131 kB
                                                                     
Downloaded from central: https://repo.maven.apache.org/maven2/org/hibernate/validator/hibernate-validator/8.0.1.Final/hibernate-validator-8.0.1.Final.jar (1.3 MB at 201 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/jakarta/activation/jakarta.activation-api/2.1.3/jakarta.activation-api-2.1.3.jar
Progress (4): 11/12 MB | 0.6/2.6 MB | 167/277 kB | 65/131 kB
Progress (4): 11/12 MB | 0.6/2.6 MB | 167/277 kB | 65/131 kB
Progress (4): 11/12 MB | 0.6/2.6 MB | 167/277 kB | 81/131 kB
Progress (4): 11/12 MB | 0.6/2.6 MB | 167/277 kB | 81/131 kB
Progress (4): 11/12 MB | 0.6/2.6 MB | 183/277 kB | 81/131 kB
Progress (4): 11/12 MB | 0.6/2.6 MB | 183/277 kB | 81/131 kB
Progress (4): 11/12 MB | 0.6/2.6 MB | 183/277 kB | 81/131 kB
Progress (4): 11/12 MB | 0.6/2.6 MB | 183/277 kB | 81/131 kB
Progress (4): 11/12 MB | 0.6/2.6 MB | 183/277 kB | 97/131 kB
Progress (4): 11/12 MB | 0.6/2.6 MB | 200/277 kB | 97/131 kB
Progress (4): 11/12 MB | 0.6/2.6 MB | 200/277 kB | 97/131 kB
Progress (4): 11/12 MB | 0.6/2.6 MB | 200/277 kB | 97/131 kB
Progress (4): 11/12 MB | 0.6/2.6 MB | 200/277 kB | 114/131 kB
Progress (4): 11/12 MB | 0.6/2.6 MB | 200/277 kB | 114/131 kB
Progress (4): 11/12 MB | 0.6/2.6 MB | 216/277 kB | 114/131 kB
Progress (4): 11/12 MB | 0.7/2.6 MB | 216/277 kB | 114/131 kB
Progress (5): 11/12 MB | 0.7/2.6 MB | 216/277 kB | 114/131 kB | 7.7/67 kB
Progress (5): 11/12 MB | 0.7/2.6 MB | 216/277 kB | 114/131 kB | 7.7/67 kB
Progress (5): 11/12 MB | 0.7/2.6 MB | 216/277 kB | 130/131 kB | 7.7/67 kB
Progress (5): 11/12 MB | 0.7/2.6 MB | 216/277 kB | 131 kB | 7.7/67 kB    
Progress (5): 11/12 MB | 0.7/2.6 MB | 216/277 kB | 131 kB | 7.7/67 kB
Progress (5): 11/12 MB | 0.7/2.6 MB | 216/277 kB | 131 kB | 7.7/67 kB
Progress (5): 11/12 MB | 0.7/2.6 MB | 216/277 kB | 131 kB | 24/67 kB 
Progress (5): 11/12 MB | 0.7/2.6 MB | 233/277 kB | 131 kB | 24/67 kB
Progress (5): 11/12 MB | 0.7/2.6 MB | 233/277 kB | 131 kB | 24/67 kB
Progress (5): 11/12 MB | 0.7/2.6 MB | 233/277 kB | 131 kB | 40/67 kB
Progress (5): 11/12 MB | 0.7/2.6 MB | 233/277 kB | 131 kB | 40/67 kB
Progress (5): 11/12 MB | 0.7/2.6 MB | 233/277 kB | 131 kB | 40/67 kB
Progress (5): 11/12 MB | 0.7/2.6 MB | 233/277 kB | 131 kB | 40/67 kB
Progress (5): 11/12 MB | 0.7/2.6 MB | 249/277 kB | 131 kB | 40/67 kB
Progress (5): 11/12 MB | 0.7/2.6 MB | 249/277 kB | 131 kB | 57/67 kB
Progress (5): 11/12 MB | 0.7/2.6 MB | 249/277 kB | 131 kB | 57/67 kB
Progress (5): 11/12 MB | 0.7/2.6 MB | 249/277 kB | 131 kB | 67 kB   
Progress (5): 11/12 MB | 0.7/2.6 MB | 249/277 kB | 131 kB | 67 kB
                                                                 
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/xml/bind/jakarta.xml.bind-api/4.0.2/jakarta.xml.bind-api-4.0.2.jar (131 kB at 20 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/net/minidev/json-smart/2.5.1/json-smart-2.5.1.jar
Progress (4): 11/12 MB | 0.7/2.6 MB | 265/277 kB | 67 kB
Progress (4): 11/12 MB | 0.7/2.6 MB | 265/277 kB | 67 kB
Progress (4): 11/12 MB | 0.7/2.6 MB | 277 kB | 67 kB    
Progress (4): 11/12 MB | 0.7/2.6 MB | 277 kB | 67 kB
Progress (4): 11/12 MB | 0.7/2.6 MB | 277 kB | 67 kB
Progress (4): 11/12 MB | 0.7/2.6 MB | 277 kB | 67 kB
Progress (4): 11/12 MB | 0.7/2.6 MB | 277 kB | 67 kB
Progress (4): 11/12 MB | 0.7/2.6 MB | 277 kB | 67 kB
Progress (4): 11/12 MB | 0.7/2.6 MB | 277 kB | 67 kB
                                                    
Downloaded from central: https://repo.maven.apache.org/maven2/jakarta/activation/jakarta.activation-api/2.1.3/jakarta.activation-api-2.1.3.jar (67 kB at 9.9 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/net/minidev/accessors-smart/2.5.1/accessors-smart-2.5.1.jar
Progress (3): 11/12 MB | 0.7/2.6 MB | 277 kB
Progress (3): 11/12 MB | 0.8/2.6 MB | 277 kB
Progress (3): 11/12 MB | 0.8/2.6 MB | 277 kB
                                            
Downloaded from central: https://repo.maven.apache.org/maven2/com/jayway/jsonpath/json-path/2.9.0/json-path-2.9.0.jar (277 kB at 41 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.6/asm-9.6.jar
Progress (2): 11/12 MB | 0.8/2.6 MB
Progress (2): 11/12 MB | 0.8/2.6 MB
Progress (2): 11/12 MB | 0.8/2.6 MB
Progress (3): 11/12 MB | 0.8/2.6 MB | 7.7/122 kB
Progress (3): 11/12 MB | 0.8/2.6 MB | 16/122 kB 
Progress (3): 11/12 MB | 0.8/2.6 MB | 24/122 kB
Progress (3): 11/12 MB | 0.8/2.6 MB | 24/122 kB
Progress (3): 11/12 MB | 0.8/2.6 MB | 24/122 kB
Progress (3): 11/12 MB | 0.8/2.6 MB | 40/122 kB
Progress (3): 11/12 MB | 0.8/2.6 MB | 40/122 kB
Progress (3): 11/12 MB | 0.8/2.6 MB | 40/122 kB
Progress (3): 11/12 MB | 0.8/2.6 MB | 57/122 kB
Progress (3): 11/12 MB | 0.8/2.6 MB | 57/122 kB
Progress (4): 11/12 MB | 0.8/2.6 MB | 57/122 kB | 7.7/30 kB
Progress (4): 11/12 MB | 0.8/2.6 MB | 57/122 kB | 16/30 kB 
Progress (4): 11/12 MB | 0.8/2.6 MB | 57/122 kB | 16/30 kB
Progress (4): 11/12 MB | 0.8/2.6 MB | 73/122 kB | 16/30 kB
Progress (4): 11/12 MB | 0.8/2.6 MB | 73/122 kB | 16/30 kB
Progress (4): 11/12 MB | 0.8/2.6 MB | 73/122 kB | 16/30 kB
Progress (4): 11/12 MB | 0.8/2.6 MB | 73/122 kB | 30 kB   
Progress (4): 11/12 MB | 0.8/2.6 MB | 90/122 kB | 30 kB
Progress (5): 11/12 MB | 0.8/2.6 MB | 90/122 kB | 30 kB | 7.7/124 kB
Progress (5): 11/12 MB | 0.8/2.6 MB | 90/122 kB | 30 kB | 16/124 kB 
Progress (5): 11/12 MB | 0.8/2.6 MB | 90/122 kB | 30 kB | 16/124 kB
Progress (5): 11/12 MB | 0.8/2.6 MB | 90/122 kB | 30 kB | 24/124 kB
Progress (5): 11/12 MB | 0.8/2.6 MB | 90/122 kB | 30 kB | 24/124 kB
Progress (5): 11/12 MB | 0.8/2.6 MB | 90/122 kB | 30 kB | 24/124 kB
Progress (5): 11/12 MB | 0.8/2.6 MB | 106/122 kB | 30 kB | 24/124 kB
Progress (5): 11/12 MB | 0.8/2.6 MB | 106/122 kB | 30 kB | 24/124 kB
Progress (5): 11/12 MB | 0.8/2.6 MB | 122 kB | 30 kB | 24/124 kB    
Progress (5): 11/12 MB | 0.9/2.6 MB | 122 kB | 30 kB | 24/124 kB
Progress (5): 11/12 MB | 0.9/2.6 MB | 122 kB | 30 kB | 40/124 kB
Progress (5): 11/12 MB | 0.9/2.6 MB | 122 kB | 30 kB | 40/124 kB
Progress (5): 11/12 MB | 0.9/2.6 MB | 122 kB | 30 kB | 40/124 kB
Progress (5): 11/12 MB | 0.9/2.6 MB | 122 kB | 30 kB | 40/124 kB
Progress (5): 11/12 MB | 0.9/2.6 MB | 122 kB | 30 kB | 40/124 kB
Progress (5): 11/12 MB | 0.9/2.6 MB | 122 kB | 30 kB | 57/124 kB
Progress (5): 11/12 MB | 0.9/2.6 MB | 122 kB | 30 kB | 57/124 kB
Progress (5): 11/12 MB | 0.9/2.6 MB | 122 kB | 30 kB | 57/124 kB
                                                                
Downloaded from central: https://repo.maven.apache.org/maven2/net/minidev/json-smart/2.5.1/json-smart-2.5.1.jar (122 kB at 18 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-core/3.25.3/assertj-core-3.25.3.jar
Progress (4): 11/12 MB | 0.9/2.6 MB | 30 kB | 73/124 kB
Progress (4): 11/12 MB | 0.9/2.6 MB | 30 kB | 73/124 kB
Progress (4): 11/12 MB | 0.9/2.6 MB | 30 kB | 73/124 kB
Progress (4): 11/12 MB | 0.9/2.6 MB | 30 kB | 73/124 kB
Progress (4): 11/12 MB | 0.9/2.6 MB | 30 kB | 73/124 kB
Progress (4): 11/12 MB | 0.9/2.6 MB | 30 kB | 90/124 kB
Progress (4): 11/12 MB | 0.9/2.6 MB | 30 kB | 90/124 kB
Progress (4): 11/12 MB | 0.9/2.6 MB | 30 kB | 90/124 kB
Progress (4): 11/12 MB | 0.9/2.6 MB | 30 kB | 90/124 kB
Progress (4): 11/12 MB | 0.9/2.6 MB | 30 kB | 90/124 kB
Progress (4): 11/12 MB | 0.9/2.6 MB | 30 kB | 90/124 kB
Progress (4): 11/12 MB | 0.9/2.6 MB | 30 kB | 106/124 kB
Progress (4): 11/12 MB | 0.9/2.6 MB | 30 kB | 106/124 kB
Progress (4): 11/12 MB | 0.9/2.6 MB | 30 kB | 106/124 kB
Progress (4): 11/12 MB | 1.0/2.6 MB | 30 kB | 106/124 kB
Progress (5): 11/12 MB | 1.0/2.6 MB | 30 kB | 106/124 kB | 0/1.4 MB
Progress (5): 11/12 MB | 1.0/2.6 MB | 30 kB | 106/124 kB | 0/1.4 MB
Progress (5): 11/12 MB | 1.0/2.6 MB | 30 kB | 106/124 kB | 0/1.4 MB
Progress (5): 11/12 MB | 1.0/2.6 MB | 30 kB | 122/124 kB | 0/1.4 MB
Progress (5): 11/12 MB | 1.0/2.6 MB | 30 kB | 124 kB | 0/1.4 MB    
Progress (5): 11/12 MB | 1.0/2.6 MB | 30 kB | 124 kB | 0/1.4 MB
Progress (5): 11/12 MB | 1.0/2.6 MB | 30 kB | 124 kB | 0/1.4 MB
Progress (5): 11/12 MB | 1.0/2.6 MB | 30 kB | 124 kB | 0/1.4 MB
Progress (5): 11/12 MB | 1.0/2.6 MB | 30 kB | 124 kB | 0/1.4 MB
Progress (5): 11/12 MB | 1.0/2.6 MB | 30 kB | 124 kB | 0/1.4 MB
Progress (5): 11/12 MB | 1.0/2.6 MB | 30 kB | 124 kB | 0/1.4 MB
Progress (5): 11/12 MB | 1.0/2.6 MB | 30 kB | 124 kB | 0/1.4 MB
                                                               
Downloaded from central: https://repo.maven.apache.org/maven2/org/ow2/asm/asm/9.6/asm-9.6.jar (124 kB at 18 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/awaitility/awaitility/4.2.2/awaitility-4.2.2.jar
Progress (4): 11/12 MB | 1.0/2.6 MB | 30 kB | 0.1/1.4 MB
Progress (4): 11/12 MB | 1.0/2.6 MB | 30 kB | 0.1/1.4 MB
Progress (4): 11/12 MB | 1.0/2.6 MB | 30 kB | 0.1/1.4 MB
Progress (4): 11/12 MB | 1.0/2.6 MB | 30 kB | 0.1/1.4 MB
Progress (4): 11/12 MB | 1.0/2.6 MB | 30 kB | 0.1/1.4 MB
Progress (4): 11/12 MB | 1.0/2.6 MB | 30 kB | 0.1/1.4 MB
Progress (4): 11/12 MB | 1.0/2.6 MB | 30 kB | 0.1/1.4 MB
Progress (4): 11/12 MB | 1.0/2.6 MB | 30 kB | 0.1/1.4 MB
Progress (4): 11/12 MB | 1.0/2.6 MB | 30 kB | 0.1/1.4 MB
Progress (4): 11/12 MB | 1.0/2.6 MB | 30 kB | 0.1/1.4 MB
Progress (4): 11/12 MB | 1.0/2.6 MB | 30 kB | 0.1/1.4 MB
Progress (4): 11/12 MB | 1.0/2.6 MB | 30 kB | 0.1/1.4 MB
Progress (4): 11/12 MB | 1.0/2.6 MB | 30 kB | 0.1/1.4 MB
Progress (4): 11/12 MB | 1.0/2.6 MB | 30 kB | 0.1/1.4 MB
Progress (4): 11/12 MB | 1.0/2.6 MB | 30 kB | 0.1/1.4 MB
Progress (4): 11/12 MB | 1.0/2.6 MB | 30 kB | 0.1/1.4 MB
Progress (4): 11/12 MB | 1.0/2.6 MB | 30 kB | 0.1/1.4 MB
Progress (4): 11/12 MB | 1.0/2.6 MB | 30 kB | 0.1/1.4 MB
Progress (4): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.1/1.4 MB
Progress (4): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB
Progress (4): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB
Progress (4): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB
Progress (4): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB
Progress (5): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 7.7/97 kB
Progress (5): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 16/97 kB 
Progress (5): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 16/97 kB
Progress (5): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 16/97 kB
Progress (5): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 16/97 kB
Progress (5): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 24/97 kB
Progress (5): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 24/97 kB
Progress (5): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 24/97 kB
Progress (5): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 24/97 kB
Progress (5): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 24/97 kB
Progress (5): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 40/97 kB
Progress (5): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 40/97 kB
Progress (5): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 40/97 kB
Progress (5): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 40/97 kB
Progress (5): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 40/97 kB
Progress (5): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 57/97 kB
Progress (5): 11/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 57/97 kB
Progress (5): 12/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 57/97 kB
Progress (5): 12/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 57/97 kB
Progress (5): 12/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 57/97 kB
Progress (5): 12/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 57/97 kB
Progress (5): 12/12 MB | 1.1/2.6 MB | 30 kB | 0.2/1.4 MB | 57/97 kB
Progress (5): 12/12 MB | 1.1/2.6 MB | 30 kB | 0.3/1.4 MB | 57/97 kB
Progress (5): 12/12 MB | 1.1/2.6 MB | 30 kB | 0.3/1.4 MB | 73/97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 73/97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 73/97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 73/97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 90/97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 90/97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 97 kB   
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.3/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.4/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.4/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.4/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.4/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.2/2.6 MB | 30 kB | 0.4/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.3/2.6 MB | 30 kB | 0.4/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.3/2.6 MB | 30 kB | 0.4/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.3/2.6 MB | 30 kB | 0.4/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.3/2.6 MB | 30 kB | 0.4/1.4 MB | 97 kB
Progress (5): 12/12 MB | 1.3/2.6 MB | 30 kB | 0.4/1.4 MB | 97 kB
                                                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/awaitility/awaitility/4.2.2/awaitility-4.2.2.jar (97 kB at 14 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest/2.2/hamcrest-2.2.jar
Progress (4): 12/12 MB | 1.3/2.6 MB | 30 kB | 0.4/1.4 MB
Progress (4): 12/12 MB | 1.3/2.6 MB | 30 kB | 0.4/1.4 MB
Progress (4): 12/12 MB | 1.3/2.6 MB | 30 kB | 0.4/1.4 MB
Progress (4): 12/12 MB | 1.3/2.6 MB | 30 kB | 0.4/1.4 MB
Progress (4): 12/12 MB | 1.3/2.6 MB | 30 kB | 0.4/1.4 MB
Progress (4): 12/12 MB | 1.3/2.6 MB | 30 kB | 0.4/1.4 MB
Progress (4): 12/12 MB | 1.3/2.6 MB | 30 kB | 0.4/1.4 MB
Progress (4): 12/12 MB | 1.3/2.6 MB | 30 kB | 0.4/1.4 MB
Progress (4): 12 MB | 1.3/2.6 MB | 30 kB | 0.4/1.4 MB   
Progress (4): 12 MB | 1.3/2.6 MB | 30 kB | 0.5/1.4 MB
Progress (4): 12 MB | 1.3/2.6 MB | 30 kB | 0.5/1.4 MB
Progress (4): 12 MB | 1.3/2.6 MB | 30 kB | 0.5/1.4 MB
Progress (4): 12 MB | 1.3/2.6 MB | 30 kB | 0.5/1.4 MB
Progress (4): 12 MB | 1.3/2.6 MB | 30 kB | 0.5/1.4 MB
Progress (4): 12 MB | 1.3/2.6 MB | 30 kB | 0.5/1.4 MB
Progress (4): 12 MB | 1.4/2.6 MB | 30 kB | 0.5/1.4 MB
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.5/1.4 MB | 7.7/123 kB
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.5/1.4 MB | 16/123 kB 
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.5/1.4 MB | 24/123 kB
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.5/1.4 MB | 24/123 kB
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.5/1.4 MB | 24/123 kB
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.5/1.4 MB | 24/123 kB
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.5/1.4 MB | 40/123 kB
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.5/1.4 MB | 40/123 kB
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.6/1.4 MB | 40/123 kB
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.6/1.4 MB | 57/123 kB
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.6/1.4 MB | 57/123 kB
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.6/1.4 MB | 57/123 kB
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.6/1.4 MB | 57/123 kB
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.6/1.4 MB | 73/123 kB
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.6/1.4 MB | 73/123 kB
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.6/1.4 MB | 73/123 kB
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.6/1.4 MB | 73/123 kB
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.6/1.4 MB | 90/123 kB
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.6/1.4 MB | 90/123 kB
Progress (5): 12 MB | 1.4/2.6 MB | 30 kB | 0.6/1.4 MB | 90/123 kB
Progress (5): 12 MB | 1.5/2.6 MB | 30 kB | 0.6/1.4 MB | 90/123 kB
Progress (5): 12 MB | 1.5/2.6 MB | 30 kB | 0.7/1.4 MB | 90/123 kB
Progress (5): 12 MB | 1.5/2.6 MB | 30 kB | 0.7/1.4 MB | 106/123 kB
Progress (5): 12 MB | 1.5/2.6 MB | 30 kB | 0.7/1.4 MB | 122/123 kB
Progress (5): 12 MB | 1.5/2.6 MB | 30 kB | 0.7/1.4 MB | 122/123 kB
Progress (5): 12 MB | 1.5/2.6 MB | 30 kB | 0.7/1.4 MB | 122/123 kB
Progress (5): 12 MB | 1.5/2.6 MB | 30 kB | 0.7/1.4 MB | 123 kB    
Progress (5): 12 MB | 1.5/2.6 MB | 30 kB | 0.7/1.4 MB | 123 kB
Progress (5): 12 MB | 1.5/2.6 MB | 30 kB | 0.7/1.4 MB | 123 kB
Progress (5): 12 MB | 1.5/2.6 MB | 30 kB | 0.7/1.4 MB | 123 kB
Progress (5): 12 MB | 1.5/2.6 MB | 30 kB | 0.7/1.4 MB | 123 kB
Progress (5): 12 MB | 1.5/2.6 MB | 30 kB | 0.7/1.4 MB | 123 kB
Progress (5): 12 MB | 1.5/2.6 MB | 30 kB | 0.7/1.4 MB | 123 kB
                                                              
Downloaded from central: https://repo.maven.apache.org/maven2/net/minidev/accessors-smart/2.5.1/accessors-smart-2.5.1.jar (30 kB at 4.2 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter/5.10.3/junit-jupiter-5.10.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/hibernate/orm/hibernate-core/6.5.3.Final/hibernate-core-6.5.3.Final.jar (12 MB at 1.6 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.10.3/junit-jupiter-api-5.10.3.jar
Progress (3): 1.5/2.6 MB | 0.8/1.4 MB | 123 kB
Progress (3): 1.5/2.6 MB | 0.8/1.4 MB | 123 kB
                                              
Downloaded from central: https://repo.maven.apache.org/maven2/org/hamcrest/hamcrest/2.2/hamcrest-2.2.jar (123 kB at 17 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.jar
Progress (2): 1.5/2.6 MB | 0.8/1.4 MB
Progress (2): 1.5/2.6 MB | 0.8/1.4 MB
Progress (2): 1.5/2.6 MB | 0.8/1.4 MB
Progress (2): 1.5/2.6 MB | 0.8/1.4 MB
Progress (2): 1.6/2.6 MB | 0.8/1.4 MB
Progress (2): 1.6/2.6 MB | 0.8/1.4 MB
Progress (2): 1.6/2.6 MB | 0.8/1.4 MB
Progress (2): 1.6/2.6 MB | 0.8/1.4 MB
Progress (3): 1.6/2.6 MB | 0.8/1.4 MB | 6.4 kB
Progress (3): 1.6/2.6 MB | 0.9/1.4 MB | 6.4 kB
Progress (3): 1.6/2.6 MB | 0.9/1.4 MB | 6.4 kB
Progress (3): 1.6/2.6 MB | 0.9/1.4 MB | 6.4 kB
Progress (3): 1.6/2.6 MB | 0.9/1.4 MB | 6.4 kB
Progress (3): 1.6/2.6 MB | 0.9/1.4 MB | 6.4 kB
Progress (3): 1.6/2.6 MB | 0.9/1.4 MB | 6.4 kB
Progress (3): 1.6/2.6 MB | 0.9/1.4 MB | 6.4 kB
Progress (4): 1.6/2.6 MB | 0.9/1.4 MB | 6.4 kB | 7.7/211 kB
Progress (4): 1.6/2.6 MB | 0.9/1.4 MB | 6.4 kB | 16/211 kB 
Progress (4): 1.6/2.6 MB | 0.9/1.4 MB | 6.4 kB | 28/211 kB
Progress (5): 1.6/2.6 MB | 0.9/1.4 MB | 6.4 kB | 28/211 kB | 7.7/14 kB
Progress (5): 1.6/2.6 MB | 0.9/1.4 MB | 6.4 kB | 28/211 kB | 14 kB    
Progress (5): 1.6/2.6 MB | 0.9/1.4 MB | 6.4 kB | 44/211 kB | 14 kB
Progress (5): 1.6/2.6 MB | 0.9/1.4 MB | 6.4 kB | 44/211 kB | 14 kB
Progress (5): 1.6/2.6 MB | 0.9/1.4 MB | 6.4 kB | 44/211 kB | 14 kB
Progress (5): 1.6/2.6 MB | 0.9/1.4 MB | 6.4 kB | 44/211 kB | 14 kB
Progress (5): 1.6/2.6 MB | 0.9/1.4 MB | 6.4 kB | 61/211 kB | 14 kB
Progress (5): 1.6/2.6 MB | 0.9/1.4 MB | 6.4 kB | 61/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 0.9/1.4 MB | 6.4 kB | 61/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 0.9/1.4 MB | 6.4 kB | 77/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 0.9/1.4 MB | 6.4 kB | 93/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.0/1.4 MB | 6.4 kB | 93/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.0/1.4 MB | 6.4 kB | 93/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.0/1.4 MB | 6.4 kB | 93/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.0/1.4 MB | 6.4 kB | 110/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.0/1.4 MB | 6.4 kB | 110/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.0/1.4 MB | 6.4 kB | 110/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.0/1.4 MB | 6.4 kB | 110/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.0/1.4 MB | 6.4 kB | 126/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.0/1.4 MB | 6.4 kB | 126/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.0/1.4 MB | 6.4 kB | 142/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.0/1.4 MB | 6.4 kB | 142/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.0/1.4 MB | 6.4 kB | 159/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.0/1.4 MB | 6.4 kB | 159/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.0/1.4 MB | 6.4 kB | 159/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.0/1.4 MB | 6.4 kB | 175/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.1/1.4 MB | 6.4 kB | 175/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.1/1.4 MB | 6.4 kB | 175/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.1/1.4 MB | 6.4 kB | 192/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.1/1.4 MB | 6.4 kB | 192/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.1/1.4 MB | 6.4 kB | 208/211 kB | 14 kB
Progress (5): 1.7/2.6 MB | 1.1/1.4 MB | 6.4 kB | 211 kB | 14 kB    
Progress (5): 1.8/2.6 MB | 1.1/1.4 MB | 6.4 kB | 211 kB | 14 kB
Progress (5): 1.8/2.6 MB | 1.1/1.4 MB | 6.4 kB | 211 kB | 14 kB
Progress (5): 1.8/2.6 MB | 1.1/1.4 MB | 6.4 kB | 211 kB | 14 kB
Progress (5): 1.8/2.6 MB | 1.1/1.4 MB | 6.4 kB | 211 kB | 14 kB
Progress (5): 1.8/2.6 MB | 1.1/1.4 MB | 6.4 kB | 211 kB | 14 kB
                                                               
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter/5.10.3/junit-jupiter-5.10.3.jar (6.4 kB at 873 B/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.10.3/junit-platform-commons-1.10.3.jar
Progress (4): 1.8/2.6 MB | 1.1/1.4 MB | 211 kB | 14 kB
Progress (4): 1.8/2.6 MB | 1.1/1.4 MB | 211 kB | 14 kB
Progress (4): 1.8/2.6 MB | 1.1/1.4 MB | 211 kB | 14 kB
Progress (4): 1.8/2.6 MB | 1.2/1.4 MB | 211 kB | 14 kB
Progress (4): 1.8/2.6 MB | 1.2/1.4 MB | 211 kB | 14 kB
Progress (4): 1.8/2.6 MB | 1.2/1.4 MB | 211 kB | 14 kB
Progress (4): 1.8/2.6 MB | 1.2/1.4 MB | 211 kB | 14 kB
                                                      
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-api/5.10.3/junit-jupiter-api-5.10.3.jar (211 kB at 29 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar
Progress (3): 1.8/2.6 MB | 1.2/1.4 MB | 14 kB
Progress (3): 1.8/2.6 MB | 1.2/1.4 MB | 14 kB
Progress (3): 1.8/2.6 MB | 1.2/1.4 MB | 14 kB
Progress (3): 1.9/2.6 MB | 1.2/1.4 MB | 14 kB
Progress (3): 1.9/2.6 MB | 1.2/1.4 MB | 14 kB
Progress (3): 1.9/2.6 MB | 1.3/1.4 MB | 14 kB
Progress (3): 1.9/2.6 MB | 1.3/1.4 MB | 14 kB
Progress (3): 1.9/2.6 MB | 1.3/1.4 MB | 14 kB
Progress (3): 1.9/2.6 MB | 1.3/1.4 MB | 14 kB
Progress (3): 1.9/2.6 MB | 1.3/1.4 MB | 14 kB
Progress (3): 1.9/2.6 MB | 1.3/1.4 MB | 14 kB
Progress (3): 1.9/2.6 MB | 1.3/1.4 MB | 14 kB
Progress (4): 1.9/2.6 MB | 1.3/1.4 MB | 14 kB | 6.8 kB
Progress (5): 1.9/2.6 MB | 1.3/1.4 MB | 14 kB | 6.8 kB | 7.3/106 kB
Progress (5): 1.9/2.6 MB | 1.3/1.4 MB | 14 kB | 6.8 kB | 15/106 kB 
Progress (5): 1.9/2.6 MB | 1.3/1.4 MB | 14 kB | 6.8 kB | 15/106 kB
Progress (5): 1.9/2.6 MB | 1.3/1.4 MB | 14 kB | 6.8 kB | 15/106 kB
Progress (5): 1.9/2.6 MB | 1.3/1.4 MB | 14 kB | 6.8 kB | 15/106 kB
Progress (5): 1.9/2.6 MB | 1.3/1.4 MB | 14 kB | 6.8 kB | 32/106 kB
Progress (5): 1.9/2.6 MB | 1.3/1.4 MB | 14 kB | 6.8 kB | 32/106 kB
Progress (5): 1.9/2.6 MB | 1.4/1.4 MB | 14 kB | 6.8 kB | 32/106 kB
Progress (5): 1.9/2.6 MB | 1.4/1.4 MB | 14 kB | 6.8 kB | 48/106 kB
Progress (5): 1.9/2.6 MB | 1.4 MB | 14 kB | 6.8 kB | 48/106 kB    
Progress (5): 1.9/2.6 MB | 1.4 MB | 14 kB | 6.8 kB | 48/106 kB
Progress (5): 1.9/2.6 MB | 1.4 MB | 14 kB | 6.8 kB | 65/106 kB
Progress (5): 2.0/2.6 MB | 1.4 MB | 14 kB | 6.8 kB | 65/106 kB
Progress (5): 2.0/2.6 MB | 1.4 MB | 14 kB | 6.8 kB | 81/106 kB
Progress (5): 2.0/2.6 MB | 1.4 MB | 14 kB | 6.8 kB | 81/106 kB
Progress (5): 2.0/2.6 MB | 1.4 MB | 14 kB | 6.8 kB | 97/106 kB
Progress (5): 2.0/2.6 MB | 1.4 MB | 14 kB | 6.8 kB | 106 kB   
Progress (5): 2.0/2.6 MB | 1.4 MB | 14 kB | 6.8 kB | 106 kB
Progress (5): 2.0/2.6 MB | 1.4 MB | 14 kB | 6.8 kB | 106 kB
                                                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/assertj/assertj-core/3.25.3/assertj-core-3.25.3.jar (1.4 MB at 186 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-params/5.10.3/junit-jupiter-params-5.10.3.jar
Progress (4): 2.0/2.6 MB | 14 kB | 6.8 kB | 106 kB
Progress (4): 2.0/2.6 MB | 14 kB | 6.8 kB | 106 kB
                                                  
Downloaded from central: https://repo.maven.apache.org/maven2/org/apiguardian/apiguardian-api/1.1.2/apiguardian-api-1.1.2.jar (6.8 kB at 921 B/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/5.10.3/junit-jupiter-engine-5.10.3.jar
Progress (3): 2.1/2.6 MB | 14 kB | 106 kB
Progress (3): 2.1/2.6 MB | 14 kB | 106 kB
Progress (3): 2.1/2.6 MB | 14 kB | 106 kB
Progress (3): 2.1/2.6 MB | 14 kB | 106 kB
                                         
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.10.3/junit-platform-commons-1.10.3.jar (106 kB at 14 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.10.3/junit-platform-engine-1.10.3.jar

Progress (2): 2.1/2.6 MB | 14 kB
Progress (2): 2.1/2.6 MB | 14 kB
Progress (2): 2.2/2.6 MB | 14 kB
Progress (3): 2.2/2.6 MB | 14 kB | 3.2/245 kB
Progress (3): 2.2/2.6 MB | 14 kB | 11/245 kB 
Progress (4): 2.2/2.6 MB | 14 kB | 11/245 kB | 7.7/586 kB
Progress (4): 2.2/2.6 MB | 14 kB | 11/245 kB | 11/586 kB 
Progress (4): 2.2/2.6 MB | 14 kB | 11/245 kB | 11/586 kB
Progress (4): 2.2/2.6 MB | 14 kB | 11/245 kB | 11/586 kB
Progress (4): 2.2/2.6 MB | 14 kB | 11/245 kB | 28/586 kB
Progress (4): 2.2/2.6 MB | 14 kB | 28/245 kB | 28/586 kB
Progress (4): 2.2/2.6 MB | 14 kB | 28/245 kB | 44/586 kB
Progress (4): 2.2/2.6 MB | 14 kB | 44/245 kB | 44/586 kB
Progress (4): 2.2/2.6 MB | 14 kB | 44/245 kB | 44/586 kB
Progress (4): 2.2/2.6 MB | 14 kB | 61/245 kB | 44/586 kB
Progress (4): 2.2/2.6 MB | 14 kB | 61/245 kB | 44/586 kB
Progress (4): 2.2/2.6 MB | 14 kB | 61/245 kB | 61/586 kB
Progress (5): 2.2/2.6 MB | 14 kB | 61/245 kB | 61/586 kB | 7.7/205 kB
Progress (5): 2.2/2.6 MB | 14 kB | 61/245 kB | 61/586 kB | 11/205 kB 
Progress (5): 2.2/2.6 MB | 14 kB | 77/245 kB | 61/586 kB | 11/205 kB
Progress (5): 2.2/2.6 MB | 14 kB | 77/245 kB | 61/586 kB | 11/205 kB
Progress (5): 2.2/2.6 MB | 14 kB | 93/245 kB | 61/586 kB | 11/205 kB
Progress (5): 2.2/2.6 MB | 14 kB | 93/245 kB | 77/586 kB | 11/205 kB
Progress (5): 2.2/2.6 MB | 14 kB | 93/245 kB | 77/586 kB | 28/205 kB
Progress (5): 2.2/2.6 MB | 14 kB | 110/245 kB | 77/586 kB | 28/205 kB
Progress (5): 2.3/2.6 MB | 14 kB | 110/245 kB | 77/586 kB | 28/205 kB
Progress (5): 2.3/2.6 MB | 14 kB | 110/245 kB | 93/586 kB | 28/205 kB
Progress (5): 2.3/2.6 MB | 14 kB | 110/245 kB | 93/586 kB | 28/205 kB
Progress (5): 2.3/2.6 MB | 14 kB | 126/245 kB | 93/586 kB | 28/205 kB
                                                                     
Downloaded from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.3.0/opentest4j-1.3.0.jar (14 kB at 1.9 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/5.11.0/mockito-core-5.11.0.jar
Progress (4): 2.3/2.6 MB | 126/245 kB | 110/586 kB | 28/205 kB
Progress (4): 2.3/2.6 MB | 126/245 kB | 110/586 kB | 28/205 kB
Progress (4): 2.3/2.6 MB | 142/245 kB | 110/586 kB | 28/205 kB
Progress (4): 2.3/2.6 MB | 142/245 kB | 126/586 kB | 28/205 kB
Progress (4): 2.3/2.6 MB | 142/245 kB | 126/586 kB | 44/205 kB
Progress (4): 2.3/2.6 MB | 142/245 kB | 126/586 kB | 44/205 kB
Progress (4): 2.3/2.6 MB | 159/245 kB | 126/586 kB | 44/205 kB
Progress (4): 2.3/2.6 MB | 159/245 kB | 142/586 kB | 44/205 kB
Progress (4): 2.3/2.6 MB | 159/245 kB | 142/586 kB | 44/205 kB
Progress (4): 2.3/2.6 MB | 175/245 kB | 142/586 kB | 44/205 kB
Progress (4): 2.3/2.6 MB | 175/245 kB | 142/586 kB | 44/205 kB
Progress (4): 2.3/2.6 MB | 175/245 kB | 159/586 kB | 44/205 kB
Progress (4): 2.4/2.6 MB | 175/245 kB | 159/586 kB | 44/205 kB
Progress (4): 2.4/2.6 MB | 192/245 kB | 159/586 kB | 44/205 kB
Progress (4): 2.4/2.6 MB | 192/245 kB | 159/586 kB | 61/205 kB
Progress (4): 2.4/2.6 MB | 192/245 kB | 175/586 kB | 61/205 kB
Progress (4): 2.4/2.6 MB | 208/245 kB | 175/586 kB | 61/205 kB
Progress (4): 2.4/2.6 MB | 208/245 kB | 175/586 kB | 61/205 kB
Progress (4): 2.4/2.6 MB | 208/245 kB | 192/586 kB | 61/205 kB
Progress (4): 2.4/2.6 MB | 224/245 kB | 192/586 kB | 61/205 kB
Progress (4): 2.4/2.6 MB | 224/245 kB | 192/586 kB | 61/205 kB
Progress (4): 2.4/2.6 MB | 224/245 kB | 192/586 kB | 77/205 kB
Progress (4): 2.4/2.6 MB | 241/245 kB | 192/586 kB | 77/205 kB
Progress (4): 2.4/2.6 MB | 241/245 kB | 192/586 kB | 77/205 kB
Progress (4): 2.4/2.6 MB | 245 kB | 192/586 kB | 77/205 kB    
Progress (4): 2.4/2.6 MB | 245 kB | 208/586 kB | 77/205 kB
Progress (4): 2.4/2.6 MB | 245 kB | 208/586 kB | 77/205 kB
Progress (5): 2.4/2.6 MB | 245 kB | 208/586 kB | 77/205 kB | 7.7/704 kB
Progress (5): 2.4/2.6 MB | 245 kB | 208/586 kB | 77/205 kB | 16/704 kB 
Progress (5): 2.4/2.6 MB | 245 kB | 224/586 kB | 77/205 kB | 16/704 kB
Progress (5): 2.4/2.6 MB | 245 kB | 224/586 kB | 77/205 kB | 16/704 kB
Progress (5): 2.4/2.6 MB | 245 kB | 224/586 kB | 93/205 kB | 16/704 kB
Progress (5): 2.4/2.6 MB | 245 kB | 224/586 kB | 93/205 kB | 24/704 kB
Progress (5): 2.5/2.6 MB | 245 kB | 224/586 kB | 93/205 kB | 24/704 kB
Progress (5): 2.5/2.6 MB | 245 kB | 241/586 kB | 93/205 kB | 24/704 kB
Progress (5): 2.5/2.6 MB | 245 kB | 241/586 kB | 93/205 kB | 40/704 kB
Progress (5): 2.5/2.6 MB | 245 kB | 241/586 kB | 93/205 kB | 40/704 kB
Progress (5): 2.5/2.6 MB | 245 kB | 257/586 kB | 93/205 kB | 40/704 kB
                                                                      
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-engine/5.10.3/junit-jupiter-engine-5.10.3.jar (245 kB at 32 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.14.19/byte-buddy-agent-1.14.19.jar
Progress (4): 2.5/2.6 MB | 257/586 kB | 110/205 kB | 40/704 kB
Progress (4): 2.5/2.6 MB | 257/586 kB | 110/205 kB | 40/704 kB
Progress (4): 2.5/2.6 MB | 257/586 kB | 110/205 kB | 57/704 kB
Progress (4): 2.5/2.6 MB | 274/586 kB | 110/205 kB | 57/704 kB
Progress (4): 2.5/2.6 MB | 274/586 kB | 110/205 kB | 57/704 kB
Progress (4): 2.5/2.6 MB | 274/586 kB | 110/205 kB | 57/704 kB
Progress (4): 2.5/2.6 MB | 274/586 kB | 126/205 kB | 57/704 kB
Progress (4): 2.5/2.6 MB | 274/586 kB | 126/205 kB | 57/704 kB
Progress (4): 2.5/2.6 MB | 290/586 kB | 126/205 kB | 57/704 kB
Progress (4): 2.5/2.6 MB | 290/586 kB | 126/205 kB | 57/704 kB
Progress (4): 2.5/2.6 MB | 290/586 kB | 126/205 kB | 73/704 kB
Progress (4): 2.5/2.6 MB | 306/586 kB | 126/205 kB | 73/704 kB
Progress (4): 2.6/2.6 MB | 306/586 kB | 126/205 kB | 73/704 kB
Progress (4): 2.6/2.6 MB | 323/586 kB | 126/205 kB | 73/704 kB
Progress (4): 2.6/2.6 MB | 323/586 kB | 142/205 kB | 73/704 kB
Progress (4): 2.6/2.6 MB | 323/586 kB | 142/205 kB | 90/704 kB
Progress (4): 2.6/2.6 MB | 323/586 kB | 142/205 kB | 90/704 kB
Progress (4): 2.6/2.6 MB | 339/586 kB | 142/205 kB | 90/704 kB
Progress (4): 2.6/2.6 MB | 339/586 kB | 142/205 kB | 90/704 kB
Progress (4): 2.6/2.6 MB | 339/586 kB | 159/205 kB | 90/704 kB
Progress (4): 2.6/2.6 MB | 339/586 kB | 159/205 kB | 90/704 kB
Progress (4): 2.6/2.6 MB | 339/586 kB | 159/205 kB | 106/704 kB
Progress (4): 2.6/2.6 MB | 355/586 kB | 159/205 kB | 106/704 kB
Progress (4): 2.6 MB | 355/586 kB | 159/205 kB | 106/704 kB    
Progress (5): 2.6 MB | 355/586 kB | 159/205 kB | 106/704 kB | 7.7/263 kB
Progress (5): 2.6 MB | 355/586 kB | 159/205 kB | 106/704 kB | 7.7/263 kB
Progress (5): 2.6 MB | 355/586 kB | 159/205 kB | 122/704 kB | 7.7/263 kB
Progress (5): 2.6 MB | 372/586 kB | 159/205 kB | 122/704 kB | 7.7/263 kB
Progress (5): 2.6 MB | 372/586 kB | 159/205 kB | 122/704 kB | 24/263 kB 
Progress (5): 2.6 MB | 372/586 kB | 159/205 kB | 122/704 kB | 40/263 kB
Progress (5): 2.6 MB | 372/586 kB | 159/205 kB | 122/704 kB | 46/263 kB
Progress (5): 2.6 MB | 388/586 kB | 159/205 kB | 122/704 kB | 46/263 kB
Progress (5): 2.6 MB | 388/586 kB | 159/205 kB | 122/704 kB | 57/263 kB
Progress (5): 2.6 MB | 388/586 kB | 175/205 kB | 122/704 kB | 57/263 kB
Progress (5): 2.6 MB | 400/586 kB | 175/205 kB | 122/704 kB | 57/263 kB
Progress (5): 2.6 MB | 400/586 kB | 175/205 kB | 122/704 kB | 73/263 kB
Progress (5): 2.6 MB | 400/586 kB | 192/205 kB | 122/704 kB | 73/263 kB
Progress (5): 2.6 MB | 417/586 kB | 192/205 kB | 122/704 kB | 73/263 kB
Progress (5): 2.6 MB | 417/586 kB | 192/205 kB | 139/704 kB | 73/263 kB
Progress (5): 2.6 MB | 433/586 kB | 192/205 kB | 139/704 kB | 73/263 kB
Progress (5): 2.6 MB | 433/586 kB | 205 kB | 139/704 kB | 73/263 kB    
Progress (5): 2.6 MB | 433/586 kB | 205 kB | 139/704 kB | 90/263 kB
Progress (5): 2.6 MB | 433/586 kB | 205 kB | 155/704 kB | 90/263 kB
Progress (5): 2.6 MB | 433/586 kB | 205 kB | 155/704 kB | 106/263 kB
Progress (5): 2.6 MB | 449/586 kB | 205 kB | 155/704 kB | 106/263 kB
Progress (5): 2.6 MB | 449/586 kB | 205 kB | 155/704 kB | 122/263 kB
Progress (5): 2.6 MB | 449/586 kB | 205 kB | 155/704 kB | 139/263 kB
Progress (5): 2.6 MB | 449/586 kB | 205 kB | 155/704 kB | 147/263 kB
Progress (5): 2.6 MB | 466/586 kB | 205 kB | 155/704 kB | 147/263 kB
Progress (5): 2.6 MB | 466/586 kB | 205 kB | 172/704 kB | 147/263 kB
Progress (5): 2.6 MB | 466/586 kB | 205 kB | 172/704 kB | 164/263 kB
                                                                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/h2database/h2/2.2.224/h2-2.2.224.jar (2.6 MB at 342 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/objenesis/objenesis/3.3/objenesis-3.3.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.10.3/junit-platform-engine-1.10.3.jar (205 kB at 27 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-junit-jupiter/5.11.0/mockito-junit-jupiter-5.11.0.jar
Progress (3): 482/586 kB | 172/704 kB | 164/263 kB
Progress (3): 498/586 kB | 172/704 kB | 164/263 kB
Progress (3): 515/586 kB | 172/704 kB | 164/263 kB
Progress (3): 515/586 kB | 188/704 kB | 164/263 kB
Progress (3): 515/586 kB | 188/704 kB | 180/263 kB
Progress (3): 515/586 kB | 188/704 kB | 197/263 kB
Progress (3): 515/586 kB | 188/704 kB | 213/263 kB
Progress (3): 531/586 kB | 188/704 kB | 213/263 kB
Progress (3): 531/586 kB | 188/704 kB | 229/263 kB
Progress (3): 531/586 kB | 204/704 kB | 229/263 kB
Progress (3): 531/586 kB | 204/704 kB | 246/263 kB
Progress (3): 548/586 kB | 204/704 kB | 246/263 kB
Progress (3): 564/586 kB | 204/704 kB | 246/263 kB
Progress (3): 564/586 kB | 204/704 kB | 262/263 kB
Progress (3): 564/586 kB | 221/704 kB | 262/263 kB
Progress (3): 564/586 kB | 221/704 kB | 263 kB    
Progress (3): 580/586 kB | 221/704 kB | 263 kB
Progress (3): 586 kB | 221/704 kB | 263 kB    
Progress (3): 586 kB | 237/704 kB | 263 kB
Progress (4): 586 kB | 237/704 kB | 263 kB | 7.7/49 kB
Progress (4): 586 kB | 237/704 kB | 263 kB | 11/49 kB 
Progress (5): 586 kB | 237/704 kB | 263 kB | 11/49 kB | 7.7/8.9 kB
Progress (5): 586 kB | 237/704 kB | 263 kB | 11/49 kB | 8.9 kB    
Progress (5): 586 kB | 253/704 kB | 263 kB | 11/49 kB | 8.9 kB
Progress (5): 586 kB | 253/704 kB | 263 kB | 28/49 kB | 8.9 kB
Progress (5): 586 kB | 270/704 kB | 263 kB | 28/49 kB | 8.9 kB
Progress (5): 586 kB | 270/704 kB | 263 kB | 44/49 kB | 8.9 kB
Progress (5): 586 kB | 270/704 kB | 263 kB | 49 kB | 8.9 kB   
Progress (5): 586 kB | 286/704 kB | 263 kB | 49 kB | 8.9 kB
                                                           
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/jupiter/junit-jupiter-params/5.10.3/junit-jupiter-params-5.10.3.jar (586 kB at 76 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/skyscreamer/jsonassert/1.5.3/jsonassert-1.5.3.jar
Progress (4): 303/704 kB | 263 kB | 49 kB | 8.9 kB
                                                  
Downloaded from central: https://repo.maven.apache.org/maven2/net/bytebuddy/byte-buddy-agent/1.14.19/byte-buddy-agent-1.14.19.jar (263 kB at 34 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/vaadin/external/google/android-json/0.0.20131108.vaadin1/android-json-0.0.20131108.vaadin1.jar
Progress (3): 319/704 kB | 49 kB | 8.9 kB
Progress (3): 335/704 kB | 49 kB | 8.9 kB
Progress (3): 352/704 kB | 49 kB | 8.9 kB
Progress (3): 368/704 kB | 49 kB | 8.9 kB
Progress (4): 368/704 kB | 49 kB | 8.9 kB | 7.7/31 kB
Progress (4): 368/704 kB | 49 kB | 8.9 kB | 16/31 kB 
Progress (4): 385/704 kB | 49 kB | 8.9 kB | 16/31 kB
Progress (4): 398/704 kB | 49 kB | 8.9 kB | 16/31 kB
Progress (4): 398/704 kB | 49 kB | 8.9 kB | 31 kB   
Progress (4): 414/704 kB | 49 kB | 8.9 kB | 31 kB
Progress (4): 430/704 kB | 49 kB | 8.9 kB | 31 kB
Progress (4): 447/704 kB | 49 kB | 8.9 kB | 31 kB
Progress (4): 463/704 kB | 49 kB | 8.9 kB | 31 kB
Progress (4): 480/704 kB | 49 kB | 8.9 kB | 31 kB
Progress (4): 496/704 kB | 49 kB | 8.9 kB | 31 kB
Progress (4): 512/704 kB | 49 kB | 8.9 kB | 31 kB
Progress (5): 512/704 kB | 49 kB | 8.9 kB | 31 kB | 7.7/18 kB
Progress (5): 512/704 kB | 49 kB | 8.9 kB | 31 kB | 7.7/18 kB
Progress (5): 529/704 kB | 49 kB | 8.9 kB | 31 kB | 7.7/18 kB
Progress (5): 529/704 kB | 49 kB | 8.9 kB | 31 kB | 18 kB    
Progress (5): 545/704 kB | 49 kB | 8.9 kB | 31 kB | 18 kB
Progress (5): 561/704 kB | 49 kB | 8.9 kB | 31 kB | 18 kB
Progress (5): 578/704 kB | 49 kB | 8.9 kB | 31 kB | 18 kB
Progress (5): 594/704 kB | 49 kB | 8.9 kB | 31 kB | 18 kB
Progress (5): 611/704 kB | 49 kB | 8.9 kB | 31 kB | 18 kB
Progress (5): 627/704 kB | 49 kB | 8.9 kB | 31 kB | 18 kB
Progress (5): 643/704 kB | 49 kB | 8.9 kB | 31 kB | 18 kB
Progress (5): 660/704 kB | 49 kB | 8.9 kB | 31 kB | 18 kB
Progress (5): 676/704 kB | 49 kB | 8.9 kB | 31 kB | 18 kB
Progress (5): 693/704 kB | 49 kB | 8.9 kB | 31 kB | 18 kB
Progress (5): 704 kB | 49 kB | 8.9 kB | 31 kB | 18 kB    
                                                     
Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-junit-jupiter/5.11.0/mockito-junit-jupiter-5.11.0.jar (8.9 kB at 1.1 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-core/6.1.13/spring-core-6.1.13.jar
Progress (5): 704 kB | 49 kB | 31 kB | 18 kB | 0/1.9 MB
Progress (5): 704 kB | 49 kB | 31 kB | 18 kB | 0/1.9 MB
                                                       
Downloaded from central: https://repo.maven.apache.org/maven2/org/mockito/mockito-core/5.11.0/mockito-core-5.11.0.jar (704 kB at 89 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jcl/6.1.13/spring-jcl-6.1.13.jar
Progress (4): 49 kB | 31 kB | 18 kB | 0/1.9 MB
Progress (4): 49 kB | 31 kB | 18 kB | 0/1.9 MB
Progress (4): 49 kB | 31 kB | 18 kB | 0.1/1.9 MB
Progress (4): 49 kB | 31 kB | 18 kB | 0.1/1.9 MB
Progress (4): 49 kB | 31 kB | 18 kB | 0.1/1.9 MB
Progress (4): 49 kB | 31 kB | 18 kB | 0.1/1.9 MB
Progress (4): 49 kB | 31 kB | 18 kB | 0.1/1.9 MB
Progress (4): 49 kB | 31 kB | 18 kB | 0.1/1.9 MB
Progress (4): 49 kB | 31 kB | 18 kB | 0.2/1.9 MB
Progress (5): 49 kB | 31 kB | 18 kB | 0.2/1.9 MB | 7.7/25 kB
Progress (5): 49 kB | 31 kB | 18 kB | 0.2/1.9 MB | 16/25 kB 
Progress (5): 49 kB | 31 kB | 18 kB | 0.2/1.9 MB | 24/25 kB
Progress (5): 49 kB | 31 kB | 18 kB | 0.2/1.9 MB | 25 kB   
Progress (5): 49 kB | 31 kB | 18 kB | 0.2/1.9 MB | 25 kB
Progress (5): 49 kB | 31 kB | 18 kB | 0.2/1.9 MB | 25 kB
Progress (5): 49 kB | 31 kB | 18 kB | 0.2/1.9 MB | 25 kB
Progress (5): 49 kB | 31 kB | 18 kB | 0.2/1.9 MB | 25 kB
Progress (5): 49 kB | 31 kB | 18 kB | 0.2/1.9 MB | 25 kB
Progress (5): 49 kB | 31 kB | 18 kB | 0.3/1.9 MB | 25 kB
Progress (5): 49 kB | 31 kB | 18 kB | 0.3/1.9 MB | 25 kB
Progress (5): 49 kB | 31 kB | 18 kB | 0.3/1.9 MB | 25 kB
Progress (5): 49 kB | 31 kB | 18 kB | 0.3/1.9 MB | 25 kB
Progress (5): 49 kB | 31 kB | 18 kB | 0.3/1.9 MB | 25 kB
Progress (5): 49 kB | 31 kB | 18 kB | 0.3/1.9 MB | 25 kB
Progress (5): 49 kB | 31 kB | 18 kB | 0.4/1.9 MB | 25 kB
Progress (5): 49 kB | 31 kB | 18 kB | 0.4/1.9 MB | 25 kB
Progress (5): 49 kB | 31 kB | 18 kB | 0.4/1.9 MB | 25 kB
Progress (5): 49 kB | 31 kB | 18 kB | 0.4/1.9 MB | 25 kB
Progress (5): 49 kB | 31 kB | 18 kB | 0.4/1.9 MB | 25 kB
Progress (5): 49 kB | 31 kB | 18 kB | 0.4/1.9 MB | 25 kB
Progress (5): 49 kB | 31 kB | 18 kB | 0.5/1.9 MB | 25 kB
                                                        
Downloaded from central: https://repo.maven.apache.org/maven2/com/vaadin/external/google/android-json/0.0.20131108.vaadin1/android-json-0.0.20131108.vaadin1.jar (18 kB at 2.3 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/springframework/spring-test/6.1.13/spring-test-6.1.13.jar
Progress (4): 49 kB | 31 kB | 0.5/1.9 MB | 25 kB
Progress (4): 49 kB | 31 kB | 0.5/1.9 MB | 25 kB
Progress (4): 49 kB | 31 kB | 0.5/1.9 MB | 25 kB
Progress (4): 49 kB | 31 kB | 0.5/1.9 MB | 25 kB
Progress (4): 49 kB | 31 kB | 0.5/1.9 MB | 25 kB
Progress (4): 49 kB | 31 kB | 0.6/1.9 MB | 25 kB
Progress (4): 49 kB | 31 kB | 0.6/1.9 MB | 25 kB
Progress (4): 49 kB | 31 kB | 0.6/1.9 MB | 25 kB
Progress (4): 49 kB | 31 kB | 0.6/1.9 MB | 25 kB
Progress (4): 49 kB | 31 kB | 0.6/1.9 MB | 25 kB
Progress (5): 49 kB | 31 kB | 0.6/1.9 MB | 25 kB | 7.7/857 kB
Progress (5): 49 kB | 31 kB | 0.6/1.9 MB | 25 kB | 16/857 kB 
Progress (5): 49 kB | 31 kB | 0.6/1.9 MB | 25 kB | 24/857 kB
Progress (5): 49 kB | 31 kB | 0.6/1.9 MB | 25 kB | 24/857 kB
Progress (5): 49 kB | 31 kB | 0.6/1.9 MB | 25 kB | 40/857 kB
Progress (5): 49 kB | 31 kB | 0.7/1.9 MB | 25 kB | 40/857 kB
Progress (5): 49 kB | 31 kB | 0.7/1.9 MB | 25 kB | 57/857 kB
Progress (5): 49 kB | 31 kB | 0.7/1.9 MB | 25 kB | 57/857 kB
Progress (5): 49 kB | 31 kB | 0.7/1.9 MB | 25 kB | 73/857 kB
Progress (5): 49 kB | 31 kB | 0.7/1.9 MB | 25 kB | 73/857 kB
Progress (5): 49 kB | 31 kB | 0.7/1.9 MB | 25 kB | 90/857 kB
Progress (5): 49 kB | 31 kB | 0.7/1.9 MB | 25 kB | 90/857 kB
Progress (5): 49 kB | 31 kB | 0.7/1.9 MB | 25 kB | 106/857 kB
Progress (5): 49 kB | 31 kB | 0.7/1.9 MB | 25 kB | 106/857 kB
Progress (5): 49 kB | 31 kB | 0.7/1.9 MB | 25 kB | 122/857 kB
Progress (5): 49 kB | 31 kB | 0.7/1.9 MB | 25 kB | 122/857 kB
Progress (5): 49 kB | 31 kB | 0.7/1.9 MB | 25 kB | 139/857 kB
Progress (5): 49 kB | 31 kB | 0.8/1.9 MB | 25 kB | 139/857 kB
Progress (5): 49 kB | 31 kB | 0.8/1.9 MB | 25 kB | 139/857 kB
Progress (5): 49 kB | 31 kB | 0.8/1.9 MB | 25 kB | 155/857 kB
Progress (5): 49 kB | 31 kB | 0.8/1.9 MB | 25 kB | 155/857 kB
Progress (5): 49 kB | 31 kB | 0.8/1.9 MB | 25 kB | 172/857 kB
Progress (5): 49 kB | 31 kB | 0.8/1.9 MB | 25 kB | 172/857 kB
Progress (5): 49 kB | 31 kB | 0.8/1.9 MB | 25 kB | 188/857 kB
Progress (5): 49 kB | 31 kB | 0.8/1.9 MB | 25 kB | 204/857 kB
Progress (5): 49 kB | 31 kB | 0.8/1.9 MB | 25 kB | 204/857 kB
Progress (5): 49 kB | 31 kB | 0.8/1.9 MB | 25 kB | 221/857 kB
Progress (5): 49 kB | 31 kB | 0.8/1.9 MB | 25 kB | 221/857 kB
Progress (5): 49 kB | 31 kB | 0.8/1.9 MB | 25 kB | 237/857 kB
Progress (5): 49 kB | 31 kB | 0.9/1.9 MB | 25 kB | 237/857 kB
Progress (5): 49 kB | 31 kB | 0.9/1.9 MB | 25 kB | 237/857 kB
Progress (5): 49 kB | 31 kB | 0.9/1.9 MB | 25 kB | 253/857 kB
Progress (5): 49 kB | 31 kB | 0.9/1.9 MB | 25 kB | 253/857 kB
Progress (5): 49 kB | 31 kB | 0.9/1.9 MB | 25 kB | 270/857 kB
Progress (5): 49 kB | 31 kB | 0.9/1.9 MB | 25 kB | 286/857 kB
Progress (5): 49 kB | 31 kB | 0.9/1.9 MB | 25 kB | 286/857 kB
Progress (5): 49 kB | 31 kB | 0.9/1.9 MB | 25 kB | 286/857 kB
Progress (5): 49 kB | 31 kB | 0.9/1.9 MB | 25 kB | 303/857 kB
Progress (5): 49 kB | 31 kB | 0.9/1.9 MB | 25 kB | 303/857 kB
Progress (5): 49 kB | 31 kB | 0.9/1.9 MB | 25 kB | 303/857 kB
Progress (5): 49 kB | 31 kB | 0.9/1.9 MB | 25 kB | 319/857 kB
Progress (5): 49 kB | 31 kB | 1.0/1.9 MB | 25 kB | 319/857 kB
Progress (5): 49 kB | 31 kB | 1.0/1.9 MB | 25 kB | 335/857 kB
Progress (5): 49 kB | 31 kB | 1.0/1.9 MB | 25 kB | 335/857 kB
Progress (5): 49 kB | 31 kB | 1.0/1.9 MB | 25 kB | 335/857 kB
Progress (5): 49 kB | 31 kB | 1.0/1.9 MB | 25 kB | 352/857 kB
Progress (5): 49 kB | 31 kB | 1.0/1.9 MB | 25 kB | 368/857 kB
Progress (5): 49 kB | 31 kB | 1.0/1.9 MB | 25 kB | 385/857 kB
Progress (5): 49 kB | 31 kB | 1.0/1.9 MB | 25 kB | 385/857 kB
Progress (5): 49 kB | 31 kB | 1.0/1.9 MB | 25 kB | 385/857 kB
Progress (5): 49 kB | 31 kB | 1.0/1.9 MB | 25 kB | 385/857 kB
Progress (5): 49 kB | 31 kB | 1.0/1.9 MB | 25 kB | 401/857 kB
Progress (5): 49 kB | 31 kB | 1.1/1.9 MB | 25 kB | 401/857 kB
Progress (5): 49 kB | 31 kB | 1.1/1.9 MB | 25 kB | 401/857 kB
Progress (5): 49 kB | 31 kB | 1.1/1.9 MB | 25 kB | 417/857 kB
Progress (5): 49 kB | 31 kB | 1.1/1.9 MB | 25 kB | 417/857 kB
Progress (5): 49 kB | 31 kB | 1.1/1.9 MB | 25 kB | 434/857 kB
Progress (5): 49 kB | 31 kB | 1.1/1.9 MB | 25 kB | 434/857 kB
Progress (5): 49 kB | 31 kB | 1.1/1.9 MB | 25 kB | 450/857 kB
Progress (5): 49 kB | 31 kB | 1.1/1.9 MB | 25 kB | 450/857 kB
Progress (5): 49 kB | 31 kB | 1.1/1.9 MB | 25 kB | 450/857 kB
Progress (5): 49 kB | 31 kB | 1.2/1.9 MB | 25 kB | 450/857 kB
Progress (5): 49 kB | 31 kB | 1.2/1.9 MB | 25 kB | 466/857 kB
Progress (5): 49 kB | 31 kB | 1.2/1.9 MB | 25 kB | 466/857 kB
Progress (5): 49 kB | 31 kB | 1.2/1.9 MB | 25 kB | 483/857 kB
Progress (5): 49 kB | 31 kB | 1.2/1.9 MB | 25 kB | 483/857 kB
                                                             
Downloaded from central: https://repo.maven.apache.org/maven2/org/skyscreamer/jsonassert/1.5.3/jsonassert-1.5.3.jar (31 kB at 3.8 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/xmlunit/xmlunit-core/2.9.1/xmlunit-core-2.9.1.jar
Progress (4): 49 kB | 1.2/1.9 MB | 25 kB | 499/857 kB
Progress (4): 49 kB | 1.2/1.9 MB | 25 kB | 499/857 kB
Progress (4): 49 kB | 1.2/1.9 MB | 25 kB | 516/857 kB
Progress (4): 49 kB | 1.2/1.9 MB | 25 kB | 516/857 kB
Progress (4): 49 kB | 1.2/1.9 MB | 25 kB | 516/857 kB
Progress (4): 49 kB | 1.2/1.9 MB | 25 kB | 532/857 kB
Progress (4): 49 kB | 1.2/1.9 MB | 25 kB | 548/857 kB
Progress (4): 49 kB | 1.3/1.9 MB | 25 kB | 548/857 kB
Progress (4): 49 kB | 1.3/1.9 MB | 25 kB | 548/857 kB
Progress (4): 49 kB | 1.3/1.9 MB | 25 kB | 565/857 kB
Progress (4): 49 kB | 1.3/1.9 MB | 25 kB | 565/857 kB
Progress (4): 49 kB | 1.3/1.9 MB | 25 kB | 565/857 kB
Progress (4): 49 kB | 1.3/1.9 MB | 25 kB | 565/857 kB
Progress (4): 49 kB | 1.3/1.9 MB | 25 kB | 581/857 kB
Progress (4): 49 kB | 1.3/1.9 MB | 25 kB | 581/857 kB
Progress (4): 49 kB | 1.3/1.9 MB | 25 kB | 598/857 kB
Progress (4): 49 kB | 1.3/1.9 MB | 25 kB | 614/857 kB
Progress (4): 49 kB | 1.4/1.9 MB | 25 kB | 614/857 kB
Progress (4): 49 kB | 1.4/1.9 MB | 25 kB | 630/857 kB
Progress (4): 49 kB | 1.4/1.9 MB | 25 kB | 647/857 kB
Progress (5): 49 kB | 1.4/1.9 MB | 25 kB | 647/857 kB | 7.7/175 kB
Progress (5): 49 kB | 1.4/1.9 MB | 25 kB | 647/857 kB | 7.7/175 kB
Progress (5): 49 kB | 1.4/1.9 MB | 25 kB | 647/857 kB | 24/175 kB 
Progress (5): 49 kB | 1.4/1.9 MB | 25 kB | 647/857 kB | 24/175 kB
Progress (5): 49 kB | 1.4/1.9 MB | 25 kB | 647/857 kB | 40/175 kB
Progress (5): 49 kB | 1.4/1.9 MB | 25 kB | 663/857 kB | 40/175 kB
Progress (5): 49 kB | 1.4/1.9 MB | 25 kB | 663/857 kB | 40/175 kB
Progress (5): 49 kB | 1.4/1.9 MB | 25 kB | 679/857 kB | 40/175 kB
Progress (5): 49 kB | 1.4/1.9 MB | 25 kB | 679/857 kB | 40/175 kB
Progress (5): 49 kB | 1.4/1.9 MB | 25 kB | 696/857 kB | 40/175 kB
                                                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-jcl/6.1.13/spring-jcl-6.1.13.jar (25 kB at 3.0 kB/s)
Progress (4): 49 kB | 1.4/1.9 MB | 696/857 kB | 40/175 kB
Progress (4): 49 kB | 1.4/1.9 MB | 712/857 kB | 40/175 kB
Progress (4): 49 kB | 1.4/1.9 MB | 712/857 kB | 40/175 kB
Progress (4): 49 kB | 1.5/1.9 MB | 712/857 kB | 40/175 kB
Progress (4): 49 kB | 1.5/1.9 MB | 729/857 kB | 40/175 kB
Progress (4): 49 kB | 1.5/1.9 MB | 729/857 kB | 57/175 kB
Progress (4): 49 kB | 1.5/1.9 MB | 745/857 kB | 57/175 kB
Progress (4): 49 kB | 1.5/1.9 MB | 745/857 kB | 57/175 kB
Progress (4): 49 kB | 1.5/1.9 MB | 761/857 kB | 57/175 kB
Progress (4): 49 kB | 1.5/1.9 MB | 761/857 kB | 57/175 kB
Progress (4): 49 kB | 1.5/1.9 MB | 761/857 kB | 73/175 kB
Progress (4): 49 kB | 1.5/1.9 MB | 778/857 kB | 73/175 kB
Progress (4): 49 kB | 1.5/1.9 MB | 778/857 kB | 73/175 kB
Progress (4): 49 kB | 1.5/1.9 MB | 778/857 kB | 73/175 kB
Progress (4): 49 kB | 1.5/1.9 MB | 794/857 kB | 73/175 kB
Progress (4): 49 kB | 1.5/1.9 MB | 794/857 kB | 90/175 kB
Progress (4): 49 kB | 1.5/1.9 MB | 794/857 kB | 90/175 kB
Progress (4): 49 kB | 1.5/1.9 MB | 811/857 kB | 90/175 kB
Progress (4): 49 kB | 1.5/1.9 MB | 827/857 kB | 90/175 kB
Progress (4): 49 kB | 1.6/1.9 MB | 827/857 kB | 90/175 kB
Progress (4): 49 kB | 1.6/1.9 MB | 827/857 kB | 106/175 kB
Progress (4): 49 kB | 1.6/1.9 MB | 827/857 kB | 106/175 kB
Progress (4): 49 kB | 1.6/1.9 MB | 843/857 kB | 106/175 kB
Progress (4): 49 kB | 1.6/1.9 MB | 843/857 kB | 106/175 kB
Progress (4): 49 kB | 1.6/1.9 MB | 843/857 kB | 122/175 kB
Progress (4): 49 kB | 1.6/1.9 MB | 857 kB | 122/175 kB    
Progress (4): 49 kB | 1.6/1.9 MB | 857 kB | 122/175 kB
Progress (4): 49 kB | 1.6/1.9 MB | 857 kB | 122/175 kB
Progress (4): 49 kB | 1.6/1.9 MB | 857 kB | 122/175 kB
Progress (4): 49 kB | 1.6/1.9 MB | 857 kB | 139/175 kB
Progress (4): 49 kB | 1.7/1.9 MB | 857 kB | 139/175 kB
Progress (4): 49 kB | 1.7/1.9 MB | 857 kB | 155/175 kB
Progress (4): 49 kB | 1.7/1.9 MB | 857 kB | 155/175 kB
Progress (4): 49 kB | 1.7/1.9 MB | 857 kB | 155/175 kB
Progress (4): 49 kB | 1.7/1.9 MB | 857 kB | 172/175 kB
Progress (4): 49 kB | 1.7/1.9 MB | 857 kB | 175 kB    
Progress (4): 49 kB | 1.7/1.9 MB | 857 kB | 175 kB
Progress (4): 49 kB | 1.7/1.9 MB | 857 kB | 175 kB
Progress (4): 49 kB | 1.7/1.9 MB | 857 kB | 175 kB
Progress (4): 49 kB | 1.8/1.9 MB | 857 kB | 175 kB
Progress (4): 49 kB | 1.8/1.9 MB | 857 kB | 175 kB
Progress (4): 49 kB | 1.8/1.9 MB | 857 kB | 175 kB
Progress (4): 49 kB | 1.8/1.9 MB | 857 kB | 175 kB
Progress (4): 49 kB | 1.8/1.9 MB | 857 kB | 175 kB
Progress (4): 49 kB | 1.8/1.9 MB | 857 kB | 175 kB
Progress (4): 49 kB | 1.9/1.9 MB | 857 kB | 175 kB
Progress (4): 49 kB | 1.9/1.9 MB | 857 kB | 175 kB
Progress (4): 49 kB | 1.9 MB | 857 kB | 175 kB    
                                              
Downloaded from central: https://repo.maven.apache.org/maven2/org/objenesis/objenesis/3.3/objenesis-3.3.jar (49 kB at 5.9 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-test/6.1.13/spring-test-6.1.13.jar (857 kB at 103 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/xmlunit/xmlunit-core/2.9.1/xmlunit-core-2.9.1.jar (175 kB at 21 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/springframework/spring-core/6.1.13/spring-core-6.1.13.jar (1.9 MB at 225 kB/s)

[INFO] 
[INFO] --- clean:3.3.2:clean (default-clean) @ travel-insurance-claim-system ---

Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.0/plexus-utils-4.0.0.pom
Progress (1): 724 B
Progress (1): 2.3 kB
Progress (1): 4.5 kB
Progress (1): 8.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.0/plexus-utils-4.0.0.pom (8.7 kB at 76 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/13/plexus-13.pom
Progress (1): 693 B
Progress (1): 2.5 kB
Progress (1): 6.4 kB
Progress (1): 8.9 kB
Progress (1): 11 kB 
Progress (1): 14 kB
Progress (1): 18 kB
Progress (1): 21 kB
Progress (1): 26 kB
Progress (1): 27 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/13/plexus-13.pom (27 kB at 365 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.0/plexus-utils-4.0.0.jar
Progress (1): 7.7/192 kB
Progress (1): 11/192 kB 
Progress (1): 28/192 kB
Progress (1): 44/192 kB
Progress (1): 61/192 kB
Progress (1): 77/192 kB
Progress (1): 93/192 kB
Progress (1): 110/192 kB
Progress (1): 126/192 kB
Progress (1): 126/192 kB
Progress (1): 142/192 kB
Progress (1): 159/192 kB
Progress (1): 175/192 kB
Progress (1): 192/192 kB
Progress (1): 192 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/4.0.0/plexus-utils-4.0.0.jar (192 kB at 2.2 MB/s)
[INFO] 
[INFO] --- resources:3.3.1:resources (default-resources) @ travel-insurance-claim-system ---
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.pom
Progress (1): 1.4 kB
Progress (1): 2.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.pom (2.7 kB at 26 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/5.1/plexus-5.1.pom
Progress (1): 700 B
Progress (1): 2.7 kB
Progress (1): 6.5 kB
Progress (1): 9.1 kB
Progress (1): 12 kB 
Progress (1): 16 kB
Progress (1): 21 kB
Progress (1): 23 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/5.1/plexus-5.1.pom (23 kB at 296 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.pom
Progress (1): 726 B
Progress (1): 2.4 kB
Progress (1): 4.4 kB
Progress (1): 8.6 kB
Progress (1): 8.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.pom (8.8 kB at 127 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/10/plexus-10.pom
Progress (1): 696 B
Progress (1): 2.7 kB
Progress (1): 6.4 kB
Progress (1): 9.2 kB
Progress (1): 11 kB 
Progress (1): 16 kB
Progress (1): 20 kB
Progress (1): 24 kB
Progress (1): 25 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/10/plexus-10.pom (25 kB at 314 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.3.1/maven-filtering-3.3.1.pom
Progress (1): 793 B
Progress (1): 2.3 kB
Progress (1): 5.6 kB
Progress (1): 6.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.3.1/maven-filtering-3.3.1.pom (6.0 kB at 73 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/39/maven-shared-components-39.pom
Progress (1): 812 B
Progress (1): 2.2 kB
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/39/maven-shared-components-39.pom (3.2 kB at 53 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.pom
Progress (1): 612 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.pom (612 B at 12 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.pom
Progress (1): 1.0 kB
Progress (1): 2.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.pom (2.7 kB at 44 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.36/slf4j-parent-1.7.36.pom

Progress (1): 1.0 kB
Progress (1): 3.0 kB
Progress (1): 5.9 kB
Progress (1): 8.7 kB
Progress (1): 12 kB 
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-parent/1.7.36/slf4j-parent-1.7.36.pom (14 kB at 201 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.pom
Progress (1): 910 B
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.pom (3.2 kB at 48 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/15/spice-parent-15.pom
Progress (1): 1.2 kB
Progress (1): 3.7 kB
Progress (1): 7.3 kB
Progress (1): 8.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/15/spice-parent-15.pom (8.4 kB at 116 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/5/forge-parent-5.pom
Progress (1): 1.3 kB
Progress (1): 5.5 kB
Progress (1): 8.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/5/forge-parent-5.pom (8.4 kB at 142 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.0/plexus-utils-3.5.0.pom
Progress (1): 725 B
Progress (1): 2.4 kB
Progress (1): 4.5 kB
Progress (1): 8.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.0/plexus-utils-3.5.0.pom (8.0 kB at 154 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.pom
Progress (1): 764 B
Progress (1): 2.1 kB
Progress (1): 5.2 kB
Progress (1): 7.8 kB
Progress (1): 10 kB 
Progress (1): 12 kB
Progress (1): 15 kB
Progress (1): 18 kB
Progress (1): 20 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.pom (20 kB at 365 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/52/commons-parent-52.pom
Progress (1): 703 B
Progress (1): 1.8 kB
Progress (1): 3.1 kB
Progress (1): 4.6 kB
Progress (1): 6.7 kB
Progress (1): 8.1 kB
Progress (1): 10 kB 
Progress (1): 12 kB
Progress (1): 15 kB
Progress (1): 17 kB
Progress (1): 20 kB
Progress (1): 22 kB
Progress (1): 25 kB
Progress (1): 29 kB
Progress (1): 32 kB
Progress (1): 32 kB
Progress (1): 36 kB
Progress (1): 39 kB
Progress (1): 42 kB
Progress (1): 44 kB
Progress (1): 47 kB
Progress (1): 51 kB
Progress (1): 54 kB
Progress (1): 56 kB
Progress (1): 61 kB
Progress (1): 65 kB
Progress (1): 73 kB
Progress (1): 76 kB
Progress (1): 79 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/52/commons-parent-52.pom (79 kB at 1.1 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/23/apache-23.pom
Progress (1): 749 B
Progress (1): 2.1 kB
Progress (1): 3.9 kB
Progress (1): 7.9 kB
Progress (1): 13 kB 
Progress (1): 16 kB
Progress (1): 18 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/23/apache-23.pom (18 kB at 307 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.2/junit-bom-5.7.2.pom
Progress (1): 912 B
Progress (1): 4.1 kB
Progress (1): 5.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.2/junit-bom-5.7.2.pom (5.1 kB at 111 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.pom
Progress (1): 740 B
Progress (1): 2.1 kB
Progress (1): 5.4 kB
Progress (1): 8.8 kB
Progress (1): 12 kB 
Progress (1): 15 kB
Progress (1): 17 kB
Progress (1): 19 kB
Progress (1): 21 kB
Progress (1): 24 kB
Progress (1): 28 kB
Progress (1): 30 kB
Progress (1): 31 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.pom (31 kB at 420 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.1/junit-bom-5.7.1.pom
Progress (1): 912 B
Progress (1): 4.1 kB
Progress (1): 5.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.7.1/junit-bom-5.7.1.pom (5.1 kB at 70 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.jar
Progress (1): 7.7/85 kB
Progress (1): 11/85 kB 
Progress (1): 28/85 kB
Progress (1): 44/85 kB
Progress (1): 61/85 kB
Progress (1): 77/85 kB
Progress (1): 85 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.26/plexus-interpolation-1.26.jar (85 kB at 970 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.3.1/maven-filtering-3.3.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.jar
Downloading from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar
Progress (1): 7.3/41 kB
Progress (1): 24/41 kB 
Progress (2): 24/41 kB | 7.7/269 kB
Progress (2): 24/41 kB | 11/269 kB 
Progress (2): 32/41 kB | 11/269 kB
Progress (3): 32/41 kB | 11/269 kB | 7.7/8.5 kB
Progress (3): 32/41 kB | 11/269 kB | 7.7/8.5 kB
Progress (3): 32/41 kB | 11/269 kB | 8.5 kB    
Progress (3): 32/41 kB | 28/269 kB | 8.5 kB
Progress (3): 41 kB | 28/269 kB | 8.5 kB   
Progress (4): 41 kB | 28/269 kB | 8.5 kB | 2.5 kB
                                                 
Downloaded from central: https://repo.maven.apache.org/maven2/javax/inject/javax.inject/1/javax.inject-1.jar (2.5 kB at 45 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.jar
Progress (3): 41 kB | 44/269 kB | 8.5 kB
Progress (4): 41 kB | 44/269 kB | 8.5 kB | 4.1/55 kB
Progress (4): 41 kB | 61/269 kB | 8.5 kB | 4.1/55 kB
Progress (4): 41 kB | 61/269 kB | 8.5 kB | 12/55 kB 
Progress (4): 41 kB | 61/269 kB | 8.5 kB | 29/55 kB
Progress (4): 41 kB | 77/269 kB | 8.5 kB | 29/55 kB
Progress (4): 41 kB | 77/269 kB | 8.5 kB | 45/55 kB
Progress (4): 41 kB | 77/269 kB | 8.5 kB | 55 kB   
Progress (4): 41 kB | 93/269 kB | 8.5 kB | 55 kB
Progress (4): 41 kB | 110/269 kB | 8.5 kB | 55 kB
                                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-filtering/3.3.1/maven-filtering-3.3.1.jar (55 kB at 639 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.jar
Progress (3): 41 kB | 126/269 kB | 8.5 kB
Progress (3): 41 kB | 142/269 kB | 8.5 kB
Progress (3): 41 kB | 159/269 kB | 8.5 kB
Progress (3): 41 kB | 175/269 kB | 8.5 kB
Progress (3): 41 kB | 192/269 kB | 8.5 kB
Progress (4): 41 kB | 192/269 kB | 8.5 kB | 3.2/327 kB
Progress (4): 41 kB | 192/269 kB | 8.5 kB | 11/327 kB 
Progress (4): 41 kB | 192/269 kB | 8.5 kB | 28/327 kB
Progress (4): 41 kB | 208/269 kB | 8.5 kB | 28/327 kB
Progress (4): 41 kB | 224/269 kB | 8.5 kB | 28/327 kB
Progress (4): 41 kB | 224/269 kB | 8.5 kB | 44/327 kB
Progress (4): 41 kB | 224/269 kB | 8.5 kB | 61/327 kB
Progress (4): 41 kB | 224/269 kB | 8.5 kB | 77/327 kB
Progress (5): 41 kB | 224/269 kB | 8.5 kB | 77/327 kB | 7.3/587 kB
Progress (5): 41 kB | 224/269 kB | 8.5 kB | 77/327 kB | 15/587 kB 
Progress (5): 41 kB | 224/269 kB | 8.5 kB | 77/327 kB | 32/587 kB
Progress (5): 41 kB | 224/269 kB | 8.5 kB | 77/327 kB | 48/587 kB
Progress (5): 41 kB | 241/269 kB | 8.5 kB | 77/327 kB | 48/587 kB
Progress (5): 41 kB | 241/269 kB | 8.5 kB | 77/327 kB | 65/587 kB
Progress (5): 41 kB | 257/269 kB | 8.5 kB | 77/327 kB | 65/587 kB
Progress (5): 41 kB | 257/269 kB | 8.5 kB | 93/327 kB | 65/587 kB
Progress (5): 41 kB | 257/269 kB | 8.5 kB | 93/327 kB | 81/587 kB
Progress (5): 41 kB | 257/269 kB | 8.5 kB | 110/327 kB | 81/587 kB
Progress (5): 41 kB | 257/269 kB | 8.5 kB | 110/327 kB | 97/587 kB
Progress (5): 41 kB | 269 kB | 8.5 kB | 110/327 kB | 97/587 kB    
Progress (5): 41 kB | 269 kB | 8.5 kB | 110/327 kB | 114/587 kB
Progress (5): 41 kB | 269 kB | 8.5 kB | 110/327 kB | 130/587 kB
Progress (5): 41 kB | 269 kB | 8.5 kB | 126/327 kB | 130/587 kB
Progress (5): 41 kB | 269 kB | 8.5 kB | 126/327 kB | 147/587 kB
Progress (5): 41 kB | 269 kB | 8.5 kB | 142/327 kB | 147/587 kB
Progress (5): 41 kB | 269 kB | 8.5 kB | 142/327 kB | 163/587 kB
Progress (5): 41 kB | 269 kB | 8.5 kB | 159/327 kB | 163/587 kB
Progress (5): 41 kB | 269 kB | 8.5 kB | 159/327 kB | 179/587 kB
Progress (5): 41 kB | 269 kB | 8.5 kB | 159/327 kB | 196/587 kB
                                                               
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-utils/3.5.1/plexus-utils-3.5.1.jar (269 kB at 1.8 MB/s)
Progress (4): 41 kB | 8.5 kB | 175/327 kB | 196/587 kB
Progress (4): 41 kB | 8.5 kB | 175/327 kB | 212/587 kB
Progress (4): 41 kB | 8.5 kB | 175/327 kB | 228/587 kB
Progress (4): 41 kB | 8.5 kB | 175/327 kB | 245/587 kB

Progress (4): 41 kB | 8.5 kB | 192/327 kB | 245/587 kB
Progress (4): 41 kB | 8.5 kB | 208/327 kB | 245/587 kB
Progress (4): 41 kB | 8.5 kB | 208/327 kB | 261/587 kB
Progress (4): 41 kB | 8.5 kB | 208/327 kB | 278/587 kB
Progress (4): 41 kB | 8.5 kB | 208/327 kB | 294/587 kB
Progress (4): 41 kB | 8.5 kB | 224/327 kB | 294/587 kB
Progress (4): 41 kB | 8.5 kB | 224/327 kB | 310/587 kB
                                                      
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-build-api/0.0.7/plexus-build-api-0.0.7.jar (8.5 kB at 44 kB/s)
Progress (3): 41 kB | 241/327 kB | 310/587 kB
Progress (3): 41 kB | 241/327 kB | 327/587 kB
Progress (3): 41 kB | 241/327 kB | 343/587 kB
Progress (3): 41 kB | 241/327 kB | 360/587 kB
Progress (3): 41 kB | 257/327 kB | 360/587 kB
Progress (3): 41 kB | 257/327 kB | 376/587 kB
Progress (3): 41 kB | 257/327 kB | 392/587 kB
Progress (3): 41 kB | 257/327 kB | 409/587 kB
Progress (3): 41 kB | 274/327 kB | 409/587 kB
Progress (3): 41 kB | 290/327 kB | 409/587 kB
Progress (3): 41 kB | 290/327 kB | 425/587 kB
Progress (3): 41 kB | 290/327 kB | 441/587 kB
Progress (3): 41 kB | 290/327 kB | 458/587 kB
Progress (3): 41 kB | 306/327 kB | 458/587 kB
Progress (3): 41 kB | 323/327 kB | 458/587 kB
Progress (3): 41 kB | 327 kB | 458/587 kB    
Progress (3): 41 kB | 327 kB | 474/587 kB
Progress (3): 41 kB | 327 kB | 491/587 kB
Progress (3): 41 kB | 327 kB | 507/587 kB
Progress (3): 41 kB | 327 kB | 523/587 kB
Progress (3): 41 kB | 327 kB | 540/587 kB
Progress (3): 41 kB | 327 kB | 556/587 kB
Progress (3): 41 kB | 327 kB | 572/587 kB
Progress (3): 41 kB | 327 kB | 587 kB    
                                     
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.11.0/commons-io-2.11.0.jar (327 kB at 1.4 MB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-lang3/3.12.0/commons-lang3-3.12.0.jar (587 kB at 2.2 MB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/slf4j/slf4j-api/1.7.36/slf4j-api-1.7.36.jar (41 kB at 68 kB/s)
[INFO] Copying 1 resource from src\main\resources to target\classes
[INFO] Copying 5 resources from src\main\resources to target\classes
[INFO] 
[INFO] --- compiler:3.13.0:compile (default-compile) @ travel-insurance-claim-system ---

Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.4.2/maven-shared-utils-3.4.2.pom
Progress (1): 793 B
Progress (1): 2.3 kB
Progress (1): 4.3 kB
Progress (1): 5.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.4.2/maven-shared-utils-3.4.2.pom (5.9 kB at 102 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.pom
Progress (1): 806 B
Progress (1): 2.3 kB
Progress (1): 4.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.pom (4.7 kB at 72 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/19/maven-shared-components-19.pom
Progress (1): 773 B
Progress (1): 2.4 kB
Progress (1): 4.2 kB
Progress (1): 6.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/19/maven-shared-components-19.pom (6.4 kB at 118 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/23/maven-parent-23.pom
Progress (1): 726 B
Progress (1): 2.0 kB
Progress (1): 5.9 kB
Progress (1): 10 kB 
Progress (1): 15 kB
Progress (1): 19 kB
Progress (1): 22 kB
Progress (1): 25 kB
Progress (1): 27 kB
Progress (1): 31 kB
Progress (1): 33 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/23/maven-parent-23.pom (33 kB at 494 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/13/apache-13.pom
Progress (1): 749 B
Progress (1): 2.1 kB
Progress (1): 4.1 kB
Progress (1): 9.0 kB
Progress (1): 11 kB 
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/13/apache-13.pom (14 kB at 285 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.2.0/plexus-java-1.2.0.pom
Progress (1): 1.9 kB
Progress (1): 4.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.2.0/plexus-java-1.2.0.pom (4.3 kB at 38 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-languages/1.2.0/plexus-languages-1.2.0.pom
Progress (1): 1.3 kB
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-languages/1.2.0/plexus-languages-1.2.0.pom (3.2 kB at 57 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/15/plexus-15.pom
Progress (1): 692 B
Progress (1): 2.7 kB
Progress (1): 6.4 kB
Progress (1): 8.9 kB
Progress (1): 11 kB 
Progress (1): 14 kB
Progress (1): 18 kB
Progress (1): 21 kB
Progress (1): 25 kB
Progress (1): 28 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/15/plexus-15.pom (28 kB at 415 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.0/junit-bom-5.10.0.pom
Progress (1): 913 B
Progress (1): 4.1 kB
Progress (1): 5.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.0/junit-bom-5.10.0.pom (5.6 kB at 93 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0.3/qdox-2.0.3.pom
Progress (1): 872 B
Progress (1): 3.4 kB
Progress (1): 6.6 kB
Progress (1): 11 kB 
Progress (1): 13 kB
Progress (1): 17 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0.3/qdox-2.0.3.pom (17 kB at 253 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.15.0/plexus-compiler-api-2.15.0.pom
Progress (1): 1.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.15.0/plexus-compiler-api-2.15.0.pom (1.4 kB at 22 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler/2.15.0/plexus-compiler-2.15.0.pom
Progress (1): 1.2 kB
Progress (1): 4.5 kB
Progress (1): 7.6 kB
Progress (1): 7.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler/2.15.0/plexus-compiler-2.15.0.pom (7.6 kB at 112 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/17/plexus-17.pom
Progress (1): 691 B
Progress (1): 2.5 kB
Progress (1): 6.4 kB
Progress (1): 8.9 kB
Progress (1): 11 kB 
Progress (1): 14 kB
Progress (1): 19 kB
Progress (1): 21 kB
Progress (1): 25 kB
Progress (1): 28 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/17/plexus-17.pom (28 kB at 455 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.15.0/plexus-compiler-manager-2.15.0.pom
Progress (1): 1.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.15.0/plexus-compiler-manager-2.15.0.pom (1.3 kB at 17 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-xml/3.0.0/plexus-xml-3.0.0.pom

Progress (1): 815 B
Progress (1): 2.7 kB
Progress (1): 3.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-xml/3.0.0/plexus-xml-3.0.0.pom (3.7 kB at 66 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.15.0/plexus-compiler-javac-2.15.0.pom
Progress (1): 1.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.15.0/plexus-compiler-javac-2.15.0.pom (1.3 kB at 29 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compilers/2.15.0/plexus-compilers-2.15.0.pom
Progress (1): 1.6 kB
Progress (1): 1.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compilers/2.15.0/plexus-compilers-2.15.0.pom (1.6 kB at 25 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.4.2/maven-shared-utils-3.4.2.jar
Progress (1): 7.3/151 kB
Progress (1): 15/151 kB 
Progress (1): 32/151 kB
Progress (1): 48/151 kB
Progress (1): 65/151 kB
Progress (1): 81/151 kB
Progress (1): 97/151 kB
Progress (1): 114/151 kB
Progress (1): 130/151 kB
Progress (1): 147/151 kB
Progress (1): 151 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-utils/3.4.2/maven-shared-utils-3.4.2.jar (151 kB at 1.8 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.2.0/plexus-java-1.2.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.15.0/plexus-compiler-manager-2.15.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.jar
Downloading from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0.3/qdox-2.0.3.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.15.0/plexus-compiler-api-2.15.0.jar
Progress (1): 7.3/29 kB
Progress (1): 15/29 kB 
Progress (2): 15/29 kB | 7.7/334 kB
Progress (2): 15/29 kB | 16/334 kB 
Progress (3): 15/29 kB | 16/334 kB | 7.3/58 kB
Progress (3): 15/29 kB | 16/334 kB | 15/58 kB 
Progress (3): 15/29 kB | 32/334 kB | 15/58 kB
Progress (3): 15/29 kB | 32/334 kB | 32/58 kB
Progress (3): 15/29 kB | 32/334 kB | 48/58 kB
Progress (3): 29 kB | 32/334 kB | 48/58 kB   
Progress (3): 29 kB | 32/334 kB | 58 kB   
Progress (3): 29 kB | 48/334 kB | 58 kB
Progress (3): 29 kB | 65/334 kB | 58 kB
Progress (4): 29 kB | 65/334 kB | 58 kB | 5.2 kB
Progress (4): 29 kB | 81/334 kB | 58 kB | 5.2 kB
Progress (4): 29 kB | 97/334 kB | 58 kB | 5.2 kB
Progress (4): 29 kB | 114/334 kB | 58 kB | 5.2 kB
Progress (4): 29 kB | 130/334 kB | 58 kB | 5.2 kB
Progress (4): 29 kB | 147/334 kB | 58 kB | 5.2 kB
Progress (4): 29 kB | 163/334 kB | 58 kB | 5.2 kB
Progress (4): 29 kB | 179/334 kB | 58 kB | 5.2 kB
                                                 
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-java/1.2.0/plexus-java-1.2.0.jar (58 kB at 757 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-xml/3.0.0/plexus-xml-3.0.0.jar
Progress (3): 29 kB | 196/334 kB | 5.2 kB
Progress (3): 29 kB | 212/334 kB | 5.2 kB
Progress (3): 29 kB | 228/334 kB | 5.2 kB
Progress (3): 29 kB | 245/334 kB | 5.2 kB
Progress (3): 29 kB | 261/334 kB | 5.2 kB
Progress (3): 29 kB | 278/334 kB | 5.2 kB
                                         
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-manager/2.15.0/plexus-compiler-manager-2.15.0.jar (5.2 kB at 53 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.15.0/plexus-compiler-javac-2.15.0.jar
Progress (2): 29 kB | 294/334 kB
Progress (2): 29 kB | 310/334 kB
Progress (2): 29 kB | 327/334 kB
Progress (2): 29 kB | 334 kB    
Progress (3): 29 kB | 334 kB | 7.7/14 kB
Progress (4): 29 kB | 334 kB | 7.7/14 kB | 7.7/93 kB
Progress (4): 29 kB | 334 kB | 7.7/14 kB | 16/93 kB 
Progress (4): 29 kB | 334 kB | 14 kB | 16/93 kB    
Progress (4): 29 kB | 334 kB | 14 kB | 32/93 kB
Progress (4): 29 kB | 334 kB | 14 kB | 49/93 kB
Progress (4): 29 kB | 334 kB | 14 kB | 65/93 kB
Progress (4): 29 kB | 334 kB | 14 kB | 81/93 kB
Progress (5): 29 kB | 334 kB | 14 kB | 81/93 kB | 7.7/26 kB
Progress (5): 29 kB | 334 kB | 14 kB | 81/93 kB | 16/26 kB 
Progress (5): 29 kB | 334 kB | 14 kB | 81/93 kB | 26 kB   
Progress (5): 29 kB | 334 kB | 14 kB | 93 kB | 26 kB   
                                                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/thoughtworks/qdox/qdox/2.0.3/qdox-2.0.3.jar (334 kB at 2.1 MB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-xml/3.0.0/plexus-xml-3.0.0.jar (93 kB at 523 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-incremental/1.1/maven-shared-incremental-1.1.jar (14 kB at 40 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-javac/2.15.0/plexus-compiler-javac-2.15.0.jar (26 kB at 68 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-compiler-api/2.15.0/plexus-compiler-api-2.15.0.jar (29 kB at 70 kB/s)

[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 11 source files with javac [debug parameters release 21] to target\classes

[INFO] 
[INFO] --- resources:3.3.1:testResources (default-testResources) @ travel-insurance-claim-system ---
[INFO] skip non existing resourceDirectory C:\ProgramData\Jenkins\.jenkins\workspace\Travel-Insurance-CI\src\test\resources
[INFO] 
[INFO] --- compiler:3.13.0:testCompile (default-testCompile) @ travel-insurance-claim-system ---
[INFO] Recompiling the module because of changed dependency.
[INFO] Compiling 2 source files with javac [debug parameters release 21] to target\test-classes

[INFO] 
[INFO] --- surefire:3.2.5:test (default-test) @ travel-insurance-claim-system ---
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.2.5/maven-surefire-common-3.2.5.pom
Progress (1): 834 B
Progress (1): 3.3 kB
Progress (1): 6.2 kB
Progress (1): 6.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.2.5/maven-surefire-common-3.2.5.pom (6.2 kB at 59 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.2.5/surefire-api-3.2.5.pom
Progress (1): 843 B
Progress (1): 2.7 kB
Progress (1): 3.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.2.5/surefire-api-3.2.5.pom (3.5 kB at 42 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.2.5/surefire-logger-api-3.2.5.pom
Progress (1): 834 B
Progress (1): 2.3 kB
Progress (1): 3.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.2.5/surefire-logger-api-3.2.5.pom (3.3 kB at 53 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.2.5/surefire-shared-utils-3.2.5.pom
Progress (1): 1.1 kB
Progress (1): 4.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.2.5/surefire-shared-utils-3.2.5.pom (4.1 kB at 56 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.2.5/surefire-extensions-api-3.2.5.pom
Progress (1): 842 B
Progress (1): 2.8 kB
Progress (1): 3.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.2.5/surefire-extensions-api-3.2.5.pom (3.3 kB at 44 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.2.5/surefire-booter-3.2.5.pom
Progress (1): 834 B
Progress (1): 3.0 kB
Progress (1): 4.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.2.5/surefire-booter-3.2.5.pom (4.5 kB at 70 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.2.5/surefire-extensions-spi-3.2.5.pom
Progress (1): 878 B
Progress (1): 1.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.2.5/surefire-extensions-spi-3.2.5.pom (1.8 kB at 33 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/1.0.0.v20140518/aether-util-1.0.0.v20140518.pom
Progress (1): 937 B
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/1.0.0.v20140518/aether-util-1.0.0.v20140518.pom (2.2 kB at 35 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether/1.0.0.v20140518/aether-1.0.0.v20140518.pom
Progress (1): 798 B
Progress (1): 3.2 kB
Progress (1): 5.1 kB
Progress (1): 9.1 kB
Progress (1): 12 kB 
Progress (1): 17 kB
Progress (1): 20 kB
Progress (1): 23 kB
Progress (1): 28 kB
Progress (1): 30 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether/1.0.0.v20140518/aether-1.0.0.v20140518.pom (30 kB at 425 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-api/1.0.0.v20140518/aether-api-1.0.0.v20140518.pom
Progress (1): 938 B
Progress (1): 1.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-api/1.0.0.v20140518/aether-api-1.0.0.v20140518.pom (1.9 kB at 25 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.1/maven-common-artifact-filters-3.1.1.pom
Progress (1): 798 B
Progress (1): 2.3 kB
Progress (1): 5.7 kB
Progress (1): 5.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.1/maven-common-artifact-filters-3.1.1.pom (5.8 kB at 73 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/34/maven-shared-components-34.pom
Progress (1): 781 B
Progress (1): 2.3 kB
Progress (1): 4.6 kB
Progress (1): 5.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-shared-components/34/maven-shared-components-34.pom (5.1 kB at 65 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/34/maven-parent-34.pom
Progress (1): 727 B
Progress (1): 1.9 kB
Progress (1): 5.4 kB
Progress (1): 9.8 kB
Progress (1): 14 kB 
Progress (1): 19 kB
Progress (1): 23 kB
Progress (1): 26 kB
Progress (1): 27 kB
Progress (1): 30 kB
Progress (1): 34 kB
Progress (1): 37 kB
Progress (1): 41 kB
Progress (1): 43 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/34/maven-parent-34.pom (43 kB at 408 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.2.5/maven-artifact-3.2.5.pom
Progress (1): 843 B
Progress (1): 2.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-artifact/3.2.5/maven-artifact-3.2.5.pom (2.3 kB at 26 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.2.5/maven-3.2.5.pom
Progress (1): 759 B
Progress (1): 1.9 kB
Progress (1): 3.4 kB
Progress (1): 5.3 kB
Progress (1): 11 kB 
Progress (1): 15 kB
Progress (1): 18 kB
Progress (1): 21 kB
Progress (1): 22 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven/3.2.5/maven-3.2.5.pom (22 kB at 324 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/25/maven-parent-25.pom
Progress (1): 730 B
Progress (1): 2.0 kB
Progress (1): 6.0 kB
Progress (1): 11 kB 
Progress (1): 15 kB
Progress (1): 19 kB
Progress (1): 23 kB
Progress (1): 24 kB
Progress (1): 27 kB
Progress (1): 30 kB
Progress (1): 32 kB
Progress (1): 37 kB
Progress (1): 37 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-parent/25/maven-parent-25.pom (37 kB at 499 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/apache/15/apache-15.pom
Progress (1): 754 B
Progress (1): 2.1 kB
Progress (1): 3.9 kB
Progress (1): 7.9 kB
Progress (1): 11 kB 
Progress (1): 14 kB

Progress (1): 15 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/apache/15/apache-15.pom (15 kB at 171 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.2.5/maven-core-3.2.5.pom
Progress (1): 794 B
Progress (1): 2.2 kB
Progress (1): 5.3 kB
Progress (1): 8.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-core/3.2.5/maven-core-3.2.5.pom (8.1 kB at 92 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.2.5/maven-settings-3.2.5.pom
Progress (1): 823 B
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings/3.2.5/maven-settings-3.2.5.pom (2.2 kB at 36 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.2.5/maven-settings-builder-3.2.5.pom
Progress (1): 823 B
Progress (1): 2.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-settings-builder/3.2.5/maven-settings-builder-3.2.5.pom (2.6 kB at 42 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.21/plexus-interpolation-1.21.pom
Progress (1): 1.3 kB
Progress (1): 1.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-interpolation/1.21/plexus-interpolation-1.21.pom (1.5 kB at 22 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.3.1/plexus-components-1.3.1.pom
Progress (1): 1.3 kB
Progress (1): 3.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-components/1.3.1/plexus-components-1.3.1.pom (3.1 kB at 50 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.3.1/plexus-3.3.1.pom
Progress (1): 707 B
Progress (1): 2.6 kB
Progress (1): 6.1 kB
Progress (1): 8.6 kB
Progress (1): 11 kB 
Progress (1): 16 kB
Progress (1): 20 kB
Progress (1): 20 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/3.3.1/plexus-3.3.1.pom (20 kB at 353 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/17/spice-parent-17.pom
Progress (1): 1.2 kB
Progress (1): 3.4 kB
Progress (1): 6.7 kB
Progress (1): 6.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/17/spice-parent-17.pom (6.8 kB at 97 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/10/forge-parent-10.pom
Progress (1): 735 B
Progress (1): 2.6 kB
Progress (1): 8.6 kB
Progress (1): 12 kB 
Progress (1): 14 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/10/forge-parent-10.pom (14 kB at 219 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.pom
Progress (1): 815 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/1.5.5/plexus-component-annotations-1.5.5.pom (815 B at 12 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.5/plexus-containers-1.5.5.pom
Progress (1): 1.3 kB
Progress (1): 4.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/1.5.5/plexus-containers-1.5.5.pom (4.2 kB at 88 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.7/plexus-2.0.7.pom
Progress (1): 711 B
Progress (1): 2.8 kB
Progress (1): 6.4 kB
Progress (1): 9.1 kB
Progress (1): 13 kB 
Progress (1): 17 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus/2.0.7/plexus-2.0.7.pom (17 kB at 254 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.pom
Progress (1): 1.3 kB
Progress (1): 3.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-sec-dispatcher/1.3/plexus-sec-dispatcher-1.3.pom (3.0 kB at 51 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/12/spice-parent-12.pom
Progress (1): 1.2 kB
Progress (1): 4.2 kB
Progress (1): 6.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/spice/spice-parent/12/spice-parent-12.pom (6.8 kB at 113 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/4/forge-parent-4.pom
Progress (1): 1.4 kB
Progress (1): 5.8 kB
Progress (1): 8.4 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/4/forge-parent-4.pom (8.4 kB at 79 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.pom
Progress (1): 1.4 kB
Progress (1): 2.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/plexus/plexus-cipher/1.4/plexus-cipher-1.4.pom (2.1 kB at 29 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.2.5/maven-repository-metadata-3.2.5.pom
Progress (1): 823 B
Progress (1): 2.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-repository-metadata/3.2.5/maven-repository-metadata-3.2.5.pom (2.2 kB at 30 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.2.5/maven-plugin-api-3.2.5.pom
Progress (1): 816 B
Progress (1): 2.5 kB
Progress (1): 3.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-plugin-api/3.2.5/maven-plugin-api-3.2.5.pom (3.0 kB at 51 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.plexus/0.9.0.M2/org.eclipse.sisu.plexus-0.9.0.M2.pom
Progress (1): 827 B
Progress (1): 3.5 kB
Progress (1): 8.7 kB
Progress (1): 15 kB 
Progress (1): 15 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.plexus/0.9.0.M2/org.eclipse.sisu.plexus-0.9.0.M2.pom (15 kB at 137 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-plexus/0.9.0.M2/sisu-plexus-0.9.0.M2.pom
Progress (1): 811 B
Progress (1): 2.8 kB
Progress (1): 4.9 kB
Progress (1): 8.5 kB
Progress (1): 12 kB 
Progress (1): 15 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-plexus/0.9.0.M2/sisu-plexus-0.9.0.M2.pom (15 kB at 177 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/javax/annotation/javax.annotation-api/1.2/javax.annotation-api-1.2.pom
Progress (1): 702 B
Progress (1): 2.0 kB
Progress (1): 3.5 kB
Progress (1): 5.5 kB
Progress (1): 8.7 kB
Progress (1): 12 kB 
Progress (1): 13 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/javax/annotation/javax.annotation-api/1.2/javax.annotation-api-1.2.pom (13 kB at 162 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/net/java/jvnet-parent/3/jvnet-parent-3.pom
Progress (1): 838 B
Progress (1): 2.5 kB
Progress (1): 4.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/net/java/jvnet-parent/3/jvnet-parent-3.pom (4.8 kB at 73 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/javax/enterprise/cdi-api/1.2/cdi-api-1.2.pom
Progress (1): 1.0 kB
Progress (1): 3.3 kB
Progress (1): 5.8 kB
Progress (1): 6.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/javax/enterprise/cdi-api/1.2/cdi-api-1.2.pom (6.3 kB at 86 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/jboss/weld/weld-parent/26/weld-parent-26.pom
Progress (1): 1.0 kB
Progress (1): 2.9 kB
Progress (1): 6.3 kB
Progress (1): 11 kB 
Progress (1): 16 kB
Progress (1): 19 kB
Progress (1): 22 kB
Progress (1): 26 kB
Progress (1): 31 kB
Progress (1): 32 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/jboss/weld/weld-parent/26/weld-parent-26.pom (32 kB at 394 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.9.0.M2/org.eclipse.sisu.inject-0.9.0.M2.pom
Progress (1): 804 B
Progress (1): 4.1 kB
Progress (1): 10 kB 
Progress (1): 16 kB
Progress (1): 17 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/org.eclipse.sisu.inject/0.9.0.M2/org.eclipse.sisu.inject-0.9.0.M2.pom (17 kB at 241 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-inject/0.9.0.M2/sisu-inject-0.9.0.M2.pom
Progress (1): 819 B
Progress (1): 2.8 kB
Progress (1): 4.9 kB
Progress (1): 8.5 kB
Progress (1): 12 kB 
Progress (1): 15 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/sisu/sisu-inject/0.9.0.M2/sisu-inject-0.9.0.M2.pom (15 kB at 203 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.1.0/plexus-component-annotations-2.1.0.pom

Progress (1): 750 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-component-annotations/2.1.0/plexus-component-annotations-2.1.0.pom (750 B at 12 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/2.1.0/plexus-containers-2.1.0.pom
Progress (1): 1.3 kB
Progress (1): 4.7 kB
Progress (1): 4.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-containers/2.1.0/plexus-containers-2.1.0.pom (4.8 kB at 87 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.6.0/plexus-classworlds-2.6.0.pom
Progress (1): 932 B
Progress (1): 2.6 kB
Progress (1): 5.5 kB
Progress (1): 7.9 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.6.0/plexus-classworlds-2.6.0.pom (7.9 kB at 104 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.2.5/maven-model-builder-3.2.5.pom
Progress (1): 836 B
Progress (1): 2.7 kB
Progress (1): 3.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-model-builder/3.2.5/maven-model-builder-3.2.5.pom (3.0 kB at 50 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.2.5/maven-aether-provider-3.2.5.pom
Progress (1): 811 B
Progress (1): 3.0 kB
Progress (1): 4.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/maven-aether-provider/3.2.5/maven-aether-provider-3.2.5.pom (4.2 kB at 66 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-spi/1.0.0.v20140518/aether-spi-1.0.0.v20140518.pom
Progress (1): 934 B
Progress (1): 2.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-spi/1.0.0.v20140518/aether-spi-1.0.0.v20140518.pom (2.1 kB at 26 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-impl/1.0.0.v20140518/aether-impl-1.0.0.v20140518.pom
Progress (1): 922 B
Progress (1): 3.5 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-impl/1.0.0.v20140518/aether-impl-1.0.0.v20140518.pom (3.5 kB at 37 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/3.2.3/sisu-guice-3.2.3.pom
Progress (1): 1.3 kB
Progress (1): 3.8 kB
Progress (1): 6.0 kB
Progress (1): 9.7 kB
Progress (1): 11 kB 
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/sisu-guice/3.2.3/sisu-guice-3.2.3.pom (11 kB at 158 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-parent/3.2.3/guice-parent-3.2.3.pom
Progress (1): 799 B
Progress (1): 2.7 kB
Progress (1): 5.1 kB
Progress (1): 7.6 kB
Progress (1): 10 kB 
Progress (1): 13 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/sisu/inject/guice-parent/3.2.3/guice-parent-3.2.3.pom (13 kB at 142 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/38/forge-parent-38.pom
Progress (1): 812 B
Progress (1): 2.5 kB
Progress (1): 5.0 kB
Progress (1): 8.7 kB
Progress (1): 12 kB 
Progress (1): 16 kB
Progress (1): 19 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/sonatype/forge/forge-parent/38/forge-parent-38.pom (19 kB at 264 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/aopalliance/aopalliance/1.0/aopalliance-1.0.pom
Progress (1): 363 B
                   
Downloaded from central: https://repo.maven.apache.org/maven2/aopalliance/aopalliance/1.0/aopalliance-1.0.pom (363 B at 7.4 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/16.0.1/guava-16.0.1.pom
Progress (1): 956 B
Progress (1): 2.8 kB
Progress (1): 5.3 kB
Progress (1): 6.1 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava/16.0.1/guava-16.0.1.pom (6.1 kB at 130 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/16.0.1/guava-parent-16.0.1.pom
Progress (1): 1.1 kB
Progress (1): 2.9 kB
Progress (1): 6.3 kB
Progress (1): 7.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/com/google/guava/guava-parent/16.0.1/guava-parent-16.0.1.pom (7.3 kB at 120 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.5.2/plexus-classworlds-2.5.2.pom
Progress (1): 930 B
Progress (1): 3.0 kB
Progress (1): 6.0 kB
Progress (1): 7.3 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/codehaus/plexus/plexus-classworlds/2.5.2/plexus-classworlds-2.5.2.pom (7.3 kB at 112 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.15.1/commons-io-2.15.1.pom
Progress (1): 765 B
Progress (1): 2.1 kB
Progress (1): 5.2 kB
Progress (1): 7.6 kB
Progress (1): 10 kB 
Progress (1): 12 kB
Progress (1): 15 kB
Progress (1): 18 kB
Progress (1): 20 kB
                   
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.15.1/commons-io-2.15.1.pom (20 kB at 238 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/65/commons-parent-65.pom
Progress (1): 705 B
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
Progress (1): 43 kB
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
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/commons/commons-parent/65/commons-parent-65.pom (78 kB at 928 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.1/junit-bom-5.10.1.pom
Progress (1): 908 B
Progress (1): 4.1 kB
Progress (1): 5.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/junit-bom/5.10.1/junit-bom-5.10.1.pom (5.6 kB at 115 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.2.5/maven-surefire-common-3.2.5.jar
Progress (1): 7.3/308 kB
Progress (1): 24/308 kB 
Progress (1): 32/308 kB
Progress (1): 48/308 kB
Progress (1): 53/308 kB
Progress (1): 65/308 kB
Progress (1): 81/308 kB
Progress (1): 97/308 kB
Progress (1): 114/308 kB
Progress (1): 130/308 kB
Progress (1): 130/308 kB
Progress (1): 147/308 kB
Progress (1): 163/308 kB
Progress (1): 179/308 kB
Progress (1): 196/308 kB
Progress (1): 212/308 kB
Progress (1): 228/308 kB
Progress (1): 245/308 kB
Progress (1): 261/308 kB
Progress (1): 278/308 kB
Progress (1): 294/308 kB
Progress (1): 308 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/maven-surefire-common/3.2.5/maven-surefire-common-3.2.5.jar (308 kB at 1.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.2.5/surefire-logger-api-3.2.5.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.2.5/surefire-extensions-api-3.2.5.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.2.5/surefire-extensions-spi-3.2.5.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.2.5/surefire-api-3.2.5.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.2.5/surefire-booter-3.2.5.jar
Progress (1): 7.7/26 kB
Progress (1): 7.7/26 kB
Progress (2): 7.7/26 kB | 3.2/118 kB
Progress (3): 7.7/26 kB | 3.2/118 kB | 3.2/171 kB
Progress (3): 7.7/26 kB | 3.2/118 kB | 11/171 kB 
Progress (3): 24/26 kB | 3.2/118 kB | 11/171 kB 
Progress (3): 26 kB | 3.2/118 kB | 11/171 kB   
Progress (4): 26 kB | 3.2/118 kB | 11/171 kB | 7.7/14 kB
Progress (4): 26 kB | 3.2/118 kB | 11/171 kB | 14 kB    
Progress (4): 26 kB | 20/118 kB | 11/171 kB | 14 kB 
Progress (4): 26 kB | 20/118 kB | 28/171 kB | 14 kB
Progress (4): 26 kB | 20/118 kB | 44/171 kB | 14 kB
Progress (4): 26 kB | 28/118 kB | 44/171 kB | 14 kB
Progress (5): 26 kB | 28/118 kB | 44/171 kB | 14 kB | 7.7/8.2 kB
Progress (5): 26 kB | 28/118 kB | 44/171 kB | 14 kB | 7.7/8.2 kB
Progress (5): 26 kB | 28/118 kB | 44/171 kB | 14 kB | 8.2 kB    
Progress (5): 26 kB | 28/118 kB | 61/171 kB | 14 kB | 8.2 kB
Progress (5): 26 kB | 44/118 kB | 61/171 kB | 14 kB | 8.2 kB
Progress (5): 26 kB | 44/118 kB | 77/171 kB | 14 kB | 8.2 kB
Progress (5): 26 kB | 44/118 kB | 93/171 kB | 14 kB | 8.2 kB
Progress (5): 26 kB | 44/118 kB | 110/171 kB | 14 kB | 8.2 kB
Progress (5): 26 kB | 61/118 kB | 110/171 kB | 14 kB | 8.2 kB
Progress (5): 26 kB | 61/118 kB | 126/171 kB | 14 kB | 8.2 kB
Progress (5): 26 kB | 77/118 kB | 126/171 kB | 14 kB | 8.2 kB
Progress (5): 26 kB | 77/118 kB | 142/171 kB | 14 kB | 8.2 kB
Progress (5): 26 kB | 77/118 kB | 159/171 kB | 14 kB | 8.2 kB
Progress (5): 26 kB | 93/118 kB | 159/171 kB | 14 kB | 8.2 kB
Progress (5): 26 kB | 93/118 kB | 171 kB | 14 kB | 8.2 kB    
Progress (5): 26 kB | 110/118 kB | 171 kB | 14 kB | 8.2 kB
Progress (5): 26 kB | 118 kB | 171 kB | 14 kB | 8.2 kB    
                                                      
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-spi/3.2.5/surefire-extensions-spi-3.2.5.jar (8.2 kB at 80 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/1.0.0.v20140518/aether-util-1.0.0.v20140518.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-api/3.2.5/surefire-api-3.2.5.jar (171 kB at 1.3 MB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-api/1.0.0.v20140518/aether-api-1.0.0.v20140518.jar
Progress (4): 26 kB | 118 kB | 14 kB | 3.2/146 kB
Progress (4): 26 kB | 118 kB | 14 kB | 11/146 kB 
Progress (4): 26 kB | 118 kB | 14 kB | 28/146 kB
Progress (4): 26 kB | 118 kB | 14 kB | 44/146 kB
                                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-booter/3.2.5/surefire-booter-3.2.5.jar (118 kB at 764 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.1/maven-common-artifact-filters-3.1.1.jar
Progress (3): 26 kB | 14 kB | 61/146 kB
Progress (3): 26 kB | 14 kB | 77/146 kB
Progress (4): 26 kB | 14 kB | 77/146 kB | 7.3/136 kB
Progress (4): 26 kB | 14 kB | 77/146 kB | 15/136 kB 
Progress (4): 26 kB | 14 kB | 85/146 kB | 15/136 kB
Progress (4): 26 kB | 14 kB | 85/146 kB | 32/136 kB
Progress (4): 26 kB | 14 kB | 85/146 kB | 48/136 kB
Progress (4): 26 kB | 14 kB | 101/146 kB | 48/136 kB
Progress (4): 26 kB | 14 kB | 101/146 kB | 65/136 kB
Progress (4): 26 kB | 14 kB | 118/146 kB | 65/136 kB
Progress (4): 26 kB | 14 kB | 134/146 kB | 65/136 kB
Progress (4): 26 kB | 14 kB | 134/146 kB | 81/136 kB
Progress (4): 26 kB | 14 kB | 134/146 kB | 97/136 kB
Progress (4): 26 kB | 14 kB | 134/146 kB | 114/136 kB
Progress (4): 26 kB | 14 kB | 146 kB | 114/136 kB    
Progress (5): 26 kB | 14 kB | 146 kB | 114/136 kB | 7.7/61 kB
Progress (5): 26 kB | 14 kB | 146 kB | 114/136 kB | 7.7/61 kB
Progress (5): 26 kB | 14 kB | 146 kB | 114/136 kB | 24/61 kB 
Progress (5): 26 kB | 14 kB | 146 kB | 130/136 kB | 24/61 kB
Progress (5): 26 kB | 14 kB | 146 kB | 136 kB | 24/61 kB    
Progress (5): 26 kB | 14 kB | 146 kB | 136 kB | 40/61 kB
Progress (5): 26 kB | 14 kB | 146 kB | 136 kB | 57/61 kB
Progress (5): 26 kB | 14 kB | 146 kB | 136 kB | 61 kB   
                                                     
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-util/1.0.0.v20140518/aether-util-1.0.0.v20140518.jar (146 kB at 631 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.15.1/commons-io-2.15.1.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-logger-api/3.2.5/surefire-logger-api-3.2.5.jar (14 kB at 58 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.2.5/surefire-shared-utils-3.2.5.jar
Downloaded from central: https://repo.maven.apache.org/maven2/org/eclipse/aether/aether-api/1.0.0.v20140518/aether-api-1.0.0.v20140518.jar (136 kB at 573 kB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/shared/maven-common-artifact-filters/3.1.1/maven-common-artifact-filters-3.1.1.jar (61 kB at 254 kB/s)
Progress (2): 26 kB | 3.2/501 kB
Progress (2): 26 kB | 11/501 kB 
Progress (2): 26 kB | 28/501 kB
Progress (2): 26 kB | 44/501 kB
Progress (2): 26 kB | 61/501 kB
Progress (2): 26 kB | 77/501 kB
Progress (3): 26 kB | 77/501 kB | 0/2.4 MB
Progress (3): 26 kB | 93/501 kB | 0/2.4 MB
Progress (3): 26 kB | 110/501 kB | 0/2.4 MB
Progress (3): 26 kB | 110/501 kB | 0/2.4 MB
Progress (3): 26 kB | 110/501 kB | 0/2.4 MB
Progress (3): 26 kB | 126/501 kB | 0/2.4 MB
Progress (3): 26 kB | 126/501 kB | 0/2.4 MB
Progress (3): 26 kB | 142/501 kB | 0/2.4 MB
Progress (3): 26 kB | 142/501 kB | 0/2.4 MB
Progress (3): 26 kB | 159/501 kB | 0/2.4 MB
Progress (3): 26 kB | 159/501 kB | 0.1/2.4 MB
Progress (3): 26 kB | 175/501 kB | 0.1/2.4 MB
Progress (3): 26 kB | 192/501 kB | 0.1/2.4 MB
Progress (3): 26 kB | 192/501 kB | 0.1/2.4 MB
Progress (3): 26 kB | 208/501 kB | 0.1/2.4 MB
Progress (3): 26 kB | 208/501 kB | 0.1/2.4 MB
Progress (3): 26 kB | 224/501 kB | 0.1/2.4 MB
Progress (3): 26 kB | 224/501 kB | 0.1/2.4 MB
Progress (3): 26 kB | 241/501 kB | 0.1/2.4 MB
Progress (3): 26 kB | 257/501 kB | 0.1/2.4 MB
Progress (3): 26 kB | 257/501 kB | 0.1/2.4 MB
Progress (3): 26 kB | 257/501 kB | 0.1/2.4 MB
Progress (3): 26 kB | 274/501 kB | 0.1/2.4 MB
Progress (3): 26 kB | 274/501 kB | 0.1/2.4 MB
Progress (3): 26 kB | 290/501 kB | 0.1/2.4 MB
Progress (3): 26 kB | 290/501 kB | 0.2/2.4 MB
Progress (3): 26 kB | 306/501 kB | 0.2/2.4 MB
Progress (3): 26 kB | 323/501 kB | 0.2/2.4 MB
Progress (3): 26 kB | 323/501 kB | 0.2/2.4 MB
Progress (3): 26 kB | 339/501 kB | 0.2/2.4 MB
Progress (3): 26 kB | 339/501 kB | 0.2/2.4 MB
Progress (3): 26 kB | 355/501 kB | 0.2/2.4 MB
Progress (3): 26 kB | 355/501 kB | 0.2/2.4 MB
Progress (3): 26 kB | 372/501 kB | 0.2/2.4 MB
Progress (3): 26 kB | 388/501 kB | 0.2/2.4 MB
Progress (3): 26 kB | 388/501 kB | 0.2/2.4 MB
Progress (3): 26 kB | 405/501 kB | 0.2/2.4 MB
Progress (3): 26 kB | 405/501 kB | 0.2/2.4 MB
Progress (3): 26 kB | 405/501 kB | 0.3/2.4 MB
Progress (3): 26 kB | 421/501 kB | 0.3/2.4 MB
Progress (3): 26 kB | 437/501 kB | 0.3/2.4 MB
Progress (3): 26 kB | 454/501 kB | 0.3/2.4 MB
Progress (3): 26 kB | 470/501 kB | 0.3/2.4 MB
Progress (3): 26 kB | 470/501 kB | 0.3/2.4 MB
Progress (3): 26 kB | 487/501 kB | 0.3/2.4 MB
Progress (3): 26 kB | 501 kB | 0.3/2.4 MB    
Progress (3): 26 kB | 501 kB | 0.3/2.4 MB
Progress (3): 26 kB | 501 kB | 0.3/2.4 MB
Progress (3): 26 kB | 501 kB | 0.3/2.4 MB
Progress (3): 26 kB | 501 kB | 0.3/2.4 MB
Progress (3): 26 kB | 501 kB | 0.4/2.4 MB
Progress (3): 26 kB | 501 kB | 0.4/2.4 MB
Progress (3): 26 kB | 501 kB | 0.4/2.4 MB
Progress (3): 26 kB | 501 kB | 0.4/2.4 MB
Progress (3): 26 kB | 501 kB | 0.4/2.4 MB
Progress (3): 26 kB | 501 kB | 0.4/2.4 MB
Progress (3): 26 kB | 501 kB | 0.5/2.4 MB
Progress (3): 26 kB | 501 kB | 0.5/2.4 MB
Progress (3): 26 kB | 501 kB | 0.5/2.4 MB
Progress (3): 26 kB | 501 kB | 0.5/2.4 MB
Progress (3): 26 kB | 501 kB | 0.5/2.4 MB
                                         
Downloaded from central: https://repo.maven.apache.org/maven2/commons-io/commons-io/2.15.1/commons-io-2.15.1.jar (501 kB at 1.2 MB/s)
Progress (2): 26 kB | 0.5/2.4 MB
Progress (2): 26 kB | 0.6/2.4 MB
Progress (2): 26 kB | 0.6/2.4 MB
Progress (2): 26 kB | 0.6/2.4 MB
Progress (2): 26 kB | 0.6/2.4 MB
Progress (2): 26 kB | 0.6/2.4 MB
Progress (2): 26 kB | 0.6/2.4 MB
Progress (2): 26 kB | 0.7/2.4 MB
Progress (2): 26 kB | 0.7/2.4 MB
Progress (2): 26 kB | 0.7/2.4 MB
Progress (2): 26 kB | 0.7/2.4 MB
Progress (2): 26 kB | 0.7/2.4 MB
Progress (2): 26 kB | 0.7/2.4 MB
Progress (2): 26 kB | 0.7/2.4 MB
Progress (2): 26 kB | 0.8/2.4 MB
Progress (2): 26 kB | 0.8/2.4 MB
Progress (2): 26 kB | 0.8/2.4 MB
Progress (2): 26 kB | 0.8/2.4 MB
Progress (2): 26 kB | 0.8/2.4 MB
Progress (2): 26 kB | 0.8/2.4 MB
Progress (2): 26 kB | 0.9/2.4 MB
Progress (2): 26 kB | 0.9/2.4 MB
Progress (2): 26 kB | 0.9/2.4 MB
Progress (2): 26 kB | 0.9/2.4 MB
Progress (2): 26 kB | 0.9/2.4 MB
Progress (2): 26 kB | 0.9/2.4 MB
Progress (2): 26 kB | 1.0/2.4 MB
Progress (2): 26 kB | 1.0/2.4 MB
Progress (2): 26 kB | 1.0/2.4 MB
Progress (2): 26 kB | 1.0/2.4 MB
Progress (2): 26 kB | 1.0/2.4 MB
                                
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-extensions-api/3.2.5/surefire-extensions-api-3.2.5.jar (26 kB at 54 kB/s)
Progress (1): 1.0/2.4 MB
Progress (1): 1.0/2.4 MB
Progress (1): 1.1/2.4 MB
Progress (1): 1.1/2.4 MB
Progress (1): 1.1/2.4 MB
Progress (1): 1.1/2.4 MB
Progress (1): 1.1/2.4 MB
Progress (1): 1.1/2.4 MB
Progress (1): 1.2/2.4 MB
Progress (1): 1.2/2.4 MB
Progress (1): 1.2/2.4 MB
Progress (1): 1.2/2.4 MB
Progress (1): 1.2/2.4 MB
Progress (1): 1.2/2.4 MB
Progress (1): 1.3/2.4 MB
Progress (1): 1.3/2.4 MB
Progress (1): 1.3/2.4 MB
Progress (1): 1.3/2.4 MB
Progress (1): 1.3/2.4 MB
Progress (1): 1.3/2.4 MB
Progress (1): 1.4/2.4 MB

Progress (1): 1.4/2.4 MB
Progress (1): 1.4/2.4 MB
Progress (1): 1.4/2.4 MB
Progress (1): 1.4/2.4 MB
Progress (1): 1.4/2.4 MB
Progress (1): 1.5/2.4 MB
Progress (1): 1.5/2.4 MB
Progress (1): 1.5/2.4 MB
Progress (1): 1.5/2.4 MB
Progress (1): 1.5/2.4 MB
Progress (1): 1.5/2.4 MB
Progress (1): 1.6/2.4 MB
Progress (1): 1.6/2.4 MB
Progress (1): 1.6/2.4 MB
Progress (1): 1.6/2.4 MB
Progress (1): 1.6/2.4 MB
Progress (1): 1.6/2.4 MB
Progress (1): 1.6/2.4 MB
Progress (1): 1.7/2.4 MB
Progress (1): 1.7/2.4 MB
Progress (1): 1.7/2.4 MB
Progress (1): 1.7/2.4 MB
Progress (1): 1.7/2.4 MB
Progress (1): 1.7/2.4 MB
Progress (1): 1.8/2.4 MB
Progress (1): 1.8/2.4 MB
Progress (1): 1.8/2.4 MB
Progress (1): 1.8/2.4 MB
Progress (1): 1.8/2.4 MB
Progress (1): 1.8/2.4 MB
Progress (1): 1.9/2.4 MB
Progress (1): 1.9/2.4 MB
Progress (1): 1.9/2.4 MB
Progress (1): 1.9/2.4 MB
Progress (1): 1.9/2.4 MB
Progress (1): 1.9/2.4 MB
Progress (1): 2.0/2.4 MB
Progress (1): 2.0/2.4 MB
Progress (1): 2.0/2.4 MB
Progress (1): 2.0/2.4 MB
Progress (1): 2.0/2.4 MB
Progress (1): 2.0/2.4 MB
Progress (1): 2.1/2.4 MB
Progress (1): 2.1/2.4 MB
Progress (1): 2.1/2.4 MB
Progress (1): 2.1/2.4 MB
Progress (1): 2.1/2.4 MB
Progress (1): 2.1/2.4 MB
Progress (1): 2.2/2.4 MB
Progress (1): 2.2/2.4 MB
Progress (1): 2.2/2.4 MB
Progress (1): 2.2/2.4 MB
Progress (1): 2.2/2.4 MB
Progress (1): 2.2/2.4 MB
Progress (1): 2.3/2.4 MB
Progress (1): 2.3/2.4 MB
Progress (1): 2.3/2.4 MB
Progress (1): 2.3/2.4 MB
Progress (1): 2.3/2.4 MB
Progress (1): 2.3/2.4 MB
Progress (1): 2.4/2.4 MB
Progress (1): 2.4/2.4 MB
Progress (1): 2.4/2.4 MB
Progress (1): 2.4/2.4 MB
Progress (1): 2.4/2.4 MB
Progress (1): 2.4/2.4 MB
Progress (1): 2.4 MB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-shared-utils/3.2.5/surefire-shared-utils-3.2.5.jar (2.4 MB at 3.4 MB/s)
[INFO] Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/3.2.5/surefire-junit-platform-3.2.5.pom
Progress (1): 846 B
Progress (1): 3.5 kB
Progress (1): 4.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/3.2.5/surefire-junit-platform-3.2.5.pom (4.7 kB at 69 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-providers/3.2.5/surefire-providers-3.2.5.pom
Progress (1): 849 B
Progress (1): 2.6 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-providers/3.2.5/surefire-providers-3.2.5.pom (2.6 kB at 56 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/common-java5/3.2.5/common-java5-3.2.5.pom

Progress (1): 849 B
Progress (1): 2.6 kB
Progress (1): 2.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/common-java5/3.2.5/common-java5-3.2.5.pom (2.8 kB at 41 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.9.3/junit-platform-launcher-1.9.3.pom
Progress (1): 966 B
Progress (1): 3.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.9.3/junit-platform-launcher-1.9.3.pom (3.0 kB at 52 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.9.3/junit-platform-engine-1.9.3.pom
Progress (1): 957 B
Progress (1): 3.2 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.9.3/junit-platform-engine-1.9.3.pom (3.2 kB at 70 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.pom
Progress (1): 1.2 kB
Progress (1): 1.7 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.pom (1.7 kB at 26 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.9.3/junit-platform-commons-1.9.3.pom
Progress (1): 971 B
Progress (1): 2.8 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.9.3/junit-platform-commons-1.9.3.pom (2.8 kB at 57 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/3.2.5/surefire-junit-platform-3.2.5.jar
Progress (1): 7.7/27 kB
Progress (1): 7.7/27 kB
Progress (1): 24/27 kB 
Progress (1): 27 kB   
                   
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit-platform/3.2.5/surefire-junit-platform-3.2.5.jar (27 kB at 75 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/common-java5/3.2.5/common-java5-3.2.5.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.9.3/junit-platform-launcher-1.9.3.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.9.3/junit-platform-engine-1.9.3.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.9.3/junit-platform-commons-1.9.3.jar
Progress (1): 7.7 kB
Progress (2): 7.7 kB | 7.7/103 kB
Progress (3): 7.7 kB | 7.7/103 kB | 7.3/18 kB
Progress (3): 7.7 kB | 7.7/103 kB | 7.3/18 kB
Progress (3): 7.7 kB | 7.7/103 kB | 18 kB    
Progress (4): 7.7 kB | 7.7/103 kB | 18 kB | 7.7/169 kB
Progress (4): 7.7 kB | 7.7/103 kB | 18 kB | 7.7/169 kB
Progress (4): 7.7 kB | 24/103 kB | 18 kB | 7.7/169 kB 
Progress (4): 7.7 kB | 24/103 kB | 18 kB | 24/169 kB 
Progress (4): 7.7 kB | 24/103 kB | 18 kB | 29/169 kB
Progress (4): 7.7 kB | 40/103 kB | 18 kB | 29/169 kB
Progress (4): 7.7 kB | 57/103 kB | 18 kB | 29/169 kB
Progress (4): 7.7 kB | 73/103 kB | 18 kB | 29/169 kB
Progress (4): 7.7 kB | 90/103 kB | 18 kB | 29/169 kB
Progress (4): 7.7 kB | 90/103 kB | 18 kB | 46/169 kB
Progress (4): 7.7 kB | 90/103 kB | 18 kB | 57/169 kB
Progress (4): 7.7 kB | 103 kB | 18 kB | 57/169 kB   
Progress (4): 7.7 kB | 103 kB | 18 kB | 73/169 kB
Progress (4): 7.7 kB | 103 kB | 18 kB | 90/169 kB
Progress (4): 7.7 kB | 103 kB | 18 kB | 106/169 kB
Progress (4): 7.7 kB | 103 kB | 18 kB | 122/169 kB
Progress (4): 7.7 kB | 103 kB | 18 kB | 139/169 kB
                                                  
Downloaded from central: https://repo.maven.apache.org/maven2/org/opentest4j/opentest4j/1.2.0/opentest4j-1.2.0.jar (7.7 kB at 89 kB/s)
Progress (3): 103 kB | 18 kB | 155/169 kB
Progress (3): 103 kB | 18 kB | 169 kB    
                                     
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-commons/1.9.3/junit-platform-commons-1.9.3.jar (103 kB at 1.0 MB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.9.3/junit-platform-launcher-1.9.3.jar (169 kB at 1.5 MB/s)
Downloaded from central: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/common-java5/3.2.5/common-java5-3.2.5.jar (18 kB at 55 kB/s)
Progress (1): 8.2/189 kB
Progress (1): 25/189 kB 
Progress (1): 33/189 kB
Progress (1): 49/189 kB
Progress (1): 66/189 kB
Progress (1): 82/189 kB

Progress (1): 98/189 kB
Progress (1): 115/189 kB
Progress (1): 131/189 kB
Progress (1): 147/189 kB
Progress (1): 164/189 kB
Progress (1): 180/189 kB
Progress (1): 189 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-engine/1.9.3/junit-platform-engine-1.9.3.jar (189 kB at 422 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.10.3/junit-platform-launcher-1.10.3.pom
Progress (1): 967 B
Progress (1): 3.0 kB
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.10.3/junit-platform-launcher-1.10.3.pom (3.0 kB at 44 kB/s)
Downloading from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.10.3/junit-platform-launcher-1.10.3.jar
Progress (1): 7.7/184 kB
Progress (1): 7.7/184 kB
Progress (1): 24/184 kB 
Progress (1): 40/184 kB
Progress (1): 57/184 kB
Progress (1): 73/184 kB
Progress (1): 90/184 kB
Progress (1): 106/184 kB
Progress (1): 122/184 kB
Progress (1): 139/184 kB
Progress (1): 155/184 kB
Progress (1): 172/184 kB
Progress (1): 184 kB    
                    
Downloaded from central: https://repo.maven.apache.org/maven2/org/junit/platform/junit-platform-launcher/1.10.3/junit-platform-launcher-1.10.3.jar (184 kB at 2.2 MB/s)
[INFO] 
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------

[INFO] Running com.academic.travelinsurance.ClaimValidationTest
15:03:39.921 [main] INFO org.springframework.test.context.support.AnnotationConfigContextLoaderUtils -- Could not detect default configuration classes for test class [com.academic.travelinsurance.ClaimValidationTest]: ClaimValidationTest does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
15:03:40.021 [main] INFO org.springframework.boot.test.context.SpringBootTestContextBootstrapper -- Found @SpringBootConfiguration com.academic.travelinsurance.TravelInsuranceApplication for test class com.academic.travelinsurance.ClaimValidationTest

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.3.4)

2026-10-08T15:03:40.339+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] c.a.travelinsurance.ClaimValidationTest  : Starting ClaimValidationTest using Java 25.0.1 with PID 14508 (started by BOOK-OTH0BRBPD9$ in C:\ProgramData\Jenkins\.jenkins\workspace\Travel-Insurance-CI)
2026-10-08T15:03:40.340+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] c.a.travelinsurance.ClaimValidationTest  : No active profile set, falling back to 1 default profile: "default"

2026-10-08T15:03:40.859+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-10-08T15:03:40.906+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 40 ms. Found 1 JPA repository interface.
2026-10-08T15:03:41.304+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-10-08T15:03:41.358+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.5.3.Final
2026-10-08T15:03:41.388+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled

2026-10-08T15:03:41.735+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-10-08T15:03:41.787+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-10-08T15:03:42.030+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:claimdb user=SA
2026-10-08T15:03:42.034+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-10-08T15:03:42.090+05:30  WARN 14508 --- [travel-insurance-claim-system] [           main] org.hibernate.orm.deprecation            : HHH90000025: H2Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)

2026-10-08T15:03:44.091+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
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
2026-10-08T15:03:44.206+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'

WARNING: A restricted method in java.lang.System has been called
WARNING: java.lang.System::load has been called by org.apache.tomcat.jni.Library in an unnamed module (file:/C:/Windows/system32/config/systemprofile/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/10.1.30/tomcat-embed-core-10.1.30.jar)
WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
WARNING: Restricted methods will be blocked in a future release unless native access is enabled

2026-10-08T15:03:45.080+05:30  WARN 14508 --- [travel-insurance-claim-system] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-10-08T15:03:45.126+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page: class path resource [static/index.html]

2026-10-08T15:03:45.605+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:claimdb'
2026-10-08T15:03:45.697+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] o.s.b.t.m.w.SpringBootMockServletContext : Initializing Spring TestDispatcherServlet ''
2026-10-08T15:03:45.698+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Initializing Servlet ''
2026-10-08T15:03:45.699+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] o.s.t.web.servlet.TestDispatcherServlet  : Completed initialization in 1 ms
2026-10-08T15:03:45.723+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] c.a.travelinsurance.ClaimValidationTest  : Started ClaimValidationTest in 5.597 seconds (process running for 6.797)
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
[TEST 1 PASSED] Valid claim submitted. Response: {"claimId":1,"policyNumber":"POL-2024-001","customerName":"Hasnain Ahmed","destination":"Dubai, UAE","travelDate":"2024-10-15","claimType":"Medical Emergency","claimAmount":15000.00,"description":"Fell ill during the trip and required hospitalisation.","documentReference":"DR-2024-001","status":"PENDING","rejectionReason":null,"createdAt":"2026-10-08T15:03:46.7851045","updatedAt":"2026-10-08T15:03:46.7851045"}
[TEST 5 PASSED] Claim amount = 0 correctly rejected with 400.
[TEST 7 PASSED] Empty description correctly rejected with 400.
[TEST 3 PASSED] Empty policy number correctly rejected with 400.
[TEST 2 PASSED] Empty customer name correctly rejected with 400.
[TEST 6 PASSED] Negative claim amount correctly rejected with 400.
[INFO] Tests run: 7, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 7.254 s -- in com.academic.travelinsurance.ClaimValidationTest
[INFO] Running com.academic.travelinsurance.TravelInsuranceApplicationTests
2026-10-08T15:03:47.073+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] t.c.s.AnnotationConfigContextLoaderUtils : Could not detect default configuration classes for test class [com.academic.travelinsurance.TravelInsuranceApplicationTests]: TravelInsuranceApplicationTests does not declare any static, non-private, non-final, nested classes annotated with @Configuration.
2026-10-08T15:03:47.076+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] .b.t.c.SpringBootTestContextBootstrapper : Found @SpringBootConfiguration com.academic.travelinsurance.TravelInsuranceApplication for test class com.academic.travelinsurance.TravelInsuranceApplicationTests

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.3.4)

2026-10-08T15:03:47.112+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] c.a.t.TravelInsuranceApplicationTests    : Starting TravelInsuranceApplicationTests using Java 25.0.1 with PID 14508 (started by BOOK-OTH0BRBPD9$ in C:\ProgramData\Jenkins\.jenkins\workspace\Travel-Insurance-CI)
2026-10-08T15:03:47.112+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] c.a.t.TravelInsuranceApplicationTests    : No active profile set, falling back to 1 default profile: "default"
2026-10-08T15:03:47.371+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-10-08T15:03:47.383+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 12 ms. Found 1 JPA repository interface.
2026-10-08T15:03:47.474+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2026-10-08T15:03:47.480+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] o.h.c.internal.RegionFactoryInitiator    : HHH000026: Second-level cache disabled
2026-10-08T15:03:47.500+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-10-08T15:03:47.503+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Starting...
2026-10-08T15:03:47.505+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-2 - Added connection conn10: url=jdbc:h2:mem:claimdb user=SA
2026-10-08T15:03:47.505+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-2 - Start completed.
2026-10-08T15:03:47.506+05:30  WARN 14508 --- [travel-insurance-claim-system] [           main] org.hibernate.orm.deprecation            : HHH90000025: H2Dialect does not need to be specified explicitly using 'hibernate.dialect' (remove the property setting and it will be selected by default)

2026-10-08T15:03:47.589+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
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
2026-10-08T15:03:47.596+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-10-08T15:03:47.681+05:30  WARN 14508 --- [travel-insurance-claim-system] [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-10-08T15:03:47.687+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page: class path resource [static/index.html]
2026-10-08T15:03:47.781+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] o.s.b.a.h2.H2ConsoleAutoConfiguration    : H2 console available at '/h2-console'. Database available at 'jdbc:h2:mem:claimdb'
2026-10-08T15:03:47.805+05:30  INFO 14508 --- [travel-insurance-claim-system] [           main] c.a.t.TravelInsuranceApplicationTests    : Started TravelInsuranceApplicationTests in 0.722 seconds (process running for 8.879)
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.739 s -- in com.academic.travelinsurance.TravelInsuranceApplicationTests
[INFO] 
[INFO] Results:
[INFO] 
[INFO] Tests run: 8, Failures: 0, Errors: 0, Skipped: 0
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  01:02 min
[INFO] Finished at: 2026-10-08T15:03:47+05:30
[INFO] ------------------------------------------------------------------------
Finished: SUCCESS

