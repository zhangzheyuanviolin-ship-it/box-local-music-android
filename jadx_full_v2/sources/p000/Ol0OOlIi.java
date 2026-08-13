            package p000;

            import java.util.List;
            
            public final class Ol0OOlIi implements OiO1O1lil10 {
                public Object I00000oIO;
                public OI1llOooOl1 I00000oOI;
                public List I0000Il00O;
                public List I0000O;
                public IOii1l I0000oI00;

                @Override
                public final List I00000oIO() {
/* 1 */             return this.I0000Il00O;
                }

                @Override
                public final IOii1l I00000oOI() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final List I0000O() {
/* 1 */             return this.I0000O;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 57 */                return true;
                    }
/* 4 */             if (obj == null || Ol0OOlIi.class != obj.getClass()) {
/* 59 */                return false;
                    }
/* 15 */            Ol0OOlIi ol0OOlIi = (Ol0OOlIi) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, ol0OOlIi.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, ol0OOlIi.I00000oOI) && this.I0000Il00O.equals(ol0OOlIi.I0000Il00O) && this.I0000O.equals(ol0OOlIi.I0000O);
                }

                @Override
                public final Object getKey() {
/* 1 */             return this.I00000oIO;
                }

                public final int hashCode() {
/* 35 */            return (this.I0000O.hashCode() * 31) + (this.I0000Il00O.hashCode() * 31) + (this.I00000oOI.hashCode() * 31) + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() {
/* 48 */            return "SinglePaneScene(key=" + this.I00000oIO + ", entry=" + this.I00000oOI + ", previousEntries=" + this.I0000Il00O + ", entries=" + this.I0000O + ')';
                }
            }
