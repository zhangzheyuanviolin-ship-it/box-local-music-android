            package p000;

            import java.nio.ByteBuffer;
            
            public abstract class OlloI01I {
                public int I00iOIl;
                public Object I00iiI;
                public int I00iiO;
                public int I00iio;

                public OlloI01I(int i) {
                    switch (i) {
                        case 1:
/* 26 */                    if (IOO0o0I1l.I00l0OO0IO == null) {
/* 35 */                        IOO0o0I1l.I00l0OO0IO = new IOO0o0I1l(20);
                                break;
                            }
                            break;
                        default:
/* 9 */                     if (lOOlOoll.I00l0OO0IO == null) {
/* 18 */                        lOOlOoll.I00l0OO0IO = new lOOlOoll(16);
                                break;
                            }
                            break;
                    }
                }

                public int I00000oIO(int i) {
/* 3 */             if (i < this.I00iio) {
/* 12 */                return ((ByteBuffer) this.I00iiI).getShort(this.I00iiO + i);
                    }
/* 17 */            return 0;
                }

                public void I00000oOI() {
/* 9 */             if (((O1OOII) this.I00iiI).I00ioIO == this.I00iio) {
/* 11 */                return;
                    }
/* 12 */            I000II.I001IIilI0O();
                }

                public void I0000Il00O() {
                    while (true) {
/* 1 */                 int i = this.I00iOIl;
/* 5 */                 O1OOII o1ooii = (O1OOII) this.I00iiI;
/* 9 */                 if (i >= o1ooii.I00ilO0 || o1ooii.I00iiO[i] >= 0) {
/* 55 */                    return;
                        } else {
/* 19 */                    this.I00iOIl = i + 1;
                        }
                    }
                }

                public int I0000O(int i) {
/* 3 */             if (i < this.I00iio) {
/* 12 */                return ((ByteBuffer) this.I00iiI).getShort(this.I00iiO + i);
                    }
/* 17 */            return 0;
                }

                public int I000II(int i) {
/* 3 */             int i2 = i + this.I00iOIl;
/* 13 */            return ((ByteBuffer) this.I00iiI).getInt(i2) + i2 + 4;
                }

                public int I000O01llI0(int i) {
/* 3 */             int i2 = i + this.I00iOIl;
/* 17 */            return ((ByteBuffer) this.I00iiI).getInt(((ByteBuffer) this.I00iiI).getInt(i2) + i2);
                }

                public String I000OOo1O(int i) {
                    char[] cArr;
                    int i2;
                    int i3;
                    int i4;
/* 3 */             ByteBuffer byteBuffer = (ByteBuffer) this.I00iiI;
/* 9 */             int i5 = byteBuffer.getInt(i) + i;
/* 10 */            int i6 = byteBuffer.getInt(i5);
/* 18 */            int i7 = i5 + 4;
/* 28 */            if (byteBuffer.hasArray()) {
/* 30 */                byte[] bArrArray = byteBuffer.array();
/* 38 */                int iArrayOffset = byteBuffer.arrayOffset() + i7;
/* 41 */                int length = bArrArray.length;
/* 46 */                if ((iArrayOffset | i6 | ((length - iArrayOffset) - i6)) < 0) {
/* 188 */                   OoOil11Ol1o.I000o00OoI0I("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(iArrayOffset), Integer.valueOf(i6)});
/* 20 */                    return null;
                        }
/* 48 */                int i8 = iArrayOffset + i6;
/* 50 */                cArr = new char[i6];
/* 52 */                int i9 = 0;
/* 53 */                while (iArrayOffset < i8) {
/* 55 */                    byte b = bArrArray[iArrayOffset];
/* 57 */                    if (b < 0) {
                                break;
                            }
/* 59 */                    iArrayOffset++;
/* 64 */                    cArr[i9] = (char) b;
/* 61 */                    i9++;
                        }
/* 68 */                i2 = i9;
/* 69 */                while (iArrayOffset < i8) {
/* 71 */                    int i10 = iArrayOffset + 1;
/* 73 */                    byte b2 = bArrArray[iArrayOffset];
/* 75 */                    if (b2 >= 0) {
/* 80 */                        cArr[i2] = (char) b2;
/* 77 */                        i2++;
/* 83 */                        iArrayOffset = i10;
/* 84 */                        while (iArrayOffset < i8) {
/* 86 */                            byte b3 = bArrArray[iArrayOffset];
/* 88 */                            if (b3 >= 0) {
/* 90 */                                iArrayOffset++;
/* 95 */                                cArr[i2] = (char) b3;
/* 92 */                                i2++;
                                    }
                                }
                            } else {
/* 99 */                        if (b2 < -32) {
/* 101 */                           if (i10 >= i8) {
/* 114 */                               I000II.I000iOII("Invalid UTF-8");
/* 20 */                                return null;
                                    }
/* 103 */                           i4 = i2 + 1;
/* 105 */                           iArrayOffset += 2;
/* 109 */                           lilIolll11Io.I0000Il00O(b2, bArrArray[i10], cArr, i2);
                                } else if (b2 < -16) {
/* 122 */                           if (i10 >= i8 - 1) {
/* 138 */                               I000II.I000iOII("Invalid UTF-8");
/* 20 */                                return null;
                                    }
/* 124 */                           i4 = i2 + 1;
/* 126 */                           int i11 = iArrayOffset + 2;
/* 130 */                           iArrayOffset += 3;
/* 134 */                           lilIolll11Io.I00000oOI(b2, bArrArray[i10], bArrArray[i11], cArr, i2);
                                } else {
/* 144 */                           if (i10 >= i8 - 2) {
/* 166 */                               I000II.I000iOII("Invalid UTF-8");
/* 20 */                                return null;
                                    }
/* 148 */                           byte b4 = bArrArray[i10];
/* 150 */                           int i12 = iArrayOffset + 3;
/* 152 */                           byte b5 = bArrArray[iArrayOffset + 2];
/* 154 */                           iArrayOffset += 4;
/* 160 */                           lilIolll11Io.I00000oIO(b2, b4, b5, bArrArray[i12], cArr, i2);
/* 163 */                           i2 += 2;
                                }
/* 112 */                       i2 = i4;
                            }
                        }
                    } else {
/* 201 */               if ((i7 | i6 | ((byteBuffer.limit() - i7) - i6)) < 0) {
/* 371 */                   OoOil11Ol1o.I000o00OoI0I("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i7), Integer.valueOf(i6)});
/* 20 */                    return null;
                        }
/* 203 */               int i13 = i7 + i6;
/* 205 */               cArr = new char[i6];
/* 207 */               int i14 = 0;
/* 208 */               while (i7 < i13) {
/* 210 */                   byte b6 = byteBuffer.get(i7);
/* 214 */                   if (b6 < 0) {
                                break;
                            }
/* 216 */                   i7++;
/* 221 */                   cArr[i14] = (char) b6;
/* 218 */                   i14++;
                        }
/* 225 */               i2 = i14;
/* 226 */               while (i7 < i13) {
/* 228 */                   int i15 = i7 + 1;
/* 230 */                   byte b7 = byteBuffer.get(i7);
/* 234 */                   if (b7 >= 0) {
/* 239 */                       cArr[i2] = (char) b7;
/* 236 */                       i2++;
/* 242 */                       i7 = i15;
/* 243 */                       while (i7 < i13) {
/* 245 */                           byte b8 = byteBuffer.get(i7);
/* 249 */                           if (b8 >= 0) {
/* 251 */                               i7++;
/* 256 */                               cArr[i2] = (char) b8;
/* 253 */                               i2++;
                                    }
                                }
                            } else {
/* 260 */                       if (b7 < -32) {
/* 262 */                           if (i15 >= i13) {
/* 277 */                               I000II.I000iOII("Invalid UTF-8");
/* 20 */                                return null;
                                    }
/* 264 */                           i3 = i2 + 1;
/* 266 */                           i7 += 2;
/* 272 */                           lilIolll11Io.I0000Il00O(b7, byteBuffer.get(i15), cArr, i2);
                                } else if (b7 < -16) {
/* 285 */                           if (i15 >= i13 - 1) {
/* 305 */                               I000II.I000iOII("Invalid UTF-8");
/* 20 */                                return null;
                                    }
/* 287 */                           i3 = i2 + 1;
/* 289 */                           int i16 = i7 + 2;
/* 295 */                           i7 += 3;
/* 301 */                           lilIolll11Io.I00000oOI(b7, byteBuffer.get(i15), byteBuffer.get(i16), cArr, i2);
                                } else {
/* 311 */                           if (i15 >= i13 - 2) {
/* 339 */                               I000II.I000iOII("Invalid UTF-8");
/* 20 */                                return null;
                                    }
/* 315 */                           byte b9 = byteBuffer.get(i15);
/* 319 */                           int i17 = i7 + 3;
/* 321 */                           byte b10 = byteBuffer.get(i7 + 2);
/* 325 */                           i7 += 4;
/* 333 */                           lilIolll11Io.I00000oIO(b7, b9, b10, byteBuffer.get(i17), cArr, i2);
/* 336 */                           i2 += 2;
                                }
/* 275 */                       i2 = i3;
                            }
                        }
                    }
/* 345 */           return new String(cArr, 0, i2);
                }

                public void I000OiO(int i, ByteBuffer byteBuffer) {
                    short s;
/* 1 */             this.I00iiI = byteBuffer;
/* 3 */             if (byteBuffer != null) {
/* 5 */                 this.I00iOIl = i;
/* 11 */                int i2 = i - byteBuffer.getInt(i);
/* 12 */                this.I00iiO = i2;
/* 18 */                s = ((ByteBuffer) this.I00iiI).getShort(i2);
                    } else {
/* 25 */                s = 0;
/* 26 */                this.I00iOIl = 0;
/* 28 */                this.I00iiO = 0;
                    }
/* 22 */            this.I00iio = s;
                }

                public boolean hasNext() {
                    return this.I00iOIl < ((O1OOII) this.I00iiI).I00ilO0;
                }

                public void remove() {
/* 3 */             O1OOII o1ooii = (O1OOII) this.I00iiI;
/* 5 */             I00000oOI();
/* 11 */            if (this.I00iiO == -1) {
/* 30 */                I000II.I001IO000("Call next() before removing element from the iterator.");
/* 55 */                return;
                    }
/* 13 */            o1ooii.I0000Il00O();
/* 18 */            o1ooii.I000iOII(this.I00iiO);
/* 21 */            this.I00iiO = -1;
/* 25 */            this.I00iio = o1ooii.I00ioIO;
                }
            }
