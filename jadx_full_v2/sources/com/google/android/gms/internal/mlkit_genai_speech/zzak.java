            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzak extends zzagg implements zzaho {
                private static final zzak zzb;
                private static volatile zzahv zze;
                private int zzf;
                private boolean zzg;
                private int zzh;
                private zzago zzi = zzagg.zzx();
                private zzfa zzj;
                private boolean zzk;

                static {
/* 3 */             zzak zzakVar = new zzak();
/* 6 */             zzb = zzakVar;
/* 10 */            zzagg.zzD(zzak.class, zzakVar);
                }

                private zzak() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 94 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 88 */                return zzagg.zzA(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0003\u001a\u0004ဉ\u0002\u0005ဇ\u0003", new Object[]{"zzf", "zzg", "zzh", zzai.zza, "zzi", "zzj", "zzk"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzak();
                    }
/* 12 */            zzaj zzajVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzah(zzajVar);
                    }
/* 16 */            if (i2 == 5) {
/* 51 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 21 */            zzahv zzahvVar = zze;
/* 23 */            if (zzahvVar != null) {
/* 49 */                return zzahvVar;
                    }
                    synchronized (zzak.class) {
                        try {
/* 28 */                    zzagbVar = zze;
/* 30 */                    if (zzagbVar == null) {
/* 36 */                        zzagbVar = new zzagb(zzb);
/* 39 */                        zze = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 48 */                    throw th;
                        }
                    }
/* 46 */            return zzagbVar;
                }
            }
