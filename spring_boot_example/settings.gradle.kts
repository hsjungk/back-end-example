plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
/*
 * This file was generated by the Gradle 'init' task.
 *
 * The settings file is used to specify which projects to include in your build.
 *
 * Detailed information about configuring a multi-project build in Gradle can be found
 * in the user manual at https://docs.gradle.org/8.0.1/userguide/multi_project_builds.html
 */

rootProject.name = "spring_boot"

include("library")

include("example")
include("example-webflux")
include("example-websocket")
include("example-security")

/*
    Project port
    example : 8081
    example-webflux : 8082
    example-security : 8083
    example-websocket : 8084
 */
