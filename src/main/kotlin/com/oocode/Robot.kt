package com.oocode

interface Robot {
    fun moveOnto(from: Int, to: Int): String
    fun pileOver(from: Int, to: Int): String
}