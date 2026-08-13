            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class ll1l0Iil0 {
                public static final void I00000oIO(ii1iOiO ii1ioio, String str, IllOOo00lI illOOo00lI, Function1 function1, boolean z, IloI0lOlll1 iloI0lOlll1, int i) {
/* 16 */            iloI0lOlll1.I00i0O(1046837766);
/* 66 */            int i2 = i | (true != iloI0lOlll1.I000OOo1O(ii1ioio) ? 2 : 4) | (true != iloI0lOlll1.I000II(str) ? 16 : 32) | (true != iloI0lOlll1.I000OOo1O(illOOo00lI) ? Barcode.FORMAT_ITF : Barcode.FORMAT_QR_CODE) | (true != iloI0lOlll1.I000O01llI0(z) ? 8192 : 16384);
/* 81 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 9363) != 9362)) {
/* 83 */                iloI0lOlll1.I00Ol00();
/* 88 */                if ((i & 1) != 0 && !iloI0lOlll1.I001lloI()) {
/* 96 */                    iloI0lOlll1.I00OilO00Il();
                        }
/* 99 */                iloI0lOlll1.I0010o();
/* 104 */               OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(ii1ioio.I0000O, iloI0lOlll1);
/* 112 */               II01l1Oii iI01l1Oii = new II01l1Oii(8);
/* 115 */               iI01l1Oii.I00iiI = str;
/* 117 */               iI01l1Oii.I00iiO = illOOo00lI;
/* 119 */               VarHandle.storeStoreFence();
/* 125 */               IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(911352778, iI01l1Oii, iloI0lOlll1);
/* 131 */               lo00ilio1Oi lo00ilio1oi = new lo00ilio1Oi();
/* 134 */               lo00ilio1oi.I00iOIl = z;
/* 136 */               lo00ilio1oi.I00iiI = function1;
/* 138 */               lo00ilio1oi.I00iiO = oI10i0IlI00000oOI;
/* 140 */               VarHandle.storeStoreFence();
/* 168 */               lO0l01iI0i.I00000oIO(null, iOii1lI00000oOI, null, null, null, 0, 0L, 0L, null, iiioOl1O.I00000oOI(-1349056427, lo00ilio1oi, iloI0lOlll1), iloI0lOlll1, 805306416, 509);
                    } else {
/* 172 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 175 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 179 */           if (oOloioIlI001IO000 != null) {
/* 183 */               loO1II loo1ii = new loO1II();
/* 186 */               loo1ii.I00iOIl = ii1ioio;
/* 188 */               loo1ii.I00iiI = str;
/* 190 */               loo1ii.I00iiO = illOOo00lI;
/* 192 */               loo1ii.I00iio = function1;
/* 194 */               loo1ii.I00ilI0I1 = z;
/* 196 */               VarHandle.storeStoreFence();
/* 199 */               oOloioIlI001IO000.I0000O = loo1ii;
                    }
                }
            }
