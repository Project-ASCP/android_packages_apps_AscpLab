/*
 * Copyright (C) 2023 the risingOS Android Project
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

package com.custom.settings;

import android.content.Context;
import android.os.Bundle;

import com.android.internal.logging.nano.MetricsProto;
import com.android.settings.R;
import com.android.settings.dashboard.DashboardFragment;
import com.android.settings.search.BaseSearchIndexProvider;
import com.android.settingslib.core.AbstractPreferenceController;
import com.android.settingslib.core.lifecycle.Lifecycle;
import com.android.settingslib.search.SearchIndexable;

import java.util.ArrayList;
import java.util.List;

public class PersonalizationsFragment extends DashboardFragment {

    public static final String CATEGORY_KEY = "com.android.settings.category.ia.personalizations";
 
    private static final String LOG_TAG = "Personalization";

    @Override
    protected int getPreferenceScreenResId() {
        return R.xml.special_features_dashboard;
    }

     @Override
     public int getMetricsCategory() {
         return MetricsProto.MetricsEvent.VIEW_UNKNOWN;
     }

    @Override
    public int getHelpResource() {
        return R.string.help_uri_about;
    }
    
    @Override
    public void onStart() {
        super.onStart();
    }
    
    @Override
    protected String getLogTag() {
        return LOG_TAG;
    }
    
    @Override
    protected List<AbstractPreferenceController> createPreferenceControllers(Context context) {
        return buildPreferenceControllers(context, this /* fragment */, getSettingsLifecycle());
    }
    
    private static List<AbstractPreferenceController> buildPreferenceControllers(
            Context context, PersonalizationsFragment fragment, Lifecycle lifecycle) {
        final List<AbstractPreferenceController> controllers = new ArrayList<>();
        return controllers;
    }
    
    /**
     * For Search.
     */
    public static final BaseSearchIndexProvider SEARCH_INDEX_DATA_PROVIDER =
            new BaseSearchIndexProvider(R.xml.special_features_dashboard) {
                @Override
                public List<AbstractPreferenceController> createPreferenceControllers(
                        Context context) {
                    return buildPreferenceControllers(context, null /* fragment */,
                            null /* lifecycle */);
                }
            };
 } 
