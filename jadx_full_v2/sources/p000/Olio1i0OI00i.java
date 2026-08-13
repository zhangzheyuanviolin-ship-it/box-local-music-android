            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.database.sqlite.SQLiteDatabase;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import java.util.concurrent.ScheduledFuture;
            
            public final class Olio1i0OI00i implements IIiOOIoi0, OllIoO1OO, OIOolOo, Olil0oi, IoiO1iOOil11 {
                public final int I00iOIl;
                public Object I00iiI;

                public Olio1i0OI00i(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public void I0000Il00O(IoiO1ilO ioiO1ilO) throws Exception {
/* 3 */             i0I11Oo1 i0i11oo1 = (i0I11Oo1) this.I00iiI;
                    try {
/* 5 */                 IoiO1IO1I1i ioiO1IO1I1iI00000oOI = ioiO1ilO.I00000oOI();
/* 9 */                 if (ioiO1IO1I1iI00000oOI != null) {
/* 13 */                    i0i11oo1.I0000Il00O.I00000oOI(ioiO1IO1I1iI00000oOI);
                        }
                    } catch (IllegalStateException unused) {
/* 24 */                if (l11I11lO.I0000O(6, "CXCP")) {
/* 28 */                    Log.e("CXCP", "Failed to acquire latest image");
                        }
                    }
                }

                @Override
                public Object I000oI1ioi() {
/* 1 */             int i = this.I00iOIl;
/* 4 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 3:
/* 59 */                    OiIIilol0iO oiIIilol0iO = (OiIIilol0iO) ((IiOili0lOO1) obj).I00l0OO0IO;
/* 61 */                    SQLiteDatabase sQLiteDatabaseI00000oIO = oiIIilol0iO.I00000oIO();
/* 65 */                    sQLiteDatabaseI00000oIO.beginTransaction();
                            try {
/* 74 */                        sQLiteDatabaseI00000oIO.compileStatement("DELETE FROM log_event_dropped").execute();
/* 101 */                       sQLiteDatabaseI00000oIO.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + oiIIilol0iO.I00iiI.I0001Ioi1lo()).execute();
/* 104 */                       sQLiteDatabaseI00000oIO.setTransactionSuccessful();
/* 3 */                         return null;
                            } finally {
/* 112 */                       sQLiteDatabaseI00000oIO.endTransaction();
                            }
                        default:
/* 9 */                     o01l1ioOo0 o01l1iooo0 = (o01l1ioOo0) obj;
/* 28 */                    Iterator it = ((Iterable) ((OiIIilol0iO) o01l1iooo0.I00iiI).I000II(new OIiilo1Ool0o(16))).iterator();
/* 36 */                    while (it.hasNext()) {
/* 50 */                        ((IOO000ilo) o01l1iooo0.I00iiO).I00II0Ol1O0l((I1lO11) it.next(), 1, false);
                            }
/* 3 */                     return null;
                    }
                }

                @Override
                public Olil10OiIi1l I00IoIO0lI(Olil0oI0110I olil0oI0110I) {
/* 3 */             Context context = (Context) this.I00iiI;
/* 5 */             String str = olil0oI0110I.I00000oOI;
/* 7 */             O1I1OO o1i1oo = olil0oI0110I.I0000Il00O;
/* 9 */             if (str == null || str.length() == 0) {
/* 57 */                I000II.I000iOII("Must set a non-null database name to a configuration that uses the no backup directory.");
/* 60 */                return null;
                    }
/* 19 */            IllOI1IoO illOI1IoO = new IllOI1IoO();
/* 22 */            illOI1IoO.I00iOIl = context;
/* 24 */            illOI1IoO.I00iiI = str;
/* 26 */            illOI1IoO.I00iiO = o1i1oo;
/* 29 */            illOI1IoO.I00iio = true;
/* 31 */            illOI1IoO.I00ilI0I1 = true;
/* 36 */            IlIi0Il ilIi0Il = new IlIi0Il(2);
/* 39 */            ilIi0Il.I00iiI = illOI1IoO;
/* 41 */            VarHandle.storeStoreFence();
/* 49 */            illOI1IoO.I00ilO0 = new OllO00oiil(ilIi0Il);
/* 51 */            VarHandle.storeStoreFence();
/* 54 */            return illOI1IoO;
                }

                @Override
                public Object attachCompleter(IIiOOI iIiOOI) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 0:
/* 25 */                    OlioII olioII = (OlioII) obj;
/* 27 */                    olioII.I000oI1ioi = iIiOOI;
/* 43 */                    return "SettableFuture hashCode: " + olioII.hashCode();
                        case 1:
/* 20 */                    ((OliolIlIO) obj).I00li1OI = iIiOOI;
/* 22 */                    return "SurfaceOutputImpl close future complete";
                        default:
/* 12 */                    ((Oo0oI1oo) obj).I000iOII.set(iIiOOI);
/* 15 */                    return "textureViewImpl_waitForNextFrame";
                    }
                }

                @Override
                public void onComplete(OloIIoII1oo oloIIoII1oo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00iiI;
                    switch (i) {
                        case 4:
/* 26 */                    iO1O101oi.I00000oOI((Intent) obj);
                            break;
                        case 5:
/* 20 */                    ((i011ol) obj).I00000oOI.I0000O(null);
                            break;
                        default:
/* 11 */                    ((ScheduledFuture) obj).cancel(false);
                            break;
                    }
                }
            }
