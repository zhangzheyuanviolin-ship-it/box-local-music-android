            package p000;

            import java.util.Collection;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class OI0l0000lOo implements O0IOli0o0, O0O0iOl1l, OoOIi1lliil {
                public final O0IOli0o0 I00iOIl;
                public final String I00iiI;
                public final List I00iiO;
                public final List I00iio;

                public OI0l0000lOo(O0IOli0o0 o0IOli0o0, String str, Function1 function1, Function1 function12) {
/* 4 */             this.I00iOIl = o0IOli0o0;
/* 6 */             this.I00iiI = str;
/* 14 */            this.I00iiO = (List) function1.invoke(this);
/* 22 */            this.I00iio = (List) function12.invoke(this);
                }

                @Override
                public final List I0000oI00() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final String I000O01llI0() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final Collection I000OiO() {
/* 3 */             return this.I00iOIl.I000OiO();
                }

                @Override
                public final boolean I000iOII() {
/* 3 */             return this.I00iOIl.I000iOII();
                }

                @Override
                public final boolean I000o00OoI0I() {
/* 3 */             return this.I00iOIl.I000o00OoI0I();
                }

                @Override
                public final String I000oI1ioi() {
/* 3 */             return OlOoOIi0o.I00O0o1oo(this.I00iiI);
                }

                @Override
                public final boolean I001i1O0Ol(Object obj) {
/* 3 */             return this.I00iOIl.I001i1O0Ol(obj);
                }

                @Override
                public final Collection I001i1lo1io() {
/* 3 */             return this.I00iOIl.I001i1lo1io();
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof OI0l0000lOo) {
                        return O0000Ioio00.I0000O(this.I00iOIl, ((OI0l0000lOo) obj).I00iOIl);
                    }
/* 19 */            return false;
                }

                @Override
                public final List getTypeParameters() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final int hashCode() {
/* 3 */             return this.I00iOIl.hashCode();
                }

                public final String toString() {
/* 18 */            return "MutableCollectionKClass(" + this.I00iOIl + ')';
                }
            }
