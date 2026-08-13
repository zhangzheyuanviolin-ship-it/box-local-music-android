            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ApplicationInfo;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import android.os.SystemClock;
            import android.os.Trace;
            import android.view.Surface;
            import com.google.common.util.concurrent.ListenableFuture;
            import com.google.firebase.FirebaseCommonRegistrar;
            import com.google.firebase.messaging.FirebaseMessagingService;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.ListIterator;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicReference;
            
/* 329 */   public final class IIoIil implements IIiOOIoi0, IOiOiIIiii1, Oll01O011O, OIOolOo, IOoillilli, IoiO1iOOil11, Ol01IliO, OiIIOlilOlo, OllIoO1OO, I1Olli1oIi {
                public final int I00iOIl;
                public Object I00iiI;
                public Object I00iiO;

                public IIoIil(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public boolean I00000oIO() {
/* 3 */             OOI1io1Ioo oOI1io1Ioo = (OOI1io1Ioo) this.I00iiI;
/* 7 */             I1li0IIIli i1li0IIIli = (I1li0IIIli) this.I00iiO;
/* 9 */             boolean z = oOI1io1Ioo.I00100o1O0lo;
/* 11 */            if (z) {
/* 55 */                return z;
                    }
/* 13 */            oOI1io1Ioo.I000OOo1O();
/* 20 */            long jI00000oIO = I1li0IIIli.I00000oIO(oOI1io1Ioo.I000oI1ioi, i1li0IIIli.I00000oIO);
/* 24 */            i1li0IIIli.I00000oIO = jI00000oIO;
                    boolean z2 = !oOI1io1Ioo.I000O01llI0(oOI1io1Ioo.I000o00OoI0I, jI00000oIO + i1li0IIIli.I00000oOI);
/* 37 */            oOI1io1Ioo.I00100o1O0lo = z2;
/* 39 */            return z2;
                }

                @Override
                public void I00000oOI(I1lO00 i1lO00) {
/* 3 */             IiI1oOoo iiI1oOoo = (IiI1oOoo) this.I00iiI;
/* 24 */            Ilo01Io ilo01Io = (((Oll0I0l1i1) this.I00iiO).I0000Il00O.I00000oIO() && i1lO00.I0000O) ? Ilo01Io.I00iiO : Ilo01Io.I00iiI;
/* 26 */            OIi0ooo0l1 oIi0ooo0l1 = iiI1oOoo.I00000oIO;
/* 33 */            Ilo0O01IO.I0000O((AtomicBoolean) oIi0ooo0l1.I00iiO, true);
/* 40 */            Ilo0O01IO.I0000Il00O((Thread) oIi0ooo0l1.I00ilI0I1);
/* 47 */            if (((Ilo01Io) oIi0ooo0l1.I00lli11) != ilo01Io) {
/* 49 */                oIi0ooo0l1.I00lli11 = ilo01Io;
/* 53 */                oIi0ooo0l1.I00100o1O0lo(oIi0ooo0l1.I00iOIl);
                    }
                }

                @Override
                public void I0000Il00O(IoiO1ilO ioiO1ilO) {
                    switch (this.I00iOIl) {
                        case 11:
/* 29 */                    ((IoiO1iOOil11) this.I00iiO).I0000Il00O((IoloOio0I) this.I00iiI);
                            break;
                        default:
/* 8 */                     OOlli1l1lOlI oOlli1l1lOlI = (OOlli1l1lOlI) this.I00iiI;
/* 12 */                    IoiO1iOOil11 ioiO1iOOil11 = (IoiO1iOOil11) this.I00iiO;
/* 14 */                    oOlli1l1lOlI.getClass();
/* 17 */                    ioiO1iOOil11.I0000Il00O(oOlli1l1lOlI);
                            break;
                    }
                }

                @Override
                public Object I0000O(OloIIoII1oo oloIIoII1oo) {
                    switch (this.I00iOIl) {
                        case 8:
/* 165 */                   I1ii1o0 i1ii1o0 = (I1ii1o0) this.I00iiI;
/* 169 */                   ExecutorService executorService = (ExecutorService) this.I00iiO;
/* 171 */                   i1ii1o0.getClass();
/* 178 */                   if (!oloIIoII1oo.I000OOo1O()) {
/* 203 */                       return lOio0o.I0000O(oloIIoII1oo.I0001Ioi1lo() != null ? oloIIoII1oo.I0001Ioi1lo() : new ExecutionException(new RuntimeException("Unexpected Error")));
                            }
/* 212 */                   String str = (String) oloIIoII1oo.I000II();
/* 220 */                   o0IiOl o0iiolI0000O = ((IlO01o11oOOO) ((IlO0Ii1Il00o) i1ii1o0.I00iio)).I0000O();
/* 232 */                   ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new iO10oo0i1o("Firebase-Messaging-Network-Io", 5));
/* 240 */                   IIoIil iIoIil = new IIoIil(9);
/* 243 */                   iIoIil.I00iiI = i1ii1o0;
/* 245 */                   iIoIil.I00iiO = str;
/* 247 */                   VarHandle.storeStoreFence();
/* 250 */                   o0IiOl o0iiolI000l1 = o0iiolI0000O.I000l1(executorServiceNewSingleThreadExecutor, iIoIil);
/* 258 */                   I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(16);
/* 261 */                   i0IOIlIOIII.I00iiI = str;
/* 263 */                   VarHandle.storeStoreFence();
/* 266 */                   return o0iiolI000l1.I000iOII(executorService, i0IOIlIOIII);
                        case 9:
/* 29 */                    I1ii1o0 i1ii1o02 = (I1ii1o0) this.I00iiI;
/* 33 */                    String str2 = (String) this.I00iiO;
/* 37 */                    IlIoliIO ilIoliIO = (IlIoliIO) i1ii1o02.I00iiO;
/* 43 */                    if (!oloIIoII1oo.I000OOo1O()) {
/* 68 */                        return lOio0o.I0000O(oloIIoII1oo.I0001Ioi1lo() != null ? oloIIoII1oo.I0001Ioi1lo() : new ExecutionException(new RuntimeException("Unexpected Error")));
                            }
/* 79 */                    String str3 = ((I1l0o01O0) oloIIoII1oo.I000II()).I00000oIO;
/* 81 */                    ilIoliIO.I00000oIO();
/* 84 */                    IlO0oiiii0IO ilO0oiiii0IO = ilIoliIO.I0000Il00O;
/* 86 */                    String str4 = ilO0oiiii0IO.I00000oIO;
/* 88 */                    ilIoliIO.I00000oIO();
/* 91 */                    String str5 = ilO0oiiii0IO.I00000oOI;
/* 93 */                    String strI0000Il00O = I101oOiOiI.I0000Il00O(ilIoliIO);
/* 101 */                   OOoioIi1IOio oOoioIi1IOio = new OOoioIi1IOio();
/* 104 */                   oOoioIi1IOio.I00iOIl = strI0000Il00O;
/* 106 */                   oOoioIi1IOio.I00iiI = str5;
/* 108 */                   oOoioIi1IOio.I00iiO = str4;
/* 110 */                   oOoioIi1IOio.I00iio = str2;
/* 112 */                   oOoioIi1IOio.I00ilI0I1 = str3;
/* 114 */                   oOoioIi1IOio.I00io1l = "22.0.1";
/* 118 */                   i0i01Ii0iII i0i01ii0iii = (i0i01Ii0iII) i1ii1o02.I00iiI;
/* 120 */                   IolIIo0o0Iio iolIIo0o0IioI0000Il00O = IoilIilo.I0000Il00O();
/* 130 */                   iolIIo0o0IioI0000Il00O.I0000O = new IlIII1l[]{iO1l1I10.I00000oIO};
/* 136 */                   i000IO i000io = new i000IO(10);
/* 139 */                   i000io.I00iiI = i0i01ii0iii;
/* 141 */                   i000io.I00iiO = oOoioIi1IOio;
/* 143 */                   VarHandle.storeStoreFence();
/* 146 */                   iolIIo0o0IioI0000Il00O.I0000Il00O = i000io;
/* 151 */                   iolIIo0o0IioI0000Il00O.I00000oOI = 39001;
/* 158 */                   return i0i01ii0iii.I00000oOI(0, iolIIo0o0IioI0000Il00O.I00000oIO());
                        default:
/* 8 */                     OlOO1i11110 olOO1i11110 = (OlOO1i11110) this.I00iiI;
/* 12 */                    String str6 = (String) this.I00iiO;
                            synchronized (olOO1i11110) {
/* 19 */                        ((I1Io0i0II) olOO1i11110.I00iiO).remove(str6);
                            }
/* 23 */                    return oloIIoII1oo;
                    }
                }

                @Override
                public Object I000oI1ioi() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.LEFT_THUMB:
/* 65 */                    IiOili0lOO1 iiOili0lOO1 = (IiOili0lOO1) this.I00iiI;
/* 69 */                    Iterable iterable = (Iterable) this.I00iiO;
/* 73 */                    OiIIilol0iO oiIIilol0iO = (OiIIilol0iO) iiOili0lOO1.I00iio;
/* 75 */                    oiIIilol0iO.getClass();
/* 86 */                    if (iterable.iterator().hasNext()) {
/* 107 */                       oiIIilol0iO.I00000oIO().compileStatement("DELETE FROM events WHERE _id in ".concat(OiIIilol0iO.I001i1lo1io(iterable))).execute();
                                break;
                            }
                            break;
                        default:
/* 9 */                     IiOili0lOO1 iiOili0lOO12 = (IiOili0lOO1) this.I00iiI;
/* 19 */                    Iterator it = ((HashMap) this.I00iiO).entrySet().iterator();
/* 27 */                    while (it.hasNext()) {
/* 58 */                        ((OiIIilol0iO) iiOili0lOO12.I00l0OO0IO).I000l1(((Integer) r2.getValue()).intValue(), O1I0ol.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
                            }
                            break;
                    }
/* 3 */             return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Object apply(Object obj) {
                    ListIterator listIterator;
                    switch (this.I00iOIl) {
                        case 15:
/* 266 */                   OiIIilol0iO oiIIilol0iO = (OiIIilol0iO) this.I00iiI;
/* 270 */                   String str = (String) this.I00iiO;
/* 272 */                   SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
/* 274 */                   oiIIilol0iO.getClass();
/* 281 */                   sQLiteDatabase.compileStatement(str).execute();
/* 286 */                   Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
/* 294 */                   while (cursorRawQuery.moveToNext()) {
                                try {
/* 307 */                           oiIIilol0iO.I000l1(cursorRawQuery.getInt(0), O1I0ol.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                                } catch (Throwable th) {
/* 326 */                           cursorRawQuery.close();
/* 329 */                           throw th;
                                }
                            }
/* 311 */                   cursorRawQuery.close();
/* 320 */                   sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
/* 3 */                     return null;
                        default:
/* 11 */                    OiIIilol0iO oiIIilol0iO2 = (OiIIilol0iO) this.I00iiI;
/* 15 */                    I1lO11 i1lO11 = (I1lO11) this.I00iiO;
/* 18 */                    SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
/* 20 */                    I1l0OIO0Oio i1l0OIO0Oio = oiIIilol0iO2.I00iio;
/* 24 */                    ArrayList arrayListI000O01llI0 = oiIIilol0iO2.I000O01llI0(sQLiteDatabase2, i1lO11, i1l0OIO0Oio.I00000oOI);
/* 34 */                    for (OOIio1010OoO oOIio1010OoO : OOIio1010OoO.values()) {
/* 40 */                        if (oOIio1010OoO != i1lO11.I0000Il00O) {
/* 49 */                            int size = i1l0OIO0Oio.I00000oOI - arrayListI000O01llI0.size();
/* 50 */                            if (size <= 0) {
/* 93 */                                HashMap map = new HashMap();
/* 100 */                               StringBuilder sb = new StringBuilder("event_id IN (");
/* 107 */                               for (int i = 0; i < arrayListI000O01llI0.size(); i++) {
/* 117 */                                   sb.append(((I1lI0I0i1) arrayListI000O01llI0.get(i)).I00000oIO);
/* 125 */                                   if (i < arrayListI000O01llI0.size() - 1) {
/* 129 */                                       sb.append(',');
                                            }
                                        }
/* 137 */                               sb.append(')');
/* 160 */                               Cursor cursorQuery = sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null);
/* 168 */                               I0IOIlIOIII i0IOIlIOIII = new I0IOIlIOIII(25);
/* 171 */                               i0IOIlIOIII.I00iiI = map;
/* 173 */                               VarHandle.storeStoreFence();
/* 176 */                               OiIIilol0iO.I001l0I00(cursorQuery, i0IOIlIOIII);
/* 179 */                               listIterator = arrayListI000O01llI0.listIterator();
/* 187 */                               while (listIterator.hasNext()) {
/* 193 */                                   I1lI0I0i1 i1lI0I0i1 = (I1lI0I0i1) listIterator.next();
/* 195 */                                   long j = i1lI0I0i1.I00000oIO;
/* 205 */                                   if (map.containsKey(Long.valueOf(j))) {
/* 210 */                                       I0Oi111ii i0Oi111iiI0000Il00O = i1lI0I0i1.I0000Il00O.I0000Il00O();
/* 232 */                                       for (OiIIil oiIIil : (Set) map.get(Long.valueOf(j))) {
/* 244 */                                           i0Oi111iiI0000Il00O.I00000oIO(oiIIil.I00000oIO, oiIIil.I00000oOI);
                                                }
/* 258 */                                       listIterator.set(I1lI0I0i1.I00000oIO(j, i1lI0I0i1.I00000oOI, i0Oi111iiI0000Il00O.I000lI()));
                                            }
                                        }
/* 262 */                               return arrayListI000O01llI0;
                                    }
/* 53 */                            IOO000ilo iOO000iloI00000oIO = I1lO11.I00000oIO();
/* 59 */                            iOO000iloI00000oIO.I00IO1oi11O(i1lO11.I00000oIO);
/* 62 */                            if (oOIio1010OoO == null) {
/* 86 */                                IOOlIIilOl0.I000II("Null priority");
/* 3 */                                 return null;
                                    }
/* 64 */                            iOO000iloI00000oIO.I00iio = oOIio1010OoO;
/* 68 */                            iOO000iloI00000oIO.I00iiO = i1lO11.I00000oOI;
/* 78 */                            arrayListI000O01llI0.addAll(oiIIilol0iO2.I000O01llI0(sQLiteDatabase2, iOO000iloI00000oIO.I000OOo1O(), size));
                                }
                            }
/* 93 */                    HashMap map2 = new HashMap();
/* 100 */                   StringBuilder sb2 = new StringBuilder("event_id IN (");
/* 107 */                   while (i < arrayListI000O01llI0.size()) {
                            }
/* 137 */                   sb2.append(')');
/* 160 */                   Cursor cursorQuery2 = sQLiteDatabase2.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null);
/* 168 */                   I0IOIlIOIII i0IOIlIOIII2 = new I0IOIlIOIII(25);
/* 171 */                   i0IOIlIOIII2.I00iiI = map2;
/* 173 */                   VarHandle.storeStoreFence();
/* 176 */                   OiIIilol0iO.I001l0I00(cursorQuery2, i0IOIlIOIII2);
/* 179 */                   listIterator = arrayListI000O01llI0.listIterator();
/* 187 */                   while (listIterator.hasNext()) {
                            }
/* 262 */                   return arrayListI000O01llI0;
                    }
                }

                @Override
                public Object attachCompleter(IIiOOI iIiOOI) {
/* 5 */             int i = 0;
/* 6 */             int i2 = 2;
/* 7 */             int i3 = 1;
                    switch (this.I00iOIl) {
                        case 0:
/* 289 */                   IIoIloi0 iIoIloi0 = (IIoIloi0) this.I00iiI;
/* 293 */                   Context context = (Context) this.I00iiO;
/* 295 */                   Executor executor = iIoIloi0.I0000O;
/* 297 */                   long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 303 */                   IIoIlO iIoIlO = new IIoIlO(i);
/* 306 */                   iIoIlO.I00iiI = iIoIloi0;
/* 308 */                   iIoIlO.I00ilO0 = context;
/* 310 */                   iIoIlO.I00iiO = executor;
/* 312 */                   iIoIlO.I00ilI0I1 = 1;
/* 314 */                   iIoIlO.I00io1l = iIiOOI;
/* 316 */                   iIoIlO.I00iio = jElapsedRealtime;
/* 318 */                   VarHandle.storeStoreFence();
/* 321 */                   executor.execute(iIoIlO);
/* 324 */                   return "CameraX initInternal";
                        case 3:
/* 263 */                   IOi10loi iOi10loi = (IOi10loi) this.I00iiI;
/* 267 */                   String str = (String) this.I00iiO;
/* 273 */                   I00o101lO i00o101lO = new I00o101lO(27);
/* 276 */                   i00o101lO.I00iiI = iIiOOI;
/* 278 */                   i00o101lO.I00iiO = iOi10loi;
/* 280 */                   VarHandle.storeStoreFence();
/* 283 */                   iOi10loi.I00iiI(i00o101lO);
/* 286 */                   return str;
                        case 4:
/* 229 */                   IiI1oOoo iiI1oOoo = (IiI1oOoo) this.I00iiI;
/* 233 */                   Iio1oiI iio1oiI = (Iio1oiI) this.I00iiO;
/* 235 */                   Map map = Collections.EMPTY_MAP;
/* 240 */                   I00ioIO i00ioIO = new I00ioIO(7);
/* 243 */                   i00ioIO.I00iiI = iiI1oOoo;
/* 245 */                   i00ioIO.I00iiO = iio1oiI;
/* 247 */                   i00ioIO.I00iio = iIiOOI;
/* 249 */                   VarHandle.storeStoreFence();
/* 257 */                   iiI1oOoo.I0001Ioi1lo(i00ioIO, new I0il01i00i(i2));
/* 3 */                     return "Init GlRenderer";
                        case 6:
/* 194 */                   Iio1000IOoi1 iio1000IOoi1 = (Iio1000IOoi1) this.I00iiI;
/* 198 */                   Iio1oiI iio1oiI2 = (Iio1oiI) this.I00iiO;
/* 200 */                   Map map2 = Collections.EMPTY_MAP;
/* 206 */                   I00ioIO i00ioIO2 = new I00ioIO(8);
/* 209 */                   i00ioIO2.I00iiI = iio1000IOoi1;
/* 211 */                   i00ioIO2.I00iiO = iio1oiI2;
/* 213 */                   i00ioIO2.I00iio = iIiOOI;
/* 215 */                   VarHandle.storeStoreFence();
/* 223 */                   iio1000IOoi1.I0001Ioi1lo(i00ioIO2, new I0il01i00i(i2));
/* 3 */                     return "Init GlRenderer";
                        case 13:
/* 159 */                   IIllOioOlolI iIllOioOlolI = (IIllOioOlolI) this.I00iiI;
/* 163 */                   ArrayList arrayList = (ArrayList) this.I00iiO;
/* 167 */                   OOIIlO1looO oOIIlO1looO = new OOIIlO1looO();
/* 170 */                   oOIIlO1looO.I00000oIO = iIiOOI;
/* 172 */                   oOIIlO1looO.I00000oOI = iIllOioOlolI;
/* 174 */                   VarHandle.storeStoreFence();
/* 177 */                   arrayList.add(oOIIlO1looO);
/* 186 */                   iIllOioOlolI.I0010I0i(Iii11l.I00000oIO(), oOIIlO1looO);
/* 189 */                   return "waitForCaptureResult";
                        case PoseLandmark.RIGHT_PINKY:
/* 124 */                   Oll0I0l1i1 oll0I0l1i1 = (Oll0I0l1i1) this.I00iiI;
/* 130 */                   ((AtomicReference) this.I00iiO).set(iIiOOI);
/* 152 */                   return "SurfaceRequest-surface-recreation(" + oll0I0l1i1.hashCode() + ")";
                        case PoseLandmark.RIGHT_INDEX:
/* 61 */                    Oo0oI1oo oo0oI1oo = (Oo0oI1oo) this.I00iiI;
/* 65 */                    Surface surface = (Surface) this.I00iiO;
/* 70 */                    l11I11lO.I0000O(3, "TextureViewImpl");
/* 73 */                    Oll0I0l1i1 oll0I0l1i12 = oo0oI1oo.I000O01llI0;
/* 75 */                    Iii11l iii11lI00000oIO = Iii11l.I00000oIO();
/* 81 */                    Olioo011il1 olioo011il1 = new Olioo011il1(i2);
/* 84 */                    olioo011il1.I00000oOI = iIiOOI;
/* 86 */                    VarHandle.storeStoreFence();
/* 89 */                    oll0I0l1i12.I00000oIO(surface, iii11lI00000oIO, olioo011il1);
/* 117 */                   return "provideSurface[request=" + oo0oI1oo.I000O01llI0 + " surface=" + surface + "]";
                        default:
/* 13 */                    Executor executor2 = (Executor) this.I00iiI;
/* 17 */                    IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00iiO;
/* 21 */                    AtomicBoolean atomicBoolean = new AtomicBoolean(false);
/* 26 */                    O10loIll o10loIll = new O10loIll(1);
/* 29 */                    o10loIll.I00iiI = atomicBoolean;
/* 31 */                    VarHandle.storeStoreFence();
/* 36 */                    iIiOOI.I00000oIO(o10loIll, Iii1101i100I.I00iOIl);
/* 41 */                    O10loilI10Oo o10loilI10Oo = new O10loilI10Oo(i3);
/* 44 */                    o10loilI10Oo.I00iiI = atomicBoolean;
/* 46 */                    o10loilI10Oo.I00iiO = iIiOOI;
/* 48 */                    o10loilI10Oo.I00iio = illOOo00lI;
/* 50 */                    VarHandle.storeStoreFence();
/* 53 */                    executor2.execute(o10loilI10Oo);
/* 56 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }

                @Override
                public Object create(IOiOIoiiO0i iOiOIoiiO0i) {
                    switch (this.I00iOIl) {
                        case 2:
/* 142 */                   String str = (String) this.I00iiI;
/* 146 */                   IOiIi0Oi iOiIi0Oi = (IOiIi0Oi) this.I00iiO;
                            try {
/* 148 */                       Trace.beginSection(str);
/* 153 */                       return iOiIi0Oi.I0001Ioi1lo.create(iOiOIoiiO0i);
                            } finally {
/* 162 */                       Trace.endSection();
                            }
                        default:
/* 8 */                     String str2 = (String) this.I00iiI;
/* 12 */                    IioIoO10iOiI iioIoO10iOiI = (IioIoO10iOiI) this.I00iiO;
/* 22 */                    Context context = (Context) ((I1ii1o0) iOiOIoiiO0i).I00000oIO(Context.class);
/* 26 */                    String strValueOf = "";
                            switch (iioIoO10iOiI.I00iOIl) {
                                case 10:
/* 123 */                           ApplicationInfo applicationInfo = context.getApplicationInfo();
/* 127 */                           if (applicationInfo != null) {
/* 131 */                               strValueOf = String.valueOf(applicationInfo.targetSdkVersion);
                                        break;
                                    }
                                    break;
                                case 11:
/* 110 */                           ApplicationInfo applicationInfo2 = context.getApplicationInfo();
/* 114 */                           if (applicationInfo2 != null) {
/* 118 */                               strValueOf = String.valueOf(applicationInfo2.minSdkVersion);
                                        break;
                                    }
                                    break;
                                case 12:
/* 60 */                            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
/* 75 */                                if (!context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
/* 90 */                                    if (!context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
/* 105 */                                       if (context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
/* 107 */                                           strValueOf = "embedded";
                                                    break;
                                                }
                                            } else {
/* 92 */                                        strValueOf = "auto";
                                                break;
                                            }
                                        } else {
/* 77 */                                    strValueOf = "watch";
                                            break;
                                        }
                                    } else {
/* 62 */                                strValueOf = OIloIiI0oI.I00li1OI;
                                        break;
                                    }
                                    break;
                                default:
/* 39 */                            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
/* 43 */                            if (installerPackageName != null) {
/* 45 */                                strValueOf = FirebaseCommonRegistrar.I00000oIO(installerPackageName);
                                        break;
                                    }
                                    break;
                            }
/* 135 */                   return I1l1000Io.I00000oIO(str2, strValueOf);
                    }
                }

                @Override
                public void onComplete(OloIIoII1oo oloIIoII1oo) {
/* 9 */             ((FirebaseMessagingService) this.I00iiI).I00000oIO((Intent) this.I00iiO);
                }

                @Override
/* 330 */       public ListenableFuture apply(Object obj) {
                    I0IiOl0 i0IiOl0 = (I0IiOl0) this.I00iiI;
                    ArrayList arrayList = (ArrayList) this.I00iiO;
/* 331 */           I0IOIlIOIII i0IOIlIOIII = (I0IOIlIOIII) i0IiOl0.I0000O;
/* 336 */           Integer num = (Integer) ((IIoo00iOol0) arrayList.get(0)).I00000oOI.I00000oOI(IIoo00iOol0.I000II, 100);
                    Objects.requireNonNull(num);
                    int iIntValue = num.intValue();
/* 341 */           Integer num2 = (Integer) ((IIoo00iOol0) arrayList.get(0)).I00000oOI.I00000oOI(IIoo00iOol0.I0001Ioi1lo, 0);
                    Objects.requireNonNull(num2);
                    int iIntValue2 = num2.intValue();
/* 343 */           IoIlOo1o0IIl ioIlOo1o0IIl = ((OlOO1Io010o) i0IOIlIOIII.I00iiI).I001IO000;
                    if (ioIlOo1o0IIl != null) {
/* 345 */               return ((Olioli) ioIlOo1o0IIl.I00iiI).I0000Il00O(iIntValue, iIntValue2);
                    }
/* 347 */           return new Ioil1IIo(new Exception("Failed to take picture: pipeline is not ready."), 1);
                }
            }
