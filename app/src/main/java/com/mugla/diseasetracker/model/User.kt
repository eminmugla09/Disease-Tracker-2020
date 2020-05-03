package com.mugla.diseasetracker.model
// shows user email and status which already gotten from firebase.
data class User(var email:String?,var status:String?){
    constructor():this("","")
}