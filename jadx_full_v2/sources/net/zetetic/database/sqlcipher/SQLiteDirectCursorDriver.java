            package net.zetetic.database.sqlcipher;

            import android.os.CancellationSignal;
            
            public final class SQLiteDirectCursorDriver implements SQLiteCursorDriver {
                public final SQLiteDatabase I00000oIO;
                public final String I00000oOI;
                public final String I0000Il00O;
                public final CancellationSignal I0000O;

                public SQLiteDirectCursorDriver(SQLiteDatabase sQLiteDatabase, String str, String str2, CancellationSignal cancellationSignal) {
/* 4 */             this.I00000oIO = sQLiteDatabase;
/* 6 */             this.I00000oOI = str2;
/* 8 */             this.I0000Il00O = str;
/* 10 */            this.I0000O = cancellationSignal;
                }

                public final String toString() {
/* 13 */            return "SQLiteDirectCursorDriver: " + this.I0000Il00O;
                }
            }
