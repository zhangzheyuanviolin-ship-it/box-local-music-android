            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzdf extends zzagg implements zzaho {
                private static final zzdf zzb;
                private static volatile zzahv zze;

                static {
/* 3 */             zzdf zzdfVar = new zzdf();
/* 6 */             zzb = zzdfVar;
/* 10 */            zzagg.zzD(zzdf.class, zzdfVar);
                }

                private zzdf() {
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
/* 61 */                return new zzdf();
                    }
/* 13 */            if (i2 == 4) {
/* 55 */                return new zzde(zzdqVar);
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
                    synchronized (zzdf.class) {
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
