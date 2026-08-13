            package p000;
            
            public final class OI1Iio0ii1 implements Comparable {
                public final String I00iOIl;
                public final boolean I00iiI;

                public OI1Iio0ii1(String str, boolean z) {
/* 1 */             if (str == null) {
/* 12 */                I00000oIO(0);
/* 89 */                throw null;
                    }
/* 6 */             this.I00iOIl = str;
/* 8 */             this.I00iiI = z;
                }

                public static void I00000oIO(int i) {
/* 16 */            String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
/* 29 */            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 2 : 3];
/* 34 */            if (i == 1 || i == 2 || i == 3 || i == 4) {
/* 47 */                objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
                    } else {
/* 44 */                objArr[0] = "name";
                    }
/* 49 */            if (i == 1) {
/* 72 */                objArr[1] = "asString";
                    } else if (i == 2) {
/* 67 */                objArr[1] = "getIdentifier";
                    } else if (i == 3 || i == 4) {
/* 62 */                objArr[1] = "asStringStripSpecialMarkers";
                    } else {
/* 57 */                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
                    }
                    switch (i) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            break;
                        case 5:
/* 104 */                   objArr[2] = "identifier";
                            break;
                        case 6:
/* 99 */                    objArr[2] = "isValidIdentifier";
                            break;
                        case 7:
/* 94 */                    objArr[2] = "identifierIfValid";
                            break;
                        case 8:
/* 89 */                    objArr[2] = "special";
                            break;
                        case 9:
/* 84 */                    objArr[2] = "guessByFirstCharacter";
                            break;
                        default:
/* 79 */                    objArr[2] = "<init>";
                            break;
                    }
/* 106 */           String str2 = String.format(str, objArr);
/* 110 */           if (i != 1 && i != 2 && i != 3 && i != 4) {
/* 129 */               throw new IllegalArgumentException(str2);
                    }
/* 129 */           throw new IllegalStateException(str2);
                }

                public static OI1Iio0ii1 I0000O(String str) {
/* 1 */             if (str != null) {
                        return str.startsWith("<") ? I000II(str) : I0000oI00(str);
                    }
/* 23 */            I00000oIO(9);
/* 49 */            throw null;
                }

                public static OI1Iio0ii1 I0000oI00(String str) {
/* 1 */             if (str != null) {
/* 6 */                 return new OI1Iio0ii1(str, false);
                    }
/* 11 */            I00000oIO(5);
/* 49 */            throw null;
                }

                public static boolean I0001Ioi1lo(String str) {
/* 6 */             if (!str.isEmpty() && !str.startsWith("<")) {
/* 22 */                for (int i = 0; i < str.length(); i++) {
/* 24 */                    char cCharAt = str.charAt(i);
/* 30 */                    if (cCharAt != '.' && cCharAt != '/' && cCharAt != '\\') {
                            }
                        }
/* 44 */                return true;
                    }
/* 5 */             return false;
                }

                public static OI1Iio0ii1 I000II(String str) {
/* 2 */             if (str == null) {
/* 31 */                I00000oIO(8);
/* 49 */                throw null;
                    }
/* 10 */            if (str.startsWith("<")) {
/* 15 */                return new OI1Iio0ii1(str, true);
                    }
/* 25 */            I000II.I000iOII("special name must start with '<': ".concat(str));
/* 1 */             return null;
                }

                public final String I00000oOI() {
/* 1 */             String str = this.I00iOIl;
/* 3 */             if (str != null) {
/* 5 */                 return str;
                    }
/* 7 */             I00000oIO(1);
/* 29 */            throw null;
                }

                public final String I0000Il00O() {
/* 4 */             if (this.I00iiI) {
/* 20 */                IoOOl0iOl1io.I000OOo1O("not identifier: ", this);
/* 3 */                 return null;
                    }
/* 6 */             String strI00000oOI = I00000oOI();
/* 10 */            if (strI00000oOI != null) {
/* 12 */                return strI00000oOI;
                    }
/* 14 */            I00000oIO(2);
/* 17 */            throw null;
                }

                @Override
                public final int compareTo(Object obj) {
/* 7 */             return this.I00iOIl.compareTo(((OI1Iio0ii1) obj).I00iOIl);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 30 */                return true;
                    }
/* 6 */             if (!(obj instanceof OI1Iio0ii1)) {
/* 28 */                return false;
                    }
/* 9 */             OI1Iio0ii1 oI1Iio0ii1 = (OI1Iio0ii1) obj;
                    return this.I00iiI == oI1Iio0ii1.I00iiI && this.I00iOIl.equals(oI1Iio0ii1.I00iOIl);
                }

                public final int hashCode() {
/* 11 */            return (this.I00iOIl.hashCode() * 31) + (this.I00iiI ? 1 : 0);
                }

                public final String toString() {
/* 1 */             return this.I00iOIl;
                }
            }
