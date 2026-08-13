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
            
            public abstract class iI0o1il1 {
                public static final char[] I00000oIO;

                static {
/* 3 */             char[] cArr = new char[80];
/* 5 */             I00000oIO = cArr;
/* 9 */             Arrays.fill(cArr, ' ');
                }

                public static void I00000oIO(StringBuilder sb, int i, String str, Object obj) {
                    String strReplace;
/* 3 */             if (obj instanceof List) {
/* 7 */                 Iterator it = ((List) obj).iterator();
/* 15 */                while (it.hasNext()) {
/* 21 */                    I00000oIO(sb, i, str, it.next());
                        }
/* 55 */                return;
                    }
/* 27 */            if (obj instanceof Map) {
/* 35 */                Iterator it2 = ((Map) obj).entrySet().iterator();
/* 43 */                while (it2.hasNext()) {
/* 51 */                    I00000oIO(sb, i, str, (Map.Entry) it2.next());
                        }
/* 55 */                return;
                    }
/* 58 */            sb.append('\n');
/* 61 */            I0000Il00O(i, sb);
/* 70 */            if (!str.isEmpty()) {
/* 74 */                StringBuilder sb2 = new StringBuilder();
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
/* 133 */           if (!(obj instanceof String)) {
/* 233 */               if (obj instanceof i1lIIl01O) {
/* 235 */                   sb.append(": \"");
/* 248 */                   sb.append(liiIOIio1ll.I00000oIO(((i1lIIl01O) obj).I000oI1ioi()));
/* 251 */                   sb.append('\"');
/* 254 */                   return;
                        }
/* 263 */               if (obj instanceof i1oi01OllI) {
/* 267 */                   sb.append(" {");
/* 272 */                   I00000oOI((i1oi01OllI) obj, sb, i + 2);
/* 275 */                   sb.append("\n");
/* 278 */                   I0000Il00O(i, sb);
/* 281 */                   sb.append("}");
/* 284 */                   return;
                        }
/* 287 */               if (!(obj instanceof Map.Entry)) {
/* 326 */                   sb.append(": ");
/* 329 */                   sb.append(obj);
/* 1182 */                  return;
                        }
/* 289 */               int i3 = i + 2;
/* 291 */               sb.append(" {");
/* 294 */               Map.Entry entry = (Map.Entry) obj;
/* 302 */               I00000oIO(sb, i3, "key", entry.getKey());
/* 311 */               I00000oIO(sb, i3, "value", entry.getValue());
/* 314 */               sb.append("\n");
/* 317 */               I0000Il00O(i, sb);
/* 320 */               sb.append("}");
/* 323 */               return;
                    }
/* 135 */           sb.append(": \"");
/* 138 */           String strReplace2 = (String) obj;
/* 140 */           boolean z = false;
/* 141 */           boolean z2 = false;
/* 142 */           boolean z3 = false;
/* 147 */           for (int i4 = 0; i4 < strReplace2.length(); i4++) {
/* 149 */               char cCharAt2 = strReplace2.charAt(i4);
/* 155 */               if (cCharAt2 < ' ' || cCharAt2 > '~') {
/* 187 */                   strReplace = liiIOIio1ll.I00000oIO(strReplace2.getBytes(StandardCharsets.UTF_8));
                            break;
                        }
/* 162 */               if (cCharAt2 == '\"') {
/* 177 */                   z3 = true;
                        } else if (cCharAt2 == '\'') {
/* 175 */                   z2 = true;
                        } else if (cCharAt2 == '\\') {
/* 173 */                   z = true;
                        }
                    }
/* 192 */           if (z) {
/* 198 */               strReplace2 = strReplace2.replace("\\", "\\\\");
                    }
/* 213 */           strReplace = z2 ? strReplace2.replace("'", "\\'") : strReplace2;
/* 214 */           if (z3) {
/* 220 */               strReplace = strReplace.replace("\"", "\\\"");
                    }
/* 224 */           sb.append(strReplace);
/* 227 */           sb.append('\"');
                }

                /* JADX WARN: Removed duplicated region for block: B:101:0x01e8  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x0176  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I00000oOI(i1oi01OllI i1oi01olli, StringBuilder sb, int i) {
                    int i2;
                    int i3;
                    boolean zBooleanValue;
                    boolean zEquals;
                    Method method;
                    Method method2;
/* 9 */             HashSet hashSet = new HashSet();
/* 14 */            HashMap map = new HashMap();
/* 19 */            TreeMap treeMap = new TreeMap();
/* 26 */            Method[] declaredMethods = i1oi01olli.getClass().getDeclaredMethods();
/* 30 */            int length = declaredMethods.length;
/* 32 */            int i4 = 0;
                    while (true) {
/* 39 */                i2 = 3;
/* 40 */                if (i4 >= length) {
                            break;
                        }
/* 42 */                Method method3 = declaredMethods[i4];
/* 52 */                if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
/* 73 */                    if (method3.getName().startsWith("set")) {
/* 79 */                        hashSet.add(method3.getName());
                            } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
/* 108 */                       if (method3.getName().startsWith("has")) {
/* 114 */                           map.put(method3.getName(), method3);
                                } else if (method3.getName().startsWith("get")) {
/* 132 */                           treeMap.put(method3.getName(), method3);
                                }
                            }
                        }
/* 135 */               i4++;
                    }
/* 150 */           for (Map.Entry entry : treeMap.entrySet()) {
/* 164 */               String strSubstring = ((String) entry.getKey()).substring(i2);
/* 174 */               if (!strSubstring.endsWith(OIlllOo01.I00iio) || strSubstring.endsWith("OrBuilderList") || strSubstring.equals(OIlllOo01.I00iio) || (method2 = (Method) entry.getValue()) == null) {
/* 229 */                   i3 = i2;
                        } else {
/* 202 */                   i3 = i2;
/* 210 */                   if (method2.getReturnType().equals(List.class)) {
/* 223 */                       I00000oIO(sb, i, OooioIOo1.I00100o1O0lo(-4, 0, strSubstring), i1oi01OllI.I00100l0(method2, i1oi01olli, new Object[0]));
                            }
/* 226 */                   i2 = i3;
                        }
/* 237 */               if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
/* 294 */                   I00000oIO(sb, i, OooioIOo1.I00100o1O0lo(-3, 0, strSubstring), i1oi01OllI.I00100l0(method, i1oi01olli, new Object[0]));
                        } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
/* 340 */                   Method method4 = (Method) entry.getValue();
/* 350 */                   Method method5 = (Method) map.get("has".concat(strSubstring));
/* 352 */                   if (method4 != null) {
/* 356 */                       Object objI00100l0 = i1oi01OllI.I00100l0(method4, i1oi01olli, new Object[0]);
/* 360 */                       if (method5 != null) {
/* 499 */                           zBooleanValue = ((Boolean) i1oi01OllI.I00100l0(method5, i1oi01olli, new Object[0])).booleanValue();
                                } else if (objI00100l0 instanceof Boolean) {
/* 489 */                           zBooleanValue = ((Boolean) objI00100l0).booleanValue();
                                } else if (objI00100l0 instanceof Integer) {
/* 389 */                           if (((Integer) objI00100l0).intValue() == 0) {
                                    }
                                } else if (objI00100l0 instanceof Float) {
/* 407 */                           if (Float.floatToRawIntBits(((Float) objI00100l0).floatValue()) == 0) {
                                    }
                                } else if (!(objI00100l0 instanceof Double)) {
/* 434 */                           if (objI00100l0 instanceof String) {
/* 438 */                               zEquals = objI00100l0.equals("");
                                    } else if (objI00100l0 instanceof i1lIIl01O) {
/* 449 */                               zEquals = objI00100l0.equals(i1lIIl01O.I00iiI);
                                    } else if (!(objI00100l0 instanceof i1ilO0II) ? !(objI00100l0 instanceof Enum) || ((Enum) objI00100l0).ordinal() != 0 : objI00100l0 != ((i1oi01OllI) ((i1oi01OllI) ((i1ilO0II) objI00100l0)).I0010o(6))) {
                                    }
/* 453 */                           if (zEquals) {
                                    }
                                } else if (Double.doubleToRawLongBits(((Double) objI00100l0).doubleValue()) == 0) {
                                }
/* 503 */                       if (zBooleanValue) {
/* 505 */                           I00000oIO(sb, i, strSubstring, objI00100l0);
                                }
                            }
                        }
/* 226 */               i2 = i3;
                    }
/* 512 */           iI1O01I1 ii1o01i1 = i1oi01olli.zzc;
/* 514 */           if (ii1o01i1 != null) {
/* 518 */               for (int i5 = 0; i5 < ii1o01i1.I00000oIO; i5++) {
/* 534 */                   I00000oIO(sb, i, String.valueOf(ii1o01i1.I00000oOI[i5] >>> 3), ii1o01i1.I0000Il00O[i5]);
                        }
                    }
                }

                public static void I0000Il00O(int i, StringBuilder sb) {
/* 1 */             while (i > 0) {
/* 3 */                 int i2 = 80;
/* 5 */                 if (i <= 80) {
/* 8 */                     i2 = i;
                        }
/* 12 */                sb.append(I00000oIO, 0, i2);
/* 15 */                i -= i2;
                    }
                }
            }
