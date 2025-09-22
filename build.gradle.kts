plugins {
    kotlin("jvm") version "2.1.20"
}

group = "org.setu.placemark"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.slf4j:slf4j-simple:1.7.36")
    implementation ("io.github.microutils:kotlin-logging:2.1.23")
    implementation("com.google.code.gson:gson:2.13.1")

}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(22)
}


tasks.register<JavaExec>("run") {
    mainClass.set("org.setu.placemark.console.main.MainKt")
    classpath = sourceSets["main"].runtimeClasspath
}
