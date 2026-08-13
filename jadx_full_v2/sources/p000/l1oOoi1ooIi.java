            package p000;

            import com.google.mlkit.vision.pose.PoseLandmark;
            
            public abstract class l1oOoi1ooIi {
                public static int I00000oIO(char c, CharSequence charSequence, int i) {
/* 1 */             int length = charSequence.length();
/* 5 */             while (i < length) {
/* 11 */                if (charSequence.charAt(i) == c) {
/* 13 */                    return i;
                        }
/* 14 */                i++;
                    }
/* 17 */            return -1;
                }

                public static boolean I00000oOI(int i) {
/* 1 */             int type = Character.getType(i);
/* 8 */             if (type != 29 && type != 30) {
                        switch (type) {
                            default:
/* 19 */                        if (i != 36 && i != 43 && i != 94 && i != 96 && i != 124 && i != 126) {
                                    switch (i) {
                                        case 60:
                                        case 61:
                                        case 62:
                                            break;
                                        default:
/* 44 */                                    return false;
                                    }
                                }
                                break;
                            case PoseLandmark.RIGHT_INDEX:
                            case PoseLandmark.LEFT_THUMB:
                            case PoseLandmark.RIGHT_THUMB:
                            case PoseLandmark.LEFT_HIP:
                            case PoseLandmark.RIGHT_HIP:
/* 7 */                         return true;
                        }
                    }
/* 7 */             return true;
                }

                public static boolean I0000Il00O(int i) {
                    return i == 9 || i == 10 || i == 12 || i == 13 || i == 32 || Character.getType(i) == 12;
                }

                public static int I0000O(CharSequence charSequence, int i, int i2) {
/* 1 */             while (i < i2) {
/* 3 */                 char cCharAt = charSequence.charAt(i);
/* 9 */                 if (cCharAt != '\t' && cCharAt != ' ') {
/* 15 */                    return i;
                        }
/* 16 */                i++;
                    }
/* 215 */           return i2;
                }

                public static int I0000oI00(CharSequence charSequence, int i, int i2) {
/* 1 */             while (i >= i2) {
/* 3 */                 char cCharAt = charSequence.charAt(i);
/* 9 */                 if (cCharAt != '\t' && cCharAt != ' ') {
/* 15 */                    return i;
                        }
                        i--;
                    }
/* 19 */            return i2 - 1;
                }
            }
