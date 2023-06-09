package com.itzik.data.model

import org.jetbrains.annotations.PropertyKey

data class User(
    var firstName: String?=null,
    var familyName: String?=null,
    var id: String?=null,
    var birthday: String?=null,
    var age: Int?=null,
    var phoneNumber: String?=null,
    var email: String?=null,
    var nationality: String?=null,
    var password: String?=null,
    var genre: Genre?=null
)

enum class Genre {
    MALE, FEMALE, OTHER
}
