package com.example.mobileui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(
    mainViewModel: MainViewModel,
) {
    val screenWidth = LocalConfiguration.current.screenWidthDp
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        DropItem<BlockUiItem>(
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight(0.8f),

            ) { _, blockItem ->
            if (blockItem != null) {
                LaunchedEffect(key1 = blockItem) {
                    mainViewModel.addBlock(blockItem)
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black.copy(0.5f), RoundedCornerShape(10.dp))
                    .border(1.dp, color = Color.White, shape = RoundedCornerShape(10.dp))
                    .padding(20.dp)
                    .verticalScroll(rememberScrollState())
                    .horizontalScroll(rememberScrollState()),
                    horizontalAlignment = Alignment.Start

                ) {
                    mainViewModel.addedBlocks.forEach { block ->
                        drawBlock(block)
                        Spacer(modifier = Modifier.padding(bottom = 1.dp))
                    }
            }
        }

        DropDown(
            text = "blocks container",
            modifier = Modifier.padding(15.dp)
        ) {

            Row(//поле с блоками
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(rememberScrollState()),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                mainViewModel.items.forEach { block ->
                    DragTarget(
                        dataToDrop = block,
                        viewModel = mainViewModel
                    ) {
                        Column(
                            modifier = Modifier
                                .widthIn(100.dp)
                                .height(50.dp)
                                .clip(RoundedCornerShape(15.dp))
                                .shadow(5.dp, RoundedCornerShape(15.dp))
                                .background(block.backgroundColor, RoundedCornerShape(15.dp)),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                modifier = Modifier.padding(10.dp),
                                text = block.name,
                                color = Color.White,
                                fontWeight = FontWeight.SemiBold,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    Spacer(modifier = Modifier.padding(start = 5.dp, end = 5.dp))
                }
            }
        }
    }
}