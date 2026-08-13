            package p000;

            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.security.GeneralSecurityException;
            import javax.crypto.Cipher;
            import javax.crypto.Mac;
            import javax.crypto.spec.SecretKeySpec;
            
            public final class I0OiI1 extends OIIoIO {
                public int I00000oIO;
                public String I00000oOI;
                public int I0000Il00O;
                public int I0000O;
                public int I0000oI00;
                public String I0001Ioi1lo;
                public byte[] I000II;

                public static byte[] I000OOo1O(byte[] bArr, long j, boolean z) throws GeneralSecurityException {
/* 3 */             ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
/* 9 */             byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
/* 12 */            byteBufferAllocate.put(bArr);
/* 19 */            if (0 > j || j >= 4294967296L) {
/* 49 */                IioIoO10iOiI.I000oI1ioi("Index out of range");
/* 52 */                return null;
                    }
/* 31 */            byteBufferAllocate.putInt((int) j);
/* 35 */            byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
/* 39 */            byteBufferAllocate.putInt(0);
/* 42 */            return byteBufferAllocate.array();
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             return I0000oI00();
                }

                @Override
                public final int I0000O() {
/* 1 */             return this.I0000O;
                }

                @Override
                public final int I0000oI00() {
/* 3 */             return this.I00000oIO + 8;
                }

                @Override
                public final int I0001Ioi1lo() {
/* 1 */             return this.I0000oI00;
                }

                @Override
                public final OlOO0oIio01 I000II() {
/* 4 */             I0Oi111ii i0Oi111ii = new I0Oi111ii(0);
/* 7 */             i0Oi111ii.I00io1l = this;
/* 9 */             VarHandle.storeStoreFence();
/* 20 */            return i0Oi111ii;
                }

                @Override
                public final OlOO10OII11 I000O01llI0(byte[] bArr) throws IllegalStateException, GeneralSecurityException {
/* 3 */             I0Oi1Il1oi i0Oi1Il1oi = new I0Oi1Il1oi();
/* 6 */             i0Oi1Il1oi.I000O01llI0 = this;
/* 10 */            i0Oi1Il1oi.I00000oIO = 0L;
/* 24 */            i0Oi1Il1oi.I0000O = (Cipher) Il0O1l0i.I00000oOI.I00000oIO.I00IO1oi11O("AES/CTR/NoPadding");
/* 26 */            Il0O1l0i il0O1l0i = Il0O1l0i.I0000Il00O;
/* 28 */            String str = this.I00000oOI;
/* 38 */            i0Oi1Il1oi.I0000oI00 = (Mac) il0O1l0i.I00000oIO.I00IO1oi11O(str);
/* 40 */            i0Oi1Il1oi.I00000oIO = 0L;
/* 42 */            int i = this.I00000oIO;
/* 44 */            byte[] bArrI00000oIO = OOl1iO0l.I00000oIO(i);
/* 49 */            byte[] bArrI00000oIO2 = OOl1iO0l.I00000oIO(7);
/* 53 */            i0Oi1Il1oi.I0001Ioi1lo = bArrI00000oIO2;
/* 59 */            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(I0000oI00());
/* 63 */            i0Oi1Il1oi.I000II = byteBufferAllocate;
/* 70 */            byteBufferAllocate.put((byte) I0000oI00());
/* 73 */            byteBufferAllocate.put(bArrI00000oIO);
/* 76 */            byteBufferAllocate.put(bArrI00000oIO2);
/* 79 */            byteBufferAllocate.flip();
/* 88 */            byte[] bArrI00000oIO3 = iloIiOoiI.I00000oIO(this.I0001Ioi1lo, this.I000II, bArrI00000oIO, bArr, i + 32);
/* 100 */           i0Oi1Il1oi.I00000oOI = new SecretKeySpec(bArrI00000oIO3, 0, i, "AES");
/* 109 */           i0Oi1Il1oi.I0000Il00O = new SecretKeySpec(bArrI00000oIO3, i, 32, str);
/* 111 */           VarHandle.storeStoreFence();
/* 168 */           return i0Oi1Il1oi;
                }
            }
