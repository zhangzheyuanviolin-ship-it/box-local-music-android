            package p000;

            import java.nio.charset.Charset;
            
            public abstract class I1oI0o0oO {
                public static final Charset I00000oIO = Charset.forName("UTF-8");

                /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
                
                    if (r7 != 4) goto L58;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static byte[] I00000oIO(String str) {
/* 3 */             byte[] bytes = str.getBytes(I00000oIO);
/* 7 */             int length = bytes.length;
/* 11 */            int i = (length * 3) / 4;
/* 12 */            byte[] bArr = new byte[i];
/* 14 */            int[] iArr = I1o1o00oi0I.I00000oIO;
/* 17 */            int i2 = 0;
/* 18 */            int i3 = 0;
/* 19 */            int i4 = 0;
/* 20 */            int i5 = 0;
/* 24 */            while (i2 < length) {
/* 26 */                if (i3 == 0) {
                            while (true) {
/* 28 */                        int i6 = i2 + 4;
/* 30 */                        if (i6 > length || (i4 = (iArr[bytes[i2] & 255] << 18) | (iArr[bytes[i2 + 1] & 255] << 12) | (iArr[bytes[i2 + 2] & 255] << 6) | iArr[bytes[i2 + 3] & 255]) < 0) {
                                    break;
                                }
/* 76 */                        bArr[i5 + 2] = (byte) i4;
/* 83 */                        bArr[i5 + 1] = (byte) (i4 >> 8);
/* 88 */                        bArr[i5] = (byte) (i4 >> 16);
/* 90 */                        i5 += 3;
/* 92 */                        i2 = i6;
                            }
/* 94 */                    if (i2 >= length) {
                                break;
                            }
                        }
/* 98 */                int i7 = i2 + 1;
/* 104 */               int i8 = iArr[bytes[i2] & 255];
/* 107 */               if (i3 != 0) {
/* 109 */                   if (i3 == 1) {
/* 207 */                       if (i8 < 0) {
/* 210 */                           if (i8 != -1) {
                                        break;
                                    }
/* 218 */                           i2 = i7;
                                }
/* 188 */                       i8 |= i4 << 6;
                            } else if (i3 == 2) {
/* 184 */                       if (i8 < 0) {
/* 192 */                           if (i8 != -2) {
/* 204 */                               if (i8 != -1) {
                                            break;
                                        }
                                    } else {
/* 199 */                               bArr[i5] = (byte) (i4 >> 4);
/* 201 */                               i3 = 4;
/* 194 */                               i5++;
                                    }
/* 218 */                           i2 = i7;
                                }
/* 188 */                       i8 |= i4 << 6;
                            } else if (i3 != 3) {
/* 117 */                       if (i3 == 4) {
/* 127 */                           if (i8 != -2) {
/* 133 */                               if (i8 != -1) {
                                            break;
                                        }
                                    } else {
/* 129 */                               i3++;
                                    }
/* 218 */                           i2 = i7;
                                } else {
/* 119 */                           if (i3 == 5 && i8 != -1) {
                                        break;
                                    }
/* 218 */                           i2 = i7;
                                }
                            } else if (i8 >= 0) {
/* 140 */                       i8 |= i4 << 6;
/* 144 */                       bArr[i5 + 2] = (byte) i8;
/* 151 */                       bArr[i5 + 1] = (byte) (i8 >> 8);
/* 156 */                       bArr[i5] = (byte) (i8 >> 16);
/* 158 */                       i5 += 3;
/* 160 */                       i3 = 0;
                            } else {
/* 163 */                       if (i8 != -2) {
/* 181 */                           if (i8 != -1) {
                                        break;
                                    }
                                } else {
/* 170 */                           bArr[i5 + 1] = (byte) (i4 >> 2);
/* 175 */                           bArr[i5] = (byte) (i4 >> 10);
/* 177 */                           i5 += 2;
/* 179 */                           i3 = 5;
                                }
/* 218 */                       i2 = i7;
                            }
/* 189 */                   i3++;
                        } else {
/* 213 */                   if (i8 < 0) {
/* 216 */                       if (i8 != -1) {
                                    break;
                                }
/* 218 */                       i2 = i7;
                            }
/* 189 */                   i3++;
                        }
/* 161 */               i4 = i8;
/* 218 */               i2 = i7;
                    }
/* 221 */           if (i3 != 1) {
/* 223 */               if (i3 == 2) {
/* 250 */                   bArr[i5] = (byte) (i4 >> 4);
/* 245 */                   i5++;
                        } else if (i3 == 3) {
/* 230 */                   int i9 = i5 + 1;
/* 235 */                   bArr[i5] = (byte) (i4 >> 10);
/* 237 */                   i5 += 2;
/* 242 */                   bArr[i9] = (byte) (i4 >> 2);
                        }
/* 253 */               if (i5 == i) {
/* 255 */                   return bArr;
                        }
/* 256 */               byte[] bArr2 = new byte[i5];
/* 258 */               System.arraycopy(bArr, 0, bArr2, 0, i5);
/* 261 */               return bArr2;
                    }
/* 264 */           I000II.I000iOII("bad base-64");
/* 267 */           return null;
                }

                public static byte[] I00000oOI(byte[] bArr) {
/* 1 */             int length = bArr.length;
/* 2 */             byte[] bArr2 = I1o1o00oi0I.I00000oOI;
/* 6 */             int i = (length / 3) * 4;
/* 10 */            if (length % 3 > 0) {
/* 12 */                i += 4;
                    }
/* 14 */            byte[] bArr3 = new byte[i];
/* 16 */            int i2 = 0;
/* 18 */            int i3 = 0;
/* 19 */            int i4 = -1;
                    while (true) {
/* 20 */                int i5 = i2 + 3;
/* 24 */                if (i5 > length) {
                            break;
                        }
/* 47 */                int i6 = (bArr[i2 + 2] & 255) | ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8);
/* 54 */                bArr3[i3] = bArr2[(i6 >> 18) & 63];
/* 64 */                bArr3[i3 + 1] = bArr2[(i6 >> 12) & 63];
/* 74 */                bArr3[i3 + 2] = bArr2[(i6 >> 6) & 63];
/* 82 */                bArr3[i3 + 3] = bArr2[i6 & 63];
/* 84 */                int i7 = i3 + 4;
                        i4--;
/* 87 */                if (i4 == 0) {
/* 89 */                    i3 += 5;
/* 91 */                    bArr3[i7] = 10;
/* 93 */                    i4 = 19;
                        } else {
/* 97 */                    i3 = i7;
                        }
/* 95 */                i2 = i5;
                    }
/* 103 */           if (i2 == length - 1) {
/* 109 */               int i8 = (bArr[i2] & 255) << 4;
/* 119 */               bArr3[i3] = bArr2[(i8 >> 6) & 63];
/* 127 */               bArr3[i3 + 1] = bArr2[i8 & 63];
/* 131 */               bArr3[i3 + 2] = 61;
/* 133 */               bArr3[i3 + 3] = 61;
/* 135 */               return bArr3;
                    }
/* 138 */           if (i2 == length - 2) {
/* 153 */               int i9 = ((bArr[i2 + 1] & 255) << 2) | ((bArr[i2] & 255) << 10);
/* 162 */               bArr3[i3] = bArr2[(i9 >> 12) & 63];
/* 172 */               bArr3[i3 + 1] = bArr2[(i9 >> 6) & 63];
/* 180 */               bArr3[i3 + 2] = bArr2[i9 & 63];
/* 182 */               bArr3[i3 + 3] = 61;
                    }
/* 437 */           return bArr3;
                }
            }
