plugins {
    kotlin("jvm") version "1.7.20"
}

group = "org.hyuk"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

object Versions {
    const val KOTEST = "5.5.3"
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation("io.kotest:kotest-runner-junit5:${Versions.KOTEST}")
    testImplementation("io.kotest:kotest-assertions-core:${Versions.KOTEST}")

}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
}