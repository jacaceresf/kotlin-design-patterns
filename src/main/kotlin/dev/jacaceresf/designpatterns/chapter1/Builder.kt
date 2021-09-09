package dev.jacaceresf.designpatterns.chapter1

import java.io.File

data class Mail(
    val to: String,
    var cc: List<String> = listOf(),
    var bcc: List<String> = listOf(),
    var title: String = "",
    var message: String = "",
    var attachments: List<File> = listOf()
)

fun main() {

    val mail = Mail("jacaceres@dev.com").apply {
        message = "Email message"
        title = "Email title"
        cc = listOf("person@company.com")
    }

    print(mail)
}