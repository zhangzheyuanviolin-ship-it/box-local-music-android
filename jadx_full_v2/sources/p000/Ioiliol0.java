            package p000;

            import java.util.List;
            
            public final class Ioiliol0 extends I01IO0oio {
                public final I01Io11IiiiO I00iOIl;
                public final int I00iiI;
                public final int I00iiO;

                public Ioiliol0(I01Io11IiiiO i01Io11IiiiO, int i, int i2) {
/* 4 */             this.I00iOIl = i01Io11IiiiO;
/* 6 */             this.I00iiI = i;
/* 12 */            l10ioi0.I0000Il00O(i, i2, i01Io11IiiiO.I00000oOI());
/* 16 */            this.I00iiO = i2 - i;
                }

                @Override
                public final int I00000oOI() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final Object get(int i) {
/* 3 */             l10ioi0.I00000oIO(i, this.I00iiO);
/* 11 */            return this.I00iOIl.get(this.I00iiI + i);
                }

                @Override
                public final List subList(int i, int i2) {
/* 3 */             l10ioi0.I0000Il00O(i, i2, this.I00iiO);
/* 8 */             int i3 = this.I00iiI;
/* 14 */            return new Ioiliol0(this.I00iOIl, i + i3, i3 + i2);
                }
            }
