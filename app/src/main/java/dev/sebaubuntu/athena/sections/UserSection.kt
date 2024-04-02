/*
 * SPDX-FileCopyrightText: 2024 Sebastiano Barezzi
 * SPDX-License-Identifier: Apache-2.0
 */

package dev.sebaubuntu.athena.sections

import dev.sebaubuntu.athena.R
import dev.sebaubuntu.athena.models.data.Section

object UserSection : Section() {
    override val title = R.string.section_user_name
    override val description = R.string.section_user_description
    override val icon = R.drawable.ic_supervised_user_circle

    override val navigationActionId = R.id.action_mainFragment_to_userFragment
}
