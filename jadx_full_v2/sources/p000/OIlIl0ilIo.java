            package p000;
            
            public final class OIlIl0ilIo {
                public static final OIlIl0ilIo I0000Il00O = new OIlIl0ilIo(1, "SUCCESS");
                public final int I00000oIO;
                public final String I00000oOI;

                public OIlIl0ilIo(int i, String str) {
/* 1 */             if (i == 0) {
/* 12 */                I00000oIO(3);
/* 89 */                throw null;
                    }
/* 6 */             this.I00000oIO = i;
/* 8 */             this.I00000oOI = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I00000oIO(int i) {
/* 16 */            String str = (i == 1 || i == 2 || i == 3 || i == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
/* 29 */            Object[] objArr = new Object[(i == 1 || i == 2 || i == 3 || i == 4) ? 3 : 2];
/* 36 */            if (i == 1 || i == 2) {
/* 52 */                objArr[0] = "debugMessage";
                    } else if (i == 3) {
/* 47 */                objArr[0] = "success";
                    } else if (i != 4) {
/* 44 */                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    }
                    switch (i) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
/* 70 */                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                            break;
                        case 5:
/* 67 */                    objArr[1] = "getResult";
                            break;
                        case 6:
/* 62 */                    objArr[1] = "getDebugMessage";
                            break;
                        default:
/* 57 */                    objArr[1] = "success";
                            break;
                    }
/* 72 */            if (i == 1) {
/* 93 */                objArr[2] = "incompatible";
                    } else if (i == 2) {
/* 88 */                objArr[2] = "conflict";
                    } else if (i == 3 || i == 4) {
/* 83 */                objArr[2] = "<init>";
                    }
/* 95 */            String str2 = String.format(str, objArr);
/* 99 */            if (i != 1 && i != 2 && i != 3 && i != 4) {
/* 118 */               throw new IllegalStateException(str2);
                    }
/* 118 */           throw new IllegalArgumentException(str2);
                }

                public static OIlIl0ilIo I0000Il00O(String str) {
/* 4 */             return new OIlIl0ilIo(2, str);
                }

                public final int I00000oOI() {
/* 1 */             int i = this.I00000oIO;
/* 3 */             if (i != 0) {
/* 5 */                 return i;
                    }
/* 7 */             I00000oIO(5);
/* 29 */            throw null;
                }

                public final String toString() {
/* 4 */             int i = this.I00000oIO;
/* 38 */            return (i != 1 ? i != 2 ? i != 3 ? "null" : "CONFLICT" : "INCOMPATIBLE" : "OVERRIDABLE") + ": " + this.I00000oOI;
                }
            }
