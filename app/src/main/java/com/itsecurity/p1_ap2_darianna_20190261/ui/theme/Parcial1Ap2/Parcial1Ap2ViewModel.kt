package com.itsecurity.p1_ap2_darianna_20190261.ui.theme.Parcial1Ap2

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.itsecurity.p1_ap2_darianna_20190261.data.repository.Parcial1Ap2Repository
import com.itsecurity.p1_ap2_darianna_20190261.model.Parcial1Ap2
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

//TODO Implementar view model de la clase correspondiente

@HiltViewModel
class Parcial1Ap2ViewModel @Inject constructor(
    val parcial1Ap2Repository: Parcial1Ap2Repository
): ViewModel() {

    var Parcial1Ap2 = Parcial1Ap2Repository.GetLista()

    var clienteID by mutableStateOf(0)
    var nombre by mutableStateOf("")
     var deudor by mutableStateOf("")
     var concepto by mutableStateOf("")

     var monto by mutableStateOf("")

    fun Guardar(){
        viewModelScope.launch {
            parcial1Ap2Repository.Insertar(
                Parcial1Ap2(
                    objetoId = clienteID,
                    nombre = nombre,
                    deudor = deudor,

                    monto = monto.toString().toDouble()
                )
            )
        }
    }
}
