package com.example.googlescreens.screens.inbox

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.googlescreens.R

@Composable
fun InboxScreen() {
  Column(
      modifier = Modifier
          .fillMaxSize()
          .background(colorResource(id = R.color.white))
          .wrapContentSize(Alignment.Center)
  ) {
    Text(
        text = "Inbox Screen",
        fontWeight = FontWeight.Bold,
        color = Color.Black,
        modifier = Modifier.align(Alignment.CenterHorizontally),
        textAlign = TextAlign.Center,
        fontSize = 25.sp
    )
    Text(
        text = "Not yet Implemented",
        fontWeight = FontWeight.Bold,
        color = Color.Black,
        modifier = Modifier.align(Alignment.CenterHorizontally),
        textAlign = TextAlign.Center,
        fontSize = 25.sp
    )
  }
}