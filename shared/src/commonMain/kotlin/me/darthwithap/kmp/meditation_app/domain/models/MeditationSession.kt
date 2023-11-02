package me.darthwithap.kmp.meditation_app.domain.models

data class MeditationSession(
    val id: String,
    val title: String,
    val durationInSeconds: Long,
    val description: String,
    val category: MeditationCategory,
    val audioUrl: String,
    val imageUrl: String,
    val breathingExercises: List<BreathingExercise>
)
