
import com.oocode.Robot


fun main(args: Array<String>) {
    println("Hello World!")
}

fun parse(command: String, robot: Robot): String {
    // Split the input by newlines to handle multiple commands
    val commands = command.split("\n")

    // Process each command
    for (cmd in commands) {
        parseCommand(cmd.trim(), robot)
    }

    return "Done"
}

fun parseCommand(command: String, robot: Robot): String {
    val parts = command.split(" ")
    // move 4 onto 7
    // [move, 4, onto, 7]
    // parts[0] = move/pile
    // parts[1] = 4
    // parts[3] = 7

    val from = parts[1].toInt()
    val to = parts[3].toInt()

    when (parts[0]) {
        "pile" -> robot.pileOver(from, to)
        "move" -> robot.moveOnto(from, to)
    }

    return "Done"
}
