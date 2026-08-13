            package p000;
            
            public final class Oi1O1o extends Oi1OOo1O {
                public static final Oo0io0OO1 I0000oI00;
                public final String I0000O;

                static {
/* 5 */             long j = IOOiio0i.I000OOo1O;
/* 62 */            I0000oI00 = new Oo0io0OO1(new OlIIi1oIIOlo(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534), new OlIIi1oIIOlo(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, OlooIOI0O.I0000Il00O, null, 61438), 10);
                }

                public Oi1O1o(String str) {
/* 2 */             super(null);
/* 5 */             this.I0000O = str;
                }

                @Override
                public final Object I00000oIO(Oi1Oioi1oIO oi1Oioi1oIO) {
/* 8 */             return new O0ooi0ll(this.I0000O, oi1Oioi1oIO.I000O01llI0, null);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 23 */                return true;
                    }
/* 6 */             if (obj instanceof Oi1O1o) {
                        return O0000Ioio00.I0000O(this.I0000O, ((Oi1O1o) obj).I0000O);
                    }
/* 21 */            return false;
                }

                public final int hashCode() {
/* 7 */             return this.I0000O.hashCode() * 31;
                }

                public final String toString() {
/* 7 */             return IlIi0I0.I000lI("Link(destination='", this.I0000O, "', linkInteractionListener=null)");
                }
            }
