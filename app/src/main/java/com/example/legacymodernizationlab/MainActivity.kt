package com.example.legacymodernizationlab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.viewinterop.AndroidView
import android.view.LayoutInflater
import android.widget.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.legacymodernizationlab.ui.theme.LegacyModernizationLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LegacyModernizationLabTheme {
                LegacyProfileScreen()

            }
        }
    }
}

@Composable
fun LegacyProfileScreen() {
    var greeting by remember {
        mutableStateOf("This screen was built with XML.")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Text(
            text = "Legacy Profile",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = greeting,
            fontSize = 16.sp,
            modifier = Modifier.padding(top = 12.dp)
        )

        Button(
            onClick = {
                greeting = "Hello! This screen now uses Compose."
            },
            modifier = Modifier.padding(top = 20.dp)
        ) {
            Text("Say Hello")
        }
    }
}

