package com.ditchoom.buffer

interface PlatformBuffer : ReadBuffer, WriteBuffer, SuspendCloseable, Parcelable {
    val capacity: UInt
    val byteOrder: ByteOrder

    companion object
}


