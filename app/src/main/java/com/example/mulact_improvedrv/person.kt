package com.example.mulact_improvedrv

class person {
    var name: String? =null
    var location: String? =null
    var mobile: String? =null
    var email: String? =null

    constructor(name: String, location: String, mobile: String, email: String) {
        this.name = name
        this.location = location
        this.mobile = mobile
        this.email = email
    }

    companion object {
    var people =arrayListOf<person>()
    }
}