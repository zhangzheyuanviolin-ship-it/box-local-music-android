            package p000;

            import java.lang.annotation.Annotation;
            import java.util.Collection;
            
            public final class OOoO1I0i extends OOoI1O implements O00l0Oi0o {
                public OOoIlii I00000oIO;
                public Annotation[] I00000oOI;
                public String I0000Il00O;
                public boolean I0000O;

                @Override
                public final OOo1O1i I00000oIO(Ill0IO ill0IO) {
/* 3 */             return lIlIi0Ii1.I00000oIO(this.I00000oOI, ill0IO);
                }

                @Override
                public final Collection getAnnotations() {
/* 3 */             return lIlIi0Ii1.I00000oOI(this.I00000oOI);
                }

                public final String toString() {
/* 9 */             StringBuilder sb = new StringBuilder(OOoO1I0i.class.getName());
/* 14 */            sb.append(": ");
/* 26 */            sb.append(this.I0000O ? "vararg " : "");
/* 29 */            String str = this.I0000Il00O;
/* 39 */            sb.append(str != null ? OI1Iio0ii1.I0000O(str) : null);
/* 42 */            sb.append(": ");
/* 47 */            sb.append(this.I00000oIO);
/* 50 */            return sb.toString();
                }
            }
