package com.example.fastcampcalculator.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class History (
    @PrimaryKey val uid: Int?,
    @ColumnInfo(name="expression") val expression: String?,
    @ColumnInfo(name="re_sult")val result: String
    )