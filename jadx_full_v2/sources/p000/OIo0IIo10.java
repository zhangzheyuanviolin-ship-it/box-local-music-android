            package p000;

            import android.util.Log;
            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.util.HashMap;
            import java.util.List;
            
            public final class OIo0IIo10 extends OIloiiI1i1 {
                public Float I00lll10;
                public O1OoooIi1Ol0 I00o0iI0io1;
                public final I0i110Oli0 I00o0l1o1o0;
                public final IliIo0lOI I00o101lO;
                public final boolean I00oI0i;
                public II1i0i0ilO I00oII;

                public OIo0IIo10(IIOoi0ooOoO iIOoi0ooOoO) throws Throwable {
                    byte[] bArrI00000oIO;
                    OIllIlO1 oIllIlO1I00000oOI;
/* 3 */             super(iIOoi0ooOoO);
/* 8 */             new HashMap();
/* 11 */            IIOiool0I iIOiool0I = null;
/* 12 */            this.I00lll10 = null;
/* 14 */            OIll1lio oIll1lio = this.I00iio;
/* 18 */            if (oIll1lio == null || (oIllIlO1I00000oOI = oIll1lio.I00000oOI()) == null) {
/* 56 */                bArrI00000oIO = null;
                    } else {
/* 26 */                bArrI00000oIO = oIllIlO1I00000oOI.I00000oIO();
/* 31 */                if (bArrI00000oIO.length == 0) {
/* 53 */                    Log.e("PdfBox-Android", "Invalid data for embedded Type1C font " + iIOoi0ooOoO.I010101Oo1lO(IIi0I0I0o.I00ol1));
/* 56 */                    bArrI00000oIO = null;
                        }
                    }
/* 58 */            if (bArrI00000oIO != null) {
                        try {
/* 80 */                    IIOOOIl1oI iIOOOIl1oI = (IIOOOIl1oI) new IIOilloI0l0o(0).I00000oOI(bArrI00000oIO, new o0llIi(13)).get(0);
/* 84 */                    if (iIOOOIl1oI instanceof IIOiool0I) {
/* 86 */                        iIOiool0I = (IIOiool0I) iIOOOIl1oI;
                            } else {
/* 104 */                       Log.e("PdfBox-Android", "Expected CFFType1Font, got ".concat(iIOOOIl1oI.getClass().getSimpleName()));
                            }
                        } catch (IOException e) {
/* 130 */                   Log.e("PdfBox-Android", "Can't read the embedded Type1C font " + this.I00iOIl.I010101Oo1lO(IIi0I0I0o.I00ol1), e);
                        }
                    }
/* 133 */           if (iIOiool0I != null) {
/* 135 */               this.I00o101lO = iIOiool0I;
/* 138 */               this.I00oI0i = true;
                    } else {
/* 141 */               Ilii0Oi0I1O ilii0Oi0I1OI00000oIO = iliiOo0IllO.I00000oIO();
/* 145 */               IIOoi0ooOoO iIOoi0ooOoO2 = this.I00iOIl;
/* 147 */               IIi0I0I0o iIi0I0I0o = IIi0I0I0o.I00ol1;
/* 153 */               IIOo1i iIOo1iI000O01llI0 = ilii0Oi0I1OI00000oIO.I000O01llI0(iIOoi0ooOoO2.I010101Oo1lO(iIi0I0I0o), oIll1lio);
/* 159 */               IliIo0lOI iliIo0lOI = (IliIo0lOI) iIOo1iI000O01llI0.I0000Il00O;
/* 161 */               this.I00o101lO = iliIo0lOI;
/* 165 */               if (iIOo1iI000O01llI0.I00000oOI) {
/* 199 */                   Log.w("PdfBox-Android", "Using fallback font " + iliIo0lOI.getName() + " for " + this.I00iOIl.I010101Oo1lO(iIi0I0I0o));
                        }
/* 202 */               this.I00oI0i = false;
                    }
/* 204 */           I0010o();
/* 211 */           I0i110Oli0 i0i110Oli0I00000oOI = I00000oIO().I00000oOI();
/* 215 */           this.I00o0l1o1o0 = i0i110Oli0I00000oOI;
/* 217 */           i0i110Oli0I00000oOI.I00000oIO();
                }

                @Override
                public final O1OoooIi1Ol0 I00000oIO() {
                    List listI00000oIO;
/* 1 */             O1OoooIi1Ol0 o1OoooIi1Ol0 = OIll100.I00l0I0l0lO1;
/* 3 */             O1OoooIi1Ol0 o1OoooIi1Ol02 = this.I00o0iI0io1;
/* 5 */             if (o1OoooIi1Ol02 != null) {
/* 113 */               return o1OoooIi1Ol02;
                    }
                    try {
/* 9 */                 listI00000oIO = this.I00o101lO.I00000oIO();
                    } catch (IOException unused) {
/* 14 */                this.I00o0iI0io1 = o1OoooIi1Ol0;
/* 16 */                listI00000oIO = null;
                    }
/* 17 */            if (listI00000oIO == null || listI00000oIO.size() != 6) {
/* 100 */               return o1OoooIi1Ol0;
                    }
/* 94 */            O1OoooIi1Ol0 o1OoooIi1Ol03 = new O1OoooIi1Ol0(((Number) listI00000oIO.get(0)).floatValue(), ((Number) listI00000oIO.get(1)).floatValue(), ((Number) listI00000oIO.get(2)).floatValue(), ((Number) listI00000oIO.get(3)).floatValue(), ((Number) listI00000oIO.get(4)).floatValue(), ((Number) listI00000oIO.get(5)).floatValue());
/* 97 */            this.I00o0iI0io1 = o1OoooIi1Ol03;
/* 99 */            return o1OoooIi1Ol03;
                }

                /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final float I00000oOI(int i) throws NumberFormatException {
/* 3 */             String strI0000Il00O = this.I00l0OO0IO.I0000Il00O(i);
/* 7 */             boolean z = this.I00oI0i;
/* 11 */            IliIo0lOI iliIo0lOI = this.I00o101lO;
/* 13 */            if (!z && !iliIo0lOI.I000II(strI0000Il00O)) {
/* 24 */                String strI0000Il00O2 = this.I00li1OI.I0000Il00O(strI0000Il00O);
/* 28 */                if (strI0000Il00O2 == null || strI0000Il00O2.length() != 1) {
/* 51 */                    strI0000Il00O = ".notdef";
                        } else {
/* 40 */                    strI0000Il00O = li00oIo.I00000oIO(strI0000Il00O2.codePointAt(0));
/* 48 */                    if (!iliIo0lOI.I000II(strI0000Il00O)) {
                            }
                        }
                    }
/* 58 */            float[] fArr = {iliIo0lOI.I000O01llI0(strI0000Il00O), 0.0f};
/* 67 */            this.I00o0l1o1o0.I00000oOI(fArr, fArr);
/* 70 */            return fArr[0];
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return this.I00oI0i;
                }

                @Override
                public final float I0000O() {
/* 1 */             Float fValueOf = this.I00lll10;
/* 3 */             if (fValueOf == null) {
/* 7 */                 fValueOf = Float.valueOf(500.0f);
/* 11 */                this.I00lll10 = fValueOf;
                    }
/* 13 */            return fValueOf.floatValue();
                }

                @Override
                public final int I000oI1ioi(ByteArrayInputStream byteArrayInputStream) {
/* 1 */             return byteArrayInputStream.read();
                }

                @Override
                public final Il0IIl0OOI I00111O() {
                    IliiI1 iliiI1;
/* 3 */             if (!this.I00oI0i && (iliiI1 = this.I00iiO) != null) {
/* 11 */                return new IIIO1i1oOl01(iliiI1);
                    }
/* 15 */            IliIo0lOI iliIo0lOI = this.I00o101lO;
                    return iliIo0lOI instanceof Il01o0OlloO ? IIIO1i1oOl01.I0000O(((Il01o0OlloO) iliIo0lOI).I00000oOI()) : OlIlI0.I00iio;
                }

                @Override
                public final II1i0i0ilO getBoundingBox() {
                    OIloOoil011l oIloOoil011lI00000oIO;
/* 1 */             II1i0i0ilO iI1i0i0ilO = this.I00oII;
/* 3 */             if (iI1i0i0ilO != null) {
/* 113 */               return iI1i0i0ilO;
                    }
/* 5 */             OIll1lio oIll1lio = this.I00iio;
/* 72 */            II1i0i0ilO iI1i0i0ilOI0000Il00O = (oIll1lio == null || (oIloOoil011lI00000oIO = oIll1lio.I00000oIO()) == null || (oIloOoil011lI00000oIO.I00000oIO() == 0.0f && oIloOoil011lI00000oIO.I00000oOI() == 0.0f && oIloOoil011lI00000oIO.I0000Il00O() == 0.0f && oIloOoil011lI00000oIO.I0000O() == 0.0f)) ? this.I00o101lO.I0000Il00O() : new II1i0i0ilO(oIloOoil011lI00000oIO.I00000oIO(), oIloOoil011lI00000oIO.I00000oOI(), oIloOoil011lI00000oIO.I0000Il00O(), oIloOoil011lI00000oIO.I0000O());
/* 76 */            this.I00oII = iI1i0i0ilOI0000Il00O;
/* 78 */            return iI1i0i0ilOI0000Il00O;
                }

                @Override
                public final String getName() {
/* 5 */             return this.I00iOIl.I010101Oo1lO(IIi0I0I0o.I00ol1);
                }
            }
