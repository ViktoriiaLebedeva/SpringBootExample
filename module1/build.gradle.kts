plugins{
    java
    id("org.springframework.boot") version "2.1.5.RELEASE"
    war
}

group = "org.example"
version = "1.0-SNAPSHOT"

val SBversion = "2.1.5.RELEASE"

repositories{
    mavenLocal()
    mavenCentral()
}

dependencies{
    implementation(project(":module2"))
    implementation("org.springframework.boot:spring-boot-dependencies:$SBversion")
    implementation("org.springframework.boot:spring-boot-starter-web:$SBversion")
    providedRuntime("org.springframework.boot:spring-boot-starter-tomcat:$SBversion")
    implementation("com.google.code.gson:gson:2.8.6")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

tasks{
    bootJar{
        archiveFileName.set("spring-boot.jar")
    }
    bootWar{
        archiveFileName.set("sample.war")
    }
}