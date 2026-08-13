            package p000;

            import java.security.GeneralSecurityException;
            
            public final class Ioo0ilOlI extends I01loIooI {
                public final int I0000Il00O;

                public Ioo0ilOlI(int i, byte[] bArr) throws GeneralSecurityException {
/* 1 */             this.I0000Il00O = i;
/* 11 */            if (!Oi010OO0.I0000oI00(1)) {
/* 29 */                IioIoO10iOiI.I000oI1ioi("Can not use ChaCha20Poly1305 in FIPS-mode.");
/* 89 */                throw null;
                    }
/* 17 */            this.I00000oIO = I0010I0i(1, bArr);
/* 24 */            this.I00000oOI = I0010I0i(0, bArr);
                }

                @Override
                public final IOOOI0 I0010I0i(int i, byte[] bArr) {
                    switch (this.I0000Il00O) {
                        case 0:
/* 16 */                    return new Ioo0O0Ioi00O(bArr, i, 0);
                        default:
/* 9 */                     return new Ioo0O0Ioi00O(bArr, i, 1);
                    }
                }
            }
