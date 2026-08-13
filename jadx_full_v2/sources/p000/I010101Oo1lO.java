            package p000;

            import java.lang.reflect.InvocationTargetException;
            
/* 47 */    public abstract class I010101Oo1lO extends O011OOl11 implements IOoil1iiIilo, Ii0110 {
                public final Ii00l101O I00iio;

                public I010101Oo1lO(Ii00l101O ii00l101O, boolean z) {
/* 1 */             super(z);
/* 12 */            I00Iooi00oi((O010OIi) ii00l101O.I00lli11(Iioi0lilII.I00iio));
/* 19 */            this.I00iio = ii00l101O.I00ioIO(this);
                }

                @Override
                public final Ii00l101O I00000oIO() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final String I001i1O0Ol() {
/* 11 */            return getClass().getSimpleName().concat(" was cancelled");
                }

                @Override
                public final void I00IoO0(IOiIIo1l iOiIIo1l) {
/* 3 */             iiooO1ll.I00000oIO(this.I00iio, iOiIIo1l);
                }

                @Override
                public final void I00Oio(Object obj) {
/* 3 */             if (!(obj instanceof IOiIII1I)) {
/* 26 */                I00iIi0i1o(obj);
/* 49 */                return;
                    }
/* 5 */             IOiIII1I iOiIII1I = (IOiIII1I) obj;
/* 22 */            I00iIO(I1Ioolli0l0o.I00000oIO.getIntVolatile(iOiIII1I, IOiIII1I.I00000oOI) == 1, iOiIII1I.I00000oIO);
                }

                public final void I00iiO(Ii01I10 ii01I10, I010101Oo1lO i010101Oo1lO, IlliIl1l11O illiIl1l11O) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                    Object objInvoke;
/* 1 */             int iOrdinal = ii01I10.ordinal();
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 8 */             if (iOrdinal == 0) {
                        try {
/* 100 */                   IiiIIO0IO.I00000oIO(l00iIoI.I0000Il00O(l00iIoI.I00000oIO(i010101Oo1lO, this, illiIl1l11O)), ooiIlOl1iI);
/* 103 */                   return;
                        } catch (Throwable th) {
/* 105 */                   iOl0ii00.I00000oIO(this, th);
/* 215 */                   throw null;
                        }
                    }
/* 11 */            if (iOrdinal != 1) {
/* 14 */                if (iOrdinal == 2) {
/* 88 */                    l00iIoI.I0000Il00O(l00iIoI.I00000oIO(i010101Oo1lO, this, illiIl1l11O)).resumeWith(ooiIlOl1iI);
/* 91 */                    return;
                        }
/* 17 */                if (iOrdinal != 3) {
/* 76 */                    I000II.I00000oIO();
/* 79 */                    return;
                        }
                        try {
/* 19 */                    Ii00l101O ii00l101O = this.I00iio;
/* 21 */                    Object objI00000oOI = Oo0ooOi10I.I00000oOI(ii00l101O, null);
                            try {
/* 27 */                        if (illiIl1l11O instanceof I1oI1lil) {
/* 36 */                            OoOOI1100oI0.I0000Il00O(2, illiIl1l11O);
/* 39 */                            objInvoke = illiIl1l11O.invoke(i010101Oo1lO, this);
                                } else {
/* 29 */                            objInvoke = l00iIoI.I0000O(illiIl1l11O, i010101Oo1lO, this);
                                }
/* 43 */                        Oo0ooOi10I.I00000oIO(ii00l101O, objI00000oOI);
/* 48 */                        if (objInvoke != Ii0111o.I00iOIl) {
/* 50 */                            resumeWith(objInvoke);
                                }
                            } catch (Throwable th2) {
/* 56 */                        Oo0ooOi10I.I00000oIO(ii00l101O, objI00000oOI);
/* 59 */                        throw th2;
                            }
                        } catch (Throwable th3) {
/* 54 */                    th = th3;
/* 62 */                    if (th instanceof IiiI1OOll0l1) {
/* 66 */                        th = ((IiiI1OOll0l1) th).I00iOIl;
                            }
/* 72 */                    resumeWith(lIoii1l01l0i.I00000oIO(th));
                        }
                    }
                }

                @Override
                public final Ii00l101O getContext() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final void resumeWith(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
/* 1 */             Throwable thI00000oOI = Oi10ii.I00000oOI(obj);
/* 5 */             if (thI00000oOI != null) {
/* 11 */                obj = new IOiIII1I(false, thI00000oOI);
                    }
/* 14 */            Object objI00OI1 = I00OI1(obj);
/* 20 */            if (objI00OI1 == O011OiI01.I00000oOI) {
/* 22 */                return;
                    }
/* 23 */            I0010I0i(objI00OI1);
                }

/* 48 */        public void I00iIi0i1o(Object obj) {
                }

/* 88 */        public void I00iIO(boolean z, Throwable th) {
                }
            }
