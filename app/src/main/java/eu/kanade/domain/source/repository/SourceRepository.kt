package eu.kanade.domain.source.repository

import eu.kanade.tachiyomi.source.model.FilterList
import kotlinx.coroutines.flow.Flow
import tachiyomi.data.source.SourcePagingSourceType
import tachiyomi.domain.source.model.Source
import tachiyomi.domain.source.model.SourceWithCount

interface SourceRepository {

    fun getSources(): Flow<List<Source>>

    fun getOnlineSources(): Flow<List<Source>>

    fun getSourcesWithFavoriteCount(): Flow<List<Pair<Source, Long>>>

    fun getSourcesWithNonLibraryManga(): Flow<List<SourceWithCount>>

    fun search(sourceId: Long, query: String, filterList: FilterList): SourcePagingSourceType

    fun getPopular(sourceId: Long): SourcePagingSourceType

    fun getLatest(sourceId: Long): SourcePagingSourceType
}
