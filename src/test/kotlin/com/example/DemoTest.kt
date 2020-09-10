package com.example


import io.kotest.core.spec.style.AnnotationSpec
import io.micronaut.test.annotation.MicronautTest
import kotlinx.coroutines.runBlocking

@MicronautTest
class BasicTest : AnnotationSpec() {
    @Test
    fun testPing() = runBlocking {
        assert(true)
    }
}
