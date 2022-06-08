package com.itsecurity.p1_ap2_darianna_20190261

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.itsecurity.p1_ap2_darianna_20190261.ui.theme.Parcial1Ap2.ConsultaParcial1Ap2Screen
import com.itsecurity.p1_ap2_darianna_20190261.ui.theme.Parcial1Ap2.RegistroParcial1Ap2Screen


import com.itsecurity.p1_ap2_darianna_20190261.ui.theme.RegistroParcial1Ap2ComposeTheme
import dagger.hilt.android.AndroidEntryPoint



var selectedOcupacion: String? = null

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RegistroParcial1Ap2ComposeTheme() {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyApp()
                }
            }
        }
    }
}

//TODO Implementar navegacion correspondiente
@Composable
fun MyApp() {
    val navHostController = rememberNavController()

    NavHost(navController = navHostController, startDestination = "ConsultaParcial1Ap2"){
        composable("ConsultaParcial1Ap2"){
            ConsultaParcial1Ap2Screen(navHostController = navHostController)
        }
        composable("RegistroParcial1Ap2"){
            RegistroParcial1Ap2Screen(navHostController = navHostController)
        }
    }
}








@Composable
fun RowPersona(nombre:String){
    Row() {
        Text(text = "El nombre es: $nombre")
    }
}

@Composable
fun RowOcupacion(ocupacion:String){
    Row() {
        Text(text = "El nombre de la Ocupación es: $ocupacion")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    RegistroParcial1Ap2ComposeTheme() {
        MyApp()
    }
}