package me.dio.portfoliogithub.domain

import me.dio.portfoliogithub.core.UseCase
import me.dio.portfoliogithub.data.model.Repo
import me.dio.portfoliogithub.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}