            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class ill0l1oiiO {
                public static final void I00000oIO(String str, O1ooiI111i o1ooiI111i, OlOO1i11110 olOO1i11110, String str2, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    String str3;
/* 10 */            iloI0lOlll1.I00i0O(666547344);
/* 16 */            if ((i & 6) == 0) {
/* 27 */                i2 = (iloI0lOlll1.I000II(str) ? 4 : 2) | i;
                    } else {
/* 29 */                i2 = i;
                    }
/* 47 */            int i3 = i2 | 48 | (iloI0lOlll1.I000II(olOO1i11110) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | 224256;
/* 55 */            int i4 = 1;
/* 66 */            if (iloI0lOlll1.I00OIl(i3 & 1, (74899 & i3) != 74898)) {
/* 78 */                long j = ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I00100o1O0lo;
/* 80 */                OIo1i1 oIo1i1 = Oo1oIoo01.I00000oIO;
/* 84 */                Oo1oI1il00o oo1oI1il00oI0000Il00O = Oo1oIoo01.I0000Il00O(IOOiio0i.I000lI, iloI0lOlll1);
/* 90 */                I0o0Il1OOlOI i0o0Il1OOlOI = new I0o0Il1OOlOI(i4);
/* 93 */                i0o0Il1OOlOI.I00iiO = str;
/* 95 */                i0o0Il1OOlOI.I00iiI = j;
/* 97 */                VarHandle.storeStoreFence();
/* 103 */               IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-1477960053, i0o0Il1OOlOI, iloI0lOlll1);
/* 111 */               I00oooO i00oooO = new I00oooO(22);
/* 114 */               i00oooO.I00iiI = olOO1i11110;
/* 116 */               VarHandle.storeStoreFence();
/* 122 */               IOii1l iOii1lI00000oOI2 = iiioOl1O.I00000oOI(45802569, i00oooO, iloI0lOlll1);
/* 130 */               IOioO0I01 iOioO0I01 = new IOioO0I01(24);
/* 133 */               VarHandle.storeStoreFence();
/* 139 */               IOii1l iOii1lI00000oOI3 = iiioOl1O.I00000oOI(-1762226560, iOioO0I01, iloI0lOlll1);
/* 148 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 153 */               I11i1lloiiO.I00000oIO(iOii1lI00000oOI, o1ooIo101ll, iOii1lI00000oOI2, iOii1lI00000oOI3, 0.0f, null, oo1oI1il00oI0000Il00O, null, iloI0lOlll1, 12586422, 304);
/* 156 */               str3 = "";
/* 159 */               o1ooiI111i = o1ooIo101ll;
                    } else {
/* 161 */               iloI0lOlll1.I00OilO00Il();
/* 164 */               str3 = str2;
                    }
/* 166 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 170 */           if (oOloioIlI001IO000 != null) {
/* 174 */               I0io0io i0io0io = new I0io0io(4);
/* 177 */               i0io0io.I00ilI0I1 = str;
/* 179 */               i0io0io.I00iiI = o1ooiI111i;
/* 181 */               i0io0io.I00ilO0 = olOO1i11110;
/* 183 */               i0io0io.I00iiO = str3;
/* 185 */               i0io0io.I00iio = i;
/* 187 */               VarHandle.storeStoreFence();
/* 190 */               oOloioIlI001IO000.I0000O = i0io0io;
                    }
                }
            }
