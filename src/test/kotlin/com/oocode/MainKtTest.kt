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

    @Test
    fun test_4() {
        val robotMock = mock(Robot::class.java)

        parse("pile 8 over 6\nmove 5 onto 2", robotMock)

        verify(robotMock).pileOver(8, 6)
        verify(robotMock).moveOnto(5, 2)
    }
}
