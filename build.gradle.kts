buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.22")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

subprojects {
    configurations.configureEach {
        resolutionStrategy {
            force("androidx.transition:transition:1.5.0")
            force("androidx.viewpager2:viewpager2:1.1.0")
        }
    }
}
