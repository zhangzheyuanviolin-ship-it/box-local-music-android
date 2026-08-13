            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class ilOl00Oo1l1 {
                public static final void I00000oIO(int i, IloI0lOlll1 iloI0lOlll1, O1ooiI111i o1ooiI111i, String str, boolean z) {
/* 4 */             iloI0lOlll1.I00i0O(-1781982364);
/* 41 */            int i2 = (iloI0lOlll1.I000O01llI0(z) ? 4 : 2) | i | (iloI0lOlll1.I000II(str) ? 32 : 16) | (iloI0lOlll1.I000II(o1ooiI111i) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF);
/* 58 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 70 */                Il0l0iooI il0l0iooII00000oIO = Il0iiiII11.I000lI(3, null).I00000oIO(Il0iiiII11.I0000oI00(null, 3));
/* 82 */                Il1OOloOIl1 il1OOloOIl1I00000oIO = Il0iiiII11.I0001Ioi1lo(null, 3).I00000oIO(Il0iiiII11.I000oI1ioi(3, null));
/* 88 */                I1iIllIiO i1iIllIiO = new I1iIllIiO(2);
/* 91 */                i1iIllIiO.I00iiI = str;
/* 93 */                VarHandle.storeStoreFence();
/* 123 */               O1OooO0IlOo.I0000Il00O(z, o1ooiI111i, il0l0iooII00000oIO, il1OOloOIl1I00000oIO, null, iiioOl1O.I00000oOI(1622820412, i1iIllIiO, iloI0lOlll1), iloI0lOlll1, (i2 & 14) | 200064 | ((i2 >> 3) & 112), 16);
                    } else {
/* 127 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 130 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 134 */           if (oOloioIlI001IO000 != null) {
/* 138 */               IIIIOo1ioiIO iIIIOo1ioiIO = new IIIIOo1ioiIO(1);
/* 141 */               iIIIOo1ioiIO.I00iiI = z;
/* 143 */               iIIIOo1ioiIO.I00iiO = str;
/* 145 */               iIIIOo1ioiIO.I00iio = o1ooiI111i;
/* 147 */               VarHandle.storeStoreFence();
/* 150 */               oOloioIlI001IO000.I0000O = iIIIOo1ioiIO;
                    }
                }
            }
