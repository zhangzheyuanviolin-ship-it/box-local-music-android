            package p000;
            
/* 27 */    public final class IiiI1lIo extends IiiIIOii implements Ii011lOOlI1, IOoil1iiIilo {
                public static final long I00ioIO = I1Ioolli0l0o.I00000oIO.objectFieldOffset(IiiI1lIo.class.getDeclaredField("_reusableCancellableContinuation$volatile"));
                public Ii00lIOoi I00iio;
                public IOoilo I00ilI0I1;
                public Object I00ilO0;
                public Object I00io1l;
                private volatile Object _reusableCancellableContinuation$volatile;

                @Override
                public final Object I000O01llI0() {
/* 1 */             Object obj = this.I00ilO0;
/* 5 */             this.I00ilO0 = IiiIIO0IO.I00000oIO;
/* 29 */            return obj;
                }

                @Override
                public final Ii011lOOlI1 getCallerFrame() {
/* 1 */             IOoilo iOoilo = this.I00ilI0I1;
/* 3 */             if (iOoilo != null) {
/* 5 */                 return iOoilo;
                    }
/* 6 */             return null;
                }

                @Override
                public final Ii00l101O getContext() {
/* 3 */             return this.I00ilI0I1.getContext();
                }

                @Override
                public final void resumeWith(Object obj) throws IiiI1OOll0l1 {
/* 1 */             Throwable thI00000oOI = Oi10ii.I00000oOI(obj);
/* 12 */            Object iOiIII1I = thI00000oOI == null ? obj : new IOiIII1I(false, thI00000oOI);
/* 15 */            Ii00lIOoi ii00lIOoi = this.I00iio;
/* 17 */            IOoilo iOoilo = this.I00ilI0I1;
/* 27 */            if (IiiIIO0IO.I0000Il00O(ii00lIOoi, iOoilo.getContext())) {
/* 29 */                this.I00ilO0 = iOiIII1I;
/* 31 */                this.I00iiO = 0;
/* 37 */                IiiIIO0IO.I00000oOI(ii00lIOoi, iOoilo.getContext(), this);
/* 40 */                return;
                    }
/* 41 */            Il10o00 il10o00I00000oIO = Oo100i0OO.I00000oIO();
/* 54 */            if (il10o00I00000oIO.I00iiI >= 4294967296L) {
/* 56 */                this.I00ilO0 = iOiIII1I;
/* 58 */                this.I00iiO = 0;
/* 60 */                il10o00I00000oIO.I00oooO(this);
/* 63 */                return;
                    }
/* 65 */            il10o00I00000oIO.I010II(true);
                    try {
/* 68 */                Ii00l101O context = iOoilo.getContext();
/* 74 */                Object objI00000oOI = Oo0ooOi10I.I00000oOI(context, this.I00io1l);
                        try {
/* 78 */                    iOoilo.resumeWith(obj);
/* 88 */                    while (il10o00I00000oIO.I010iIIOlo()) {
                            }
                        } finally {
/* 97 */                    Oo0ooOi10I.I00000oIO(context, objI00000oOI);
                        }
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }

                public final String toString() {
/* 32 */            return "DispatchedContinuation[" + this.I00iio + ", " + Ii1Oo1l.I00000oOI(this.I00ilI0I1) + ']';
                }

                @Override
/* 28 */        public final IOoil1iiIilo I0000Il00O() {
/* 29 */            return this;
                }
            }
