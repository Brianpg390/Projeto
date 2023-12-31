package com.example.projeto.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.MailOutline
import androidx.compose.material.icons.rounded.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.projeto.ui.theme.ProjetoTheme

@Composable
fun MyBottomBar(
    modifier: Modifier = Modifier
) {
    BottomAppBar(
        containerColor = Color(0xFF1BB900),
        contentColor = Color(0xFF313430),
        content = {
            Row(
                modifier = modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically,
            ) {
                IconButton(
                    onClick = {},
                    content = {
                        Icon(
                            modifier = modifier.size(40.dp),
                            imageVector = Icons.Rounded.Home,
                            contentDescription = "Página inicial"
                        )
                    }

                )//IconButton
                IconButton(
                    onClick = {},
                    content = {
                        Icon(
                            modifier = modifier.size(40.dp),
                            imageVector = Icons.Rounded.MailOutline,
                            contentDescription = "Enviar mensagem"
                        )
                    }
                )//IconButton

                Spacer(modifier = modifier.width(170.dp))

                IconButton(
                    modifier = modifier.size(150.dp),
                    onClick = {},
                    content = {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Icon(
                                imageVector = Icons.Rounded.Settings,
                                contentDescription = "Configurações"
                            )
                            Text(text = "Configurações")
                        }
                    }
                )//IconButton
            }//Row
        }
    )
}

//////////////////////
@Preview
@Composable
fun BottomBarPreview() {
    ProjetoTheme {
        MyBottomBar()
    }
}