            package p000;

            import java.util.Iterator;
            
            public final class ioI010 extends io10ooI0OiIl {
                public final transient OOoli1l I00iiO;
                public final transient ioI1Ol101 I00iio;

                public ioI010(OOoli1l oOoli1l, ioI1Ol101 ioi1ol101) {
/* 4 */             this.I00iiO = oOoli1l;
/* 6 */             this.I00iio = ioi1ol101;
                }

                @Override
                public final int I00000oOI(Object[] objArr) {
/* 3 */             return this.I00iio.I00000oOI(objArr);
                }

                @Override
                public final io0OIIlOli1 I0001Ioi1lo() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final boolean contains(Object obj) {
                    return this.I00iiO.get(obj) != null;
                }

                @Override
                public final Iterator iterator() {
/* 4 */             return this.I00iio.listIterator(0);
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iiO.I00iio;
                }
            }
