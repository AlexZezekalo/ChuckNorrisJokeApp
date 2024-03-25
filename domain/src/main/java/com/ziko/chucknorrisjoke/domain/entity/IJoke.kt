package com.ziko.chucknorrisjoke.domain.entity

import com.ziko.chucknorrisjoke.domain.entity.base.Item

/*
*   Example of domain entity as interface
*/
interface IJoke : Item {
    val id: String
    val text: String
    val iconUrl: String
    val category: List<String>
    val createdAt: String
    val updatedAt: String
    val webUrl: String
}