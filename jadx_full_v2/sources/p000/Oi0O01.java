            package p000;

            import java.util.List;
            
            public final class Oi0O01 extends IIo0illOoI {
                public OoooIIOo10 I00000oIO;
                public List I00000oOI;
                public Io0oi0 I0000Il00O;
                public IIio00Io10 I0000O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (obj instanceof Oi0O01) {
/* 11 */                Oi0O01 oi0O01 = (Oi0O01) obj;
                        return this.I00000oIO == oi0O01.I00000oIO && this.I00000oOI.equals(oi0O01.I00000oOI) && this.I0000Il00O == oi0O01.I0000Il00O && this.I0000O == oi0O01.I0000O;
                    }
/* 7 */             return false;
                }

                public final int hashCode() {
/* 35 */            return this.I0000O.hashCode() + Oi010OO0.I000OOo1O((this.I0000Il00O.hashCode() + IIl001iO0Io.I0000oI00(this.I00000oIO.hashCode() * 31, 31, this.I00000oOI)) * 31, 31, false);
                }

                public final String toString() {
/* 48 */            return "RequestOpen(virtualCamera=" + this.I00000oIO + ", sharedCameraIds=" + this.I00000oOI + ", graphListener=" + this.I0000Il00O + ", isPrewarm=false, isForegroundObserver=" + this.I0000O + ')';
                }
            }
