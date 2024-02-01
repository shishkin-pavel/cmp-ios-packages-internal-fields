import com.example.module.*

//import com.example.module1.TEST

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        val t = getTestVal()
        return "Hello, ${platform.name}! test: ${t}"
    }
}