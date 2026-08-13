            package p000;

            import android.content.Context;
            import android.net.Uri;
            import java.io.BufferedReader;
            import java.io.InputStream;
            import java.io.InputStreamReader;
            
            public final class Ilol1Illo1 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl;
                public Exception I00iiI;
                public int I00iiO;
                public final Context I00iio;
                public final Uri I00ilI0I1;
                public final OI10i0Il I00ilO0;
                public final OI10i0Il I00io1l;
                public final OI10i0Il I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ilol1Illo1(Context context, Uri uri, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, OI10i0Il oI10i0Il3, IOoil1iiIilo iOoil1iiIilo, int i) {
/* 14 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = i;
/* 3 */             this.I00iio = context;
/* 5 */             this.I00ilI0I1 = uri;
/* 7 */             this.I00ilO0 = oI10i0Il;
/* 9 */             this.I00io1l = oI10i0Il2;
/* 11 */            this.I00ioIO = oI10i0Il3;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    switch (this.I00iOIl) {
                        case 0:
/* 39 */                    return new Ilol1Illo1(this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, iOoil1iiIilo, 0);
                        default:
/* 20 */                    return new Ilol1Illo1(this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, this.I00ioIO, iOoil1iiIilo, 1);
                    }
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             Ii0110 ii0110 = (Ii0110) obj;
/* 7 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj2;
                    switch (i) {
                    }
/* 18 */            return ((Ilol1Illo1) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:120:0x0203, code lost:
                
                    if (p000.iOi1II01i0.I0000oI00(r5, r6, r24) != r14) goto L122;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:60:0x0109, code lost:
                
                    if (p000.iOi1II01i0.I0000oI00(r5, r6, r24) != r15) goto L62;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    InputStream inputStreamOpenInputStream;
                    OIliOo11 oIliOo11I0000Il00O;
/* 3 */             int i = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 9 */             OI10i0Il oI10i0Il = this.I00ilO0;
/* 19 */            Context context = this.I00iio;
/* 21 */            Uri uri = this.I00ilI0I1;
/* 25 */            String strI00000oOI = "";
                    switch (i) {
                        case 0:
/* 282 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 284 */                   int i2 = this.I00iiO;
                            try {
                            } catch (Exception e) {
/* 314 */                       e = e;
/* 497 */                       IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 499 */                       Io11l1li io11l1li = O1OI1l011OO1.I00000oIO;
/* 505 */                       Ilol1I ilol1I = new Ilol1I(e, oI10i0Il, null, 0);
/* 508 */                       this.I00iiI = e;
/* 510 */                       this.I00iiO = 2;
                                break;
                            }
/* 286 */                   if (i2 != 0) {
/* 288 */                       if (i2 == 1) {
/* 309 */                           lIoii1l01l0i.I00000oOI(obj);
/* 529 */                           return ooiIlOl1iI;
                                }
/* 290 */                       if (i2 != 2) {
/* 299 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 302 */                           return null;
                                }
/* 292 */                       e = this.I00iiI;
/* 294 */                       lIoii1l01l0i.I00000oOI(obj);
/* 526 */                       IIlIOloOOO.I001iOo1i0O("prompt doc extract error: ", e.getMessage(), "GeminiNanoHub");
/* 529 */                       return ooiIlOl1iI;
                            }
/* 317 */                   lIoii1l01l0i.I00000oOI(obj);
/* 320 */                   String strI00Io1lO = Iloo0ilo.I00Io1lO(context, uri);
/* 336 */                   if (O0000Ioio00.I0000O(context.getContentResolver().getType(uri), "application/pdf") || OlOolloIIOl0.I000II(strI00Io1lO, ".pdf", true)) {
/* 387 */                       inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 391 */                       if (inputStreamOpenInputStream != null) {
                                    try {
/* 393 */                               oIliOo11I0000Il00O = OIliOo11.I0000Il00O(inputStreamOpenInputStream);
                                        try {
/* 402 */                                   String strI000l1 = new OIll0O().I000l1(oIliOo11I0000Il00O);
/* 406 */                                   oIliOo11I0000Il00O.close();
/* 409 */                                   inputStreamOpenInputStream.close();
/* 412 */                                   if (strI000l1 != null) {
/* 415 */                                       strI00000oOI = strI000l1;
                                            }
                                        } finally {
                                            try {
/* 422 */                                       throw th;
                                            } finally {
                                            }
                                        }
                                    } finally {
                                        try {
/* 428 */                                   throw th;
                                        } finally {
                                        }
                                    }
                                }
                            } else {
/* 349 */                       inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 353 */                       if (inputStreamOpenInputStream != null) {
                                    try {
/* 367 */                               strI00000oOI = lOliOoIi.I00000oOI(new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, IO1IOI.I00000oIO), 8192));
/* 371 */                               inputStreamOpenInputStream.close();
                                    } finally {
                                        try {
/* 377 */                                   throw th;
                                        } finally {
                                        }
                                    }
                                }
                            }
/* 434 */                   String strI00Io1o110i = Iloo0ilo.I00Io1o110i(strI00000oOI);
/* 444 */                   if (strI00Io1o110i.length() > 10000) {
/* 450 */                       strI00Io1o110i = OlOoOIi0o.I00OIl(10000, strI00Io1o110i).concat("\n\n[Truncated]");
                            }
/* 456 */                   IiI0oillOO10 iiI0oillOO102 = IiiIil1lOIO.I00000oIO;
/* 458 */                   Io11l1li io11l1li2 = O1OI1l011OO1.I00000oIO;
/* 480 */                   Ilol0ooO ilol0ooO = new Ilol0ooO(strI00Io1o110i, strI00Io1lO, this.I00ilO0, this.I00io1l, this.I00ioIO, null, 0);
/* 486 */                   this.I00iiI = null;
/* 488 */                   this.I00iiO = 1;
/* 494 */                   if (iOi1II01i0.I0000oI00(io11l1li2, ilol0ooO, this) != ii0111o) {
/* 529 */                       return ooiIlOl1iI;
                            }
/* 518 */                   return ii0111o;
                        default:
/* 32 */                    Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 34 */                    int i3 = this.I00iiO;
                            try {
                            } catch (Exception e2) {
/* 64 */                        e = e2;
/* 247 */                       IiI0oillOO10 iiI0oillOO103 = IiiIil1lOIO.I00000oIO;
/* 249 */                       Io11l1li io11l1li3 = O1OI1l011OO1.I00000oIO;
/* 255 */                       Ilol1I ilol1I2 = new Ilol1I(e, oI10i0Il, null, 3);
/* 258 */                       this.I00iiI = e;
/* 260 */                       this.I00iiO = 2;
                                break;
                            }
/* 36 */                    if (i3 != 0) {
/* 38 */                        if (i3 == 1) {
/* 59 */                            lIoii1l01l0i.I00000oOI(obj);
/* 279 */                           return ooiIlOl1iI;
                                }
/* 40 */                        if (i3 != 2) {
/* 49 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 52 */                            return null;
                                }
/* 42 */                        e = this.I00iiI;
/* 44 */                        lIoii1l01l0i.I00000oOI(obj);
/* 276 */                       IIlIOloOOO.I001iOo1i0O("doc extract error: ", e.getMessage(), "GeminiNanoHub");
/* 279 */                       return ooiIlOl1iI;
                            }
/* 67 */                    lIoii1l01l0i.I00000oOI(obj);
/* 70 */                    String strI00Io1lO2 = Iloo0ilo.I00Io1lO(context, uri);
/* 86 */                    if (O0000Ioio00.I0000O(context.getContentResolver().getType(uri), "application/pdf") || OlOolloIIOl0.I000II(strI00Io1lO2, ".pdf", true)) {
/* 137 */                       inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 141 */                       if (inputStreamOpenInputStream != null) {
                                    try {
/* 143 */                               oIliOo11I0000Il00O = OIliOo11.I0000Il00O(inputStreamOpenInputStream);
                                        try {
/* 152 */                                   String strI000l12 = new OIll0O().I000l1(oIliOo11I0000Il00O);
/* 156 */                                   oIliOo11I0000Il00O.close();
/* 159 */                                   inputStreamOpenInputStream.close();
/* 162 */                                   if (strI000l12 != null) {
/* 165 */                                       strI00000oOI = strI000l12;
                                            }
                                        } finally {
                                        }
                                    } finally {
                                    }
                                }
                            } else {
/* 99 */                        inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
/* 103 */                       if (inputStreamOpenInputStream != null) {
                                    try {
/* 117 */                               strI00000oOI = lOliOoIi.I00000oOI(new BufferedReader(new InputStreamReader(inputStreamOpenInputStream, IO1IOI.I00000oIO), 8192));
/* 121 */                               inputStreamOpenInputStream.close();
                                    } finally {
                                        try {
/* 127 */                                   throw th;
                                        } finally {
                                        }
                                    }
                                }
                            }
/* 184 */                   String strI00Io1o110i2 = Iloo0ilo.I00Io1o110i(strI00000oOI);
/* 194 */                   if (strI00Io1o110i2.length() > 10000) {
/* 200 */                       strI00Io1o110i2 = OlOoOIi0o.I00OIl(10000, strI00Io1o110i2).concat("\n\n[Truncated — document exceeds 10 000 character limit]");
                            }
/* 206 */                   IiI0oillOO10 iiI0oillOO104 = IiiIil1lOIO.I00000oIO;
/* 208 */                   Io11l1li io11l1li4 = O1OI1l011OO1.I00000oIO;
/* 230 */                   Ilol0ooO ilol0ooO2 = new Ilol0ooO(strI00Io1o110i2, strI00Io1lO2, this.I00ilO0, this.I00io1l, this.I00ioIO, null, 3);
/* 236 */                   this.I00iiI = null;
/* 238 */                   this.I00iiO = 1;
/* 244 */                   if (iOi1II01i0.I0000oI00(io11l1li4, ilol0ooO2, this) != ii0111o2) {
/* 279 */                       return ooiIlOl1iI;
                            }
/* 268 */                   return ii0111o2;
                    }
                }
            }
