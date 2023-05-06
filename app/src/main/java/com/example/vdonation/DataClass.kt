package com.example.vdonation

class DataClass {

        var dataName: String? = null
        var dataAddress1: String? = null
        var dataAddress2: String? = null
        var phone: String? = null
        var dataImage: String? = null
        constructor(dataName: String?, dataAddress1: String?, dataAddress2: String?,phone: String?, dataImage: String?){
            this.dataName = dataName
            this.dataAddress1 = dataAddress1
            this.dataAddress2 = dataAddress2
            this.phone = phone
            this.dataImage = dataImage
        }
        constructor()
        {}

}