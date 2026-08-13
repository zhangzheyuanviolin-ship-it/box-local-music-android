            package p000;

            import android.database.SQLException;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteOpenHelper;
            import java.util.Arrays;
            import java.util.List;
            
            public final class OiOIoliOiII extends SQLiteOpenHelper {
                public static final String I00iiO = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";
                public static final int I00iio = 5;
                public static final List I00ilI0I1 = Arrays.asList(new OiOIol0l(0), new OiOIol0l(1), new OiOIol0l(2), new OiOIol0l(3), new OiOIol0l(4));
                public int I00iOIl;
                public boolean I00iiI;

                public static void I00000oIO(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
/* 1 */             List list = I00ilI0I1;
/* 7 */             if (i2 > list.size()) {
/* 123 */               StringBuilder sbI0010I0i = IIl001iO0Io.I0010I0i("Migration from ", i, " to ", i2, " was requested, but cannot be performed. Only ");
/* 131 */               sbI0010I0i.append(list.size());
/* 136 */               sbI0010I0i.append(" migrations are provided");
/* 146 */               throw new IllegalArgumentException(sbI0010I0i.toString());
                    }
/* 9 */             while (i < i2) {
                        switch (((OiOIol0l) list.get(i)).I00000oIO) {
                            case 0:
/* 88 */                        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
/* 93 */                        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
/* 98 */                        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
/* 103 */                       sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
/* 108 */                       sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                                break;
                            case 1:
/* 72 */                        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
/* 77 */                        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
/* 82 */                        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
                                break;
                            case 2:
/* 66 */                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                                break;
                            case 3:
/* 50 */                        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
/* 55 */                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
/* 60 */                        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                                break;
                            default:
/* 24 */                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
/* 29 */                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
/* 34 */                        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
/* 39 */                        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
/* 44 */                        sQLiteDatabase.execSQL(I00iiO);
                                break;
                        }
/* 111 */               i++;
                    }
                }

                @Override
                public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
/* 2 */             this.I00iiI = true;
/* 13 */            sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
/* 16 */            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
                }

                @Override
                public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
/* 1 */             int i = this.I00iOIl;
/* 5 */             if (!this.I00iiI) {
/* 7 */                 onConfigure(sQLiteDatabase);
                    }
/* 11 */            I00000oIO(sQLiteDatabase, 0, i);
                }

                @Override
                public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
/* 3 */             sQLiteDatabase.execSQL("DROP TABLE events");
/* 8 */             sQLiteDatabase.execSQL("DROP TABLE event_metadata");
/* 13 */            sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
/* 18 */            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
/* 23 */            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
/* 28 */            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
/* 33 */            if (!this.I00iiI) {
/* 35 */                onConfigure(sQLiteDatabase);
                    }
/* 39 */            I00000oIO(sQLiteDatabase, 0, i2);
                }

                @Override
                public final void onOpen(SQLiteDatabase sQLiteDatabase) {
/* 3 */             if (this.I00iiI) {
/* 29 */                return;
                    }
/* 5 */             onConfigure(sQLiteDatabase);
                }

                @Override
                public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) throws SQLException {
/* 3 */             if (!this.I00iiI) {
/* 5 */                 onConfigure(sQLiteDatabase);
                    }
/* 8 */             I00000oIO(sQLiteDatabase, i, i2);
                }
            }
