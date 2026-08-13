            package p000;

            import java.util.Iterator;
            
            public final class ioI01IoOO1li extends io1110oiiIo {
                public final transient OOoli1l I00iiO;
                public final transient ioI1i0i0 I00iio;

                public ioI01IoOO1li(OOoli1l oOoli1l, ioI1i0i0 ioi1i0i0) {
/* 4 */             this.I00iiO = oOoli1l;
/* 6 */             this.I00iio = ioi1i0i0;
                }

                @Override
                public final int I00000oOI(Object[] objArr) {
/* 3 */             return this.I00iio.I00000oOI(objArr);
                }

                @Override
                public final io0OO101I I0001Ioi1lo() {
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
