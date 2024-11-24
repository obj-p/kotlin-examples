package com.compose.examples

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun ExamplePreview() {
    Text("Hello, Preview!", modifier = Modifier.padding(top = 8.dp, start = 5.dp))
}
