/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.dessertclicker.data

import com.example.dessertclicker.R
import com.example.dessertclicker.model.Dessert

/**
 * [Datasource] generates a list of [Dessert]
 */
object Datasource {
    val dessertList = listOf(
        Dessert(R.drawable.cupcake, 1, 0),       // Basic starter dessert
        Dessert(R.drawable.donut, 3, 10),        // 10 clicks to upgrade
        Dessert(R.drawable.eclair, 7, 30),       // 30 clicks to upgrade
        Dessert(R.drawable.froyo, 15, 100),      // 100 clicks to upgrade
        Dessert(R.drawable.gingerbread, 30, 300), // 300 clicks to upgrade
        Dessert(R.drawable.honeycomb, 60, 1000),  // 1000 clicks to upgrade
        Dessert(R.drawable.icecreamsandwich, 120, 3000),
        Dessert(R.drawable.jellybean, 250, 10000),
        Dessert(R.drawable.kitkat, 500, 30000),
        Dessert(R.drawable.lollipop, 1000, 100000),
        Dessert(R.drawable.marshmallow, 2000, 300000),
        Dessert(R.drawable.nougat, 4000, 1000000),
        Dessert(R.drawable.oreo, 8000, 3000000)  // Final dessert
    )
}