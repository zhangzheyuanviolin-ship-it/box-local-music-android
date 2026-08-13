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
            
            public abstract class iOllO0110 {
                public static final char[] I00000oIO;

                static {
/* 3 */             char[] cArr = new char[80];
/* 5 */             I00000oIO = cArr;
/* 9 */             Arrays.fill(cArr, ' ');
                }

                public static void I00000oIO(StringBuilder sb, int i, String str, Object obj) {
                    byte[] bArr;
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
/* 133 */           if (obj instanceof String) {
/* 135 */               sb.append(": \"");
/* 138 */               String strReplace2 = (String) obj;
/* 140 */               boolean z = false;
/* 141 */               boolean z2 = false;
/* 142 */               boolean z3 = false;
/* 147 */               for (int i3 = 0; i3 < strReplace2.length(); i3++) {
/* 149 */                   char cCharAt2 = strReplace2.charAt(i3);
/* 155 */                   if (cCharAt2 < ' ' || cCharAt2 > '~') {
/* 187 */                       strReplace = lil01ll.I00000oIO(strReplace2.getBytes(StandardCharsets.UTF_8));
                                break;
                            }
/* 162 */                   if (cCharAt2 == '\"') {
/* 177 */                       z3 = true;
                            } else if (cCharAt2 == '\'') {
/* 175 */                       z2 = true;
                            } else if (cCharAt2 == '\\') {
/* 173 */                       z = true;
                            }
                        }
/* 192 */               if (z) {
/* 198 */                   strReplace2 = strReplace2.replace("\\", "\\\\");
                        }
/* 213 */               strReplace = z2 ? strReplace2.replace("'", "\\'") : strReplace2;
/* 214 */               if (z3) {
/* 220 */                   strReplace = strReplace.replace("\"", "\\\"");
                        }
/* 224 */               sb.append(strReplace);
/* 227 */               sb.append('\"');
/* 230 */               return;
                    }
/* 233 */           if (obj instanceof iOl1iiIll) {
/* 235 */               sb.append(": \"");
/* 238 */               iOl1iiIll iol1iiill = (iOl1iiIll) obj;
/* 240 */               int iI0000O = iol1iiill.I0000O();
/* 244 */               if (iI0000O == 0) {
/* 246 */                   bArr = iOlilI1ill0.I00000oIO;
                        } else {
/* 249 */                   byte[] bArr2 = new byte[iI0000O];
/* 251 */                   iol1iiill.I0001Ioi1lo(iI0000O, bArr2);
/* 254 */                   bArr = bArr2;
                        }
/* 259 */               sb.append(lil01ll.I00000oIO(bArr));
/* 262 */               sb.append('\"');
/* 265 */               return;
                    }
/* 274 */           if (obj instanceof iOlOoOlI0li1) {
/* 278 */               sb.append(" {");
/* 283 */               I00000oOI((iOlOoOlI0li1) obj, sb, i + 2);
/* 286 */               sb.append("\n");
/* 289 */               I0000Il00O(i, sb);
/* 292 */               sb.append("}");
/* 295 */               return;
                    }
/* 298 */           if (!(obj instanceof Map.Entry)) {
/* 337 */               sb.append(": ");
/* 340 */               sb.append(obj);
/* 1182 */              return;
                    }
/* 300 */           int i4 = i + 2;
/* 302 */           sb.append(" {");
/* 305 */           Map.Entry entry = (Map.Entry) obj;
/* 313 */           I00000oIO(sb, i4, "key", entry.getKey());
/* 322 */           I00000oIO(sb, i4, "value", entry.getValue());
/* 325 */           sb.append("\n");
/* 328 */           I0000Il00O(i, sb);
/* 331 */           sb.append("}");
                }

                /* JADX WARN: Removed duplicated region for block: B:101:0x01e8  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x0176  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I00000oOI(iOlOoOlI0li1 ioloooli0li1, StringBuilder sb, int i) {
                    int i2;
                    int i3;
                    boolean zBooleanValue;
                    boolean zEquals;
                    Method method;
                    Method method2;
/* 9 */             HashSet hashSet = new HashSet();
/* 14 */            HashMap map = new HashMap();
/* 19 */            TreeMap treeMap = new TreeMap();
/* 26 */            Method[] declaredMethods = ioloooli0li1.getClass().getDeclaredMethods();
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
/* 223 */                       I00000oIO(sb, i, OooioIOo1.I00100o1O0lo(-4, 0, strSubstring), iOlOoOlI0li1.I0001Ioi1lo(method2, ioloooli0li1, new Object[0]));
                            }
/* 226 */                   i2 = i3;
                        }
/* 237 */               if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
/* 294 */                   I00000oIO(sb, i, OooioIOo1.I00100o1O0lo(-3, 0, strSubstring), iOlOoOlI0li1.I0001Ioi1lo(method, ioloooli0li1, new Object[0]));
                        } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
/* 340 */                   Method method4 = (Method) entry.getValue();
/* 350 */                   Method method5 = (Method) map.get("has".concat(strSubstring));
/* 352 */                   if (method4 != null) {
/* 356 */                       Object objI0001Ioi1lo = iOlOoOlI0li1.I0001Ioi1lo(method4, ioloooli0li1, new Object[0]);
/* 360 */                       if (method5 != null) {
/* 499 */                           zBooleanValue = ((Boolean) iOlOoOlI0li1.I0001Ioi1lo(method5, ioloooli0li1, new Object[0])).booleanValue();
                                } else if (objI0001Ioi1lo instanceof Boolean) {
/* 489 */                           zBooleanValue = ((Boolean) objI0001Ioi1lo).booleanValue();
                                } else if (objI0001Ioi1lo instanceof Integer) {
/* 389 */                           if (((Integer) objI0001Ioi1lo).intValue() == 0) {
                                    }
                                } else if (objI0001Ioi1lo instanceof Float) {
/* 407 */                           if (Float.floatToRawIntBits(((Float) objI0001Ioi1lo).floatValue()) == 0) {
                                    }
                                } else if (!(objI0001Ioi1lo instanceof Double)) {
/* 434 */                           if (objI0001Ioi1lo instanceof String) {
/* 438 */                               zEquals = objI0001Ioi1lo.equals("");
                                    } else if (objI0001Ioi1lo instanceof iOl1iiIll) {
/* 449 */                               zEquals = objI0001Ioi1lo.equals(iOl1iiIll.I00iiI);
                                    } else if (!(objI0001Ioi1lo instanceof iOl10IOiOi0) ? !(objI0001Ioi1lo instanceof Enum) || ((Enum) objI0001Ioi1lo).ordinal() != 0 : objI0001Ioi1lo != ((iOlOoOlI0li1) ((iOlOoOlI0li1) ((iOl10IOiOi0) objI0001Ioi1lo)).I000O01llI0(6))) {
                                    }
/* 453 */                           if (zEquals) {
                                    }
                                } else if (Double.doubleToRawLongBits(((Double) objI0001Ioi1lo).doubleValue()) == 0) {
                                }
/* 503 */                       if (zBooleanValue) {
/* 505 */                           I00000oIO(sb, i, strSubstring, objI0001Ioi1lo);
                                }
                            }
                        }
/* 226 */               i2 = i3;
                    }
/* 512 */           iOo00o ioo00o = ioloooli0li1.zzc;
/* 514 */           if (ioo00o != null) {
/* 518 */               for (int i5 = 0; i5 < ioo00o.I00000oIO; i5++) {
/* 534 */                   I00000oIO(sb, i, String.valueOf(ioo00o.I00000oOI[i5] >>> 3), ioo00o.I0000Il00O[i5]);
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
