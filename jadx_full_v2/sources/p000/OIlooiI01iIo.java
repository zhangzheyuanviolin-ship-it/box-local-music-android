            package p000;

            import java.io.ByteArrayInputStream;
            import java.util.Collections;
            import java.util.HashMap;
            import java.util.Map;
            
            public final class OIlooiI01iIo extends OIloiiI1i1 {
                public static final HashMap I00oO101o = new HashMap(250);
                public IOOIO1lI1ll I00lll10;
                public IOOIO1lI1ll I00o0iI0io1;
                public IOOIO1lI1ll I00o0l1o1o0;
                public boolean I00o101lO;
                public OoIllIioi1l I00oI0i;
                public boolean I00oII;
                public II1i0i0ilO I00oIiI10;

                static {
/* 30 */            for (Map.Entry entry : Collections.unmodifiableMap(O1O1io.I00ilO0.I00iOIl).entrySet()) {
/* 38 */                HashMap map = I00oO101o;
/* 48 */                if (!map.containsKey(entry.getValue())) {
/* 58 */                    map.put(entry.getValue(), entry.getKey());
                        }
                    }
                }

                @Override
                public final float I00000oOI(int i) throws NumberFormatException {
/* 1 */             int iI001IIilI0O = I001IIilI0O(i);
/* 5 */             OoIllIioi1l ooIllIioi1l = this.I00oI0i;
/* 7 */             float fI000l1 = ooIllIioi1l.I000l1(iI001IIilI0O);
/* 12 */            float fI00IoiI = ooIllIioi1l.I00IoiI();
                    return fI00IoiI != 1000.0f ? (1000.0f / fI00IoiI) * fI000l1 : fI000l1;
                }

                @Override
                public final boolean I0000Il00O() {
/* 1 */             return this.I00oII;
                }

                @Override
                public final int I000oI1ioi(ByteArrayInputStream byteArrayInputStream) {
/* 1 */             return byteArrayInputStream.read();
                }

                @Override
                public final Il0IIl0OOI I00111O() throws NumberFormatException {
                    String[] strArr;
                    IliiI1 iliiI1;
/* 3 */             if (!this.I00oII && (iliiI1 = this.I00iiO) != null) {
/* 11 */                return new IIIO1i1oOl01(iliiI1);
                    }
/* 19 */            if (I0010I0i() != null && !I0010I0i().booleanValue()) {
/* 31 */                return OlIlI0.I00iio;
                    }
/* 48 */            String str = (String) OlIl10I01i.I00000oIO.get(this.I00iOIl.I010101Oo1lO(IIi0I0I0o.I00ol1));
/* 54 */            if (I000l1() && !str.equals("Symbol") && !str.equals("ZapfDingbats")) {
/* 72 */                return OlIlI0.I00iio;
                    }
/* 83 */            OO1o0oIoil oO1o0oIoil = (OO1o0oIoil) this.I00oI0i.I00IOO("post");
/* 87 */            HashMap map = new HashMap();
/* 94 */            for (int i = 0; i <= 256; i++) {
/* 96 */                int iI001IIilI0O = I001IIilI0O(i);
/* 100 */               if (iI001IIilI0O > 0) {
/* 102 */                   String string = null;
/* 103 */                   if (oO1o0oIoil != null && iI001IIilI0O >= 0 && (strArr = oO1o0oIoil.I000II) != null && iI001IIilI0O < strArr.length) {
/* 115 */                       string = strArr[iI001IIilI0O];
                            }
/* 117 */                   if (string == null) {
/* 119 */                       string = Integer.toString(iI001IIilI0O);
                            }
/* 127 */                   map.put(Integer.valueOf(i), string);
                        }
                    }
/* 135 */           IIIO1i1oOl01 iIIO1i1oOl01 = new IIIO1i1oOl01(0);
/* 150 */           for (Map.Entry entry : map.entrySet()) {
/* 174 */               iIIO1i1oOl01.I00000oIO(((Integer) entry.getKey()).intValue(), (String) entry.getValue());
                    }
/* 541 */           return iIIO1i1oOl01;
                }

                public final int I001IIilI0O(int i) throws NumberFormatException {
                    IOOIO1lI1ll iOOIO1lI1ll;
                    Integer num;
                    String strI0000Il00O;
/* 1 */             OoIllIioi1l ooIllIioi1l = this.I00oI0i;
/* 5 */             int iI000II = 0;
/* 6 */             boolean z = true;
/* 7 */             if (!this.I00o101lO) {
/* 16 */                IOOIOIO iooioio = (IOOIOIO) ooIllIioi1l.I00IOO("cmap");
/* 18 */                if (iooioio != null) {
/* 24 */                    for (IOOIO1lI1ll iOOIO1lI1ll2 : iooioio.I0001Ioi1lo) {
/* 28 */                        int i2 = iOOIO1lI1ll2.I00iOIl;
/* 31 */                        if (3 == i2) {
/* 33 */                            int i3 = iOOIO1lI1ll2.I00iiI;
/* 35 */                            if (1 == i3) {
/* 37 */                                this.I00lll10 = iOOIO1lI1ll2;
                                    } else if (i3 == 0) {
/* 42 */                                this.I00o0iI0io1 = iOOIO1lI1ll2;
                                    }
                                } else if (1 == i2 && iOOIO1lI1ll2.I00iiI == 0) {
/* 51 */                            this.I00o0l1o1o0 = iOOIO1lI1ll2;
                                } else if (i2 == 0 && iOOIO1lI1ll2.I00iiI == 0) {
/* 60 */                            this.I00lll10 = iOOIO1lI1ll2;
                                } else if (i2 == 0 && 3 == iOOIO1lI1ll2.I00iiI) {
/* 69 */                            this.I00lll10 = iOOIO1lI1ll2;
                                }
                            }
                        }
/* 74 */                this.I00o101lO = true;
                    }
/* 76 */            Boolean boolI0010I0i = this.I00ll1;
/* 80 */            if (boolI0010I0i == null) {
/* 82 */                boolI0010I0i = I0010I0i();
/* 86 */                if (boolI0010I0i == null) {
/* 94 */                    if (I000l1()) {
/* 106 */                       String str = (String) OlIl10I01i.I00000oIO.get(getName());
/* 114 */                       if (!str.equals("Symbol") && !str.equals("ZapfDingbats")) {
/* 125 */                           z = false;
                                }
/* 126 */                       boolI0010I0i = Boolean.valueOf(z);
                            } else {
/* 131 */                       Il0IIl0OOI il0IIl0OOI = this.I00l0OO0IO;
/* 133 */                       if (il0IIl0OOI == null) {
/* 135 */                           boolI0010I0i = Boolean.TRUE;
                                } else if ((il0IIl0OOI instanceof i00I0Iil) || (il0IIl0OOI instanceof O1O1l10) || (il0IIl0OOI instanceof OlIlI0)) {
/* 224 */                           boolI0010I0i = Boolean.FALSE;
                                } else if (il0IIl0OOI instanceof Iii100lOoooi) {
/* 171 */                           for (String str2 : ((Iii100lOoooi) il0IIl0OOI).I00ilI0I1.values()) {
/* 183 */                               if (!".notdef".equals(str2) && (!i00I0Iil.I00iio.I00iiI.containsKey(str2) || !O1O1l10.I00iio.I00iiI.containsKey(str2) || !OlIlI0.I00iio.I00iiI.containsKey(str2))) {
/* 216 */                                   boolI0010I0i = Boolean.TRUE;
                                            break;
                                        }
                                    }
/* 219 */                           boolI0010I0i = Boolean.FALSE;
                                } else {
/* 222 */                           boolI0010I0i = null;
                                }
                            }
                        }
/* 226 */               if (boolI0010I0i != null) {
/* 228 */                   this.I00ll1 = boolI0010I0i;
                        } else {
/* 231 */                   boolI0010I0i = Boolean.TRUE;
/* 233 */                   this.I00ll1 = boolI0010I0i;
                        }
                    }
/* 239 */           if (boolI0010I0i.booleanValue()) {
/* 310 */               IOOIO1lI1ll iOOIO1lI1ll3 = this.I00lll10;
/* 312 */               if (iOOIO1lI1ll3 != null) {
/* 314 */                   Il0IIl0OOI il0IIl0OOI2 = this.I00l0OO0IO;
/* 318 */                   if ((il0IIl0OOI2 instanceof i00I0Iil) || (il0IIl0OOI2 instanceof O1O1l10)) {
/* 330 */                       String strI0000Il00O2 = il0IIl0OOI2.I0000Il00O(i);
/* 338 */                       if (!".notdef".equals(strI0000Il00O2)) {
/* 343 */                           String strI0000Il00O3 = Io0O0o0l1o.I0000O.I0000Il00O(strI0000Il00O2);
/* 347 */                           if (strI0000Il00O3 != null) {
/* 355 */                               iI000II = this.I00lll10.I000II(strI0000Il00O3.codePointAt(0));
                                    }
                                }
                            } else {
/* 325 */                       iI000II = iOOIO1lI1ll3.I000II(i);
                            }
                        }
/* 359 */               IOOIO1lI1ll iOOIO1lI1ll4 = this.I00o0iI0io1;
/* 361 */               if (iOOIO1lI1ll4 != null) {
/* 363 */                   iI000II = iOOIO1lI1ll4.I000II(i);
/* 367 */                   if (i >= 0 && i <= 255) {
/* 373 */                       if (iI000II == 0) {
/* 381 */                           iI000II = this.I00o0iI0io1.I000II(61440 + i);
                                }
/* 385 */                       if (iI000II == 0) {
/* 393 */                           iI000II = this.I00o0iI0io1.I000II(61696 + i);
                                }
/* 398 */                       if (iI000II == 0) {
/* 406 */                           iI000II = this.I00o0iI0io1.I000II(61952 + i);
                                }
                            }
                        }
                        return (iI000II != 0 || (iOOIO1lI1ll = this.I00o0l1o1o0) == null) ? iI000II : iOOIO1lI1ll.I000II(i);
                    }
/* 243 */           String strI0000Il00O4 = this.I00l0OO0IO.I0000Il00O(i);
/* 251 */           if (!".notdef".equals(strI0000Il00O4)) {
/* 256 */               if (this.I00lll10 != null && (strI0000Il00O = Io0O0o0l1o.I0000O.I0000Il00O(strI0000Il00O4)) != null) {
/* 272 */                   iI000II = this.I00lll10.I000II(strI0000Il00O.codePointAt(0));
                        }
/* 276 */               if (iI000II == 0 && this.I00o0l1o1o0 != null && (num = (Integer) I00oO101o.get(strI0000Il00O4)) != null) {
/* 298 */                   iI000II = this.I00o0l1o1o0.I000II(num.intValue());
                        }
                        return iI000II == 0 ? ooIllIioi1l.I00OIl(strI0000Il00O4) : iI000II;
                    }
/* 5 */             return 0;
                }

                @Override
                public final II1i0i0ilO getBoundingBox() {
                    OIloOoil011l oIloOoil011lI00000oIO;
/* 1 */             II1i0i0ilO iI1i0i0ilO = this.I00oIiI10;
/* 3 */             if (iI1i0i0ilO != null) {
/* 113 */               return iI1i0i0ilO;
                    }
/* 5 */             OIll1lio oIll1lio = this.I00iio;
/* 39 */            II1i0i0ilO iI1i0i0ilOI0000Il00O = (oIll1lio == null || (oIloOoil011lI00000oIO = oIll1lio.I00000oIO()) == null) ? this.I00oI0i.I0000Il00O() : new II1i0i0ilO(oIloOoil011lI00000oIO.I00000oIO(), oIloOoil011lI00000oIO.I00000oOI(), oIloOoil011lI00000oIO.I0000Il00O(), oIloOoil011lI00000oIO.I0000O());
/* 43 */            this.I00oIiI10 = iI1i0i0ilOI0000Il00O;
/* 45 */            return iI1i0i0ilOI0000Il00O;
                }

                @Override
                public final String getName() {
/* 5 */             return this.I00iOIl.I010101Oo1lO(IIi0I0I0o.I00ol1);
                }
            }
