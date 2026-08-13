            package p000;

            import java.nio.BufferUnderflowException;
            import java.nio.ByteBuffer;
            import java.security.GeneralSecurityException;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class O0i1O0o implements I0OIilIIo0 {
                public static final byte[] I0000Il00O = new byte[0];
                public O0OIIIoOilol I00000oIO;
                public I0Ooii0oll I00000oOI;

                @Override
                public final byte[] I00000oIO(byte[] bArr, byte[] bArr2) {
                    I01Iio10lo i01Iio10loI00000oOI;
/* 1 */             O0OIIIoOilol o0OIIIoOilol = this.I00000oIO;
/* 3 */             AtomicReference atomicReference = OOoiolOO0i.I00000oIO;
                    synchronized (OOoiolOO0i.class) {
                        try {
/* 26 */                    O0OIoll1 o0OIoll1 = ((O0O1ol01lo1) OOoiolOO0i.I00000oIO.get()).I00000oIO(o0OIIIoOilol.I001lIiIIo1O()).I00000oIO;
/* 30 */                    Class cls = (Class) o0OIoll1.I0000Il00O;
/* 44 */                    if (!((Map) o0OIoll1.I0000O).keySet().contains(cls) && !Void.class.equals(cls)) {
/* 90 */                        throw new IllegalArgumentException("Given internalKeyMananger " + o0OIoll1.toString() + " does not support primitive class " + cls.getName());
                            }
/* 107 */                   if (!((Boolean) OOoiolOO0i.I0000Il00O.get(o0OIIIoOilol.I001lIiIIo1O())).booleanValue()) {
/* 238 */                       throw new GeneralSecurityException("newKey-operation not permitted for key type " + o0OIIIoOilol.I001lIiIIo1O());
                            }
/* 109 */                   IIOI1Ii1I iIOI1Ii1II001lllioOl = o0OIIIoOilol.I001lllioOl();
                            try {
/* 113 */                       I00i01iIIliI i00i01iIIliII0001Ioi1lo = o0OIoll1.I0001Ioi1lo();
/* 117 */                       I01Iio10lo i01Iio10loI000O01llI0 = i00i01iIIliII0001Ioi1lo.I000O01llI0(iIOI1Ii1II001lllioOl);
/* 121 */                       i00i01iIIliII0001Ioi1lo.I000OOo1O(i01Iio10loI000O01llI0);
/* 124 */                       i01Iio10loI00000oOI = i00i01iIIliII0001Ioi1lo.I00000oOI(i01Iio10loI000O01llI0);
                            } catch (O000oiiiOI0 e) {
/* 214 */                       throw new GeneralSecurityException("Failures parsing proto of type ".concat(o0OIoll1.I0001Ioi1lo().I00000oOI.getName()), e);
                            }
                        } catch (Throwable th) {
/* 551 */                   throw th;
                        }
                    }
/* 129 */           byte[] bArrI0000oI00 = i01Iio10loI00000oOI.I0000oI00();
/* 137 */           byte[] bArrI00000oIO = this.I00000oOI.I00000oIO(bArrI0000oI00, I0000Il00O);
/* 161 */           byte[] bArrI00000oIO2 = ((I0OIilIIo0) OOoiolOO0i.I0000Il00O(this.I00000oIO.I001lIiIIo1O(), IIOI1Ii1I.I0000oI00(bArrI0000oI00, 0, bArrI0000oI00.length), I0OIilIIo0.class)).I00000oIO(bArr, bArr2);
/* 187 */           return ByteBuffer.allocate(bArrI00000oIO.length + 4 + bArrI00000oIO2.length).putInt(bArrI00000oIO.length).put(bArrI00000oIO).put(bArrI00000oIO2).array();
                }

                @Override
                public final byte[] I00000oOI(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
                    try {
/* 3 */                 ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
/* 7 */                 int i = byteBufferWrap.getInt();
/* 11 */                if (i <= 0 || i > bArr.length - 4) {
/* 80 */                    throw new GeneralSecurityException("invalid ciphertext");
                        }
/* 18 */                byte[] bArr3 = new byte[i];
/* 21 */                byteBufferWrap.get(bArr3, 0, i);
/* 28 */                byte[] bArr4 = new byte[byteBufferWrap.remaining()];
/* 34 */                byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
/* 41 */                byte[] bArrI00000oOI = this.I00000oOI.I00000oOI(bArr3, I0000Il00O);
/* 47 */                String strI001lIiIIo1O = this.I00000oIO.I001lIiIIo1O();
/* 53 */                AtomicReference atomicReference = OOoiolOO0i.I00000oIO;
/* 55 */                IIO1i10I iIO1i10I = IIOI1Ii1I.I00iiI;
/* 68 */                return ((I0OIilIIo0) OOoiolOO0i.I0000Il00O(strI001lIiIIo1O, IIOI1Ii1I.I0000oI00(bArrI00000oOI, 0, bArrI00000oOI.length), I0OIilIIo0.class)).I00000oOI(bArr4, bArr2);
                    } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
/* 89 */                throw new GeneralSecurityException("invalid ciphertext", e);
                    }
                }
            }
