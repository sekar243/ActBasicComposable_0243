package com.example.pertemuan3

import android.graphics.fonts.FontFamily
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin(modifier: Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
    ){
        //background
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 45.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            //Judul Login
            Text(
                text = "Login",
                fontSize = 32.sp,
                color = Color.DarkGray,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Ini adalah halaman login",
                fontSize = 16.sp,
                color = Color.White
            )
            Spacer(modifier = Modifier.height(50.dp))

            //Logo
            Image(
                painter = painterResource(id = R.drawable.umy),
                contentDescription = null,
                modifier = Modifier
                    .size(130.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(45.dp))
            //Nama
            Text(
                text = "Nama",
                fontSize = 18.sp,
                color = Color.DarkGray,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Sekar Kinasih",
                fontSize = 18.sp,
                color = Color.LightGray,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "20240140243",
                fontSize = 26.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(20.dp))
            //Foto bawah
            Image(
                painter = painterResource(id = R.drawable.peri),
                contentDescription = null,
                modifier = Modifier
                    .size(350.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }
    }
}