            package p000;
            
            public abstract class O1loO1O1OO {
                public final int I00000oIO;
                public final int I00000oOI;

                public O1loO1O1OO(int i, int i2) {
/* 4 */             this.I00000oIO = i;
/* 6 */             this.I00000oOI = i2;
                }

                public void I00000oIO(Olil0III olil0III) {
/* 3 */             if (!(olil0III instanceof Olil0III)) {
/* 29 */                throw new OIO01O("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
                    }
/* 7 */             I00000oOI(olil0III.I00iOIl);
                }

                public void I00000oOI(Olil0l0 olil0l0) {
/* 29 */            throw new OIO01O("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
                }
            }
