            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.IlIi0I0;
            import p000.Oi010OO0;
            
            public final class zzgt {
                public static String zza(String str) {
/* 5 */             if (zzgn.zza(str)) {
/* 7 */                 return null;
                    }
/* 29 */            return str;
                }

                public static String zzb(String str, Object... objArr) {
                    int length;
                    int iIndexOf;
/* 11 */            StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
/* 14 */            int i = 0;
/* 15 */            int i2 = 0;
                    while (true) {
/* 16 */                length = objArr.length;
/* 17 */                if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                            break;
                        }
/* 29 */                sb.append((CharSequence) str, i2, iIndexOf);
/* 40 */                sb.append(zzd(objArr[i]));
/* 43 */                i2 = iIndexOf + 2;
/* 32 */                i++;
                    }
/* 53 */            sb.append((CharSequence) str, i2, str.length());
/* 56 */            if (i < length) {
/* 58 */                String str2 = " [";
/* 61 */                while (i < objArr.length) {
/* 63 */                    sb.append(str2);
/* 72 */                    sb.append(zzd(objArr[i]));
/* 75 */                    i++;
/* 77 */                    str2 = ", ";
                        }
/* 82 */                sb.append(']');
                    }
/* 85 */            return sb.toString();
                }

                public static boolean zzc(String str) {
/* 1 */             return zzgn.zza(str);
                }

                private static String zzd(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return "null";
                    }
                    try {
/* 6 */                 return obj.toString();
                    } catch (Exception e) {
/* 31 */                String strI000lI = IlIi0I0.I000lI(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
/* 53 */                Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strI000lI), (Throwable) e);
/* 70 */                return Oi010OO0.I001IO000("<", strI000lI, " threw ", e.getClass().getName(), ">");
                    }
                }
            }
