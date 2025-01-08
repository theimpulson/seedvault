//
// SPDX-FileCopyrightText: 2023 The Calyx Institute
// SPDX-License-Identifier: Apache-2.0
//

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        // LineageOS doesn't publishes plugins on known maven repos
        maven("https://raw.githubusercontent.com/lineage-next/gradle-generatebp/v1.20/.m2")
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}

rootProject.name = "Seedvault"
include(":core")
include(":app")
include(":contactsbackup")
include(":storage:lib")
include(":storage:demo")
