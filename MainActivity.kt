package com.example.projeto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.projeto.composables.MyBottomBar
import com.example.projeto.composables.MyHome
import com.example.projeto.composables.MyTopBar
import com.example.projeto.ui.theme.ProjetoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProjetoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(Text(text = ""))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: Unit, modifier: Modifier = Modifier,) {
    Text(
        text = "Com cada passo,você se aproxima " +
                "do seu melhor. Continue correndo, " +
                "supere seus limites e alcance a linha" +
                "de chegada da sua jornada pessoal. " +
                "O caminho pode ser desafiador, mas " +
                "a gratificação é imensa. Você é mais " +
                "forte do que imagina.",
        modifier = modifier

    )
}
@Preview(showBackground = true)
@Composable
fun MyTopBarPreview() {
    ProjetoTheme {
        MyTopBar()

    }
}
@Preview(showBackground = true)
@Composable
fun MyHomePreview() {
   MyHome()
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    Greeting(Text(text = ""))
}

@Preview(showBackground = true)
@Composable
fun MyBottomBarPreview() {
    ProjetoTheme {
        MyBottomBar()

    }
}
