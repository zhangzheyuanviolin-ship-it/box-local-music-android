            package p000;

            import android.hardware.camera2.params.InputConfiguration;
            import android.util.Log;
            import android.view.Surface;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.Map;
            
            public final class I0oOoilo implements IO0I000 {
                public final int I00000oIO;
                public OlOO00iI0lI I00000oOI;
                public IIliIi1O0OiO I0000Il00O;

                public I0oOoilo(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final IO01oi0 I00000oIO(IIlOl1oOlo1o iIlOl1oOlo1o, Map map, IO0Il0o1OI iO0Il0o1OI) throws Exception {
                    boolean zI000II;
/* 1 */             int i = this.I00000oIO;
/* 3 */             Il011I1OiO0I il011I1OiO0I = Il011I1OiO0I.I00iOIl;
                    switch (i) {
                        case 0:
/* 141 */                   loilIl10Ii loilil10ii = loilIl10Ii.I00iiO;
/* 145 */                   ArrayList arrayList = this.I0000Il00O.I0000O;
/* 147 */                   if (arrayList != null) {
/* 163 */                       OIlI1io oIlI1io = (OIlI1io) IOOi0Ool1i.I00OilO00Il(((Ioo000i1Io) IOOi0Ool1i.I00OilO00Il(arrayList)).I00000oIO.I00000oIO);
/* 181 */                       InputConfiguration inputConfiguration = new InputConfiguration(oIlI1io.I00000oIO.getWidth(), oIlI1io.I00000oIO.getHeight(), oIlI1io.I00000oOI);
/* 190 */                       ArrayList arrayList2 = new ArrayList(map.size());
/* 197 */                       Iterator it = map.entrySet().iterator();
/* 205 */                       while (it.hasNext()) {
/* 219 */                           arrayList2.add((Surface) ((Map.Entry) it.next()).getValue());
                                }
/* 227 */                       if (!iIlOl1oOlo1o.I001i1lo1io(inputConfiguration, arrayList2, iO0Il0o1OI)) {
/* 252 */                           Log.w("CXCP", "Failed to create reprocessable captures session from " + iIlOl1oOlo1o + " for " + iO0Il0o1OI + '!');
/* 255 */                           iO0Il0o1OI.I00000oIO();
/* 345 */                           return loilil10ii;
                                }
                            } else {
/* 265 */                       ArrayList arrayList3 = new ArrayList(map.size());
/* 272 */                       Iterator it2 = map.entrySet().iterator();
/* 280 */                       while (it2.hasNext()) {
/* 294 */                           arrayList3.add((Surface) ((Map.Entry) it2.next()).getValue());
                                }
/* 302 */                       if (!iIlOl1oOlo1o.I00iiI(arrayList3, iO0Il0o1OI)) {
/* 327 */                           Log.w("CXCP", "Failed to create captures session from " + iIlOl1oOlo1o + " for " + iO0Il0o1OI + '!');
/* 330 */                           iO0Il0o1OI.I00000oIO();
/* 345 */                           return loilil10ii;
                                }
                            }
/* 342 */                   return new IO01oi(il011I1OiO0I, iOl0ll0OI1II.I00000oOI(map, this.I00000oOI));
                        default:
/* 14 */                    loilIl10Ii loilil10ii2 = loilIl10Ii.I00iiO;
/* 16 */                    IIliIi1O0OiO iIliIi1O0OiO = this.I0000Il00O;
/* 20 */                    OIl1Oli oIl1OliI00000oIO = iOl0ll0OI1II.I00000oIO(iIliIi1O0OiO, this.I00000oOI, map);
/* 24 */                    ArrayList arrayList4 = oIl1OliI00000oIO.I00000oIO;
/* 30 */                    if (arrayList4.isEmpty()) {
/* 46 */                        Log.w("CXCP", "Failed to create OutputConfigurations for " + iIliIi1O0OiO);
/* 49 */                        iO0Il0o1OI.I00000oIO();
/* 140 */                       return loilil10ii2;
                            }
/* 53 */                    ArrayList arrayList5 = iIliIi1O0OiO.I0000O;
/* 55 */                    if (arrayList5 == null) {
/* 57 */                        zI000II = iIlOl1oOlo1o.I000O01llI0(arrayList4, iO0Il0o1OI);
                            } else {
/* 76 */                        OIlI1io oIlI1io2 = (OIlI1io) IOOi0Ool1i.I00OilO00Il(((Ioo000i1Io) IOOi0Ool1i.I00OilO00Il(arrayList5)).I00000oIO.I00000oIO);
/* 97 */                        zI000II = iIlOl1oOlo1o.I000II(new IoloIII01(oIlI1io2.I00000oIO.getWidth(), oIlI1io2.I00000oIO.getHeight(), oIlI1io2.I00000oOI), arrayList4, iO0Il0o1OI);
                            }
/* 101 */                   if (zI000II) {
/* 137 */                       return new IO01oi(il011I1OiO0I, oIl1OliI00000oIO.I0000O);
                            }
/* 126 */                   Log.w("CXCP", "Failed to create capture session from " + iIlOl1oOlo1o + " for " + iO0Il0o1OI + '!');
/* 129 */                   iO0Il0o1OI.I00000oIO();
/* 140 */                   return loilil10ii2;
                    }
                }
            }
