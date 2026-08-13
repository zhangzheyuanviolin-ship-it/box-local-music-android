            package p000;
            
            public final class Oll0OlI11 implements IOoil1iiIilo, Ii011lOOlI1 {
                public int I00iOIl;
                public Oll0i111 I00iiI;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v1, types: [IOoil1iiIilo[]] */
                /* JADX WARN: Type inference failed for: r1v2 */
                @Override
                public final Ii011lOOlI1 getCallerFrame() {
/* 1 */             OlIl00o1i1 olIl00o1i1 = OlIl00o1i1.I00iOIl;
/* 3 */             Oll0i111 oll0i111 = this.I00iiI;
/* 5 */             int i = this.I00iOIl;
/* 9 */             if (i == Integer.MIN_VALUE) {
/* 11 */                i = oll0i111.I00ilO0;
/* 13 */                this.I00iOIl = i;
                    }
/* 16 */            if (i < 0) {
/* 18 */                this.I00iOIl = Integer.MIN_VALUE;
/* 20 */                olIl00o1i1 = null;
                    } else {
                        try {
/* 24 */                    ?? r1 = oll0i111.I00ilI0I1[i];
/* 26 */                    if (r1 != 0) {
/* 31 */                        this.I00iOIl = i - 1;
/* 33 */                        olIl00o1i1 = r1;
                            }
                        } catch (Throwable unused) {
                        }
                    }
/* 36 */            if (olIl00o1i1 instanceof Ii011lOOlI1) {
/* 39 */                return olIl00o1i1;
                    }
/* 15 */            return null;
                }

                @Override
                public final Ii00l101O getContext() {
/* 1 */             Oll0i111 oll0i111 = this.I00iiI;
/* 6 */             for (int i = oll0i111.I00ilO0; -1 < i; i--) {
/* 10 */                IOoil1iiIilo iOoil1iiIilo = oll0i111.I00ilI0I1[i];
/* 12 */                if (iOoil1iiIilo != this && iOoil1iiIilo != null) {
/* 16 */                    return iOoil1iiIilo.getContext();
                        }
                    }
/* 26 */            I000II.I001IO000("Not started");
/* 29 */            return null;
                }

                @Override
                public final void resumeWith(Object obj) {
/* 1 */             Oll0i111 oll0i111 = this.I00iiI;
/* 3 */             Throwable thI00000oOI = Oi10ii.I00000oOI(obj);
/* 7 */             if (thI00000oOI != null) {
/* 13 */                oll0i111.I000II(lIoii1l01l0i.I00000oIO(thI00000oOI));
                    } else {
/* 18 */                oll0i111.I0001Ioi1lo(false);
                    }
                }
            }
