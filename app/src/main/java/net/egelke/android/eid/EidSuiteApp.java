/*
    This file is part of eID Suite.
    Copyright (C) 2014 Egelke BVBA

    eID Suite is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    eID Suite is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with eID Suite.  If not, see <http://www.gnu.org/licenses/>.
*/
package net.egelke.android.eid;


import android.app.Application;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;

public class EidSuiteApp extends Application {


    private Tracker mTracker;

    public synchronized Tracker getTracker() {
       if (mTracker == null) {
           GoogleAnalytics analytics = GoogleAnalytics.getInstance(this);
           mTracker = analytics.newTracker(R.xml.app_tracker);
       }
       return mTracker;

    }

}