package com.example.criminalintent

import java.sql.Date
import java.util.UUID


data class Crime(val id: UUID.randomUUID(),
    var title: String = "",
    var date: Date = Date(),
    var isSolved: Boolean = false)
