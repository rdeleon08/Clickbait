package com.example.clickbait

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.clickbait.data.DataSource.news
import com.example.clickbait.model.News
import com.example.clickbait.ui.theme.ClickbaitTheme
import javax.sql.DataSource

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClickbaitTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Clickbait()
                }
            }
        }
    }
}

@Preview
@Composable
fun Clickbait()
{
    LazyVerticalGrid(
        colums = GridCells.Fixed(2),
    ) {
        items(DataSource.news) {new ->
            NewsCard(news)

        }
    }
}
@Composable
fun NewsCard(news: News, modifier: Modifier = Modifier) {
    Card {
        Row {
            Image(
                painter = painterResource(id = news.image),
                contentDescription = null
            )
             Column {
                 Text (
                     text = stringResource(id = news.headline)
                 )
                 Row {
                     Icon(
                         painter = painterResource(id = R.drawable.travel),
                         contentDescription = null,
                     )
                     Text(
                         text = news.comapnyName.toString()
                     )
                 }

             }
        }
    }
}
@Preview
@Composable
fun NewsCardPreview() {
    ClickbaitTheme {

    }
}