import java.util.Base64

plugins {
  id("com.android.application")
}

providers.exec {
  commandLine("python3", rootProject.file("scripts/patch_041.py").absolutePath)
}.result.get().assertNormalExitValue()

providers.exec {
  commandLine("python3", rootProject.file("scripts/patch_042.py").absolutePath)
}.result.get().assertNormalExitValue()

providers.exec {
  commandLine("python3", rootProject.file("scripts/patch_043.py").absolutePath)
}.result.get().assertNormalExitValue()

providers.exec {
  commandLine("python3", rootProject.file("scripts/patch_043_streaming_fix.py").absolutePath)
}.result.get().assertNormalExitValue()

providers.exec {
  commandLine("python3", rootProject.file("scripts/patch_044.py").absolutePath)
}.result.get().assertNormalExitValue()

providers.exec {
  commandLine("python3", rootProject.file("scripts/patch_045.py").absolutePath)
}.result.get().assertNormalExitValue()

providers.exec {
  commandLine("python3", rootProject.file("scripts/patch_045_fix.py").absolutePath)
}.result.get().assertNormalExitValue()

providers.exec {
  commandLine("python3", rootProject.file("scripts/patch_046.py").absolutePath)
}.result.get().assertNormalExitValue()

providers.exec {
  commandLine("python3", rootProject.file("scripts/patch_047.py").absolutePath)
}.result.get().assertNormalExitValue()

val signingSource = rootProject.file("signing/boxlocal-dev.jks.b64")
val signingFile = layout.buildDirectory.file("persistent-signing/boxlocal-dev.jks").get().asFile
if (!signingFile.exists()) {
  signingFile.parentFile.mkdirs()
  signingFile.writeBytes(Base64.getMimeDecoder().decode(signingSource.readText()))
}

android {
  namespace = "com.boxlocal.music"
  compileSdk = 35

  defaultConfig {
    applicationId = "com.boxlocal.music"
    minSdk = 26
    targetSdk = 35
    versionCode = 12
    versionName = "0.4.7"
    ndk { abiFilters += setOf("arm64-v8a") }
  }

  signingConfigs {
    create("persistentSideload") {
      storeFile = signingFile
      storePassword = "boxlocaldev"
      keyAlias = "boxlocaldev"
      keyPassword = "boxlocaldev"
    }
  }

  buildTypes {
    getByName("debug") {
      signingConfig = signingConfigs.getByName("persistentSideload")
    }
    getByName("release") {
      signingConfig = signingConfigs.getByName("persistentSideload")
      isMinifyEnabled = false
      isShrinkResources = false
    }
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
  implementation("com.google.ai.edge.litert:litert:2.1.6")
  implementation("com.google.ai.edge.litert:litert-gpu:1.4.1")
}
