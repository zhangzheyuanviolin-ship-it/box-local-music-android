            package p000;

            import java.util.List;
            
            @Oili0O
            public final class IioioOiI {
                public static final IioioO10olo0 Companion = new IioioO10olo0();
                public static final O0ioIllo0i1[] I0000O = {null, l0oi0lOi11i.I00000oIO(O0oI01I0oo.I00iOIl, new IOlIlo1(19)), null};
                public O01ioO1o0i11 I00000oIO;
                public List I00000oOI;
                public String I0000Il00O;

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IioioOiI)) {
/* 7 */                 return false;
                    }
/* 11 */            IioioOiI iioioOiI = (IioioOiI) obj;
                    return O0000Ioio00.I0000O(this.I00000oIO, iioioOiI.I00000oIO) && O0000Ioio00.I0000O(this.I00000oOI, iioioOiI.I00000oOI);
                }

                public final int hashCode() {
/* 9 */             int iHashCode = this.I00000oIO.I00iOIl.hashCode() * 31;
/* 11 */            List list = this.I00000oOI;
/* 21 */            return iHashCode + (list == null ? 0 : list.hashCode());
                }

                public final String toString() {
/* 28 */            return "RequestedSchema(properties=" + this.I00000oIO + ", required=" + this.I00000oOI + ")";
                }
            }
