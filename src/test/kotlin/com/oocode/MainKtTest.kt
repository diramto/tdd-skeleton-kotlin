package com.oocode

import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify
import org.mockito.Mockito.eq
import parse

internal class MainKtTest {
    @Test
    fun test_1() {
        val robotMock = mock(Robot::class.java)

        parse("move 7 onto 4", robotMock)

        verify(robotMock).moveOnto(7, 4)
    }

    @Test
    fun test_2() {
        val robotMock = mock(Robot::class.java)

        parse("move 6 onto 4", robotMock)

        verify(robotMock).moveOnto(6, 4)
    }

    @Test
    fun test_3() {
        val robotMock = mock(Robot::class.java)

        parse("pile 8 over 6", robotMock)

        verify(robotMock).pileOver(8, 6)
    }
}
