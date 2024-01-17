package com.example.blog

import org.springframework.data.repository.CrudRepository

interface ArticleRepositories : CrudRepository<Article, Long> {
    fun findBySlug(slug: String): Article?
    fun findAllByOrderByAddedDesc(): Iterable<Article>
}

interface UserRepository: CrudRepository<User,Long>{
    fun findByLogin(login: String): User?
}