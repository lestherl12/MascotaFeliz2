package com.example.mascotafelizpart2

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip

import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


import com.example.mascotafelizpart2.ui.theme.Mascotafelizpart2Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Mascotafelizpart2Theme(true) {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    Elementos()
                }
            }
        }
    }
}

@Composable
fun Elementos(){
    val mContext = LocalContext.current
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Box(
            modifier =  Modifier
                .clip(shape = MaterialTheme.shapes.small)
                .background(MaterialTheme.colorScheme.secondary)
                .border(4.dp, MaterialTheme.colorScheme.primary)
        ){
            Image(painter = painterResource(id = R.drawable.perriton),
                contentDescription = "Mascota Feliz",
                modifier = Modifier
                    .padding((20.dp))
            )
        }

        Text("Mascota Feliz",
            color = MaterialTheme.colorScheme.secondaryContainer,
            style = MaterialTheme.typography.titleLarge
        )
        Text("Bienvenido, usuario",
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.titleMedium
        )
        Row{
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(text = "Tu mascota",
                    color = MaterialTheme.colorScheme.secondaryContainer,
                    style = MaterialTheme.typography.titleMedium
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            OutlinedButton(
                onClick = {
                    mContext.startActivity(Intent(mContext, ListActivity::class.java))
                }
            ) {
                Text(text = "Contenidos",
                    color = MaterialTheme.colorScheme.secondaryContainer,
                    style = MaterialTheme.typography.titleMedium
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ElemetosPreview(){
    Mascotafelizpart2Theme(true) {
        Elementos()
    }
}

@Preview(showBackground = true)
@Composable
fun ElementosPreview(){
    Mascotafelizpart2Theme {
        Elementos()
    }
}