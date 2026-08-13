            package p000;

            import android.util.Log;
            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.List;
            import java.util.concurrent.ConcurrentHashMap;
            
/* 295 */   public class OIo0Ii0oOIl extends OIloiiI1i1 {
                public static final HashMap I00oII;
                public static final OIo0Ii0oOIl I00oIiI10;
                public final IliIo0lOI I00lll10;
                public final boolean I00o0iI0io1;
                public O1OoooIi1Ol0 I00o0l1o1o0;
                public final I0i110Oli0 I00o101lO;
                public II1i0i0ilO I00oI0i;

                static {
/* 3 */             HashMap map = new HashMap();
/* 6 */             I00oII = map;
/* 12 */            map.put("ff", "f_f");
/* 19 */            map.put("ffi", "f_f_i");
/* 26 */            map.put("ffl", "f_f_l");
/* 33 */            map.put("fi", "f_i");
/* 40 */            map.put("fl", "f_l");
/* 47 */            map.put("st", "s_t");
/* 54 */            map.put("IJ", "I_J");
/* 61 */            map.put("ij", "i_j");
/* 68 */            map.put("ellipsis", "elipsis");
/* 75 */            new OIo0Ii0oOIl("Times-Roman");
/* 82 */            new OIo0Ii0oOIl("Times-Bold");
/* 89 */            new OIo0Ii0oOIl("Times-Italic");
/* 96 */            new OIo0Ii0oOIl("Times-BoldItalic");
/* 106 */           I00oIiI10 = new OIo0Ii0oOIl("Helvetica");
/* 112 */           new OIo0Ii0oOIl("Helvetica-Bold");
/* 119 */           new OIo0Ii0oOIl("Helvetica-Oblique");
/* 126 */           new OIo0Ii0oOIl("Helvetica-BoldOblique");
/* 133 */           new OIo0Ii0oOIl("Courier");
/* 140 */           new OIo0Ii0oOIl("Courier-Bold");
/* 147 */           new OIo0Ii0oOIl("Courier-Oblique");
/* 154 */           new OIo0Ii0oOIl("Courier-BoldOblique");
/* 161 */           new OIo0Ii0oOIl("Symbol");
/* 168 */           new OIo0Ii0oOIl("ZapfDingbats");
                }

                /* JADX WARN: Multi-variable type inference failed */
                public OIo0Ii0oOIl(IIOoi0ooOoO iIOoi0ooOoO) throws Throwable {
                    int i;
/* 3 */             super(iIOoi0ooOoO);
/* 8 */             new HashMap();
/* 11 */            OIll1lio oIll1lio = this.I00iio;
/* 13 */            Object[] objArr = 0;
/* 16 */            OoIoiiol0o ooIoiiol0oI000O01llI0 = null;
/* 17 */            if (oIll1lio != null) {
/* 23 */                if (oIll1lio.I00000oOI() != null) {
/* 27 */                    Log.w("PdfBox-Android", "/FontFile3 for Type1 font not supported");
                        }
/* 34 */                IIOoOiOI iIOoOiOII00oII = oIll1lio.I00iOIl.I00oII(IIi0I0I0o.I01i01OoI);
/* 50 */                OIllIlO1 oIllIlO1 = iIOoOiOII00oII instanceof IIi0io1lIo ? new OIllIlO1((IIi0io1lIo) iIOoOiOII00oII) : null;
/* 51 */                if (oIllIlO1 != null) {
                            try {
/* 55 */                        IIi0io1lIo iIi0io1lIo = (IIi0io1lIo) oIllIlO1.I00iiI;
/* 60 */                        int iI00oooO = iIi0io1lIo.I00oooO(IIi0I0I0o.I01o01, null, -1);
/* 66 */                        int iI00oooO2 = iIi0io1lIo.I00oooO(IIi0I0I0o.I01o0I, null, -1);
/* 70 */                        byte[] bArrI00000oIO = oIllIlO1.I00000oIO();
/* 75 */                        if (bArrI00000oIO.length == 0) {
/* 171 */                           throw new IOException("Font data unavailable");
                                }
/* 77 */                        int iI001i1O0Ol = I001i1O0Ol(iI00oooO, bArrI00000oIO);
/* 81 */                        int iI001i1lo1io = I001i1lo1io(bArrI00000oIO, iI001i1O0Ol, iI00oooO2);
/* 91 */                        if ((bArrI00000oIO[0] & 255) == 128) {
/* 93 */                            ooIoiiol0oI000O01llI0 = OoIoiiol0o.I0000oI00(bArrI00000oIO);
                                } else {
/* 101 */                           if (iI001i1O0Ol < 0 || iI001i1O0Ol > (i = iI001i1O0Ol + iI001i1lo1io)) {
/* 163 */                               throw new IOException("Invalid length data, actual length: " + bArrI00000oIO.length + ", /Length1: " + iI001i1O0Ol + ", /Length2: " + iI001i1lo1io);
                                    }
/* 107 */                           byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrI00000oIO, 0, iI001i1O0Ol);
/* 111 */                           byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArrI00000oIO, iI001i1O0Ol, i);
/* 115 */                           if (iI001i1O0Ol > 0 && iI001i1lo1io > 0) {
/* 124 */                               ooIoiiol0oI000O01llI0 = new OoIol00Ool(objArr == true ? 1 : 0).I000O01llI0(bArrCopyOfRange, bArrCopyOfRange2);
                                    }
                                }
                            } catch (Ii111OoO unused) {
/* 212 */                       Log.w("PdfBox-Android", "Can't read damaged embedded Type1 font " + oIll1lio.I0000Il00O());
                            } catch (IOException e) {
/* 190 */                       Log.e("PdfBox-Android", "Can't read the embedded Type1 font " + oIll1lio.I0000Il00O(), e);
                            }
                        }
                    }
/* 218 */           this.I00o0iI0io1 = ooIoiiol0oI000O01llI0 != null;
/* 220 */           if (ooIoiiol0oI000O01llI0 != null) {
/* 222 */               this.I00lll10 = ooIoiiol0oI000O01llI0;
                    } else {
/* 233 */               IIOo1i iIOo1iI000O01llI0 = iliiOo0IllO.I00000oIO().I000O01llI0(I001IO000(), oIll1lio);
/* 239 */               IliIo0lOI iliIo0lOI = (IliIo0lOI) iIOo1iI000O01llI0.I0000Il00O;
/* 241 */               this.I00lll10 = iliIo0lOI;
/* 245 */               if (iIOo1iI000O01llI0.I00000oOI) {
/* 277 */                   Log.w("PdfBox-Android", "Using fallback font " + iliIo0lOI.getName() + " for " + I001IO000());
                        }
                    }
/* 280 */           I0010o();
/* 287 */           I0i110Oli0 i0i110Oli0I00000oOI = I00000oIO().I00000oOI();
/* 291 */           this.I00o101lO = i0i110Oli0I00000oOI;
/* 293 */           i0i110Oli0I00000oOI.I00000oIO();
                }

                public static int I001IIilI0O(int i, byte[] bArr) {
                    byte b;
/* 1 */             while (i > 0) {
/* 7 */                 if (bArr[i] == 101 && bArr[i + 1] == 120 && bArr[i + 2] == 101 && bArr[i + 3] == 99) {
/* 31 */                    int i2 = i + 4;
/* 34 */                    while (i2 < bArr.length && ((b = bArr[i2]) == 13 || b == 10 || b == 32 || b == 9)) {
/* 54 */                        i2++;
                            }
/* 57 */                    return i2;
                        }
                        i--;
                    }
/* 89 */            return i;
                }

                @Override
                public final O1OoooIi1Ol0 I00000oIO() {
                    List listI00000oIO;
/* 1 */             O1OoooIi1Ol0 o1OoooIi1Ol0 = OIll100.I00l0I0l0lO1;
/* 3 */             O1OoooIi1Ol0 o1OoooIi1Ol02 = this.I00o0l1o1o0;
/* 5 */             if (o1OoooIi1Ol02 != null) {
/* 113 */               return o1OoooIi1Ol02;
                    }
                    try {
/* 9 */                 listI00000oIO = this.I00lll10.I00000oIO();
                    } catch (IOException unused) {
/* 14 */                this.I00o0l1o1o0 = o1OoooIi1Ol0;
/* 16 */                listI00000oIO = null;
                    }
/* 17 */            if (listI00000oIO == null || listI00000oIO.size() != 6) {
/* 100 */               return o1OoooIi1Ol0;
                    }
/* 94 */            O1OoooIi1Ol0 o1OoooIi1Ol03 = new O1OoooIi1Ol0(((Number) listI00000oIO.get(0)).floatValue(), ((Number) listI00000oIO.get(1)).floatValue(), ((Number) listI00000oIO.get(2)).floatValue(), ((Number) listI00000oIO.get(3)).floatValue(), ((Number) listI00000oIO.get(4)).floatValue(), ((Number) listI00000oIO.get(5)).floatValue());
/* 97 */            this.I00o0l1o1o0 = o1OoooIi1Ol03;
/* 99 */            return o1OoooIi1Ol03;
                }

                /* JADX WARN: Removed duplicated region for block: B:17:0x0031 A[PHI: r5
                  0x0031: PHI (r5v15 java.lang.String) = (r5v7 java.lang.String), (r5v3 java.lang.String) binds: [B:23:0x004d, B:16:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:32:0x007f  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final float I00000oOI(int i) throws NumberFormatException {
                    Integer num;
/* 1 */             Il0IIl0OOI il0IIl0OOI = this.I00l0OO0IO;
/* 7 */             String strI0000Il00O = il0IIl0OOI != null ? il0IIl0OOI.I0000Il00O(i) : ".notdef";
/* 15 */            boolean z = this.I00o0iI0io1;
/* 17 */            IliIo0lOI iliIo0lOI = this.I00lll10;
/* 19 */            if (!z && !iliIo0lOI.I000II(strI0000Il00O)) {
/* 34 */                String strI00000oIO = (String) I00oII.get(strI0000Il00O);
/* 36 */                if (strI00000oIO == null || strI0000Il00O.equals(".notdef") || !iliIo0lOI.I000II(strI00000oIO)) {
/* 54 */                    String strI0000Il00O2 = this.I00li1OI.I0000Il00O(strI0000Il00O);
/* 58 */                    if (strI0000Il00O2 == null || strI0000Il00O2.length() != 1) {
/* 3 */                         strI0000Il00O = ".notdef";
                            } else {
/* 70 */                        strI00000oIO = li00oIo.I00000oIO(strI0000Il00O2.codePointAt(0));
/* 78 */                        if (iliIo0lOI.I000II(strI00000oIO)) {
/* 50 */                            strI0000Il00O = strI00000oIO;
                                } else if ("SymbolMT".equals(iliIo0lOI.getName()) && (num = (Integer) Collections.unmodifiableMap(OllIIi1i11.I00iio.I00iiI).get(strI0000Il00O)) != null) {
/* 117 */                           strI0000Il00O = li00oIo.I00000oIO(num.intValue() + 61440);
/* 125 */                           if (!iliIo0lOI.I000II(strI0000Il00O)) {
                                    }
                                }
                            }
                        }
                    }
/* 129 */           if (!z && ".notdef".equals(strI0000Il00O)) {
/* 137 */               return 250.0f;
                    }
/* 145 */           float[] fArr = {iliIo0lOI.I000O01llI0(strI0000Il00O), 0.0f};
/* 154 */           this.I00o101lO.I00000oOI(fArr, fArr);
/* 157 */           return fArr[0];
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return this.I00o0iI0io1;
                }

                @Override
                public final float I0000O() {
/* 1 */             IliiI1 iliiI1 = this.I00iiO;
                    return iliiI1 != null ? iliiI1.I00000oIO() : super.I0000O();
                }

                @Override
                public final int I000oI1ioi(ByteArrayInputStream byteArrayInputStream) {
/* 1 */             return byteArrayInputStream.read();
                }

                @Override
                public final Il0IIl0OOI I00111O() {
                    IliiI1 iliiI1;
/* 3 */             if (!this.I00o0iI0io1 && (iliiI1 = this.I00iiO) != null) {
/* 11 */                return new IIIO1i1oOl01(iliiI1);
                    }
/* 15 */            IliIo0lOI iliIo0lOI = this.I00lll10;
                    return iliIo0lOI instanceof Il01o0OlloO ? IIIO1i1oOl01.I0000O(((Il01o0OlloO) iliIo0lOI).I00000oOI()) : OlIlI0.I00iio;
                }

                public final String I001IO000() {
/* 5 */             return this.I00iOIl.I010101Oo1lO(IIi0I0I0o.I00ol1);
                }

                public final int I001i1O0Ol(int i, byte[] bArr) {
/* 4 */             int iMax = Math.max(0, i - 4);
/* 8 */             if (iMax <= 0 || iMax > bArr.length - 4) {
                        iMax = bArr.length - 4;
                    }
/* 18 */            int iI001IIilI0O = I001IIilI0O(iMax, bArr);
/* 22 */            if (iI001IIilI0O == 0 && i > 0) {
/* 29 */                iI001IIilI0O = I001IIilI0O(bArr.length - 4, bArr);
                    }
/* 35 */            if (i - iI001IIilI0O == 0 || iI001IIilI0O <= 0) {
/* 89 */                return i;
                    }
/* 43 */            StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("Ignored invalid Length1 ", i, " for Type 1 font ");
/* 51 */            sbI00100o1O0lo.append(I001IO000());
/* 60 */            Log.w("PdfBox-Android", sbI00100o1O0lo.toString());
/* 63 */            return iI001IIilI0O;
                }

                public final int I001i1lo1io(byte[] bArr, int i, int i2) {
/* 1 */             if (i2 >= 0 && i2 <= bArr.length - i) {
/* 8 */                 return i2;
                    }
/* 13 */            StringBuilder sbI00100o1O0lo = IlIi0I0.I00100o1O0lo("Ignored invalid Length2 ", i2, " for Type 1 font ");
/* 21 */            sbI00100o1O0lo.append(I001IO000());
/* 30 */            Log.w("PdfBox-Android", sbI00100o1O0lo.toString());
/* 34 */            return bArr.length - i;
                }

                @Override
                public final II1i0i0ilO getBoundingBox() {
                    OIloOoil011l oIloOoil011lI00000oIO;
/* 1 */             II1i0i0ilO iI1i0i0ilO = this.I00oI0i;
/* 3 */             if (iI1i0i0ilO != null) {
/* 113 */               return iI1i0i0ilO;
                    }
/* 5 */             OIll1lio oIll1lio = this.I00iio;
/* 72 */            II1i0i0ilO iI1i0i0ilOI0000Il00O = (oIll1lio == null || (oIloOoil011lI00000oIO = oIll1lio.I00000oIO()) == null || (oIloOoil011lI00000oIO.I00000oIO() == 0.0f && oIloOoil011lI00000oIO.I00000oOI() == 0.0f && oIloOoil011lI00000oIO.I0000Il00O() == 0.0f && oIloOoil011lI00000oIO.I0000O() == 0.0f)) ? this.I00lll10.I0000Il00O() : new II1i0i0ilO(oIloOoil011lI00000oIO.I00000oIO(), oIloOoil011lI00000oIO.I00000oOI(), oIloOoil011lI00000oIO.I0000Il00O(), oIloOoil011lI00000oIO.I0000O());
/* 76 */            this.I00oI0i = iI1i0i0ilOI0000Il00O;
/* 78 */            return iI1i0i0ilOI0000Il00O;
                }

                @Override
                public final String getName() {
/* 1 */             return I001IO000();
                }

/* 296 */       public OIo0Ii0oOIl(String str) {
                    String name;
/* 298 */           this.I00io1l = -1.0f;
/* 299 */           IIOoi0ooOoO iIOoi0ooOoO = new IIOoi0ooOoO();
                    this.I00iOIl = iIOoi0ooOoO;
/* 300 */           iIOoi0ooOoO.I010iIIOlo(IIi0I0I0o.I0IilI00l, IIi0I0I0o.I01OoIoio00O);
/* 301 */           this.I00iiI = null;
/* 302 */           IliiI1 iliiI1I00000oIO = OlIl10I01i.I00000oIO(str);
                    this.I00iiO = iliiI1I00000oIO;
                    if (iliiI1I00000oIO != null) {
/* 303 */               OIll1lio oIll1lioI00000oIO = l1lloOI01o1.I00000oIO(iliiI1I00000oIO);
                        this.I00iio = oIll1lioI00000oIO;
/* 304 */               this.I00ioIO = new ConcurrentHashMap();
/* 305 */               this.I00lli11 = new HashSet();
/* 306 */               if ("ZapfDingbats".equals(str)) {
/* 308 */                   this.I00li1OI = Io0O0o0l1o.I0000oI00;
                        } else {
/* 310 */                   this.I00li1OI = Io0O0o0l1o.I0000O;
                        }
/* 311 */               iIOoi0ooOoO.I010iIIOlo(IIi0I0I0o.I0Ii0oI1, IIi0I0I0o.I0Il0000oli);
/* 312 */               iIOoi0ooOoO.I010l10O(IIi0I0I0o.I00ol1, str);
/* 313 */               if ("ZapfDingbats".equals(str)) {
/* 314 */                   this.I00l0OO0IO = i0I0Il.I00iio;
                        } else if ("Symbol".equals(str)) {
/* 316 */                   this.I00l0OO0IO = OllIIi1i11.I00iio;
                        } else {
/* 317 */                   this.I00l0OO0IO = i00I0Iil.I00iio;
/* 318 */                   iIOoi0ooOoO.I010iIIOlo(IIi0I0I0o.I01O10iIoo1O, IIi0I0I0o.I0IliI0i);
                        }
/* 319 */               new ConcurrentHashMap();
/* 321 */               IIOo1i iIOo1iI000O01llI0 = iliiOo0IllO.I00000oIO().I000O01llI0(I001IO000(), oIll1lioI00000oIO);
/* 322 */               IliIo0lOI iliIo0lOI = (IliIo0lOI) iIOo1iI000O01llI0.I0000Il00O;
/* 323 */               this.I00lll10 = iliIo0lOI;
/* 324 */               if (iIOo1iI000O01llI0.I00000oOI) {
                            try {
/* 325 */                       name = iliIo0lOI.getName();
                            } catch (IOException unused) {
/* 326 */                       name = "?";
                            }
/* 328 */                   StringBuilder sbI001IIilI0O = IIlIOloOOO.I001IIilI0O("Using fallback font ", name, " for base font ");
/* 329 */                   sbI001IIilI0O.append(I001IO000());
                            Log.w("PdfBox-Android", sbI001IIilI0O.toString());
                        }
/* 330 */               this.I00o0iI0io1 = false;
/* 332 */               I0i110Oli0 i0i110Oli0 = new I0i110Oli0();
/* 333 */               i0i110Oli0.I00iio = 1.0d;
                        i0i110Oli0.I00iOIl = 1.0d;
/* 334 */               i0i110Oli0.I00ilO0 = 0.0d;
                        i0i110Oli0.I00ilI0I1 = 0.0d;
                        i0i110Oli0.I00iiO = 0.0d;
                        i0i110Oli0.I00iiI = 0.0d;
/* 335 */               this.I00o101lO = i0i110Oli0;
                        return;
                    }
/* 336 */           I000II.I000iOII("No AFM for font ".concat(str));
                    throw null;
                }
            }
