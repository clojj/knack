import org.jetbrains.kotlin.ir.backend.js.compile

plugins {
    kotlin("js") version "1.4.0"
}

group = "io.noobymatze"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-js")
    testImplementation("org.jetbrains.kotlin:kotlin-test-js")
}

kotlin {
    js {
        browser {

        }
        binaries.executable()
    }
}
