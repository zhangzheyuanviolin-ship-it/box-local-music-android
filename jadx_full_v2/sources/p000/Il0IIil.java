            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Il0IIil {
                public String I00000oIO;

                public static Il0IIil I00000oIO(String str) {
/* 3 */             Il0IIil il0IIil = new Il0IIil();
/* 6 */             if (str == null) {
/* 16 */                IOOlIIilOl0.I000II("name is null");
/* 19 */                return null;
                    }
/* 8 */             il0IIil.I00000oIO = str;
/* 10 */            VarHandle.storeStoreFence();
/* 13 */            return il0IIil;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof Il0IIil) {
/* 17 */                return this.I00000oIO.equals(((Il0IIil) obj).I00000oIO);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 10 */            return this.I00000oIO.hashCode() ^ 1000003;
                }

                public final String toString() {
/* 12 */            return IIl001iO0Io.I00100l0(new StringBuilder("Encoding{name=\""), this.I00000oIO, "\"}");
                }
            }
