            package com.google.android.gms.internal.mlkit_genai_speech;

            import p000.I000II;
            import p000.IOOlIIilOl0;
            import p000.OIiilo1Ool0o;
            import p000.Oi010OO0;
            
            public final class zzgo {
                public static int zza(int i, int i2, String str) {
                    String strZzb;
/* 1 */             if (i >= 0 && i < i2) {
/* 6 */                 return i;
                    }
/* 11 */            if (i < 0) {
/* 55 */                strZzb = zzgt.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i));
                    } else {
/* 13 */                if (i2 < 0) {
/* 21 */                    I000II.I000iOII(Oi010OO0.I000oI1ioi(i2, "negative size: "));
/* 24 */                    return 0;
                        }
/* 40 */                strZzb = zzgt.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
                    }
/* 98 */            throw new IndexOutOfBoundsException(strZzb);
                }

                public static int zzb(int i, int i2, String str) {
/* 1 */             if (i >= 0 && i <= i2) {
/* 5 */                 return i;
                    }
/* 12 */            I000II.I0010o(zzq(i, i2, "index"));
/* 15 */            return 0;
                }

                public static Object zzc(Object obj, Object obj2) {
/* 1 */             if (obj != null) {
/* 3 */                 return obj;
                    }
/* 6 */             IOOlIIilOl0.I000II((String) obj2);
/* 9 */             return null;
                }

                public static Object zzd(Object obj, String str, Object obj2) {
/* 1 */             if (obj != null) {
/* 3 */                 return obj;
                    }
/* 12 */            IOOlIIilOl0.I000II(zzgt.zzb(str, obj2));
/* 15 */            return null;
                }

                public static void zze(boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             OIiilo1Ool0o.I00100o1O0lo();
                }

                public static void zzf(boolean z, Object obj) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 6 */             I000II.I000iOII((String) obj);
                }

                public static void zzg(boolean z, String str, char c) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 16 */            I000II.I000iOII(zzgt.zzb(str, Character.valueOf(c)));
                }

                public static void zzh(boolean z, String str, int i) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 16 */            I000II.I000iOII(zzgt.zzb(str, Integer.valueOf(i)));
                }

                public static void zzi(boolean z, String str, long j) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 16 */            I000II.I000iOII(zzgt.zzb(str, Long.valueOf(j)));
                }

                public static void zzj(boolean z, String str, Object obj) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 12 */            I000II.I000iOII(zzgt.zzb(str, obj));
                }

                public static void zzk(boolean z, String str, Object obj, Object obj2) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 12 */            I000II.I000iOII(zzgt.zzb(str, obj, obj2));
                }

                public static void zzl(int i, int i2, int i3) {
/* 1 */             if (i < 0 || i2 < i || i2 > i3) {
/* 98 */                throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zzq(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zzq(i2, i3, "end index") : zzgt.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
                    }
                }

                public static void zzm(boolean z) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 4 */             IOOlIIilOl0.I000iOII();
                }

                public static void zzn(boolean z, Object obj) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 6 */             I000II.I001IO000((String) obj);
                }

                public static void zzo(boolean z, String str, Object obj) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 12 */            I000II.I001IO000(zzgt.zzb(str, obj));
                }

                public static void zzp(boolean z, String str, Object obj, Object obj2) {
/* 1 */             if (z) {
/* 3 */                 return;
                    }
/* 14 */            I000II.I001IO000(zzgt.zzb("%s -> %s", obj, obj2));
                }

                private static String zzq(int i, int i2, String str) {
/* 1 */             if (i < 0) {
/* 13 */                return zzgt.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
                    }
/* 18 */            if (i2 >= 0) {
/* 34 */                return zzgt.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
                    }
/* 45 */            I000II.I000iOII(Oi010OO0.I000oI1ioi(i2, "negative size: "));
/* 48 */            return null;
                }
            }
