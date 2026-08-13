            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class O0II0llIl {
                public final int I00000oIO;

                static {
/* 1 */             int i = Il1lll0iI.I00000oOI;
                }

                public O0II0llIl(int i) {
/* 1 */             this.I00000oIO = i;
                }

                private final Object I0000O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 3 */             O0IIiil00lI o0IIiil00lI = new O0IIiil00lI();
/* 7 */             o0IIiil00lI.I00ioIO = -1;
/* 9 */             o0IIiil00lI.I00l0OO0IO = -1;
/* 11 */            o0IIiil00lI.I00li1OI = (byte) -1;
/* 13 */            o0IIiil00lI.I00ll1 = -1;
/* 16 */            o0IIiil00lI.I00iiO = 1;
/* 18 */            boolean z = false;
/* 19 */            o0IIiil00lI.I00iio = 0;
/* 23 */            o0IIiil00lI.I00ilI0I1 = "";
/* 25 */            O0IIiO1iiio0 o0IIiO1iiio0 = O0IIiO1iiio0.NONE;
/* 27 */            o0IIiil00lI.I00ilO0 = o0IIiO1iiio0;
/* 29 */            List list = Collections.EMPTY_LIST;
/* 31 */            o0IIiil00lI.I00io1l = list;
/* 33 */            o0IIiil00lI.I00l0I0l0lO1 = list;
/* 35 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 39 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 43 */            int i = 0;
/* 48 */            while (!z) {
                        try {
                            try {
/* 50 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 54 */                        if (iI000o00OoI0I != 0) {
/* 58 */                            if (iI000o00OoI0I == 8) {
                                        o0IIiil00lI.I00iiI |= 1;
/* 334 */                               o0IIiil00lI.I00iiO = iOOOIOiO0io1.I000iOII();
                                    } else if (iI000o00OoI0I == 16) {
                                        o0IIiil00lI.I00iiI |= 2;
/* 321 */                               o0IIiil00lI.I00iio = iOOOIOiO0io1.I000iOII();
                                    } else if (iI000o00OoI0I == 24) {
/* 274 */                               int iI000iOII = iOOOIOiO0io1.I000iOII();
/* 292 */                               O0IIiO1iiio0 o0IIiO1iiio02 = iI000iOII != 0 ? iI000iOII != 1 ? iI000iOII != 2 ? null : O0IIiO1iiio0.DESC_TO_CLASS_ID : O0IIiO1iiio0.INTERNAL_TO_CLASS_ID : o0IIiO1iiio0;
/* 293 */                               if (o0IIiO1iiio02 == null) {
/* 295 */                                   i1I1OO00o1oI00111O.I00Io1lO(iI000o00OoI0I);
/* 298 */                                   i1I1OO00o1oI00111O.I00Io1lO(iI000iOII);
                                        } else {
                                            o0IIiil00lI.I00iiI |= 8;
/* 308 */                                   o0IIiil00lI.I00ilO0 = o0IIiO1iiio02;
                                        }
                                    } else if (iI000o00OoI0I == 32) {
/* 248 */                               if ((i & 16) != 16) {
/* 255 */                                   o0IIiil00lI.I00io1l = new ArrayList();
/* 257 */                                   i |= 16;
                                        }
/* 269 */                               o0IIiil00lI.I00io1l.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
                                    } else if (iI000o00OoI0I == 34) {
/* 198 */                               int iI0000oI00 = iOOOIOiO0io1.I0000oI00(iOOOIOiO0io1.I000iOII());
/* 204 */                               if ((i & 16) != 16 && iOOOIOiO0io1.I0000Il00O() > 0) {
/* 217 */                                   o0IIiil00lI.I00io1l = new ArrayList();
/* 219 */                                   i |= 16;
                                        }
/* 225 */                               while (iOOOIOiO0io1.I0000Il00O() > 0) {
/* 237 */                                   o0IIiil00lI.I00io1l.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
                                        }
/* 241 */                               iOOOIOiO0io1.I0000O(iI0000oI00);
                                    } else if (iI000o00OoI0I == 40) {
/* 168 */                               if ((i & 32) != 32) {
/* 175 */                                   o0IIiil00lI.I00l0I0l0lO1 = new ArrayList();
/* 177 */                                   i |= 32;
                                        }
/* 189 */                               o0IIiil00lI.I00l0I0l0lO1.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
                                    } else if (iI000o00OoI0I == 42) {
/* 119 */                               int iI0000oI002 = iOOOIOiO0io1.I0000oI00(iOOOIOiO0io1.I000iOII());
/* 125 */                               if ((i & 32) != 32 && iOOOIOiO0io1.I0000Il00O() > 0) {
/* 138 */                                   o0IIiil00lI.I00l0I0l0lO1 = new ArrayList();
/* 140 */                                   i |= 32;
                                        }
/* 146 */                               while (iOOOIOiO0io1.I0000Il00O() > 0) {
/* 158 */                                   o0IIiil00lI.I00l0I0l0lO1.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
                                        }
/* 162 */                               iOOOIOiO0io1.I0000O(iI0000oI002);
                                    } else if (iI000o00OoI0I == 50) {
/* 102 */                               O1101ooIo0l o1101ooIo0lI0001Ioi1lo = iOOOIOiO0io1.I0001Ioi1lo();
                                        o0IIiil00lI.I00iiI |= 4;
/* 112 */                               o0IIiil00lI.I00ilI0I1 = o1101ooIo0lI0001Ioi1lo;
                                    } else if (!iOOOIOiO0io1.I00100o1O0lo(iI000o00OoI0I, i1I1OO00o1oI00111O)) {
                                    }
                                }
/* 91 */                        z = true;
                            } catch (Throwable th) {
/* 355 */                       if ((i & 16) == 16) {
/* 363 */                           o0IIiil00lI.I00io1l = Collections.unmodifiableList(o0IIiil00lI.I00io1l);
                                }
/* 367 */                       if ((i & 32) == 32) {
/* 375 */                           o0IIiil00lI.I00l0I0l0lO1 = Collections.unmodifiableList(o0IIiil00lI.I00l0I0l0lO1);
                                }
                                try {
/* 377 */                           i1I1OO00o1oI00111O.I001iOo1i0O();
                                } catch (IOException unused) {
                                } catch (Throwable th2) {
/* 392 */                           o0IIiil00lI.I00iOIl = iIOI0o10I000lI.I000II();
/* 394 */                           throw th2;
                                }
/* 384 */                       o0IIiil00lI.I00iOIl = iIOI0o10I000lI.I000II();
/* 395 */                       throw th;
                            }
                        } catch (O001110li e) {
/* 350 */                   e.I00iOIl = o0IIiil00lI;
/* 352 */                   throw e;
                        } catch (IOException e2) {
/* 344 */                   O001110li o001110li = new O001110li(e2.getMessage());
/* 347 */                   o001110li.I00iOIl = o0IIiil00lI;
/* 349 */                   throw o001110li;
                        }
                    }
/* 398 */           if ((i & 16) == 16) {
/* 406 */               o0IIiil00lI.I00io1l = Collections.unmodifiableList(o0IIiil00lI.I00io1l);
                    }
/* 410 */           if ((i & 32) == 32) {
/* 418 */               o0IIiil00lI.I00l0I0l0lO1 = Collections.unmodifiableList(o0IIiil00lI.I00l0I0l0lO1);
                    }
                    try {
/* 420 */               i1I1OO00o1oI00111O.I001iOo1i0O();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
/* 435 */               o0IIiil00lI.I00iOIl = iIOI0o10I000lI.I000II();
/* 551 */               throw th3;
                    }
/* 427 */           o0IIiil00lI.I00iOIl = iIOI0o10I000lI.I000II();
/* 429 */           return o0IIiil00lI;
                }

                private final Object I0000oI00(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 3 */             OOOi000ooO oOOi000ooO = new OOOi000ooO();
/* 7 */             oOOi000ooO.I00ilI0I1 = (byte) -1;
/* 9 */             oOOi000ooO.I00ilO0 = -1;
/* 11 */            boolean z = false;
/* 12 */            oOOi000ooO.I00iiO = 0;
/* 16 */            oOOi000ooO.I00iio = Collections.EMPTY_LIST;
/* 18 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 23 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 27 */            char c = 0;
/* 29 */            while (!z) {
                        try {
                            try {
/* 31 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 35 */                        if (iI000o00OoI0I != 0) {
/* 39 */                            if (iI000o00OoI0I == 8) {
                                        oOOi000ooO.I00iiI |= 1;
/* 92 */                                oOOi000ooO.I00iiO = iOOOIOiO0io1.I000iOII();
                                    } else if (iI000o00OoI0I == 18) {
/* 61 */                                if ((c & 2) != 2) {
/* 68 */                                    oOOi000ooO.I00iio = new ArrayList();
/* 70 */                                    c = 2;
                                        }
/* 79 */                                oOOi000ooO.I00iio.add(iOOOIOiO0io1.I000II(OOOOlOoi0.I00ioIO, il1lll0iI));
                                    } else if (!iOOOIOiO0io1.I00100o1O0lo(iI000o00OoI0I, i1I1OO00o1oI00111O)) {
                                    }
                                }
/* 51 */                        z = true;
                            } catch (O001110li e) {
/* 107 */                       e.I00iOIl = oOOi000ooO;
/* 109 */                       throw e;
                            } catch (IOException e2) {
/* 101 */                       O001110li o001110li = new O001110li(e2.getMessage());
/* 104 */                       o001110li.I00iOIl = oOOi000ooO;
/* 106 */                       throw o001110li;
                            }
                        } catch (Throwable th) {
/* 112 */                   if ((c & 2) == 2) {
/* 120 */                       oOOi000ooO.I00iio = Collections.unmodifiableList(oOOi000ooO.I00iio);
                            }
                            try {
/* 122 */                       i1I1OO00o1oI00111O.I001iOo1i0O();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
/* 137 */                       oOOi000ooO.I00iOIl = iIOI0o10I000lI.I000II();
/* 139 */                       throw th2;
                            }
/* 129 */                   oOOi000ooO.I00iOIl = iIOI0o10I000lI.I000II();
/* 140 */                   throw th;
                        }
                    }
/* 143 */           if ((c & 2) == 2) {
/* 151 */               oOOi000ooO.I00iio = Collections.unmodifiableList(oOOi000ooO.I00iio);
                    }
                    try {
/* 153 */               i1I1OO00o1oI00111O.I001iOo1i0O();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
/* 168 */               oOOi000ooO.I00iOIl = iIOI0o10I000lI.I000II();
/* 551 */               throw th3;
                    }
/* 160 */           oOOi000ooO.I00iOIl = iIOI0o10I000lI.I000II();
/* 162 */           return oOOi000ooO;
                }

                private final Object I0001Ioi1lo(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
                    OOOOi0ooOlOo oOOOi0ooOlOoI000II;
/* 3 */             OOOOlOoi0 oOOOlOoi0 = new OOOOlOoi0();
/* 7 */             oOOOlOoi0.I00ilI0I1 = (byte) -1;
/* 9 */             oOOOlOoi0.I00ilO0 = -1;
/* 11 */            boolean z = false;
/* 12 */            oOOOlOoi0.I00iiO = 0;
/* 16 */            oOOOlOoi0.I00iio = OOOOlIoIlOi.I00o0l1o1o0;
/* 18 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 23 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 27 */            while (!z) {
                        try {
                            try {
/* 29 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 33 */                        if (iI000o00OoI0I != 0) {
/* 37 */                            if (iI000o00OoI0I == 8) {
                                        oOOOlOoi0.I00iiI |= 1;
/* 113 */                               oOOOlOoi0.I00iiO = iOOOIOiO0io1.I000iOII();
                                    } else if (iI000o00OoI0I == 18) {
/* 61 */                                if ((oOOOlOoi0.I00iiI & 2) == 2) {
/* 63 */                                    OOOOlIoIlOi oOOOlIoIlOi = oOOOlOoi0.I00iio;
/* 65 */                                    oOOOlIoIlOi.getClass();
/* 68 */                                    oOOOi0ooOlOoI000II = OOOOi0ooOlOo.I000II();
/* 72 */                                    oOOOi0ooOlOoI000II.I000O01llI0(oOOOlIoIlOi);
                                        } else {
/* 76 */                                    oOOOi0ooOlOoI000II = null;
                                        }
/* 83 */                                OOOOlIoIlOi oOOOlIoIlOi2 = (OOOOlIoIlOi) iOOOIOiO0io1.I000II(OOOOlIoIlOi.I00o101lO, il1lll0iI);
/* 85 */                                oOOOlOoi0.I00iio = oOOOlIoIlOi2;
/* 87 */                                if (oOOOi0ooOlOoI000II != null) {
/* 89 */                                    oOOOi0ooOlOoI000II.I000O01llI0(oOOOlIoIlOi2);
/* 96 */                                    oOOOlOoi0.I00iio = oOOOi0ooOlOoI000II.I0001Ioi1lo();
                                        }
                                        oOOOlOoi0.I00iiI |= 2;
                                    } else if (!iOOOIOiO0io1.I00100o1O0lo(iI000o00OoI0I, i1I1OO00o1oI00111O)) {
                                    }
                                }
/* 49 */                        z = true;
                            } catch (O001110li e) {
/* 128 */                       e.I00iOIl = oOOOlOoi0;
/* 130 */                       throw e;
                            } catch (IOException e2) {
/* 122 */                       O001110li o001110li = new O001110li(e2.getMessage());
/* 125 */                       o001110li.I00iOIl = oOOOlOoi0;
/* 127 */                       throw o001110li;
                            }
                        } catch (Throwable th) {
                            try {
/* 131 */                       i1I1OO00o1oI00111O.I001iOo1i0O();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
/* 146 */                       oOOOlOoi0.I00iOIl = iIOI0o10I000lI.I000II();
/* 148 */                       throw th2;
                            }
/* 138 */                   oOOOlOoi0.I00iOIl = iIOI0o10I000lI.I000II();
/* 149 */                   throw th;
                        }
                    }
                    try {
/* 150 */               i1I1OO00o1oI00111O.I001iOo1i0O();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
/* 165 */               oOOOlOoi0.I00iOIl = iIOI0o10I000lI.I000II();
/* 551 */               throw th3;
                    }
/* 157 */           oOOOlOoi0.I00iOIl = iIOI0o10I000lI.I000II();
/* 159 */           return oOOOlOoi0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r6v0 */
                /* JADX WARN: Type inference failed for: r6v1 */
                /* JADX WARN: Type inference failed for: r6v2, types: [boolean] */
                private final Object I000II(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
                    OOOOo00i00Io oOOOo00i00Io;
/* 3 */             OOOOlIoIlOi oOOOlIoIlOi = new OOOOlIoIlOi();
/* 7 */             oOOOlIoIlOi.I00lll10 = (byte) -1;
/* 9 */             oOOOlIoIlOi.I00o0iI0io1 = -1;
/* 11 */            oOOOlIoIlOi.I000OOo1O();
/* 14 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 19 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 23 */            int i = 0;
/* 24 */            boolean z = false;
/* 25 */            char c = 0;
                    while (true) {
/* 26 */                ?? I00100o1O0lo = 256;
/* 28 */                if (z) {
/* 331 */                   if ((c & 256) == 256) {
/* 339 */                       oOOOlIoIlOi.I00li1OI = Collections.unmodifiableList(oOOOlIoIlOi.I00li1OI);
                            }
                            try {
/* 341 */                       i1I1OO00o1oI00111O.I001iOo1i0O();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
/* 356 */                       oOOOlIoIlOi.I00iOIl = iIOI0o10I000lI.I000II();
/* 358 */                       throw th;
                            }
/* 348 */                   oOOOlIoIlOi.I00iOIl = iIOI0o10I000lI.I000II();
/* 350 */                   return oOOOlIoIlOi;
                        }
                        try {
                            try {
/* 30 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
                                switch (iI000o00OoI0I) {
                                    case 0:
/* 43 */                                z = true;
                                    case 8:
/* 256 */                               int iI000iOII = iOOOIOiO0io1.I000iOII();
/* 260 */                               OOOOil0 oOOOil0I00000oOI = OOOOil0.I00000oOI(iI000iOII);
/* 264 */                               if (oOOOil0I00000oOI == null) {
/* 266 */                                   i1I1OO00o1oI00111O.I00Io1lO(iI000o00OoI0I);
/* 269 */                                   i1I1OO00o1oI00111O.I00Io1lO(iI000iOII);
                                        } else {
                                            oOOOlIoIlOi.I00iiI |= 1;
/* 279 */                                   oOOOlIoIlOi.I00iiO = oOOOil0I00000oOI;
                                        }
                                    case 16:
                                        oOOOlIoIlOi.I00iiI |= 2;
/* 241 */                               long jI000l1 = iOOOIOiO0io1.I000l1();
/* 252 */                               oOOOlIoIlOi.I00iio = (-(jI000l1 & 1)) ^ (jI000l1 >>> 1);
                                    case PoseLandmark.LEFT_HEEL:
                                        oOOOlIoIlOi.I00iiI |= 4;
/* 231 */                               oOOOlIoIlOi.I00ilI0I1 = Float.intBitsToFloat(iOOOIOiO0io1.I000OOo1O());
                                    case 33:
                                        oOOOlIoIlOi.I00iiI |= 8;
/* 213 */                               oOOOlIoIlOi.I00ilO0 = Double.longBitsToDouble(iOOOIOiO0io1.I000OiO());
                                    case 40:
                                        oOOOlIoIlOi.I00iiI |= 16;
/* 195 */                               oOOOlIoIlOi.I00io1l = iOOOIOiO0io1.I000iOII();
                                    case 48:
                                        oOOOlIoIlOi.I00iiI |= 32;
/* 181 */                               oOOOlIoIlOi.I00ioIO = iOOOIOiO0io1.I000iOII();
                                    case 56:
                                        oOOOlIoIlOi.I00iiI |= 64;
/* 167 */                               oOOOlIoIlOi.I00l0I0l0lO1 = iOOOIOiO0io1.I000iOII();
                                    case 66:
/* 108 */                               if ((oOOOlIoIlOi.I00iiI & Barcode.FORMAT_ITF) == 128) {
/* 110 */                                   OOOi000ooO oOOi000ooO = oOOOlIoIlOi.I00l0OO0IO;
/* 112 */                                   oOOi000ooO.getClass();
/* 117 */                                   oOOOo00i00Io = new OOOOo00i00Io(i);
/* 122 */                                   oOOOo00i00Io.I00iio = Collections.EMPTY_LIST;
/* 124 */                                   oOOOo00i00Io.I000O01llI0(oOOi000ooO);
                                        } else {
/* 128 */                                   oOOOo00i00Io = null;
                                        }
/* 135 */                               OOOi000ooO oOOi000ooO2 = (OOOi000ooO) iOOOIOiO0io1.I000II(OOOi000ooO.I00ioIO, il1lll0iI);
/* 137 */                               oOOOlIoIlOi.I00l0OO0IO = oOOi000ooO2;
/* 139 */                               if (oOOOo00i00Io != null) {
/* 141 */                                   oOOOo00i00Io.I000O01llI0(oOOi000ooO2);
/* 148 */                                   oOOOlIoIlOi.I00l0OO0IO = oOOOo00i00Io.I0001Ioi1lo();
                                        }
                                        oOOOlIoIlOi.I00iiI |= Barcode.FORMAT_ITF;
                                    case 74:
/* 81 */                                if ((c & 256) != 256) {
/* 88 */                                    oOOOlIoIlOi.I00li1OI = new ArrayList();
/* 90 */                                    c = 256;
                                        }
/* 99 */                                oOOOlIoIlOi.I00li1OI.add(iOOOIOiO0io1.I000II(OOOOlIoIlOi.I00o101lO, il1lll0iI));
                                    case 80:
                                        oOOOlIoIlOi.I00iiI |= Barcode.FORMAT_UPC_A;
/* 76 */                                oOOOlIoIlOi.I00lli11 = iOOOIOiO0io1.I000iOII();
                                    case 88:
                                        oOOOlIoIlOi.I00iiI |= Barcode.FORMAT_QR_CODE;
/* 63 */                                oOOOlIoIlOi.I00ll1 = iOOOIOiO0io1.I000iOII();
                                    default:
/* 37 */                                I00100o1O0lo = iOOOIOiO0io1.I00100o1O0lo(iI000o00OoI0I, i1I1OO00o1oI00111O);
/* 41 */                                if (I00100o1O0lo == 0) {
/* 43 */                                    z = true;
                                        }
                                }
                            } catch (Throwable th2) {
/* 300 */                       if ((c & 256) == I00100o1O0lo) {
/* 308 */                           oOOOlIoIlOi.I00li1OI = Collections.unmodifiableList(oOOOlIoIlOi.I00li1OI);
                                }
                                try {
/* 310 */                           i1I1OO00o1oI00111O.I001iOo1i0O();
                                } catch (IOException unused2) {
                                } catch (Throwable th3) {
/* 325 */                           oOOOlIoIlOi.I00iOIl = iIOI0o10I000lI.I000II();
/* 327 */                           throw th3;
                                }
/* 317 */                       oOOOlIoIlOi.I00iOIl = iIOI0o10I000lI.I000II();
/* 328 */                       throw th2;
                            }
                        } catch (O001110li e) {
/* 295 */                   e.I00iOIl = oOOOlIoIlOi;
/* 297 */                   throw e;
                        } catch (IOException e2) {
/* 289 */                   O001110li o001110li = new O001110li(e2.getMessage());
/* 292 */                   o001110li.I00iOIl = oOOOlIoIlOi;
/* 294 */                   throw o001110li;
                        }
                    }
                }

                private final Object I000O01llI0(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 3 */             OOOi1IIOOO01 oOOi1IIOOO01 = new OOOi1IIOOO01();
/* 7 */             oOOi1IIOOO01.I00ilI0I1 = (byte) -1;
/* 9 */             oOOi1IIOOO01.I00ilO0 = -1;
/* 11 */            boolean z = false;
/* 12 */            oOOi1IIOOO01.I00iiO = 0;
/* 16 */            oOOi1IIOOO01.I00iio = IIOII1.I00iOIl;
/* 18 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 23 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 27 */            while (!z) {
                        try {
                            try {
/* 29 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 33 */                        if (iI000o00OoI0I != 0) {
/* 37 */                            if (iI000o00OoI0I == 8) {
                                        oOOi1IIOOO01.I00iiI |= 1;
/* 79 */                                oOOi1IIOOO01.I00iiO = iOOOIOiO0io1.I000iOII();
                                    } else if (iI000o00OoI0I == 18) {
                                        oOOi1IIOOO01.I00iiI |= 2;
/* 67 */                                oOOi1IIOOO01.I00iio = iOOOIOiO0io1.I0001Ioi1lo();
                                    } else if (!iOOOIOiO0io1.I00100o1O0lo(iI000o00OoI0I, i1I1OO00o1oI00111O)) {
                                    }
                                }
/* 49 */                        z = true;
                            } catch (O001110li e) {
/* 94 */                        e.I00iOIl = oOOi1IIOOO01;
/* 96 */                        throw e;
                            } catch (IOException e2) {
/* 88 */                        O001110li o001110li = new O001110li(e2.getMessage());
/* 91 */                        o001110li.I00iOIl = oOOi1IIOOO01;
/* 93 */                        throw o001110li;
                            }
                        } catch (Throwable th) {
                            try {
/* 97 */                        i1I1OO00o1oI00111O.I001iOo1i0O();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
/* 112 */                       oOOi1IIOOO01.I00iOIl = iIOI0o10I000lI.I000II();
/* 114 */                       throw th2;
                            }
/* 104 */                   oOOi1IIOOO01.I00iOIl = iIOI0o10I000lI.I000II();
/* 115 */                   throw th;
                        }
                    }
                    try {
/* 116 */               i1I1OO00o1oI00111O.I001iOo1i0O();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
/* 131 */               oOOi1IIOOO01.I00iOIl = iIOI0o10I000lI.I000II();
/* 551 */               throw th3;
                    }
/* 123 */           oOOi1IIOOO01.I00iOIl = iIOI0o10I000lI.I000II();
/* 125 */           return oOOi1IIOOO01;
                }

                private final Object I000OOo1O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 3 */             OOOiIOiii oOOiIOiii = new OOOiIOiii();
/* 7 */             oOOiIOiii.I00l0I0l0lO1 = (byte) -1;
/* 9 */             oOOiIOiii.I00l0OO0IO = -1;
/* 12 */            oOOiIOiii.I00iio = 6;
/* 14 */            List list = Collections.EMPTY_LIST;
/* 16 */            oOOiIOiii.I00ilI0I1 = list;
/* 18 */            oOOiIOiii.I00ilO0 = list;
/* 20 */            oOOiIOiii.I00io1l = list;
/* 22 */            oOOiIOiii.I00ioIO = list;
/* 24 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 29 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 33 */            boolean z = false;
/* 34 */            int i = 0;
/* 41 */            while (!z) {
                        try {
                            try {
/* 43 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 47 */                        if (iI000o00OoI0I != 0) {
/* 49 */                            if (iI000o00OoI0I == 8) {
                                        oOOiIOiii.I00iiO |= 1;
/* 254 */                               oOOiIOiii.I00iio = iOOOIOiO0io1.I000iOII();
                                    } else if (iI000o00OoI0I == 18) {
/* 221 */                               if ((i & 2) != 2) {
/* 228 */                                   oOOiIOiii.I00ilI0I1 = new ArrayList();
/* 230 */                                   i |= 2;
                                        }
/* 240 */                               oOOiIOiii.I00ilI0I1.add(iOOOIOiO0io1.I000II(OOi0iiO0iOi.I00o0iI0io1, il1lll0iI));
                                    } else if (iI000o00OoI0I == 26) {
/* 195 */                               if ((i & 16) != 16) {
/* 202 */                                   oOOiIOiii.I00ioIO = new ArrayList();
/* 204 */                                   i |= 16;
                                        }
/* 214 */                               oOOiIOiii.I00ioIO.add(iOOOIOiO0io1.I000II(OOOi000ooO.I00ioIO, il1lll0iI));
                                    } else if (iI000o00OoI0I == 248) {
/* 167 */                               if ((i & 4) != 4) {
/* 174 */                                   oOOiIOiii.I00ilO0 = new ArrayList();
/* 176 */                                   i |= 4;
                                        }
/* 188 */                               oOOiIOiii.I00ilO0.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
                                    } else if (iI000o00OoI0I == 250) {
/* 117 */                               int iI0000oI00 = iOOOIOiO0io1.I0000oI00(iOOOIOiO0io1.I000iOII());
/* 123 */                               if ((i & 4) != 4 && iOOOIOiO0io1.I0000Il00O() > 0) {
/* 136 */                                   oOOiIOiii.I00ilO0 = new ArrayList();
/* 138 */                                   i |= 4;
                                        }
/* 144 */                               while (iOOOIOiO0io1.I0000Il00O() > 0) {
/* 156 */                                   oOOiIOiii.I00ilO0.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
                                        }
/* 160 */                               iOOOIOiO0io1.I0000O(iI0000oI00);
                                    } else if (iI000o00OoI0I == 258) {
/* 90 */                                if ((i & 8) != 8) {
/* 97 */                                    oOOiIOiii.I00io1l = new ArrayList();
/* 99 */                                    i |= 8;
                                        }
/* 109 */                               oOOiIOiii.I00io1l.add(iOOOIOiO0io1.I000II(OOOi1IIOOO01.I00ioIO, il1lll0iI));
                                    } else if (!oOOiIOiii.I000oI1ioi(iOOOIOiO0io1, i1I1OO00o1oI00111O, il1lll0iI, iI000o00OoI0I)) {
                                    }
                                }
/* 77 */                        z = true;
                            } catch (Throwable th) {
/* 275 */                       if ((i & 2) == 2) {
/* 283 */                           oOOiIOiii.I00ilI0I1 = Collections.unmodifiableList(oOOiIOiii.I00ilI0I1);
                                }
/* 287 */                       if ((i & 16) == 16) {
/* 295 */                           oOOiIOiii.I00ioIO = Collections.unmodifiableList(oOOiIOiii.I00ioIO);
                                }
/* 299 */                       if ((i & 4) == 4) {
/* 307 */                           oOOiIOiii.I00ilO0 = Collections.unmodifiableList(oOOiIOiii.I00ilO0);
                                }
/* 311 */                       if ((i & 8) == 8) {
/* 319 */                           oOOiIOiii.I00io1l = Collections.unmodifiableList(oOOiIOiii.I00io1l);
                                }
                                try {
/* 321 */                           i1I1OO00o1oI00111O.I001iOo1i0O();
                                } catch (IOException unused) {
                                } catch (Throwable th2) {
/* 336 */                           oOOiIOiii.I00iiI = iIOI0o10I000lI.I000II();
/* 338 */                           throw th2;
                                }
/* 328 */                       oOOiIOiii.I00iiI = iIOI0o10I000lI.I000II();
/* 339 */                       oOOiIOiii.I000lI();
/* 342 */                       throw th;
                            }
                        } catch (O001110li e) {
/* 270 */                   e.I00iOIl = oOOiIOiii;
/* 272 */                   throw e;
                        } catch (IOException e2) {
/* 264 */                   O001110li o001110li = new O001110li(e2.getMessage());
/* 267 */                   o001110li.I00iOIl = oOOiIOiii;
/* 269 */                   throw o001110li;
                        }
                    }
/* 345 */           if ((i & 2) == 2) {
/* 353 */               oOOiIOiii.I00ilI0I1 = Collections.unmodifiableList(oOOiIOiii.I00ilI0I1);
                    }
/* 357 */           if ((i & 16) == 16) {
/* 365 */               oOOiIOiii.I00ioIO = Collections.unmodifiableList(oOOiIOiii.I00ioIO);
                    }
/* 369 */           if ((i & 4) == 4) {
/* 377 */               oOOiIOiii.I00ilO0 = Collections.unmodifiableList(oOOiIOiii.I00ilO0);
                    }
/* 381 */           if ((i & 8) == 8) {
/* 389 */               oOOiIOiii.I00io1l = Collections.unmodifiableList(oOOiIOiii.I00io1l);
                    }
                    try {
/* 391 */               i1I1OO00o1oI00111O.I001iOo1i0O();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
/* 406 */               oOOiIOiii.I00iiI = iIOI0o10I000lI.I000II();
/* 408 */               throw th3;
                    }
/* 398 */           oOOiIOiii.I00iiI = iIOI0o10I000lI.I000II();
/* 409 */           oOOiIOiii.I000lI();
/* 551 */           return oOOiIOiii;
                }

                private final Object I000OiO(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 3 */             OOOilI oOOilI = new OOOilI();
/* 7 */             oOOilI.I00iiO = (byte) -1;
/* 9 */             oOOilI.I00iio = -1;
/* 13 */            oOOilI.I00iiI = Collections.EMPTY_LIST;
/* 15 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 20 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 24 */            boolean z = false;
/* 25 */            boolean z2 = false;
/* 26 */            while (!z) {
                        try {
                            try {
/* 28 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 32 */                        if (iI000o00OoI0I != 0) {
/* 36 */                            if (iI000o00OoI0I == 10) {
/* 52 */                                if (!z2) {
/* 59 */                                    oOOilI.I00iiI = new ArrayList();
/* 61 */                                    z2 = true;
                                        }
/* 70 */                                oOOilI.I00iiI.add(iOOOIOiO0io1.I000II(OOOiooooI1o.I00li1OI, il1lll0iI));
                                    } else if (!iOOOIOiO0io1.I00100o1O0lo(iI000o00OoI0I, i1I1OO00o1oI00111O)) {
                                    }
                                }
/* 44 */                        z = true;
                            } catch (Throwable th) {
/* 89 */                        if (z2) {
/* 97 */                            oOOilI.I00iiI = Collections.unmodifiableList(oOOilI.I00iiI);
                                }
                                try {
/* 99 */                            i1I1OO00o1oI00111O.I001iOo1i0O();
                                } catch (IOException unused) {
                                } catch (Throwable th2) {
/* 114 */                           oOOilI.I00iOIl = iIOI0o10I000lI.I000II();
/* 116 */                           throw th2;
                                }
/* 106 */                       oOOilI.I00iOIl = iIOI0o10I000lI.I000II();
/* 117 */                       throw th;
                            }
                        } catch (O001110li e) {
/* 86 */                    e.I00iOIl = oOOilI;
/* 88 */                    throw e;
                        } catch (IOException e2) {
/* 80 */                    O001110li o001110li = new O001110li(e2.getMessage());
/* 83 */                    o001110li.I00iOIl = oOOilI;
/* 85 */                    throw o001110li;
                        }
                    }
/* 118 */           if (z2) {
/* 126 */               oOOilI.I00iiI = Collections.unmodifiableList(oOOilI.I00iiI);
                    }
                    try {
/* 128 */               i1I1OO00o1oI00111O.I001iOo1i0O();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
/* 143 */               oOOilI.I00iOIl = iIOI0o10I000lI.I000II();
/* 551 */               throw th3;
                    }
/* 135 */           oOOilI.I00iOIl = iIOI0o10I000lI.I000II();
/* 137 */           return oOOilI;
                }

                private final Object I000iOII(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 3 */             OOOiooooI1o oOOiooooI1o = new OOOiooooI1o();
/* 7 */             oOOiooooI1o.I00ioIO = (byte) -1;
/* 9 */             oOOiooooI1o.I00l0I0l0lO1 = -1;
/* 11 */            OOOiol0loO1O oOOiol0loO1O = OOOiol0loO1O.RETURNS_CONSTANT;
/* 13 */            oOOiooooI1o.I00iiO = oOOiol0loO1O;
/* 17 */            oOOiooooI1o.I00iio = Collections.EMPTY_LIST;
/* 21 */            oOOiooooI1o.I00ilI0I1 = OOOlOO0IO.I00ll1;
/* 23 */            OOOiolI oOOiolI = OOOiolI.AT_MOST_ONCE;
/* 25 */            oOOiooooI1o.I00ilO0 = oOOiolI;
/* 27 */            OOOioO oOOioO = OOOioO.CONCLUSION_CONDITION;
/* 29 */            oOOiooooI1o.I00io1l = oOOioO;
/* 31 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 36 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 40 */            boolean z = false;
/* 41 */            char c = 0;
/* 43 */            while (!z) {
                        try {
                            try {
/* 45 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 49 */                        if (iI000o00OoI0I != 0) {
/* 51 */                            OOOioO oOOioO2 = null;
/* 51 */                            OOOiol0loO1O oOOiol0loO1O2 = null;
/* 51 */                            OOOl0llOi oOOl0llOiI000II = null;
/* 51 */                            OOOiolI oOOiolI2 = null;
/* 54 */                            if (iI000o00OoI0I == 8) {
/* 230 */                               int iI000iOII = iOOOIOiO0io1.I000iOII();
/* 234 */                               if (iI000iOII == 0) {
/* 247 */                                   oOOiol0loO1O2 = oOOiol0loO1O;
                                        } else if (iI000iOII == 1) {
/* 244 */                                   oOOiol0loO1O2 = OOOiol0loO1O.CALLS;
                                        } else if (iI000iOII == 2) {
/* 241 */                                   oOOiol0loO1O2 = OOOiol0loO1O.RETURNS_NOT_NULL;
                                        }
/* 248 */                               if (oOOiol0loO1O2 == null) {
/* 250 */                                   i1I1OO00o1oI00111O.I00Io1lO(iI000o00OoI0I);
/* 253 */                                   i1I1OO00o1oI00111O.I00Io1lO(iI000iOII);
                                        } else {
                                            oOOiooooI1o.I00iiI |= 1;
/* 263 */                                   oOOiooooI1o.I00iiO = oOOiol0loO1O2;
                                        }
                                    } else if (iI000o00OoI0I == 18) {
/* 205 */                               int i = (c == true ? 1 : 0) & 2;
                                        c = c;
/* 207 */                               if (i != 2) {
/* 214 */                                   oOOiooooI1o.I00iio = new ArrayList();
/* 216 */                                   c = 2;
                                        }
/* 225 */                               oOOiooooI1o.I00iio.add(iOOOIOiO0io1.I000II(OOOlOO0IO.I00lli11, il1lll0iI));
                                    } else if (iI000o00OoI0I == 26) {
/* 163 */                               if ((oOOiooooI1o.I00iiI & 2) == 2) {
/* 165 */                                   OOOlOO0IO oOOlOO0IO = oOOiooooI1o.I00ilI0I1;
/* 167 */                                   oOOlOO0IO.getClass();
/* 170 */                                   oOOl0llOiI000II = OOOl0llOi.I000II();
/* 174 */                                   oOOl0llOiI000II.I000O01llI0(oOOlOO0IO);
                                        }
/* 183 */                               OOOlOO0IO oOOlOO0IO2 = (OOOlOO0IO) iOOOIOiO0io1.I000II(OOOlOO0IO.I00lli11, il1lll0iI);
/* 185 */                               oOOiooooI1o.I00ilI0I1 = oOOlOO0IO2;
/* 187 */                               if (oOOl0llOiI000II != null) {
/* 189 */                                   oOOl0llOiI000II.I000O01llI0(oOOlOO0IO2);
/* 196 */                                   oOOiooooI1o.I00ilI0I1 = oOOl0llOiI000II.I0001Ioi1lo();
                                        }
                                        oOOiooooI1o.I00iiI |= 2;
                                    } else if (iI000o00OoI0I == 32) {
/* 124 */                               int iI000iOII2 = iOOOIOiO0io1.I000iOII();
/* 128 */                               if (iI000iOII2 == 0) {
/* 141 */                                   oOOiolI2 = oOOiolI;
                                        } else if (iI000iOII2 == 1) {
/* 138 */                                   oOOiolI2 = OOOiolI.EXACTLY_ONCE;
                                        } else if (iI000iOII2 == 2) {
/* 135 */                                   oOOiolI2 = OOOiolI.AT_LEAST_ONCE;
                                        }
/* 142 */                               if (oOOiolI2 == null) {
/* 144 */                                   i1I1OO00o1oI00111O.I00Io1lO(iI000o00OoI0I);
/* 147 */                                   i1I1OO00o1oI00111O.I00Io1lO(iI000iOII2);
                                        } else {
                                            oOOiooooI1o.I00iiI |= 4;
/* 157 */                                   oOOiooooI1o.I00ilO0 = oOOiolI2;
                                        }
                                    } else if (iI000o00OoI0I == 40) {
/* 89 */                                int iI000iOII3 = iOOOIOiO0io1.I000iOII();
/* 93 */                                if (iI000iOII3 == 0) {
/* 106 */                                   oOOioO2 = oOOioO;
                                        } else if (iI000iOII3 == 1) {
/* 103 */                                   oOOioO2 = OOOioO.RETURNS_CONDITION;
                                        } else if (iI000iOII3 == 2) {
/* 100 */                                   oOOioO2 = OOOioO.HOLDSIN_CONDITION;
                                        }
/* 107 */                               if (oOOioO2 == null) {
/* 109 */                                   i1I1OO00o1oI00111O.I00Io1lO(iI000o00OoI0I);
/* 112 */                                   i1I1OO00o1oI00111O.I00Io1lO(iI000iOII3);
                                        } else {
                                            oOOiooooI1o.I00iiI |= 8;
/* 121 */                                   oOOiooooI1o.I00io1l = oOOioO2;
                                        }
                                    } else if (!iOOOIOiO0io1.I00100o1O0lo(iI000o00OoI0I, i1I1OO00o1oI00111O)) {
                                    }
                                }
/* 78 */                        z = true;
                            } catch (Throwable th) {
/* 284 */                       if (((c == true ? 1 : 0) & 2) == 2) {
/* 292 */                           oOOiooooI1o.I00iio = Collections.unmodifiableList(oOOiooooI1o.I00iio);
                                }
                                try {
/* 294 */                           i1I1OO00o1oI00111O.I001iOo1i0O();
                                } catch (IOException unused) {
                                } catch (Throwable th2) {
/* 309 */                           oOOiooooI1o.I00iOIl = iIOI0o10I000lI.I000II();
/* 311 */                           throw th2;
                                }
/* 301 */                       oOOiooooI1o.I00iOIl = iIOI0o10I000lI.I000II();
/* 312 */                       throw th;
                            }
                        } catch (O001110li e) {
/* 279 */                   e.I00iOIl = oOOiooooI1o;
/* 281 */                   throw e;
                        } catch (IOException e2) {
/* 273 */                   O001110li o001110li = new O001110li(e2.getMessage());
/* 276 */                   o001110li.I00iOIl = oOOiooooI1o;
/* 278 */                   throw o001110li;
                        }
                    }
/* 315 */           if (((c == true ? 1 : 0) & 2) == 2) {
/* 323 */               oOOiooooI1o.I00iio = Collections.unmodifiableList(oOOiooooI1o.I00iio);
                    }
                    try {
/* 325 */               i1I1OO00o1oI00111O.I001iOo1i0O();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
/* 340 */               oOOiooooI1o.I00iOIl = iIOI0o10I000lI.I000II();
/* 551 */               throw th3;
                    }
/* 332 */           oOOiooooI1o.I00iOIl = iIOI0o10I000lI.I000II();
/* 334 */           return oOOiooooI1o;
                }

                private final Object I000l1(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 3 */             OOOl0lIlIoil oOOl0lIlIoil = new OOOl0lIlIoil();
/* 7 */             oOOl0lIlIoil.I00ilO0 = (byte) -1;
/* 9 */             oOOl0lIlIoil.I00io1l = -1;
/* 11 */            boolean z = false;
/* 12 */            oOOl0lIlIoil.I00iio = 0;
/* 16 */            oOOl0lIlIoil.I00ilI0I1 = Collections.EMPTY_LIST;
/* 18 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 23 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 27 */            char c = 0;
/* 29 */            while (!z) {
                        try {
                            try {
/* 31 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 35 */                        if (iI000o00OoI0I != 0) {
/* 39 */                            if (iI000o00OoI0I == 8) {
                                        oOOl0lIlIoil.I00iiO |= 1;
/* 92 */                                oOOl0lIlIoil.I00iio = iOOOIOiO0io1.I000iOII();
                                    } else if (iI000o00OoI0I == 18) {
/* 61 */                                if ((c & 2) != 2) {
/* 68 */                                    oOOl0lIlIoil.I00ilI0I1 = new ArrayList();
/* 70 */                                    c = 2;
                                        }
/* 79 */                                oOOl0lIlIoil.I00ilI0I1.add(iOOOIOiO0io1.I000II(OOOi000ooO.I00ioIO, il1lll0iI));
                                    } else if (!oOOl0lIlIoil.I000oI1ioi(iOOOIOiO0io1, i1I1OO00o1oI00111O, il1lll0iI, iI000o00OoI0I)) {
                                    }
                                }
/* 51 */                        z = true;
                            } catch (O001110li e) {
/* 107 */                       e.I00iOIl = oOOl0lIlIoil;
/* 109 */                       throw e;
                            } catch (IOException e2) {
/* 101 */                       O001110li o001110li = new O001110li(e2.getMessage());
/* 104 */                       o001110li.I00iOIl = oOOl0lIlIoil;
/* 106 */                       throw o001110li;
                            }
                        } catch (Throwable th) {
/* 112 */                   if ((c & 2) == 2) {
/* 120 */                       oOOl0lIlIoil.I00ilI0I1 = Collections.unmodifiableList(oOOl0lIlIoil.I00ilI0I1);
                            }
                            try {
/* 122 */                       i1I1OO00o1oI00111O.I001iOo1i0O();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
/* 137 */                       oOOl0lIlIoil.I00iiI = iIOI0o10I000lI.I000II();
/* 139 */                       throw th2;
                            }
/* 129 */                   oOOl0lIlIoil.I00iiI = iIOI0o10I000lI.I000II();
/* 140 */                   oOOl0lIlIoil.I000lI();
/* 143 */                   throw th;
                        }
                    }
/* 146 */           if ((c & 2) == 2) {
/* 154 */               oOOl0lIlIoil.I00ilI0I1 = Collections.unmodifiableList(oOOl0lIlIoil.I00ilI0I1);
                    }
                    try {
/* 156 */               i1I1OO00o1oI00111O.I001iOo1i0O();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
/* 171 */               oOOl0lIlIoil.I00iiI = iIOI0o10I000lI.I000II();
/* 173 */               throw th3;
                    }
/* 163 */           oOOl0lIlIoil.I00iiI = iIOI0o10I000lI.I000II();
/* 174 */           oOOl0lIlIoil.I000lI();
/* 551 */           return oOOl0lIlIoil;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r9v4 */
                /* JADX WARN: Type inference failed for: r9v6 */
                private final Object I000lI(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
                    OOOl1oi oOOl1oi;
/* 7 */             O0II0llIl o0II0llIl = OOOlOO0IO.I00lli11;
/* 9 */             OOOlOO0IO oOOlOO0IO = new OOOlOO0IO();
/* 13 */            oOOlOO0IO.I00l0OO0IO = (byte) -1;
/* 15 */            oOOlOO0IO.I00li1OI = -1;
/* 17 */            boolean z = false;
/* 18 */            oOOlOO0IO.I00iiO = 0;
/* 20 */            oOOlOO0IO.I00iio = 0;
/* 22 */            OOOl1oi oOOl1oi2 = OOOl1oi.TRUE;
/* 24 */            oOOlOO0IO.I00ilI0I1 = oOOl1oi2;
/* 28 */            oOOlOO0IO.I00ilO0 = OOi001oo1OOI.I00oO101o;
/* 30 */            oOOlOO0IO.I00io1l = 0;
/* 32 */            List list = Collections.EMPTY_LIST;
/* 34 */            oOOlOO0IO.I00ioIO = list;
/* 36 */            oOOlOO0IO.I00l0I0l0lO1 = list;
/* 38 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 43 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 47 */            char c = 0;
/* 52 */            while (!z) {
                        try {
                            try {
/* 54 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 58 */                        if (iI000o00OoI0I != 0) {
/* 62 */                            if (iI000o00OoI0I == 8) {
                                        oOOlOO0IO.I00iiI |= 1;
/* 275 */                               oOOlOO0IO.I00iiO = iOOOIOiO0io1.I000iOII();
                                    } else if (iI000o00OoI0I != 16) {
/* 73 */                                OOOoooI oOOoooII0010o = null;
/* 73 */                                OOOl1oi oOOl1oi3 = null;
/* 75 */                                if (iI000o00OoI0I == 24) {
/* 213 */                                   int iI000iOII = iOOOIOiO0io1.I000iOII();
/* 217 */                                   if (iI000iOII != 0) {
/* 219 */                                       if (iI000iOII == 1) {
/* 229 */                                           oOOl1oi3 = OOOl1oi.FALSE;
                                                } else if (iI000iOII == 2) {
/* 226 */                                           oOOl1oi3 = OOOl1oi.NULL;
                                                }
/* 223 */                                       oOOl1oi = oOOl1oi3;
                                            } else {
/* 232 */                                       oOOl1oi = oOOl1oi2;
                                            }
/* 233 */                                   if (oOOl1oi == null) {
/* 235 */                                       i1I1OO00o1oI00111O.I00Io1lO(iI000o00OoI0I);
/* 238 */                                       i1I1OO00o1oI00111O.I00Io1lO(iI000iOII);
                                            } else {
                                                oOOlOO0IO.I00iiI |= 4;
/* 249 */                                       oOOlOO0IO.I00ilI0I1 = oOOl1oi;
                                            }
                                        } else if (iI000o00OoI0I == 34) {
/* 172 */                                   if ((oOOlOO0IO.I00iiI & 8) == 8) {
/* 174 */                                       OOi001oo1OOI oOi001oo1OOI = oOOlOO0IO.I00ilO0;
/* 176 */                                       oOi001oo1OOI.getClass();
/* 179 */                                       oOOoooII0010o = OOi001oo1OOI.I0010o(oOi001oo1OOI);
                                            }
/* 183 */                                   OOOoooI oOOoooI = oOOoooII0010o;
/* 191 */                                   OOi001oo1OOI oOi001oo1OOI2 = (OOi001oo1OOI) iOOOIOiO0io1.I000II(OOi001oo1OOI.I00oOio10iI1, il1lll0iI);
/* 193 */                                   oOOlOO0IO.I00ilO0 = oOi001oo1OOI2;
/* 195 */                                   if (oOOoooI != null) {
/* 197 */                                       oOOoooI.I000OOo1O(oOi001oo1OOI2);
/* 204 */                                       oOOlOO0IO.I00ilO0 = oOOoooI.I000II();
                                            }
                                            oOOlOO0IO.I00iiI |= 8;
                                        } else if (iI000o00OoI0I == 40) {
                                            oOOlOO0IO.I00iiI |= 16;
/* 166 */                                   oOOlOO0IO.I00io1l = iOOOIOiO0io1.I000iOII();
                                        } else if (iI000o00OoI0I == 50) {
/* 133 */                                   int i = (c == true ? 1 : 0) & 32;
                                            c = c;
/* 135 */                                   if (i != 32) {
/* 142 */                                       oOOlOO0IO.I00ioIO = new ArrayList();
/* 144 */                                       c = (c == true ? 1 : 0) | ' ';
                                            }
/* 152 */                                   oOOlOO0IO.I00ioIO.add(iOOOIOiO0io1.I000II(o0II0llIl, il1lll0iI));
                                        } else if (iI000o00OoI0I == 58) {
/* 110 */                                   int i2 = (c == true ? 1 : 0) & 64;
                                            c = c;
/* 112 */                                   if (i2 != 64) {
/* 119 */                                       oOOlOO0IO.I00l0I0l0lO1 = new ArrayList();
/* 121 */                                       c = (c == true ? 1 : 0) | '@';
                                            }
/* 129 */                                   oOOlOO0IO.I00l0I0l0lO1.add(iOOOIOiO0io1.I000II(o0II0llIl, il1lll0iI));
                                        } else if (!iOOOIOiO0io1.I00100o1O0lo(iI000o00OoI0I, i1I1OO00o1oI00111O)) {
                                        }
                                    } else {
                                        oOOlOO0IO.I00iiI |= 2;
/* 262 */                               oOOlOO0IO.I00iio = iOOOIOiO0io1.I000iOII();
                                    }
                                }
/* 99 */                        z = true;
                            } catch (Throwable th) {
/* 296 */                       if (((c == true ? 1 : 0) & 32) == 32) {
/* 304 */                           oOOlOO0IO.I00ioIO = Collections.unmodifiableList(oOOlOO0IO.I00ioIO);
                                }
/* 308 */                       if (((c == true ? 1 : 0) & 64) == 64) {
/* 316 */                           oOOlOO0IO.I00l0I0l0lO1 = Collections.unmodifiableList(oOOlOO0IO.I00l0I0l0lO1);
                                }
                                try {
/* 318 */                           i1I1OO00o1oI00111O.I001iOo1i0O();
                                } catch (IOException unused) {
                                } catch (Throwable th2) {
/* 333 */                           oOOlOO0IO.I00iOIl = iIOI0o10I000lI.I000II();
/* 335 */                           throw th2;
                                }
/* 325 */                       oOOlOO0IO.I00iOIl = iIOI0o10I000lI.I000II();
/* 336 */                       throw th;
                            }
                        } catch (O001110li e) {
/* 291 */                   e.I00iOIl = oOOlOO0IO;
/* 293 */                   throw e;
                        } catch (IOException e2) {
/* 285 */                   O001110li o001110li = new O001110li(e2.getMessage());
/* 288 */                   o001110li.I00iOIl = oOOlOO0IO;
/* 290 */                   throw o001110li;
                        }
                    }
/* 339 */           if (((c == true ? 1 : 0) & 32) == 32) {
/* 347 */               oOOlOO0IO.I00ioIO = Collections.unmodifiableList(oOOlOO0IO.I00ioIO);
                    }
/* 351 */           if (((c == true ? 1 : 0) & 64) == 64) {
/* 359 */               oOOlOO0IO.I00l0I0l0lO1 = Collections.unmodifiableList(oOOlOO0IO.I00l0I0l0lO1);
                    }
                    try {
/* 361 */               i1I1OO00o1oI00111O.I001iOo1i0O();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
/* 376 */               oOOlOO0IO.I00iOIl = iIOI0o10I000lI.I000II();
/* 551 */               throw th3;
                    }
/* 368 */           oOOlOO0IO.I00iOIl = iIOI0o10I000lI.I000II();
/* 370 */           return oOOlOO0IO;
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
                /* JADX WARN: Removed duplicated region for block: B:134:0x0338  */
                /* JADX WARN: Removed duplicated region for block: B:137:0x0344  */
                /* JADX WARN: Removed duplicated region for block: B:140:0x0350  */
                /* JADX WARN: Removed duplicated region for block: B:143:0x035c  */
                /* JADX WARN: Removed duplicated region for block: B:146:0x0368  */
                /* JADX WARN: Removed duplicated region for block: B:149:0x0374  */
                /* JADX WARN: Removed duplicated region for block: B:152:0x0380  */
                /* JADX WARN: Removed duplicated region for block: B:155:0x038e  */
                /* JADX WARN: Removed duplicated region for block: B:158:0x039c  */
                /* JADX WARN: Type inference failed for: r4v10, types: [boolean] */
                /* JADX WARN: Type inference failed for: r4v2 */
                /* JADX WARN: Type inference failed for: r4v5 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I000o00OoI0I(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) throws Throwable {
                    int i;
                    int i2;
/* 7 */             OOOll1o0 oOOll1o0 = new OOOll1o0();
/* 11 */            oOOll1o0.I00lll10 = -1;
/* 13 */            oOOll1o0.I00ol1 = (byte) -1;
/* 15 */            oOOll1o0.I00olI = -1;
/* 17 */            oOOll1o0.I00100o1O0lo();
/* 20 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 24 */            boolean z = true;
/* 25 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 29 */            boolean z2 = false;
/* 30 */            int i3 = 0;
                    while (true) {
/* 37 */                int i4 = 32768;
/* 46 */                boolean z3 = z;
/* 48 */                ?? I000oI1ioi = 256;
/* 48 */                i = Barcode.FORMAT_QR_CODE;
/* 48 */                int i5 = Barcode.FORMAT_QR_CODE;
/* 50 */                if (z2) {
/* 959 */                   if ((i3 & 32) == 32) {
/* 967 */                       oOOll1o0.I00l0I0l0lO1 = Collections.unmodifiableList(oOOll1o0.I00l0I0l0lO1);
                            }
/* 971 */                   if ((i3 & Barcode.FORMAT_PDF417) == 2048) {
/* 979 */                       oOOll1o0.I00o0l1o1o0 = Collections.unmodifiableList(oOOll1o0.I00o0l1o1o0);
                            }
/* 983 */                   if ((i3 & Barcode.FORMAT_QR_CODE) == 256) {
/* 991 */                       oOOll1o0.I00ll1 = Collections.unmodifiableList(oOOll1o0.I00ll1);
                            }
/* 995 */                   if ((i3 & Barcode.FORMAT_UPC_A) == 512) {
/* 1003 */                      oOOll1o0.I00lli11 = Collections.unmodifiableList(oOOll1o0.I00lli11);
                            }
/* 1007 */                  if ((i3 & 65536) == 65536) {
/* 1015 */                      oOOll1o0.I00oO101o = Collections.unmodifiableList(oOOll1o0.I00oO101o);
                            }
/* 1019 */                  if ((i3 & Barcode.FORMAT_UPC_E) == 1024) {
/* 1027 */                      oOOll1o0.I00o0iI0io1 = Collections.unmodifiableList(oOOll1o0.I00o0iI0io1);
                            }
/* 1031 */                  if ((i3 & 8192) == 8192) {
/* 1039 */                      oOOll1o0.I00oI0i = Collections.unmodifiableList(oOOll1o0.I00oI0i);
                            }
/* 1046 */                  if ((i3 & 32768) == 32768) {
/* 1054 */                      oOOll1o0.I00oIiI10 = Collections.unmodifiableList(oOOll1o0.I00oIiI10);
                            }
/* 1060 */                  if ((i3 & 131072) == 131072) {
/* 1068 */                      oOOll1o0.I00oOio10iI1 = Collections.unmodifiableList(oOOll1o0.I00oOio10iI1);
                            }
                            try {
/* 1070 */                      i1I1OO00o1oI00111O.I001iOo1i0O();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
/* 1085 */                      oOOll1o0.I00iiI = iIOI0o10I000lI.I000II();
/* 1087 */                      throw th;
                            }
/* 1077 */                  oOOll1o0.I00iiI = iIOI0o10I000lI.I000II();
/* 1088 */                  oOOll1o0.I000lI();
/* 1091 */                  return oOOll1o0;
                        }
                        try {
/* 54 */                    int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 58 */                    OOOoooI oOOoooII0010o = null;
/* 58 */                    OOOiOi0o oOOiOi0oI000OOo1O = null;
/* 58 */                    OOOOo00i00Io oOOOo00i00IoI000OOo1O = null;
/* 58 */                    OOOoooI oOOoooII0010o2 = null;
                            switch (iI000o00OoI0I) {
                                case 0:
/* 69 */                            z2 = z3;
/* 800 */                           z = z3;
                                case 8:
                                    oOOll1o0.I00iiO |= 2;
/* 798 */                           oOOll1o0.I00ilI0I1 = iOOOIOiO0io1.I000iOII();
/* 800 */                           z = z3;
                                case 16:
                                    oOOll1o0.I00iiO |= 4;
/* 781 */                           oOOll1o0.I00ilO0 = iOOOIOiO0io1.I000iOII();
/* 800 */                           z = z3;
                                case PoseLandmark.RIGHT_KNEE:
/* 727 */                           if ((oOOll1o0.I00iiO & 8) == 8) {
/* 729 */                               OOi001oo1OOI oOi001oo1OOI = oOOll1o0.I00io1l;
/* 731 */                               oOi001oo1OOI.getClass();
/* 734 */                               oOOoooII0010o = OOi001oo1OOI.I0010o(oOi001oo1OOI);
                                    }
/* 738 */                           OOOoooI oOOoooI = oOOoooII0010o;
/* 746 */                           OOi001oo1OOI oOi001oo1OOI2 = (OOi001oo1OOI) iOOOIOiO0io1.I000II(OOi001oo1OOI.I00oOio10iI1, il1lll0iI);
/* 748 */                           oOOll1o0.I00io1l = oOi001oo1OOI2;
/* 750 */                           if (oOOoooI != null) {
/* 752 */                               oOOoooI.I000OOo1O(oOi001oo1OOI2);
/* 759 */                               oOOll1o0.I00io1l = oOOoooI.I000II();
                                    }
                                    oOOll1o0.I00iiO |= 8;
/* 800 */                           z = z3;
                                case 34:
/* 695 */                           if ((i3 & 32) != 32) {
/* 702 */                               oOOll1o0.I00l0I0l0lO1 = new ArrayList();
/* 704 */                               i3 |= 32;
                                    }
/* 714 */                           oOOll1o0.I00l0I0l0lO1.add(iOOOIOiO0io1.I000II(OOi0O1i1lOi.I00o0iI0io1, il1lll0iI));
/* 800 */                           z = z3;
                                case 42:
/* 643 */                           if ((oOOll1o0.I00iiO & 32) == 32) {
/* 645 */                               OOi001oo1OOI oOi001oo1OOI3 = oOOll1o0.I00l0OO0IO;
/* 647 */                               oOi001oo1OOI3.getClass();
/* 650 */                               oOOoooII0010o2 = OOi001oo1OOI.I0010o(oOi001oo1OOI3);
                                    }
/* 654 */                           OOOoooI oOOoooI2 = oOOoooII0010o2;
/* 662 */                           OOi001oo1OOI oOi001oo1OOI4 = (OOi001oo1OOI) iOOOIOiO0io1.I000II(OOi001oo1OOI.I00oOio10iI1, il1lll0iI);
/* 664 */                           oOOll1o0.I00l0OO0IO = oOi001oo1OOI4;
/* 666 */                           if (oOOoooI2 != null) {
/* 668 */                               oOOoooI2.I000OOo1O(oOi001oo1OOI4);
/* 675 */                               oOOll1o0.I00l0OO0IO = oOOoooI2.I000II();
                                    }
                                    oOOll1o0.I00iiO |= 32;
/* 800 */                           z = z3;
                                case 50:
/* 609 */                           if ((i3 & Barcode.FORMAT_PDF417) != 2048) {
/* 616 */                               oOOll1o0.I00o0l1o1o0 = new ArrayList();
/* 618 */                               i3 |= Barcode.FORMAT_PDF417;
                                    }
/* 628 */                           oOOll1o0.I00o0l1o1o0.add(iOOOIOiO0io1.I000II(OOi0iiO0iOi.I00o0iI0io1, il1lll0iI));
/* 800 */                           z = z3;
                                case 56:
                                    oOOll1o0.I00iiO |= 16;
/* 599 */                           oOOll1o0.I00ioIO = iOOOIOiO0io1.I000iOII();
/* 800 */                           z = z3;
                                case Barcode.FORMAT_EAN_8:
                                    oOOll1o0.I00iiO |= 64;
/* 581 */                           oOOll1o0.I00li1OI = iOOOIOiO0io1.I000iOII();
/* 800 */                           z = z3;
                                case 72:
                                    oOOll1o0.I00iiO |= 1;
/* 563 */                           oOOll1o0.I00iio = iOOOIOiO0io1.I000iOII();
/* 800 */                           z = z3;
                                case 82:
/* 525 */                           if ((i3 & Barcode.FORMAT_QR_CODE) != 256) {
/* 532 */                               oOOll1o0.I00ll1 = new ArrayList();
/* 534 */                               i3 |= Barcode.FORMAT_QR_CODE;
                                    }
/* 544 */                           oOOll1o0.I00ll1.add(iOOOIOiO0io1.I000II(OOi001oo1OOI.I00oOio10iI1, il1lll0iI));
/* 800 */                           z = z3;
                                case 88:
/* 493 */                           if ((i3 & Barcode.FORMAT_UPC_A) != 512) {
/* 500 */                               oOOll1o0.I00lli11 = new ArrayList();
/* 502 */                               i3 |= Barcode.FORMAT_UPC_A;
                                    }
/* 514 */                           oOOll1o0.I00lli11.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
/* 800 */                           z = z3;
                                case 90:
/* 439 */                           int iI0000oI00 = iOOOIOiO0io1.I0000oI00(iOOOIOiO0io1.I000iOII());
/* 445 */                           if ((i3 & Barcode.FORMAT_UPC_A) != 512 && iOOOIOiO0io1.I0000Il00O() > 0) {
/* 458 */                               oOOll1o0.I00lli11 = new ArrayList();
/* 460 */                               i3 |= Barcode.FORMAT_UPC_A;
                                    }
/* 466 */                           while (iOOOIOiO0io1.I0000Il00O() > 0) {
/* 478 */                               oOOll1o0.I00lli11.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
                                    }
/* 482 */                           iOOOIOiO0io1.I0000O(iI0000oI00);
/* 800 */                           z = z3;
                                    break;
                                case 98:
/* 408 */                           if ((i3 & 65536) != 65536) {
/* 415 */                               oOOll1o0.I00oO101o = new ArrayList();
/* 417 */                               i3 |= 65536;
                                    }
/* 426 */                           oOOll1o0.I00oO101o.add(iOOOIOiO0io1.I000II(OOOi000ooO.I00ioIO, il1lll0iI));
/* 800 */                           z = z3;
                                case 106:
/* 378 */                           if ((i3 & Barcode.FORMAT_UPC_E) != 1024) {
/* 385 */                               oOOll1o0.I00o0iI0io1 = new ArrayList();
/* 387 */                               i3 |= Barcode.FORMAT_UPC_E;
                                    }
/* 397 */                           oOOll1o0.I00o0iI0io1.add(iOOOIOiO0io1.I000II(OOi0iiO0iOi.I00o0iI0io1, il1lll0iI));
/* 800 */                           z = z3;
                                case 242:
/* 331 */                           if ((oOOll1o0.I00iiO & Barcode.FORMAT_ITF) == 128) {
/* 333 */                               OOi0i0OO0lol oOi0i0OO0lol = oOOll1o0.I00o101lO;
/* 335 */                               oOi0i0OO0lol.getClass();
/* 338 */                               oOOOo00i00IoI000OOo1O = OOi0i0OO0lol.I000OOo1O(oOi0i0OO0lol);
                                    }
/* 342 */                           OOOOo00i00Io oOOOo00i00Io = oOOOo00i00IoI000OOo1O;
/* 350 */                           OOi0i0OO0lol oOi0i0OO0lol2 = (OOi0i0OO0lol) iOOOIOiO0io1.I000II(OOi0i0OO0lol.I00ioIO, il1lll0iI);
/* 352 */                           oOOll1o0.I00o101lO = oOi0i0OO0lol2;
/* 354 */                           if (oOOOo00i00Io != null) {
/* 356 */                               oOOOo00i00Io.I000OOo1O(oOi0i0OO0lol2);
/* 363 */                               oOOll1o0.I00o101lO = oOOOo00i00Io.I000II();
                                    }
                                    oOOll1o0.I00iiO |= Barcode.FORMAT_ITF;
/* 800 */                           z = z3;
                                case 248:
/* 296 */                           if ((i3 & 8192) != 8192) {
/* 303 */                               oOOll1o0.I00oI0i = new ArrayList();
/* 305 */                               i3 |= 8192;
                                    }
/* 317 */                           oOOll1o0.I00oI0i.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
/* 800 */                           z = z3;
                                case 250:
/* 221 */                           i2 = 131072;
/* 227 */                           int iI0000oI002 = iOOOIOiO0io1.I0000oI00(iOOOIOiO0io1.I000iOII());
/* 233 */                           if ((i3 & 8192) != 8192 && iOOOIOiO0io1.I0000Il00O() > 0) {
/* 246 */                               oOOll1o0.I00oI0i = new ArrayList();
/* 248 */                               i3 |= 8192;
                                    }
/* 254 */                           while (iOOOIOiO0io1.I0000Il00O() > 0) {
/* 262 */                               i = i4;
                                        try {
                                            try {
/* 268 */                                       oOOll1o0.I00oI0i.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
/* 271 */                                       i4 = i;
                                            } catch (Throwable th2) {
/* 274 */                                       th = th2;
/* 823 */                                       if ((i3 & 32) == 32) {
/* 831 */                                           oOOll1o0.I00l0I0l0lO1 = Collections.unmodifiableList(oOOll1o0.I00l0I0l0lO1);
                                                }
/* 835 */                                       if ((i3 & Barcode.FORMAT_PDF417) == 2048) {
/* 843 */                                           oOOll1o0.I00o0l1o1o0 = Collections.unmodifiableList(oOOll1o0.I00o0l1o1o0);
                                                }
/* 847 */                                       if ((i3 & Barcode.FORMAT_QR_CODE) == i5) {
/* 855 */                                           oOOll1o0.I00ll1 = Collections.unmodifiableList(oOOll1o0.I00ll1);
                                                }
/* 859 */                                       if ((i3 & Barcode.FORMAT_UPC_A) == 512) {
/* 867 */                                           oOOll1o0.I00lli11 = Collections.unmodifiableList(oOOll1o0.I00lli11);
                                                }
/* 871 */                                       if ((i3 & 65536) == 65536) {
/* 879 */                                           oOOll1o0.I00oO101o = Collections.unmodifiableList(oOOll1o0.I00oO101o);
                                                }
/* 883 */                                       if ((i3 & Barcode.FORMAT_UPC_E) == 1024) {
/* 891 */                                           oOOll1o0.I00o0iI0io1 = Collections.unmodifiableList(oOOll1o0.I00o0iI0io1);
                                                }
/* 895 */                                       if ((i3 & 8192) == 8192) {
/* 903 */                                           oOOll1o0.I00oI0i = Collections.unmodifiableList(oOOll1o0.I00oI0i);
                                                }
/* 909 */                                       if ((i3 & i) == i) {
/* 917 */                                           oOOll1o0.I00oIiI10 = Collections.unmodifiableList(oOOll1o0.I00oIiI10);
                                                }
/* 923 */                                       if ((i3 & i2) == i2) {
/* 931 */                                           oOOll1o0.I00oOio10iI1 = Collections.unmodifiableList(oOOll1o0.I00oOio10iI1);
                                                }
                                                try {
/* 933 */                                           i1I1OO00o1oI00111O.I001iOo1i0O();
                                                } catch (IOException unused2) {
                                                } catch (Throwable th3) {
/* 948 */                                           oOOll1o0.I00iiI = iIOI0o10I000lI.I000II();
/* 950 */                                           throw th3;
                                                }
/* 940 */                                       oOOll1o0.I00iiI = iIOI0o10I000lI.I000II();
/* 951 */                                       oOOll1o0.I000lI();
/* 954 */                                       throw th;
                                            }
                                        } catch (O001110li e) {
/* 280 */                                   e = e;
/* 816 */                                   e.I00iOIl = oOOll1o0;
/* 818 */                                   throw e;
                                        } catch (IOException e2) {
/* 277 */                                   e = e2;
/* 810 */                                   O001110li o001110li = new O001110li(e.getMessage());
/* 813 */                                   o001110li.I00iOIl = oOOll1o0;
/* 815 */                                   throw o001110li;
                                        }
                                    }
/* 285 */                           iOOOIOiO0io1.I0000O(iI0000oI002);
/* 800 */                           z = z3;
                                    break;
                                case 258:
/* 180 */                           if ((oOOll1o0.I00iiO & Barcode.FORMAT_QR_CODE) == 256) {
/* 182 */                               OOOilI oOOilI = oOOll1o0.I00oII;
/* 184 */                               oOOilI.getClass();
/* 187 */                               oOOiOi0oI000OOo1O = OOOilI.I000OOo1O(oOOilI);
                                    }
/* 191 */                           OOOiOi0o oOOiOi0o = oOOiOi0oI000OOo1O;
/* 199 */                           OOOilI oOOilI2 = (OOOilI) iOOOIOiO0io1.I000II(OOOilI.I00ilO0, il1lll0iI);
/* 201 */                           oOOll1o0.I00oII = oOOilI2;
/* 203 */                           if (oOOiOi0o != null) {
/* 205 */                               oOOiOi0o.I000OiO(oOOilI2);
/* 212 */                               oOOll1o0.I00oII = oOOiOi0o.I0001Ioi1lo();
                                    }
                                    oOOll1o0.I00iiO |= Barcode.FORMAT_QR_CODE;
/* 800 */                           z = z3;
                                case 266:
/* 152 */                           if ((i3 & 32768) != 32768) {
/* 159 */                               oOOll1o0.I00oIiI10 = new ArrayList();
/* 161 */                               i3 |= 32768;
                                    }
/* 170 */                           oOOll1o0.I00oIiI10.add(iOOOIOiO0io1.I000II(OOOi1IIOOO01.I00ioIO, il1lll0iI));
/* 800 */                           z = z3;
                                case 274:
/* 96 */                            if ((i3 & 131072) != 131072) {
/* 103 */                               oOOll1o0.I00oOio10iI1 = new ArrayList();
/* 105 */                               i3 |= 131072;
                                    }
                                    try {
/* 108 */                               i2 = 131072;
                                    } catch (O001110li e3) {
/* 144 */                               e = e3;
                                    } catch (IOException e4) {
/* 140 */                               e = e4;
                                    } catch (Throwable th4) {
/* 136 */                               th = th4;
/* 137 */                               i2 = 131072;
                                    }
                                    try {
/* 116 */                               oOOll1o0.I00oOio10iI1.add(iOOOIOiO0io1.I000II(OOOi000ooO.I00ioIO, il1lll0iI));
/* 800 */                               z = z3;
                                    } catch (O001110li e5) {
/* 131 */                               e = e5;
/* 816 */                               e.I00iOIl = oOOll1o0;
/* 818 */                               throw e;
                                    } catch (IOException e6) {
/* 126 */                               e = e6;
/* 810 */                               O001110li o001110li2 = new O001110li(e.getMessage());
/* 813 */                               o001110li2.I00iOIl = oOOll1o0;
/* 815 */                               throw o001110li2;
                                    } catch (Throwable th5) {
/* 121 */                               th = th5;
/* 122 */                               i = 32768;
/* 823 */                               if ((i3 & 32) == 32) {
                                        }
/* 835 */                               if ((i3 & Barcode.FORMAT_PDF417) == 2048) {
                                        }
/* 847 */                               if ((i3 & Barcode.FORMAT_QR_CODE) == i5) {
                                        }
/* 859 */                               if ((i3 & Barcode.FORMAT_UPC_A) == 512) {
                                        }
/* 871 */                               if ((i3 & 65536) == 65536) {
                                        }
/* 883 */                               if ((i3 & Barcode.FORMAT_UPC_E) == 1024) {
                                        }
/* 895 */                               if ((i3 & 8192) == 8192) {
                                        }
/* 909 */                               if ((i3 & i) == i) {
                                        }
/* 923 */                               if ((i3 & i2) == i2) {
                                        }
/* 933 */                               i1I1OO00o1oI00111O.I001iOo1i0O();
/* 940 */                               oOOll1o0.I00iiI = iIOI0o10I000lI.I000II();
/* 951 */                               oOOll1o0.I000lI();
/* 954 */                               throw th;
                                    }
                                    break;
                                default:
/* 63 */                            I000oI1ioi = oOOll1o0.I000oI1ioi(iOOOIOiO0io1, i1I1OO00o1oI00111O, il1lll0iI, iI000o00OoI0I);
/* 67 */                            if (I000oI1ioi == 0) {
                                    }
/* 800 */                           z = z3;
                                    break;
                            }
                        } catch (O001110li e7) {
/* 87 */                    e = e7;
                        } catch (IOException e8) {
/* 80 */                    e = e8;
                        } catch (Throwable th6) {
/* 73 */                    th = th6;
/* 74 */                    i = 32768;
/* 76 */                    i2 = 131072;
                            i5 = I000oI1ioi;
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v4 */
                /* JADX WARN: Type inference failed for: r4v6 */
                /* JADX WARN: Type inference failed for: r4v8 */
                private final Object I000oI1ioi(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 3 */             OOOloii1IoO0 oOOloii1IoO0 = new OOOloii1IoO0();
/* 7 */             oOOloii1IoO0.I00l0I0l0lO1 = (byte) -1;
/* 9 */             oOOloii1IoO0.I00l0OO0IO = -1;
/* 11 */            List list = Collections.EMPTY_LIST;
/* 13 */            oOOloii1IoO0.I00iio = list;
/* 15 */            oOOloii1IoO0.I00ilI0I1 = list;
/* 17 */            oOOloii1IoO0.I00ilO0 = list;
/* 21 */            oOOloii1IoO0.I00io1l = OOi0i0OO0lol.I00io1l;
/* 25 */            oOOloii1IoO0.I00ioIO = OOi0liO.I00ilI0I1;
/* 27 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 32 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 36 */            boolean z = false;
/* 37 */            char c = 0;
                    while (true) {
/* 39 */                int i = 2;
/* 40 */                if (z) {
                            break;
                        }
                        try {
                            try {
/* 42 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 46 */                        if (iI000o00OoI0I != 0) {
/* 50 */                            if (iI000o00OoI0I == 26) {
/* 229 */                               int i2 = (c == true ? 1 : 0) & 1;
                                        c = c;
/* 231 */                               if (i2 != 1) {
/* 238 */                                   oOOloii1IoO0.I00iio = new ArrayList();
/* 240 */                                   c = (c == true ? 1 : 0) | 1;
                                        }
/* 250 */                               oOOloii1IoO0.I00iio.add(iOOOIOiO0io1.I000II(OOOll1o0.I00oliIiO01i, il1lll0iI));
                                    } else if (iI000o00OoI0I == 34) {
/* 203 */                               int i3 = (c == true ? 1 : 0) & 2;
                                        c = c;
/* 205 */                               if (i3 != 2) {
/* 212 */                                   oOOloii1IoO0.I00ilI0I1 = new ArrayList();
/* 214 */                                   c = (c == true ? 1 : 0) | 2;
                                        }
/* 224 */                               oOOloii1IoO0.I00ilI0I1.add(iOOOIOiO0io1.I000II(OOOo0i11Ol.I0100o111I, il1lll0iI));
                                    } else if (iI000o00OoI0I != 42) {
/* 62 */                                OOOiOi0o oOOiOi0o = null;
/* 62 */                                OOOOo00i00Io oOOOo00i00IoI000OOo1O = null;
/* 63 */                                if (iI000o00OoI0I == 242) {
/* 138 */                                   if ((oOOloii1IoO0.I00iiO & 1) == 1) {
/* 140 */                                       OOi0i0OO0lol oOi0i0OO0lol = oOOloii1IoO0.I00io1l;
/* 142 */                                       oOi0i0OO0lol.getClass();
/* 145 */                                       oOOOo00i00IoI000OOo1O = OOi0i0OO0lol.I000OOo1O(oOi0i0OO0lol);
                                            }
/* 155 */                                   OOi0i0OO0lol oOi0i0OO0lol2 = (OOi0i0OO0lol) iOOOIOiO0io1.I000II(OOi0i0OO0lol.I00ioIO, il1lll0iI);
/* 157 */                                   oOOloii1IoO0.I00io1l = oOi0i0OO0lol2;
/* 159 */                                   if (oOOOo00i00IoI000OOo1O != null) {
/* 161 */                                       oOOOo00i00IoI000OOo1O.I000OOo1O(oOi0i0OO0lol2);
/* 168 */                                       oOOloii1IoO0.I00io1l = oOOOo00i00IoI000OOo1O.I000II();
                                            }
                                            oOOloii1IoO0.I00iiO |= 1;
                                        } else if (iI000o00OoI0I == 258) {
/* 89 */                                    if ((oOOloii1IoO0.I00iiO & 2) == 2) {
/* 91 */                                        OOi0liO oOi0liO = oOOloii1IoO0.I00ioIO;
/* 93 */                                        oOi0liO.getClass();
/* 98 */                                        oOOiOi0o = new OOOiOi0o(i);
/* 103 */                                       oOOiOi0o.I00iio = Collections.EMPTY_LIST;
/* 105 */                                       oOOiOi0o.I000lI(oOi0liO);
                                            }
/* 114 */                                   OOi0liO oOi0liO2 = (OOi0liO) iOOOIOiO0io1.I000II(OOi0liO.I00ilO0, il1lll0iI);
/* 116 */                                   oOOloii1IoO0.I00ioIO = oOi0liO2;
/* 118 */                                   if (oOOiOi0o != null) {
/* 120 */                                       oOOiOi0o.I000lI(oOi0liO2);
/* 127 */                                       oOOloii1IoO0.I00ioIO = oOOiOi0o.I000OOo1O();
                                            }
                                            oOOloii1IoO0.I00iiO |= 2;
                                        } else if (!oOOloii1IoO0.I000oI1ioi(iOOOIOiO0io1, i1I1OO00o1oI00111O, il1lll0iI, iI000o00OoI0I)) {
                                        }
                                    } else {
/* 177 */                               int i4 = (c == true ? 1 : 0) & 4;
                                        c = c;
/* 179 */                               if (i4 != 4) {
/* 186 */                                   oOOloii1IoO0.I00ilO0 = new ArrayList();
/* 188 */                                   c = (c == true ? 1 : 0) | 4;
                                        }
/* 198 */                               oOOloii1IoO0.I00ilO0.add(iOOOIOiO0io1.I000II(OOi0IOIIOO.I00o101lO, il1lll0iI));
                                    }
                                }
/* 75 */                        z = true;
                            } catch (Throwable th) {
/* 272 */                       if (((c == true ? 1 : 0) & 1) == 1) {
/* 280 */                           oOOloii1IoO0.I00iio = Collections.unmodifiableList(oOOloii1IoO0.I00iio);
                                }
/* 284 */                       if (((c == true ? 1 : 0) & 2) == 2) {
/* 292 */                           oOOloii1IoO0.I00ilI0I1 = Collections.unmodifiableList(oOOloii1IoO0.I00ilI0I1);
                                }
/* 296 */                       if (((c == true ? 1 : 0) & 4) == 4) {
/* 304 */                           oOOloii1IoO0.I00ilO0 = Collections.unmodifiableList(oOOloii1IoO0.I00ilO0);
                                }
                                try {
/* 306 */                           i1I1OO00o1oI00111O.I001iOo1i0O();
                                } catch (IOException unused) {
                                } catch (Throwable th2) {
/* 321 */                           oOOloii1IoO0.I00iiI = iIOI0o10I000lI.I000II();
/* 323 */                           throw th2;
                                }
/* 313 */                       oOOloii1IoO0.I00iiI = iIOI0o10I000lI.I000II();
/* 324 */                       oOOloii1IoO0.I000lI();
/* 327 */                       throw th;
                            }
                        } catch (O001110li e) {
/* 267 */                   e.I00iOIl = oOOloii1IoO0;
/* 269 */                   throw e;
                        } catch (IOException e2) {
/* 261 */                   O001110li o001110li = new O001110li(e2.getMessage());
/* 264 */                   o001110li.I00iOIl = oOOloii1IoO0;
/* 266 */                   throw o001110li;
                        }
                    }
/* 330 */           if (((c == true ? 1 : 0) & 1) == 1) {
/* 338 */               oOOloii1IoO0.I00iio = Collections.unmodifiableList(oOOloii1IoO0.I00iio);
                    }
/* 342 */           if (((c == true ? 1 : 0) & 2) == 2) {
/* 350 */               oOOloii1IoO0.I00ilI0I1 = Collections.unmodifiableList(oOOloii1IoO0.I00ilI0I1);
                    }
/* 354 */           if (((c == true ? 1 : 0) & 4) == 4) {
/* 362 */               oOOloii1IoO0.I00ilO0 = Collections.unmodifiableList(oOOloii1IoO0.I00ilO0);
                    }
                    try {
/* 364 */               i1I1OO00o1oI00111O.I001iOo1i0O();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
/* 379 */               oOOloii1IoO0.I00iiI = iIOI0o10I000lI.I000II();
/* 381 */               throw th3;
                    }
/* 371 */           oOOloii1IoO0.I00iiI = iIOI0o10I000lI.I000II();
/* 382 */           oOOloii1IoO0.I000lI();
/* 551 */           return oOOloii1IoO0;
                }

                private final Object I00100l0(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 3 */             OOOloll11 oOOloll11 = new OOOloll11();
/* 7 */             oOOloll11.I00ioIO = (byte) -1;
/* 9 */             oOOloll11.I00l0I0l0lO1 = -1;
/* 13 */            oOOloll11.I00iio = OOOoiIli.I00ilI0I1;
/* 17 */            oOOloll11.I00ilI0I1 = OOOoOl1.I00ilI0I1;
/* 21 */            oOOloll11.I00ilO0 = OOOloii1IoO0.I00li1OI;
/* 25 */            oOOloll11.I00io1l = Collections.EMPTY_LIST;
/* 27 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 31 */            int i = 1;
/* 32 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 36 */            boolean z = false;
/* 37 */            char c = 0;
/* 40 */            while (!z) {
                        try {
                            try {
                                try {
/* 42 */                            int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 46 */                            if (iI000o00OoI0I != 0) {
/* 50 */                                OOOlo0l oOOlo0lI000O01llI0 = null;
/* 50 */                                OOOiOi0o oOOiOi0o = null;
/* 50 */                                OOOiOi0o oOOiOi0o2 = null;
/* 51 */                                if (iI000o00OoI0I == 10) {
/* 205 */                                   if ((oOOloll11.I00iiO & 1) == 1) {
/* 207 */                                       OOOoiIli oOOoiIli = oOOloll11.I00iio;
/* 209 */                                       oOOoiIli.getClass();
/* 215 */                                       oOOiOi0o = new OOOiOi0o(3);
/* 220 */                                       oOOiOi0o.I00iio = O0o1O0olOll.I00iiI;
/* 222 */                                       oOOiOi0o.I000l1(oOOoiIli);
                                            }
/* 231 */                                   OOOoiIli oOOoiIli2 = (OOOoiIli) iOOOIOiO0io1.I000II(OOOoiIli.I00ilO0, il1lll0iI);
/* 233 */                                   oOOloll11.I00iio = oOOoiIli2;
/* 235 */                                   if (oOOiOi0o != null) {
/* 237 */                                       oOOiOi0o.I000l1(oOOoiIli2);
/* 244 */                                       oOOloll11.I00iio = oOOiOi0o.I000O01llI0();
                                            }
                                            oOOloll11.I00iiO |= 1;
                                        } else if (iI000o00OoI0I == 18) {
/* 155 */                                   if ((oOOloll11.I00iiO & 2) == 2) {
/* 157 */                                       OOOoOl1 oOOoOl1 = oOOloll11.I00ilI0I1;
/* 159 */                                       oOOoOl1.getClass();
/* 164 */                                       oOOiOi0o2 = new OOOiOi0o(i);
/* 169 */                                       oOOiOi0o2.I00iio = Collections.EMPTY_LIST;
/* 171 */                                       oOOiOi0o2.I000iOII(oOOoOl1);
                                            }
/* 180 */                                   OOOoOl1 oOOoOl12 = (OOOoOl1) iOOOIOiO0io1.I000II(OOOoOl1.I00ilO0, il1lll0iI);
/* 182 */                                   oOOloll11.I00ilI0I1 = oOOoOl12;
/* 184 */                                   if (oOOiOi0o2 != null) {
/* 186 */                                       oOOiOi0o2.I000iOII(oOOoOl12);
/* 193 */                                       oOOloll11.I00ilI0I1 = oOOiOi0o2.I000II();
                                            }
                                            oOOloll11.I00iiO |= 2;
                                        } else if (iI000o00OoI0I == 26) {
/* 110 */                                   if ((oOOloll11.I00iiO & 4) == 4) {
/* 112 */                                       OOOloii1IoO0 oOOloii1IoO0 = oOOloll11.I00ilO0;
/* 114 */                                       oOOloii1IoO0.getClass();
/* 117 */                                       oOOlo0lI000O01llI0 = OOOlo0l.I000O01llI0();
/* 121 */                                       oOOlo0lI000O01llI0.I000OOo1O(oOOloii1IoO0);
                                            }
/* 130 */                                   OOOloii1IoO0 oOOloii1IoO02 = (OOOloii1IoO0) iOOOIOiO0io1.I000II(OOOloii1IoO0.I00ll1, il1lll0iI);
/* 132 */                                   oOOloll11.I00ilO0 = oOOloii1IoO02;
/* 134 */                                   if (oOOlo0lI000O01llI0 != null) {
/* 136 */                                       oOOlo0lI000O01llI0.I000OOo1O(oOOloii1IoO02);
/* 143 */                                       oOOloll11.I00ilO0 = oOOlo0lI000O01llI0.I000II();
                                            }
                                            oOOloll11.I00iiO |= 4;
                                        } else if (iI000o00OoI0I == 34) {
/* 82 */                                    int i2 = (c == true ? 1 : 0) & '\b';
                                            c = c;
/* 84 */                                    if (i2 != 8) {
/* 91 */                                        oOOloll11.I00io1l = new ArrayList();
/* 93 */                                        c = '\b';
                                            }
/* 102 */                                   oOOloll11.I00io1l.add(iOOOIOiO0io1.I000II(OOOi0i1IOo.I010I0, il1lll0iI));
                                        } else if (!oOOloll11.I000oI1ioi(iOOOIOiO0io1, i1I1OO00o1oI00111O, il1lll0iI, iI000o00OoI0I)) {
                                        }
                                    }
/* 71 */                            z = true;
                                } catch (O001110li e) {
/* 265 */                           e.I00iOIl = oOOloll11;
/* 267 */                           throw e;
                                }
                            } catch (IOException e2) {
/* 259 */                       O001110li o001110li = new O001110li(e2.getMessage());
/* 262 */                       o001110li.I00iOIl = oOOloll11;
/* 264 */                       throw o001110li;
                            }
                        } catch (Throwable th) {
/* 270 */                   if (((c == true ? 1 : 0) & '\b') == 8) {
/* 278 */                       oOOloll11.I00io1l = Collections.unmodifiableList(oOOloll11.I00io1l);
                            }
                            try {
/* 280 */                       i1I1OO00o1oI00111O.I001iOo1i0O();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
/* 295 */                       oOOloll11.I00iiI = iIOI0o10I000lI.I000II();
/* 297 */                       throw th2;
                            }
/* 287 */                   oOOloll11.I00iiI = iIOI0o10I000lI.I000II();
/* 298 */                   oOOloll11.I000lI();
/* 301 */                   throw th;
                        }
                    }
/* 304 */           if (((c == true ? 1 : 0) & '\b') == 8) {
/* 312 */               oOOloll11.I00io1l = Collections.unmodifiableList(oOOloll11.I00io1l);
                    }
                    try {
/* 314 */               i1I1OO00o1oI00111O.I001iOo1i0O();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
/* 329 */               oOOloll11.I00iiI = iIOI0o10I000lI.I000II();
/* 331 */               throw th3;
                    }
/* 321 */           oOOloll11.I00iiI = iIOI0o10I000lI.I000II();
/* 332 */           oOOloll11.I000lI();
/* 551 */           return oOOloll11;
                }

                private final Object I00100o1O0lo(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 3 */             OOOoOl1 oOOoOl1 = new OOOoOl1();
/* 7 */             oOOoOl1.I00iiO = (byte) -1;
/* 9 */             oOOoOl1.I00iio = -1;
/* 13 */            oOOoOl1.I00iiI = Collections.EMPTY_LIST;
/* 15 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 20 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 24 */            boolean z = false;
/* 25 */            boolean z2 = false;
/* 26 */            while (!z) {
                        try {
                            try {
/* 28 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 32 */                        if (iI000o00OoI0I != 0) {
/* 36 */                            if (iI000o00OoI0I == 10) {
/* 52 */                                if (!z2) {
/* 59 */                                    oOOoOl1.I00iiI = new ArrayList();
/* 61 */                                    z2 = true;
                                        }
/* 70 */                                oOOoOl1.I00iiI.add(iOOOIOiO0io1.I000II(OOOoOiil01.I00l0I0l0lO1, il1lll0iI));
                                    } else if (!iOOOIOiO0io1.I00100o1O0lo(iI000o00OoI0I, i1I1OO00o1oI00111O)) {
                                    }
                                }
/* 44 */                        z = true;
                            } catch (Throwable th) {
/* 89 */                        if (z2) {
/* 97 */                            oOOoOl1.I00iiI = Collections.unmodifiableList(oOOoOl1.I00iiI);
                                }
                                try {
/* 99 */                            i1I1OO00o1oI00111O.I001iOo1i0O();
                                } catch (IOException unused) {
                                } catch (Throwable th2) {
/* 114 */                           oOOoOl1.I00iOIl = iIOI0o10I000lI.I000II();
/* 116 */                           throw th2;
                                }
/* 106 */                       oOOoOl1.I00iOIl = iIOI0o10I000lI.I000II();
/* 117 */                       throw th;
                            }
                        } catch (O001110li e) {
/* 86 */                    e.I00iOIl = oOOoOl1;
/* 88 */                    throw e;
                        } catch (IOException e2) {
/* 80 */                    O001110li o001110li = new O001110li(e2.getMessage());
/* 83 */                    o001110li.I00iOIl = oOOoOl1;
/* 85 */                    throw o001110li;
                        }
                    }
/* 118 */           if (z2) {
/* 126 */               oOOoOl1.I00iiI = Collections.unmodifiableList(oOOoOl1.I00iiI);
                    }
                    try {
/* 128 */               i1I1OO00o1oI00111O.I001iOo1i0O();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
/* 143 */               oOOoOl1.I00iOIl = iIOI0o10I000lI.I000II();
/* 551 */               throw th3;
                    }
/* 135 */           oOOoOl1.I00iOIl = iIOI0o10I000lI.I000II();
/* 137 */           return oOOoOl1;
                }

                private final Object I0010I0i(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 3 */             OOOoOiil01 oOOoOiil01 = new OOOoOiil01();
/* 7 */             oOOoOiil01.I00ilO0 = (byte) -1;
/* 9 */             oOOoOiil01.I00io1l = -1;
/* 11 */            oOOoOiil01.I00iiO = -1;
/* 13 */            boolean z = false;
/* 14 */            oOOoOiil01.I00iio = 0;
/* 16 */            OOOoI1io oOOoI1io = OOOoI1io.PACKAGE;
/* 18 */            oOOoOiil01.I00ilI0I1 = oOOoI1io;
/* 20 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 25 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 29 */            while (!z) {
                        try {
                            try {
                                try {
/* 31 */                            int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 35 */                            if (iI000o00OoI0I != 0) {
/* 39 */                                if (iI000o00OoI0I == 8) {
                                            oOOoOiil01.I00iiI |= 1;
/* 122 */                                   oOOoOiil01.I00iiO = iOOOIOiO0io1.I000iOII();
                                        } else if (iI000o00OoI0I == 16) {
                                            oOOoOiil01.I00iiI |= 2;
/* 110 */                                   oOOoOiil01.I00iio = iOOOIOiO0io1.I000iOII();
                                        } else if (iI000o00OoI0I == 24) {
/* 64 */                                    int iI000iOII = iOOOIOiO0io1.I000iOII();
/* 81 */                                    OOOoI1io oOOoI1io2 = iI000iOII != 0 ? iI000iOII != 1 ? iI000iOII != 2 ? null : OOOoI1io.LOCAL : oOOoI1io : OOOoI1io.CLASS;
/* 83 */                                    if (oOOoI1io2 == null) {
/* 85 */                                        i1I1OO00o1oI00111O.I00Io1lO(iI000o00OoI0I);
/* 88 */                                        i1I1OO00o1oI00111O.I00Io1lO(iI000iOII);
                                            } else {
                                                oOOoOiil01.I00iiI |= 4;
/* 98 */                                        oOOoOiil01.I00ilI0I1 = oOOoI1io2;
                                            }
                                        } else if (!iOOOIOiO0io1.I00100o1O0lo(iI000o00OoI0I, i1I1OO00o1oI00111O)) {
                                        }
                                    }
/* 56 */                            z = true;
                                } catch (O001110li e) {
/* 137 */                           e.I00iOIl = oOOoOiil01;
/* 139 */                           throw e;
                                }
                            } catch (IOException e2) {
/* 131 */                       O001110li o001110li = new O001110li(e2.getMessage());
/* 134 */                       o001110li.I00iOIl = oOOoOiil01;
/* 136 */                       throw o001110li;
                            }
                        } catch (Throwable th) {
                            try {
/* 140 */                       i1I1OO00o1oI00111O.I001iOo1i0O();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
/* 155 */                       oOOoOiil01.I00iOIl = iIOI0o10I000lI.I000II();
/* 157 */                       throw th2;
                            }
/* 147 */                   oOOoOiil01.I00iOIl = iIOI0o10I000lI.I000II();
/* 158 */                   throw th;
                        }
                    }
                    try {
/* 159 */               i1I1OO00o1oI00111O.I001iOo1i0O();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
/* 174 */               oOOoOiil01.I00iOIl = iIOI0o10I000lI.I000II();
/* 551 */               throw th3;
                    }
/* 166 */           oOOoOiil01.I00iOIl = iIOI0o10I000lI.I000II();
/* 168 */           return oOOoOiil01;
                }

                private final Object I0010o(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 3 */             OOOoiIli oOOoiIli = new OOOoiIli();
/* 7 */             oOOoiIli.I00iiO = (byte) -1;
/* 9 */             oOOoiIli.I00iio = -1;
/* 13 */            oOOoiIli.I00iiI = O0o1O0olOll.I00iiI;
/* 15 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 20 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 24 */            boolean z = false;
/* 25 */            boolean z2 = false;
/* 26 */            while (!z) {
                        try {
                            try {
/* 28 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 32 */                        if (iI000o00OoI0I != 0) {
/* 36 */                            if (iI000o00OoI0I == 10) {
/* 52 */                                O1101ooIo0l o1101ooIo0lI0001Ioi1lo = iOOOIOiO0io1.I0001Ioi1lo();
/* 56 */                                if (!z2) {
/* 63 */                                    oOOoiIli.I00iiI = new O0o1O0olOll();
/* 65 */                                    z2 = true;
                                        }
/* 68 */                                oOOoiIli.I00iiI.I00Ol00(o1101ooIo0lI0001Ioi1lo);
                                    } else if (!iOOOIOiO0io1.I00100o1O0lo(iI000o00OoI0I, i1I1OO00o1oI00111O)) {
                                    }
                                }
/* 44 */                        z = true;
                            } catch (Throwable th) {
/* 87 */                        if (z2) {
/* 95 */                            oOOoiIli.I00iiI = oOOoiIli.I00iiI.I00100l0();
                                }
                                try {
/* 97 */                            i1I1OO00o1oI00111O.I001iOo1i0O();
                                } catch (IOException unused) {
                                } catch (Throwable th2) {
/* 112 */                           oOOoiIli.I00iOIl = iIOI0o10I000lI.I000II();
/* 114 */                           throw th2;
                                }
/* 104 */                       oOOoiIli.I00iOIl = iIOI0o10I000lI.I000II();
/* 115 */                       throw th;
                            }
                        } catch (O001110li e) {
/* 84 */                    e.I00iOIl = oOOoiIli;
/* 86 */                    throw e;
                        } catch (IOException e2) {
/* 78 */                    O001110li o001110li = new O001110li(e2.getMessage());
/* 81 */                    o001110li.I00iOIl = oOOoiIli;
/* 83 */                    throw o001110li;
                        }
                    }
/* 116 */           if (z2) {
/* 124 */               oOOoiIli.I00iiI = oOOoiIli.I00iiI.I00100l0();
                    }
                    try {
/* 126 */               i1I1OO00o1oI00111O.I001iOo1i0O();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
/* 141 */               oOOoiIli.I00iOIl = iIOI0o10I000lI.I000II();
/* 551 */               throw th3;
                    }
/* 133 */           oOOoiIli.I00iOIl = iIOI0o10I000lI.I000II();
/* 135 */           return oOOoiIli;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r7v0 */
                /* JADX WARN: Type inference failed for: r7v1 */
                /* JADX WARN: Type inference failed for: r7v2, types: [boolean] */
                private final Object I00111O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 3 */             O0II0llIl o0II0llIl = OOi001oo1OOI.I00oOio10iI1;
/* 5 */             OOi001oo1OOI oOi001oo1OOI = new OOi001oo1OOI();
/* 9 */             oOi001oo1OOI.I00oII = (byte) -1;
/* 11 */            oOi001oo1OOI.I00oIiI10 = -1;
/* 13 */            oOi001oo1OOI.I0010I0i();
/* 16 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 21 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 26 */            boolean z = false;
/* 27 */            int i = 0;
                    while (true) {
/* 28 */                ?? I000oI1ioi = 16384;
/* 30 */                if (z) {
/* 441 */                   if ((i & 1) == 1) {
/* 449 */                       oOi001oo1OOI.I00iio = Collections.unmodifiableList(oOi001oo1OOI.I00iio);
                            }
/* 453 */                   if ((i & 16384) == 16384) {
/* 461 */                       oOi001oo1OOI.I00oI0i = Collections.unmodifiableList(oOi001oo1OOI.I00oI0i);
                            }
                            try {
/* 463 */                       i1I1OO00o1oI00111O.I001iOo1i0O();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
/* 478 */                       oOi001oo1OOI.I00iiI = iIOI0o10I000lI.I000II();
/* 480 */                       throw th;
                            }
/* 470 */                   oOi001oo1OOI.I00iiI = iIOI0o10I000lI.I000II();
/* 481 */                   oOi001oo1OOI.I000lI();
/* 484 */                   return oOi001oo1OOI;
                        }
                        try {
                            try {
/* 32 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 36 */                        OOOoooI oOOoooII0010o = null;
                                switch (iI000o00OoI0I) {
                                    case 0:
/* 46 */                                z = true;
                                    case 8:
                                        oOi001oo1OOI.I00iiO |= Barcode.FORMAT_AZTEC;
/* 374 */                               oOi001oo1OOI.I00o101lO = iOOOIOiO0io1.I000iOII();
                                    case PoseLandmark.RIGHT_PINKY:
/* 340 */                               if ((i & 1) != 1) {
/* 347 */                                   oOi001oo1OOI.I00iio = new ArrayList();
/* 349 */                                   i |= 1;
                                        }
/* 359 */                               oOi001oo1OOI.I00iio.add(iOOOIOiO0io1.I000II(OOOooIOl.I00l0I0l0lO1, il1lll0iI));
                                    case PoseLandmark.RIGHT_HIP:
                                        oOi001oo1OOI.I00iiO |= 1;
/* 334 */                               oOi001oo1OOI.I00ilI0I1 = iOOOIOiO0io1.I000l1() != 0;
                                    case 32:
                                        oOi001oo1OOI.I00iiO |= 2;
/* 312 */                               oOi001oo1OOI.I00ilO0 = iOOOIOiO0io1.I000iOII();
                                    case 42:
/* 265 */                               if ((oOi001oo1OOI.I00iiO & 4) == 4) {
/* 267 */                                   OOi001oo1OOI oOi001oo1OOI2 = oOi001oo1OOI.I00io1l;
/* 269 */                                   oOi001oo1OOI2.getClass();
/* 272 */                                   oOOoooII0010o = OOi001oo1OOI.I0010o(oOi001oo1OOI2);
                                        }
/* 280 */                               OOi001oo1OOI oOi001oo1OOI3 = (OOi001oo1OOI) iOOOIOiO0io1.I000II(o0II0llIl, il1lll0iI);
/* 282 */                               oOi001oo1OOI.I00io1l = oOi001oo1OOI3;
/* 284 */                               if (oOOoooII0010o != null) {
/* 286 */                                   oOOoooII0010o.I000OOo1O(oOi001oo1OOI3);
/* 293 */                                   oOi001oo1OOI.I00io1l = oOOoooII0010o.I000II();
                                        }
                                        oOi001oo1OOI.I00iiO |= 4;
                                    case 48:
                                        oOi001oo1OOI.I00iiO |= 16;
/* 257 */                               oOi001oo1OOI.I00l0I0l0lO1 = iOOOIOiO0io1.I000iOII();
                                    case 56:
                                        oOi001oo1OOI.I00iiO |= 32;
/* 243 */                               oOi001oo1OOI.I00l0OO0IO = iOOOIOiO0io1.I000iOII();
                                    case Barcode.FORMAT_EAN_8:
                                        oOi001oo1OOI.I00iiO |= 8;
/* 229 */                               oOi001oo1OOI.I00ioIO = iOOOIOiO0io1.I000iOII();
                                    case 72:
                                        oOi001oo1OOI.I00iiO |= 64;
/* 215 */                               oOi001oo1OOI.I00li1OI = iOOOIOiO0io1.I000iOII();
                                    case 82:
/* 168 */                               if ((oOi001oo1OOI.I00iiO & Barcode.FORMAT_QR_CODE) == 256) {
/* 170 */                                   OOi001oo1OOI oOi001oo1OOI4 = oOi001oo1OOI.I00lli11;
/* 172 */                                   oOi001oo1OOI4.getClass();
/* 175 */                                   oOOoooII0010o = OOi001oo1OOI.I0010o(oOi001oo1OOI4);
                                        }
/* 183 */                               OOi001oo1OOI oOi001oo1OOI5 = (OOi001oo1OOI) iOOOIOiO0io1.I000II(o0II0llIl, il1lll0iI);
/* 185 */                               oOi001oo1OOI.I00lli11 = oOi001oo1OOI5;
/* 187 */                               if (oOOoooII0010o != null) {
/* 189 */                                   oOOoooII0010o.I000OOo1O(oOi001oo1OOI5);
/* 196 */                                   oOi001oo1OOI.I00lli11 = oOOoooII0010o.I000II();
                                        }
                                        oOi001oo1OOI.I00iiO |= Barcode.FORMAT_QR_CODE;
                                    case 88:
                                        oOi001oo1OOI.I00iiO |= Barcode.FORMAT_UPC_A;
/* 159 */                               oOi001oo1OOI.I00lll10 = iOOOIOiO0io1.I000iOII();
                                    case 96:
                                        oOi001oo1OOI.I00iiO |= Barcode.FORMAT_ITF;
/* 146 */                               oOi001oo1OOI.I00ll1 = iOOOIOiO0io1.I000iOII();
                                    case 106:
/* 100 */                               if ((oOi001oo1OOI.I00iiO & Barcode.FORMAT_UPC_E) == 1024) {
/* 102 */                                   OOi001oo1OOI oOi001oo1OOI6 = oOi001oo1OOI.I00o0iI0io1;
/* 104 */                                   oOi001oo1OOI6.getClass();
/* 107 */                                   oOOoooII0010o = OOi001oo1OOI.I0010o(oOi001oo1OOI6);
                                        }
/* 115 */                               OOi001oo1OOI oOi001oo1OOI7 = (OOi001oo1OOI) iOOOIOiO0io1.I000II(o0II0llIl, il1lll0iI);
/* 117 */                               oOi001oo1OOI.I00o0iI0io1 = oOi001oo1OOI7;
/* 119 */                               if (oOOoooII0010o != null) {
/* 121 */                                   oOOoooII0010o.I000OOo1O(oOi001oo1OOI7);
/* 128 */                                   oOi001oo1OOI.I00o0iI0io1 = oOOoooII0010o.I000II();
                                        }
                                        oOi001oo1OOI.I00iiO |= Barcode.FORMAT_UPC_E;
                                    case 112:
                                        oOi001oo1OOI.I00iiO |= Barcode.FORMAT_PDF417;
/* 92 */                                oOi001oo1OOI.I00o0l1o1o0 = iOOOIOiO0io1.I000iOII();
                                    case 802:
/* 59 */                                if ((i & 16384) != 16384) {
/* 66 */                                    oOi001oo1OOI.I00oI0i = new ArrayList();
/* 68 */                                    i |= 16384;
                                        }
/* 78 */                                oOi001oo1OOI.I00oI0i.add(iOOOIOiO0io1.I000II(OOOi000ooO.I00ioIO, il1lll0iI));
                                    default:
/* 40 */                                I000oI1ioi = oOi001oo1OOI.I000oI1ioi(iOOOIOiO0io1, i1I1OO00o1oI00111O, il1lll0iI, iI000o00OoI0I);
/* 44 */                                if (I000oI1ioi == 0) {
/* 46 */                                    z = true;
                                        }
                                }
                            } catch (O001110li e) {
/* 390 */                       e.I00iOIl = oOi001oo1OOI;
/* 392 */                       throw e;
                            } catch (IOException e2) {
/* 384 */                       O001110li o001110li = new O001110li(e2.getMessage());
/* 387 */                       o001110li.I00iOIl = oOi001oo1OOI;
/* 389 */                       throw o001110li;
                            }
                        } catch (Throwable th2) {
/* 395 */                   if ((i & 1) == 1) {
/* 403 */                       oOi001oo1OOI.I00iio = Collections.unmodifiableList(oOi001oo1OOI.I00iio);
                            }
/* 407 */                   if ((i & 16384) == I000oI1ioi) {
/* 415 */                       oOi001oo1OOI.I00oI0i = Collections.unmodifiableList(oOi001oo1OOI.I00oI0i);
                            }
                            try {
/* 417 */                       i1I1OO00o1oI00111O.I001iOo1i0O();
                            } catch (IOException unused2) {
                            } catch (Throwable th3) {
/* 432 */                       oOi001oo1OOI.I00iiI = iIOI0o10I000lI.I000II();
/* 434 */                       throw th3;
                            }
/* 424 */                   oOi001oo1OOI.I00iiI = iIOI0o10I000lI.I000II();
/* 435 */                   oOi001oo1OOI.I000lI();
/* 438 */                   throw th2;
                        }
                    }
                }

                private final Object I001IIilI0O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 3 */             OOOooIOl oOOooIOl = new OOOooIOl();
/* 7 */             oOOooIOl.I00ilO0 = (byte) -1;
/* 9 */             oOOooIOl.I00io1l = -1;
/* 11 */            OOOoil1l010 oOOoil1l010 = OOOoil1l010.INV;
/* 13 */            oOOooIOl.I00iiO = oOOoil1l010;
/* 17 */            oOOooIOl.I00iio = OOi001oo1OOI.I00oO101o;
/* 19 */            boolean z = false;
/* 20 */            oOOooIOl.I00ilI0I1 = 0;
/* 22 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 27 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 31 */            while (!z) {
                        try {
                            try {
/* 33 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 37 */                        if (iI000o00OoI0I != 0) {
/* 41 */                            OOOoooI oOOoooII0010o = null;
/* 41 */                            OOOoil1l010 oOOoil1l0102 = null;
/* 43 */                            if (iI000o00OoI0I == 8) {
/* 123 */                               int iI000iOII = iOOOIOiO0io1.I000iOII();
/* 127 */                               if (iI000iOII == 0) {
/* 145 */                                   oOOoil1l0102 = OOOoil1l010.IN;
                                        } else if (iI000iOII == 1) {
/* 142 */                                   oOOoil1l0102 = OOOoil1l010.OUT;
                                        } else if (iI000iOII == 2) {
/* 140 */                                   oOOoil1l0102 = oOOoil1l010;
                                        } else if (iI000iOII == 3) {
/* 137 */                                   oOOoil1l0102 = OOOoil1l010.STAR;
                                        }
/* 147 */                               if (oOOoil1l0102 == null) {
/* 149 */                                   i1I1OO00o1oI00111O.I00Io1lO(iI000o00OoI0I);
/* 152 */                                   i1I1OO00o1oI00111O.I00Io1lO(iI000iOII);
                                        } else {
                                            oOOooIOl.I00iiI |= 1;
/* 161 */                                   oOOooIOl.I00iiO = oOOoil1l0102;
                                        }
                                    } else if (iI000o00OoI0I == 18) {
/* 85 */                                if ((oOOooIOl.I00iiI & 2) == 2) {
/* 87 */                                    OOi001oo1OOI oOi001oo1OOI = oOOooIOl.I00iio;
/* 89 */                                    oOi001oo1OOI.getClass();
/* 92 */                                    oOOoooII0010o = OOi001oo1OOI.I0010o(oOi001oo1OOI);
                                        }
/* 102 */                               OOi001oo1OOI oOi001oo1OOI2 = (OOi001oo1OOI) iOOOIOiO0io1.I000II(OOi001oo1OOI.I00oOio10iI1, il1lll0iI);
/* 104 */                               oOOooIOl.I00iio = oOi001oo1OOI2;
/* 106 */                               if (oOOoooII0010o != null) {
/* 108 */                                   oOOoooII0010o.I000OOo1O(oOi001oo1OOI2);
/* 115 */                                   oOOooIOl.I00iio = oOOoooII0010o.I000II();
                                        }
                                        oOOooIOl.I00iiI |= 2;
                                    } else if (iI000o00OoI0I == 24) {
                                        oOOooIOl.I00iiI |= 4;
/* 79 */                                oOOooIOl.I00ilI0I1 = iOOOIOiO0io1.I000iOII();
                                    } else if (!iOOOIOiO0io1.I00100o1O0lo(iI000o00OoI0I, i1I1OO00o1oI00111O)) {
                                    }
                                }
/* 59 */                        z = true;
                            } catch (Throwable th) {
                                try {
/* 180 */                           i1I1OO00o1oI00111O.I001iOo1i0O();
                                } catch (IOException unused) {
                                } catch (Throwable th2) {
/* 195 */                           oOOooIOl.I00iOIl = iIOI0o10I000lI.I000II();
/* 197 */                           throw th2;
                                }
/* 187 */                       oOOooIOl.I00iOIl = iIOI0o10I000lI.I000II();
/* 198 */                       throw th;
                            }
                        } catch (O001110li e) {
/* 177 */                   e.I00iOIl = oOOooIOl;
/* 179 */                   throw e;
                        } catch (IOException e2) {
/* 171 */                   O001110li o001110li = new O001110li(e2.getMessage());
/* 174 */                   o001110li.I00iOIl = oOOooIOl;
/* 176 */                   throw o001110li;
                        }
                    }
                    try {
/* 199 */               i1I1OO00o1oI00111O.I001iOo1i0O();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
/* 214 */               oOOooIOl.I00iOIl = iIOI0o10I000lI.I000II();
/* 551 */               throw th3;
                    }
/* 206 */           oOOooIOl.I00iOIl = iIOI0o10I000lI.I000II();
/* 208 */           return oOOooIOl;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r5v0 */
                /* JADX WARN: Type inference failed for: r5v1 */
                /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
                private final Object I001IO000(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 3 */             OOi0IOIIOO oOi0IOIIOO = new OOi0IOIIOO();
/* 7 */             oOi0IOIIOO.I00lll10 = (byte) -1;
/* 9 */             oOi0IOIIOO.I00o0iI0io1 = -1;
/* 12 */            oOi0IOIIOO.I00iio = 6;
/* 14 */            boolean z = false;
/* 15 */            oOi0IOIIOO.I00ilI0I1 = 0;
/* 17 */            List list = Collections.EMPTY_LIST;
/* 19 */            oOi0IOIIOO.I00ilO0 = list;
/* 21 */            OOi001oo1OOI oOi001oo1OOI = OOi001oo1OOI.I00oO101o;
/* 23 */            oOi0IOIIOO.I00io1l = oOi001oo1OOI;
/* 25 */            oOi0IOIIOO.I00ioIO = 0;
/* 27 */            oOi0IOIIOO.I00l0I0l0lO1 = oOi001oo1OOI;
/* 29 */            oOi0IOIIOO.I00l0OO0IO = 0;
/* 31 */            oOi0IOIIOO.I00li1OI = list;
/* 33 */            oOi0IOIIOO.I00ll1 = list;
/* 35 */            oOi0IOIIOO.I00lli11 = list;
/* 37 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 42 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 46 */            int i = 0;
                    while (true) {
/* 47 */                ?? I000oI1ioi = 128;
/* 54 */                if (z) {
/* 465 */                   if ((i & 4) == 4) {
/* 473 */                       oOi0IOIIOO.I00ilO0 = Collections.unmodifiableList(oOi0IOIIOO.I00ilO0);
                            }
/* 477 */                   if ((i & Barcode.FORMAT_ITF) == 128) {
/* 485 */                       oOi0IOIIOO.I00li1OI = Collections.unmodifiableList(oOi0IOIIOO.I00li1OI);
                            }
/* 489 */                   if ((i & Barcode.FORMAT_QR_CODE) == 256) {
/* 497 */                       oOi0IOIIOO.I00ll1 = Collections.unmodifiableList(oOi0IOIIOO.I00ll1);
                            }
/* 501 */                   if ((i & Barcode.FORMAT_UPC_A) == 512) {
/* 509 */                       oOi0IOIIOO.I00lli11 = Collections.unmodifiableList(oOi0IOIIOO.I00lli11);
                            }
                            try {
/* 511 */                       i1I1OO00o1oI00111O.I001iOo1i0O();
                            } catch (IOException unused) {
                            } catch (Throwable th) {
/* 526 */                       oOi0IOIIOO.I00iiI = iIOI0o10I000lI.I000II();
/* 528 */                       throw th;
                            }
/* 518 */                   oOi0IOIIOO.I00iiI = iIOI0o10I000lI.I000II();
/* 529 */                   oOi0IOIIOO.I000lI();
/* 532 */                   return oOi0IOIIOO;
                        }
                        try {
                            try {
/* 56 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 60 */                        OOOoooI oOOoooII0010o = null;
                                switch (iI000o00OoI0I) {
                                    case 0:
/* 70 */                                z = true;
                                    case 8:
                                        oOi0IOIIOO.I00iiO |= 1;
/* 374 */                               oOi0IOIIOO.I00iio = iOOOIOiO0io1.I000iOII();
                                    case 16:
                                        oOi0IOIIOO.I00iiO |= 2;
/* 361 */                               oOi0IOIIOO.I00ilI0I1 = iOOOIOiO0io1.I000iOII();
                                    case PoseLandmark.RIGHT_KNEE:
/* 327 */                               if ((i & 4) != 4) {
/* 334 */                                   oOi0IOIIOO.I00ilO0 = new ArrayList();
/* 336 */                                   i |= 4;
                                        }
/* 346 */                               oOi0IOIIOO.I00ilO0.add(iOOOIOiO0io1.I000II(OOi0O1i1lOi.I00o0iI0io1, il1lll0iI));
                                    case 34:
/* 286 */                               if ((oOi0IOIIOO.I00iiO & 4) == 4) {
/* 288 */                                   OOi001oo1OOI oOi001oo1OOI2 = oOi0IOIIOO.I00io1l;
/* 290 */                                   oOi001oo1OOI2.getClass();
/* 293 */                                   oOOoooII0010o = OOi001oo1OOI.I0010o(oOi001oo1OOI2);
                                        }
/* 303 */                               OOi001oo1OOI oOi001oo1OOI3 = (OOi001oo1OOI) iOOOIOiO0io1.I000II(OOi001oo1OOI.I00oOio10iI1, il1lll0iI);
/* 305 */                               oOi0IOIIOO.I00io1l = oOi001oo1OOI3;
/* 307 */                               if (oOOoooII0010o != null) {
/* 309 */                                   oOOoooII0010o.I000OOo1O(oOi001oo1OOI3);
/* 316 */                                   oOi0IOIIOO.I00io1l = oOOoooII0010o.I000II();
                                        }
                                        oOi0IOIIOO.I00iiO |= 4;
                                    case 40:
                                        oOi0IOIIOO.I00iiO |= 8;
/* 279 */                               oOi0IOIIOO.I00ioIO = iOOOIOiO0io1.I000iOII();
                                    case 50:
/* 230 */                               if ((oOi0IOIIOO.I00iiO & 16) == 16) {
/* 232 */                                   OOi001oo1OOI oOi001oo1OOI4 = oOi0IOIIOO.I00l0I0l0lO1;
/* 234 */                                   oOi001oo1OOI4.getClass();
/* 237 */                                   oOOoooII0010o = OOi001oo1OOI.I0010o(oOi001oo1OOI4);
                                        }
/* 247 */                               OOi001oo1OOI oOi001oo1OOI5 = (OOi001oo1OOI) iOOOIOiO0io1.I000II(OOi001oo1OOI.I00oOio10iI1, il1lll0iI);
/* 249 */                               oOi0IOIIOO.I00l0I0l0lO1 = oOi001oo1OOI5;
/* 251 */                               if (oOOoooII0010o != null) {
/* 253 */                                   oOOoooII0010o.I000OOo1O(oOi001oo1OOI5);
/* 260 */                                   oOi0IOIIOO.I00l0I0l0lO1 = oOOoooII0010o.I000II();
                                        }
                                        oOi0IOIIOO.I00iiO |= 16;
                                    case 56:
                                        oOi0IOIIOO.I00iiO |= 32;
/* 221 */                               oOi0IOIIOO.I00l0OO0IO = iOOOIOiO0io1.I000iOII();
                                    case 66:
/* 187 */                               if ((i & Barcode.FORMAT_ITF) != 128) {
/* 194 */                                   oOi0IOIIOO.I00li1OI = new ArrayList();
/* 196 */                                   i |= Barcode.FORMAT_ITF;
                                        }
/* 206 */                               oOi0IOIIOO.I00li1OI.add(iOOOIOiO0io1.I000II(OOOi000ooO.I00ioIO, il1lll0iI));
                                    case 248:
/* 159 */                               if ((i & Barcode.FORMAT_QR_CODE) != 256) {
/* 166 */                                   oOi0IOIIOO.I00ll1 = new ArrayList();
/* 168 */                                   i |= Barcode.FORMAT_QR_CODE;
                                        }
/* 180 */                               oOi0IOIIOO.I00ll1.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
                                    case 250:
/* 110 */                               int iI0000oI00 = iOOOIOiO0io1.I0000oI00(iOOOIOiO0io1.I000iOII());
/* 116 */                               if ((i & Barcode.FORMAT_QR_CODE) != 256 && iOOOIOiO0io1.I0000Il00O() > 0) {
/* 129 */                                   oOi0IOIIOO.I00ll1 = new ArrayList();
/* 131 */                                   i |= Barcode.FORMAT_QR_CODE;
                                        }
/* 137 */                               while (iOOOIOiO0io1.I0000Il00O() > 0) {
/* 149 */                                   oOi0IOIIOO.I00ll1.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
                                        }
/* 153 */                               iOOOIOiO0io1.I0000O(iI0000oI00);
                                        break;
                                    case 258:
/* 83 */                                if ((i & Barcode.FORMAT_UPC_A) != 512) {
/* 90 */                                    oOi0IOIIOO.I00lli11 = new ArrayList();
/* 92 */                                    i |= Barcode.FORMAT_UPC_A;
                                        }
/* 102 */                               oOi0IOIIOO.I00lli11.add(iOOOIOiO0io1.I000II(OOOi1IIOOO01.I00ioIO, il1lll0iI));
                                    default:
/* 64 */                                I000oI1ioi = oOi0IOIIOO.I000oI1ioi(iOOOIOiO0io1, i1I1OO00o1oI00111O, il1lll0iI, iI000o00OoI0I);
/* 68 */                                if (I000oI1ioi == 0) {
/* 70 */                                    z = true;
                                        }
                                }
                            } catch (O001110li e) {
/* 390 */                       e.I00iOIl = oOi0IOIIOO;
/* 392 */                       throw e;
                            } catch (IOException e2) {
/* 384 */                       O001110li o001110li = new O001110li(e2.getMessage());
/* 387 */                       o001110li.I00iOIl = oOi0IOIIOO;
/* 389 */                       throw o001110li;
                            }
                        } catch (Throwable th2) {
/* 395 */                   if ((i & 4) == 4) {
/* 403 */                       oOi0IOIIOO.I00ilO0 = Collections.unmodifiableList(oOi0IOIIOO.I00ilO0);
                            }
/* 407 */                   if ((i & Barcode.FORMAT_ITF) == I000oI1ioi) {
/* 415 */                       oOi0IOIIOO.I00li1OI = Collections.unmodifiableList(oOi0IOIIOO.I00li1OI);
                            }
/* 419 */                   if ((i & Barcode.FORMAT_QR_CODE) == 256) {
/* 427 */                       oOi0IOIIOO.I00ll1 = Collections.unmodifiableList(oOi0IOIIOO.I00ll1);
                            }
/* 431 */                   if ((i & Barcode.FORMAT_UPC_A) == 512) {
/* 439 */                       oOi0IOIIOO.I00lli11 = Collections.unmodifiableList(oOi0IOIIOO.I00lli11);
                            }
                            try {
/* 441 */                       i1I1OO00o1oI00111O.I001iOo1i0O();
                            } catch (IOException unused2) {
                            } catch (Throwable th3) {
/* 456 */                       oOi0IOIIOO.I00iiI = iIOI0o10I000lI.I000II();
/* 458 */                       throw th3;
                            }
/* 448 */                   oOi0IOIIOO.I00iiI = iIOI0o10I000lI.I000II();
/* 459 */                   oOi0IOIIOO.I000lI();
/* 462 */                   throw th2;
                        }
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private final Object I001i1O0Ol(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 7 */             OOi0O1i1lOi oOi0O1i1lOi = new OOi0O1i1lOi();
/* 11 */            oOi0O1i1lOi.I00l0OO0IO = -1;
/* 13 */            oOi0O1i1lOi.I00ll1 = (byte) -1;
/* 15 */            oOi0O1i1lOi.I00lli11 = -1;
/* 18 */            oOi0O1i1lOi.I00iio = 0;
/* 20 */            oOi0O1i1lOi.I00ilI0I1 = 0;
/* 22 */            oOi0O1i1lOi.I00ilO0 = false;
/* 24 */            OOi0Illolii oOi0Illolii = OOi0Illolii.INV;
/* 26 */            oOi0O1i1lOi.I00io1l = oOi0Illolii;
/* 28 */            List list = Collections.EMPTY_LIST;
/* 30 */            oOi0O1i1lOi.I00ioIO = list;
/* 32 */            oOi0O1i1lOi.I00l0I0l0lO1 = list;
/* 34 */            oOi0O1i1lOi.I00li1OI = list;
/* 36 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 41 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 45 */            boolean z = false;
/* 46 */            int i = 0;
/* 53 */            while (!z) {
                        try {
                            try {
/* 55 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 59 */                        if (iI000o00OoI0I == 0) {
/* 96 */                            z = true;
                                } else if (iI000o00OoI0I == 8) {
                                    oOi0O1i1lOi.I00iiO |= 1;
/* 318 */                           oOi0O1i1lOi.I00iio = iOOOIOiO0io1.I000iOII();
                                } else if (iI000o00OoI0I == 16) {
                                    oOi0O1i1lOi.I00iiO |= 2;
/* 306 */                           oOi0O1i1lOi.I00ilI0I1 = iOOOIOiO0io1.I000iOII();
                                } else if (iI000o00OoI0I == 24) {
                                    oOi0O1i1lOi.I00iiO |= 4;
/* 294 */                           oOi0O1i1lOi.I00ilO0 = iOOOIOiO0io1.I000l1() != 0;
                                } else if (iI000o00OoI0I == 32) {
/* 239 */                           int iI000iOII = iOOOIOiO0io1.I000iOII();
/* 256 */                           OOi0Illolii oOi0Illolii2 = iI000iOII != 0 ? iI000iOII != 1 ? iI000iOII != 2 ? null : oOi0Illolii : OOi0Illolii.OUT : OOi0Illolii.IN;
/* 258 */                           if (oOi0Illolii2 == null) {
/* 260 */                               i1I1OO00o1oI00111O.I00Io1lO(iI000o00OoI0I);
/* 263 */                               i1I1OO00o1oI00111O.I00Io1lO(iI000iOII);
                                    } else {
                                        oOi0O1i1lOi.I00iiO |= 8;
/* 272 */                               oOi0O1i1lOi.I00io1l = oOi0Illolii2;
                                    }
                                } else if (iI000o00OoI0I == 42) {
/* 216 */                           if ((i & 16) != 16) {
/* 223 */                               oOi0O1i1lOi.I00ioIO = new ArrayList();
/* 225 */                               i |= 16;
                                    }
/* 235 */                           oOi0O1i1lOi.I00ioIO.add(iOOOIOiO0io1.I000II(OOi001oo1OOI.I00oOio10iI1, il1lll0iI));
                                } else if (iI000o00OoI0I == 48) {
/* 188 */                           if ((i & 32) != 32) {
/* 195 */                               oOi0O1i1lOi.I00l0I0l0lO1 = new ArrayList();
/* 197 */                               i |= 32;
                                    }
/* 209 */                           oOi0O1i1lOi.I00l0I0l0lO1.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
                                } else if (iI000o00OoI0I == 50) {
/* 138 */                           int iI0000oI00 = iOOOIOiO0io1.I0000oI00(iOOOIOiO0io1.I000iOII());
/* 144 */                           if ((i & 32) != 32 && iOOOIOiO0io1.I0000Il00O() > 0) {
/* 157 */                               oOi0O1i1lOi.I00l0I0l0lO1 = new ArrayList();
/* 159 */                               i |= 32;
                                    }
/* 165 */                           while (iOOOIOiO0io1.I0000Il00O() > 0) {
/* 177 */                               oOi0O1i1lOi.I00l0I0l0lO1.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
                                    }
/* 181 */                           iOOOIOiO0io1.I0000O(iI0000oI00);
                                } else if (iI000o00OoI0I == 802) {
/* 110 */                           if ((i & 64) != 64) {
/* 117 */                               oOi0O1i1lOi.I00li1OI = new ArrayList();
/* 119 */                               i |= 64;
                                    }
/* 129 */                           oOi0O1i1lOi.I00li1OI.add(iOOOIOiO0io1.I000II(OOOi000ooO.I00ioIO, il1lll0iI));
                                } else if (!oOi0O1i1lOi.I000oI1ioi(iOOOIOiO0io1, i1I1OO00o1oI00111O, il1lll0iI, iI000o00OoI0I)) {
                                }
                            } catch (O001110li e) {
/* 335 */                       e.I00iOIl = oOi0O1i1lOi;
/* 337 */                       throw e;
                            } catch (IOException e2) {
/* 329 */                       O001110li o001110li = new O001110li(e2.getMessage());
/* 332 */                       o001110li.I00iOIl = oOi0O1i1lOi;
/* 334 */                       throw o001110li;
                            }
                        } catch (Throwable th) {
/* 340 */                   if ((i & 16) == 16) {
/* 348 */                       oOi0O1i1lOi.I00ioIO = Collections.unmodifiableList(oOi0O1i1lOi.I00ioIO);
                            }
/* 352 */                   if ((i & 32) == 32) {
/* 360 */                       oOi0O1i1lOi.I00l0I0l0lO1 = Collections.unmodifiableList(oOi0O1i1lOi.I00l0I0l0lO1);
                            }
/* 364 */                   if ((i & 64) == 64) {
/* 372 */                       oOi0O1i1lOi.I00li1OI = Collections.unmodifiableList(oOi0O1i1lOi.I00li1OI);
                            }
                            try {
/* 374 */                       i1I1OO00o1oI00111O.I001iOo1i0O();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
/* 389 */                       oOi0O1i1lOi.I00iiI = iIOI0o10I000lI.I000II();
/* 391 */                       throw th2;
                            }
/* 381 */                   oOi0O1i1lOi.I00iiI = iIOI0o10I000lI.I000II();
/* 392 */                   oOi0O1i1lOi.I000lI();
/* 395 */                   throw th;
                        }
                    }
/* 398 */           if ((i & 16) == 16) {
/* 406 */               oOi0O1i1lOi.I00ioIO = Collections.unmodifiableList(oOi0O1i1lOi.I00ioIO);
                    }
/* 410 */           if ((i & 32) == 32) {
/* 418 */               oOi0O1i1lOi.I00l0I0l0lO1 = Collections.unmodifiableList(oOi0O1i1lOi.I00l0I0l0lO1);
                    }
/* 422 */           if ((i & 64) == 64) {
/* 430 */               oOi0O1i1lOi.I00li1OI = Collections.unmodifiableList(oOi0O1i1lOi.I00li1OI);
                    }
                    try {
/* 432 */               i1I1OO00o1oI00111O.I001iOo1i0O();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
/* 447 */               oOi0O1i1lOi.I00iiI = iIOI0o10I000lI.I000II();
/* 449 */               throw th3;
                    }
/* 439 */           oOi0O1i1lOi.I00iiI = iIOI0o10I000lI.I000II();
/* 450 */           oOi0O1i1lOi.I000lI();
/* 551 */           return oOi0O1i1lOi;
                }

                private final Object I001i1lo1io(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 3 */             OOi0i0OO0lol oOi0i0OO0lol = new OOi0i0OO0lol();
/* 7 */             oOi0i0OO0lol.I00ilI0I1 = (byte) -1;
/* 9 */             oOi0i0OO0lol.I00ilO0 = -1;
/* 13 */            oOi0i0OO0lol.I00iiO = Collections.EMPTY_LIST;
/* 15 */            oOi0i0OO0lol.I00iio = -1;
/* 17 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 22 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 26 */            boolean z = false;
/* 27 */            boolean z2 = false;
/* 28 */            while (!z) {
                        try {
                            try {
/* 30 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 34 */                        if (iI000o00OoI0I != 0) {
/* 38 */                            if (iI000o00OoI0I == 10) {
/* 70 */                                if (!z2) {
/* 77 */                                    oOi0i0OO0lol.I00iiO = new ArrayList();
/* 79 */                                    z2 = true;
                                        }
/* 88 */                                oOi0i0OO0lol.I00iiO.add(iOOOIOiO0io1.I000II(OOi001oo1OOI.I00oOio10iI1, il1lll0iI));
                                    } else if (iI000o00OoI0I == 16) {
                                        oOi0i0OO0lol.I00iiI |= 1;
/* 67 */                                oOi0i0OO0lol.I00iio = iOOOIOiO0io1.I000iOII();
                                    } else if (!iOOOIOiO0io1.I00100o1O0lo(iI000o00OoI0I, i1I1OO00o1oI00111O)) {
                                    }
                                }
/* 50 */                        z = true;
                            } catch (O001110li e) {
/* 104 */                       e.I00iOIl = oOi0i0OO0lol;
/* 106 */                       throw e;
                            } catch (IOException e2) {
/* 98 */                        O001110li o001110li = new O001110li(e2.getMessage());
/* 101 */                       o001110li.I00iOIl = oOi0i0OO0lol;
/* 103 */                       throw o001110li;
                            }
                        } catch (Throwable th) {
/* 107 */                   if (z2) {
/* 115 */                       oOi0i0OO0lol.I00iiO = Collections.unmodifiableList(oOi0i0OO0lol.I00iiO);
                            }
                            try {
/* 117 */                       i1I1OO00o1oI00111O.I001iOo1i0O();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
/* 132 */                       oOi0i0OO0lol.I00iOIl = iIOI0o10I000lI.I000II();
/* 134 */                       throw th2;
                            }
/* 124 */                   oOi0i0OO0lol.I00iOIl = iIOI0o10I000lI.I000II();
/* 135 */                   throw th;
                        }
                    }
/* 136 */           if (z2) {
/* 144 */               oOi0i0OO0lol.I00iiO = Collections.unmodifiableList(oOi0i0OO0lol.I00iiO);
                    }
                    try {
/* 146 */               i1I1OO00o1oI00111O.I001iOo1i0O();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
/* 161 */               oOi0i0OO0lol.I00iOIl = iIOI0o10I000lI.I000II();
/* 551 */               throw th3;
                    }
/* 153 */           oOi0i0OO0lol.I00iOIl = iIOI0o10I000lI.I000II();
/* 155 */           return oOi0i0OO0lol;
                }

                private final Object I001iOo1i0O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 3 */             OOi0iiO0iOi oOi0iiO0iOi = new OOi0iiO0iOi();
/* 7 */             oOi0iiO0iOi.I00ll1 = (byte) -1;
/* 9 */             oOi0iiO0iOi.I00lli11 = -1;
/* 11 */            boolean z = false;
/* 12 */            oOi0iiO0iOi.I00iio = 0;
/* 14 */            oOi0iiO0iOi.I00ilI0I1 = 0;
/* 16 */            OOi001oo1OOI oOi001oo1OOI = OOi001oo1OOI.I00oO101o;
/* 18 */            oOi0iiO0iOi.I00ilO0 = oOi001oo1OOI;
/* 20 */            oOi0iiO0iOi.I00io1l = 0;
/* 22 */            oOi0iiO0iOi.I00ioIO = oOi001oo1OOI;
/* 24 */            oOi0iiO0iOi.I00l0I0l0lO1 = 0;
/* 28 */            oOi0iiO0iOi.I00l0OO0IO = Collections.EMPTY_LIST;
/* 32 */            oOi0iiO0iOi.I00li1OI = OOOOlIoIlOi.I00o0l1o1o0;
/* 34 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 39 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 43 */            char c = 0;
/* 46 */            while (!z) {
                        try {
                            try {
/* 48 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 52 */                        if (iI000o00OoI0I != 0) {
/* 56 */                            if (iI000o00OoI0I == 8) {
                                        oOi0iiO0iOi.I00iiO |= 1;
/* 307 */                               oOi0iiO0iOi.I00iio = iOOOIOiO0io1.I000iOII();
                                    } else if (iI000o00OoI0I != 16) {
/* 64 */                                OOOOi0ooOlOo oOOOi0ooOlOoI000II = null;
/* 64 */                                OOOoooI oOOoooII0010o = null;
/* 64 */                                OOOoooI oOOoooII0010o2 = null;
/* 65 */                                if (iI000o00OoI0I == 26) {
/* 245 */                                   if ((oOi0iiO0iOi.I00iiO & 4) == 4) {
/* 247 */                                       OOi001oo1OOI oOi001oo1OOI2 = oOi0iiO0iOi.I00ilO0;
/* 249 */                                       oOi001oo1OOI2.getClass();
/* 252 */                                       oOOoooII0010o = OOi001oo1OOI.I0010o(oOi001oo1OOI2);
                                            }
/* 262 */                                   OOi001oo1OOI oOi001oo1OOI3 = (OOi001oo1OOI) iOOOIOiO0io1.I000II(OOi001oo1OOI.I00oOio10iI1, il1lll0iI);
/* 264 */                                   oOi0iiO0iOi.I00ilO0 = oOi001oo1OOI3;
/* 266 */                                   if (oOOoooII0010o != null) {
/* 268 */                                       oOOoooII0010o.I000OOo1O(oOi001oo1OOI3);
/* 275 */                                       oOi0iiO0iOi.I00ilO0 = oOOoooII0010o.I000II();
                                            }
                                            oOi0iiO0iOi.I00iiO |= 4;
                                        } else if (iI000o00OoI0I == 34) {
/* 202 */                                   if ((oOi0iiO0iOi.I00iiO & 16) == 16) {
/* 204 */                                       OOi001oo1OOI oOi001oo1OOI4 = oOi0iiO0iOi.I00ioIO;
/* 206 */                                       oOi001oo1OOI4.getClass();
/* 209 */                                       oOOoooII0010o2 = OOi001oo1OOI.I0010o(oOi001oo1OOI4);
                                            }
/* 219 */                                   OOi001oo1OOI oOi001oo1OOI5 = (OOi001oo1OOI) iOOOIOiO0io1.I000II(OOi001oo1OOI.I00oOio10iI1, il1lll0iI);
/* 221 */                                   oOi0iiO0iOi.I00ioIO = oOi001oo1OOI5;
/* 223 */                                   if (oOOoooII0010o2 != null) {
/* 225 */                                       oOOoooII0010o2.I000OOo1O(oOi001oo1OOI5);
/* 232 */                                       oOi0iiO0iOi.I00ioIO = oOOoooII0010o2.I000II();
                                            }
                                            oOi0iiO0iOi.I00iiO |= 16;
                                        } else if (iI000o00OoI0I == 40) {
                                            oOi0iiO0iOi.I00iiO |= 8;
/* 195 */                                   oOi0iiO0iOi.I00io1l = iOOOIOiO0io1.I000iOII();
                                        } else if (iI000o00OoI0I == 48) {
                                            oOi0iiO0iOi.I00iiO |= 32;
/* 182 */                                   oOi0iiO0iOi.I00l0I0l0lO1 = iOOOIOiO0io1.I000iOII();
                                        } else if (iI000o00OoI0I == 58) {
/* 148 */                                   int i = (c == true ? 1 : 0) & '@';
                                            c = c;
/* 150 */                                   if (i != 64) {
/* 157 */                                       oOi0iiO0iOi.I00l0OO0IO = new ArrayList();
/* 159 */                                       c = '@';
                                            }
/* 168 */                                   oOi0iiO0iOi.I00l0OO0IO.add(iOOOIOiO0io1.I000II(OOOi000ooO.I00ioIO, il1lll0iI));
                                        } else if (iI000o00OoI0I == 66) {
/* 107 */                                   if ((oOi0iiO0iOi.I00iiO & 64) == 64) {
/* 109 */                                       OOOOlIoIlOi oOOOlIoIlOi = oOi0iiO0iOi.I00li1OI;
/* 111 */                                       oOOOlIoIlOi.getClass();
/* 114 */                                       oOOOi0ooOlOoI000II = OOOOi0ooOlOo.I000II();
/* 118 */                                       oOOOi0ooOlOoI000II.I000O01llI0(oOOOlIoIlOi);
                                            }
/* 127 */                                   OOOOlIoIlOi oOOOlIoIlOi2 = (OOOOlIoIlOi) iOOOIOiO0io1.I000II(OOOOlIoIlOi.I00o101lO, il1lll0iI);
/* 129 */                                   oOi0iiO0iOi.I00li1OI = oOOOlIoIlOi2;
/* 131 */                                   if (oOOOi0ooOlOoI000II != null) {
/* 133 */                                       oOOOi0ooOlOoI000II.I000O01llI0(oOOOlIoIlOi2);
/* 140 */                                       oOi0iiO0iOi.I00li1OI = oOOOi0ooOlOoI000II.I0001Ioi1lo();
                                            }
                                            oOi0iiO0iOi.I00iiO |= 64;
                                        } else if (!oOi0iiO0iOi.I000oI1ioi(iOOOIOiO0io1, i1I1OO00o1oI00111O, il1lll0iI, iI000o00OoI0I)) {
                                        }
                                    } else {
                                        oOi0iiO0iOi.I00iiO |= 2;
/* 294 */                               oOi0iiO0iOi.I00ilI0I1 = iOOOIOiO0io1.I000iOII();
                                    }
                                }
/* 93 */                        z = true;
                            } catch (O001110li e) {
/* 323 */                       e.I00iOIl = oOi0iiO0iOi;
/* 325 */                       throw e;
                            } catch (IOException e2) {
/* 317 */                       O001110li o001110li = new O001110li(e2.getMessage());
/* 320 */                       o001110li.I00iOIl = oOi0iiO0iOi;
/* 322 */                       throw o001110li;
                            }
                        } catch (Throwable th) {
/* 328 */                   if (((c == true ? 1 : 0) & '@') == 64) {
/* 336 */                       oOi0iiO0iOi.I00l0OO0IO = Collections.unmodifiableList(oOi0iiO0iOi.I00l0OO0IO);
                            }
                            try {
/* 338 */                       i1I1OO00o1oI00111O.I001iOo1i0O();
                            } catch (IOException unused) {
                            } catch (Throwable th2) {
/* 353 */                       oOi0iiO0iOi.I00iiI = iIOI0o10I000lI.I000II();
/* 355 */                       throw th2;
                            }
/* 345 */                   oOi0iiO0iOi.I00iiI = iIOI0o10I000lI.I000II();
/* 356 */                   oOi0iiO0iOi.I000lI();
/* 359 */                   throw th;
                        }
                    }
/* 362 */           if (((c == true ? 1 : 0) & '@') == 64) {
/* 370 */               oOi0iiO0iOi.I00l0OO0IO = Collections.unmodifiableList(oOi0iiO0iOi.I00l0OO0IO);
                    }
                    try {
/* 372 */               i1I1OO00o1oI00111O.I001iOo1i0O();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
/* 387 */               oOi0iiO0iOi.I00iiI = iIOI0o10I000lI.I000II();
/* 389 */               throw th3;
                    }
/* 379 */           oOi0iiO0iOi.I00iiI = iIOI0o10I000lI.I000II();
/* 390 */           oOi0iiO0iOi.I000lI();
/* 551 */           return oOi0iiO0iOi;
                }

                private final Object I001l0I00(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 3 */             OOi0lO oOi0lO = new OOi0lO();
/* 7 */             oOi0lO.I00l0I0l0lO1 = (byte) -1;
/* 9 */             oOi0lO.I00l0OO0IO = -1;
/* 11 */            boolean z = false;
/* 12 */            oOi0lO.I00iiO = 0;
/* 14 */            oOi0lO.I00iio = 0;
/* 16 */            OOi0l11Ioi oOi0l11Ioi = OOi0l11Ioi.ERROR;
/* 18 */            oOi0lO.I00ilI0I1 = oOi0l11Ioi;
/* 20 */            oOi0lO.I00ilO0 = 0;
/* 22 */            oOi0lO.I00io1l = 0;
/* 24 */            OOi0l1Oi oOi0l1Oi = OOi0l1Oi.LANGUAGE_VERSION;
/* 26 */            oOi0lO.I00ioIO = oOi0l1Oi;
/* 28 */            IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 33 */            I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 37 */            while (!z) {
                        try {
                            try {
/* 39 */                        int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 43 */                        if (iI000o00OoI0I != 0) {
/* 47 */                            if (iI000o00OoI0I == 8) {
                                        oOi0lO.I00iiI |= 1;
/* 207 */                               oOi0lO.I00iiO = iOOOIOiO0io1.I000iOII();
                                    } else if (iI000o00OoI0I != 16) {
/* 56 */                                OOi0l1Oi oOi0l1Oi2 = null;
/* 56 */                                OOi0l11Ioi oOi0l11Ioi2 = null;
/* 57 */                                if (iI000o00OoI0I == 24) {
/* 147 */                                   int iI000iOII = iOOOIOiO0io1.I000iOII();
/* 151 */                                   if (iI000iOII == 0) {
/* 163 */                                       oOi0l11Ioi2 = OOi0l11Ioi.WARNING;
                                            } else if (iI000iOII == 1) {
/* 161 */                                       oOi0l11Ioi2 = oOi0l11Ioi;
                                            } else if (iI000iOII == 2) {
/* 158 */                                       oOi0l11Ioi2 = OOi0l11Ioi.HIDDEN;
                                            }
/* 165 */                                   if (oOi0l11Ioi2 == null) {
/* 167 */                                       i1I1OO00o1oI00111O.I00Io1lO(iI000o00OoI0I);
/* 170 */                                       i1I1OO00o1oI00111O.I00Io1lO(iI000iOII);
                                            } else {
                                                oOi0lO.I00iiI |= 4;
/* 181 */                                       oOi0lO.I00ilI0I1 = oOi0l11Ioi2;
                                            }
                                        } else if (iI000o00OoI0I == 32) {
                                            oOi0lO.I00iiI |= 8;
/* 144 */                                   oOi0lO.I00ilO0 = iOOOIOiO0io1.I000iOII();
                                        } else if (iI000o00OoI0I == 40) {
                                            oOi0lO.I00iiI |= 16;
/* 132 */                                   oOi0lO.I00io1l = iOOOIOiO0io1.I000iOII();
                                        } else if (iI000o00OoI0I == 48) {
/* 88 */                                    int iI000iOII2 = iOOOIOiO0io1.I000iOII();
/* 92 */                                    if (iI000iOII2 == 0) {
/* 105 */                                       oOi0l1Oi2 = oOi0l1Oi;
                                            } else if (iI000iOII2 == 1) {
/* 102 */                                       oOi0l1Oi2 = OOi0l1Oi.COMPILER_VERSION;
                                            } else if (iI000iOII2 == 2) {
/* 99 */                                        oOi0l1Oi2 = OOi0l1Oi.API_VERSION;
                                            }
/* 106 */                                   if (oOi0l1Oi2 == null) {
/* 108 */                                       i1I1OO00o1oI00111O.I00Io1lO(iI000o00OoI0I);
/* 111 */                                       i1I1OO00o1oI00111O.I00Io1lO(iI000iOII2);
                                            } else {
                                                oOi0lO.I00iiI |= 32;
/* 120 */                                       oOi0lO.I00ioIO = oOi0l1Oi2;
                                            }
                                        } else if (!iOOOIOiO0io1.I00100o1O0lo(iI000o00OoI0I, i1I1OO00o1oI00111O)) {
                                        }
                                    } else {
                                        oOi0lO.I00iiI |= 2;
/* 194 */                               oOi0lO.I00iio = iOOOIOiO0io1.I000iOII();
                                    }
                                }
/* 77 */                        z = true;
                            } catch (Throwable th) {
                                try {
/* 226 */                           i1I1OO00o1oI00111O.I001iOo1i0O();
                                } catch (IOException unused) {
                                } catch (Throwable th2) {
/* 241 */                           oOi0lO.I00iOIl = iIOI0o10I000lI.I000II();
/* 243 */                           throw th2;
                                }
/* 233 */                       oOi0lO.I00iOIl = iIOI0o10I000lI.I000II();
/* 244 */                       throw th;
                            }
                        } catch (O001110li e) {
/* 223 */                   e.I00iOIl = oOi0lO;
/* 225 */                   throw e;
                        } catch (IOException e2) {
/* 217 */                   O001110li o001110li = new O001110li(e2.getMessage());
/* 220 */                   o001110li.I00iOIl = oOi0lO;
/* 222 */                   throw o001110li;
                        }
                    }
                    try {
/* 245 */               i1I1OO00o1oI00111O.I001iOo1i0O();
                    } catch (IOException unused2) {
                    } catch (Throwable th3) {
/* 260 */               oOi0lO.I00iOIl = iIOI0o10I000lI.I000II();
/* 551 */               throw th3;
                    }
/* 252 */           oOi0lO.I00iOIl = iIOI0o10I000lI.I000II();
/* 254 */           return oOi0lO;
                }

                public final I01Ilioliio I00000oIO(ByteArrayInputStream byteArrayInputStream, Il1lll0iI il1lll0iI) throws IOException {
                    I01Ilioliio i01IlioliioI00000oOI;
                    try {
/* 1 */                 int i = byteArrayInputStream.read();
/* 6 */                 if (i == -1) {
/* 8 */                     i01IlioliioI00000oOI = null;
                        } else {
/* 12 */                    if ((i & Barcode.FORMAT_ITF) != 0) {
/* 15 */                        i &= 127;
/* 17 */                        int i2 = 7;
                                while (true) {
/* 20 */                            if (i2 >= 32) {
/* 47 */                                while (i2 < 64) {
/* 49 */                                    int i3 = byteArrayInputStream.read();
/* 53 */                                    if (i3 == -1) {
/* 102 */                                       throw O001110li.I00000oIO();
                                            }
/* 57 */                                    if ((i3 & Barcode.FORMAT_ITF) != 0) {
/* 95 */                                        i2 += 7;
                                            }
                                        }
/* 110 */                               throw new O001110li("CodedInputStream encountered a malformed varint.");
                                    }
/* 22 */                            int i4 = byteArrayInputStream.read();
/* 26 */                            if (i4 == -1) {
/* 44 */                                throw O001110li.I00000oIO();
                                    }
/* 31 */                            i |= (i4 & 127) << i2;
/* 34 */                            if ((i4 & Barcode.FORMAT_ITF) == 0) {
                                        break;
                                    }
/* 37 */                            i2 += 7;
                                }
                            }
/* 64 */                    i01IlioliioI00000oOI = I00000oOI(new I01IiOO(byteArrayInputStream, i), il1lll0iI);
                        }
/* 68 */                if (i01IlioliioI00000oOI == null || i01IlioliioI00000oOI.I00000oOI()) {
/* 94 */                    return i01IlioliioI00000oOI;
                        }
/* 88 */                O001110li o001110li = new O001110li(new IOiIIo1l().getMessage());
/* 91 */                o001110li.I00iOIl = i01IlioliioI00000oOI;
/* 93 */                throw o001110li;
                    } catch (IOException e) {
/* 551 */               throw new O001110li(e.getMessage());
                    }
                }

                public final I01Ilioliio I00000oOI(InputStream inputStream, Il1lll0iI il1lll0iI) throws O001110li {
/* 3 */             IOOOIOiO0io1 iOOOIOiO0io1 = new IOOOIOiO0io1();
/* 9 */             iOOOIOiO0io1.I000O01llI0 = Integer.MAX_VALUE;
/* 15 */            iOOOIOiO0io1.I00000oIO = new byte[Barcode.FORMAT_AZTEC];
/* 18 */            iOOOIOiO0io1.I00000oOI = 0;
/* 20 */            iOOOIOiO0io1.I0000O = 0;
/* 22 */            iOOOIOiO0io1.I000II = 0;
/* 24 */            iOOOIOiO0io1.I0000oI00 = inputStream;
/* 26 */            VarHandle.storeStoreFence();
/* 33 */            I01Ilioliio i01Ilioliio = (I01Ilioliio) I0000Il00O(iOOOIOiO0io1, il1lll0iI);
                    try {
/* 35 */                iOOOIOiO0io1.I00000oIO(0);
/* 38 */                return i01Ilioliio;
                    } catch (O001110li e) {
/* 40 */                e.I00iOIl = i01Ilioliio;
/* 89 */                throw e;
                    }
                }

                public final Object I0000Il00O(IOOOIOiO0io1 iOOOIOiO0io1, Il1lll0iI il1lll0iI) {
/* 14 */            int i = 0;
                    switch (this.I00000oIO) {
                        case 0:
/* 1015 */                  O0II1001o o0II1001o = new O0II1001o();
/* 1018 */                  o0II1001o.I00ilI0I1 = (byte) -1;
/* 1020 */                  o0II1001o.I00ilO0 = -1;
/* 1022 */                  o0II1001o.I00iiO = 0;
/* 1024 */                  o0II1001o.I00iio = 0;
/* 1026 */                  IIOI0o10 iIOI0o10I000lI = IIOII1.I000lI();
/* 1030 */                  I1I1OO00o1o i1I1OO00o1oI00111O = I1I1OO00o1o.I00111O(iIOI0o10I000lI, 1);
/* 1034 */                  while (i == 0) {
                                try {
                                    try {
/* 1036 */                              int iI000o00OoI0I = iOOOIOiO0io1.I000o00OoI0I();
/* 1040 */                              if (iI000o00OoI0I != 0) {
/* 1042 */                                  if (iI000o00OoI0I == 8) {
                                                o0II1001o.I00iiI |= 1;
/* 1081 */                                      o0II1001o.I00iiO = iOOOIOiO0io1.I000iOII();
                                            } else if (iI000o00OoI0I == 16) {
                                                o0II1001o.I00iiI |= 2;
/* 1069 */                                      o0II1001o.I00iio = iOOOIOiO0io1.I000iOII();
                                            } else if (!iOOOIOiO0io1.I00100o1O0lo(iI000o00OoI0I, i1I1OO00o1oI00111O)) {
                                            }
                                        }
/* 1052 */                              i = 1;
                                    } catch (Throwable th) {
                                        try {
/* 1099 */                                  i1I1OO00o1oI00111O.I001iOo1i0O();
                                        } catch (IOException unused) {
                                        } catch (Throwable th2) {
/* 1114 */                                  o0II1001o.I00iOIl = iIOI0o10I000lI.I000II();
/* 1116 */                                  throw th2;
                                        }
/* 1106 */                              o0II1001o.I00iOIl = iIOI0o10I000lI.I000II();
/* 1117 */                              throw th;
                                    }
                                } catch (O001110li e) {
/* 1096 */                          e.I00iOIl = o0II1001o;
/* 1098 */                          throw e;
                                } catch (IOException e2) {
/* 1090 */                          O001110li o001110li = new O001110li(e2.getMessage());
/* 1093 */                          o001110li.I00iOIl = o0II1001o;
/* 1095 */                          throw o001110li;
                                }
                            }
                            try {
/* 1118 */                      i1I1OO00o1oI00111O.I001iOo1i0O();
                            } catch (IOException unused2) {
                            } catch (Throwable th3) {
/* 1133 */                      o0II1001o.I00iOIl = iIOI0o10I000lI.I000II();
/* 1135 */                      throw th3;
                            }
/* 1125 */                  o0II1001o.I00iOIl = iIOI0o10I000lI.I000II();
/* 1136 */                  return o0II1001o;
                        case 1:
/* 891 */                   O0III0iooOOi o0III0iooOOi = new O0III0iooOOi();
/* 894 */                   o0III0iooOOi.I00ilI0I1 = (byte) -1;
/* 896 */                   o0III0iooOOi.I00ilO0 = -1;
/* 898 */                   o0III0iooOOi.I00iiO = 0;
/* 900 */                   o0III0iooOOi.I00iio = 0;
/* 902 */                   IIOI0o10 iIOI0o10I000lI2 = IIOII1.I000lI();
/* 906 */                   I1I1OO00o1o i1I1OO00o1oI00111O2 = I1I1OO00o1o.I00111O(iIOI0o10I000lI2, 1);
/* 910 */                   while (i == 0) {
                                try {
                                    try {
                                        try {
/* 912 */                                   int iI000o00OoI0I2 = iOOOIOiO0io1.I000o00OoI0I();
/* 916 */                                   if (iI000o00OoI0I2 != 0) {
/* 918 */                                       if (iI000o00OoI0I2 == 8) {
                                                    o0III0iooOOi.I00iiI |= 1;
/* 957 */                                           o0III0iooOOi.I00iiO = iOOOIOiO0io1.I000iOII();
                                                } else if (iI000o00OoI0I2 == 16) {
                                                    o0III0iooOOi.I00iiI |= 2;
/* 945 */                                           o0III0iooOOi.I00iio = iOOOIOiO0io1.I000iOII();
                                                } else if (!iOOOIOiO0io1.I00100o1O0lo(iI000o00OoI0I2, i1I1OO00o1oI00111O2)) {
                                                }
                                            }
/* 928 */                                   i = 1;
                                        } catch (Throwable th4) {
                                            try {
/* 975 */                                       i1I1OO00o1oI00111O2.I001iOo1i0O();
                                            } catch (IOException unused3) {
                                            } catch (Throwable th5) {
/* 990 */                                       o0III0iooOOi.I00iOIl = iIOI0o10I000lI2.I000II();
/* 992 */                                       throw th5;
                                            }
/* 982 */                                   o0III0iooOOi.I00iOIl = iIOI0o10I000lI2.I000II();
/* 993 */                                   throw th4;
                                        }
                                    } catch (O001110li e3) {
/* 972 */                               e3.I00iOIl = o0III0iooOOi;
/* 974 */                               throw e3;
                                    }
                                } catch (IOException e4) {
/* 966 */                           O001110li o001110li2 = new O001110li(e4.getMessage());
/* 969 */                           o001110li2.I00iOIl = o0III0iooOOi;
/* 971 */                           throw o001110li2;
                                }
                            }
                            try {
/* 994 */                       i1I1OO00o1oI00111O2.I001iOo1i0O();
                            } catch (IOException unused4) {
                            } catch (Throwable th6) {
/* 1009 */                      o0III0iooOOi.I00iOIl = iIOI0o10I000lI2.I000II();
/* 1011 */                      throw th6;
                            }
/* 1001 */                  o0III0iooOOi.I00iOIl = iIOI0o10I000lI2.I000II();
/* 1012 */                  return o0III0iooOOi;
                        case 2:
/* 551 */                   O0IIO0lO o0IIO0lO = new O0IIO0lO();
/* 554 */                   o0IIO0lO.I00ioIO = (byte) -1;
/* 556 */                   o0IIO0lO.I00l0I0l0lO1 = -1;
/* 560 */                   o0IIO0lO.I00iiO = O0II1001o.I00io1l;
/* 562 */                   O0III0iooOOi o0III0iooOOi2 = O0III0iooOOi.I00io1l;
/* 564 */                   o0IIO0lO.I00iio = o0III0iooOOi2;
/* 566 */                   o0IIO0lO.I00ilI0I1 = o0III0iooOOi2;
/* 568 */                   o0IIO0lO.I00ilO0 = o0III0iooOOi2;
/* 570 */                   o0IIO0lO.I00io1l = o0III0iooOOi2;
/* 572 */                   IIOI0o10 iIOI0o10I000lI3 = IIOII1.I000lI();
/* 576 */                   I1I1OO00o1o i1I1OO00o1oI00111O3 = I1I1OO00o1o.I00111O(iIOI0o10I000lI3, 1);
/* 580 */                   boolean z = false;
/* 581 */                   while (!z) {
                                try {
                                    try {
                                        try {
/* 583 */                                   int iI000o00OoI0I3 = iOOOIOiO0io1.I000o00OoI0I();
/* 587 */                                   if (iI000o00OoI0I3 != 0) {
/* 589 */                                       O0II10 o0ii10I000OOo1O = null;
/* 590 */                                       if (iI000o00OoI0I3 == 10) {
/* 793 */                                           if ((o0IIO0lO.I00iiI & 1) == 1) {
/* 795 */                                               O0II1001o o0II1001o2 = o0IIO0lO.I00iiO;
/* 797 */                                               o0II1001o2.getClass();
/* 802 */                                               o0ii10I000OOo1O = new O0II10(i);
/* 805 */                                               o0ii10I000OOo1O.I000O01llI0(o0II1001o2);
                                                    }
/* 814 */                                           O0II1001o o0II1001o3 = (O0II1001o) iOOOIOiO0io1.I000II(O0II1001o.I00ioIO, il1lll0iI);
/* 816 */                                           o0IIO0lO.I00iiO = o0II1001o3;
/* 818 */                                           if (o0ii10I000OOo1O != null) {
/* 820 */                                               o0ii10I000OOo1O.I000O01llI0(o0II1001o3);
/* 827 */                                               o0IIO0lO.I00iiO = o0ii10I000OOo1O.I0001Ioi1lo();
                                                    }
                                                    o0IIO0lO.I00iiI |= 1;
                                                } else if (iI000o00OoI0I3 == 18) {
/* 751 */                                           if ((o0IIO0lO.I00iiI & 2) == 2) {
/* 753 */                                               O0III0iooOOi o0III0iooOOi3 = o0IIO0lO.I00iio;
/* 755 */                                               o0III0iooOOi3.getClass();
/* 758 */                                               o0ii10I000OOo1O = O0III0iooOOi.I000OOo1O(o0III0iooOOi3);
                                                    }
/* 768 */                                           O0III0iooOOi o0III0iooOOi4 = (O0III0iooOOi) iOOOIOiO0io1.I000II(O0III0iooOOi.I00ioIO, il1lll0iI);
/* 770 */                                           o0IIO0lO.I00iio = o0III0iooOOi4;
/* 772 */                                           if (o0ii10I000OOo1O != null) {
/* 774 */                                               o0ii10I000OOo1O.I000OOo1O(o0III0iooOOi4);
/* 781 */                                               o0IIO0lO.I00iio = o0ii10I000OOo1O.I000II();
                                                    }
                                                    o0IIO0lO.I00iiI |= 2;
                                                } else if (iI000o00OoI0I3 == 26) {
/* 709 */                                           if ((o0IIO0lO.I00iiI & 4) == 4) {
/* 711 */                                               O0III0iooOOi o0III0iooOOi5 = o0IIO0lO.I00ilI0I1;
/* 713 */                                               o0III0iooOOi5.getClass();
/* 716 */                                               o0ii10I000OOo1O = O0III0iooOOi.I000OOo1O(o0III0iooOOi5);
                                                    }
/* 726 */                                           O0III0iooOOi o0III0iooOOi6 = (O0III0iooOOi) iOOOIOiO0io1.I000II(O0III0iooOOi.I00ioIO, il1lll0iI);
/* 728 */                                           o0IIO0lO.I00ilI0I1 = o0III0iooOOi6;
/* 730 */                                           if (o0ii10I000OOo1O != null) {
/* 732 */                                               o0ii10I000OOo1O.I000OOo1O(o0III0iooOOi6);
/* 739 */                                               o0IIO0lO.I00ilI0I1 = o0ii10I000OOo1O.I000II();
                                                    }
                                                    o0IIO0lO.I00iiI |= 4;
                                                } else if (iI000o00OoI0I3 == 34) {
/* 667 */                                           if ((o0IIO0lO.I00iiI & 8) == 8) {
/* 669 */                                               O0III0iooOOi o0III0iooOOi7 = o0IIO0lO.I00ilO0;
/* 671 */                                               o0III0iooOOi7.getClass();
/* 674 */                                               o0ii10I000OOo1O = O0III0iooOOi.I000OOo1O(o0III0iooOOi7);
                                                    }
/* 684 */                                           O0III0iooOOi o0III0iooOOi8 = (O0III0iooOOi) iOOOIOiO0io1.I000II(O0III0iooOOi.I00ioIO, il1lll0iI);
/* 686 */                                           o0IIO0lO.I00ilO0 = o0III0iooOOi8;
/* 688 */                                           if (o0ii10I000OOo1O != null) {
/* 690 */                                               o0ii10I000OOo1O.I000OOo1O(o0III0iooOOi8);
/* 697 */                                               o0IIO0lO.I00ilO0 = o0ii10I000OOo1O.I000II();
                                                    }
                                                    o0IIO0lO.I00iiI |= 8;
                                                } else if (iI000o00OoI0I3 == 42) {
/* 626 */                                           if ((o0IIO0lO.I00iiI & 16) == 16) {
/* 628 */                                               O0III0iooOOi o0III0iooOOi9 = o0IIO0lO.I00io1l;
/* 630 */                                               o0III0iooOOi9.getClass();
/* 633 */                                               o0ii10I000OOo1O = O0III0iooOOi.I000OOo1O(o0III0iooOOi9);
                                                    }
/* 643 */                                           O0III0iooOOi o0III0iooOOi10 = (O0III0iooOOi) iOOOIOiO0io1.I000II(O0III0iooOOi.I00ioIO, il1lll0iI);
/* 645 */                                           o0IIO0lO.I00io1l = o0III0iooOOi10;
/* 647 */                                           if (o0ii10I000OOo1O != null) {
/* 649 */                                               o0ii10I000OOo1O.I000OOo1O(o0III0iooOOi10);
/* 656 */                                               o0IIO0lO.I00io1l = o0ii10I000OOo1O.I000II();
                                                    }
                                                    o0IIO0lO.I00iiI |= 16;
                                                } else if (!iOOOIOiO0io1.I00100o1O0lo(iI000o00OoI0I3, i1I1OO00o1oI00111O3)) {
                                                }
                                            }
/* 612 */                                   z = true;
                                        } catch (Throwable th7) {
                                            try {
/* 851 */                                       i1I1OO00o1oI00111O3.I001iOo1i0O();
                                            } catch (IOException unused5) {
                                            } catch (Throwable th8) {
/* 866 */                                       o0IIO0lO.I00iOIl = iIOI0o10I000lI3.I000II();
/* 868 */                                       throw th8;
                                            }
/* 858 */                                   o0IIO0lO.I00iOIl = iIOI0o10I000lI3.I000II();
/* 869 */                                   throw th7;
                                        }
                                    } catch (O001110li e5) {
/* 848 */                               e5.I00iOIl = o0IIO0lO;
/* 850 */                               throw e5;
                                    }
                                } catch (IOException e6) {
/* 842 */                           O001110li o001110li3 = new O001110li(e6.getMessage());
/* 845 */                           o001110li3.I00iOIl = o0IIO0lO;
/* 847 */                           throw o001110li3;
                                }
                            }
                            try {
/* 870 */                       i1I1OO00o1oI00111O3.I001iOo1i0O();
                            } catch (IOException unused6) {
                            } catch (Throwable th9) {
/* 885 */                       o0IIO0lO.I00iOIl = iIOI0o10I000lI3.I000II();
/* 887 */                       throw th9;
                            }
/* 877 */                   o0IIO0lO.I00iOIl = iIOI0o10I000lI3.I000II();
/* 888 */                   return o0IIO0lO;
                        case 3:
/* 288 */                   O0IIio11 o0IIio11 = new O0IIio11();
/* 291 */                   o0IIio11.I00iio = -1;
/* 293 */                   o0IIio11.I00ilI0I1 = (byte) -1;
/* 295 */                   o0IIio11.I00ilO0 = -1;
/* 297 */                   List list = Collections.EMPTY_LIST;
/* 299 */                   o0IIio11.I00iiI = list;
/* 301 */                   o0IIio11.I00iiO = list;
/* 303 */                   IIOI0o10 iIOI0o10I000lI4 = IIOII1.I000lI();
/* 307 */                   I1I1OO00o1o i1I1OO00o1oI00111O4 = I1I1OO00o1o.I00111O(iIOI0o10I000lI4, 1);
/* 311 */                   int i2 = 0;
/* 312 */                   while (i == 0) {
                                try {
                                    try {
/* 314 */                               int iI000o00OoI0I4 = iOOOIOiO0io1.I000o00OoI0I();
/* 318 */                               if (iI000o00OoI0I4 != 0) {
/* 320 */                                   if (iI000o00OoI0I4 == 10) {
/* 424 */                                       if ((i2 & 1) != 1) {
/* 431 */                                           o0IIio11.I00iiI = new ArrayList();
/* 433 */                                           i2 |= 1;
                                                }
/* 443 */                                       o0IIio11.I00iiI.add(iOOOIOiO0io1.I000II(O0IIiil00lI.I00lll10, il1lll0iI));
                                            } else if (iI000o00OoI0I4 == 40) {
/* 397 */                                       if ((i2 & 2) != 2) {
/* 404 */                                           o0IIio11.I00iiO = new ArrayList();
/* 406 */                                           i2 |= 2;
                                                }
/* 418 */                                       o0IIio11.I00iiO.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
                                            } else if (iI000o00OoI0I4 == 42) {
/* 348 */                                       int iI0000oI00 = iOOOIOiO0io1.I0000oI00(iOOOIOiO0io1.I000iOII());
/* 354 */                                       if ((i2 & 2) != 2 && iOOOIOiO0io1.I0000Il00O() > 0) {
/* 367 */                                           o0IIio11.I00iiO = new ArrayList();
/* 369 */                                           i2 |= 2;
                                                }
/* 375 */                                       while (iOOOIOiO0io1.I0000Il00O() > 0) {
/* 387 */                                           o0IIio11.I00iiO.add(Integer.valueOf(iOOOIOiO0io1.I000iOII()));
                                                }
/* 391 */                                       iOOOIOiO0io1.I0000O(iI0000oI00);
                                            } else if (!iOOOIOiO0io1.I00100o1O0lo(iI000o00OoI0I4, i1I1OO00o1oI00111O4)) {
                                            }
                                        }
/* 334 */                               i = 1;
                                    } catch (Throwable th10) {
/* 465 */                               if ((i2 & 1) == 1) {
/* 473 */                                   o0IIio11.I00iiI = Collections.unmodifiableList(o0IIio11.I00iiI);
                                        }
/* 477 */                               if ((i2 & 2) == 2) {
/* 485 */                                   o0IIio11.I00iiO = Collections.unmodifiableList(o0IIio11.I00iiO);
                                        }
                                        try {
/* 487 */                                   i1I1OO00o1oI00111O4.I001iOo1i0O();
                                        } catch (IOException unused7) {
                                        } catch (Throwable th11) {
/* 502 */                                   o0IIio11.I00iOIl = iIOI0o10I000lI4.I000II();
/* 504 */                                   throw th11;
                                        }
/* 494 */                               o0IIio11.I00iOIl = iIOI0o10I000lI4.I000II();
/* 505 */                               throw th10;
                                    }
                                } catch (O001110li e7) {
/* 460 */                           e7.I00iOIl = o0IIio11;
/* 462 */                           throw e7;
                                } catch (IOException e8) {
/* 454 */                           O001110li o001110li4 = new O001110li(e8.getMessage());
/* 457 */                           o001110li4.I00iOIl = o0IIio11;
/* 459 */                           throw o001110li4;
                                }
                            }
/* 508 */                   if ((i2 & 1) == 1) {
/* 516 */                       o0IIio11.I00iiI = Collections.unmodifiableList(o0IIio11.I00iiI);
                            }
/* 520 */                   if ((i2 & 2) == 2) {
/* 528 */                       o0IIio11.I00iiO = Collections.unmodifiableList(o0IIio11.I00iiO);
                            }
                            try {
/* 530 */                       i1I1OO00o1oI00111O4.I001iOo1i0O();
                            } catch (IOException unused8) {
                            } catch (Throwable th12) {
/* 545 */                       o0IIio11.I00iOIl = iIOI0o10I000lI4.I000II();
/* 547 */                       throw th12;
                            }
/* 537 */                   o0IIio11.I00iOIl = iIOI0o10I000lI4.I000II();
/* 548 */                   return o0IIio11;
                        case 4:
/* 281 */                   return I0000O(iOOOIOiO0io1, il1lll0iI);
                        case 5:
/* 276 */                   return I0000oI00(iOOOIOiO0io1, il1lll0iI);
                        case 6:
/* 271 */                   return I0001Ioi1lo(iOOOIOiO0io1, il1lll0iI);
                        case 7:
/* 266 */                   return I000II(iOOOIOiO0io1, il1lll0iI);
                        case 8:
/* 262 */                   return new OOOi0i1IOo(iOOOIOiO0io1, il1lll0iI);
                        case 9:
/* 255 */                   return I000O01llI0(iOOOIOiO0io1, il1lll0iI);
                        case 10:
/* 250 */                   return I000OOo1O(iOOOIOiO0io1, il1lll0iI);
                        case 11:
/* 245 */                   return I000OiO(iOOOIOiO0io1, il1lll0iI);
                        case 12:
/* 240 */                   return I000iOII(iOOOIOiO0io1, il1lll0iI);
                        case 13:
/* 235 */                   return I000l1(iOOOIOiO0io1, il1lll0iI);
                        case 14:
/* 230 */                   return I000lI(iOOOIOiO0io1, il1lll0iI);
                        case 15:
/* 225 */                   return I000o00OoI0I(iOOOIOiO0io1, il1lll0iI);
                        case 16:
/* 220 */                   return I000oI1ioi(iOOOIOiO0io1, il1lll0iI);
                        case 17:
/* 215 */                   return I00100l0(iOOOIOiO0io1, il1lll0iI);
                        case PoseLandmark.RIGHT_PINKY:
/* 211 */                   return new OOOo0i11Ol(iOOOIOiO0io1, il1lll0iI);
                        case PoseLandmark.LEFT_INDEX:
/* 204 */                   return I00100o1O0lo(iOOOIOiO0io1, il1lll0iI);
                        case PoseLandmark.RIGHT_INDEX:
/* 199 */                   return I0010I0i(iOOOIOiO0io1, il1lll0iI);
                        case PoseLandmark.LEFT_THUMB:
/* 194 */                   return I0010o(iOOOIOiO0io1, il1lll0iI);
                        case PoseLandmark.RIGHT_THUMB:
/* 189 */                   return I00111O(iOOOIOiO0io1, il1lll0iI);
                        case PoseLandmark.LEFT_HIP:
/* 184 */                   return I001IIilI0O(iOOOIOiO0io1, il1lll0iI);
                        case PoseLandmark.RIGHT_HIP:
/* 179 */                   return I001IO000(iOOOIOiO0io1, il1lll0iI);
                        case PoseLandmark.LEFT_KNEE:
/* 174 */                   return I001i1O0Ol(iOOOIOiO0io1, il1lll0iI);
                        case PoseLandmark.RIGHT_KNEE:
/* 169 */                   return I001i1lo1io(iOOOIOiO0io1, il1lll0iI);
                        case 27:
/* 164 */                   return I001iOo1i0O(iOOOIOiO0io1, il1lll0iI);
                        case PoseLandmark.RIGHT_ANKLE:
/* 159 */                   return I001l0I00(iOOOIOiO0io1, il1lll0iI);
                        default:
/* 20 */                    OOi0liO oOi0liO = new OOi0liO();
/* 23 */                    oOi0liO.I00iiO = (byte) -1;
/* 25 */                    oOi0liO.I00iio = -1;
/* 29 */                    oOi0liO.I00iiI = Collections.EMPTY_LIST;
/* 31 */                    IIOI0o10 iIOI0o10I000lI5 = IIOII1.I000lI();
/* 35 */                    I1I1OO00o1o i1I1OO00o1oI00111O5 = I1I1OO00o1o.I00111O(iIOI0o10I000lI5, 1);
/* 39 */                    boolean z2 = false;
/* 40 */                    while (i == 0) {
                                try {
                                    try {
                                        try {
/* 42 */                                    int iI000o00OoI0I5 = iOOOIOiO0io1.I000o00OoI0I();
/* 46 */                                    if (iI000o00OoI0I5 != 0) {
/* 48 */                                        if (iI000o00OoI0I5 == 10) {
/* 64 */                                            if (!z2) {
/* 71 */                                                oOi0liO.I00iiI = new ArrayList();
/* 73 */                                                z2 = true;
                                                    }
/* 82 */                                            oOi0liO.I00iiI.add(iOOOIOiO0io1.I000II(OOi0lO.I00ll1, il1lll0iI));
                                                } else if (!iOOOIOiO0io1.I00100o1O0lo(iI000o00OoI0I5, i1I1OO00o1oI00111O5)) {
                                                }
                                            }
/* 56 */                                    i = 1;
                                        } catch (IOException e9) {
/* 92 */                                    O001110li o001110li5 = new O001110li(e9.getMessage());
/* 95 */                                    o001110li5.I00iOIl = oOi0liO;
/* 97 */                                    throw o001110li5;
                                        }
                                    } catch (O001110li e10) {
/* 98 */                                e10.I00iOIl = oOi0liO;
/* 100 */                               throw e10;
                                    }
                                } catch (Throwable th13) {
/* 101 */                           if (z2) {
/* 109 */                               oOi0liO.I00iiI = Collections.unmodifiableList(oOi0liO.I00iiI);
                                    }
                                    try {
/* 111 */                               i1I1OO00o1oI00111O5.I001iOo1i0O();
                                    } catch (IOException unused9) {
                                    } catch (Throwable th14) {
/* 126 */                               oOi0liO.I00iOIl = iIOI0o10I000lI5.I000II();
/* 128 */                               throw th14;
                                    }
/* 118 */                           oOi0liO.I00iOIl = iIOI0o10I000lI5.I000II();
/* 129 */                           throw th13;
                                }
                            }
/* 130 */                   if (z2) {
/* 138 */                       oOi0liO.I00iiI = Collections.unmodifiableList(oOi0liO.I00iiI);
                            }
                            try {
/* 140 */                       i1I1OO00o1oI00111O5.I001iOo1i0O();
                            } catch (IOException unused10) {
                            } catch (Throwable th15) {
/* 155 */                       oOi0liO.I00iOIl = iIOI0o10I000lI5.I000II();
/* 157 */                       throw th15;
                            }
/* 147 */                   oOi0liO.I00iOIl = iIOI0o10I000lI5.I000II();
/* 158 */                   return oOi0liO;
                    }
                }
            }
