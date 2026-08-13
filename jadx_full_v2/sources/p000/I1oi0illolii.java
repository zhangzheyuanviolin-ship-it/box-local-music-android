            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1oi0illolii {
                public float I00000oIO;

                public static final I1oi0illolii I00000oIO(float f) {
/* 3 */             I1oi0illolii i1oi0illolii = new I1oi0illolii();
/* 6 */             i1oi0illolii.I00000oIO = f;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return i1oi0illolii;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof I1oi0illolii) && Float.compare(this.I00000oIO, ((I1oi0illolii) obj).I00000oIO) == 0;
                }

                public final int hashCode() {
/* 3 */             return Float.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 18 */            return "BaselineShift(multiplier=" + this.I00000oIO + ")";
                }
            }
