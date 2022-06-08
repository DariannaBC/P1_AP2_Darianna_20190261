package com.itsecurity.p1_ap2_darianna_20190261.ui.componentes.Prestamo

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.itsecurity.p1_ap2_darianna_20190261.data.repository.PrestamosRepository
import com.itsecurity.p1_ap2_darianna_20190261.model.Prestamos
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject



@HiltViewModel
class PrestamoViewModel @Inject constructor(
    val prestamosRepository: PrestamosRepository
): ViewModel() {

    var prestamos = prestamosRepository.GetLista()

    var prestamoId by mutableStateOf(0)
    var deudor by mutableStateOf("")
    var concepto by mutableStateOf("")
    var monto by mutableStateOf("")

    fun Guardar(){
        viewModelScope.launch {
            prestamosRepository.Insertar(
                Prestamos(
                    prestamoId = prestamoId,
                    deudor = deudor,
                    concepto = concepto,
                    monto = monto.toDouble()
                )
            )
        }
    }
}
