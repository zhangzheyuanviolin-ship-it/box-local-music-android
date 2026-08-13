            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class lIOi11I01oo {
                public static final void I00000oIO(long j, Oo0lloOiiIOI oo0lloOiiIOI, IlliIl1l11O illiIl1l11O, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(-684938728);
/* 9 */             if ((i & 6) == 0) {
/* 20 */                i2 = (iloI0lOlll1.I0001Ioi1lo(j) ? 4 : 2) | i;
                    } else {
/* 22 */                i2 = i;
                    }
/* 25 */            if ((i & 48) == 0) {
/* 38 */                i2 |= iloI0lOlll1.I000II(oo0lloOiiIOI) ? 32 : 16;
                    }
/* 41 */            if ((i & 384) == 0) {
/* 54 */                i2 |= iloI0lOlll1.I000OOo1O(illiIl1l11O) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 59 */            int i3 = 0;
/* 71 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 73 */                IOlO1IilOlOl iOlO1IilOlOl = Oo0i1oIIoOO.I00000oIO;
/* 110 */               iiliio0o.I00000oOI(new OOiIo1lll[]{IOoIioIOoolI.I00000oIO.I00000oIO(IOOiio0i.I00000oIO(j)), iOlO1IilOlOl.I00000oIO(((Oo0lloOiiIOI) iloI0lOlll1.I000iOII(iOlO1IilOlOl)).I0001Ioi1lo(oo0lloOiiIOI))}, illiIl1l11O, iloI0lOlll1, ((i2 >> 3) & 112) | 8);
                    } else {
/* 114 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 117 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 121 */           if (oOloioIlI001IO000 != null) {
/* 125 */               OOiIiiIioiO oOiIiiIioiO = new OOiIiiIioiO(i3);
/* 128 */               oOiIiiIioiO.I00iiI = j;
/* 130 */               oOiIiiIioiO.I00iiO = oo0lloOiiIOI;
/* 132 */               oOiIiiIioiO.I00iio = illiIl1l11O;
/* 134 */               oOiIiiIioiO.I00ilI0I1 = i;
/* 136 */               VarHandle.storeStoreFence();
/* 139 */               oOloioIlI001IO000.I0000O = oOiIiiIioiO;
                    }
                }
            }
