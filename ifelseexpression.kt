fun main(){
    val timeOpen = 8
    val timeClose = 12
    val timeNow = 7

    val classStatus = if(timeNow >= timeClose) {
        "Class already closed"
    } else if(timeNow>=timeOpen){
        "Class is open"
    } else {
        "Class is not open yet"
    }

    println(classStatus)
}
