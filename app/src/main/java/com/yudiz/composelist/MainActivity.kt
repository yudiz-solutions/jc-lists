package com.yudiz.composelist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yudiz.composelist.ui.theme.ComposeListTheme

// Utilizing Lists in Compose

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeListTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MovieUI()
                }
            }
        }
    }
}


@Composable
fun SimpleColumnList() {
    Column(
        modifier = Modifier.verticalScroll(rememberScrollState())
    ) {
        for (i in 1..10)
            ListItem(text = "Item $i", modifier = Modifier.padding(8.dp))
    }
}

@Composable
fun SimpleRowList() {
    Row(
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
    ) {
        for (i in 1..10)
            ListItem(text = "Item $i", modifier = Modifier.padding(8.dp))
    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ListColumn() {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(vertical = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        stickyHeader {
            Text(
                text = "Sticky Header",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(22.dp)
                    .background(Color.Gray),
                textAlign = TextAlign.Center
            )
        }

        item {
            ListItem(text = "First Item")
        }

        itemsIndexed(items = (1..10).toList()) { pos, _ ->
            ListItem("Item $pos")
        }

        item {
            ListItem(text = "Last Item")
        }

    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ListRow() {
    LazyRow(
        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.Top
    ) {

        item {
            ListItem(text = "First Item")
        }

        itemsIndexed(items = (1..10).toList()) { pos, _ ->
            ListItem("Item $pos")
        }

        item {
            ListItem(text = "Last Item")
        }

    }
}


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun LazyGrid() {
    LazyVerticalGrid(
        cells = GridCells.Adaptive(120.dp),
    ) {

        item {
            ListItem(text = "First Item", Modifier.padding(8.dp))
        }

        itemsIndexed(items = (1..30).toList()) { index, _ ->
            ListItem(text = "Item $index", Modifier.padding(8.dp))
        }

        item {
            ListItem(text = "Last Item", Modifier.padding(8.dp))
        }
    }
}

@Composable
fun ListItem(text: String, modifier: Modifier = Modifier) {
    Surface(
        elevation = 8.dp,
        shape = RoundedCornerShape(8.dp),
        modifier = modifier
            .size(150.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = text,
                fontSize = 24.sp
            )
        }
    }
}

@Preview(showBackground = true, device = Devices.PIXEL_4_XL)
@Composable
fun DefaultPreview() {
    ComposeListTheme {
        ListRow()
    }
}