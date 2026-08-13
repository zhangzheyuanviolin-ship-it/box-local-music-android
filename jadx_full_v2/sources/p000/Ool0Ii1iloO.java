            package p000;

            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import java.lang.invoke.VarHandle;
            
            public final class Ool0Ii1iloO implements OllIoO1OO {
                public final int I00iOIl;
                public IiOili0lOO1 I00iiI;
                public I1lO11 I00iiO;

                public Ool0Ii1iloO(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object I000oI1ioi() {
                    Boolean bool;
                    switch (this.I00iOIl) {
                        case 0:
/* 38 */                    IiOili0lOO1 iiOili0lOO1 = this.I00iiI;
/* 40 */                    I1lO11 i1lO11 = this.I00iiO;
/* 44 */                    OiIIilol0iO oiIIilol0iO = (OiIIilol0iO) iiOili0lOO1.I00iio;
/* 46 */                    SQLiteDatabase sQLiteDatabaseI00000oIO = oiIIilol0iO.I00000oIO();
/* 50 */                    sQLiteDatabaseI00000oIO.beginTransaction();
                            try {
/* 53 */                        Long lI0000Il00O = OiIIilol0iO.I0000Il00O(sQLiteDatabaseI00000oIO, i1lO11);
/* 57 */                        if (lI0000Il00O == null) {
/* 59 */                            bool = Boolean.FALSE;
                                } else {
/* 76 */                            Cursor cursorRawQuery = oiIIilol0iO.I00000oIO().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lI0000Il00O.toString()});
                                    try {
/* 84 */                                Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
/* 88 */                                cursorRawQuery.close();
/* 91 */                                bool = boolValueOf;
                                    } catch (Throwable th) {
/* 102 */                               cursorRawQuery.close();
/* 105 */                               throw th;
                                    }
                                }
/* 92 */                        sQLiteDatabaseI00000oIO.setTransactionSuccessful();
/* 98 */                        return bool;
                            } finally {
/* 106 */                       sQLiteDatabaseI00000oIO.endTransaction();
                            }
                        default:
/* 6 */                     IiOili0lOO1 iiOili0lOO12 = this.I00iiI;
/* 8 */                     I1lO11 i1lO112 = this.I00iiO;
/* 12 */                    OiIIilol0iO oiIIilol0iO2 = (OiIIilol0iO) iiOili0lOO12.I00iio;
/* 14 */                    oiIIilol0iO2.getClass();
/* 21 */                    IIoIil iIoIil = new IIoIil(16);
/* 24 */                    iIoIil.I00iiI = oiIIilol0iO2;
/* 26 */                    iIoIil.I00iiO = i1lO112;
/* 28 */                    VarHandle.storeStoreFence();
/* 35 */                    return (Iterable) oiIIilol0iO2.I000II(iIoIil);
                    }
                }
            }
