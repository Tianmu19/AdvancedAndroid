package com.github.tianmu19.advanceandroid.mvp.model.entity.gank

data class Result(
    val _id: String,
    val createdAt: String,
    val desc: String,
    val images: List<String>,
    val publishedAt: String,
    val source: String,
    val type: String,
    val url: String,
    val used: Boolean,
    val who: String
)