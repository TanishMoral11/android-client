/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/android-client/blob/master/LICENSE.md
 */
package com.mifos.core.data.repository

import com.mifos.core.network.GenericResponse
import com.mifos.core.objects.noncoreobjects.Document
import okhttp3.ResponseBody

/**
 * Created by Aditya Gupta on 08/08/23.
 */
interface DocumentListRepository {

    suspend fun getDocumentsList(entityType: String, entityId: Int): List<Document>

    suspend fun downloadDocument(
        entityType: String,
        entityId: Int,
        documentId: Int,
    ): ResponseBody

    suspend fun removeDocument(
        entityType: String,
        entityId: Int,
        documentId: Int,
    ): GenericResponse
}
