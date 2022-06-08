package com.itsecurity.p1_ap2_darianna_20190261.di

import android.content.Context
import androidx.room.Room
import com.itsecurity.p1_ap2_darianna_20190261.data.Parcial1Ap2Dao
import com.itsecurity.p1_ap2_darianna_20190261.data.Parcial1Ap2Db
import com.itsecurity.p1_ap2_darianna_20190261.data.repository.Parcial1Ap2Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object  AppModule {


    @Singleton
    @Provides
    fun ProvideTicketDb(@ApplicationContext context: Context): Parcial1Ap2Db {
        val DATABASE_NAME = "ParcialDb"
        return Room.databaseBuilder(
            context,
            Parcial1Ap2Db::class.java,
            DATABASE_NAME       )
            .fallbackToDestructiveMigration()
            .build()
    }


    @Provides
    fun ProvideClienteDAO(parcialDb: Parcial1Ap2Db): Parcial1Ap2Dao {
        return parcialDb.parcial1Ap2Dao
    }

    @Provides
    fun ProvideClienteRepository(parcial12Dao: Parcial1Ap2Dao): Parcial1Ap2Repository {
        return Parcial1Ap2Repository(parcial12Dao)
    }
}
