            package p000;

            import java.io.EOFException;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Set;
            
            public abstract class OI0iiO1i1 {
                public static final IIOIIi10OOl I00000oIO;
                public static final IIOIIi10OOl I00000oOI;

                static {
/* 3 */             Charset charset = IO1IOI.I00000oIO;
/* 31 */            I00000oIO = new IIOIIi10OOl(0, charset.equals(charset) ? "\r\n".getBytes(charset) : iOlIOO1I.I00000oIO(charset.newEncoder(), "\r\n", 0, 2));
/* 43 */            I00000oOI = new IIOIIi10OOl(new byte[]{45, 45});
                }

                public static final void I00000oIO(OOo0ll111 oOo0ll111, byte[] bArr, byte b) throws IOException {
/* 1 */             int i = oOo0ll111.I00iOIl;
/* 4 */             if (i >= bArr.length) {
/* 15 */                IioIoO10iOiI.I000OOo1O("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
                    } else {
/* 8 */                 oOo0ll111.I00iOIl = i + 1;
/* 10 */                bArr[i] = b;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:56:0x012c, code lost:
                
                    if (r0 == r6) goto L73;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:72:0x0198, code lost:
                
                    if (((p000.IIIloOl0I1I) r8).I00000oOI(r5) == r6) goto L73;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0178  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
                /* JADX WARN: Type inference failed for: r3v5, types: [IIOIlI01] */
                /* JADX WARN: Type inference failed for: r3v7, types: [IIOIlI01] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oOI(IIOIIi10OOl iIOIIi10OOl, Ii01oI01 ii01oI01, IIIloOl0I1I iIIloOl0I1I, IoIoOi ioIoOi, long j, IOoilo iOoilo) throws Throwable {
                    OI0iOlOlOoOo oI0iOlOlOoOo;
                    long j2;
                    Long l;
                    Ii01oI01 ii01oI012;
                    IIOIIi10OOl iIOIIi10OOl2;
                    Object objI00000oIO;
                    long j3;
                    IIOIlI01 iIOIlI01;
                    long jLongValue;
                    long j4;
/* 1 */             IIIloOl0I1I iIIloOl0I1I2 = iIIloOl0I1I;
/* 3 */             long j5 = j;
/* 9 */             if (iOoilo instanceof OI0iOlOlOoOo) {
/* 12 */                oI0iOlOlOoOo = (OI0iOlOlOoOo) iOoilo;
/* 14 */                int i = oI0iOlOlOoOo.I00io1l;
/* 20 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 23 */                    oI0iOlOlOoOo.I00io1l = i - Integer.MIN_VALUE;
                        } else {
/* 29 */                    oI0iOlOlOoOo = new OI0iOlOlOoOo(iOoilo);
                        }
                    }
/* 25 */            OI0iOlOlOoOo oI0iOlOlOoOo2 = oI0iOlOlOoOo;
/* 33 */            Object objI000oI1ioi = oI0iOlOlOoOo2.I00ilO0;
/* 35 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 37 */            int i2 = oI0iOlOlOoOo2.I00io1l;
/* 44 */            if (i2 == 0) {
/* 113 */               lIoii1l01l0i.I00000oOI(objI000oI1ioi);
/* 120 */               IO10oOlIiO iO10oOlIiOI00000oIO = ioIoOi.I00000oIO("Content-Length");
/* 124 */               if (iO10oOlIiOI00000oIO != null) {
/* 126 */                   int i3 = IO1I1oO10O11.I00000oIO;
/* 128 */                   int length = iO10oOlIiOI00000oIO.length();
/* 136 */                   j2 = 0;
/* 140 */                   if (length > 19) {
/* 277 */                       throw new NumberFormatException("Invalid number " + ((Object) iO10oOlIiOI00000oIO) + ": too large for Long type");
                            }
/* 146 */                   int i4 = 0;
/* 147 */                   if (length == 19) {
/* 149 */                       int length2 = iO10oOlIiOI00000oIO.length();
/* 153 */                       j3 = 0;
/* 155 */                       while (i4 < length2) {
/* 162 */                           long jCharAt = iO10oOlIiOI00000oIO.charAt(i4) - 48;
/* 166 */                           if (jCharAt < 0 || jCharAt > 9) {
/* 210 */                               IO1I1oO10O11.I00000oOI(iO10oOlIiOI00000oIO, i4);
/* 213 */                               throw null;
                                    }
/* 178 */                           j3 = (j3 << 3) + (j3 << 1) + jCharAt;
/* 182 */                           if (j3 < 0) {
/* 209 */                               throw new NumberFormatException("Invalid number " + ((Object) iO10oOlIiOI00000oIO) + ": too large for Long type");
                                    }
/* 184 */                           i4++;
                                }
                            } else {
/* 217 */                       j3 = 0;
/* 219 */                       while (i4 < length) {
/* 226 */                           long jCharAt2 = iO10oOlIiOI00000oIO.charAt(i4) - 48;
/* 230 */                           if (jCharAt2 < 0 || jCharAt2 > 9) {
/* 247 */                               IO1I1oO10O11.I00000oOI(iO10oOlIiOI00000oIO, i4);
/* 250 */                               throw null;
                                    }
/* 242 */                           j3 = (j3 << 3) + (j3 << 1) + jCharAt2;
/* 244 */                           i4++;
                                }
                            }
/* 253 */                   l = new Long(j3);
                        } else {
/* 278 */                   j2 = 0;
/* 280 */                   l = null;
                        }
/* 281 */               if (l == null) {
/* 283 */                   oI0iOlOlOoOo2.I00iOIl = null;
/* 285 */                   oI0iOlOlOoOo2.I00iiI = null;
/* 287 */                   oI0iOlOlOoOo2.I00iiO = iIIloOl0I1I2;
/* 289 */                   oI0iOlOlOoOo2.I00iio = j5;
/* 291 */                   oI0iOlOlOoOo2.I00io1l = 1;
/* 297 */                   objI000oI1ioi = iOiOOIlI1o01.I000oI1ioi(ii01oI01, iIOIIi10OOl, iIIloOl0I1I2, j5, oI0iOlOlOoOo2);
                        } else {
/* 314 */                   ii01oI012 = ii01oI01;
/* 316 */                   long jLongValue2 = l.longValue();
/* 322 */                   if (j2 > jLongValue2 || jLongValue2 > j5) {
/* 436 */                       IioIoO10iOiI.I000OOo1O(IlIi0I0.I000o00OoI0I(Oi010OO0.I001iOo1i0O(l.longValue(), "Multipart content length exceeds limit ", " > "), j5, "; limit is defined using 'formFieldLimit' argument"));
/* 43 */                        return null;
                            }
/* 328 */                   long jLongValue3 = l.longValue();
/* 332 */                   iIOIIi10OOl2 = iIOIIi10OOl;
/* 334 */                   oI0iOlOlOoOo2.I00iOIl = iIOIIi10OOl2;
/* 336 */                   oI0iOlOlOoOo2.I00iiI = ii01oI012;
/* 338 */                   oI0iOlOlOoOo2.I00iiO = iIIloOl0I1I2;
/* 340 */                   oI0iOlOlOoOo2.I00iio = j5;
/* 343 */                   oI0iOlOlOoOo2.I00io1l = 2;
/* 345 */                   objI00000oIO = iOiOOIlI1o01.I00000oIO(ii01oI012, iIIloOl0I1I2, jLongValue3, oI0iOlOlOoOo2);
/* 349 */                   if (objI00000oIO != ii0111o) {
/* 354 */                       long jLongValue4 = ((Number) objI00000oIO).longValue();
/* 358 */                       oI0iOlOlOoOo2.I00iOIl = null;
/* 360 */                       oI0iOlOlOoOo2.I00iiI = null;
/* 362 */                       oI0iOlOlOoOo2.I00iiO = iIIloOl0I1I2;
/* 364 */                       oI0iOlOlOoOo2.I00iio = j5;
/* 366 */                       oI0iOlOlOoOo2.I00ilI0I1 = jLongValue4;
/* 368 */                       oI0iOlOlOoOo2.I00io1l = 3;
/* 370 */                       objI000oI1ioi = I0000O(ii01oI012, iIOIIi10OOl2, oI0iOlOlOoOo2);
/* 374 */                       if (objI000oI1ioi != ii0111o) {
                                }
                            }
                        }
/* 411 */               return ii0111o;
                    }
/* 46 */            if (i2 == 1) {
/* 99 */                long j6 = oI0iOlOlOoOo2.I00iio;
/* 101 */               ?? r3 = oI0iOlOlOoOo2.I00iiO;
/* 103 */               lIoii1l01l0i.I00000oOI(objI000oI1ioi);
/* 108 */               iIIloOl0I1I2 = r3;
/* 109 */               j5 = j6;
/* 311 */               iIOIlI01 = iIIloOl0I1I2;
/* 307 */               jLongValue = ((Number) objI000oI1ioi).longValue();
/* 390 */               oI0iOlOlOoOo2.I00iOIl = null;
/* 392 */               oI0iOlOlOoOo2.I00iiI = null;
/* 394 */               oI0iOlOlOoOo2.I00iiO = null;
/* 396 */               oI0iOlOlOoOo2.I00iio = j5;
/* 398 */               oI0iOlOlOoOo2.I00ilI0I1 = jLongValue;
/* 401 */               oI0iOlOlOoOo2.I00io1l = 4;
                    } else {
/* 48 */                if (i2 == 2) {
/* 78 */                    long j7 = oI0iOlOlOoOo2.I00iio;
/* 80 */                    ?? r32 = oI0iOlOlOoOo2.I00iiO;
/* 82 */                    Ii01oI01 ii01oI013 = oI0iOlOlOoOo2.I00iiI;
/* 84 */                    IIOIIi10OOl iIOIIi10OOl3 = oI0iOlOlOoOo2.I00iOIl;
/* 86 */                    lIoii1l01l0i.I00000oOI(objI000oI1ioi);
/* 89 */                    objI00000oIO = objI000oI1ioi;
/* 90 */                    ii01oI012 = ii01oI013;
/* 93 */                    iIIloOl0I1I2 = r32;
/* 94 */                    j5 = j7;
/* 96 */                    iIOIIi10OOl2 = iIOIIi10OOl3;
/* 354 */                   long jLongValue42 = ((Number) objI00000oIO).longValue();
/* 358 */                   oI0iOlOlOoOo2.I00iOIl = null;
/* 360 */                   oI0iOlOlOoOo2.I00iiI = null;
/* 362 */                   oI0iOlOlOoOo2.I00iiO = iIIloOl0I1I2;
/* 364 */                   oI0iOlOlOoOo2.I00iio = j5;
/* 366 */                   oI0iOlOlOoOo2.I00ilI0I1 = jLongValue42;
/* 368 */                   oI0iOlOlOoOo2.I00io1l = 3;
/* 370 */                   objI000oI1ioi = I0000O(ii01oI012, iIOIIi10OOl2, oI0iOlOlOoOo2);
/* 374 */                   if (objI000oI1ioi != ii0111o) {
/* 379 */                       iIOIlI01 = iIIloOl0I1I2;
/* 380 */                       j4 = jLongValue42;
/* 388 */                       jLongValue = ((Number) objI000oI1ioi).longValue() + j4;
/* 390 */                       oI0iOlOlOoOo2.I00iOIl = null;
/* 392 */                       oI0iOlOlOoOo2.I00iiI = null;
/* 394 */                       oI0iOlOlOoOo2.I00iiO = null;
/* 396 */                       oI0iOlOlOoOo2.I00iio = j5;
/* 398 */                       oI0iOlOlOoOo2.I00ilI0I1 = jLongValue;
/* 401 */                       oI0iOlOlOoOo2.I00io1l = 4;
                            }
/* 411 */                   return ii0111o;
                        }
/* 50 */                if (i2 != 3) {
/* 52 */                    if (i2 != 4) {
/* 63 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 43 */                        return null;
                            }
/* 54 */                    jLongValue = oI0iOlOlOoOo2.I00ilI0I1;
/* 56 */                    lIoii1l01l0i.I00000oOI(objI000oI1ioi);
/* 414 */                   return new Long(jLongValue);
                        }
/* 67 */                j4 = oI0iOlOlOoOo2.I00ilI0I1;
/* 69 */                j5 = oI0iOlOlOoOo2.I00iio;
/* 71 */                iIOIlI01 = oI0iOlOlOoOo2.I00iiO;
/* 73 */                lIoii1l01l0i.I00000oOI(objI000oI1ioi);
/* 388 */               jLongValue = ((Number) objI000oI1ioi).longValue() + j4;
/* 390 */               oI0iOlOlOoOo2.I00iOIl = null;
/* 392 */               oI0iOlOlOoOo2.I00iiI = null;
/* 394 */               oI0iOlOlOoOo2.I00iiO = null;
/* 396 */               oI0iOlOlOoOo2.I00iio = j5;
/* 398 */               oI0iOlOlOoOo2.I00ilI0I1 = jLongValue;
/* 401 */               oI0iOlOlOoOo2.I00io1l = 4;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0000Il00O(Ii01oI01 ii01oI01, IOoilo iOoilo) throws Throwable {
                    OI0iiII oI0iiII;
                    Throwable th;
                    IO110I io110i;
                    ArrayList arrayList;
/* 3 */             if (iOoilo instanceof OI0iiII) {
/* 6 */                 oI0iiII = (OI0iiII) iOoilo;
/* 8 */                 int i = oI0iiII.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oI0iiII.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oI0iiII = new OI0iiII(iOoilo);
                        }
                    }
/* 25 */            Object obj = oI0iiII.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oI0iiII.I00iiO;
/* 34 */            if (i2 == 0) {
/* 52 */                lIoii1l01l0i.I00000oOI(obj);
/* 57 */                OIOiIOO0l0O oIOiIOO0l0O = IO11II01.I00000oIO;
/* 59 */                IO110I io110i2 = new IO110I();
/* 62 */                io110i2.I00iOIl = oIOiIOO0l0O;
/* 64 */                VarHandle.storeStoreFence();
                        try {
/* 67 */                    oI0iiII.I00iOIl = io110i2;
/* 69 */                    oI0iiII.I00iiO = 1;
/* 71 */                    Set set = IoO000.I00000oIO;
/* 75 */                    IIOiiIi iIOiiIi = new IIOiiIi(1);
/* 78 */                    iIOiiIi.I00000oOI = 0;
/* 80 */                    iIOiiIi.I0000Il00O = 0;
/* 82 */                    Object objI0000Il00O = IoO000.I0000Il00O(ii01oI01, io110i2, iIOiiIi, oI0iiII);
/* 86 */                    if (objI0000Il00O == ii0111o) {
/* 88 */                        return ii0111o;
                            }
/* 90 */                    obj = objI0000Il00O;
/* 91 */                    io110i = io110i2;
                        } catch (Throwable th2) {
/* 106 */                   th = th2;
/* 107 */                   io110i = io110i2;
/* 111 */                   OIOiIOO0l0O oIOiIOO0l0O2 = io110i.I00iOIl;
/* 113 */                   arrayList = io110i.I00iiI;
/* 115 */                   if (arrayList == null) {
                            }
/* 145 */                   io110i.I00ilI0I1 = true;
/* 147 */                   io110i.I00iiI = null;
/* 149 */                   io110i.I00iio = null;
/* 151 */                   io110i.I00io1l = 0;
/* 153 */                   io110i.I00ilO0 = 0;
/* 551 */                   throw th;
                        }
                    } else {
/* 36 */                if (i2 != 1) {
/* 48 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 32 */                    return null;
                        }
/* 38 */                io110i = oI0iiII.I00iOIl;
                        try {
/* 40 */                    lIoii1l01l0i.I00000oOI(obj);
                        } catch (Throwable th3) {
/* 44 */                    th = th3;
/* 111 */                   OIOiIOO0l0O oIOiIOO0l0O22 = io110i.I00iOIl;
/* 113 */                   arrayList = io110i.I00iiI;
/* 115 */                   if (arrayList == null) {
/* 117 */                       io110i.I00iiO = null;
/* 119 */                       int size = arrayList.size();
/* 124 */                       for (int i3 = 0; i3 < size; i3++) {
/* 130 */                           oIOiIOO0l0O22.I00o101lO(arrayList.get(i3));
                                }
                            } else {
/* 136 */                       char[] cArr = io110i.I00iiO;
/* 138 */                       if (cArr != null) {
/* 140 */                           oIOiIOO0l0O22.I00o101lO(cArr);
                                }
/* 143 */                       io110i.I00iiO = null;
                            }
/* 145 */                   io110i.I00ilI0I1 = true;
/* 147 */                   io110i.I00iiI = null;
/* 149 */                   io110i.I00iio = null;
/* 151 */                   io110i.I00io1l = 0;
/* 153 */                   io110i.I00ilO0 = 0;
/* 551 */                   throw th;
                        }
                    }
/* 92 */            IoIoOi ioIoOi = (IoIoOi) obj;
/* 94 */            if (ioIoOi != null) {
/* 96 */                return ioIoOi;
                    }
/* 104 */           throw new EOFException("Failed to parse multipart headers: unexpected end of stream");
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I0000O(IIIoloiiI1 iIIoloiiI1, IIOIIi10OOl iIOIIi10OOl, IOoilo iOoilo) throws Throwable {
                    OI0iiO oI0iiO;
/* 3 */             if (iOoilo instanceof OI0iiO) {
/* 6 */                 oI0iiO = (OI0iiO) iOoilo;
/* 8 */                 int i = oI0iiO.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oI0iiO.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oI0iiO = new OI0iiO(iOoilo);
                        }
                    }
/* 25 */            Object objI00100l0 = oI0iiO.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oI0iiO.I00iiO;
/* 32 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(objI00100l0);
/* 52 */                oI0iiO.I00iOIl = iIOIIi10OOl;
/* 54 */                oI0iiO.I00iiO = 1;
/* 56 */                objI00100l0 = iOiOOIlI1o01.I00100l0(iIIoloiiI1, iIOIIi10OOl, oI0iiO);
/* 60 */                if (objI00100l0 == ii0111o) {
/* 62 */                    return ii0111o;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 44 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 36 */                iIOIIi10OOl = oI0iiO.I00iOIl;
/* 38 */                lIoii1l01l0i.I00000oOI(objI00100l0);
                    }
/* 80 */            return new Long(((Boolean) objI00100l0).booleanValue() ? iIOIIi10OOl.I00iOIl.length : 0L);
                }
            }
