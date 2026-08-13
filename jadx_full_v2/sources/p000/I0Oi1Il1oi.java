            package p000;

            import java.nio.ByteBuffer;
            import javax.crypto.Cipher;
            import javax.crypto.Mac;
            import javax.crypto.spec.IvParameterSpec;
            import javax.crypto.spec.SecretKeySpec;
            import kotlin.jvm.functions.Function1;
            
            public final class I0Oi1Il1oi implements OlOO10OII11, I10ooi {
                public long I00000oIO;
                public Object I00000oOI;
                public Object I0000Il00O;
                public Object I0000O;
                public Object I0000oI00;
                public Object I0001Ioi1lo;
                public Object I000II;
                public Object I000O01llI0;

                @Override
                public boolean I00000oIO() {
/* 1 */             return false;
                }

                @Override
                public long I00000oOI() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public OoIoOiiO1 I0000Il00O() {
/* 3 */             return (OoIoOiiO1) this.I0000Il00O;
                }

                @Override
                public I110ooool I0000O(long j) {
                    return !I0000oI00(j) ? ((OooI1011O1) this.I00000oOI).I00000oIO(j, (I110ooool) this.I0000oI00, (I110ooool) this.I0001Ioi1lo) : (I110ooool) this.I000II;
                }

                @Override
                public synchronized void I0001Ioi1lo(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3) {
/* 2 */             int iPosition = byteBuffer3.position();
/* 13 */            byte[] bArrI000OOo1O = I0OiI1.I000OOo1O((byte[]) this.I0001Ioi1lo, this.I00000oIO, false);
/* 31 */            ((Cipher) this.I0000O).init(1, (SecretKeySpec) this.I00000oOI, new IvParameterSpec(bArrI000OOo1O));
                    this.I00000oIO++;
/* 45 */            ((Cipher) this.I0000O).update(byteBuffer, byteBuffer3);
/* 52 */            ((Cipher) this.I0000O).doFinal(byteBuffer2, byteBuffer3);
/* 55 */            ByteBuffer byteBufferDuplicate = byteBuffer3.duplicate();
/* 59 */            byteBufferDuplicate.flip();
/* 62 */            byteBufferDuplicate.position(iPosition);
/* 73 */            ((Mac) this.I0000oI00).init((SecretKeySpec) this.I0000Il00O);
/* 80 */            ((Mac) this.I0000oI00).update(bArrI000OOo1O);
/* 87 */            ((Mac) this.I0000oI00).update(byteBufferDuplicate);
/* 104 */           byteBuffer3.put(((Mac) this.I0000oI00).doFinal(), 0, ((I0OiI1) this.I000O01llI0).I0000Il00O);
                }

                @Override
                public Object I000II(long j) {
/* 5 */             if (I0000oI00(j)) {
/* 84 */                return this.I000O01llI0;
                    }
/* 11 */            Function1 function1 = ((OoIoOiiO1) this.I0000Il00O).I00000oOI;
/* 15 */            OooI1011O1 oooI1011O1 = (OooI1011O1) this.I00000oOI;
/* 19 */            I110ooool i110ooool = (I110ooool) this.I0000oI00;
/* 23 */            I110ooool i110ooool2 = (I110ooool) this.I0001Ioi1lo;
/* 25 */            I110ooool i110oooolI0000Il00O = oooI1011O1.I00000oOI;
/* 27 */            if (i110oooolI0000Il00O == null) {
/* 29 */                i110oooolI0000Il00O = i110ooool.I0000Il00O();
/* 33 */                oooI1011O1.I00000oOI = i110oooolI0000Il00O;
                    }
/* 35 */            int iI00000oOI = i110oooolI0000Il00O.I00000oOI();
/* 39 */            int i = 0;
                    while (true) {
/* 40 */                I110ooool i110ooool3 = oooI1011O1.I00000oOI;
/* 45 */                if (i >= iI00000oOI) {
/* 73 */                    if (i110ooool3 != null) {
/* 75 */                        return function1.invoke(i110ooool3);
                            }
/* 80 */                    O0000Ioio00.I000OOo1O("valueVector");
/* 83 */                    throw null;
                        }
/* 47 */                if (i110ooool3 == null) {
/* 69 */                    O0000Ioio00.I000OOo1O("valueVector");
/* 72 */                    throw null;
                        }
/* 63 */                i110ooool3.I0000oI00(i, oooI1011O1.I00000oIO.I000oI1ioi(i110ooool.I00000oIO(i), i110ooool2.I00000oIO(i), j));
/* 66 */                i++;
                    }
                }

                @Override
                public Object I000O01llI0() {
/* 1 */             return this.I000O01llI0;
                }

                @Override
                public ByteBuffer I000OOo1O() {
/* 5 */             return ((ByteBuffer) this.I000II).asReadOnlyBuffer();
                }

                @Override
                public synchronized void I000OiO(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
/* 2 */             int iPosition = byteBuffer2.position();
/* 13 */            byte[] bArrI000OOo1O = I0OiI1.I000OOo1O((byte[]) this.I0001Ioi1lo, this.I00000oIO, true);
/* 30 */            ((Cipher) this.I0000O).init(1, (SecretKeySpec) this.I00000oOI, new IvParameterSpec(bArrI000OOo1O));
                    this.I00000oIO++;
/* 44 */            ((Cipher) this.I0000O).doFinal(byteBuffer, byteBuffer2);
/* 47 */            ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
/* 51 */            byteBufferDuplicate.flip();
/* 54 */            byteBufferDuplicate.position(iPosition);
/* 65 */            ((Mac) this.I0000oI00).init((SecretKeySpec) this.I0000Il00O);
/* 72 */            ((Mac) this.I0000oI00).update(bArrI000OOo1O);
/* 79 */            ((Mac) this.I0000oI00).update(byteBufferDuplicate);
/* 97 */            byteBuffer2.put(((Mac) this.I0000oI00).doFinal(), 0, ((I0OiI1) this.I000O01llI0).I0000Il00O);
                }
            }
