fun main() {
    println(getFormattedString("44.33.555.555.666.0.9.666.777.555.3"))
    println(getFormattedString("7.777.444.66.222.33"))
}

private fun getFormattedString(inputString: String): String {
    val map = mutableMapOf<Int, String>()
    map[1] = ""
    map[2] = "ABC"
    map[3] = "DEF"
    map[4] = "GHI"
    map[5] = "JKL"
    map[6] = "MNO"
    map[7] = "PQRS"
    map[8] = "TUV"
    map[9] = "WXYZ"
    map[0] = " "

    var answer = StringBuilder()

    var index = 0
    while (index < inputString.length) {
        val element = inputString[index]
        if (element == ' ') {
            answer.append(" ")
            continue
        }
        var j = index
        while (j < inputString.length && inputString[j] == element) {
            // while within the regular limit continue processing until the characterElement changes
            j++
        }
        // add stringChar to ans and move index to next characterElement
        answer.append(map[Character.getNumericValue(inputString[index])]?.get(j - index - 1))
        index = j + 1  //  move to next character in input string
    }
    return answer.toString()
}

