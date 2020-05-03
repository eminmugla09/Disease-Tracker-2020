package com.mugla.diseasetracker.model
//email user id and coordinates for tracking listed on this function.
data class Tracking( var email:String?,
                     var uid:String?,
                     var lat:String?,
                     var lng:String?){
    constructor():this("","","","")
}