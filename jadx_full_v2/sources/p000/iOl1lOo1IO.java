            package p000;

            import android.content.ContentValues;
            import android.database.Cursor;
            import android.database.SQLException;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteException;
            import android.os.Bundle;
            import android.os.Parcelable;
            import android.os.SystemClock;
            import android.text.TextUtils;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.Objects;
            
            public final class iOl1lOo1IO extends liOO10o0 {
                public static final String[] I00ilO0 = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
                public static final String[] I00io1l = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
                public static final String[] I00ioIO = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
                public static final String[] I00l0I0l0lO1 = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};
                public static final String[] I00l0OO0IO = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};
                public static final String[] I00li1OI = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
                public static final String[] I00ll1 = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
                public static final String[] I00lli11 = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
                public static final String[] I00lll10 = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
                public static final String[] I00o0iI0io1 = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
                public static final String[] I00o0l1o1o0 = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};
                public iOio0o1oi1I I00iio;
                public li1iIiOi10o I00ilI0I1;

                public static final String I01II10(List list) {
                    return list.isEmpty() ? "" : IlIi0I0.I000lI(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
                }

                public static final void I01Ilo0i(ContentValues contentValues, Object obj) {
/* 3 */             lII0I0I000I.I0000O("value");
/* 8 */             if (obj instanceof String) {
/* 12 */                contentValues.put("value", (String) obj);
/* 15 */                return;
                    }
/* 18 */            if (obj instanceof Long) {
/* 22 */                contentValues.put("value", (Long) obj);
                    } else if (obj instanceof Double) {
/* 32 */                contentValues.put("value", (Double) obj);
                    } else {
/* 38 */                I000II.I000iOII("Invalid value type");
                    }
                }

                @Override
                public final void I010iIIOlo() {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 14 */            if (l0olllo1i.I00iio.I01101IOlO(null, iol1II1ii1i.I01101olii)) {
/* 16 */                l0o10OoO0 l0o10ooo0 = l0olllo1i.I00io1l;
/* 18 */                l0olllO1i.I000II(l0o10ooo0);
/* 25 */                I0lil01 i0lil01 = new I0lil01(19);
/* 28 */                i0lil01.I00iiI = this;
/* 30 */                VarHandle.storeStoreFence();
/* 33 */                l0o10ooo0.I010o0o0oO(i0lil01);
                    }
                }

                public final long I010ioo(String str, l0oiiI0 l0oiii0, String str2, Map map, lIoOOO lioooo, Long l) {
                    int iDelete;
/* 10 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 12 */            I010II();
/* 15 */            I010OIo1l();
/* 18 */            lII0I0I000I.I000II(l0oiii0);
/* 21 */            lII0I0I000I.I0000O(str);
/* 24 */            I010II();
/* 27 */            I010OIo1l();
/* 38 */            if (I01IlIoOI()) {
/* 42 */                lilOOl0 lilool0 = this.I00iiI;
/* 48 */                long jI00000oIO = lilool0.I00l0I0l0lO1.I00ilO0.I00000oIO();
/* 52 */                Iioi0lilII iioi0lilII = l0olllo1i.I00li1OI;
/* 54 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 56 */                iioi0lilII.getClass();
/* 59 */                long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 83 */                if (Math.abs(jElapsedRealtime - jI00000oIO) > ((Long) iol1II1ii1i.I00IoIO0lI.I00000oIO(null)).longValue()) {
/* 89 */                    lilool0.I00l0I0l0lO1.I00ilO0.I00000oOI(jElapsedRealtime);
/* 92 */                    I010II();
/* 95 */                    I010OIo1l();
/* 102 */                   if (I01IlIoOI() && (iDelete = I01Io11IiiiO().delete("upload_queue", I01I1Oo0oll(), new String[0])) > 0) {
/* 121 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 132 */                       l01o0io1ooo0.I00lll10.I0000Il00O("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                            }
/* 135 */                   lII0I0I000I.I0000O(str);
/* 138 */                   I010II();
/* 141 */                   I010OIo1l();
                            try {
/* 148 */                       int iI010o0o0oO = l0olllo1i.I00iio.I010o0o0oO(str, iol1II1ii1i.I001lIiIIo1O);
/* 152 */                       if (iI010o0o0oO > 0) {
/* 168 */                           I01Io11IiiiO().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iI010o0o0oO)});
                                }
                            } catch (SQLiteException e) {
/* 173 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 184 */                       l01o0io1ooo0.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Error deleting over the limit queued batches. appId", e);
                            }
                        }
                    }
/* 189 */           ArrayList arrayList = new ArrayList();
/* 204 */           for (Map.Entry entry : map.entrySet()) {
/* 216 */               String str3 = (String) entry.getKey();
/* 222 */               String str4 = (String) entry.getValue();
/* 245 */               StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
/* 248 */               sb.append(str3);
/* 253 */               sb.append("=");
/* 256 */               sb.append(str4);
/* 263 */               arrayList.add(sb.toString());
                    }
/* 267 */           byte[] bArrI00000oIO = l0oiii0.I00000oIO();
/* 273 */           ContentValues contentValues = new ContentValues();
/* 278 */           contentValues.put("app_id", str);
/* 283 */           contentValues.put("measurement_batch", bArrI00000oIO);
/* 290 */           contentValues.put("upload_uri", str2);
/* 301 */           contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
/* 314 */           contentValues.put("upload_type", Integer.valueOf(lioooo.I00iOIl));
/* 317 */           Iioi0lilII iioi0lilII2 = l0olllo1i.I00li1OI;
/* 319 */           l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 321 */           iioi0lilII2.getClass();
/* 334 */           contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
/* 343 */           contentValues.put("retry_count", (Integer) 0);
/* 346 */           if (l != null) {
/* 350 */               contentValues.put("associated_row_id", l);
                    }
                    try {
/* 359 */               long jInsert = I01Io11IiiiO().insert("upload_queue", null, contentValues);
/* 365 */               if (jInsert != -1) {
/* 380 */                   return jInsert;
                        }
/* 367 */               l0olllO1i.I000II(l01o0io1ooo02);
/* 374 */               l01o0io1ooo02.I00ilO0.I0000Il00O("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
/* 353 */               return -1L;
                    } catch (SQLiteException e2) {
/* 382 */               l0olllO1i.I000II(l01o0io1ooo02);
/* 389 */               l01o0io1ooo02.I00ilO0.I0000O(str, "Error storing MeasurementBatch to upload_queue. appId", e2);
/* 353 */               return -1L;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
                public final List I010l10O(String str, liIlli liilli, int i) {
                    ?? arrayList;
/* 1 */             lII0I0I000I.I0000O(str);
/* 4 */             I010II();
/* 7 */             I010OIo1l();
/* 14 */            Cursor cursorQuery = null;
                    try {
                        try {
/* 15 */                    SQLiteDatabase sQLiteDatabaseI01Io11IiiiO = I01Io11IiiiO();
/* 41 */                    String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
/* 49 */                    String strI01II10 = I01II10(liilli.I00iOIl);
/* 53 */                    String strI01I1Oo0oll = I01I1Oo0oll();
/* 70 */                    StringBuilder sb = new StringBuilder(strI01II10.length() + 17 + strI01I1Oo0oll.length());
/* 73 */                    sb.append("app_id=?");
/* 76 */                    sb.append(strI01II10);
/* 79 */                    sb.append(" AND NOT ");
/* 82 */                    sb.append(strI01I1Oo0oll);
/* 106 */                   cursorQuery = sQLiteDatabaseI01Io11IiiiO.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? String.valueOf(i) : null);
/* 112 */                   arrayList = new ArrayList();
/* 119 */                   while (cursorQuery.moveToNext()) {
/* 172 */                       liloI0Io liloi0ioI01I0Iioooo0 = I01I0Iioooo0(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
/* 176 */                       if (liloi0ioI01I0Iioooo0 != null) {
/* 178 */                           arrayList.add(liloi0ioI01I0Iioooo0);
                                }
                            }
                        } catch (SQLiteException e) {
/* 191 */                   l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 193 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 202 */                   l01o0io1ooo0.I00ilO0.I0000O(str, "Error to querying MeasurementBatch from upload_queue. appId", e);
/* 205 */                   arrayList = Collections.EMPTY_LIST;
                        }
/* 212 */               return arrayList;
                    } finally {
/* 213 */               if (cursorQuery != null) {
/* 215 */                   cursorQuery.close();
                        }
                    }
                }

                public final boolean I010l1O(String str) {
/* 3 */             lIoOOO[] liooooArr = {lIoOOO.GOOGLE_SIGNAL};
/* 10 */            ArrayList arrayList = new ArrayList(1);
/* 22 */            arrayList.add(Integer.valueOf(liooooArr[0].I00iOIl));
/* 25 */            String strI01II10 = I01II10(arrayList);
/* 29 */            String strI01I1Oo0oll = I01I1Oo0oll();
                    return I011iO(IIl001iO0Io.I00100o1O0lo(new StringBuilder((strI01II10.length() + 61) + strI01I1Oo0oll.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strI01II10, " AND NOT ", strI01I1Oo0oll), new String[]{str}) != 0;
                }

                public final void I010l1ol111(Long l) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             I010II();
/* 8 */             I010OIo1l();
                    try {
/* 32 */                if (I01Io11IiiiO().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
/* 34 */                    l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 36 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 43 */                    l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("Deleted fewer rows from upload_queue than expected");
                        }
                    } catch (SQLiteException e) {
/* 50 */                l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 52 */                l0olllO1i.I000II(l01o0io1ooo02);
/* 59 */                l01o0io1ooo02.I00ilO0.I0000Il00O("Failed to delete a MeasurementBatch in a upload_queue table", e);
/* 77 */                throw e;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
                /* JADX WARN: Type inference failed for: r1v0 */
                /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r1v2 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final String I010lI0oi() throws Throwable {
                    SQLiteException e;
                    Cursor cursorRawQuery;
/* 1 */             SQLiteDatabase sQLiteDatabaseI01Io11IiiiO = I01Io11IiiiO();
/* 5 */             ?? r1 = 0;
                    try {
                        try {
/* 8 */                     cursorRawQuery = sQLiteDatabaseI01Io11IiiiO.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                            try {
/* 16 */                        if (cursorRawQuery.moveToFirst()) {
/* 19 */                            String string = cursorRawQuery.getString(0);
/* 23 */                            cursorRawQuery.close();
/* 26 */                            return string;
                                }
                            } catch (SQLiteException e2) {
/* 29 */                        e = e2;
/* 42 */                        l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 44 */                        l0olllO1i.I000II(l01o0io1ooo0);
/* 51 */                        l01o0io1ooo0.I00ilO0.I0000Il00O("Database error getting next bundle app id", e);
/* 54 */                        if (cursorRawQuery != null) {
                                }
/* 5 */                         return null;
                            }
                        } catch (Throwable th) {
/* 27 */                    th = th;
/* 31 */                    r1 = sQLiteDatabaseI01Io11IiiiO;
/* 60 */                    if (r1 != 0) {
/* 62 */                        r1.close();
                            }
/* 110 */                   throw th;
                        }
                    } catch (SQLiteException e3) {
/* 36 */                e = e3;
/* 37 */                cursorRawQuery = null;
                    } catch (Throwable th2) {
/* 33 */                th = th2;
/* 60 */                if (r1 != 0) {
                        }
/* 110 */               throw th;
                    }
/* 54 */            if (cursorRawQuery != null) {
/* 56 */                cursorRawQuery.close();
                    }
/* 5 */             return null;
                }

                public final void I010o0o0oO(long j) {
/* 1 */             I010II();
/* 4 */             I010OIo1l();
                    try {
/* 28 */                if (I01Io11IiiiO().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
                        } else {
/* 38 */                    throw new SQLiteException("Deleted fewer rows from queue than expected");
                        }
                    } catch (SQLiteException e) {
/* 44 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 46 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 53 */                l01o0io1ooo0.I00ilO0.I0000Il00O("Failed to delete a bundle in a queue table", e);
/* 77 */                throw e;
                    }
                }

                public final void I010oio1OO0() {
/* 1 */             I010II();
/* 4 */             I010OIo1l();
/* 11 */            if (I01IlIoOI()) {
/* 15 */                lilOOl0 lilool0 = this.I00iiI;
/* 21 */                long jI00000oIO = lilool0.I00l0I0l0lO1.I00ilI0I1.I00000oIO();
/* 27 */                l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 31 */                l0olllo1i.I00li1OI.getClass();
/* 34 */                long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 59 */                if (Math.abs(jElapsedRealtime - jI00000oIO) > ((Long) iol1II1ii1i.I00IoIO0lI.I00000oIO(null)).longValue()) {
/* 65 */                    lilool0.I00l0I0l0lO1.I00ilI0I1.I00000oOI(jElapsedRealtime);
/* 68 */                    I010II();
/* 71 */                    I010OIo1l();
/* 78 */                    if (I01IlIoOI()) {
/* 80 */                        SQLiteDatabase sQLiteDatabaseI01Io11IiiiO = I01Io11IiiiO();
/* 86 */                        l0olllo1i.I00li1OI.getClass();
/* 121 */                       int iDelete = sQLiteDatabaseI01Io11IiiiO.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) iol1II1ii1i.I00O0o1oo.I00000oIO(null)).longValue())});
/* 125 */                       if (iDelete > 0) {
/* 127 */                           l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 129 */                           l0olllO1i.I000II(l01o0io1ooo0);
/* 140 */                           l01o0io1ooo0.I00lll10.I0000Il00O("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                                }
                            }
                        }
                    }
                }

                public final void I01101IOlO(ArrayList arrayList) throws SQLException {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             I010II();
/* 8 */             I010OIo1l();
/* 11 */            lII0I0I000I.I000II(arrayList);
/* 18 */            if (arrayList.size() == 0) {
/* 150 */               I000II.I000iOII("Given Integer is zero");
/* 168 */               return;
                    }
/* 28 */            if (I01IlIoOI()) {
/* 33 */                String strJoin = TextUtils.join(",", arrayList);
/* 56 */                String strI0010I0i = IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
/* 88 */                if (I011iO(IIlIOloOOO.I0010I0i(new StringBuilder(strI0010I0i.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strI0010I0i, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
/* 90 */                    l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 92 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 99 */                    l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("The number of upload retries exceeds the limit. Will remain unchanged.");
                        }
                        try {
/* 102 */                   SQLiteDatabase sQLiteDatabaseI01Io11IiiiO = I01Io11IiiiO();
/* 114 */                   StringBuilder sb = new StringBuilder(strI0010I0i.length() + 127);
/* 117 */                   sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
/* 120 */                   sb.append(strI0010I0i);
/* 123 */                   sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
/* 130 */                   sQLiteDatabaseI01Io11IiiiO.execSQL(sb.toString());
                        } catch (SQLiteException e) {
/* 135 */                   l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 137 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 144 */                   l01o0io1ooo02.I00ilO0.I0000Il00O("Error incrementing retry count. error", e);
                        }
                    }
                }

                public final void I01101olii(Long l) throws SQLException {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             I010II();
/* 8 */             I010OIo1l();
/* 23 */            if (I01IlIoOI()) {
/* 38 */                StringBuilder sb = new StringBuilder(l.toString().length() + 86);
/* 43 */                sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
/* 46 */                sb.append(l);
/* 51 */                sb.append(" AND retry_count =  2147483647 LIMIT 1");
/* 67 */                if (I011iO(sb.toString(), null) > 0) {
/* 69 */                    l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 71 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 78 */                    l01o0io1ooo0.I00l0I0l0lO1.I00000oOI("The number of upload retries exceeds the limit. Will remain unchanged.");
                        }
                        try {
/* 81 */                    SQLiteDatabase sQLiteDatabaseI01Io11IiiiO = I01Io11IiiiO();
/* 87 */                    l0olllo1i.I00li1OI.getClass();
/* 90 */                    long jCurrentTimeMillis = System.currentTimeMillis();
/* 106 */                   StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
/* 109 */                   sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
/* 112 */                   sb2.append(jCurrentTimeMillis);
/* 115 */                   String string = sb2.toString();
/* 138 */                   StringBuilder sb3 = new StringBuilder(string.length() + 34 + l.toString().length() + 29);
/* 141 */                   sb3.append("UPDATE upload_queue");
/* 144 */                   sb3.append(string);
/* 147 */                   sb3.append(" WHERE rowid = ");
/* 150 */                   sb3.append(l);
/* 153 */                   sb3.append(" AND retry_count < 2147483647");
/* 160 */                   sQLiteDatabaseI01Io11IiiiO.execSQL(sb3.toString());
                        } catch (SQLiteException e) {
/* 165 */                   l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 167 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 174 */                   l01o0io1ooo02.I00ilO0.I0000Il00O("Error incrementing retry count. error", e);
                        }
                    }
                }

                public final Object I0110OiO(Cursor cursor, int i) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             int type = cursor.getType(i);
/* 10 */            if (type == 0) {
/* 77 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 79 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 86 */                l01o0io1ooo0.I00ilO0.I00000oOI("Loaded invalid null value from database");
/* 9 */                 return null;
                    }
/* 13 */            if (type == 1) {
/* 72 */                return Long.valueOf(cursor.getLong(i));
                    }
/* 16 */            if (type == 2) {
/* 63 */                return Double.valueOf(cursor.getDouble(i));
                    }
/* 19 */            if (type == 3) {
/* 54 */                return cursor.getString(i);
                    }
/* 22 */            if (type != 4) {
/* 24 */                l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 26 */                l0olllO1i.I000II(l01o0io1ooo02);
/* 37 */                l01o0io1ooo02.I00ilO0.I0000Il00O("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
/* 9 */                 return null;
                    }
/* 41 */            l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 43 */            l0olllO1i.I000II(l01o0io1ooo03);
/* 50 */            l01o0io1ooo03.I00ilO0.I00000oOI("Loaded invalid blob type value, ignoring it");
/* 9 */             return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
                /* JADX WARN: Removed duplicated region for block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final long I0110o(String str) {
                    long j;
                    ContentValues contentValues;
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 7 */             lII0I0I000I.I0000O(str);
/* 12 */            lII0I0I000I.I0000O("first_open_count");
/* 15 */            I010II();
/* 18 */            I010OIo1l();
/* 21 */            SQLiteDatabase sQLiteDatabaseI01Io11IiiiO = I01Io11IiiiO();
/* 25 */            sQLiteDatabaseI01Io11IiiiO.beginTransaction();
/* 28 */            long j2 = 0;
                    try {
                        try {
/* 34 */                    StringBuilder sb = new StringBuilder(48);
/* 37 */                    sb.append("select first_open_count from app2 where app_id=?");
/* 48 */                    j = -1;
/* 50 */                    long jI011iiii0i = I011iiii0i(sb.toString(), new String[]{str}, -1L);
/* 60 */                    if (jI011iiii0i == -1) {
/* 64 */                        ContentValues contentValues2 = new ContentValues();
/* 67 */                        contentValues2.put("app_id", str);
/* 75 */                        contentValues2.put("first_open_count", (Integer) 0);
/* 80 */                        contentValues2.put("previous_install_count", (Integer) 0);
/* 91 */                        if (sQLiteDatabaseI01Io11IiiiO.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
/* 93 */                            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 95 */                            l0olllO1i.I000II(l01o0io1ooo0);
/* 106 */                           l01o0io1ooo0.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Failed to insert column (got -1). appId", "first_open_count");
                                } else {
/* 114 */                           jI011iiii0i = 0;
                                    try {
/* 117 */                               contentValues = new ContentValues();
/* 120 */                               contentValues.put("app_id", str);
/* 130 */                               contentValues.put("first_open_count", Long.valueOf(1 + jI011iiii0i));
/* 146 */                               if (sQLiteDatabaseI01Io11IiiiO.update("app2", contentValues, "app_id = ?", new String[]{str}) != 0) {
/* 148 */                                   l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 150 */                                   l0olllO1i.I000II(l01o0io1ooo02);
/* 161 */                                   l01o0io1ooo02.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Failed to update column (got 0). appId", "first_open_count");
                                        } else {
/* 167 */                                   sQLiteDatabaseI01Io11IiiiO.setTransactionSuccessful();
/* 170 */                                   j = jI011iiii0i;
                                        }
                                    } catch (SQLiteException e) {
/* 165 */                               e = e;
/* 172 */                               j2 = jI011iiii0i;
/* 173 */                               l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 175 */                               l0olllO1i.I000II(l01o0io1ooo03);
/* 186 */                               l01o0io1ooo03.I00ilO0.I0000oI00("Error inserting column. appId", l01O0IO1ooO0.I010ioo(str), "first_open_count", e);
/* 189 */                               j = j2;
/* 193 */                               return j;
                                    }
                                }
                            } else {
/* 117 */                       contentValues = new ContentValues();
/* 120 */                       contentValues.put("app_id", str);
/* 130 */                       contentValues.put("first_open_count", Long.valueOf(1 + jI011iiii0i));
/* 146 */                       if (sQLiteDatabaseI01Io11IiiiO.update("app2", contentValues, "app_id = ?", new String[]{str}) != 0) {
                                }
                            }
                        } catch (SQLiteException e2) {
/* 112 */                   e = e2;
                        }
/* 193 */               return j;
                    } finally {
/* 194 */               sQLiteDatabaseI01Io11IiiiO.endTransaction();
                    }
                }

                public final boolean I0111i(String str, String str2) {
                    return I011iO("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
                }

                public final void I011IO1I11OI(List list) {
/* 1 */             lII0I0I000I.I000II(list);
/* 4 */             I010II();
/* 7 */             I010OIo1l();
/* 14 */            StringBuilder sb = new StringBuilder("rowid in (");
/* 22 */            for (int i = 0; i < list.size(); i++) {
/* 24 */                if (i != 0) {
/* 28 */                    sb.append(",");
                        }
/* 41 */                sb.append(((Long) list.get(i)).longValue());
                    }
/* 49 */            sb.append(")");
/* 63 */            int iDelete = I01Io11IiiiO().delete("raw_events", sb.toString(), null);
/* 71 */            if (iDelete != list.size()) {
/* 77 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 79 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 98 */                l01o0io1ooo0.I00ilO0.I0000O(Integer.valueOf(iDelete), "Deleted fewer rows from raw events table than expected", Integer.valueOf(list.size()));
                    }
                }

                public final long I011IOil(String str) {
/* 1 */             lII0I0I000I.I0000O(str);
/* 12 */            return I011iiii0i("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
                }

                public final void I011Ill(String str, Long l, long j, l0l1iIIOl l0l1iiiol) {
/* 1 */             I010II();
/* 4 */             I010OIo1l();
/* 7 */             lII0I0I000I.I000II(l0l1iiiol);
/* 10 */            lII0I0I000I.I0000O(str);
/* 15 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 17 */            byte[] bArrI00000oIO = l0l1iiiol.I00000oIO();
/* 21 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 23 */            l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 25 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 43 */            l01o0io1ooo0.I00lll10.I0000O(l0olllo1i.I00l0OO0IO.I00000oIO(str), "Saving complex main event, appId, data size", Integer.valueOf(bArrI00000oIO.length));
/* 48 */            ContentValues contentValues = new ContentValues();
/* 53 */            contentValues.put("app_id", str);
/* 58 */            contentValues.put("event_id", l);
/* 67 */            contentValues.put("children_to_process", Long.valueOf(j));
/* 72 */            contentValues.put("main_event", bArrI00000oIO);
                    try {
/* 91 */                if (I01Io11IiiiO().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
/* 93 */                    l0olllO1i.I000II(l01o0io1ooo02);
/* 104 */                   l01o0io1ooo02.I00ilO0.I0000Il00O("Failed to insert complex main event (got -1). appId", l01O0IO1ooO0.I010ioo(str));
                        }
                    } catch (SQLiteException e) {
/* 111 */               l0olllO1i.I000II(l01o0io1ooo02);
/* 122 */               l01o0io1ooo02.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Error storing complex main event. appId", e);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:122:0x013f A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:50:0x011d  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
                /* JADX WARN: Removed duplicated region for block: B:81:0x01ec  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x01fd  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x0203  */
                /* JADX WARN: Removed duplicated region for block: B:96:0x02cc A[Catch: SQLiteException -> 0x02e8, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x02e8, blocks: (B:94:0x02b1, B:96:0x02cc), top: B:107:0x02b1 }] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I011Io0I1ioi(String str, Long l, String str2, Bundle bundle) {
                    O1Il01 o1Il01;
                    String string;
                    String strI001iOo1i0O;
                    Bundle bundle2;
                    l01O0IO1ooO0 l01o0io1ooo0;
                    long jUpdate;
                    l100ll0OOIoO l100ll0ooioo;
                    Cursor cursorQuery;
/* 1 */             iOl1lOo1IO iol1loo1io = this;
/* 3 */             String str3 = str;
/* 8 */             l0olllO1i l0olllo1i = (l0olllO1i) iol1loo1io.I00iOIl;
/* 10 */            lII0I0I000I.I000II(bundle);
/* 13 */            iol1loo1io.I010II();
/* 16 */            iol1loo1io.I010OIo1l();
/* 21 */            if (l != null) {
/* 25 */                long jLongValue = l.longValue();
/* 29 */                o1Il01 = new O1Il01();
/* 32 */                o1Il01.I00iiO = iol1loo1io;
/* 34 */                lII0I0I000I.I0000O(str3);
/* 37 */                o1Il01.I00iiI = str3;
/* 53 */                o1Il01.I00iOIl = iol1loo1io.I011iiii0i("select rowid from raw_events where app_id = ? and timestamp < ? order by rowid desc limit 1", new String[]{str3, String.valueOf(jLongValue)}, -1L);
/* 55 */                VarHandle.storeStoreFence();
                    } else {
/* 62 */                o1Il01 = new O1Il01();
/* 65 */                o1Il01.I00iiO = iol1loo1io;
/* 67 */                lII0I0I000I.I0000O(str3);
/* 70 */                o1Il01.I00iiI = str3;
/* 72 */                o1Il01.I00iOIl = -1L;
/* 74 */                VarHandle.storeStoreFence();
                    }
/* 58 */            O1Il01 o1Il012 = o1Il01;
/* 78 */            List<iOOiOo0iiOl> listI000iOII = o1Il012.I000iOII();
/* 86 */            while (!listI000iOII.isEmpty()) {
/* 96 */                for (iOOiOo0iiOl iooioo0iiol : listI000iOII) {
/* 109 */                   if (!TextUtils.isEmpty(str2)) {
/* 113 */                       Cursor cursor = null;
/* 113 */                       l100ll0OOIoO l100ll0ooioo2 = null;
/* 113 */                       Cursor cursor2 = null;
                                try {
                                    try {
/* 144 */                               cursorQuery = iol1loo1io.I01Io11IiiiO().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, Long.toString(iooioo0iiol.I00000oOI)}, null, null, "rowid", "2");
                                    } catch (Throwable th) {
/* 258 */                               th = th;
                                    }
                                } catch (SQLiteException e) {
/* 260 */                           e = e;
/* 261 */                           l100ll0ooioo = null;
                                }
                                try {
                                    try {
                                    } catch (SQLiteException e2) {
/* 177 */                               e = e2;
/* 256 */                               l100ll0ooioo = null;
                                    }
/* 152 */                           if (cursorQuery.moveToFirst()) {
                                        try {
/* 199 */                                   l100ll0ooioo = (l100ll0OOIoO) ((l0ooIi1oOO) lio010i.I01IlIoOI(l100ll0OOIoO.I00OilO00Il(), cursorQuery.getBlob(0))).I0000oI00();
                                            try {
/* 205 */                                       if (cursorQuery.moveToNext()) {
/* 207 */                                           l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 209 */                                           l0olllO1i.I000II(l01o0io1ooo02);
/* 220 */                                           l01o0io1ooo02.I00l0I0l0lO1.I0000Il00O("Get multiple raw event metadata records, expected one. appId", l01O0IO1ooO0.I010ioo(str3));
                                                }
/* 226 */                                       cursorQuery.close();
/* 229 */                                       cursorQuery.close();
                                            } catch (SQLiteException e3) {
/* 224 */                                       e = e3;
/* 234 */                                       cursor = cursorQuery;
/* 262 */                                       l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 264 */                                       l0olllO1i.I000II(l01o0io1ooo03);
/* 275 */                                       l01o0io1ooo03.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str3), "Data loss. Error selecting raw event. appId", e);
/* 278 */                                       if (cursor != null) {
/* 280 */                                           cursor.close();
                                                }
/* 232 */                                       l100ll0ooioo2 = l100ll0ooioo;
/* 284 */                                       if (l100ll0ooioo2 != null) {
                                                }
/* 329 */                                       lilOOl0 lilool0 = iol1loo1io.I00iiI;
/* 331 */                                       lio010i lio010iVar = lilool0.I00io1l;
/* 333 */                                       lilOOl0.I00O0o1oo(lio010iVar);
/* 336 */                                       l0l1iIIOl l0l1iiiol = iooioo0iiol.I0000O;
/* 340 */                                       Bundle bundle3 = new Bundle();
/* 355 */                                       while (r7.hasNext()) {
                                                }
/* 480 */                                       string = bundle3.getString("_o");
/* 484 */                                       bundle3.remove("_o");
/* 487 */                                       strI001iOo1i0O = l0l1iiiol.I001iOo1i0O();
/* 491 */                                       if (string == null) {
                                                }
/* 495 */                                       lioil0ilIOi lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 497 */                                       l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i.I00ilO0;
/* 499 */                                       l0olllO1i.I0000oI00(lioil0ilioi);
/* 508 */                                       if (strI001iOo1i0O.equals("_cmp")) {
                                                }
/* 513 */                                       iOOiOo0iiOl iooioo0iiol2 = iooioo0iiol;
/* 559 */                                       lioil0ilioi.I0110OiO(bundle3, bundle2);
/* 595 */                                       ii00010lll1 ii00010lll1Var = new ii00010lll1((l0olllO1i) iol1loo1io.I00iOIl, string, str3, l0l1iiiol.I001iOo1i0O(), l0l1iiiol.I001lIiIIo1O(), l0l1iiiol.I00IioO0OiOi(), l0l1iiiol.I001lloI(), bundle3);
/* 598 */                                       long j = iooioo0iiol2.I00000oIO;
/* 600 */                                       long j2 = iooioo0iiol2.I00000oOI;
/* 602 */                                       boolean z = iooioo0iiol2.I0000Il00O;
/* 604 */                                       I010II();
/* 607 */                                       I010OIo1l();
/* 610 */                                       String str4 = ii00010lll1Var.I00000oIO;
/* 612 */                                       lII0I0I000I.I0000O(str4);
/* 615 */                                       lio010i lio010iVar2 = lilool0.I00io1l;
/* 617 */                                       lilOOl0.I00O0o1oo(lio010iVar2);
/* 624 */                                       byte[] bArrI00000oIO = lio010iVar2.I011lOIoo0l(ii00010lll1Var).I00000oIO();
/* 630 */                                       ContentValues contentValues = new ContentValues();
/* 635 */                                       contentValues.put("app_id", str4);
/* 642 */                                       contentValues.put("name", ii00010lll1Var.I00000oOI);
/* 653 */                                       contentValues.put("timestamp", Long.valueOf(ii00010lll1Var.I0000O));
/* 662 */                                       contentValues.put("metadata_fingerprint", Long.valueOf(j2));
/* 667 */                                       contentValues.put("data", bArrI00000oIO);
/* 676 */                                       contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
/* 687 */                                       contentValues.put("elapsed_time", Long.valueOf(ii00010lll1Var.I0000oI00));
/* 706 */                                       jUpdate = I01Io11IiiiO().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
/* 715 */                                       if (jUpdate != 1) {
                                                }
/* 737 */                                       iol1loo1io = this;
/* 739 */                                       str3 = str;
                                            }
/* 232 */                                   l100ll0ooioo2 = l100ll0ooioo;
                                        } catch (IOException e4) {
/* 237 */                                   l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i.I00ilO0;
/* 239 */                                   l0olllO1i.I000II(l01o0io1ooo05);
/* 250 */                                   l01o0io1ooo05.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str3), "Data loss. Failed to merge raw event metadata. appId", e4);
                                        }
/* 284 */                               if (l100ll0ooioo2 != null) {
/* 290 */                                   Iterator it = l100ll0ooioo2.I01Olioli().iterator();
/* 298 */                                   while (it.hasNext()) {
/* 316 */                                       if (((l1IOl1iI00l) it.next()).I001IO000().equals(str2)) {
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
/* 154 */                               l01O0IO1ooO0 l01o0io1ooo06 = l0olllo1i.I00ilO0;
/* 156 */                               l0olllO1i.I000II(l01o0io1ooo06);
/* 167 */                               l01o0io1ooo06.I00ilO0.I0000Il00O("Raw event metadata record is missing. appId", l01O0IO1ooO0.I010ioo(str3));
                                    }
/* 170 */                           cursorQuery.close();
/* 284 */                           if (l100ll0ooioo2 != null) {
                                    }
                                } catch (Throwable th2) {
/* 175 */                           th = th2;
/* 254 */                           cursor2 = cursorQuery;
/* 323 */                           if (cursor2 != null) {
/* 325 */                               cursor2.close();
                                    }
/* 328 */                           throw th;
                                }
                            }
/* 329 */                   lilOOl0 lilool02 = iol1loo1io.I00iiI;
/* 331 */                   lio010i lio010iVar3 = lilool02.I00io1l;
/* 333 */                   lilOOl0.I00O0o1oo(lio010iVar3);
/* 336 */                   l0l1iIIOl l0l1iiiol2 = iooioo0iiol.I0000O;
/* 340 */                   Bundle bundle32 = new Bundle();
/* 355 */                   for (l0lliIlIO l0lliilio : l0l1iiiol2.I001IO000()) {
/* 367 */                       if (l0lliilio.I001lllioOl()) {
/* 377 */                           bundle32.putDouble(l0lliilio.I001IIilI0O(), l0lliilio.I001lloI());
                                } else if (l0lliilio.I001l0I00()) {
/* 395 */                           bundle32.putFloat(l0lliilio.I001IIilI0O(), l0lliilio.I001lIiIIo1O());
                                } else if (l0lliilio.I001i1lo1io()) {
/* 413 */                           bundle32.putLong(l0lliilio.I001IIilI0O(), l0lliilio.I001iOo1i0O());
                                } else if (l0lliilio.I001IO000()) {
/* 431 */                           bundle32.putString(l0lliilio.I001IIilI0O(), l0lliilio.I001i1O0Ol());
                                } else if (l0lliilio.I00II0Ol1O0l().isEmpty()) {
/* 465 */                           l01O0IO1ooO0 l01o0io1ooo07 = ((l0olllO1i) lio010iVar3.I00iOIl).I00ilO0;
/* 467 */                           l0olllO1i.I000II(l01o0io1ooo07);
/* 474 */                           l01o0io1ooo07.I00ilO0.I0000Il00O("Unexpected parameter type for parameter", l0lliilio);
                                } else {
/* 457 */                           bundle32.putParcelableArray(l0lliilio.I001IIilI0O(), lio010i.I01Ilo0i(l0lliilio.I00II0Ol1O0l()));
                                }
                            }
/* 480 */                   string = bundle32.getString("_o");
/* 484 */                   bundle32.remove("_o");
/* 487 */                   strI001iOo1i0O = l0l1iiiol2.I001iOo1i0O();
/* 491 */                   if (string == null) {
/* 493 */                       string = "";
                            }
/* 495 */                   lioil0ilIOi lioil0ilioi2 = l0olllo1i.I00l0I0l0lO1;
/* 497 */                   l01O0IO1ooO0 l01o0io1ooo042 = l0olllo1i.I00ilO0;
/* 499 */                   l0olllO1i.I0000oI00(lioil0ilioi2);
/* 508 */                   if (strI001iOo1i0O.equals("_cmp")) {
/* 510 */                       bundle2 = bundle;
                            } else {
/* 520 */                       bundle2 = new Bundle(bundle);
/* 535 */                       for (String str5 : bundle.keySet()) {
/* 543 */                           iOOiOo0iiOl iooioo0iiol3 = iooioo0iiol;
/* 551 */                           if (str5.startsWith("gad_")) {
/* 553 */                               bundle2.remove(str5);
                                    }
/* 556 */                           iooioo0iiol = iooioo0iiol3;
                                }
                            }
/* 513 */                   iOOiOo0iiOl iooioo0iiol22 = iooioo0iiol;
/* 559 */                   lioil0ilioi2.I0110OiO(bundle32, bundle2);
/* 595 */                   ii00010lll1 ii00010lll1Var2 = new ii00010lll1((l0olllO1i) iol1loo1io.I00iOIl, string, str3, l0l1iiiol2.I001iOo1i0O(), l0l1iiiol2.I001lIiIIo1O(), l0l1iiiol2.I00IioO0OiOi(), l0l1iiiol2.I001lloI(), bundle32);
/* 598 */                   long j3 = iooioo0iiol22.I00000oIO;
/* 600 */                   long j22 = iooioo0iiol22.I00000oOI;
/* 602 */                   boolean z2 = iooioo0iiol22.I0000Il00O;
/* 604 */                   I010II();
/* 607 */                   I010OIo1l();
/* 610 */                   String str42 = ii00010lll1Var2.I00000oIO;
/* 612 */                   lII0I0I000I.I0000O(str42);
/* 615 */                   lio010i lio010iVar22 = lilool02.I00io1l;
/* 617 */                   lilOOl0.I00O0o1oo(lio010iVar22);
/* 624 */                   byte[] bArrI00000oIO2 = lio010iVar22.I011lOIoo0l(ii00010lll1Var2).I00000oIO();
/* 630 */                   ContentValues contentValues2 = new ContentValues();
/* 635 */                   contentValues2.put("app_id", str42);
/* 642 */                   contentValues2.put("name", ii00010lll1Var2.I00000oOI);
/* 653 */                   contentValues2.put("timestamp", Long.valueOf(ii00010lll1Var2.I0000O));
/* 662 */                   contentValues2.put("metadata_fingerprint", Long.valueOf(j22));
/* 667 */                   contentValues2.put("data", bArrI00000oIO2);
/* 676 */                   contentValues2.put("realtime", Integer.valueOf(z2 ? 1 : 0));
/* 687 */                   contentValues2.put("elapsed_time", Long.valueOf(ii00010lll1Var2.I0000oI00));
                            try {
/* 706 */                       jUpdate = I01Io11IiiiO().update("raw_events", contentValues2, "rowid = ?", new String[]{String.valueOf(j3)});
/* 715 */                       if (jUpdate != 1) {
/* 717 */                           l0olllO1i.I000II(l01o0io1ooo042);
/* 720 */                           l01o0io1ooo0 = l01o0io1ooo042;
                                    try {
/* 734 */                               l01o0io1ooo0.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str42), "Failed to update raw event. appId, updatedRows", Long.valueOf(jUpdate));
                                    } catch (SQLiteException e5) {
/* 743 */                               e = e5;
/* 748 */                               l0olllO1i.I000II(l01o0io1ooo0);
/* 761 */                               l01o0io1ooo0.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(ii00010lll1Var2.I00000oIO), "Error updating raw event. appId", e);
/* 737 */                               iol1loo1io = this;
/* 739 */                               str3 = str;
                                    }
                                }
                            } catch (SQLiteException e6) {
/* 745 */                       e = e6;
/* 746 */                       l01o0io1ooo0 = l01o0io1ooo042;
                            }
/* 737 */                   iol1loo1io = this;
/* 739 */                   str3 = str;
                        }
/* 765 */               listI000iOII = o1Il012.I000iOII();
/* 769 */               iol1loo1io = this;
/* 771 */               str3 = str;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
                /* JADX WARN: Type inference failed for: r3v0, types: [I01O1lIi, iOl1lOo1IO, liOO10o0] */
                /* JADX WARN: Type inference failed for: r3v3 */
                /* JADX WARN: Type inference failed for: r3v4 */
                /* JADX WARN: Type inference failed for: r3v5 */
                /* JADX WARN: Type inference failed for: r3v7, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final l1ioIO011Oo I011Ol0(String str) throws Throwable {
                    Throwable th;
                    SQLiteException e;
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             lII0I0I000I.I000II(str);
/* 8 */             I010II();
/* 11 */            I010OIo1l();
/* 20 */            Cursor cursor = null;
/* 20 */            l1ioio011ooI0000Il00O = null;
/* 20 */            l1ioio011ooI0000Il00O = null;
/* 20 */            l1ioIO011Oo l1ioio011ooI0000Il00O = null;
                    try {
                        try {
/* 25 */                    this = I01Io11IiiiO().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
                            try {
/* 33 */                        if (this.moveToFirst()) {
/* 65 */                            l1ioio011ooI0000Il00O = l1ioIO011Oo.I0000Il00O(this.getInt(1), this.getString(0));
                                } else {
/* 35 */                            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 37 */                            l0olllO1i.I000II(l01o0io1ooo0);
/* 44 */                            l01o0io1ooo0.I00lll10.I00000oOI("No data found");
                                }
                            } catch (SQLiteException e2) {
/* 53 */                        e = e2;
/* 78 */                        l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 80 */                        l0olllO1i.I000II(l01o0io1ooo02);
/* 87 */                        l01o0io1ooo02.I00ilO0.I0000Il00O("Error querying database.", e);
/* 90 */                        if (this != 0) {
/* 47 */                            this.close();
                                }
                                if (l1ioio011ooI0000Il00O != null) {
                                }
                            }
                        } catch (Throwable th2) {
/* 51 */                    th = th2;
/* 70 */                    cursor = this;
/* 99 */                    if (cursor != null) {
/* 101 */                       cursor.close();
                            }
/* 168 */                   throw th;
                        }
                    } catch (SQLiteException e3) {
/* 76 */                e = e3;
/* 77 */                this = 0;
                    } catch (Throwable th3) {
/* 73 */                th = th3;
/* 99 */                if (cursor != null) {
                        }
/* 168 */               throw th;
                    }
/* 47 */            this.close();
                    return l1ioio011ooI0000Il00O != null ? l1ioIO011Oo.I0000Il00O : l1ioio011ooI0000Il00O;
                }

                public final void I011iIOio(String str, li1l0Iiiii li1l0iiiii) {
/* 1 */             I010II();
/* 4 */             I010OIo1l();
/* 7 */             lII0I0I000I.I0000O(str);
/* 12 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 14 */            Iioi0lilII iioi0lilII = l0olllo1i.I00li1OI;
/* 16 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 18 */            iioi0lilII.getClass();
/* 21 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 25 */            iol01I0001 iol01i0001 = iol1II1ii1i.I00li1OI;
/* 38 */            long jLongValue = jCurrentTimeMillis - ((Long) iol01i0001.I00000oIO(null)).longValue();
/* 40 */            long j = li1l0iiiii.I00iiI;
/* 44 */            if (j < jLongValue || j > ((Long) iol01i0001.I00000oIO(null)).longValue() + jCurrentTimeMillis) {
/* 61 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 80 */                l01o0io1ooo0.I00l0I0l0lO1.I0000oI00("Storing trigger URI outside of the max retention time span. appId, now, timestamp", l01O0IO1ooO0.I010ioo(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
                    }
/* 83 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 90 */            l01o0io1ooo0.I00lll10.I00000oOI("Saving trigger URI");
/* 95 */            ContentValues contentValues = new ContentValues();
/* 100 */           contentValues.put("app_id", str);
/* 107 */           contentValues.put("trigger_uri", li1l0iiiii.I00iOIl);
/* 118 */           contentValues.put("source", Integer.valueOf(li1l0iiiii.I00iiO));
/* 127 */           contentValues.put("timestamp_millis", Long.valueOf(j));
                    try {
/* 144 */               if (I01Io11IiiiO().insert("trigger_uris", null, contentValues) == -1) {
/* 146 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 157 */                   l01o0io1ooo0.I00ilO0.I0000Il00O("Failed to insert trigger URI (got -1). appId", l01O0IO1ooO0.I010ioo(str));
                        }
                    } catch (SQLiteException e) {
/* 164 */               l0olllO1i.I000II(l01o0io1ooo0);
/* 175 */               l01o0io1ooo0.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Error storing trigger URI. appId", e);
                    }
                }

                public final long I011iO(String str, String[] strArr) {
/* 5 */             Cursor cursor = null;
                    try {
                        try {
/* 6 */                     Cursor cursorRawQuery = I01Io11IiiiO().rawQuery(str, strArr);
/* 14 */                    if (!cursorRawQuery.moveToFirst()) {
/* 32 */                        throw new SQLiteException("Database returned empty set");
                            }
/* 17 */                    long j = cursorRawQuery.getLong(0);
/* 21 */                    cursorRawQuery.close();
/* 24 */                    return j;
                        } catch (SQLiteException e) {
/* 40 */                    l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 42 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 49 */                    l01o0io1ooo0.I00ilO0.I0000O(str, "Database error", e);
/* 52 */                    throw e;
                        }
                    } catch (Throwable th) {
/* 53 */                if (0 != 0) {
/* 55 */                    cursor.close();
                        }
/* 106 */               throw th;
                    }
                }

                public final long I011iiii0i(String str, String[] strArr, long j) {
/* 5 */             Cursor cursorRawQuery = null;
                    try {
                        try {
/* 6 */                     cursorRawQuery = I01Io11IiiiO().rawQuery(str, strArr);
/* 14 */                    if (cursorRawQuery.moveToFirst()) {
/* 17 */                        j = cursorRawQuery.getLong(0);
                            }
/* 21 */                    cursorRawQuery.close();
/* 24 */                    return j;
                        } catch (SQLiteException e) {
/* 32 */                    l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 34 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 41 */                    l01o0io1ooo0.I00ilO0.I0000O(str, "Database error", e);
/* 44 */                    throw e;
                        }
                    } catch (Throwable th) {
/* 45 */                if (cursorRawQuery != null) {
/* 47 */                    cursorRawQuery.close();
                        }
/* 98 */                throw th;
                    }
                }

                public final String I011lIilI0lo(String str, String[] strArr) {
/* 5 */             Cursor cursorRawQuery = null;
                    try {
                        try {
/* 6 */                     cursorRawQuery = I01Io11IiiiO().rawQuery(str, strArr);
/* 14 */                    if (!cursorRawQuery.moveToFirst()) {
/* 25 */                        cursorRawQuery.close();
/* 28 */                        return "";
                            }
/* 17 */                    String string = cursorRawQuery.getString(0);
/* 21 */                    cursorRawQuery.close();
/* 24 */                    return string;
                        } catch (SQLiteException e) {
/* 38 */                    l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 40 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 47 */                    l01o0io1ooo0.I00ilO0.I0000O(str, "Database error", e);
/* 50 */                    throw e;
                        }
                    } catch (Throwable th) {
/* 51 */                if (cursorRawQuery != null) {
/* 53 */                    cursorRawQuery.close();
                        }
/* 106 */               throw th;
                    }
                }

                public final void I011lO1liO1O(ContentValues contentValues) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
                    try {
/* 11 */                SQLiteDatabase sQLiteDatabaseI01Io11IiiiO = I01Io11IiiiO();
/* 19 */                if (contentValues.getAsString("app_id") == null) {
/* 21 */                    l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 23 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 34 */                    l01o0io1ooo0.I00ioIO.I0000Il00O("Value of the primary key is not set.", l01O0IO1ooO0.I010ioo("app_id"));
/* 37 */                    return;
                        }
/* 47 */                new StringBuilder(10).append("app_id = ?");
/* 67 */                if (sQLiteDatabaseI01Io11IiiiO.update("consent_settings", contentValues, r5.toString(), new String[]{r4}) == 0 && sQLiteDatabaseI01Io11IiiiO.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
/* 81 */                    l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 83 */                    l0olllO1i.I000II(l01o0io1ooo02);
/* 98 */                    l01o0io1ooo02.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo("consent_settings"), "Failed to insert/update table (got -1). key", l01O0IO1ooO0.I010ioo("app_id"));
                        }
                    } catch (SQLiteException e) {
/* 102 */               l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 104 */               l0olllO1i.I000II(l01o0io1ooo03);
/* 119 */               l01o0io1ooo03.I00ilO0.I0000oI00("Error storing into table. key", l01O0IO1ooO0.I010ioo("consent_settings"), l01O0IO1ooO0.I010ioo("app_id"), e);
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0129  */
                /* JADX WARN: Type inference failed for: r3v3 */
                /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r3v5 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final ii01Ioio01i I011lOIoo0l(String str, String str2, String str3) throws Throwable {
                    Cursor cursorQuery;
                    Boolean boolValueOf;
/* 5 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 7 */             lII0I0I000I.I0000O(str2);
/* 10 */            lII0I0I000I.I0000O(str3);
/* 13 */            I010II();
/* 16 */            I010OIo1l();
/* 47 */            ArrayList arrayList = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
/* 50 */            ?? r3 = 0;
                    try {
                        try {
/* 76 */                    cursorQuery = I01Io11IiiiO().query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                            try {
                            } catch (SQLiteException e) {
/* 254 */                       e = e;
/* 266 */                       l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 268 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 287 */                       l01o0io1ooo0.I00ilO0.I0000oI00("Error querying events. appId", l01O0IO1ooO0.I010ioo(str2), l0olllo1i.I00l0OO0IO.I00000oIO(str3), e);
/* 290 */                       if (cursorQuery != null) {
                                }
/* 50 */                        return null;
                            }
                        } catch (Throwable th) {
/* 205 */                   th = th;
/* 260 */                   r3 = arrayList;
/* 296 */                   if (r3 != 0) {
/* 298 */                       r3.close();
                            }
/* 408 */                   throw th;
                        }
                    } catch (SQLiteException e2) {
/* 264 */               e = e2;
/* 265 */               cursorQuery = null;
                    } catch (Throwable th2) {
/* 262 */               th = th2;
/* 296 */               if (r3 != 0) {
                        }
/* 408 */               throw th;
                    }
/* 84 */            if (!cursorQuery.moveToFirst()) {
/* 290 */               if (cursorQuery != null) {
/* 292 */                   cursorQuery.close();
                        }
/* 50 */                return null;
                    }
/* 88 */            long j = cursorQuery.getLong(0);
/* 93 */            long j2 = cursorQuery.getLong(1);
/* 98 */            long j3 = cursorQuery.getLong(2);
/* 107 */           long j4 = 0;
/* 114 */           long j5 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
/* 134 */           Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
/* 154 */           Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
/* 174 */           Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
/* 185 */           if (cursorQuery.isNull(7)) {
/* 207 */               boolValueOf = null;
                    } else {
/* 198 */               boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                    }
/* 215 */           if (!cursorQuery.isNull(8)) {
/* 218 */               j4 = cursorQuery.getLong(8);
                    }
/* 228 */           ii01Ioio01i ii01ioio01i = new ii01Ioio01i(str2, str3, j, j2, j4, j3, j5, lValueOf, lValueOf2, lValueOf3, boolValueOf);
/* 235 */           if (cursorQuery.moveToNext()) {
/* 237 */               l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 239 */               l0olllO1i.I000II(l01o0io1ooo02);
/* 250 */               l01o0io1ooo02.I00ilO0.I0000Il00O("Got multiple records for event aggregates, expected one. appId", l01O0IO1ooO0.I010ioo(str2));
                    }
/* 256 */           cursorQuery.close();
/* 259 */           return ii01ioio01i;
                }

                public final void I011olOoO(String str, ii01Ioio01i ii01ioio01i) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             lII0I0I000I.I000II(ii01ioio01i);
/* 8 */             I010II();
/* 11 */            I010OIo1l();
/* 16 */            ContentValues contentValues = new ContentValues();
/* 19 */            String str2 = ii01ioio01i.I00000oIO;
/* 23 */            contentValues.put("app_id", str2);
/* 30 */            contentValues.put("name", ii01ioio01i.I00000oOI);
/* 41 */            contentValues.put("lifetime_count", Long.valueOf(ii01ioio01i.I0000Il00O));
/* 52 */            contentValues.put("current_bundle_count", Long.valueOf(ii01ioio01i.I0000O));
/* 63 */            contentValues.put("last_fire_timestamp", Long.valueOf(ii01ioio01i.I0001Ioi1lo));
/* 74 */            contentValues.put("last_bundled_timestamp", Long.valueOf(ii01ioio01i.I000II));
/* 81 */            contentValues.put("last_bundled_day", ii01ioio01i.I000O01llI0);
/* 88 */            contentValues.put("last_sampled_complex_event_id", ii01ioio01i.I000OOo1O);
/* 95 */            contentValues.put("last_sampling_rate", ii01ioio01i.I000OiO);
/* 106 */           contentValues.put("current_session_count", Long.valueOf(ii01ioio01i.I0000oI00));
/* 109 */           Boolean bool = ii01ioio01i.I000iOII;
/* 130 */           contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
                    try {
/* 146 */               if (I01Io11IiiiO().insertWithOnConflict(str, null, contentValues, 5) == -1) {
/* 148 */                   l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 150 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 161 */                   l01o0io1ooo0.I00ilO0.I0000Il00O("Failed to insert/update event aggregates (got -1). appId", l01O0IO1ooO0.I010ioo(str2));
                        }
                    } catch (SQLiteException e) {
/* 168 */               l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 170 */               l0olllO1i.I000II(l01o0io1ooo02);
/* 181 */               l01o0io1ooo02.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str2), "Error storing event aggregates. appId", e);
                    }
                }

                public final void I01I01Oolii(String str, String str2) {
/* 1 */             lII0I0I000I.I0000O(str2);
/* 4 */             I010II();
/* 7 */             I010OIo1l();
                    try {
/* 20 */                I01Io11IiiiO().delete(str, "app_id=?", new String[]{str2});
                    } catch (SQLiteException e) {
/* 29 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 31 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 42 */                l01o0io1ooo0.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str2), "Error deleting snapshot. appId", e);
                    }
                }

                public final liloI0Io I01I0Iioooo0(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
                    lIoOOO lioooo;
/* 7 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 14 */            if (TextUtils.isEmpty(str2)) {
/* 16 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 18 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 25 */                l01o0io1ooo0.I00lli11.I00000oOI("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
/* 13 */                return null;
                    }
                    try {
/* 39 */                l0o1OoOIol l0o1oooiol = (l0o1OoOIol) lio010i.I01IlIoOI(l0oiiI0.I001lIiIIo1O(), bArr);
/* 41 */                lIoOOO[] liooooArrValues = lIoOOO.values();
/* 45 */                int length = liooooArrValues.length;
/* 47 */                int i3 = 0;
                        while (true) {
/* 48 */                    if (i3 >= length) {
/* 62 */                        lioooo = lIoOOO.UNKNOWN;
                                break;
                            }
/* 50 */                    lioooo = liooooArrValues[i3];
/* 56 */                    if (lioooo.I00iOIl == i) {
                                break;
                            }
/* 59 */                    i3++;
                        }
/* 66 */                if (lioooo != lIoOOO.GOOGLE_SIGNAL && lioooo != lIoOOO.GOOGLE_SIGNAL_PENDING && i2 > 0) {
/* 76 */                    ArrayList arrayList = new ArrayList();
/* 91 */                    Iterator it = Collections.unmodifiableList(((l0oiiI0) l0o1oooiol.I00iiI).I00111O()).iterator();
/* 99 */                    while (it.hasNext()) {
/* 111 */                       l0ooIi1oOO l0ooii1ooo = (l0ooIi1oOO) ((l100ll0OOIoO) it.next()).I000OiO();
/* 113 */                       l0ooii1ooo.I0000Il00O();
/* 120 */                       ((l100ll0OOIoO) l0ooii1ooo.I00iiI).I010l10O(i2);
/* 129 */                       arrayList.add((l100ll0OOIoO) l0ooii1ooo.I0000oI00());
                            }
/* 136 */                   l0o1oooiol.I0000Il00O();
/* 143 */                   ((l0oiiI0) l0o1oooiol.I00iiI).I00IO1();
/* 146 */                   l0o1oooiol.I0000Il00O();
/* 153 */                   ((l0oiiI0) l0o1oooiol.I00iiI).I00II0oii1o(arrayList);
                        }
/* 158 */               HashMap map = new HashMap();
/* 161 */               if (str3 != null) {
/* 165 */                   String[] strArrSplit = str3.split("\r\n");
/* 169 */                   int length2 = strArrSplit.length;
/* 170 */                   int i4 = 0;
                            while (true) {
/* 171 */                       if (i4 >= length2) {
                                    break;
                                }
/* 173 */                       String str4 = strArrSplit[i4];
/* 179 */                       if (str4.isEmpty()) {
                                    break;
                                }
/* 185 */                       String[] strArrSplit2 = str4.split("=", 2);
/* 190 */                       if (strArrSplit2.length != 2) {
/* 192 */                           l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 194 */                           l0olllO1i.I000II(l01o0io1ooo02);
/* 201 */                           l01o0io1ooo02.I00ilO0.I0000Il00O("Invalid upload header: ", str4);
                                    break;
                                }
/* 210 */                       map.put(strArrSplit2[0], strArrSplit2[1]);
/* 213 */                       i4++;
                            }
                        }
/* 220 */               l0oiiI0 l0oiii0 = (l0oiiI0) l0o1oooiol.I0000oI00();
/* 224 */               liloI0Io liloi0io = new liloI0Io();
/* 228 */               liloi0io.I00000oIO = j;
/* 230 */               liloi0io.I00000oOI = l0oiii0;
/* 234 */               liloi0io.I0000Il00O = str2;
/* 236 */               liloi0io.I0000O = map;
/* 238 */               liloi0io.I0000oI00 = lioooo;
/* 242 */               liloi0io.I0001Ioi1lo = j2;
/* 246 */               liloi0io.I000II = j3;
/* 250 */               liloi0io.I000O01llI0 = j4;
/* 252 */               liloi0io.I000OOo1O = i2;
/* 254 */               VarHandle.storeStoreFence();
/* 257 */               return liloi0io;
                    } catch (IOException e) {
/* 258 */               l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 260 */               l0olllO1i.I000II(l01o0io1ooo03);
/* 267 */               l01o0io1ooo03.I00ilO0.I0000O(str, "Failed to queued MeasurementBatch from upload_queue. appId", e);
/* 13 */                return null;
                    }
                }

                public final String I01I1Oo0oll() {
/* 7 */             ((l0olllO1i) this.I00iOIl).I00li1OI.getClass();
/* 10 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 14 */            Locale locale = Locale.US;
/* 23 */            Long l = (Long) iol1II1ii1i.I00O10llo.I00000oIO(null);
/* 25 */            l.getClass();
/* 51 */            String str = "(upload_type = 1 AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l + ")";
/* 73 */            String strI000o00OoI0I = IlIi0I0.I000o00OoI0I(Oi010OO0.I001iOo1i0O(jCurrentTimeMillis, "(upload_type != 1 AND ABS(creation_timestamp - ", ") > "), ((Long) iol1II1ii1i.I00O0o1oo.I00000oIO(null)).longValue(), ")");
/* 93 */            StringBuilder sb = new StringBuilder(IIlIOloOOO.I0000Il00O(str.length(), 5, strI000o00OoI0I.length(), 1));
/* 100 */           IIl001iO0Io.I001lIiIIo1O(sb, "(", str, " OR ", strI000o00OoI0I);
/* 103 */           sb.append(")");
/* 106 */           return sb.toString();
                }

                public final void I01IO0oio(String str, l1ioIO011Oo l1ioio011oo) {
/* 1 */             lII0I0I000I.I000II(str);
/* 4 */             lII0I0I000I.I000II(l1ioio011oo);
/* 7 */             I010II();
/* 10 */            I010OIo1l();
/* 15 */            ContentValues contentValues = new ContentValues();
/* 20 */            contentValues.put("app_id", str);
/* 29 */            contentValues.put("consent_state", l1ioio011oo.I000II());
/* 40 */            contentValues.put("consent_source", Integer.valueOf(l1ioio011oo.I00000oOI));
/* 43 */            I011lO1liO1O(contentValues);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
                public final List I01IO1il(String str) {
                    ArrayList arrayList;
                    String string;
/* 4 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 6 */             I010II();
/* 9 */             I010OIo1l();
/* 14 */            ArrayList arrayList2 = new ArrayList();
                    try {
/* 17 */                SQLiteDatabase sQLiteDatabaseI01Io11IiiiO = I01Io11IiiiO();
/* 21 */                sQLiteDatabaseI01Io11IiiiO.beginTransaction();
/* 24 */                Cursor cursorQuery = null;
                        try {
                            try {
/* 48 */                        cursorQuery = sQLiteDatabaseI01Io11IiiiO.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
/* 56 */                        if (cursorQuery.moveToFirst()) {
/* 63 */                            boolean zIsEmpty = str.isEmpty();
/* 177 */                           do {
/* 68 */                                String string2 = cursorQuery.getString(0);
/* 77 */                                if (cursorQuery.isNull(1)) {
/* 79 */                                    string = "";
                                        } else {
/* 82 */                                    string = cursorQuery.getString(1);
/* 86 */                                    lII0I0I000I.I000II(string);
                                        }
/* 89 */                                if (string2 == null) {
/* 91 */                                    l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 93 */                                    l0olllO1i.I000II(l01o0io1ooo0);
/* 104 */                                   l01o0io1ooo0.I00ilO0.I0000Il00O("Read null value from diagnostic signals table, ignoring it. appId", l01O0IO1ooO0.I010ioo(str));
                                        } else {
/* 114 */                                   long j = cursorQuery.getLong(2);
/* 118 */                                   io11l0100ill io11l0100illVarI00111O = io1IOIIOIo0O.I00111O();
/* 122 */                                   io11l0100illVarI00111O.I0000Il00O();
/* 129 */                                   ((io1IOIIOIo0O) io11l0100illVarI00111O.I00iiI).I001IIilI0O(string2);
/* 132 */                                   io11l0100illVarI00111O.I0000Il00O();
/* 139 */                                   ((io1IOIIOIo0O) io11l0100illVarI00111O.I00iiI).I001i1lo1io(j);
/* 142 */                                   io11l0100illVarI00111O.I0000Il00O();
/* 149 */                                   ((io1IOIIOIo0O) io11l0100illVarI00111O.I00iiI).I001i1O0Ol(string);
/* 152 */                                   if (zIsEmpty) {
/* 154 */                                       io11l0100illVarI00111O.I0000Il00O();
/* 161 */                                       ((io1IOIIOIo0O) io11l0100illVarI00111O.I00iiI).I001IO000();
                                            }
/* 170 */                                   arrayList2.add((io1IOIIOIo0O) io11l0100illVarI00111O.I0000oI00());
                                        }
/* 177 */                           } while (cursorQuery.moveToNext());
/* 187 */                           sQLiteDatabaseI01Io11IiiiO.delete("diagnostic_signals", "app_id=?", new String[]{str});
/* 190 */                           sQLiteDatabaseI01Io11IiiiO.setTransactionSuccessful();
                                    arrayList = arrayList2;
                                } else {
/* 58 */                            sQLiteDatabaseI01Io11IiiiO.setTransactionSuccessful();
                                    arrayList = arrayList2;
                                }
                            } catch (SQLiteException e) {
/* 194 */                       l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 196 */                       l0olllO1i.I000II(l01o0io1ooo02);
/* 207 */                       l01o0io1ooo02.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Error querying or deleting diagnostic signals. appId", e);
/* 210 */                       arrayList = Collections.EMPTY_LIST;
                            }
/* 212 */                   if (cursorQuery != null) {
/* 214 */                       cursorQuery.close();
                            }
/* 217 */                   sQLiteDatabaseI01Io11IiiiO.endTransaction();
/* 220 */                   return arrayList;
                        } catch (Throwable th) {
/* 221 */                   if (0 != 0) {
/* 223 */                       cursorQuery.close();
                            }
/* 226 */                   sQLiteDatabaseI01Io11IiiiO.endTransaction();
/* 229 */                   throw th;
                        }
                    } catch (SQLiteException e2) {
/* 232 */               l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 234 */               l0olllO1i.I000II(l01o0io1ooo03);
/* 245 */               l01o0io1ooo03.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Error opening database for diagnostic signals. appId", e2);
/* 248 */               return Collections.EMPTY_LIST;
                    }
                }

                public final void I01Ii0ll10O(String str, l1ioIO011Oo l1ioio011oo) {
/* 1 */             lII0I0I000I.I000II(str);
/* 4 */             I010II();
/* 7 */             I010OIo1l();
/* 14 */            I01IO0oio(str, I011Ol0(str));
/* 19 */            ContentValues contentValues = new ContentValues();
/* 24 */            contentValues.put("app_id", str);
/* 33 */            contentValues.put("storage_consent_at_bundling", l1ioio011oo.I000II());
/* 36 */            I011lO1liO1O(contentValues);
                }

                public final l1ioIO011Oo I01IiOO(String str) {
/* 1 */             lII0I0I000I.I000II(str);
/* 4 */             I010II();
/* 7 */             I010OIo1l();
/* 22 */            return l1ioIO011Oo.I0000Il00O(100, I011lIilI0lo("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
                }

                public final ii01Ioio01i I01Iio10lo(String str, l0l1iIIOl l0l1iiiol, String str2) throws Throwable {
/* 11 */            ii01Ioio01i ii01ioio01iI011lOIoo0l = I011lOIoo0l("events", str, l0l1iiiol.I001iOo1i0O());
/* 15 */            if (ii01ioio01iI011lOIoo0l != null) {
/* 79 */                long j = ii01ioio01iI011lOIoo0l.I0000oI00 + 1;
/* 83 */                long j2 = ii01ioio01iI011lOIoo0l.I0000O + 1;
/* 118 */               return new ii01Ioio01i(ii01ioio01iI011lOIoo0l.I00000oIO, ii01ioio01iI011lOIoo0l.I00000oOI, ii01ioio01iI011lOIoo0l.I0000Il00O + 1, j2, j, ii01ioio01iI011lOIoo0l.I0001Ioi1lo, ii01ioio01iI011lOIoo0l.I000II, ii01ioio01iI011lOIoo0l.I000O01llI0, ii01ioio01iI011lOIoo0l.I000OOo1O, ii01ioio01iI011lOIoo0l.I000OiO, ii01ioio01iI011lOIoo0l.I000iOII);
                    }
/* 19 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 21 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 23 */            l0olllO1i.I000II(l01o0io1ooo0);
/* 42 */            l01o0io1ooo0.I00l0I0l0lO1.I0000O(l01O0IO1ooO0.I010ioo(str), "Event aggregate wasn't created during raw event logging. appId, event", l0olllo1i.I00l0OO0IO.I00000oIO(str2));
/* 71 */            return new ii01Ioio01i(str, l0l1iiiol.I001iOo1i0O(), 1L, 1L, 1L, l0l1iiiol.I001lIiIIo1O(), 0L, null, null, null, null);
                }

                public final boolean I01IlIoOI() {
/* 13 */            return ((l0olllO1i) this.I00iOIl).I00iOIl.getDatabasePath("google_app_measurement.db").exists();
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00ef A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0101 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
                /* JADX WARN: Removed duplicated region for block: B:66:0x018c A[Catch: all -> 0x0079, SQLiteException -> 0x007c, LOOP:0: B:66:0x018c->B:101:?, LOOP_START, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
                /* JADX WARN: Removed duplicated region for block: B:76:0x01e9 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
                /* JADX WARN: Removed duplicated region for block: B:84:0x0220 A[DONT_GENERATE] */
                /* JADX WARN: Type inference failed for: r9v0 */
                /* JADX WARN: Type inference failed for: r9v1 */
                /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
                /* JADX WARN: Type inference failed for: r9v24 */
                /* JADX WARN: Type inference failed for: r9v25 */
                /* JADX WARN: Type inference failed for: r9v3 */
                /* JADX WARN: Type inference failed for: r9v5 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I01Ilioliio(String str, long j, long j2, I0Oo1I101o i0Oo1I101o) {
                    ?? IsEmpty;
                    String string;
                    String[] strArr;
                    String str2;
                    String string2;
                    long j3;
                    String[] strArr2;
                    String str3;
                    l0l0O000 l0l0o000;
/* 7 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 9 */             I010II();
/* 12 */            I010OIo1l();
/* 23 */            Cursor cursorRawQuery = null;
                    try {
                        try {
/* 24 */                    SQLiteDatabase sQLiteDatabaseI01Io11IiiiO = I01Io11IiiiO();
/* 28 */                    IsEmpty = TextUtils.isEmpty(str);
/* 38 */                    if (IsEmpty != 0) {
/* 66 */                        String[] strArr3 = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
/* 72 */                        str2 = j2 != -1 ? "rowid <= ? and " : "";
/* 82 */                        StringBuilder sb = new StringBuilder(str2.length() + 148);
/* 85 */                        sb.append("select app_id, metadata_fingerprint from raw_events where ");
/* 88 */                        sb.append(str2);
/* 91 */                        sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
/* 98 */                        cursorRawQuery = sQLiteDatabaseI01Io11IiiiO.rawQuery(sb.toString(), strArr3);
                                try {
/* 106 */                           if (cursorRawQuery.moveToFirst()) {
/* 110 */                               string = cursorRawQuery.getString(0);
                                        try {
/* 114 */                                   string2 = cursorRawQuery.getString(1);
/* 118 */                                   cursorRawQuery.close();
/* 230 */                                   cursorRawQuery = sQLiteDatabaseI01Io11IiiiO.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string, string2}, null, null, "rowid", "2");
/* 238 */                                   if (cursorRawQuery.moveToFirst()) {
/* 240 */                                       l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 242 */                                       l0olllO1i.I000II(l01o0io1ooo0);
/* 253 */                                       l01o0io1ooo0.I00ilO0.I0000Il00O("Raw event metadata record is missing. appId", l01O0IO1ooO0.I010ioo(string));
                                            } else {
                                                try {
/* 276 */                                           l100ll0OOIoO l100ll0ooioo = (l100ll0OOIoO) ((l0ooIi1oOO) lio010i.I01IlIoOI(l100ll0OOIoO.I00OilO00Il(), cursorRawQuery.getBlob(0))).I0000oI00();
/* 282 */                                           if (cursorRawQuery.moveToNext()) {
/* 284 */                                               l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 286 */                                               l0olllO1i.I000II(l01o0io1ooo02);
/* 297 */                                               l01o0io1ooo02.I00l0I0l0lO1.I0000Il00O("Get multiple raw event metadata records, expected one. appId", l01O0IO1ooO0.I010ioo(string));
                                                    }
/* 300 */                                           cursorRawQuery.close();
/* 303 */                                           i0Oo1I101o.I00000oOI = l100ll0ooioo;
/* 313 */                                           long jI011iiii0i = I011iiii0i("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{string, string2}, -1L);
/* 319 */                                           if (j2 != -1) {
/* 336 */                                               j3 = j2;
                                                    } else if (jI011iiii0i != -1) {
/* 325 */                                               j3 = -1;
                                                    } else {
/* 327 */                                               str3 = "app_id = ? and metadata_fingerprint = ?";
/* 329 */                                               strArr2 = new String[]{string, string2};
/* 387 */                                               cursorRawQuery = sQLiteDatabaseI01Io11IiiiO.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
/* 395 */                                               if (cursorRawQuery.moveToFirst()) {
/* 490 */                                                   l01O0IO1ooO0 l01o0io1ooo03 = l0olllo1i.I00ilO0;
/* 492 */                                                   l0olllO1i.I000II(l01o0io1ooo03);
/* 503 */                                                   l01o0io1ooo03.I00l0I0l0lO1.I0000Il00O("Raw event data disappeared while in transaction. appId", l01O0IO1ooO0.I010ioo(string));
                                                        } else {
/* 487 */                                                   do {
/* 397 */                                                       long j4 = cursorRawQuery.getLong(0);
/* 402 */                                                       byte[] blob = cursorRawQuery.getBlob(3);
/* 407 */                                                       long j5 = cursorRawQuery.getLong(4);
                                                                try {
/* 419 */                                                           l0l0o000 = (l0l0O000) lio010i.I01IlIoOI(l0l1iIIOl.I00IlilI0i0i(), blob);
/* 425 */                                                           l0l0o000.I000oI1ioi(cursorRawQuery.getString(1));
/* 429 */                                                           long j6 = cursorRawQuery.getLong(2);
/* 433 */                                                           l0l0o000.I0000Il00O();
/* 440 */                                                           ((l0l1iIIOl) l0l0o000.I00iiI).I00O0i0ii(j6);
/* 443 */                                                           l0l0o000.I0000Il00O();
/* 450 */                                                           ((l0l1iIIOl) l0l0o000.I00iiI).I00111O(j5);
                                                                } catch (IOException e) {
/* 467 */                                                           l01O0IO1ooO0 l01o0io1ooo04 = l0olllo1i.I00ilO0;
/* 469 */                                                           l0olllO1i.I000II(l01o0io1ooo04);
/* 480 */                                                           l01o0io1ooo04.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(string), "Data loss. Failed to merge raw event. appId", e);
                                                                }
/* 463 */                                                       if (!i0Oo1I101o.I00000oIO(j4, (l0l1iIIOl) l0l0o000.I0000oI00())) {
                                                                    break;
                                                                }
/* 487 */                                                   } while (cursorRawQuery.moveToNext());
                                                        }
                                                    }
/* 340 */                                           if (j3 != -1 && jI011iiii0i != -1) {
/* 346 */                                               jI011iiii0i = Math.min(j3, jI011iiii0i);
                                                    } else if (j3 != -1) {
/* 353 */                                               jI011iiii0i = j3;
                                                    }
/* 354 */                                           str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
/* 360 */                                           strArr2 = new String[]{string, string2, String.valueOf(jI011iiii0i)};
/* 387 */                                           cursorRawQuery = sQLiteDatabaseI01Io11IiiiO.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
/* 395 */                                           if (cursorRawQuery.moveToFirst()) {
                                                    }
                                                } catch (IOException e2) {
/* 508 */                                           l01O0IO1ooO0 l01o0io1ooo05 = l0olllo1i.I00ilO0;
/* 510 */                                           l0olllO1i.I000II(l01o0io1ooo05);
/* 521 */                                           l01o0io1ooo05.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(string), "Data loss. Failed to merge raw event metadata. appId", e2);
                                                }
                                            }
                                        } catch (SQLiteException e3) {
/* 125 */                                   e = e3;
/* 527 */                                   l01O0IO1ooO0 l01o0io1ooo06 = l0olllo1i.I00ilO0;
/* 529 */                                   l0olllO1i.I000II(l01o0io1ooo06);
/* 540 */                                   l01o0io1ooo06.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(string), "Data loss. Error selecting raw event. appId", e);
                                        }
                                    }
                                } catch (SQLiteException e4) {
/* 128 */                           e = e4;
/* 129 */                           string = str;
                                }
                            } else {
                                try {
/* 135 */                           if (j2 != -1) {
/* 141 */                               String str4 = str;
/* 143 */                               strArr = new String[]{str4, String.valueOf(j2)};
                                        IsEmpty = str4;
                                    } else {
/* 148 */                               String str5 = str;
/* 150 */                               strArr = new String[]{str5};
                                        IsEmpty = str5;
                                    }
/* 156 */                           str2 = j2 != -1 ? " and rowid <= ?" : "";
/* 166 */                           StringBuilder sb2 = new StringBuilder(str2.length() + 84);
/* 169 */                           sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
/* 172 */                           sb2.append(str2);
/* 175 */                           sb2.append(" order by rowid limit 1;");
/* 182 */                           cursorRawQuery = sQLiteDatabaseI01Io11IiiiO.rawQuery(sb2.toString(), strArr);
/* 190 */                           if (cursorRawQuery.moveToFirst()) {
/* 194 */                               string2 = cursorRawQuery.getString(0);
/* 198 */                               cursorRawQuery.close();
/* 201 */                               string = IsEmpty;
/* 230 */                               cursorRawQuery = sQLiteDatabaseI01Io11IiiiO.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string, string2}, null, null, "rowid", "2");
/* 238 */                               if (cursorRawQuery.moveToFirst()) {
                                        }
                                    }
                                } catch (SQLiteException e5) {
/* 525 */                           e = e5;
/* 526 */                           string = IsEmpty;
/* 527 */                           l01O0IO1ooO0 l01o0io1ooo062 = l0olllo1i.I00ilO0;
/* 529 */                           l0olllO1i.I000II(l01o0io1ooo062);
/* 540 */                           l01o0io1ooo062.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(string), "Data loss. Error selecting raw event. appId", e);
                                }
                            }
                        } catch (SQLiteException e6) {
/* 57 */                    e = e6;
/* 58 */                    IsEmpty = str;
                        }
                    } finally {
/* 549 */               if (0 != 0) {
/* 551 */                   cursorRawQuery.close();
                        }
                    }
                }

                public final void I01Io000() {
/* 1 */             I010OIo1l();
/* 8 */             I01Io11IiiiO().beginTransaction();
                }

                public final void I01Io001O() {
/* 1 */             I010OIo1l();
/* 8 */             I01Io11IiiiO().setTransactionSuccessful();
                }

                public final void I01Io1() {
/* 1 */             I010OIo1l();
/* 8 */             I01Io11IiiiO().endTransaction();
                }

                public final SQLiteDatabase I01Io11IiiiO() {
/* 1 */             I010II();
                    try {
/* 6 */                 return this.I00iio.getWritableDatabase();
                    } catch (SQLiteException e) {
/* 16 */                l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 18 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 25 */                l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("Error opening database", e);
/* 55 */                throw e;
                    }
                }

                public final void I01Io1ilOIIo(String str) {
                    ii01Ioio01i ii01ioio01iI011lOIoo0l;
/* 3 */             I01I01Oolii("events_snapshot", str);
/* 12 */            Cursor cursorQuery = null;
                    try {
                        try {
/* 38 */                    cursorQuery = I01Io11IiiiO().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
/* 46 */                    if (cursorQuery.moveToFirst()) {
/* 75 */                        do {
/* 48 */                            String string = cursorQuery.getString(0);
/* 52 */                            if (string != null && (ii01ioio01iI011lOIoo0l = I011lOIoo0l("events", str, string)) != null) {
/* 62 */                                I011olOoO("events_snapshot", ii01ioio01iI011lOIoo0l);
                                    }
/* 75 */                        } while (cursorQuery.moveToNext());
                            }
                        } catch (SQLiteException e) {
/* 82 */                    l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 84 */                    l0olllO1i.I000II(l01o0io1ooo0);
/* 95 */                    l01o0io1ooo0.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Error creating snapshot. appId", e);
                        }
/* 98 */                if (cursorQuery != null) {
/* 100 */                   cursorQuery.close();
                        }
                    } finally {
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:39:0x00b7  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00d7  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0054  */
                /* JADX WARN: Removed duplicated region for block: B:9:0x005b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I01IoO(String str) throws Throwable {
                    boolean z;
                    ii01Ioio01i ii01ioio01iI011lOIoo0l;
/* 21 */            ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
/* 28 */            ii01Ioio01i ii01ioio01iI011lOIoo0l2 = I011lOIoo0l("events", str, "_f");
/* 34 */            ii01Ioio01i ii01ioio01iI011lOIoo0l3 = I011lOIoo0l("events", str, "_v");
/* 38 */            I01I01Oolii("events", str);
/* 41 */            Cursor cursorQuery = null;
/* 42 */            boolean z2 = false;
                    try {
/* 70 */                cursorQuery = I01Io11IiiiO().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                    } catch (SQLiteException e) {
/* 159 */               e = e;
/* 160 */               z = false;
                    } catch (Throwable th) {
/* 156 */               th = th;
/* 157 */               z = false;
                    }
/* 78 */            if (!cursorQuery.moveToFirst()) {
/* 80 */                cursorQuery.close();
/* 83 */                if (ii01ioio01iI011lOIoo0l2 != null) {
/* 85 */                    I011olOoO("events", ii01ioio01iI011lOIoo0l2);
                        } else if (ii01ioio01iI011lOIoo0l3 != null) {
/* 92 */                    I011olOoO("events", ii01ioio01iI011lOIoo0l3);
                        }
/* 197 */               I01I01Oolii("events_snapshot", str);
                    }
/* 97 */            boolean z3 = false;
/* 98 */            z = false;
/* 149 */           do {
                        try {
/* 99 */                    String string = cursorQuery.getString(0);
/* 112 */                   if (cursorQuery.getLong(1) >= 1) {
/* 118 */                       if ("_f".equals(string)) {
/* 120 */                           z3 = true;
                                } else if ("_v".equals(string)) {
/* 128 */                           z = true;
                                }
                            }
/* 129 */                   if (string != null && (ii01ioio01iI011lOIoo0l = I011lOIoo0l("events_snapshot", str, string)) != null) {
/* 137 */                       I011olOoO("events", ii01ioio01iI011lOIoo0l);
                            }
                        } catch (SQLiteException e2) {
/* 143 */                   e = e2;
/* 154 */                   z2 = z3;
                            try {
/* 165 */                       l01O0IO1ooO0 l01o0io1ooo0 = ((l0olllO1i) this.I00iOIl).I00ilO0;
/* 167 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 178 */                       l01o0io1ooo0.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Error querying snapshot. appId", e);
/* 181 */                       z3 = z2;
/* 182 */                       if (cursorQuery != null) {
                                }
/* 187 */                       if (!z3) {
                                }
/* 192 */                       if (!z) {
/* 92 */                            I011olOoO("events", ii01ioio01iI011lOIoo0l3);
                                }
/* 197 */                       I01I01Oolii("events_snapshot", str);
                            } catch (Throwable th2) {
/* 201 */                       th = th2;
/* 202 */                       if (cursorQuery != null) {
/* 204 */                           cursorQuery.close();
                                }
/* 207 */                       if (z2 && ii01ioio01iI011lOIoo0l2 != null) {
/* 212 */                           I011olOoO("events", ii01ioio01iI011lOIoo0l2);
                                } else if (!z && ii01ioio01iI011lOIoo0l3 != null) {
/* 220 */                           I011olOoO("events", ii01ioio01iI011lOIoo0l3);
                                }
/* 223 */                       I01I01Oolii("events_snapshot", str);
/* 437 */                       throw th;
                            }
                        } catch (Throwable th3) {
/* 141 */                   th = th3;
/* 152 */                   z2 = z3;
/* 202 */                   if (cursorQuery != null) {
                            }
/* 207 */                   if (z2) {
/* 216 */                       if (!z) {
/* 220 */                           I011olOoO("events", ii01ioio01iI011lOIoo0l3);
                                }
                            }
/* 223 */                   I01I01Oolii("events_snapshot", str);
/* 437 */                   throw th;
                        }
/* 149 */           } while (cursorQuery.moveToNext());
/* 182 */           if (cursorQuery != null) {
/* 184 */               cursorQuery.close();
                    }
/* 187 */           if (!z3 || ii01ioio01iI011lOIoo0l2 == null) {
/* 192 */               if (!z && ii01ioio01iI011lOIoo0l3 != null) {
                        }
                    }
/* 197 */           I01I01Oolii("events_snapshot", str);
                }

                public final void I01Iol(String str, String str2) {
/* 1 */             lII0I0I000I.I0000O(str);
/* 4 */             lII0I0I000I.I0000O(str2);
/* 7 */             I010II();
/* 10 */            I010OIo1l();
                    try {
/* 25 */                I01Io11IiiiO().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
                    } catch (SQLiteException e) {
/* 32 */                l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 34 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 36 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 53 */                l01o0io1ooo0.I00ilO0.I0000oI00("Error deleting user property. appId", l01O0IO1ooO0.I010ioo(str), l0olllo1i.I00l0OO0IO.I0000Il00O(str2), e);
                    }
                }

                public final boolean I01O10iIoo1O(lioOO0ioOI liooo0iooi) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             String str = liooo0iooi.I00000oOI;
/* 7 */             I010II();
/* 10 */            I010OIo1l();
/* 13 */            String str2 = liooo0iooi.I00000oIO;
/* 15 */            String str3 = liooo0iooi.I0000Il00O;
/* 21 */            if (I01O1I1(str2, str3) == null) {
/* 27 */                if (lioil0ilIOi.I01OOIlI(str3)) {
/* 62 */                    if (I011iO("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(l0olllo1i.I00iio.I010o0o0oO(str2, iol1II1ii1i.I00OIl), 100), 25)) {
/* 91 */                        return false;
                            }
                        } else if (!"_npa".equals(str3)) {
/* 79 */                    long jI011iO = I011iO("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
/* 83 */                    iIl1iil iil1iil = l0olllo1i.I00iio;
/* 89 */                    if (jI011iO >= 25) {
/* 91 */                        return false;
                            }
                        }
                    }
/* 95 */            ContentValues contentValues = new ContentValues();
/* 100 */           contentValues.put("app_id", str2);
/* 105 */           contentValues.put("origin", str);
/* 110 */           contentValues.put("name", str3);
/* 121 */           contentValues.put("set_timestamp", Long.valueOf(liooo0iooi.I0000O));
/* 126 */           I01Ilo0i(contentValues, liooo0iooi.I0000oI00);
                    try {
/* 145 */               if (I01Io11IiiiO().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
/* 181 */                   return true;
                        }
/* 147 */               l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 149 */               l0olllO1i.I000II(l01o0io1ooo0);
/* 160 */               l01o0io1ooo0.I00ilO0.I0000Il00O("Failed to insert/update user property (got -1). appId", l01O0IO1ooO0.I010ioo(str2));
/* 181 */               return true;
                    } catch (SQLiteException e) {
/* 165 */               l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 167 */               l0olllO1i.I000II(l01o0io1ooo02);
/* 178 */               l01o0io1ooo02.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str2), "Error storing user property. appId", e);
/* 181 */               return true;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
                /* JADX WARN: Removed duplicated region for block: B:43:? A[SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final lioOO0ioOI I01O1I1(String str, String str2) throws Throwable {
                    Throwable th;
                    String str3;
                    String str4;
                    SQLiteException sQLiteException;
                    Cursor cursorQuery;
/* 4 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 6 */             lII0I0I000I.I0000O(str);
/* 9 */             lII0I0I000I.I0000O(str2);
/* 12 */            I010II();
/* 15 */            I010OIo1l();
/* 18 */            Cursor cursor = null;
                    try {
/* 44 */                cursorQuery = I01Io11IiiiO().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                        try {
                            try {
/* 52 */                        if (cursorQuery.moveToFirst()) {
/* 57 */                            long j = cursorQuery.getLong(0);
/* 62 */                            Object objI0110OiO = I0110OiO(cursorQuery, 1);
/* 66 */                            if (objI0110OiO != null) {
/* 76 */                                str3 = str;
/* 77 */                                str4 = str2;
                                        try {
/* 78 */                                    lioOO0ioOI liooo0iooi = new lioOO0ioOI(str3, cursorQuery.getString(2), str4, j, objI0110OiO);
/* 85 */                                    if (cursorQuery.moveToNext()) {
/* 87 */                                        l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 89 */                                        l0olllO1i.I000II(l01o0io1ooo0);
/* 100 */                                       l01o0io1ooo0.I00ilO0.I0000Il00O("Got multiple records for user property, expected one. appId", l01O0IO1ooO0.I010ioo(str3));
                                            }
/* 110 */                                   cursorQuery.close();
/* 113 */                                   return liooo0iooi;
                                        } catch (SQLiteException e) {
/* 107 */                                   e = e;
/* 108 */                                   sQLiteException = e;
/* 128 */                                   l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 130 */                                   l0olllO1i.I000II(l01o0io1ooo02);
/* 147 */                                   l01o0io1ooo02.I00ilO0.I0000oI00("Error querying user property. appId", l01O0IO1ooO0.I010ioo(str3), l0olllo1i.I00l0OO0IO.I0000Il00O(str4), sQLiteException);
/* 150 */                                   if (cursorQuery != null) {
                                            }
/* 18 */                                    return null;
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
/* 105 */                       th = th2;
/* 118 */                       cursor = cursorQuery;
/* 156 */                       if (cursor != null) {
/* 332 */                           throw th;
                                }
/* 158 */                       cursor.close();
/* 332 */                       throw th;
                            }
                        } catch (SQLiteException e2) {
/* 114 */                   e = e2;
/* 115 */                   str3 = str;
/* 116 */                   str4 = str2;
                        }
                    } catch (SQLiteException e3) {
/* 124 */               str3 = str;
/* 125 */               str4 = str2;
/* 126 */               sQLiteException = e3;
/* 127 */               cursorQuery = null;
                    } catch (Throwable th3) {
/* 121 */               th = th3;
/* 156 */               if (cursor != null) {
                        }
                    }
/* 150 */           if (cursorQuery != null) {
/* 152 */               cursorQuery.close();
                    }
/* 18 */            return null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
                /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final List I01O1lIi(String str) {
                    String str2;
                    SQLiteException sQLiteException;
/* 4 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 6 */             lII0I0I000I.I0000O(str);
/* 9 */             I010II();
/* 12 */            I010OIo1l();
/* 17 */            ?? arrayList = new ArrayList();
/* 22 */            Cursor cursorQuery = null;
                    try {
                        try {
/* 49 */                    iIl1iil iil1iil = l0olllo1i.I00iio;
/* 53 */                    cursorQuery = I01Io11IiiiO().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
/* 61 */                    if (cursorQuery.moveToFirst()) {
                                while (true) {
/* 64 */                            String string = cursorQuery.getString(0);
/* 69 */                            String string2 = cursorQuery.getString(1);
/* 73 */                            if (string2 == null) {
/* 75 */                                string2 = "";
                                    }
/* 77 */                            String str3 = string2;
/* 84 */                            long j = cursorQuery.getLong(2);
/* 89 */                            Object objI0110OiO = I0110OiO(cursorQuery, 3);
/* 93 */                            if (objI0110OiO == null) {
                                        try {
/* 95 */                                    l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 97 */                                    l0olllO1i.I000II(l01o0io1ooo0);
/* 108 */                                   l01o0io1ooo0.I00ilO0.I0000Il00O("Read invalid user property value, ignoring it. appId", l01O0IO1ooO0.I010ioo(str));
/* 111 */                                   str2 = str;
                                        } catch (SQLiteException e) {
/* 80 */                                    sQLiteException = e;
/* 81 */                                    str2 = str;
/* 140 */                                   l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 142 */                                   l0olllO1i.I000II(l01o0io1ooo02);
/* 153 */                                   l01o0io1ooo02.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str2), "Error querying user properties. appId", sQLiteException);
/* 156 */                                   arrayList = Collections.EMPTY_LIST;
/* 158 */                                   if (cursorQuery != null) {
                                            }
/* 163 */                                   return arrayList;
                                        }
                                    } else {
/* 118 */                               str2 = str;
                                        try {
/* 122 */                                   arrayList.add(new lioOO0ioOI(str2, str3, string, j, objI0110OiO));
                                        } catch (SQLiteException e2) {
/* 134 */                                   e = e2;
/* 135 */                                   sQLiteException = e;
/* 140 */                                   l01O0IO1ooO0 l01o0io1ooo022 = l0olllo1i.I00ilO0;
/* 142 */                                   l0olllO1i.I000II(l01o0io1ooo022);
/* 153 */                                   l01o0io1ooo022.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str2), "Error querying user properties. appId", sQLiteException);
/* 156 */                                   arrayList = Collections.EMPTY_LIST;
/* 158 */                                   if (cursorQuery != null) {
                                            }
/* 163 */                                   return arrayList;
                                        }
                                    }
/* 129 */                           if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
/* 132 */                           str = str2;
                                }
                            }
                        } catch (SQLiteException e3) {
/* 137 */                   e = e3;
/* 138 */                   str2 = str;
                        }
/* 158 */               if (cursorQuery != null) {
/* 160 */                   cursorQuery.close();
                        }
/* 163 */               return arrayList;
                    } finally {
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:21:0x00b0, code lost:
                
                    p000.l0olllO1i.I000II(r13);
                    r13.I00ilO0.I0000Il00O("Read more than the max allowed user properties, ignoring excess", 1000);
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x0134  */
                /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final List I01OIo(String str, String str2, String str3) throws Throwable {
                    Cursor cursor;
                    String str4;
                    Cursor cursorQuery;
                    String str5;
/* 7 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 9 */             lII0I0I000I.I0000O(str);
/* 12 */            I010II();
/* 15 */            I010OIo1l();
/* 20 */            ?? arrayList = new ArrayList();
                    try {
/* 30 */                ArrayList arrayList2 = new ArrayList(3);
/* 33 */                String str6 = str;
/* 35 */                arrayList2.add(str6);
/* 42 */                StringBuilder sb = new StringBuilder("app_id=?");
/* 49 */                if (!TextUtils.isEmpty(str2)) {
/* 53 */                    arrayList2.add(str2);
/* 58 */                    sb.append(" and origin=?");
                        }
/* 75 */                if (!TextUtils.isEmpty(str3)) {
/* 88 */                    StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
/* 91 */                    sb2.append(str3);
/* 94 */                    sb2.append("*");
/* 101 */                   arrayList2.add(sb2.toString());
/* 106 */                   sb.append(" and name glob ?");
                        }
/* 120 */               String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
/* 140 */               String string = sb.toString();
/* 146 */               iIl1iil iil1iil = l0olllo1i.I00iio;
/* 148 */               l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 155 */               cursorQuery = I01Io11IiiiO().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
                        try {
                            try {
/* 163 */                       if (cursorQuery.moveToFirst()) {
/* 167 */                           str4 = str2;
                                    while (true) {
                                        try {
/* 175 */                                   if (arrayList.size() >= 1000) {
                                                break;
                                            }
/* 198 */                                   String string2 = cursorQuery.getString(0);
/* 202 */                                   long j = cursorQuery.getLong(1);
/* 207 */                                   Object objI0110OiO = I0110OiO(cursorQuery, 2);
/* 212 */                                   String string3 = cursorQuery.getString(3);
/* 216 */                                   if (objI0110OiO == null) {
                                                try {
/* 218 */                                           l0olllO1i.I000II(l01o0io1ooo0);
/* 229 */                                           l01o0io1ooo0.I00ilO0.I0000oI00("(2)Read invalid user property value, ignoring it", l01O0IO1ooO0.I010ioo(str6), string3, str3);
/* 232 */                                           str5 = string3;
                                                } catch (SQLiteException e) {
/* 235 */                                           e = e;
/* 236 */                                           str5 = string3;
/* 264 */                                           cursor = cursorQuery;
/* 265 */                                           str4 = str5;
                                                    try {
/* 281 */                                               l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 283 */                                               l0olllO1i.I000II(l01o0io1ooo02);
/* 294 */                                               l01o0io1ooo02.I00ilO0.I0000oI00("(2)Error querying user properties", l01O0IO1ooO0.I010ioo(str), str4, e);
/* 297 */                                               arrayList = Collections.EMPTY_LIST;
/* 299 */                                               cursorQuery = cursor;
/* 300 */                                               if (cursorQuery != null) {
                                                        }
/* 305 */                                               return arrayList;
                                                    } catch (Throwable th) {
/* 306 */                                               th = th;
/* 307 */                                               if (cursor != null) {
                                                        }
/* 408 */                                               throw th;
                                                    }
                                                }
                                            } else {
/* 243 */                                       str5 = string3;
                                                try {
/* 248 */                                           arrayList.add(new lioOO0ioOI(str, str5, string2, j, objI0110OiO));
                                                } catch (SQLiteException e2) {
/* 263 */                                           e = e2;
/* 264 */                                           cursor = cursorQuery;
/* 265 */                                           str4 = str5;
/* 281 */                                           l01O0IO1ooO0 l01o0io1ooo022 = l0olllo1i.I00ilO0;
/* 283 */                                           l0olllO1i.I000II(l01o0io1ooo022);
/* 294 */                                           l01o0io1ooo022.I00ilO0.I0000oI00("(2)Error querying user properties", l01O0IO1ooO0.I010ioo(str), str4, e);
/* 297 */                                           arrayList = Collections.EMPTY_LIST;
/* 299 */                                           cursorQuery = cursor;
/* 300 */                                           if (cursorQuery != null) {
                                                    }
/* 305 */                                           return arrayList;
                                                }
                                            }
/* 255 */                                   if (!cursorQuery.moveToNext()) {
                                                break;
                                            }
/* 258 */                                   str6 = str;
/* 260 */                                   str4 = str5;
                                        } catch (SQLiteException e3) {
/* 195 */                                   e = e3;
/* 268 */                                   cursor = cursorQuery;
/* 281 */                                   l01O0IO1ooO0 l01o0io1ooo0222 = l0olllo1i.I00ilO0;
/* 283 */                                   l0olllO1i.I000II(l01o0io1ooo0222);
/* 294 */                                   l01o0io1ooo0222.I00ilO0.I0000oI00("(2)Error querying user properties", l01O0IO1ooO0.I010ioo(str), str4, e);
/* 297 */                                   arrayList = Collections.EMPTY_LIST;
/* 299 */                                   cursorQuery = cursor;
/* 300 */                                   if (cursorQuery != null) {
                                            }
/* 305 */                                   return arrayList;
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
/* 193 */                       th = th2;
/* 270 */                       cursor = cursorQuery;
/* 307 */                       if (cursor != null) {
/* 309 */                           cursor.close();
                                }
/* 408 */                       throw th;
                            }
                        } catch (SQLiteException e4) {
/* 272 */                   e = e4;
/* 273 */                   str4 = str2;
                        }
                    } catch (SQLiteException e5) {
/* 65 */                e = e5;
/* 278 */               str4 = str2;
/* 280 */               cursor = null;
                    } catch (Throwable th3) {
/* 62 */                th = th3;
/* 276 */               cursor = null;
                    }
/* 300 */           if (cursorQuery != null) {
/* 302 */               cursorQuery.close();
                    }
/* 305 */           return arrayList;
                }

                public final boolean I01OO1I(iII000ol000 iii000ol000) {
/* 3 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 5 */             I010II();
/* 8 */             I010OIo1l();
/* 11 */            String str = iii000ol000.I00iOIl;
/* 13 */            lII0I0I000I.I000II(str);
/* 24 */            if (I01O1I1(str, iii000ol000.I00iiO.I00iiI) == null) {
/* 32 */                long jI011iO = I011iO("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
/* 36 */                iIl1iil iil1iil = l0olllo1i.I00iio;
/* 42 */                if (jI011iO >= 1000) {
/* 44 */                    return false;
                        }
                    }
/* 48 */            ContentValues contentValues = new ContentValues();
/* 53 */            contentValues.put("app_id", str);
/* 60 */            contentValues.put("origin", iii000ol000.I00iiI);
/* 69 */            contentValues.put("name", iii000ol000.I00iiO.I00iiI);
/* 74 */            Object objZza = iii000ol000.I00iiO.zza();
/* 78 */            lII0I0I000I.I000II(objZza);
/* 81 */            I01Ilo0i(contentValues, objZza);
/* 92 */            contentValues.put("active", Boolean.valueOf(iii000ol000.I00ilI0I1));
/* 99 */            contentValues.put("trigger_event_name", iii000ol000.I00ilO0);
/* 110 */           contentValues.put("trigger_timeout", Long.valueOf(iii000ol000.I00ioIO));
/* 113 */           ii0oooi0IO0l ii0oooi0io0l = iii000ol000.I00io1l;
/* 115 */           lioil0ilIOi lioil0ilioi = l0olllo1i.I00l0I0l0lO1;
/* 117 */           l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 119 */           l0olllO1i.I0000oI00(lioil0ilioi);
/* 128 */           contentValues.put("timed_out_event", lioil0ilIOi.I01IiOO(ii0oooi0io0l));
/* 139 */           contentValues.put("creation_timestamp", Long.valueOf(iii000ol000.I00iio));
/* 142 */           l0olllO1i.I0000oI00(lioil0ilioi);
/* 153 */           contentValues.put("triggered_event", lioil0ilIOi.I01IiOO(iii000ol000.I00l0I0l0lO1));
/* 166 */           contentValues.put("triggered_timestamp", Long.valueOf(iii000ol000.I00iiO.I00iiO));
/* 177 */           contentValues.put("time_to_live", Long.valueOf(iii000ol000.I00l0OO0IO));
/* 188 */           contentValues.put("expired_event", lioil0ilIOi.I01IiOO(iii000ol000.I00li1OI));
                    try {
/* 207 */               if (I01Io11IiiiO().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
/* 239 */                   return true;
                        }
/* 209 */               l0olllO1i.I000II(l01o0io1ooo0);
/* 220 */               l01o0io1ooo0.I00ilO0.I0000Il00O("Failed to insert/update conditional user property (got -1)", l01O0IO1ooO0.I010ioo(str));
/* 239 */               return true;
                    } catch (SQLiteException e) {
/* 225 */               l0olllO1i.I000II(l01o0io1ooo0);
/* 236 */               l01o0io1ooo0.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Error storing conditional user property", e);
/* 239 */               return true;
                    }
                }

                /* JADX WARN: Not initialized variable reg: 8, insn: 0x00f0: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]) (LINE:241), block:B:29:0x00f0 */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0110  */
                /* JADX WARN: Removed duplicated region for block: B:39:0x0116  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final iII000ol000 I01OOIlI(String str, String str2) throws Throwable {
                    String str3;
                    Cursor cursorQuery;
                    Cursor cursor;
/* 6 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 8 */             lII0I0I000I.I0000O(str);
/* 11 */            lII0I0I000I.I0000O(str2);
/* 14 */            I010II();
/* 17 */            I010OIo1l();
/* 20 */            Cursor cursor2 = null;
                    try {
                        try {
/* 62 */                    cursorQuery = I01Io11IiiiO().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                            try {
                            } catch (SQLiteException e) {
/* 237 */                       e = e;
/* 238 */                       str3 = str2;
                            }
                        } catch (Throwable th) {
/* 85 */                    th = th;
/* 241 */                   cursor2 = cursor;
/* 277 */                   if (cursor2 != null) {
/* 279 */                       cursor2.close();
                            }
/* 332 */                   throw th;
                        }
                    } catch (SQLiteException e2) {
/* 245 */               e = e2;
/* 246 */               str3 = str2;
/* 248 */               cursorQuery = null;
                    } catch (Throwable th2) {
/* 243 */               th = th2;
/* 277 */               if (cursor2 != null) {
                        }
/* 332 */               throw th;
                    }
/* 70 */            if (!cursorQuery.moveToFirst()) {
/* 271 */               if (cursorQuery != null) {
/* 273 */                   cursorQuery.close();
                        }
/* 20 */                return null;
                    }
/* 75 */            String string = cursorQuery.getString(0);
/* 79 */            if (string == null) {
/* 81 */                string = "";
                    }
/* 83 */            String str4 = string;
/* 89 */            Object objI0110OiO = I0110OiO(cursorQuery, 1);
/* 102 */           boolean z = cursorQuery.getInt(2) != 0;
/* 104 */           String string2 = cursorQuery.getString(3);
/* 109 */           long j = cursorQuery.getLong(4);
/* 115 */           lio010i lio010iVar = this.I00iiI.I00io1l;
/* 117 */           lilOOl0.I00O0o1oo(lio010iVar);
/* 121 */           byte[] blob = cursorQuery.getBlob(5);
/* 125 */           Parcelable.Creator<ii0oooi0IO0l> creator = ii0oooi0IO0l.CREATOR;
/* 133 */           ii0oooi0IO0l ii0oooi0io0l = (ii0oooi0IO0l) lio010iVar.I01I0Iioooo0(blob, creator);
/* 136 */           long j2 = cursorQuery.getLong(6);
/* 140 */           lilOOl0.I00O0o1oo(lio010iVar);
/* 154 */           ii0oooi0IO0l ii0oooi0io0l2 = (ii0oooi0IO0l) lio010iVar.I01I0Iioooo0(cursorQuery.getBlob(7), creator);
/* 158 */           long j3 = cursorQuery.getLong(8);
/* 164 */           long j4 = cursorQuery.getLong(9);
/* 168 */           lilOOl0.I00O0o1oo(lio010iVar);
/* 187 */           str3 = str2;
                    try {
/* 199 */               iII000ol000 iii000ol000 = new iII000ol000(str, str4, new lio0llOI0(j3, objI0110OiO, str3, str4), j2, z, string2, ii0oooi0io0l, j, ii0oooi0io0l2, j4, (ii0oooi0IO0l) lio010iVar.I01I0Iioooo0(cursorQuery.getBlob(10), creator));
/* 206 */               if (cursorQuery.moveToNext()) {
/* 208 */                   l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 210 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 227 */                   l01o0io1ooo0.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Got multiple records for conditional property, expected one", l0olllo1i.I00l0OO0IO.I0000Il00O(str3));
                        }
/* 233 */               cursorQuery.close();
/* 236 */               return iii000ol000;
                    } catch (SQLiteException e3) {
/* 231 */               e = e3;
/* 249 */               l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 251 */               l0olllO1i.I000II(l01o0io1ooo02);
/* 268 */               l01o0io1ooo02.I00ilO0.I0000oI00("Error querying conditional property", l01O0IO1ooO0.I010ioo(str), l0olllo1i.I00l0OO0IO.I0000Il00O(str3), e);
/* 271 */               if (cursorQuery != null) {
                        }
/* 20 */                return null;
                    }
                }

                public final void I01OOiI1o(String str, String str2) {
/* 1 */             lII0I0I000I.I0000O(str);
/* 4 */             lII0I0I000I.I0000O(str2);
/* 7 */             I010II();
/* 10 */            I010OIo1l();
                    try {
/* 25 */                I01Io11IiiiO().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
                    } catch (SQLiteException e) {
/* 32 */                l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 34 */                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 36 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 53 */                l01o0io1ooo0.I00ilO0.I0000oI00("Error deleting conditional property", l01O0IO1ooO0.I010ioo(str), l0olllo1i.I00l0OO0IO.I0000Il00O(str2), e);
                    }
                }

                public final List I01Oi01Ilol(String str, String str2, String str3) {
/* 1 */             lII0I0I000I.I0000O(str);
/* 4 */             I010II();
/* 7 */             I010OIo1l();
/* 13 */            ArrayList arrayList = new ArrayList(3);
/* 16 */            arrayList.add(str);
/* 23 */            StringBuilder sb = new StringBuilder("app_id=?");
/* 30 */            if (!TextUtils.isEmpty(str2)) {
/* 32 */                arrayList.add(str2);
/* 37 */                sb.append(" and origin=?");
                    }
/* 44 */            if (!TextUtils.isEmpty(str3)) {
/* 56 */                arrayList.add(String.valueOf(str3).concat("*"));
/* 61 */                sb.append(" and name glob ?");
                    }
/* 80 */            return I01OiO1OI(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
                }

                /* JADX WARN: Code restructure failed: missing block: B:7:0x0054, code lost:
                
                    r0 = r1.I00ilO0;
                    p000.l0olllO1i.I000II(r0);
                    r0.I00ilO0.I0000Il00O("Read more than the max allowed conditional properties, ignoring extra", 1000);
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final List I01OiO1OI(String str, String[] strArr) {
/* 5 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 7 */             I010II();
/* 10 */            I010OIo1l();
/* 15 */            ?? arrayList = new ArrayList();
/* 20 */            Cursor cursorQuery = null;
                    try {
                        try {
/* 59 */                    iIl1iil iil1iil = l0olllo1i.I00iio;
/* 67 */                    cursorQuery = I01Io11IiiiO().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
/* 75 */                    if (cursorQuery.moveToFirst()) {
                                while (true) {
/* 83 */                            if (arrayList.size() >= 1000) {
                                        break;
                                    }
/* 110 */                           String string = cursorQuery.getString(0);
/* 115 */                           String string2 = cursorQuery.getString(1);
/* 120 */                           String string3 = cursorQuery.getString(2);
/* 125 */                           Object objI0110OiO = I0110OiO(cursorQuery, 3);
/* 139 */                           boolean z = cursorQuery.getInt(4) != 0;
/* 142 */                           String string4 = cursorQuery.getString(5);
/* 147 */                           long j = cursorQuery.getLong(6);
/* 153 */                           lio010i lio010iVar = this.I00iiI.I00io1l;
/* 155 */                           lilOOl0.I00O0o1oo(lio010iVar);
/* 159 */                           byte[] blob = cursorQuery.getBlob(7);
/* 163 */                           Parcelable.Creator<ii0oooi0IO0l> creator = ii0oooi0IO0l.CREATOR;
/* 171 */                           ii0oooi0IO0l ii0oooi0io0l = (ii0oooi0IO0l) lio010iVar.I01I0Iioooo0(blob, creator);
/* 175 */                           long j2 = cursorQuery.getLong(8);
/* 179 */                           lilOOl0.I00O0o1oo(lio010iVar);
/* 194 */                           ii0oooi0IO0l ii0oooi0io0l2 = (ii0oooi0IO0l) lio010iVar.I01I0Iioooo0(cursorQuery.getBlob(9), creator);
/* 198 */                           long j3 = cursorQuery.getLong(10);
/* 204 */                           long j4 = cursorQuery.getLong(11);
/* 208 */                           lilOOl0.I00O0o1oo(lio010iVar);
/* 241 */                           arrayList.add(new iII000ol000(string, string2, new lio0llOI0(j3, objI0110OiO, string3, string2), j2, z, string4, ii0oooi0io0l, j, ii0oooi0io0l2, j4, (ii0oooi0IO0l) lio010iVar.I01I0Iioooo0(cursorQuery.getBlob(12), creator)));
/* 248 */                           if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                }
                            }
                        } catch (SQLiteException e) {
/* 251 */                   l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 253 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 260 */                   l01o0io1ooo0.I00ilO0.I0000Il00O("Error querying conditional user property value", e);
/* 263 */                   arrayList = Collections.EMPTY_LIST;
                        }
/* 265 */               if (cursorQuery != null) {
/* 267 */                   cursorQuery.close();
                        }
/* 270 */               return arrayList;
                    } catch (Throwable th) {
/* 271 */               if (cursorQuery != null) {
/* 273 */                   cursorQuery.close();
                        }
/* 332 */               throw th;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:128:0x0401  */
                /* JADX WARN: Removed duplicated region for block: B:131:0x0407  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final l0IIii I01Ol1o0(String str) throws Throwable {
                    Cursor cursorQuery;
                    Boolean boolValueOf;
                    String string;
/* 7 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 9 */             lII0I0I000I.I0000O(str);
/* 12 */            I010II();
/* 15 */            I010OIo1l();
/* 18 */            Cursor cursor = null;
                    try {
/* 130 */               cursorQuery = I01Io11IiiiO().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility", "last_diagnostics_signal_upload_timestamp"}, "app_id=?", new String[]{str}, null, null, null);
                        try {
                            try {
                            } catch (SQLiteException e) {
/* 515 */                       e = e;
/* 1008 */                      l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 1010 */                      l0olllO1i.I000II(l01o0io1ooo0);
/* 1021 */                      l01o0io1ooo0.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Error querying app. appId", e);
/* 1024 */                      if (cursorQuery != null) {
                                }
/* 18 */                        return null;
                            }
                        } catch (Throwable th) {
/* 174 */                   th = th;
/* 1002 */                  cursor = cursorQuery;
/* 1030 */                  if (cursor != null) {
/* 1032 */                      cursor.close();
                            }
/* 1261 */                  throw th;
                        }
                    } catch (SQLiteException e2) {
/* 1006 */              e = e2;
/* 1007 */              cursorQuery = null;
                    } catch (Throwable th2) {
/* 1004 */              th = th2;
/* 1030 */              if (cursor != null) {
                        }
/* 1261 */              throw th;
                    }
/* 138 */           if (!cursorQuery.moveToFirst()) {
/* 1024 */              if (cursorQuery != null) {
/* 1026 */                  cursorQuery.close();
                        }
/* 18 */                return null;
                    }
/* 144 */           lilOOl0 lilool0 = this.I00iiI;
/* 148 */           l0IIii l0iiii = new l0IIii(lilool0.I00ll1, str);
/* 151 */           l0olllO1i l0olllo1i2 = l0iiii.I00000oIO;
/* 153 */           l1ioIO011Oo l1ioio011ooI00000oIO = lilool0.I00000oIO(str);
/* 157 */           l1iioiool l1iioioolVar = l1iioiool.ANALYTICS_STORAGE;
/* 164 */           if (l1ioio011ooI00000oIO.I000OOo1O(l1iioioolVar)) {
/* 170 */               l0iiii.I00IO1oi11O(cursorQuery.getString(0));
                    }
/* 177 */           boolean z = true;
/* 182 */           l0iiii.I00IioO0OiOi(cursorQuery.getString(1));
/* 195 */           if (lilool0.I00000oIO(str).I000OOo1O(l1iioiool.AD_STORAGE)) {
/* 202 */               l0iiii.I00IlilI0i0i(cursorQuery.getString(2));
                    }
/* 210 */           l0iiii.I0000oI00(cursorQuery.getLong(3));
/* 218 */           l0iiii.I00IoIO0lI(cursorQuery.getLong(4));
/* 226 */           l0iiii.I00IoO0(cursorQuery.getLong(5));
/* 234 */           l0iiii.I00Iooi00oi(cursorQuery.getString(6));
/* 242 */           l0iiii.I00O10llo(cursorQuery.getString(7));
/* 251 */           l0iiii.I00OI1(cursorQuery.getLong(8));
/* 260 */           l0iiii.I00000oIO(cursorQuery.getLong(9));
/* 280 */           l0iiii.I0000O(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
/* 289 */           l0iiii.I000OOo1O(cursorQuery.getLong(11));
/* 298 */           l0iiii.I000OiO(cursorQuery.getLong(12));
/* 307 */           l0iiii.I000iOII(cursorQuery.getLong(13));
/* 316 */           l0iiii.I000l1(cursorQuery.getLong(14));
/* 325 */           l0iiii.I0001Ioi1lo(cursorQuery.getLong(15));
/* 334 */           l0iiii.I000II(cursorQuery.getLong(16));
/* 354 */           l0iiii.I00O0o1oo(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
/* 363 */           l0iiii.I00Io1o110i(cursorQuery.getString(18));
/* 372 */           l0iiii.I000o00OoI0I(cursorQuery.getLong(19));
/* 381 */           l0iiii.I000lI(cursorQuery.getLong(20));
/* 390 */           l0iiii.I001i1O0Ol(cursorQuery.getString(21));
/* 409 */           boolean z2 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
/* 410 */           l0o10OoO0 l0o10ooo0 = l0olllo1i2.I00io1l;
/* 412 */           l0olllO1i.I000II(l0o10ooo0);
/* 415 */           l0o10ooo0.I010II();
                    l0iiii.I00O0o1oo |= l0iiii.I00100l0 != z2;
/* 430 */           l0iiii.I00100l0 = z2;
/* 447 */           l0iiii.I0000Il00O(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
/* 456 */           if (!cursorQuery.isNull(26)) {
/* 473 */               l0iiii.I001iOo1i0O(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                    }
/* 484 */           if (lilool0.I00000oIO(str).I000OOo1O(l1iioioolVar)) {
/* 488 */               String string2 = cursorQuery.getString(28);
/* 492 */               l0o10OoO0 l0o10ooo02 = l0olllo1i2.I00io1l;
/* 494 */               l0olllO1i.I000II(l0o10ooo02);
/* 497 */               l0o10ooo02.I010II();
                        l0iiii.I00O0o1oo |= !Objects.equals(l0iiii.I00111O, string2);
/* 512 */               l0iiii.I00111O = string2;
                    }
/* 534 */           boolean z3 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
/* 535 */           l0o10OoO0 l0o10ooo03 = l0olllo1i2.I00io1l;
/* 537 */           l0olllO1i.I000II(l0o10ooo03);
/* 540 */           l0o10ooo03.I010II();
                    l0iiii.I00O0o1oo |= l0iiii.I001IIilI0O != z3;
/* 555 */           l0iiii.I001IIilI0O = z3;
/* 563 */           l0iiii.I0010I0i(cursorQuery.getLong(39));
/* 568 */           String string3 = cursorQuery.getString(36);
/* 572 */           l0o10OoO0 l0o10ooo04 = l0olllo1i2.I00io1l;
/* 574 */           l0olllO1i.I000II(l0o10ooo04);
/* 577 */           l0o10ooo04.I010II();
                    l0iiii.I00O0o1oo |= l0iiii.I001lloI != string3;
/* 592 */           l0iiii.I001lloI = string3;
/* 600 */           l0iiii.I001lIiIIo1O(cursorQuery.getLong(30));
/* 609 */           l0iiii.I001lllioOl(cursorQuery.getLong(31));
/* 612 */           iIO0ooOool.I00000oIO();
/* 623 */           if (l0olllo1i.I00iio.I01101IOlO(str, iol1II1ii1i.I0100i)) {
/* 627 */               int i = cursorQuery.getInt(32);
/* 631 */               l0o10OoO0 l0o10ooo05 = l0olllo1i2.I00io1l;
/* 633 */               l0olllO1i.I000II(l0o10ooo05);
/* 636 */               l0o10ooo05.I010II();
                        l0iiii.I00O0o1oo |= l0iiii.I001i1lo1io != i;
/* 651 */               l0iiii.I001i1lo1io = i;
/* 659 */               l0iiii.I001lloI(cursorQuery.getLong(35));
                    }
/* 678 */           boolean z4 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
/* 679 */           l0o10OoO0 l0o10ooo06 = l0olllo1i2.I00io1l;
/* 681 */           l0olllO1i.I000II(l0o10ooo06);
/* 684 */           l0o10ooo06.I010II();
                    l0iiii.I00O0o1oo |= l0iiii.I001iOo1i0O != z4;
/* 699 */           l0iiii.I001iOo1i0O = z4;
/* 707 */           if (cursorQuery.isNull(34)) {
/* 709 */               boolValueOf = null;
                    } else {
/* 720 */               boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                    }
/* 724 */           l0o10OoO0 l0o10ooo07 = l0olllo1i2.I00io1l;
/* 726 */           l0olllO1i.I000II(l0o10ooo07);
/* 729 */           l0o10ooo07.I010II();
                    l0iiii.I00O0o1oo |= !Objects.equals(l0iiii.I00100o1O0lo, boolValueOf);
/* 744 */           l0iiii.I00100o1O0lo = boolValueOf;
/* 752 */           l0iiii.I00100l0(cursorQuery.getInt(37));
/* 761 */           l0iiii.I00100o1O0lo(cursorQuery.getInt(38));
/* 770 */           if (cursorQuery.isNull(40)) {
/* 772 */               string = "";
                    } else {
/* 775 */               string = cursorQuery.getString(40);
/* 779 */               lII0I0I000I.I000II(string);
                    }
/* 782 */           l0o10OoO0 l0o10ooo08 = l0olllo1i2.I00io1l;
/* 784 */           l0olllO1i.I000II(l0o10ooo08);
/* 787 */           l0o10ooo08.I010II();
                    l0iiii.I00O0o1oo |= l0iiii.I00IO1oi11O != string;
/* 802 */           l0iiii.I00IO1oi11O = string;
/* 810 */           if (!cursorQuery.isNull(41)) {
/* 816 */               Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
/* 820 */               l0o10OoO0 l0o10ooo09 = l0olllo1i2.I00io1l;
/* 822 */               l0olllO1i.I000II(l0o10ooo09);
/* 825 */               l0o10ooo09.I010II();
                        l0iiii.I00O0o1oo |= !Objects.equals(l0iiii.I001l0I00, lValueOf);
/* 840 */               l0iiii.I001l0I00 = lValueOf;
                    }
/* 848 */           if (!cursorQuery.isNull(42)) {
/* 854 */               Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
/* 858 */               l0o10OoO0 l0o10ooo010 = l0olllo1i2.I00io1l;
/* 860 */               l0olllO1i.I000II(l0o10ooo010);
/* 863 */               l0o10ooo010.I010II();
                        l0iiii.I00O0o1oo |= !Objects.equals(l0iiii.I001lIiIIo1O, lValueOf2);
/* 878 */               l0iiii.I001lIiIIo1O = lValueOf2;
                    }
/* 882 */           byte[] blob = cursorQuery.getBlob(43);
/* 886 */           l0o10OoO0 l0o10ooo011 = l0olllo1i2.I00io1l;
/* 888 */           l0olllO1i.I000II(l0o10ooo011);
/* 891 */           l0o10ooo011.I010II();
                    l0iiii.I00O0o1oo |= l0iiii.I00IOO != blob;
/* 906 */           l0iiii.I00IOO = blob;
/* 914 */           if (!cursorQuery.isNull(44)) {
/* 916 */               int i2 = cursorQuery.getInt(44);
/* 920 */               l0o10OoO0 l0o10ooo012 = l0olllo1i2.I00io1l;
/* 922 */               l0olllO1i.I000II(l0o10ooo012);
/* 925 */               l0o10ooo012.I010II();
/* 928 */               boolean z5 = l0iiii.I00O0o1oo;
/* 932 */               if (l0iiii.I00IioO0OiOi == i2) {
/* 935 */                   z = false;
                        }
/* 937 */               l0iiii.I00O0o1oo = z | z5;
/* 939 */               l0iiii.I00IioO0OiOi = i2;
                    }
/* 949 */           if (l0olllo1i.I00iio.I01101IOlO(str, iol1II1ii1i.I011IOil) && !cursorQuery.isNull(45)) {
/* 963 */               l0iiii.I001IIilI0O(cursorQuery.getLong(45));
                    }
/* 966 */           l0o10OoO0 l0o10ooo013 = l0olllo1i2.I00io1l;
/* 968 */           l0olllO1i.I000II(l0o10ooo013);
/* 971 */           l0o10ooo013.I010II();
/* 974 */           l0iiii.I00O0o1oo = false;
/* 980 */           if (cursorQuery.moveToNext()) {
/* 982 */               l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 984 */               l0olllO1i.I000II(l01o0io1ooo02);
/* 995 */               l01o0io1ooo02.I00ilO0.I0000Il00O("Got multiple records for app, expected one. appId", l01O0IO1ooO0.I010ioo(str));
                    }
/* 998 */           cursorQuery.close();
/* 1001 */          return l0iiii;
                }

                public final void I01OlIoIl(l0IIii l0iiii, boolean z) {
/* 5 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 7 */             lilOOl0 lilool0 = this.I00iiI;
/* 9 */             l0olllO1i l0olllo1i2 = l0iiii.I00000oIO;
/* 11 */            I010II();
/* 14 */            I010OIo1l();
/* 17 */            String strI00II0oii1o = l0iiii.I00II0oii1o();
/* 21 */            lII0I0I000I.I000II(strI00II0oii1o);
/* 26 */            ContentValues contentValues = new ContentValues();
/* 31 */            contentValues.put("app_id", strI00II0oii1o);
/* 34 */            l1iioiool l1iioioolVar = l1iioiool.ANALYTICS_STORAGE;
/* 39 */            if (z) {
/* 41 */                contentValues.put("app_instance_id", (String) null);
                    } else if (lilool0.I00000oIO(strI00II0oii1o).I000OOo1O(l1iioioolVar)) {
/* 59 */                contentValues.put("app_instance_id", l0iiii.I00IO1());
                    }
/* 68 */            contentValues.put("gmp_app_id", l0iiii.I00IOO());
/* 81 */            if (lilool0.I00000oIO(strI00II0oii1o).I000OOo1O(l1iioiool.AD_STORAGE)) {
/* 83 */                l0o10OoO0 l0o10ooo0 = l0olllo1i2.I00io1l;
/* 85 */                l0olllO1i.I000II(l0o10ooo0);
/* 88 */                l0o10ooo0.I010II();
/* 95 */                contentValues.put("resettable_device_id_hash", l0iiii.I0000oI00);
                    }
/* 98 */            l0o10OoO0 l0o10ooo02 = l0olllo1i2.I00io1l;
/* 100 */           l0olllO1i.I000II(l0o10ooo02);
/* 103 */           l0o10ooo02.I010II();
/* 114 */           contentValues.put("last_bundle_index", Long.valueOf(l0iiii.I000II));
/* 117 */           l0o10OoO0 l0o10ooo03 = l0olllo1i2.I00io1l;
/* 119 */           l0olllO1i.I000II(l0o10ooo03);
/* 122 */           l0o10ooo03.I010II();
/* 133 */           contentValues.put("last_bundle_start_timestamp", Long.valueOf(l0iiii.I000O01llI0));
/* 136 */           l0o10OoO0 l0o10ooo04 = l0olllo1i2.I00io1l;
/* 138 */           l0olllO1i.I000II(l0o10ooo04);
/* 141 */           l0o10ooo04.I010II();
/* 152 */           contentValues.put("last_bundle_end_timestamp", Long.valueOf(l0iiii.I000OOo1O));
/* 161 */           contentValues.put("app_version", l0iiii.I00IoiI());
/* 164 */           l0o10OoO0 l0o10ooo05 = l0olllo1i2.I00io1l;
/* 166 */           l0olllO1i.I000II(l0o10ooo05);
/* 169 */           l0o10ooo05.I010II();
/* 176 */           contentValues.put("app_store", l0iiii.I000l1);
/* 179 */           l0o10OoO0 l0o10ooo06 = l0olllo1i2.I00io1l;
/* 181 */           l0olllO1i.I000II(l0o10ooo06);
/* 184 */           l0o10ooo06.I010II();
/* 195 */           contentValues.put("gmp_version", Long.valueOf(l0iiii.I000lI));
/* 198 */           l0o10OoO0 l0o10ooo07 = l0olllo1i2.I00io1l;
/* 200 */           l0olllO1i.I000II(l0o10ooo07);
/* 203 */           l0o10ooo07.I010II();
/* 214 */           contentValues.put("dev_cert_hash", Long.valueOf(l0iiii.I000o00OoI0I));
/* 217 */           l0o10OoO0 l0o10ooo08 = l0olllo1i2.I00io1l;
/* 219 */           l0olllO1i.I000II(l0o10ooo08);
/* 222 */           l0o10ooo08.I010II();
/* 233 */           contentValues.put("measurement_enabled", Boolean.valueOf(l0iiii.I000oI1ioi));
/* 236 */           l0o10OoO0 l0o10ooo09 = l0olllo1i2.I00io1l;
/* 238 */           l0o10OoO0 l0o10ooo010 = l0olllo1i2.I00io1l;
/* 240 */           l0olllO1i.I000II(l0o10ooo09);
/* 243 */           l0o10ooo09.I010II();
/* 254 */           contentValues.put("day", Long.valueOf(l0iiii.I00Io1lO));
/* 257 */           l0olllO1i.I000II(l0o10ooo010);
/* 260 */           l0o10ooo010.I010II();
/* 271 */           contentValues.put("daily_public_events_count", Long.valueOf(l0iiii.I00Io1o110i));
/* 274 */           l0olllO1i.I000II(l0o10ooo010);
/* 277 */           l0o10ooo010.I010II();
/* 288 */           contentValues.put("daily_events_count", Long.valueOf(l0iiii.I00IoIO0lI));
/* 291 */           l0olllO1i.I000II(l0o10ooo010);
/* 294 */           l0o10ooo010.I010II();
/* 305 */           contentValues.put("daily_conversions_count", Long.valueOf(l0iiii.I00IoO0));
/* 308 */           l0o10OoO0 l0o10ooo011 = l0olllo1i2.I00io1l;
/* 310 */           l0olllO1i.I000II(l0o10ooo011);
/* 313 */           l0o10ooo011.I010II();
/* 324 */           contentValues.put("config_fetched_time", Long.valueOf(l0iiii.I00O10llo));
/* 327 */           l0o10OoO0 l0o10ooo012 = l0olllo1i2.I00io1l;
/* 329 */           l0olllO1i.I000II(l0o10ooo012);
/* 332 */           l0o10ooo012.I010II();
/* 343 */           contentValues.put("failed_config_fetch_time", Long.valueOf(l0iiii.I00OI1));
/* 356 */           contentValues.put("app_version_int", Long.valueOf(l0iiii.I00O0i0ii()));
/* 365 */           contentValues.put("firebase_instance_id", l0iiii.I00Io1lO());
/* 368 */           l0olllO1i.I000II(l0o10ooo010);
/* 371 */           l0o10ooo010.I010II();
/* 382 */           contentValues.put("daily_error_events_count", Long.valueOf(l0iiii.I00IoiI));
/* 385 */           l0olllO1i.I000II(l0o10ooo010);
/* 388 */           l0o10ooo010.I010II();
/* 399 */           contentValues.put("daily_realtime_events_count", Long.valueOf(l0iiii.I00Iooi00oi));
/* 402 */           l0olllO1i.I000II(l0o10ooo010);
/* 405 */           l0o10ooo010.I010II();
/* 412 */           contentValues.put("health_monitor_sample", l0iiii.I00O0i0ii);
/* 423 */           contentValues.put("android_id", (Long) 0L);
/* 426 */           l0o10OoO0 l0o10ooo013 = l0olllo1i2.I00io1l;
/* 428 */           l0olllO1i.I000II(l0o10ooo013);
/* 431 */           l0o10ooo013.I010II();
/* 442 */           contentValues.put("adid_reporting_enabled", Boolean.valueOf(l0iiii.I00100l0));
/* 455 */           contentValues.put("dynamite_version", Long.valueOf(l0iiii.I00000oOI()));
/* 466 */           if (lilool0.I00000oIO(strI00II0oii1o).I000OOo1O(l1iioioolVar)) {
/* 468 */               l0o10OoO0 l0o10ooo014 = l0olllo1i2.I00io1l;
/* 470 */               l0olllO1i.I000II(l0o10ooo014);
/* 473 */               l0o10ooo014.I010II();
/* 480 */               contentValues.put("session_stitching_token", l0iiii.I00111O);
                    }
/* 493 */           contentValues.put("sgtm_upload_enabled", Boolean.valueOf(l0iiii.I001l0I00()));
/* 496 */           l0o10OoO0 l0o10ooo015 = l0olllo1i2.I00io1l;
/* 498 */           l0olllO1i.I000II(l0o10ooo015);
/* 501 */           l0o10ooo015.I010II();
/* 512 */           contentValues.put("target_os_version", Long.valueOf(l0iiii.I001IO000));
/* 515 */           l0o10OoO0 l0o10ooo016 = l0olllo1i2.I00io1l;
/* 517 */           l0olllO1i.I000II(l0o10ooo016);
/* 520 */           l0o10ooo016.I010II();
/* 531 */           contentValues.put("session_stitching_token_hash", Long.valueOf(l0iiii.I001i1O0Ol));
/* 534 */           iIO0ooOool.I00000oIO();
/* 537 */           iIl1iil iil1iil = l0olllo1i.I00iio;
/* 539 */           l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 547 */           if (iil1iil.I01101IOlO(strI00II0oii1o, iol1II1ii1i.I0100i)) {
/* 549 */               l0o10OoO0 l0o10ooo017 = l0olllo1i2.I00io1l;
/* 551 */               l0olllO1i.I000II(l0o10ooo017);
/* 554 */               l0o10ooo017.I010II();
/* 565 */               contentValues.put("ad_services_version", Integer.valueOf(l0iiii.I001i1lo1io));
/* 568 */               l0o10OoO0 l0o10ooo018 = l0olllo1i2.I00io1l;
/* 570 */               l0olllO1i.I000II(l0o10ooo018);
/* 573 */               l0o10ooo018.I010II();
/* 584 */               contentValues.put("attribution_eligibility_status", Long.valueOf(l0iiii.I001lllioOl));
                    }
/* 587 */           l0o10OoO0 l0o10ooo019 = l0olllo1i2.I00io1l;
/* 589 */           l0olllO1i.I000II(l0o10ooo019);
/* 592 */           l0o10ooo019.I010II();
/* 603 */           contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(l0iiii.I001iOo1i0O));
/* 612 */           contentValues.put("npa_metadata_value", l0iiii.I001i1lo1io());
/* 615 */           l0o10OoO0 l0o10ooo020 = l0olllo1i2.I00io1l;
/* 617 */           l0olllO1i.I000II(l0o10ooo020);
/* 620 */           l0o10ooo020.I010II();
/* 631 */           contentValues.put("bundle_delivery_index", Long.valueOf(l0iiii.I00IO1));
/* 640 */           contentValues.put("sgtm_preview_key", l0iiii.I00II0Ol1O0l());
/* 643 */           l0olllO1i.I000II(l0o10ooo010);
/* 646 */           l0o10ooo010.I010II();
/* 657 */           contentValues.put("dma_consent_state", Integer.valueOf(l0iiii.I00II0Ol1O0l));
/* 660 */           l0olllO1i.I000II(l0o10ooo010);
/* 663 */           l0o10ooo010.I010II();
/* 674 */           contentValues.put("daily_realtime_dcu_count", Integer.valueOf(l0iiii.I00II0oii1o));
/* 683 */           contentValues.put("serialized_npa_metadata", l0iiii.I0010o());
/* 696 */           contentValues.put("client_upload_eligibility", Integer.valueOf(l0iiii.I00111O()));
/* 699 */           l0o10OoO0 l0o10ooo021 = l0olllo1i2.I00io1l;
/* 701 */           l0olllO1i.I000II(l0o10ooo021);
/* 704 */           l0o10ooo021.I010II();
/* 707 */           ArrayList arrayList = l0iiii.I0010o;
/* 711 */           if (arrayList != null) {
/* 717 */               if (arrayList.isEmpty()) {
/* 719 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 726 */                   l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("Safelisted events should not be an empty list. appId", strI00II0oii1o);
                        } else {
/* 736 */                   contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
                        }
                    }
/* 753 */           if (iil1iil.I01101IOlO(null, iol1II1ii1i.I00oo1iO0ll) && !contentValues.containsKey("safelisted_events")) {
/* 761 */               contentValues.put("safelisted_events", (String) null);
                    }
/* 764 */           l0o10OoO0 l0o10ooo022 = l0olllo1i2.I00io1l;
/* 766 */           l0olllO1i.I000II(l0o10ooo022);
/* 769 */           l0o10ooo022.I010II();
/* 776 */           contentValues.put("unmatched_pfo", l0iiii.I001l0I00);
/* 779 */           l0o10OoO0 l0o10ooo023 = l0olllo1i2.I00io1l;
/* 781 */           l0olllO1i.I000II(l0o10ooo023);
/* 784 */           l0o10ooo023.I010II();
/* 791 */           contentValues.put("unmatched_uwa", l0iiii.I001lIiIIo1O);
/* 794 */           l0o10OoO0 l0o10ooo024 = l0olllo1i2.I00io1l;
/* 796 */           l0olllO1i.I000II(l0o10ooo024);
/* 799 */           l0o10ooo024.I010II();
/* 806 */           contentValues.put("ad_campaign_info", l0iiii.I00IOO);
/* 815 */           if (iil1iil.I01101IOlO(strI00II0oii1o, iol1II1ii1i.I011IOil)) {
/* 817 */               l0o10OoO0 l0o10ooo025 = l0olllo1i2.I00io1l;
/* 819 */               l0olllO1i.I000II(l0o10ooo025);
/* 822 */               l0o10ooo025.I010II();
/* 833 */               contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(l0iiii.I00IlilI0i0i));
                    }
                    try {
/* 836 */               SQLiteDatabase sQLiteDatabaseI01Io11IiiiO = I01Io11IiiiO();
/* 853 */               if (sQLiteDatabaseI01Io11IiiiO.update("apps", contentValues, "app_id = ?", new String[]{strI00II0oii1o}) == 0 && sQLiteDatabaseI01Io11IiiiO.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
/* 866 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 877 */                   l01o0io1ooo0.I00ilO0.I0000Il00O("Failed to insert/update app (got -1). appId", l01O0IO1ooO0.I010ioo(strI00II0oii1o));
                        }
                    } catch (SQLiteException e) {
/* 884 */               l0olllO1i.I000II(l01o0io1ooo0);
/* 895 */               l01o0io1ooo0.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(strI00II0oii1o), "Error storing app. appId", e);
                    }
                }

                public final iOII1I I01OlOoii0(long j, String str, boolean z, boolean z2, boolean z3, boolean z4) {
/* 18 */            return I01Olioli(j, str, 1L, false, false, z, false, z2, z3, z4);
                }

                public final iOII1I I01Olioli(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
/* 4 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 6 */             lII0I0I000I.I0000O(str);
/* 9 */             I010II();
/* 12 */            I010OIo1l();
/* 15 */            String[] strArr = {str};
/* 21 */            iOII1I ioii1i = new iOII1I();
/* 24 */            Cursor cursorQuery = null;
                    try {
                        try {
/* 25 */                    SQLiteDatabase sQLiteDatabaseI01Io11IiiiO = I01Io11IiiiO();
/* 60 */                    cursorQuery = sQLiteDatabaseI01Io11IiiiO.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
/* 68 */                    if (cursorQuery.moveToFirst()) {
/* 103 */                       if (cursorQuery.getLong(0) == j) {
/* 110 */                           ioii1i.I00000oOI = cursorQuery.getLong(1);
/* 117 */                           ioii1i.I00000oIO = cursorQuery.getLong(2);
/* 124 */                           ioii1i.I0000Il00O = cursorQuery.getLong(3);
/* 131 */                           ioii1i.I0000O = cursorQuery.getLong(4);
/* 138 */                           ioii1i.I0000oI00 = cursorQuery.getLong(5);
/* 145 */                           ioii1i.I0001Ioi1lo = cursorQuery.getLong(6);
/* 152 */                           ioii1i.I000II = cursorQuery.getLong(7);
                                }
/* 154 */                       if (z) {
                                    ioii1i.I00000oOI += j2;
                                }
/* 162 */                       if (z2) {
                                    ioii1i.I00000oIO += j2;
                                }
/* 170 */                       if (z3) {
                                    ioii1i.I0000Il00O += j2;
                                }
/* 178 */                       if (z4) {
                                    ioii1i.I0000O += j2;
                                }
/* 186 */                       if (z5) {
                                    ioii1i.I0000oI00 += j2;
                                }
/* 194 */                       if (z6) {
                                    ioii1i.I0001Ioi1lo += j2;
                                }
/* 202 */                       if (z7) {
                                    ioii1i.I000II += j2;
                                }
/* 212 */                       ContentValues contentValues = new ContentValues();
/* 221 */                       contentValues.put("day", Long.valueOf(j));
/* 232 */                       contentValues.put("daily_public_events_count", Long.valueOf(ioii1i.I00000oIO));
/* 243 */                       contentValues.put("daily_events_count", Long.valueOf(ioii1i.I00000oOI));
/* 254 */                       contentValues.put("daily_conversions_count", Long.valueOf(ioii1i.I0000Il00O));
/* 265 */                       contentValues.put("daily_error_events_count", Long.valueOf(ioii1i.I0000O));
/* 276 */                       contentValues.put("daily_realtime_events_count", Long.valueOf(ioii1i.I0000oI00));
/* 287 */                       contentValues.put("daily_realtime_dcu_count", Long.valueOf(ioii1i.I0001Ioi1lo));
/* 298 */                       contentValues.put("daily_registered_triggers_count", Long.valueOf(ioii1i.I000II));
/* 305 */                       sQLiteDatabaseI01Io11IiiiO.update("apps", contentValues, "app_id=?", strArr);
                            } else {
/* 70 */                        l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 72 */                        l0olllO1i.I000II(l01o0io1ooo0);
/* 83 */                        l01o0io1ooo0.I00l0I0l0lO1.I0000Il00O("Not updating daily counts, app is not known. appId", l01O0IO1ooO0.I010ioo(str));
                            }
                        } catch (SQLiteException e) {
/* 309 */                   l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 311 */                   l0olllO1i.I000II(l01o0io1ooo02);
/* 322 */                   l01o0io1ooo02.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Error updating daily counts. appId", e);
                        }
/* 325 */               if (cursorQuery != null) {
/* 327 */                   cursorQuery.close();
                        }
/* 330 */               return ioii1i;
                    } finally {
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
                /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
                /* JADX WARN: Type inference failed for: r2v0 */
                /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
                /* JADX WARN: Type inference failed for: r2v2 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Oo1ol1ll I01OoIoio00O(String str) throws Throwable {
                    Throwable th;
                    Cursor cursorQuery;
/* 4 */             l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 6 */             lII0I0I000I.I0000O(str);
/* 9 */             I010II();
/* 12 */            I010OIo1l();
/* 15 */            ?? r2 = 0;
                    try {
                        try {
/* 41 */                    cursorQuery = I01Io11IiiiO().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                            try {
/* 49 */                        if (cursorQuery.moveToFirst()) {
/* 53 */                            byte[] blob = cursorQuery.getBlob(0);
/* 58 */                            String string = cursorQuery.getString(1);
/* 63 */                            String string2 = cursorQuery.getString(2);
/* 71 */                            if (cursorQuery.moveToNext()) {
/* 73 */                                l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 75 */                                l0olllO1i.I000II(l01o0io1ooo0);
/* 86 */                                l01o0io1ooo0.I00ilO0.I0000Il00O("Got multiple records for app config, expected one. appId", l01O0IO1ooO0.I010ioo(str));
                                    }
/* 95 */                            if (blob != null) {
/* 102 */                               Oo1ol1ll oo1ol1ll = new Oo1ol1ll(9);
/* 105 */                               oo1ol1ll.I00iiI = blob;
/* 107 */                               oo1ol1ll.I00iiO = string;
/* 109 */                               oo1ol1ll.I00iio = string2;
/* 111 */                               VarHandle.storeStoreFence();
/* 114 */                               cursorQuery.close();
/* 117 */                               return oo1ol1ll;
                                    }
                                }
                            } catch (SQLiteException e) {
/* 93 */                        e = e;
/* 127 */                       l01O0IO1ooO0 l01o0io1ooo02 = l0olllo1i.I00ilO0;
/* 129 */                       l0olllO1i.I000II(l01o0io1ooo02);
/* 140 */                       l01o0io1ooo02.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(str), "Error querying remote config. appId", e);
/* 143 */                       if (cursorQuery != null) {
                                }
/* 15 */                        return null;
                            }
                        } catch (Throwable th2) {
/* 91 */                    th = th2;
/* 118 */                   r2 = this;
/* 149 */                   if (r2 != 0) {
/* 168 */                       throw th;
                            }
/* 151 */                   r2.close();
/* 168 */                   throw th;
                        }
                    } catch (SQLiteException e2) {
/* 124 */               e = e2;
/* 126 */               cursorQuery = null;
                    } catch (Throwable th3) {
/* 122 */               th = th3;
/* 149 */               if (r2 != 0) {
                        }
                    }
/* 143 */           if (cursorQuery != null) {
/* 145 */               cursorQuery.close();
                    }
/* 15 */            return null;
                }

                public final void I01OoOi(l100ll0OOIoO l100ll0ooioo, boolean z) {
/* 1 */             I010II();
/* 4 */             I010OIo1l();
/* 11 */            lII0I0I000I.I0000O(l100ll0ooioo.I00111O());
/* 18 */            lII0I0I000I.I000OiO(l100ll0ooioo.I01i1I());
/* 21 */            I010oio1OO0();
/* 26 */            l0olllO1i l0olllo1i = (l0olllO1i) this.I00iOIl;
/* 28 */            Iioi0lilII iioi0lilII = l0olllo1i.I00li1OI;
/* 30 */            l01O0IO1ooO0 l01o0io1ooo0 = l0olllo1i.I00ilO0;
/* 32 */            iioi0lilII.getClass();
/* 35 */            long jCurrentTimeMillis = System.currentTimeMillis();
/* 39 */            long jI01i1oI = l100ll0ooioo.I01i1oI();
/* 43 */            iol01I0001 iol01i0001 = iol1II1ii1i.I00O0o1oo;
/* 60 */            if (jI01i1oI < jCurrentTimeMillis - ((Long) iol01i0001.I00000oIO(null)).longValue() || l100ll0ooioo.I01i1oI() > ((Long) iol01i0001.I00000oIO(null)).longValue() + jCurrentTimeMillis) {
/* 81 */                l0olllO1i.I000II(l01o0io1ooo0);
/* 108 */               l01o0io1ooo0.I00l0I0l0lO1.I0000oI00("Storing bundle outside of the max uploading time span. appId, now, timestamp", l01O0IO1ooO0.I010ioo(l100ll0ooioo.I00111O()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(l100ll0ooioo.I01i1oI()));
                    }
/* 111 */           byte[] bArrI00000oIO = l100ll0ooioo.I00000oIO();
                    try {
/* 117 */               lio010i lio010iVar = this.I00iiI.I00io1l;
/* 119 */               lilOOl0.I00O0o1oo(lio010iVar);
/* 122 */               byte[] bArrI01Iio10lo = lio010iVar.I01Iio10lo(bArrI00000oIO);
/* 126 */               l0olllO1i.I000II(l01o0io1ooo0);
/* 138 */               l01o0io1ooo0.I00lll10.I0000Il00O("Saving bundle, size", Integer.valueOf(bArrI01Iio10lo.length));
/* 143 */               ContentValues contentValues = new ContentValues();
/* 152 */               contentValues.put("app_id", l100ll0ooioo.I00111O());
/* 165 */               contentValues.put("bundle_end_timestamp", Long.valueOf(l100ll0ooioo.I01i1oI()));
/* 170 */               contentValues.put("data", bArrI01Iio10lo);
/* 179 */               contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
/* 186 */               if (l100ll0ooioo.I00l0OO0IO()) {
/* 198 */                   contentValues.put("retry_count", Integer.valueOf(l100ll0ooioo.I00li1OI()));
                        }
                        try {
/* 215 */                   if (I01Io11IiiiO().insert("queue", null, contentValues) == -1) {
/* 217 */                       l0olllO1i.I000II(l01o0io1ooo0);
/* 232 */                       l01o0io1ooo0.I00ilO0.I0000Il00O("Failed to insert bundle (got -1). appId", l01O0IO1ooO0.I010ioo(l100ll0ooioo.I00111O()));
                            }
                        } catch (SQLiteException e) {
/* 239 */                   l0olllO1i.I000II(l01o0io1ooo0);
/* 254 */                   l01o0io1ooo0.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(l100ll0ooioo.I00111O()), "Error storing bundle. appId", e);
                        }
                    } catch (IOException e2) {
/* 259 */               l0olllO1i.I000II(l01o0io1ooo0);
/* 274 */               l01o0io1ooo0.I00ilO0.I0000O(l01O0IO1ooO0.I010ioo(l100ll0ooioo.I00111O()), "Data loss. Failed to serialize bundle. appId", e2);
                    }
                }
            }
