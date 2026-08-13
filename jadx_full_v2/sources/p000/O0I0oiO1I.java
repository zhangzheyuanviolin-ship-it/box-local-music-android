            package p000;
            
            public final class O0I0oiO1I {
                public final String I00000oIO;

                public O0I0oiO1I(String str) {
/* 1 */             if (str != null) {
/* 6 */                 this.I00000oIO = str;
                    } else {
/* 10 */                I00000oIO(7);
/* 49 */                throw null;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I00000oIO(int i) {
                    String str;
                    int i2;
/* 3 */             if (i != 3 && i != 5) {
                        switch (i) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
/* 10 */                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                break;
                        }
                    } else {
/* 13 */                str = "@NotNull method %s.%s must not return null";
                    }
/* 16 */            if (i != 3 && i != 5) {
                        switch (i) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
/* 23 */                        i2 = 3;
                                break;
                        }
                    } else {
/* 25 */                i2 = 2;
                    }
/* 26 */            Object[] objArr = new Object[i2];
                    switch (i) {
                        case 1:
                        case 2:
/* 49 */                    objArr[0] = "classId";
                            break;
                        case 3:
                        case 5:
                        case 8:
                        case 9:
                        case 10:
/* 44 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                            break;
                        case 4:
                        case 6:
/* 41 */                    objArr[0] = "fqName";
                            break;
                        case 7:
                        default:
/* 36 */                    objArr[0] = "internalName";
                            break;
                    }
/* 56 */            if (i == 3) {
/* 84 */                objArr[1] = "internalNameByClassId";
                    } else if (i != 5) {
                        switch (i) {
                            case 8:
/* 78 */                        objArr[1] = "getFqNameForClassNameWithoutDollars";
                                break;
                            case 9:
/* 73 */                        objArr[1] = "getPackageFqName";
                                break;
                            case 10:
/* 68 */                        objArr[1] = "getInternalName";
                                break;
                            default:
/* 63 */                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                                break;
                        }
                    } else {
/* 81 */                objArr[1] = "byFqNameWithoutInnerClasses";
                    }
                    switch (i) {
                        case 1:
/* 107 */                   objArr[2] = "byClassId";
                            break;
                        case 2:
/* 102 */                   objArr[2] = "internalNameByClassId";
                            break;
                        case 3:
                        case 5:
                        case 8:
                        case 9:
                        case 10:
                            break;
                        case 4:
                        case 6:
/* 99 */                    objArr[2] = "byFqNameWithoutInnerClasses";
                            break;
                        case 7:
/* 96 */                    objArr[2] = "<init>";
                            break;
                        default:
/* 91 */                    objArr[2] = "byInternalName";
                            break;
                    }
/* 109 */           String str2 = String.format(str, objArr);
/* 113 */           if (i != 3 && i != 5) {
                        switch (i) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
/* 131 */                       throw new IllegalArgumentException(str2);
                        }
                    }
/* 131 */           throw new IllegalStateException(str2);
                }

                public static O0I0oiO1I I00000oOI(Ill0IO ill0IO) {
/* 1 */             if (ill0IO != null) {
/* 17 */                return new O0I0oiO1I(ill0IO.I00000oIO.I00000oIO.replace('.', '/'));
                    }
/* 22 */            I00000oIO(4);
/* 49 */            throw null;
                }

                public static O0I0oiO1I I0000Il00O(String str) {
/* 1 */             if (str != null) {
/* 5 */                 return new O0I0oiO1I(str);
                    }
/* 10 */            I00000oIO(0);
/* 49 */            throw null;
                }

                public static String I0000oI00(IOIOill iOIOill) {
/* 1 */             Ill0IO ill0IO = iOIOill.I00000oIO;
/* 13 */            String strReplace = iOIOill.I00000oOI.I00000oIO.I00000oIO.replace('.', '$');
/* 23 */            if (!ill0IO.I00000oIO.I0000Il00O()) {
/* 52 */                strReplace = ill0IO.I00000oIO.I00000oIO.replace('.', '/') + "/" + strReplace;
                    }
/* 56 */            if (strReplace != null) {
/* 58 */                return strReplace;
                    }
/* 60 */            I00000oIO(3);
/* 186 */           throw null;
                }

                public final String I0000O() {
/* 1 */             String str = this.I00000oIO;
/* 3 */             if (str != null) {
/* 5 */                 return str;
                    }
/* 8 */             I00000oIO(10);
/* 29 */            throw null;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || O0I0oiO1I.class != obj.getClass()) {
/* 27 */                return false;
                    }
/* 22 */            return this.I00000oIO.equals(((O0I0oiO1I) obj).I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 1 */             return this.I00000oIO;
                }
            }
