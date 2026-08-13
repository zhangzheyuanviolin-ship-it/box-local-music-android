            package p000;

            import androidx.compose.ui.input.pointer.PointerInputEventHandler;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class lOl1iI1i {
                public static final void I00000oIO(boolean z, Oi0il01O01IO oi0il01O01IO, Oo0IOoOi01 oo0IOoOi01, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    Oo0il0olo1l oo0il0olo1lI0000O;
/* 12 */            iloI0lOlll1.I00i0O(-1344558920);
/* 17 */            int i3 = 4;
/* 18 */            if ((i & 6) == 0) {
/* 29 */                i2 = (iloI0lOlll1.I000O01llI0(z) ? 4 : 2) | i;
                    } else {
/* 31 */                i2 = i;
                    }
/* 36 */            if ((i & 48) == 0) {
/* 52 */                i2 |= iloI0lOlll1.I0000oI00(oi0il01O01IO.ordinal()) ? 32 : 16;
                    }
/* 55 */            if ((i & 384) == 0) {
/* 68 */                i2 |= iloI0lOlll1.I000OOo1O(oo0IOoOi01) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 86 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 88 */                int i4 = i2 & 14;
/* 99 */                boolean zI000II = (i4 == 4) | iloI0lOlll1.I000II(oo0IOoOi01);
/* 100 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 104 */               Object obj = IOl11li.I00000oIO;
                        Object obj2 = objI00O0i0ii;
/* 106 */               if (zI000II || objI00O0i0ii == obj) {
/* 112 */                   Oo0IO1lIl0o1 oo0IO1lIl0o1 = new Oo0IO1lIl0o1();
/* 115 */                   oo0IO1lIl0o1.I00000oIO = oo0IOoOi01;
/* 117 */                   oo0IO1lIl0o1.I00000oOI = z;
/* 119 */                   VarHandle.storeStoreFence();
/* 122 */                   iloI0lOlll1.I00iio(oo0IO1lIl0o1);
                            obj2 = oo0IO1lIl0o1;
                        }
/* 125 */               OlooOo olooOo = (OlooOo) obj2;
/* 134 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(oo0IOoOi01) | (i4 == 4);
/* 136 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj3 = objI00O0i0ii2;
/* 140 */               if (zI000OOo1O || objI00O0i0ii2 == obj) {
/* 146 */                   Oo0IOol1IlI oo0IOol1IlI = new Oo0IOol1IlI();
/* 149 */                   oo0IOol1IlI.I00iOIl = oo0IOoOi01;
/* 151 */                   oo0IOol1IlI.I00iiI = z;
/* 153 */                   VarHandle.storeStoreFence();
/* 156 */                   iloI0lOlll1.I00iio(oo0IOol1IlI);
                            obj3 = oo0IOol1IlI;
                        }
/* 159 */               OIOlil0i oIOlil0i = (OIOlil0i) obj3;
/* 167 */               boolean zI000O01llI0 = Oo0lI00l.I000O01llI0(oo0IOoOi01.I000l1().I00000oOI);
/* 180 */               int i5 = (int) (z ? oo0IOoOi01.I000l1().I00000oOI >> 32 : oo0IOoOi01.I000l1().I00000oOI & 4294967295L);
/* 195 */               O0oIlOolIO o0oIlOolIO = oo0IOoOi01.I0000O;
/* 212 */               float fI00000oIO = (o0oIlOolIO == null || (oo0il0olo1lI0000O = o0oIlOolIO.I0000O()) == null) ? 0.0f : lOlOlIloO.I00000oIO(oo0il0olo1lI0000O.I00000oIO, i5);
/* 213 */               boolean zI000OOo1O2 = iloI0lOlll1.I000OOo1O(olooOo);
/* 217 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        Object obj4 = objI00O0i0ii3;
/* 221 */               if (zI000OOo1O2 || objI00O0i0ii3 == obj) {
/* 227 */                   Oiii0lIIio11 oiii0lIIio11 = new Oiii0lIIio11(1);
/* 230 */                   oiii0lIIio11.I00000oOI = olooOo;
/* 232 */                   VarHandle.storeStoreFence();
/* 235 */                   iloI0lOlll1.I00iio(oiii0lIIio11);
                            obj4 = oiii0lIIio11;
                        }
/* 257 */               iOIloO1oiO.I00000oOI(oIOlil0i, z, oi0il01O01IO, zI000O01llI0, 0L, fI00000oIO, Oll10I.I00000oIO(O1ooIo101ll.I00000oIO, olooOo, (PointerInputEventHandler) obj4), iloI0lOlll1, (i2 << 3) & 1008);
                    } else {
/* 261 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 264 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 268 */           if (oOloioIlI001IO000 != null) {
/* 272 */               I0oololOOll1 i0oololOOll1 = new I0oololOOll1(i3);
/* 275 */               i0oololOOll1.I00iiI = z;
/* 279 */               i0oololOOll1.I00iio = oi0il01O01IO;
/* 281 */               i0oololOOll1.I00ilI0I1 = oo0IOoOi01;
/* 283 */               i0oololOOll1.I00iiO = i;
/* 285 */               VarHandle.storeStoreFence();
/* 288 */               oOloioIlI001IO000.I0000O = i0oololOOll1;
                    }
                }

                public static final boolean I00000oOI(Oo0IOoOi01 oo0IOoOi01, boolean z) {
                    O0iOOo0Ii o0iOOo0IiI0000Il00O;
/* 1 */             O0oIlOolIO o0oIlOolIO = oo0IOoOi01.I0000O;
/* 3 */             if (o0oIlOolIO == null || (o0iOOo0IiI0000Il00O = o0oIlOolIO.I0000Il00O()) == null) {
/* 24 */                return false;
                    }
/* 19 */            return iO0loiii.I00000oIO(iO0loiii.I0000Il00O(o0iOOo0IiI0000Il00O), oo0IOoOi01.I000OiO(z));
                }
            }
