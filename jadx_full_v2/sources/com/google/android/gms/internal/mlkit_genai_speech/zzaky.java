            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzaky extends zzagg implements zzaho {
                private static final zzaky zzb;
                private static volatile zzahv zze;
                private int zzf;
                private Object zzh;
                private int zzi;
                private int zzn;
                private int zzg = 0;
                private String zzj = "";
                private zzago zzk = zzagg.zzx();
                private String zzl = "";
                private String zzm = "";
                private String zzo = "";

                static {
/* 3 */             zzaky zzakyVar = new zzaky();
/* 6 */             zzb = zzakyVar;
/* 10 */            zzagg.zzD(zzaky.class, zzakyVar);
                }

                private zzaky() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 106 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 100 */               return zzagg.zzA(zzb, "\u0001\t\u0001\u0001\u0001\n\t\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0006ဈ\u0005\b;\u0000\t\u083f\u0000\n\u001a", new Object[]{"zzh", "zzg", "zzf", "zzi", zzakw.zza, "zzj", "zzl", "zzm", "zzn", zzakx.zza, "zzo", zzamn.zza, "zzk"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzaky();
                    }
/* 12 */            zzakz zzakzVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzakv(zzakzVar);
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
                    synchronized (zzaky.class) {
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
