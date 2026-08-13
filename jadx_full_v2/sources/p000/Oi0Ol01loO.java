            package p000;

            import java.util.concurrent.atomic.AtomicReferenceArray;
            
            public final class Oi0Ol01loO {
                private volatile AtomicReferenceArray<Object> array;

                public Oi0Ol01loO(int i) {
/* 9 */             this.array = new AtomicReferenceArray<>(i);
                }

                public final int I00000oIO() {
/* 3 */             return this.array.length();
                }

                public final Object I00000oOI(int i) {
/* 1 */             AtomicReferenceArray<Object> atomicReferenceArray = this.array;
/* 7 */             if (i < atomicReferenceArray.length()) {
/* 9 */                 return atomicReferenceArray.get(i);
                    }
/* 14 */            return null;
                }

                public final void I0000Il00O(int i, Ii00oo1OO0 ii00oo1OO0) {
/* 1 */             AtomicReferenceArray<Object> atomicReferenceArray = this.array;
/* 3 */             int length = atomicReferenceArray.length();
/* 7 */             if (i < length) {
/* 9 */                 atomicReferenceArray.set(i, ii00oo1OO0);
/* 12 */                return;
                    }
/* 15 */            int i2 = i + 1;
/* 17 */            int i3 = length * 2;
/* 19 */            if (i2 < i3) {
/* 21 */                i2 = i3;
                    }
/* 22 */            AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i2);
/* 26 */            for (int i4 = 0; i4 < length; i4++) {
/* 32 */                atomicReferenceArray2.set(i4, atomicReferenceArray.get(i4));
                    }
/* 38 */            atomicReferenceArray2.set(i, ii00oo1OO0);
/* 41 */            this.array = atomicReferenceArray2;
                }
            }
