            package p000;

            import java.io.IOException;
            import java.io.OutputStream;
            import java.lang.invoke.VarHandle;
            
            public class O1101ooIo0l extends IIOII1 {
                public final byte[] I00iiI;
                public int I00iiO = 0;

                public O1101ooIo0l(byte[] bArr) {
/* 7 */             this.I00iiI = bArr;
                }

                @Override
                public void I0001Ioi1lo(int i, byte[] bArr, int i2, int i3) {
/* 3 */             System.arraycopy(this.I00iiI, i, bArr, i2, i3);
                }

                @Override
                public final int I000OOo1O() {
/* 1 */             return 0;
                }

                @Override
                public final boolean I000OiO() {
/* 1 */             return true;
                }

                @Override
                public final boolean I000iOII() {
/* 1 */             byte[] bArr = this.I00iiI;
                    return li0lloi1l.I0000Il00O(bArr, 0, bArr.length) == 0;
                }

                @Override
                public final int I000o00OoI0I(int i, int i2, int i3) {
/* 4 */             for (int i4 = i2; i4 < i2 + i3; i4++) {
/* 12 */                i = (i * 31) + this.I00iiI[i4];
                    }
/* 215 */           return i;
                }

                /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
                
                    if (r6[r8] > (-65)) goto L59;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
                
                    r8 = r7;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
                
                    if (r6[r8] > (-65)) goto L59;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
                
                    if (r6[r7] > (-65)) goto L59;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final int I000oI1ioi(int i, int i2, int i3) {
                    byte b;
                    int i4;
                    int i5;
/* 1 */             int i6 = i3 + i2;
/* 2 */             byte[] bArr = this.I00iiI;
/* 4 */             if (i != 0) {
/* 6 */                 if (i2 >= i6) {
/* 8 */                     return i;
                        }
/* 9 */                 byte b2 = (byte) i;
/* 15 */                if (b2 < -32) {
/* 19 */                    if (b2 >= -62) {
/* 21 */                        i5 = i2 + 1;
                            }
/* 12 */                    return -1;
                        }
/* 34 */                if (b2 < -16) {
/* 39 */                    byte b3 = (byte) (~(i >> 8));
/* 40 */                    if (b3 == 0) {
/* 42 */                        int i7 = i2 + 1;
/* 44 */                        byte b4 = bArr[i2];
/* 46 */                        if (i7 >= i6) {
/* 48 */                            return li0lloi1l.I00000oIO(b2, b4);
                                }
/* 54 */                        i2 = i7;
/* 55 */                        b3 = b4;
                            }
/* 56 */                    if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
/* 70 */                        i5 = i2 + 1;
                            }
                        } else {
/* 80 */                    byte b5 = (byte) (~(i >> 8));
/* 81 */                    if (b5 == 0) {
/* 83 */                        i4 = i2 + 1;
/* 85 */                        b5 = bArr[i2];
/* 87 */                        if (i4 >= i6) {
/* 89 */                            return li0lloi1l.I00000oIO(b2, b5);
                                }
/* 94 */                        b = 0;
                            } else {
/* 98 */                        b = (byte) (i >> 16);
/* 101 */                       i4 = i2;
                            }
/* 102 */                   if (b == 0) {
/* 104 */                       int i8 = i4 + 1;
/* 106 */                       byte b6 = bArr[i4];
/* 108 */                       if (i8 >= i6) {
/* 112 */                           if (b2 > -12 || b5 > -65 || b6 > -65) {
/* 12 */                                return -1;
                                    }
/* 124 */                           return ((b5 << 8) ^ b2) ^ (b6 << 16);
                                }
/* 128 */                       b = b6;
/* 129 */                       i4 = i8;
                            }
/* 130 */                   if (b5 <= -65) {
/* 139 */                       if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && b <= -65) {
/* 143 */                           i2 = i4 + 1;
                                }
                            }
                        }
/* 12 */                return -1;
                    }
/* 150 */           return li0lloi1l.I0000Il00O(bArr, i2, i6);
                }

                @Override
                public final int I00100o1O0lo() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final String I0010I0i() {
/* 4 */             byte[] bArr = this.I00iiI;
/* 9 */             return new String(bArr, 0, bArr.length, "UTF-8");
                }

                @Override
                public final void I00111O(OutputStream outputStream, int i, int i2) throws IOException {
/* 3 */             outputStream.write(this.I00iiI, i, i2);
                }

                public final boolean I001IIilI0O(O1101ooIo0l o1101ooIo0l, int i, int i2) {
/* 1 */             byte[] bArr = o1101ooIo0l.I00iiI;
/* 3 */             int length = bArr.length;
/* 4 */             byte[] bArr2 = this.I00iiI;
/* 6 */             if (i2 > length) {
/* 65 */                int length2 = bArr2.length;
/* 70 */                StringBuilder sb = new StringBuilder(40);
/* 75 */                sb.append("Length too large: ");
/* 78 */                sb.append(i2);
/* 81 */                sb.append(length2);
/* 215 */               throw new IllegalArgumentException(sb.toString());
                    }
/* 12 */            if (i + i2 <= bArr.length) {
/* 14 */                int i3 = 0;
/* 15 */                while (i3 < i2) {
/* 21 */                    if (bArr2[i3] != bArr[i]) {
/* 11 */                        return false;
                            }
/* 24 */                    i3++;
/* 26 */                    i++;
                        }
/* 29 */                return true;
                    }
/* 31 */            int length3 = bArr.length;
/* 36 */            StringBuilder sb2 = new StringBuilder(59);
/* 41 */            sb2.append("Ran off end of other: ");
/* 44 */            sb2.append(i);
/* 49 */            sb2.append(", ");
/* 52 */            sb2.append(i2);
/* 59 */            I000II.I000iOII(Oi010OO0.I00100l0(length3, ", ", sb2));
/* 11 */            return false;
                }

                @Override
                public IIO1OlO0 iterator() {
/* 3 */             O1100oi0Iio o1100oi0Iio = new O1100oi0Iio();
/* 6 */             o1100oi0Iio.I00iiO = this;
/* 9 */             o1100oi0Iio.I00iOIl = 0;
/* 15 */            o1100oi0Iio.I00iiI = size();
/* 17 */            VarHandle.storeStoreFence();
/* 29 */            return o1100oi0Iio;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof IIOII1) || size() != ((IIOII1) obj).size()) {
/* 7 */                 return false;
                    }
/* 29 */            if (size() == 0) {
/* 1 */                 return true;
                    }
/* 34 */            if (obj instanceof O1101ooIo0l) {
/* 42 */                return I001IIilI0O((O1101ooIo0l) obj, 0, size());
                    }
/* 49 */            if (obj instanceof OiI01lII01oI) {
/* 51 */                return obj.equals(this);
                    }
/* 60 */            String strValueOf = String.valueOf(obj.getClass());
/* 81 */            I000II.I000iOII(IIl001iO0Io.I00100l0(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
/* 7 */             return false;
                }

                public final int hashCode() {
/* 1 */             int iI000o00OoI0I = this.I00iiO;
/* 3 */             if (iI000o00OoI0I == 0) {
/* 5 */                 int size = size();
/* 10 */                iI000o00OoI0I = I000o00OoI0I(size, 0, size);
/* 14 */                if (iI000o00OoI0I == 0) {
/* 16 */                    iI000o00OoI0I = 1;
                        }
/* 17 */                this.I00iiO = iI000o00OoI0I;
                    }
/* 29 */            return iI000o00OoI0I;
                }

                @Override
                public int size() {
/* 3 */             return this.I00iiI.length;
                }
            }
