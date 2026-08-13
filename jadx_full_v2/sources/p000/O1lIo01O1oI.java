            package p000;

            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import java.nio.charset.StandardCharsets;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.TreeMap;
            
            public abstract class O1lIo01O1oI {
                public static final char[] I00000oIO;

                static {
/* 3 */             char[] cArr = new char[80];
/* 5 */             I00000oIO = cArr;
/* 9 */             Arrays.fill(cArr, ' ');
                }

                public static void I00000oIO(int i, StringBuilder sb) {
/* 1 */             while (i > 0) {
/* 3 */                 int i2 = 80;
/* 5 */                 if (i <= 80) {
/* 8 */                     i2 = i;
                        }
/* 12 */                sb.append(I00000oIO, 0, i2);
/* 15 */                i -= i2;
                    }
                }

                public static void I00000oOI(StringBuilder sb, int i, String str, Object obj) {
                    String strReplace;
/* 3 */             if (obj instanceof List) {
/* 7 */                 Iterator it = ((List) obj).iterator();
/* 15 */                while (it.hasNext()) {
/* 21 */                    I00000oOI(sb, i, str, it.next());
                        }
/* 55 */                return;
                    }
/* 27 */            if (obj instanceof Map) {
/* 35 */                Iterator it2 = ((Map) obj).entrySet().iterator();
/* 43 */                while (it2.hasNext()) {
/* 51 */                    I00000oOI(sb, i, str, (Map.Entry) it2.next());
                        }
/* 55 */                return;
                    }
/* 58 */            sb.append('\n');
/* 61 */            I00000oIO(i, sb);
/* 70 */            if (!str.isEmpty()) {
/* 75 */                StringBuilder sb2 = new StringBuilder();
/* 86 */                sb2.append(Character.toLowerCase(str.charAt(0)));
/* 94 */                for (int i2 = 1; i2 < str.length(); i2++) {
/* 96 */                    char cCharAt = str.charAt(i2);
/* 104 */                   if (Character.isUpperCase(cCharAt)) {
/* 108 */                       sb2.append("_");
                            }
/* 115 */                   sb2.append(Character.toLowerCase(cCharAt));
                        }
/* 121 */               str = sb2.toString();
                    }
/* 125 */           sb.append(str);
/* 134 */           if (!(obj instanceof String)) {
/* 234 */               if (obj instanceof IIO1i00loOo) {
/* 236 */                   sb.append(": \"");
/* 245 */                   sb.append(lOlO0Ii1o0O.I00000oIO((IIO1i00loOo) obj));
/* 248 */                   sb.append('\"');
/* 251 */                   return;
                        }
/* 260 */               if (obj instanceof Io00Ol1o10O) {
/* 262 */                   sb.append(" {");
/* 269 */                   I0000Il00O((Io00Ol1o10O) obj, sb, i + 2);
/* 272 */                   sb.append("\n");
/* 275 */                   I00000oIO(i, sb);
/* 278 */                   sb.append("}");
/* 281 */                   return;
                        }
/* 284 */               if (!(obj instanceof Map.Entry)) {
/* 323 */                   sb.append(": ");
/* 326 */                   sb.append(obj);
/* 483 */                   return;
                        }
/* 286 */               sb.append(" {");
/* 289 */               Map.Entry entry = (Map.Entry) obj;
/* 291 */               int i3 = i + 2;
/* 299 */               I00000oOI(sb, i3, "key", entry.getKey());
/* 308 */               I00000oOI(sb, i3, "value", entry.getValue());
/* 311 */               sb.append("\n");
/* 314 */               I00000oIO(i, sb);
/* 317 */               sb.append("}");
/* 320 */               return;
                    }
/* 136 */           sb.append(": \"");
/* 139 */           String strReplace2 = (String) obj;
/* 141 */           boolean z = false;
/* 142 */           boolean z2 = false;
/* 143 */           boolean z3 = false;
/* 148 */           for (int i4 = 0; i4 < strReplace2.length(); i4++) {
/* 150 */               char cCharAt2 = strReplace2.charAt(i4);
/* 156 */               if (cCharAt2 < ' ' || cCharAt2 > '~') {
/* 188 */                   strReplace = lOlO0Ii1o0O.I00000oOI(strReplace2.getBytes(StandardCharsets.UTF_8));
                            break;
                        }
/* 163 */               if (cCharAt2 == '\"') {
/* 178 */                   z3 = true;
                        } else if (cCharAt2 == '\'') {
/* 176 */                   z2 = true;
                        } else if (cCharAt2 == '\\') {
/* 174 */                   z = true;
                        }
                    }
/* 193 */           if (z) {
/* 199 */               strReplace2 = strReplace2.replace("\\", "\\\\");
                    }
/* 214 */           strReplace = z2 ? strReplace2.replace("'", "\\'") : strReplace2;
/* 215 */           if (z3) {
/* 221 */               strReplace = strReplace.replace("\"", "\\\"");
                    }
/* 225 */           sb.append(strReplace);
/* 228 */           sb.append('\"');
                }

                /* JADX WARN: Removed duplicated region for block: B:75:0x0194  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0196  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I0000Il00O(Io00Ol1o10O io00Ol1o10O, StringBuilder sb, int i) {
                    int i2;
                    int i3;
                    boolean zBooleanValue;
                    boolean zEquals;
                    Method method;
                    Method method2;
/* 9 */             HashSet hashSet = new HashSet();
/* 14 */            HashMap map = new HashMap();
/* 19 */            TreeMap treeMap = new TreeMap();
/* 26 */            Method[] declaredMethods = io00Ol1o10O.getClass().getDeclaredMethods();
/* 30 */            int length = declaredMethods.length;
/* 32 */            int i4 = 0;
                    while (true) {
/* 39 */                i2 = 3;
/* 40 */                if (i4 >= length) {
                            break;
                        }
/* 42 */                Method method3 = declaredMethods[i4];
/* 52 */                if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
/* 74 */                    if (method3.getName().startsWith("set")) {
/* 80 */                        hashSet.add(method3.getName());
                            } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
/* 111 */                       if (method3.getName().startsWith("has")) {
/* 117 */                           map.put(method3.getName(), method3);
                                } else if (method3.getName().startsWith("get")) {
/* 135 */                           treeMap.put(method3.getName(), method3);
                                }
                            }
                        }
/* 138 */               i4++;
                    }
/* 153 */           for (Map.Entry entry : treeMap.entrySet()) {
/* 167 */               String strSubstring = ((String) entry.getKey()).substring(i2);
/* 177 */               if (!strSubstring.endsWith(OIlllOo01.I00iio) || strSubstring.endsWith("OrBuilderList") || strSubstring.equals(OIlllOo01.I00iio) || (method2 = (Method) entry.getValue()) == null) {
/* 237 */                   i3 = i2;
                        } else {
/* 205 */                   i3 = i2;
/* 213 */                   if (method2.getReturnType().equals(List.class)) {
/* 231 */                       I00000oOI(sb, i, strSubstring.substring(0, strSubstring.length() - 4), Io00Ol1o10O.I000II(method2, io00Ol1o10O, new Object[0]));
                            }
/* 234 */                   i2 = i3;
                        }
/* 245 */               if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
/* 307 */                   I00000oOI(sb, i, strSubstring.substring(0, strSubstring.length() - 3), Io00Ol1o10O.I000II(method, io00Ol1o10O, new Object[0]));
                        } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
/* 355 */                   Method method4 = (Method) entry.getValue();
/* 365 */                   Method method5 = (Method) map.get("has".concat(strSubstring));
/* 367 */                   if (method4 != null) {
/* 371 */                       Object objI000II = Io00Ol1o10O.I000II(method4, io00Ol1o10O, new Object[0]);
/* 375 */                       if (method5 == null) {
/* 379 */                           zBooleanValue = true;
/* 380 */                           if (objI000II instanceof Boolean) {
                                        zEquals = !((Boolean) objI000II).booleanValue();
                                    } else if (objI000II instanceof Integer) {
/* 407 */                               zEquals = ((Integer) objI000II).intValue() == 0;
                                    } else if (objI000II instanceof Float) {
/* 424 */                               if (Float.floatToRawIntBits(((Float) objI000II).floatValue()) == 0) {
                                        }
                                    } else if (objI000II instanceof Double) {
/* 446 */                               if (Double.doubleToRawLongBits(((Double) objI000II).doubleValue()) == 0) {
                                        }
                                    } else if (objI000II instanceof String) {
/* 455 */                               zEquals = objI000II.equals("");
                                    } else if (objI000II instanceof IIO1i00loOo) {
/* 466 */                               zEquals = objI000II.equals(IIO1i00loOo.I00iiI);
                                    } else if (!(objI000II instanceof I01IlIoOI) ? !(objI000II instanceof Enum) || ((Enum) objI000II).ordinal() != 0 : objI000II != ((Io00Ol1o10O) ((Io00Ol1o10O) ((I01IlIoOI) objI000II)).I0000oI00(6))) {
                                    }
/* 504 */                           if (zEquals) {
/* 507 */                               zBooleanValue = false;
                                    }
                                } else {
/* 517 */                           zBooleanValue = ((Boolean) Io00Ol1o10O.I000II(method5, io00Ol1o10O, new Object[0])).booleanValue();
                                }
/* 521 */                       if (zBooleanValue) {
/* 523 */                           I00000oOI(sb, i, strSubstring, objI000II);
                                }
                            }
                        }
/* 234 */               i2 = i3;
                    }
/* 530 */           OoiO0IO0il ooiO0IO0il = io00Ol1o10O.unknownFields;
/* 532 */           if (ooiO0IO0il != null) {
/* 536 */               for (int i5 = 0; i5 < ooiO0IO0il.I00000oIO; i5++) {
/* 552 */                   I00000oOI(sb, i, String.valueOf(ooiO0IO0il.I00000oOI[i5] >>> 3), ooiO0IO0il.I0000Il00O[i5]);
                        }
                    }
                }
            }
