            package net.zetetic.database.sqlcipher;

            import android.database.sqlite.SQLiteDatabaseCorruptException;
            import android.util.EventLog;
            import p000.OlilOOI;
            
            public final class SQLiteStatement extends SQLiteProgram implements OlilOOI {
                public final int I000l1() {
/* 1 */             I00000oIO();
                    try {
                        try {
/* 6 */                     SQLiteSession sQLiteSessionI00Io1lO = this.I00iiI.I00Io1lO();
/* 10 */                    String str = this.I00iiO;
/* 12 */                    Object[] objArr = this.I00io1l;
/* 14 */                    SQLiteDatabase sQLiteDatabase = this.I00iiI;
/* 16 */                    boolean z = this.I00iio;
/* 18 */                    sQLiteDatabase.getClass();
/* 25 */                    return sQLiteSessionI00Io1lO.I0000oI00(SQLiteDatabase.I00IioO0OiOi(z), str, objArr);
                        } catch (SQLiteDatabaseCorruptException e) {
/* 36 */                    SQLiteDatabase sQLiteDatabase2 = this.I00iiI;
                            synchronized (sQLiteDatabase2.I00ilI0I1) {
/* 49 */                        EventLog.writeEvent(75004, sQLiteDatabase2.I00io1l.I00000oOI);
/* 54 */                        sQLiteDatabase2.I00iio.I00000oIO(sQLiteDatabase2);
/* 57 */                        throw e;
                            }
                        }
                    } finally {
/* 61 */                I000II();
                    }
                }

                @Override
                public final void I000oI1ioi() {
/* 1 */             I00000oIO();
                    try {
                        try {
/* 6 */                     SQLiteSession sQLiteSessionI00Io1lO = this.I00iiI.I00Io1lO();
/* 10 */                    String str = this.I00iiO;
/* 12 */                    Object[] objArr = this.I00io1l;
/* 14 */                    SQLiteDatabase sQLiteDatabase = this.I00iiI;
/* 16 */                    boolean z = this.I00iio;
/* 18 */                    sQLiteDatabase.getClass();
/* 25 */                    sQLiteSessionI00Io1lO.I0000O(SQLiteDatabase.I00IioO0OiOi(z), str, objArr);
                        } catch (SQLiteDatabaseCorruptException e) {
/* 35 */                    SQLiteDatabase sQLiteDatabase2 = this.I00iiI;
                            synchronized (sQLiteDatabase2.I00ilI0I1) {
/* 48 */                        EventLog.writeEvent(75004, sQLiteDatabase2.I00io1l.I00000oOI);
/* 53 */                        sQLiteDatabase2.I00iio.I00000oIO(sQLiteDatabase2);
/* 56 */                        throw e;
                            }
                        }
                    } finally {
/* 60 */                I000II();
                    }
                }

                public final String toString() {
/* 13 */            return "SQLiteProgram: " + this.I00iiO;
                }
            }
