package com.example.puppy.ListtofItems

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.puppy.data.Puppy

@Composable
fun PuppyListItem(puppy: Puppy) {
    Card(modifier = Modifier
        .padding(horizontal = 8.dp, vertical = 8.dp)
        .fillMaxWidth(),
        elevation = 2.dp,
        backgroundColor = Color.White,
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        Row(horizontalArrangement = Arrangement.Center,verticalAlignment = Alignment.CenterVertically) {
            PuppyImage(puppy = puppy)
            Spacer(modifier = Modifier.padding(10.dp))
            Column(modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .align(Alignment.CenterVertically)) {
                Text(text = puppy.title,style = TextStyle(fontSize = 26.sp))
                Text(text = "View Detail",style = TextStyle(fontSize = 18.sp))
            }
        }
    }
}

@Composable
private fun PuppyImage(puppy:Puppy) {
    Image(
        painter = painterResource(id = puppy.puppyImageId),
        contentDescription = null,
        modifier = Modifier.size(84.dp).clip(RoundedCornerShape(corner = CornerSize(50.dp)))
    )
}
