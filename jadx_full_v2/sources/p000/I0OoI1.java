            package p000;

            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.lang.invoke.VarHandle;
            import java.nio.ByteBuffer;
            import java.nio.ByteOrder;
            import java.security.GeneralSecurityException;
            import javax.crypto.Cipher;
            import javax.crypto.spec.GCMParameterSpec;
            import javax.crypto.spec.SecretKeySpec;
            
            public final class I0OoI1 extends OIIoIO {
                public int I00000oIO;
                public int I00000oOI;
                public int I0000Il00O;
                public String I0000O;
                public byte[] I0000oI00;

                public static GCMParameterSpec I000OOo1O(byte[] bArr, long j, boolean z) throws GeneralSecurityException {
/* 3 */             ByteBuffer byteBufferAllocate = ByteBuffer.allocate(12);
/* 9 */             byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
/* 12 */            byteBufferAllocate.put(bArr);
/* 19 */            if (0 > j || j >= 4294967296L) {
/* 52 */                IioIoO10iOiI.I000oI1ioi("Index out of range");
/* 55 */                return null;
                    }
/* 31 */            byteBufferAllocate.putInt((int) j);
/* 35 */            byteBufferAllocate.put(z ? (byte) 1 : (byte) 0);
/* 46 */            return new GCMParameterSpec(Barcode.FORMAT_ITF, byteBufferAllocate.array());
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             return I0000oI00();
                }

                @Override
                public final int I0000O() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final int I0000oI00() {
/* 3 */             return this.I00000oIO + 8;
                }

                @Override
                public final int I0001Ioi1lo() {
/* 1 */             return this.I0000Il00O;
                }

                @Override
                public final OlOO0oIio01 I000II() {
/* 4 */             iOliil ioliil = new iOliil(1);
/* 7 */             ioliil.I00ilI0I1 = this;
/* 9 */             VarHandle.storeStoreFence();
/* 20 */            return ioliil;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r3v5, types: [byte[], java.io.Serializable] */
                @Override
                public final OlOO10OII11 I000O01llI0(byte[] bArr) {
/* 3 */             I0Oo1I101o i0Oo1I101o = new I0Oo1I101o();
/* 8 */             i0Oo1I101o.I00000oIO = 0L;
/* 22 */            i0Oo1I101o.I0000Il00O = (Cipher) Il0O1l0i.I00000oOI.I00000oIO.I00IO1oi11O("AES/GCM/NoPadding");
/* 24 */            i0Oo1I101o.I00000oIO = 0L;
/* 26 */            int i = this.I00000oIO;
/* 28 */            byte[] bArrI00000oIO = OOl1iO0l.I00000oIO(i);
/* 33 */            ?? I00000oIO = OOl1iO0l.I00000oIO(7);
/* 37 */            i0Oo1I101o.I0000O = I00000oIO;
/* 43 */            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(I0000oI00());
/* 47 */            i0Oo1I101o.I0000oI00 = byteBufferAllocate;
/* 54 */            byteBufferAllocate.put((byte) I0000oI00());
/* 57 */            byteBufferAllocate.put(bArrI00000oIO);
/* 60 */            byteBufferAllocate.put((byte[]) I00000oIO);
/* 63 */            byteBufferAllocate.flip();
/* 81 */            i0Oo1I101o.I00000oOI = new SecretKeySpec(iloIiOoiI.I00000oIO(this.I0000O, this.I0000oI00, bArrI00000oIO, bArr, i), "AES");
/* 83 */            VarHandle.storeStoreFence();
/* 168 */           return i0Oo1I101o;
                }
            }
