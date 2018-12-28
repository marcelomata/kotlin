/*
 * KOTLIN CODEGEN BOX SPEC TEST (POSITIVE)
 *
 * SPEC VERSION: 0.1-draft
 * PLACES: constant-literals, boolean-literals -> paragraph 1 -> sentence 2
 * NUMBER: 9
 * DESCRIPTION: The use of Boolean literals as the identifier (with backtick) in the unescapedAnnotation.
 * NOTE: this test data is generated by FeatureInteractionTestDataGenerator. DO NOT MODIFY CODE MANUALLY!
 * HELPERS: reflect
 */

package org.jetbrains.`true`

annotation class `false`

annotation class `true` <T> (val a: String)

class A {
    @field:`false`
    val x1: Int = 0

    @setparam:`false`
    var x2: Int = 1

    val @receiver:org.jetbrains.`true`.`true`<List<Int>>("false") String.x3: Int
        get() {
            return 2
        }

    @org.jetbrains.`true`.`true`<Int>("1")
    val x4: Int = 3

    @`false`
    val x5: Int = 4

    val x6: Int = "...".x3
}

@`false` val x6 = 5

@org.jetbrains.`true`.`true`<`false`>(".") fun f1() = false

fun box(): String? {
    val a = A()

    if (a.x1 != 0 || a.x2 != 1 || a.x6 != 2 || a.x4 != 3 || a.x5 != 4 || x6 != 5) return null
    if (f1()) return null

    if (!checkProperties(A::class, listOf("x1", "x2", "x3", "x4", "x5"))) return null
    if (!checkPropertiesWithAnnotation(
            A::class,
            listOf(
                Pair("x4", listOf("org.jetbrains.true.true")),
                Pair("x5", listOf("org.jetbrains.true.false"))
            )
        )) return null
    if (!checkPropertyAnnotation(::x6, "org.jetbrains.true.false")) return null
    if (!checkFunctionAnnotation(::f1, "org.jetbrains.true.true")) return null

    return "OK"
}
