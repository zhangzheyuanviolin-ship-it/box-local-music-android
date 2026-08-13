            package p000;

            import java.io.IOException;
            import java.util.Map;
            
            public final class O0OiOolO0i {
                public String I00000oIO;
                public Map I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 32 */                return true;
                    }
/* 5 */             if (!(obj instanceof O0OiOolO0i)) {
/* 30 */                return false;
                    }
/* 9 */             O0OiOolO0i o0OiOolO0i = (O0OiOolO0i) obj;
                    return this.I00000oIO.equals(o0OiOolO0i.I00000oIO) && this.I00000oOI.equals(o0OiOolO0i.I00000oOI);
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (this.I00000oIO.hashCode() * 31);
                }

                public final String toString() throws IOException {
/* 46 */            return "@" + this.I00000oIO + '(' + IOOi0Ool1i.I00IlilI0i0i(O1Oii0O0loo.I000O01llI0(this.I00000oOI), null, null, null, IiOi0I1.I00o0l1o1o0, 31) + ')';
                }
            }
