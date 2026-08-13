plugins {
  id("com.android.application")
}

android {
  namespace = "com.boxlocal.music"
  compileSdk = 35

  defaultConfig {
    applicationId = "com.boxlocal.music"
    minSdk = 26
    targetSdk = 35
    versionCode = 5
    versionName = "0.4.0"
    ndk { abiFilters += setOf("arm64-v8a") }
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }

  packaging {
    jniLibs {
      pickFirsts += setOf("**/libc++_shared.so", "**/libtensorflowlite_jni.so", "**/libtensorflowlite_gpu_jni.so")
    }
  }
}

dependencies {
  implementation("com.google.ai.edge.litert:litert:2.1.5")
}
