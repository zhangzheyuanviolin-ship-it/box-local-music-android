            package p000;
            
            public final class OoiI00olo extends OiOOI1I1I101 {
                public ThreadLocal I00ilO0;
                private volatile boolean threadLocalIsSet;

                @Override
                public final void I0010I0i(Object obj) {
/* 1 */             I00ilO0();
/* 4 */             Object objI00000oIO = iiiilOoi.I00000oIO(obj);
/* 8 */             IOoil1iiIilo iOoil1iiIilo = this.I00ilI0I1;
/* 10 */            Ii00l101O context = iOoil1iiIilo.getContext();
/* 15 */            Object objI00000oOI = Oo0ooOi10I.I00000oOI(context, null);
/* 23 */            OoiI00olo ooiI00oloI0000Il00O = objI00000oOI != Oo0ooOi10I.I00000oIO ? iioloOl.I0000Il00O(iOoil1iiIilo, context, objI00000oOI) : null;
                    try {
/* 27 */                iOoil1iiIilo.resumeWith(objI00000oIO);
/* 30 */                if (ooiI00oloI0000Il00O == null || ooiI00oloI0000Il00O.I00ilI0I1()) {
/* 40 */                    Oo0ooOi10I.I00000oIO(context, objI00000oOI);
                        }
                    } catch (Throwable th) {
/* 45 */                if (ooiI00oloI0000Il00O == null || ooiI00oloI0000Il00O.I00ilI0I1()) {
/* 53 */                    Oo0ooOi10I.I00000oIO(context, objI00000oOI);
                        }
/* 186 */               throw th;
                    }
                }

                @Override
                public final void I00iio() {
/* 1 */             I00ilO0();
                }

                public final boolean I00ilI0I1() {
/* 16 */            boolean z = this.threadLocalIsSet && this.I00ilO0.get() == null;
/* 19 */            this.I00ilO0.remove();
/* 22 */            return !z;
                }

                public final void I00ilO0() {
/* 3 */             if (this.threadLocalIsSet) {
/* 11 */                OIoi0IIoi oIoi0IIoi = (OIoi0IIoi) this.I00ilO0.get();
/* 13 */                if (oIoi0IIoi != null) {
/* 21 */                    Oo0ooOi10I.I00000oIO((Ii00l101O) oIoi0IIoi.I00iOIl, oIoi0IIoi.I00iiI);
                        }
/* 26 */                this.I00ilO0.remove();
                    }
                }

                public final void I00io1l(Ii00l101O ii00l101O, Object obj) {
/* 2 */             this.threadLocalIsSet = true;
/* 11 */            this.I00ilO0.set(new OIoi0IIoi(ii00l101O, obj));
                }
            }
