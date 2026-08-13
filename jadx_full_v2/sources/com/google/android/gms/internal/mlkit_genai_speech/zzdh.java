            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzdh extends zzagg implements zzaho {
                private static final zzdh zzb;
                private static volatile zzahv zze;

                static {
/* 3 */             zzdh zzdhVar = new zzdh();
/* 6 */             zzb = zzdhVar;
/* 10 */            zzagg.zzD(zzdh.class, zzdhVar);
                }

                private zzdh() {
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
/* 61 */                return new zzdh();
                    }
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzdg(zzdqVar);
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
                    synchronized (zzdh.class) {
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
