package com.itsecurity.p1_ap2_darianna_20190261.data

import androidx.room.Database
import androidx.room.RoomDatabase

import com.itsecurity.p1_ap2_darianna_20190261.model.Parcial1Ap2

@Database(
    entities = [Parcial1Ap2::class],
    version = 1
)
abstract class Parcial1Ap2Db: RoomDatabase() {
    abstract  val parcial1Ap2Dao: Parcial1Ap2Dao

}
