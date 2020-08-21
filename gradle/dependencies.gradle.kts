val implementation by configurations
val testImplementation by configurations

val integrationTestImplementation by configurations.creating {
    extendsFrom(testImplementation)
}

val kotlinVersion: String by extra
val junitVersion: String by extra
val jacksonVersion: String by extra
val springDataVersion : String by extra
val springBootVersion: String by extra
val springVersion: String by extra
val dokkaVersion: String by extra

data class Package(
    val groupId: String,
    val artifactId: String,
    val version: String
)

val jacksonPackages: Array<Package> = arrayOf(
    Package("com.fasterxml.jackson.module", "jackson-module-kotlin", jacksonVersion),
    Package("com.fasterxml.jackson.dataformat", "jackson-dataformat-yaml", jacksonVersion),
    Package( "com.fasterxml.jackson.datatype", "jackson-datatype-jsr310", jacksonVersion)
)

val springPackages: Array<Package> = arrayOf()

val springBootPackages: Array<Package> = arrayOf()

val databasePackages: Array<Package> = arrayOf()

val jUnitPackages: Array<Package> = arrayOf(
    Package("org.junit.jupiter", "junit-jupiter-api", junitVersion),
    Package("org.junit.jupiter", "junit-jupiter-params", junitVersion),
    Package("org.junit.jupiter", "junit-jupiter-engine", junitVersion),

    Package("io.mockk", "mockk", "1.8.13"),
    Package("org.amshove.kluent", "kluent", "1.49")
)

val springTestPackages: Array<Package> = arrayOf()

val atomosPackages: Array<Package> = arrayOf()

val packages: Array<Package> = arrayOf(
    Package("org.jetbrains.kotlin", "kotlin-reflect", kotlinVersion),
    Package("org.jetbrains.dokka", "dokka-gradle-plugin", dokkaVersion),
    *atomosPackages,
    *jacksonPackages,
    *springPackages,
    *springBootPackages,
    *springTestPackages,
    *databasePackages,
    *jUnitPackages,
    Package("com.squareup.retrofit2", "retrofit", "2.9.0"),
    Package("com.squareup.retrofit2", "converter-jackson", "2.9.0"),
    Package("com.squareup.retrofit2", "adapter-rxjava", "2.9.0"),
    Package("com.google.dagger", "dagger", "2.28"),
    Package("com.google.dagger", "dagger-compiler", "2.28"),
    Package("com.google.code.gson",  "gson",  "2.8.6")
)

val testPackages: Array<Package> = arrayOf(
    *jUnitPackages,
    *springTestPackages
)

dependencies {
    implementation(kotlin("stdlib-jdk8"))

    packages.forEach { `package` ->
        implementation(`package`.groupId, `package`.artifactId, `package`.version)
    }

    testPackages.forEach { testPackage ->
        testImplementation(testPackage.groupId, testPackage.artifactId, testPackage.version)
    }
}
