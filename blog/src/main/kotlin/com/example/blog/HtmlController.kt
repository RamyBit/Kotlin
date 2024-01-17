package com.example.blog

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController (private val repositories: ArticleRepositories) {
    @GetMapping("/")
    fun blog(model: Model): String{
        model["title"] = "Blog"
        model["articles"] = repositories.findAllByOrderByAddedDesc().map { it.render() }
        return "blog"
    }
}

fun Article.render() = RenderedArticle(
    slug,
    title,
    headline,
    content,
    author,
    addedAt.format()
)


data class RenderedArticle(
    var slug: String,
    val title: String,
    val headline: String,
    val content: String,
    val author: User,
    val addedAt: String)