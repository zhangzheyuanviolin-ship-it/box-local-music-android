            package p000;
            
            public abstract class liiIOIio1ll {
                public static String I00000oIO(byte[] bArr) {
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
