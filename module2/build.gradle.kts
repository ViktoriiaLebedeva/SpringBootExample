plugins{
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories{
    mavenLocal()
    mavenCentral()
}

dependencies{
    implementation("org.junit.jupiter:junit-jupiter:5.5.2")
}
tasks{
    jar{
        archiveFileName.set("test.jar")
    }
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}