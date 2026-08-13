            package p000;

            import java.util.Iterator;
            
            public final class ioIOl10iIi01 extends io1ilIOo {
                public final transient OOoli1l I00iiO;
                public final transient ioIl0ooI I00iio;

                public ioIOl10iIi01(OOoli1l oOoli1l, ioIl0ooI ioil0ooi) {
/* 4 */             this.I00iiO = oOoli1l;
/* 6 */             this.I00iio = ioil0ooi;
                }

                @Override
                public final int I00000oOI(Object[] objArr) {
/* 3 */             return this.I00iio.I00000oOI(objArr);
                }

                @Override
                public final io0o00I1ol1o I0001Ioi1lo() {
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
