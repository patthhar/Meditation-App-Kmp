package me.darthwithap.kmp.meditation_app.domain.models

data class UserProgress(
    val totalMeditationTime: Int,
    val numberOfSessions: Int,
    val streaks: Streaks
)