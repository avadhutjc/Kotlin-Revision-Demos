package com.ajc.kotlin_revision_demos

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task")
data class Task(
    @ColumnInfo(name = "title")
    var title: String,
    @ColumnInfo(name = "desc")
    var desc: String
) {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")

    var id: Int? = null
}