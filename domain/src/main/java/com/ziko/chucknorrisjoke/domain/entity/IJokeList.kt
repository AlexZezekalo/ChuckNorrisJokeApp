package com.ziko.chucknorrisjoke.domain.entity

import com.ziko.chucknorrisjoke.domain.entity.base.Item


/*
*   Example of domain entity as interface
*/
interface IJokeList : Item {
    val total: Int
    val jokes: List<IJoke>
}