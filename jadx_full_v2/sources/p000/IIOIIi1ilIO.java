            package p000;

            import java.io.Serializable;
            import java.util.Arrays;
            
            public class IIOIIi1ilIO implements Serializable, Comparable {
                public static final IIOIIi1ilIO I00iio = new IIOIIi1ilIO(new byte[0]);
                public final byte[] I00iOIl;
                public transient int I00iiI;
                public transient String I00iiO;

                public IIOIIi1ilIO(byte[] bArr) {
/* 4 */             this.I00iOIl = bArr;
                }

                public static int I0000oI00(IIOIIi1ilIO iIOIIi1ilIO, IIOIIi1ilIO iIOIIi1ilIO2) {
/* 1 */             iIOIIi1ilIO.getClass();
/* 9 */             return iIOIIi1ilIO.I0000O(0, iIOIIi1ilIO2.I0001Ioi1lo());
                }

                public static IIOIIi1ilIO I000l1(IIOIIi1ilIO iIOIIi1ilIO, int i, int i2, int i3) {
/* 3 */             if ((i3 & 1) != 0) {
/* 5 */                 i = 0;
                    }
/* 8 */             if ((i3 & 2) != 0) {
/* 10 */                i2 = -1234567890;
                    }
/* 13 */            return iIOIIi1ilIO.I000iOII(i, i2);
                }

                @Override
                public final int compareTo(IIOIIi1ilIO iIOIIi1ilIO) {
/* 1 */             int iI00000oOI = I00000oOI();
/* 5 */             int iI00000oOI2 = iIOIIi1ilIO.I00000oOI();
/* 9 */             int iMin = Math.min(iI00000oOI, iI00000oOI2);
/* 17 */            for (int i = 0; i < iMin; i++) {
/* 23 */                int iI000II = I000II(i) & 255;
/* 29 */                int iI000II2 = iIOIIi1ilIO.I000II(i) & 255;
/* 31 */                if (iI000II != iI000II2) {
                            return iI000II < iI000II2 ? -1 : 1;
                        }
                    }
/* 40 */            if (iI00000oOI == iI00000oOI2) {
/* 13 */                return 0;
                    }
                    return iI00000oOI < iI00000oOI2 ? -1 : 1;
                }

                public int I00000oOI() {
/* 3 */             return this.I00iOIl.length;
                }

                public String I0000Il00O() {
/* 1 */             byte[] bArr = this.I00iOIl;
/* 6 */             char[] cArr = new char[bArr.length * 2];
/* 10 */            int i = 0;
/* 11 */            for (byte b : bArr) {
/* 15 */                int i2 = i + 1;
/* 17 */                char[] cArr2 = I0lllI01iooo.I00000oIO;
/* 25 */                cArr[i] = cArr2[(b >> 4) & 15];
/* 27 */                i += 2;
/* 33 */                cArr[i2] = cArr2[b & 15];
                    }
/* 40 */            return new String(cArr);
                }

                public int I0000O(int i, byte[] bArr) {
/* 1 */             byte[] bArr2 = this.I00iOIl;
/* 5 */             int length = bArr2.length - bArr.length;
/* 7 */             int iMax = Math.max(i, 0);
/* 11 */            if (iMax > length) {
/* 26 */                return -1;
                    }
/* 18 */            while (!iO1oO1OoOoii.I00000oIO(bArr2, iMax, bArr, 0, bArr.length)) {
/* 21 */                if (iMax == length) {
/* 26 */                    return -1;
                        }
/* 23 */                iMax++;
                    }
/* 20 */            return iMax;
                }

                public byte[] I0001Ioi1lo() {
/* 1 */             return this.I00iOIl;
                }

                public byte I000II(int i) {
/* 3 */             return this.I00iOIl[i];
                }

                public int I000O01llI0(byte[] bArr) {
/* 1 */             int iI00000oOI = I00000oOI();
/* 5 */             byte[] bArr2 = this.I00iOIl;
/* 15 */            for (int iMin = Math.min(iI00000oOI, bArr2.length - bArr.length); -1 < iMin; iMin--) {
/* 23 */                if (iO1oO1OoOoii.I00000oIO(bArr2, iMin, bArr, 0, bArr.length)) {
/* 25 */                    return iMin;
                        }
                    }
/* 14 */            return -1;
                }

                public boolean I000OOo1O(int i, IIOIIi1ilIO iIOIIi1ilIO, int i2) {
/* 4 */             return iIOIIi1ilIO.I000OiO(0, this.I00iOIl, i, i2);
                }

                public boolean I000OiO(int i, byte[] bArr, int i2, int i3) {
/* 1 */             if (i < 0) {
/* 23 */                return false;
                    }
/* 3 */             byte[] bArr2 = this.I00iOIl;
                    return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && iO1oO1OoOoii.I00000oIO(bArr2, i, bArr, i2, i3);
                }

                public IIOIIi1ilIO I000iOII(int i, int i2) {
/* 4 */             if (i2 == -1234567890) {
/* 6 */                 i2 = I00000oOI();
                    }
/* 11 */            if (i < 0) {
/* 64 */                I000II.I000iOII("beginIndex < 0");
/* 10 */                return null;
                    }
/* 13 */            byte[] bArr = this.I00iOIl;
/* 16 */            if (i2 > bArr.length) {
/* 58 */                I000II.I0010I0i(Oi010OO0.I001i1lo1io(new StringBuilder("endIndex > length("), bArr.length, ')'));
/* 10 */                return null;
                    }
/* 20 */            if (i2 - i >= 0) {
                        return (i == 0 && i2 == bArr.length) ? this : new IIOIIi1ilIO(I1IoiO1l.I00100l0(bArr, i, i2));
                    }
/* 40 */            I000II.I000iOII("endIndex < beginIndex");
/* 10 */            return null;
                }

                public IIOIIi1ilIO I000lI() {
/* 1 */             int i = 0;
                    while (true) {
/* 2 */                 byte[] bArr = this.I00iOIl;
/* 5 */                 if (i >= bArr.length) {
/* 113 */                   return this;
                        }
/* 7 */                 byte b = bArr[i];
/* 11 */                if (b >= 65 && b <= 90) {
/* 19 */                    byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
/* 28 */                    bArrCopyOf[i] = (byte) (b + 32);
/* 31 */                    for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
/* 33 */                        byte b2 = bArrCopyOf[i2];
/* 35 */                        if (b2 >= 65 && b2 <= 90) {
/* 43 */                            bArrCopyOf[i2] = (byte) (b2 + 32);
                                }
                            }
/* 50 */                    return new IIOIIi1ilIO(bArrCopyOf);
                        }
/* 54 */                i++;
                    }
                }

                public final String I000o00OoI0I() {
/* 1 */             String str = this.I00iiO;
/* 3 */             if (str != null) {
/* 29 */                return str;
                    }
/* 13 */            String str2 = new String(I0001Ioi1lo(), IO1IOI.I00000oIO);
/* 16 */            this.I00iiO = str2;
/* 18 */            return str2;
                }

                public void I000oI1ioi(III1o0lOio0 iII1o0lOio0, int i) {
/* 3 */             iII1o0lOio0.I00ioIO(i, this.I00iOIl);
                }

                public boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 27 */                return true;
                    }
/* 7 */             if (obj instanceof IIOIIi1ilIO) {
/* 9 */                 IIOIIi1ilIO iIOIIi1ilIO = (IIOIIi1ilIO) obj;
/* 11 */                int iI00000oOI = iIOIIi1ilIO.I00000oOI();
/* 15 */                byte[] bArr = this.I00iOIl;
/* 18 */                if (iI00000oOI == bArr.length && iIOIIi1ilIO.I000OiO(0, bArr, 0, bArr.length)) {
/* 27 */                    return true;
                        }
                    }
/* 6 */             return false;
                }

                public int hashCode() {
/* 1 */             int i = this.I00iiI;
/* 3 */             if (i != 0) {
/* 5 */                 return i;
                    }
/* 8 */             int iHashCode = Arrays.hashCode(this.I00iOIl);
/* 12 */            this.I00iiI = iHashCode;
/* 29 */            return iHashCode;
                }

                public String toString() {
                    byte b;
                    int i;
/* 1 */             IIOIIi1ilIO iIOIIi1ilIO = this;
/* 3 */             byte[] bArr = iIOIIi1ilIO.I00iOIl;
/* 6 */             if (bArr.length == 0) {
/* 8 */                 return "[size=0]";
                    }
/* 11 */            int length = bArr.length;
/* 12 */            int i2 = 0;
/* 13 */            int i3 = 0;
/* 14 */            int i4 = 0;
                    loop0: while (true) {
/* 17 */                if (i2 >= length) {
                            break;
                        }
/* 19 */                byte b2 = bArr[i2];
/* 40 */                if (b2 >= 0) {
/* 42 */                    int i5 = i4 + 1;
/* 44 */                    if (i4 == 64) {
                                break;
                            }
/* 48 */                    if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                                break;
                            }
/* 74 */                    i3 += b2 < 65536 ? 1 : 2;
/* 75 */                    i2++;
                            while (true) {
/* 77 */                        i4 = i5;
/* 79 */                        if (i2 < length && (b = bArr[i2]) >= 0) {
/* 85 */                            i2++;
/* 87 */                            i5 = i4 + 1;
/* 89 */                            if (i4 == 64) {
                                        break loop0;
                                    }
/* 93 */                            if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (Byte.MAX_VALUE <= b && b < 160))) || b == 65533) {
                                        break loop0;
                                    }
/* 117 */                           i3 += b < 65536 ? 1 : 2;
                                } else {
                                    break;
                                }
                            }
                        } else if ((b2 >> 5) == -2) {
/* 126 */                   int i6 = i2 + 1;
/* 128 */                   if (length > i6) {
/* 134 */                       byte b3 = bArr[i6];
/* 138 */                       if ((b3 & 192) == 128) {
/* 144 */                           int i7 = (b3 ^ 3968) ^ (b2 << 6);
/* 145 */                           if (i7 >= 128) {
/* 151 */                               i = i4 + 1;
/* 153 */                               if (i4 == 64) {
                                            break;
                                        }
/* 157 */                               if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                            break;
                                        }
/* 183 */                               i3 += i7 < 65536 ? 1 : 2;
/* 185 */                               i2 += 2;
/* 187 */                               i4 = i;
                                    } else if (i4 != 64) {
                                        break;
                                    }
                                } else if (i4 != 64) {
                                    break;
                                }
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if ((b2 >> 4) == -2) {
/* 204 */                   int i8 = i2 + 2;
/* 206 */                   if (length > i8) {
/* 214 */                       byte b4 = bArr[i2 + 1];
/* 218 */                       if ((b4 & 192) == 128) {
/* 220 */                           byte b5 = bArr[i8];
/* 224 */                           if ((b5 & 192) == 128) {
/* 235 */                               int i9 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
/* 238 */                               if (i9 < 2048) {
/* 240 */                                   if (i4 != 64) {
                                                break;
                                            }
                                        } else if (55296 > i9 || i9 >= 57344) {
/* 252 */                                   i = i4 + 1;
/* 254 */                                   if (i4 == 64) {
                                                break;
                                            }
/* 258 */                                   if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                                break;
                                            }
/* 291 */                                   i3 += i9 < 65536 ? 1 : 2;
/* 293 */                                   i2 += 3;
/* 187 */                                   i4 = i;
                                        } else if (i4 != 64) {
                                            break;
                                        }
                                    } else if (i4 != 64) {
                                        break;
                                    }
                                } else if (i4 != 64) {
                                    break;
                                }
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if ((b2 >> 3) == -2) {
/* 308 */                   int i10 = i2 + 3;
/* 310 */                   if (length > i10) {
/* 318 */                       byte b6 = bArr[i2 + 1];
/* 322 */                       if ((b6 & 192) == 128) {
/* 326 */                           byte b7 = bArr[i2 + 2];
/* 330 */                           if ((b7 & 192) == 128) {
/* 332 */                               byte b8 = bArr[i10];
/* 336 */                               if ((b8 & 192) == 128) {
/* 350 */                                   int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
/* 354 */                                   if (i11 > 1114111) {
/* 356 */                                       if (i4 != 64) {
                                                    break;
                                                }
                                            } else if (55296 > i11 || i11 >= 57344) {
/* 368 */                                       if (i11 >= 65536) {
/* 373 */                                           i = i4 + 1;
/* 375 */                                           if (i4 == 64) {
                                                        break;
                                                    }
/* 378 */                                           if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                                        break;
                                                    }
/* 413 */                                           i3 += i11 < 65536 ? 1 : 2;
/* 415 */                                           i2 += 4;
/* 187 */                                           i4 = i;
                                                } else if (i4 != 64) {
                                                    break;
                                                }
                                            } else if (i4 != 64) {
                                                break;
                                            }
                                        } else if (i4 != 64) {
                                            break;
                                        }
                                    } else if (i4 != 64) {
                                        break;
                                    }
                                } else if (i4 != 64) {
                                    break;
                                }
                            } else if (i4 != 64) {
                                break;
                            }
                        } else if (i4 != 64) {
                            break;
                        }
                    }
/* 64 */            i3 = -1;
/* 437 */           if (i3 != -1) {
/* 529 */               String strI000o00OoI0I = iIOIIi1ilIO.I000o00OoI0I();
/* 558 */               String strI000iOII = OlOolloIIOl0.I000iOII(OlOolloIIOl0.I000iOII(OlOolloIIOl0.I000iOII(strI000o00OoI0I.substring(0, i3), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
/* 566 */               if (i3 >= strI000o00OoI0I.length()) {
/* 595 */                   return IIl001iO0Io.I000iOII(']', "[text=", strI000iOII);
                        }
/* 588 */               return "[size=" + bArr.length + " text=" + strI000iOII + "…]";
                    }
/* 440 */           if (bArr.length <= 64) {
/* 459 */               return "[hex=" + iIOIIi1ilIO.I0000Il00O() + ']';
                    }
/* 466 */           StringBuilder sb = new StringBuilder("[size=");
/* 470 */           sb.append(bArr.length);
/* 475 */           sb.append(" hex=");
/* 479 */           if (64 > bArr.length) {
/* 524 */               I000II.I0010I0i(Oi010OO0.I001i1lo1io(new StringBuilder("endIndex > length("), bArr.length, ')'));
/* 527 */               return null;
                    }
/* 482 */           if (64 != bArr.length) {
/* 492 */               iIOIIi1ilIO = new IIOIIi1ilIO(I1IoiO1l.I00100l0(bArr, 0, 64));
                    }
/* 499 */           sb.append(iIOIIi1ilIO.I0000Il00O());
/* 502 */           sb.append("…]");
/* 505 */           return sb.toString();
                }
            }
