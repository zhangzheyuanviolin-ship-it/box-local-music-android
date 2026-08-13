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
            
            public abstract class ioOiI0OI {
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
/* 154 */               sb.append(liooIOIo.I00000oIO(new il1lilI1Ol(((String) obj).getBytes(iloi1OI100li.I00000oIO))));
/* 157 */               sb.append('\"');
/* 160 */               return;
                    }
/* 163 */           if (obj instanceof il1oII0OlIo) {
/* 165 */               sb.append(": \"");
/* 174 */               sb.append(liooIOIo.I00000oIO((il1oII0OlIo) obj));
/* 177 */               sb.append('\"');
/* 180 */               return;
                    }
/* 189 */           if (obj instanceof illOil) {
/* 193 */               sb.append(" {");
/* 198 */               I0000Il00O((illOil) obj, sb, i + 2);
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
                public static void I0000Il00O(illOil illoil, StringBuilder sb, int i) {
                    int i2;
                    int i3;
                    boolean zEquals;
                    Method method;
                    Method method2;
/* 9 */             HashSet hashSet = new HashSet();
/* 14 */            HashMap map = new HashMap();
/* 19 */            TreeMap treeMap = new TreeMap();
/* 26 */            Method[] declaredMethods = illoil.getClass().getDeclaredMethods();
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
/* 223 */                       I00000oIO(sb, i, OooioIOo1.I00100o1O0lo(-4, 0, strSubstring), illOil.I000II(method2, illoil, new Object[0]));
                            }
/* 226 */                   i2 = i3;
                        }
/* 237 */               if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
/* 294 */                   I00000oIO(sb, i, OooioIOo1.I00100o1O0lo(-3, 0, strSubstring), illOil.I000II(method, illoil, new Object[0]));
                        } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
/* 340 */                   Method method4 = (Method) entry.getValue();
/* 350 */                   Method method5 = (Method) map.get("has".concat(strSubstring));
/* 352 */                   if (method4 != null) {
/* 356 */                       Object objI000II = illOil.I000II(method4, illoil, new Object[0]);
/* 360 */                       if (method5 == null) {
/* 364 */                           if (objI000II instanceof Boolean) {
/* 373 */                               if (((Boolean) objI000II).booleanValue()) {
/* 504 */                                   I00000oIO(sb, i, strSubstring, objI000II);
                                        }
                                    } else if (objI000II instanceof Integer) {
/* 388 */                               if (((Integer) objI000II).intValue() != 0) {
                                        }
                                    } else if (objI000II instanceof Float) {
/* 407 */                               if (Float.floatToRawIntBits(((Float) objI000II).floatValue()) != 0) {
                                        }
                                    } else if (!(objI000II instanceof Double)) {
/* 434 */                               if (objI000II instanceof String) {
/* 438 */                                   zEquals = objI000II.equals("");
                                        } else if (objI000II instanceof il1oII0OlIo) {
/* 449 */                                   zEquals = objI000II.equals(il1oII0OlIo.I00iiI);
                                        } else if (objI000II instanceof il00ioIl) {
/* 473 */                                   if (objI000II != ((illOil) ((illOil) ((il00ioIl) objI000II)).I000oI1ioi(6, null))) {
                                            }
                                        } else if (!(objI000II instanceof Enum) || ((Enum) objI000II).ordinal() != 0) {
                                        }
/* 453 */                               if (!zEquals) {
                                        }
                                    } else if (Double.doubleToRawLongBits(((Double) objI000II).doubleValue()) != 0) {
                                    }
                                } else if (((Boolean) illOil.I000II(method5, illoil, new Object[0])).booleanValue()) {
                                }
                            }
                        }
/* 226 */               i2 = i3;
                    }
/* 513 */           if (illoil instanceof ill0o1o) {
/* 520 */               Iterator itI0000Il00O = ((ill0o1o) illoil).zzb.I0000Il00O();
/* 528 */               while (itI0000Il00O.hasNext()) {
/* 534 */                   Map.Entry entry2 = (Map.Entry) itI0000Il00O.next();
/* 542 */                   ((ill110ll) entry2.getKey()).getClass();
/* 557 */                   I00000oIO(sb, i, IIlIOloOOO.I00100l0("[", 0, "]"), entry2.getValue());
                        }
                    }
/* 561 */           l01IO0I1I l01io0i1i = illoil.zzc;
/* 563 */           if (l01io0i1i != null) {
/* 567 */               for (int i5 = 0; i5 < l01io0i1i.I00000oIO; i5++) {
/* 583 */                   I00000oIO(sb, i, String.valueOf(l01io0i1i.I00000oOI[i5] >>> 3), l01io0i1i.I0000Il00O[i5]);
                        }
                    }
                }
            }
