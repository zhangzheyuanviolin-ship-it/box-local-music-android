            package net.zetetic.database.sqlcipher;

            import p000.Olil0l0;
            import p000.Olil0oI0110I;
            import p000.Olil10OiIi1l;
            
/* 23 */    public class SupportHelper implements Olil10OiIi1l {
                public final SQLiteOpenHelper I00iOIl;

                public SupportHelper(final Olil0oI0110I olil0oI0110I, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z, int i) {
/* 22 */            this.I00iOIl = new SQLiteOpenHelper(olil0oI0110I.I00000oIO, olil0oI0110I.I00000oOI, bArr, olil0oI0110I.I0000Il00O.I00iiI, i, sQLiteDatabaseHook, z) {
                        @Override
                        public final void I0000Il00O() {
/* 5 */                     olil0oI0110I.I0000Il00O.getClass();
                        }

                        @Override
                        public final void I000II(SQLiteDatabase sQLiteDatabase) {
/* 5 */                     olil0oI0110I.I0000Il00O.I000lI(sQLiteDatabase);
                        }

                        @Override
                        public final void I000O01llI0(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
/* 5 */                     olil0oI0110I.I0000Il00O.I000o00OoI0I(sQLiteDatabase, i2, i3);
                        }

                        @Override
                        public final void I000l1(SQLiteDatabase sQLiteDatabase) throws Throwable {
/* 5 */                     olil0oI0110I.I0000Il00O.I000oI1ioi(sQLiteDatabase);
                        }

                        @Override
                        public final void I00100l0(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
/* 5 */                     olil0oI0110I.I0000Il00O.I00100l0(sQLiteDatabase, i2, i3);
                        }
                    };
                }

                @Override
                public final Olil0l0 I00Oio() {
                    SQLiteDatabase sQLiteDatabaseI00000oIO;
/* 1 */             SQLiteOpenHelper sQLiteOpenHelper = this.I00iOIl;
                    synchronized (sQLiteOpenHelper) {
/* 5 */                 sQLiteDatabaseI00000oIO = sQLiteOpenHelper.I00000oIO(true);
                    }
/* 10 */            return sQLiteDatabaseI00000oIO;
                }

                @Override
                public final void close() {
/* 3 */             this.I00iOIl.close();
                }

                @Override
                public final String getDatabaseName() {
/* 3 */             return this.I00iOIl.I00iiI;
                }

                @Override
                public final void setWriteAheadLoggingEnabled(boolean z) {
/* 3 */             this.I00iOIl.setWriteAheadLoggingEnabled(z);
                }

/* 24 */        public SupportHelper(Olil0oI0110I olil0oI0110I, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
/* 25 */            this(olil0oI0110I, bArr, sQLiteDatabaseHook, z, 0);
                }
            }
