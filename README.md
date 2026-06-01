# Android Voice Assistant SDK

## Overview

Offline-first voice assistant with pluggable AI provider support

## Installation

Add the Maven dependency once artifacts are published:

~~~kotlin
dependencies {
  implementation("io.github.amitgaikwad2837:android-voice-assistant-sdk:1.0.0")
}
~~~

## Integration Example

~~~kotlin
import com.sdk.voice.VoiceAssistantSDK

class ExampleUsage {
    fun setup() {
        val sdk = VoiceAssistantSDK()
        // Configure and call SDK APIs here based on your app flow.
    }
}
~~~

## Feature Highlights

- wake-word-detection
- speech-to-text
- intent-recognition
- command-processing
- offline-mode
- multi-provider-ai

## Android Permissions

- RECORD_AUDIO
- INTERNET

## Development

~~~bash
./gradlew build
./gradlew test
~~~

## License

MIT
