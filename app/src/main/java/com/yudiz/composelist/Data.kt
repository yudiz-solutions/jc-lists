package com.yudiz.composelist

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf


data class Movies(
    val id: Int,
    val category: String,
    val listItem: List<ListItem>,
    var isExpanded : MutableState<Boolean> = mutableStateOf(true)
) {
    data class ListItem(
        val id: Long,
        val name: String,
        val imageUrl: String,
    )
}

/***
 * Static data
 */

val latestMovie = listOf(
    Movies.ListItem(
        id = 1L,
        name = "The Suicide Squad",
        imageUrl = "https://m.media-amazon.com/images/M/MV5BNGM3YzdlOWYtNjViZS00MTE2LWE1MWUtZmE2ZTcxZjcyMmU3XkEyXkFqcGdeQXVyODEyMTI1MjA@._V1_.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "Fast & Furious 9",
        imageUrl = "https://m.media-amazon.com/images/M/MV5BMjI0NmFkYzEtNzU2YS00NTg5LWIwYmMtNmQ1MTU0OGJjOTMxXkEyXkFqcGdeQXVyMjMxOTE0ODA@._V1_.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "Black Widow",
        imageUrl = "https://i.pinimg.com/736x/22/41/9a/22419a1fbcfd03100d9dc6b28d8e1a3a.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "The Tomorrow War",
        imageUrl = "https://m.media-amazon.com/images/M/MV5BNTI2YTI0MWEtNGQ4OS00ODIzLWE1MWEtZGJiN2E3ZmM1OWI1XkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_FMjpg_UX1000_.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "The Suicide Squad",
        imageUrl = "https://m.media-amazon.com/images/M/MV5BNGM3YzdlOWYtNjViZS00MTE2LWE1MWUtZmE2ZTcxZjcyMmU3XkEyXkFqcGdeQXVyODEyMTI1MjA@._V1_.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "Fast & Furious 9",
        imageUrl = "https://m.media-amazon.com/images/M/MV5BMjI0NmFkYzEtNzU2YS00NTg5LWIwYmMtNmQ1MTU0OGJjOTMxXkEyXkFqcGdeQXVyMjMxOTE0ODA@._V1_.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "Black Widow",
        imageUrl = "https://i.pinimg.com/736x/22/41/9a/22419a1fbcfd03100d9dc6b28d8e1a3a.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "The Tomorrow War",
        imageUrl = "https://m.media-amazon.com/images/M/MV5BNTI2YTI0MWEtNGQ4OS00ODIzLWE1MWEtZGJiN2E3ZmM1OWI1XkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_FMjpg_UX1000_.jpg",

        )
)


val recommendationMovie = listOf(
    Movies.ListItem(
        id = 1L,
        name = "The Suicide Squad",
        imageUrl = "https://m.media-amazon.com/images/M/MV5BNGM3YzdlOWYtNjViZS00MTE2LWE1MWUtZmE2ZTcxZjcyMmU3XkEyXkFqcGdeQXVyODEyMTI1MjA@._V1_.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "Fast & Furious 9",
        imageUrl = "https://m.media-amazon.com/images/M/MV5BMjI0NmFkYzEtNzU2YS00NTg5LWIwYmMtNmQ1MTU0OGJjOTMxXkEyXkFqcGdeQXVyMjMxOTE0ODA@._V1_.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "Black Widow",
        imageUrl = "https://i.pinimg.com/736x/22/41/9a/22419a1fbcfd03100d9dc6b28d8e1a3a.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "The Tomorrow War",
        imageUrl = "https://m.media-amazon.com/images/M/MV5BNTI2YTI0MWEtNGQ4OS00ODIzLWE1MWEtZGJiN2E3ZmM1OWI1XkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_FMjpg_UX1000_.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "The Suicide Squad",
        imageUrl = "https://m.media-amazon.com/images/M/MV5BNGM3YzdlOWYtNjViZS00MTE2LWE1MWUtZmE2ZTcxZjcyMmU3XkEyXkFqcGdeQXVyODEyMTI1MjA@._V1_.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "Fast & Furious 9",
        imageUrl = "https://m.media-amazon.com/images/M/MV5BMjI0NmFkYzEtNzU2YS00NTg5LWIwYmMtNmQ1MTU0OGJjOTMxXkEyXkFqcGdeQXVyMjMxOTE0ODA@._V1_.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "Black Widow",
        imageUrl = "https://i.pinimg.com/736x/22/41/9a/22419a1fbcfd03100d9dc6b28d8e1a3a.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "The Tomorrow War",
        imageUrl = "https://m.media-amazon.com/images/M/MV5BNTI2YTI0MWEtNGQ4OS00ODIzLWE1MWEtZGJiN2E3ZmM1OWI1XkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_FMjpg_UX1000_.jpg",

        )
)

val watchedMovie = listOf(
    Movies.ListItem(
        id = 1L,
        name = "The Suicide Squad",
        imageUrl = "https://m.media-amazon.com/images/M/MV5BNGM3YzdlOWYtNjViZS00MTE2LWE1MWUtZmE2ZTcxZjcyMmU3XkEyXkFqcGdeQXVyODEyMTI1MjA@._V1_.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "Fast & Furious 9",
        imageUrl = "https://m.media-amazon.com/images/M/MV5BMjI0NmFkYzEtNzU2YS00NTg5LWIwYmMtNmQ1MTU0OGJjOTMxXkEyXkFqcGdeQXVyMjMxOTE0ODA@._V1_.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "Black Widow",
        imageUrl = "https://i.pinimg.com/736x/22/41/9a/22419a1fbcfd03100d9dc6b28d8e1a3a.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "The Tomorrow War",
        imageUrl = "https://m.media-amazon.com/images/M/MV5BNTI2YTI0MWEtNGQ4OS00ODIzLWE1MWEtZGJiN2E3ZmM1OWI1XkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_FMjpg_UX1000_.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "The Suicide Squad",
        imageUrl = "https://m.media-amazon.com/images/M/MV5BNGM3YzdlOWYtNjViZS00MTE2LWE1MWUtZmE2ZTcxZjcyMmU3XkEyXkFqcGdeQXVyODEyMTI1MjA@._V1_.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "Fast & Furious 9",
        imageUrl = "https://m.media-amazon.com/images/M/MV5BMjI0NmFkYzEtNzU2YS00NTg5LWIwYmMtNmQ1MTU0OGJjOTMxXkEyXkFqcGdeQXVyMjMxOTE0ODA@._V1_.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "Black Widow",
        imageUrl = "https://i.pinimg.com/736x/22/41/9a/22419a1fbcfd03100d9dc6b28d8e1a3a.jpg",
    ),
    Movies.ListItem(
        id = 1L,
        name = "The Tomorrow War",
        imageUrl = "https://m.media-amazon.com/images/M/MV5BNTI2YTI0MWEtNGQ4OS00ODIzLWE1MWEtZGJiN2E3ZmM1OWI1XkEyXkFqcGdeQXVyODk4OTc3MTY@._V1_FMjpg_UX1000_.jpg",

        )
)


val moviesList = listOf(
    Movies(
        1,
        "Latest Release",
        latestMovie
    ),
    Movies(
        2,
        "Recommendation",
        recommendationMovie
    ),
    Movies(
        3,
        "Watched",
        watchedMovie
    ),
    Movies(
        4,
        "Latest Release",
        latestMovie
    ),
    Movies(
        5,
        "Recommendation",
        recommendationMovie
    ),
    Movies(
        6,
        "Watched",
        watchedMovie
    ),
    Movies(
        7,
        "Latest Release",
        latestMovie
    ),
    Movies(
        8,
        "Recommendation",
        recommendationMovie
    ),
    Movies(
        9,
        "Watched",
        watchedMovie
    )
)


