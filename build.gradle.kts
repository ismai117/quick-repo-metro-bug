import dev.zacsweers.metro.gradle.ExperimentalMetroGradleApi

plugins {
    kotlin("multiplatform") version "2.4.20"
    kotlin("plugin.compose") version "2.4.20"
    id("org.jetbrains.compose") version "1.13.0-alpha01"
    id("dev.zacsweers.metro") version "1.4.5"
}

kotlin {
    wasmJs {
        browser()
    }

    sourceSets {
        wasmJsMain.dependencies {
            implementation("org.jetbrains.compose.runtime:runtime:1.13.0-alpha01")
            implementation("org.jetbrains.compose.ui:ui:1.13.0-alpha01")
            implementation("com.slack.circuit:circuitx-subcircuit:0.39.0")
            implementation("com.slack.circuit:circuitx-subcircuit-codegen-annotations:0.39.0")
        }
    }
}

metro {
    @OptIn(ExperimentalMetroGradleApi::class)
    enableCircuitCodegen.set(true)
}
