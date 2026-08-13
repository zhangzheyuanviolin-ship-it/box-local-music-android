            package p000;
            
            public final class Oll11lOlo implements IiIooOOOI, IOoil1iiIilo {
                public Oll1OII0o I00iOIl;
                public IIoOoIol0Io0 I00iiI;
                public IIoOoIol0Io0 I00iiO;
                public OO1i0l I00iio;
                public Il00o11 I00ilI0I1;
                public Oll1OII0o I00ilO0;

                @Override
                public final float I00000oIO() {
/* 3 */             return this.I00iOIl.I00000oIO();
                }

                public final Object I00000oOI(OO1i0l oO1i0l, I1oI1lil i1oI1lil) {
/* 8 */             IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(i1oI1lil));
/* 11 */            iIoOoIol0Io0.I00111O();
/* 14 */            this.I00iio = oO1i0l;
/* 16 */            this.I00iiO = iIoOoIol0Io0;
/* 18 */            Object objI0010I0i = iIoOoIol0Io0.I0010I0i();
/* 22 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 37 */            return objI0010I0i;
                }

                public final long I0000Il00O() {
/* 1 */             Oll1OII0o oll1OII0o = this.I00ilO0;
/* 13 */            long jI00oI0i = oll1OII0o.I00oI0i(il0lI1i1olii.I000O01llI0(oll1OII0o).I00ooIo0.I0000O());
/* 17 */            long j = oll1OII0o.I00olI;
/* 40 */            float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jI00oI0i >> 32)) - ((int) (j >> 32))) / 2.0f;
/* 61 */            float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (jI00oI0i & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
/* 76 */            return (Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(fMax2) & 4294967295L);
                }

                public final Oooii1o1 I0001Ioi1lo() {
/* 7 */             return il0lI1i1olii.I000O01llI0(this.I00ilO0).I00ooIo0;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /* JADX WARN: Type inference failed for: r10v0, types: [Oll11lOlo, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r10v1, types: [O010OIi] */
                /* JADX WARN: Type inference failed for: r10v4, types: [O010OIi] */
                /* JADX WARN: Type inference failed for: r10v8 */
                /* JADX WARN: Type inference failed for: r10v9 */
                /* JADX WARN: Type inference failed for: r13v0, types: [IlliIl1l11O] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000II(long j, IlliIl1l11O illiIl1l11O, I1oI1lil i1oI1lil) throws Throwable {
                    Oll10lI1I oll10lI1I;
                    IIoOoIol0Io0 iIoOoIol0Io0;
/* 3 */             if (i1oI1lil instanceof Oll10lI1I) {
/* 6 */                 oll10lI1I = (Oll10lI1I) i1oI1lil;
/* 8 */                 int i = oll10lI1I.I00iio;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oll10lI1I.I00iio = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oll10lI1I = new Oll10lI1I(this, i1oI1lil);
                        }
                    }
/* 25 */            Object objInvoke = oll10lI1I.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oll10lI1I.I00iio;
                    try {
/* 32 */                if (i2 == 0) {
/* 52 */                    lIoii1l01l0i.I00000oOI(objInvoke);
/* 59 */                    if (j <= 0 && (iIoOoIol0Io0 = this.I00iiO) != null) {
/* 74 */                        iIoOoIol0Io0.resumeWith(lIoii1l01l0i.I00000oIO(new OO1i1lOl(j)));
                            }
/* 93 */                    OlIl0i olIl0iI0000O = iOi1II01i0.I0000O(this.I00ilO0.I00ooiO1I(), null, null, new I10I1l(j, (Object) this, (IOoil1iiIilo) null, 5), 3);
/* 97 */                    oll10lI1I.I00iOIl = olIl0iI0000O;
/* 99 */                    oll10lI1I.I00iio = 1;
/* 101 */                   objInvoke = illiIl1l11O.invoke(this, oll10lI1I);
                            this = olIl0iI0000O;
/* 105 */                   if (objInvoke == ii0111o) {
/* 107 */                       return ii0111o;
                            }
                        } else {
/* 34 */                    if (i2 != 1) {
/* 47 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 50 */                        return null;
                            }
/* 36 */                    OlIl0i olIl0i = oll10lI1I.I00iOIl;
/* 38 */                    lIoii1l01l0i.I00000oOI(objInvoke);
                            this = olIl0i;
                        }
/* 110 */               this.I000II(IIoOi1lIIoOI.I00iiI);
/* 113 */               return objInvoke;
                    } catch (Throwable th) {
/* 116 */               this.I000II(IIoOi1lIIoOI.I00iiI);
/* 408 */               throw th;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000O01llI0(long j, IlliIl1l11O illiIl1l11O, IOoilo iOoilo) throws Throwable {
                    Oll10oi oll10oi;
/* 3 */             if (iOoilo instanceof Oll10oi) {
/* 6 */                 oll10oi = (Oll10oi) iOoilo;
/* 8 */                 int i = oll10oi.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oll10oi.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oll10oi = new Oll10oi(this, iOoilo);
                        }
                    }
/* 25 */            Object obj = oll10oi.I00iOIl;
/* 27 */            Object obj2 = Ii0111o.I00iOIl;
/* 29 */            int i2 = oll10oi.I00iiO;
                    try {
/* 33 */                if (i2 == 0) {
/* 47 */                    lIoii1l01l0i.I00000oOI(obj);
/* 50 */                    oll10oi.I00iiO = 1;
/* 52 */                    Object objI000II = I000II(j, illiIl1l11O, oll10oi);
                            return objI000II == obj2 ? obj2 : objI000II;
                        }
/* 35 */                if (i2 == 1) {
/* 37 */                    lIoii1l01l0i.I00000oOI(obj);
/* 40 */                    return obj;
                        }
/* 43 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                return null;
                    } catch (OO1i1lOl unused) {
/* 31 */                return null;
                    }
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
/* 7 */             return f / this.I00iOIl.I00000oIO();
                }

                @Override
                public final float I00Ol00() {
/* 3 */             return this.I00iOIl.I00Ol00();
                }

                @Override
                public final float I00i0ilIl0i(float f) {
/* 7 */             return this.I00iOIl.I00000oIO() * f;
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

                @Override
                public final Ii00l101O getContext() {
/* 1 */             return this.I00ilI0I1;
                }

                @Override
                public final void resumeWith(Object obj) {
/* 1 */             Oll1OII0o oll1OII0o = this.I00ilO0;
                    synchronized (oll1OII0o.I00oO101o) {
/* 8 */                 oll1OII0o.I00oIiI10.I000iOII(this);
                    }
/* 14 */            this.I00iiI.resumeWith(obj);
                }
            }
