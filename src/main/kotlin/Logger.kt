import java.io.File
import java.io.FileOutputStream

object Logger {
    var file : File = File("src/main/kotlin/log.txt")
    fun log(data : String) {
       FileOutputStream(file, true).bufferedWriter().use { writer -> writer.write("$data\n") }
    }
}