package com.hotstar.boilerplate

import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress

fun main(){
    val server = HttpServer.create(InetSocketAddress(8080), 0) 

    server.createContext("/"){
        val response = "Hello Hotstar!".toByteArray()
        it.sendResponseHeaders(200, response.size.toLong())
        it.responseBody.use {
            it.write(response)
        }
    }

    System.out.println("Starting server on port 8080")
    server.start()
}