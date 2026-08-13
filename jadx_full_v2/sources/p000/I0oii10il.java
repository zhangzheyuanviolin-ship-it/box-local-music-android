            package p000;

            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.concurrent.Executor;
            
            public final class I0oii10il implements IO0I000 {
                public Oo10IliO00O I00000oIO;
                public IIliIi1O0OiO I00000oOI;
                public OlOO00iI0lI I0000Il00O;

                @Override
                public final IO01oi0 I00000oIO(IIlOl1oOlo1o iIlOl1oOlo1o, Map map, IO0Il0o1OI iO0Il0o1OI) throws Exception {
                    IO01oi0 iO01oi0;
                    ArrayList arrayList;
/* 7 */             loilIl10Ii loilil10ii = loilIl10Ii.I00iiO;
/* 9 */             IIliIi1O0OiO iIliIi1O0OiO = this.I00000oOI;
/* 11 */            int i = iIliIi1O0OiO.I000O01llI0;
/* 14 */            if (i == 0) {
/* 16 */                i = 0;
                    } else if (i == 1) {
/* 21 */                i = 1;
                    } else if (i == 2) {
/* 278 */               IoOOl0iOl1io.I001l0I00("Unsupported session mode: ", iOililO0i0.I00000oIO(iIliIi1O0OiO.I000O01llI0));
/* 268 */               return null;
                    }
/* 30 */            OIl1Oli oIl1OliI00000oIO = iOl0ll0OI1II.I00000oIO(iIliIi1O0OiO, this.I0000Il00O, map);
/* 34 */            ArrayList arrayList2 = oIl1OliI00000oIO.I00000oIO;
/* 42 */            if (arrayList2.isEmpty()) {
/* 58 */                Log.w("CXCP", "Failed to create OutputConfigurations for " + iIliIi1O0OiO);
/* 61 */                iO0Il0o1OI.I00000oIO();
/* 64 */                return loilil10ii;
                    }
/* 65 */            ArrayList arrayList3 = iIliIi1O0OiO.I0000O;
/* 67 */            if (arrayList3 != null) {
/* 77 */                arrayList = new ArrayList(IOOi1I.I0000O(arrayList3, 10));
/* 80 */                Iterator it = arrayList3.iterator();
/* 88 */                while (it.hasNext()) {
/* 104 */                   OIlI1io oIlI1io = (OIlI1io) IOOi0Ool1i.I00OilO00Il(((Ioo000i1Io) it.next()).I00000oIO.I00000oIO);
/* 127 */                   arrayList.add(new IoloIII01(oIlI1io.I00000oIO.getWidth(), oIlI1io.I00000oIO.getHeight(), oIlI1io.I00000oOI));
                        }
/* 131 */               iO01oi0 = null;
                    } else {
/* 134 */               iO01oi0 = null;
/* 136 */               arrayList = null;
                    }
/* 138 */           if (arrayList != null && !arrayList.isEmpty()) {
/* 147 */               Iterator it2 = arrayList.iterator();
/* 155 */               while (it2.hasNext()) {
/* 173 */                   if (((IoloIII01) it2.next()).I0000Il00O != ((IoloIII01) arrayList.get(0)).I0000Il00O) {
/* 178 */                       I000II.I001IO000("All InputStream.Config objects must have the same format for multi resolution");
/* 181 */                       return iO01oi0;
                            }
                        }
                    }
/* 192 */           Executor executor = (Executor) this.I00000oIO.I000O01llI0.getValue();
/* 194 */           int i2 = iIliIi1O0OiO.I0001Ioi1lo;
/* 196 */           Map map2 = iIliIi1O0OiO.I000II;
/* 198 */           Oilo110oloIl oilo110oloIl = new Oilo110oloIl();
/* 201 */           oilo110oloIl.I00000oIO = i;
/* 203 */           oilo110oloIl.I00000oOI = arrayList;
/* 205 */           oilo110oloIl.I0000Il00O = arrayList2;
/* 207 */           oilo110oloIl.I0000O = executor;
/* 209 */           oilo110oloIl.I0000oI00 = iO0Il0o1OI;
/* 211 */           oilo110oloIl.I0001Ioi1lo = i2;
/* 213 */           oilo110oloIl.I000II = map2;
/* 215 */           VarHandle.storeStoreFence();
/* 222 */           if (iIlOl1oOlo1o.I00OIl(oilo110oloIl)) {
/* 264 */               return new IO01oi(oIl1OliI00000oIO.I00000oOI, oIl1OliI00000oIO.I0000O);
                    }
/* 251 */           Log.w("CXCP", "Failed to create capture session from " + iIlOl1oOlo1o + " for " + iO0Il0o1OI + '!');
/* 254 */           iO0Il0o1OI.I00000oIO();
/* 257 */           return loilil10ii;
                }
            }
