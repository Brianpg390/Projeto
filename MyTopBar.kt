package com.example.projeto.composables

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.projeto.ui.theme.ProjetoTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopBar(
    modifier: Modifier = Modifier
) {
    MediumTopAppBar(
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Color(0xFF1BB900),
            titleContentColor = Color(0xFFFFFFFF),
            navigationIconContentColor = Color(0xFFFFFFFF),
            actionIconContentColor = Color(0xFFFFFFFF)
        ),
        title = { Text(text = "Aplicativo") },
        navigationIcon = {
            IconButton(
                onClick = {},
                content = {
                    Icon(
                        imageVector = Icons.Rounded.Search,
                        contentDescription = "Pesquisar"

                    )
                }
            )
        },

                    )
                }

/////////////////////////////
@Preview
@Composable
fun TopBarPreview() {
    ProjetoTheme {
        MyTopBar()
    }
}