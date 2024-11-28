package com.example.todocompose.data.model

import androidx.compose.ui.graphics.Color
import com.example.todocompose.ui.theme.*

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}