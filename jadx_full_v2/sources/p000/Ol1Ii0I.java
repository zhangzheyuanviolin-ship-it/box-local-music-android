            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class Ol1Ii0I {
                public static final OIo1i1 I00000oIO = new OIo1i1(12.0f, 2.0f, 12.0f, 2.0f);

                /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
                /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(IllOOo00lI illOOo00lI, int i, IoiOolO1iOo ioiOolO1iOo, float f, boolean z, IloI0lOlll1 iloI0lOlll1, int i2, int i3) {
                    int i4;
                    IoiOolO1iOo ioiOolO1iOo2;
                    int i5;
                    float f2;
                    boolean z2;
                    IoiOolO1iOo ioiOolO1iOo3;
                    OOloioIl oOloioIlI001IO000;
/* 14 */            iloI0lOlll1.I00i0O(2122031213);
/* 19 */            if ((i2 & 6) == 0) {
/* 30 */                i4 = (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | i2;
                    } else {
/* 32 */                i4 = i2;
                    }
/* 35 */            if ((i2 & 48) == 0) {
/* 48 */                i4 |= iloI0lOlll1.I0000oI00(i) ? 32 : 16;
                    }
/* 49 */            int i6 = i3 & 4;
/* 51 */            if (i6 == 0) {
/* 60 */                if ((i2 & 384) == 0) {
/* 62 */                    ioiOolO1iOo2 = ioiOolO1iOo;
/* 75 */                    i4 |= iloI0lOlll1.I000II(ioiOolO1iOo2) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                        }
/* 79 */                i5 = i4 | 1797120;
/* 98 */                if (iloI0lOlll1.I00OIl(i5 & 1, (599187 & i5) == 599186)) {
/* 162 */                   iloI0lOlll1.I00OilO00Il();
/* 165 */                   f2 = f;
/* 167 */                   z2 = z;
/* 169 */                   ioiOolO1iOo3 = ioiOolO1iOo2;
                        } else {
/* 105 */                   ioiOolO1iOo3 = i6 != 0 ? null : ioiOolO1iOo2;
/* 110 */                   O1ooiI111i o1ooiI111iI000II = Ol0iOOO0.I000II(O1ooIo101ll.I00000oIO, 32.0f);
/* 116 */                   Ol1I1lIoO1 ol1I1lIoO1 = new Ol1I1lIoO1();
/* 119 */                   ol1I1lIoO1.I00iOIl = ioiOolO1iOo3;
/* 121 */                   f2 = 18.0f;
/* 123 */                   ol1I1lIoO1.I00iiI = 18.0f;
/* 125 */                   ol1I1lIoO1.I00iiO = i;
/* 127 */                   VarHandle.storeStoreFence();
/* 152 */                   z2 = true;
/* 158 */                   iOiO0o0oi.I0000Il00O(illOOo00lI, o1ooiI111iI000II, true, null, null, null, I00000oIO, iiioOl1O.I00000oOI(-1201784353, ol1I1lIoO1, iloI0lOlll1), iloI0lOlll1, (i5 & 14) | 817889328 | ((i5 >> 12) & 896), 376);
                        }
/* 170 */               oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 174 */               if (oOloioIlI001IO000 == null) {
/* 178 */                   Ol1I1oo ol1I1oo = new Ol1I1oo();
/* 181 */                   ol1I1oo.I00iOIl = illOOo00lI;
/* 183 */                   ol1I1oo.I00iiI = i;
/* 185 */                   ol1I1oo.I00iiO = ioiOolO1iOo3;
/* 187 */                   ol1I1oo.I00iio = f2;
/* 189 */                   ol1I1oo.I00ilI0I1 = z2;
/* 191 */                   ol1I1oo.I00ilO0 = i2;
/* 193 */                   ol1I1oo.I00io1l = i3;
/* 195 */                   VarHandle.storeStoreFence();
/* 198 */                   oOloioIlI001IO000.I0000O = ol1I1oo;
/* 1750 */                  return;
                        }
/* 1750 */              return;
                    }
/* 53 */            i4 |= 384;
/* 55 */            ioiOolO1iOo2 = ioiOolO1iOo;
/* 79 */            i5 = i4 | 1797120;
/* 98 */            if (iloI0lOlll1.I00OIl(i5 & 1, (599187 & i5) == 599186)) {
                    }
/* 170 */           oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 174 */           if (oOloioIlI001IO000 == null) {
                    }
                }
            }
