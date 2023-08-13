/*
 * Copyright (C) 2022 The PixelDust Project
 * SPDX-License-Identifier: Apache-2.0
 *
 */

package com.firedroid.settings.theme;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.provider.Settings;

import androidx.fragment.app.Fragment;
import androidx.preference.*;
import androidx.preference.Preference.OnPreferenceChangeListener;
import com.android.settingslib.core.AbstractPreferenceController;
import com.android.settingslib.core.lifecycle.Lifecycle;
import com.firedroid.settings.preferences.CustomUIPreferenceController;
import java.util.ArrayList;

    @Override
    protected List<AbstractPreferenceController> createPreferenceControllers(Context context) {
        return buildPreferenceControllers(context, getSettingsLifecycle(), this);
    }

    private static List<AbstractPreferenceController> buildPreferenceControllers(
            Context context, Lifecycle lifecycle, Fragment fragment) {
        final List<AbstractPreferenceController> controllers = new ArrayList<>();
        controllers.add(new CustomUIPreferenceController(context));
        return controllers;
    }
}