            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.text.ParseException;
            import java.util.List;
            import java.util.Locale;
            import java.util.Map;
            import java.util.concurrent.TimeUnit;
            import p000.IioIoO10iOiI;
            import p000.OIiilo1Ool0o;
            
            public final class zzbhr {
                public static Boolean zza(Map map, String str) {
/* 5 */             if (!map.containsKey(str)) {
/* 7 */                 return null;
                    }
/* 9 */             Object obj = map.get(str);
/* 15 */            if (obj instanceof Boolean) {
/* 17 */                return (Boolean) obj;
                    }
/* 37 */            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not Boolean", obj, str, map));
                }

                public static Double zzb(Map map, String str) {
/* 6 */             if (!map.containsKey(str)) {
/* 5 */                 return null;
                    }
/* 9 */             Object obj = map.get(str);
/* 15 */            if (obj instanceof Double) {
/* 17 */                return (Double) obj;
                    }
/* 22 */            if (!(obj instanceof String)) {
/* 52 */                OIiilo1Ool0o.I000l1("value '%s' for key '%s' in '%s' is not a number", new Object[]{obj, str, map});
/* 5 */                 return null;
                    }
                    try {
/* 31 */                return Double.valueOf(Double.parseDouble((String) obj));
                    } catch (NumberFormatException unused) {
/* 42 */                OIiilo1Ool0o.I000l1("value '%s' for key '%s' is not a double", new Object[]{obj, str});
/* 5 */                 return null;
                    }
                }

                public static Integer zzc(Map map, String str) {
/* 6 */             if (!map.containsKey(str)) {
/* 5 */                 return null;
                    }
/* 9 */             Object obj = map.get(str);
/* 15 */            if (obj instanceof Double) {
/* 17 */                Double d = (Double) obj;
/* 19 */                int iIntValue = d.intValue();
/* 30 */                if (iIntValue == d.doubleValue()) {
/* 32 */                    return Integer.valueOf(iIntValue);
                        }
/* 52 */                throw new ClassCastException("Number expected to be integer: ".concat(String.valueOf(d)));
                    }
/* 57 */            if (!(obj instanceof String)) {
/* 83 */                OIiilo1Ool0o.I000l1("value '%s' for key '%s' is not an integer", new Object[]{obj, str});
/* 5 */                 return null;
                    }
                    try {
/* 66 */                return Integer.valueOf(Integer.parseInt((String) obj));
                    } catch (NumberFormatException unused) {
/* 75 */                OIiilo1Ool0o.I000l1("value '%s' for key '%s' is not an integer", new Object[]{obj, str});
/* 5 */                 return null;
                    }
                }

                public static Long zzd(Map map, String str) throws NumberFormatException, ParseException {
                    boolean z;
                    int iCharAt;
/* 1 */             String strZze = zze(map, str);
/* 6 */             if (strZze == null) {
/* 5 */                 return null;
                    }
                    try {
/* 16 */                if (strZze.isEmpty() || strZze.charAt(strZze.length() - 1) != 's') {
/* 339 */                   throw new ParseException("Invalid duration string: ".concat(strZze), 0);
                        }
/* 39 */                if (strZze.charAt(0) == '-') {
/* 41 */                    strZze = strZze.substring(1);
/* 45 */                    z = true;
                        } else {
/* 50 */                    z = false;
                        }
/* 56 */                String strSubstring = strZze.substring(0, strZze.length() - 1);
/* 60 */                String strSubstring2 = "";
/* 64 */                int iIndexOf = strSubstring.indexOf(46);
/* 68 */                if (iIndexOf != -1) {
/* 72 */                    strSubstring2 = strSubstring.substring(iIndexOf + 1);
/* 76 */                    strSubstring = strSubstring.substring(0, iIndexOf);
                        }
/* 80 */                long j = Long.parseLong(strSubstring);
/* 88 */                if (strSubstring2.isEmpty()) {
/* 90 */                    iCharAt = 0;
                        } else {
/* 93 */                    iCharAt = 0;
/* 96 */                    for (int i = 0; i < 9; i++) {
/* 98 */                        iCharAt *= 10;
/* 104 */                       if (i < strSubstring2.length()) {
/* 112 */                           if (strSubstring2.charAt(i) < '0' || strSubstring2.charAt(i) > '9') {
/* 138 */                               throw new ParseException("Invalid nanoseconds.", 0);
                                    }
/* 128 */                           iCharAt = (strSubstring2.charAt(i) - '0') + iCharAt;
                                }
                            }
                        }
/* 146 */               if (j < 0) {
/* 329 */                   throw new ParseException("Invalid duration string: ".concat(strZze), 0);
                        }
/* 148 */               if (z) {
/* 150 */                   j = -j;
/* 151 */                   iCharAt = -iCharAt;
                        }
/* 158 */               if (iCharAt <= -1000000000 || iCharAt >= 1000000000) {
                            try {
/* 162 */                       long j2 = iCharAt / 1000000000;
/* 165 */                       long j3 = j + j2;
/* 184 */                       if (!((j ^ j3) >= 0) && !((j2 ^ j) < 0)) {
/* 311 */                           throw new ArithmeticException();
                                }
/* 186 */                       iCharAt %= 1000000000;
/* 187 */                       j = j3;
                            } catch (IllegalArgumentException unused) {
/* 319 */                       throw new ParseException("Duration value is out of range.", 0);
                            }
                        }
/* 190 */               if (j > 0 && iCharAt < 0) {
/* 194 */                   iCharAt += 1000000000;
                            j--;
                        }
/* 202 */               if (j < 0 && iCharAt > 0) {
                            iCharAt -= 1000000000;
/* 207 */                   j++;
                        }
/* 215 */               if (j < -315576000000L || j > 315576000000L) {
/* 305 */                   throw new IllegalArgumentException("Duration is not valid. See proto definition for valid values. Seconds (" + j + ") must be in range [-315,576,000,000, +315,576,000,000]. Nanos (" + iCharAt + ") must be in range [-999,999,999, +999,999,999]. Nanos must have the same sign as seconds");
                        }
/* 228 */               long nanos = TimeUnit.SECONDS.toNanos(j);
                        long j4 = iCharAt;
/* 233 */               long j5 = nanos + j4;
/* 250 */               if (!(((nanos ^ j5) >= 0) | ((j4 ^ nanos) < 0))) {
/* 263 */                   j5 = ((j5 >>> 63) ^ 1) + Long.MAX_VALUE;
                        }
/* 265 */               return Long.valueOf(j5);
                    } catch (ParseException e) {
/* 340 */               IioIoO10iOiI.I000lI(e);
/* 5 */                 return null;
                    }
                }

                public static String zze(Map map, String str) {
/* 5 */             if (!map.containsKey(str)) {
/* 7 */                 return null;
                    }
/* 9 */             Object obj = map.get(str);
/* 15 */            if (obj instanceof String) {
/* 17 */                return (String) obj;
                    }
/* 37 */            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not String", obj, str, map));
                }

                public static List zzf(List list) {
/* 6 */             for (int i = 0; i < list.size(); i++) {
/* 14 */                if (!(list.get(i) instanceof Map)) {
/* 44 */                    throw new ClassCastException(String.format(Locale.US, "value %s for idx %d in %s is not object", list.get(i), Integer.valueOf(i), list));
                        }
                    }
/* 77 */            return list;
                }

                public static List zzg(Map map, String str) {
/* 5 */             if (!map.containsKey(str)) {
/* 7 */                 return null;
                    }
/* 9 */             Object obj = map.get(str);
/* 15 */            if (obj instanceof List) {
/* 17 */                return (List) obj;
                    }
/* 37 */            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not List", obj, str, map));
                }

                public static List zzh(Map map, String str) {
/* 1 */             List listZzg = zzg(map, str);
/* 5 */             if (listZzg == null) {
/* 7 */                 return null;
                    }
/* 9 */             zzf(listZzg);
/* 37 */            return listZzg;
                }

                public static List zzi(Map map, String str) {
/* 1 */             List listZzg = zzg(map, str);
/* 5 */             if (listZzg == null) {
/* 7 */                 return null;
                    }
/* 14 */            for (int i = 0; i < listZzg.size(); i++) {
/* 22 */                if (!(listZzg.get(i) instanceof String)) {
/* 52 */                    throw new ClassCastException(String.format(Locale.US, "value '%s' for idx %d in '%s' is not string", listZzg.get(i), Integer.valueOf(i), listZzg));
                        }
                    }
/* 106 */           return listZzg;
                }

                public static Map zzj(Map map, String str) {
/* 5 */             if (!map.containsKey(str)) {
/* 7 */                 return null;
                    }
/* 9 */             Object obj = map.get(str);
/* 15 */            if (obj instanceof Map) {
/* 17 */                return (Map) obj;
                    }
/* 37 */            throw new ClassCastException(String.format("value '%s' for key '%s' in '%s' is not object", obj, str, map));
                }
            }
