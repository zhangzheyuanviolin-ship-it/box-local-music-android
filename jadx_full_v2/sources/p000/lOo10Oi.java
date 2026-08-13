            package p000;

            import java.util.Iterator;
            
            public final class lOo10Oi extends lOO110IoOiI {
                public final transient Object I00iiO;

                public lOo10Oi(Object obj) {
/* 4 */             this.I00iiO = obj;
                }

                @Override
                public final lOI1lll1l10 I0001Ioi1lo() {
/* 1 */             lO1loOl0O0O lo1lool0o0o = lOI1lll1l10.I00iiI;
/* 5 */             Object[] objArr = {this.I00iiO};
/* 10 */            ll0lIii.I00000oIO(1, objArr);
/* 13 */            return lOI1lll1l10.I000oI1ioi(1, objArr);
                }

                @Override
                public final int I000OiO(Object[] objArr) {
/* 4 */             objArr[0] = this.I00iiO;
/* 6 */             return 1;
                }

                @Override
                public final OoiOOoOlo I000iOII() {
/* 5 */             return new lOOl00o0Il(this.I00iiO);
                }

                @Override
                public final boolean contains(Object obj) {
/* 3 */             return this.I00iiO.equals(obj);
                }

                @Override
                public final int hashCode() {
/* 3 */             return this.I00iiO.hashCode();
                }

                @Override
                public final Iterator iterator() {
/* 5 */             return new lOOl00o0Il(this.I00iiO);
                }

                @Override
                public final int size() {
/* 1 */             return 1;
                }

                @Override
                public final String toString() {
/* 3 */             String string = this.I00iiO.toString();
/* 26 */            return IIlIOloOOO.I0010I0i(new StringBuilder(String.valueOf(string).length() + 2), "[", string, "]");
                }
            }
