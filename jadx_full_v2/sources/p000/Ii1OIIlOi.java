            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Ii1OIIlOi implements Ii1I1ooo10O0 {
                public IlIi11li I00000oIO;
                public Ii01l1Ii0i I00000oOI;
                public Ii0110 I0000Il00O;
                public Ii1Io1loiI I0000O;
                public OI1I0OoOl I0000oI00;
                public int I0001Ioi1lo;
                public OlIl0i I000II;
                public Ii1OIo10 I000O01llI0;
                public o01l1ioOo0 I000OOo1O;
                public OllO00oiil I000OiO;
                public OllO00oiil I000iOII;
                public iOliil I000l1;

                @Override
                public final Object I00000oIO(IlliIl1l11O illiIl1l11O, IOoil1iiIilo iOoil1iiIilo) {
/* 11 */            Ool0I0110O0 ool0I0110O0 = (Ool0I0110O0) iOoil1iiIilo.getContext().I00lli11(loIOiIO1O1.I00li1OI);
/* 13 */            if (ool0I0110O0 != null) {
/* 15 */                ool0I0110O0.I00000oIO(this);
                    }
/* 20 */            Ool0I0110O0 ool0I0110O02 = new Ool0I0110O0();
/* 23 */            ool0I0110O02.I00iOIl = ool0I0110O0;
/* 25 */            ool0I0110O02.I00iiI = this;
/* 27 */            VarHandle.storeStoreFence();
/* 38 */            return iOi1II01i0.I0000oI00(ool0I0110O02, new I00oIiI10(this, illiIl1l11O, null, 27), iOoil1iiIilo);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(IOoilo iOoilo) throws Throwable {
                    Ii1Iol00oIIO ii1Iol00oIIO;
                    OI1I0OoOl oI1I0OoOl;
/* 3 */             if (iOoilo instanceof Ii1Iol00oIIO) {
/* 6 */                 ii1Iol00oIIO = (Ii1Iol00oIIO) iOoilo;
/* 8 */                 int i = ii1Iol00oIIO.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ii1Iol00oIIO.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ii1Iol00oIIO = new Ii1Iol00oIIO(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = ii1Iol00oIIO.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ii1Iol00oIIO.I00iio;
/* 33 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(obj);
/* 52 */                OI1I0OoOl oI1I0OoOl2 = this.I0000oI00;
/* 54 */                ii1Iol00oIIO.I00iOIl = oI1I0OoOl2;
/* 56 */                ii1Iol00oIIO.I00iio = 1;
/* 62 */                if (oI1I0OoOl2.I00000oIO(ii1Iol00oIIO) == ii0111o) {
/* 64 */                    return ii0111o;
                        }
/* 65 */                oI1I0OoOl = oI1I0OoOl2;
                    } else {
/* 35 */                if (i2 != 1) {
/* 45 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 32 */                    return null;
                        }
/* 37 */                oI1I0OoOl = ii1Iol00oIIO.I00iOIl;
/* 39 */                lIoii1l01l0i.I00000oOI(obj);
                    }
                    try {
                        int i3 = this.I0001Ioi1lo - 1;
/* 70 */                this.I0001Ioi1lo = i3;
/* 72 */                if (i3 == 0) {
/* 74 */                    OlIl0i olIl0i = this.I000II;
/* 76 */                    if (olIl0i != null) {
/* 78 */                        olIl0i.I000II(null);
                            }
/* 84 */                    this.I000II = null;
                        }
/* 86 */                oI1I0OoOl.I00000oOI(null);
/* 89 */                return OoiIlOl1iI.I00000oIO;
                    } catch (Throwable th) {
/* 92 */                oI1I0OoOl.I00000oOI(null);
/* 168 */               throw th;
                    }
                }

                public final Ol0Oiooo I0000Il00O() {
/* 7 */             return (Ol0Oiooo) this.I000iOII.getValue();
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0066  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000O(O1l0oolOoioi o1l0oolOoioi, IOoilo iOoilo) throws Throwable {
                    Ii1Ioollo ii1Ioollo;
                    IOi10loi iOi10loi;
                    Throwable thI00000oOI;
/* 3 */             if (iOoilo instanceof Ii1Ioollo) {
/* 6 */                 ii1Ioollo = (Ii1Ioollo) iOoilo;
/* 8 */                 int i = ii1Ioollo.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ii1Ioollo.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ii1Ioollo = new Ii1Ioollo(this, iOoilo);
                        }
                    }
/* 25 */            Object objI00000oIO = ii1Ioollo.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ii1Ioollo.I00iio;
/* 31 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 33 */            if (i2 == 0) {
/* 51 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 54 */                IOi10loi iOi10loi2 = o1l0oolOoioi.I00000oOI;
                        try {
/* 62 */                    Ii00l101O ii00l101OI00ioIO = o1l0oolOoioi.I0000O.I00ioIO(ii1Ioollo.getContext());
/* 69 */                    Ii1O001loIoO ii1O001loIoO = new Ii1O001loIoO(this, o1l0oolOoioi, iOoil1iiIilo, 0);
/* 72 */                    ii1Ioollo.I00iOIl = iOi10loi2;
/* 74 */                    ii1Ioollo.I00iio = 1;
/* 76 */                    Object objI0000oI00 = iOi1II01i0.I0000oI00(ii00l101OI00ioIO, ii1O001loIoO, ii1Ioollo);
/* 80 */                    if (objI0000oI00 == ii0111o) {
/* 82 */                        return ii0111o;
                            }
/* 84 */                    objI00000oIO = objI0000oI00;
/* 85 */                    iOi10loi = iOi10loi2;
                        } catch (Throwable th) {
/* 87 */                    th = th;
/* 88 */                    iOi10loi = iOi10loi2;
/* 89 */                    objI00000oIO = lIoii1l01l0i.I00000oIO(th);
/* 93 */                    thI00000oOI = Oi10ii.I00000oOI(objI00000oIO);
/* 97 */                    if (thI00000oOI == null) {
                            }
/* 106 */                   return OoiIlOl1iI.I00000oIO;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 47 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                iOi10loi = ii1Ioollo.I00iOIl;
                        try {
/* 39 */                    lIoii1l01l0i.I00000oOI(objI00000oIO);
                        } catch (Throwable th2) {
/* 43 */                    th = th2;
/* 89 */                    objI00000oIO = lIoii1l01l0i.I00000oIO(th);
/* 93 */                    thI00000oOI = Oi10ii.I00000oOI(objI00000oIO);
/* 97 */                    if (thI00000oOI == null) {
                            }
/* 106 */                   return OoiIlOl1iI.I00000oIO;
                        }
                    }
/* 93 */            thI00000oOI = Oi10ii.I00000oOI(objI00000oIO);
/* 97 */            if (thI00000oOI == null) {
/* 99 */                iOi10loi.I00O10llo(objI00000oIO);
                    } else {
/* 103 */               iOi10loi.I00iIO(thI00000oOI);
                    }
/* 106 */           return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000oI00(IOoilo iOoilo) throws Throwable {
                    Ii1O00OOoo ii1O00OOoo;
                    OI1I0OoOl oI1I0OoOl;
/* 3 */             if (iOoilo instanceof Ii1O00OOoo) {
/* 6 */                 ii1O00OOoo = (Ii1O00OOoo) iOoilo;
/* 8 */                 int i = ii1O00OOoo.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ii1O00OOoo.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ii1O00OOoo = new Ii1O00OOoo(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = ii1O00OOoo.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ii1O00OOoo.I00iio;
/* 31 */            int i3 = 1;
/* 32 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 33 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(obj);
/* 52 */                OI1I0OoOl oI1I0OoOl2 = this.I0000oI00;
/* 54 */                ii1O00OOoo.I00iOIl = oI1I0OoOl2;
/* 56 */                ii1O00OOoo.I00iio = 1;
/* 62 */                if (oI1I0OoOl2.I00000oIO(ii1O00OOoo) == ii0111o) {
/* 64 */                    return ii0111o;
                        }
/* 65 */                oI1I0OoOl = oI1I0OoOl2;
                    } else {
/* 35 */                if (i2 != 1) {
/* 45 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 32 */                    return null;
                        }
/* 37 */                oI1I0OoOl = ii1O00OOoo.I00iOIl;
/* 39 */                lIoii1l01l0i.I00000oOI(obj);
                    }
                    try {
/* 68 */                int i4 = this.I0001Ioi1lo + 1;
/* 69 */                this.I0001Ioi1lo = i4;
/* 71 */                if (i4 == 1) {
/* 85 */                    this.I000II = iOi1II01i0.I0000O(this.I0000Il00O, null, null, new Ii1IiiOOOO(this, iOoil1iiIilo, i3), 3);
                        }
/* 90 */                oI1I0OoOl.I00000oOI(null);
/* 93 */                return OoiIlOl1iI.I00000oIO;
                    } catch (Throwable th) {
/* 96 */                oI1I0OoOl.I00000oOI(null);
/* 168 */               throw th;
                    }
                }

                /* JADX WARN: Code restructure failed: missing block: B:25:0x0059, code lost:
                
                    if (r2.I00100o1O0lo(r0) == r1) goto L26;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0001Ioi1lo(IOoilo iOoilo) throws Throwable {
                    Ii1O0I1 ii1O0I1;
                    int iIntValue;
                    int i;
                    Throwable th;
/* 3 */             if (iOoilo instanceof Ii1O0I1) {
/* 6 */                 ii1O0I1 = (Ii1O0I1) iOoilo;
/* 8 */                 int i2 = ii1O0I1.I00iio;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    ii1O0I1.I00iio = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ii1O0I1 = new Ii1O0I1(this, iOoilo);
                        }
                    }
/* 25 */            Object objI00000oIO = ii1O0I1.I00iiI;
/* 27 */            Object obj = Ii0111o.I00iOIl;
/* 29 */            int i3 = ii1O0I1.I00iio;
                    try {
/* 33 */                if (i3 == 0) {
/* 58 */                    lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 61 */                    Ol0Oiooo ol0OioooI0000Il00O = I0000Il00O();
/* 65 */                    ii1O0I1.I00iio = 1;
/* 67 */                    objI00000oIO = ol0OioooI0000Il00O.I00000oIO();
/* 71 */                    if (objI00000oIO != obj) {
                            }
/* 92 */                    return obj;
                        }
/* 35 */                if (i3 != 1) {
/* 37 */                    if (i3 != 2) {
/* 49 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 52 */                        return null;
                            }
/* 39 */                    i = ii1O0I1.I00iOIl;
                            try {
/* 41 */                        lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 93 */                        return OoiIlOl1iI.I00000oIO;
                            } catch (Throwable th2) {
/* 45 */                        th = th2;
/* 107 */                       this.I000O01llI0.I0000Il00O(new OOlIilOIlOi1(th, i));
/* 168 */                       throw th;
                            }
                        }
/* 54 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 80 */                o01l1ioOo0 o01l1iooo0 = this.I000OOo1O;
/* 82 */                ii1O0I1.I00iOIl = iIntValue;
/* 84 */                ii1O0I1.I00iio = 2;
                    } catch (Throwable th3) {
/* 98 */                i = iIntValue;
/* 99 */                th = th3;
/* 107 */               this.I000O01llI0.I0000Il00O(new OOlIilOIlOi1(th, i));
/* 168 */               throw th;
                    }
/* 76 */            iIntValue = ((Number) objI00000oIO).intValue();
                }

                /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
                
                    if (r11 == r2) goto L37;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:36:0x00a0, code lost:
                
                    if (r11 == r2) goto L37;
                 */
                /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000II(boolean z, IOoil1iiIilo iOoil1iiIilo) {
                    Ii1O0i0ii ii1O0i0ii;
                    OlO00iO01io olO00iO01ioI00000oOI;
                    OIoi0IIoi oIoi0IIoi;
/* 1 */             Ii1OIo10 ii1OIo10 = this.I000O01llI0;
/* 5 */             if (iOoil1iiIilo instanceof Ii1O0i0ii) {
/* 8 */                 ii1O0i0ii = (Ii1O0i0ii) iOoil1iiIilo;
/* 10 */                int i = ii1O0i0ii.I00ilI0I1;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    ii1O0i0ii.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    ii1O0i0ii = new Ii1O0i0ii(this, iOoil1iiIilo);
                        }
                    }
/* 27 */            Object objI00000oIO = ii1O0i0ii.I00iiO;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = ii1O0i0ii.I00ilI0I1;
/* 33 */            int i3 = 3;
/* 36 */            IOoil1iiIilo iOoil1iiIilo2 = null;
/* 37 */            if (i2 == 0) {
/* 68 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 71 */                olO00iO01ioI00000oOI = ii1OIo10.I00000oOI();
/* 77 */                if (olO00iO01ioI00000oOI instanceof Ooi1ol) {
/* 186 */                   I000II.I001IO000("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
/* 36 */                    return null;
                        }
/* 79 */                Ol0Oiooo ol0OioooI0000Il00O = I0000Il00O();
/* 83 */                ii1O0i0ii.I00iiI = olO00iO01ioI00000oOI;
/* 85 */                ii1O0i0ii.I00iOIl = z;
/* 87 */                ii1O0i0ii.I00ilI0I1 = 1;
/* 89 */                objI00000oIO = ol0OioooI0000Il00O.I00000oIO();
/* 93 */                if (objI00000oIO != ii0111o) {
                        }
/* 163 */               return ii0111o;
                    }
/* 39 */            if (i2 != 1) {
/* 41 */                if (i2 == 2) {
/* 56 */                    lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 140 */                   oIoi0IIoi = (OIoi0IIoi) objI00000oIO;
/* 168 */                   OlO00iO01io olO00iO01io = (OlO00iO01io) oIoi0IIoi.I00iOIl;
/* 178 */                   if (((Boolean) oIoi0IIoi.I00iiI).booleanValue()) {
                            }
/* 183 */                   return olO00iO01io;
                        }
/* 43 */                if (i2 != 3) {
/* 52 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 36 */                    return null;
                        }
/* 45 */                lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 164 */               oIoi0IIoi = (OIoi0IIoi) objI00000oIO;
/* 168 */               OlO00iO01io olO00iO01io2 = (OlO00iO01io) oIoi0IIoi.I00iOIl;
/* 178 */               if (((Boolean) oIoi0IIoi.I00iiI).booleanValue()) {
/* 180 */                   ii1OIo10.I0000Il00O(olO00iO01io2);
                        }
/* 183 */               return olO00iO01io2;
                    }
/* 60 */            z = ii1O0i0ii.I00iOIl;
/* 62 */            olO00iO01ioI00000oOI = ii1O0i0ii.I00iiI;
/* 64 */            lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 98 */            int iIntValue = ((Number) objI00000oIO).intValue();
/* 102 */           boolean z2 = olO00iO01ioI00000oOI instanceof Ii11I1iOiIo;
/* 112 */           int i4 = z2 ? ((Ii11I1iOiIo) olO00iO01ioI00000oOI).I00000oIO : -1;
/* 113 */           if (z2 && iIntValue == i4) {
/* 117 */               return olO00iO01ioI00000oOI;
                    }
/* 118 */           if (z) {
/* 120 */               Ol0Oiooo ol0OioooI0000Il00O2 = I0000Il00O();
/* 126 */               I0l11loiOIl i0l11loiOIl = new I0l11loiOIl(this, iOoil1iiIilo2, i3);
/* 129 */               ii1O0i0ii.I00iiI = null;
/* 131 */               ii1O0i0ii.I00ilI0I1 = 2;
/* 133 */               objI00000oIO = ol0OioooI0000Il00O2.I00000oOI(i0l11loiOIl, ii1O0i0ii);
                    } else {
/* 143 */               Ol0Oiooo ol0OioooI0000Il00O3 = I0000Il00O();
/* 150 */               Ii1O0l ii1O0l = new Ii1O0l(this, i4, iOoil1iiIilo2, 0);
/* 153 */               ii1O0i0ii.I00iiI = null;
/* 155 */               ii1O0i0ii.I00ilI0I1 = 3;
/* 157 */               objI00000oIO = ol0OioooI0000Il00O3.I0000Il00O(ii1O0l, ii1O0i0ii);
                    }
/* 163 */           return ii0111o;
                }

                /* JADX WARN: Removed duplicated region for block: B:40:0x0096 A[Catch: Ii01i1 -> 0x0058, TryCatch #0 {Ii01i1 -> 0x0058, blocks: (B:19:0x0053, B:54:0x00ed, B:24:0x005d, B:51:0x00d2, B:32:0x0072, B:40:0x0096, B:42:0x009c, B:36:0x007b, B:48:0x00c3), top: B:78:0x0022 }] */
                /* JADX WARN: Removed duplicated region for block: B:41:0x009b  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
                /* JADX WARN: Removed duplicated region for block: B:53:0x00ec  */
                /* JADX WARN: Removed duplicated region for block: B:63:0x0123 A[Catch: all -> 0x014c, TryCatch #3 {all -> 0x014c, blocks: (B:61:0x0113, B:63:0x0123, B:64:0x0128), top: B:83:0x0113 }] */
                /* JADX WARN: Removed duplicated region for block: B:64:0x0128 A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #3 {all -> 0x014c, blocks: (B:61:0x0113, B:63:0x0123, B:64:0x0128), top: B:83:0x0113 }] */
                /* JADX WARN: Removed duplicated region for block: B:67:0x0138  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x0140  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000O01llI0(boolean z, IOoilo iOoilo) {
                    Ii1O0l1oO ii1O0l1oO;
                    OOo0ooi oOo0ooi;
                    Ii01i1 ii01i1;
                    OOo0ooi oOo0ooi2;
                    Ii01i1 ii01i12;
                    Ii1O1I ii1O1I;
                    OOo0ll111 oOo0ll111;
                    OOo0ooi oOo0ooi3;
                    Integer numI00000oIO;
                    boolean z2;
                    int i;
                    Object obj;
/* 3 */             if (iOoilo instanceof Ii1O0l1oO) {
/* 6 */                 ii1O0l1oO = (Ii1O0l1oO) iOoilo;
/* 8 */                 int i2 = ii1O0l1oO.I00ioIO;
/* 14 */                if ((i2 & Integer.MIN_VALUE) != 0) {
/* 17 */                    ii1O0l1oO.I00ioIO = i2 - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ii1O0l1oO = new Ii1O0l1oO(this, iOoilo);
                        }
                    }
/* 25 */            Object objI00000oIO = ii1O0l1oO.I00ilO0;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i3 = 1;
/* 32 */            int i4 = 3;
/* 34 */            IOoil1iiIilo iOoil1iiIilo = null;
                    try {
                    } catch (Ii01i1 e) {
/* 89 */                e = e;
                    }
                    switch (ii1O0l1oO.I00ioIO) {
                        case 0:
/* 119 */                   lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 122 */                   if (z) {
/* 124 */                       ii1O0l1oO.I00iOIl = z;
/* 126 */                       ii1O0l1oO.I00ioIO = 1;
/* 141 */                       objI00000oIO = ((IlIi1o0I110) this.I000OiO.getValue()).I00000oIO(new IOIllll(i4, iOoil1iiIilo), ii1O0l1oO);
/* 145 */                       if (objI00000oIO != ii0111o) {
/* 156 */                           int iHashCode = objI00000oIO == null ? objI00000oIO.hashCode() : 0;
/* 157 */                           Ol0Oiooo ol0OioooI0000Il00O = I0000Il00O();
/* 161 */                           ii1O0l1oO.I00iiI = objI00000oIO;
/* 163 */                           ii1O0l1oO.I00iOIl = z;
/* 165 */                           ii1O0l1oO.I00ilI0I1 = iHashCode;
/* 168 */                           ii1O0l1oO.I00ioIO = 2;
/* 170 */                           numI00000oIO = ol0OioooI0000Il00O.I00000oIO();
/* 174 */                           if (numI00000oIO != ii0111o) {
/* 178 */                               int i5 = iHashCode;
/* 179 */                               z2 = z;
/* 180 */                               i = i5;
/* 182 */                               obj = objI00000oIO;
/* 183 */                               objI00000oIO = numI00000oIO;
/* 192 */                               return new Ii11I1iOiIo(obj, i, ((Number) objI00000oIO).intValue());
                                    }
                                }
                            } else {
/* 196 */                       Ol0Oiooo ol0OioooI0000Il00O2 = I0000Il00O();
/* 200 */                       ii1O0l1oO.I00iOIl = z;
/* 202 */                       ii1O0l1oO.I00ioIO = 3;
/* 204 */                       objI00000oIO = ol0OioooI0000Il00O2.I00000oIO();
/* 208 */                       if (objI00000oIO != ii0111o) {
/* 213 */                           int iIntValue = ((Number) objI00000oIO).intValue();
/* 217 */                           Ol0Oiooo ol0OioooI0000Il00O3 = I0000Il00O();
/* 223 */                           Ii1O0l ii1O0l = new Ii1O0l(this, iIntValue, iOoil1iiIilo, i3);
/* 226 */                           ii1O0l1oO.I00iOIl = z;
/* 229 */                           ii1O0l1oO.I00ioIO = 4;
/* 231 */                           objI00000oIO = ol0OioooI0000Il00O3.I0000Il00O(ii1O0l, ii1O0l1oO);
/* 235 */                           if (objI00000oIO == ii0111o) {
                                    }
/* 238 */                           return (Ii11I1iOiIo) objI00000oIO;
                                }
                            }
/* 312 */                   return ii0111o;
                        case 1:
/* 113 */                   z = ii1O0l1oO.I00iOIl;
/* 115 */                   lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 156 */                   if (objI00000oIO == null) {
                            }
/* 157 */                   Ol0Oiooo ol0OioooI0000Il00O4 = I0000Il00O();
/* 161 */                   ii1O0l1oO.I00iiI = objI00000oIO;
/* 163 */                   ii1O0l1oO.I00iOIl = z;
/* 165 */                   ii1O0l1oO.I00ilI0I1 = iHashCode;
/* 168 */                   ii1O0l1oO.I00ioIO = 2;
/* 170 */                   numI00000oIO = ol0OioooI0000Il00O4.I00000oIO();
/* 174 */                   if (numI00000oIO != ii0111o) {
                            }
/* 312 */                   return ii0111o;
                        case 2:
/* 99 */                    i = ii1O0l1oO.I00ilI0I1;
/* 101 */                   z2 = ii1O0l1oO.I00iOIl;
/* 103 */                   obj = ii1O0l1oO.I00iiI;
                            try {
/* 105 */                       lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 192 */                       return new Ii11I1iOiIo(obj, i, ((Number) objI00000oIO).intValue());
                            } catch (Ii01i1 e2) {
/* 109 */                       e = e2;
/* 110 */                       z = z2;
/* 243 */                       oOo0ooi = new OOo0ooi();
/* 246 */                       Ii01l1Ii0i ii01l1Ii0i = this.I00000oOI;
/* 248 */                       ii1O0l1oO.I00iiI = e;
/* 250 */                       ii1O0l1oO.I00iiO = oOo0ooi;
/* 252 */                       ii1O0l1oO.I00iio = oOo0ooi;
/* 254 */                       ii1O0l1oO.I00iOIl = z;
/* 257 */                       ii1O0l1oO.I00ioIO = 5;
/* 259 */                       Object objI0010I0i = ii01l1Ii0i.I0010I0i(e);
/* 263 */                       if (objI0010I0i != ii0111o) {
/* 266 */                           ii01i1 = e;
/* 267 */                           objI00000oIO = objI0010I0i;
/* 268 */                           oOo0ooi2 = oOo0ooi;
/* 269 */                           oOo0ooi2.I00iOIl = objI00000oIO;
/* 273 */                           OOo0ll111 oOo0ll1112 = new OOo0ll111();
                                    try {
/* 278 */                               ii1O1I = new Ii1O1I(oOo0ooi, this, oOo0ll1112, (IOoil1iiIilo) null);
/* 281 */                               ii1O0l1oO.I00iiI = ii01i1;
/* 283 */                               ii1O0l1oO.I00iiO = oOo0ooi;
/* 285 */                               ii1O0l1oO.I00iio = oOo0ll1112;
/* 288 */                               ii1O0l1oO.I00ioIO = 6;
/* 310 */                               if ((!z ? ii1O1I.invoke(ii1O0l1oO) : I0000Il00O().I00000oOI(new IIl00I(ii1O1I, iOoil1iiIilo, i4), ii1O0l1oO)) != ii0111o) {
                                        }
                                    } catch (Throwable th) {
/* 333 */                               th = th;
/* 331 */                               ii01i12 = ii01i1;
/* 335 */                               ilIilolOlIoO.I00000oIO(ii01i12, th);
/* 338 */                               throw ii01i12;
                                    }
                                }
/* 312 */                       return ii0111o;
                            }
                        case 3:
/* 92 */                    z = ii1O0l1oO.I00iOIl;
/* 94 */                    lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 213 */                   int iIntValue2 = ((Number) objI00000oIO).intValue();
/* 217 */                   Ol0Oiooo ol0OioooI0000Il00O32 = I0000Il00O();
/* 223 */                   Ii1O0l ii1O0l2 = new Ii1O0l(this, iIntValue2, iOoil1iiIilo, i3);
/* 226 */                   ii1O0l1oO.I00iOIl = z;
/* 229 */                   ii1O0l1oO.I00ioIO = 4;
/* 231 */                   objI00000oIO = ol0OioooI0000Il00O32.I0000Il00O(ii1O0l2, ii1O0l1oO);
/* 235 */                   if (objI00000oIO == ii0111o) {
                            }
/* 238 */                   return (Ii11I1iOiIo) objI00000oIO;
                        case 4:
/* 82 */                    boolean z3 = ii1O0l1oO.I00iOIl;
/* 84 */                    lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 238 */                   return (Ii11I1iOiIo) objI00000oIO;
                        case 5:
/* 62 */                    z = ii1O0l1oO.I00iOIl;
/* 66 */                    OOo0ooi oOo0ooi4 = (OOo0ooi) ii1O0l1oO.I00iio;
/* 68 */                    OOo0ooi oOo0ooi5 = ii1O0l1oO.I00iiO;
/* 72 */                    ii01i1 = (Ii01i1) ii1O0l1oO.I00iiI;
/* 74 */                    lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 78 */                    oOo0ooi2 = oOo0ooi4;
/* 79 */                    oOo0ooi = oOo0ooi5;
/* 269 */                   oOo0ooi2.I00iOIl = objI00000oIO;
/* 273 */                   OOo0ll111 oOo0ll11122 = new OOo0ll111();
/* 278 */                   ii1O1I = new Ii1O1I(oOo0ooi, this, oOo0ll11122, (IOoil1iiIilo) null);
/* 281 */                   ii1O0l1oO.I00iiI = ii01i1;
/* 283 */                   ii1O0l1oO.I00iiO = oOo0ooi;
/* 285 */                   ii1O0l1oO.I00iio = oOo0ll11122;
/* 288 */                   ii1O0l1oO.I00ioIO = 6;
/* 310 */                   if ((!z ? ii1O1I.invoke(ii1O0l1oO) : I0000Il00O().I00000oOI(new IIl00I(ii1O1I, iOoil1iiIilo, i4), ii1O0l1oO)) != ii0111o) {
/* 313 */                       oOo0ll111 = oOo0ll11122;
/* 314 */                       oOo0ooi3 = oOo0ooi;
/* 317 */                       Object obj2 = oOo0ooi3.I00iOIl;
/* 327 */                       return new Ii11I1iOiIo(obj2, obj2 != null ? obj2.hashCode() : 0, oOo0ll111.I00iOIl);
                            }
/* 312 */                   return ii0111o;
                        case 6:
/* 46 */                    oOo0ll111 = (OOo0ll111) ii1O0l1oO.I00iio;
/* 48 */                    oOo0ooi3 = ii1O0l1oO.I00iiO;
/* 52 */                    ii01i12 = (Ii01i1) ii1O0l1oO.I00iiI;
                            try {
/* 54 */                        lIoii1l01l0i.I00000oOI(objI00000oIO);
/* 317 */                       Object obj22 = oOo0ooi3.I00iOIl;
/* 327 */                       return new Ii11I1iOiIo(obj22, obj22 != null ? obj22.hashCode() : 0, oOo0ll111.I00iOIl);
                            } catch (Throwable th2) {
/* 59 */                        th = th2;
/* 335 */                       ilIilolOlIoO.I00000oIO(ii01i12, th);
/* 338 */                       throw ii01i12;
                            }
                        default:
/* 40 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 34 */                    return null;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000OOo1O(Object obj, boolean z, IOoilo iOoilo) throws Throwable {
                    Ii1O1Ilol ii1O1Ilol;
                    OOo0ll111 oOo0ll111;
/* 3 */             if (iOoilo instanceof Ii1O1Ilol) {
/* 6 */                 ii1O1Ilol = (Ii1O1Ilol) iOoilo;
/* 8 */                 int i = ii1O1Ilol.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ii1O1Ilol.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ii1O1Ilol = new Ii1O1Ilol(this, iOoilo);
                        }
                    }
/* 25 */            Object obj2 = ii1O1Ilol.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ii1O1Ilol.I00iio;
/* 32 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(obj2);
/* 54 */                OOo0ll111 oOo0ll1112 = new OOo0ll111();
/* 63 */                IlIi1o0I110 ilIi1o0I110 = (IlIi1o0I110) this.I000OiO.getValue();
/* 71 */                Ii1O1oOli ii1O1oOli = new Ii1O1oOli(oOo0ll1112, this, obj, z, null);
/* 74 */                ii1O1Ilol.I00iOIl = oOo0ll1112;
/* 76 */                ii1O1Ilol.I00iio = 1;
/* 82 */                if (ilIi1o0I110.I00000oOI(ii1O1oOli, ii1O1Ilol) == ii0111o) {
/* 84 */                    return ii0111o;
                        }
/* 85 */                oOo0ll111 = oOo0ll1112;
                    } else {
/* 34 */                if (i2 != 1) {
/* 44 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 36 */                oOo0ll111 = ii1O1Ilol.I00iOIl;
/* 38 */                lIoii1l01l0i.I00000oOI(obj2);
                    }
/* 90 */            return new Integer(oOo0ll111.I00iOIl);
                }

                @Override
                public final IlOil1ii getData() {
/* 1 */             return this.I0000O;
                }
            }
