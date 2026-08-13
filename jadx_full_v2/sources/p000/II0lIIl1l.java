            package p000;
            
            public abstract class II0lIIl1l {
                static {
                    String property;
                    try {
/* 3 */                 property = System.getProperty("kotlin.jvm.serialization.use8to7");
                    } catch (SecurityException unused) {
/* 8 */                 property = null;
                    }
/* 11 */            "true".equals(property);
                }

                public static byte[] I00000oIO(String[] strArr) {
/* 4 */             if (strArr == null) {
/* 214 */               Object[] objArr = new Object[3];
/* 218 */               objArr[0] = "data";
/* 222 */               objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
                        switch (7) {
                            case 1:
                            case 3:
                            case 6:
                            case 8:
                            case 10:
                            case 12:
                            case 14:
                                break;
                            case 2:
/* 265 */                       objArr[2] = "encode8to7";
                                break;
                            case 4:
/* 260 */                       objArr[2] = "addModuloByte";
                                break;
                            case 5:
/* 255 */                       objArr[2] = "splitBytesToStringArray";
                                break;
                            case 7:
/* 250 */                       objArr[2] = "decodeBytes";
                                break;
                            case 9:
/* 245 */                       objArr[2] = "dropMarker";
                                break;
                            case 11:
/* 240 */                       objArr[2] = "combineStringArrayIntoBytes";
                                break;
                            case 13:
/* 235 */                       objArr[2] = "decode7to8";
                                break;
                            default:
/* 230 */                       objArr[2] = "encodeBytes";
                                break;
                        }
/* 278 */               throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                    }
/* 7 */             if (strArr.length > 0 && !strArr[0].isEmpty()) {
/* 19 */                char cCharAt = strArr[0].charAt(0);
/* 23 */                if (cCharAt == 0) {
/* 29 */                    String[] strArr2 = (String[]) strArr.clone();
/* 37 */                    strArr2[0] = strArr2[0].substring(1);
/* 41 */                    int length = 0;
/* 42 */                    for (String str : strArr2) {
/* 50 */                        length += str.length();
                            }
/* 54 */                    byte[] bArr = new byte[length];
/* 58 */                    int i = 0;
/* 59 */                    for (String str2 : strArr2) {
/* 63 */                        int length2 = str2.length();
/* 67 */                        int i2 = 0;
/* 68 */                        while (i2 < length2) {
/* 77 */                            bArr[i] = (byte) str2.charAt(i2);
/* 79 */                            i2++;
/* 70 */                            i++;
                                }
                            }
/* 86 */                    return bArr;
                        }
/* 90 */                if (cCharAt == 65535) {
/* 96 */                    strArr = (String[]) strArr.clone();
/* 104 */                   strArr[0] = strArr[0].substring(1);
                        }
                    }
/* 108 */           int length3 = 0;
/* 109 */           for (String str3 : strArr) {
/* 117 */               length3 += str3.length();
                    }
/* 121 */           byte[] bArr2 = new byte[length3];
/* 125 */           int i3 = 0;
/* 126 */           for (String str4 : strArr) {
/* 130 */               int length4 = str4.length();
/* 134 */               int i4 = 0;
/* 135 */               while (i4 < length4) {
/* 144 */                   bArr2[i3] = (byte) str4.charAt(i4);
/* 146 */                   i4++;
/* 137 */                   i3++;
                        }
                    }
/* 154 */           for (int i5 = 0; i5 < length3; i5++) {
/* 163 */               bArr2[i5] = (byte) ((bArr2[i5] + Byte.MAX_VALUE) & 127);
                    }
/* 169 */           int i6 = (length3 * 7) / 8;
/* 171 */           byte[] bArr3 = new byte[i6];
/* 174 */           int i7 = 0;
/* 175 */           int i8 = 0;
/* 176 */           for (int i9 = 0; i9 < i6; i9++) {
/* 183 */               int i10 = i7 + 1;
/* 187 */               int i11 = i8 + 1;
/* 198 */               bArr3[i9] = (byte) (((bArr2[i7] & 255) >>> i8) + ((bArr2[i10] & ((1 << i11) - 1)) << (7 - i8)));
/* 201 */               if (i8 == 6) {
/* 203 */                   i7 += 2;
/* 205 */                   i8 = 0;
                        } else {
/* 207 */                   i7 = i10;
/* 208 */                   i8 = i11;
                        }
                    }
/* 212 */           return bArr3;
                }
            }
