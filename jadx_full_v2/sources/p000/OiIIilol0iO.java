            package p000;

            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import android.database.sqlite.SQLiteDatabaseLockedException;
            import android.os.SystemClock;
            import android.util.Base64;
            import java.io.Closeable;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Iterator;
            import java.util.Objects;
            
            public final class OiIIilol0iO implements Closeable {
                public static final Il0IIil I00ilO0 = Il0IIil.I00000oIO("proto");
                public OiOIoliOiII I00iOIl;
                public IOO0l0i0Oo I00iiI;
                public IOO0l0i0Oo I00iiO;
                public I1l0OIO0Oio I00iio;
                public OOiO01IO I00ilI0I1;

                public static Long I0000Il00O(SQLiteDatabase sQLiteDatabase, I1lO11 i1lO11) {
/* 5 */             StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
/* 30 */            ArrayList arrayList = new ArrayList(Arrays.asList(i1lO11.I00000oIO, String.valueOf(OOIioI1.I00000oIO(i1lO11.I0000Il00O))));
/* 33 */            byte[] bArr = i1lO11.I00000oOI;
/* 36 */            if (bArr != null) {
/* 40 */                sb.append(" and extras = ?");
/* 47 */                arrayList.add(Base64.encodeToString(bArr, 0));
                    } else {
/* 53 */                sb.append(" and extras is null");
                    }
/* 81 */            Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
                    try {
/* 97 */                return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
                    } finally {
/* 107 */               cursorQuery.close();
                    }
                }

                public static String I001i1lo1io(Iterable iterable) {
/* 5 */             StringBuilder sb = new StringBuilder("(");
/* 8 */             Iterator it = iterable.iterator();
/* 16 */            while (it.hasNext()) {
/* 26 */                sb.append(((I1lI0I0i1) it.next()).I00000oIO);
/* 33 */                if (it.hasNext()) {
/* 37 */                    sb.append(',');
                        }
                    }
/* 43 */            sb.append(')');
/* 46 */            return sb.toString();
                }

                public static Object I001l0I00(Cursor cursor, OiIIOlilOlo oiIIOlilOlo) {
                    try {
/* 1 */                 return oiIIOlilOlo.apply(cursor);
                    } finally {
/* 10 */                cursor.close();
                    }
                }

                public final SQLiteDatabase I00000oIO() {
/* 1 */             OiOIoliOiII oiOIoliOiII = this.I00iOIl;
/* 3 */             Objects.requireNonNull(oiOIoliOiII);
/* 6 */             IOO0l0i0Oo iOO0l0i0Oo = this.I00iiO;
/* 8 */             long jI0001Ioi1lo = iOO0l0i0Oo.I0001Ioi1lo();
                    while (true) {
                        try {
/* 12 */                    return oiOIoliOiII.getWritableDatabase();
                        } catch (SQLiteDatabaseLockedException e) {
/* 30 */                    if (iOO0l0i0Oo.I0001Ioi1lo() >= this.I00iio.I0000Il00O + jI0001Ioi1lo) {
/* 55 */                        throw new OllIlol("Timed out while trying to open db.", e);
                            }
/* 34 */                    SystemClock.sleep(50L);
                        }
                    }
                }

                public final Object I000II(OiIIOlilOlo oiIIOlilOlo) {
/* 1 */             SQLiteDatabase sQLiteDatabaseI00000oIO = I00000oIO();
/* 5 */             sQLiteDatabaseI00000oIO.beginTransaction();
                    try {
/* 8 */                 Object objApply = oiIIOlilOlo.apply(sQLiteDatabaseI00000oIO);
/* 12 */                sQLiteDatabaseI00000oIO.setTransactionSuccessful();
/* 18 */                return objApply;
                    } finally {
/* 20 */                sQLiteDatabaseI00000oIO.endTransaction();
                    }
                }

                public final ArrayList I000O01llI0(SQLiteDatabase sQLiteDatabase, I1lO11 i1lO11, int i) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             Long lI0000Il00O = I0000Il00O(sQLiteDatabase, i1lO11);
/* 10 */            if (lI0000Il00O == null) {
/* 12 */                return arrayList;
                    }
/* 56 */            Cursor cursorQuery = sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lI0000Il00O.toString()}, null, null, null, String.valueOf(i));
/* 64 */            IiI0oIlol0 iiI0oIlol0 = new IiI0oIlol0(8);
/* 69 */            iiI0oIlol0.I00iiI = this;
/* 71 */            iiI0oIlol0.I00iio = arrayList;
/* 75 */            iiI0oIlol0.I00iiO = i1lO11;
/* 77 */            VarHandle.storeStoreFence();
/* 80 */            I001l0I00(cursorQuery, iiI0oIlol0);
/* 98 */            return arrayList;
                }

                public final void I000l1(long j, O1I0ol o1I0ol, String str) {
/* 3 */             OiIIIol oiIIIol = new OiIIIol();
/* 6 */             oiIIIol.I00iiI = str;
/* 8 */             oiIIIol.I00iiO = o1I0ol;
/* 10 */            oiIIIol.I00iOIl = j;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            I000II(oiIIIol);
                }

                public final Object I00100l0(OllIoO1OO ollIoO1OO) {
/* 1 */             SQLiteDatabase sQLiteDatabaseI00000oIO = I00000oIO();
/* 5 */             IOO0l0i0Oo iOO0l0i0Oo = this.I00iiO;
/* 7 */             long jI0001Ioi1lo = iOO0l0i0Oo.I0001Ioi1lo();
                    while (true) {
                        try {
/* 11 */                    sQLiteDatabaseI00000oIO.beginTransaction();
                            try {
/* 14 */                        Object objI000oI1ioi = ollIoO1OO.I000oI1ioi();
/* 18 */                        sQLiteDatabaseI00000oIO.setTransactionSuccessful();
/* 24 */                        return objI000oI1ioi;
                            } finally {
/* 26 */                        sQLiteDatabaseI00000oIO.endTransaction();
                            }
                        } catch (SQLiteDatabaseLockedException e) {
/* 43 */                    if (iOO0l0i0Oo.I0001Ioi1lo() >= this.I00iio.I0000Il00O + jI0001Ioi1lo) {
/* 77 */                        throw new OllIlol("Timed out while trying to acquire the lock.", e);
                            }
/* 47 */                    SystemClock.sleep(50L);
                        }
                    }
                }

                @Override
                public final void close() {
/* 3 */             this.I00iOIl.close();
                }
            }
