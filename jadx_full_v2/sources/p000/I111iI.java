            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function3;
            
            public abstract class I111iI {
                public static final OIoi0IIoi I00000oIO;

                static {
/* 3 */             Il01100l il01100l = Il01100l.I00iOIl;
/* 8 */             I00000oIO = new OIoi0IIoi(il01100l, il01100l);
                }

                public static final void I00000oIO(I1111OO10i i1111OO10i, List list, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(-1794596951);
/* 22 */            int i2 = (i & 6) == 0 ? (iloI0lOlll1.I000II(i1111OO10i) ? 4 : 2) | i : i;
/* 25 */            if ((i & 48) == 0) {
/* 38 */                i2 |= iloI0lOlll1.I000OOo1O(list) ? 32 : 16;
                    }
/* 55 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 60 */                int size = list.size();
/* 65 */                for (int i3 = 0; i3 < size; i3++) {
/* 71 */                    I11110l0o i11110l0o = (I11110l0o) list.get(i3);
/* 75 */                    Function3 function3 = (Function3) i11110l0o.I00000oIO;
/* 77 */                    int i4 = i11110l0o.I00000oOI;
/* 79 */                    int i5 = i11110l0o.I0000Il00O;
/* 81 */                    Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 87 */                    if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 89 */                        objI00O0i0ii = I0o0oo1oOOlO.I0000O;
/* 91 */                        iloI0lOlll1.I00iio(objI00O0i0ii);
                            }
/* 94 */                    O1iOIl0o10 o1iOIl0o10 = (O1iOIl0o10) objI00O0i0ii;
/* 98 */                    int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 102 */                   OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 108 */                   O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, O1ooIo101ll.I00000oIO);
/* 114 */                   IOl0oi0lOl1.I000lI.getClass();
/* 117 */                   iloI0lOlll1.I00i0oil();
/* 122 */                   if (iloI0lOlll1.I00O10llo) {
/* 126 */                       iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                            } else {
/* 130 */                       iloI0lOlll1.I00io1l();
                            }
/* 135 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10);
/* 140 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 149 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 152 */                   li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 157 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 170 */                   function3.invoke(i1111OO10i.subSequence(i4, i5).I00iiI, iloI0lOlll1, 0);
/* 173 */                   iloI0lOlll1.I0010I0i(true);
                        }
                    } else {
/* 179 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 182 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 186 */           if (oOloioIlI001IO000 != null) {
/* 190 */               I0O0llIiIlOO i0O0llIiIlOO = new I0O0llIiIlOO(1);
/* 193 */               i0O0llIiIlOO.I00iiO = i1111OO10i;
/* 195 */               i0O0llIiIlOO.I00iio = list;
/* 197 */               i0O0llIiIlOO.I00iiI = i;
/* 199 */               VarHandle.storeStoreFence();
/* 202 */               oOloioIlI001IO000.I0000O = i0O0llIiIlOO;
                    }
                }
            }
