            package p000;
            
            public final class IIiloliili1I implements Ool1II0ii {
                public IIio0010i1l I00000oIO;
                public OolOi0i I00000oOI;
                public IOi0Olo0Ol I0000Il00O;
                public Ool1lo I0000O;

                @Override
                public final void I00000oOI(Ool1lo ool1lo) {
/* 1 */             IOi0Olo0Ol iOi0Olo0Ol = this.I0000Il00O;
/* 3 */             IIio0010i1l iIio0010i1l = this.I00000oIO;
/* 5 */             this.I0000O = ool1lo;
/* 7 */             if (ool1lo != null) {
/* 9 */                 iOi0Olo0Ol.I00000oOI(iIio0010i1l);
/* 16 */                iOi0Olo0Ol.I00000oIO(iIio0010i1l, this.I00000oOI.I0000O);
/* 20 */                iIio0010i1l.I00000oOI(ool1lo, false);
                    }
                }

                @Override
                public final void reset() {
/* 1 */             IIio0010i1l iIio0010i1l = this.I00000oIO;
                    synchronized (iIio0010i1l.I00iiI) {
                        try {
/* 6 */                     IOi10loi iOi10loi = iIio0010i1l.I00iio;
/* 10 */                    if (iOi10loi != null) {
/* 12 */                        iIio0010i1l.I00iio = null;
/* 21 */                        iOi10loi.I00iIO(new I1o1lOlooI1("The camera control has became inactive.", 1));
                            }
/* 27 */                    IOi10loi iOi10loi2 = iIio0010i1l.I00ilI0I1;
/* 29 */                    if (iOi10loi2 != null) {
/* 31 */                        iIio0010i1l.I00ilI0I1 = null;
/* 40 */                        iOi10loi2.I00iIO(new I1o1lOlooI1("The camera control has became inactive.", 1));
                            }
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 48 */            this.I0000Il00O.I00000oOI(this.I00000oIO);
                }
            }
