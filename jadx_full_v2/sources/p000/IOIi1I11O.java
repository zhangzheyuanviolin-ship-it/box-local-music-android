            package p000;

            import java.lang.reflect.Method;
            
            public final class IOIi1I11O {
                public int I00000oIO;
                public Method I00000oOI;

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 35 */                return true;
                    }
/* 6 */             if (!(obj instanceof IOIi1I11O)) {
/* 37 */                return false;
                    }
/* 9 */             IOIi1I11O iOIi1I11O = (IOIi1I11O) obj;
                    return this.I00000oIO == iOIi1I11O.I00000oIO && this.I00000oOI.getName().equals(iOIi1I11O.I00000oOI.getName());
                }

                public final int hashCode() {
/* 15 */            return this.I00000oOI.getName().hashCode() + (this.I00000oIO * 31);
                }
            }
