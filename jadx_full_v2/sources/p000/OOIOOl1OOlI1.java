            package p000;

            import java.security.GeneralSecurityException;
            import java.security.InvalidAlgorithmParameterException;
            import java.security.MessageDigest;
            
            public final class OOIOOl1OOlI1 implements O1O1I111l {
                public final OOIOIIOIii1 I00000oIO;
                public final int I00000oOI;

                public OOIOOl1OOlI1(OOIOIIOIii1 oOIOIIOIii1, int i) throws InvalidAlgorithmParameterException {
/* 4 */             this.I00000oIO = oOIOIIOIii1;
/* 6 */             this.I00000oOI = i;
/* 10 */            if (i < 10) {
/* 89 */                throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
                    }
/* 15 */            oOIOIIOIii1.I0000oI00(i, new byte[0]);
                }

                @Override
                public final void I00000oIO(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
/* 9 */             if (MessageDigest.isEqual(I00000oOI(bArr2), bArr)) {
/* 11 */                return;
                    }
/* 14 */            IioIoO10iOiI.I000oI1ioi("invalid MAC");
                }

                @Override
                public final byte[] I00000oOI(byte[] bArr) {
/* 5 */             return this.I00000oIO.I0000oI00(this.I00000oOI, bArr);
                }
            }
