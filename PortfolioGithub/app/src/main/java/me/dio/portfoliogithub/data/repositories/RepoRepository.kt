package me.dio.portfoliogithub.data.repositories

import me.dio.portfoliogithub.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}