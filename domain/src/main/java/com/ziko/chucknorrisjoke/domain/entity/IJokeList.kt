package com.ziko.chucknorrisjoke.domain.entity


/*
*   Example of domain entity as interface
*/
interface IJokeList {
    val total: Int
    val jokes: List<IJoke>
}