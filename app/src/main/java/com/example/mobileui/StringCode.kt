package com.example.mobileui

class StringCode {
    private var listOfBlocks: ArrayList<String> = arrayListOf()
    private var stringCode:String=""

    fun addBlock(str:String){
        listOfBlocks.add(str)
    }
    fun convertToString():String{
        for(block in listOfBlocks){
            stringCode+=block
        }
        return stringCode
    }
}


