            package net.zetetic.database.sqlcipher;

            import android.database.CursorWindow;
            import android.database.sqlite.SQLiteDatabaseCorruptException;
            import android.database.sqlite.SQLiteException;
            import android.os.CancellationSignal;
            import android.util.EventLog;
            import android.util.Log;
            
            public final class SQLiteQuery extends SQLiteProgram {
                public final CancellationSignal I00l0I0l0lO1;

                public SQLiteQuery(SQLiteDatabase sQLiteDatabase, String str, CancellationSignal cancellationSignal) {
/* 2 */             super(sQLiteDatabase, str, null, cancellationSignal);
/* 5 */             this.I00l0I0l0lO1 = cancellationSignal;
                }

                public final int I000l1(CursorWindow cursorWindow, int i, int i2, boolean z) {
                    CursorWindow cursorWindow2;
                    String str;
/* 3 */             I00000oIO();
                    try {
                        try {
/* 6 */                     cursorWindow.acquireReference();
                        } catch (Throwable th) {
/* 50 */                    th = th;
                        }
                        try {
/* 11 */                    SQLiteSession sQLiteSessionI00Io1lO = this.I00iiI.I00Io1lO();
/* 15 */                    String str2 = this.I00iiO;
/* 17 */                    Object[] objArr = this.I00io1l;
/* 19 */                    SQLiteDatabase sQLiteDatabase = this.I00iiI;
/* 21 */                    boolean z2 = this.I00iio;
/* 23 */                    sQLiteDatabase.getClass();
/* 26 */                    int iI00IioO0OiOi = SQLiteDatabase.I00IioO0OiOi(z2);
/* 32 */                    cursorWindow2 = cursorWindow;
                            try {
/* 36 */                        int iI0001Ioi1lo = sQLiteSessionI00Io1lO.I0001Ioi1lo(str2, objArr, cursorWindow2, i, i2, z, iI00IioO0OiOi, this.I00l0I0l0lO1);
/* 40 */                        cursorWindow2.releaseReference();
/* 43 */                        I000II();
/* 46 */                        return iI0001Ioi1lo;
                            } catch (SQLiteDatabaseCorruptException e) {
/* 56 */                        e = e;
/* 57 */                        SQLiteDatabaseCorruptException sQLiteDatabaseCorruptException = e;
/* 100 */                       SQLiteDatabase sQLiteDatabase2 = this.I00iiI;
                                synchronized (sQLiteDatabase2.I00ilI0I1) {
/* 107 */                           str = sQLiteDatabase2.I00io1l.I00000oOI;
                                }
/* 113 */                       EventLog.writeEvent(75004, str);
/* 118 */                       sQLiteDatabase2.I00iio.I00000oIO(sQLiteDatabase2);
/* 121 */                       throw sQLiteDatabaseCorruptException;
                            } catch (SQLiteException e2) {
/* 53 */                        e = e2;
/* 54 */                        SQLiteException sQLiteException = e;
/* 96 */                        Log.e("SQLiteQuery", "exception: " + sQLiteException.getMessage() + "; query: " + this.I00iiO);
/* 99 */                        throw sQLiteException;
                            }
                        } catch (SQLiteDatabaseCorruptException e3) {
/* 65 */                    e = e3;
/* 66 */                    cursorWindow2 = cursorWindow;
                        } catch (SQLiteException e4) {
/* 62 */                    e = e4;
                        } catch (Throwable th2) {
/* 59 */                    th = th2;
/* 60 */                    cursorWindow2 = cursorWindow;
/* 51 */                    Throwable th3 = th;
/* 126 */                   cursorWindow2.releaseReference();
/* 129 */                   throw th3;
                        }
                    } catch (Throwable th4) {
/* 130 */               I000II();
/* 483 */               throw th4;
                    }
                }

                public final String toString() {
/* 13 */            return "SQLiteQuery: " + this.I00iiO;
                }
            }
