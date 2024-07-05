package com.sd.demo.compose.text

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sd.demo.compose.text.theme.AppTheme
import com.sd.lib.compose.text.FOutlineText

class OutlineTextSample : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                ContentView()
            }
        }
    }
}

@Composable
private fun ContentView(
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        FOutlineText(
            text = "hello",
            fontSize = 20.sp,
            color = Color.White,
            outlineColor = Color.Red,
            outlineWidth = 2.dp,
            shadowBlurRadius = 1.dp,
        )
    }
}

@Preview
@Composable
private fun PreviewContentView() {
    ContentView()
}