package com.itsecurity.p1_ap2_darianna_20190261.ui.componentes.Prestamo

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController


import com.itsecurity.p1_ap2_darianna_20190261.model.Prestamos


@Composable
fun ConsultaPrestamosScreen(
    navHostController: NavHostController,
    prestamoViewModel: PrestamoViewModel = hiltViewModel()
){

    val ScaffoldState = rememberScaffoldState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Consulta de Prestamos")}
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
            val listaprestamos = prestamoViewModel.prestamos.collectAsState(initial = emptyList())

            LazyRow(modifier = Modifier.fillMaxWidth()){
                items(listaprestamos.value){deudor ->
                    RowPrestamos(deudor)
                }
            }
        }
    }

}

@Composable
fun RowPrestamos(prestam: Prestamos){
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = "Deudor: ${prestam.deudor}")
        Text(text = "Concepto: ${prestam.concepto}")
        Text(text = "Monto: ${prestam.monto}")
    }
}