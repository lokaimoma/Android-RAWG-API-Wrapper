/*
 * Copyright 2020 Evstafiev Konstantin
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package com.ekn.gruzer.rawgapiexample.di.application

import com.ekn.gruzer.rawgapiexample.data.contracts.GameRepo
import com.ekn.gruzer.rawgapiexample.data.contracts.GameSingleRepo
import com.ekn.gruzer.rawgapiexample.data.remote.contract.RemoteSource
import com.ekn.gruzer.rawgapiexample.data.repository.GameSingleRepository
import com.ekn.gruzer.rawgapiexample.data.repository.GamesRepository
import com.ekn.gruzer.rawgapiexample.di.ApplicationScope
import dagger.Module
import dagger.Provides

@Module
class RepositoryManagerModule {

    @ApplicationScope
    @Provides
    fun provideGameRepository(remoteSource: RemoteSource): GameRepo {
        return GamesRepository(remoteSource)
    }

    @ApplicationScope
    @Provides
    fun provideGameSingleRepository(remoteSource: RemoteSource): GameSingleRepo {
        return GameSingleRepository(remoteSource)
    }

}