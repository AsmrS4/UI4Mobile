package com.example.mobileui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.remember
import androidx.compose.ui.draw.scale
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import java.time.format.TextStyle


class Variable{
    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    fun variableBlock(index:Int,viewMod:MainViewModel) {
        var inputData = remember { mutableStateOf("") }
        Row(
            modifier = Modifier
                .background(
                    color = Color(0xFF673AB7),
                    shape = RoundedCornerShape(12.dp),
                )
                .border(
                    width = 3.dp, color = Color.White,
                    shape = RoundedCornerShape(12.dp),
                )
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                modifier = Modifier.padding(end = 10.dp),
                text = "var",
                fontSize = 22.sp,
                color = Color.White,

                fontWeight = FontWeight.ExtraBold
            )
            Box(modifier = Modifier
                .widthIn(90.dp)
                .background(color = Color.White, shape = RoundedCornerShape(10.dp)),
                Alignment.Center
            ){
                BasicTextField(
                    modifier = Modifier
                        .width(100.dp)
                        .padding(6.dp),
                    value = inputData.value,
                    textStyle = androidx.compose.ui.text.TextStyle(fontSize = 20.sp),
                    onValueChange = { newText ->
                        inputData.value = newText },
                    singleLine = true
                )
            }
            var checked = remember{ mutableStateOf(false) }
            IconToggleButton( modifier = Modifier
                .padding(start = 5.dp)
                .size(20.dp),
                checked = checked.value,
                onCheckedChange = {checked.value = it} )
            {
                Icon( imageVector = Icons.Default.Clear,
                    contentDescription = "Clear",
                    tint = Color.White,
                    modifier = Modifier
                        .background(color = Color(0xFF945EF5), shape = CircleShape)
                )
                if(checked.value){
                    viewMod.addedBlocks.removeAt(index)
                }
            }
        }
    }
}

class Assign{
    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    fun assignBlock(index:Int,viewMod:MainViewModel) {
        var inputVar = remember { mutableStateOf("") }
        var inputData = remember { mutableStateOf("") }
        Row(
            modifier = Modifier
                .background(
                    color = Color(0xFFF44336),
                    shape = RoundedCornerShape(12.dp),
                )
                .border(
                    width = 3.dp, color = Color.White,
                    shape = RoundedCornerShape(12.dp),
                )
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            Box(modifier = Modifier
                .widthIn(100.dp)
                .background(color = Color.White, shape = RoundedCornerShape(10.dp)),
                Alignment.Center
            ){
                BasicTextField(
                    modifier = Modifier
                        .width(90.dp)
                        .padding(6.dp),
                    value = inputVar.value,
                    textStyle = androidx.compose.ui.text.TextStyle(fontSize = 20.sp),
                    onValueChange = { newText ->
                        inputVar.value = newText },
                    singleLine = true
                )
            }
            Text(
                modifier = Modifier.padding(start=10.dp, end=10.dp),
                text = "=",
                fontSize = 22.sp,
                color = Color.White,
                fontWeight = FontWeight.ExtraBold
            )
            Box(modifier = Modifier
                .widthIn(100.dp)
                .background(color = Color.White, shape = RoundedCornerShape(10.dp)),
                Alignment.Center
            ){
                BasicTextField(
                    modifier = Modifier
                        .width(90.dp)
                        .padding(6.dp),
                    value = inputData.value,
                    textStyle = androidx.compose.ui.text.TextStyle(fontSize = 20.sp),
                    onValueChange = { newText ->
                        inputData.value = newText },
                    singleLine = true
                )
            }
            var checked = remember{ mutableStateOf(false) }
            IconToggleButton( modifier = Modifier
                .padding(start = 5.dp)
                .size(20.dp),
                checked = checked.value,
                onCheckedChange = {checked.value = it} )
            {
                Icon( imageVector = Icons.Default.Clear,
                    contentDescription = "Clear",
                    tint = Color.White,
                    modifier = Modifier
                        .background(color = Color(0xFFFF5A4E), shape = CircleShape)
                )
                if(checked.value){
                    viewMod.addedBlocks.removeAt(index)
                }
            }
        }
    }
}

class Input{
    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    fun inputBlock(index:Int,viewMod:MainViewModel) {
        var inputData = remember { mutableStateOf("") }
        var isClicked:Boolean = false;
        Row(
            modifier = Modifier
                .background(
                    color = Color(0xFF3F51B5),
                    shape = RoundedCornerShape(12.dp),
                )
                .border(
                    width = 3.dp, color = Color.White,
                    shape = RoundedCornerShape(12.dp),
                )
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(end = 10.dp),
                text = "input",
                fontSize = 22.sp,
                color = Color.White,

                fontWeight = FontWeight.ExtraBold
            )
            Box(modifier = Modifier
                .widthIn(100.dp)
                .background(color = Color.White, shape = RoundedCornerShape(10.dp)),
                Alignment.Center
            ){
                BasicTextField(
                    modifier = Modifier
                        .width(90.dp)
                        .padding(6.dp),
                    value = inputData.value,
                    textStyle = androidx.compose.ui.text.TextStyle(fontSize = 20.sp),
                    onValueChange = { newText ->
                        inputData.value = newText
                    },
                    singleLine = true
                )
            }
            var checked = remember{ mutableStateOf(false) }
            IconToggleButton( modifier = Modifier
                .padding(start = 5.dp)
                .size(20.dp),
                checked = checked.value,
                onCheckedChange = {checked.value = it} )
            {
                Icon( imageVector = Icons.Default.Clear,
                    contentDescription = "Clear",
                    tint = Color.White,
                    modifier = Modifier
                        .background(color = Color(0xFF5A72F8), shape = CircleShape)
                )
                if(checked.value){
                    viewMod.addedBlocks.removeAt(index)
                }
            }
        }
    }
}

class Operation{
    var isClicked:Boolean=false
    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    fun operationBlock(index:Int,viewMod:MainViewModel) {
        var inputData = remember { mutableStateOf("") }
        var isClicked:Boolean = false;
        Row(
            modifier = Modifier
                .background(
                    color = Color(0xFF44AC48),
                    shape = RoundedCornerShape(12.dp),
                )
                .border(
                    width = 3.dp, color = Color.White,
                    shape = RoundedCornerShape(12.dp),
                )
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(end = 10.dp),
                text = "operation",
                fontSize = 22.sp,
                color = Color.White,

                fontWeight = FontWeight.ExtraBold
            )
            Box(modifier = Modifier
                .widthIn(80.dp)
                .background(color = Color.White, shape = RoundedCornerShape(10.dp)),
                Alignment.Center
            ){
                BasicTextField(
                    modifier = Modifier
                        .widthIn(60.dp)
                        .padding(6.dp),
                    value = inputData.value,
                    textStyle = androidx.compose.ui.text.TextStyle(fontSize = 20.sp),
                    onValueChange = { newText ->
                        inputData.value = newText
                    },
                    singleLine = true
                )
            }
            var checked = remember{ mutableStateOf(false) }
            IconToggleButton( modifier = Modifier
                .padding(start = 5.dp)
                .size(20.dp),
                checked = checked.value,
                onCheckedChange = {checked.value = it} )
            {
                Icon( imageVector = Icons.Default.Clear,
                    contentDescription = "Clear",
                    tint = Color.White,
                    modifier = Modifier
                        .background(color = Color(0xFF2A8B2E), shape = CircleShape)
                )
                if(checked.value){
                    viewMod.addedBlocks.removeAt(index)
                }
            }

        }
    }

}
class Print{
    var isClicked:Boolean=false
    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    fun printBlock(index:Int,viewMod:MainViewModel) {
        var inputData = remember { mutableStateOf("") }
        Row(
            modifier = Modifier
                .background(
                    color = Color(0xFF03A9F4),
                    shape = RoundedCornerShape(12.dp),
                )
                .border(
                    width = 3.dp, color = Color.White,
                    shape = RoundedCornerShape(12.dp),
                )
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.padding(end = 10.dp),
                text = "print",
                fontSize = 22.sp,
                color = Color.White,

                fontWeight = FontWeight.ExtraBold
            )
            Box(modifier = Modifier
                .widthIn(100.dp)
                .background(color = Color.White, shape = RoundedCornerShape(10.dp)),
                Alignment.Center
            ){
                BasicTextField(
                    modifier = Modifier
                        .width(90.dp)
                        .padding(6.dp),
                    value = inputData.value,
                    textStyle = androidx.compose.ui.text.TextStyle(fontSize = 20.sp),
                    onValueChange = { newText ->
                        inputData.value = newText
                    },
                    singleLine = true
                )
            }
            var checked = remember{ mutableStateOf(false) }
            IconToggleButton( modifier = Modifier
                .padding(start = 5.dp)
                .size(20.dp),
                checked = checked.value,
                onCheckedChange = {checked.value = it} )
            {
                Icon( imageVector = Icons.Default.Clear,
                    contentDescription = "Clear",
                    tint = Color.White,
                    modifier = Modifier
                        .background(color = Color(0xFF22BBFF), shape = CircleShape)
                )
                if(checked.value){
                    viewMod.addedBlocks.removeAt(index)
                }
            }
        }
    }
}

class ConditionBlock{
    var isClicked:Boolean=false
    var isInIf:Boolean = false
    var isInElse:Boolean = false
    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    fun conditionBlock(index:Int,viewMod:MainViewModel){
        var ifViewModel = MainViewModel()
        var elseViewModel = MainViewModel()
        var condition = remember { mutableStateOf("") }
        Column(
            modifier = Modifier
                .background(
                    color = Color(0xFFFF9800),
                    shape = RoundedCornerShape(12.dp),
                )
                .border(
                    width = 3.dp, color = Color.White,
                    shape = RoundedCornerShape(12.dp),
                )
                .padding(10.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                modifier = Modifier.padding(bottom = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    modifier = Modifier.padding(10.dp),
                    text = "If",
                    fontSize = 22.sp,
                    color = Color.White,

                    fontWeight = FontWeight.ExtraBold
                )
                Box(modifier = Modifier
                    .widthIn(80.dp)
                    .background(color = Color.White, shape = RoundedCornerShape(10.dp)),
                    Alignment.Center
                ){
                    BasicTextField(
                        modifier = Modifier
                            .widthIn(60.dp)
                            .padding(6.dp),
                        value = condition.value,
                        textStyle = androidx.compose.ui.text.TextStyle(fontSize = 20.sp),
                        onValueChange = { newText ->
                            condition.value = newText },
                        singleLine = true
                    )
                }
                var checked = remember{ mutableStateOf(false) }
                IconToggleButton( modifier = Modifier
                    .padding(start = 5.dp)
                    .size(20.dp),
                    checked = checked.value,
                    onCheckedChange = {checked.value = it} )
                {
                    Icon( imageVector = Icons.Default.Clear,
                        contentDescription = "Clear",
                        tint = Color.White,
                        modifier = Modifier
                            .background(color = Color(0xFFFFB240), shape = CircleShape)
                    )
                    if(checked.value){
                        isClicked=true
                    }
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                DropItem<BlockUiItem>(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .fillMaxHeight(0.8f)
                        .background(
                            color = Color(0xFFFFB240),
                            shape = RoundedCornerShape(10.dp)
                        ),
                ) {_, blockItem ->
                    if (blockItem != null) {
                        LaunchedEffect(key1 = blockItem) {
                            ifViewModel.addBlock(blockItem)
                        }
                    }
                    Column(
                        modifier = Modifier
                            .widthIn(180.dp)
                            .heightIn(60.dp),
                        horizontalAlignment = Alignment.Start

                    ) {
                        ifViewModel.addedBlocks.forEach{block ->
                            when (block.id) {
                                //"1" -> Variable().variableBlock()
                                //"2" -> Assign().assignBlock()
                                //"3" -> Operation().operationBlock()
                                //"4" -> Print().printBlock()
                            }
                            Spacer(modifier = Modifier.padding(bottom = 1.dp))
                        }
                    }
                }
            }
            Row(
                modifier = Modifier.padding(bottom = 10.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    modifier = Modifier.padding(start = 10.dp, top = 10.dp),
                    text = "Else",
                    fontSize = 22.sp,
                    color = Color.White,
                    fontWeight = FontWeight.ExtraBold
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                DropItem<BlockUiItem>(
                    modifier = Modifier
                        .fillMaxWidth(1f)
                        .fillMaxHeight(0.8f)
                        .background(
                            color = Color(0xFFFFB240),
                            shape = RoundedCornerShape(10.dp)
                        ),
                ) { _, blockItem ->
                    if (blockItem != null) {
                        LaunchedEffect(key1 = blockItem) {
                            elseViewModel.addBlock(blockItem)
                        }
                    }
                    Column(
                        modifier = Modifier
                            .widthIn(180.dp)
                            .heightIn(60.dp),
                        horizontalAlignment = Alignment.Start

                    ) {
                        elseViewModel.addedBlocks.forEach{ block ->
                            when (block.id) {
                                //"1" -> Variable().variableBlock()
                                //"2" -> Assign().assignBlock()
                                //"3" -> Operation().operationBlock()
                                //"4" -> Print().printBlock()
                            }
                            Spacer(modifier = Modifier.padding(bottom = 1.dp))
                        }
                    }
                }
            }
        }
    }
}
