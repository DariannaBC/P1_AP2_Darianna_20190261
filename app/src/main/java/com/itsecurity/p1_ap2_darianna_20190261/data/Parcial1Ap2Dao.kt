package com.itsecurity.p1_ap2_darianna_20190261.data

import androidx.room.*
import com.itsecurity.p1_ap2_darianna_20190261.model.Parcial1Ap2
import kotlinx.coroutines.flow.Flow


@Dao
interface Parcial1Ap2Dao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun Insertar(cliente: Parcial1Ap2)

    @Delete
    suspend fun Eliminar(cliente: Parcial1Ap2)


    @Query("""
        SELECT * 
        FROM Parcial1
        WHERE objetoId=:objetoId        
    """)
    fun Buscar(objetoId: Int): Flow<Parcial1Ap2>

    @Query("""
        SELECT * 
        FROM Parcial1
        ORDER BY objetoId    
    """)
    fun GetLista(): Flow<List<Parcial1Ap2>>

}
