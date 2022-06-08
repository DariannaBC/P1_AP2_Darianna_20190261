package com.itsecurity.p1_ap2_darianna_20190261.ui.theme.Parcial1Ap2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.itsecurity.p1_ap2_darianna_20190261.ui.theme.Parcial1Ap2.Parcial1Ap2ViewModel


@Composable
fun RegistroParcial1Ap2Screen(
    navHostController: NavHostController,
    parcial1Ap2ViewModel: Parcial1Ap2ViewModel = hiltViewModel()
    ) {



    Scaffold(
        topBar = { TopAppBar(title = { Text(text = "Registro del prestamos") }) }
    ){


    Column(modifier = Modifier.padding(8.dp)) {
        OutlinedTextField(
            value = Parcial1Ap2ViewModel.deudor,
            onValueChange = {Parcial1Ap2ViewModel.deudor = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Nombre de deudor")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null)
            }
        )



        OutlinedTextField(
            value = Parcial1Ap2ViewModel.concepto,
            onValueChange = {Parcial1Ap2ViewModel.concepto = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "deudor")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.concepto,
                    contentDescription = null)
            }
        )


        OutlinedTextField(

            value = Parcial1Ap2ViewModel.monto,
            onValueChange = {Parcial1Ap2ViewModel.monto = it},
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "monto")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = null)
            }
        )

        OutlinedButton(
            onClick = {
                parcial1Ap2ViewModel.Guardar()
                navHostController.navigateUp()
            }
        ) {
            Text(text = "Guardar")
        }
    }
    }
}
