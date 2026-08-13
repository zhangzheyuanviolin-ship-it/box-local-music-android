            package p000;

            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.io.InputStream;
            
/* 27 */    public abstract class I001lloI extends I00OIO1 implements I00Ol10, I00II0Ol1O0l {
                public static final I001lllioOl I00iiI = new I001lllioOl(0, I001lloI.class);
                public static final char[] I00iiO = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
                public byte[] I00iOIl;

                public I001lloI(byte[] bArr, boolean z) {
/* 4 */             if (z) {
/* 7 */                 if (bArr == null) {
/* 48 */                    IOOlIIilOl0.I000II("'contents' cannot be null");
/* 51 */                    throw null;
                        }
/* 11 */                if (bArr.length < 1) {
/* 42 */                    I000II.I000iOII("'contents' cannot be empty");
/* 45 */                    throw null;
                        }
/* 16 */                int i = bArr[0] & 255;
/* 18 */                if (i > 0) {
/* 22 */                    if (bArr.length < 2) {
/* 36 */                        I000II.I000iOII("zero length data with non-zero pad bits");
/* 39 */                        throw null;
                            }
/* 25 */                    if (i > 7) {
/* 30 */                        I000II.I000iOII("pad bits cannot be greater than 7 or less than 0");
/* 33 */                        throw null;
                            }
                        }
                    }
/* 52 */            this.I00iOIl = bArr;
                }

                public static I001lloI I001i1O0Ol(byte[] bArr) {
                    String str;
/* 1 */             int length = bArr.length;
/* 4 */             if (length >= 1) {
/* 11 */                int i = bArr[0] & 255;
/* 12 */                if (i > 0) {
/* 15 */                    if (i > 7 || length < 2) {
/* 35 */                        str = "invalid pad bits detected";
                            } else {
/* 21 */                        byte b = bArr[length - 1];
/* 27 */                        if (b != ((byte) ((255 << i) & b))) {
/* 31 */                            return new Ii101I1O1il(bArr, false);
                                }
                            }
                        }
/* 43 */                return new Ii0o0iiI(bArr, false);
                    }
/* 47 */            str = "truncated BIT STRING detected";
/* 37 */            I000II.I000iOII(str);
/* 2 */             return null;
                }

                public static I001lloI I001iOo1i0O(I00IO1oi11O i00IO1oi11O) {
/* 1 */             if (i00IO1oi11O == null || (i00IO1oi11O instanceof I001lloI)) {
/* 38 */                return (I001lloI) i00IO1oi11O;
                    }
/* 8 */             I00OIO1 i00oio1I0000O = i00IO1oi11O.I0000O();
/* 14 */            if (i00oio1I0000O instanceof I001lloI) {
/* 16 */                return (I001lloI) i00oio1I0000O;
                    }
/* 33 */            I000II.I000iOII("illegal object in getInstance: ".concat(i00IO1oi11O.getClass().getName()));
/* 36 */            return null;
                }

                @Override
                public final String I0000oI00() {
                    try {
/* 1 */                 byte[] bArrI000iOII = I000iOII();
/* 12 */                StringBuffer stringBuffer = new StringBuffer((bArrI000iOII.length * 2) + 1);
/* 17 */                stringBuffer.append('#');
/* 22 */                for (int i = 0; i != bArrI000iOII.length; i++) {
/* 24 */                    byte b = bArrI000iOII[i];
/* 30 */                    char[] cArr = I00iiO;
/* 34 */                    stringBuffer.append(cArr[(b >>> 4) & 15]);
/* 41 */                    stringBuffer.append(cArr[b & 15]);
                        }
/* 47 */                return stringBuffer.toString();
                    } catch (IOException e) {
/* 59 */                I000II.I000lI("Internal error encoding BitString: ", e.getMessage(), e);
/* 62 */                return null;
                    }
                }

                @Override
                public final InputStream I0001Ioi1lo() {
/* 3 */             byte[] bArr = this.I00iOIl;
/* 8 */             return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
                }

                @Override
                public final int I000OOo1O() {
/* 6 */             return this.I00iOIl[0] & 255;
                }

                @Override
                public final boolean I000o00OoI0I(I00OIO1 i00oio1) {
/* 4 */             if (!(i00oio1 instanceof I001lloI)) {
/* 3 */                 return false;
                    }
/* 9 */             byte[] bArr = this.I00iOIl;
/* 11 */            byte[] bArr2 = ((I001lloI) i00oio1).I00iOIl;
/* 13 */            int length = bArr.length;
/* 15 */            if (bArr2.length != length) {
/* 3 */                 return false;
                    }
/* 19 */            if (length == 1) {
/* 18 */                return true;
                    }
/* 22 */            int i = length - 1;
/* 24 */            for (int i2 = 0; i2 < i; i2++) {
/* 30 */                if (bArr[i2] != bArr2[i2]) {
/* 3 */                     return false;
                        }
                    }
/* 43 */            int i3 = 255 << (bArr[0] & 255);
                    return ((byte) (bArr[i] & i3)) == ((byte) (bArr2[i] & i3));
                }

                @Override
                public I00OIO1 I001IIilI0O() {
/* 6 */             return new Ii0o0iiI(this.I00iOIl, false);
                }

                @Override
                public I00OIO1 I001IO000() {
/* 6 */             return new Ii101I1O1il(this.I00iOIl, false);
                }

                @Override
                public final int hashCode() {
/* 1 */             byte[] bArr = this.I00iOIl;
/* 5 */             if (bArr.length < 2) {
/* 7 */                 return 1;
                    }
/* 9 */             int i = 0;
/* 14 */            int i2 = bArr[0] & 255;
/* 15 */            int length = bArr.length;
                    int i3 = length - 1;
/* 23 */            byte b = (byte) ((255 << i2) & bArr[i3]);
/* 24 */            if (bArr != null) {
/* 27 */                i = length;
                        while (true) {
                            i3--;
/* 30 */                    if (i3 < 0) {
                                break;
                            }
/* 36 */                    i = (i * 257) ^ bArr[i3];
                        }
                    }
/* 40 */            return (i * 257) ^ b;
                }

                public final String toString() {
/* 1 */             return I0000oI00();
                }

                @Override
/* 28 */        public final I00OIO1 I000OiO() {
/* 29 */            return this;
                }
            }
