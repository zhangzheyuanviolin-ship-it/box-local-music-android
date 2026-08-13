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
            
            public abstract class i1llii01I10i {
                public static final char[] I00000oIO;

                static {
/* 3 */             char[] cArr = new char[80];
/* 5 */             I00000oIO = cArr;
/* 9 */             Arrays.fill(cArr, ' ');
                }

                public static void I00000oIO(StringBuilder sb, int i, String str, Object obj) {
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
/* 61 */            I00000oOI(i, sb);
/* 68 */            if (!str.isEmpty()) {
/* 72 */                StringBuilder sb2 = new StringBuilder();
/* 84 */                sb2.append(Character.toLowerCase(str.charAt(0)));
/* 92 */                for (int i2 = 1; i2 < str.length(); i2++) {
/* 94 */                    char cCharAt = str.charAt(i2);
/* 102 */                   if (Character.isUpperCase(cCharAt)) {
/* 106 */                       sb2.append("_");
                            }
/* 113 */                   sb2.append(Character.toLowerCase(cCharAt));
                        }
/* 119 */               str = sb2.toString();
                    }
/* 123 */           sb.append(str);
/* 132 */           if (obj instanceof String) {
/* 134 */               sb.append(": \"");
/* 139 */               i1OOli0lO i1ooli0lo = i1OOli0lO.I00iiO;
/* 156 */               sb.append(liOlIII.I00000oIO(new i1OOli0lO(((String) obj).getBytes(i1io0O.I00000oIO))));
/* 159 */               sb.append('\"');
/* 162 */               return;
                    }
/* 165 */           if (obj instanceof i1OOli0lO) {
/* 167 */               sb.append(": \"");
/* 176 */               sb.append(liOlIII.I00000oIO((i1OOli0lO) obj));
/* 179 */               sb.append('\"');
/* 182 */               return;
                    }
/* 191 */           if (obj instanceof i1ii0Io) {
/* 195 */               sb.append(" {");
/* 200 */               I0000Il00O((i1ii0Io) obj, sb, i + 2);
/* 203 */               sb.append("\n");
/* 206 */               I00000oOI(i, sb);
/* 209 */               sb.append("}");
/* 212 */               return;
                    }
/* 215 */           if (!(obj instanceof Map.Entry)) {
/* 254 */               sb.append(": ");
/* 257 */               sb.append(obj);
/* 1182 */              return;
                    }
/* 217 */           int i3 = i + 2;
/* 219 */           sb.append(" {");
/* 222 */           Map.Entry entry = (Map.Entry) obj;
/* 230 */           I00000oIO(sb, i3, "key", entry.getKey());
/* 239 */           I00000oIO(sb, i3, "value", entry.getValue());
/* 242 */           sb.append("\n");
/* 245 */           I00000oOI(i, sb);
/* 248 */           sb.append("}");
                }

                public static void I00000oOI(int i, StringBuilder sb) {
/* 1 */             while (i > 0) {
/* 3 */                 int i2 = 80;
/* 5 */                 if (i <= 80) {
/* 8 */                     i2 = i;
                        }
/* 12 */                sb.append(I00000oIO, 0, i2);
/* 15 */                i -= i2;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:103:0x01f6  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I0000Il00O(i1ii0Io i1ii0io, StringBuilder sb, int i) {
                    int i2;
                    int i3;
                    boolean zEquals;
                    Method method;
                    Method method2;
/* 9 */             HashSet hashSet = new HashSet();
/* 14 */            HashMap map = new HashMap();
/* 19 */            TreeMap treeMap = new TreeMap();
/* 26 */            Method[] declaredMethods = i1ii0io.getClass().getDeclaredMethods();
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
/* 223 */                       I00000oIO(sb, i, OooioIOo1.I00100o1O0lo(-4, 0, strSubstring), i1ii0Io.I0000O(method2, i1ii0io, new Object[0]));
                            }
/* 226 */                   i2 = i3;
                        }
/* 237 */               if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
/* 294 */                   I00000oIO(sb, i, OooioIOo1.I00100o1O0lo(-3, 0, strSubstring), i1ii0Io.I0000O(method, i1ii0io, new Object[0]));
                        } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
/* 340 */                   Method method4 = (Method) entry.getValue();
/* 350 */                   Method method5 = (Method) map.get("has".concat(strSubstring));
/* 352 */                   if (method4 != null) {
/* 356 */                       Object objI0000O = i1ii0Io.I0000O(method4, i1ii0io, new Object[0]);
/* 360 */                       if (method5 == null) {
/* 364 */                           if (objI0000O instanceof Boolean) {
/* 373 */                               if (((Boolean) objI0000O).booleanValue()) {
/* 503 */                                   I00000oIO(sb, i, strSubstring, objI0000O);
                                        }
                                    } else if (objI0000O instanceof Integer) {
/* 388 */                               if (((Integer) objI0000O).intValue() != 0) {
                                        }
                                    } else if (objI0000O instanceof Float) {
/* 407 */                               if (Float.floatToRawIntBits(((Float) objI0000O).floatValue()) != 0) {
                                        }
                                    } else if (!(objI0000O instanceof Double)) {
/* 434 */                               if (objI0000O instanceof String) {
/* 438 */                                   zEquals = objI0000O.equals("");
                                        } else if (objI0000O instanceof i1OOli0lO) {
/* 449 */                                   zEquals = objI0000O.equals(i1OOli0lO.I00iiO);
                                        } else if (objI0000O instanceof i1O0oIO) {
/* 472 */                                   if (objI0000O != ((i1ii0Io) ((i1ii0Io) ((i1O0oIO) objI0000O)).I00000oIO(6))) {
                                            }
                                        } else if (!(objI0000O instanceof Enum) || ((Enum) objI0000O).ordinal() != 0) {
                                        }
/* 453 */                               if (!zEquals) {
                                        }
                                    } else if (Double.doubleToRawLongBits(((Double) objI0000O).doubleValue()) != 0) {
                                    }
                                } else if (((Boolean) i1ii0Io.I0000O(method5, i1ii0io, new Object[0])).booleanValue()) {
                                }
                            }
                        }
/* 226 */               i2 = i3;
                    }
/* 510 */           i1oi1lOoII1 i1oi1looii1 = i1ii0io.zzc;
/* 512 */           if (i1oi1looii1 != null) {
/* 516 */               for (int i5 = 0; i5 < i1oi1looii1.I00000oIO; i5++) {
/* 532 */                   I00000oIO(sb, i, String.valueOf(i1oi1looii1.I00000oOI[i5] >>> 3), i1oi1looii1.I0000Il00O[i5]);
                        }
                    }
                }
            }
