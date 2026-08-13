            package p000;

            import java.util.Iterator;
            
            public final class lOlO1Oioo extends lOO110IoOiI {
                public final transient lOliil I00iiO;
                public final transient lOlOo0Ol11oO I00iio;

                public lOlO1Oioo(lOliil loliil, lOlOo0Ol11oO loloo0ol11oo) {
/* 4 */             this.I00iiO = loliil;
/* 6 */             this.I00iio = loloo0ol11oo;
                }

                @Override
                public final lOI1lll1l10 I0001Ioi1lo() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final int I000OiO(Object[] objArr) {
/* 3 */             return this.I00iio.I000OiO(objArr);
                }

                @Override
                public final OoiOOoOlo I000iOII() {
/* 4 */             return this.I00iio.listIterator(0);
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
/* 3 */             return this.I00iiO.I00ilO0;
                }
            }
