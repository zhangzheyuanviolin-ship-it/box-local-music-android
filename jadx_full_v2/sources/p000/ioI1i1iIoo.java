            package p000;

            import java.util.AbstractMap;
            import java.util.Objects;
            
            public final class ioI1i1iIoo extends io0o00I1ol1o {
                public final ioIO0Ilo11l I00iiO;

                public ioI1i1iIoo(ioIO0Ilo11l ioio0ilo11l) {
/* 1 */             this.I00iiO = ioio0ilo11l;
                }

                @Override
                public final boolean I000OOo1O() {
/* 1 */             return true;
                }

                @Override
                public final Object get(int i) {
/* 1 */             ioIO0Ilo11l ioio0ilo11l = this.I00iiO;
/* 5 */             lio1l10i0I.I00000oIO(i, ioio0ilo11l.I00ilI0I1);
/* 8 */             Object[] objArr = ioio0ilo11l.I00iio;
/* 10 */            int i2 = i + i;
/* 11 */            Object obj = objArr[i2];
/* 13 */            Objects.requireNonNull(obj);
/* 18 */            Object obj2 = objArr[i2 + 1];
/* 20 */            Objects.requireNonNull(obj2);
/* 25 */            return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override
                public final int size() {
/* 3 */             return this.I00iiO.I00ilI0I1;
                }
            }
