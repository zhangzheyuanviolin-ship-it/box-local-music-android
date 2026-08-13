            package p000;
            
            public final class IOl1I01 extends IIOo1i {
                public boolean I0001Ioi1lo;

                @Override
                public final void I00100l0(byte b) {
/* 3 */             if (this.I0001Ioi1lo) {
/* 11 */                I001IO000(String.valueOf(b & 255));
                    } else {
/* 21 */                I00111O(String.valueOf(b & 255));
                    }
                }

                @Override
                public final void I0010I0i(int i) {
/* 1 */             boolean z = this.I0001Ioi1lo;
/* 3 */             String unsignedString = Integer.toUnsignedString(i);
/* 7 */             if (z) {
/* 9 */                 I001IO000(unsignedString);
                    } else {
/* 13 */                I00111O(unsignedString);
                    }
                }

                @Override
                public final void I0010o(long j) {
/* 1 */             boolean z = this.I0001Ioi1lo;
/* 3 */             String unsignedString = Long.toUnsignedString(j);
/* 7 */             if (z) {
/* 9 */                 I001IO000(unsignedString);
                    } else {
/* 13 */                I00111O(unsignedString);
                    }
                }

                @Override
                public final void I001IIilI0O(short s) {
/* 6 */             if (this.I0001Ioi1lo) {
/* 13 */                I001IO000(String.valueOf(s & 65535));
                    } else {
/* 22 */                I00111O(String.valueOf(s & 65535));
                    }
                }
            }
