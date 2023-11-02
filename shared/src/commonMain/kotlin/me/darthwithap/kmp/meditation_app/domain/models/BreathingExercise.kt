package me.darthwithap.kmp.meditation_app.domain.models

data class BreathingExercise(
    val name: String,
    val description: String,
    val durationInSeconds: Long,
    val inhaleDuration: Int,
    val exhaleDuration: Int,
    val holdDuration: Int
)
