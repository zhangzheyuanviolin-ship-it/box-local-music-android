            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            
            public final class Io10oO1l001 implements Iterator, O0IlIoi {
                public final Ol11i0000Oo I00iOIl;
                public final int I00iiI;
                public int I00iiO;
                public final int I00iio;

                public Io10oO1l001(Ol11i0000Oo ol11i0000Oo, int i, int i2) {
/* 4 */             this.I00iOIl = ol11i0000Oo;
/* 6 */             this.I00iiI = i2;
/* 8 */             this.I00iiO = i;
/* 12 */            this.I00iio = ol11i0000Oo.I00ioIO;
/* 16 */            if (ol11i0000Oo.I00io1l) {
/* 18 */                Ol11iOOOoo1.I0001Ioi1lo();
                    }
                }

                @Override
                public final boolean hasNext() {
                    return this.I00iiO < this.I00iiI;
                }

                @Override
                public final Object next() {
/* 1 */             Ol11i0000Oo ol11i0000Oo = this.I00iOIl;
/* 3 */             int i = ol11i0000Oo.I00ioIO;
/* 5 */             int i2 = this.I00iio;
/* 7 */             if (i != i2) {
/* 9 */                 Ol11iOOOoo1.I0001Ioi1lo();
                    }
/* 12 */            int i3 = this.I00iiO;
/* 21 */            this.I00iiO = Ol11iOOOoo1.I00000oOI(ol11i0000Oo.I00iOIl, i3) + i3;
/* 25 */            Ol11iIl11o ol11iIl11o = new Ol11iIl11o();
/* 28 */            ol11iIl11o.I00iOIl = ol11i0000Oo;
/* 30 */            ol11iIl11o.I00iiI = i3;
/* 32 */            ol11iIl11o.I00iiO = i2;
/* 34 */            VarHandle.storeStoreFence();
/* 55 */            return ol11iIl11o;
                }

                @Override
                public final void remove() {
/* 20 */            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
