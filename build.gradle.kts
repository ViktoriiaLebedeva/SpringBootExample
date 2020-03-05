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
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}