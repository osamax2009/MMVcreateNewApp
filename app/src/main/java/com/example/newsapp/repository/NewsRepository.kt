package com.example.newsapp.repository

import com.example.newsapp.api.RetrofitInstnstance
import com.example.newsapp.db.ArticleDatabase
import java.util.Locale.IsoCountryCode

class NewsRepository (
    val db:ArticleDatabase
){
    suspend fun getBreakingNews(countryCode: String, pageNumber:Int) =
        RetrofitInstnstance.api.getBreakingNews(countryCode,pageNumber)
}