            package p000;

            import java.util.EnumMap;
            import java.util.HashMap;
            import java.util.HashSet;
            
            public enum O0I1lo0l {
                BOOLEAN(OOIil01OI.I00ilO0, "boolean", "Z", "java.lang.Boolean"),
                CHAR(OOIil01OI.I00io1l, "char", "C", "java.lang.Character"),
                BYTE(OOIil01OI.I00ioIO, "byte", "B", "java.lang.Byte"),
                SHORT(OOIil01OI.I00l0I0l0lO1, "short", OIlOl1.I00iiI, "java.lang.Short"),
                INT(OOIil01OI.I00l0OO0IO, "int", "I", "java.lang.Integer"),
                FLOAT(OOIil01OI.I00li1OI, "float", "F", "java.lang.Float"),
                LONG(OOIil01OI.I00ll1, "long", "J", "java.lang.Long"),
                DOUBLE(OOIil01OI.I00lli11, "double", OIlOl1.I00iiO, "java.lang.Double");

                public static final HashMap I00lli11 = new HashMap();
                public static final EnumMap I00lll10 = new EnumMap(OOIil01OI.class);
                public static final HashMap I00o0iI0io1 = new HashMap();
                public static final HashSet I00o0l1o1o0 = new HashSet();
                public static final HashMap I00o101lO = new HashMap();
                public final OOIil01OI I00iOIl;
                public final String I00iiI;
                public final String I00iiO;
                public final Ill0IO I00iio;

                static {
/* 194 */           for (O0I1lo0l o0I1lo0l : values()) {
/* 198 */               HashMap map = I00lli11;
/* 200 */               String str = o0I1lo0l.I00iiI;
/* 202 */               String str2 = o0I1lo0l.I00iiO;
/* 204 */               map.put(str, o0I1lo0l);
/* 213 */               I00lll10.put((EnumMap) o0I1lo0l.I0000Il00O(), (OOIil01OI) o0I1lo0l);
/* 218 */               I00o0iI0io1.put(str2, o0I1lo0l);
/* 231 */               String strReplace = o0I1lo0l.I00iio.I00000oIO.I00000oIO.replace('.', '/');
/* 237 */               I00o0l1o1o0.add(strReplace);
/* 252 */               I00o101lO.put(strReplace, Oi010OO0.I001IO000("(", str2, ")L", strReplace, ";"));
                    }
                }

                O0I1lo0l(OOIil01OI oOIil01OI, String str, String str2, String str3) {
/* 1 */             if (oOIil01OI == null) {
/* 22 */                I00000oIO(8);
/* 1294 */              throw null;
                    }
/* 6 */             this.I00iOIl = oOIil01OI;
/* 8 */             this.I00iiI = str;
/* 10 */            this.I00iiO = str2;
/* 17 */            this.I00iio = new Ill0IO(str3);
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I00000oIO(int i) {
                    String str;
                    int i2;
/* 3 */             if (i != 4 && i != 6) {
                        switch (i) {
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                                break;
                            default:
/* 10 */                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                break;
                        }
                    } else {
/* 13 */                str = "@NotNull method %s.%s must not return null";
                    }
/* 16 */            if (i != 4 && i != 6) {
                        switch (i) {
                            case 12:
                            case 13:
                            case 14:
                            case 15:
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
/* 74 */                    objArr[0] = "owner";
                            break;
                        case 2:
/* 69 */                    objArr[0] = "methodDescriptor";
                            break;
                        case 3:
                        case 9:
/* 64 */                    objArr[0] = "name";
                            break;
                        case 4:
                        case 6:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
/* 59 */                    objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                            break;
                        case 5:
/* 56 */                    objArr[0] = "type";
                            break;
                        case 7:
                        case 10:
/* 51 */                    objArr[0] = "desc";
                            break;
                        case 8:
/* 46 */                    objArr[0] = "primitiveType";
                            break;
                        case 11:
/* 41 */                    objArr[0] = "wrapperClassName";
                            break;
                        default:
/* 36 */                    objArr[0] = "internalName";
                            break;
                    }
/* 79 */            if (i != 4 && i != 6) {
                        switch (i) {
                            case 12:
/* 106 */                       objArr[1] = "getPrimitiveType";
                                break;
                            case 13:
/* 101 */                       objArr[1] = "getJavaKeywordName";
                                break;
                            case 14:
/* 96 */                        objArr[1] = "getDesc";
                                break;
                            case 15:
/* 91 */                        objArr[1] = "getWrapperFqName";
                                break;
                            default:
/* 86 */                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                                break;
                        }
                    } else {
/* 109 */               objArr[1] = "get";
                    }
                    switch (i) {
                        case 1:
                        case 2:
/* 134 */                   objArr[2] = "isBoxingMethodDescriptor";
                            break;
                        case 3:
                        case 5:
/* 129 */                   objArr[2] = "get";
                            break;
                        case 4:
                        case 6:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        case 7:
/* 126 */                   objArr[2] = "getByDesc";
                            break;
                        case 8:
                        case 9:
                        case 10:
                        case 11:
/* 121 */                   objArr[2] = "<init>";
                            break;
                        default:
/* 116 */                   objArr[2] = "isWrapperClassInternalName";
                            break;
                    }
/* 136 */           String str2 = String.format(str, objArr);
/* 140 */           if (i != 4 && i != 6) {
                        switch (i) {
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                                break;
                            default:
/* 158 */                       throw new IllegalArgumentException(str2);
                        }
                    }
/* 158 */           throw new IllegalStateException(str2);
                }

                public static O0I1lo0l I00000oOI(String str) {
/* 7 */             O0I1lo0l o0I1lo0l = (O0I1lo0l) I00lli11.get(str);
/* 9 */             if (o0I1lo0l != null) {
/* 11 */                return o0I1lo0l;
                    }
/* 18 */            I000II.I000O01llI0("Non-primitive type name passed: ".concat(str));
/* 21 */            return null;
                }

                public final OOIil01OI I0000Il00O() {
/* 1 */             OOIil01OI oOIil01OI = this.I00iOIl;
/* 3 */             if (oOIil01OI != null) {
/* 5 */                 return oOIil01OI;
                    }
/* 8 */             I00000oIO(12);
/* 29 */            throw null;
                }
            }
