// !LANGUAGE: +InlineClasses

inline fun <T> T.runInlineExt(fn: T.() -> String) = fn()

inline class R(private val r: String) {
    fun test() = runInlineExt { r }
}

fun box() = R("OK").test()