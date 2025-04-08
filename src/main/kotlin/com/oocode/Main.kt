@file:Suppress("UNUSED_PARAMETER")

import com.oocode.Robot


fun main(args: Array<String>) {
    println("Hello World!")
}

fun parse(command: String, robot: Robot): String {
    val parts = command.split(" ")
//    move 4 onto 7
//    [move, 4, onto, 7]
//    parts[1] = 4
//    parts[3] = 7
    robot.pileOver(parts[1].toInt(), parts[3].toInt())
    return "Done"
}
