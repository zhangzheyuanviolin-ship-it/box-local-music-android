            package p000;
            
            public abstract class lOlO0Ii1o0O {
                public static String I00000oIO(IIO1i00loOo iIO1i00loOo) {
                    byte[] bArr;
/* 1 */             int size = iIO1i00loOo.size();
/* 5 */             if (size == 0) {
/* 7 */                 bArr = Iool1iioooil.I00000oIO;
                    } else {
/* 10 */                byte[] bArr2 = new byte[size];
/* 12 */                iIO1i00loOo.I0000oI00(size, bArr2);
/* 15 */                bArr = bArr2;
                    }
/* 16 */            return I00000oOI(bArr);
                }

                public static String I00000oOI(byte[] bArr) {
/* 4 */             StringBuilder sb = new StringBuilder(bArr.length);
/* 9 */             for (byte b : bArr) {
/* 15 */                if (b == 34) {
/* 129 */                   sb.append("\\\"");
                        } else if (b == 39) {
/* 123 */                   sb.append("\\'");
                        } else if (b != 92) {
                            switch (b) {
                                case 7:
/* 111 */                           sb.append("\\a");
                                    break;
                                case 8:
/* 105 */                           sb.append("\\b");
                                    break;
                                case 9:
/* 99 */                            sb.append("\\t");
                                    break;
                                case 10:
/* 93 */                            sb.append("\\n");
                                    break;
                                case 11:
/* 87 */                            sb.append("\\v");
                                    break;
                                case 12:
/* 81 */                            sb.append("\\f");
                                    break;
                                case 13:
/* 75 */                            sb.append("\\r");
                                    break;
                                default:
/* 30 */                            if (b < 32 || b > 126) {
/* 41 */                                sb.append('\\');
/* 51 */                                sb.append((char) (((b >>> 6) & 3) + 48));
/* 61 */                                sb.append((char) (((b >>> 3) & 7) + 48));
/* 69 */                                sb.append((char) ((b & 7) + 48));
                                        break;
                                    } else {
/* 37 */                                sb.append((char) b);
                                        break;
                                    }
                            }
                        } else {
/* 117 */                   sb.append("\\\\");
                        }
                    }
/* 135 */           return sb.toString();
                }
            }
