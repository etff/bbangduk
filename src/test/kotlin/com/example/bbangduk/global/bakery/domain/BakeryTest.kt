package com.example.bbangduk.global.bakery.domain

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe

class BakeryTest : AnnotationSpec() {
    private val sut = Bakery("test1", Location("Seoul", "Gangnam", 127.0, 37.0))

    @Test
    fun `빵집의 정보를 리턴한다`() {
        sut.location shouldBe Location("Seoul", "Gangnam", 127.0, 37.0)
    }
}
