            package p000;

            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.HashMap;
            
            public final class OiIIOl implements OiIIOlilOlo, OllIoO1OO {
                public final int I00iOIl;
                public OiIIilol0iO I00iiI;

                public OiIIOl(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public Object I000oI1ioi() {
/* 1 */             int i = this.I00iOIl;
/* 3 */             int i2 = 0;
/* 4 */             OiIIilol0iO oiIIilol0iO = this.I00iiI;
                    switch (i) {
                        case 1:
/* 42 */                    oiIIilol0iO.getClass();
/* 45 */                    int i3 = IOIololliO.I0000oI00;
/* 50 */                    iOliil ioliil = new iOliil(3);
/* 54 */                    ioliil.I00iiI = null;
/* 61 */                    ioliil.I00iiO = new ArrayList();
/* 63 */                    ioliil.I00iio = null;
/* 67 */                    ioliil.I00ilI0I1 = "";
/* 71 */                    HashMap map = new HashMap();
/* 76 */                    SQLiteDatabase sQLiteDatabaseI00000oIO = oiIIilol0iO.I00000oIO();
/* 80 */                    sQLiteDatabaseI00000oIO.beginTransaction();
                            try {
/* 85 */                        Cursor cursorRawQuery = sQLiteDatabaseI00000oIO.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]);
/* 92 */                        IiI0oIlol0 iiI0oIlol0 = new IiI0oIlol0(6);
/* 95 */                        iiI0oIlol0.I00iiI = oiIIilol0iO;
/* 97 */                        iiI0oIlol0.I00iiO = map;
/* 99 */                        iiI0oIlol0.I00iio = ioliil;
/* 101 */                       VarHandle.storeStoreFence();
/* 108 */                       IOIololliO iOIololliO = (IOIololliO) OiIIilol0iO.I001l0I00(cursorRawQuery, iiI0oIlol0);
/* 110 */                       sQLiteDatabaseI00000oIO.setTransactionSuccessful();
/* 116 */                       return iOIololliO;
                            } finally {
/* 118 */                       sQLiteDatabaseI00000oIO.endTransaction();
                            }
                        default:
/* 19 */                    long jI0001Ioi1lo = oiIIilol0iO.I00iiI.I0001Ioi1lo() - oiIIilol0iO.I00iio.I0000O;
/* 22 */                    OiIIIO0OO0 oiIIIO0OO0 = new OiIIIO0OO0(i2);
/* 25 */                    oiIIIO0OO0.I00iiO = oiIIilol0iO;
/* 27 */                    oiIIIO0OO0.I00iiI = jI0001Ioi1lo;
/* 29 */                    VarHandle.storeStoreFence();
/* 36 */                    Integer num = (Integer) oiIIilol0iO.I000II(oiIIIO0OO0);
/* 38 */                    num.intValue();
/* 41 */                    return num;
                    }
                }

                @Override
                public Object apply(Object obj) {
/* 1 */             OiIIilol0iO oiIIilol0iO = this.I00iiI;
/* 3 */             Cursor cursor = (Cursor) obj;
/* 5 */             oiIIilol0iO.getClass();
/* 12 */            while (cursor.moveToNext()) {
/* 27 */                oiIIilol0iO.I000l1(cursor.getInt(0), O1I0ol.MESSAGE_TOO_OLD, cursor.getString(1));
                    }
/* 31 */            return null;
                }
            }
