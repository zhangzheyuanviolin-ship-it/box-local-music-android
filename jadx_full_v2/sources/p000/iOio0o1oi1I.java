            package p000;

            import android.content.Context;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteDatabaseLockedException;
            import android.database.sqlite.SQLiteException;
            import android.database.sqlite.SQLiteOpenHelper;
            import android.os.SystemClock;
            
/* 14 */    public final class iOio0o1oi1I extends SQLiteOpenHelper {
                public final int I00iOIl;
                public final I01O1lIi I00iiI;

                public iOio0o1oi1I(Context context, String str) {
/* 12 */            super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
                }

                @Override
                public final SQLiteDatabase getWritableDatabase() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             I01O1lIi i01O1lIi = this.I00iiI;
                    switch (i) {
                        case 0:
/* 79 */                    iOl1lOo1IO iol1loo1io = (iOl1lOo1IO) i01O1lIi;
/* 83 */                    l0olllO1i l0olllo1i = (l0olllO1i) iol1loo1io.I00iOIl;
/* 85 */                    iIl1iil iil1iil = l0olllo1i.I00iio;
/* 87 */                    li1iIiOi10o li1iiioi10o = iol1loo1io.I00ilI0I1;
/* 95 */                    if (li1iiioi10o.I00000oIO != 0 && SystemClock.elapsedRealtime() - li1iiioi10o.I00000oIO < 3600000) {
/* 192 */                       throw new SQLiteException("Database open failed");
                            }
                            try {
/* 112 */                       return super.getWritableDatabase();
                            } catch (SQLiteException unused) {
/* 117 */                       li1iiioi10o.getClass();
/* 124 */                       li1iiioi10o.I00000oIO = SystemClock.elapsedRealtime();
/* 126 */                       l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 128 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 135 */                       l01o0io1ooo0.I00ilO0.I00000oOI("Opening the database failed, dropping and recreating it");
/* 150 */                       if (!l0olllo1i.I00iOIl.getDatabasePath("google_app_measurement.db").delete()) {
/* 152 */                           l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 154 */                           l0olllO1i.I000II(l01o0io1ooo02);
/* 161 */                           l01o0io1ooo02.I00ilO0.I0000Il00O("Failed to delete corrupted db file", "google_app_measurement.db");
                                }
                                try {
/* 164 */                           SQLiteDatabase writableDatabase = super.getWritableDatabase();
/* 168 */                           li1iiioi10o.I00000oIO = 0L;
/* 170 */                           return writableDatabase;
                                } catch (SQLiteException e) {
/* 172 */                           l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 174 */                           l0olllO1i.I000II(l01o0io1ooo03);
/* 181 */                           l01o0io1ooo03.I00ilO0.I0000Il00O("Failed to open freshly created database", e);
/* 184 */                           throw e;
                                }
                            }
                        default:
/* 12 */                    l0olllO1i l0olllo1i2 = (l0olllO1i) ((l00Ii0II) i01O1lIi).I00iOIl;
                            try {
/* 14 */                        return super.getWritableDatabase();
                            } catch (SQLiteDatabaseLockedException e2) {
/* 78 */                        throw e2;
                            } catch (SQLiteException unused2) {
/* 19 */                        l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i2.I00ilO0;
/* 21 */                        l0olllO1i.I000II(l01o0io1ooo04);
/* 28 */                        l01o0io1ooo04.I00ilO0.I00000oOI("Opening the local database failed, dropping and recreating it");
/* 43 */                        if (!l0olllo1i2.I00iOIl.getDatabasePath("google_app_measurement_local.db").delete()) {
/* 45 */                            l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i2.I00ilO0;
/* 47 */                            l0olllO1i.I000II(l01o0io1ooo05);
/* 54 */                            l01o0io1ooo05.I00ilO0.I0000Il00O("Failed to delete corrupted local db file", "google_app_measurement_local.db");
                                }
                                try {
/* 57 */                            return super.getWritableDatabase();
                                } catch (SQLiteException e3) {
/* 63 */                            l01O0IO1ooO0 l01o0io1ooo06 = l0olllo1i2.I00ilO0;
/* 65 */                            l0olllO1i.I000II(l01o0io1ooo06);
/* 72 */                            l01o0io1ooo06.I00ilO0.I0000Il00O("Failed to open local database. Events will bypass local storage", e3);
/* 75 */                            return null;
                                }
                            }
                    }
                }

                @Override
                public final void onCreate(SQLiteDatabase sQLiteDatabase) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             I01O1lIi i01O1lIi = this.I00iiI;
                    switch (i) {
                        case 0:
/* 29 */                    l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) ((iOl1lOo1IO) i01O1lIi).I00iOIl).I00ilO0;
/* 31 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 34 */                    liiolil.I00000oOI(l01o0io1ooo0, sQLiteDatabase);
                            break;
                        default:
/* 14 */                    l01O0IO1ooO0 l01o0io1ooo02 = ((l0olllO1i) ((l00Ii0II) i01O1lIi).I00iOIl).I00ilO0;
/* 16 */                    l0olllO1i.I000II(l01o0io1ooo02);
/* 19 */                    liiolil.I00000oOI(l01o0io1ooo02, sQLiteDatabase);
                            break;
                    }
                }

                @Override
                public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
/* 1 */             int i3 = this.I00iOIl;
                }

                @Override
                public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
/* 1 */             int i = this.I00iOIl;
/* 3 */             I01O1lIi i01O1lIi = this.I00iiI;
                    switch (i) {
                        case 0:
/* 37 */                    l0olllO1i l0olllo1i = (l0olllO1i) ((iOl1lOo1IO) i01O1lIi).I00iOIl;
/* 39 */                    l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 41 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 52 */                    liiolil.I00000oIO(l01o0io1ooo0, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", iOl1lOo1IO.I00ilO0);
/* 55 */                    l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 57 */                    l0olllO1i.I000II(l01o0io1ooo02);
/* 67 */                    liiolil.I00000oIO(l01o0io1ooo02, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
/* 70 */                    l0olllO1i.I000II(l01o0io1ooo02);
/* 79 */                    liiolil.I00000oIO(l01o0io1ooo02, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
/* 82 */                    l0olllO1i.I000II(l01o0io1ooo02);
/* 93 */                    liiolil.I00000oIO(l01o0io1ooo02, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", iOl1lOo1IO.I00ioIO);
/* 96 */                    l0olllO1i.I000II(l01o0io1ooo02);
/* 107 */                   liiolil.I00000oIO(l01o0io1ooo02, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", iOl1lOo1IO.I00l0I0l0lO1);
/* 110 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 121 */                   liiolil.I00000oIO(l01o0io1ooo02, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", iOl1lOo1IO.I00li1OI);
/* 124 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 134 */                   liiolil.I00000oIO(l01o0io1ooo02, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
/* 137 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 148 */                   liiolil.I00000oIO(l01o0io1ooo02, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", iOl1lOo1IO.I00l0OO0IO);
/* 151 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 162 */                   liiolil.I00000oIO(l01o0io1ooo02, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", iOl1lOo1IO.I00ll1);
/* 165 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 176 */                   liiolil.I00000oIO(l01o0io1ooo02, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", iOl1lOo1IO.I00lli11);
/* 179 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 189 */                   liiolil.I00000oIO(l01o0io1ooo02, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
/* 192 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 203 */                   liiolil.I00000oIO(l01o0io1ooo02, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", iOl1lOo1IO.I00lll10);
/* 206 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 216 */                   liiolil.I00000oIO(l01o0io1ooo02, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
/* 219 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 228 */                   liiolil.I00000oIO(l01o0io1ooo02, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
/* 231 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 242 */                   liiolil.I00000oIO(l01o0io1ooo02, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", iOl1lOo1IO.I00o0iI0io1);
/* 245 */                   iIO0ooOool.I00000oIO();
/* 248 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 259 */                   liiolil.I00000oIO(l01o0io1ooo02, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", iOl1lOo1IO.I00o0l1o1o0);
/* 262 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 273 */                   liiolil.I00000oIO(l01o0io1ooo02, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", iOl1lOo1IO.I00io1l);
/* 276 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 286 */                   liiolil.I00000oIO(l01o0io1ooo02, sQLiteDatabase, "diagnostic_signals", "CREATE TABLE IF NOT EXISTS diagnostic_signals ( app_id TEXT NOT NULL, signal_name TEXT NOT NULL, metadata TEXT NOT NULL, count INTEGER NOT NULL, last_increment_timestamp INTEGER NOT NULL);", "app_id,signal_name,metadata,count,last_increment_timestamp", null);
/* 297 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 306 */                   liiolil.I00000oIO(l01o0io1ooo02, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                            break;
                        default:
/* 14 */                    l01O0IO1ooO0 l01o0io1ooo03 = ((l0olllO1i) ((l00Ii0II) i01O1lIi).I00iOIl).I00ilO0;
/* 16 */                    l0olllO1i.I000II(l01o0io1ooo03);
/* 28 */                    liiolil.I00000oIO(l01o0io1ooo03, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", l00Ii0II.I00ilI0I1);
                            break;
                    }
                }

                @Override
                public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
/* 1 */             int i3 = this.I00iOIl;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 15 */        public iOio0o1oi1I(l00Ii0II l00ii0ii, Context context) {
/* 17 */            this(context, "google_app_measurement_local.db");
                    this.I00iOIl = 1;
/* 16 */            this.I00iiI = l00ii0ii;
                }

                /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
/* 17 */        public iOio0o1oi1I(iOl1lOo1IO iol1loo1io, Context context) {
/* 19 */            this(context, "google_app_measurement.db");
                    this.I00iOIl = 0;
/* 18 */            this.I00iiI = iol1loo1io;
                }

/* 97 */        private final void I00000oIO(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                }

/* 97 */        private final void I0000Il00O(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                }

/* 97 */        private final void I000II(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                }

/* 97 */        private final void I000O01llI0(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                }
            }
