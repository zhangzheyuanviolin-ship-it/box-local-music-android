            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.List;
            import java.util.ListIterator;
            import java.util.Set;
            import kotlin.jvm.functions.Function1;
            
            public abstract class il1OO11i1O1 {
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r14v0, types: [IloI0lOlll1] */
                /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v8, types: [IO1Io1IOOOIi, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v9 */
                public static final void I00000oIO(Iii0iOoIo iii0iOoIo, IloI0lOlll1 iloI0lOlll1, int i) {
                    Object i0O0il1iIl;
                    Ol1o0O0O0 ol1o0O0O0;
/* 4 */             iloI0lOlll1.I00i0O(294589392);
/* 20 */            if ((((iloI0lOlll1.I000OOo1O(iii0iOoIo) ? 4 : 2) | i) & 3) == 2 && iloI0lOlll1.I00IO1()) {
/* 29 */                iloI0lOlll1.I00OilO00Il();
                    } else {
/* 34 */                OiIil1il oiIil1ilI00000oIO = lO0OOOO0.I00000oIO(iloI0lOlll1);
/* 44 */                OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(iii0iOoIo.I00000oOI().I0000oI00, iloI0lOlll1);
/* 52 */                List list = (List) oI10i0IlI00000oOI.getValue();
/* 64 */                boolean zBooleanValue = ((Boolean) iloI0lOlll1.I000iOII(Ioo1O1i.I00000oIO)).booleanValue();
/* 68 */                boolean zI000II = iloI0lOlll1.I000II(list);
/* 72 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 76 */                IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                        Object obj = objI00O0i0ii;
/* 78 */                if (zI000II || objI00O0i0ii == iOO0o0I1l) {
/* 84 */                    Ol1o0O0O0 ol1o0O0O02 = new Ol1o0O0O0();
/* 91 */                    ArrayList arrayList = new ArrayList();
/* 102 */                   for (Object obj2 : list) {
/* 127 */                       if (zBooleanValue ? true : ((OI1OloOIO1O) obj2).I00ioIO.I000OiO.I00l0I0l0lO1.I00000oIO(O0oOi0I.I00iio)) {
/* 129 */                           arrayList.add(obj2);
                                }
                            }
/* 133 */                   ol1o0O0O02.addAll(arrayList);
/* 136 */                   iloI0lOlll1.I00iio(ol1o0O0O02);
                            obj = ol1o0O0O02;
                        }
/* 139 */               Ol1o0O0O0 ol1o0O0O03 = (Ol1o0O0O0) obj;
/* 150 */               I00000oOI(ol1o0O0O03, (List) oI10i0IlI00000oOI.getValue(), iloI0lOlll1, 0);
/* 159 */               OI10i0Il oI10i0IlI00000oOI2 = lOIoiooI1i01.I00000oOI(iii0iOoIo.I00000oOI().I0001Ioi1lo, iloI0lOlll1);
/* 163 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 167 */               if (objI00O0i0ii2 == iOO0o0I1l) {
/* 171 */                   objI00O0i0ii2 = new Ol1o0O0O0();
/* 174 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 178 */               Ol1o0O0O0 ol1o0O0O04 = (Ol1o0O0O0) objI00O0i0ii2;
/* 183 */               iloI0lOlll1.I00i01iIIliI(-367418626);
/* 186 */               ListIterator listIterator = ol1o0O0O03.listIterator();
                        while (true) {
/* 191 */                   Io1ioiIIO1lI io1ioiIIO1lI = (Io1ioiIIO1lI) listIterator;
/* 197 */                   if (!io1ioiIIO1lI.hasNext()) {
                                break;
                            }
/* 203 */                   OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) io1ioiIIO1lI.next();
/* 207 */                   Iii0OliiI iii0OliiI = (Iii0OliiI) oI1OloOIO1O.I00iiI;
/* 217 */                   boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(iii0iOoIo) | iloI0lOlll1.I000OOo1O(oI1OloOIO1O);
/* 218 */                   ?? I00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 222 */                   if (zI000OOo1O || I00O0i0ii == iOO0o0I1l) {
/* 229 */                       I00O0i0ii = new IO1Io1IOOOIi(5);
/* 232 */                       I00O0i0ii.I00iiI = iii0iOoIo;
/* 234 */                       I00O0i0ii.I00iiO = oI1OloOIO1O;
/* 236 */                       VarHandle.storeStoreFence();
/* 239 */                       iloI0lOlll1.I00iio(I00O0i0ii);
                            }
/* 244 */                   Iii0io0OooO iii0io0OooO = iii0OliiI.I00ilO0;
/* 248 */                   Iii0Ioi10 iii0Ioi10 = new Iii0Ioi10();
/* 251 */                   iii0Ioi10.I00iOIl = oI1OloOIO1O;
/* 253 */                   iii0Ioi10.I00iiI = iii0iOoIo;
/* 255 */                   iii0Ioi10.I00iiO = oiIil1ilI00000oIO;
/* 257 */                   iii0Ioi10.I00iio = ol1o0O0O04;
/* 259 */                   iii0Ioi10.I00ilI0I1 = iii0OliiI;
/* 261 */                   VarHandle.storeStoreFence();
/* 278 */                   iOIlI11IO.I00000oIO((IllOOo00lI) I00O0i0ii, iii0io0OooO, iiioOl1O.I00000oOI(1129586364, iii0Ioi10, iloI0lOlll1), iloI0lOlll1, 384, 0);
                        }
/* 282 */               iloI0lOlll1.I0010I0i(false);
/* 290 */               Set set = (Set) oI10i0IlI00000oOI2.getValue();
/* 300 */               boolean zI000II2 = iloI0lOlll1.I000II(oI10i0IlI00000oOI2) | iloI0lOlll1.I000OOo1O(iii0iOoIo);
/* 301 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 305 */               if (zI000II2 || objI00O0i0ii3 == iOO0o0I1l) {
/* 318 */                   ol1o0O0O0 = ol1o0O0O04;
/* 319 */                   i0O0il1iIl = new I0O0il1iIl(oI10i0IlI00000oOI2, (Object) iii0iOoIo, (Object) ol1o0O0O0, (IOoil1iiIilo) null, 7);
/* 322 */                   iloI0lOlll1.I00iio(i0O0il1iIl);
                        } else {
/* 310 */                   i0O0il1iIl = objI00O0i0ii3;
/* 311 */                   ol1o0O0O0 = ol1o0O0O04;
                        }
/* 327 */               iIO0iiOiOl0l.I0000oI00(set, ol1o0O0O0, (IlliIl1l11O) i0O0il1iIl, iloI0lOlll1);
                    }
/* 330 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 334 */           if (oOloioIlI001IO000 != null) {
/* 340 */               I00oooO i00oooO = new I00oooO(18);
/* 343 */               i00oooO.I00iiI = iii0iOoIo;
/* 345 */               VarHandle.storeStoreFence();
/* 348 */               oOloioIlI001IO000.I0000O = i00oooO;
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v3, types: [Iii0IOio, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v4 */
                /* JADX WARN: Type inference failed for: r7v0, types: [IloI0lOlll1] */
                public static final void I00000oOI(List list, Collection collection, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(1537894851);
/* 33 */            if (((i | (iloI0lOlll1.I000OOo1O(list) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(collection) ? 32 : 16)) & 19) == 18 && iloI0lOlll1.I00IO1()) {
/* 42 */                iloI0lOlll1.I00OilO00Il();
                    } else {
/* 54 */                boolean zBooleanValue = ((Boolean) iloI0lOlll1.I000iOII(Ioo1O1i.I00000oIO)).booleanValue();
/* 61 */                Iterator it = collection.iterator();
/* 69 */                while (it.hasNext()) {
/* 75 */                    OI1OloOIO1O oI1OloOIO1O = (OI1OloOIO1O) it.next();
/* 79 */                    O0oiiOll0O1 o0oiiOll0O1 = oI1OloOIO1O.I00ioIO.I000OiO;
/* 94 */                    boolean zI000O01llI0 = iloI0lOlll1.I000O01llI0(zBooleanValue) | iloI0lOlll1.I000OOo1O(list) | iloI0lOlll1.I000OOo1O(oI1OloOIO1O);
/* 95 */                    ?? I00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 99 */                    if (zI000O01llI0 || I00O0i0ii == IOl11li.I00000oIO) {
/* 108 */                       I00O0i0ii = new Iii0IOio(0);
/* 111 */                       I00O0i0ii.I00iiO = oI1OloOIO1O;
/* 113 */                       I00O0i0ii.I00iiI = zBooleanValue;
/* 115 */                       I00O0i0ii.I00iio = list;
/* 117 */                       VarHandle.storeStoreFence();
/* 120 */                       iloI0lOlll1.I00iio(I00O0i0ii);
                            }
/* 125 */                   iIO0iiOiOl0l.I00000oOI(o0oiiOll0O1, (Function1) I00O0i0ii, iloI0lOlll1);
                        }
                    }
/* 129 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 133 */           if (oOloioIlI001IO000 != null) {
/* 139 */               I0Il0I1o i0Il0I1o = new I0Il0I1o(24);
/* 142 */               i0Il0I1o.I00iiO = list;
/* 144 */               i0Il0I1o.I00iiI = collection;
/* 146 */               VarHandle.storeStoreFence();
/* 149 */               oOloioIlI001IO000.I0000O = i0Il0I1o;
                    }
                }
            }
