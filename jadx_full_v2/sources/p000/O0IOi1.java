            package p000;

            import java.util.ArrayList;
            
            public final class O0IOi1 implements O0Oooi0I1 {
                public static final O0i001110 I0000Il00O = new O0i001110(OOoOl0i.I00000oIO.I00000oOI(O0IOi1.class));
                public boolean I00000oIO;
                public ArrayList I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 42 */                return true;
                    }
/* 18 */            if (!O0IOi1.class.equals(obj != null ? obj.getClass() : null)) {
/* 40 */                return false;
                    }
/* 21 */            O0IOi1 o0IOi1 = (O0IOi1) obj;
                    return this.I00000oIO == o0IOi1.I00000oIO && O0000Ioio00.I0000O(this.I00000oOI, o0IOi1.I00000oOI);
                }

                @Override
                public final O0i001110 getType() {
/* 1 */             return I0000Il00O;
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.hashCode() + (Boolean.hashCode(this.I00000oIO) * 31);
                }
            }
