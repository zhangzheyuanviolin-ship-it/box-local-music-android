            package p000;
            
            public final class IlOi1ilII {
                public float I00000oIO;
                public float I00000oOI;
                public float I0000Il00O;
                public float I0000O;
                public I10i01 I0000oI00;
                public IooiIloo0i I0001Ioi1lo;
                public IooiIloo0i I000II;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /* JADX WARN: Type inference failed for: r5v2, types: [OoiIlOl1iI, java.lang.Object] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oIO(IooiIloo0i iooiIloo0i, IOoilo iOoilo) throws Throwable {
                    IlOi0o ilOi0o;
/* 1 */             I10i01 i10i01 = this.I0000oI00;
/* 5 */             if (iOoilo instanceof IlOi0o) {
/* 8 */                 ilOi0o = (IlOi0o) iOoilo;
/* 10 */                int i = ilOi0o.I00iio;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    ilOi0o.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    ilOi0o = new IlOi0o(this, iOoilo);
                        }
                    }
/* 27 */            Object obj = ilOi0o.I00iiI;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = ilOi0o.I00iio;
                    try {
/* 34 */                if (i2 == 0) {
/* 53 */                    lIoii1l01l0i.I00000oOI(obj);
/* 77 */                    float f = iooiIloo0i instanceof OOIII1oOoolO ? this.I00000oOI : iooiIloo0i instanceof IoI1l00l ? this.I0000Il00O : iooiIloo0i instanceof Ili10OO0ii ? this.I0000O : this.I00000oIO;
/* 79 */                    this.I000II = iooiIloo0i;
/* 95 */                    if (!Iil1010O.I0000Il00O(((Iil1010O) i10i01.I0000oI00.getValue()).I00iOIl, f)) {
/* 97 */                        IooiIloo0i iooiIloo0i2 = this.I0001Ioi1lo;
/* 99 */                        ilOi0o.I00iOIl = iooiIloo0i;
/* 101 */                       ilOi0o.I00iio = 1;
/* 107 */                       if (IioiI11o101O.I00000oIO(i10i01, f, iooiIloo0i2, iooiIloo0i, ilOi0o) == ii0111o) {
/* 109 */                           return ii0111o;
                                }
                            }
                        } else {
/* 36 */                    if (i2 != 1) {
/* 48 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 51 */                        return null;
                            }
/* 38 */                    iooiIloo0i = ilOi0o.I00iOIl;
/* 40 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
/* 110 */               this.I0001Ioi1lo = iooiIloo0i;
/* 112 */               this = OoiIlOl1iI.I00000oIO;
/* 114 */               return this;
                    } catch (Throwable th) {
/* 115 */               this.I0001Ioi1lo = iooiIloo0i;
/* 332 */               throw th;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(IOoilo iOoilo) throws Throwable {
                    IlOi0ooiI ilOi0ooiI;
/* 1 */             I10i01 i10i01 = this.I0000oI00;
/* 5 */             if (iOoilo instanceof IlOi0ooiI) {
/* 8 */                 ilOi0ooiI = (IlOi0ooiI) iOoilo;
/* 10 */                int i = ilOi0ooiI.I00iiO;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    ilOi0ooiI.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    ilOi0ooiI = new IlOi0ooiI(this, iOoilo);
                        }
                    }
/* 27 */            Object obj = ilOi0ooiI.I00iOIl;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = ilOi0ooiI.I00iiO;
                    try {
/* 34 */                if (i2 == 0) {
/* 51 */                    lIoii1l01l0i.I00000oOI(obj);
/* 54 */                    IooiIloo0i iooiIloo0i = this.I000II;
/* 77 */                    float f = iooiIloo0i instanceof OOIII1oOoolO ? this.I00000oOI : iooiIloo0i instanceof IoI1l00l ? this.I0000Il00O : iooiIloo0i instanceof Ili10OO0ii ? this.I0000O : this.I00000oIO;
/* 93 */                    if (!Iil1010O.I0000Il00O(((Iil1010O) i10i01.I0000oI00.getValue()).I00iOIl, f)) {
/* 95 */                        Iil1010O iil1010OI00000oIO = Iil1010O.I00000oIO(f);
/* 99 */                        ilOi0ooiI.I00iiO = 1;
/* 105 */                       if (i10i01.I0001Ioi1lo(ilOi0ooiI, iil1010OI00000oIO) == ii0111o) {
/* 107 */                           return ii0111o;
                                }
                            }
/* 118 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 36 */                if (i2 != 1) {
/* 46 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 49 */                    return null;
                        }
/* 38 */                lIoii1l01l0i.I00000oOI(obj);
/* 118 */               return OoiIlOl1iI.I00000oIO;
                    } finally {
/* 115 */               this.I0001Ioi1lo = this.I000II;
                    }
                }
            }
