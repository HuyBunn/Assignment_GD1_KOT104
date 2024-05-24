package com.example.assignment_kot104

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun GetLayoutLogin() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 30.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(top = 40.dp)
                    .align(Alignment.CenterHorizontally)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.line),
                    contentDescription = "Đường kẻ",
                    modifier = Modifier
                        .width(120.dp)
                        .height(70.dp)
                        .padding(end = 16.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.ic_logo),
                    contentDescription = "Logo",
                    modifier = Modifier
                        .width(70.dp)
                        .height(70.dp)
                )
                Image(
                    painter = painterResource(id = R.drawable.line),
                    contentDescription = "Đường kẻ",
                    modifier = Modifier
                        .width(120.dp)
                        .height(70.dp)
                        .padding(start = 16.dp)
                )
            }
            Text(
                text = "Hello !",
                fontSize = 30.sp,
                modifier = Modifier.padding(bottom = 10.dp,top = 30.dp),
                color = Color(0xFF606060),
                fontStyle = FontStyle.Italic
            )
            Text(
                text = "WELCOME BACK",
                fontSize = 30.sp,
                modifier = Modifier.padding(end = 20.dp, bottom = 50.dp),
                color = Color.Black,
                fontStyle = FontStyle.Italic
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Username")
            TextField(
                value = username,
                onValueChange = { username = it },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.White // Thay đổi màu nền ở đây
                )
            )
            Spacer(modifier = Modifier.height(30.dp))
            Text(text = "Password")
            TextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent // Thay đổi màu nền ở đây
                )
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "Forgot Password",
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(top = 30.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Button(
                onClick = {
                    // Xử lý đăng nhập
                },
                modifier = Modifier
                    .padding(vertical = 40.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
            ) {
                Text(text = "Log in", fontSize = 20.sp, modifier = Modifier.padding(8.dp))
            }
            Text(
                text = "SIGN UP",
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}
