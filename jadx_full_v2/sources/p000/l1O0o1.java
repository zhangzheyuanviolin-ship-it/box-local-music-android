            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.database.Cursor;
            import android.graphics.Bitmap;
            import android.hardware.SensorManager;
            import android.net.Uri;
            import android.provider.MediaStore;
            import android.util.Log;
            import com.box.gallery.R;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.io.BufferedReader;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public abstract class l1O0o1 {
                /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(IllOOo00lI illOOo00lI, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 5 */             iloI0lOlll1.I00i0O(-844763004);
/* 12 */            if ((i & 6) == 0) {
/* 23 */                i2 = (iloI0lOlll1.I000OOo1O(illOOo00lI) ? 4 : 2) | i;
                    } else {
/* 25 */                i2 = i;
                    }
/* 28 */            int i3 = 1;
/* 41 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 3) != 2)) {
/* 47 */                O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 49 */                O1ooiI111i o1ooiI111iI00000oOI = iO0100loIol.I00000oOI(o1ooIo101ll, 10.0f, -10.0f);
/* 53 */                OiI111I oiI111I = OiI11O1i1.I00000oIO;
/* 55 */                O1ooiI111i o1ooiI111iI00000oIO = ii0OOOOo0i.I00000oIO(o1ooiI111iI00000oOI, oiI111I);
/* 59 */                OOiIOoiOO oOiIOoiOO = O1OoilIO.I00000oOI;
/* 89 */                O1ooiI111i o1ooiI111iI00000oIO2 = iOi0OiI.I00000oIO(i0I1I0.I00000oOI(o1ooiI111iI00000oIO, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(oOiIOoiOO)).I00000oIO.I00100l0, iO0ioilo.I00000oIO), 1.5f, ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(oOiIOoiOO)).I00000oIO.I001lIiIIo1O, oiI111I);
/* 99 */                boolean z = (i2 & 14) == 4;
/* 100 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 104 */               if (!z) {
                            Object obj = objI00O0i0ii;
/* 108 */                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 114 */                       I0O1OI i0o1oi = new I0O1OI(12);
/* 117 */                       i0o1oi.I00iiI = illOOo00lI;
/* 119 */                       VarHandle.storeStoreFence();
/* 122 */                       iloI0lOlll1.I00iio(i0o1oi);
                                obj = i0o1oi;
                            }
/* 130 */                   O1ooiI111i o1ooiI111iI00000oOI2 = i1Ioo1o0.I00000oOI(o1ooiI111iI00000oIO2, false, null, (IllOOo00lI) obj, 15);
/* 136 */                   O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 142 */                   int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 146 */                   OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 150 */                   O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oOI2);
/* 156 */                   IOl0oi0lOl1.I000lI.getClass();
/* 159 */                   iloI0lOlll1.I00i0oil();
/* 164 */                   if (iloI0lOlll1.I00O10llo) {
/* 168 */                       iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                            } else {
/* 172 */                       iloI0lOlll1.I00io1l();
                            }
/* 177 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 182 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 191 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 194 */                   li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 199 */                   li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 232 */                   IoOoiI1II00i.I00000oIO(ii100IiiOo0.I00000oIO(), lOOoli.I00000oOI(R.string.cd_delete_icon, iloI0lOlll1), Ol0iOOO0.I000lI(iO01II.I0001Ioi1lo(o1ooIo101ll, 3.0f), 16.0f), 0L, iloI0lOlll1, 384, 8);
/* 235 */                   iloI0lOlll1.I0010I0i(true);
                        }
                    } else {
/* 239 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 242 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 246 */           if (oOloioIlI001IO000 != null) {
/* 250 */               Il1iii01oI il1iii01oI = new Il1iii01oI(i3);
/* 253 */               il1iii01oI.I00iiI = illOOo00lI;
/* 255 */               il1iii01oI.I00iiO = i;
/* 257 */               VarHandle.storeStoreFence();
/* 260 */               oOloioIlI001IO000.I0000O = il1iii01oI;
                    }
                }

                public static final void I00000oOI(OloIl1l1oOii oloIl1l1oOii, O1ol100o0O o1ol100o0O, String str, boolean z, boolean z2, int i, boolean z3, int i2, Function1 function1, Function1 function12, boolean z4, IllOOo00lI illOOo00lI, IllOOo00lI illOOo00lI2, Function1 function13, Function1 function14, IllOOo00lI illOOo00lI3, Function1 function15, Function1 function16, boolean z5, boolean z6, boolean z7, boolean z8, IllOOo00lI illOOo00lI4, boolean z9, boolean z10, IllOOo00lI illOOo00lI5, boolean z11, IllOOo00lI illOOo00lI6, boolean z12, IllOOo00lI illOOo00lI7, IloI0lOlll1 iloI0lOlll1, int i3, int i4, int i5, int i6) {
                    int i7;
                    int i8;
                    int i9;
                    int i10;
                    OloIl1l1oOii oloIl1l1oOii2;
                    O1ol100o0O o1ol100o0O2;
                    int i11;
                    boolean z13;
                    Function1 function17;
                    String str2;
                    boolean z14;
                    IloI0lOlll1 iloI0lOlll12;
                    boolean z15;
                    OI10i0Il oI10i0Il;
                    OI10i0Il oI10i0Il2;
                    Object obj;
                    Object iOOllI0o;
                    Function1 function18;
                    Ol010000lo00 ol010000lo00;
                    final Ii0110 ii0110;
                    OI10i0Il oI10i0Il3;
                    IOioOOi0I iOioOOi0I;
                    IOioOOi0I iOioOOi0I2;
                    IOioOOi0I iOioOOi0I3;
                    IOioOOi0I iOioOOi0I4;
                    OI10i0Il oI10i0Il4;
                    Io1I0l io1I0l;
                    boolean z16;
                    OI10i0Il oI10i0Il5;
                    OI10i0Il oI10i0Il6;
                    OI10i0Il oI10i0Il7;
                    OI10i0Il oI10i0Il8;
                    OI10i0Il oI10i0Il9;
                    OilIoI11 oilIoI11;
                    OI10i0Il oI10i0Il10;
                    int i12;
                    II0O01li0 iI0O01li0;
                    OI10i0Il oI10i0Il11;
                    OI10i0Il oI10i0Il12;
                    final int i13;
                    O1OIi1 o1OIi1;
                    OI10i0Il oI10i0Il13;
                    OI10i0Il oI10i0Il14;
                    Function1 function19;
                    Ii0110 ii01102;
                    OI10i0Il oI10i0Il15;
                    O1ooIo101ll o1ooIo101ll;
                    OI10i0Il oI10i0Il16;
                    OI10i0Il oI10i0Il17;
                    float f;
                    int i14 = i2;
                    II0O01li0 iI0O01li02 = i1O01oOIoI0I.I00ilI0I1;
                    IOioOOi0I iOioOOi0I5 = lolOiIoiillI.I00ilI0I1;
                    IOioOOi0I iOioOOi0I6 = lolOiIoiillI.I00ioIO;
                    IOioOOi0I iOioOOi0I7 = lolOiIoiillI.I00ilO0;
                    IOioOOi0I iOioOOi0I8 = lolOiIoiillI.I00io1l;
/* 1 */             iloI0lOlll1.I00i0O(1022514633);
                    if ((i3 & 6) == 0) {
                        i7 = i3 | (iloI0lOlll1.I000OOo1O(oloIl1l1oOii) ? 4 : 2);
                    } else {
                        i7 = i3;
                    }
                    if ((i3 & 48) == 0) {
                        i7 |= iloI0lOlll1.I000OOo1O(o1ol100o0O) ? 32 : 16;
                    }
                    int i15 = i3 & 384;
                    int i16 = Barcode.FORMAT_ITF;
                    if (i15 == 0) {
                        i7 |= iloI0lOlll1.I000II(str) ? 256 : 128;
                    }
                    int i17 = i3 & 3072;
                    int i18 = Barcode.FORMAT_UPC_E;
                    if (i17 == 0) {
                        i7 |= iloI0lOlll1.I000O01llI0(z) ? 2048 : 1024;
                    }
                    if ((i3 & 24576) == 0) {
                        i7 |= iloI0lOlll1.I000O01llI0(z2) ? 16384 : 8192;
                    }
                    if ((i3 & 196608) == 0) {
                        i7 |= iloI0lOlll1.I0000oI00(i) ? 131072 : 65536;
                    }
                    if ((i3 & 1572864) == 0) {
                        i7 |= iloI0lOlll1.I0000oI00(0) ? 1048576 : 524288;
                    }
                    if ((i3 & 12582912) == 0) {
                        i7 |= iloI0lOlll1.I000O01llI0(z3) ? 8388608 : 4194304;
                    }
                    if ((i3 & 100663296) == 0) {
                        i7 |= iloI0lOlll1.I0000oI00(i14) ? 67108864 : 33554432;
                    }
                    if ((i3 & 805306368) == 0) {
                        i7 |= iloI0lOlll1.I000OOo1O(function1) ? 536870912 : 268435456;
                    }
                    if ((i4 & 6) == 0) {
                        i8 = i4 | (iloI0lOlll1.I000OOo1O(function12) ? 4 : 2);
                    } else {
                        i8 = i4;
                    }
                    if ((i4 & 48) == 0) {
                        i8 |= iloI0lOlll1.I000O01llI0(z4) ? 32 : 16;
                    }
                    if ((i4 & 3072) == 0) {
                        i8 |= iloI0lOlll1.I000OOo1O(illOOo00lI2) ? 2048 : 1024;
                    }
                    if ((i4 & 24576) == 0) {
                        i8 |= iloI0lOlll1.I000OOo1O(function13) ? 16384 : 8192;
                    }
                    if ((i4 & 196608) == 0) {
                        i8 |= iloI0lOlll1.I000OOo1O(function14) ? 131072 : 65536;
                    }
                    if ((i4 & 1572864) == 0) {
                        i8 |= iloI0lOlll1.I000OOo1O(illOOo00lI3) ? 1048576 : 524288;
                    }
                    if ((i4 & 12582912) == 0) {
                        i8 |= iloI0lOlll1.I000OOo1O(function15) ? 8388608 : 4194304;
                    }
                    if ((i4 & 100663296) == 0) {
                        i8 |= iloI0lOlll1.I000OOo1O(function16) ? 67108864 : 33554432;
                    }
                    if ((i5 & 6) == 0) {
                        i9 = i5 | (iloI0lOlll1.I000O01llI0(z5) ? 4 : 2);
                    } else {
                        i9 = i5;
                    }
                    if ((i5 & 48) == 0) {
                        i9 |= iloI0lOlll1.I000O01llI0(z6) ? 32 : 16;
                    }
                    if ((i5 & 384) == 0) {
                        if (iloI0lOlll1.I000O01llI0(z7)) {
                            i16 = 256;
                        }
                        i9 |= i16;
                    }
                    if ((i5 & 3072) == 0) {
                        if (iloI0lOlll1.I000O01llI0(z8)) {
                            i18 = 2048;
                        }
                        i9 |= i18;
                    }
                    if ((i5 & 24576) == 0) {
                        i9 |= iloI0lOlll1.I000OOo1O(illOOo00lI4) ? 16384 : 8192;
                    }
                    if ((i5 & 196608) == 0) {
                        i9 |= iloI0lOlll1.I000O01llI0(z9) ? 131072 : 65536;
                    }
                    if ((i5 & 1572864) == 0) {
                        i9 |= iloI0lOlll1.I000O01llI0(z10) ? 1048576 : 524288;
                    }
                    if ((i5 & 12582912) == 0) {
                        i9 |= iloI0lOlll1.I000OOo1O(illOOo00lI5) ? 8388608 : 4194304;
                    }
                    if ((i5 & 100663296) == 0) {
                        i9 |= iloI0lOlll1.I000O01llI0(z11) ? 67108864 : 33554432;
                    }
                    if ((i5 & 805306368) == 0) {
                        i9 |= iloI0lOlll1.I000OOo1O(illOOo00lI6) ? 536870912 : 268435456;
                    }
                    if ((i6 & 6) == 0) {
                        i10 = i6 | (iloI0lOlll1.I000O01llI0(z12) ? 4 : 2);
                    } else {
                        i10 = i6;
                    }
                    if ((i6 & 48) == 0) {
                        i10 |= iloI0lOlll1.I000OOo1O(illOOo00lI7) ? 32 : 16;
                    }
                    if (iloI0lOlll1.I00OIl(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 38347795) == 38347794 && (i9 & 306783379) == 306783378 && (i10 & 19) == 18) ? false : true)) {
/* 4 */                 final Context context = (Context) iloI0lOlll1.I000iOII(I0lloOI0oio.I00000oOI);
/* 7 */                 O0oiOi o0oiOi = (O0oiOi) iloI0lOlll1.I000iOII(O11looOii.I00000oIO);
/* 8 */                 Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 9 */                 Object obj2 = IOl11li.I00000oIO;
                        if (objI00O0i0ii == obj2) {
/* 10 */                    objI00O0i0ii = iIO0iiOiOl0l.I000II(iloI0lOlll1);
/* 11 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 12 */                Ii0110 ii01103 = (Ii0110) objI00O0i0ii;
/* 14 */                OI10i0Il oI10i0IlI00000oOI = lOIoiooI1i01.I00000oOI(o1ol100o0O.I000OOo1O, iloI0lOlll1);
/* 17 */                Io1I0l io1I0l2 = (Io1I0l) iloI0lOlll1.I000iOII(IOlO0o100i1i.I000l1);
/* 18 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        int i19 = 6;
                        if (objI00O0i0ii2 == obj2) {
/* 19 */                    Ii1liIllli0 ii1liIllli0 = o1ol100o0O.I0000Il00O;
/* 20 */                    ii1liIllli0.getClass();
/* 24 */                    objI00O0i0ii2 = (Boolean) iOi1IOoIO0l.I00000oIO(Il00o11.I00iOIl, new Ii1l100(ii1liIllli0, null, i19));
                            objI00O0i0ii2.getClass();
/* 25 */                    iloI0lOlll1.I00iio(objI00O0i0ii2);
                        }
/* 26 */                boolean zBooleanValue = ((Boolean) objI00O0i0ii2).booleanValue();
/* 27 */                Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        if (objI00O0i0ii3 == obj2) {
/* 29 */                    objI00O0i0ii3 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 30 */                    iloI0lOlll1.I00iio(objI00O0i0ii3);
                        }
/* 31 */                OI10i0Il oI10i0Il18 = (OI10i0Il) objI00O0i0ii3;
/* 32 */                Object objI00O0i0ii4 = iloI0lOlll1.I00O0i0ii();
                        if (objI00O0i0ii4 == obj2) {
/* 34 */                    objI00O0i0ii4 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 35 */                    iloI0lOlll1.I00iio(objI00O0i0ii4);
                        }
/* 36 */                OI10i0Il oI10i0Il19 = (OI10i0Il) objI00O0i0ii4;
/* 37 */                Object objI00O0i0ii5 = iloI0lOlll1.I00O0i0ii();
                        if (objI00O0i0ii5 == obj2) {
/* 39 */                    objI00O0i0ii5 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 40 */                    iloI0lOlll1.I00iio(objI00O0i0ii5);
                        }
/* 41 */                OI10i0Il oI10i0Il20 = (OI10i0Il) objI00O0i0ii5;
/* 42 */                Ol010000lo00 ol010000lo00I00000oOI = l1OloIOiO01.I00000oOI(6, 2, iloI0lOlll1);
/* 43 */                Object objI00O0i0ii6 = iloI0lOlll1.I00O0i0ii();
                        if (objI00O0i0ii6 == obj2) {
/* 45 */                    objI00O0i0ii6 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 46 */                    iloI0lOlll1.I00iio(objI00O0i0ii6);
                        }
/* 47 */                OI10i0Il oI10i0Il21 = (OI10i0Il) objI00O0i0ii6;
/* 48 */                Ol010000lo00 ol010000lo00I00000oOI2 = l1OloIOiO01.I00000oOI(6, 2, iloI0lOlll1);
/* 49 */                Object objI00O0i0ii7 = iloI0lOlll1.I00O0i0ii();
/* 50 */                Il01100l il01100l = Il01100l.I00iOIl;
                        if (objI00O0i0ii7 == obj2) {
/* 51 */                    objI00O0i0ii7 = lOO00IiI0li.I00000oIO(il01100l);
/* 52 */                    iloI0lOlll1.I00iio(objI00O0i0ii7);
                        }
/* 53 */                OI10i0Il oI10i0Il22 = (OI10i0Il) objI00O0i0ii7;
/* 54 */                Object objI00O0i0ii8 = iloI0lOlll1.I00O0i0ii();
                        if (objI00O0i0ii8 == obj2) {
/* 55 */                    objI00O0i0ii8 = lOO00IiI0li.I00000oIO(il01100l);
/* 56 */                    iloI0lOlll1.I00iio(objI00O0i0ii8);
                        }
/* 57 */                OI10i0Il oI10i0Il23 = (OI10i0Il) objI00O0i0ii8;
/* 58 */                Object objI00O0i0ii9 = iloI0lOlll1.I00O0i0ii();
                        if (objI00O0i0ii9 == obj2) {
/* 60 */                    objI00O0i0ii9 = lOO00IiI0li.I00000oIO(Boolean.FALSE);
/* 61 */                    iloI0lOlll1.I00iio(objI00O0i0ii9);
                        }
/* 62 */                OI10i0Il oI10i0Il24 = (OI10i0Il) objI00O0i0ii9;
/* 63 */                Object objI00O0i0ii10 = iloI0lOlll1.I00O0i0ii();
                        if (objI00O0i0ii10 == obj2) {
/* 65 */                    OilIoI11 oilIoI112 = new OilIoI11();
                            oI10i0Il = oI10i0Il22;
/* 66 */                    SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                            oilIoI112.I00iOIl = sensorManager;
                            oI10i0Il2 = oI10i0Il19;
/* 67 */                    oilIoI112.I00iiI = sensorManager.getDefaultSensor(1);
/* 68 */                    VarHandle.storeStoreFence();
/* 69 */                    iloI0lOlll1.I00iio(oilIoI112);
                            obj = oilIoI112;
                        } else {
                            oI10i0Il = oI10i0Il22;
                            oI10i0Il2 = oI10i0Il19;
                            obj = objI00O0i0ii10;
                        }
/* 70 */                OilIoI11 oilIoI113 = (OilIoI11) obj;
/* 71 */                Object objI00O0i0ii11 = iloI0lOlll1.I00O0i0ii();
                        if (objI00O0i0ii11 == obj2) {
/* 72 */                    objI00O0i0ii11 = lOO00IiI0li.I00000oIO(null);
/* 73 */                    iloI0lOlll1.I00iio(objI00O0i0ii11);
                        }
/* 74 */                OI10i0Il oI10i0Il25 = (OI10i0Il) objI00O0i0ii11;
                        boolean zI000II = ((i7 & 458752) == 131072) | iloI0lOlll1.I000II(oI10i0IlI00000oOI) | iloI0lOlll1.I000OOo1O(ii01103) | ((i9 & 57344) == 16384);
/* 76 */                Object objI00O0i0ii12 = iloI0lOlll1.I00O0i0ii();
                        if (zI000II || objI00O0i0ii12 == obj2) {
                            function18 = function15;
                            ol010000lo00 = ol010000lo00I00000oOI2;
                            ii0110 = ii01103;
                            oI10i0Il3 = oI10i0Il25;
                            iloI0lOlll12 = iloI0lOlll1;
                            iOioOOi0I = iOioOOi0I5;
                            iOioOOi0I2 = iOioOOi0I6;
                            iOioOOi0I3 = iOioOOi0I7;
                            iOioOOi0I4 = iOioOOi0I8;
                            oI10i0Il4 = oI10i0Il18;
                            io1I0l = io1I0l2;
                            z16 = zBooleanValue;
                            oI10i0Il5 = oI10i0Il23;
                            oI10i0Il6 = oI10i0Il21;
                            oI10i0Il7 = oI10i0Il24;
                            oI10i0Il8 = oI10i0Il;
                            oI10i0Il9 = oI10i0Il2;
                            oilIoI11 = oilIoI113;
                            oI10i0Il10 = oI10i0IlI00000oOI;
                            i12 = 1048576;
                            iI0O01li0 = iI0O01li02;
/* 77 */                    iOOllI0o = new IOOllI0o(i, ii0110, oI10i0Il10, oI10i0Il8, illOOo00lI4);
/* 78 */                    iloI0lOlll12.I00iio(iOOllI0o);
                        } else {
                            function18 = function15;
                            ol010000lo00 = ol010000lo00I00000oOI2;
                            iOOllI0o = objI00O0i0ii12;
                            oI10i0Il3 = oI10i0Il25;
                            iloI0lOlll12 = iloI0lOlll1;
                            iOioOOi0I = iOioOOi0I5;
                            iOioOOi0I2 = iOioOOi0I6;
                            iOioOOi0I3 = iOioOOi0I7;
                            iOioOOi0I4 = iOioOOi0I8;
                            oI10i0Il4 = oI10i0Il18;
                            io1I0l = io1I0l2;
                            z16 = zBooleanValue;
                            oI10i0Il5 = oI10i0Il23;
                            oI10i0Il6 = oI10i0Il21;
                            oI10i0Il7 = oI10i0Il24;
                            oI10i0Il8 = oI10i0Il;
                            oI10i0Il9 = oI10i0Il2;
                            oilIoI11 = oilIoI113;
                            oI10i0Il10 = oI10i0IlI00000oOI;
                            i12 = 1048576;
                            ii0110 = ii01103;
                            iI0O01li0 = iI0O01li02;
                        }
/* 79 */                final Function1 function110 = (Function1) iOOllI0o;
                        OI10i0Il oI10i0Il26 = oI10i0Il10;
                        boolean z17 = (i7 & 3670016) == i12;
/* 80 */                Object objI00O0i0ii13 = iloI0lOlll12.I00O0i0ii();
                        if (z17 || objI00O0i0ii13 == obj2) {
/* 81 */                    objI00O0i0ii13 = new O1i0lolo(oI10i0Il5, 1);
/* 82 */                    iloI0lOlll12.I00iio(objI00O0i0ii13);
                        }
/* 83 */                final Function1 function111 = (Function1) objI00O0i0ii13;
/* 84 */                boolean zI000OOo1O = iloI0lOlll12.I000OOo1O(context);
/* 85 */                Object objI00O0i0ii14 = iloI0lOlll12.I00O0i0ii();
                        if (zI000OOo1O || objI00O0i0ii14 == obj2) {
/* 86 */                    objI00O0i0ii14 = new O00lOIIO(context, oI10i0Il7, null, 11);
/* 87 */                    iloI0lOlll12.I00iio(objI00O0i0ii14);
                        }
/* 88 */                iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii14, iloI0lOlll12, OoiIlOl1iI.I00000oIO);
/* 89 */                List list = (List) oI10i0Il8.getValue();
                        boolean z18 = (i8 & 29360128) == 8388608;
/* 90 */                Object objI00O0i0ii15 = iloI0lOlll12.I00O0i0ii();
                        if (z18 || objI00O0i0ii15 == obj2) {
                            oI10i0Il11 = oI10i0Il7;
/* 91 */                    objI00O0i0ii15 = new O11OIIooi(function18, oI10i0Il8, null, 2);
/* 92 */                    iloI0lOlll12.I00iio(objI00O0i0ii15);
                        } else {
                            oI10i0Il11 = oI10i0Il7;
                        }
/* 93 */                iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii15, iloI0lOlll12, list);
/* 94 */                List list2 = (List) oI10i0Il5.getValue();
                        boolean z19 = (i8 & 234881024) == 67108864;
/* 95 */                Object objI00O0i0ii16 = iloI0lOlll12.I00O0i0ii();
                        if (z19 || objI00O0i0ii16 == obj2) {
/* 96 */                    objI00O0i0ii16 = new O11OIIooi(function16, oI10i0Il5, null, 1);
/* 97 */                    iloI0lOlll12.I00iio(objI00O0i0ii16);
                        }
/* 98 */                iIO0iiOiOl0l.I0000O((IlliIl1l11O) objI00O0i0ii16, iloI0lOlll12, list2);
/* 100 */               I0IIiOoi1i i0IIiOoi1i = new I0IIiOoi1i(5);
/* 101 */               Object objI00O0i0ii17 = iloI0lOlll12.I00O0i0ii();
                        if (objI00O0i0ii17 == obj2) {
/* 102 */                   objI00O0i0ii17 = new I0IoiIiOoi(oI10i0Il4, oI10i0Il20);
/* 103 */                   iloI0lOlll12.I00iio(objI00O0i0ii17);
                        }
/* 104 */               O1OIi1 o1OIi1I00000oIO = iOI1O1I1O.I00000oIO(i0IIiOoi1i, (Function1) objI00O0i0ii17, iloI0lOlll12, 48);
                        boolean z20 = (i8 & 57344) == 16384;
/* 105 */               Object objI00O0i0ii18 = iloI0lOlll12.I00O0i0ii();
                        if (z20 || objI00O0i0ii18 == obj2) {
                            oI10i0Il12 = oI10i0Il6;
/* 106 */                   objI00O0i0ii18 = new I0O0Ol110O(function13, oI10i0Il4, oI10i0Il12);
/* 107 */                   iloI0lOlll12.I00iio(objI00O0i0ii18);
                        } else {
                            oI10i0Il12 = oI10i0Il6;
                        }
/* 108 */               IllOOo00lI illOOo00lI8 = (IllOOo00lI) objI00O0i0ii18;
/* 110 */               I0IIiOoi1i i0IIiOoi1i2 = new I0IIiOoi1i(5);
/* 111 */               boolean zI000II2 = iloI0lOlll12.I000II(illOOo00lI8);
/* 112 */               Object objI00O0i0ii19 = iloI0lOlll12.I00O0i0ii();
                        if (zI000II2 || objI00O0i0ii19 == obj2) {
/* 113 */                   objI00O0i0ii19 = new I11i0ol0l0(illOOo00lI8);
/* 114 */                   iloI0lOlll12.I00iio(objI00O0i0ii19);
                        }
                        OI10i0Il oI10i0Il27 = oI10i0Il12;
/* 115 */               O1OIi1 o1OIi1I00000oIO2 = iOI1O1I1O.I00000oIO(i0IIiOoi1i2, (Function1) objI00O0i0ii19, iloI0lOlll12, 0);
/* 117 */               int pickImagesMaxLimit = MediaStore.getPickImagesMaxLimit();
/* 118 */               I0IIio1oOiO i0IIio1oOiO = new I0IIio1oOiO();
/* 119 */               i0IIio1oOiO.I00000oIO = pickImagesMaxLimit;
                        if (pickImagesMaxLimit <= 1) {
/* 389 */                   I000II.I000iOII("Max items must be higher than 1");
                            throw null;
                        }
/* 120 */               VarHandle.storeStoreFence();
                        boolean zI000OOo1O2 = iloI0lOlll12.I000OOo1O(ii0110) | iloI0lOlll12.I000OOo1O(context) | iloI0lOlll12.I000II(function110);
/* 121 */               Object objI00O0i0ii20 = iloI0lOlll12.I00O0i0ii();
                        if (zI000OOo1O2 || objI00O0i0ii20 == obj2) {
                            i13 = 0;
/* 122 */                   objI00O0i0ii20 = new Function1() {
                                @Override
                                public final Object invoke(Object obj3) {
                                    Intent intent;
                                    Uri data;
/* 3 */                             int i20 = i13;
/* 5 */                             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 8 */                             Ii0110 ii01104 = ii0110;
                                    switch (i20) {
                                        case 0:
/* 57 */                                    List list3 = (List) obj3;
/* 66 */                                    if (!list3.isEmpty()) {
/* 68 */                                        IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 84 */                                        iOi1II01i0.I0000O(ii01104, Ii1oo1ooill0.I00iiI, null, new I0O0il1iIl(context, list3, function110, (IOoil1iiIilo) null, 23), 2);
                                                break;
                                            }
                                            break;
                                        default:
/* 15 */                                    I0IIOOO1O i0iiooo1o = (I0IIOOO1O) obj3;
/* 20 */                                    if (i0iiooo1o.I00iOIl == -1 && (intent = i0iiooo1o.I00iiI) != null && (data = intent.getData()) != null) {
/* 32 */                                        data.toString();
/* 35 */                                        IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 51 */                                        iOi1II01i0.I0000O(ii01104, Ii1oo1ooill0.I00iiI, null, new I0O0il1iIl(context, data, function110, (IOoil1iiIilo) null, 24), 2);
                                                break;
                                            }
                                            break;
                                    }
/* 54 */                            return ooiIlOl1iI;
                                }
                            };
/* 123 */                   iloI0lOlll12.I00iio(objI00O0i0ii20);
                        } else {
                            i13 = 0;
                        }
/* 124 */               O1OIi1 o1OIi1I00000oIO3 = iOI1O1I1O.I00000oIO(i0IIio1oOiO, (Function1) objI00O0i0ii20, iloI0lOlll12, i13);
/* 126 */               I0IIiOoi1i i0IIiOoi1i3 = new I0IIiOoi1i(6);
/* 127 */               boolean zI000OOo1O3 = iloI0lOlll12.I000OOo1O(ii0110) | iloI0lOlll12.I000OOo1O(context) | iloI0lOlll12.I000II(function111);
/* 128 */               Object objI00O0i0ii21 = iloI0lOlll12.I00O0i0ii();
                        if (zI000OOo1O3 || objI00O0i0ii21 == obj2) {
                            final int i20 = 1;
/* 129 */                   objI00O0i0ii21 = new Function1() {
                                @Override
                                public final Object invoke(Object obj3) {
                                    Intent intent;
                                    Uri data;
/* 3 */                             int i202 = i20;
/* 5 */                             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 8 */                             Ii0110 ii01104 = ii0110;
                                    switch (i202) {
                                        case 0:
/* 57 */                                    List list3 = (List) obj3;
/* 66 */                                    if (!list3.isEmpty()) {
/* 68 */                                        IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 84 */                                        iOi1II01i0.I0000O(ii01104, Ii1oo1ooill0.I00iiI, null, new I0O0il1iIl(context, list3, function111, (IOoil1iiIilo) null, 23), 2);
                                                break;
                                            }
                                            break;
                                        default:
/* 15 */                                    I0IIOOO1O i0iiooo1o = (I0IIOOO1O) obj3;
/* 20 */                                    if (i0iiooo1o.I00iOIl == -1 && (intent = i0iiooo1o.I00iiI) != null && (data = intent.getData()) != null) {
/* 32 */                                        data.toString();
/* 35 */                                        IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 51 */                                        iOi1II01i0.I0000O(ii01104, Ii1oo1ooill0.I00iiI, null, new I0O0il1iIl(context, data, function111, (IOoil1iiIilo) null, 24), 2);
                                                break;
                                            }
                                            break;
                                    }
/* 54 */                            return ooiIlOl1iI;
                                }
                            };
/* 130 */                   iloI0lOlll12.I00iio(objI00O0i0ii21);
                        }
/* 132 */               O1OIi1 o1OIi1I00000oIO4 = iOI1O1I1O.I00000oIO(i0IIiOoi1i3, (Function1) objI00O0i0ii21, iloI0lOlll12, 0);
/* 134 */               I0IIiOoi1i i0IIiOoi1i4 = new I0IIiOoi1i(6);
/* 135 */               boolean zI000OOo1O4 = iloI0lOlll12.I000OOo1O(ii0110) | iloI0lOlll12.I000OOo1O(context);
/* 136 */               Object objI00O0i0ii22 = iloI0lOlll12.I00O0i0ii();
                        if (zI000OOo1O4 || objI00O0i0ii22 == obj2) {
                            o1OIi1 = o1OIi1I00000oIO4;
                            oI10i0Il13 = oI10i0Il3;
/* 137 */                   objI00O0i0ii22 = new IloOl0lo1o11(ii0110, context, oI10i0Il13);
/* 138 */                   iloI0lOlll12.I00iio(objI00O0i0ii22);
                        } else {
                            o1OIi1 = o1OIi1I00000oIO4;
                            oI10i0Il13 = oI10i0Il3;
                        }
/* 140 */               O1OIi1 o1OIi1I00000oIO5 = iOI1O1I1O.I00000oIO(i0IIiOoi1i4, (Function1) objI00O0i0ii22, iloI0lOlll12, 0);
                        OilIoI11 oilIoI114 = oilIoI11;
/* 141 */               boolean zI000OOo1O5 = iloI0lOlll12.I000OOo1O(o0oiOi) | iloI0lOlll12.I000OOo1O(oilIoI114);
/* 142 */               Object objI00O0i0ii23 = iloI0lOlll12.I00O0i0ii();
                        if (zI000OOo1O5 || objI00O0i0ii23 == obj2) {
/* 143 */                   objI00O0i0ii23 = new O1lIIi(o0oiOi, oilIoI114);
/* 144 */                   iloI0lOlll12.I00iio(objI00O0i0ii23);
                        }
/* 145 */               iIO0iiOiOl0l.I00000oOI(o0oiOi, (Function1) objI00O0i0ii23, iloI0lOlll12);
/* 148 */               IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0iI0io1, iloI0lOlll12, 0);
/* 149 */               int iHashCode = Long.hashCode(iilI1O0il0.I00000oOI(iloI0lOlll12));
/* 150 */               OO0lO0l0 oO0lO0l0I001lIiIIo1O = iloI0lOlll12.I001lIiIIo1O();
/* 151 */               O1ooIo101ll o1ooIo101ll2 = O1ooIo101ll.I00000oIO;
                        O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooIo101ll2);
/* 152 */               IOl0oi0lOl1.I000lI.getClass();
/* 153 */               iloI0lOlll12.I00i0oil();
/* 154 */               boolean zI00II0oii1o = iloI0lOlll12.I00II0oii1o();
                        IllOOo00lI illOOo00lI9 = O0iiOioolIi.I01101IOlO;
                        if (zI00II0oii1o) {
/* 155 */                   iloI0lOlll12.I000l1(illOOo00lI9);
                        } else {
/* 156 */                   iloI0lOlll12.I00io1l();
                        }
                        IOioOOi0I iOioOOi0I9 = iOioOOi0I4;
/* 157 */               li01Ooiio01.I0000Il00O(iOioOOi0I9, iloI0lOlll12, iOOlo1O01OI00000oIO);
                        IOioOOi0I iOioOOi0I10 = iOioOOi0I3;
/* 158 */               li01Ooiio01.I0000Il00O(iOioOOi0I10, iloI0lOlll12, oO0lO0l0I001lIiIIo1O);
                        IOioOOi0I iOioOOi0I11 = iOioOOi0I2;
/* 159 */               IIl001iO0Io.I001IIilI0O(iHashCode, iloI0lOlll12, iOioOOi0I11, iloI0lOlll12);
                        IOioOOi0I iOioOOi0I12 = iOioOOi0I;
/* 160 */               li01Ooiio01.I0000Il00O(iOioOOi0I12, iloI0lOlll12, o1ooiI111iI0000Il00O);
/* 162 */               if (((List) oI10i0Il8.getValue()).isEmpty() && ((List) oI10i0Il5.getValue()).isEmpty() && ((OIoi0IIoi) oI10i0Il13.getValue()) == null) {
/* 166 */                   iloI0lOlll12.I00i01iIIliI(1019634831);
                            iloI0lOlll12.I001IIilI0O();
                            oI10i0Il14 = oI10i0Il4;
                            ii01102 = ii0110;
                            o1ooIo101ll = o1ooIo101ll2;
                            function19 = function111;
                            oI10i0Il16 = oI10i0Il5;
                            oI10i0Il17 = oI10i0Il13;
                            oI10i0Il15 = oI10i0Il8;
                        } else {
/* 167 */                   iloI0lOlll12.I00i01iIIliI(1016726845);
                            oI10i0Il14 = oI10i0Il4;
/* 3 */                     O1ooiI111i o1ooiI111iI00000oIO = iO0l10O.I00000oIO(Ol0iOOO0.I0000oI00(o1ooIo101ll2, 1.0f), iO0l10O.I00000oOI(iloI0lOlll12));
                            function19 = function111;
/* 171 */                   OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00(16.0f), i1O01oOIoI0I.I00ll1, iloI0lOlll12, 6);
/* 172 */                   int iHashCode2 = Long.hashCode(iilI1O0il0.I00000oOI(iloI0lOlll12));
/* 173 */                   OO0lO0l0 oO0lO0l0I001lIiIIo1O2 = iloI0lOlll12.I001lIiIIo1O();
/* 174 */                   O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI00000oIO);
/* 175 */                   iloI0lOlll12.I00i0oil();
/* 176 */                   if (iloI0lOlll12.I00II0oii1o()) {
/* 177 */                       iloI0lOlll12.I000l1(illOOo00lI9);
                            } else {
/* 178 */                       iloI0lOlll12.I00io1l();
                            }
/* 179 */                   li01Ooiio01.I0000Il00O(iOioOOi0I9, iloI0lOlll12, oiI1iiIl1Oi0I00000oIO);
/* 180 */                   li01Ooiio01.I0000Il00O(iOioOOi0I10, iloI0lOlll12, oO0lO0l0I001lIiIIo1O2);
/* 181 */                   IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll12, iOioOOi0I11, iloI0lOlll12);
/* 182 */                   li01Ooiio01.I0000Il00O(iOioOOi0I12, iloI0lOlll12, o1ooiI111iI0000Il00O2);
/* 183 */                   lOO1OIO00.I00000oIO(iloI0lOlll12, Ol0iOOO0.I00100o1O0lo(o1ooIo101ll2, 16.0f));
/* 184 */                   iloI0lOlll12.I00i01iIIliI(254956006);
/* 186 */                   Iterator it = ((List) oI10i0Il8.getValue()).iterator();
                            while (it.hasNext()) {
                                Bitmap bitmap = (Bitmap) it.next();
                                Iterator it2 = it;
                                II0O01li0 iI0O01li03 = iI0O01li0;
/* 187 */                       O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(iI0O01li03, false);
/* 188 */                       int iHashCode3 = Long.hashCode(iilI1O0il0.I00000oOI(iloI0lOlll12));
                                Ii0110 ii01104 = ii0110;
/* 189 */                       OO0lO0l0 oO0lO0l0I001lIiIIo1O3 = iloI0lOlll12.I001lIiIIo1O();
                                OI10i0Il oI10i0Il28 = oI10i0Il13;
/* 190 */                       O1ooiI111i o1ooiI111iI0000Il00O3 = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooIo101ll2);
/* 191 */                       IOl0oi0lOl1.I000lI.getClass();
/* 192 */                       iloI0lOlll12.I00i0oil();
/* 193 */                       if (iloI0lOlll12.I00II0oii1o()) {
/* 194 */                           iloI0lOlll12.I000l1(illOOo00lI9);
                                } else {
/* 195 */                           iloI0lOlll12.I00io1l();
                                }
/* 196 */                       li01Ooiio01.I0000Il00O(iOioOOi0I9, iloI0lOlll12, o1iOIl0o10I0000Il00O);
/* 197 */                       li01Ooiio01.I0000Il00O(iOioOOi0I10, iloI0lOlll12, oO0lO0l0I001lIiIIo1O3);
/* 198 */                       IIl001iO0Io.I001IIilI0O(iHashCode3, iloI0lOlll12, iOioOOi0I11, iloI0lOlll12);
/* 199 */                       li01Ooiio01.I0000Il00O(iOioOOi0I12, iloI0lOlll12, o1ooiI111iI0000Il00O3);
                                IOioOOi0I iOioOOi0I13 = iOioOOi0I12;
/* 210 */                       ioO0II.I00000oOI(new I0oO00o(bitmap), lOOoli.I00000oOI(R.string.cd_image_thumbnail, iloI0lOlll12), iOi0OiI.I00000oIO(ii0OOOOo0i.I00000oIO(lOI11ilO.I00000oIO(Ol0iOOO0.I000II(o1ooIo101ll2, 80.0f), 2.0f, OiI11O1i1.I00000oOI(8.0f), 0L, 28), OiI11O1i1.I00000oOI(8.0f)), 1.0f, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I001lIiIIo1O, OiI11O1i1.I00000oOI(8.0f)), null, iloI0lOlll1, 0, 248);
                                iloI0lOlll12 = iloI0lOlll1;
/* 211 */                       boolean zI000OOo1O6 = iloI0lOlll12.I000OOo1O(bitmap);
/* 212 */                       Object objI00O0i0ii24 = iloI0lOlll12.I00O0i0ii();
                                if (zI000OOo1O6 || objI00O0i0ii24 == obj2) {
/* 213 */                           objI00O0i0ii24 = new O1l110o(1, oI10i0Il8, bitmap);
/* 214 */                           iloI0lOlll12.I00iio(objI00O0i0ii24);
                                }
/* 215 */                       I00000oIO((IllOOo00lI) objI00O0i0ii24, iloI0lOlll12, 0);
/* 216 */                       iloI0lOlll12.I00111O();
                                iI0O01li0 = iI0O01li03;
                                iOioOOi0I12 = iOioOOi0I13;
                                it = it2;
                                ii0110 = ii01104;
                                oI10i0Il13 = oI10i0Il28;
                            }
                            OI10i0Il oI10i0Il29 = oI10i0Il13;
                            IOioOOi0I iOioOOi0I14 = iOioOOi0I12;
                            ii01102 = ii0110;
                            II0O01li0 iI0O01li04 = iI0O01li0;
/* 217 */                   iloI0lOlll12.I001IIilI0O();
/* 218 */                   iloI0lOlll12.I00i01iIIliI(254976654);
/* 220 */                   Iterator it3 = ((List) oI10i0Il5.getValue()).iterator();
                            int i21 = 0;
                            while (it3.hasNext()) {
                                int i22 = i21 + 1;
                                I1i1lO11OOO i1i1lO11OOO = (I1i1lO11OOO) it3.next();
                                Iterator it4 = it3;
/* 221 */                       O1iOIl0o10 o1iOIl0o10I0000Il00O2 = II1oOI10.I0000Il00O(iI0O01li04, false);
/* 222 */                       int iHashCode4 = Long.hashCode(iilI1O0il0.I00000oOI(iloI0lOlll12));
/* 223 */                       OO0lO0l0 oO0lO0l0I001lIiIIo1O4 = iloI0lOlll12.I001lIiIIo1O();
                                IOioOOi0I iOioOOi0I15 = iOioOOi0I14;
/* 224 */                       O1ooiI111i o1ooiI111iI0000Il00O4 = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooIo101ll2);
/* 225 */                       IOl0oi0lOl1.I000lI.getClass();
/* 226 */                       iloI0lOlll12.I00i0oil();
/* 227 */                       if (iloI0lOlll12.I00II0oii1o()) {
/* 228 */                           iloI0lOlll12.I000l1(illOOo00lI9);
                                } else {
/* 229 */                           iloI0lOlll12.I00io1l();
                                }
/* 230 */                       li01Ooiio01.I0000Il00O(iOioOOi0I9, iloI0lOlll12, o1iOIl0o10I0000Il00O2);
/* 231 */                       li01Ooiio01.I0000Il00O(iOioOOi0I10, iloI0lOlll12, oO0lO0l0I001lIiIIo1O4);
/* 232 */                       IIl001iO0Io.I001IIilI0O(iHashCode4, iloI0lOlll12, iOioOOi0I11, iloI0lOlll12);
/* 233 */                       li01Ooiio01.I0000Il00O(iOioOOi0I15, iloI0lOlll12, o1ooiI111iI0000Il00O4);
                                O1ooIo101ll o1ooIo101ll3 = o1ooIo101ll2;
/* 235 */                       O1ooiI111i o1ooiI111iI00000oIO2 = ii0OOOOo0i.I00000oIO(lOI11ilO.I00000oIO(o1ooIo101ll3, 2.0f, OiI11O1i1.I00000oOI(8.0f), 0L, 28), OiI11O1i1.I00000oOI(8.0f));
/* 236 */                       OOiIOoiOO oOiIOoiOO = O1OoilIO.I00000oOI;
                                OI10i0Il oI10i0Il30 = oI10i0Il5;
                                II0O01li0 iI0O01li05 = iI0O01li04;
/* 240 */                       O1ooiI111i o1ooiI111iI0000Il00O5 = i0I1I0.I0000Il00O(o1ooiI111iI00000oIO2, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(oOiIOoiOO)).I00000oIO.I00100l0);
                                OI10i0Il oI10i0Il31 = oI10i0Il8;
/* 244 */                       O1ooiI111i o1ooiI111iI00000oIO3 = iOi0OiI.I00000oIO(o1ooiI111iI0000Il00O5, 1.0f, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(oOiIOoiOO)).I00000oIO.I001lIiIIo1O, OiI11O1i1.I00000oOI(8.0f));
/* 246 */                       O1iOIl0o10 o1iOIl0o10I0000Il00O3 = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 247 */                       int iHashCode5 = Long.hashCode(iilI1O0il0.I00000oOI(iloI0lOlll12));
/* 248 */                       OO0lO0l0 oO0lO0l0I001lIiIIo1O5 = iloI0lOlll12.I001lIiIIo1O();
/* 249 */                       O1ooiI111i o1ooiI111iI0000Il00O6 = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI00000oIO3);
/* 250 */                       iloI0lOlll12.I00i0oil();
/* 251 */                       if (iloI0lOlll12.I00II0oii1o()) {
/* 252 */                           iloI0lOlll12.I000l1(illOOo00lI9);
                                } else {
/* 253 */                           iloI0lOlll12.I00io1l();
                                }
/* 254 */                       li01Ooiio01.I0000Il00O(iOioOOi0I9, iloI0lOlll12, o1iOIl0o10I0000Il00O3);
/* 255 */                       li01Ooiio01.I0000Il00O(iOioOOi0I10, iloI0lOlll12, oO0lO0l0I001lIiIIo1O5);
/* 256 */                       IIl001iO0Io.I001IIilI0O(iHashCode5, iloI0lOlll12, iOioOOi0I11, iloI0lOlll12);
/* 257 */                       li01Ooiio01.I0000Il00O(iOioOOi0I15, iloI0lOlll12, o1ooiI111iI0000Il00O6);
/* 261 */                       iOOOloIOiI0.I00000oOI(i1i1lO11OOO.I00000oIO, i1i1lO11OOO.I00000oOI, iO01II.I000OiO(o1ooIo101ll3, 0.0f, 0.0f, 16.0f, 0.0f, 11), false, iloI0lOlll12, 3456, 16);
/* 262 */                       iloI0lOlll12.I00111O();
/* 263 */                       boolean zI0000oI00 = iloI0lOlll12.I0000oI00(i21);
/* 264 */                       Object objI00O0i0ii25 = iloI0lOlll12.I00O0i0ii();
                                if (zI0000oI00 || objI00O0i0ii25 == obj2) {
/* 265 */                           objI00O0i0ii25 = new O1lIIliooi(oI10i0Il30, i21);
/* 266 */                           iloI0lOlll12.I00iio(objI00O0i0ii25);
                                }
/* 267 */                       I00000oIO((IllOOo00lI) objI00O0i0ii25, iloI0lOlll12, 0);
/* 268 */                       iloI0lOlll12.I00111O();
                                oI10i0Il8 = oI10i0Il31;
                                o1ooIo101ll2 = o1ooIo101ll3;
                                oI10i0Il5 = oI10i0Il30;
                                i21 = i22;
                                iI0O01li04 = iI0O01li05;
                                iOioOOi0I14 = iOioOOi0I15;
                                it3 = it4;
                            }
                            II0O01li0 iI0O01li06 = iI0O01li04;
                            oI10i0Il15 = oI10i0Il8;
                            o1ooIo101ll = o1ooIo101ll2;
                            iOioOOi0I12 = iOioOOi0I14;
                            oI10i0Il16 = oI10i0Il5;
/* 269 */                   iloI0lOlll12.I001IIilI0O();
/* 270 */                   OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) oI10i0Il29.getValue();
                            if (oIoi0IIoi == null) {
/* 271 */                       iloI0lOlll12.I00i01iIIliI(-684684824);
/* 272 */                       iloI0lOlll12.I001IIilI0O();
                                f = 16.0f;
                                oI10i0Il17 = oI10i0Il29;
                            } else {
/* 273 */                       iloI0lOlll12.I00i01iIIliI(-684684823);
/* 275 */                       String str3 = (String) oIoi0IIoi.I00iOIl;
/* 276 */                       O1iOIl0o10 o1iOIl0o10I0000Il00O4 = II1oOI10.I0000Il00O(iI0O01li06, false);
/* 277 */                       int iHashCode6 = Long.hashCode(iilI1O0il0.I00000oOI(iloI0lOlll12));
/* 278 */                       OO0lO0l0 oO0lO0l0I001lIiIIo1O6 = iloI0lOlll12.I001lIiIIo1O();
/* 279 */                       O1ooiI111i o1ooiI111iI0000Il00O7 = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooIo101ll);
/* 280 */                       IOl0oi0lOl1.I000lI.getClass();
/* 281 */                       iloI0lOlll12.I00i0oil();
/* 282 */                       if (iloI0lOlll12.I00II0oii1o()) {
/* 283 */                           iloI0lOlll12.I000l1(illOOo00lI9);
                                } else {
/* 284 */                           iloI0lOlll12.I00io1l();
                                }
/* 285 */                       li01Ooiio01.I0000Il00O(iOioOOi0I9, iloI0lOlll12, o1iOIl0o10I0000Il00O4);
/* 286 */                       li01Ooiio01.I0000Il00O(iOioOOi0I10, iloI0lOlll12, oO0lO0l0I001lIiIIo1O6);
/* 287 */                       IIl001iO0Io.I001IIilI0O(iHashCode6, iloI0lOlll12, iOioOOi0I11, iloI0lOlll12);
/* 288 */                       li01Ooiio01.I0000Il00O(iOioOOi0I12, iloI0lOlll12, o1ooiI111iI0000Il00O7);
/* 290 */                       O1ooiI111i o1ooiI111iI00000oIO4 = ii0OOOOo0i.I00000oIO(lOI11ilO.I00000oIO(o1ooIo101ll, 2.0f, OiI11O1i1.I00000oOI(8.0f), 0L, 28), OiI11O1i1.I00000oOI(8.0f));
/* 291 */                       OOiIOoiOO oOiIOoiOO2 = O1OoilIO.I00000oOI;
/* 300 */                       O1ooiI111i o1ooiI111iI000II = iO01II.I000II(iOi0OiI.I00000oIO(i0I1I0.I0000Il00O(o1ooiI111iI00000oIO4, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(oOiIOoiOO2)).I00000oIO.I00100l0), 1.0f, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(oOiIOoiOO2)).I00000oIO.I001lIiIIo1O, OiI11O1i1.I00000oOI(8.0f)), 12.0f, 8.0f);
/* 303 */                       OiI1iiIl1Oi0 oiI1iiIl1Oi0I00000oIO2 = OiI1iOo.I00000oIO(I1IiooiI1IlO.I0000oI00(6.0f), i1O01oOIoI0I.I00lli11, iloI0lOlll12, 54);
/* 304 */                       int iHashCode7 = Long.hashCode(iilI1O0il0.I00000oOI(iloI0lOlll12));
/* 305 */                       OO0lO0l0 oO0lO0l0I001lIiIIo1O7 = iloI0lOlll12.I001lIiIIo1O();
/* 306 */                       O1ooiI111i o1ooiI111iI0000Il00O8 = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI000II);
/* 307 */                       iloI0lOlll12.I00i0oil();
/* 308 */                       if (iloI0lOlll12.I00II0oii1o()) {
/* 309 */                           iloI0lOlll12.I000l1(illOOo00lI9);
                                } else {
/* 310 */                           iloI0lOlll12.I00io1l();
                                }
/* 311 */                       li01Ooiio01.I0000Il00O(iOioOOi0I9, iloI0lOlll12, oiI1iiIl1Oi0I00000oIO2);
/* 312 */                       li01Ooiio01.I0000Il00O(iOioOOi0I10, iloI0lOlll12, oO0lO0l0I001lIiIIo1O7);
/* 313 */                       IIl001iO0Io.I001IIilI0O(iHashCode7, iloI0lOlll12, iOioOOi0I11, iloI0lOlll12);
/* 314 */                       li01Ooiio01.I0000Il00O(iOioOOi0I12, iloI0lOlll12, o1ooiI111iI0000Il00O8);
/* 320 */                       IoOoiI1II00i.I00000oIO(iOOOOI.I00000oIO(), null, Ol0iOOO0.I000lI(o1ooIo101ll, 18.0f), ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(oOiIOoiOO2)).I00000oIO.I00000oIO, iloI0lOlll12, 432, 0);
/* 324 */                       Oo0i1oIIoOO.I00000oOI(str3, null, 0L, null, 0L, null, null, null, 0L, null, 0L, 2, false, 1, 0, null, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(oOiIOoiOO2)).I00000oOI.I000l1, iloI0lOlll12, 0, 24960, 110590);
/* 325 */                       iloI0lOlll12.I00111O();
/* 326 */                       Object objI00O0i0ii26 = iloI0lOlll12.I00O0i0ii();
                                if (objI00O0i0ii26 == obj2) {
                                    oI10i0Il17 = oI10i0Il29;
/* 327 */                           objI00O0i0ii26 = new O0loollioliO(oI10i0Il17, 25);
/* 328 */                           iloI0lOlll12.I00iio(objI00O0i0ii26);
                                } else {
                                    oI10i0Il17 = oI10i0Il29;
                                }
/* 329 */                       I00000oIO((IllOOo00lI) objI00O0i0ii26, iloI0lOlll12, 6);
/* 330 */                       iloI0lOlll12.I00111O();
/* 331 */                       iloI0lOlll12.I001IIilI0O();
                                f = 16.0f;
                            }
/* 332 */                   lOO1OIO00.I00000oIO(iloI0lOlll12, Ol0iOOO0.I00100o1O0lo(o1ooIo101ll, f));
/* 333 */                   iloI0lOlll12.I00111O();
/* 334 */                   iloI0lOlll12.I001IIilI0O();
                        }
/* 335 */               II0O01li0 iI0O01li07 = i1O01oOIoI0I.I00io1l;
/* 336 */               O1ooiI111i o1ooiI111iI000OOo1O = Ol0iOOO0.I000OOo1O(o1ooIo101ll, 76.0f, 0.0f, 2);
/* 337 */               O1iOIl0o10 o1iOIl0o10I0000Il00O5 = II1oOI10.I0000Il00O(iI0O01li07, false);
/* 338 */               int iHashCode8 = Long.hashCode(iilI1O0il0.I00000oOI(iloI0lOlll12));
/* 339 */               OO0lO0l0 oO0lO0l0I001lIiIIo1O8 = iloI0lOlll12.I001lIiIIo1O();
/* 340 */               O1ooiI111i o1ooiI111iI0000Il00O9 = iilOllOlO1.I0000Il00O(iloI0lOlll12, o1ooiI111iI000OOo1O);
/* 341 */               IOl0oi0lOl1.I000lI.getClass();
/* 342 */               iloI0lOlll12.I00i0oil();
/* 343 */               if (iloI0lOlll12.I00II0oii1o()) {
/* 344 */                   iloI0lOlll12.I000l1(illOOo00lI9);
                        } else {
/* 345 */                   iloI0lOlll12.I00io1l();
                        }
/* 346 */               li01Ooiio01.I0000Il00O(iOioOOi0I9, iloI0lOlll12, o1iOIl0o10I0000Il00O5);
/* 347 */               li01Ooiio01.I0000Il00O(iOioOOi0I10, iloI0lOlll12, oO0lO0l0I001lIiIIo1O8);
/* 348 */               IIl001iO0Io.I001IIilI0O(iHashCode8, iloI0lOlll12, iOioOOi0I11, iloI0lOlll12);
/* 349 */               li01Ooiio01.I0000Il00O(iOioOOi0I12, iloI0lOlll12, o1ooiI111iI0000Il00O9);
/* 351 */               Boolean boolValueOf = Boolean.valueOf(((Boolean) oI10i0Il27.getValue()).booleanValue());
                        O1lIIoo0o o1lIIoo0o = new O1lIIoo0o();
                        oloIl1l1oOii2 = oloIl1l1oOii;
                        o1lIIoo0o.I00iOIl = oloIl1l1oOii2;
                        o1lIIoo0o.I00iiI = function14;
                        o1lIIoo0o.I00iiO = ii01102;
                        o1lIIoo0o.I00iio = function19;
                        o1lIIoo0o.I00ilI0I1 = ol010000lo00;
                        o1lIIoo0o.I00ilO0 = function13;
                        str2 = str;
                        o1lIIoo0o.I00io1l = str2;
                        o1lIIoo0o.I00ioIO = function1;
                        i14 = i2;
                        o1lIIoo0o.I00l0I0l0lO1 = i14;
                        o1lIIoo0o.I00l0OO0IO = z5;
                        o1lIIoo0o.I00li1OI = illOOo00lI3;
                        z14 = z2;
                        o1lIIoo0o.I00ll1 = z14;
                        OI10i0Il oI10i0Il32 = oI10i0Il15;
                        z15 = z;
                        o1lIIoo0o.I00lli11 = z15;
                        z13 = z3;
                        o1lIIoo0o.I00lll10 = z13;
                        o1lIIoo0o.I00o0iI0io1 = oI10i0Il14;
                        o1lIIoo0o.I00o0l1o1o0 = z6;
                        i11 = i;
                        o1lIIoo0o.I00o101lO = i11;
                        o1lIIoo0o.I00oI0i = illOOo00lI4;
                        o1lIIoo0o.I00oII = context;
                        o1lIIoo0o.I00oIiI10 = o1OIi1I00000oIO;
                        o1lIIoo0o.I00oO101o = o1OIi1I00000oIO3;
                        o1lIIoo0o.I00oOio10iI1 = z7;
                        o1lIIoo0o.I00ol1 = illOOo00lI8;
                        o1lIIoo0o.I00olI = o1OIi1I00000oIO2;
                        o1lIIoo0o.I00oli = o1OIi1;
                        o1lIIoo0o.I00oliIiO01i = z9;
                        o1lIIoo0o.I00oo1iO0ll = o1OIi1I00000oIO5;
                        o1lIIoo0o.I00ooIo0 = oI10i0Il26;
                        o1lIIoo0o.I00ooiO1I = oI10i0Il32;
                        o1lIIoo0o.I00oooO = oI10i0Il20;
                        o1lIIoo0o.I0100i = oI10i0Il16;
                        OI10i0Il oI10i0Il33 = oI10i0Il9;
                        o1lIIoo0o.I0100o111I = oI10i0Il33;
                        o1lIIoo0o.I010101Oo1lO = illOOo00lI5;
                        o1lIIoo0o.I010I0 = z10;
                        o1lIIoo0o.I010II = illOOo00lI6;
                        o1lIIoo0o.I010OIo1l = z11;
                        o1lIIoo0o.I010i10l = illOOo00lI7;
                        o1lIIoo0o.I010iIIOlo = z12;
                        o1lIIoo0o.I010ioo = z8;
                        o1lIIoo0o.I010l10O = z4;
                        o1lIIoo0o.I010l1O = illOOo00lI2;
                        o1lIIoo0o.I010l1ol111 = io1I0l;
                        function17 = function12;
                        o1lIIoo0o.I010lI0oi = function17;
                        o1lIIoo0o.I010o0o0oO = oI10i0Il17;
                        o1lIIoo0o.I010oio1OO0 = z16;
                        o1lIIoo0o.I01101IOlO = oI10i0Il27;
                        VarHandle.storeStoreFence();
                        O1OIIoio0i1.I00000oOI(boolValueOf, null, null, null, null, null, iiioOl1O.I00000oOI(-390738454, o1lIIoo0o, iloI0lOlll12), iloI0lOlll12, 1572864, 62);
/* 352 */               iloI0lOlll12.I00111O();
/* 353 */               iloI0lOlll12.I00111O();
/* 354 */               if (((Boolean) oI10i0Il33.getValue()).booleanValue()) {
/* 355 */                   iloI0lOlll12.I00i01iIIliI(1854996878);
/* 357 */                   List list3 = ((O1oiOloOo) oI10i0Il26.getValue()).I000O01llI0;
                            o1ol100o0O2 = o1ol100o0O;
/* 358 */                   boolean zI000OOo1O7 = ((i8 & 14) == 4) | iloI0lOlll12.I000OOo1O(o1ol100o0O2);
/* 359 */                   Object objI00O0i0ii27 = iloI0lOlll12.I00O0i0ii();
                            if (zI000OOo1O7 || objI00O0i0ii27 == obj2) {
/* 360 */                       objI00O0i0ii27 = new I0O1IO(function17, o1ol100o0O2, oI10i0Il32, oI10i0Il16);
/* 361 */                       iloI0lOlll12.I00iio(objI00O0i0ii27);
                            }
/* 362 */                   Function1 function112 = (Function1) objI00O0i0ii27;
/* 363 */                   boolean zI000OOo1O8 = iloI0lOlll12.I000OOo1O(o1ol100o0O2);
/* 364 */                   Object objI00O0i0ii28 = iloI0lOlll12.I00O0i0ii();
                            if (zI000OOo1O8 || objI00O0i0ii28 == obj2) {
/* 365 */                       objI00O0i0ii28 = new O0l0IlolloIO(o1ol100o0O2);
/* 366 */                       iloI0lOlll12.I00iio(objI00O0i0ii28);
                            }
/* 367 */                   Function1 function113 = (Function1) objI00O0i0ii28;
/* 368 */                   boolean zI000OOo1O9 = iloI0lOlll12.I000OOo1O(o1ol100o0O2);
/* 369 */                   Object objI00O0i0ii29 = iloI0lOlll12.I00O0i0ii();
                            if (zI000OOo1O9 || objI00O0i0ii29 == obj2) {
/* 370 */                       objI00O0i0ii29 = new Io1o0l0iOl(o1ol100o0O2);
/* 371 */                       iloI0lOlll12.I00iio(objI00O0i0ii29);
                            }
/* 372 */                   IllOOo00lI illOOo00lI10 = (IllOOo00lI) objI00O0i0ii29;
/* 373 */                   Object objI00O0i0ii30 = iloI0lOlll12.I00O0i0ii();
                            if (objI00O0i0ii30 == obj2) {
/* 374 */                       objI00O0i0ii30 = new O0loollioliO(oI10i0Il33, 21);
/* 375 */                       iloI0lOlll12.I00iio(objI00O0i0ii30);
                            }
/* 377 */                   lOlOl1o.I00000oOI(list3, function112, function113, illOOo00lI10, (IllOOo00lI) objI00O0i0ii30, iloI0lOlll12, 24576);
                            iloI0lOlll12.I001IIilI0O();
                        } else {
                            o1ol100o0O2 = o1ol100o0O;
/* 378 */                   iloI0lOlll12.I00i01iIIliI(1855657209);
                            iloI0lOlll12.I001IIilI0O();
                        }
/* 379 */               if (((Boolean) oI10i0Il20.getValue()).booleanValue()) {
/* 380 */                   iloI0lOlll12.I00i01iIIliI(1855894855);
/* 381 */                   Object objI00O0i0ii31 = iloI0lOlll12.I00O0i0ii();
                            if (objI00O0i0ii31 == obj2) {
/* 382 */                       objI00O0i0ii31 = new O0loollioliO(oI10i0Il20, 22);
/* 383 */                       iloI0lOlll12.I00iio(objI00O0i0ii31);
                            }
/* 386 */                   l1OloIOiO01.I00000oIO((IllOOo00lI) objI00O0i0ii31, null, ol010000lo00I00000oOI, 0.0f, false, null, 0L, 0L, 0L, null, null, null, iiioOl1O.I00000oOI(-2051332711, new I1o0Il1lli1i(ii01102, ol010000lo00I00000oOI, oilIoI114, function110, oI10i0Il20, oI10i0Il11), iloI0lOlll12), iloI0lOlll12, 6, 3072, 8186);
/* 387 */                   iloI0lOlll12.I001IIilI0O();
                        } else {
/* 388 */                   iloI0lOlll12.I00i01iIIliI(1862093305);
                            iloI0lOlll12.I001IIilI0O();
                        }
                    } else {
                        oloIl1l1oOii2 = oloIl1l1oOii;
                        o1ol100o0O2 = o1ol100o0O;
                        i11 = i;
                        z13 = z3;
                        function17 = function12;
                        str2 = str;
                        z14 = z2;
                        iloI0lOlll12 = iloI0lOlll1;
                        z15 = z;
/* 390 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 391 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
                    if (oOloioIlI001IO000 != null) {
                        O1l1ll0O00Ii o1l1ll0O00Ii = new O1l1ll0O00Ii();
                        o1l1ll0O00Ii.I00iOIl = oloIl1l1oOii2;
                        o1l1ll0O00Ii.I00iiI = o1ol100o0O2;
                        o1l1ll0O00Ii.I00iiO = str2;
                        o1l1ll0O00Ii.I00iio = z15;
                        o1l1ll0O00Ii.I00ilI0I1 = z14;
                        o1l1ll0O00Ii.I00ilO0 = i11;
                        o1l1ll0O00Ii.I00io1l = z13;
                        o1l1ll0O00Ii.I00ioIO = i14;
                        o1l1ll0O00Ii.I00l0I0l0lO1 = function1;
                        o1l1ll0O00Ii.I00l0OO0IO = function17;
                        o1l1ll0O00Ii.I00li1OI = z4;
                        o1l1ll0O00Ii.I00ll1 = illOOo00lI;
                        o1l1ll0O00Ii.I00lli11 = illOOo00lI2;
                        o1l1ll0O00Ii.I00lll10 = function13;
                        o1l1ll0O00Ii.I00o0iI0io1 = function14;
                        o1l1ll0O00Ii.I00o0l1o1o0 = illOOo00lI3;
                        o1l1ll0O00Ii.I00o101lO = function15;
                        o1l1ll0O00Ii.I00oI0i = function16;
                        o1l1ll0O00Ii.I00oII = z5;
                        o1l1ll0O00Ii.I00oIiI10 = z6;
                        o1l1ll0O00Ii.I00oO101o = z7;
                        o1l1ll0O00Ii.I00oOio10iI1 = z8;
                        o1l1ll0O00Ii.I00ol1 = illOOo00lI4;
                        o1l1ll0O00Ii.I00olI = z9;
                        o1l1ll0O00Ii.I00oli = z10;
                        o1l1ll0O00Ii.I00oliIiO01i = illOOo00lI5;
                        o1l1ll0O00Ii.I00oo1iO0ll = z11;
                        o1l1ll0O00Ii.I00ooIo0 = illOOo00lI6;
                        o1l1ll0O00Ii.I00ooiO1I = z12;
                        o1l1ll0O00Ii.I00oooO = illOOo00lI7;
                        o1l1ll0O00Ii.I0100i = i3;
                        o1l1ll0O00Ii.I0100o111I = i4;
                        o1l1ll0O00Ii.I010101Oo1lO = i5;
                        o1l1ll0O00Ii.I010I0 = i6;
                        VarHandle.storeStoreFence();
                        oOloioIlI001IO000.I0000oI00(o1l1ll0O00Ii);
                    }
                }

                public static final void I0000Il00O(OI10i0Il oI10i0Il, boolean z) {
/* 5 */             oI10i0Il.setValue(Boolean.valueOf(z));
                }

                public static final void I0000O(OI10i0Il oI10i0Il, O0oiOi o0oiOi, OOIIOiolI oOIIOiolI, Ioi1Io1o ioi1Io1o, OIooi1iOiOol oIooi1iOiOol, OI10i0Il oI10i0Il2) {
/* 5 */             OOIl1Io0 oOIl1Io0 = (OOIl1Io0) oI10i0Il.getValue();
/* 7 */             if (oOIl1Io0 != null) {
/* 11 */                LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 14 */                int iI000II = oIooi1iOiOol.I000II();
/* 28 */                lII1OI11o1I.I0000oI00("The specified lens facing is invalid.", iI000II != -1);
/* 33 */                O0oO01olI0 o0oO01olI0 = new O0oO01olI0();
/* 36 */                o0oO01olI0.I00000oOI = iI000II;
/* 38 */                VarHandle.storeStoreFence();
/* 41 */                linkedHashSet.add(o0oO01olI0);
/* 46 */                IIo0l1 iIo0l1 = new IIo0l1();
/* 49 */                iIo0l1.I00000oIO = linkedHashSet;
/* 51 */                VarHandle.storeStoreFence();
                        try {
/* 54 */                    oOIl1Io0.I00000oOI();
/* 72 */                    oI10i0Il2.setValue(oOIl1Io0.I00000oIO(o0oiOi, iIo0l1, oOIIOiolI, ioi1Io1o).I00000oOI());
                        } catch (Exception unused) {
                        }
                    }
                }

                public static final ArrayList I0000oI00(List list, List list2, String str) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 14 */            if (!list.isEmpty()) {
/* 18 */                List listI00iIi0i1o = IOOi0Ool1i.I00iIi0i1o(list);
/* 28 */                if (listI00iIi0i1o.size() > 10) {
/* 30 */                    listI00iIi0i1o = listI00iIi0i1o.subList(0, 10);
                        }
/* 34 */                List list3 = listI00iIi0i1o;
/* 36 */                List list4 = list3;
/* 44 */                ArrayList arrayList2 = new ArrayList(IOOi1I.I0000O(list4, 10));
/* 47 */                Iterator it = list4.iterator();
/* 55 */                while (it.hasNext()) {
/* 68 */                    arrayList2.add(new I0oO00o((Bitmap) it.next()));
                        }
/* 82 */                arrayList.add(new IO1OoiOlOO(list3, arrayList2, 0, IO1loo.I00iOIl, 116));
                    }
/* 87 */            ArrayList arrayList3 = new ArrayList();
/* 97 */            if (!list2.isEmpty()) {
/* 99 */                Iterator it2 = list2.iterator();
/* 107 */               while (it2.hasNext()) {
/* 113 */                   I1i1lO11OOO i1i1lO11OOO = (I1i1lO11OOO) it2.next();
/* 117 */                   byte[] bArr = i1i1lO11OOO.I00000oIO;
/* 119 */                   int i = i1i1lO11OOO.I00000oOI;
/* 121 */                   IO1loo iO1loo = IO1loo.I00iOIl;
/* 130 */                   IO1Oi1oOloiI iO1Oi1oOloiI = new IO1Oi1oOloiI(IO1iIoo.I00ilO0, iO1loo, 0.0f, null, false, 56);
/* 133 */                   iO1Oi1oOloiI.I000II = bArr;
/* 135 */                   iO1Oi1oOloiI.I000O01llI0 = i;
/* 137 */                   iO1Oi1oOloiI.I000OOo1O = iO1loo;
/* 139 */                   VarHandle.storeStoreFence();
/* 142 */                   arrayList3.add(iO1Oi1oOloiI);
                        }
                    }
/* 146 */           int size = arrayList3.size();
                    Collection collectionSubList = arrayList3;
/* 151 */           if (size > 1) {
/* 153 */               collectionSubList = arrayList3.subList(0, 1);
                    }
/* 159 */           arrayList.addAll(collectionSubList);
/* 166 */           if (str.length() > 0) {
/* 181 */               arrayList.add(new IO1iI1i(str, IO1loo.I00iOIl, 0.0f, null, false, 252));
                    }
/* 408 */           return arrayList;
                }

                /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final OIoi0IIoi I0001Ioi1lo(Context context, Uri uri) {
                    int columnIndex;
                    String string;
                    String strConcat;
                    InputStream inputStreamOpenInputStream;
/* 15 */            Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
/* 19 */            if (cursorQuery != null) {
                        try {
/* 25 */                    if (!cursorQuery.moveToFirst() || (columnIndex = cursorQuery.getColumnIndex("_display_name")) < 0) {
/* 45 */                        cursorQuery.close();
/* 55 */                        String lastPathSegment = uri.getLastPathSegment();
/* 68 */                        string = lastPathSegment == null ? OlOoOIi0o.I00O0i0ii('/', lastPathSegment, lastPathSegment) : "document";
                            } else {
/* 33 */                        string = cursorQuery.getString(columnIndex);
/* 37 */                        cursorQuery.close();
                            }
                        } finally {
                        }
                    } else {
/* 55 */                String lastPathSegment2 = uri.getLastPathSegment();
/* 68 */                if (lastPathSegment2 == null) {
                        }
                    }
/* 40 */            String str = string;
/* 91 */            if (O0000Ioio00.I0000O(context.getContentResolver().getType(uri), "application/pdf") || OlOolloIIOl0.I000II(str, ".pdf", true)) {
                        try {
/* 165 */                   inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
                        } catch (Exception e) {
/* 214 */                   Log.e("AGMessageInputText", "Failed to extract PDF text", e);
                        }
/* 169 */               if (inputStreamOpenInputStream != null) {
                            try {
/* 171 */                       OIliOo11 oIliOo11I0000Il00O = OIliOo11.I0000Il00O(inputStreamOpenInputStream);
                                try {
/* 180 */                           strConcat = new OIll0O().I000l1(oIliOo11I0000Il00O);
/* 187 */                           inputStreamOpenInputStream.close();
                                } finally {
/* 198 */                           oIliOo11I0000Il00O.close();
                                }
                            } finally {
                            }
                        } else {
/* 208 */                   strConcat = null;
                        }
/* 218 */               if (strConcat != null) {
/* 225 */                   if (OlOoOIi0o.I001l0I00(strConcat)) {
/* 227 */                       strConcat = "[This PDF appears to be a scanned image — no text could be extracted.]";
                            } else if (strConcat.length() > 50000) {
/* 240 */                       strConcat = OlOoOIi0o.I00OIl(50000, strConcat).concat("\n\n[Content truncated due to length]");
                            }
                        }
/* 90 */                return null;
                    }
/* 107 */           inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 111 */           if (inputStreamOpenInputStream != null) {
                        try {
/* 127 */                   strConcat = lOliOoIi.I00000oOI(new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, IO1IOI.I00000oIO), 8192));
/* 135 */                   if (strConcat.length() > 50000) {
/* 141 */                       strConcat = OlOoOIi0o.I00OIl(50000, strConcat).concat("\n\n[Content truncated due to length]");
                            }
/* 149 */                   inputStreamOpenInputStream.close();
                        } finally {
                        }
                    } else {
/* 159 */               strConcat = null;
                    }
/* 244 */           if (strConcat != null) {
/* 249 */               return new OIoi0IIoi(str, strConcat);
                    }
/* 90 */            return null;
                }
            }
