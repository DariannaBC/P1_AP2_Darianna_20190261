package com.itsecurity.p1_ap2_darianna_20190261.data

import androidx.room.*
import com.itsecurity.p1_ap2_darianna_20190261.model.Prestamos
import kotlinx.coroutines.flow.Flow


@Dao
interface PrestamosDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun Insertar(prestamo: Prestamos)

    @Delete
    suspend fun Eliminar(prestamo: Prestamos)


    @Query(
        """
        SELECT * 
        FROM Prestamos
        WHERE prestamoId=:prestamoId        
    """
    )
    fun Buscar(prestamoId: Int): Flow<Prestamos>

    @Query(
        """
        SELECT * 
        FROM Prestamos
        ORDER BY prestamoId    
    """
    )
    fun GetLista(): Flow<List<Prestamos>>

}
