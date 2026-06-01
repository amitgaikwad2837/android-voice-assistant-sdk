package com.sdk.voice

import org.junit.Test
import kotlin.test.assertEquals

class VoiceAssistantSDKTest {
    @Test
    fun testVoiceAssistantConfig() {
        val config = VoiceAssistantConfig(
            enableWakeWord = true,
            wakeWord = "Hello Assistant",
            language = "en-US"
        )
        
        assertEquals("Hello Assistant", config.wakeWord)
        assertEquals("en-US", config.language)
    }

    @Test
    fun testCommandResult() {
        val result = CommandResult(
            id = "cmd-123",
            transcript = "turn on the lights",
            intent = "turn_on",
            confidence = 0.95f,
            params = mapOf("device" to "lights")
        )
        
        assertEquals("cmd-123", result.id)
        assertEquals("turn_on", result.intent)
        assertEquals("lights", result.params["device"])
    }

    @Test
    fun testAssistantEvent() {
        val event = AssistantEvent(
            id = "event-123",
            timestamp = System.currentTimeMillis(),
            type = AssistantEventType.COMMAND_RECOGNIZED
        )
        
        assertEquals(AssistantEventType.COMMAND_RECOGNIZED, event.type)
    }

    @Test
    fun testVoiceAssistantConfigDefaults() {
        val config = VoiceAssistantConfig()
        assertEquals(true, config.enableWakeWord)
        assertEquals("Hey Assistant", config.wakeWord)
        assertEquals(true, config.enableOfflineMode)
        assertEquals("en-US", config.language)
    }

    @Test
    fun testCommandResultCreation() {
        val result = CommandResult(
            id = "cmd-456",
            transcript = "set reminder for tomorrow",
            intent = "set_reminder",
            confidence = 0.98f,
            params = mapOf("time" to "tomorrow"),
            response = "Reminder set"
        )
        
        assertEquals("cmd-456", result.id)
        assertEquals("set_reminder", result.intent)
        assertEquals("tomorrow", result.params["time"])
    }

    @Test
    fun testAssistantEventTypes() {
        assertEquals(6, AssistantEventType.values().size)
        assertTrue(AssistantEventType.values().contains(AssistantEventType.LISTENING_STARTED))
        assertTrue(AssistantEventType.values().contains(AssistantEventType.WAKE_WORD_DETECTED))
    }

    @Test
    fun testCommandResultConfidence() {
        val result = CommandResult(
            id = "cmd-789",
            transcript = "play music",
            intent = "play_music",
            confidence = 0.87f
        )
        
        assertTrue(result.confidence in 0f..1f)
        assertTrue(result.confidence >= 0.8f)
    }

    @Test
    fun testCommandResultEmptyParams() {
        val result = CommandResult(
            id = "cmd-000",
            transcript = "hello",
            intent = "greet",
            confidence = 0.95f
        )
        
        assertEquals(true, result.params.isEmpty())
    }
}
