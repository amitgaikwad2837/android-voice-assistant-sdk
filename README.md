# Android Voice Assistant SDK

## 📦 Registry & Repository

- **Maven Central**: [io.github.amitgaikwad2837:android-voice-assistant-sdk](https://central.sonatype.com/artifact/io.github.amitgaikwad2837/android-voice-assistant-sdk)
- **GitHub**: [amitgaikwad2837/android-voice-assistant-sdk](https://github.com/amitgaikwad2837/android-voice-assistant-sdk)

## Overview

Accessible voice-based interface for elderly and disabled users. Provides voice commands, audio feedback, natural language processing, and offline support for hands-free app interaction.

## Installation

Add the Maven dependency:

~~~kotlin
dependencies {
  implementation("io.github.amitgaikwad2837:android-voice-assistant-sdk:0.0.9")
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
