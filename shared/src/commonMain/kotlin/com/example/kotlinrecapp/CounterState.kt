package com.example.kotlinrecapp

// shared/src/commonMain/kotlin/Counter.kt

class CounterState {
    var value: Int = 0
        private set

    fun increment() {
        value++
    }

    fun decrement() {
        if (value > 0) {
            value--
        }
    }
}
