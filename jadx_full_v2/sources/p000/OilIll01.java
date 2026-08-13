            package p000;

            import com.google.mlkit.genai.common.DownloadCallback;
            import java.lang.invoke.VarHandle;
            import java.util.concurrent.atomic.AtomicInteger;
            
/* 19 */    public final class OilIll01 extends Oll0io implements IlliIl1l11O {
                public final int I00iOIl = 0;
                public int I00iiI;
                public int I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;
                public final Object I00io1l;
                public final Object I00ioIO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OilIll01(o0oi0ioiO o0oi0ioio, iOil1lO10l ioil1lo10l, DownloadCallback downloadCallback, IOi10loi iOi10loi, AtomicInteger atomicInteger, int i, IOoil1iiIilo iOoil1iiIilo) {
/* 17 */            super(2, iOoil1iiIilo);
/* 4 */             this.I00iio = o0oi0ioio;
/* 6 */             this.I00ilI0I1 = ioil1lo10l;
/* 8 */             this.I00ilO0 = downloadCallback;
/* 10 */            this.I00io1l = iOi10loi;
/* 12 */            this.I00ioIO = atomicInteger;
/* 14 */            this.I00iiO = i;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             Object obj2 = this.I00ioIO;
/* 5 */             Object obj3 = this.I00io1l;
                    switch (i) {
                        case 0:
/* 47 */                    return new OilIll01((OilIlo) obj2, (Oil1lO) obj3, iOoil1iiIilo);
                        default:
/* 36 */                    return new OilIll01((o0oi0ioiO) this.I00iio, (iOil1lO10l) this.I00ilI0I1, (DownloadCallback) this.I00ilO0, (IOi10loi) obj3, (AtomicInteger) obj2, this.I00iiO, iOoil1iiIilo);
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
/* 18 */            return ((OilIll01) create(ii0110, iOoil1iiIilo)).invokeSuspend(ooiIlOl1iI);
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x011a  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x014b  */
                /* JADX WARN: Removed duplicated region for block: B:59:0x00b5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c3 -> B:26:0x0089). Please report as a decompilation issue!!! */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0100 -> B:44:0x0103). Please report as a decompilation issue!!! */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OI11ol oI11ol;
                    OOo0ooi oOo0ooi;
                    int i;
                    Oil1lO oil1lO;
                    Object objI0000oI00;
                    OilIlo oilIlo;
                    float[] fArrI00000oIO;
                    switch (this.I00iOIl) {
                        case 0:
/* 71 */                    Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 73 */                    int i2 = this.I00iiO;
/* 75 */                    IOoil1iiIilo iOoil1iiIilo = null;
/* 78 */                    if (i2 == 0) {
/* 135 */                       lIoii1l01l0i.I00000oOI(obj);
/* 152 */                       if (!((OilIl00O1o) ((OilIlo) this.I00ioIO).I00000oOI.getValue()).I00000oIO) {
                                }
                            } else if (i2 == 1) {
/* 131 */                       lIoii1l01l0i.I00000oOI(obj);
/* 172 */                       oOo0ooi = new OOo0ooi();
/* 177 */                       oilIlo = (OilIlo) this.I00ioIO;
                                synchronized (oilIlo.I0001Ioi1lo) {
                                }
                            } else if (i2 == 2) {
/* 108 */                       int i3 = this.I00iiI;
/* 112 */                       oil1lO = (Oil1lO) this.I00ilO0;
/* 116 */                       OI11ol oI11ol2 = (OI11ol) this.I00ilI0I1;
/* 120 */                       oOo0ooi = (OOo0ooi) this.I00iio;
/* 122 */                       lIoii1l01l0i.I00000oOI(obj);
/* 127 */                       i = i3;
/* 128 */                       oI11ol = oI11ol2;
/* 229 */                       float[] fArr = (float[]) oOo0ooi.I00iOIl;
/* 231 */                       this.I00iio = null;
/* 233 */                       this.I00ilI0I1 = oI11ol;
/* 235 */                       this.I00ilO0 = null;
/* 237 */                       this.I00iiI = i;
/* 239 */                       this.I00iiO = 3;
/* 241 */                       oil1lO.getClass();
/* 253 */                       objI0000oI00 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new O00lOIIO(oil1lO, fArr, iOoil1iiIilo, 27), this);
/* 257 */                       if (objI0000oI00 == ii0111o) {
                                }
/* 262 */                       String str = ((Oil1oo000i) objI0000oI00).I00000oIO;
/* 264 */                       oI11ol.I00000oOI(null);
/* 281 */                       if (((OilIl00O1o) ((OilIlo) this.I00ioIO).I00000oOI.getValue()).I00000oIO) {
                                }
/* 152 */                       if (!((OilIl00O1o) ((OilIlo) this.I00ioIO).I00000oOI.getValue()).I00000oIO) {
                                }
                            } else {
/* 84 */                        if (i2 != 3) {
/* 102 */                           I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 75 */                            return null;
                                }
/* 88 */                        oI11ol = (OI11ol) this.I00ilI0I1;
                                try {
/* 90 */                            lIoii1l01l0i.I00000oOI(obj);
/* 93 */                            objI0000oI00 = obj;
/* 262 */                           String str2 = ((Oil1oo000i) objI0000oI00).I00000oIO;
/* 264 */                           oI11ol.I00000oOI(null);
/* 281 */                           if (((OilIl00O1o) ((OilIlo) this.I00ioIO).I00000oOI.getValue()).I00000oIO && str2.length() > 0) {
/* 293 */                               OlO0OIIl1 olO0OIIl1 = ((OilIlo) this.I00ioIO).I00000oOI;
/* 320 */                               olO0OIIl1.I000lI(null, OilIl00O1o.I00000oIO((OilIl00O1o) olO0OIIl1.getValue(), false, false, str2, null, null, false, false, false, false, null, 1019));
                                    }
/* 152 */                           if (!((OilIl00O1o) ((OilIlo) this.I00ioIO).I00000oOI.getValue()).I00000oIO) {
/* 154 */                               this.I00iio = null;
/* 156 */                               this.I00ilI0I1 = null;
/* 158 */                               this.I00iiO = 1;
/* 166 */                               if (il0l1o1l.I00000oOI(600L, this) == ii0111o) {
/* 334 */                                   return ii0111o;
                                        }
/* 172 */                               oOo0ooi = new OOo0ooi();
/* 177 */                               oilIlo = (OilIlo) this.I00ioIO;
                                        synchronized (oilIlo.I0001Ioi1lo) {
/* 188 */                                   fArrI00000oIO = liI0oli01O0.I00000oIO(OilIlo.I000OOo1O(oilIlo.I0001Ioi1lo));
/* 192 */                                   oOo0ooi.I00iOIl = fArrI00000oIO;
                                        }
/* 196 */                               if (fArrI00000oIO.length != 0) {
/* 203 */                                   oI11ol = ((OilIlo) this.I00ioIO).I000II;
/* 207 */                                   oil1lO = (Oil1lO) this.I00io1l;
/* 209 */                                   this.I00iio = oOo0ooi;
/* 211 */                                   this.I00ilI0I1 = oI11ol;
/* 213 */                                   this.I00ilO0 = oil1lO;
/* 215 */                                   i = 0;
/* 216 */                                   this.I00iiI = 0;
/* 218 */                                   this.I00iiO = 2;
/* 224 */                                   if (oI11ol.I00000oIO(this) == ii0111o) {
/* 334 */                                       return ii0111o;
                                            }
/* 229 */                                   float[] fArr2 = (float[]) oOo0ooi.I00iOIl;
/* 231 */                                   this.I00iio = null;
/* 233 */                                   this.I00ilI0I1 = oI11ol;
/* 235 */                                   this.I00ilO0 = null;
/* 237 */                                   this.I00iiI = i;
/* 239 */                                   this.I00iiO = 3;
/* 241 */                                   oil1lO.getClass();
/* 253 */                                   objI0000oI00 = iOi1II01i0.I0000oI00(IiiIil1lOIO.I00000oIO, new O00lOIIO(oil1lO, fArr2, iOoil1iiIilo, 27), this);
/* 257 */                                   if (objI0000oI00 == ii0111o) {
/* 334 */                                       return ii0111o;
                                            }
/* 262 */                                   String str22 = ((Oil1oo000i) objI0000oI00).I00000oIO;
/* 264 */                                   oI11ol.I00000oOI(null);
/* 281 */                                   if (((OilIl00O1o) ((OilIlo) this.I00ioIO).I00000oOI.getValue()).I00000oIO) {
/* 293 */                                       OlO0OIIl1 olO0OIIl12 = ((OilIlo) this.I00ioIO).I00000oOI;
/* 320 */                                       olO0OIIl12.I000lI(null, OilIl00O1o.I00000oIO((OilIl00O1o) olO0OIIl12.getValue(), false, false, str22, null, null, false, false, false, false, null, 1019));
                                            }
                                        }
/* 152 */                               if (!((OilIl00O1o) ((OilIlo) this.I00ioIO).I00000oOI.getValue()).I00000oIO) {
/* 332 */                                   return OoiIlOl1iI.I00000oIO;
                                        }
                                    }
                                } catch (Throwable th) {
/* 325 */                           oI11ol.I00000oOI(null);
/* 328 */                           throw th;
                                }
                            }
                        default:
/* 9 */                     Ii0111o ii0111o2 = Ii0111o.I00iOIl;
/* 11 */                    int i4 = this.I00iiI;
/* 13 */                    lIoii1l01l0i.I00000oOI(obj);
/* 16 */                    if (i4 == 0) {
/* 21 */                        o0oi0ioiO o0oi0ioio = (o0oi0ioiO) this.I00iio;
/* 25 */                        iOil1lO10l ioil1lo10l = (iOil1lO10l) this.I00ilI0I1;
/* 29 */                        DownloadCallback downloadCallback = (DownloadCallback) this.I00ilO0;
/* 33 */                        IOi10loi iOi10loi = (IOi10loi) this.I00io1l;
/* 37 */                        AtomicInteger atomicInteger = (AtomicInteger) this.I00ioIO;
/* 39 */                        int i5 = this.I00iiO;
/* 43 */                        o0o0OiOiI1 o0o0oioii1 = new o0o0OiOiI1(1);
/* 46 */                        o0o0oioii1.I00iiI = atomicInteger;
/* 48 */                        o0o0oioii1.I00iiO = i5;
/* 50 */                        o0o0oioii1.I00iio = downloadCallback;
/* 52 */                        VarHandle.storeStoreFence();
/* 55 */                        this.I00iiI = 1;
/* 65 */                        if (o0oi0ioio.I00000oOI(ioil1lo10l, downloadCallback, true, iOi10loi, o0o0oioii1, this) == ii0111o2) {
/* 70 */                            return ii0111o2;
                                }
                            }
/* 68 */                    return OoiIlOl1iI.I00000oIO;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 20 */        public OilIll01(OilIlo oilIlo, Oil1lO oil1lO, IOoil1iiIilo iOoil1iiIilo) {
                    super(2, iOoil1iiIilo);
/* 21 */            this.I00ioIO = oilIlo;
                    this.I00io1l = oil1lO;
                }
            }
