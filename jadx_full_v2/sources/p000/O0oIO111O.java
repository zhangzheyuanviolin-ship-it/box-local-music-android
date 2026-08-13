            package p000;

            import android.graphics.Path;
            import android.graphics.PointF;
            import android.util.Log;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.ArrayList;
            import java.util.Deque;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.List;
            import java.util.TreeMap;
            import java.util.TreeSet;
            import java.util.WeakHashMap;
            import java.util.concurrent.ConcurrentHashMap;
            
            public abstract class O0oIO111O {
                public static final Io0O0o0l1o I000l1;
                public HashMap I00000oIO;
                public O1OoooIi1Ol0 I00000oOI;
                public O1OoooIi1Ol0 I0000Il00O;
                public Deque I0000O;
                public OIloii I0000oI00;
                public OIlo0iIOiOI I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public OIloOoil011l I000OOo1O;
                public O1OoooIi1Ol0 I000OiO;
                public WeakHashMap I000iOII;

                static {
                    try {
/* 18 */                InputStream inputStreamI00000oIO = l1lioOO00.I00000oOI() ? l1lioOO00.I00000oIO("com/tom_roush/pdfbox/resources/glyphlist/additional.txt") : Io0O0o0l1o.class.getResourceAsStream("/com/tom_roush/pdfbox/resources/glyphlist/additional.txt");
/* 24 */                Io0O0o0l1o io0O0o0l1o = Io0O0o0l1o.I0000O;
/* 26 */                Io0O0o0l1o io0O0o0l1o2 = new Io0O0o0l1o();
/* 34 */                io0O0o0l1o2.I0000Il00O = new ConcurrentHashMap();
/* 43 */                io0O0o0l1o2.I00000oIO = new HashMap(io0O0o0l1o.I00000oIO);
/* 52 */                io0O0o0l1o2.I00000oOI = new HashMap(io0O0o0l1o.I00000oOI);
/* 54 */                io0O0o0l1o2.I00000oOI(inputStreamI00000oIO);
/* 57 */                VarHandle.storeStoreFence();
/* 60 */                I000l1 = io0O0o0l1o2;
/* 62 */                inputStreamI00000oIO.close();
                    } catch (IOException e) {
/* 67 */                IioIoO10iOiI.I000lI(e);
                    }
                }

                public final void I00000oIO(I1oooi0ol i1oooi0ol) {
                    String str;
/* 1 */             i1oooi0ol.I00000oIO = this;
/* 3 */             HashMap map = this.I00000oIO;
                    switch (i1oooi0ol.I00000oOI) {
                        case 0:
/* 73 */                    str = "BT";
                            break;
                        case 1:
/* 70 */                    str = "cm";
                            break;
                        case 2:
/* 67 */                    str = "Do";
                            break;
                        case 3:
/* 64 */                    str = "ET";
                            break;
                        case 4:
/* 61 */                    str = "Td";
                            break;
                        case 5:
/* 58 */                    str = OlIo0Ooi1loI.I001lllioOl;
                            break;
                        case 6:
/* 55 */                    str = "T*";
                            break;
                        case 7:
/* 52 */                    str = "Q";
                            break;
                        case 8:
/* 49 */                    str = "q";
                            break;
                        case 9:
/* 46 */                    str = "Tc";
                            break;
                        case 10:
/* 43 */                    str = "Tf";
                            break;
                        case 11:
/* 40 */                    str = "gs";
                            break;
                        case 12:
/* 37 */                    str = "Tm";
                            break;
                        case 13:
/* 34 */                    str = "Tz";
                            break;
                        case 14:
/* 31 */                    str = "TL";
                            break;
                        case 15:
/* 28 */                    str = "Tr";
                            break;
                        case 16:
/* 25 */                    str = "Ts";
                            break;
                        case 17:
/* 22 */                    str = "Tw";
                            break;
                        case PoseLandmark.RIGHT_PINKY:
/* 19 */                    str = "Tj";
                            break;
                        case PoseLandmark.LEFT_INDEX:
/* 16 */                    str = "TJ";
                            break;
                        case PoseLandmark.RIGHT_INDEX:
/* 13 */                    str = "'";
                            break;
                        default:
/* 10 */                    str = "\"";
                            break;
                    }
/* 75 */            map.put(str, i1oooi0ol);
                }

                public final void I00000oOI(OIloOoil011l oIloOoil011l) {
/* 1 */             if (oIloOoil011l != null) {
/* 3 */                 OIlli0ooo oIlli0oooI0000O = I0000O();
/* 7 */                 O1OoooIi1Ol0 o1OoooIi1Ol0 = oIlli0oooI0000O.I00iio;
/* 9 */                 float fI00000oIO = oIloOoil011l.I00000oIO();
/* 13 */                float fI00000oOI = oIloOoil011l.I00000oOI();
/* 17 */                float fI0000Il00O = oIloOoil011l.I0000Il00O();
/* 21 */                float fI0000O = oIloOoil011l.I0000O();
/* 25 */                PointF pointFI000OiO = o1OoooIi1Ol0.I000OiO(fI00000oIO, fI00000oOI);
/* 29 */                PointF pointFI000OiO2 = o1OoooIi1Ol0.I000OiO(fI0000Il00O, fI00000oOI);
/* 33 */                PointF pointFI000OiO3 = o1OoooIi1Ol0.I000OiO(fI0000Il00O, fI0000O);
/* 37 */                PointF pointFI000OiO4 = o1OoooIi1Ol0.I000OiO(fI00000oIO, fI0000O);
/* 43 */                Path path = new Path();
/* 50 */                path.moveTo(pointFI000OiO.x, pointFI000OiO.y);
/* 57 */                path.lineTo(pointFI000OiO2.x, pointFI000OiO2.y);
/* 64 */                path.lineTo(pointFI000OiO3.x, pointFI000OiO3.y);
/* 71 */                path.lineTo(pointFI000OiO4.x, pointFI000OiO4.y);
/* 74 */                path.close();
/* 79 */                if (!oIlli0oooI0000O.I00iOIl) {
/* 88 */                    oIlli0oooI0000O.I00iiI = new ArrayList(oIlli0oooI0000O.I00iiI);
/* 91 */                    oIlli0oooI0000O.I00iOIl = true;
                        }
/* 100 */               oIlli0oooI0000O.I00iiI.add(new Path(path));
                    }
                }

                public final void I0000Il00O() {
                    int i = this.I000II - 1;
/* 5 */             this.I000II = i;
/* 7 */             if (i < 0) {
/* 27 */                Log.e("PdfBox-Android", "level is " + this.I000II);
                    }
                }

                public final OIlli0ooo I0000O() {
/* 7 */             return (OIlli0ooo) this.I0000O.peek();
                }

                public final void I0000oI00(OIii101l1I0O oIii101l1I0O, List list) throws IOException {
/* 9 */             I1oooi0ol i1oooi0ol = (I1oooi0ol) this.I00000oIO.get(oIii101l1I0O.I00000oIO);
/* 11 */            if (i1oooi0ol != null) {
/* 13 */                i1oooi0ol.I00000oIO = this;
                        try {
/* 15 */                    i1oooi0ol.I00000oIO(oIii101l1I0O, list);
                        } catch (IOException e) {
/* 24 */                    if ((e instanceof O1o000O1100) || (e instanceof O1o000)) {
/* 66 */                        Log.e("PdfBox-Android", e.getMessage());
                            } else if (e instanceof Il010Olioio1) {
/* 39 */                        Log.w("PdfBox-Android", e.getMessage());
                            } else {
/* 51 */                        if (!oIii101l1I0O.I00000oIO.equals("Do")) {
/* 61 */                            throw e;
                                }
/* 57 */                        Log.w("PdfBox-Android", e.getMessage());
                            }
                        }
                    }
                }

                public final void I0001Ioi1lo(OIlOoO oIlOoO) {
/* 1 */             OIloii oIloiiI000OOo1O = I000OOo1O(oIlOoO);
/* 5 */             Deque deque = this.I0000O;
/* 10 */            ArrayDeque arrayDeque = new ArrayDeque(1);
/* 13 */            this.I0000O = arrayDeque;
/* 25 */            arrayDeque.add(((OIlli0ooo) deque.peek()).clone());
/* 28 */            OIlli0ooo oIlli0oooI0000O = I0000O();
/* 32 */            O1OoooIi1Ol0 o1OoooIi1Ol0 = oIlli0oooI0000O.I00iio;
/* 34 */            O1OoooIi1Ol0 o1OoooIi1Ol0I00000oIO = oIlOoO.I00000oIO();
/* 38 */            o1OoooIi1Ol0.getClass();
/* 41 */            o1OoooIi1Ol0I00000oIO.I000OOo1O(o1OoooIi1Ol0, o1OoooIi1Ol0);
/* 46 */            oIlli0oooI0000O.I00iio.clone();
/* 53 */            I00000oOI(oIlOoO.I00000oOI());
                    try {
/* 56 */                I000II(oIlOoO);
                    } finally {
/* 65 */                this.I0000O = deque;
/* 67 */                this.I0000oI00 = oIloiiI000OOo1O;
                    }
                }

                public final void I000II(OIlOoO oIlOoO) throws IOException {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 8 */             OIlilOioI oIlilOioI = new OIlilOioI(oIlOoO);
/* 15 */            for (Object objI001i1O0Ol = oIlilOioI.I001i1O0Ol(); objI001i1O0Ol != null; objI001i1O0Ol = oIlilOioI.I001i1O0Ol()) {
/* 19 */                if (objI001i1O0Ol instanceof OIii101l1I0O) {
/* 23 */                    I0000oI00((OIii101l1I0O) objI001i1O0Ol, arrayList);
/* 26 */                    arrayList.clear();
                        } else {
/* 32 */                    arrayList.add((IIOoOiOI) objI001i1O0Ol);
                        }
                    }
                }

                public final void I000O01llI0(OIlooi01 oIlooi01) {
/* 3 */             if (this.I0001Ioi1lo == null) {
/* 78 */                I000II.I001IO000("No current page, call #processChildStream(PDContentStream, PDPage) instead");
/* 186 */               return;
                    }
/* 5 */             OIloii oIloiiI000OOo1O = I000OOo1O(oIlooi01);
/* 9 */             Deque deque = this.I0000O;
/* 14 */            ArrayDeque arrayDeque = new ArrayDeque(1);
/* 17 */            this.I0000O = arrayDeque;
/* 29 */            arrayDeque.add(((OIlli0ooo) deque.peek()).clone());
/* 32 */            OIlli0ooo oIlli0oooI0000O = I0000O();
/* 38 */            oIlli0oooI0000O.I00iio.clone();
/* 41 */            O1OoooIi1Ol0 o1OoooIi1Ol0 = oIlli0oooI0000O.I00iio;
/* 43 */            O1OoooIi1Ol0 o1OoooIi1Ol0I00000oIO = oIlooi01.I00000oIO();
/* 47 */            o1OoooIi1Ol0.getClass();
/* 50 */            o1OoooIi1Ol0I00000oIO.I000OOo1O(o1OoooIi1Ol0, o1OoooIi1Ol0);
/* 53 */            HashMap map = OIIo1IOo0IlO.I00000oIO;
/* 59 */            I00000oOI(oIlooi01.I00000oOI());
                    try {
/* 62 */                I000II(oIlooi01);
                    } finally {
/* 71 */                this.I0000O = deque;
/* 73 */                this.I0000oI00 = oIloiiI000OOo1O;
                    }
                }

                public final OIloii I000OOo1O(OIlOoO oIlOoO) {
/* 1 */             OIloii oIloii = this.I0000oI00;
/* 3 */             OIloii oIloiiI0000O = oIlOoO.I0000O();
/* 7 */             if (oIloiiI0000O != null) {
/* 9 */                 this.I0000oI00 = oIloiiI0000O;
/* 11 */                return oIloii;
                    }
/* 14 */            if (this.I0000oI00 == null) {
/* 19 */                OIloii oIloiiI0000O2 = this.I0001Ioi1lo.I0000O();
/* 23 */                this.I0000oI00 = oIloiiI0000O2;
/* 25 */                if (oIloiiI0000O2 == null) {
/* 32 */                    this.I0000oI00 = new OIloii();
                        }
                    }
/* 49 */            return oIloii;
                }

                /* JADX WARN: Removed duplicated region for block: B:107:0x0307  */
                /* JADX WARN: Removed duplicated region for block: B:110:0x0317  */
                /* JADX WARN: Removed duplicated region for block: B:123:0x0394  */
                /* JADX WARN: Removed duplicated region for block: B:125:0x039d  */
                /* JADX WARN: Removed duplicated region for block: B:157:0x0412  */
                /* JADX WARN: Removed duplicated region for block: B:160:0x041b A[PHI: r3
                  0x041b: PHI (r3v21 int) = (r3v11 int), (r3v13 int), (r3v14 int), (r3v15 int) binds: [B:159:0x0419, B:166:0x0427, B:164:0x0423, B:162:0x041f] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:161:0x041d  */
                /* JADX WARN: Removed duplicated region for block: B:170:0x043c  */
                /* JADX WARN: Removed duplicated region for block: B:171:0x0440  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x0269  */
                /* JADX WARN: Removed duplicated region for block: B:99:0x026e  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I000OiO(byte[] bArr) throws IOException {
                    float f;
                    float f2;
                    float fI000OiO;
                    float f3;
                    float f4;
                    float f5;
                    float f6;
                    float fI0000O;
                    O1OoooIi1Ol0 o1OoooIi1Ol0;
                    float fI00000oIO;
                    float fI00000oOI;
                    Oo0l0OoolI0 oo0l0OoolI0;
                    int i;
                    float fI0000O2;
                    String str;
                    float f7;
                    float f8;
                    float f9;
                    float f10;
                    float fI000II;
                    OIll0O oIll0O;
                    int i2;
                    int i3;
                    int i4;
                    int size;
                    int i5;
                    List list;
                    float f11;
                    float f12;
                    float f13;
                    OoIllIioi1l ooIllIioi1l;
/* 3 */             OIlli0ooo oIlli0oooI0000O = I0000O();
/* 7 */             OIloo1o00o oIloo1o00o = oIlli0oooI0000O.I00ilI0I1;
/* 9 */             OIll100 oIll100 = oIloo1o00o.I00ilI0I1;
/* 11 */            String str2 = "PdfBox-Android";
/* 13 */            if (oIll100 == null) {
/* 17 */                Log.w("PdfBox-Android", "No current font, will use default");
/* 20 */                oIll100 = OIo0Ii0oOIl.I00oIiI10;
                    }
/* 22 */            OIll100 oIll1002 = oIll100;
/* 23 */            float f14 = oIloo1o00o.I00ilO0;
/* 27 */            float f15 = 100.0f;
/* 29 */            float f16 = oIloo1o00o.I00iiO / 100.0f;
/* 31 */            float f17 = oIloo1o00o.I00iOIl;
/* 42 */            O1OoooIi1Ol0 o1OoooIi1Ol02 = new O1OoooIi1Ol0(f14 * f16, 0.0f, 0.0f, f14, 0.0f, oIloo1o00o.I00io1l);
/* 49 */            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
/* 56 */            while (byteArrayInputStream.available() > 0) {
/* 58 */                int iAvailable = byteArrayInputStream.available();
/* 62 */                int iI000oI1ioi = oIll1002.I000oI1ioi(byteArrayInputStream);
/* 84 */                float f18 = (iAvailable - byteArrayInputStream.available() == 1 && iI000oI1ioi == 32) ? oIloo1o00o.I00iiI + 0.0f : 0.0f;
/* 87 */                float f19 = f15;
/* 105 */               O1OoooIi1Ol0 o1OoooIi1Ol0I000OOo1O = o1OoooIi1Ol02.I000OOo1O(this.I00000oOI, new O1OoooIi1Ol0()).I000OOo1O(oIlli0oooI0000O.I00iio, new O1OoooIi1Ol0());
/* 113 */               if (oIll1002.I000lI()) {
/* 115 */                   Ooo0OIOI ooo0OIOII000II = oIll1002.I000II(iI000oI1ioi);
/* 127 */                   O1OoooIi1Ol0.I0000oI00(ooo0OIOII000II.I00000oIO, ooo0OIOII000II.I00000oOI).I000OOo1O(o1OoooIi1Ol0I000OOo1O, o1OoooIi1Ol0I000OOo1O);
                        }
/* 130 */               Ooo0OIOI ooo0OIOII0000oI00 = oIll1002.I0000oI00(iI000oI1ioi);
/* 134 */               float f20 = ooo0OIOII0000oI00.I00000oIO;
/* 136 */               oIll1002.I00100l0(iI000oI1ioi);
/* 139 */               WeakHashMap weakHashMap = this.I000iOII;
/* 141 */               OIlli0ooo oIlli0ooo = oIlli0oooI0000O;
/* 143 */               OIlli0ooo oIlli0oooI0000O2 = I0000O();
/* 147 */               OIloo1o00o oIloo1o00o2 = oIloo1o00o;
/* 149 */               O1OoooIi1Ol0 o1OoooIi1Ol03 = oIlli0oooI0000O2.I00iio;
/* 151 */               OIloo1o00o oIloo1o00o3 = oIlli0oooI0000O2.I00ilI0I1;
/* 153 */               O1OoooIi1Ol0 o1OoooIi1Ol04 = o1OoooIi1Ol02;
/* 155 */               float f21 = oIloo1o00o3.I00ilO0;
/* 159 */               float f22 = oIloo1o00o3.I00iiO / f19;
/* 163 */               O1OoooIi1Ol0 o1OoooIi1Ol05 = this.I00000oOI;
/* 165 */               ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
/* 167 */               float f23 = ooo0OIOII0000oI00.I00000oOI;
/* 169 */               boolean zI000lI = oIll1002.I000lI();
/* 175 */               IIOoi0ooOoO iIOoi0ooOoO = oIll1002.I00iOIl;
/* 179 */               if (zI000lI) {
/* 185 */                   fI000OiO = oIll1002.I000OiO(iI000oI1ioi) / 1000.0f;
/* 187 */                   f = f23;
/* 191 */                   if (oIll1002 instanceof OIlooiI01iIo) {
/* 196 */                       ooIllIioi1l = ((OIlooiI01iIo) oIll1002).I00oI0i;
/* 198 */                       f2 = f14;
                            } else {
/* 203 */                       if (oIll1002 instanceof OIo011l) {
/* 208 */                           OIlOl1I0IliO oIlOl1I0IliO = ((OIo011l) oIll1002).I00l0OO0IO;
/* 210 */                           f2 = f14;
/* 214 */                           if (oIlOl1I0IliO instanceof OIlOll0O000) {
/* 218 */                               ooIllIioi1l = ((OIlOll0O000) oIlOl1I0IliO).I00l0OO0IO;
                                    }
                                } else {
/* 221 */                           f2 = f14;
                                }
/* 223 */                       ooIllIioi1l = null;
                            }
/* 224 */                   if (ooIllIioi1l != null) {
/* 230 */                       OoIllIioi1l ooIllIioi1l2 = ooIllIioi1l;
/* 234 */                       if (ooIllIioi1l.I00IoiI() != 1000) {
/* 243 */                           fI000OiO *= 1000.0f / ooIllIioi1l2.I00IoiI();
                                }
                            }
                        } else {
/* 246 */                   f = f23;
/* 248 */                   f2 = f14;
/* 250 */                   fI000OiO = f20;
                        }
/* 276 */               O1OoooIi1Ol0 o1OoooIi1Ol0I000OOo1O2 = O1OoooIi1Ol0.I0000oI00(fI000OiO * f21 * f22, f * f21).I000OOo1O(o1OoooIi1Ol05, new O1OoooIi1Ol0()).I000OOo1O(o1OoooIi1Ol03, new O1OoooIi1Ol0());
/* 280 */               float fI0001Ioi1lo = o1OoooIi1Ol0I000OOo1O2.I0001Ioi1lo();
/* 284 */               float fI000II2 = o1OoooIi1Ol0I000OOo1O2.I000II();
/* 292 */               float fI0001Ioi1lo2 = fI0001Ioi1lo - o1OoooIi1Ol0I000OOo1O.I0001Ioi1lo();
/* 298 */               Float f24 = (Float) weakHashMap.get(iIOoi0ooOoO);
/* 302 */               if (f24 == null) {
/* 304 */                   II1i0i0ilO boundingBox = oIll1002.getBoundingBox();
/* 308 */                   f3 = fI000II2;
/* 310 */                   float f25 = boundingBox.I0000Il00O;
/* 316 */                   if (f25 < -32768.0f) {
/* 322 */                       f25 = -(f25 + 65536.0f);
/* 323 */                       boundingBox.I0000Il00O = f25;
                            }
/* 330 */                   float f26 = (boundingBox.I0000oI00 - f25) / 2.0f;
/* 333 */                   OIll1lio oIll1lioI0001Ioi1lo = oIll1002.I0001Ioi1lo();
/* 337 */                   f4 = fI0001Ioi1lo;
/* 339 */                   if (oIll1lioI0001Ioi1lo != null) {
/* 341 */                       IIOoi0ooOoO iIOoi0ooOoO2 = oIll1lioI0001Ioi1lo.I00iOIl;
/* 343 */                       f5 = fI0001Ioi1lo2;
/* 345 */                       float fAbs = oIll1lioI0001Ioi1lo.I00iiI;
/* 351 */                       if (fAbs == Float.NEGATIVE_INFINITY) {
/* 355 */                           f6 = f18;
/* 357 */                           f13 = 0.0f;
/* 362 */                           fAbs = Math.abs(iIOoi0ooOoO2.I00ooiO1I(IIi0I0I0o.I0100o111I, 0.0f));
/* 366 */                           oIll1lioI0001Ioi1lo.I00iiI = fAbs;
                                } else {
/* 369 */                           f6 = f18;
/* 371 */                           f13 = 0.0f;
                                }
/* 376 */                       if (Float.compare(fAbs, f13) != 0 && (fAbs < f26 || Float.compare(f26, f13) == 0)) {
/* 388 */                           f26 = fAbs;
                                }
/* 391 */                       float fI00ooiO1I = iIOoi0ooOoO2.I00ooiO1I(IIi0I0I0o.I00lli11, f13);
/* 399 */                       float fI00ooiO1I2 = iIOoi0ooOoO2.I00ooiO1I(IIi0I0I0o.I01IO1il, f13);
/* 405 */                       if (fAbs > fI00ooiO1I && fI00ooiO1I > f13 && fI00ooiO1I2 < f13) {
/* 417 */                           float f27 = (fI00ooiO1I - fI00ooiO1I2) / 2.0f;
/* 421 */                           if (f27 < f26 || Float.compare(f26, f13) == 0) {
/* 429 */                               f26 = f27;
                                    }
                                }
                            } else {
/* 431 */                       f5 = fI0001Ioi1lo2;
/* 433 */                       f6 = f18;
                            }
/* 453 */                   Float fValueOf = Float.valueOf(oIll1002 instanceof OIo0IlIloO ? oIll1002.I00000oIO().I000OiO(0.0f, f26).y : f26 / 1000.0f);
/* 457 */                   weakHashMap.put(iIOoi0ooOoO, fValueOf);
/* 460 */                   f24 = fValueOf;
                        } else {
/* 463 */                   f3 = fI000II2;
/* 465 */                   f4 = fI0001Ioi1lo;
/* 467 */                   f5 = fI0001Ioi1lo2;
/* 469 */                   f6 = f18;
                        }
/* 471 */               float fFloatValue = f24.floatValue();
/* 475 */               float[] fArr = o1OoooIi1Ol0I000OOo1O.I00iOIl;
/* 478 */               float f28 = fArr[3];
/* 515 */               float fSqrt = (f28 != 0.0f ? (float) Math.sqrt(Math.pow(o1OoooIi1Ol0I000OOo1O.I00iOIl[4], 2.0d) + Math.pow(f28, 2.0d)) : fArr[4]) * fFloatValue;
/* 531 */               float f29 = oIll1002 instanceof OIo0IlIloO ? oIll1002.I00000oIO().I00iOIl[0] : 0.001f;
                        try {
/* 539 */                   fI0000O = oIll1002.I000O01llI0() * f29;
                        } catch (Throwable th) {
/* 549 */                   Log.w(str2, th.getMessage(), th);
/* 552 */                   fI0000O = 0.0f;
                        }
/* 556 */               if (fI0000O == 0.0f) {
/* 566 */                   fI0000O = oIll1002.I0000O() * f29 * 0.8f;
                        }
/* 570 */               if (fI0000O == 0.0f) {
/* 572 */                   fI0000O = 1.0f;
                        }
/* 578 */               float fI0000O3 = o1OoooIi1Ol0I000OOo1O.I0000O() * fI0000O;
/* 581 */               String strI00100o1O0lo = oIll1002.I00100o1O0lo(iI000oI1ioi, I000l1);
/* 585 */               if (strI00100o1O0lo != null) {
/* 614 */                   o1OoooIi1Ol0 = this.I000OiO;
/* 616 */                   if (o1OoooIi1Ol0 != null) {
/* 618 */                       fI00000oOI = f3;
/* 620 */                       fI00000oIO = f4;
                            } else {
/* 628 */                       o1OoooIi1Ol0I000OOo1O = o1OoooIi1Ol0I000OOo1O.I000OOo1O(o1OoooIi1Ol0, new O1OoooIi1Ol0());
/* 638 */                       fI00000oIO = f4 - this.I000OOo1O.I00000oIO();
/* 646 */                       fI00000oOI = f3 - this.I000OOo1O.I00000oOI();
                            }
/* 652 */                   i = this.I000O01llI0;
/* 656 */                   OIloOoil011l oIloOoil011l = this.I000OOo1O;
/* 666 */                   float fI0000Il00O = oIloOoil011l.I0000Il00O() - oIloOoil011l.I00000oIO();
/* 670 */                   OIloOoil011l oIloOoil011l2 = this.I000OOo1O;
/* 680 */                   fI0000O2 = oIloOoil011l2.I0000O() - oIloOoil011l2.I00000oOI();
/* 682 */                   str = str2;
/* 684 */                   float fAbs2 = Math.abs(fSqrt);
/* 690 */                   float fAbs3 = Math.abs(fI0000O3);
/* 694 */                   f7 = f20;
/* 704 */                   f8 = f16;
/* 708 */                   int iI0000O = (int) (o1OoooIi1Ol05.I0000O() * f21);
/* 709 */                   oo0l0OoolI0 = new Oo0l0OoolI0();
/* 712 */                   f9 = f17;
/* 716 */                   oo0l0OoolI0.I00100o1O0lo = -1.0f;
/* 718 */                   oo0l0OoolI0.I00000oIO = o1OoooIi1Ol0I000OOo1O;
/* 720 */                   oo0l0OoolI0.I00000oOI = fI00000oIO;
/* 722 */                   oo0l0OoolI0.I0000Il00O = fI00000oOI;
/* 724 */                   oo0l0OoolI0.I0000oI00 = i;
/* 726 */                   oo0l0OoolI0.I0000O = fAbs2;
/* 728 */                   oo0l0OoolI0.I000O01llI0 = fI0000O2;
/* 730 */                   oo0l0OoolI0.I000OOo1O = fI0000Il00O;
/* 737 */                   oo0l0OoolI0.I000oI1ioi = new float[]{f5};
/* 739 */                   oo0l0OoolI0.I000OiO = fAbs3;
/* 741 */                   oo0l0OoolI0.I00100l0 = strI00100o1O0lo;
/* 743 */                   oo0l0OoolI0.I000iOII = new int[]{iI000oI1ioi};
/* 745 */                   oo0l0OoolI0.I000l1 = oIll1002;
/* 747 */                   oo0l0OoolI0.I000lI = f21;
/* 749 */                   oo0l0OoolI0.I000o00OoI0I = iI0000O;
                            f10 = i;
/* 752 */                   float fI0000oI00 = oo0l0OoolI0.I0000oI00(f10);
/* 756 */                   oo0l0OoolI0.I0001Ioi1lo = fI0000oI00;
/* 758 */                   if (i != 0 || i == 180) {
/* 780 */                       fI000II = fI0000O2 - oo0l0OoolI0.I000II(f10);
/* 782 */                       oo0l0OoolI0.I000II = fI000II;
                            } else {
/* 769 */                       fI000II = fI0000Il00O - oo0l0OoolI0.I000II(f10);
/* 770 */                       oo0l0OoolI0.I000II = fI000II;
                            }
/* 772 */                   VarHandle.storeStoreFence();
/* 786 */                   oIll0O = (OIll0O) this;
/* 790 */                   if (oIll0O.I001l0I00) {
/* 917 */                       float f30 = oo0l0OoolI0.I0001Ioi1lo;
/* 919 */                       float f31 = oo0l0OoolI0.I000II;
/* 924 */                       if (oIll0O.I001lIiIIo1O) {
                                }
/* 1048 */                      ArrayList arrayList = oIll0O.I00IO1oi11O;
/* 1050 */                      if (size == -1) {
                                }
                            } else {
/* 792 */                       String str3 = oo0l0OoolI0.I00100l0;
/* 794 */                       HashMap map = oIll0O.I00IOO;
/* 800 */                       TreeMap treeMap = (TreeMap) map.get(str3);
/* 802 */                       if (treeMap == null) {
/* 806 */                           treeMap = new TreeMap();
/* 809 */                           map.put(str3, treeMap);
                                }
/* 825 */                       float fI0000Il00O2 = (oo0l0OoolI0.I0000Il00O(i) / str3.length()) / 3.0f;
/* 846 */                       Iterator it = treeMap.subMap(Float.valueOf(fI0000oI00 - fI0000Il00O2), Float.valueOf(fI0000oI00 + fI0000Il00O2)).values().iterator();
/* 854 */                       while (it.hasNext()) {
/* 882 */                           if (!((TreeSet) it.next()).subSet(Float.valueOf(fI000II - fI0000Il00O2), Float.valueOf(fI000II + fI0000Il00O2)).isEmpty()) {
                                        break;
                                    }
                                }
/* 894 */                       TreeSet treeSet = (TreeSet) treeMap.get(Float.valueOf(fI0000oI00));
/* 896 */                       if (treeSet == null) {
/* 900 */                           treeSet = new TreeSet();
/* 907 */                           treeMap.put(Float.valueOf(fI0000oI00), treeSet);
                                }
/* 914 */                       treeSet.add(Float.valueOf(fI000II));
/* 917 */                       float f302 = oo0l0OoolI0.I0001Ioi1lo;
/* 919 */                       float f312 = oo0l0OoolI0.I000II;
/* 924 */                       if (oIll0O.I001lIiIIo1O) {
/* 1043 */                          i2 = -1;
/* 1044 */                          i3 = -1;
/* 1045 */                          i4 = -1;
/* 1046 */                          size = 0;
                                } else {
/* 926 */                           int i6 = -1;
/* 927 */                           i2 = -1;
/* 928 */                           i3 = -1;
/* 929 */                           i4 = -1;
/* 938 */                           for (int i7 = 0; i7 < oIll0O.I00IO1.size() && i6 == -1; i7++) {
/* 948 */                               OIloOoil011l oIloOoil011l3 = (OIloOoil011l) oIll0O.I00IO1.get(i7);
/* 950 */                               if (oIloOoil011l3 != null) {
/* 952 */                                   float fI00000oIO2 = oIloOoil011l3.I00000oIO();
/* 956 */                                   float fI0000Il00O3 = oIloOoil011l3.I0000Il00O();
/* 960 */                                   float fI00000oOI2 = oIloOoil011l3.I00000oOI();
/* 964 */                                   float fI0000O4 = oIloOoil011l3.I0000O();
/* 970 */                                   if (f302 >= fI00000oIO2 && f302 <= fI0000Il00O3 && f312 >= fI00000oOI2 && f312 <= fI0000O4) {
/* 987 */                                       i6 = (i7 * 2) + 1;
                                            } else if ((f302 < oIloOoil011l3.I00000oIO() || f312 < oIloOoil011l3.I0000O()) && i2 == -1) {
/* 1007 */                                      i2 = i7 * 2;
                                            } else if (f302 < oIloOoil011l3.I00000oIO() && i3 == -1) {
/* 1020 */                                      i3 = i7 * 2;
                                            } else if (f312 < oIloOoil011l3.I0000O() && i4 == -1) {
/* 1033 */                                      i4 = i7 * 2;
                                            }
                                        } else {
/* 1036 */                                  i6 = 0;
                                        }
                                    }
/* 1041 */                          size = i6;
                                }
/* 1048 */                      ArrayList arrayList2 = oIll0O.I00IO1oi11O;
/* 1050 */                      if (size == -1) {
/* 1054 */                          if (i2 != -1) {
/* 1056 */                              size = i2;
                                    } else if (i3 != -1) {
/* 1060 */                              size = i3;
                                    } else if (i4 != -1) {
/* 1064 */                              size = i4;
                                    } else {
/* 1070 */                              i5 = 1;
                                        size = arrayList2.size() - 1;
/* 1077 */                              list = (List) arrayList2.get(size);
/* 1083 */                              if (list.isEmpty()) {
/* 1085 */                                  list.add(oo0l0OoolI0);
                                        } else {
/* 1098 */                                  Oo0l0OoolI0 oo0l0OoolI02 = (Oo0l0OoolI0) list.get(list.size() - i5);
/* 1104 */                                  if (oo0l0OoolI0.I000OOo1O() && oo0l0OoolI02.I00000oIO(oo0l0OoolI0)) {
/* 1112 */                                      oo0l0OoolI02.I000OiO(oo0l0OoolI0);
                                            } else if (oo0l0OoolI02.I000OOo1O() && oo0l0OoolI0.I00000oIO(oo0l0OoolI02)) {
/* 1128 */                                      oo0l0OoolI0.I000OiO(oo0l0OoolI02);
/* 1137 */                                      list.remove(list.size() - 1);
/* 1140 */                                      list.add(oo0l0OoolI0);
                                            } else {
/* 1144 */                                      list.add(oo0l0OoolI0);
                                            }
                                        }
                                    }
/* 1052 */                          i5 = 1;
/* 1077 */                          list = (List) arrayList2.get(size);
/* 1083 */                          if (list.isEmpty()) {
                                    }
                                } else {
/* 1052 */                          i5 = 1;
/* 1077 */                          list = (List) arrayList2.get(size);
/* 1083 */                          if (list.isEmpty()) {
                                    }
                                }
                            }
                        } else if (oIll1002 instanceof OIloiiI1i1) {
/* 599 */                   strI00100o1O0lo = new String(new char[]{(char) iI000oI1ioi});
/* 614 */                   o1OoooIi1Ol0 = this.I000OiO;
/* 616 */                   if (o1OoooIi1Ol0 != null) {
                            }
/* 652 */                   i = this.I000O01llI0;
/* 656 */                   OIloOoil011l oIloOoil011l4 = this.I000OOo1O;
/* 666 */                   float fI0000Il00O4 = oIloOoil011l4.I0000Il00O() - oIloOoil011l4.I00000oIO();
/* 670 */                   OIloOoil011l oIloOoil011l22 = this.I000OOo1O;
/* 680 */                   fI0000O2 = oIloOoil011l22.I0000O() - oIloOoil011l22.I00000oOI();
/* 682 */                   str = str2;
/* 684 */                   float fAbs22 = Math.abs(fSqrt);
/* 690 */                   float fAbs32 = Math.abs(fI0000O3);
/* 694 */                   f7 = f20;
/* 704 */                   f8 = f16;
/* 708 */                   int iI0000O2 = (int) (o1OoooIi1Ol05.I0000O() * f21);
/* 709 */                   oo0l0OoolI0 = new Oo0l0OoolI0();
/* 712 */                   f9 = f17;
/* 716 */                   oo0l0OoolI0.I00100o1O0lo = -1.0f;
/* 718 */                   oo0l0OoolI0.I00000oIO = o1OoooIi1Ol0I000OOo1O;
/* 720 */                   oo0l0OoolI0.I00000oOI = fI00000oIO;
/* 722 */                   oo0l0OoolI0.I0000Il00O = fI00000oOI;
/* 724 */                   oo0l0OoolI0.I0000oI00 = i;
/* 726 */                   oo0l0OoolI0.I0000O = fAbs22;
/* 728 */                   oo0l0OoolI0.I000O01llI0 = fI0000O2;
/* 730 */                   oo0l0OoolI0.I000OOo1O = fI0000Il00O4;
/* 737 */                   oo0l0OoolI0.I000oI1ioi = new float[]{f5};
/* 739 */                   oo0l0OoolI0.I000OiO = fAbs32;
/* 741 */                   oo0l0OoolI0.I00100l0 = strI00100o1O0lo;
/* 743 */                   oo0l0OoolI0.I000iOII = new int[]{iI000oI1ioi};
/* 745 */                   oo0l0OoolI0.I000l1 = oIll1002;
/* 747 */                   oo0l0OoolI0.I000lI = f21;
/* 749 */                   oo0l0OoolI0.I000o00OoI0I = iI0000O2;
                            f10 = i;
/* 752 */                   float fI0000oI002 = oo0l0OoolI0.I0000oI00(f10);
/* 756 */                   oo0l0OoolI0.I0001Ioi1lo = fI0000oI002;
/* 758 */                   if (i != 0) {
/* 780 */                       fI000II = fI0000O2 - oo0l0OoolI0.I000II(f10);
/* 782 */                       oo0l0OoolI0.I000II = fI000II;
/* 772 */                       VarHandle.storeStoreFence();
/* 786 */                       oIll0O = (OIll0O) this;
/* 790 */                       if (oIll0O.I001l0I00) {
                                }
                            }
                        } else {
/* 604 */                   str = str2;
/* 606 */                   f7 = f20;
/* 608 */                   f8 = f16;
/* 610 */                   f9 = f17;
                        }
/* 1151 */              if (oIll1002.I000lI()) {
/* 1157 */                  f12 = (f * f2) + f9 + f6;
/* 1159 */                  f11 = 0.0f;
                        } else {
/* 1168 */                  f11 = ((f7 * f2) + f9 + f6) * f8;
/* 1171 */                  f12 = 0.0f;
                        }
/* 1173 */              O1OoooIi1Ol0 o1OoooIi1Ol06 = this.I00000oOI;
/* 1175 */              O1OoooIi1Ol0 o1OoooIi1Ol0I0000oI00 = O1OoooIi1Ol0.I0000oI00(f11, f12);
/* 1179 */              o1OoooIi1Ol06.getClass();
/* 1182 */              o1OoooIi1Ol0I0000oI00.I000OOo1O(o1OoooIi1Ol06, o1OoooIi1Ol06);
/* 1185 */              f15 = f19;
/* 1187 */              oIlli0oooI0000O = oIlli0ooo;
/* 1189 */              oIloo1o00o = oIloo1o00o2;
/* 1191 */              o1OoooIi1Ol02 = o1OoooIi1Ol04;
/* 1193 */              byteArrayInputStream = byteArrayInputStream2;
/* 1195 */              f17 = f9;
/* 1197 */              f14 = f2;
/* 1199 */              f16 = f8;
/* 1201 */              str2 = str;
                    }
                }
            }
