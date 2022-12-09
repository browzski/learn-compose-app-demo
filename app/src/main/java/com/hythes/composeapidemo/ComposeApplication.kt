package com.hythes.composeapidemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.hythes.composeapidemo.ui.AppNavigation
import com.hythes.composeapidemo.ui.theme.ComposeApiDemoTheme

class ComposeApplication : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeApiDemoTheme {
                AppNavigation()
            }
        }
    }
}