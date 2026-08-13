            package com.google.android.gms.internal.mlkit_genai_speech;
            
            public final class zzapb extends zzagd implements zzaho {
                private static final zzapb zze;
                private static volatile zzahv zzf;
                private int zzg;
                private float zzj;
                private float zzk;
                private float zzl;
                private zzakp zzm;
                private zzapi zzn;
                private zzarm zzo;
                private int zzp;
                private zzart zzq;
                private float zzr;
                private float zzs;
                private zzaor zzt;
                private int zzu;
                private zzanj zzw;
                private long zzx;
                private long zzy;
                private zzane zzz;
                private byte zzA = 2;
                private zzago zzh = zzagg.zzx();
                private zzago zzi = zzagg.zzx();
                private zzago zzv = zzagg.zzx();

                static {
/* 3 */             zzapb zzapbVar = new zzapb();
/* 6 */             zze = zzapbVar;
/* 10 */            zzagg.zzD(zzapb.class, zzapbVar);
                }

                private zzapb() {
                }

                @Override
                public final Object zzb(int i, Object obj, Object obj2) {
                    zzahv zzagbVar;
                    int i2 = i - 1;
/* 5 */             if (i2 == 0) {
/* 137 */               return Byte.valueOf(this.zzA);
                    }
/* 8 */             if (i2 == 2) {
/* 130 */               return zzagg.zzA(zze, "\u0001\u0013\u0000\u0001\u0001\u0014\u0013\u0000\u0003\u0001\u0001\u001a\u0002ခ\u0001\u0003ဉ\u0003\u0004ဉ\u0005\u0005ခ\u0000\u0006᠌\u0006\u0007ဉ\u0007\bခ\b\tခ\t\nЛ\fခ\u0002\rဉ\u0004\u000eဉ\n\u000f᠌\u000b\u0010ဉ\f\u0011ဂ\u000e\u0012\u001b\u0013ဂ\r\u0014ဉ\u000f", new Object[]{"zzg", "zzh", "zzk", "zzm", "zzo", "zzj", "zzp", zzaku.zza, "zzq", "zzr", "zzs", "zzi", zzapr.class, "zzl", "zzn", "zzt", "zzu", zzard.zza, "zzw", "zzy", "zzv", zzarv.class, "zzx", "zzz"});
                    }
/* 11 */            if (i2 == 3) {
/* 70 */                return new zzapb();
                    }
/* 14 */            zzarw zzarwVar = null;
/* 15 */            if (i2 == 4) {
/* 64 */                return new zzapa(zzarwVar);
                    }
/* 18 */            if (i2 == 5) {
/* 59 */                return zze;
                    }
/* 21 */            if (i2 != 6) {
/* 28 */                this.zzA = obj == null ? (byte) 0 : (byte) 1;
/* 14 */                return null;
                    }
/* 31 */            zzahv zzahvVar = zzf;
/* 33 */            if (zzahvVar != null) {
/* 58 */                return zzahvVar;
                    }
                    synchronized (zzapb.class) {
                        try {
/* 38 */                    zzagbVar = zzf;
/* 40 */                    if (zzagbVar == null) {
/* 46 */                        zzagbVar = new zzagb(zze);
/* 49 */                        zzf = zzagbVar;
                            }
                        } catch (Throwable th) {
/* 57 */                    throw th;
                        }
                    }
/* 55 */            return zzagbVar;
                }
            }
