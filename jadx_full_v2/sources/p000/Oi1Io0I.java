            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public abstract class Oi1Io0I {
                public static final IOlO1IilOlOl I00000oIO = iiliio0o.I0000Il00O(new O1olloI0OlO(29));
                public static final IOlO1IilOlOl I00000oOI = iiliio0o.I0000Il00O(I1lOO0Ii00.I00l0OO0IO);

                /* JADX WARN: Removed duplicated region for block: B:62:0x00ab  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x010d  */
                /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(Oi1O00I1 oi1O00I1, I1111OO10i i1111OO10i, O1ooiI111i o1ooiI111i, Function1 function1, Map map, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    Map map2;
                    long jI0000O;
                    O1ooiI111i o1ooiI111i2;
                    OOloioIl oOloioIlI001IO000;
/* 16 */            iloI0lOlll1.I00i0O(559740240);
/* 21 */            if ((i & 6) == 0) {
/* 32 */                i3 = (iloI0lOlll1.I000II(oi1O00I1) ? 4 : 2) | i;
                    } else {
/* 34 */                i3 = i;
                    }
/* 37 */            if ((i & 48) == 0) {
/* 50 */                i3 |= iloI0lOlll1.I000II(i1111OO10i) ? 32 : 16;
                    }
/* 51 */            int i4 = i3 | 384;
/* 55 */            if ((i & 3072) == 0) {
/* 68 */                i4 |= iloI0lOlll1.I000OOo1O(function1) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 72 */            if ((i & 24576) == 0) {
/* 85 */                i4 |= iloI0lOlll1.I0000oI00(1) ? 16384 : 8192;
                    }
/* 89 */            if ((196608 & i) == 0) {
/* 102 */               i4 |= iloI0lOlll1.I000O01llI0(true) ? 131072 : 65536;
                    }
/* 106 */           if ((1572864 & i) == 0) {
/* 122 */               i4 |= iloI0lOlll1.I0000oI00(Integer.MAX_VALUE) ? 1048576 : 524288;
                    }
/* 123 */           int i5 = i2 & 64;
/* 127 */           if (i5 == 0) {
/* 134 */               if ((12582912 & i) == 0) {
/* 136 */                   map2 = map;
/* 149 */                   i4 |= iloI0lOlll1.I000OOo1O(map2) ? 8388608 : 4194304;
                        }
/* 157 */               if ((4793491 & i4) == 4793490 || !iloI0lOlll1.I00IO1()) {
/* 172 */                   if (i5 != 0) {
/* 174 */                       map2 = Il011I1OiO0I.I00iOIl;
                            }
/* 180 */                   iloI0lOlll1.I00i01iIIliI(1165610213);
/* 187 */                   jI0000O = I0000O(iloI0lOlll1).I0000O();
/* 195 */                   if (jI0000O == 16) {
/* 199 */                       jI0000O = I0000Il00O(iloI0lOlll1);
                            }
/* 197 */                   long j = jI0000O;
/* 205 */                   iloI0lOlll1.I0010I0i(false);
/* 259 */                   iOOoI0OII.I00000oOI(i1111OO10i, Oo0lloOiiIOI.I00000oOI(I0000O(iloI0lOlll1), j, 0L, null, null, 0L, 0L, null, 16777214), function1, 0, map2, iloI0lOlll1, ((i4 >> 3) & 126) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | ((i4 << 3) & 234881024));
/* 262 */                   o1ooiI111i2 = O1ooIo101ll.I00000oIO;
                        } else {
/* 166 */                   iloI0lOlll1.I00OilO00Il();
/* 169 */                   o1ooiI111i2 = o1ooiI111i;
                        }
/* 264 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 268 */               if (oOloioIlI001IO000 == null) {
/* 272 */                   Oi1Ilol oi1Ilol = new Oi1Ilol();
/* 275 */                   oi1Ilol.I00iOIl = oi1O00I1;
/* 277 */                   oi1Ilol.I00iiI = i1111OO10i;
/* 279 */                   oi1Ilol.I00iiO = o1ooiI111i2;
/* 281 */                   oi1Ilol.I00iio = function1;
/* 283 */                   oi1Ilol.I00ilI0I1 = map2;
/* 285 */                   oi1Ilol.I00ilO0 = i;
/* 287 */                   oi1Ilol.I00io1l = i2;
/* 289 */                   VarHandle.storeStoreFence();
/* 292 */                   oOloioIlI001IO000.I0000O = oi1Ilol;
/* 294 */                   return;
                        }
/* 294 */               return;
                    }
/* 129 */           i4 |= 12582912;
/* 130 */           map2 = map;
/* 157 */           if ((4793491 & i4) == 4793490) {
/* 172 */               if (i5 != 0) {
                        }
/* 180 */               iloI0lOlll1.I00i01iIIliI(1165610213);
/* 187 */               jI0000O = I0000O(iloI0lOlll1).I0000O();
/* 195 */               if (jI0000O == 16) {
                        }
/* 197 */               long j2 = jI0000O;
/* 205 */               iloI0lOlll1.I0010I0i(false);
/* 259 */               iOOoI0OII.I00000oOI(i1111OO10i, Oo0lloOiiIOI.I00000oOI(I0000O(iloI0lOlll1), j2, 0L, null, null, 0L, 0L, null, 16777214), function1, 0, map2, iloI0lOlll1, ((i4 >> 3) & 126) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | ((i4 << 3) & 234881024));
/* 262 */               o1ooiI111i2 = O1ooIo101ll.I00000oIO;
                    }
/* 264 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 268 */           if (oOloioIlI001IO000 == null) {
                    }
                }

                public static final void I00000oOI(Oi1O00I1 oi1O00I1, String str, O1ooiI111i o1ooiI111i, Function1 function1, int i, boolean z, int i2, IloI0lOlll1 iloI0lOlll1, int i3) {
                    int i4;
                    Function1 function12;
                    O1ooiI111i o1ooiI111i2;
                    int i5;
                    boolean z2;
                    int i6;
/* 12 */            iloI0lOlll1.I00i0O(-1456639868);
/* 17 */            if ((i3 & 6) == 0) {
/* 28 */                i4 = (iloI0lOlll1.I000II(oi1O00I1) ? 4 : 2) | i3;
                    } else {
/* 30 */                i4 = i3;
                    }
/* 33 */            if ((i3 & 48) == 0) {
/* 46 */                i4 |= iloI0lOlll1.I000II(str) ? 32 : 16;
                    }
/* 50 */            int i7 = i4 | 1797504;
/* 58 */            if ((599187 & i7) == 599186 && iloI0lOlll1.I00IO1()) {
/* 67 */                iloI0lOlll1.I00OilO00Il();
/* 70 */                o1ooiI111i2 = o1ooiI111i;
/* 72 */                function12 = function1;
/* 74 */                i5 = i;
/* 76 */                z2 = z;
/* 78 */                i6 = i2;
                    } else {
/* 85 */                iloI0lOlll1.I00i01iIIliI(1165584677);
/* 88 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 94 */                if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 100 */                   objI00O0i0ii = new OOii01Ioi1(8);
/* 103 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 107 */               function12 = (Function1) objI00O0i0ii;
/* 110 */               iloI0lOlll1.I0010I0i(false);
/* 116 */               iloI0lOlll1.I00i01iIIliI(1165589669);
/* 123 */               long jI0000O = I0000O(iloI0lOlll1).I0000O();
/* 131 */               if (jI0000O == 16) {
/* 135 */                   jI0000O = I0000Il00O(iloI0lOlll1);
                        }
/* 133 */               long j = jI0000O;
/* 140 */               iloI0lOlll1.I0010I0i(false);
/* 162 */               Oo0lloOiiIOI oo0lloOiiIOII00000oOI = Oo0lloOiiIOI.I00000oOI(I0000O(iloI0lOlll1), j, 0L, null, null, 0L, 0L, null, 16777214);
/* 185 */               int i8 = ((i7 >> 3) & 126) | (i7 & 7168) | (57344 & i7) | (458752 & i7) | (i7 & 3670016);
/* 189 */               o1ooiI111i2 = O1ooIo101ll.I00000oIO;
/* 191 */               i5 = 1;
/* 192 */               z2 = true;
/* 193 */               i6 = Integer.MAX_VALUE;
/* 197 */               iOOoI0OII.I0000O(str, o1ooiI111i2, oo0lloOiiIOII00000oOI, function12, 1, true, Integer.MAX_VALUE, 0, iloI0lOlll1, i8, 384);
                    }
/* 200 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 204 */           if (oOloioIlI001IO000 != null) {
/* 208 */               Oi1IlI0OoII oi1IlI0OoII = new Oi1IlI0OoII();
/* 211 */               oi1IlI0OoII.I00iOIl = oi1O00I1;
/* 213 */               oi1IlI0OoII.I00iiI = str;
/* 215 */               oi1IlI0OoII.I00iiO = o1ooiI111i2;
/* 217 */               oi1IlI0OoII.I00iio = function12;
/* 219 */               oi1IlI0OoII.I00ilI0I1 = i5;
/* 221 */               oi1IlI0OoII.I00ilO0 = z2;
/* 223 */               oi1IlI0OoII.I00io1l = i6;
/* 225 */               oi1IlI0OoII.I00ioIO = i3;
/* 227 */               VarHandle.storeStoreFence();
/* 230 */               oOloioIlI001IO000.I0000O = oi1IlI0OoII;
                    }
                }

                public static final long I0000Il00O(IloI0lOlll1 iloI0lOlll1) {
/* 4 */             iloI0lOlll1.I00i01iIIliI(-401305534);
/* 7 */             IOlO1IilOlOl iOlO1IilOlOl = Oi1i0loi11o0.I00000oIO;
/* 12 */            iloI0lOlll1.I00i01iIIliI(-730696581);
/* 23 */            IlliIl1l11O illiIl1l11O = ((Oi1i0iooIO) iloI0lOlll1.I000iOII(Oi1i0loi11o0.I00000oIO)).I0000Il00O;
/* 26 */            iloI0lOlll1.I0010I0i(false);
/* 39 */            long j = ((IOOiio0i) illiIl1l11O.invoke(iloI0lOlll1, 0)).I00000oIO;
/* 41 */            iloI0lOlll1.I0010I0i(false);
/* 49 */            return j;
                }

                public static final Oo0lloOiiIOI I0000O(IloI0lOlll1 iloI0lOlll1) {
/* 4 */             iloI0lOlll1.I00i01iIIliI(-1652167225);
/* 7 */             IOlO1IilOlOl iOlO1IilOlOl = Oi1i0loi11o0.I00000oIO;
/* 12 */            iloI0lOlll1.I00i01iIIliI(605597993);
/* 23 */            IlliIl1l11O illiIl1l11O = ((Oi1i0iooIO) iloI0lOlll1.I000iOII(Oi1i0loi11o0.I00000oIO)).I00000oIO;
/* 26 */            iloI0lOlll1.I0010I0i(false);
/* 37 */            Oo0lloOiiIOI oo0lloOiiIOI = (Oo0lloOiiIOI) illiIl1l11O.invoke(iloI0lOlll1, 0);
/* 39 */            iloI0lOlll1.I0010I0i(false);
/* 49 */            return oo0lloOiiIOI;
                }
            }
