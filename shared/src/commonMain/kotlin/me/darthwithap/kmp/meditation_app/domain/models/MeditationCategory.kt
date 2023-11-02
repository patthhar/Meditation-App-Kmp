package me.darthwithap.kmp.meditation_app.domain.models

enum class MeditationCategory(val categoryName: String) {
  FOCUS("focus"),
  STUDY("study"),
  RELAX("relax"),
  ACTIVE("active"),
  STRESS_RELIEF("stress relief"),
  WAKE_UP("wake up"),
  SLEEP("sleep");

  companion object {
    fun byName(name: String): MeditationCategory {
      return MeditationCategory.entries.find { it.categoryName == name }
        ?: throw IllegalArgumentException("Invalid category name.")
    }
  }
}