            package p000;

            import java.util.concurrent.CancellationException;
            
/* 47 */    public abstract class IiiIIOii extends OloIOlo10 {
                public int I00iiO;

                public IiiIIOii(int i) {
/* 4 */             super(0L, false);
/* 7 */             this.I00iiO = i;
                }

                public abstract IOoil1iiIilo I0000Il00O();

                public Throwable I0000oI00(Object obj) {
/* 9 */             IOiIII1I iOiIII1I = obj instanceof IOiIII1I ? (IOiIII1I) obj : null;
/* 10 */            if (iOiIII1I != null) {
/* 12 */                return iOiIII1I.I00000oIO;
                    }
/* 3 */             return null;
                }

                public final void I000II(Throwable th) {
/* 33 */            iiooO1ll.I00000oIO(I0000Il00O().getContext(), new Ii01OOool("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
                }

                public abstract Object I000O01llI0();

                @Override
                public final void run() {
                    try {
/* 5 */                 IiiI1lIo iiiI1lIo = (IiiI1lIo) I0000Il00O();
/* 7 */                 IOoilo iOoilo = iiiI1lIo.I00ilI0I1;
/* 9 */                 Object obj = iiiI1lIo.I00io1l;
/* 11 */                Ii00l101O context = iOoilo.getContext();
/* 15 */                Object objI00000oOI = Oo0ooOi10I.I00000oOI(context, obj);
/* 21 */                O010OIi o010OIi = null;
/* 35 */                OoiI00olo ooiI00oloI0000Il00O = objI00000oOI != Oo0ooOi10I.I00000oIO ? iioloOl.I0000Il00O(iOoilo, context, objI00000oOI) : null;
                        try {
/* 36 */                    Ii00l101O context2 = iOoilo.getContext();
/* 40 */                    Object objI000O01llI0 = I000O01llI0();
/* 44 */                    Throwable thI0000oI00 = I0000oI00(objI000O01llI0);
/* 48 */                    if (thI0000oI00 == null) {
/* 50 */                        int i = this.I00iiO;
/* 52 */                        boolean z = true;
/* 53 */                        if (i != 1 && i != 2) {
/* 59 */                            z = false;
                                }
/* 60 */                        if (z) {
/* 68 */                            o010OIi = (O010OIi) context2.I00lli11(Iioi0lilII.I00iio);
                                }
                            }
/* 73 */                    if (o010OIi != null && !o010OIi.I0000Il00O()) {
/* 81 */                        CancellationException cancellationExceptionI00Io1lO = o010OIi.I00Io1lO();
/* 85 */                        I00000oOI(cancellationExceptionI00Io1lO);
/* 92 */                        iOoilo.resumeWith(lIoii1l01l0i.I00000oIO(cancellationExceptionI00Io1lO));
                            } else if (thI0000oI00 != null) {
/* 102 */                       iOoilo.resumeWith(lIoii1l01l0i.I00000oIO(thI0000oI00));
                            } else {
/* 110 */                       iOoilo.resumeWith(I0001Ioi1lo(objI000O01llI0));
                            }
/* 113 */                   if (ooiI00oloI0000Il00O == null || ooiI00oloI0000Il00O.I00ilI0I1()) {
/* 121 */                       Oo0ooOi10I.I00000oIO(context, objI00000oOI);
                            }
                        } catch (Throwable th) {
/* 125 */                   if (ooiI00oloI0000Il00O == null || ooiI00oloI0000Il00O.I00ilI0I1()) {
/* 133 */                       Oo0ooOi10I.I00000oIO(context, objI00000oOI);
                            }
/* 136 */                   throw th;
                        }
                    } catch (IiiI1OOll0l1 e) {
/* 151 */               iiooO1ll.I00000oIO(I0000Il00O().getContext(), e.I00iOIl);
                    } catch (Throwable th2) {
/* 137 */               I000II(th2);
                    }
                }

/* 48 */        public void I00000oOI(CancellationException cancellationException) {
                }

/* 48 */        public Object I0001Ioi1lo(Object obj) {
/* 49 */            return obj;
                }
            }
