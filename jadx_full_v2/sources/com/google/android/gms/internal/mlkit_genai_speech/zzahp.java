            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.lang.reflect.Method;
            import java.lang.reflect.Modifier;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.TreeMap;
            import p000.IIlIOloOOO;
            import p000.OIlllOo01;
            import p000.OooioIOo1;
            
            final class zzahp {
                private static final char[] zza;

                static {
/* 3 */             char[] cArr = new char[80];
/* 5 */             zza = cArr;
/* 9 */             Arrays.fill(cArr, ' ');
                }

                public static String zza(zzahn zzahnVar, String str) throws SecurityException {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 8 */             sb.append("# ");
/* 11 */            sb.append(str);
/* 15 */            zzd(zzahnVar, sb, 0);
/* 18 */            return sb.toString();
                }

                public static void zzb(StringBuilder sb, int i, String str, Object obj) throws SecurityException {
/* 3 */             if (obj instanceof List) {
/* 7 */                 Iterator it = ((List) obj).iterator();
/* 15 */                while (it.hasNext()) {
/* 21 */                    zzb(sb, i, str, it.next());
                        }
/* 55 */                return;
                    }
/* 27 */            if (obj instanceof Map) {
/* 35 */                Iterator it2 = ((Map) obj).entrySet().iterator();
/* 43 */                while (it2.hasNext()) {
/* 51 */                    zzb(sb, i, str, (Map.Entry) it2.next());
                        }
/* 55 */                return;
                    }
/* 58 */            sb.append('\n');
/* 61 */            zzc(i, sb);
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
/* 137 */               String str2 = (String) obj;
/* 139 */               zzafd zzafdVar = zzafd.zza;
/* 165 */               sb.append(zzaik.zza(str2.isEmpty() ? zzafd.zza : new zzafb(str2.getBytes(zzagp.zza))));
/* 168 */               sb.append('\"');
/* 171 */               return;
                    }
/* 174 */           if (obj instanceof zzafd) {
/* 176 */               sb.append(": \"");
/* 185 */               sb.append(zzaik.zza((zzafd) obj));
/* 188 */               sb.append('\"');
/* 191 */               return;
                    }
/* 200 */           if (obj instanceof zzagg) {
/* 204 */               sb.append(" {");
/* 209 */               zzd((zzagg) obj, sb, i + 2);
/* 212 */               sb.append("\n");
/* 215 */               zzc(i, sb);
/* 218 */               sb.append("}");
/* 221 */               return;
                    }
/* 224 */           if (!(obj instanceof Map.Entry)) {
/* 263 */               sb.append(": ");
/* 266 */               sb.append(obj);
/* 1182 */              return;
                    }
/* 226 */           int i3 = i + 2;
/* 228 */           sb.append(" {");
/* 231 */           Map.Entry entry = (Map.Entry) obj;
/* 239 */           zzb(sb, i3, "key", entry.getKey());
/* 248 */           zzb(sb, i3, "value", entry.getValue());
/* 251 */           sb.append("\n");
/* 254 */           zzc(i, sb);
/* 257 */           sb.append("}");
                }

                private static void zzc(int i, StringBuilder sb) {
/* 1 */             while (i > 0) {
/* 3 */                 int i2 = 80;
/* 5 */                 if (i <= 80) {
/* 8 */                     i2 = i;
                        }
/* 12 */                sb.append(zza, 0, i2);
/* 15 */                i -= i2;
                    }
                }

                /* JADX WARN: Removed duplicated region for block: B:100:0x01de  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x0171  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static void zzd(zzahn zzahnVar, StringBuilder sb, int i) throws SecurityException {
                    int i2;
                    boolean zBooleanValue;
                    boolean zEquals;
                    Method method;
                    Method method2;
/* 9 */             HashSet hashSet = new HashSet();
/* 14 */            HashMap map = new HashMap();
/* 19 */            TreeMap treeMap = new TreeMap();
/* 26 */            Method[] declaredMethods = zzahnVar.getClass().getDeclaredMethods();
/* 30 */            int length = declaredMethods.length;
/* 32 */            int i3 = 0;
                    while (true) {
/* 39 */                i2 = 3;
/* 40 */                if (i3 >= length) {
                            break;
                        }
/* 42 */                Method method3 = declaredMethods[i3];
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
/* 135 */               i3++;
                    }
/* 150 */           for (Map.Entry entry : treeMap.entrySet()) {
/* 164 */               String strSubstring = ((String) entry.getKey()).substring(i2);
/* 174 */               if (strSubstring.endsWith(OIlllOo01.I00iio) && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals(OIlllOo01.I00iio) && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
/* 221 */                   zzb(sb, i, OooioIOo1.I00100o1O0lo(-4, 0, strSubstring), zzagg.zzz(method2, zzahnVar, new Object[0]));
                        } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
/* 289 */                   zzb(sb, i, OooioIOo1.I00100o1O0lo(-3, 0, strSubstring), zzagg.zzz(method, zzahnVar, new Object[0]));
                        } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
/* 335 */                   Method method4 = (Method) entry.getValue();
/* 345 */                   Method method5 = (Method) map.get("has".concat(strSubstring));
/* 347 */                   if (method4 != null) {
/* 351 */                       Object objZzz = zzagg.zzz(method4, zzahnVar, new Object[0]);
/* 355 */                       if (method5 != null) {
/* 489 */                           zBooleanValue = ((Boolean) zzagg.zzz(method5, zzahnVar, new Object[0])).booleanValue();
                                } else if (objZzz instanceof Boolean) {
/* 479 */                           zBooleanValue = ((Boolean) objZzz).booleanValue();
                                } else if (objZzz instanceof Integer) {
/* 384 */                           if (((Integer) objZzz).intValue() == 0) {
                                    }
                                } else if (objZzz instanceof Float) {
/* 402 */                           if (Float.floatToRawIntBits(((Float) objZzz).floatValue()) == 0) {
                                    }
                                } else if (!(objZzz instanceof Double)) {
/* 429 */                           if (objZzz instanceof String) {
/* 433 */                               zEquals = objZzz.equals("");
                                    } else if (objZzz instanceof zzafd) {
/* 444 */                               zEquals = objZzz.equals(zzafd.zza);
                                    } else if (!(objZzz instanceof zzahn) ? !(objZzz instanceof Enum) || ((Enum) objZzz).ordinal() != 0 : objZzz != ((zzahn) objZzz).zzp()) {
                                    }
/* 448 */                           if (zEquals) {
                                    }
                                } else if (Double.doubleToRawLongBits(((Double) objZzz).doubleValue()) == 0) {
                                }
/* 493 */                       if (zBooleanValue) {
/* 495 */                           zzb(sb, i, strSubstring, objZzz);
                                }
                            }
                        }
/* 224 */               i2 = 3;
                    }
/* 502 */           if (zzahnVar instanceof zzagd) {
/* 509 */               Iterator itZzg = ((zzagd) zzahnVar).zzb.zzg();
/* 517 */               while (itZzg.hasNext()) {
/* 523 */                   Map.Entry entry2 = (Map.Entry) itZzg.next();
/* 545 */                   zzb(sb, i, IIlIOloOOO.I00100l0("[", ((zzage) entry2.getKey()).zza, "]"), entry2.getValue());
                        }
                    }
/* 551 */           zzain zzainVar = ((zzagg) zzahnVar).zzc;
/* 553 */           if (zzainVar != null) {
/* 555 */               zzainVar.zzi(sb, i);
                    }
                }
            }
