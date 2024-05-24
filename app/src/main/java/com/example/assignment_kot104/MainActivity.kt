package com.example.assignment_kot104

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.example.assignment_kot104.ui.theme.Assignment_KOT104Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//          GetLayoutSplash()
//            GetLayoutLogin()
//            GetLayoutSignUp()
            GetLayoutHome()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GetLayoutSplash(){
    Box(
        modifier = Modifier.fillMaxSize(),
    ) {
        // Background image
        Image(
            painter = painterResource(id = R.drawable.bgr),
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(top = 80.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
                Text(text = "MAKE YOUR",fontSize = 30.sp,modifier = Modifier.padding(end= 180.dp,bottom = 10.dp),color = Color("#606060".toColorInt()),fontStyle = FontStyle.Italic)
                Text(text = "HOME BEAUTIFUL", fontSize = 40.sp,modifier = Modifier.padding(end= 20.dp),color = Color.Black,fontStyle = FontStyle.Italic)
            Text(
                text = "The best simple place where you discover most wonderful furnitures and make your home beautiful",
                fontSize = 20.sp,
                color = Color("#808080".toColorInt()),
                modifier = Modifier.padding(40.dp)
            )
            Button(onClick = {

            },
                modifier = Modifier.padding(top = 130.dp),
                shape = RoundedCornerShape(8.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)) {
                Text(text = "Get Started", fontSize = 20.sp, modifier = Modifier.padding(8.dp))
            }
        }
    }
}