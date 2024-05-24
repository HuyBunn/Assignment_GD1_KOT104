package com.example.assignment_kot104

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun GetLayoutSignUp() {
    var fullname by remember { mutableStateOf("") }
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White) // Đặt màu nền cho toàn bộ màn hình
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
                text = "WELCOME",
                fontSize = 30.sp,
                modifier = Modifier.padding(top = 30.dp, end = 20.dp, bottom = 30.dp),
                color = Color.Black,
                fontStyle = FontStyle.Italic
            )
            Spacer(modifier = Modifier.height(16.dp))

            // Fullname TextField
            Text(text = "Fullname")
            TextField(
                value = fullname,
                onValueChange = { fullname = it },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent
                )
            )
            Spacer(modifier = Modifier.height(30.dp))

            // Username TextField
            Text(text = "Username")
            TextField(
                value = username,
                onValueChange = { username = it },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent
                )
            )
            Spacer(modifier = Modifier.height(30.dp))

            // Password TextField
            Text(text = "Password")
            TextField(
                value = password,
                onValueChange = { password = it },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent
                )
            )
            Spacer(modifier = Modifier.height(30.dp))

            // Confirm Password TextField
            Text(text = "Confirm Password")
            TextField(
                value = confirmPassword,
                onValueChange = { confirmPassword = it },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent
                )
            )
            Spacer(modifier = Modifier.height(16.dp))

            // Sign Up Button
            Button(
                onClick = {
                    // Xử lý đăng ký
                },
                modifier = Modifier
                    .padding(vertical = 40.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
            ) {
                Text(text = "Sign up", fontSize = 20.sp, modifier = Modifier.padding(8.dp))
            }

            Row(
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(
                    text = "Already have an account?",
                    color = Color("#808080".toColorInt())
                )
                Text(text = " SIGN UP", fontWeight = FontWeight.Bold)
            }
        }
    }
}
