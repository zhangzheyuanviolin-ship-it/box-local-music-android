            package p000;
            
            public final class OOIII0OOoOi1 implements IiIooOOOI {
                public final IiIooOOOI I00iOIl;
                public boolean I00iiI;
                public boolean I00iiO;
                public final OI1I0OoOl I00iio = new OI1I0OoOl();

                public OOIII0OOoOi1(IiIooOOOI iiIooOOOI) {
/* 4 */             this.I00iOIl = iiIooOOOI;
                }

                @Override
                public final float I00000oIO() {
/* 3 */             return this.I00iOIl.I00000oIO();
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I00000oOI(IOoilo iOoilo) throws Throwable {
                    OOI1ooO oOI1ooO;
/* 3 */             if (iOoilo instanceof OOI1ooO) {
/* 6 */                 oOI1ooO = (OOI1ooO) iOoilo;
/* 8 */                 int i = oOI1ooO.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oOI1ooO.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oOI1ooO = new OOI1ooO(this, iOoilo);
                        }
                    }
/* 25 */            Object objI000II = oOI1ooO.I00iOIl;
/* 27 */            Object obj = Ii0111o.I00iOIl;
/* 29 */            int i2 = oOI1ooO.I00iiO;
/* 32 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(objI000II);
/* 50 */                oOI1ooO.I00iiO = 1;
/* 52 */                objI000II = I000II(oOI1ooO);
/* 56 */                if (objI000II == obj) {
/* 58 */                    return obj;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 42 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 36 */                lIoii1l01l0i.I00000oOI(objI000II);
                    }
/* 65 */            if (((Boolean) objI000II).booleanValue()) {
/* 67 */                return OoiIlOl1iI.I00000oIO;
                    }
/* 168 */           throw new Io011OI("The press gesture was canceled.", 0);
                }

                public final void I0000Il00O() {
/* 2 */             this.I00iiO = true;
/* 4 */             OI1I0OoOl oI1I0OoOl = this.I00iio;
/* 10 */            if (oI1I0OoOl.I0001Ioi1lo()) {
/* 13 */                oI1I0OoOl.I00000oOI(null);
                    }
                }

                public final void I0000O() {
/* 2 */             this.I00iiI = true;
/* 4 */             OI1I0OoOl oI1I0OoOl = this.I00iio;
/* 10 */            if (oI1I0OoOl.I0001Ioi1lo()) {
/* 13 */                oI1I0OoOl.I00000oOI(null);
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0001Ioi1lo(IOoilo iOoilo) throws Throwable {
                    OOII00l oOII00l;
/* 3 */             if (iOoilo instanceof OOII00l) {
/* 6 */                 oOII00l = (OOII00l) iOoilo;
/* 8 */                 int i = oOII00l.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oOII00l.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oOII00l = new OOII00l(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = oOII00l.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oOII00l.I00iiO;
/* 32 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(obj);
/* 50 */                oOII00l.I00iiO = 1;
/* 58 */                if (this.I00iio.I00000oIO(oOII00l) == ii0111o) {
/* 60 */                    return ii0111o;
                        }
                    } else {
/* 34 */                if (i2 != 1) {
/* 42 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 45 */                    return null;
                        }
/* 36 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 62 */            this.I00iiI = false;
/* 64 */            this.I00iiO = false;
/* 66 */            return OoiIlOl1iI.I00000oIO;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000II(IOoilo iOoilo) throws Throwable {
                    OOII1o01i oOII1o01i;
/* 3 */             if (iOoilo instanceof OOII1o01i) {
/* 6 */                 oOII1o01i = (OOII1o01i) iOoilo;
/* 8 */                 int i = oOII1o01i.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oOII1o01i.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oOII1o01i = new OOII1o01i(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = oOII1o01i.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oOII1o01i.I00iiO;
/* 32 */            OI1I0OoOl oI1I0OoOl = this.I00iio;
/* 35 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(obj);
/* 54 */                if (!this.I00iiI && !this.I00iiO) {
/* 60 */                    oOII1o01i.I00iiO = 1;
/* 66 */                    if (oI1I0OoOl.I00000oIO(oOII1o01i) == ii0111o) {
/* 68 */                        return ii0111o;
                            }
                        }
/* 74 */                return Boolean.valueOf(this.I00iiI);
                    }
/* 37 */            if (i2 != 1) {
/* 45 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                return null;
                    }
/* 39 */            lIoii1l01l0i.I00000oOI(obj);
/* 69 */            oI1I0OoOl.I00000oOI(null);
/* 74 */            return Boolean.valueOf(this.I00iiI);
                }

                @Override
                public final long I00100l0(float f) {
/* 3 */             return this.I00iOIl.I00100l0(f);
                }

                @Override
                public final long I00100o1O0lo(long j) {
/* 3 */             return this.I00iOIl.I00100o1O0lo(j);
                }

                @Override
                public final float I001lIiIIo1O(long j) {
/* 3 */             return this.I00iOIl.I001lIiIIo1O(j);
                }

                @Override
                public final long I00IioO0OiOi(int i) {
/* 3 */             return this.I00iOIl.I00IioO0OiOi(i);
                }

                @Override
                public final long I00Io1o110i(float f) {
/* 3 */             return this.I00iOIl.I00Io1o110i(f);
                }

                @Override
                public final float I00O0o1oo(int i) {
/* 3 */             return this.I00iOIl.I00O0o1oo(i);
                }

                @Override
                public final float I00OIO1(float f) {
/* 3 */             return this.I00iOIl.I00OIO1(f);
                }

                @Override
                public final float I00Ol00() {
/* 3 */             return this.I00iOIl.I00Ol00();
                }

                @Override
                public final float I00i0ilIl0i(float f) {
/* 3 */             return this.I00iOIl.I00i0ilIl0i(f);
                }

                @Override
                public final int I00iio(long j) {
/* 3 */             return this.I00iOIl.I00iio(j);
                }

                @Override
                public final int I00l0OO0IO(float f) {
/* 3 */             return this.I00iOIl.I00l0OO0IO(f);
                }

                @Override
                public final long I00oI0i(long j) {
/* 3 */             return this.I00iOIl.I00oI0i(j);
                }

                @Override
                public final float I00oO101o(long j) {
/* 3 */             return this.I00iOIl.I00oO101o(j);
                }
            }
