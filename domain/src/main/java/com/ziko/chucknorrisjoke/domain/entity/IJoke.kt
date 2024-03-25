package com.ziko.chucknorrisjoke.domain.entity

/*
*   Example of domain entity as interface
*/
interface IJoke {
    val id: String
    val text: String
    val iconUrl: String
    val category: List<String>
    val createdAt: String
    val updatedAt: String
    val webUrl: String
}