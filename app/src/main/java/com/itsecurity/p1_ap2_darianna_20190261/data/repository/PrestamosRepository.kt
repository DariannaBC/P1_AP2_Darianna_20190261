package com.itsecurity.p1_ap2_darianna_20190261.data.repository

import com.itsecurity.p1_ap2_darianna_20190261.data.PrestamosDao
import com.itsecurity.p1_ap2_darianna_20190261.model.Prestamos
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class PrestamosRepository @Inject constructor(
    val prestamosDao: PrestamosDao
) {
    suspend fun Insertar(prestamos: Prestamos)= prestamosDao.Insertar(prestamos)

    fun Buscar(prestamos: Int): Flow<Prestamos>   =  prestamosDao.Buscar(prestamos)

    suspend fun Eliminar(prestamos: Prestamos)= prestamosDao.Eliminar(prestamos)

    fun GetLista(): Flow<List<Prestamos>> = prestamosDao.GetLista()
}
