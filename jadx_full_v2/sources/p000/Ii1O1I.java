            package p000;

            import java.io.File;
            import java.io.FileNotFoundException;
            import java.io.FileOutputStream;
            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
/* 13 */    public final class Ii1O1I extends Oll0io implements Function1 {
                public final int I00iOIl = 1;
                public int I00iiI;
                public final Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public final Object I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1O1I(OOo0ooi oOo0ooi, Ii1OIIlOi ii1OIIlOi, OOo0ll111 oOo0ll111, IOoil1iiIilo iOoil1iiIilo) {
/* 11 */            super(1, iOoil1iiIilo);
/* 4 */             this.I00ilI0I1 = oOo0ooi;
/* 6 */             this.I00iiO = ii1OIIlOi;
/* 8 */             this.I00ilO0 = oOo0ll111;
                }

                @Override
                public final IOoil1iiIilo create(IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj = this.I00ilO0;
/* 5 */             Object obj2 = this.I00iiO;
                    switch (i) {
                        case 0:
/* 42 */                    return new Ii1O1I((OOo0ooi) this.I00ilI0I1, (Ii1OIIlOi) obj2, (OOo0ll111) obj, iOoil1iiIilo);
                        case 1:
/* 28 */                    return new Ii1O1I((Ii1OIIlOi) obj2, (Ii00l101O) this.I00ilI0I1, (IlliIl1l11O) obj, iOoil1iiIilo);
                        default:
/* 14 */                    return new Ii1O1I((IlIl0oi1) obj2, obj, iOoil1iiIilo);
                    }
                }

                @Override
                public final Object invoke(Object obj) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 5 */             IOoil1iiIilo iOoil1iiIilo = (IOoil1iiIilo) obj;
                    switch (i) {
                    }
/* 16 */            return ((Ii1O1I) create(iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Code restructure failed: missing block: B:59:0x00e3, code lost:
                
                    if (r6.I000OOo1O(r13, true, r12) == r0) goto L60;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:89:0x0168, code lost:
                
                    if (r13 != r9) goto L91;
                 */
                /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x00ce  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00d3  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Exception {
                    OOo0ooi oOo0ooi;
                    OOo0ll111 oOo0ll111;
                    Ii11I1iOiIo ii11I1iOiIo;
                    Object obj2;
                    Throwable th;
                    FileOutputStream fileOutputStream;
                    FileOutputStream fileOutputStream2;
/* 1 */             int i = this.I00iOIl;
/* 4 */             int i2 = 3;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             Object obj3 = this.I00ilO0;
/* 11 */            Object obj4 = this.I00iiO;
/* 13 */            int i3 = 1;
/* 14 */            IOoil1iiIilo iOoil1iiIilo = null;
                    switch (i) {
                        case 0:
/* 240 */                   OOo0ll111 oOo0ll1112 = (OOo0ll111) obj3;
/* 244 */                   OOo0ooi oOo0ooi2 = (OOo0ooi) this.I00ilI0I1;
/* 246 */                   Ii1OIIlOi ii1OIIlOi = (Ii1OIIlOi) obj4;
/* 248 */                   Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 250 */                   int i4 = this.I00iiI;
                            try {
                            } catch (Ii01i1 unused) {
/* 351 */                       Object obj5 = oOo0ooi2.I00iOIl;
/* 353 */                       this.I00iio = oOo0ll1112;
/* 355 */                       this.I00iiI = 3;
/* 357 */                       obj = ii1OIIlOi.I000OOo1O(obj5, true, this);
                                break;
                            }
/* 252 */                   if (i4 == 0) {
/* 296 */                       lIoii1l01l0i.I00000oOI(obj);
/* 299 */                       this.I00iio = oOo0ooi2;
/* 301 */                       this.I00iiI = 1;
/* 316 */                       obj = ((IlIi1o0I110) ii1OIIlOi.I000OiO.getValue()).I00000oIO(new IOIllll(i2, iOoil1iiIilo), this);
/* 320 */                       if (obj == ii0111o) {
/* 363 */                           return ii0111o;
                                }
/* 323 */                       oOo0ooi = oOo0ooi2;
                            } else {
/* 254 */                       if (i4 != 1) {
/* 256 */                           if (i4 == 2) {
/* 280 */                               oOo0ll111 = (OOo0ll111) ((Serializable) this.I00iio);
/* 282 */                               lIoii1l01l0i.I00000oOI(obj);
/* 348 */                               oOo0ll111.I00iOIl = ((Number) obj).intValue();
/* 373 */                               return ooiIlOl1iI;
                                    }
/* 258 */                           if (i4 != 3) {
/* 271 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                                return null;
                                    }
/* 265 */                           oOo0ll1112 = (OOo0ll111) ((Serializable) this.I00iio);
/* 267 */                           lIoii1l01l0i.I00000oOI(obj);
/* 371 */                           oOo0ll1112.I00iOIl = ((Number) obj).intValue();
/* 373 */                           return ooiIlOl1iI;
                                }
/* 290 */                       oOo0ooi = (OOo0ooi) ((Serializable) this.I00iio);
/* 292 */                       lIoii1l01l0i.I00000oOI(obj);
                            }
/* 324 */                   oOo0ooi.I00iOIl = obj;
/* 326 */                   Ol0Oiooo ol0OioooI0000Il00O = ii1OIIlOi.I0000Il00O();
/* 330 */                   this.I00iio = oOo0ll1112;
/* 332 */                   this.I00iiI = 2;
/* 334 */                   obj = ol0OioooI0000Il00O.I00000oIO();
/* 338 */                   if (obj == ii0111o) {
/* 363 */                       return ii0111o;
                            }
/* 341 */                   oOo0ll111 = oOo0ll1112;
/* 348 */                   oOo0ll111.I00iOIl = ((Number) obj).intValue();
/* 373 */                   return ooiIlOl1iI;
                        case 1:
/* 122 */                   Ii1OIIlOi ii1OIIlOi2 = (Ii1OIIlOi) obj4;
/* 124 */                   Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 126 */                   int i5 = this.I00iiI;
/* 128 */                   if (i5 == 0) {
/* 159 */                       lIoii1l01l0i.I00000oOI(obj);
/* 162 */                       this.I00iiI = 1;
/* 164 */                       obj = ii1OIIlOi2.I000O01llI0(true, this);
/* 168 */                       if (obj != ii0111o2) {
                                }
/* 230 */                       return ii0111o2;
                            }
/* 130 */                   if (i5 != 1) {
/* 132 */                       if (i5 != 2) {
/* 134 */                           if (i5 != 3) {
/* 143 */                               I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                                return null;
                                    }
/* 136 */                           Object obj6 = this.I00iio;
/* 138 */                           lIoii1l01l0i.I00000oOI(obj);
/* 239 */                           return obj6;
                                }
/* 149 */                       ii11I1iOiIo = (Ii11I1iOiIo) this.I00iio;
/* 151 */                       lIoii1l01l0i.I00000oOI(obj);
/* 198 */                       obj2 = ii11I1iOiIo.I00000oOI;
/* 210 */                       if ((obj2 == null ? obj2.hashCode() : 0) == ii11I1iOiIo.I0000Il00O) {
/* 236 */                           I000II.I001IO000("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
/* 14 */                            return null;
                                }
/* 218 */                       if (!O0000Ioio00.I0000O(ii11I1iOiIo.I00000oOI, obj)) {
/* 220 */                           this.I00iio = obj;
/* 222 */                           this.I00iiI = 3;
                                    break;
                                }
/* 232 */                       return obj;
                            }
/* 155 */                   lIoii1l01l0i.I00000oOI(obj);
/* 171 */                   Ii11I1iOiIo ii11I1iOiIo2 = (Ii11I1iOiIo) obj;
/* 175 */                   Ii00l101O ii00l101O = (Ii00l101O) this.I00ilI0I1;
/* 181 */                   Ii1O001loIoO ii1O001loIoO = new Ii1O001loIoO((IlliIl1l11O) obj3, ii11I1iOiIo2, iOoil1iiIilo, i3);
/* 184 */                   this.I00iio = ii11I1iOiIo2;
/* 186 */                   this.I00iiI = 2;
/* 188 */                   Object objI0000oI00 = iOi1II01i0.I0000oI00(ii00l101O, ii1O001loIoO, this);
/* 192 */                   if (objI0000oI00 != ii0111o2) {
/* 196 */                       ii11I1iOiIo = ii11I1iOiIo2;
/* 197 */                       obj = objI0000oI00;
/* 198 */                       obj2 = ii11I1iOiIo.I00000oOI;
/* 210 */                       if ((obj2 == null ? obj2.hashCode() : 0) == ii11I1iOiIo.I0000Il00O) {
                                }
                            }
/* 230 */                   return ii0111o2;
                        default:
/* 18 */                    IlIl0oi1 ilIl0oi1 = (IlIl0oi1) obj4;
/* 20 */                    File file = ilIl0oi1.I00000oIO;
/* 22 */                    Ii0111o ii0111o3 = Ii0111o.I00iOIl;
/* 24 */                    int i6 = this.I00iiI;
/* 26 */                    if (i6 == 0) {
/* 49 */                        lIoii1l01l0i.I00000oOI(obj);
                                try {
/* 54 */                            FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                                    try {
/* 57 */                                OiliO1i1iIII oiliO1i1iIII = ilIl0oi1.I00000oOI;
/* 61 */                                OOl1lI0oI oOl1lI0oI = new OOl1lI0oI();
/* 64 */                                oOl1lI0oI.I00iiI = fileOutputStream3;
/* 66 */                                VarHandle.storeStoreFence();
/* 69 */                                this.I00iio = fileOutputStream3;
/* 71 */                                this.I00ilI0I1 = fileOutputStream3;
/* 73 */                                this.I00iiI = 1;
/* 75 */                                oiliO1i1iIII.I0000Il00O(obj3, oOl1lI0oI);
/* 78 */                                if (ooiIlOl1iI == ii0111o3) {
/* 80 */                                    return ii0111o3;
                                        }
/* 82 */                                fileOutputStream = fileOutputStream3;
/* 83 */                                fileOutputStream2 = fileOutputStream;
                                    } catch (Throwable th2) {
/* 99 */                                th = th2;
/* 100 */                               fileOutputStream = fileOutputStream3;
/* 101 */                               throw th;
                                    }
                                } catch (Exception e) {
/* 109 */                           if (e instanceof FileNotFoundException) {
/* 121 */                               throw il1Oll0Ii.I00000oIO(file.getParent(), (FileNotFoundException) e);
                                    }
/* 121 */                           throw e;
                                }
                            } else {
/* 28 */                        if (i6 != 1) {
/* 44 */                            I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 14 */                            return null;
                                }
/* 32 */                        fileOutputStream2 = (FileOutputStream) this.I00ilI0I1;
/* 36 */                        fileOutputStream = (FileOutputStream) this.I00iio;
                                try {
/* 38 */                            lIoii1l01l0i.I00000oOI(obj);
                                } catch (Throwable th3) {
/* 42 */                            th = th3;
                                    try {
/* 101 */                               throw th;
                                    } catch (Throwable th4) {
/* 103 */                               ii1OOii.I00000oIO(fileOutputStream, th);
/* 106 */                               throw th4;
                                    }
                                }
                            }
/* 88 */                    fileOutputStream2.getFD().sync();
/* 91 */                    ii1OOii.I00000oIO(fileOutputStream, null);
/* 94 */                    return ooiIlOl1iI;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public Ii1O1I(IlIl0oi1 ilIl0oi1, Object obj, IOoil1iiIilo iOoil1iiIilo) {
                    super(1, iOoil1iiIilo);
/* 15 */            this.I00iiO = ilIl0oi1;
                    this.I00ilO0 = obj;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 15 */        public Ii1O1I(Ii1OIIlOi ii1OIIlOi, Ii00l101O ii00l101O, IlliIl1l11O illiIl1l11O, IOoil1iiIilo iOoil1iiIilo) {
                    super(1, iOoil1iiIilo);
/* 16 */            this.I00iiO = ii1OIIlOi;
                    this.I00ilI0I1 = ii00l101O;
                    this.I00ilO0 = illiIl1l11O;
                }
            }
