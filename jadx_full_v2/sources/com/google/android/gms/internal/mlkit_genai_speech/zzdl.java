            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzdl extends zzagg implements zzaho {
                private static final zzdl zzb;
                private static volatile zzahv zze;

                static {
/* 3 */             zzdl zzdlVar = new zzdl();
/* 6 */             zzb = zzdlVar;
/* 10 */            zzagg.zzD(zzdl.class, zzdlVar);
                }

                private zzdl() {
                }

                public static zzdl zzc() {
/* 1 */             return zzb;
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 75 */                return (byte) 1;
                    }
/* 6 */             zzdq zzdqVar = null;
/* 7 */             if (i2 == 2) {
/* 69 */                return zzagg.zzA(zzb, "\u0004\u0000", null);
                    }
/* 10 */            if (i2 == 3) {
/* 61 */                return new zzdl();
                    }
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzdk(zzdqVar);
                    }
/* 16 */            if (i2 == 5) {
/* 50 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 49 */                throw null;
                    }
/* 21 */            zzahv zzahvVar = zze;
/* 23 */            if (zzahvVar != null) {
/* 48 */                return zzahvVar;
                    }
                    synchronized (zzdl.class) {
                        try {
/* 28 */                    zzagbVar = zze;
/* 30 */                    if (zzagbVar == null) {
/* 36 */                        zzagbVar = new zzagb(zzb);
/* 39 */                        zze = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 47 */                    throw th;
                        }
                    }
/* 45 */            return zzagbVar;
                }
            }
