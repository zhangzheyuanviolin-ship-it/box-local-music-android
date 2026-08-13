            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.Collections;
            import java.util.EnumSet;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import p000.IIl001iO0Io;
            import p000.IlIi0I0;
            
            public final class zzbmy {
                private zzbmy() {
                }

                public static Set zza(Map map) {
/* 3 */             Set setZzc = zzc(map, "nonFatalStatusCodes");
/* 7 */             if (setZzc == null) {
/* 15 */                return Collections.unmodifiableSet(EnumSet.noneOf(zzayz.class));
                    }
/* 30 */            zzgy.zza(!setZzc.contains(zzayz.OK), "%s must not contain OK", "nonFatalStatusCodes");
/* 77 */            return setZzc;
                }

                public static Set zzb(Map map) {
/* 3 */             Set setZzc = zzc(map, "retryableStatusCodes");
/* 15 */            zzgy.zza(setZzc != null, "%s is required in retry policy", "retryableStatusCodes");
/* 27 */            zzgy.zza(true ^ setZzc.contains(zzayz.OK), "%s must not contain OK", "retryableStatusCodes");
/* 77 */            return setZzc;
                }

                private static Set zzc(Map map, String str) {
                    zzayz zzayzVarZza;
/* 1 */             List listZzg = zzbhr.zzg(map, str);
/* 5 */             if (listZzg == null) {
/* 7 */                 return null;
                    }
/* 11 */            EnumSet enumSetNoneOf = EnumSet.noneOf(zzayz.class);
/* 23 */            for (Object obj : listZzg) {
/* 31 */                if (obj instanceof Double) {
/* 34 */                    Double d = (Double) obj;
/* 36 */                    int iIntValue = d.intValue();
/* 56 */                    zzgy.zza(((double) iIntValue) == d.doubleValue(), "Status code %s is not integral", obj);
/* 63 */                    zzayzVarZza = zzazd.zzb(iIntValue).zza();
/* 80 */                    zzgy.zza(zzayzVarZza.zza() == d.intValue(), "Status code %s is not valid", obj);
                        } else {
/* 86 */                    if (!(obj instanceof String)) {
/* 148 */                       throw new zzgz(IIl001iO0Io.I000oI1ioi("Can not convert status code ", String.valueOf(obj), " to Status.Code, because its type is ", String.valueOf(obj.getClass())));
                            }
                            try {
/* 91 */                        zzayz zzayzVar = zzayz.OK;
/* 98 */                        zzayzVarZza = (zzayz) Enum.valueOf(zzayz.class, (String) obj);
                            } catch (IllegalArgumentException e) {
/* 122 */                       throw new zzgz(IlIi0I0.I000lI("Status code ", String.valueOf(obj), " is not valid"), e);
                            }
                        }
/* 100 */               enumSetNoneOf.add(zzayzVarZza);
                    }
/* 149 */           return Collections.unmodifiableSet(enumSetNoneOf);
                }
            }
