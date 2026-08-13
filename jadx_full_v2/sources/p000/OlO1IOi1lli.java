            package p000;
            
            public abstract class OlO1IOi1lli implements OlO11I0O1l {
                public final I1Ooo1ii0l I00iOIl = new I1Ooo1ii0l(0);

                public final boolean I00000oIO(int i) {
                    return (this.I00iOIl.get() & i) != 0;
                }

                public final void I0001Ioi1lo(int i) {
                    I1Ooo1ii0l i1Ooo1ii0l;
                    int i2;
/* 18 */            do {
/* 1 */                 i1Ooo1ii0l = this.I00iOIl;
/* 3 */                 i2 = i1Ooo1ii0l.get();
/* 9 */                 if ((i2 & i) != 0) {
/* 29 */                    return;
                        }
/* 18 */            } while (!i1Ooo1ii0l.compareAndSet(i2, i2 | i));
                }
            }
