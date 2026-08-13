            package p000;
            
            public final class IO10i1 extends IO10l0l0 {
                public Throwable I00000oIO;

                public final boolean equals(Object obj) {
                    return (obj instanceof IO10i1) && O0000Ioio00.I0000O(this.I00000oIO, ((IO10i1) obj).I00000oIO);
                }

                public final int hashCode() {
/* 1 */             Throwable th = this.I00000oIO;
/* 3 */             if (th != null) {
/* 5 */                 return th.hashCode();
                    }
/* 10 */            return 0;
                }

                @Override
                public final String toString() {
/* 18 */            return "Closed(" + this.I00000oIO + ')';
                }
            }
