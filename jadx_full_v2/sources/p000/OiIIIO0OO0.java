            package p000;

            import android.content.ContentValues;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import java.lang.invoke.VarHandle;
            
            public final class OiIIIO0OO0 implements OiIIOlilOlo {
                public final int I00iOIl;
                public long I00iiI;
                public Object I00iiO;

                public OiIIIO0OO0(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object apply(Object obj) {
                    switch (this.I00iOIl) {
                        case 0:
/* 80 */                    OiIIilol0iO oiIIilol0iO = (OiIIilol0iO) this.I00iiO;
/* 82 */                    long j = this.I00iiI;
/* 84 */                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
/* 86 */                    oiIIilol0iO.getClass();
/* 93 */                    String[] strArr = {String.valueOf(j)};
/* 99 */                    Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
/* 106 */                   OiIIOl oiIIOl = new OiIIOl(0);
/* 109 */                   oiIIOl.I00iiI = oiIIilol0iO;
/* 111 */                   VarHandle.storeStoreFence();
/* 114 */                   OiIIilol0iO.I001l0I00(cursorRawQuery, oiIIOl);
/* 125 */                   return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
                        default:
/* 6 */                     long j2 = this.I00iiI;
/* 10 */                    I1lO11 i1lO11 = (I1lO11) this.I00iiO;
/* 12 */                    SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
/* 16 */                    ContentValues contentValues = new ContentValues();
/* 25 */                    contentValues.put("next_request_ms", Long.valueOf(j2));
/* 28 */                    String str = i1lO11.I00000oIO;
/* 30 */                    OOIio1010OoO oOIio1010OoO = i1lO11.I0000Il00O;
/* 54 */                    if (sQLiteDatabase2.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(OOIioI1.I00000oIO(oOIio1010OoO))}) < 1) {
/* 58 */                        contentValues.put("backend_name", str);
/* 71 */                        contentValues.put("priority", Integer.valueOf(OOIioI1.I00000oIO(oOIio1010OoO)));
/* 74 */                        sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                            }
/* 53 */                    return null;
                    }
                }
            }
