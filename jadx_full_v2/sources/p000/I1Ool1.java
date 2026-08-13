            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1Ool1 {
                public Object I00000oIO;

                public static final I1Ool1 I00000oIO(Object obj) {
/* 3 */             I1Ool1 i1Ool1 = new I1Ool1();
/* 6 */             i1Ool1.I00000oIO = obj;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return i1Ool1;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof I1Ool1) && O0000Ioio00.I0000O(this.I00000oIO, ((I1Ool1) obj).I00000oIO);
                }

                public final int hashCode() {
/* 1 */             Object obj = this.I00000oIO;
/* 3 */             if (obj == null) {
/* 5 */                 return 0;
                    }
/* 7 */             return obj.hashCode();
                }

                public final String toString() {
/* 18 */            return "AsyncTypefaceResult(result=" + this.I00000oIO + ")";
                }
            }
