# maven-example
## Step 1
Create maven project in IntelliJ IDEA.

## Step 2
Add dependencies in pom.xml from [Maven Repository](mvnrepository.com):
- Lombok
- Guava
- Apache Commons


```xml
<project>
    <modelVersion>4.0.0</modelVersion>

    <groupId>com.reckue</groupId>
    <artifactId>maven-example</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <version>1.18.10</version>
            <scope>provided</scope>
        </dependency>
        <dependency>
            <groupId>commons-io</groupId>
            <artifactId>commons-io</artifactId>
            <version>2.5</version>
        </dependency>
        <dependency>
            <groupId>com.google.guava</groupId>
            <artifactId>guava</artifactId>
            <version>19.0</version>
        </dependency>
    </dependencies>

</project>
```

## Step 3
Create class MavenExampleApplication.
```java
package com.reckue.maven_example;


import java.util.Map;

public class MavenExampleApplication {
    public static void main(String[] args) {
        Map<String, Integer> items = Map.of("s1", 1, "s2", 2,"s3",3);
        System.out.println(items.get("s1"));
    }
}
```
