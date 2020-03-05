plugins {
    java
    id("com.github.johnrengelman.shadow") version "5.2.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testCompile("junit", "junit", "4.12")
    implementation(project(":module2"))
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks {
    jar {
        archiveFileName.set("jarWithJar.jar")

        manifest {
            attributes["Class-Path"] = "org.example.SomeClass src/main/resources/test.jar"
        }
    }
}