package br.dipievil.androidaps2.model

class Task {
    companion object Factory {
        fun create(): Task = Task()
    }

    var id: String? = null
    var title: String? = null
    var status: Boolean? = false
}