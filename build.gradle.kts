plugins {
	java
	id("io.spring.dependency-management") version "1.1.4"
}

group = "com.inakihn"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

subprojects {
	repositories {
		mavenCentral()
	}

	apply {
		plugin("io.spring.dependency-management")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}