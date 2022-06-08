package com.itsecurity.p1_ap2_darianna_20190261.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "Prestamos")
@Parcelize
data class Prestamos(
    @PrimaryKey(autoGenerate = true)
    val prestamoId: Int,
    val deudor: String,
    val concepto: String,
    val monto: Double
): Parcelable
