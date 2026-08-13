            package p000;

            import android.content.ContentValues;
            import android.database.Cursor;
            import android.database.SQLException;
            import android.database.sqlite.SQLiteDatabase;
            import java.lang.invoke.VarHandle;
            
            public final class OiIIIol implements OiIIOlilOlo, OllIoO1OO {
                public long I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                @Override
                public Object I000oI1ioi() {
/* 3 */             IiOili0lOO1 iiOili0lOO1 = (IiOili0lOO1) this.I00iiI;
/* 7 */             I1lO11 i1lO11 = (I1lO11) this.I00iiO;
/* 9 */             long j = this.I00iOIl;
/* 13 */            OiIIilol0iO oiIIilol0iO = (OiIIilol0iO) iiOili0lOO1.I00iio;
/* 23 */            long jI0001Ioi1lo = ((IOO0l0i0Oo) iiOili0lOO1.I00ioIO).I0001Ioi1lo() + j;
/* 24 */            oiIIilol0iO.getClass();
/* 30 */            OiIIIO0OO0 oiIIIO0OO0 = new OiIIIO0OO0(1);
/* 33 */            oiIIIO0OO0.I00iiI = jI0001Ioi1lo;
/* 35 */            oiIIIO0OO0.I00iiO = i1lO11;
/* 37 */            VarHandle.storeStoreFence();
/* 40 */            oiIIilol0iO.I000II(oiIIIO0OO0);
/* 43 */            return null;
                }

                @Override
                public Object apply(Object obj) throws SQLException {
/* 3 */             String str = (String) this.I00iiI;
/* 7 */             O1I0ol o1I0ol = (O1I0ol) this.I00iiO;
/* 9 */             long j = this.I00iOIl;
/* 11 */            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
/* 13 */            int i = o1I0ol.I00iOIl;
/* 25 */            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i)});
                    try {
/* 37 */                boolean z = cursorRawQuery.getCount() > 0;
/* 38 */                cursorRawQuery.close();
/* 42 */                if (z) {
/* 94 */                    sQLiteDatabase.execSQL(IlIi0I0.I000l1(j, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i)});
/* 41 */                    return null;
                        }
/* 46 */                ContentValues contentValues = new ContentValues();
/* 51 */                contentValues.put("log_source", str);
/* 60 */                contentValues.put("reason", Integer.valueOf(i));
/* 69 */                contentValues.put("events_dropped_count", Long.valueOf(j));
/* 74 */                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
/* 41 */                return null;
                    } catch (Throwable th) {
/* 99 */                cursorRawQuery.close();
/* 168 */               throw th;
                    }
                }
            }
