package com.metinemre.flowcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.metinemre.flowcompose.ui.theme.FlowComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            FlowComposeTheme {
                val viewModel: myViewModel by viewModels()
                val counter = viewModel.countDownTimerFlow.collectAsState(initial = 10)

                Surface(color = MaterialTheme.colors.background) {
                    Box(modifier = Modifier.fillMaxSize()) {
                        Text(
                            text = counter.value.toString(),
                            fontSize = 24.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.align(Alignment.Center)

                        )
                    }
                }
            }
        }
    }
}

