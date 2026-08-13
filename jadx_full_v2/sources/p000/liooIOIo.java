            package p000;
            
            public abstract class liooIOIo {
                public static String I00000oIO(il1oII0OlIo il1oii0olio) {
/* 7 */             StringBuilder sb = new StringBuilder(il1oii0olio.I0001Ioi1lo());
/* 15 */            for (int i = 0; i < il1oii0olio.I0001Ioi1lo(); i++) {
/* 17 */                byte bI00000oOI = il1oii0olio.I00000oOI(i);
/* 23 */                if (bI00000oOI == 34) {
/* 137 */                   sb.append("\\\"");
                        } else if (bI00000oOI == 39) {
/* 131 */                   sb.append("\\'");
                        } else if (bI00000oOI != 92) {
                            switch (bI00000oOI) {
                                case 7:
/* 119 */                           sb.append("\\a");
                                    break;
                                case 8:
/* 113 */                           sb.append("\\b");
                                    break;
                                case 9:
/* 107 */                           sb.append("\\t");
                                    break;
                                case 10:
/* 101 */                           sb.append("\\n");
                                    break;
                                case 11:
/* 95 */                            sb.append("\\v");
                                    break;
                                case 12:
/* 89 */                            sb.append("\\f");
                                    break;
                                case 13:
/* 83 */                            sb.append("\\r");
                                    break;
                                default:
/* 38 */                            if (bI00000oOI < 32 || bI00000oOI > 126) {
/* 49 */                                sb.append('\\');
/* 59 */                                sb.append((char) (((bI00000oOI >>> 6) & 3) + 48));
/* 69 */                                sb.append((char) (((bI00000oOI >>> 3) & 7) + 48));
/* 77 */                                sb.append((char) ((bI00000oOI & 7) + 48));
                                        break;
                                    } else {
/* 45 */                                sb.append((char) bI00000oOI);
                                        break;
                                    }
                            }
                        } else {
/* 125 */                   sb.append("\\\\");
                        }
                    }
/* 144 */           return sb.toString();
                }
            }
