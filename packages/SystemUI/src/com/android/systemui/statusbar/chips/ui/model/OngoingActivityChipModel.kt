/*
 * TEMPORARY PenguinQS-port stub.
 *
 * The PenguinSystemUI app references OngoingActivityChipModel.Active, but no
 * such class exists in the old base either (app moved ahead of framework).
 * Replace with the real implementation when it lands upstream; island
 * AospChip bridging stays dormant until then.
 */

package com.android.systemui.statusbar.chips.ui.model

data class OngoingActivityChipModel(val key: String = "") {
    data class Active(val key: String = "")
}
