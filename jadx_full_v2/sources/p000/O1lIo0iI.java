            package p000;

            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.TreeMap;
            
            public abstract class O1lIo0iI {
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
/* 68 */            if (!str.isEmpty()) {
/* 73 */                StringBuilder sb2 = new StringBuilder();
/* 85 */                sb2.append(Character.toLowerCase(str.charAt(0)));
/* 93 */                for (int i2 = 1; i2 < str.length(); i2++) {
/* 95 */                    char cCharAt = str.charAt(i2);
/* 103 */                   if (Character.isUpperCase(cCharAt)) {
/* 107 */                       sb2.append("_");
                            }
/* 114 */                   sb2.append(Character.toLowerCase(cCharAt));
                        }
/* 120 */               str = sb2.toString();
                    }
/* 124 */           sb.append(str);
/* 133 */           if (obj instanceof String) {
/* 135 */               sb.append(": \"");
/* 140 */               IIO1ooI iIO1ooI = IIO1ooI.I00iiO;
/* 157 */               sb.append(lOlOiiIiI1.I00000oIO(new IIO1ooI(((String) obj).getBytes(IoolIIolo1lI.I00000oIO))));
/* 160 */               sb.append('\"');
/* 163 */               return;
                    }
/* 166 */           if (obj instanceof IIO1ooI) {
/* 168 */               sb.append(": \"");
/* 177 */               sb.append(lOlOiiIiI1.I00000oIO((IIO1ooI) obj));
/* 180 */               sb.append('\"');
/* 183 */               return;
                    }
/* 192 */           if (obj instanceof Io00l0) {
/* 194 */               sb.append(" {");
/* 201 */               I0000Il00O((Io00l0) obj, sb, i + 2);
/* 204 */               sb.append("\n");
/* 207 */               I00000oIO(i, sb);
/* 210 */               sb.append("}");
/* 213 */               return;
                    }
/* 216 */           if (!(obj instanceof Map.Entry)) {
/* 255 */               sb.append(": ");
/* 258 */               sb.append(obj);
/* 1182 */              return;
                    }
/* 218 */           sb.append(" {");
/* 221 */           Map.Entry entry = (Map.Entry) obj;
/* 223 */           int i3 = i + 2;
/* 231 */           I00000oOI(sb, i3, "key", entry.getKey());
/* 240 */           I00000oOI(sb, i3, "value", entry.getValue());
/* 243 */           sb.append("\n");
/* 246 */           I00000oIO(i, sb);
/* 249 */           sb.append("}");
                }

                /* JADX WARN: Removed duplicated region for block: B:75:0x0194  */
                /* JADX WARN: Removed duplicated region for block: B:76:0x0196  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I0000Il00O(Io00l0 io00l0, StringBuilder sb, int i) {
                    int i2;
                    int i3;
                    boolean zBooleanValue;
                    boolean zEquals;
                    Method method;
                    Method method2;
/* 9 */             HashSet hashSet = new HashSet();
/* 14 */            HashMap map = new HashMap();
/* 19 */            TreeMap treeMap = new TreeMap();
/* 26 */            Method[] declaredMethods = io00l0.getClass().getDeclaredMethods();
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
/* 231 */                       I00000oOI(sb, i, strSubstring.substring(0, strSubstring.length() - 4), Io00l0.I0000oI00(method2, io00l0, new Object[0]));
                            }
/* 234 */                   i2 = i3;
                        }
/* 245 */               if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
/* 307 */                   I00000oOI(sb, i, strSubstring.substring(0, strSubstring.length() - 3), Io00l0.I0000oI00(method, io00l0, new Object[0]));
                        } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
/* 355 */                   Method method4 = (Method) entry.getValue();
/* 365 */                   Method method5 = (Method) map.get("has".concat(strSubstring));
/* 367 */                   if (method4 != null) {
/* 371 */                       Object objI0000oI00 = Io00l0.I0000oI00(method4, io00l0, new Object[0]);
/* 375 */                       if (method5 == null) {
/* 379 */                           zBooleanValue = true;
/* 380 */                           if (objI0000oI00 instanceof Boolean) {
                                        zEquals = !((Boolean) objI0000oI00).booleanValue();
                                    } else if (objI0000oI00 instanceof Integer) {
/* 407 */                               zEquals = ((Integer) objI0000oI00).intValue() == 0;
                                    } else if (objI0000oI00 instanceof Float) {
/* 424 */                               if (Float.floatToRawIntBits(((Float) objI0000oI00).floatValue()) == 0) {
                                        }
                                    } else if (objI0000oI00 instanceof Double) {
/* 446 */                               if (Double.doubleToRawLongBits(((Double) objI0000oI00).doubleValue()) == 0) {
                                        }
                                    } else if (objI0000oI00 instanceof String) {
/* 455 */                               zEquals = objI0000oI00.equals("");
                                    } else if (objI0000oI00 instanceof IIO1ooI) {
/* 466 */                               zEquals = objI0000oI00.equals(IIO1ooI.I00iiO);
                                    } else if (!(objI0000oI00 instanceof I01Ilo0i) ? !(objI0000oI00 instanceof Enum) || ((Enum) objI0000oI00).ordinal() != 0 : objI0000oI00 != ((Io00l0) ((Io00l0) ((I01Ilo0i) objI0000oI00)).I0000Il00O(6))) {
                                    }
/* 504 */                           if (zEquals) {
/* 507 */                               zBooleanValue = false;
                                    }
                                } else {
/* 517 */                           zBooleanValue = ((Boolean) Io00l0.I0000oI00(method5, io00l0, new Object[0])).booleanValue();
                                }
/* 521 */                       if (zBooleanValue) {
/* 523 */                           I00000oOI(sb, i, strSubstring, objI0000oI00);
                                }
                            }
                        }
/* 234 */               i2 = i3;
                    }
/* 530 */           OoiO0l ooiO0l = io00l0.unknownFields;
/* 532 */           if (ooiO0l != null) {
/* 536 */               for (int i5 = 0; i5 < ooiO0l.I00000oIO; i5++) {
/* 552 */                   I00000oOI(sb, i, String.valueOf(ooiO0l.I00000oOI[i5] >>> 3), ooiO0l.I0000Il00O[i5]);
                        }
                    }
                }
            }
