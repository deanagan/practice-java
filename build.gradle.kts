plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

repositories {
    mavenCentral()
}


tasks.test {
    useJUnitPlatform()
    testLogging {
		events("passed", "skipped", "failed")
		showStandardStreams = true // This has to come after events to work
	}
}

dependencies {
    // Use TestNG framework, also requires calling test.useTestNG() below
    //testImplementation("org.testng:testng:7.2.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.6.1")


    // This dependency is exported to consumers, that is to say found on their compile classpath.
    api("org.apache.commons:commons-math3:3.6.1")

    // This dependency is used internally, and not exposed to consumers on their own compile classpath.
    implementation("com.google.guava:guava:29.0-jre")
}


// This is for our github actions CI. See kotlin.yml
tasks.register("practicejava") {
	dependsOn("clean", "test")
    group = "practicejava"
    description = "$ ./gradlew practicejava"
}
