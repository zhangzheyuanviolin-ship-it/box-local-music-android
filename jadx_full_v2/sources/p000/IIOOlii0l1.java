            package p000;

            import java.util.Arrays;
            
/* 7 */     public final class IIOOlii0l1 {
                public final int[] I00000oIO;

                public IIOOlii0l1(int i) {
/* 5 */             this(new int[]{i});
                }

                public final boolean equals(Object obj) {
/* 3 */             if (obj instanceof IIOOlii0l1) {
/* 11 */                return Arrays.equals(this.I00000oIO, ((IIOOlii0l1) obj).I00000oIO);
                    }
/* 16 */            return false;
                }

                public final int hashCode() {
/* 3 */             return Arrays.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 3 */             return Arrays.toString(this.I00000oIO);
                }

/* 8 */         public IIOOlii0l1(int i, int i2) {
/* 9 */             this(new int[]{i, i2});
                }

/* 9 */         public IIOOlii0l1(int[] iArr) {
/* 11 */            this.I00000oIO = iArr;
                }
            }
