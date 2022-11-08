package com.hyuk.kotest

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe

internal class CalculatorAnnotationSpec: AnnotationSpec() {

    @Test
    fun `1과 2를 더하면 3이 반환된다`() {
        val result = 1 + 2;

        result shouldBe 3
    }
}