package com.itsecurity.p1_ap2_darianna_20190261.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.itsecurity.p1_ap2_darianna_20190261.model.Prestamos

@Database(
    entities = [Prestamos::class],
    version = 2
)
abstract class PrestamosDb: RoomDatabase() {
    abstract  val prestamosDao: PrestamosDao

}
