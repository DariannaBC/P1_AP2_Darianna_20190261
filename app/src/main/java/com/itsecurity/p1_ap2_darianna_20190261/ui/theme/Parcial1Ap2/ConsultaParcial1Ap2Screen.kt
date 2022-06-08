package com.itsecurity.p1_ap2_darianna_20190261.ui.theme.Parcial1Ap2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.itsecurity.p1_ap2_darianna_20190261.ui.theme.Parcial1Ap2.Parcial1Ap2ViewModel


//TODO Realizar ventana de la consulta de la clase correspondiente

@Composable
fun ConsultaParcial1Ap2Screen(
    navHostController: NavHostController,
    parcial1Ap2ViewModel: Parcial1Ap2ViewModel = hiltViewModel()
){

    val ScaffoldState = rememberScaffoldState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Consulta de Lista Prestamos")}
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                navHostController.navigate("RegistroPrestamos")
            }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        },
        scaffoldState = ScaffoldState

    ) {
        Column(modifier = Modifier
            .padding(it)
            .padding(8.dp)) {
            val listaprestamos = Parcial1Ap2ViewModel.Parcial1Ap2.collectAsState(initial = emptyList())

           LazyColumn(modifier = Modifier.fillMaxWidth()){
                items(listaclientes.value){
                        deudor -> RowPrestamos(nombre = deudor.deudor)
                }
            }
        }
    }

}

