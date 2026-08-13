            package p000;

            import java.lang.annotation.Annotation;
            
            public abstract class l0O00Ol {
                public static final O0IOli0o0 I00000oIO(Annotation annotation) {
/* 7 */             return OOoOl0i.I00000oIO.I00000oOI(annotation.annotationType());
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
                java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
                 */
                public static final Class I00000oOI(O0IOli0o0 o0IOli0o0) {
/* 3 */             Class clsI001l0I00 = ((IOIO10iOi1) o0IOli0o0).I001l0I00();
/* 11 */            if (clsI001l0I00.isPrimitive()) {
/* 15 */                String name = clsI001l0I00.getName();
                        switch (name.hashCode()) {
                            case -1325958191:
/* 130 */                       if (name.equals("double")) {
/* 133 */                           return Double.class;
                                }
                                break;
                            case 104431:
/* 118 */                       if (name.equals("int")) {
/* 121 */                           return Integer.class;
                                }
                                break;
                            case 3039496:
/* 106 */                       if (name.equals("byte")) {
/* 109 */                           return Byte.class;
                                }
                                break;
                            case 3052374:
/* 94 */                        if (name.equals("char")) {
/* 97 */                            return Character.class;
                                }
                                break;
                            case 3327612:
/* 82 */                        if (name.equals("long")) {
/* 85 */                            return Long.class;
                                }
                                break;
                            case 3625364:
/* 70 */                        if (name.equals("void")) {
/* 73 */                            return Void.class;
                                }
                                break;
                            case 64711720:
/* 58 */                        if (name.equals("boolean")) {
/* 61 */                            return Boolean.class;
                                }
                                break;
                            case 97526364:
/* 46 */                        if (name.equals("float")) {
/* 49 */                            return Float.class;
                                }
                                break;
                            case 109413500:
/* 34 */                        if (name.equals("short")) {
/* 37 */                            return Short.class;
                                }
                                break;
                        }
                    }
/* 132 */           return clsI001l0I00;
                }

                public static final Class I0000Il00O(O0IOli0o0 o0IOli0o0) {
/* 3 */             Class clsI001l0I00 = ((IOIO10iOi1) o0IOli0o0).I001l0I00();
/* 11 */            if (clsI001l0I00.isPrimitive()) {
/* 13 */                return clsI001l0I00;
                    }
/* 14 */            String name = clsI001l0I00.getName();
                    switch (name.hashCode()) {
                        case -2056817302:
/* 129 */                   if (name.equals("java.lang.Integer")) {
/* 133 */                       return Integer.TYPE;
                            }
/* 131 */                   return null;
                        case -527879800:
/* 117 */                   if (name.equals("java.lang.Float")) {
/* 120 */                       return Float.TYPE;
                            }
/* 131 */                   return null;
                        case -515992664:
/* 105 */                   if (name.equals("java.lang.Short")) {
/* 108 */                       return Short.TYPE;
                            }
/* 131 */                   return null;
                        case 155276373:
/* 93 */                    if (name.equals("java.lang.Character")) {
/* 96 */                        return Character.TYPE;
                            }
/* 131 */                   return null;
                        case 344809556:
/* 81 */                    if (name.equals("java.lang.Boolean")) {
/* 84 */                        return Boolean.TYPE;
                            }
/* 131 */                   return null;
                        case 398507100:
/* 69 */                    if (name.equals("java.lang.Byte")) {
/* 72 */                        return Byte.TYPE;
                            }
/* 131 */                   return null;
                        case 398795216:
/* 57 */                    if (name.equals("java.lang.Long")) {
/* 60 */                        return Long.TYPE;
                            }
/* 131 */                   return null;
                        case 399092968:
/* 45 */                    if (name.equals("java.lang.Void")) {
/* 48 */                        return Void.TYPE;
                            }
/* 131 */                   return null;
                        case 761287205:
/* 33 */                    if (name.equals("java.lang.Double")) {
/* 36 */                        return Double.TYPE;
                            }
/* 131 */                   return null;
                        default:
/* 131 */                   return null;
                    }
                }
            }
