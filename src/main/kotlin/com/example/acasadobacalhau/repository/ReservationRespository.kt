package com.example.acasadobacalhau.repository

import com.example.acasadobacalhau.models.ReservationModel
import org.springframework.data.repository.CrudRepository

interface ReservationRespository:CrudRepository <ReservationModel, Int> {
}