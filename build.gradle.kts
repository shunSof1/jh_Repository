plugins {
    id("org.springframework.boot") version "2.2.0.RELEASE"
    id("io.spring.dependency-management") version "1.0.8.RELEASE"
    kotlin("jvm") version "1.9.23"
    kotlin("plugin.spring") version "1.9.23"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")					//프로젝트 생성하면서 추가한 거
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")				//기본적인 종속성
    implementation("org.jetbrains.kotlin:kotlin-reflect")								//기본적인 종속성
    annotationProcessor("org.springframework.boot:spring-boot-configuration-processor") //프로젝트 생성하면서 추가한 거
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(21)
}