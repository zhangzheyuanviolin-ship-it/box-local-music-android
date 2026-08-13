            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import java.util.Iterator;
            
            public final class I1Io0li1Ol1I extends I1IlollII1lI {
                public Object[] I00iOIl;
                public int I00iiI;

                @Override
                public final int I00000oOI() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final void I0000O(int i, I11O0Ol i11O0Ol) {
/* 1 */             Object[] objArrCopyOf = this.I00iOIl;
/* 4 */             if (objArrCopyOf.length <= i) {
/* 7 */                 int length = objArrCopyOf.length;
/* 10 */                do {
/* 8 */                     length *= 2;
/* 10 */                } while (length <= i);
/* 14 */                objArrCopyOf = Arrays.copyOf(this.I00iOIl, length);
/* 18 */                this.I00iOIl = objArrCopyOf;
                    }
/* 22 */            if (objArrCopyOf[i] == null) {
                        this.I00iiI++;
                    }
/* 30 */            objArrCopyOf[i] = i11O0Ol;
                }

                @Override
                public final Object get(int i) {
/* 3 */             return I1IoiO1l.I001iOo1i0O(i, this.I00iOIl);
                }

                @Override
                public final Iterator iterator() {
/* 3 */             I1Io0ii i1Io0ii = new I1Io0ii();
/* 6 */             i1Io0ii.I00iio = this;
/* 9 */             i1Io0ii.I00iiO = -1;
/* 11 */            VarHandle.storeStoreFence();
/* 29 */            return i1Io0ii;
                }
            }
