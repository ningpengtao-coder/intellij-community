/*******************************************************************************
 * Copyright 2000-2022 JetBrains s.r.o. and contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

@file:Suppress("MagicNumber") // Swing dimension constants...
package com.jetbrains.packagesearch.intellij.plugin.ui.util

import net.miginfocom.layout.LC

internal fun LC.noInsets() = insets("0")

internal fun LC.scaledInsets(
    @ScalableUnits top: Int = 0,
    @ScalableUnits left: Int = 0,
    @ScalableUnits bottom: Int = 0,
    @ScalableUnits right: Int = 0
) = insets(top.scaled(), left.scaled(), bottom.scaled(), right.scaled())

internal fun LC.insets(
    @ScaledPixels top: Int = 0,
    @ScaledPixels left: Int = 0,
    @ScaledPixels bottom: Int = 0,
    @ScaledPixels right: Int = 0
) = insets(top.toString(), left.toString(), bottom.toString(), right.toString())

internal fun LC.skipInvisibleComponents() = hideMode(3)

internal fun LC.gridGap(@ScalableUnits hSize: Int = 0, @ScalableUnits vSize: Int = 0) =
    gridGap(hSize.scaledAsString(), vSize.scaledAsString())
