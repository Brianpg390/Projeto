package com.example.projeto.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

fun Image(imageVector: Int) {

}

@Composable
fun MyHome(
    modifier: Modifier = Modifier,
) {
    Box(){
    }
    Column {
        Button(
            onClick = {  },
            modifier
                .fillMaxWidth()
                .padding(20.dp),

        ) {
            Text(text = "Iniciar Corrida")
        }


        Row {
            Text(text = "Distância Percorrida")
        }


        Row {
            Text(text = "Percuso por GPS")
        }


        Row {
            Text(text = "Batimentos Cardíacos")
        }


        Row {
            Text(text = "Calorias Gastas")
        }


        Row {
            Text(text = "Evolução")
        }


    }
}

@Preview
@Composable
fun MyHomePreview() {
    MyHome()
}