            package p000;

            import java.net.IDN;
            import java.net.InetAddress;
            import java.util.Locale;
            
            public abstract class iloo10Oil {
                /* JADX WARN: Code restructure failed: missing block: B:64:0x00cb, code lost:
                
                    if (r7 == 16) goto L69;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:65:0x00cd, code lost:
                
                    if (r8 != (-1)) goto L68;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:68:0x00d1, code lost:
                
                    r0 = r7 - r8;
                    java.lang.System.arraycopy(r3, r8, r3, 16 - r0, r0);
                    java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:70:0x00e1, code lost:
                
                    return java.net.InetAddress.getByAddress(r3);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
                
                    return null;
                 */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final InetAddress I00000oIO(int i, int i2, String str) {
                    int i3;
/* 7 */             byte[] bArr = new byte[16];
/* 11 */            int i4 = i;
/* 13 */            int i5 = 0;
/* 14 */            int i6 = -1;
/* 15 */            int i7 = -1;
                    while (true) {
/* 16 */                if (i4 >= i2) {
                            break;
                        }
/* 18 */                if (i5 == 16) {
/* 208 */                   return null;
                        }
/* 22 */                int i8 = i4 + 2;
/* 26 */                if (i8 <= i2 && str.startsWith("::", i4)) {
/* 36 */                    if (i6 != -1) {
/* 208 */                       return null;
                            }
/* 40 */                    i5 += 2;
/* 42 */                    i6 = i5;
/* 43 */                    if (i8 == i2) {
                                break;
                            }
/* 47 */                    i7 = i8;
/* 159 */                   int i9 = 0;
/* 160 */                   i4 = i7;
/* 161 */                   while (i4 < i2) {
                            }
/* 179 */                   i3 = i4 - i7;
                            return i3 == 0 ? null : null;
                        }
/* 50 */                if (i5 != 0) {
/* 58 */                    if (str.startsWith(":", i4)) {
/* 60 */                        i4++;
                            } else {
/* 71 */                        if (!str.startsWith(".", i4)) {
/* 208 */                           return null;
                                }
                                int i10 = i5 - 2;
/* 75 */                        int i11 = i10;
/* 76 */                        while (i7 < i2) {
/* 78 */                            if (i11 == 16) {
/* 208 */                               return null;
                                    }
/* 82 */                            if (i11 != i10) {
/* 90 */                                if (str.charAt(i7) != '.') {
/* 208 */                                   return null;
                                        }
/* 94 */                                i7++;
                                    }
/* 96 */                            int i12 = 0;
/* 97 */                            int i13 = i7;
/* 98 */                            while (i13 < i2) {
/* 100 */                               char cCharAt = str.charAt(i13);
/* 110 */                               if (O0000Ioio00.I0000oI00(cCharAt, 48) < 0 || O0000Ioio00.I0000oI00(cCharAt, 57) > 0) {
                                            break;
                                        }
/* 123 */                               if ((i12 == 0 && i7 != i13) || ((i12 * 10) + cCharAt) - 48 > 255) {
/* 208 */                                   return null;
                                        }
/* 136 */                               i13++;
                                    }
/* 141 */                           if (i13 - i7 == 0) {
/* 208 */                               return null;
                                    }
/* 147 */                           bArr[i11] = (byte) i12;
/* 144 */                           i11++;
/* 150 */                           i7 = i13;
                                }
/* 154 */                       if (i11 != i5 + 2) {
/* 208 */                           return null;
                                }
/* 156 */                       i5 += 2;
                            }
                        }
/* 62 */                i7 = i4;
/* 159 */               int i92 = 0;
/* 160 */               i4 = i7;
/* 161 */               while (i4 < i2) {
/* 167 */                   int iI00100o1O0lo = OollIoI001lo.I00100o1O0lo(str.charAt(i4));
/* 171 */                   if (iI00100o1O0lo == -1) {
                                break;
                            }
/* 175 */                   i92 = (i92 << 4) + iI00100o1O0lo;
/* 176 */                   i4++;
                        }
/* 179 */               i3 = i4 - i7;
/* 184 */               if (i3 == 0 && i3 <= 4) {
/* 187 */                   int i14 = i5 + 1;
/* 193 */                   bArr[i5] = (byte) (255 & (i92 >>> 8));
/* 195 */                   i5 += 2;
/* 200 */                   bArr[i14] = (byte) (i92 & 255);
                        }
                    }
                }

                public static final String I00000oOI(String str) {
                    int i;
/* 3 */             int i2 = 0;
/* 8 */             int i3 = -1;
/* 10 */            if (OlOoOIi0o.I000oI1ioi(str, ":", false)) {
/* 43 */                InetAddress inetAddressI00000oIO = (OlOolloIIOl0.I000l1(str, "[", false) && OlOolloIIOl0.I000II(str, "]", false)) ? I00000oIO(1, str.length() - 1, str) : I00000oIO(0, str.length(), str);
/* 47 */                if (inetAddressI00000oIO != null) {
/* 51 */                    byte[] address = inetAddressI00000oIO.getAddress();
/* 59 */                    if (address.length != 16) {
/* 148 */                       if (address.length == 4) {
/* 150 */                           return inetAddressI00000oIO.getHostAddress();
                                }
/* 163 */                       I000II.I000O01llI0(IIl001iO0Io.I000iOII('\'', "Invalid IPv6 address: '", str));
/* 9 */                         return null;
                            }
/* 61 */                    int i4 = 0;
/* 62 */                    int i5 = 0;
/* 64 */                    while (i4 < address.length) {
/* 66 */                        int i6 = i4;
/* 67 */                        while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
/* 79 */                            i6 += 2;
                                }
/* 82 */                        int i7 = i6 - i4;
/* 84 */                        if (i7 > i5 && i7 >= 4) {
/* 88 */                            i3 = i4;
/* 89 */                            i5 = i7;
                                }
/* 90 */                        i4 = i6 + 2;
                            }
/* 95 */                    III1o0lOio0 iII1o0lOio0 = new III1o0lOio0();
/* 99 */                    while (i2 < address.length) {
/* 103 */                       if (i2 == i3) {
/* 105 */                           iII1o0lOio0.I00lll10(58);
/* 108 */                           i2 += i5;
/* 109 */                           if (i2 == 16) {
/* 111 */                               iII1o0lOio0.I00lll10(58);
                                    }
                                } else {
/* 115 */                           if (i2 > 0) {
/* 117 */                               iII1o0lOio0.I00lll10(58);
                                    }
/* 120 */                           byte b = address[i2];
/* 122 */                           byte[] bArr = OollIoI001lo.I00000oIO;
/* 136 */                           iII1o0lOio0.I00o0iI0io1(((b & 255) << 8) | (address[i2 + 1] & 255));
/* 139 */                           i2 += 2;
                                }
                            }
/* 142 */                   return iII1o0lOio0.I00Ol00();
                        }
                    } else {
                        try {
/* 173 */                   String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
/* 181 */                   if (lowerCase.length() != 0) {
/* 184 */                       int length = lowerCase.length();
/* 189 */                       for (0; i < length; i + 1) {
/* 191 */                           char cCharAt = lowerCase.charAt(i);
/* 222 */                           i = (O0000Ioio00.I0000oI00(cCharAt, 31) > 0 && O0000Ioio00.I0000oI00(cCharAt, 127) < 0 && OlOoOIi0o.I001i1O0Ol(" #%/:?@[\\]", cCharAt, 0, 6) == -1) ? i + 1 : 0;
                                }
/* 225 */                       return lowerCase;
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                    }
/* 9 */             return null;
                }
            }
