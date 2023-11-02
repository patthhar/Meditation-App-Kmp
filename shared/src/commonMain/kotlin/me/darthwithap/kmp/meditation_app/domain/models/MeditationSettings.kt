package me.darthwithap.kmp.meditation_app.domain.models

data class MeditationSettings(
  val durationInSeconds: Long,
  val ambientSounds: List<String>,
  val guidedVoiceEnabled: Boolean = false
)