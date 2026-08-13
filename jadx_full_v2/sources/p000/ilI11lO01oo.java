            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.AbstractSet;
            import java.util.Arrays;
            import java.util.Iterator;
            
            public final class ilI11lO01oo extends AbstractSet {
                public final int I00iOIl;
                public final i1Ol1oooo1ii I00iiI;

                public ilI11lO01oo(i1Ol1oooo1ii i1ol1oooo1ii, int i) {
/* 1 */             this.I00iiI = i1ol1oooo1ii;
/* 6 */             this.I00iOIl = i;
                }

                public final int I00000oOI() {
/* 9 */             return this.I00iiI.I00iiO[this.I00iOIl + 1];
                }

                public final int I0000O() {
/* 2 */             int i = this.I00iOIl;
/* 4 */             if (i == -1) {
/* 6 */                 return 0;
                    }
/* 12 */            return this.I00iiI.I00iiO[i];
                }

                @Override
                public final boolean contains(Object obj) {
                    return Arrays.binarySearch(this.I00iiI.I00iiI, I0000O(), I00000oOI(), obj, this.I00iOIl == -1 ? i1Ol1oooo1ii.I00ioIO : ilIOIll.I00000oOI) >= 0;
                }

                @Override
                public final Iterator iterator() {
/* 4 */             I1IoOOl1l1oo i1IoOOl1l1oo = new I1IoOOl1l1oo(3);
/* 7 */             i1IoOOl1l1oo.I00iiO = this;
/* 10 */            i1IoOOl1l1oo.I00iiI = 0;
/* 12 */            VarHandle.storeStoreFence();
/* 20 */            return i1IoOOl1l1oo;
                }

                @Override
                public final int size() {
/* 9 */             return I00000oOI() - I0000O();
                }
            }
