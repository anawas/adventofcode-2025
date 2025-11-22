plugins {
    id("java")
}

group = "aoc25.anawas"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/org.json/json
    implementation("org.json:json:20250517")}

sourceSets {
    main {
        java.srcDirs("src")
    }
}

tasks.test {
    useJUnitPlatform()
}

tasks {
    wrapper {
        gradleVersion = "8.11.1"
    }
}

