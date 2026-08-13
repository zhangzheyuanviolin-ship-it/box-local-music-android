            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.net.URI;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Locale;
            import kotlin.jvm.functions.Function1;
            
            public abstract class I0O1ii1l {
                public static final List I00000oIO = Collections.singletonList("google-ai-edge.github.io");

                public static final void I00000oIO(Ol0o1OiOIIIl ol0o1OiOIIIl, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    boolean z;
/* 14 */            iloI0lOlll1.I00i0O(-8871293);
/* 19 */            if ((i & 6) == 0) {
/* 30 */                i2 = (iloI0lOlll1.I000OOo1O(ol0o1OiOIIIl) ? 4 : 2) | i;
                    } else {
/* 32 */                i2 = i;
                    }
/* 37 */            if ((i & 48) == 0) {
/* 49 */                i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI) ? 32 : 16;
                    }
/* 52 */            if ((i & 384) == 0) {
/* 65 */                i2 |= iloI0lOlll1.I000OOo1O(illOOo00lI2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 70 */            int i3 = 0;
/* 82 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 86 */                OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(ol0o1OiOIIIl.I0000oI00, iloI0lOlll1);
/* 96 */                boolean z2 = ((Ol0loOOoo) oI10i0IlI00000oOI.getValue()).I0000Il00O;
/* 104 */               String str = ((Ol0loOOoo) oI10i0IlI00000oOI.getValue()).I0000O;
/* 106 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 110 */               Object obj = IOl11li.I00000oIO;
/* 112 */               if (objI00O0i0ii == obj) {
/* 114 */                   objI00O0i0ii = l001l0.I00000oIO();
/* 118 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 121 */               OI0lOIiOIOOo oI0lOIiOIOOo = (OI0lOIiOIOOo) objI00O0i0ii;
/* 123 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
/* 128 */               if (objI00O0i0ii2 == obj) {
/* 134 */                   z = z2;
/* 141 */                   objI00O0i0ii2 = lOO00IiI0li.I00000oIO(new Oo0OI01Il(6, 0L, ""));
/* 145 */                   iloI0lOlll1.I00iio(objI00O0i0ii2);
                        } else {
/* 149 */                   z = z2;
                        }
/* 151 */               OI10i0Il oI10i0Il = (OI10i0Il) objI00O0i0ii2;
/* 153 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
/* 157 */               if (objI00O0i0ii3 == obj) {
/* 161 */                   objI00O0i0ii3 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 165 */                   iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 169 */               OI10i0Il oI10i0Il2 = (OI10i0Il) objI00O0i0ii3;
/* 175 */               int i4 = i2 & 112;
/* 195 */               boolean zI000OOo1O = ((i2 & 896) == 256) | iloI0lOlll1.I000OOo1O(ol0o1OiOIIIl) | (i4 == 32);
/* 196 */               Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                        Object obj2 = objI00O0i0ii4;
/* 200 */               if (zI000OOo1O || objI00O0i0ii4 == obj) {
/* 206 */                   I0O1IO i0o1io = new I0O1IO(i3);
/* 209 */                   i0o1io.I00iiI = ol0o1OiOIIIl;
/* 211 */                   i0o1io.I00iiO = illOOo00lI;
/* 213 */                   i0o1io.I00iio = illOOo00lI2;
/* 215 */                   i0o1io.I00ilI0I1 = oI10i0Il;
/* 217 */                   VarHandle.storeStoreFence();
/* 220 */                   iloI0lOlll1.I00iio(i0o1io);
                            obj2 = i0o1io;
                        }
/* 224 */               Function1 function1 = (Function1) obj2;
/* 226 */               boolean z3 = z;
/* 237 */               boolean zI000O01llI0 = (i4 == 32) | iloI0lOlll1.I000O01llI0(z3);
/* 238 */               Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii5;
/* 242 */               if (zI000O01llI0 || objI00O0i0ii5 == obj) {
/* 249 */                   I0IlOI1i i0IlOI1i = new I0IlOI1i(1);
/* 252 */                   i0IlOI1i.I00iiI = z3;
/* 254 */                   i0IlOI1i.I00iiO = illOOo00lI;
/* 256 */                   VarHandle.storeStoreFence();
/* 259 */                   iloI0lOlll1.I00iio(i0IlOI1i);
                            obj3 = i0IlOI1i;
                        }
/* 266 */               I0O1OO00001 i0o1oo00001 = new I0O1OO00001();
/* 269 */               i0o1oo00001.I00iOIl = oI0lOIiOIOOo;
/* 271 */               i0o1oo00001.I00iiI = z3;
/* 273 */               i0o1oo00001.I00iiO = ol0o1OiOIIIl;
/* 275 */               i0o1oo00001.I00iio = str;
/* 277 */               i0o1oo00001.I00ilI0I1 = oI10i0Il;
/* 279 */               i0o1oo00001.I00ilO0 = illOOo00lI;
/* 281 */               i0o1oo00001.I00io1l = function1;
/* 283 */               i0o1oo00001.I00ioIO = oI10i0Il2;
/* 285 */               VarHandle.storeStoreFence();
/* 300 */               iOIlI11IO.I00000oIO((IllOOo00lI) obj3, null, iiioOl1O.I00000oOI(5232346, i0o1oo00001, iloI0lOlll1), iloI0lOlll1, 384, 2);
/* 313 */               if (((Boolean) oI10i0Il2.getValue()).booleanValue()) {
/* 318 */                   iloI0lOlll1.I00i01iIIliI(2008161743);
/* 321 */                   Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
                            Object obj4 = objI00O0i0ii6;
/* 325 */                   if (objI00O0i0ii6 == obj) {
/* 331 */                       I0Il0000oli i0Il0000oli = new I0Il0000oli(22);
/* 334 */                       i0Il0000oli.I00iiI = oI10i0Il2;
/* 336 */                       VarHandle.storeStoreFence();
/* 339 */                       iloI0lOlll1.I00iio(i0Il0000oli);
                                obj4 = i0Il0000oli;
                            }
/* 342 */                   IllOOo00lI illOOo00lI3 = (IllOOo00lI) obj4;
/* 344 */                   boolean zI000II = iloI0lOlll1.I000II(function1);
/* 348 */                   Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
                            Object obj5 = objI00O0i0ii7;
/* 352 */                   if (zI000II || objI00O0i0ii7 == obj) {
/* 359 */                       I0O0Ol110O i0O0Ol110O = new I0O0Ol110O(2);
/* 362 */                       i0O0Ol110O.I00iiI = function1;
/* 364 */                       i0O0Ol110O.I00iiO = oI10i0Il2;
/* 366 */                       i0O0Ol110O.I00iio = oI10i0Il;
/* 368 */                       VarHandle.storeStoreFence();
/* 371 */                       iloI0lOlll1.I00iio(i0O0Ol110O);
                                obj5 = i0O0Ol110O;
                            }
/* 377 */                   iOIO10i011o.I00000oIO(illOOo00lI3, (IllOOo00lI) obj5, iloI0lOlll1, 6);
/* 380 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 387 */                   iloI0lOlll1.I00i01iIIliI(2008361631);
/* 390 */                   iloI0lOlll1.I0010I0i(false);
                        }
                    } else {
/* 394 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 397 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 401 */           if (oOloioIlI001IO000 != null) {
/* 406 */               I0O10I0O i0o10i0o = new I0O10I0O(2);
/* 409 */               i0o10i0o.I00iiI = ol0o1OiOIIIl;
/* 411 */               i0o10i0o.I00iiO = illOOo00lI;
/* 413 */               i0o10i0o.I00iio = illOOo00lI2;
/* 415 */               i0o10i0o.I00ilI0I1 = i;
/* 417 */               VarHandle.storeStoreFence();
/* 420 */               oOloioIlI001IO000.I0000O = i0o10i0o;
                    }
                }

                public static final boolean I00000oOI(String str) {
                    try {
/* 11 */                String host = new URI(str).normalize().getHost();
/* 15 */                if (host != null) {
/* 19 */                    String lowerCase = host.toLowerCase(Locale.ROOT);
/* 23 */                    List list = I00000oIO;
/* 29 */                    if ((list instanceof Collection) && list.isEmpty()) {
/* 1 */                         return false;
                            }
/* 41 */                    Iterator it = list.iterator();
/* 49 */                    while (it.hasNext()) {
/* 67 */                        if (lowerCase.equals(((String) it.next()).toLowerCase(Locale.ROOT))) {
/* 69 */                            return true;
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
/* 1 */             return false;
                }
            }
