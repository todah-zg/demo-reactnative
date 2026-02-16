package io.codemagic.marijan.demo.reactnative.helpers

import java.util.UUID

class RandomId {
    companion object {
        fun generate(): String {
            return UUID.randomUUID().toString()
        }
    }
}
