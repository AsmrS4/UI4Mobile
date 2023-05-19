package com.example.mobileui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
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
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import java.time.format.TextStyle


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun variableBlock() {
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
            .widthIn(120.dp)
            .background(color = Color.White, shape = RoundedCornerShape(10.dp)),
            Alignment.Center
        ){
            BasicTextField(
                modifier = Modifier.widthIn(60.dp).padding(6.dp),
                value = inputData.value,
                textStyle = androidx.compose.ui.text.TextStyle(fontSize = 20.sp),
                onValueChange = { newText ->
                    inputData.value = newText },
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun assignBlock() {
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
            .background(color = Color.White, shape = RoundedCornerShape(10.dp)),
            Alignment.Center
        ){
            BasicTextField(
                modifier = Modifier.widthIn(60.dp).padding(6.dp),
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
            .background(color = Color.White, shape = RoundedCornerShape(10.dp)),
            Alignment.Center
        ){
            BasicTextField(
                modifier = Modifier.widthIn(60.dp).padding(6.dp),
                value = inputData.value,
                textStyle = androidx.compose.ui.text.TextStyle(fontSize = 20.sp),
                onValueChange = { newText ->
                    inputData.value = newText },
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun inputBlock() {
    var inputData = remember { mutableStateOf("") }
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
            .widthIn(80.dp)
            .background(color = Color.White, shape = RoundedCornerShape(10.dp)),
            Alignment.Center
        ){
            BasicTextField(
                modifier = Modifier.widthIn(60.dp).padding(6.dp),
                value = inputData.value,
                textStyle = androidx.compose.ui.text.TextStyle(fontSize = 20.sp),
                onValueChange = { newText ->
                    inputData.value = newText
                }, )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun operationBlock() {
    var inputData = remember { mutableStateOf("") }
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
                modifier = Modifier.widthIn(60.dp).padding(6.dp),
                value = inputData.value,
                textStyle = androidx.compose.ui.text.TextStyle(fontSize = 20.sp),
                onValueChange = { newText ->
                    inputData.value = newText
                }, )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun printBlock() {
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
            .widthIn(80.dp)
            .background(color = Color.White, shape = RoundedCornerShape(10.dp)),
            Alignment.Center
        ){
            BasicTextField(
                modifier = Modifier.widthIn(60.dp).padding(6.dp),
                value = inputData.value,
                textStyle = androidx.compose.ui.text.TextStyle(fontSize = 20.sp),
                onValueChange = { newText ->
                    inputData.value = newText
                }, )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun conditionBlock() {
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
                    modifier = Modifier.widthIn(60.dp).padding(6.dp),
                    value = condition.value,
                    textStyle = androidx.compose.ui.text.TextStyle(fontSize = 20.sp),
                    onValueChange = { newText ->
                        condition.value = newText },
                )
            }
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Box(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp)
                    .background(
                        color = Color(0xFFFDA728),
                        shape = RoundedCornerShape(10.dp)
                    )
            ) {}
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
            Box(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp)
                    .background(
                        color = Color(0xFFFDA728),
                        shape = RoundedCornerShape(10.dp)
                    )
            ) {}
        }

    }
}

@Composable
fun drawBlock(block:BlockUiItem){
    when (block.id) {
        "1" -> return variableBlock()
        "2" -> return assignBlock()
        "3" -> return operationBlock()
        "4" -> return printBlock()
        "5" -> return conditionBlock()
    }
}
