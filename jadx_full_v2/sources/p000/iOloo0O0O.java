            package p000;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.graphics.Matrix;
            import android.os.SystemClock;
            import androidx.camera.core.ImageProcessingUtil;
            import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.security.KeyPairGenerator;
            import java.security.Provider;
            import java.util.Arrays;
            import java.util.List;
            import java.util.TreeMap;
            import java.util.concurrent.ExecutorService;
            import java.util.concurrent.Executors;
            
/* 18 */    public final class iOloo0O0O implements Ol0IlIoIIIoO, Oi1lOlO0Iil, IOllol1io, o0I0i0loIlO, IIO1Ol0OIO10, IOoOOI1ii, Il0OlI, OlI1o0ooI, IOO0l0i0Oo, i0Ii0I1ll, i1lOiiiO, IOiOiIIiii1, iiIi1oo0Io, lIi1Illloi, lo11I0lO {
                public static iOloo0O0O I00iiI;
                public static final iOloo0O0O I00iiO = new iOloo0O0O(1);
                public static final iOloo0O0O I00iio = new iOloo0O0O(2);
                public static final iOloo0O0O I00ilI0I1 = new iOloo0O0O(3);
                public static final iOloo0O0O I00ilO0 = new iOloo0O0O(4);
                public static final iOloo0O0O I00io1l = new iOloo0O0O(5);
                public static final iOloo0O0O I00ioIO = new iOloo0O0O(6);
                public static final iOloo0O0O I00l0I0l0lO1 = new iOloo0O0O(7);
                public static final iOloo0O0O I00l0OO0IO = new iOloo0O0O(8);
                public static final iOloo0O0O I00li1OI = new iOloo0O0O(19);
                public static final iOloo0O0O I00ll1 = new iOloo0O0O(20);
                public static final iOloo0O0O I00lli11 = new iOloo0O0O(21);
                public static final iOloo0O0O I00lll10 = new iOloo0O0O(22);
                public static final iOloo0O0O I00o0iI0io1 = new iOloo0O0O(23);
                public static final iOloo0O0O I00o0l1o1o0 = new iOloo0O0O(24);
                public static final iOloo0O0O I00o101lO = new iOloo0O0O(25);
                public static final iOloo0O0O I00oI0i = new iOloo0O0O(27);
                public final int I00iOIl;

                public iOloo0O0O(int i) {
/* 1 */             this.I00iOIl = i;
                }

                public static OloooOlO10oI I000OiO(long j, long j2, long j3, long j4, long j5, long j6, IloI0lOlll1 iloI0lOlll1, int i) {
/* 3 */             long j7 = IOOiio0i.I000o00OoI0I;
/* 126 */           return I000iOII(((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO, (Oo0lOii10o10) iloI0lOlll1.I000iOII(Oo0lOio.I00000oIO)).I00000oOI(j7, j7, j7, j7, (i & 16) != 0 ? j7 : j, (i & 32) != 0 ? j7 : j2, (i & 64) != 0 ? j7 : j3, j7, j7, j7, null, j4, j5, j6, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7, j7);
                }

                public static OloooOlO10oI I000iOII(IOOl011 iOOl011, Oo0lOii10o10 oo0lOii10o10) {
/* 5 */             OloooOlO10oI oloooOlO10oI = iOOl011.I00ilO0;
/* 7 */             if (oloooOlO10oI != null) {
/* 15 */                if (O0000Ioio00.I0000O(oloooOlO10oI.I000iOII, oo0lOii10o10)) {
/* 17 */                    return oloooOlO10oI;
                        }
/* 233 */               OloooOlO10oI oloooOlO10oII00000oOI = oloooOlO10oI.I00000oOI(oloooOlO10oI.I00000oIO, oloooOlO10oI.I00000oOI, oloooOlO10oI.I0000Il00O, oloooOlO10oI.I0000O, oloooOlO10oI.I0000oI00, oloooOlO10oI.I0001Ioi1lo, oloooOlO10oI.I000II, oloooOlO10oI.I000O01llI0, oloooOlO10oI.I000OOo1O, oloooOlO10oI.I000OiO, oo0lOii10o10, oloooOlO10oI.I000l1, oloooOlO10oI.I000lI, oloooOlO10oI.I000o00OoI0I, oloooOlO10oI.I000oI1ioi, oloooOlO10oI.I00100l0, oloooOlO10oI.I00100o1O0lo, oloooOlO10oI.I0010I0i, oloooOlO10oI.I0010o, oloooOlO10oI.I00111O, oloooOlO10oI.I001IIilI0O, oloooOlO10oI.I001IO000, oloooOlO10oI.I001i1O0Ol, oloooOlO10oI.I001i1lo1io, oloooOlO10oI.I001iOo1i0O, oloooOlO10oI.I001l0I00, oloooOlO10oI.I001lIiIIo1O, oloooOlO10oI.I001lllioOl, oloooOlO10oI.I001lloI, oloooOlO10oI.I00II0Ol1O0l, oloooOlO10oI.I00II0oii1o, oloooOlO10oI.I00IO1, oloooOlO10oI.I00IO1oi11O, oloooOlO10oI.I00IOO, oloooOlO10oI.I00IioO0OiOi, oloooOlO10oI.I00IlilI0i0i, oloooOlO10oI.I00Io1lO, oloooOlO10oI.I00Io1o110i, oloooOlO10oI.I00IoIO0lI, oloooOlO10oI.I00IoO0, oloooOlO10oI.I00IoiI, oloooOlO10oI.I00Iooi00oi, oloooOlO10oI.I00O0i0ii);
/* 22 */                iOOl011.I00ilO0 = oloooOlO10oII00000oOI;
/* 24 */                return oloooOlO10oII00000oOI;
                    }
/* 29 */            long jI0000O = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I001iOo1i0O);
/* 35 */            long jI0000O2 = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I00II0Ol1O0l);
/* 39 */            IOOl0iI iOOl0iI = IlIlOOO.I000II;
/* 41 */            long jI0000O3 = IOOl0iiliOl.I0000O(iOOl011, iOOl0iI);
/* 45 */            float f = IlIlOOO.I000O01llI0;
/* 47 */            long jI0000Il00O = IOOiio0i.I0000Il00O(f, jI0000O3);
/* 53 */            long jI0000O4 = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I0010o);
/* 57 */            IOOl0iI iOOl0iI2 = IlIlOOO.I0000Il00O;
/* 60 */            long jI0000O5 = IOOl0iiliOl.I0000O(iOOl011, iOOl0iI2);
/* 64 */            long jI0000O6 = IOOl0iiliOl.I0000O(iOOl011, iOOl0iI2);
/* 72 */            long jI0000O7 = IOOl0iiliOl.I0000O(iOOl011, iOOl0iI2);
/* 76 */            long jI0000O8 = IOOl0iiliOl.I0000O(iOOl011, iOOl0iI2);
/* 84 */            long jI0000O9 = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I00000oOI);
/* 90 */            long jI0000O10 = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I0010I0i);
/* 96 */            long jI0000O11 = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I001i1lo1io);
/* 102 */           long jI0000O12 = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I00000oIO);
/* 116 */           long jI0000Il00O2 = IOOiio0i.I0000Il00O(IlIlOOO.I0001Ioi1lo, IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I0000oI00));
/* 122 */           long jI0000O13 = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I00100o1O0lo);
/* 128 */           long jI0000O14 = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I001lIiIIo1O);
/* 134 */           long jI0000O15 = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I00IioO0OiOi);
/* 148 */           long jI0000Il00O3 = IOOiio0i.I0000Il00O(IlIlOOO.I000l1, IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I000iOII));
/* 154 */           long jI0000O16 = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I001IIilI0O);
/* 160 */           long jI0000O17 = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I001lloI);
/* 166 */           long jI0000O18 = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I00Io1lO);
/* 180 */           long jI0000Il00O4 = IOOiio0i.I0000Il00O(IlIlOOO.I00100l0, IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I000oI1ioi));
/* 186 */           long jI0000O19 = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I001i1O0Ol);
/* 192 */           long jI0000O20 = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I001l0I00);
/* 198 */           long jI0000O21 = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I00IOO);
/* 212 */           long jI0000Il00O5 = IOOiio0i.I0000Il00O(IlIlOOO.I000OiO, IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I000OOo1O));
/* 218 */           long jI0000O22 = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I00111O);
/* 222 */           IOOl0iI iOOl0iI3 = IlIlOOO.I00II0oii1o;
/* 270 */           long jI0000O23 = IOOl0iiliOl.I0000O(iOOl011, iOOl0iI3);
/* 276 */           long jI0000O24 = IOOl0iiliOl.I0000O(iOOl011, iOOl0iI3);
/* 286 */           long jI0000Il00O6 = IOOiio0i.I0000Il00O(f, IOOl0iiliOl.I0000O(iOOl011, iOOl0iI));
/* 290 */           long jI0000O25 = IOOl0iiliOl.I0000O(iOOl011, iOOl0iI3);
/* 296 */           long jI0000O26 = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I001lllioOl);
/* 302 */           long jI0000O27 = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I00IlilI0i0i);
/* 316 */           long jI0000Il00O7 = IOOiio0i.I0000Il00O(IlIlOOO.I000o00OoI0I, IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I000lI));
/* 322 */           long jI0000O28 = IOOl0iiliOl.I0000O(iOOl011, IlIlOOO.I001IO000);
/* 326 */           IOOl0iI iOOl0iI4 = IlIlOOO.I00IO1;
/* 334 */           long jI0000O29 = IOOl0iiliOl.I0000O(iOOl011, iOOl0iI4);
/* 340 */           long jI0000O30 = IOOl0iiliOl.I0000O(iOOl011, iOOl0iI4);
/* 350 */           long jI0000Il00O8 = IOOiio0i.I0000Il00O(f, IOOl0iiliOl.I0000O(iOOl011, iOOl0iI4));
/* 354 */           long jI0000O31 = IOOl0iiliOl.I0000O(iOOl011, iOOl0iI4);
/* 358 */           IOOl0iI iOOl0iI5 = IlIlOOO.I00IO1oi11O;
/* 411 */           OloooOlO10oI oloooOlO10oI2 = new OloooOlO10oI(jI0000O, jI0000O2, jI0000Il00O, jI0000O4, jI0000O5, jI0000O6, jI0000O7, jI0000O8, jI0000O9, jI0000O10, oo0lOii10o10, jI0000O11, jI0000O12, jI0000Il00O2, jI0000O13, jI0000O14, jI0000O15, jI0000Il00O3, jI0000O16, jI0000O17, jI0000O18, jI0000Il00O4, jI0000O19, jI0000O20, jI0000O21, jI0000Il00O5, jI0000O22, jI0000O23, jI0000O24, jI0000Il00O6, jI0000O25, jI0000O26, jI0000O27, jI0000Il00O7, jI0000O28, jI0000O29, jI0000O30, jI0000Il00O8, jI0000O31, IOOl0iiliOl.I0000O(iOOl011, iOOl0iI5), IOOl0iiliOl.I0000O(iOOl011, iOOl0iI5), IOOiio0i.I0000Il00O(f, IOOl0iiliOl.I0000O(iOOl011, iOOl0iI5)), IOOl0iiliOl.I0000O(iOOl011, iOOl0iI5));
/* 414 */           iOOl011.I00ilO0 = oloooOlO10oI2;
/* 401 */           return oloooOlO10oI2;
                }

                public static synchronized void I000l1() {
/* 6 */             if (I00iiI == null) {
/* 14 */                I00iiI = new iOloo0O0O(0);
                    }
                }

                @Override
                public byte[] I00000oIO(byte[] bArr, int i, int i2) {
/* 2 */             return Arrays.copyOfRange(bArr, i, i2 + i);
                }

                @Override
                public long I00000oOI(long j, long j2) {
/* 24 */            if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
/* 60 */                long jFloatToRawIntBits = (Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L);
/* 61 */                int i = OiO101lO.I00000oIO;
/* 63 */                return jFloatToRawIntBits;
                    }
/* 64 */            float fI00000oIO = iioI1oI00I.I00000oIO(j, j2);
/* 82 */            long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fI00000oIO) << 32) | (Float.floatToRawIntBits(fI00000oIO) & 4294967295L);
/* 83 */            int i2 = OiO101lO.I00000oIO;
/* 106 */           return jFloatToRawIntBits2;
                }

                @Override
                public Object I0000Il00O() {
/* 7 */             ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new Io1iO1I(3));
/* 11 */            liIliolI1Oi0.I00000oIO(executorServiceNewSingleThreadExecutor);
/* 20 */            return executorServiceNewSingleThreadExecutor;
                }

                public void I0000O(boolean z, OI0lOIiOIOOo oI0lOIiOIOOo, OloooOlO10oI oloooOlO10oI, OioOIi1o0I oioOIi1o0I, IloI0lOlll1 iloI0lOlll1, int i) {
                    O1ooiI111i o1ooiI111iI0000O;
/* 14 */            iloI0lOlll1.I00i0O(-818661242);
/* 21 */            int i2 = 2;
/* 82 */            int i3 = i | (iloI0lOlll1.I000O01llI0(z) ? 4 : 2) | (iloI0lOlll1.I000O01llI0(false) ? 32 : 16) | (iloI0lOlll1.I000II(oI0lOIiOIOOo) ? 256 : Barcode.FORMAT_ITF) | (iloI0lOlll1.I000II(oloooOlO10oI) ? 16384 : 8192) | (iloI0lOlll1.I000II(oioOIi1o0I) ? 131072 : 65536);
/* 102 */           if (iloI0lOlll1.I00OIl(i3 & 1, (38347923 & i3) != 38347922)) {
/* 104 */               iloI0lOlll1.I00Ol00();
/* 109 */               if ((i & 1) != 0 && !iloI0lOlll1.I001lloI()) {
/* 118 */                   iloI0lOlll1.I00OilO00Il();
                        }
/* 121 */               iloI0lOlll1.I0010o();
/* 130 */               boolean z2 = (i3 & 896) == 256;
/* 131 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 135 */               Object obj = IOl11li.I00000oIO;
/* 137 */               if (z2 || objI00O0i0ii == obj) {
/* 143 */                   objI00O0i0ii = new OI10olol1i(oI0lOIiOIOOo);
/* 146 */                   iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 149 */               OI10olol1i oI10olol1i = (OI10olol1i) objI00O0i0ii;
/* 153 */               IlIoO1ilo1 ilIoO1ilo1I00000oOI = l1i1II.I00000oOI(OI0I0o.I00iio, iloI0lOlll1);
/* 223 */               boolean zI000OOo1O = ((i3 & 14) == 4) | ((((57344 & i3) ^ 24576) > 16384 && iloI0lOlll1.I000II(oloooOlO10oI)) || (i3 & 24576) == 16384) | ((((i3 & 458752) ^ 196608) > 131072 && iloI0lOlll1.I000II(oioOIi1o0I)) || (i3 & 196608) == 131072) | ((i3 & 112) == 32) | iloI0lOlll1.I000OOo1O(ilIoO1ilo1I00000oOI);
/* 224 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj2 = objI00O0i0ii2;
/* 228 */               if (zI000OOo1O || objI00O0i0ii2 == obj) {
/* 234 */                   Oo001iOlo0l oo001iOlo0l = new Oo001iOlo0l();
/* 237 */                   oo001iOlo0l.I00000oIO = oioOIi1o0I;
/* 239 */                   oo001iOlo0l.I00000oOI = oloooOlO10oI;
/* 241 */                   oo001iOlo0l.I0000Il00O = z;
/* 243 */                   oo001iOlo0l.I0000O = ilIoO1ilo1I00000oOI;
/* 245 */                   VarHandle.storeStoreFence();
/* 248 */                   iloI0lOlll1.I00iio(oo001iOlo0l);
                            obj2 = oo001iOlo0l;
                        }
/* 251 */               Oli01I0I01 oli01I0I01 = (Oli01I0I01) obj2;
/* 255 */               if (oli01I0I01 == Oli00ooiI.I00000oIO) {
/* 257 */                   o1ooiI111iI0000O = O1ooIo101ll.I00000oIO;
                        } else {
/* 262 */                   Oli0Iol0 oli0Iol0 = new Oli0Iol0();
/* 265 */                   oli0Iol0.I00000oIO = oI10olol1i;
/* 267 */                   oli0Iol0.I00000oOI = oli01I0I01;
/* 269 */                   VarHandle.storeStoreFence();
/* 274 */                   o1ooiI111iI0000O = oli0Iol0.I0000O(Oli0iIIII0li.I00000oIO);
                        }
/* 280 */               Iol10O1io1ii iol10O1io1ii = new Iol10O1io1ii();
/* 283 */               iol10O1io1ii.I00000oIO = z;
/* 285 */               iol10O1io1ii.I00000oOI = oI0lOIiOIOOo;
/* 287 */               iol10O1io1ii.I0000Il00O = oloooOlO10oI;
/* 289 */               iol10O1io1ii.I0000O = oioOIi1o0I;
/* 293 */               iol10O1io1ii.I0000oI00 = 2.0f;
/* 297 */               iol10O1io1ii.I0001Ioi1lo = 1.0f;
/* 299 */               VarHandle.storeStoreFence();
/* 306 */               II1oOI10.I00000oIO(o1ooiI111iI0000O.I0000O(iol10O1io1ii), iloI0lOlll1, 0);
                    } else {
/* 310 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 313 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 317 */           if (oOloioIlI001IO000 != null) {
/* 321 */               O11I0O0i o11I0O0i = new O11I0O0i(i2);
/* 326 */               o11I0O0i.I00ilI0I1 = this;
/* 328 */               o11I0O0i.I00iiI = z;
/* 330 */               o11I0O0i.I00ilO0 = oI0lOIiOIOOo;
/* 332 */               o11I0O0i.I00iiO = oloooOlO10oI;
/* 334 */               o11I0O0i.I00iio = oioOIi1o0I;
/* 336 */               VarHandle.storeStoreFence();
/* 339 */               oOloioIlI001IO000.I0000O = o11I0O0i;
                    }
                }

                @Override
                public Object I0000oI00(String str, Provider provider) {
                    return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
                }

                @Override
                public long I0001Ioi1lo() {
/* 1 */             return SystemClock.elapsedRealtime();
                }

                public void I000II(String str, IlliIl1l11O illiIl1l11O, boolean z, boolean z2, OoooioIi0I ooooioIi0I, OI0lOIiOIOOo oI0lOIiOIOOo, IlliIl1l11O illiIl1l11O2, IlliIl1l11O illiIl1l11O3, IlliIl1l11O illiIl1l11O4, OioOIi1o0I oioOIi1o0I, OloooOlO10oI oloooOlO10oI, OIo1Oi1l1lI oIo1Oi1l1lI, IlliIl1l11O illiIl1l11O5, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    IlliIl1l11O illiIl1l11O6;
                    IlliIl1l11O illiIl1l11O7;
                    OIo1Oi1l1lI oIo1Oi1l1lI2;
                    IlliIl1l11O illiIl1l11OI00000oOI;
                    int i3;
/* 1 */             iloI0lOlll1.I00i0O(1806980801);
                    if ((i & 6) == 0) {
                        i2 = (iloI0lOlll1.I000II(str) ? 4 : 2) | i;
                    } else {
                        i2 = i;
                    }
                    if ((i & 48) == 0) {
                        i2 |= iloI0lOlll1.I000OOo1O(illiIl1l11O) ? 32 : 16;
                    }
                    int i4 = i & 384;
                    int i5 = Barcode.FORMAT_ITF;
                    if (i4 == 0) {
                        i2 |= iloI0lOlll1.I000O01llI0(z) ? 256 : 128;
                    }
                    int i6 = i & 3072;
                    int i7 = Barcode.FORMAT_UPC_E;
                    if (i6 == 0) {
                        i2 |= iloI0lOlll1.I000O01llI0(z2) ? 2048 : 1024;
                    }
                    if ((i & 24576) == 0) {
                        i2 |= iloI0lOlll1.I000II(ooooioIi0I) ? 16384 : 8192;
                    }
                    if ((196608 & i) == 0) {
                        i2 |= iloI0lOlll1.I000II(oI0lOIiOIOOo) ? 131072 : 65536;
                    }
                    if ((i & 1572864) == 0) {
                        i2 |= iloI0lOlll1.I000O01llI0(false) ? 1048576 : 524288;
                    }
                    if ((i & 12582912) == 0) {
                        i2 |= iloI0lOlll1.I000OOo1O(null) ? 8388608 : 4194304;
                    }
                    if ((i & 100663296) == 0) {
                        i2 |= iloI0lOlll1.I000OOo1O(illiIl1l11O2) ? 67108864 : 33554432;
                    }
                    if ((i & 805306368) == 0) {
                        i2 |= iloI0lOlll1.I000OOo1O(illiIl1l11O3) ? 536870912 : 268435456;
                    }
                    int i8 = 100663296 | (iloI0lOlll1.I000OOo1O(illiIl1l11O4) ? 4 : 2) | (iloI0lOlll1.I000OOo1O(null) ? 32 : 16);
                    if (iloI0lOlll1.I000OOo1O(null)) {
                        i5 = 256;
                    }
                    int i9 = i8 | i5;
                    if (iloI0lOlll1.I000OOo1O(null)) {
                        i7 = 2048;
                    }
                    int i10 = i9 | i7 | (iloI0lOlll1.I000II(oioOIi1o0I) ? 16384 : 8192) | (iloI0lOlll1.I000II(oloooOlO10oI) ? 131072 : 65536) | 13107200;
                    int i11 = 1;
                    if (iloI0lOlll1.I00OIl(i2 & 1, ((i2 & 306783379) == 306783378 && (38347923 & i10) == 38347922) ? false : true)) {
                        iloI0lOlll1.I00Ol00();
                        if ((i & 1) == 0 || iloI0lOlll1.I001lloI()) {
/* 4 */                     OIo1i1 oIo1i1 = new OIo1i1(16.0f, 16.0f, 16.0f, 16.0f);
                            int i12 = i10 & (-3670017);
/* 5 */                     OIl1100 oIl1100 = new OIl1100(i11);
                            oIl1100.I00iiI = z;
                            oIl1100.I00iiO = oI0lOIiOIOOo;
                            oIl1100.I00iio = oloooOlO10oI;
                            oIl1100.I00ilI0I1 = oioOIi1o0I;
                            VarHandle.storeStoreFence();
                            oIo1Oi1l1lI2 = oIo1i1;
                            i3 = i12;
                            illiIl1l11OI00000oOI = iiioOl1O.I00000oOI(417908150, oIl1100, iloI0lOlll1);
                        } else {
/* 2 */                     iloI0lOlll1.I00OilO00Il();
                            i3 = i10 & (-3670017);
                            oIo1Oi1l1lI2 = oIo1Oi1l1lI;
                            illiIl1l11OI00000oOI = illiIl1l11O5;
                        }
/* 6 */                 iloI0lOlll1.I0010o();
                        int i13 = i3;
                        boolean z3 = ((i2 & 14) == 4) | ((i2 & 57344) == 16384);
/* 7 */                 Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 8 */                 if (z3 || objI00O0i0ii == IOl11li.I00000oIO) {
/* 9 */                     objI00O0i0ii = ooooioIi0I.I00000oIO(new I1111OO10i(str));
/* 10 */                    iloI0lOlll1.I00iio(objI00O0i0ii);
                        }
/* 13 */                String str2 = ((OoI0llll) objI00O0i0ii).I00000oIO.I00iiI;
/* 15 */                II0IlloOiO0i iI0IlloOiO0i = i1O01oOIoI0I.I00o0iI0io1;
/* 16 */                Oo01ii01 oo01ii01 = new Oo01ii01();
/* 17 */                oo01ii01.I00000oIO = iI0IlloOiO0i;
/* 18 */                oo01ii01.I00000oOI = iI0IlloOiO0i;
/* 19 */                VarHandle.storeStoreFence();
/* 20 */                iloI0lOlll1.I00i01iIIliI(-1353189719);
/* 21 */                iloI0lOlll1.I0010I0i(false);
                        int i14 = i2 >> 12;
                        int i15 = i13 << 18;
                        illiIl1l11O7 = illiIl1l11O2;
                        illiIl1l11O6 = illiIl1l11O;
/* 22 */                lOl0l1O.I00000oIO(str2, illiIl1l11O6, oo01ii01, null, illiIl1l11O7, illiIl1l11O3, illiIl1l11O4, null, z2, z, false, oI0lOIiOIOOo, oIo1Oi1l1lI2, oloooOlO10oI, illiIl1l11OI00000oOI, iloI0lOlll1, (i2 & 112) | (i14 & 57344) | (i14 & 458752) | (i15 & 3670016) | (i15 & 29360128) | (i15 & 234881024) | (i15 & 1879048192), (i14 & 896) | ((i2 >> 9) & 14) | ((i2 >> 3) & 112) | ((i2 >> 6) & 7168) | (i13 & 458752) | 1572864);
                    } else {
                        illiIl1l11O6 = illiIl1l11O;
                        illiIl1l11O7 = illiIl1l11O2;
/* 23 */                iloI0lOlll1.I00OilO00Il();
                        oIo1Oi1l1lI2 = oIo1Oi1l1lI;
                        illiIl1l11OI00000oOI = illiIl1l11O5;
                    }
/* 24 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
                    if (oOloioIlI001IO000 != null) {
                        Oloooiool oloooiool = new Oloooiool();
                        oloooiool.I00iOIl = this;
                        oloooiool.I00iiI = str;
                        oloooiool.I00iiO = illiIl1l11O6;
                        oloooiool.I00iio = z;
                        oloooiool.I00ilI0I1 = z2;
                        oloooiool.I00ilO0 = ooooioIi0I;
                        oloooiool.I00io1l = oI0lOIiOIOOo;
                        oloooiool.I00ioIO = illiIl1l11O7;
                        oloooiool.I00l0I0l0lO1 = illiIl1l11O3;
                        oloooiool.I00l0OO0IO = illiIl1l11O4;
                        oloooiool.I00li1OI = oioOIi1o0I;
                        oloooiool.I00ll1 = oloooOlO10oI;
                        oloooiool.I00lli11 = oIo1Oi1l1lI2;
                        oloooiool.I00lll10 = illiIl1l11OI00000oOI;
                        oloooiool.I00o0iI0io1 = i;
                        VarHandle.storeStoreFence();
/* 25 */                oOloioIlI001IO000.I0000O = oloooiool;
                    }
                }

                public Object I000OOo1O(Object obj) throws Throwable {
                    UnsupportedOperationException unsupportedOperationException;
                    Throwable th;
                    Bitmap bitmapCreateBitmap;
/* 1 */             I1l1oO0OI1 i1l1oO0OI1 = (I1l1oO0OI1) obj;
/* 3 */             int i = i1l1oO0OI1.I0000Il00O;
/* 9 */             Object obj2 = i1l1oO0OI1.I00000oIO;
/* 11 */            int i2 = i1l1oO0OI1.I0001Ioi1lo;
/* 16 */            OOlli1l1lOlI oOlli1l1lOlI = null;
                    try {
                        try {
/* 17 */                    if (i == 35) {
/* 19 */                        IoiO1IO1I1i ioiO1IO1I1i = (IoiO1IO1I1i) obj2;
/* 28 */                        boolean z = i2 % 180 != 0;
/* 66 */                        OOlli1l1lOlI oOlli1l1lOlI2 = new OOlli1l1lOlI(ioOI11II.I00000oIO(z ? ioiO1IO1I1i.I0000O() : ioiO1IO1I1i.I0001Ioi1lo(), z ? ioiO1IO1I1i.I0001Ioi1lo() : ioiO1IO1I1i.I0000O(), 1, 2));
                                try {
/* 84 */                            Ioi0ololOi ioi0ololOiI0000O = ImageProcessingUtil.I0000O(ioiO1IO1I1i, oOlli1l1lOlI2, ByteBuffer.allocateDirect(ioiO1IO1I1i.I0001Ioi1lo() * ioiO1IO1I1i.I0000O() * 4), i2, false);
/* 88 */                            ioiO1IO1I1i.close();
/* 91 */                            if (ioi0ololOiI0000O == null) {
/* 117 */                               throw new Ioi1lIO("Can't covert YUV to RGB", null, 0);
                                    }
/* 93 */                            bitmapCreateBitmap = ioOiOIli1i.I00000oIO(ioi0ololOiI0000O);
/* 97 */                            ioi0ololOiI0000O.close();
/* 100 */                           oOlli1l1lOlI = oOlli1l1lOlI2;
                                } catch (UnsupportedOperationException e) {
/* 107 */                           unsupportedOperationException = e;
/* 213 */                           throw new Ioi1lIO("Can't convert " + (i == 35 ? "YUV" : "JPEG") + " to bitmap", unsupportedOperationException, 0);
                                } catch (Throwable th2) {
/* 103 */                           th = th2;
/* 104 */                           oOlli1l1lOlI = oOlli1l1lOlI2;
/* 214 */                           if (oOlli1l1lOlI == null) {
/* 437 */                               throw th;
                                    }
/* 216 */                           oOlli1l1lOlI.close();
/* 437 */                           throw th;
                                }
                            } else {
/* 120 */                       if (i != 256 && i != 4101) {
/* 144 */                           throw new IllegalArgumentException("Invalid postview image format : " + i);
                                }
/* 145 */                       IoiO1IO1I1i ioiO1IO1I1i2 = (IoiO1IO1I1i) obj2;
/* 147 */                       Bitmap bitmapI00000oIO = ioOiOIli1i.I00000oIO(ioiO1IO1I1i2);
/* 151 */                       ioiO1IO1I1i2.close();
/* 156 */                       Matrix matrix = new Matrix();
/* 160 */                       matrix.postRotate(i2);
/* 174 */                       bitmapCreateBitmap = Bitmap.createBitmap(bitmapI00000oIO, 0, 0, bitmapI00000oIO.getWidth(), bitmapI00000oIO.getHeight(), matrix, true);
                            }
/* 178 */                   if (oOlli1l1lOlI != null) {
/* 180 */                       oOlli1l1lOlI.close();
                            }
/* 183 */                   return bitmapCreateBitmap;
                        } catch (Throwable th3) {
/* 37 */                    th = th3;
                        }
                    } catch (UnsupportedOperationException e2) {
/* 41 */                unsupportedOperationException = e2;
                    }
                }

                @Override
                public void configure(Il0IIIOll il0IIIOll) {
/* 5 */             il0IIIOll.registerEncoder(l1Ioi1ioOI.class, iloOlO10.I00000oIO);
/* 12 */            il0IIIOll.registerEncoder(lIi00i.class, l01OIIO.I00000oIO);
/* 19 */            il0IIIOll.registerEncoder(l1O0o1.class, iloi1o10OOOl.I00000oIO);
/* 26 */            il0IIIOll.registerEncoder(l1Ol1ll.class, ilollO11iIi.I00000oIO);
/* 33 */            il0IIIOll.registerEncoder(l1OO1oIO0i1o.class, ilol0illoo1.I00000oIO);
/* 40 */            il0IIIOll.registerEncoder(l1Oi0i00I.class, ilooiolliO.I00000oIO);
/* 47 */            il0IIIOll.registerEncoder(l0o0i0iOo.class, ilOIIli.I00000oIO);
/* 54 */            il0IIIOll.registerEncoder(l0lolo.class, ilO1O1.I00000oIO);
/* 61 */            il0IIIOll.registerEncoder(l11I1i.class, illOl0Il.I00000oIO);
/* 68 */            il0IIIOll.registerEncoder(lIIo10.class, l00Oo0.I00000oIO);
/* 75 */            il0IIIOll.registerEncoder(l0llIoloo.class, ilO0loi1lo.I00000oIO);
/* 82 */            il0IIIOll.registerEncoder(l0lOoI.class, ilIolO1.I00000oIO);
/* 89 */            il0IIIOll.registerEncoder(l1ioloOOl00l.class, io1ioI0io1I.I00000oIO);
/* 96 */            il0IIIOll.registerEncoder(lIol1IoOO01.class, ililili1O.I00000oIO);
/* 103 */           il0IIIOll.registerEncoder(l10oOI1I1o.class, ill1IIoii01.I00000oIO);
/* 110 */           il0IIIOll.registerEncoder(l10OIlo0lI.class, iliio10.I00000oIO);
/* 117 */           il0IIIOll.registerEncoder(l1l0OIOOOo.class, io1o110IO1.I00000oIO);
/* 124 */           il0IIIOll.registerEncoder(lIIO11.class, l000Ol.I00000oIO);
/* 131 */           il0IIIOll.registerEncoder(lIIi1OI0.class, l001oio11OiI.I00000oIO);
/* 138 */           il0IIIOll.registerEncoder(lIII1O.class, ioooiIO0i.I00000oIO);
/* 145 */           il0IIIOll.registerEncoder(OI0iO0Il1oO0.class, io0lOO1llOlO.I00000oIO);
/* 152 */           il0IIIOll.registerEncoder(lIoiOI1I1.class, il100oi.I00000oIO);
/* 159 */           il0IIIOll.registerEncoder(l1iIi10.class, io0o0O1.I00000oIO);
/* 166 */           il0IIIOll.registerEncoder(l1o0O00iooo.class, ioO0II1o10i.I00000oIO);
/* 173 */           il0IIIOll.registerEncoder(I0OIoOl0l0I0.class, ioOioio1IOI.I00000oIO);
/* 180 */           il0IIIOll.registerEncoder(l1o1loI0I0o.class, ioOiO0Oil0O.I00000oIO);
/* 187 */           il0IIIOll.registerEncoder(l1o1Io0I.class, ioOI1oI10.I00000oIO);
/* 194 */           il0IIIOll.registerEncoder(lI0lo10I01i1.class, iol1O0O10oio.I00000oIO);
/* 201 */           il0IIIOll.registerEncoder(lI0ooI1il.class, iolIiiIOI1.I00000oIO);
/* 208 */           il0IIIOll.registerEncoder(lI1IIO.class, iolo1I.I00000oIO);
/* 215 */           il0IIIOll.registerEncoder(lI10oO.class, iollIloiii.I00000oIO);
/* 222 */           il0IIIOll.registerEncoder(l1i0lii.class, io0iIooO.I00000oIO);
/* 229 */           il0IIIOll.registerEncoder(lI1Ol11OOlll.class, ioo0iOI1.I00000oIO);
/* 236 */           il0IIIOll.registerEncoder(lI1ioiO0.class, ioo11IOiOO.I00000oIO);
/* 243 */           il0IIIOll.registerEncoder(lI1lO10O0i.class, iooIIoo0.I00000oIO);
/* 250 */           il0IIIOll.registerEncoder(lI1o0lI.class, iooOOI0i0o1.I00000oIO);
/* 257 */           il0IIIOll.registerEncoder(lII11l.class, iool00ol1i.I00000oIO);
/* 264 */           il0IIIOll.registerEncoder(lII0I0I000I.class, iooliol.I00000oIO);
/* 271 */           il0IIIOll.registerEncoder(lI0ilOIoll.class, ioiO0ol0.I00000oIO);
/* 278 */           il0IIIOll.registerEncoder(l1II1oiili.class, ilo1ii.I00000oIO);
/* 285 */           il0IIIOll.registerEncoder(lI0IOO0lIiOo.class, ioio110II.I00000oIO);
/* 292 */           il0IIIOll.registerEncoder(lI01i11I.class, ioiiOOII1O1i.I00000oIO);
/* 299 */           il0IIIOll.registerEncoder(lI0OiOl.class, iol0liOO000.I00000oIO);
/* 306 */           il0IIIOll.registerEncoder(lIIl0IOilo0.class, l00IlOO0Iii.I00000oIO);
/* 313 */           il0IIIOll.registerEncoder(lIilio1l0.class, l0IOoioI0.I00000oIO);
/* 320 */           il0IIIOll.registerEncoder(l0i0illl0ooi.class, il1l0Iil0.I00000oIO);
/* 327 */           il0IIIOll.registerEncoder(l0Oll01O.class, il1Oi1I0oOli.I00000oIO);
/* 334 */           il0IIIOll.registerEncoder(l0Oiiill1.class, il1O1io.I00000oIO);
/* 341 */           il0IIIOll.registerEncoder(l0OoioOl1l0.class, il1iOo0l0i.I00000oIO);
/* 348 */           il0IIIOll.registerEncoder(l0iI1OI11o0O.class, il1oO0o0OIl.I00000oIO);
/* 355 */           il0IIIOll.registerEncoder(l0i10lIio.class, il1lio.I00000oIO);
/* 362 */           il0IIIOll.registerEncoder(l0iOII0lllIo.class, ilI01I.I00000oIO);
/* 369 */           il0IIIOll.registerEncoder(l0ii0ooi.class, ilI0loO01o.I00000oIO);
/* 376 */           il0IIIOll.registerEncoder(l0il1i0011O.class, ilI1oI1i1llI.I00000oIO);
/* 383 */           il0IIIOll.registerEncoder(l0iloO.class, ilII1l.I00000oIO);
/* 390 */           il0IIIOll.registerEncoder(l0l00iIIIOO.class, ilIOIIi0O1i1.I00000oIO);
/* 397 */           il0IIIOll.registerEncoder(iiO01ll11o1l.class, il0iIlOiI.I00000oIO);
/* 404 */           il0IIIOll.registerEncoder(iiOIOoiOO1l.class, il0o00.I00000oIO);
/* 411 */           il0IIIOll.registerEncoder(iiO1i0O.class, il0l1i0O0I0.I00000oIO);
/* 418 */           il0IIIOll.registerEncoder(l1I0O0OI0oO.class, ilo0001iIOil.I00000oIO);
/* 425 */           il0IIIOll.registerEncoder(l0o1O1I1.class, ilOOIl1.I00000oIO);
/* 432 */           il0IIIOll.registerEncoder(iOIO00lI11l.class, iiOliOOilil.I00000oIO);
/* 439 */           il0IIIOll.registerEncoder(iO1iIl1I0.class, iiOolOli.I00000oIO);
/* 446 */           il0IIIOll.registerEncoder(l101loO1o0oO.class, ili0l1OIo01O.I00000oIO);
/* 453 */           il0IIIOll.registerEncoder(iOOl00.class, iii1O10.I00000oIO);
/* 460 */           il0IIIOll.registerEncoder(iOIoo0OoII1O.class, iiiO0olloio.I00000oIO);
/* 467 */           il0IIIOll.registerEncoder(iOo0o0.class, iilO0lOlo.I00000oIO);
/* 474 */           il0IIIOll.registerEncoder(iOlo11o.class, iilOOOl1Oo.I00000oIO);
/* 481 */           il0IIIOll.registerEncoder(iOioOiio.class, iiiilO1.I00000oIO);
/* 488 */           il0IIIOll.registerEncoder(iOiIOo1010i.class, iiioO01olol.I00000oIO);
/* 495 */           il0IIIOll.registerEncoder(ii0ioiio.class, iio1OiIloi.I00000oIO);
/* 502 */           il0IIIOll.registerEncoder(ii0IlolIi.class, iio1l1i0.I00000oIO);
/* 509 */           il0IIIOll.registerEncoder(ii1OOii.class, iioi0iOllo.I00000oIO);
/* 516 */           il0IIIOll.registerEncoder(ii11iOi.class, iioil1oi.I00000oIO);
/* 523 */           il0IIIOll.registerEncoder(IOOi1I.class, il0IOIlIiill.I00000oIO);
/* 530 */           il0IIIOll.registerEncoder(iiIiiol0.class, il0Ol1l.I00000oIO);
/* 537 */           il0IIIOll.registerEncoder(ii1oO1IOiI1o.class, iioll0l1.I00000oIO);
/* 544 */           il0IIIOll.registerEncoder(ii1il0.class, iiool10.I00000oIO);
/* 551 */           il0IIIOll.registerEncoder(iiIIl0oOoi.class, il00l0lOii1I.I00000oIO);
/* 558 */           il0IIIOll.registerEncoder(iiI1i11O.class, il01I0O1.I00000oIO);
/* 565 */           il0IIIOll.registerEncoder(lIo000I.class, l00o11ol101.I00000oIO);
/* 572 */           il0IIIOll.registerEncoder(lIiolllll.class, ilOi0I11O.I00000oIO);
/* 579 */           il0IIIOll.registerEncoder(lIli0ooiOill.class, io0Oi1ii.I00000oIO);
/* 586 */           il0IIIOll.registerEncoder(lIlIi0Ii1.class, io0IIiOi0.I00000oIO);
/* 593 */           il0IIIOll.registerEncoder(lIl0looO.class, iliooiO11li.I00000oIO);
/* 600 */           il0IIIOll.registerEncoder(lIlo0Oi0oOI.class, l00lOoo0OO0O.I00000oIO);
/* 607 */           il0IIIOll.registerEncoder(lIll0lII1.class, l00iO1.I00000oIO);
/* 614 */           il0IIIOll.registerEncoder(lIo0oi1l.class, l0101oOll111.I00000oIO);
/* 621 */           il0IIIOll.registerEncoder(lIl1l0IO.class, illl0Oi0.I00000oIO);
/* 628 */           il0IIIOll.registerEncoder(lIoi00.class, l0Io1l0IIi.I00000oIO);
/* 635 */           il0IIIOll.registerEncoder(lIoIo0oIlo.class, l0O0100l0.I00000oIO);
/* 642 */           il0IIIOll.registerEncoder(lIo1lII.class, l0IlO0OO1i.I00000oIO);
/* 649 */           il0IIIOll.registerEncoder(lIO01iiiOOo.class, l010o10lll.I00000oIO);
/* 656 */           il0IIIOll.registerEncoder(l11oOo0i0IiO.class, illlo0oOo.I00000oIO);
/* 663 */           il0IIIOll.registerEncoder(l1IOiIo1IO1.class, iloIIoi00.I00000oIO);
/* 670 */           il0IIIOll.registerEncoder(l0OOiIiiO0.class, il11I0Io11o1.I00000oIO);
/* 677 */           il0IIIOll.registerEncoder(l10ooii1l0l1.class, illI1010I1.I00000oIO);
/* 684 */           il0IIIOll.registerEncoder(l1I1Il.class, ilo0l1.I00000oIO);
/* 691 */           il0IIIOll.registerEncoder(l10Ii0Oo1Oio.class, iliO1l0IOO.I00000oIO);
/* 698 */           il0IIIOll.registerEncoder(l0oiI1li.class, ilOlI1O.I00000oIO);
/* 705 */           il0IIIOll.registerEncoder(l0oo1l.class, ilOlo1.I00000oIO);
/* 712 */           il0IIIOll.registerEncoder(l0oO0I1.class, ilOiiii1O0I0.I00000oIO);
/* 719 */           il0IIIOll.registerEncoder(l100Il0I1l1l.class, ilOollOl0.I00000oIO);
/* 726 */           il0IIIOll.registerEncoder(l1OoiO0.class, io00IIlI0.I00000oIO);
/* 733 */           il0IIIOll.registerEncoder(l1Oloi1o.class, ilooo0iO1iO.I00000oIO);
/* 740 */           il0IIIOll.registerEncoder(iO11I0o0i.class, iiOiI11iOoOo.I00000oIO);
/* 747 */           il0IIIOll.registerEncoder(lIiO1IlOOo1I.class, l0I00ii1.I00000oIO);
/* 754 */           il0IIIOll.registerEncoder(lIiioliIlo.class, l0II1I.I00000oIO);
/* 761 */           il0IIIOll.registerEncoder(lIii011o100.class, l0I0OO0o.I00000oIO);
/* 768 */           il0IIIOll.registerEncoder(l0OIOOOlliO.class, il0oI1lo.I00000oIO);
/* 775 */           il0IIIOll.registerEncoder(l0lO1o.class, ilIlOlIi.I00000oIO);
/* 782 */           il0IIIOll.registerEncoder(l0lI1iI.class, ilIioi.I00000oIO);
/* 789 */           il0IIIOll.registerEncoder(l0l1Ol00lIoi.class, ilIOoIi1.I00000oIO);
/* 796 */           il0IIIOll.registerEncoder(l1iOI0.class, io11O0Ol0iIO.I00000oIO);
/* 803 */           il0IIIOll.registerEncoder(l1ilOI0oOi.class, io1Oi1O.I00000oIO);
/* 810 */           il0IIIOll.registerEncoder(l1ii0l0.class, io1IIIO.I00000oIO);
/* 817 */           il0IIIOll.registerEncoder(iOliIII.class, iilI10i0O0Oo.I00000oIO);
/* 824 */           il0IIIOll.registerEncoder(iOlI0o0II.class, iilIOOI0i.I00000oIO);
/* 831 */           il0IIIOll.registerEncoder(l1l11Il.class, ioI01l.I00000oIO);
/* 838 */           il0IIIOll.registerEncoder(l1lOoiII1l.class, ioIOolOo0.I00000oIO);
/* 845 */           il0IIIOll.registerEncoder(l1lI1iI.class, ioI1oll.I00000oIO);
/* 852 */           il0IIIOll.registerEncoder(OIilII0oO1.class, ioIO0l0.I00000oIO);
/* 859 */           il0IIIOll.registerEncoder(iOolllO0Ilii.class, iiliI1.I00000oIO);
/* 866 */           il0IIIOll.registerEncoder(iOoi0l1IOiiI.class, iilllIO0i.I00000oIO);
/* 873 */           il0IIIOll.registerEncoder(lIOIio.class, l01IOiOOl.I00000oIO);
/* 880 */           il0IIIOll.registerEncoder(lIO1i10I1o1o.class, l011i1ioi.I00000oIO);
/* 887 */           il0IIIOll.registerEncoder(lIi0lOOo10.class, l01io1lliO.I00000oIO);
/* 894 */           il0IIIOll.registerEncoder(lIiI001Olll.class, l01oOOOOI.I00000oIO);
/* 901 */           il0IIIOll.registerEncoder(l1oOoi1ooIi.class, ioOo0iOl.I00000oIO);
/* 908 */           il0IIIOll.registerEncoder(lI00l0oo.class, ioiI0Olo0lO0.I00000oIO);
/* 915 */           il0IIIOll.registerEncoder(l1ol0o.class, ioi0I1l.I00000oIO);
/* 922 */           il0IIIOll.registerEncoder(lI0000o0l.class, ioi0lI1oi0.I00000oIO);
/* 929 */           il0IIIOll.registerEncoder(ii100IiiOo0.class, iioI11Iliolo.I00000oIO);
/* 936 */           il0IIIOll.registerEncoder(ii0o1Oloo0i1.class, iioIl0IO.I00000oIO);
/* 943 */           il0IIIOll.registerEncoder(l111011iloo0.class, illIOO10.I00000oIO);
/* 950 */           il0IIIOll.registerEncoder(l10iI1.class, ill0oO1O0OiO.I00000oIO);
/* 957 */           il0IIIOll.registerEncoder(l1lio1l1.class, ioIl10l.I00000oIO);
/* 964 */           il0IIIOll.registerEncoder(l1loiOIllii.class, ioIoOl0OI.I00000oIO);
/* 971 */           il0IIIOll.registerEncoder(l1lloOI01o1.class, ioIllIii000l.I00000oIO);
/* 978 */           il0IIIOll.registerEncoder(ii01iIOIiiI.class, iilol0O0.I00000oIO);
/* 985 */           il0IIIOll.registerEncoder(ii00il1.class, iio0110.I00000oIO);
                }

                @Override
                public Object create(IOiOIoiiO0i iOiOIoiiO0i) {
                    switch (this.I00iOIl) {
                        case PoseLandmark.LEFT_INDEX:
/* 1 */                     return AnalyticsConnectorRegistrar.lambda$getComponents$0(iOiOIoiiO0i);
                        default:
/* 18 */                    return new o0lI0IiIl((Context) ((I1ii1o0) iOiOIoiiO0i).I00000oIO(Context.class));
                    }
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 4:
/* 14 */                    return "coil.request.NullRequestData";
                        case 15:
/* 11 */                    return "NO_SOURCE";
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override
                public Object zza() {
                    switch (this.I00iOIl) {
                        case PoseLandmark.RIGHT_INDEX:
/* 126 */                   List list = iol1II1ii1i.I00000oIO;
/* 142 */                   return (String) iIII0oi.I00000oOI.get();
                        case PoseLandmark.LEFT_THUMB:
/* 91 */                    List list2 = iol1II1ii1i.I00000oIO;
/* 95 */                    iI1lO0li.I00iiI.get();
/* 121 */                   return Integer.valueOf((int) ((Long) iI1liIi1li.I00000oIO.I00111O(47, 5000L, "measurement.sgtm.upload.max_queued_batches").get()).longValue());
                        case PoseLandmark.RIGHT_THUMB:
/* 64 */                    List list3 = iol1II1ii1i.I00000oIO;
/* 68 */                    iI1lO0li.I00iiI.get();
/* 88 */                    return (Long) iI1liIi1li.I00000oIO.I00111O(77, 1800000L, "measurement.upload.retry_time").get();
                        case PoseLandmark.LEFT_HIP:
/* 37 */                    List list4 = iol1II1ii1i.I00000oIO;
/* 41 */                    iI1lO0li.I00iiI.get();
/* 61 */                    return (Long) iI1liIi1li.I00000oIO.I00111O(61, 604800000L, "measurement.sdk.attribution.cache.ttl").get();
                        case PoseLandmark.RIGHT_HIP:
/* 12 */                    List list5 = iol1II1ii1i.I00000oIO;
/* 16 */                    iI1lO0li.I00iiI.get();
/* 34 */                    return (Boolean) iI1liIi1li.I00000oIO.I0010o(true, "measurement.config.default_flag_values", 10).get();
                        default:
/* 8 */                     return new TreeMap();
                    }
                }

                @Override
                public o0O110 mo31zzb(Class cls) {
/* 8 */             if (!o001IlOi0O.class.isAssignableFrom(cls)) {
/* 51 */                I000II.I000iOII("Unsupported message type: ".concat(cls.getName()));
/* 7 */                 return null;
                    }
                    try {
/* 23 */                return (o0O110) o001IlOi0O.I000o00OoI0I(cls.asSubclass(o001IlOi0O.class)).I000iOII(3, null);
                    } catch (Exception e) {
/* 37 */                OIiilo1Ool0o.I000iOII("Unable to get message info for ".concat(cls.getName()), e);
/* 7 */                 return null;
                    }
                }

                @Override
                public boolean zzc(Class cls) {
                    switch (this.I00iOIl) {
                        case 8:
/* 10 */                    return o001IlOi0O.class.isAssignableFrom(cls);
                        default:
/* 6 */                     return false;
                    }
                }

                @Override
/* 19 */        public void lock() {
                }

                @Override
/* 19 */        public void unlock() {
                }

                @Override
/* 54 */        public i1o1O0ioO zzb(Class cls) {
/* 55 */            throw new IllegalStateException("This should never be called.");
                }

                @Override
/* 144 */       public ilIoOl zza() {
/* 145 */           return new ilIoOl(5, 6, "AICore service disconnected", null, null);
                }
            }
