            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            
            public abstract class I0ioOOo1i0l1 {
                public static final OIo1i1 I00000oIO = iO01II.I00000oOI(0.0f, 0.0f, 16.0f, 7);
                public static final OIo1i1 I00000oOI = iO01II.I00000oOI(0.0f, 0.0f, 16.0f, 7);

                public static final void I00000oIO(IOii1l iOii1l, O1ooiI111i o1ooiI111i, IlliIl1l11O illiIl1l11O, IlliIl1l11O illiIl1l11O2, IlliIl1l11O illiIl1l11O3, OioOIi1o0I oioOIi1o0I, long j, long j2, long j3, long j4, long j5, IloI0lOlll1 iloI0lOlll1, int i) {
                    IOii1l iOii1l2;
                    OioOIi1o0I oioOIi1o0I2;
                    long j6;
                    O1ooiI111i o1ooiI111i2;
/* 24 */            iloI0lOlll1.I00i0O(1378716401);
/* 134 */           int i2 = i | 48 | (iloI0lOlll1.I000OOo1O(illiIl1l11O) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF) | (iloI0lOlll1.I000OOo1O(illiIl1l11O2) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E) | (iloI0lOlll1.I000OOo1O(illiIl1l11O3) ? 16384 : 8192) | (iloI0lOlll1.I000II(oioOIi1o0I) ? 131072 : 65536) | (iloI0lOlll1.I0001Ioi1lo(j) ? 1048576 : 524288) | (iloI0lOlll1.I0000O(0.0f) ? 8388608 : 4194304) | (iloI0lOlll1.I0001Ioi1lo(j2) ? 67108864 : 33554432) | (iloI0lOlll1.I0001Ioi1lo(j3) ? 536870912 : 268435456);
/* 168 */           int i3 = 0;
/* 187 */           if (iloI0lOlll1.I00OIl(i2 & 1, ((i2 & 306783379) == 306783378 && (((iloI0lOlll1.I0001Ioi1lo(j4) ? (char) 4 : (char) 2) | (iloI0lOlll1.I0001Ioi1lo(j5) ? ' ' : (char) 16)) & 19) == 18) ? false : true)) {
/* 191 */               I0io101i i0io101i = new I0io101i(i3);
/* 194 */               i0io101i.I00ilO0 = illiIl1l11O;
/* 196 */               i0io101i.I00io1l = illiIl1l11O2;
/* 198 */               i0io101i.I00ioIO = illiIl1l11O3;
/* 200 */               i0io101i.I00iiI = j3;
/* 202 */               i0io101i.I00iiO = j4;
/* 204 */               i0io101i.I00iio = j5;
/* 206 */               i0io101i.I00ilI0I1 = j2;
/* 210 */               i0io101i.I00l0I0l0lO1 = iOii1l;
/* 212 */               VarHandle.storeStoreFence();
/* 218 */               IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-652798794, i0io101i, iloI0lOlll1);
/* 222 */               int i4 = i2 >> 12;
/* 241 */               int i5 = (i4 & 896) | 12582918 | (i4 & 112) | ((i2 >> 9) & 57344);
/* 244 */               o1ooiI111i2 = O1ooIo101ll.I00000oIO;
/* 253 */               iOii1l2 = iOii1l;
/* 256 */               oioOIi1o0I2 = oioOIi1o0I;
/* 258 */               j6 = j;
/* 260 */               OlioioOl0O.I00000oIO(o1ooiI111i2, oioOIi1o0I2, j6, 0L, 0.0f, 0.0f, null, iOii1lI00000oOI, iloI0lOlll1, i5, 104);
                    } else {
/* 264 */               iOii1l2 = iOii1l;
/* 266 */               oioOIi1o0I2 = oioOIi1o0I;
/* 268 */               j6 = j;
/* 270 */               iloI0lOlll1.I00OilO00Il();
/* 273 */               o1ooiI111i2 = o1ooiI111i;
                    }
/* 275 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 279 */           if (oOloioIlI001IO000 != null) {
/* 283 */               I0io1OOil0 i0io1OOil0 = new I0io1OOil0();
/* 286 */               i0io1OOil0.I00iOIl = iOii1l2;
/* 288 */               i0io1OOil0.I00iiI = o1ooiI111i2;
/* 290 */               i0io1OOil0.I00iiO = illiIl1l11O;
/* 292 */               i0io1OOil0.I00iio = illiIl1l11O2;
/* 294 */               i0io1OOil0.I00ilI0I1 = illiIl1l11O3;
/* 296 */               i0io1OOil0.I00ilO0 = oioOIi1o0I2;
/* 298 */               i0io1OOil0.I00io1l = j6;
/* 302 */               i0io1OOil0.I00ioIO = j2;
/* 306 */               i0io1OOil0.I00l0I0l0lO1 = j3;
/* 310 */               i0io1OOil0.I00l0OO0IO = j4;
/* 314 */               i0io1OOil0.I00li1OI = j5;
/* 316 */               VarHandle.storeStoreFence();
/* 319 */               oOloioIlI001IO000.I0000O = i0io1OOil0;
                    }
                }

                public static final void I00000oOI(float f, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    O0iOOoiioO o0iOOoiioO;
/* 4 */             iloI0lOlll1.I00i0O(-917637668);
/* 30 */            int i2 = i | (iloI0lOlll1.I0000O(8.0f) ? 4 : 2) | (iloI0lOlll1.I0000O(f) ? 32 : 16);
/* 35 */            int i3 = 0;
/* 47 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 147) != 146)) {
/* 49 */                OlO1iIi1ol0 olO1iIi1ol0 = IOlO0o100i1i.I000o00OoI0I;
/* 55 */                O0iOOoiioO o0iOOoiioO2 = (O0iOOoiioO) iloI0lOlll1.I000iOII(olO1iIi1ol0);
/* 57 */                int iOrdinal = o0iOOoiioO2.ordinal();
/* 61 */                if (iOrdinal == 0) {
/* 72 */                    o0iOOoiioO = O0iOOoiioO.I00iiI;
                        } else {
/* 63 */                    if (iOrdinal != 1) {
/* 68 */                        I000II.I00000oIO();
/* 71 */                        return;
                            }
/* 65 */                    o0iOOoiioO = O0iOOoiioO.I00iOIl;
                        }
/* 74 */                OOiIo1lll oOiIo1lllI00000oIO = olO1iIi1ol0.I00000oIO(o0iOOoiioO);
/* 80 */                I0ilio1l i0ilio1l = new I0ilio1l();
/* 83 */                i0ilio1l.I00iOIl = f;
/* 85 */                i0ilio1l.I00iiI = o0iOOoiioO2;
/* 87 */                i0ilio1l.I00iiO = iOii1l;
/* 89 */                VarHandle.storeStoreFence();
/* 101 */               iiliio0o.I00000oIO(oOiIo1lllI00000oIO, iiioOl1O.I00000oOI(-1986402020, i0ilio1l, iloI0lOlll1), iloI0lOlll1, 56);
                    } else {
/* 105 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 108 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 112 */           if (oOloioIlI001IO000 != null) {
/* 116 */               I0ilioi0II i0ilioi0II = new I0ilioi0II(i3);
/* 119 */               i0ilioi0II.I00iiI = f;
/* 121 */               i0ilioi0II.I00iiO = iOii1l;
/* 123 */               VarHandle.storeStoreFence();
/* 126 */               oOloioIlI001IO000.I0000O = i0ilioi0II;
                    }
                }

                public static final void I0000Il00O(IllOOo00lI illOOo00lI, IOii1l iOii1l, O1ooiI111i o1ooiI111i, IlliIl1l11O illiIl1l11O, IlliIl1l11O illiIl1l11O2, IlliIl1l11O illiIl1l11O3, IlliIl1l11O illiIl1l11O4, OioOIi1o0I oioOIi1o0I, long j, long j2, long j3, long j4, Iii0io0OooO iii0io0OooO, IloI0lOlll1 iloI0lOlll1, int i, int i2) {
                    int i3;
                    long j5;
                    int i4;
                    IllOOo00lI illOOo00lI2;
                    IOii1l iOii1l2;
                    O1ooiI111i o1ooiI111i2;
                    IlliIl1l11O illiIl1l11O5;
                    Iii0io0OooO iii0io0OooO2;
                    int i5;
/* 1 */             iloI0lOlll1.I00i0O(-867616355);
                    if ((i & 6) == 0) {
                        i3 = (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | i;
                    } else {
                        i3 = i;
                    }
                    if ((i & 48) == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(iOii1l) ? 32 : 16;
                    }
                    int i6 = i & 384;
                    int i7 = Barcode.FORMAT_ITF;
                    if (i6 == 0) {
                        i3 |= iloI0lOlll1.I000II(o1ooiI111i) ? 256 : 128;
                    }
                    int i8 = i & 3072;
                    int i9 = Barcode.FORMAT_UPC_E;
                    if (i8 == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 2048 : 1024;
                    }
                    if ((i & 24576) == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(illiIl1l11O2) ? 16384 : 8192;
                    }
                    if ((196608 & i) == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(illiIl1l11O3) ? 131072 : 65536;
                    }
                    if ((1572864 & i) == 0) {
                        i3 |= iloI0lOlll1.I000OOo1O(illiIl1l11O4) ? 1048576 : 524288;
                    }
                    if ((12582912 & i) == 0) {
                        i3 |= iloI0lOlll1.I000II(oioOIi1o0I) ? 8388608 : 4194304;
                    }
                    if ((100663296 & i) == 0) {
                        i3 |= iloI0lOlll1.I0001Ioi1lo(j) ? 67108864 : 33554432;
                    }
                    if ((805306368 & i) == 0) {
                        i3 |= iloI0lOlll1.I0001Ioi1lo(j2) ? 536870912 : 268435456;
                    }
                    if ((i2 & 6) == 0) {
                        j5 = j3;
                        i4 = i2 | (iloI0lOlll1.I0001Ioi1lo(j5) ? 4 : 2);
                    } else {
                        j5 = j3;
                        i4 = i2;
                    }
                    if ((i2 & 48) == 0) {
                        i4 |= iloI0lOlll1.I0001Ioi1lo(j4) ? 32 : 16;
                    }
                    int i10 = i3;
                    if ((i2 & 384) == 0) {
                        if (iloI0lOlll1.I0000O(0.0f)) {
                            i7 = 256;
                        }
                        i4 |= i7;
                    }
                    if ((i2 & 3072) == 0) {
                        if (iloI0lOlll1.I000II(iii0io0OooO)) {
                            i9 = 2048;
                        }
                        i4 |= i9;
                    }
                    int i11 = i4;
                    if (iloI0lOlll1.I00OIl(i10 & 1, ((i10 & 306783379) == 306783378 && (i11 & 1171) == 1170) ? false : true)) {
/* 2 */                 I0ilOlOO10l i0ilOlOO10l = new I0ilOlOO10l();
                        i0ilOlOO10l.I00iOIl = illiIl1l11O2;
                        i0ilOlOO10l.I00iiI = illiIl1l11O3;
                        i0ilOlOO10l.I00iiO = illiIl1l11O4;
                        i0ilOlOO10l.I00iio = oioOIi1o0I;
                        i0ilOlOO10l.I00ilI0I1 = j;
                        i0ilOlOO10l.I00ilO0 = j2;
                        i0ilOlOO10l.I00io1l = j5;
                        i0ilOlOO10l.I00ioIO = j4;
                        iOii1l2 = iOii1l;
                        i0ilOlOO10l.I00l0I0l0lO1 = iOii1l2;
                        illiIl1l11O5 = illiIl1l11O;
                        i0ilOlOO10l.I00l0OO0IO = illiIl1l11O5;
                        VarHandle.storeStoreFence();
                        int i12 = (i10 & 14) | 3072 | ((i10 >> 3) & 112) | ((i11 >> 3) & 896);
                        illOOo00lI2 = illOOo00lI;
                        o1ooiI111i2 = o1ooiI111i;
                        iii0io0OooO2 = iii0io0OooO;
                        i5 = 0;
/* 3 */                 I0000O(illOOo00lI2, o1ooiI111i2, iii0io0OooO2, iiioOl1O.I00000oOI(527420759, i0ilOlOO10l, iloI0lOlll1), iloI0lOlll1, i12);
                    } else {
                        illOOo00lI2 = illOOo00lI;
                        iOii1l2 = iOii1l;
                        o1ooiI111i2 = o1ooiI111i;
                        illiIl1l11O5 = illiIl1l11O;
                        iii0io0OooO2 = iii0io0OooO;
                        i5 = 0;
/* 4 */                 iloI0lOlll1.I00OilO00Il();
                    }
/* 5 */             OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
                    if (oOloioIlI001IO000 != null) {
                        I0illi0 i0illi0 = new I0illi0(i5);
                        i0illi0.I00iiI = illOOo00lI2;
                        i0illi0.I00iiO = iOii1l2;
                        i0illi0.I00iio = o1ooiI111i2;
                        i0illi0.I00ilI0I1 = illiIl1l11O5;
                        i0illi0.I00ilO0 = illiIl1l11O2;
                        i0illi0.I00io1l = illiIl1l11O3;
                        i0illi0.I00ioIO = illiIl1l11O4;
                        i0illi0.I00l0I0l0lO1 = oioOIi1o0I;
                        i0illi0.I00l0OO0IO = j;
                        i0illi0.I00li1OI = j2;
                        i0illi0.I00ll1 = j3;
                        i0illi0.I00lli11 = j4;
                        i0illi0.I00lll10 = iii0io0OooO2;
                        i0illi0.I00o0iI0io1 = i;
                        i0illi0.I00o0l1o1o0 = i2;
                        VarHandle.storeStoreFence();
/* 6 */                 oOloioIlI001IO000.I0000O = i0illi0;
                    }
                }

                public static final void I0000O(IllOOo00lI illOOo00lI, O1ooiI111i o1ooiI111i, Iii0io0OooO iii0io0OooO, IOii1l iOii1l, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    IllOOo00lI illOOo00lI2;
                    Iii0io0OooO iii0io0OooO2;
                    IloI0lOlll1 iloI0lOlll12;
/* 4 */             iloI0lOlll1.I00i0O(24925658);
/* 9 */             if ((i & 6) == 0) {
/* 20 */                i2 = (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | i;
                    } else {
/* 22 */                i2 = i;
                    }
/* 25 */            if ((i & 48) == 0) {
/* 38 */                i2 |= iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16;
                    }
/* 41 */            if ((i & 384) == 0) {
/* 54 */                i2 |= iloI0lOlll1.I000II(iii0io0OooO) ? Barcode.FORMAT_QR_CODE : Barcode.FORMAT_ITF;
                    }
/* 57 */            if ((i & 3072) == 0) {
/* 70 */                i2 |= iloI0lOlll1.I000OOo1O(iOii1l) ? Barcode.FORMAT_PDF417 : Barcode.FORMAT_UPC_E;
                    }
/* 75 */            int i3 = 0;
/* 87 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 1171) != 1170)) {
/* 91 */                I0io01o i0io01o = new I0io01o(i3);
/* 94 */                i0io01o.I00iiI = o1ooiI111i;
/* 96 */                i0io01o.I00iiO = iOii1l;
/* 98 */                VarHandle.storeStoreFence();
/* 119 */               illOOo00lI2 = illOOo00lI;
/* 120 */               iii0io0OooO2 = iii0io0OooO;
/* 121 */               iloI0lOlll12 = iloI0lOlll1;
/* 122 */               iOIlI11IO.I00000oIO(illOOo00lI2, iii0io0OooO2, iiioOl1O.I00000oOI(784693091, i0io01o, iloI0lOlll1), iloI0lOlll12, (i2 & 14) | 384 | ((i2 >> 3) & 112), 0);
                    } else {
/* 126 */               illOOo00lI2 = illOOo00lI;
/* 127 */               iii0io0OooO2 = iii0io0OooO;
/* 128 */               iloI0lOlll12 = iloI0lOlll1;
/* 129 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 132 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 136 */           if (oOloioIlI001IO000 != null) {
/* 140 */               I0io0io i0io0io = new I0io0io(i3);
/* 143 */               i0io0io.I00ilI0I1 = illOOo00lI2;
/* 145 */               i0io0io.I00iiI = o1ooiI111i;
/* 147 */               i0io0io.I00ilO0 = iii0io0OooO2;
/* 149 */               i0io0io.I00iiO = iOii1l;
/* 151 */               i0io0io.I00iio = i;
/* 153 */               VarHandle.storeStoreFence();
/* 156 */               oOloioIlI001IO000.I0000O = i0io0io;
                    }
                }
            }
