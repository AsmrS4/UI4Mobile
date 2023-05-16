package com.example.mobileui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color.Companion.Blue


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun AssignBlock() {
    var inputVar = remember{ mutableStateOf("") }
    var inputData = remember{ mutableStateOf("") }

    Box(
        modifier = Modifier
            .background(
                color = Color(0xFFF44336),
                shape = RoundedCornerShape(12.dp),
            )
            .border(
                width = 3.dp, color = Color.White,
                shape = RoundedCornerShape(12.dp),
            )
            .padding(10.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {

            TextField(
                modifier = Modifier
                    .widthIn(50.dp),
                value = inputVar.value,
                shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.textFieldColors(
                    cursorColor = Color.LightGray,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                onValueChange = { newText -> inputVar.value = newText
                },
                singleLine = true
            )
            Text(
                modifier = Modifier.padding(10.dp),
                text = "=",
                fontSize = 22.sp,
                color = Color.White,

                fontWeight = FontWeight.ExtraBold
            )
            TextField(
                modifier = Modifier
                    .widthIn(50.dp),
                value = inputData.value,
                shape = RoundedCornerShape(8.dp),
                colors = TextFieldDefaults.textFieldColors(
                    cursorColor = Color.Black,
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent
                ),
                onValueChange = { newText -> inputData.value = newText
                },
                singleLine = true,
            )
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun inputBlock(){
    var inputData = remember{ mutableStateOf("") }
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
    ){
        Text(
            modifier = Modifier.padding(10.dp),
            text = "Input :",
            fontSize = 22.sp,
            color = Color.White,

            fontWeight = FontWeight.ExtraBold
        )
        TextField(
            modifier = Modifier
                .widthIn(50.dp),
            value = inputData.value,
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.textFieldColors(
                cursorColor = Color.LightGray,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            onValueChange = { newText -> inputData.value = newText
            },
            singleLine = true
        )
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun printBlock(){
    var inputData = remember{ mutableStateOf("") }
    Row(
        modifier = Modifier
            .background(
                color = Color(0xFF80C058),
                shape = RoundedCornerShape(12.dp),
            )
            .border(
                width = 3.dp, color = Color.White,
                shape = RoundedCornerShape(12.dp),
            )
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ){
        Text(
            modifier = Modifier.padding(10.dp),
            text = "Print :",
            fontSize = 22.sp,
            color = Color.White,

            fontWeight = FontWeight.ExtraBold
        )
        TextField(
            modifier = Modifier
                .widthIn(50.dp),
            value = inputData.value,
            shape = RoundedCornerShape(8.dp),
            colors = TextFieldDefaults.textFieldColors(
                cursorColor = Color.LightGray,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            onValueChange = { newText -> inputData.value = newText
            },
            singleLine = true
        )
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun ConditionBlock(){
    var condition = remember{ mutableStateOf("") }
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
    ){
        Row(
            modifier = Modifier.padding(bottom = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Text(
                modifier = Modifier.padding(10.dp),
                text = "If",
                fontSize = 22.sp,
                color = Color.White,

                fontWeight = FontWeight.ExtraBold
            )
            Box(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(30.dp)
                    )
            ){}
        }
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Box(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
            ){}
        }
        Row(
            modifier = Modifier.padding(bottom = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                modifier = Modifier.padding(10.dp),
                text = "else:",
                fontSize = 22.sp,
                color = Color.White,

                fontWeight = FontWeight.ExtraBold
            )
        }
        Row(verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Box(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp)
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(10.dp)
                    )
            ){}
        }

    }

}