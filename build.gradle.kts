plugins {
    kotlin("jvm") version "1.2.10"
}

repositories {
    jcenter()
}

dependencies {
    compile(project(":submodule-java"))
    compile(kotlin(module ="stdlib-jre8", version = "1.2.10"))
}

