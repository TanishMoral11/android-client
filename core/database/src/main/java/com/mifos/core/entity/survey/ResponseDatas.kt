/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/android-client/blob/master/LICENSE.md
 */
package com.mifos.core.entity.survey

import android.os.Parcelable
import com.mifos.core.database.MifosDatabase
import com.mifos.core.model.MifosBaseModel
import com.raizlabs.android.dbflow.annotation.Column
import com.raizlabs.android.dbflow.annotation.PrimaryKey
import com.raizlabs.android.dbflow.annotation.Table
import kotlinx.parcelize.Parcelize

/**
 * Created by Nasim Banu on 27,January,2016.
 */
@Parcelize
@Table(database = MifosDatabase::class)
data class ResponseDatas(
    @PrimaryKey
    var responseId: Int = 0,

    @Column
    @Transient
    var questionId: Int = 0,

    @Column
    var text: String? = null,

    @Column
    var sequenceNo: Int = 0,

    @Column
    var value: Int = 0,
) : MifosBaseModel(), Parcelable
