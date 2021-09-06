package com.yudiz.composelist

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter


@Composable
fun MovieUI() {
    LazyColumn(
        contentPadding = PaddingValues(vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(items = moviesList) { item ->

            Column {

                MovieListItem(
                    item = item,
                    isExpanded = item.isExpanded.value,
                    onItemClicked = {
                        it.isExpanded.value = !it.isExpanded.value
                    }
                )
            }
        }
    }
}


@Composable
fun MovieListItem(
    item: Movies,
    isExpanded: Boolean,
    onItemClicked: (Movies) -> Unit
) {
    Column(
        modifier = Modifier.animateContentSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    onItemClicked.invoke(item)
                }

                .padding(horizontal = 12.dp),
        ) {
            Text(
                text = item.category,
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                fontWeight = FontWeight.Bold,
            )

            Box(contentAlignment = Alignment.CenterEnd) {
                val modifier = if (isExpanded) Modifier.rotate(180f) else Modifier
                Icon(
                    painter = painterResource(id = R.drawable.ic_down),
                    contentDescription = "Expand",
                    modifier = modifier.size(18.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(2.dp))

        if (isExpanded) {
            LazyRow(
                contentPadding = PaddingValues(12.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(items = item.listItem) { rowItem ->
                    Surface(
                        elevation = 8.dp,
                        shape = RoundedCornerShape(8.dp),
                        modifier = Modifier
                            .height(200.dp)
                            .width(160.dp)
                    ) {
                        Box {
                            Image(
                                painter = rememberImagePainter(data = rowItem.imageUrl),
                                contentDescription = null,
                                modifier = Modifier.size(200.dp),
                                contentScale = ContentScale.FillBounds
                            )

                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(
                                        Brush.verticalGradient(
                                            colors = listOf(
                                                Color.Transparent,
                                                Color.Black
                                            ),
                                            startY = 1f
                                        )
                                    )
                                    .padding(10.dp),
                                verticalArrangement = Arrangement.Bottom,
                                horizontalAlignment = Alignment.Start
                            ) {

                                Text(
                                    text = rowItem.name,
                                    style = TextStyle(
                                        fontSize = 16.sp
                                    ),
                                    maxLines = 2,
                                    color = Color.White,
                                    overflow = TextOverflow.Ellipsis,
                                    modifier = Modifier.padding(bottom = 4.dp)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}