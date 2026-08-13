            package p000;

            import android.util.Log;
            import java.io.Closeable;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.Map;
            
            public final class Io0oO1OiI implements Closeable {
                public IIll0Oilo I00iOIl;
                public Map I00iiI;
                public Map I00iiO;
                public ArrayList I00iio;
                public Ii0110 I00ilI0I1;
                public IIOlO1ii I00ilO0;
                public o01l1ioOo0 I00io1l;
                public Object I00ioIO;
                public volatile boolean I00l0I0l0lO1;
                public I0oiil10Ili I00l0OO0IO;
                public Oi01iIoI I00li1OI;
                public Map I00ll1;
                public List I00lli11;
                public I1Ool1IoO110 I00lll10;
                public Oi01iIoI I00o0iI0io1;
                public Map I00o0l1o1o0;
                public Map I00o101lO;
                public Map I00oI0i;
                public List I00oII;
                public I0oiil10Ili I00oIiI10;

                public final void I00000oIO(ArrayList arrayList) {
/* 1 */             int size = arrayList.size();
/* 7 */             for (int i = 0; i < size; i++) {
/* 13 */                Oi01iIoI oi01iIoI = (Oi01iIoI) arrayList.get(i);
/* 19 */                int size2 = this.I00oII.size();
/* 24 */                for (int i2 = 0; i2 < size2; i2++) {
/* 34 */                    ((Oi01Ooii1Ol) this.I00oII.get(i2)).I00OOll1(oi01iIoI);
                        }
                    }
/* 43 */            int size3 = arrayList.size();
/* 48 */            for (int i3 = 0; i3 < size3; i3++) {
/* 54 */                Oi01iIoI oi01iIoI2 = (Oi01iIoI) arrayList.get(i3);
/* 60 */                int size4 = oi01iIoI2.I0000O.size();
/* 65 */                for (int i4 = 0; i4 < size4; i4++) {
/* 75 */                    ((Oi01Ooii1Ol) oi01iIoI2.I0000O.get(i4)).I00OOll1(oi01iIoI2);
                        }
                    }
                }

                public final boolean I0000Il00O(boolean z, List list, Map map) throws Throwable {
                    Map mapI00000oOI;
/* 1 */             I0oiil10Ili i0oiil10Ili = this.I00oIiI10;
/* 3 */             if (i0oiil10Ili == null) {
/* 5 */                 return false;
                    }
/* 7 */             Map map2 = this.I00iiI;
/* 9 */             Map map3 = this.I00o0l1o1o0;
/* 15 */            if (map.isEmpty()) {
/* 17 */                mapI00000oOI = this.I00oI0i;
                    } else {
/* 23 */                O1OOII o1ooii = new O1OOII();
/* 28 */                o1ooii.putAll(this.I00o101lO);
/* 31 */                o1ooii.putAll(map);
/* 36 */                o1ooii.putAll(this.I00iiO);
/* 39 */                mapI00000oOI = o1ooii.I00000oOI();
                    }
/* 48 */            boolean zI00II0Ol1O0l = i0oiil10Ili.I00II0Ol1O0l(z, list, map2, map3, mapI00000oOI, this.I00oII);
/* 52 */            if (!zI00II0Ol1O0l) {
/* 56 */                if (z) {
/* 76 */                    Log.w("CXCP", "Failed to repeat with " + IOOi0Ool1i.I00OilO00Il(list));
/* 79 */                    return zI00II0Ol1O0l;
                        }
/* 84 */                if (map.isEmpty()) {
/* 100 */                   Log.w("CXCP", "Failed to submit capture with " + list);
/* 103 */                   return zI00II0Ol1O0l;
                        }
/* 130 */               Log.w("CXCP", "Failed to trigger with " + IOOi0Ool1i.I00OilO00Il(list) + " and " + map);
                    }
/* 408 */           return zI00II0Ol1O0l;
                }

                public final Oi01iIoI I000II() {
                    Oi01iIoI oi01iIoI;
                    synchronized (this.I00ioIO) {
/* 4 */                 oi01iIoI = this.I00li1OI;
                    }
/* 7 */             return oi01iIoI;
                }

                public final void I000O01llI0(List list, int i, Io0l0i io0l0i, boolean z) {
/* 8 */             if (this.I00lll10.I00000oOI() && I0000Il00O(false, io0l0i.I00000oIO, Il011I1OiO0I.I00iOIl)) {
/* 20 */                list.remove(i);
/* 23 */                return;
                    }
/* 24 */            if (!z || i <= 0) {
/* 204 */               return;
                    }
                    int i2 = i - 1;
/* 38 */            if (((Io0lool) list.get(i2)) instanceof Io0lOi0) {
/* 40 */                I000l1(i2, list, false);
                    } else {
/* 46 */                I000II.I001IO000("Check failed.");
                    }
                }

                public final void I000l1(int i, List list, boolean z) {
                    int i2;
/* 1 */             int i3 = i;
                    while (true) {
/* 3 */                 int i4 = 0;
/* 5 */                 if (-1 >= i3) {
/* 62 */                    if (!z || (i2 = i + 1) >= list.size()) {
/* 98 */                        return;
                            }
/* 75 */                    Io0lool io0lool = (Io0lool) list.get(i2);
/* 79 */                    if (io0lool instanceof Io0l0i) {
/* 83 */                        I000O01llI0(list, i2, (Io0l0i) io0lool, false);
/* 86 */                        return;
                            } else {
/* 89 */                        if (io0lool instanceof Io0liil0lOi) {
/* 93 */                            I001l0I00(list, i2, (Io0liil0lOi) io0lool);
/* 98 */                            return;
                                }
/* 98 */                        return;
                            }
                        }
/* 11 */                Io0lool io0lool2 = (Io0lool) list.get(i3);
/* 15 */                if (io0lool2 instanceof Io0lOi0) {
/* 19 */                    Oi01iIoI oi01iIoI = ((Io0lOi0) io0lool2).I00000oIO;
/* 31 */                    if (I0000Il00O(true, Collections.singletonList(oi01iIoI), Il011I1OiO0I.I00iOIl)) {
/* 33 */                        this.I00o0iI0io1 = oi01iIoI;
/* 35 */                        list.remove(i3);
/* 38 */                        while (i4 < i3) {
/* 48 */                            if (((Io0lool) list.get(i4)) instanceof Io0lOi0) {
/* 50 */                                list.remove(i4);
                                        i3--;
                                    } else {
/* 56 */                                i4++;
                                    }
                                }
/* 98 */                        return;
                            }
                        }
                        i3--;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
                /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x010f  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0112  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x013a  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ee -> B:36:0x00f0). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00f6 -> B:37:0x00f2). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0102 -> B:41:0x0104). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00100l0(List list, int i, Io0li1o0 io0li1o0, IOoil1iiIilo iOoil1iiIilo) {
                    Io0o10OiOO io0o10OiOO;
                    int i2;
                    Io0li1o0 io0li1o02;
                    OOo0ll111 oOo0ll111;
                    Io0o10OiOO io0o10OiOO2;
                    int i3;
                    List list2;
                    List list3;
                    Io0li1o0 io0li1o03;
                    Io0lool io0lool;
                    OOo0ll111 oOo0ll1112;
                    List list4;
                    int i4;
                    List list5;
                    I0oiil10Ili i0oiil10Ili;
                    OOo0ll111 oOo0ll1113;
                    List list6;
                    Io0lool io0lool2;
                    Io0li1o0 io0li1o04;
                    OOo0ll111 oOo0ll1114;
/* 7 */             if (iOoil1iiIilo instanceof Io0o10OiOO) {
/* 10 */                io0o10OiOO = (Io0o10OiOO) iOoil1iiIilo;
/* 12 */                int i5 = io0o10OiOO.I00l0OO0IO;
/* 18 */                if ((i5 & Integer.MIN_VALUE) != 0) {
/* 21 */                    io0o10OiOO.I00l0OO0IO = i5 - Integer.MIN_VALUE;
                        } else {
/* 26 */                    io0o10OiOO = new Io0o10OiOO(this, iOoil1iiIilo);
                        }
                    }
/* 29 */            Object obj = io0o10OiOO.I00ioIO;
/* 31 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 33 */            int i6 = io0o10OiOO.I00l0OO0IO;
/* 35 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 38 */            char c = 2;
/* 41 */            if (i6 == 0) {
/* 112 */               lIoii1l01l0i.I00000oOI(obj);
/* 117 */               OOo0ll111 oOo0ll1115 = new OOo0ll111();
/* 120 */               oOo0ll1115.I00iOIl = 1;
/* 122 */               list.remove(i);
/* 125 */               i2 = i;
/* 127 */               io0li1o02 = io0li1o0;
/* 129 */               oOo0ll111 = oOo0ll1115;
/* 130 */               io0o10OiOO2 = io0o10OiOO;
/* 131 */               i3 = 0;
/* 132 */               list2 = list;
/* 134 */               list3 = list2;
/* 135 */               if (i3 < i2) {
                        }
/* 300 */               return ii0111o;
                    }
/* 43 */            if (i6 != 1) {
/* 45 */                if (i6 != 2) {
/* 47 */                    if (i6 != 3) {
/* 64 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 39 */                        return null;
                            }
/* 49 */                    oOo0ll1114 = io0o10OiOO.I00iiO;
/* 51 */                    io0li1o04 = io0o10OiOO.I00iiI;
/* 53 */                    list3 = io0o10OiOO.I00iOIl;
/* 57 */                    lIoii1l01l0i.I00000oOI(obj);
/* 303 */                   oOo0ll111 = oOo0ll1114;
/* 304 */                   io0li1o02 = io0li1o04;
/* 307 */                   this.I00oIiI10 = io0li1o02.I00000oOI;
/* 313 */                   if (!I00IOO()) {
/* 315 */                       Oi01iIoI oi01iIoI = this.I00o0iI0io1;
/* 317 */                       if (oi01iIoI != null) {
/* 325 */                           list3.add(0, new Io0lOi0(oi01iIoI));
/* 330 */                           if (oOo0ll111.I00iOIl == 1) {
/* 334 */                               list3.add(Io0l00io.I00000oOI);
                                    }
                                }
/* 337 */                       this.I00o0iI0io1 = null;
                            }
/* 1182 */                  return ooiIlOl1iI;
                        }
/* 68 */                i2 = io0o10OiOO.I00io1l;
/* 70 */                i4 = io0o10OiOO.I00ilO0;
/* 72 */                list4 = io0o10OiOO.I00iio;
/* 76 */                oOo0ll1112 = io0o10OiOO.I00iiO;
/* 78 */                Io0li1o0 io0li1o05 = io0o10OiOO.I00iiI;
/* 80 */                List list7 = io0o10OiOO.I00iOIl;
/* 84 */                lIoii1l01l0i.I00000oOI(obj);
/* 87 */                char c2 = 2;
/* 241 */               list5 = list7;
/* 242 */               io0li1o03 = io0li1o05;
/* 243 */               list2 = list4;
/* 244 */               oOo0ll111 = oOo0ll1112;
/* 245 */               i3 = i4;
                        oOo0ll111.I00iOIl++;
/* 254 */               io0o10OiOO2 = io0o10OiOO;
/* 255 */               list3 = list5;
/* 256 */               boolean z = true;
/* 257 */               io0li1o02 = io0li1o03;
/* 261 */               if (z) {
/* 272 */                   i3++;
                        } else {
/* 263 */                   list2.remove(i3);
                            i2--;
                        }
/* 268 */               c = c2;
/* 135 */               if (i3 < i2) {
/* 141 */                   io0lool = (Io0lool) list2.get(i3);
/* 145 */                   if (io0lool instanceof Io0li1o0) {
/* 148 */                       Io0li1o0 io0li1o06 = (Io0li1o0) io0lool;
/* 150 */                       I0oiil10Ili i0oiil10Ili2 = io0li1o06.I00000oIO;
/* 152 */                       if (i0oiil10Ili2 != null) {
/* 157 */                           io0o10OiOO2.I00iOIl = list3;
/* 159 */                           io0o10OiOO2.I00iiI = io0li1o02;
/* 161 */                           io0o10OiOO2.I00iiO = oOo0ll111;
/* 166 */                           io0o10OiOO2.I00iio = list2;
/* 168 */                           io0o10OiOO2.I00ilI0I1 = io0li1o06;
/* 170 */                           io0o10OiOO2.I00ilO0 = i3;
/* 172 */                           io0o10OiOO2.I00io1l = i2;
/* 174 */                           io0o10OiOO2.I00l0OO0IO = 1;
/* 176 */                           i0oiil10Ili2.I001lllioOl();
/* 179 */                           if (ooiIlOl1iI != ii0111o) {
/* 184 */                               oOo0ll1113 = oOo0ll111;
/* 185 */                               io0lool2 = io0lool;
/* 186 */                               io0li1o03 = io0li1o02;
/* 187 */                               list5 = list3;
/* 188 */                               io0o10OiOO = io0o10OiOO2;
/* 189 */                               i4 = i3;
/* 190 */                               list6 = list2;
/* 191 */                               OOo0ll111 oOo0ll1116 = oOo0ll1113;
/* 193 */                               io0lool = io0lool2;
/* 194 */                               list4 = list6;
/* 195 */                               oOo0ll1112 = oOo0ll1116;
/* 206 */                               i0oiil10Ili = ((Io0li1o0) io0lool).I00000oOI;
/* 208 */                               if (i0oiil10Ili != null) {
/* 213 */                                   io0o10OiOO.I00iOIl = list5;
/* 215 */                                   io0o10OiOO.I00iiI = io0li1o03;
/* 217 */                                   io0o10OiOO.I00iiO = oOo0ll1112;
/* 222 */                                   io0o10OiOO.I00iio = list4;
/* 224 */                                   io0o10OiOO.I00ilI0I1 = null;
/* 226 */                                   io0o10OiOO.I00ilO0 = i4;
/* 228 */                                   io0o10OiOO.I00io1l = i2;
/* 230 */                                   c2 = 2;
/* 231 */                                   io0o10OiOO.I00l0OO0IO = 2;
/* 233 */                                   i0oiil10Ili.I001lllioOl();
/* 236 */                                   if (ooiIlOl1iI != ii0111o) {
/* 239 */                                       io0li1o05 = io0li1o03;
/* 240 */                                       list7 = list5;
/* 241 */                                       list5 = list7;
/* 242 */                                       io0li1o03 = io0li1o05;
/* 243 */                                       list2 = list4;
/* 244 */                                       oOo0ll111 = oOo0ll1112;
/* 245 */                                       i3 = i4;
                                                oOo0ll111.I00iOIl++;
/* 254 */                                       io0o10OiOO2 = io0o10OiOO;
/* 255 */                                       list3 = list5;
/* 256 */                                       boolean z2 = true;
/* 257 */                                       io0li1o02 = io0li1o03;
/* 261 */                                       if (z2) {
                                                }
/* 268 */                                       c = c2;
/* 135 */                                       if (i3 < i2) {
                                                }
                                            }
                                        } else {
/* 247 */                                   c2 = 2;
/* 243 */                                   list2 = list4;
/* 244 */                                   oOo0ll111 = oOo0ll1112;
/* 245 */                                   i3 = i4;
                                            oOo0ll111.I00iOIl++;
/* 254 */                                   io0o10OiOO2 = io0o10OiOO;
/* 255 */                                   list3 = list5;
/* 256 */                                   boolean z22 = true;
/* 257 */                                   io0li1o02 = io0li1o03;
/* 261 */                                   if (z22) {
                                            }
/* 268 */                                   c = c2;
/* 135 */                                   if (i3 < i2) {
                                            }
                                        }
                                    }
                                } else {
/* 198 */                           io0li1o03 = io0li1o02;
/* 199 */                           list5 = list3;
/* 200 */                           io0o10OiOO = io0o10OiOO2;
/* 201 */                           i4 = i3;
/* 202 */                           oOo0ll1112 = oOo0ll111;
/* 203 */                           list4 = list2;
/* 206 */                           i0oiil10Ili = ((Io0li1o0) io0lool).I00000oOI;
/* 208 */                           if (i0oiil10Ili != null) {
                                    }
                                }
                            } else {
/* 259 */                       c2 = c;
/* 260 */                       z22 = false;
/* 261 */                       if (z22) {
                                }
/* 268 */                       c = c2;
/* 135 */                       if (i3 < i2) {
/* 275 */                           I0oiil10Ili i0oiil10Ili3 = io0li1o02.I00000oIO;
/* 277 */                           if (i0oiil10Ili3 != null) {
/* 282 */                               io0o10OiOO2.I00iOIl = list3;
/* 284 */                               io0o10OiOO2.I00iiI = io0li1o02;
/* 286 */                               io0o10OiOO2.I00iiO = oOo0ll111;
/* 288 */                               io0o10OiOO2.I00iio = null;
/* 290 */                               io0o10OiOO2.I00ilI0I1 = null;
/* 293 */                               io0o10OiOO2.I00l0OO0IO = 3;
/* 295 */                               i0oiil10Ili3.I001lllioOl();
/* 298 */                               if (ooiIlOl1iI != ii0111o) {
/* 301 */                                   io0li1o04 = io0li1o02;
/* 302 */                                   oOo0ll1114 = oOo0ll111;
/* 303 */                                   oOo0ll111 = oOo0ll1114;
/* 304 */                                   io0li1o02 = io0li1o04;
                                        }
                                    }
/* 307 */                           this.I00oIiI10 = io0li1o02.I00000oOI;
/* 313 */                           if (!I00IOO()) {
                                    }
/* 1182 */                          return ooiIlOl1iI;
                                }
                            }
                        }
/* 300 */               return ii0111o;
                    }
/* 90 */            i2 = io0o10OiOO.I00io1l;
/* 92 */            i4 = io0o10OiOO.I00ilO0;
/* 94 */            io0lool2 = io0o10OiOO.I00ilI0I1;
/* 96 */            list6 = io0o10OiOO.I00iio;
/* 100 */           oOo0ll1113 = io0o10OiOO.I00iiO;
/* 102 */           io0li1o03 = io0o10OiOO.I00iiI;
/* 104 */           list5 = io0o10OiOO.I00iOIl;
/* 108 */           lIoii1l01l0i.I00000oOI(obj);
/* 191 */           OOo0ll111 oOo0ll11162 = oOo0ll1113;
/* 193 */           io0lool = io0lool2;
/* 194 */           list4 = list6;
/* 195 */           oOo0ll1112 = oOo0ll11162;
/* 206 */           i0oiil10Ili = ((Io0li1o0) io0lool).I00000oOI;
/* 208 */           if (i0oiil10Ili != null) {
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
                
                    if (r3 == r1) goto L46;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
                
                    if (r3 == r1) goto L46;
                 */
                /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a6 -> B:48:0x00e4). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00cd -> B:47:0x00e2). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00df -> B:47:0x00e2). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I001i1lo1io(List list, IOoil1iiIilo iOoil1iiIilo) {
                    Io0oI1oo0 io0oI1oo0;
                    List list2;
                    int size;
                    Io0lool io0lool;
                    int i;
                    List list3;
                    I0oiil10Ili i0oiil10Ili;
                    Io0lool io0lool2;
/* 3 */             if (iOoil1iiIilo instanceof Io0oI1oo0) {
/* 6 */                 io0oI1oo0 = (Io0oI1oo0) iOoil1iiIilo;
/* 8 */                 int i2 = io0oI1oo0.I00io1l;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    io0oI1oo0.I00io1l = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    io0oI1oo0 = new Io0oI1oo0(this, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object obj = io0oI1oo0.I00ilI0I1;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i3 = io0oI1oo0.I00io1l;
/* 31 */            OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 33 */            int i4 = 0;
/* 38 */            if (i3 == 0) {
/* 88 */                lIoii1l01l0i.I00000oOI(obj);
/* 91 */                this.I00o0iI0io1 = null;
/* 93 */                Il011I1OiO0I il011I1OiO0I = Il011I1OiO0I.I00iOIl;
/* 95 */                this.I00o0l1o1o0 = il011I1OiO0I;
/* 97 */                this.I00o101lO = il011I1OiO0I;
/* 102 */               int size2 = list.size();
/* 107 */               for (int i5 = 0; i5 < size2; i5++) {
/* 113 */                   Io0lool io0lool3 = (Io0lool) list.get(i5);
/* 117 */                   if (io0lool3 instanceof Io0l0i) {
/* 123 */                       I00000oIO(((Io0l0i) io0lool3).I00000oIO);
                            }
                        }
/* 129 */               I0oiil10Ili i0oiil10Ili2 = this.I00oIiI10;
/* 131 */               if (i0oiil10Ili2 != null) {
/* 136 */                   io0oI1oo0.I00iOIl = list;
/* 138 */                   io0oI1oo0.I00io1l = 1;
/* 140 */                   i0oiil10Ili2.I001lllioOl();
                        }
                    } else if (i3 == 1) {
/* 80 */                list = io0oI1oo0.I00iOIl;
/* 84 */                lIoii1l01l0i.I00000oOI(obj);
                    } else if (i3 == 2) {
/* 65 */                size = io0oI1oo0.I00iio;
/* 67 */                i = io0oI1oo0.I00iiO;
/* 69 */                io0lool2 = io0oI1oo0.I00iiI;
/* 71 */                list2 = io0oI1oo0.I00iOIl;
/* 75 */                lIoii1l01l0i.I00000oOI(obj);
/* 197 */               io0lool = io0lool2;
/* 198 */               list3 = list2;
/* 204 */               i0oiil10Ili = ((Io0li1o0) io0lool).I00000oOI;
/* 206 */               if (i0oiil10Ili != null) {
                        }
/* 227 */               list2 = list3;
/* 228 */               i4 = i;
/* 229 */               i4++;
/* 157 */               if (i4 >= size) {
                        }
                    } else {
/* 44 */                if (i3 != 3) {
/* 61 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 36 */                    return null;
                        }
/* 46 */                size = io0oI1oo0.I00iio;
/* 48 */                i = io0oI1oo0.I00iiO;
/* 50 */                list3 = io0oI1oo0.I00iOIl;
/* 54 */                lIoii1l01l0i.I00000oOI(obj);
/* 227 */               list2 = list3;
/* 228 */               i4 = i;
/* 229 */               i4++;
/* 157 */               if (i4 >= size) {
/* 163 */                   io0lool = (Io0lool) list2.get(i4);
/* 167 */                   if (io0lool instanceof Io0li1o0) {
/* 170 */                       Io0li1o0 io0li1o0 = (Io0li1o0) io0lool;
/* 172 */                       I0oiil10Ili i0oiil10Ili3 = io0li1o0.I00000oIO;
/* 174 */                       if (i0oiil10Ili3 != null) {
/* 179 */                           io0oI1oo0.I00iOIl = list2;
/* 181 */                           io0oI1oo0.I00iiI = io0li1o0;
/* 183 */                           io0oI1oo0.I00iiO = i4;
/* 185 */                           io0oI1oo0.I00iio = size;
/* 187 */                           io0oI1oo0.I00io1l = 2;
/* 189 */                           i0oiil10Ili3.I001lllioOl();
/* 192 */                           if (ooiIlOl1iI != ii0111o) {
/* 195 */                               i = i4;
/* 196 */                               io0lool2 = io0lool;
/* 197 */                               io0lool = io0lool2;
/* 198 */                               list3 = list2;
/* 204 */                               i0oiil10Ili = ((Io0li1o0) io0lool).I00000oOI;
/* 206 */                               if (i0oiil10Ili != null) {
/* 211 */                                   io0oI1oo0.I00iOIl = list3;
/* 213 */                                   io0oI1oo0.I00iiI = null;
/* 215 */                                   io0oI1oo0.I00iiO = i;
/* 217 */                                   io0oI1oo0.I00iio = size;
/* 219 */                                   io0oI1oo0.I00io1l = 3;
/* 221 */                                   i0oiil10Ili.I001lllioOl();
                                        }
/* 227 */                               list2 = list3;
/* 228 */                               i4 = i;
                                    }
/* 226 */                           return ii0111o;
                                }
/* 200 */                       i = i4;
/* 198 */                       list3 = list2;
/* 204 */                       i0oiil10Ili = ((Io0li1o0) io0lool).I00000oOI;
/* 206 */                       if (i0oiil10Ili != null) {
                                }
/* 227 */                       list2 = list3;
/* 228 */                       i4 = i;
                            }
/* 229 */                   i4++;
/* 157 */                   if (i4 >= size) {
/* 231 */                       list2.clear();
/* 236 */                       il001oo1.I00000oOI(this.I00ilO0, null);
/* 332 */                       return ooiIlOl1iI;
                            }
                        }
                    }
/* 146 */           this.I00oIiI10 = null;
/* 155 */           list2 = list;
/* 151 */           size = list.size();
/* 157 */           if (i4 >= size) {
                    }
                }

                public final void I001l0I00(List list, int i, Io0liil0lOi io0liil0lOi) {
/* 1 */             Oi01iIoI oi01iIoI = this.I00o0iI0io1;
/* 3 */             if (oi01iIoI == null && i == 0) {
/* 7 */                 list.remove(i);
/* 10 */                return;
                    }
/* 18 */            if (this.I00lll10.I00000oOI() && oi01iIoI != null && I0000Il00O(false, Collections.singletonList(oi01iIoI), io0liil0lOi.I00000oIO)) {
/* 34 */                list.remove(i);
/* 37 */                return;
                    }
/* 38 */            if (i > 0) {
                        int i2 = i - 1;
/* 50 */                if (((Io0lool) list.get(i2)) instanceof Io0lOi0) {
/* 52 */                    I000l1(i2, list, false);
                        } else {
/* 58 */                    I000II.I001IO000("Check failed.");
                        }
                    }
                }

                public final boolean I00IOO() {
/* 1 */             I0oiil10Ili i0oiil10Ili = this.I00oIiI10;
/* 3 */             if (i0oiil10Ili == null) {
/* 39 */                return false;
                    }
/* 5 */             Oi01iIoI oi01iIoI = this.I00o0iI0io1;
/* 34 */            return O0000Ioio00.I0000O(oi01iIoI != null ? Boolean.valueOf(i0oiil10Ili.I00II0Ol1O0l(true, Collections.singletonList(oi01iIoI), this.I00iiI, this.I00o0l1o1o0, this.I00oI0i, this.I00oII)) : null, Boolean.TRUE);
                }

                public final void I00IioO0OiOi(boolean z) {
/* 3 */             this.I00lll10.I00000oIO = z ? 1 : 0;
/* 5 */             if (z) {
/* 11 */                this.I00io1l.I0010I0i(Io0l00io.I00000oOI);
                    }
                }

                public final void I00Io1lO(I0oiil10Ili i0oiil10Ili) {
                    synchronized (this.I00ioIO) {
/* 4 */                 I0oiil10Ili i0oiil10Ili2 = this.I00l0OO0IO;
/* 6 */                 this.I00l0OO0IO = i0oiil10Ili;
/* 10 */                if (this.I00l0I0l0lO1) {
/* 12 */                    IOoil1iiIilo iOoil1iiIilo = null;
/* 13 */                    this.I00l0OO0IO = null;
/* 15 */                    if (i0oiil10Ili != null) {
/* 26 */                        iOi1II01i0.I0000O(this.I00ilI0I1, null, null, new Io0o0o11l1i0(i0oiil10Ili, iOoil1iiIilo, 1), 3);
                            }
/* 33 */                    return;
                        }
/* 34 */                if (i0oiil10Ili2 != i0oiil10Ili) {
/* 37 */                    o01l1ioOo0 o01l1iooo0 = this.I00io1l;
/* 41 */                    Io0li1o0 io0li1o0 = new Io0li1o0();
/* 44 */                    io0li1o0.I00000oIO = i0oiil10Ili2;
/* 46 */                    io0li1o0.I00000oOI = i0oiil10Ili;
/* 48 */                    VarHandle.storeStoreFence();
/* 51 */                    o01l1iooo0.I0010I0i(io0li1o0);
                        }
/* 55 */                if (i0oiil10Ili == null) {
/* 59 */                    int size = this.I00iio.size();
/* 64 */                    for (int i = 0; i < size; i++) {
/* 74 */                        ((Io0o0l0i1Il) this.I00iio.get(i)).I00000oIO();
                            }
                        }
                    }
                }

                @Override
                public final void close() {
                    synchronized (this.I00ioIO) {
                        try {
/* 6 */                     if (this.I00l0I0l0lO1) {
/* 9 */                         return;
                            }
/* 11 */                    this.I00l0I0l0lO1 = true;
/* 13 */                    I0oiil10Ili i0oiil10Ili = this.I00l0OO0IO;
/* 15 */                    int i = 0;
/* 16 */                    IOoil1iiIilo iOoil1iiIilo = null;
/* 17 */                    if (i0oiil10Ili != null) {
/* 27 */                        iOi1II01i0.I0000O(this.I00ilI0I1, null, null, new Io0o0o11l1i0(i0oiil10Ili, iOoil1iiIilo, i), 3);
                            }
/* 33 */                    this.I00l0OO0IO = null;
/* 39 */                    this.I00io1l.I0010I0i(Io0l00io.I0000Il00O);
/* 45 */                    int size = this.I00iio.size();
/* 49 */                    while (i < size) {
/* 59 */                        ((Io0o0l0i1Il) this.I00iio.get(i)).I00000oOI();
/* 62 */                        i++;
                            }
                        } catch (Throwable th) {
/* 110 */                   throw th;
                        }
                    }
                }

                public final String toString() {
/* 18 */            return "GraphLoop(" + this.I00iOIl + ')';
                }
            }
