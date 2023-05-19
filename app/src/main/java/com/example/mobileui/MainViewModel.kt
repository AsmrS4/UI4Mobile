package com.example.mobileui

import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var isCurrentlyDragging by mutableStateOf(false)
    var items by mutableStateOf(emptyList<BlockUiItem>())
    var addedBlocks = mutableStateListOf<BlockUiItem>()

    init {
        items = listOf(
            BlockUiItem("Variable", "1", Color(0xFF673AB7)),
            BlockUiItem("Assingment", "2", Color(0xFFF44336)),
            BlockUiItem("Operation", "3", Color(0xFF44AC48)),
            BlockUiItem("Print", "4", Color(0xFF03A9F4)),
            BlockUiItem("Conditions", "5", Color(0xFFFF9800)),
        )
    }

    fun startDragging() {
        isCurrentlyDragging = true
    }

    fun stopDragging() {
        isCurrentlyDragging = false
    }

    fun addBlock(blockUiItem: BlockUiItem) {
        println("Added Blocks")
        addedBlocks.add(blockUiItem)
    }

}
