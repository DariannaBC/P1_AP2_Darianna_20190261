package com.itsecurity.p1_ap2_darianna_20190261.data.repository

import com.itsecurity.p1_ap2_darianna_20190261.data.Parcial1Ap2Dao
import com.itsecurity.p1_ap2_darianna_20190261.model.Parcial1Ap2
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class Parcial1Ap2Repository @Inject constructor(
    val parcial1Ap2Dao: Parcial1Ap2Dao
) {
    suspend fun Insertar(parcial1ap2: Parcial1Ap2)= parcial1Ap2Dao.Insertar(parcial1ap2)

    fun Buscar(parcial1ap2: Int): Flow<Parcial1Ap2>   =  parcial1Ap2Dao.Buscar(parcial1ap2)

    suspend fun Eliminar(parcial1ap2: Parcial1Ap2)= parcial1Ap2Dao.Eliminar(parcial1ap2)

    fun GetLista(): Flow<List<Parcial1Ap2>> = parcial1Ap2Dao.GetLista()
}
