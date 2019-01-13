import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.3.11"
}

group = "hello.cdk"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    implementation("software.amazon.awscdk:cdk:0.22.0")      // https://mvnrepository.com/artifact/software.amazon.awscdk/cdk
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}