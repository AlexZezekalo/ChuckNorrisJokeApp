package com.ziko.chucknorrisjoke.domain.entity

/*
*   Example of domain entity as interface
*/
interface IJoke {
    val id: String
    val text: String
    val iconUrl: String
    val category: String?
}