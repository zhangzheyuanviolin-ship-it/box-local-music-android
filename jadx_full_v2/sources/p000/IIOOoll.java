            package p000;

            import android.graphics.Bitmap;
            import android.hardware.camera2.params.DynamicRangeProfiles;
            import android.media.Image;
            import android.os.IInterface;
            import android.util.Log;
            import android.view.View;
            import androidx.work.multiprocess.RemoteListenableDelegatingWorker;
            import io.github.darriousliu.katex.freetype.FreeTypeAndroid;
            import java.io.BufferedInputStream;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.security.GeneralSecurityException;
            import java.security.Provider;
            import java.security.Security;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collection;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.LinkedHashSet;
            import java.util.List;
            import java.util.Set;
            import java.util.StringTokenizer;
            import kotlin.jvm.functions.Function1;
            
/* 27 */    public final class IIOOoll implements IoiO11I0o0o1, OoIoiillo, Ii1i0IloI1, IioI0ol1O0, Il0O1OllI, Illo1O0O10l, O0iI0IlO0iI, OOooio11i00, IlOOi0, OlilI1O, I0I1lIio, I11101ii1 {
                public static final IloooO0oI0l1 I00iiO = new IloooO0oI0l1(1);
                public final int I00iOIl;
                public Object I00iiI;

                /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public IIOOoll(int[] iArr, float[] fArr, float[][] fArr2) {
                    int i;
                    int i2;
                    int i3;
                    boolean z;
                    float fHypot;
                    float[] fArr3;
/* 3 */             float[] fArr4 = fArr;
/* 5 */             int i4 = 4;
/* 6 */             this.I00iOIl = 4;
/* 12 */            int i5 = 1;
/* 13 */            int length = fArr4.length - 1;
/* 14 */            I1Ii1iol[][] i1Ii1iolArr = new I1Ii1iol[length][];
/* 16 */            int i6 = 1;
/* 17 */            int i7 = 1;
/* 18 */            int i8 = 0;
/* 19 */            while (i8 < length) {
/* 21 */                int i9 = iArr[i8];
/* 26 */                if (i9 == 0) {
/* 52 */                    i7 = 3;
                        } else if (i9 == i5) {
/* 50 */                    i6 = i5;
/* 46 */                    i7 = i6;
                        } else {
/* 30 */                    if (i9 != 2) {
/* 32 */                        if (i9 == 3) {
/* 43 */                            if (i6 == i5) {
                                    }
/* 46 */                            i7 = i6;
                                } else if (i9 == i4) {
/* 41 */                            i7 = i4;
                                } else if (i9 == 5) {
/* 39 */                            i7 = 5;
                                }
                            }
/* 48 */                    i6 = 2;
/* 46 */                    i7 = i6;
                        }
/* 53 */                float[] fArr5 = fArr2[i8];
/* 55 */                int i10 = i8 + 1;
/* 57 */                float[] fArr6 = fArr2[i10];
/* 61 */                float f = fArr4[i8];
/* 63 */                float f2 = fArr4[i10];
/* 71 */                int length2 = (fArr5.length % 2) + (fArr5.length / 2);
/* 72 */                I1Ii1iol[] i1Ii1iolArr2 = new I1Ii1iol[length2];
/* 74 */                int i11 = 0;
/* 75 */                while (i11 < length2) {
/* 77 */                    int i12 = i11 * 2;
/* 81 */                    float f3 = fArr5[i12];
/* 83 */                    int i13 = i12 + 1;
/* 85 */                    int i14 = i11;
/* 87 */                    float f4 = fArr5[i13];
/* 89 */                    int i15 = length;
/* 91 */                    float f5 = fArr6[i12];
/* 93 */                    int i16 = i8;
/* 95 */                    float f6 = fArr6[i13];
/* 97 */                    I1Ii1iol i1Ii1iol = new I1Ii1iol();
/* 100 */                   i1Ii1iol.I00000oIO = f;
/* 102 */                   i1Ii1iol.I00000oOI = f2;
/* 104 */                   i1Ii1iol.I0000Il00O = f3;
/* 106 */                   i1Ii1iol.I0000O = f4;
/* 108 */                   i1Ii1iol.I0000oI00 = f5;
/* 110 */                   i1Ii1iol.I0001Ioi1lo = f6;
/* 114 */                   float f7 = f5 - f3;
/* 118 */                   float f8 = f6 - f4;
/* 140 */                   boolean z2 = i7 == 1 || (i7 == 4 ? f8 > 0.0f : !(i7 != 5 || f8 >= 0.0f));
/* 160 */                   float f9 = z2 ? -1.0f : 1.0f;
/* 162 */                   i1Ii1iol.I000lI = f9;
/* 166 */                   float f10 = f2;
/* 168 */                   float f11 = 1.0f / (f2 - f);
/* 170 */                   i1Ii1iol.I000iOII = f11;
/* 178 */                   float[] fArr7 = new float[101];
/* 180 */                   i1Ii1iol.I000OiO = fArr7;
/* 188 */                   boolean z3 = i7 == 3;
/* 190 */                   if (z3 || Math.abs(f7) < 0.001f || Math.abs(f8) < 0.001f) {
/* 211 */                       i = i6;
/* 213 */                       i2 = i7;
/* 215 */                       i3 = 1;
/* 422 */                       float fHypot2 = (float) Math.hypot(f8, f7);
/* 423 */                       i1Ii1iol.I000II = fHypot2;
/* 427 */                       i1Ii1iol.I000l1 = fHypot2 * f11;
/* 431 */                       i1Ii1iol.I00100o1O0lo = f7 * f11;
/* 435 */                       i1Ii1iol.I0010I0i = f8 * f11;
/* 439 */                       i1Ii1iol.I000o00OoI0I = Float.NaN;
/* 441 */                       i1Ii1iol.I000oI1ioi = Float.NaN;
/* 443 */                       z = true;
                            } else {
/* 221 */                       i1Ii1iol.I000o00OoI0I = f7 * f9;
/* 225 */                       i1Ii1iol.I000oI1ioi = f8 * (-f9);
/* 234 */                       i1Ii1iol.I00100o1O0lo = z2 ? f5 : f3;
/* 243 */                       i1Ii1iol.I0010I0i = z2 ? f4 : f6;
/* 245 */                       float f12 = f4 - f6;
/* 247 */                       float f13 = f12;
/* 251 */                       float f14 = 0.0f;
/* 253 */                       float f15 = 0.0f;
/* 255 */                       int i17 = 1;
                                while (true) {
/* 273 */                           double d = (float) (((i17 * 90.0d) / 90.0d) * 0.017453292519943295d);
/* 289 */                           float fSin = f7 * ((float) Math.sin(d));
/* 291 */                           float fCos = ((float) Math.cos(d)) * f12;
/* 292 */                           float f16 = f12;
/* 294 */                           float f17 = fSin - f14;
/* 298 */                           f14 = fSin;
                                    double d2 = f17;
/* 301 */                           float f18 = fCos - f13;
/* 303 */                           i = i6;
/* 305 */                           i2 = i7;
/* 313 */                           fHypot = f15 + ((float) Math.hypot(d2, f18));
/* 315 */                           fArr3 = OIi10iI0Iiii.I00000oIO;
/* 317 */                           fArr3[i17] = fHypot;
/* 321 */                           if (i17 == 90) {
                                        break;
                                    }
/* 323 */                           i17++;
/* 325 */                           f15 = fHypot;
/* 327 */                           i6 = i;
/* 329 */                           f12 = f16;
/* 331 */                           f13 = fCos;
/* 333 */                           i7 = i2;
                                }
/* 336 */                       i1Ii1iol.I000II = fHypot;
/* 338 */                       int i18 = 1;
                                while (true) {
/* 342 */                           fArr3[i18] = fArr3[i18] / fHypot;
/* 344 */                           if (i18 == 90) {
                                        break;
                                    } else {
/* 346 */                               i18++;
                                    }
                                }
/* 352 */                       for (int i19 = 0; i19 < 101; i19++) {
/* 357 */                           float f19 = i19 / 100.0f;
/* 361 */                           int iBinarySearch = Arrays.binarySearch(fArr3, 0, 91, f19);
/* 367 */                           if (iBinarySearch >= 0) {
/* 371 */                               fArr7[i19] = iBinarySearch / 90.0f;
                                    } else if (iBinarySearch == -1) {
/* 379 */                               fArr7[i19] = 0.0f;
                                    } else {
/* 382 */                               int i20 = -iBinarySearch;
                                        int i21 = i20 - 2;
                                        float f20 = i21;
/* 390 */                               float f21 = fArr3[i21];
/* 399 */                               fArr7[i19] = (((f19 - f21) / (fArr3[i20 - 1] - f21)) + f20) / 90.0f;
                                    }
                                }
/* 404 */                       i3 = 1;
/* 411 */                       i1Ii1iol.I000l1 = i1Ii1iol.I000II * i1Ii1iol.I000iOII;
/* 413 */                       z = z3;
                            }
/* 445 */                   i1Ii1iol.I00100l0 = z;
/* 447 */                   VarHandle.storeStoreFence();
/* 450 */                   i1Ii1iolArr2[i14] = i1Ii1iol;
/* 452 */                   i11 = i14 + 1;
/* 456 */                   i8 = i16;
/* 458 */                   i5 = i3;
/* 460 */                   i6 = i;
/* 462 */                   length = i15;
/* 464 */                   f2 = f10;
/* 466 */                   i7 = i2;
                        }
/* 480 */               i1Ii1iolArr[i8] = i1Ii1iolArr2;
/* 482 */               fArr4 = fArr;
/* 484 */               i8 = i10;
/* 485 */               i4 = 4;
                    }
/* 488 */           this.I00iiI = i1Ii1iolArr;
                }

                public static boolean I00O10llo(int i) {
                    return i == 32 || i == 9 || i == 13 || i == 10;
                }

                public static Set I00OIo(Set set) {
/* 5 */             if (set.isEmpty()) {
/* 7 */                 return Il01llIol0.I00iOIl;
                    }
/* 12 */            LinkedHashSet linkedHashSet = new LinkedHashSet();
/* 15 */            Iterator it = set.iterator();
/* 23 */            while (it.hasNext()) {
/* 31 */                long jLongValue = ((Number) it.next()).longValue();
/* 45 */                Iio1oiI iio1oiI = (Iio1oiI) IioI0IoOi.I00000oIO.get(Long.valueOf(jLongValue));
/* 47 */                if (iio1oiI == null && l11I11lO.I0000O(5, "CXCP")) {
/* 72 */                    Log.w("CXCP", "Dynamic range profile cannot be converted to a DynamicRange object: " + jLongValue);
                        }
/* 75 */                if (iio1oiI != null) {
/* 77 */                    linkedHashSet.add(iio1oiI);
                        }
                    }
/* 81 */            return Collections.unmodifiableSet(linkedHashSet);
                }

                public static O0llilIO0 I00i0O(IIOOoll iIOOoll, int i) {
/* 3 */             O0o0I1i0O o0o0I1i0O = (O0o0I1i0O) iIOOoll.I00iiI;
/* 5 */             Ol1il1o1 ol1il1o1I000OOo1O = iOl0lOIi11.I000OOo1O();
/* 17 */            Function1 function1I0000oI00 = ol1il1o1I000OOo1O != null ? ol1il1o1I000OOo1O.I0000oI00() : null;
/* 19 */            Ol1il1o1 ol1il1o1I000iOII = iOl0lOIi11.I000iOII(ol1il1o1I000OOo1O);
                    try {
/* 29 */                O0o00O1Oi00 o0o00O1Oi00 = (O0o00O1Oi00) o0o0I1i0O.I0001Ioi1lo.getValue();
/* 31 */                iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 34 */                O0llioI1 o0llioI1 = o0o0I1i0O.I00100o1O0lo;
/* 36 */                long j = o0o00O1Oi00.I000OiO;
/* 38 */                boolean z = o0o0I1i0O.I0000O;
/* 43 */                O0o01OIl o0o01OIl = new O0o01OIl(1);
/* 46 */                VarHandle.storeStoreFence();
/* 50 */                return o0llioI1.I00000oIO(i, j, z, o0o01OIl);
                    } catch (Throwable th) {
/* 57 */                iOl0lOIi11.I000oI1ioi(ol1il1o1I000OOo1O, ol1il1o1I000iOII, function1I0000oI00);
/* 89 */                throw th;
                    }
                }

                public static void I00i0ilIl0i(View view, IO0i1l1Io iO0i1l1Io) {
                    i00O10l1 i00o10l1;
/* 1 */             if (iO0i1l1Io != null) {
/* 7 */                 i00o10l1 = new i00O10l1(iO0i1l1Io.I00iOIl);
/* 15 */                i00o10l1.I0000O = new HashMap();
/* 17 */                i00o10l1.I00000oIO = iO0i1l1Io;
/* 19 */                VarHandle.storeStoreFence();
                    } else {
/* 23 */                i00o10l1 = null;
                    }
/* 24 */            view.setWindowInsetsAnimationCallback(i00o10l1);
                }

                public static void I00iIO(StringTokenizer stringTokenizer) throws IOException {
/* 5 */             if (!stringTokenizer.hasMoreTokens()) {
/* 34 */                IioIoO10iOiI.I000OOo1O("CharMetrics is missing a semicolon after a command");
/* 49 */                return;
                    }
/* 7 */             String strNextToken = stringTokenizer.nextToken();
/* 17 */            if (";".equals(strNextToken)) {
/* 19 */                return;
                    }
/* 28 */            IioIoO10iOiI.I000OOo1O(IlIi0I0.I000lI("Error: Expected semicolon in stream actual='", strNextToken, "'"));
                }

                @Override
                public int I00000oIO() {
/* 5 */             return ((Image.Plane) this.I00iiI).getRowStride();
                }

                @Override
                public float I00000oOI() {
/* 1 */             return 0.0f;
                }

                @Override
                public DynamicRangeProfiles I0000Il00O() {
/* 3 */             return (DynamicRangeProfiles) this.I00iiI;
                }

                @Override
                public Set I0000O() {
/* 9 */             return I00OIo(((DynamicRangeProfiles) this.I00iiI).getSupportedProfiles());
                }

                @Override
                public ByteBuffer I0000oI00() {
/* 5 */             return ((Image.Plane) this.I00iiI).getBuffer();
                }

                @Override
                public void I0001Ioi1lo(Object obj) {
                }

                @Override
                public Object I000II(OOOOI1ioIo oOOOI1ioIo, Object obj) {
/* 5 */             I00iiI(oOOOI1ioIo, (StringBuilder) obj, "getter");
/* 8 */             return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public Object I000O01llI0(Ooo00oi0O ooo00oi0O, Object obj) {
/* 8 */             ((IiOOllOI0io) this.I00iiI).I00Ol1ll1(ooo00oi0O, true, (StringBuilder) obj, true);
/* 11 */            return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public Object I000OiO(I01l00l i01l00l, Object obj) {
/* 8 */             ((IiOOllOI0io) this.I00iiI).I00OilO00Il(i01l00l, (StringBuilder) obj, true);
/* 11 */            return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public Object I000iOII(O0ioOi0Oo1ii o0ioOi0Oo1ii, Object obj) {
/* 7 */             ((StringBuilder) obj).append(o0ioOi0Oo1ii.getName());
/* 10 */            return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public OoIoiillI1 I000l1(String str) {
/* 3 */             IIOiool0I iIOiool0I = (IIOiool0I) this.I00iiI;
/* 5 */             IIOO0I iioo0i = iIOiool0I.I00iiO;
/* 9 */             if (iioo0i.I00000oIO) {
/* 40 */                I000II.I001IO000("Not a Type 1-equivalent font");
/* 43 */                return null;
                    }
/* 17 */            Integer num = (Integer) iioo0i.I0000O.get(str);
/* 33 */            return iIOiool0I.I0000oI00(iIOiool0I.I00iiO.I0000O(num == null ? 0 : num.intValue()), str);
                }

                @Override
                public void I000lI(OI1Iio0ii1 oI1Iio0ii1, Object obj) {
/* 3 */             OOlIll1 oOlIll1 = (OOlIll1) this.I00iiI;
/* 5 */             String strI00000oOI = oI1Iio0ii1.I00000oOI();
/* 15 */            if ("k".equals(strI00000oOI)) {
/* 19 */                if (obj instanceof Integer) {
/* 25 */                    O0i1lIiil.I00iiI.getClass();
/* 34 */                    O0i1lIiil o0i1lIiil = (O0i1lIiil) O0i1lIiil.I00iiO.get((Integer) obj);
/* 36 */                    if (o0i1lIiil == null) {
/* 38 */                        o0i1lIiil = O0i1lIiil.I00iio;
                            }
/* 40 */                    oOlIll1.I00io1l = o0i1lIiil;
/* 42 */                    return;
                        }
/* 103 */               return;
                    }
/* 49 */            if ("mv".equals(strI00000oOI)) {
/* 53 */                if (obj instanceof int[]) {
/* 57 */                    oOlIll1.I00iOIl = (int[]) obj;
                        }
                    } else {
/* 66 */                if ("xs".equals(strI00000oOI)) {
/* 70 */                    if (obj instanceof String) {
/* 72 */                        String str = (String) obj;
/* 78 */                        if (str.isEmpty()) {
/* 103 */                           return;
                                }
/* 80 */                        oOlIll1.I00iiI = str;
/* 82 */                        return;
                            }
/* 103 */                   return;
                        }
/* 89 */                if (!"xi".equals(strI00000oOI)) {
/* 106 */                   "pn".equals(strI00000oOI);
                        } else if (obj instanceof Integer) {
/* 101 */                   oOlIll1.I00iiO = ((Integer) obj).intValue();
                        }
                    }
                }

                @Override
                public float I000o00OoI0I(float f, long j) {
/* 4 */             long j2 = j / 1000000;
/* 9 */             IlOIloII11i ilOIloII11iI00000oIO = ((Iio1o1I) this.I00iiI).I00000oIO(f);
/* 13 */            long j3 = ilOIloII11iI00000oIO.I0000Il00O;
/* 47 */            return (((Math.signum(ilOIloII11iI00000oIO.I00000oIO) * I0oI1I0IO01.I00000oIO(j3 > 0 ? j2 / j3 : 1.0f).I00000oOI) * ilOIloII11iI00000oIO.I00000oOI) / j3) * 1000.0f;
                }

                @Override
                public float I000oI1ioi(float f, float f2, long j) {
/* 4 */             long j2 = j / 1000000;
/* 9 */             IlOIloII11i ilOIloII11iI00000oIO = ((Iio1o1I) this.I00iiI).I00000oIO(f2);
/* 13 */            long j3 = ilOIloII11iI00000oIO.I0000Il00O;
/* 43 */            return (Math.signum(ilOIloII11iI00000oIO.I00000oIO) * ilOIloII11iI00000oIO.I00000oOI * I0oI1I0IO01.I00000oIO(j3 > 0 ? j2 / j3 : 1.0f).I00000oIO) + f;
                }

                @Override
                public Object I00100l0(OOOOOO0O oooooo0o, Object obj) {
/* 5 */             I00iiI(oooooo0o, (StringBuilder) obj, "setter");
/* 8 */             return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public Set I00100o1O0lo(Iio1oiI iio1oiI) {
/* 1 */             LinkedHashMap linkedHashMap = IioI0IoOi.I00000oIO;
/* 5 */             DynamicRangeProfiles dynamicRangeProfiles = (DynamicRangeProfiles) this.I00iiI;
/* 7 */             Long lI00000oIO = IioI0IoOi.I00000oIO(iio1oiI, dynamicRangeProfiles);
/* 11 */            if (lI00000oIO != null) {
/* 21 */                return I00OIo(dynamicRangeProfiles.getProfileCaptureRequestConstraints(lI00000oIO.longValue()));
                    }
/* 28 */            OIiilo1Ool0o.I000O01llI0("DynamicRange is not supported: ", iio1oiI);
/* 31 */            return null;
                }

                @Override
                public int I0010I0i() {
/* 5 */             return ((Image.Plane) this.I00iiI).getPixelStride();
                }

                @Override
                public Object I0010o(O0o0oOii o0o0oOii, Object obj) {
/* 1 */             StringBuilder sb = (StringBuilder) obj;
/* 5 */             IiOOllOI0io iiOOllOI0io = (IiOOllOI0io) this.I00iiI;
/* 7 */             iiOOllOI0io.getClass();
/* 10 */            Ill0IO ill0IO = o0o0oOii.I00iio;
/* 18 */            sb.append(iiOOllOI0io.I00IO1oi11O("package"));
/* 31 */            String strI000o00OoI0I = iiOOllOI0io.I000o00OoI0I(lIoO00iOo.I0000Il00O(Ill0OI0lo.I0001Ioi1lo(ill0IO.I00000oIO)));
/* 39 */            if (strI000o00OoI0I.length() > 0) {
/* 43 */                sb.append(" ");
/* 46 */                sb.append(strI000o00OoI0I);
                    }
/* 55 */            if (iiOOllOI0io.I00000oIO.I000o00OoI0I()) {
/* 59 */                sb.append(" in context of ");
/* 65 */                iiOOllOI0io.I00IoO0(o0o0oOii.I00iiO, sb, false);
                    }
/* 68 */            return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public Object I00111O(IiOoI0oI iiOoI0oI, Object obj) {
/* 1 */             StringBuilder sb = (StringBuilder) obj;
/* 5 */             IiOOllOI0io iiOOllOI0io = (IiOOllOI0io) this.I00iiI;
/* 7 */             iiOOllOI0io.getClass();
/* 11 */            iiOOllOI0io.I001i1O0Ol(sb, iiOoI0oI, null);
/* 16 */            iiOOllOI0io.I00i01iIIliI(iiOoI0oI.I00ilO0, sb);
/* 19 */            iiOOllOI0io.I00IioO0OiOi(iiOoI0oI, sb);
/* 28 */            sb.append(iiOOllOI0io.I00IO1oi11O("typealias"));
/* 33 */            sb.append(" ");
/* 37 */            iiOOllOI0io.I00IoO0(iiOoI0oI, sb, true);
/* 45 */            iiOOllOI0io.I00Ol00(iiOoI0oI.I00io1l(), sb, false);
/* 48 */            iiOOllOI0io.I001iOo1i0O(iiOoI0oI, sb);
/* 53 */            sb.append(" = ");
/* 64 */            sb.append(iiOOllOI0io.I00OIl(iiOoI0oI.I010l10O()));
/* 67 */            return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public long I001IIilI0O(float f) {
/* 30 */            return ((long) (Math.exp(((Iio1o1I) this.I00iiI).I0000Il00O(f) / (IlOIoO11li.I00000oIO - 1.0d)) * 1000.0d)) * 1000000;
                }

                @Override
                public Object I001i1O0Ol(OI0011 oi0011, Object obj) {
/* 8 */             ((IiOOllOI0io) this.I00iiI).I00IoO0(oi0011, (StringBuilder) obj, true);
/* 11 */            return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public O0iI1ol I001i1lo1io(OI1Iio0ii1 oI1Iio0ii1) {
/* 1 */             String strI00000oOI = oI1Iio0ii1.I00000oOI();
/* 11 */            if ("d1".equals(strI00000oOI)) {
/* 16 */                return new OOlIio(this, 0);
                    }
/* 26 */            if ("d2".equals(strI00000oOI)) {
/* 31 */                return new OOlIio(this, 1);
                    }
/* 35 */            return null;
                }

                @Override
                public Object I001l0I00(OOOO1o oOOO1o, Object obj) {
/* 7 */             ((IiOOllOI0io) this.I00iiI).I00O10llo(oOOO1o, (StringBuilder) obj);
/* 10 */            return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public void I001lIiIIo1O(IInterface iInterface, OOoolO01Ioo oOoolO01Ioo) {
/* 1 */             IoOl0I1Io1O ioOl0I1Io1O = (IoOl0I1Io1O) iInterface;
/* 5 */             RemoteListenableDelegatingWorker remoteListenableDelegatingWorker = (RemoteListenableDelegatingWorker) this.I00iiI;
/* 13 */            String strI0000Il00O = remoteListenableDelegatingWorker.getInputData().I0000Il00O("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
/* 17 */            if (strI0000Il00O != null) {
/* 30 */                ioOl0I1Io1O.I001l0I00(oOoolO01Ioo, l1oOOloO0.I00000oIO(new OIoo0oi0lIO0(strI0000Il00O, remoteListenableDelegatingWorker.I00000oOI)));
                    } else {
/* 36 */                I000II.I000iOII("Need to specify a class name for the RemoteListenableWorker to delegate to.");
                    }
                }

                @Override
                public float I001lllioOl(float f, float f2) {
/* 5 */             double dI0000Il00O = ((Iio1o1I) this.I00iiI).I0000Il00O(f2);
/* 9 */             double d = IlOIoO11li.I00000oIO;
/* 35 */            return (Math.signum(f2) * ((float) (Math.exp((d / (d - 1.0d)) * dI0000Il00O) * r8.I00iOIl * r8.I00iiI))) + f;
                }

                @Override
                public Object I001lloI(Illlil illlil, Object obj) {
/* 3 */             I00iIi0i1o(illlil, (StringBuilder) obj);
/* 6 */             return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public Object I00II0Ol1O0l(OI000ilOol oI000ilOol, Object obj) throws IOException {
                    IOIO10lo iOIO10loI00ll1;
                    String str;
/* 2 */             StringBuilder sb = (StringBuilder) obj;
/* 6 */             IiOOllOI0io iiOOllOI0io = (IiOOllOI0io) this.I00iiI;
/* 8 */             IiOi1I iiOi1I = iiOOllOI0io.I00000oIO;
/* 17 */            int i = 1;
/* 22 */            boolean z = oI000ilOol.I00II0oii1o() == IOIOllO1oli.I00iio;
/* 30 */            if (!iiOOllOI0io.I00100l0()) {
/* 36 */                iiOOllOI0io.I001lIiIIo1O(sb, oI000ilOol.I001i1O0Ol());
/* 39 */                iiOOllOI0io.I001i1O0Ol(sb, oI000ilOol, null);
/* 42 */                if (!z) {
/* 48 */                    iiOOllOI0io.I00i01iIIliI(oI000ilOol.I000OiO(), sb);
                        }
/* 57 */                if ((oI000ilOol.I00II0oii1o() != IOIOllO1oli.I00iiI || oI000ilOol.I001IO000() != O1oIIloii0.I00ilI0I1) && (!oI000ilOol.I00II0oii1o().I00000oIO() || oI000ilOol.I001IO000() != O1oIIloii0.I00iiI)) {
/* 93 */                    iiOOllOI0io.I00IlilI0i0i(oI000ilOol.I001IO000(), sb, IiOOllOI0io.I00111O(oI000ilOol));
                        }
/* 96 */                iiOOllOI0io.I00IioO0OiOi(oI000ilOol, sb);
/* 122 */               iiOOllOI0io.I00Io1o110i(sb, iiOOllOI0io.I000oI1ioi().contains(IiOOllo1o.I00ioIO) && oI000ilOol.I000iOII(), "inner");
/* 148 */               iiOOllOI0io.I00Io1o110i(sb, iiOOllOI0io.I000oI1ioi().contains(IiOOllo1o.I00l0OO0IO) && oI000ilOol.I00o0iI0io1(), "data");
/* 174 */               iiOOllOI0io.I00Io1o110i(sb, iiOOllOI0io.I000oI1ioi().contains(IiOOllo1o.I00li1OI) && oI000ilOol.I00100o1O0lo(), "inline");
/* 200 */               iiOOllOI0io.I00Io1o110i(sb, iiOOllOI0io.I000oI1ioi().contains(IiOOllo1o.I00o101lO) && oI000ilOol.I00o101lO(), "value");
/* 226 */               iiOOllOI0io.I00Io1o110i(sb, iiOOllOI0io.I000oI1ioi().contains(IiOOllo1o.I00o0l1o1o0) && oI000ilOol.I00o0l1o1o0(), "fun");
/* 233 */               if (oI000ilOol.I00lll10()) {
/* 28 */                    str = "companion object";
                        } else {
/* 241 */                   int iOrdinal = oI000ilOol.I00II0oii1o().ordinal();
/* 245 */                   if (iOrdinal == 0) {
/* 280 */                       str = "class";
                            } else if (iOrdinal == 1) {
/* 277 */                       str = "interface";
                            } else if (iOrdinal == 2) {
/* 274 */                       str = "enum class";
                            } else if (iOrdinal == 3) {
/* 271 */                       str = "enum entry";
                            } else if (iOrdinal == 4) {
/* 268 */                       str = "annotation class";
                            } else {
/* 259 */                       if (iOrdinal != 5) {
/* 264 */                           I000II.I00000oIO();
/* 27 */                            return null;
                                }
/* 261 */                       str = "object";
                            }
                        }
/* 286 */               sb.append(iiOOllOI0io.I00IO1oi11O(str));
                    }
/* 293 */           if (IiOiIO0i1Oil.I000iOII(oI000ilOol)) {
/* 308 */               IiOi1110 iiOi1110 = iiOi1I.I00IO1oi11O;
/* 314 */               O0O00I1Ili o0O00I1Ili = IiOi1I.I00OilO00Il[31];
/* 324 */               if (((Boolean) iiOi1110.I00000oIO).booleanValue()) {
/* 330 */                   if (iiOOllOI0io.I00100l0()) {
/* 332 */                       sb.append("companion object");
                            }
/* 335 */                   IiOOllOI0io.I00OIO1(sb);
/* 338 */                   Ii1Ool1 ii1Ool1I000lI = oI000ilOol.I000lI();
/* 342 */                   if (ii1Ool1I000lI != null) {
/* 346 */                       sb.append("of ");
/* 357 */                       sb.append(iiOOllOI0io.I00IoIO0lI(ii1Ool1I000lI.getName(), false));
                            }
                        }
/* 364 */               if (iiOOllOI0io.I0010o() || !O0000Ioio00.I0000O(oI000ilOol.getName(), OlIIoO0Ol0o1.I00000oOI)) {
/* 382 */                   if (!iiOOllOI0io.I00100l0()) {
/* 384 */                       IiOOllOI0io.I00OIO1(sb);
                            }
/* 395 */                   sb.append(iiOOllOI0io.I00IoIO0lI(oI000ilOol.getName(), true));
                        }
                    } else {
/* 299 */               if (!iiOOllOI0io.I00100l0()) {
/* 301 */                   IiOOllOI0io.I00OIO1(sb);
                        }
/* 304 */               iiOOllOI0io.I00IoO0(oI000ilOol, sb, true);
                    }
/* 398 */           if (!z) {
/* 402 */               List listI00io1l = oI000ilOol.I00io1l();
/* 406 */               iiOOllOI0io.I00Ol00(listI00io1l, sb, false);
/* 409 */               iiOOllOI0io.I001iOo1i0O(oI000ilOol, sb);
/* 420 */               if (!oI000ilOol.I00II0oii1o().I00000oIO()) {
/* 422 */                   IiOi1110 iiOi11102 = iiOi1I.I000OOo1O;
/* 427 */                   O0O00I1Ili o0O00I1Ili2 = IiOi1I.I00OilO00Il[7];
/* 437 */                   if (((Boolean) iiOi11102.I00000oIO).booleanValue() && (iOIO10loI00ll1 = oI000ilOol.I00ll1()) != null) {
/* 447 */                       sb.append(" ");
/* 450 */                       iiOOllOI0io.I001i1O0Ol(sb, iOIO10loI00ll1, null);
/* 457 */                       iiOOllOI0io.I00i01iIIliI(iOIO10loI00ll1.I000OiO(), sb);
/* 466 */                       sb.append(iiOOllOI0io.I00IO1oi11O("constructor"));
/* 479 */                       iiOOllOI0io.I00OloOo(iOIO10loI00ll1.I00Iooi00oi(), iOIO10loI00ll1.I001lloI(), sb);
                            }
                        }
/* 482 */               IiOi1110 iiOi11103 = iiOi1I.I001i1lo1io;
/* 488 */               O0O00I1Ili o0O00I1Ili3 = IiOi1I.I00OilO00Il[22];
/* 498 */               if (!((Boolean) iiOi11103.I00000oIO).booleanValue() && !O0i1lI0o1io.I00II0oii1o(oI000ilOol.I00Ol10())) {
/* 516 */                   Collection collectionI0000oI00 = oI000ilOol.I000OOo1O().I0000oI00();
/* 524 */                   if (!collectionI0000oI00.isEmpty() && (collectionI0000oI00.size() != 1 || !O0i1lI0o1io.I001i1lo1io((O0iIl1) collectionI0000oI00.iterator().next()))) {
/* 549 */                       IiOOllOI0io.I00OIO1(sb);
/* 554 */                       sb.append(": ");
/* 562 */                       IiOOlOlI1I0 iiOOlOlI1I0 = new IiOOlOlI1I0(i);
/* 565 */                       iiOOlOlI1I0.I00iiI = iiOOllOI0io;
/* 567 */                       VarHandle.storeStoreFence();
/* 576 */                       IOOi0Ool1i.I00IioO0OiOi(collectionI0000oI00, sb, ", ", null, null, iiOOlOlI1I0, 60);
                            }
                        }
/* 579 */               iiOOllOI0io.I00i0O(sb, listI00io1l);
                    }
/* 582 */           return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public void I00II0oii1o(Throwable th) throws Exception {
/* 5 */             ((IoiO1IO1I1i) this.I00iiI).close();
                }

                @Override
                public O0iI0IlO0iI I00IO1(IOIOill iOIOill, OI1Iio0ii1 oI1Iio0ii1) {
/* 1 */             return null;
                }

                @Override
                public Object I00IO1oi11O(String str) {
/* 3 */             Il0OlI il0OlI = (Il0OlI) this.I00iiI;
/* 9 */             String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
/* 15 */            ArrayList arrayList = new ArrayList();
/* 20 */            for (int i = 0; i < 2; i++) {
/* 24 */                Provider provider = Security.getProvider(strArr[i]);
/* 28 */                if (provider != null) {
/* 30 */                    arrayList.add(provider);
                        }
                    }
/* 36 */            Iterator it = arrayList.iterator();
/* 41 */            Exception exc = null;
/* 46 */            while (it.hasNext()) {
                        try {
/* 54 */                    return il0OlI.I0000oI00(str, (Provider) it.next());
                        } catch (Exception e) {
/* 60 */                    if (exc == null) {
/* 62 */                        exc = e;
                            }
                        }
                    }
/* 64 */            return il0OlI.I0000oI00(str, null);
                }

                @Override
                public int I00IOO() {
/* 7 */             return ((OlilIol) this.I00iiI).I00iio.length;
                }

                @Override
                public Object I00IioO0OiOi(OIo0l0 oIo0l0, Object obj) {
/* 1 */             StringBuilder sb = (StringBuilder) obj;
/* 5 */             IiOOllOI0io iiOOllOI0io = (IiOOllOI0io) this.I00iiI;
/* 7 */             iiOOllOI0io.getClass();
/* 10 */            Ill0IO ill0IO = oIo0l0.I00ilI0I1;
/* 18 */            sb.append(iiOOllOI0io.I00IO1oi11O("package-fragment"));
/* 31 */            String strI000o00OoI0I = iiOOllOI0io.I000o00OoI0I(lIoO00iOo.I0000Il00O(Ill0OI0lo.I0001Ioi1lo(ill0IO.I00000oIO)));
/* 39 */            if (strI000o00OoI0I.length() > 0) {
/* 43 */                sb.append(" ");
/* 46 */                sb.append(strI000o00OoI0I);
                    }
/* 55 */            if (iiOOllOI0io.I00000oIO.I000o00OoI0I()) {
/* 59 */                sb.append(" in ");
/* 67 */                iiOOllOI0io.I00IoO0(oIo0l0.I010iIIOlo(), sb, false);
                    }
/* 70 */            return OoiIlOl1iI.I00000oIO;
                }

                public void I00IlilI0i0i(float f, float f2, float f3, float f4, int i) {
/* 14 */            ((IOO000ilo) this.I00iiI).I0010o().I000lI(f, f2, f3, f4, i);
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x00f2  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I00Io1lO(IIolOo iIolOo, I0oiil10Ili i0oiil10Ili, int i, float f) throws O1Ooo1IIioo {
                    String str;
                    String str2;
                    float f2;
                    long j;
                    char c;
                    II0lO0IOI iI0lO0IOI;
/* 11 */            O1Ill0ioO10 o1Ill0ioO10 = (O1Ill0ioO10) this.I00iiI;
/* 13 */            Il1oollOO1iI il1oollOO1iI = o1Ill0ioO10.I0000O;
/* 15 */            String str3 = o1Ill0ioO10.I00000oOI;
/* 17 */            float f3 = o1Ill0ioO10.I00000oIO;
/* 24 */            il1oollOO1iI.getClass();
/* 27 */            long j2 = il1oollOO1iI.I00000oIO;
/* 30 */            FreeTypeAndroid freeTypeAndroid = IoOil1.I00000oIO;
/* 43 */            freeTypeAndroid.setCharSize(il1oollOO1iI.I00000oIO, 0, (int) (f3 * 64.0f), 0, 0);
/* 50 */            if (i != 0) {
/* 52 */                f2 = 0.0f;
/* 60 */                if (freeTypeAndroid.loadGlyph(j2, i, 8)) {
/* 62 */                    II0lO0IOI iI0lO0IOII00000oIO = il1oollOO1iI.I00000oIO();
/* 73 */                    II0lO0IOI iI0lO0IOII00000oIO2 = iI0lO0IOII00000oIO != null ? iI0lO0IOII00000oIO.I00000oIO() : null;
/* 74 */                    if (iI0lO0IOII00000oIO2 != null) {
/* 76 */                        j = 4294967295L;
/* 81 */                        long j3 = iI0lO0IOII00000oIO2.I00000oIO;
/* 107 */                       StringBuilder sb = new StringBuilder();
/* 110 */                       sb.append(i);
/* 113 */                       c = ' ';
/* 48 */                        str2 = "-";
/* 117 */                       sb.append(str2);
/* 120 */                       sb.append(str3);
/* 123 */                       sb.append(str2);
/* 126 */                       sb.append(f3);
/* 129 */                       sb.append(str2);
/* 132 */                       sb.append((int) (freeTypeAndroid.glyphMetricsGetWidth(j3) / 64.0f));
/* 46 */                        str = "x";
/* 137 */                       sb.append(str);
/* 140 */                       sb.append((int) (freeTypeAndroid.glyphMetricsGetHeight(j3) / 64.0f));
/* 153 */                       I0oO00o i0oO00o = (I0oO00o) II0lOlo.I00000oIO.I0000Il00O(sb.toString());
/* 155 */                       if (i0oO00o != null) {
/* 190 */                           iIolOo.I000oI1ioi(i0oO00o, (Float.floatToRawIntBits(f + (freeTypeAndroid.glyphMetricsGetHoriBearingX(j3) / 64.0f)) << 32) | (Float.floatToRawIntBits(0.0f - (freeTypeAndroid.glyphMetricsGetHoriBearingY(j3) / 64.0f)) & 4294967295L), i0oiil10Ili);
/* 193 */                           return;
                                }
/* 209 */                       if (i == 0 && freeTypeAndroid.loadGlyph(j2, i, 4)) {
/* 218 */                           II0lO0IOI iI0lO0IOII00000oIO3 = il1oollOO1iI.I00000oIO();
/* 222 */                           if (iI0lO0IOII00000oIO3 != null) {
/* 226 */                               long jGlyphSlotGetBitmap = freeTypeAndroid.glyphSlotGetBitmap(iI0lO0IOII00000oIO3.I00000oIO);
/* 243 */                               iI0lO0IOI = jGlyphSlotGetBitmap == 0 ? null : new II0lO0IOI(jGlyphSlotGetBitmap);
                                    }
/* 244 */                           if (iI0lO0IOI != null) {
/* 246 */                               long j4 = iI0lO0IOI.I00000oIO;
/* 252 */                               if (freeTypeAndroid.bitmapGetWidth(j4) == 0 || freeTypeAndroid.bitmapGetRows(j4) == 0) {
/* 392 */                                   if (i != 1 && i != 33) {
/* 412 */                                       throw new O1Ooo1IIioo(IIlIOloOOO.I00100l0("missing glyph slot ", i, "."));
                                            }
/* 483 */                                   return;
                                        }
/* 302 */                               String str4 = i + str2 + str3 + str2 + f3 + str2 + freeTypeAndroid.bitmapGetWidth(j4) + str + freeTypeAndroid.bitmapGetRows(j4);
/* 306 */                               II0lOOiol iI0lOOiol = II0lOlo.I00000oIO;
/* 312 */                               I0oO00o i0oO00o2 = (I0oO00o) iI0lOOiol.I0000Il00O(str4);
/* 314 */                               if (i0oO00o2 == null) {
/* 316 */                                   int iBitmapGetWidth = freeTypeAndroid.bitmapGetWidth(j4);
/* 320 */                                   int iBitmapGetRows = freeTypeAndroid.bitmapGetRows(j4);
/* 324 */                                   OI1OOIOiOI1 oI1OOIOiOI1BitmapGetBuffer = freeTypeAndroid.bitmapGetBuffer(j4);
/* 330 */                                   Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iBitmapGetWidth, iBitmapGetRows, Bitmap.Config.ALPHA_8);
/* 336 */                                   bitmapCreateBitmap.copyPixelsFromBuffer(oI1OOIOiOI1BitmapGetBuffer.I00000oIO);
/* 341 */                                   I0oO00o i0oO00o3 = new I0oO00o(bitmapCreateBitmap);
/* 344 */                                   iI0lOOiol.I0000O(str4, i0oO00o3);
/* 347 */                                   i0oO00o2 = i0oO00o3;
                                        }
/* 352 */                               long j5 = iI0lO0IOII00000oIO3.I00000oIO().I00000oIO;
/* 387 */                               iIolOo.I000oI1ioi(i0oO00o2, (Float.floatToRawIntBits(f + (freeTypeAndroid.glyphMetricsGetHoriBearingX(j5) / 64.0f)) << c) | (Float.floatToRawIntBits(f2 - (freeTypeAndroid.glyphMetricsGetHoriBearingY(j5) / 64.0f)) & j), i0oiil10Ili);
/* 390 */                               return;
                                    }
/* 483 */                           return;
                                }
                            }
                        }
/* 46 */                str = "x";
/* 48 */                str2 = "-";
                    } else {
/* 46 */                str = "x";
/* 48 */                str2 = "-";
/* 206 */               f2 = 0.0f;
                    }
/* 196 */           j = 4294967295L;
/* 201 */           c = ' ';
/* 209 */           if (i == 0) {
                    }
                }

                public List I00Io1o110i(String str, List list) {
/* 1 */             IIOOoi1IlOi iIOOoi1IlOiI00Iooi00oi = I00Iooi00oi(str);
/* 5 */             if (iIOOoi1IlOiI00Iooi00oi != null) {
/* 7 */                 ArrayList arrayList = iIOOoi1IlOiI00Iooi00oi.I00000oIO;
/* 13 */                if (!arrayList.isEmpty()) {
/* 15 */                    return arrayList;
                        }
                    }
/* 89 */            return list;
                }

                @Override
                public Object I00IoIO0lI(IOIO10lo iOIO10lo, Object obj) {
                    IOIO10lo iOIO10loI00ll1;
/* 1 */             boolean z = iOIO10lo.I00oooO;
/* 3 */             StringBuilder sb = (StringBuilder) obj;
/* 7 */             IiOOllOI0io iiOOllOI0io = (IiOOllOI0io) this.I00iiI;
/* 9 */             iiOOllOI0io.getClass();
/* 13 */            iiOOllOI0io.I001i1O0Ol(sb, iOIO10lo, null);
/* 16 */            IiOi1I iiOi1I = iiOOllOI0io.I00000oIO;
/* 18 */            IiOi1110 iiOi1110 = iiOi1I.I000oI1ioi;
/* 20 */            O0O00I1Ili[] o0O00I1IliArr = IiOi1I.I00OilO00Il;
/* 24 */            O0O00I1Ili o0O00I1Ili = o0O00I1IliArr[13];
/* 62 */            boolean z2 = (((Boolean) iiOi1110.I00000oIO).booleanValue() || iOIO10lo.I001l0I00().I001IO000() != O1oIIloii0.I00iiO) && iiOOllOI0io.I00i01iIIliI(iOIO10lo.I000OiO(), sb);
/* 63 */            iiOOllOI0io.I00IOO(iOIO10lo, sb);
/* 66 */            IiOi1110 iiOi11102 = iiOi1I.I00Iooi00oi;
/* 70 */            O0O00I1Ili o0O00I1Ili2 = o0O00I1IliArr[40];
/* 89 */            boolean z3 = ((Boolean) iiOi11102.I00000oIO).booleanValue() || !z || z2;
/* 90 */            if (z3) {
/* 98 */                sb.append(iiOOllOI0io.I00IO1oi11O("constructor"));
                    }
/* 101 */           OI000ilOol oI000ilOolI0110o = iOIO10lo.I000lI();
/* 105 */           IiOi1110 iiOi11103 = iiOi1I.I001lIiIIo1O;
/* 109 */           O0O00I1Ili o0O00I1Ili3 = o0O00I1IliArr[25];
/* 119 */           if (((Boolean) iiOi11103.I00000oIO).booleanValue()) {
/* 121 */               if (z3) {
/* 125 */                   sb.append(" ");
                        }
/* 128 */               iiOOllOI0io.I00IoO0(oI000ilOolI0110o, sb, true);
/* 135 */               iiOOllOI0io.I00Ol00(iOIO10lo.getTypeParameters(), sb, false);
                    }
/* 148 */           iiOOllOI0io.I00OloOo(iOIO10lo.I00Iooi00oi(), iOIO10lo.I001lloI(), sb);
/* 151 */           IiOi1110 iiOi11104 = iiOi1I.I00100o1O0lo;
/* 155 */           O0O00I1Ili o0O00I1Ili4 = o0O00I1IliArr[15];
/* 165 */           if (((Boolean) iiOi11104.I00000oIO).booleanValue() && !z && (iOIO10loI00ll1 = oI000ilOolI0110o.I00ll1()) != null) {
/* 175 */               List listI00Iooi00oi = iOIO10loI00ll1.I00Iooi00oi();
/* 183 */               ArrayList arrayList = new ArrayList();
/* 194 */               for (Object obj2 : listI00Iooi00oi) {
/* 201 */                   Ooo00oi0O ooo00oi0O = (Ooo00oi0O) obj2;
/* 207 */                   if (!ooo00oi0O.I010ioo() && ooo00oi0O.I00l0OO0IO == null) {
/* 213 */                       arrayList.add(obj2);
                            }
                        }
/* 221 */               if (!arrayList.isEmpty()) {
/* 225 */                   sb.append(" : ");
/* 234 */                   sb.append(iiOOllOI0io.I00IO1oi11O("this"));
/* 251 */                   sb.append(IOOi0Ool1i.I00IlilI0i0i(arrayList, ", ", "(", ")", I0ollliOo0.I0100i, 24));
                        }
                    }
/* 254 */           IiOi1110 iiOi11105 = iiOi1I.I001lIiIIo1O;
/* 258 */           O0O00I1Ili o0O00I1Ili5 = IiOi1I.I00OilO00Il[25];
/* 268 */           if (((Boolean) iiOi11105.I00000oIO).booleanValue()) {
/* 274 */               iiOOllOI0io.I00i0O(sb, iOIO10lo.getTypeParameters());
                    }
/* 277 */           return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public Boolean I00IoO0(String str) {
/* 1 */             IIOOoi1IlOi iIOOoi1IlOiI00Iooi00oi = I00Iooi00oi(str);
/* 5 */             boolean zBooleanValue = false;
/* 6 */             if (iIOOoi1IlOiI00Iooi00oi != null) {
/* 8 */                 ArrayList arrayList = iIOOoi1IlOiI00Iooi00oi.I00000oIO;
/* 14 */                if (!arrayList.isEmpty()) {
/* 16 */                    Boolean bool = Boolean.FALSE;
/* 22 */                    Number number = (Number) arrayList.get(0);
/* 26 */                    if (number instanceof Integer) {
/* 28 */                        int iIntValue = number.intValue();
/* 32 */                        if (iIntValue != 0) {
/* 35 */                            if (iIntValue == 1) {
/* 38 */                                bool = Boolean.TRUE;
                                    }
                                }
/* 68 */                        zBooleanValue = bool.booleanValue();
                            } else {
/* 65 */                        Log.w("PdfBox-Android", "Expected boolean, got " + number + ", returning default " + bool);
/* 68 */                        zBooleanValue = bool.booleanValue();
                            }
                        }
                    }
/* 72 */            return Boolean.valueOf(zBooleanValue);
                }

                public List I00IoiI(String str) {
/* 1 */             IIOOoi1IlOi iIOOoi1IlOiI00Iooi00oi = I00Iooi00oi(str);
/* 5 */             if (iIOOoi1IlOiI00Iooi00oi == null) {
/* 61 */                return null;
                    }
/* 7 */             ArrayList arrayList = iIOOoi1IlOiI00Iooi00oi.I00000oIO;
/* 13 */            if (arrayList.isEmpty()) {
/* 61 */                return null;
                    }
/* 17 */            ArrayList arrayList2 = new ArrayList(arrayList);
/* 25 */            for (int i = 1; i < arrayList2.size(); i++) {
/* 33 */                Number number = (Number) arrayList2.get(i - 1);
/* 54 */                arrayList2.set(i, Integer.valueOf(((Number) arrayList2.get(i)).intValue() + number.intValue()));
                    }
/* 60 */            return arrayList2;
                }

                public IIOOoi1IlOi I00Iooi00oi(String str) {
/* 9 */             return (IIOOoi1IlOi) ((HashMap) this.I00iiI).get(str);
                }

                public Number I00O0i0ii(Number number, String str) {
/* 1 */             IIOOoi1IlOi iIOOoi1IlOiI00Iooi00oi = I00Iooi00oi(str);
                    return (iIOOoi1IlOiI00Iooi00oi == null || iIOOoi1IlOiI00Iooi00oi.I00000oIO.isEmpty()) ? number : iIOOoi1IlOiI00Iooi00oi.I00000oIO(0);
                }

                public void I00O0o1oo(float f, float f2, float f3, float f4) {
/* 3 */             IOO000ilo iOO000ilo = (IOO000ilo) this.I00iiI;
/* 5 */             IIolOo iIolOoI0010o = iOO000ilo.I0010o();
/* 22 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (iOO000ilo.I001iOo1i0O() >> 32)) - (f3 + f);
/* 39 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (iOO000ilo.I001iOo1i0O() & 4294967295L)) - (f4 + f2);
/* 52 */            long jFloatToRawIntBits = (Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
/* 63 */            if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
/* 79 */                Iolilol.I00000oIO("Width and height must be greater than or equal to zero");
                    }
/* 82 */            iOO000ilo.I00Io1lO(jFloatToRawIntBits);
/* 85 */            iIolOoI0010o.I000o00OoI0I(f, f2);
                }

                public O0O1ioi11l0 I00OI1(IIOI1Ii1I iIOI1Ii1I) throws GeneralSecurityException {
/* 3 */             O0OIoll1 o0OIoll1 = (O0OIoll1) this.I00iiI;
                    try {
/* 5 */                 I00i01iIIliI i00i01iIIliII0001Ioi1lo = o0OIoll1.I0001Ioi1lo();
/* 9 */                 I01Iio10lo i01Iio10loI000O01llI0 = i00i01iIIliII0001Ioi1lo.I000O01llI0(iIOI1Ii1I);
/* 13 */                i00i01iIIliII0001Ioi1lo.I000OOo1O(i01Iio10loI000O01llI0);
/* 16 */                I01Iio10lo i01Iio10loI00000oOI = i00i01iIIliII0001Ioi1lo.I00000oOI(i01Iio10loI000O01llI0);
/* 20 */                O0O1iOo o0O1iOoI001lloI = O0O1ioi11l0.I001lloI();
/* 24 */                String strI0000O = o0OIoll1.I0000O();
/* 28 */                o0O1iOoI001lloI.I0000oI00();
/* 35 */                ((O0O1ioi11l0) o0O1iOoI001lloI.I00iiI).I00II0oii1o(strI0000O);
                        try {
/* 46 */                    byte[] bArr = new byte[((Io00Io0IO11) i01Iio10loI00000oOI).I00000oOI(null)];
/* 48 */                    IOOOi1I1I1 iOOOi1I1I1I000iOII = IOOOi1I1I1.I000iOII(bArr);
/* 52 */                    i01Iio10loI00000oOI.I0001Ioi1lo(iOOOi1I1I1I000iOII);
/* 60 */                    if (iOOOi1I1I1I000iOII.I0000Il00O - iOOOi1I1I1I000iOII.I0000O != 0) {
/* 105 */                       throw new IllegalStateException("Did not write as much data as expected.");
                            }
/* 64 */                    IIO1i10I iIO1i10I = new IIO1i10I(bArr);
/* 67 */                    o0O1iOoI001lloI.I0000oI00();
/* 74 */                    ((O0O1ioi11l0) o0O1iOoI001lloI.I00iiI).I00IO1(iIO1i10I);
/* 77 */                    O0O1ii o0O1iiI000II = o0OIoll1.I000II();
/* 81 */                    o0O1iOoI001lloI.I0000oI00();
/* 88 */                    ((O0O1ioi11l0) o0O1iOoI001lloI.I00iiI).I00II0Ol1O0l(o0O1iiI000II);
/* 95 */                    return (O0O1ioi11l0) o0O1iOoI001lloI.I00000oOI();
                        } catch (IOException e) {
/* 118 */                   throw new RuntimeException(i01Iio10loI00000oOI.I0000Il00O("ByteString"), e);
                        }
                    } catch (O000oiiiOI0 e2) {
/* 186 */               throw new GeneralSecurityException("Unexpected proto", e2);
                    }
                }

                public void I00OIO1() {
/* 7 */             ((Ill0lo1oI0I) this.I00iiI).I00iio.I00IoiI();
                }

                /* JADX WARN: Code restructure failed: missing block: B:160:0x0416, code lost:
                
                    return r0;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public IliiI1 I00OIl() throws IOException, NumberFormatException {
/* 3 */             IliiI1 iliiI1 = new IliiI1();
/* 11 */            iliiI1.I000OiO = new ArrayList();
/* 18 */            iliiI1.I000l1 = new ArrayList();
/* 25 */            iliiI1.I000lI = new HashMap();
/* 29 */            new ArrayList();
/* 34 */            new ArrayList();
/* 39 */            new ArrayList();
/* 44 */            new ArrayList();
/* 49 */            new ArrayList();
/* 52 */            VarHandle.storeStoreFence();
/* 55 */            String strI00Ol10 = I00Ol10();
/* 68 */            if (!"StartFontMetrics".equals(strI00Ol10)) {
/* 1054 */              IioIoO10iOiI.I000OOo1O(IlIi0I0.I000lI("Error: The AFM file should start with StartFontMetrics and not '", strI00Ol10, "'"));
/* 65 */                return null;
                    }
/* 70 */            I00OilO00Il();
/* 74 */            boolean z = false;
                    while (true) {
/* 75 */                String strI00Ol102 = I00Ol10();
/* 85 */                if ("EndFontMetrics".equals(strI00Ol102)) {
                            break;
                        }
/* 93 */                if ("FontName".equals(strI00Ol102)) {
/* 99 */                    iliiI1.I00000oIO = I00Ol00();
                        } else if ("FullName".equals(strI00Ol102)) {
/* 110 */                   I00Ol00();
                        } else if ("FamilyName".equals(strI00Ol102)) {
/* 126 */                   iliiI1.I00000oOI = I00Ol00();
                        } else if ("Weight".equals(strI00Ol102)) {
/* 137 */                   I00Ol00();
                        } else if ("FontBBox".equals(strI00Ol102)) {
/* 152 */                   II1i0i0ilO iI1i0i0ilO = new II1i0i0ilO(1);
/* 159 */                   iI1i0i0ilO.I00000oOI = I00OilO00Il();
/* 165 */                   iI1i0i0ilO.I0000Il00O = I00OilO00Il();
/* 171 */                   iI1i0i0ilO.I0000O = I00OilO00Il();
/* 177 */                   iI1i0i0ilO.I0000oI00 = I00OilO00Il();
/* 179 */                   iliiI1.I0000Il00O = iI1i0i0ilO;
                        } else if ("Version".equals(strI00Ol102)) {
/* 190 */                   I00Ol00();
                        } else if ("Notice".equals(strI00Ol102)) {
/* 202 */                   I00Ol00();
                        } else if ("EncodingScheme".equals(strI00Ol102)) {
/* 219 */                   iliiI1.I0000O = I00Ol00();
                        } else if ("MappingScheme".equals(strI00Ol102)) {
/* 231 */                   I00Oio();
                        } else if ("EscChar".equals(strI00Ol102)) {
/* 244 */                   I00Oio();
                        } else if ("CharacterSet".equals(strI00Ol102)) {
/* 261 */                   iliiI1.I0000oI00 = I00Ol00();
                        } else if ("Characters".equals(strI00Ol102)) {
/* 273 */                   I00Oio();
                        } else if ("IsBaseFont".equals(strI00Ol102)) {
/* 290 */                   Boolean.parseBoolean(I00Ol10());
                        } else if ("VVector".equals(strI00Ol102)) {
/* 303 */                   I00OilO00Il();
/* 306 */                   I00OilO00Il();
                        } else if ("IsFixedV".equals(strI00Ol102)) {
/* 323 */                   Boolean.parseBoolean(I00Ol10());
                        } else if ("CapHeight".equals(strI00Ol102)) {
/* 340 */                   iliiI1.I0001Ioi1lo = I00OilO00Il();
                        } else if ("XHeight".equals(strI00Ol102)) {
/* 356 */                   iliiI1.I000II = I00OilO00Il();
                        } else if ("Ascender".equals(strI00Ol102)) {
/* 372 */                   iliiI1.I000O01llI0 = I00OilO00Il();
                        } else if ("Descender".equals(strI00Ol102)) {
/* 388 */                   iliiI1.I000OOo1O = I00OilO00Il();
                        } else if ("StdHW".equals(strI00Ol102)) {
/* 400 */                   I00OilO00Il();
                        } else if ("StdVW".equals(strI00Ol102)) {
/* 413 */                   I00OilO00Il();
                        } else if ("Comment".equals(strI00Ol102)) {
/* 432 */                   iliiI1.I000OiO.add(I00Ol00());
                        } else if ("UnderlinePosition".equals(strI00Ol102)) {
/* 445 */                   I00OilO00Il();
                        } else if ("UnderlineThickness".equals(strI00Ol102)) {
/* 458 */                   I00OilO00Il();
                        } else if ("ItalicAngle".equals(strI00Ol102)) {
/* 475 */                   iliiI1.I000iOII = I00OilO00Il();
                        } else if ("CharWidth".equals(strI00Ol102)) {
/* 487 */                   I00OilO00Il();
/* 490 */                   I00OilO00Il();
                        } else if ("IsFixedPitch".equals(strI00Ol102)) {
/* 507 */                   Boolean.parseBoolean(I00Ol10());
                        } else if ("StartCharMetrics".equals(strI00Ol102)) {
/* 520 */                   int iI00Oio = I00Oio();
/* 526 */                   ArrayList arrayList = new ArrayList(iI00Oio);
/* 530 */                   for (int i = 0; i < iI00Oio; i++) {
/* 534 */                       IO11iO0l iO11iO0l = new IO11iO0l();
/* 542 */                       iO11iO0l.I0000O = new ArrayList();
/* 550 */                       StringTokenizer stringTokenizer = new StringTokenizer(I00Ol00());
/* 557 */                       while (stringTokenizer.hasMoreTokens()) {
                                    try {
/* 559 */                               String strNextToken = stringTokenizer.nextToken();
/* 569 */                               if (strNextToken.equals("C")) {
/* 579 */                                   iO11iO0l.I00000oIO = Integer.parseInt(stringTokenizer.nextToken());
/* 581 */                                   I00iIO(stringTokenizer);
                                        } else if (strNextToken.equals("CH")) {
/* 606 */                                   iO11iO0l.I00000oIO = Integer.parseInt(stringTokenizer.nextToken(), 16);
/* 608 */                                   I00iIO(stringTokenizer);
                                        } else if (strNextToken.equals("WX")) {
/* 628 */                                   iO11iO0l.I00000oOI = Float.parseFloat(stringTokenizer.nextToken());
/* 630 */                                   I00iIO(stringTokenizer);
                                        } else if (strNextToken.equals("W0X")) {
/* 646 */                                   Float.parseFloat(stringTokenizer.nextToken());
/* 649 */                                   I00iIO(stringTokenizer);
                                        } else if (strNextToken.equals("W1X")) {
/* 665 */                                   Float.parseFloat(stringTokenizer.nextToken());
/* 668 */                                   I00iIO(stringTokenizer);
                                        } else if (strNextToken.equals("WY")) {
/* 684 */                                   Float.parseFloat(stringTokenizer.nextToken());
/* 687 */                                   I00iIO(stringTokenizer);
                                        } else if (strNextToken.equals("W0Y")) {
/* 704 */                                   Float.parseFloat(stringTokenizer.nextToken());
/* 707 */                                   I00iIO(stringTokenizer);
                                        } else if (strNextToken.equals("W1Y")) {
/* 724 */                                   Float.parseFloat(stringTokenizer.nextToken());
/* 727 */                                   I00iIO(stringTokenizer);
                                        } else if (strNextToken.equals("W")) {
/* 744 */                                   Float.parseFloat(stringTokenizer.nextToken());
/* 751 */                                   Float.parseFloat(stringTokenizer.nextToken());
/* 754 */                                   I00iIO(stringTokenizer);
                                        } else if (strNextToken.equals("W0")) {
/* 771 */                                   Float.parseFloat(stringTokenizer.nextToken());
/* 778 */                                   Float.parseFloat(stringTokenizer.nextToken());
/* 781 */                                   I00iIO(stringTokenizer);
                                        } else if (strNextToken.equals("W1")) {
/* 798 */                                   Float.parseFloat(stringTokenizer.nextToken());
/* 805 */                                   Float.parseFloat(stringTokenizer.nextToken());
/* 808 */                                   I00iIO(stringTokenizer);
                                        } else if (strNextToken.equals("VV")) {
/* 825 */                                   Float.parseFloat(stringTokenizer.nextToken());
/* 832 */                                   Float.parseFloat(stringTokenizer.nextToken());
/* 835 */                                   I00iIO(stringTokenizer);
                                        } else if (strNextToken.equals("N")) {
/* 852 */                                   iO11iO0l.I0000Il00O = stringTokenizer.nextToken();
/* 854 */                                   I00iIO(stringTokenizer);
                                        } else if (strNextToken.equals("B")) {
/* 871 */                                   Float.parseFloat(stringTokenizer.nextToken());
/* 878 */                                   Float.parseFloat(stringTokenizer.nextToken());
/* 885 */                                   Float.parseFloat(stringTokenizer.nextToken());
/* 892 */                                   Float.parseFloat(stringTokenizer.nextToken());
/* 895 */                                   I00iIO(stringTokenizer);
                                        } else {
/* 906 */                                   if (!strNextToken.equals(OlIo0Ooi1loI.I001IIilI0O)) {
/* 956 */                                       throw new IOException("Unknown CharMetrics command '" + strNextToken + "'");
                                            }
/* 912 */                                   i1O01oOIoI0I i1o01ooioi0i = new i1O01oOIoI0I(13);
/* 915 */                                   stringTokenizer.nextToken();
/* 918 */                                   stringTokenizer.nextToken();
/* 923 */                                   iO11iO0l.I0000O.add(i1o01ooioi0i);
/* 926 */                                   I00iIO(stringTokenizer);
                                        }
                                    } catch (NumberFormatException e) {
/* 966 */                               IOOlIIilOl0.I000l1("Error: Corrupt AFM document:", e);
/* 65 */                                return null;
                                    }
                                }
/* 957 */                       arrayList.add(iO11iO0l);
                            }
/* 970 */                   String strI00Ol103 = I00Ol10();
/* 980 */                   if (!strI00Ol103.equals("EndCharMetrics")) {
/* 1030 */                      IioIoO10iOiI.I000OOo1O(IlIi0I0.I000lI("Error: Expected 'EndCharMetrics' actual '", strI00Ol103, "'"));
/* 65 */                        return null;
                            }
/* 982 */                   iliiI1.I000l1 = arrayList;
/* 995 */                   iliiI1.I000lI = new HashMap(iliiI1.I000l1.size());
/* 997 */                   Iterator it = arrayList.iterator();
/* 1005 */                  while (it.hasNext()) {
/* 1011 */                      IO11iO0l iO11iO0l2 = (IO11iO0l) it.next();
/* 1017 */                      iliiI1.I000lI.put(iO11iO0l2.I0000Il00O, iO11iO0l2);
                            }
/* 1021 */                  z = true;
                        } else if (!z) {
/* 1043 */                  IioIoO10iOiI.I000OOo1O(IlIi0I0.I000lI("Unknown AFM key '", strI00Ol102, "'"));
/* 65 */                    return null;
                        }
                    }
                }

                @Override
                public String I00OOll1() {
/* 5 */             return ((OlilIol) this.I00iiI).I00iiI;
                }

                public float I00OilO00Il() {
/* 5 */             return Float.parseFloat(I00Ol10());
                }

                public int I00Oio() throws IOException {
                    try {
/* 5 */                 return Integer.parseInt(I00Ol10());
                    } catch (NumberFormatException e) {
/* 13 */                IOOlIIilOl0.I000l1("Error parsing AFM document:", e);
/* 16 */                return 0;
                    }
                }

                public String I00Ol00() throws IOException {
/* 5 */             StringBuilder sb = new StringBuilder(60);
/* 10 */            BufferedInputStream bufferedInputStream = (BufferedInputStream) this.I00iiI;
/* 12 */            int i = bufferedInputStream.read();
/* 20 */            while (I00O10llo(i)) {
/* 22 */                i = bufferedInputStream.read();
                    }
/* 28 */            sb.append((char) i);
/* 36 */            for (int i2 = bufferedInputStream.read(); i2 != -1 && i2 != 13 && i2 != 10; i2 = bufferedInputStream.read()) {
/* 48 */                sb.append((char) i2);
                    }
/* 56 */            return sb.toString();
                }

                public String I00Ol10() throws IOException {
/* 5 */             StringBuilder sb = new StringBuilder(24);
/* 10 */            BufferedInputStream bufferedInputStream = (BufferedInputStream) this.I00iiI;
/* 12 */            int i = bufferedInputStream.read();
/* 20 */            while (I00O10llo(i)) {
/* 22 */                i = bufferedInputStream.read();
                    }
/* 28 */            sb.append((char) i);
/* 36 */            for (int i2 = bufferedInputStream.read(); i2 != -1 && !I00O10llo(i2); i2 = bufferedInputStream.read()) {
/* 45 */                sb.append((char) i2);
                    }
/* 53 */            return sb.toString();
                }

                public OI000ilOol I00Ol1ll1(OOo1oliI oOo1oliI) {
                    O0lI0O1OOi1 o0lI0O1OOi1;
/* 1 */             Ill0IO ill0IOI0000Il00O = oOo1oliI.I0000Il00O();
/* 5 */             if (ill0IOI0000Il00O != null) {
/* 7 */                 O0ol11[] o0ol11Arr = O0ol11.I00iOIl;
                    }
/* 11 */            Class<?> declaringClass = oOo1oliI.I00000oIO.getDeclaringClass();
/* 24 */            OOo1oliI oOo1oliI2 = declaringClass != null ? new OOo1oliI(declaringClass) : null;
/* 25 */            if (oOo1oliI2 != null) {
/* 27 */                OI000ilOol oI000ilOolI00Ol1ll1 = I00Ol1ll1(oOo1oliI2);
/* 38 */                O1iil1I01o o1iil1I01oI00l0I0l0lO1 = oI000ilOolI00Ol1ll1 != null ? oI000ilOolI00Ol1ll1.I00l0I0l0lO1() : null;
/* 52 */                IOIiO1lIl0l iOIiO1lIl0lI0000oI00 = o1iil1I01oI00l0I0l0lO1 != null ? o1iil1I01oI00l0I0l0lO1.I0000oI00(oOo1oliI.I0000oI00(), OIIl0iOOlo.I00ioIO) : null;
/* 55 */                if (iOIiO1lIl0lI0000oI00 instanceof OI000ilOol) {
/* 57 */                    return (OI000ilOol) iOIiO1lIl0lI0000oI00;
                        }
                    } else if (ill0IOI0000Il00O != null && (o0lI0O1OOi1 = (O0lI0O1OOi1) IOOi0Ool1i.I00II0Ol1O0l(Collections.singletonList(((O0lI11O) this.I00iiI).I0000Il00O(ill0IOI0000Il00O.I00000oOI())))) != null) {
/* 89 */                O0lIOO01I1l o0lIOO01I1l = o0lI0O1OOi1.I00l0OO0IO.I0000O;
/* 91 */                o0lIOO01I1l.getClass();
/* 98 */                return o0lIOO01I1l.I001IIilI0O(oOo1oliI.I0000oI00(), oOo1oliI);
                    }
/* 15 */            return null;
                }

                public void I00OloOo(float f, long j) {
/* 5 */             IIolOo iIolOoI0010o = ((IOO000ilo) this.I00iiI).I0010o();
/* 13 */            int i = (int) (j >> 32);
/* 24 */            int i2 = (int) (j & 4294967295L);
/* 29 */            iIolOoI0010o.I000o00OoI0I(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
/* 32 */            iIolOoI0010o.I00000oOI(f);
/* 45 */            iIolOoI0010o.I000o00OoI0I(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
                }

                public void I00i01iIIliI(float f, float f2, long j) {
/* 5 */             IIolOo iIolOoI0010o = ((IOO000ilo) this.I00iiI).I0010o();
/* 13 */            int i = (int) (j >> 32);
/* 24 */            int i2 = (int) (j & 4294967295L);
/* 29 */            iIolOoI0010o.I000o00OoI0I(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
/* 32 */            iIolOoI0010o.I00000oIO(f, f2);
/* 45 */            iIolOoI0010o.I000o00OoI0I(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
                }

                public void I00i0oil(float f, float f2) {
/* 9 */             ((IOO000ilo) this.I00iiI).I0010o().I000o00OoI0I(f, f2);
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00db  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x019b  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public void I00iIi0i1o(Illlil illlil, StringBuilder sb) {
                    boolean z;
                    boolean z2;
/* 3 */             IiOOllOI0io iiOOllOI0io = (IiOOllOI0io) this.I00iiI;
/* 5 */             IiOi1I iiOi1I = iiOOllOI0io.I00000oIO;
/* 7 */             IiOi1I iiOi1I2 = iiOOllOI0io.I00000oIO;
/* 14 */            if (!iiOOllOI0io.I00100l0()) {
/* 16 */                IiOi1110 iiOi1110 = iiOi1I2.I000II;
/* 18 */                O0O00I1Ili[] o0O00I1IliArr = IiOi1I.I00OilO00Il;
/* 21 */                O0O00I1Ili o0O00I1Ili = o0O00I1IliArr[5];
/* 32 */                if (!((Boolean) iiOi1110.I00000oIO).booleanValue()) {
/* 38 */                    iiOOllOI0io.I001lIiIIo1O(sb, illlil.I00Ol1ll1());
/* 42 */                    iiOOllOI0io.I001i1O0Ol(sb, illlil, null);
/* 49 */                    iiOOllOI0io.I00i01iIIliI(illlil.I000OiO(), sb);
/* 52 */                    iiOOllOI0io.I00Io1lO(illlil, sb);
/* 55 */                    IiOi1110 iiOi11102 = iiOi1I2.I00OI1;
/* 59 */                    O0O00I1Ili o0O00I1Ili2 = o0O00I1IliArr[44];
/* 69 */                    if (((Boolean) iiOi11102.I00000oIO).booleanValue()) {
/* 71 */                        iiOOllOI0io.I00IioO0OiOi(illlil, sb);
                            }
/* 74 */                    iiOOllOI0io.I00O0i0ii(illlil, sb);
/* 77 */                    IiOi1110 iiOi11103 = iiOi1I2.I00OI1;
/* 79 */                    O0O00I1Ili o0O00I1Ili3 = o0O00I1IliArr[44];
/* 91 */                    if (!((Boolean) iiOi11103.I00000oIO).booleanValue()) {
/* 261 */                       iiOOllOI0io.I00Io1o110i(sb, illlil.I00100l0(), "suspend");
                            } else if (illlil.I00IioO0OiOi()) {
/* 101 */                       Collection collectionI000o00OoI0I = illlil.I000o00OoI0I();
/* 114 */                       if (!collectionI000o00OoI0I.isEmpty()) {
/* 117 */                           Iterator it = collectionI000o00OoI0I.iterator();
                                    while (true) {
/* 125 */                               if (!it.hasNext()) {
                                            break;
                                        }
/* 137 */                               if (((Illlil) it.next()).I00IioO0OiOi()) {
/* 139 */                                   IiOi1110 iiOi11104 = iiOi1I2.I00IoiI;
/* 143 */                                   O0O00I1Ili o0O00I1Ili4 = IiOi1I.I00OilO00Il[39];
/* 153 */                                   if (((Boolean) iiOi11104.I00000oIO).booleanValue()) {
                                                break;
                                            }
/* 162 */                                   if (illlil.I00ioIO()) {
/* 220 */                                       z2 = false;
/* 227 */                                       iiOOllOI0io.I00Io1o110i(sb, illlil.I00IOO(), "tailrec");
/* 234 */                                       iiOOllOI0io.I00Io1o110i(sb, illlil.I00100l0(), "suspend");
/* 243 */                                       iiOOllOI0io.I00Io1o110i(sb, illlil.I00100o1O0lo(), "inline");
/* 248 */                                       iiOOllOI0io.I00Io1o110i(sb, z2, "infix");
/* 253 */                                       iiOOllOI0io.I00Io1o110i(sb, z, "operator");
                                            } else {
/* 164 */                                       Collection collectionI000o00OoI0I2 = illlil.I000o00OoI0I();
/* 177 */                                       if (!collectionI000o00OoI0I2.isEmpty()) {
/* 180 */                                           Iterator it2 = collectionI000o00OoI0I2.iterator();
                                                    while (true) {
/* 188 */                                               if (!it2.hasNext()) {
                                                            break;
                                                        }
/* 200 */                                               if (((Illlil) it2.next()).I00ioIO()) {
/* 202 */                                                   IiOi1110 iiOi11105 = iiOi1I2.I00IoiI;
/* 206 */                                                   O0O00I1Ili o0O00I1Ili5 = IiOi1I.I00OilO00Il[39];
/* 216 */                                                   if (((Boolean) iiOi11105.I00000oIO).booleanValue()) {
                                                                break;
                                                            }
/* 227 */                                                   iiOOllOI0io.I00Io1o110i(sb, illlil.I00IOO(), "tailrec");
/* 234 */                                                   iiOOllOI0io.I00Io1o110i(sb, illlil.I00100l0(), "suspend");
/* 243 */                                                   iiOOllOI0io.I00Io1o110i(sb, illlil.I00100o1O0lo(), "inline");
/* 248 */                                                   iiOOllOI0io.I00Io1o110i(sb, z2, "infix");
/* 253 */                                                   iiOOllOI0io.I00Io1o110i(sb, z, "operator");
                                                        }
                                                    }
/* 220 */                                           z2 = false;
/* 227 */                                           iiOOllOI0io.I00Io1o110i(sb, illlil.I00IOO(), "tailrec");
/* 234 */                                           iiOOllOI0io.I00Io1o110i(sb, illlil.I00100l0(), "suspend");
/* 243 */                                           iiOOllOI0io.I00Io1o110i(sb, illlil.I00100o1O0lo(), "inline");
/* 248 */                                           iiOOllOI0io.I00Io1o110i(sb, z2, "infix");
/* 253 */                                           iiOOllOI0io.I00Io1o110i(sb, z, "operator");
                                                }
/* 218 */                                       z2 = true;
/* 227 */                                       iiOOllOI0io.I00Io1o110i(sb, illlil.I00IOO(), "tailrec");
/* 234 */                                       iiOOllOI0io.I00Io1o110i(sb, illlil.I00100l0(), "suspend");
/* 243 */                                       iiOOllOI0io.I00Io1o110i(sb, illlil.I00100o1O0lo(), "inline");
/* 248 */                                       iiOOllOI0io.I00Io1o110i(sb, z2, "infix");
/* 253 */                                       iiOOllOI0io.I00Io1o110i(sb, z, "operator");
                                            }
                                        }
                                    }
/* 157 */                           z = false;
/* 162 */                           if (illlil.I00ioIO()) {
                                    }
                                }
/* 155 */                       z = true;
/* 162 */                       if (illlil.I00ioIO()) {
                                }
                            } else {
/* 157 */                       z = false;
/* 162 */                       if (illlil.I00ioIO()) {
                                }
                            }
/* 264 */                   iiOOllOI0io.I00IOO(illlil, sb);
/* 271 */                   if (iiOOllOI0io.I0010o()) {
/* 277 */                       if (illlil.I00iIO()) {
/* 281 */                           sb.append("/*isHiddenToOvercomeSignatureClash*/ ");
                                }
/* 288 */                       if (illlil.I00iiO()) {
/* 292 */                           sb.append("/*isHiddenForResolutionEverywhereBesideSupercalls*/ ");
                                }
                            }
                        }
/* 301 */               sb.append(iiOOllOI0io.I00IO1oi11O("fun"));
/* 306 */               sb.append(" ");
/* 313 */               iiOOllOI0io.I00Ol00(illlil.getTypeParameters(), sb, true);
/* 316 */               O0ioOi0Oo1ii o0ioOi0Oo1iiI00OOll1 = illlil.I00OOll1();
/* 320 */               if (o0ioOi0Oo1iiI00OOll1 != null) {
/* 324 */                   iiOOllOI0io.I001i1O0Ol(sb, o0ioOi0Oo1iiI00OOll1, I11IIO00.I00io1l);
/* 335 */                   sb.append(iiOOllOI0io.I00II0oii1o(o0ioOi0Oo1iiI00OOll1.getType(), false));
/* 340 */                   sb.append(".");
                        }
                    }
/* 343 */           iiOOllOI0io.I00IoO0(illlil, sb, true);
/* 356 */           iiOOllOI0io.I00OloOo(illlil.I00Iooi00oi(), illlil.I001lloI(), sb);
/* 359 */           iiOOllOI0io.I00OI1(illlil, sb);
/* 362 */           O0iIl1 o0iIl1I0001Ioi1lo = illlil.I0001Ioi1lo();
/* 366 */           IiOi1110 iiOi11106 = iiOi1I.I000l1;
/* 368 */           O0O00I1Ili[] o0O00I1IliArr2 = IiOi1I.I00OilO00Il;
/* 372 */           O0O00I1Ili o0O00I1Ili6 = o0O00I1IliArr2[10];
/* 382 */           if (!((Boolean) iiOi11106.I00000oIO).booleanValue()) {
/* 384 */               IiOi1110 iiOi11107 = iiOi1I.I000iOII;
/* 388 */               O0O00I1Ili o0O00I1Ili7 = o0O00I1IliArr2[9];
/* 398 */               if (((Boolean) iiOi11107.I00000oIO).booleanValue() || o0iIl1I0001Ioi1lo == null) {
/* 414 */                   sb.append(": ");
/* 426 */                   sb.append(o0iIl1I0001Ioi1lo == null ? "[NULL]" : iiOOllOI0io.I00OIl(o0iIl1I0001Ioi1lo));
                        } else {
/* 402 */                   OI1Iio0ii1 oI1Iio0ii1 = O0i1lI0o1io.I0000oI00;
/* 410 */                   if (!O0i1lI0o1io.I00II0Ol1O0l(o0iIl1I0001Ioi1lo, OlIllOO11lOl.I0000O)) {
                            }
                        }
                    }
/* 433 */           iiOOllOI0io.I00i0O(sb, illlil.getTypeParameters());
                }

                @Override
                public void I00iOIl(Olil1OioO olil1OioO) {
/* 3 */             OlilIol olilIol = (OlilIol) this.I00iiI;
/* 7 */             int length = olilIol.I00iio.length;
/* 10 */            for (int i = 1; i < length; i++) {
/* 14 */                int i2 = olilIol.I00iio[i];
/* 16 */                if (i2 == 1) {
/* 63 */                    olil1OioO.I000OiO(i, olilIol.I00ilI0I1[i]);
                        } else if (i2 == 2) {
/* 55 */                    olil1OioO.I000OOo1O(i, olilIol.I00ilO0[i]);
                        } else if (i2 == 3) {
/* 47 */                    olil1OioO.I001i1O0Ol(i, olilIol.I00io1l[i]);
                        } else if (i2 == 4) {
/* 39 */                    olil1OioO.I000iOII(i, olilIol.I00ioIO[i]);
                        } else if (i2 == 5) {
/* 31 */                    olil1OioO.I000o00OoI0I(i);
                        }
                    }
                }

                public void I00iiI(OOOIoo1o1 oOOIoo1o1, StringBuilder sb, String str) {
/* 3 */             IiOOllOI0io iiOOllOI0io = (IiOOllOI0io) this.I00iiI;
/* 7 */             IiOi1110 iiOi1110 = iiOOllOI0io.I00000oIO.I00IOO;
/* 13 */            O0O00I1Ili o0O00I1Ili = IiOi1I.I00OilO00Il[32];
/* 19 */            int iOrdinal = ((OOOO00io0oi) iiOi1110.I00000oIO).ordinal();
/* 23 */            if (iOrdinal == 0) {
/* 40 */                iiOOllOI0io.I00IioO0OiOi(oOOIoo1o1, sb);
/* 49 */                sb.append(str.concat(" for "));
/* 54 */                iiOOllOI0io.I00O10llo(oOOIoo1o1.I00ioIO, sb);
                    } else if (iOrdinal == 1) {
/* 36 */                I00iIi0i1o(oOOIoo1o1, sb);
                    } else {
/* 29 */                if (iOrdinal == 2) {
/* 31 */                    return;
                        }
/* 32 */                I000II.I00000oIO();
                    }
                }

                public void I00iiO(int i, Object obj, OiOIlIo oiOIlIo) {
/* 3 */             IOOOio0o iOOOio0o = (IOOOio0o) this.I00iiI;
/* 8 */             iOOOio0o.I001lllioOl(i, 3);
/* 13 */            oiOIlIo.I000O01llI0((I01Ilo0i) obj, iOOOio0o.I00000oIO);
/* 17 */            iOOOio0o.I001lllioOl(i, 4);
                }

                @Override
                public IlOO1o00IOi get(int i) {
/* 3 */             return (IlOO1o00IOi) this.I00iiI;
                }

                public String toString() {
                    switch (this.I00iOIl) {
                        case 0:
/* 59 */                    return IIOOoll.class.getName() + "[entries=" + ((HashMap) this.I00iiI) + "]";
                        case 15:
/* 26 */                    return String.format("FeatureTable[lookupListIndiciesCount=%d]", Integer.valueOf(((int[]) this.I00iiI).length));
                        default:
/* 6 */                     return super.toString();
                    }
                }

                @Override
/* 28 */        public void I000OOo1O() {
                }

                @Override
/* 88 */        public void I001IO000(OI1Iio0ii1 oI1Iio0ii1, IOIOo1o iOIOo1o) {
                }

                @Override
/* 214 */       public void I001iOo1i0O(OI1Iio0ii1 oI1Iio0ii1, IOIOill iOIOill, OI1Iio0ii1 oI1Iio0ii12) {
                }

/* 490 */       public IIOOoll(O1Ill0ioO10 o1Ill0ioO10) {
                    this.I00iOIl = 20;
                    this.I00iiI = o1Ill0ioO10;
                }

/* 491 */       public IIOOoll(IiIooOOOI iiIooOOOI) {
                    this.I00iOIl = 25;
/* 494 */           float f = OlIO0l.I00000oIO;
/* 495 */           Iio1o1I iio1o1I = new Iio1o1I();
                    iio1o1I.I00iOIl = f;
/* 496 */           float fI00000oIO = iiIooOOOI.I00000oIO();
/* 497 */           float f2 = IlOIoO11li.I00000oIO;
/* 498 */           iio1o1I.I00iiI = fI00000oIO * 386.0878f * 160.0f * 0.84f;
/* 499 */           VarHandle.storeStoreFence();
                    this.I00iiI = iio1o1I;
                }

/* 499 */       public IIOOoll(int i) {
/* 500 */           this.I00iOIl = i;
                }

/* 500 */       public IIOOoll() {
                    this.I00iOIl = 0;
/* 502 */           this.I00iiI = new HashMap();
                }
            }
