            package p000;

            import com.google.ai.edge.gallery.BuildConfig;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import com.google.mlkit.vision.common.InputImage;
            
            public abstract class l10i0Ooi {
                /* JADX WARN: Removed duplicated region for block: B:53:0x0097 A[FALL_THROUGH] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static boolean I00000oIO(iOlI10l ioli10l) {
                    char cI000OiO;
/* 6 */             if (ioli10l.I0000O()) {
/* 19 */                if (!ioli10l.I000O01llI0('<')) {
/* 75 */                    int i = 0;
/* 76 */                    boolean z = true;
/* 81 */                    while (ioli10l.I0000O()) {
/* 83 */                        char cI000OiO2 = ioli10l.I000OiO();
/* 89 */                        if (cI000OiO2 == ' ') {
/* 157 */                           return !z;
                                }
/* 91 */                        if (cI000OiO2 == '\\') {
/* 132 */                           ioli10l.I000II();
/* 135 */                           char cI000OiO3 = ioli10l.I000OiO();
                                    switch (cI000OiO3) {
                                        default:
                                            switch (cI000OiO3) {
                                                default:
                                                    switch (cI000OiO3) {
                                                        case '[':
                                                        case '\\':
                                                        case ']':
                                                        case '^':
                                                        case '_':
                                                        case '`':
                                                            break;
                                                        default:
                                                            switch (cI000OiO3) {
                                                                case '{':
                                                                case '|':
                                                                case '}':
                                                                case '~':
                                                                    break;
                                                                default:
                                                                    continue;
                                                            }
                                                    }
                                                case ':':
                                                case ';':
                                                case '<':
                                                case '=':
                                                case '>':
                                                case '?':
                                                case Barcode.FORMAT_EAN_8:
/* 152 */                                           ioli10l.I000II();
                                                    break;
                                            }
                                        case '!':
                                        case '\"':
                                        case InputImage.IMAGE_FORMAT_YUV_420_888:
                                        case '$':
                                        case '%':
                                        case '&':
                                        case '\'':
                                        case '(':
                                        case ')':
                                        case '*':
                                        case '+':
                                        case ',':
                                        case BuildConfig.VERSION_CODE:
                                        case '.':
                                        case '/':
                                            break;
                                    }
                                } else if (cI000OiO2 == '(') {
/* 123 */                           i++;
/* 125 */                           if (i <= 32) {
/* 128 */                               ioli10l.I000II();
                                    }
                                } else if (cI000OiO2 != ')') {
/* 105 */                           if (Character.isISOControl(cI000OiO2)) {
/* 107 */                               return !z;
                                    }
/* 110 */                           ioli10l.I000II();
                                } else {
/* 114 */                           if (i == 0) {
/* 16 */                                return true;
                                    }
                                    i--;
/* 119 */                           ioli10l.I000II();
                                }
/* 155 */                       z = false;
                            }
/* 16 */                    return true;
                        }
/* 25 */                while (ioli10l.I0000O() && (cI000OiO = ioli10l.I000OiO()) != '\n' && cI000OiO != '<') {
/* 39 */                    if (cI000OiO == '>') {
/* 71 */                        ioli10l.I000II();
/* 16 */                        return true;
                            }
/* 41 */                    if (cI000OiO == '\\') {
/* 47 */                        ioli10l.I000II();
/* 50 */                        char cI000OiO4 = ioli10l.I000OiO();
                                switch (cI000OiO4) {
                                    case '!':
                                    case '\"':
                                    case InputImage.IMAGE_FORMAT_YUV_420_888:
                                    case '$':
                                    case '%':
                                    case '&':
                                    case '\'':
                                    case '(':
                                    case ')':
                                    case '*':
                                    case '+':
                                    case ',':
                                    case BuildConfig.VERSION_CODE:
                                    case '.':
                                    case '/':
/* 67 */                                ioli10l.I000II();
                                        break;
                                    default:
                                        switch (cI000OiO4) {
                                            case ':':
                                            case ';':
                                            case '<':
                                            case '=':
                                            case '>':
                                            case '?':
                                            case Barcode.FORMAT_EAN_8:
/* 67 */                                        ioli10l.I000II();
                                                break;
                                            default:
                                                switch (cI000OiO4) {
                                                    case '[':
                                                    case '\\':
                                                    case ']':
                                                    case '^':
                                                    case '_':
                                                    case '`':
/* 67 */                                                ioli10l.I000II();
                                                        break;
                                                    default:
                                                        switch (cI000OiO4) {
                                                            case '{':
                                                            case '|':
                                                            case '}':
                                                            case '~':
/* 67 */                                                        ioli10l.I000II();
                                                                break;
                                                        }
                                                }
                                        }
                                }
                            } else {
/* 43 */                        ioli10l.I000II();
                            }
                        }
                    }
/* 5 */             return false;
                }

                public static boolean I00000oOI(iOlI10l ioli10l) {
/* 5 */             while (ioli10l.I0000O()) {
                        switch (ioli10l.I000OiO()) {
                            case '[':
/* 42 */                        return false;
                            case '\\':
/* 18 */                        ioli10l.I000II();
/* 21 */                        char cI000OiO = ioli10l.I000OiO();
                                switch (cI000OiO) {
                                    case '!':
                                    case '\"':
                                    case InputImage.IMAGE_FORMAT_YUV_420_888:
                                    case '$':
                                    case '%':
                                    case '&':
                                    case '\'':
                                    case '(':
                                    case ')':
                                    case '*':
                                    case '+':
                                    case ',':
                                    case BuildConfig.VERSION_CODE:
                                    case '.':
                                    case '/':
/* 38 */                                ioli10l.I000II();
                                        break;
                                    default:
                                        switch (cI000OiO) {
                                            case ':':
                                            case ';':
                                            case '<':
                                            case '=':
                                            case '>':
                                            case '?':
                                            case Barcode.FORMAT_EAN_8:
/* 38 */                                        ioli10l.I000II();
                                                break;
                                            default:
                                                switch (cI000OiO) {
                                                    case '[':
                                                    case '\\':
                                                    case ']':
                                                    case '^':
                                                    case '_':
                                                    case '`':
/* 38 */                                                ioli10l.I000II();
                                                        break;
                                                    default:
                                                        switch (cI000OiO) {
                                                            case '{':
                                                            case '|':
                                                            case '}':
                                                            case '~':
/* 38 */                                                        ioli10l.I000II();
                                                                break;
                                                        }
                                                }
                                        }
                                }
                            case ']':
/* 44 */                        return true;
                            default:
/* 14 */                        ioli10l.I000II();
                                break;
                        }
                    }
/* 44 */            return true;
                }

                public static boolean I0000Il00O(iOlI10l ioli10l, char c) {
/* 5 */             while (ioli10l.I0000O()) {
/* 7 */                 char cI000OiO = ioli10l.I000OiO();
/* 13 */                if (cI000OiO == '\\') {
/* 15 */                    ioli10l.I000II();
/* 18 */                    char cI000OiO2 = ioli10l.I000OiO();
                            switch (cI000OiO2) {
                                case '!':
                                case '\"':
                                case InputImage.IMAGE_FORMAT_YUV_420_888:
                                case '$':
                                case '%':
                                case '&':
                                case '\'':
                                case '(':
                                case ')':
                                case '*':
                                case '+':
                                case ',':
                                case BuildConfig.VERSION_CODE:
                                case '.':
                                case '/':
/* 35 */                            ioli10l.I000II();
                                    break;
                                default:
                                    switch (cI000OiO2) {
                                        case ':':
                                        case ';':
                                        case '<':
                                        case '=':
                                        case '>':
                                        case '?':
                                        case Barcode.FORMAT_EAN_8:
/* 35 */                                    ioli10l.I000II();
                                            break;
                                        default:
                                            switch (cI000OiO2) {
                                                case '[':
                                                case '\\':
                                                case ']':
                                                case '^':
                                                case '_':
                                                case '`':
/* 35 */                                            ioli10l.I000II();
                                                    break;
                                                default:
                                                    switch (cI000OiO2) {
                                                        case '{':
                                                        case '|':
                                                        case '}':
                                                        case '~':
/* 35 */                                                    ioli10l.I000II();
                                                            break;
                                                    }
                                            }
                                    }
                            }
                        } else {
/* 39 */                    if (cI000OiO == c) {
/* 56 */                        return true;
                            }
/* 44 */                    if (c == ')' && cI000OiO == '(') {
/* 50 */                        return false;
                            }
/* 52 */                    ioli10l.I000II();
                        }
                    }
/* 56 */            return true;
                }
            }
