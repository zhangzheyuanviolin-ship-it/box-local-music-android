            package p000;

            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            import java.util.Arrays;
            
            public abstract class OiII0lO1i1 {
                public static final IOIOill I00000oIO;

                static {
/* 5 */             Ill0IO ill0IO = new Ill0IO("java.lang.Void");
/* 23 */            I00000oIO = new IOIOill(ill0IO.I00000oOI(), ill0IO.I00000oIO.I000II());
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static O0I1IIl1i0oo I00000oIO(Illlil illlil) {
/* 5 */             String strI00000oIO = lOO1li.I00000oIO(illlil);
/* 9 */             if (strI00000oIO == null) {
/* 13 */                if (illlil instanceof OOOOI1ioIo) {
/* 27 */                    strI00000oIO = O0I00o0.I00000oIO(IiOiOOIo.I000OOo1O(illlil).getName().I00000oOI());
                        } else if (illlil instanceof OOOOOO0O) {
/* 44 */                    String strI00000oOI = IiOiOOIo.I000OOo1O(illlil).getName().I00000oOI();
/* 66 */                    strI00000oIO = "set".concat(O0I00o0.I00000oOI(strI00000oOI) ? strI00000oOI.substring(2) : iOl0l0o0o.I00000oIO(strI00000oOI));
                        } else {
/* 78 */                    strI00000oIO = ((Ii1Ooli) illlil).getName().I00000oOI();
                        }
                    }
/* 90 */            return new O0I1IIl1i0oo(new O0I1Ii1l0(strI00000oIO, l1OOo1o1l.I00000oIO(illlil, 1)));
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static l0OOiIiiO0 I00000oOI(OOOO01l oOOO01l) {
                    String string;
                    String strI0010I0i;
/* 7 */             OOOO01l oOOO01lI010i10l = ((OOOO01l) IiOiIO0i1Oil.I0010I0i(oOOO01l)).I010i10l();
/* 14 */            if (oOOO01lI010i10l instanceof IiOo1oO101oi) {
/* 17 */                IiOo1oO101oi iiOo1oO101oi = (IiOo1oO101oi) oOOO01lI010i10l;
/* 19 */                OOOo0i11Ol oOOo0i11Ol = iiOo1oO101oi.I00oo1iO0ll;
/* 27 */                O0IIO0lO o0IIO0lO = (O0IIO0lO) lIOIiol1IoI.I00000oIO(oOOo0i11Ol, O0IIoOIiII0O.I0000O);
/* 29 */                if (o0IIO0lO != null) {
/* 33 */                    OI1IlOlol oI1IlOlol = iiOo1oO101oi.I00ooIo0;
/* 35 */                    Oi0Oooi oi0Oooi = iiOo1oO101oi.I00ooiO1I;
/* 37 */                    O0II0l o0II0l = new O0II0l();
/* 40 */                    o0II0l.I00000oIO = oOOO01lI010i10l;
/* 42 */                    o0II0l.I00000oOI = oOOo0i11Ol;
/* 44 */                    o0II0l.I0000Il00O = o0IIO0lO;
/* 46 */                    o0II0l.I0000O = oI1IlOlol;
/* 48 */                    o0II0l.I0000oI00 = oi0Oooi;
/* 54 */                    if (o0IIO0lO.I000OOo1O()) {
/* 72 */                        strI0010I0i = oI1IlOlol.getString(o0IIO0lO.I00ilI0I1.I00iiO).concat(oI1IlOlol.getString(o0IIO0lO.I00ilI0I1.I00iio));
                            } else {
/* 78 */                        Il1lll0iI il1lll0iI = O0IO00o0OI0.I00000oIO;
/* 81 */                        O0I1IOiOIo o0I1IOiOIoI00000oOI = O0IO00o0OI0.I00000oOI(oOOo0i11Ol, oI1IlOlol, oi0Oooi, true);
/* 85 */                        if (o0I1IOiOIoI00000oOI == null) {
/* 242 */                           IoOOl0iOl1io.I001IIilI0O("No field signature for property: ", oOOO01lI010i10l);
/* 13 */                            return null;
                                }
/* 87 */                        String str = o0I1IOiOIoI00000oOI.I00000oOI;
/* 89 */                        String str2 = o0I1IOiOIoI00000oOI.I0000Il00O;
/* 97 */                        StringBuilder sb = new StringBuilder(O0I00o0.I00000oIO(str));
/* 103 */                       Ii1Ool1 ii1Ool1I000lI = ((Ii1i0IO0) oOOO01lI010i10l).I000lI();
/* 107 */                       OOOO1o oOOO1o = (OOOO1o) oOOO01lI010i10l;
/* 121 */                       if (O0000Ioio00.I0000O(oOOO1o.I000OiO(), IiOiioI.I0000O) && (ii1Ool1I000lI instanceof IiOlI10iOI)) {
/* 137 */                           Integer num = (Integer) lIOIiol1IoI.I00000oIO(((IiOlI10iOI) ii1Ool1I000lI).I00ilI0I1, O0IIoOIiII0O.I000II);
/* 160 */                           string = "$".concat(OI1Ioo0OiIl.I00000oIO.I0000oI00(num != null ? oI1IlOlol.getString(num.intValue()) : "main", "_"));
                                } else if (O0000Ioio00.I0000O(oOOO1o.I000OiO(), IiOiioI.I00000oIO) && (ii1Ool1I000lI instanceof OIo0il)) {
/* 181 */                           IiOlIoIo iiOlIoIo = iiOo1oO101oi.I0100i;
/* 185 */                           if (iiOlIoIo instanceof O0I1l1l) {
/* 187 */                               O0I1l1l o0I1l1l = (O0I1l1l) iiOlIoIo;
/* 191 */                               if (o0I1l1l.I00iiI != null) {
/* 195 */                                   StringBuilder sb2 = new StringBuilder("$");
/* 200 */                                   String strI0000O = o0I1l1l.I00iOIl.I0000O();
/* 218 */                                   sb2.append(OI1Iio0ii1.I0000oI00(OlOoOIi0o.I00O0i0ii('/', strI0000O, strI0000O)).I00000oOI());
/* 221 */                                   string = sb2.toString();
                                        }
                                    }
                                } else {
/* 226 */                           string = "";
                                }
/* 230 */                       strI0010I0i = IIlIOloOOO.I0010I0i(sb, string, "()", str2);
                            }
/* 234 */                   o0II0l.I0001Ioi1lo = strI0010I0i;
/* 236 */                   VarHandle.storeStoreFence();
/* 239 */                   return o0II0l;
                        }
                    } else if (oOOO01lI010i10l instanceof O00o11il) {
/* 251 */               O00o11il o00o11il = (O00o11il) oOOO01lI010i10l;
/* 253 */               OlI1o0ooI olI1o0ooII0010I0i = o00o11il.I0010I0i();
/* 264 */               OiII0Oi oiII0Oi = olI1o0ooII0010I0i instanceof OiII0Oi ? (OiII0Oi) olI1o0ooII0010I0i : null;
/* 270 */               OOoI1O oOoI1O = oiII0Oi != null ? oiII0Oi.I00iOIl : null;
/* 273 */               if (oOoI1O instanceof OOoIIOoo0o) {
/* 279 */                   Field field = ((OOoIIOoo0o) oOoI1O).I00000oIO;
/* 281 */                   O0I1oo o0I1oo = new O0I1oo();
/* 284 */                   o0I1oo.I00000oIO = field;
/* 286 */                   VarHandle.storeStoreFence();
/* 289 */                   return o0I1oo;
                        }
/* 292 */               if (!(oOoI1O instanceof OOoIOiO0)) {
/* 351 */                   IOOlIIilOl0.I000OiO("Incorrect resolution sequence for Java field ", oOOO01lI010i10l, " (source = ", oOoI1O);
/* 13 */                    return null;
                        }
/* 298 */               Method method = ((OOoIOiO0) oOoI1O).I00000oIO;
/* 300 */               OOOOOO0O oooooo0o = o00o11il.I00olI;
/* 309 */               OlI1o0ooI olI1o0ooII0010I0i2 = oooooo0o != null ? oooooo0o.I0010I0i() : null;
/* 317 */               OiII0Oi oiII0Oi2 = olI1o0ooII0010I0i2 instanceof OiII0Oi ? (OiII0Oi) olI1o0ooII0010I0i2 : null;
/* 323 */               OOoI1O oOoI1O2 = oiII0Oi2 != null ? oiII0Oi2.I00iOIl : null;
/* 331 */               OOoIOiO0 oOoIOiO0 = oOoI1O2 instanceof OOoIOiO0 ? (OOoIOiO0) oOoI1O2 : null;
/* 334 */               Method method2 = oOoIOiO0 != null ? oOoIOiO0.I00000oIO : null;
/* 336 */               O0II000oIi o0II000oIi = new O0II000oIi();
/* 339 */               o0II000oIi.I00000oIO = method;
/* 341 */               o0II000oIi.I00000oOI = method2;
/* 343 */               VarHandle.storeStoreFence();
/* 346 */               return o0II000oIi;
                    }
/* 359 */           O0I1IIl1i0oo o0I1IIl1i0ooI00000oIO = I00000oIO(oOOO01lI010i10l.I00000oOI());
/* 363 */           OOOOOO0O oooooo0oI0000Il00O = oOOO01lI010i10l.I0000Il00O();
/* 369 */           O0I1IIl1i0oo o0I1IIl1i0ooI00000oIO2 = oooooo0oI0000Il00O != null ? I00000oIO(oooooo0oI0000Il00O) : null;
/* 375 */           O0II0lI o0II0lI = new O0II0lI();
/* 378 */           o0II0lI.I00000oIO = o0I1IIl1i0ooI00000oIO;
/* 380 */           o0II0lI.I00000oOI = o0I1IIl1i0ooI00000oIO2;
/* 382 */           VarHandle.storeStoreFence();
/* 966 */           return o0II0lI;
                }

                public static l0O1Iloooo I0000Il00O(Illlil illlil) throws SecurityException {
/* 7 */             Illlil illlilI010i10l = ((Illlil) IiOiIO0i1Oil.I0010I0i(illlil)).I010i10l();
/* 14 */            if (illlilI010i10l instanceof IiOioloo) {
/* 17 */                IiOlOoo0I iiOlOoo0I = (IiOlOoo0I) illlilI010i10l;
/* 19 */                I01Ilioliio i01IlioliioI001lIiIIo1O = iiOlOoo0I.I001lIiIIo1O();
/* 25 */                if (i01IlioliioI001lIiIIo1O instanceof OOOll1o0) {
/* 27 */                    Il1lll0iI il1lll0iI = O0IO00o0OI0.I00000oIO;
/* 40 */                    O0I1Ii1l0 o0I1Ii1l0I0000Il00O = O0IO00o0OI0.I0000Il00O((OOOll1o0) i01IlioliioI001lIiIIo1O, iiOlOoo0I.I00O0i0ii(), iiOlOoo0I.I00IlilI0i0i());
/* 44 */                    if (o0I1Ii1l0I0000Il00O != null) {
/* 48 */                        return new O0I1IIl1i0oo(o0I1Ii1l0I0000Il00O);
                            }
                        }
/* 54 */                if (i01IlioliioI001lIiIIo1O instanceof OOOiIOiii) {
/* 56 */                    Il1lll0iI il1lll0iI2 = O0IO00o0OI0.I00000oIO;
/* 68 */                    O0I1Ii1l0 o0I1Ii1l0I00000oIO = O0IO00o0OI0.I00000oIO((OOOiIOiii) i01IlioliioI001lIiIIo1O, iiOlOoo0I.I00O0i0ii(), iiOlOoo0I.I00IlilI0i0i());
/* 72 */                    if (o0I1Ii1l0I00000oIO != null) {
/* 74 */                        String str = o0I1Ii1l0I00000oIO.I00000oOI;
/* 76 */                        String str2 = o0I1Ii1l0I00000oIO.I0000Il00O;
/* 86 */                        if (Ioll0il1OI.I00000oOI(illlil.I000lI())) {
/* 90 */                            return new O0I1IIl1i0oo(o0I1Ii1l0I00000oIO);
                                }
/* 102 */                       if (!Ioll0il1OI.I0000Il00O(illlil.I000lI())) {
/* 202 */                           O0I11Ii1Ol o0I11Ii1Ol = new O0I11Ii1Ol();
/* 205 */                           o0I11Ii1Ol.I00000oIO = o0I1Ii1l0I00000oIO;
/* 211 */                           o0I11Ii1Ol.I00000oOI = o0I1Ii1l0I00000oIO.I00000oIO();
/* 213 */                           VarHandle.storeStoreFence();
/* 216 */                           return o0I11Ii1Ol;
                                }
/* 104 */                       IOo1IIOOiO1o iOo1IIOOiO1o = (IOo1IIOOiO1o) illlil;
/* 117 */                       if (iOo1IIOOiO1o.I001iOo1i0O()) {
/* 123 */                           if (!O0000Ioio00.I0000O(str, "constructor-impl") || !OlOolloIIOl0.I000II(str2, ")V", false)) {
/* 132 */                               OIiilo1Ool0o.I000O01llI0("Invalid signature: ", o0I1Ii1l0I00000oIO);
/* 13 */                                return null;
                                    }
                                } else {
/* 140 */                           if (!O0000Ioio00.I0000O(str, "constructor-impl")) {
/* 196 */                               OIiilo1Ool0o.I000O01llI0("Invalid signature: ", o0I1Ii1l0I00000oIO);
/* 13 */                                return null;
                                    }
/* 154 */                           String strI00000oOI = IOIOoo.I00000oOI(IiOiOOIo.I0001Ioi1lo(iOo1IIOOiO1o.I001l0I00()).I00000oOI());
/* 162 */                           if (OlOolloIIOl0.I000II(str2, ")V", false)) {
/* 176 */                               o0I1Ii1l0I00000oIO = new O0I1Ii1l0(str, OlOoOIi0o.I00IioO0OiOi(str2, "V").concat(strI00000oOI));
                                    } else if (!OlOolloIIOl0.I000II(str2, strI00000oOI, false)) {
/* 192 */                               OIiilo1Ool0o.I000O01llI0("Invalid signature: ", o0I1Ii1l0I00000oIO);
/* 13 */                                return null;
                                    }
                                }
/* 188 */                       return new O0I1IIl1i0oo(o0I1Ii1l0I00000oIO);
                            }
                        }
/* 217 */               return I00000oIO(illlilI010i10l);
                    }
/* 224 */           if (illlilI010i10l instanceof O00loo1i111O) {
/* 229 */               OlI1o0ooI olI1o0ooII0010I0i = ((O00loo1i111O) illlilI010i10l).I0010I0i();
/* 240 */               OiII0Oi oiII0Oi = olI1o0ooII0010I0i instanceof OiII0Oi ? (OiII0Oi) olI1o0ooII0010I0i : null;
/* 246 */               OOoI1O oOoI1O = oiII0Oi != null ? oiII0Oi.I00iOIl : null;
/* 254 */               OOoIOiO0 oOoIOiO0 = oOoI1O instanceof OOoIOiO0 ? (OOoIOiO0) oOoI1O : null;
/* 255 */               if (oOoIOiO0 == null) {
/* 272 */                   IoOOl0iOl1io.I001IIilI0O("Incorrect resolution sequence for Java method ", illlilI010i10l);
/* 13 */                    return null;
                        }
/* 257 */               Method method = oOoIOiO0.I00000oIO;
/* 261 */               O0I110loOlOl o0I110loOlOl = new O0I110loOlOl();
/* 264 */               o0I110loOlOl.I00000oIO = method;
/* 266 */               VarHandle.storeStoreFence();
/* 269 */               return o0I110loOlOl;
                    }
/* 278 */           if (!(illlilI010i10l instanceof O00l1io11)) {
/* 385 */               return I00000oIO(illlilI010i10l);
                    }
/* 283 */           OlI1o0ooI olI1o0ooII0010I0i2 = ((O00l1io11) illlilI010i10l).I0010I0i();
/* 294 */           OiII0Oi oiII0Oi2 = olI1o0ooII0010I0i2 instanceof OiII0Oi ? (OiII0Oi) olI1o0ooII0010I0i2 : null;
/* 300 */           OOoI1O oOoI1O2 = oiII0Oi2 != null ? oiII0Oi2.I00iOIl : null;
/* 303 */           if (oOoI1O2 instanceof OOoI10o1) {
/* 309 */               Constructor constructor = ((OOoI10o1) oOoI1O2).I00000oIO;
/* 311 */               O0I10olI o0I10olI = new O0I10olI();
/* 314 */               o0I10olI.I00000oIO = constructor;
/* 316 */               VarHandle.storeStoreFence();
/* 319 */               return o0I10olI;
                    }
/* 322 */           if (oOoI1O2 instanceof OOo1oliI) {
/* 327 */               Class cls = ((OOo1oliI) oOoI1O2).I00000oIO;
/* 333 */               if (cls.isAnnotation()) {
/* 337 */                   O0I10lOo o0I10lOo = new O0I10lOo();
/* 340 */                   Object[] declaredMethods = cls.getDeclaredMethods();
/* 348 */                   IliIiio1 iliIiio1 = new IliIiio1(21);
/* 352 */                   if (declaredMethods.length != 0) {
/* 356 */                       declaredMethods = Arrays.copyOf(declaredMethods, declaredMethods.length);
/* 362 */                       if (declaredMethods.length > 1) {
/* 364 */                           Arrays.sort(declaredMethods, iliIiio1);
                                }
                            }
/* 371 */                   o0I10lOo.I00000oIO = Arrays.asList(declaredMethods);
/* 373 */                   VarHandle.storeStoreFence();
/* 376 */                   return o0I10lOo;
                        }
                    }
/* 381 */           IOOlIIilOl0.I000OiO("Incorrect resolution sequence for Java constructor ", illlilI010i10l, " (", oOoI1O2);
/* 13 */            return null;
                }
            }
