            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class ii1il0 {
                public static final void I00000oIO(Oi1O00I1 oi1O00I1, boolean z, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(407108909);
/* 9 */             if ((i & 6) == 0) {
/* 20 */                i2 = (iloI0lOlll1.I000II(oi1O00I1) ? 4 : 2) | i;
                    } else {
/* 22 */                i2 = i;
                    }
/* 25 */            if ((i & 48) == 0) {
/* 38 */                i2 |= iloI0lOlll1.I000O01llI0(z) ? 32 : 16;
                    }
/* 41 */            if ((i & 384) == 0) {
/* 54 */                i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 59 */            if ((i2 & 147) == 146 && iloI0lOlll1.I00IO1()) {
/* 68 */                iloI0lOlll1.I00OilO00Il();
                    } else {
/* 72 */                O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 75 */                if (z) {
/* 107 */                   iloI0lOlll1.I00i01iIIliI(-1583170062);
/* 121 */                   iOii1l.I000l1(oi1O00I1, o1ooIo101ll, iloI0lOlll1, Integer.valueOf((i2 & 896) | (i2 & 14) | 48));
/* 124 */                   iloI0lOlll1.I0010I0i(false);
                        } else {
/* 80 */                    iloI0lOlll1.I00i01iIIliI(-1583274904);
/* 97 */                    iOii1l.I000l1(oi1O00I1, iO0l10O.I0000Il00O(o1ooIo101ll, iO0l10O.I00000oOI(iloI0lOlll1), false), iloI0lOlll1, Integer.valueOf(i2 & 910));
/* 100 */                   iloI0lOlll1.I0010I0i(false);
                        }
                    }
/* 127 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 131 */           if (oOloioIlI001IO000 != null) {
/* 136 */               I0oololOOll1 i0oololOOll1 = new I0oololOOll1(1);
/* 139 */               i0oololOOll1.I00iio = oi1O00I1;
/* 141 */               i0oololOOll1.I00iiI = z;
/* 143 */               i0oololOOll1.I00ilI0I1 = iOii1l;
/* 145 */               i0oololOOll1.I00iiO = i;
/* 147 */               VarHandle.storeStoreFence();
/* 150 */               oOloioIlI001IO000.I0000O = i0oololOOll1;
                    }
                }
            }
