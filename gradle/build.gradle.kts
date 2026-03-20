plugins {
    java
    id("org.springframework.boot") version "2.7.11"
    id("io.spring.dependency-management") version "1.1.0"
    id("com.google.protobuf") version "0.9.3"
    id("org.owasp.dependencycheck") version "8.2.1"
}

group = "com.example"
version = "1.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:2.7.11")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.7.11")
    implementation("org.springframework.boot:spring-boot-starter-security:2.7.11")
    implementation("org.springframework.boot:spring-boot-starter-validation:2.7.11")
    implementation("org.springframework.boot:spring-boot-starter-actuator:2.7.11")
    implementation("org.springframework.boot:spring-boot-starter-cache:2.7.11")
    implementation("org.springframework.boot:spring-boot-starter-mail:2.7.11")
    implementation("org.springframework.boot:spring-boot-starter-websocket:2.7.11")
    implementation("org.springframework.boot:spring-boot-starter-amqp:2.7.11")
    implementation("org.springframework.boot:spring-boot-starter-data-redis:2.7.11")
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb:2.7.11")
    implementation("org.springframework.boot:spring-boot-starter-data-elasticsearch:2.7.11")
    implementation("org.springframework.boot:spring-boot-starter-graphql:2.7.11")
    implementation("org.springframework.boot:spring-boot-starter-oauth2-client:2.7.11")
    implementation("org.springframework.boot:spring-boot-starter-oauth2-resource-server:2.7.11")

    implementation("com.fasterxml.jackson.core:jackson-databind:2.14.2")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.14.2")
    implementation("com.fasterxml.jackson.dataformat:jackson-dataformat-yaml:2.14.2")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.14.2")

    implementation("org.apache.commons:commons-lang3:3.12.0")
    implementation("org.apache.commons:commons-collections4:4.4")
    implementation("org.apache.commons:commons-text:1.10.0")
    implementation("commons-io:commons-io:2.13.0")
    implementation("commons-codec:commons-codec:1.15")
    implementation("commons-validator:commons-validator:1.7")
    implementation("org.apache.commons:commons-csv:1.10.0")

    implementation("org.hibernate:hibernate-core:5.6.15.Final")
    implementation("org.hibernate.validator:hibernate-validator:8.0.0.Final")

    implementation("com.google.guava:guava:31.1-jre")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("com.google.protobuf:protobuf-java:3.23.2")
    implementation("com.google.cloud:google-cloud-storage:2.22.3")
    implementation("com.google.cloud:google-cloud-bigquery:2.27.0")
    implementation("com.google.firebase:firebase-admin:9.1.1")

    implementation("org.apache.httpcomponents:httpclient:4.5.14")
    implementation("org.apache.httpcomponents.client5:httpclient5:5.2.1")

    implementation("com.squareup.okhttp3:okhttp:4.11.0")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.squareup.retrofit2:converter-jackson:2.9.0")

    implementation("io.jsonwebtoken:jjwt-api:0.11.5")
    runtimeOnly("io.jsonwebtoken:jjwt-impl:0.11.5")
    runtimeOnly("io.jsonwebtoken:jjwt-jackson:0.11.5")

    implementation("org.apache.kafka:kafka-clients:3.4.0")
    implementation("org.springframework.kafka:spring-kafka:2.9.8")
    implementation("io.nats:jnats:2.16.11")

    implementation("software.amazon.awssdk:s3:2.20.68")
    implementation("software.amazon.awssdk:dynamodb:2.20.68")
    implementation("software.amazon.awssdk:sqs:2.20.68")
    implementation("software.amazon.awssdk:sns:2.20.68")
    implementation("software.amazon.awssdk:lambda:2.20.68")
    implementation("software.amazon.awssdk:ses:2.20.68")
    implementation("software.amazon.awssdk:kms:2.20.68")
    implementation("software.amazon.awssdk:secretsmanager:2.20.68")
    implementation("software.amazon.awssdk:sts:2.20.68")
    implementation("software.amazon.awssdk:cloudwatch:2.20.68")

    implementation("com.azure:azure-storage-blob:12.22.2")
    implementation("com.azure:azure-identity:1.9.0")
    implementation("com.azure:azure-cosmos:4.46.0")
    implementation("com.azure:azure-security-keyvault-secrets:4.6.2")

    implementation("io.grpc:grpc-netty-shaded:1.55.1")
    implementation("io.grpc:grpc-protobuf:1.55.1")
    implementation("io.grpc:grpc-stub:1.55.1")

    implementation("io.micrometer:micrometer-core:1.11.0")
    implementation("io.micrometer:micrometer-registry-prometheus:1.11.0")
    implementation("io.opentelemetry:opentelemetry-api:1.26.0")
    implementation("io.opentelemetry:opentelemetry-sdk:1.26.0")
    implementation("io.sentry:sentry-spring-boot-starter:6.21.0")

    implementation("org.flywaydb:flyway-core:9.19.1")
    implementation("org.liquibase:liquibase-core:4.22.0")

    implementation("io.netty:netty-all:4.1.93.Final")
    implementation("io.projectreactor:reactor-core:3.5.6")
    implementation("io.projectreactor.netty:reactor-netty:1.1.7")

    implementation("org.mapstruct:mapstruct:1.5.5.Final")
    annotationProcessor("org.mapstruct:mapstruct-processor:1.5.5.Final")

    implementation("org.projectlombok:lombok:1.18.28")
    annotationProcessor("org.projectlombok:lombok:1.18.28")

    implementation("org.slf4j:slf4j-api:2.0.7")
    implementation("ch.qos.logback:logback-classic:1.4.8")
    implementation("org.apache.logging.log4j:log4j-core:2.20.0")
    implementation("org.apache.logging.log4j:log4j-api:2.20.0")

    implementation("com.zaxxer:HikariCP:5.0.1")
    implementation("org.ehcache:ehcache:3.10.8")
    implementation("com.github.ben-manes.caffeine:caffeine:3.1.6")
    implementation("org.redisson:redisson:3.21.3")

    implementation("org.quartz-scheduler:quartz:2.3.2")

    implementation("com.opencsv:opencsv:5.7.1")
    implementation("org.apache.poi:poi:5.2.3")
    implementation("org.apache.poi:poi-ooxml:5.2.3")
    implementation("com.itextpdf:itext7-core:7.2.5")

    implementation("org.jsoup:jsoup:1.16.1")
    implementation("org.thymeleaf:thymeleaf:3.1.1.RELEASE")

    implementation("com.graphql-java:graphql-java:20.4")
    implementation("com.graphql-java-kickstart:graphql-spring-boot-starter:15.0.0")

    implementation("io.swagger.core.v3:swagger-core:2.2.14")
    implementation("org.springdoc:springdoc-openapi-ui:1.7.0")

    runtimeOnly("org.postgresql:postgresql:42.6.0")
    runtimeOnly("mysql:mysql-connector-java:8.0.33")
    runtimeOnly("com.h2database:h2:2.1.214")

    testImplementation("org.springframework.boot:spring-boot-starter-test:2.7.11")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.3")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.3")
    testImplementation("org.mockito:mockito-core:5.3.1")
    testImplementation("org.mockito:mockito-junit-jupiter:5.3.1")
    testImplementation("org.assertj:assertj-core:3.24.2")
    testImplementation("org.testcontainers:testcontainers:1.18.3")
    testImplementation("org.testcontainers:junit-jupiter:1.18.3")
    testImplementation("org.testcontainers:postgresql:1.18.3")
    testImplementation("org.testcontainers:mysql:1.18.3")
    testImplementation("org.testcontainers:mongodb:1.18.3")
    testImplementation("org.testcontainers:kafka:1.18.3")
    testImplementation("com.github.tomakehurst:wiremock-jre8:2.35.0")
    testImplementation("io.rest-assured:rest-assured:5.3.0")
    testImplementation("org.awaitility:awaitility:4.2.0")
    testImplementation("net.javacrumbs.json-unit:json-unit-assertj:2.38.0")
    testImplementation("com.tngtech.archunit:archunit-junit5:1.0.1")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
