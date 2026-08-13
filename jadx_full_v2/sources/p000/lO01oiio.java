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
            
            public abstract class lO01oiio {
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
/* 154 */               sb.append(ll0l0O.I00000oIO(new l1l0llOlIl(((String) obj).getBytes(lIOOlo11OOii.I00000oIO))));
/* 157 */               sb.append('\"');
/* 160 */               return;
                    }
/* 163 */           if (obj instanceof l1l1O1i) {
/* 165 */               sb.append(": \"");
/* 174 */               sb.append(ll0l0O.I00000oIO((l1l1O1i) obj));
/* 177 */               sb.append('\"');
/* 180 */               return;
                    }
/* 189 */           if (obj instanceof lIIOO0oi1o) {
/* 193 */               sb.append(" {");
/* 198 */               I0000Il00O((lIIOO0oi1o) obj, sb, i + 2);
/* 201 */               sb.append("\n");
/* 204 */               I00000oOI(i, sb);
/* 207 */               sb.append("}");
/* 210 */               return;
                    }
/* 213 */           if (!(obj instanceof Map.Entry)) {
/* 252 */               sb.append(": ");
/* 255 */               sb.append(obj);
/* 1182 */              return;
                    }
/* 215 */           int i3 = i + 2;
/* 217 */           sb.append(" {");
/* 220 */           Map.Entry entry = (Map.Entry) obj;
/* 228 */           I00000oIO(sb, i3, "key", entry.getKey());
/* 237 */           I00000oIO(sb, i3, "value", entry.getValue());
/* 240 */           sb.append("\n");
/* 243 */           I00000oOI(i, sb);
/* 246 */           sb.append("}");
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

                /* JADX WARN: Removed duplicated region for block: B:103:0x01f7  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static void I0000Il00O(lIIOO0oi1o liioo0oi1o, StringBuilder sb, int i) {
                    int i2;
                    int i3;
                    boolean zEquals;
                    Method method;
                    Method method2;
/* 9 */             HashSet hashSet = new HashSet();
/* 14 */            HashMap map = new HashMap();
/* 19 */            TreeMap treeMap = new TreeMap();
/* 26 */            Method[] declaredMethods = liioo0oi1o.getClass().getDeclaredMethods();
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
/* 223 */                       I00000oIO(sb, i, OooioIOo1.I00100o1O0lo(-4, 0, strSubstring), lIIOO0oi1o.I0000Il00O(method2, liioo0oi1o, new Object[0]));
                            }
/* 226 */                   i2 = i3;
                        }
/* 237 */               if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
/* 294 */                   I00000oIO(sb, i, OooioIOo1.I00100o1O0lo(-3, 0, strSubstring), lIIOO0oi1o.I0000Il00O(method, liioo0oi1o, new Object[0]));
                        } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
/* 340 */                   Method method4 = (Method) entry.getValue();
/* 350 */                   Method method5 = (Method) map.get("has".concat(strSubstring));
/* 352 */                   if (method4 != null) {
/* 356 */                       Object objI0000Il00O = lIIOO0oi1o.I0000Il00O(method4, liioo0oi1o, new Object[0]);
/* 360 */                       if (method5 == null) {
/* 364 */                           if (objI0000Il00O instanceof Boolean) {
/* 373 */                               if (((Boolean) objI0000Il00O).booleanValue()) {
/* 504 */                                   I00000oIO(sb, i, strSubstring, objI0000Il00O);
                                        }
                                    } else if (objI0000Il00O instanceof Integer) {
/* 388 */                               if (((Integer) objI0000Il00O).intValue() != 0) {
                                        }
                                    } else if (objI0000Il00O instanceof Float) {
/* 407 */                               if (Float.floatToRawIntBits(((Float) objI0000Il00O).floatValue()) != 0) {
                                        }
                                    } else if (!(objI0000Il00O instanceof Double)) {
/* 434 */                               if (objI0000Il00O instanceof String) {
/* 438 */                                   zEquals = objI0000Il00O.equals("");
                                        } else if (objI0000Il00O instanceof l1l1O1i) {
/* 449 */                                   zEquals = objI0000Il00O.equals(l1l1O1i.I00iiI);
                                        } else if (objI0000Il00O instanceof lIoolOoilO) {
/* 473 */                                   if (objI0000Il00O != ((lIIOO0oi1o) ((lIIOO0oi1o) ((lIoolOoilO) objI0000Il00O)).I000OiO(6, null))) {
                                            }
                                        } else if (!(objI0000Il00O instanceof Enum) || ((Enum) objI0000Il00O).ordinal() != 0) {
                                        }
/* 453 */                               if (!zEquals) {
                                        }
                                    } else if (Double.doubleToRawLongBits(((Double) objI0000Il00O).doubleValue()) != 0) {
                                    }
                                } else if (((Boolean) lIIOO0oi1o.I0000Il00O(method5, liioo0oi1o, new Object[0])).booleanValue()) {
                                }
                            }
                        }
/* 226 */               i2 = i3;
                    }
/* 513 */           if (liioo0oi1o instanceof lI1oIOl10iIo) {
/* 520 */               Iterator itI00000oOI = ((lI1oIOl10iIo) liioo0oi1o).zzb.I00000oOI();
/* 528 */               if (itI00000oOI.hasNext()) {
/* 541 */                   ((Map.Entry) itI00000oOI.next()).getKey().getClass();
/* 544 */                   OIiilo1Ool0o.I00000oIO();
/* 547 */                   return;
                        }
                    }
/* 548 */           lOOlilii loolilii = liioo0oi1o.zzc;
/* 550 */           if (loolilii != null) {
/* 554 */               for (int i5 = 0; i5 < loolilii.I00000oIO; i5++) {
/* 570 */                   I00000oIO(sb, i, String.valueOf(loolilii.I00000oOI[i5] >>> 3), loolilii.I0000Il00O[i5]);
                        }
                    }
                }
            }
