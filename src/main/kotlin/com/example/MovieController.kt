package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter

@Controller("/movies")
class MovieController {
    @Get("/{genre}")
    @Operation(summary = "Get all movies")
    fun allByGenre(
        @PathVariable genre: String,
        @Parameter(description = "The encoding")
        encoding: Encoding?
    ): List<Movie> {
        return listOf(Movie(encoding = encoding ?: Encoding.HS_256))
    }
}